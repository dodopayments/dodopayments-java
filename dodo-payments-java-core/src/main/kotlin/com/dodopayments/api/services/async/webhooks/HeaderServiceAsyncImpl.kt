// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.webhooks

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
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveParams
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveResponse
import com.dodopayments.api.models.webhooks.headers.HeaderUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HeaderServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HeaderServiceAsync {

    private val withRawResponse: HeaderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HeaderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HeaderServiceAsync =
        HeaderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: HeaderRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HeaderRetrieveResponse> =
        // get /webhooks/{webhook_id}/headers
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: HeaderUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // patch /webhooks/{webhook_id}/headers
        withRawResponse().update(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HeaderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HeaderServiceAsync.WithRawResponse =
            HeaderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<HeaderRetrieveResponse> =
            jsonHandler<HeaderRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HeaderRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0), "headers")
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
            params: HeaderUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("webhookId", params.webhookId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("webhooks", params._pathParam(0), "headers")
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
    }
}
