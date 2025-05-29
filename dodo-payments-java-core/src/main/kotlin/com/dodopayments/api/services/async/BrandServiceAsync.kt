// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandCreateResponse
import com.dodopayments.api.models.brands.BrandListParams
import com.dodopayments.api.models.brands.BrandListResponse
import com.dodopayments.api.models.brands.BrandRetrieveParams
import com.dodopayments.api.models.brands.BrandRetrieveResponse
import com.dodopayments.api.models.brands.BrandUpdateImagesParams
import com.dodopayments.api.models.brands.BrandUpdateImagesResponse
import com.dodopayments.api.models.brands.BrandUpdateParams
import com.dodopayments.api.models.brands.BrandUpdateResponse
import java.util.concurrent.CompletableFuture

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(): CompletableFuture<BrandCreateResponse> = create(BrandCreateParams.none())

    /** @see [create] */
    fun create(
        params: BrandCreateParams = BrandCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandCreateResponse>

    /** @see [create] */
    fun create(
        params: BrandCreateParams = BrandCreateParams.none()
    ): CompletableFuture<BrandCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): CompletableFuture<BrandCreateResponse> =
        create(BrandCreateParams.none(), requestOptions)

    /** Thin handler just calls `get_brand` and wraps in `Json(...)` */
    fun retrieve(id: String): CompletableFuture<BrandRetrieveResponse> =
        retrieve(id, BrandRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): CompletableFuture<BrandRetrieveResponse> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<BrandRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandRetrieveResponse> =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    fun update(id: String): CompletableFuture<BrandUpdateResponse> =
        update(id, BrandUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateResponse> =
        update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
    ): CompletableFuture<BrandUpdateResponse> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateResponse>

    /** @see [update] */
    fun update(params: BrandUpdateParams): CompletableFuture<BrandUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<BrandUpdateResponse> =
        update(id, BrandUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<BrandListResponse> = list(BrandListParams.none())

    /** @see [list] */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListResponse>

    /** @see [list] */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<BrandListResponse> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrandListResponse> =
        list(BrandListParams.none(), requestOptions)

    fun updateImages(id: String): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(id, BrandUpdateImagesParams.none())

    /** @see [updateImages] */
    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateImages] */
    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
    ): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(id, params, RequestOptions.none())

    /** @see [updateImages] */
    fun updateImages(
        params: BrandUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateImagesResponse>

    /** @see [updateImages] */
    fun updateImages(
        params: BrandUpdateImagesParams
    ): CompletableFuture<BrandUpdateImagesResponse> = updateImages(params, RequestOptions.none())

    /** @see [updateImages] */
    fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(id, BrandUpdateImagesParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<BrandCreateResponse>> =
            create(BrandCreateParams.none())

        /** @see [create] */
        fun create(
            params: BrandCreateParams = BrandCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandCreateResponse>>

        /** @see [create] */
        fun create(
            params: BrandCreateParams = BrandCreateParams.none()
        ): CompletableFuture<HttpResponseFor<BrandCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandCreateResponse>> =
            create(BrandCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(id, BrandRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: BrandRetrieveParams
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandRetrieveResponse>> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(id, BrandUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>>

        /** @see [update] */
        fun update(
            params: BrandUpdateParams
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandUpdateResponse>> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(BrandListParams.none())

        /** @see [list] */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListResponse>>

        /** @see [list] */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brands/{id}/images`, but is otherwise the same as
         * [BrandServiceAsync.updateImages].
         */
        fun updateImages(
            id: String
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(id, BrandUpdateImagesParams.none())

        /** @see [updateImages] */
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateImages] */
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(id, params, RequestOptions.none())

        /** @see [updateImages] */
        fun updateImages(
            params: BrandUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>>

        /** @see [updateImages] */
        fun updateImages(
            params: BrandUpdateImagesParams
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(params, RequestOptions.none())

        /** @see [updateImages] */
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(id, BrandUpdateImagesParams.none(), requestOptions)
    }
}
