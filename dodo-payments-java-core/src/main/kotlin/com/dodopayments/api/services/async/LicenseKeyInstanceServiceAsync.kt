// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListPageAsync
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodopayments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface LicenseKeyInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(id: String): CompletableFuture<LicenseKeyInstance> =
        retrieve(id, LicenseKeyInstanceRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LicenseKeyInstanceRetrieveParams = LicenseKeyInstanceRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstance> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: LicenseKeyInstanceRetrieveParams = LicenseKeyInstanceRetrieveParams.none(),
    ): CompletableFuture<LicenseKeyInstance> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstance>

    /** @see [retrieve] */
    fun retrieve(params: LicenseKeyInstanceRetrieveParams): CompletableFuture<LicenseKeyInstance> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LicenseKeyInstance> =
        retrieve(id, LicenseKeyInstanceRetrieveParams.none(), requestOptions)

    fun update(
        id: String,
        params: LicenseKeyInstanceUpdateParams,
    ): CompletableFuture<LicenseKeyInstance> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        id: String,
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstance> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(params: LicenseKeyInstanceUpdateParams): CompletableFuture<LicenseKeyInstance> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: LicenseKeyInstanceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstance>

    fun list(): CompletableFuture<LicenseKeyInstanceListPageAsync> =
        list(LicenseKeyInstanceListParams.none())

    /** @see [list] */
    fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstanceListPageAsync>

    /** @see [list] */
    fun list(
        params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none()
    ): CompletableFuture<LicenseKeyInstanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<LicenseKeyInstanceListPageAsync> =
        list(LicenseKeyInstanceListParams.none(), requestOptions)

    /**
     * A view of [LicenseKeyInstanceServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            retrieve(id, LicenseKeyInstanceRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LicenseKeyInstanceRetrieveParams = LicenseKeyInstanceRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: LicenseKeyInstanceRetrieveParams = LicenseKeyInstanceRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            retrieve(id, LicenseKeyInstanceRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            id: String,
            params: LicenseKeyInstanceUpdateParams,
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            id: String,
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LicenseKeyInstanceUpdateParams
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: LicenseKeyInstanceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>>

        /**
         * Returns a raw HTTP response for `get /license_key_instances`, but is otherwise the same
         * as [LicenseKeyInstanceServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<LicenseKeyInstanceListPageAsync>> =
            list(LicenseKeyInstanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstanceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LicenseKeyInstanceListParams = LicenseKeyInstanceListParams.none()
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstanceListPageAsync>> =
            list(LicenseKeyInstanceListParams.none(), requestOptions)
    }
}
