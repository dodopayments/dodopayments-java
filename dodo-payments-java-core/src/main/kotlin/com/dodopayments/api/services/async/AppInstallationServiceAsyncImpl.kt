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
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsParams
import com.dodopayments.api.models.appinstallation.AppInstallationRetrieveSettingsResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AppInstallationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AppInstallationServiceAsync {

    private val withRawResponse: AppInstallationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AppInstallationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AppInstallationServiceAsync =
        AppInstallationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieveSettings(
        params: AppInstallationRetrieveSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AppInstallationRetrieveSettingsResponse> =
        // get /app-installation/settings
        withRawResponse().retrieveSettings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AppInstallationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppInstallationServiceAsync.WithRawResponse =
            AppInstallationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveSettingsHandler: Handler<AppInstallationRetrieveSettingsResponse> =
            jsonHandler<AppInstallationRetrieveSettingsResponse>(clientOptions.jsonMapper)

        override fun retrieveSettings(
            params: AppInstallationRetrieveSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AppInstallationRetrieveSettingsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("app-installation", "settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSettingsHandler.handle(it) }
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
