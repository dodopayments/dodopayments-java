// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.brands.Brand
import com.dodopayments.api.models.brands.BrandCreateParams
import com.dodopayments.api.models.brands.BrandListParams
import com.dodopayments.api.models.brands.BrandListResponse
import com.dodopayments.api.models.brands.BrandRetrieveParams
import com.dodopayments.api.models.brands.BrandUpdateImagesParams
import com.dodopayments.api.models.brands.BrandUpdateImagesResponse
import com.dodopayments.api.models.brands.BrandUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BrandServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandServiceAsync

    fun create(): CompletableFuture<Brand> = create(BrandCreateParams.none())

    /** @see create */
    fun create(
        params: BrandCreateParams = BrandCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand>

    /** @see create */
    fun create(params: BrandCreateParams = BrandCreateParams.none()): CompletableFuture<Brand> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): CompletableFuture<Brand> =
        create(BrandCreateParams.none(), requestOptions)

    /** Thin handler just calls `get_brand` and wraps in `Json(...)` */
    fun retrieve(id: String): CompletableFuture<Brand> = retrieve(id, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
    ): CompletableFuture<Brand> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand>

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): CompletableFuture<Brand> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Brand> =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    fun update(id: String): CompletableFuture<Brand> = update(id, BrandUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
    ): CompletableFuture<Brand> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Brand>

    /** @see update */
    fun update(params: BrandUpdateParams): CompletableFuture<Brand> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Brand> =
        update(id, BrandUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<BrandListResponse> = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandListResponse>

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none()
    ): CompletableFuture<BrandListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BrandListResponse> =
        list(BrandListParams.none(), requestOptions)

    fun updateImages(id: String): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(id, BrandUpdateImagesParams.none())

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
    ): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(id, params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(
        params: BrandUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BrandUpdateImagesResponse>

    /** @see updateImages */
    fun updateImages(
        params: BrandUpdateImagesParams
    ): CompletableFuture<BrandUpdateImagesResponse> = updateImages(params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BrandUpdateImagesResponse> =
        updateImages(id, BrandUpdateImagesParams.none(), requestOptions)

    /** A view of [BrandServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BrandServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<Brand>> = create(BrandCreateParams.none())

        /** @see create */
        fun create(
            params: BrandCreateParams = BrandCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>>

        /** @see create */
        fun create(
            params: BrandCreateParams = BrandCreateParams.none()
        ): CompletableFuture<HttpResponseFor<Brand>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<Brand>> =
            create(BrandCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(id, BrandRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>>

        /** @see retrieve */
        fun retrieve(params: BrandRetrieveParams): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Brand>> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /brands/{id}`, but is otherwise the same as
         * [BrandServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponseFor<Brand>> =
            update(id, BrandUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Brand>> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Brand>>

        /** @see update */
        fun update(params: BrandUpdateParams): CompletableFuture<HttpResponseFor<Brand>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Brand>> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(BrandListParams.none())

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandListResponse>>

        /** @see list */
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): CompletableFuture<HttpResponseFor<BrandListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
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

        /** @see updateImages */
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(id, params, RequestOptions.none())

        /** @see updateImages */
        fun updateImages(
            params: BrandUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>>

        /** @see updateImages */
        fun updateImages(
            params: BrandUpdateImagesParams
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(params, RequestOptions.none())

        /** @see updateImages */
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BrandUpdateImagesResponse>> =
            updateImages(id, BrandUpdateImagesParams.none(), requestOptions)
    }
}
