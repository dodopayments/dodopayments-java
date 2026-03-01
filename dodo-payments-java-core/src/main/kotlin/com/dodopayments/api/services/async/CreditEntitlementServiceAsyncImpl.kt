// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.handlers.emptyHandler
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
import com.dodopayments.api.models.creditentitlements.CreditEntitlement
import com.dodopayments.api.models.creditentitlements.CreditEntitlementCreateParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementDeleteParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListPageAsync
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListPageResponse
import com.dodopayments.api.models.creditentitlements.CreditEntitlementListParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementRetrieveParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUndeleteParams
import com.dodopayments.api.models.creditentitlements.CreditEntitlementUpdateParams
import com.dodopayments.api.services.async.creditentitlements.BalanceServiceAsync
import com.dodopayments.api.services.async.creditentitlements.BalanceServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CreditEntitlementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CreditEntitlementServiceAsync {

    private val withRawResponse: CreditEntitlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CreditEntitlementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CreditEntitlementServiceAsync =
        CreditEntitlementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun balances(): BalanceServiceAsync = balances

    override fun create(
        params: CreditEntitlementCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditEntitlement> =
        // post /credit-entitlements
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CreditEntitlementRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditEntitlement> =
        // get /credit-entitlements/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CreditEntitlementUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // patch /credit-entitlements/{id}
        withRawResponse().update(params, requestOptions).thenAccept {}

    override fun list(
        params: CreditEntitlementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CreditEntitlementListPageAsync> =
        // get /credit-entitlements
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: CreditEntitlementDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /credit-entitlements/{id}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun undelete(
        params: CreditEntitlementUndeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /credit-entitlements/{id}/undelete
        withRawResponse().undelete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditEntitlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditEntitlementServiceAsync.WithRawResponse =
            CreditEntitlementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        private val createHandler: Handler<CreditEntitlement> =
            jsonHandler<CreditEntitlement>(clientOptions.jsonMapper)

        override fun create(
            params: CreditEntitlementCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditEntitlement>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<CreditEntitlement> =
            jsonHandler<CreditEntitlement>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CreditEntitlementRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditEntitlement>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0))
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

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: CreditEntitlementUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateHandler.handle(it) }
                    }
                }
        }

        private val listHandler: Handler<CreditEntitlementListPageResponse> =
            jsonHandler<CreditEntitlementListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CreditEntitlementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CreditEntitlementListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements")
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
                                CreditEntitlementListPageAsync.builder()
                                    .service(CreditEntitlementServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: CreditEntitlementDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val undeleteHandler: Handler<Void?> = emptyHandler()

        override fun undelete(
            params: CreditEntitlementUndeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("credit-entitlements", params._pathParam(0), "undelete")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { undeleteHandler.handle(it) }
                    }
                }
        }
    }
}
