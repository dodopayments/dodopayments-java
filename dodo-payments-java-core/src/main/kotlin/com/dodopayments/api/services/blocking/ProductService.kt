// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.Product
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductDeleteParams
import com.dodopayments.api.models.products.ProductListPage
import com.dodopayments.api.models.products.ProductListParams
import com.dodopayments.api.models.products.ProductRetrieveParams
import com.dodopayments.api.models.products.ProductUnarchiveParams
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.blocking.products.ImageService
import com.google.errorprone.annotations.MustBeClosed

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun images(): ImageService

    fun create(params: ProductCreateParams): Product = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    fun retrieve(params: ProductRetrieveParams): Product = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    fun update(params: ProductUpdateParams) = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(params: ProductUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    fun list(): ProductListPage = list(ProductListParams.none())

    /** @see [list] */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see [list] */
    fun list(params: ProductListParams = ProductListParams.none()): ProductListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    fun delete(params: ProductDeleteParams) = delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(params: ProductDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    fun unarchive(params: ProductUnarchiveParams) = unarchive(params, RequestOptions.none())

    /** @see [unarchive] */
    fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun images(): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products`, but is otherwise the same as
         * [ProductService.create].
         */
        @MustBeClosed
        fun create(params: ProductCreateParams): HttpResponseFor<Product> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `get /products/{id}`, but is otherwise the same as
         * [ProductService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: ProductRetrieveParams): HttpResponseFor<Product> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductService.update].
         */
        @MustBeClosed
        fun update(params: ProductUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /products`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProductListPage> = list(ProductListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): HttpResponseFor<ProductListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{id}`, but is otherwise the same as
         * [ProductService.delete].
         */
        @MustBeClosed
        fun delete(params: ProductDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductService.unarchive].
         */
        @MustBeClosed
        fun unarchive(params: ProductUnarchiveParams): HttpResponse =
            unarchive(params, RequestOptions.none())

        /** @see [unarchive] */
        @MustBeClosed
        fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
