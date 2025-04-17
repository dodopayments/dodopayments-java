// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstance
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListPageAsync
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceListParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceRetrieveParams
import com.dodo_payments.api.models.licensekeyinstances.LicenseKeyInstanceUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface LicenseKeyInstanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(params: LicenseKeyInstanceRetrieveParams): CompletableFuture<LicenseKeyInstance> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LicenseKeyInstanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LicenseKeyInstance>

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
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LicenseKeyInstanceRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LicenseKeyInstance>>

        /**
         * Returns a raw HTTP response for `patch /license_key_instances/{id}`, but is otherwise the
         * same as [LicenseKeyInstanceServiceAsync.update].
         */
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
