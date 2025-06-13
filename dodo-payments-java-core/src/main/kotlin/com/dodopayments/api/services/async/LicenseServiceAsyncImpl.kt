// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.emptyHandler
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.json
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licenses.LicenseActivateParams
import com.dodopayments.api.models.licenses.LicenseDeactivateParams
import com.dodopayments.api.models.licenses.LicenseValidateParams
import com.dodopayments.api.models.licenses.LicenseValidateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class LicenseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LicenseServiceAsync {

    private val withRawResponse: LicenseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LicenseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseServiceAsync =
        LicenseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun activate(
        params: LicenseActivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseKeyInstance> =
        // post /licenses/activate
        withRawResponse().activate(params, requestOptions).thenApply { it.parse() }

    override fun deactivate(
        params: LicenseDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /licenses/deactivate
        withRawResponse().deactivate(params, requestOptions).thenAccept {}

    override fun validate(
        params: LicenseValidateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseValidateResponse> =
        // post /licenses/validate
        withRawResponse().validate(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LicenseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LicenseServiceAsync.WithRawResponse =
            LicenseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val activateHandler: Handler<LicenseKeyInstance> =
            jsonHandler<LicenseKeyInstance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun activate(
            params: LicenseActivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "activate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { activateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deactivateHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun deactivate(
            params: LicenseDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "deactivate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deactivateHandler.handle(it) } }
                }
        }

        private val validateHandler: Handler<LicenseValidateResponse> =
            jsonHandler<LicenseValidateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun validate(
            params: LicenseValidateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseValidateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("licenses", "validate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { validateHandler.handle(it) }
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
