// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.LocaleInfo
import com.dodopayments.api.models.misc.MiscListLocalesParams
import com.dodopayments.api.models.misc.MiscListSupportedCountriesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MiscServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MiscServiceAsync

    /** Lists the locales that a translation can have. */
    fun listLocales(): CompletableFuture<List<LocaleInfo>> =
        listLocales(MiscListLocalesParams.none())

    /** @see listLocales */
    fun listLocales(
        params: MiscListLocalesParams = MiscListLocalesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<LocaleInfo>>

    /** @see listLocales */
    fun listLocales(
        params: MiscListLocalesParams = MiscListLocalesParams.none()
    ): CompletableFuture<List<LocaleInfo>> = listLocales(params, RequestOptions.none())

    /** @see listLocales */
    fun listLocales(requestOptions: RequestOptions): CompletableFuture<List<LocaleInfo>> =
        listLocales(MiscListLocalesParams.none(), requestOptions)

    fun listSupportedCountries(): CompletableFuture<List<CountryCode>> =
        listSupportedCountries(MiscListSupportedCountriesParams.none())

    /** @see listSupportedCountries */
    fun listSupportedCountries(
        params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CountryCode>>

    /** @see listSupportedCountries */
    fun listSupportedCountries(
        params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none()
    ): CompletableFuture<List<CountryCode>> = listSupportedCountries(params, RequestOptions.none())

    /** @see listSupportedCountries */
    fun listSupportedCountries(
        requestOptions: RequestOptions
    ): CompletableFuture<List<CountryCode>> =
        listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)

    /** A view of [MiscServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MiscServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /locales`, but is otherwise the same as
         * [MiscServiceAsync.listLocales].
         */
        fun listLocales(): CompletableFuture<HttpResponseFor<List<LocaleInfo>>> =
            listLocales(MiscListLocalesParams.none())

        /** @see listLocales */
        fun listLocales(
            params: MiscListLocalesParams = MiscListLocalesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<LocaleInfo>>>

        /** @see listLocales */
        fun listLocales(
            params: MiscListLocalesParams = MiscListLocalesParams.none()
        ): CompletableFuture<HttpResponseFor<List<LocaleInfo>>> =
            listLocales(params, RequestOptions.none())

        /** @see listLocales */
        fun listLocales(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<LocaleInfo>>> =
            listLocales(MiscListLocalesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /checkout/supported_countries`, but is otherwise the
         * same as [MiscServiceAsync.listSupportedCountries].
         */
        fun listSupportedCountries(): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            listSupportedCountries(MiscListSupportedCountriesParams.none())

        /** @see listSupportedCountries */
        fun listSupportedCountries(
            params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>>

        /** @see listSupportedCountries */
        fun listSupportedCountries(
            params: MiscListSupportedCountriesParams = MiscListSupportedCountriesParams.none()
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            listSupportedCountries(params, RequestOptions.none())

        /** @see listSupportedCountries */
        fun listSupportedCountries(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            listSupportedCountries(MiscListSupportedCountriesParams.none(), requestOptions)
    }
}
