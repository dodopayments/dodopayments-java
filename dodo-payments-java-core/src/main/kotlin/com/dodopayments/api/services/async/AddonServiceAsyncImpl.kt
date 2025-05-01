// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonListPageAsync
import com.dodopayments.api.models.addons.AddonListPageResponse
import com.dodopayments.api.models.addons.AddonListParams
import com.dodopayments.api.models.addons.AddonResponse
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateImagesResponse
import com.dodopayments.api.models.addons.AddonUpdateParams
import java.util.concurrent.CompletableFuture

class AddonServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AddonServiceAsync {

    private val withRawResponse: AddonServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AddonServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonResponse> =
        // post /addons
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonResponse> =
        // get /addons/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonResponse> =
        // patch /addons/{id}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AddonListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonListPageAsync> =
        // get /addons
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun updateImages(
        params: AddonUpdateImagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AddonUpdateImagesResponse> =
        // put /addons/{id}/images
        withRawResponse().updateImages(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AddonServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AddonResponse> =
            jsonHandler<AddonResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("addons")
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

        private val retrieveHandler: Handler<AddonResponse> =
            jsonHandler<AddonResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("addons", params._pathParam(0))
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

        private val updateHandler: Handler<AddonResponse> =
            jsonHandler<AddonResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("addons", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AddonListPageResponse> =
            jsonHandler<AddonListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AddonListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("addons")
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
                                AddonListPageAsync.builder()
                                    .service(AddonServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateImagesHandler: Handler<AddonUpdateImagesResponse> =
            jsonHandler<AddonUpdateImagesResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateImages(
            params: AddonUpdateImagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AddonUpdateImagesResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .addPathSegments("addons", params._pathParam(0), "images")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateImagesHandler.handle(it) }
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
