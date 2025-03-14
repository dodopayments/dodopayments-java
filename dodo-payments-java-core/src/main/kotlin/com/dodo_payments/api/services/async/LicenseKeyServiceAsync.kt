// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeys.LicenseKey
import com.dodo_payments.api.models.licensekeys.LicenseKeyListParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodo_payments.api.models.licensekeys.LicenseKeyUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface LicenseKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(params: LicenseKeyRetrieveParams): CompletableFuture<LicenseKey> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKey>

    fun update(params: LicenseKeyUpdateParams): CompletableFuture<LicenseKey> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKey>

    fun list(): CompletableFuture<List<ListLicenseKeysResponse>> = list(LicenseKeyListParams.none())

    /** @see [list] */
    fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<ListLicenseKeysResponse>>

    /** @see [list] */
    fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none()
    ): CompletableFuture<List<ListLicenseKeysResponse>> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<List<ListLicenseKeysResponse>> =
        list(LicenseKeyListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyRetrieveParams
        ): CompletableFuture<HttpResponseFor<LicenseKey>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>>

        /**
         * Returns a raw HTTP response for `patch /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: LicenseKeyUpdateParams): CompletableFuture<HttpResponseFor<LicenseKey>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>>

        /**
         * Returns a raw HTTP response for `get /license_keys`, but is otherwise the same as
         * [LicenseKeyServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<List<ListLicenseKeysResponse>>> =
            list(LicenseKeyListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<ListLicenseKeysResponse>>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none()
        ): CompletableFuture<HttpResponseFor<List<ListLicenseKeysResponse>>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<List<ListLicenseKeysResponse>>> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
