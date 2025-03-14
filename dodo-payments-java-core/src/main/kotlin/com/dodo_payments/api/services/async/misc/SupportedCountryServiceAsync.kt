// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.misc

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.misc.supportedcountries.CountryCode
import com.dodo_payments.api.models.misc.supportedcountries.SupportedCountryListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface SupportedCountryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun list(): CompletableFuture<List<CountryCode>> = list(SupportedCountryListParams.none())

    /** @see [list] */
    fun list(
        params: SupportedCountryListParams = SupportedCountryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<CountryCode>>

    /** @see [list] */
    fun list(
        params: SupportedCountryListParams = SupportedCountryListParams.none()
    ): CompletableFuture<List<CountryCode>> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<CountryCode>> =
        list(SupportedCountryListParams.none(), requestOptions)

    /**
     * A view of [SupportedCountryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /checkout/supported_countries`, but is otherwise the
         * same as [SupportedCountryServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            list(SupportedCountryListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SupportedCountryListParams = SupportedCountryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: SupportedCountryListParams = SupportedCountryListParams.none()
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<CountryCode>>> =
            list(SupportedCountryListParams.none(), requestOptions)
    }
}
