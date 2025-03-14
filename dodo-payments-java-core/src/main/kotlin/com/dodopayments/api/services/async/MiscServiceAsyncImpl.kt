// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.handlers.errorHandler
import com.dodopayments.api.core.handlers.jsonHandler
import com.dodopayments.api.core.handlers.withErrorHandler
import com.dodopayments.api.core.http.HttpMethod
import com.dodopayments.api.core.http.HttpRequest
import com.dodopayments.api.core.http.HttpResponse.Handler
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.core.http.parseable
import com.dodopayments.api.core.prepareAsync
import com.dodopayments.api.errors.DodoPaymentsError
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.MiscListSupportedCountriesParams
import java.util.concurrent.CompletableFuture

class MiscServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MiscServiceAsync {

    private val withRawResponse: MiscServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MiscServiceAsync.WithRawResponse = withRawResponse

    override fun listSupportedCountries(
        params: MiscListSupportedCountriesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CountryCode>> =
        // get /checkout/supported_countries
        withRawResponse().listSupportedCountries(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MiscServiceAsync.WithRawResponse {

        private val errorHandler: Handler<DodoPaymentsError> =
            errorHandler(clientOptions.jsonMapper)

        private val listSupportedCountriesHandler: Handler<List<CountryCode>> =
            jsonHandler<List<CountryCode>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun listSupportedCountries(
            params: MiscListSupportedCountriesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("checkout", "supported_countries")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { listSupportedCountriesHandler.handle(it) } }
                }
        }
    }
}
