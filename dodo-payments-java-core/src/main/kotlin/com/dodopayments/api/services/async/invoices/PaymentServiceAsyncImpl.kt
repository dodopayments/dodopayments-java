// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.invoices

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.emptyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // get /invoices/payments/{payment_id}
        withRawResponse().retrieve(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("invoices", "payments", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { retrieveHandler.handle(it) } }
                }
        }
    }
}
