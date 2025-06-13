// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyListPageAsync
import com.dodopayments.api.models.licensekeys.LicenseKeyListParams
import com.dodopayments.api.models.licensekeys.LicenseKeyRetrieveParams
import com.dodopayments.api.models.licensekeys.LicenseKeyUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LicenseKeyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LicenseKeyServiceAsync

    fun retrieve(id: String): CompletableFuture<LicenseKey> =
        retrieve(id, LicenseKeyRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKey> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
    ): CompletableFuture<LicenseKey> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LicenseKeyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKey>

    /** @see [retrieve] */
    fun retrieve(params: LicenseKeyRetrieveParams): CompletableFuture<LicenseKey> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<LicenseKey> =
        retrieve(id, LicenseKeyRetrieveParams.none(), requestOptions)

    fun update(id: String): CompletableFuture<LicenseKey> =
        update(id, LicenseKeyUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKey> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
    ): CompletableFuture<LicenseKey> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LicenseKeyUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKey>

    /** @see [update] */
    fun update(params: LicenseKeyUpdateParams): CompletableFuture<LicenseKey> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<LicenseKey> =
        update(id, LicenseKeyUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<LicenseKeyListPageAsync> = list(LicenseKeyListParams.none())

    /** @see [list] */
    fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyListPageAsync>

    /** @see [list] */
    fun list(
        params: LicenseKeyListParams = LicenseKeyListParams.none()
    ): CompletableFuture<LicenseKeyListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LicenseKeyListPageAsync> =
        list(LicenseKeyListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LicenseKeyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LicenseKey>> =
            retrieve(id, LicenseKeyRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: LicenseKeyRetrieveParams = LicenseKeyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: LicenseKeyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>>

        /** @see [retrieve] */
        fun retrieve(
            params: LicenseKeyRetrieveParams
        ): CompletableFuture<HttpResponseFor<LicenseKey>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseKey>> =
            retrieve(id, LicenseKeyRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /license_keys/{id}`, but is otherwise the same as
         * [LicenseKeyServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<LicenseKey>> =
            update(id, LicenseKeyUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: LicenseKeyUpdateParams = LicenseKeyUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: LicenseKeyUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKey>>

        /** @see [update] */
        fun update(params: LicenseKeyUpdateParams): CompletableFuture<HttpResponseFor<LicenseKey>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseKey>> =
            update(id, LicenseKeyUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /license_keys`, but is otherwise the same as
         * [LicenseKeyServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LicenseKeyListPageAsync>> =
            list(LicenseKeyListParams.none())

        /** @see [list] */
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyListPageAsync>>

        /** @see [list] */
        fun list(
            params: LicenseKeyListParams = LicenseKeyListParams.none()
        ): CompletableFuture<HttpResponseFor<LicenseKeyListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LicenseKeyListPageAsync>> =
            list(LicenseKeyListParams.none(), requestOptions)
    }
}
