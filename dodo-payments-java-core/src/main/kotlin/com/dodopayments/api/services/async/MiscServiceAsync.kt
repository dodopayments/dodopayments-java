// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.MiscListSupportedCountriesParams
import java.util.concurrent.CompletableFuture

interface MiscServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun listSupportedCountries(): CompletableFuture<List<CountryCode>> =
        listSupportedCountries(MiscListSupportedCountriesParams.none())

    /** @see [listSupportedCountries] */
    fun listSupportedCountries(
        params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CountryCode>>

    /** @see [listSupportedCountries] */
    fun listSupportedCountries(
        params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none()
    ): CompletableFuture<List<CountryCode>> = listSupportedCountries(params, RequestOptions.none())

    /** @see [listSupportedCountries] */
    fun listSupportedCountries(
        requestOptions: RequestOptions
    ): CompletableFuture<List<CountryCode>> =
        listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)

    /** A view of [MiscServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /checkout/supported_countries`, but is otherwise the
         * same as [MiscServiceAsync.listSupportedCountries].
         */
        fun listSupportedCountries(): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            listSupportedCountries(MiscListSupportedCountriesParams.none())

        /** @see [listSupportedCountries] */
        fun listSupportedCountries(
            params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>>

        /** @see [listSupportedCountries] */
        fun listSupportedCountries(
            params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none()
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            listSupportedCountries(params, RequestOptions.none())

        /** @see [listSupportedCountries] */
        fun listSupportedCountries(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)
    }
}
