// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.creditentitlements

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
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceCreateLedgerEntryResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPageAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListGrantsParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPageAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListLedgerParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPageAsync
import com.dodopayments.api.models.creditentitlements.balances.BalanceListPageResponse
import com.dodopayments.api.models.creditentitlements.balances.BalanceListParams
import com.dodopayments.api.models.creditentitlements.balances.BalanceRetrieveParams
import com.dodopayments.api.models.creditentitlements.balances.CustomerCreditBalance
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BalanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceServiceAsync {

    private val withRawResponse: BalanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync =
        BalanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: BalanceRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerCreditBalance> =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceListPageAsync> =
        // get /credit-entitlements/{credit_entitlement_id}/balances
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun createLedgerEntry(
        params: BalanceCreateLedgerEntryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceCreateLedgerEntryResponse> =
        // post /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger-entries
        withRawResponse().createLedgerEntry(params, requestOptions).thenApply { it.parse() }

    override fun listGrants(
        params: BalanceListGrantsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceListGrantsPageAsync> =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/grants
        withRawResponse().listGrants(params, requestOptions).thenApply { it.parse() }

    override fun listLedger(
        params: BalanceListLedgerParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BalanceListLedgerPageAsync> =
        // get /credit-entitlements/{credit_entitlement_id}/balances/{customer_id}/ledger
        withRawResponse().listLedger(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse =
            BalanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CustomerCreditBalance> =
            jsonHandler<CustomerCreditBalance>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BalanceRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerCreditBalance>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BalanceListPageResponse> =
            jsonHandler<BalanceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("creditEntitlementId", params.creditEntitlementId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0), "balances")
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
                            .let {
                                BalanceListPageAsync.builder()
                                    .service(BalanceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val createLedgerEntryHandler: Handler<BalanceCreateLedgerEntryResponse> =
            jsonHandler<BalanceCreateLedgerEntryResponse>(clientOptions.jsonMapper)

        override fun createLedgerEntry(
            params: BalanceCreateLedgerEntryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceCreateLedgerEntryResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "ledger-entries",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createLedgerEntryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listGrantsHandler: Handler<BalanceListGrantsPageResponse> =
            jsonHandler<BalanceListGrantsPageResponse>(clientOptions.jsonMapper)

        override fun listGrants(
            params: BalanceListGrantsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceListGrantsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "grants",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listGrantsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                BalanceListGrantsPageAsync.builder()
                                    .service(BalanceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listLedgerHandler: Handler<BalanceListLedgerPageResponse> =
            jsonHandler<BalanceListLedgerPageResponse>(clientOptions.jsonMapper)

        override fun listLedger(
            params: BalanceListLedgerParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BalanceListLedgerPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("customerId", params.customerId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "credit-entitlements",
                        params._pathParam(0),
                        "balances",
                        params._pathParam(1),
                        "ledger",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listLedgerHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                BalanceListLedgerPageAsync.builder()
                                    .service(BalanceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
