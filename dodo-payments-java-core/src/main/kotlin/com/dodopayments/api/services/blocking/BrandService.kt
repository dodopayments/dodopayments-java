// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

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
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface BrandService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService

    fun create(): Brand = create(BrandCreateParams.none())

    /** @see create */
    fun create(
        params: BrandCreateParams = BrandCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see create */
    fun create(params: BrandCreateParams = BrandCreateParams.none()): Brand =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(requestOptions: RequestOptions): Brand =
        create(BrandCreateParams.none(), requestOptions)

    /** Thin handler just calls `get_brand` and wraps in `Json(...)` */
    fun retrieve(id: String): Brand = retrieve(id, BrandRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: BrandRetrieveParams = BrandRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: String, params: BrandRetrieveParams = BrandRetrieveParams.none()): Brand =
        retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BrandRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see retrieve */
    fun retrieve(params: BrandRetrieveParams): Brand = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Brand =
        retrieve(id, BrandRetrieveParams.none(), requestOptions)

    fun update(id: String): Brand = update(id, BrandUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: BrandUpdateParams = BrandUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: BrandUpdateParams = BrandUpdateParams.none()): Brand =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: BrandUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Brand

    /** @see update */
    fun update(params: BrandUpdateParams): Brand = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): Brand =
        update(id, BrandUpdateParams.none(), requestOptions)

    fun list(): BrandListResponse = list(BrandListParams.none())

    /** @see list */
    fun list(
        params: BrandListParams = BrandListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandListResponse

    /** @see list */
    fun list(params: BrandListParams = BrandListParams.none()): BrandListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BrandListResponse =
        list(BrandListParams.none(), requestOptions)

    fun updateImages(id: String): BrandUpdateImagesResponse =
        updateImages(id, BrandUpdateImagesParams.none())

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateImagesResponse = updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
    ): BrandUpdateImagesResponse = updateImages(id, params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(
        params: BrandUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BrandUpdateImagesResponse

    /** @see updateImages */
    fun updateImages(params: BrandUpdateImagesParams): BrandUpdateImagesResponse =
        updateImages(params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(id: String, requestOptions: RequestOptions): BrandUpdateImagesResponse =
        updateImages(id, BrandUpdateImagesParams.none(), requestOptions)

    /** A view of [BrandService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BrandService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /brands`, but is otherwise the same as
         * [BrandService.create].
         */
        @MustBeClosed fun create(): HttpResponseFor<Brand> = create(BrandCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BrandCreateParams = BrandCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see create */
        @MustBeClosed
        fun create(params: BrandCreateParams = BrandCreateParams.none()): HttpResponseFor<Brand> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(requestOptions: RequestOptions): HttpResponseFor<Brand> =
            create(BrandCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands/{id}`, but is otherwise the same as
         * [BrandService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<Brand> = retrieve(id, BrandRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: BrandRetrieveParams = BrandRetrieveParams.none(),
        ): HttpResponseFor<Brand> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BrandRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: BrandRetrieveParams): HttpResponseFor<Brand> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Brand> =
            retrieve(id, BrandRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /brands/{id}`, but is otherwise the same as
         * [BrandService.update].
         */
        @MustBeClosed
        fun update(id: String): HttpResponseFor<Brand> = update(id, BrandUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand> = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: BrandUpdateParams = BrandUpdateParams.none(),
        ): HttpResponseFor<Brand> = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: BrandUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Brand>

        /** @see update */
        @MustBeClosed
        fun update(params: BrandUpdateParams): HttpResponseFor<Brand> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponseFor<Brand> =
            update(id, BrandUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /brands`, but is otherwise the same as
         * [BrandService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<BrandListResponse> = list(BrandListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BrandListParams = BrandListParams.none()
        ): HttpResponseFor<BrandListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BrandListResponse> =
            list(BrandListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /brands/{id}/images`, but is otherwise the same as
         * [BrandService.updateImages].
         */
        @MustBeClosed
        fun updateImages(id: String): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(id, BrandUpdateImagesParams.none())

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            params: BrandUpdateImagesParams = BrandUpdateImagesParams.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(id, params, RequestOptions.none())

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            params: BrandUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BrandUpdateImagesResponse>

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            params: BrandUpdateImagesParams
        ): HttpResponseFor<BrandUpdateImagesResponse> = updateImages(params, RequestOptions.none())

        /** @see updateImages */
        @MustBeClosed
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BrandUpdateImagesResponse> =
            updateImages(id, BrandUpdateImagesParams.none(), requestOptions)
    }
}
