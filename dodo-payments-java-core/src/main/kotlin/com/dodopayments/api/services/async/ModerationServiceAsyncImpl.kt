// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
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
import com.dodopayments.api.models.moderation.ModerationRetrieveUsageParams
import com.dodopayments.api.models.moderation.ModerationRetrieveUsageResponse
import com.dodopayments.api.models.moderation.ModerationScreenParams
import com.dodopayments.api.models.moderation.ModerationScreenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class ModerationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ModerationServiceAsync {

    private val withRawResponse: ModerationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ModerationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ModerationServiceAsync =
        ModerationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveUsage(
        params: ModerationRetrieveUsageParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModerationRetrieveUsageResponse> =
        // get /moderation/usage
        withRawResponse().retrieveUsage(params, requestOptions).thenApply { it.parse() }

    override fun screen(
        params: ModerationScreenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ModerationScreenResponse> =
        // post /moderation/screen
        withRawResponse().screen(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ModerationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ModerationServiceAsync.WithRawResponse =
            ModerationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveUsageHandler: Handler<ModerationRetrieveUsageResponse> =
            jsonHandler<ModerationRetrieveUsageResponse>(clientOptions.jsonMapper)

        override fun retrieveUsage(
            params: ModerationRetrieveUsageParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModerationRetrieveUsageResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("moderation", "usage")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveUsageHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val screenHandler: Handler<ModerationScreenResponse> =
            jsonHandler<ModerationScreenResponse>(clientOptions.jsonMapper)

        override fun screen(
            params: ModerationScreenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ModerationScreenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("moderation", "screen")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { screenHandler.handle(it) }
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
