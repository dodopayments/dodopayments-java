// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.addons.AddonCreateParams
import com.dodopayments.api.models.addons.AddonListPageAsync
import com.dodopayments.api.models.addons.AddonListParams
import com.dodopayments.api.models.addons.AddonResponse
import com.dodopayments.api.models.addons.AddonRetrieveParams
import com.dodopayments.api.models.addons.AddonUpdateImagesParams
import com.dodopayments.api.models.addons.AddonUpdateImagesResponse
import com.dodopayments.api.models.addons.AddonUpdateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface AddonServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: AddonCreateParams): CompletableFuture<AddonResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AddonCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonResponse>

    fun retrieve(params: AddonRetrieveParams): CompletableFuture<AddonResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AddonRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonResponse>

    fun update(params: AddonUpdateParams): CompletableFuture<AddonResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AddonUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonResponse>

    fun list(): CompletableFuture<AddonListPageAsync> = list(AddonListParams.none())

    /** @see [list] */
    fun list(
        params: AddonListParams = AddonListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonListPageAsync>

    /** @see [list] */
    fun list(
        params: AddonListParams = AddonListParams.none()
    ): CompletableFuture<AddonListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AddonListPageAsync> =
        list(AddonListParams.none(), requestOptions)

    fun updateImages(
        params: AddonUpdateImagesParams
    ): CompletableFuture<AddonUpdateImagesResponse> = updateImages(params, RequestOptions.none())

    /** @see [updateImages] */
    fun updateImages(
        params: AddonUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AddonUpdateImagesResponse>

    /** A view of [AddonServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /addons`, but is otherwise the same as
         * [AddonServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: AddonCreateParams): CompletableFuture<HttpResponseFor<AddonResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AddonCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonResponse>>

        /**
         * Returns a raw HTTP response for `get /addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AddonRetrieveParams
        ): CompletableFuture<HttpResponseFor<AddonResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AddonRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonResponse>>

        /**
         * Returns a raw HTTP response for `patch /addons/{id}`, but is otherwise the same as
         * [AddonServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: AddonUpdateParams): CompletableFuture<HttpResponseFor<AddonResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AddonUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonResponse>>

        /**
         * Returns a raw HTTP response for `get /addons`, but is otherwise the same as
         * [AddonServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AddonListPageAsync>> =
            list(AddonListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AddonListParams = AddonListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AddonListParams = AddonListParams.none()
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AddonListPageAsync>> =
            list(AddonListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /addons/{id}/images`, but is otherwise the same as
         * [AddonServiceAsync.updateImages].
         */
        @MustBeClosed
        fun updateImages(
            params: AddonUpdateImagesParams
        ): CompletableFuture<HttpResponseFor<AddonUpdateImagesResponse>> =
            updateImages(params, RequestOptions.none())

        /** @see [updateImages] */
        @MustBeClosed
        fun updateImages(
            params: AddonUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AddonUpdateImagesResponse>>
    }
}
