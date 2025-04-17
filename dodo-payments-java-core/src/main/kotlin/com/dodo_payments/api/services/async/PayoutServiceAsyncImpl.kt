// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.ClientOptions
import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.handlers.errorHandler
import com.dodo_payments.api.core.handlers.jsonHandler
import com.dodo_payments.api.core.handlers.withErrorHandler
import com.dodo_payments.api.core.http.HttpMethod
import com.dodo_payments.api.core.http.HttpRequest
import com.dodo_payments.api.core.http.HttpResponse.Handler
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.payouts.PayoutListPageAsync
import com.dodo_payments.api.models.payouts.PayoutListParams
import java.util.concurrent.CompletableFuture

class PayoutServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PayoutServiceAsync {

    private val withRawResponse: PayoutServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PayoutServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: PayoutListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PayoutListPageAsync> =
        // get /payouts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PayoutServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<PayoutListPageAsync.Response> =
            jsonHandler<PayoutListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PayoutListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("payouts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PayoutListPageAsync.of(
                                    PayoutServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
