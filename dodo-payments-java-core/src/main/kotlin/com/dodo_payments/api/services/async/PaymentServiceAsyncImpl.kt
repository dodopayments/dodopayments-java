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
import com.dodo_payments.api.core.http.json
import com.dodo_payments.api.core.http.parseable
import com.dodo_payments.api.core.prepareAsync
import com.dodo_payments.api.errors.DodoPaymentsError
import com.dodo_payments.api.models.payments.Payment
import com.dodo_payments.api.models.payments.PaymentCreateParams
import com.dodo_payments.api.models.payments.PaymentCreateResponse
import com.dodo_payments.api.models.payments.PaymentListPageAsync
import com.dodo_payments.api.models.payments.PaymentListParams
import com.dodo_payments.api.models.payments.PaymentRetrieveParams
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentCreateResponse> =
        // post /payments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Payment> =
        // get /payments/{payment_id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentListPageAsync> =
        // get /payments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PaymentCreateResponse> =
            jsonHandler<PaymentCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val retrieveHandler: Handler<Payment> =
            jsonHandler<Payment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Payment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("payments", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val listHandler: Handler<PaymentListPageAsync.Response> =
            jsonHandler<PaymentListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("payments")
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
                                PaymentListPageAsync.of(
                                    PaymentServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
