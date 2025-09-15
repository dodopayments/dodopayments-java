// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.errorBodyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.customers.wallets.WalletListParams
import com.dodopayments.api.models.customers.wallets.WalletListResponse
import com.dodopayments.api.services.async.customers.wallets.LedgerEntryServiceAsync
import com.dodopayments.api.services.async.customers.wallets.LedgerEntryServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class WalletServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WalletServiceAsync {

    private val withRawResponse: WalletServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val ledgerEntries: LedgerEntryServiceAsync by lazy {
        LedgerEntryServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): WalletServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WalletServiceAsync =
        WalletServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun ledgerEntries(): LedgerEntryServiceAsync = ledgerEntries

    override fun list(
        params: WalletListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WalletListResponse> =
        // get /customers/{customer_id}/wallets
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WalletServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val ledgerEntries: LedgerEntryServiceAsync.WithRawResponse by lazy {
            LedgerEntryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WalletServiceAsync.WithRawResponse =
            WalletServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun ledgerEntries(): LedgerEntryServiceAsync.WithRawResponse = ledgerEntries

        private val listHandler: Handler<WalletListResponse> =
            jsonHandler<WalletListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: WalletListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WalletListResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("customers", params._pathParam(0), "wallets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
