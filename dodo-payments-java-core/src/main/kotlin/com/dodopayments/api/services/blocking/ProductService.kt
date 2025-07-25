// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
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
import com.dodopayments.api.models.products.ProductUpdateFilesParams
import com.dodopayments.api.models.products.ProductUpdateFilesResponse
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.blocking.products.ImageService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface ProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService

    fun images(): ImageService

    fun create(params: ProductCreateParams): Product = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    fun retrieve(id: String): Product = retrieve(id, ProductRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
    ): Product = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Product

    /** @see retrieve */
    fun retrieve(params: ProductRetrieveParams): Product = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Product =
        retrieve(id, ProductRetrieveParams.none(), requestOptions)

    fun update(id: String) = update(id, ProductUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: ProductUpdateParams = ProductUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(id: String, params: ProductUpdateParams = ProductUpdateParams.none()) =
        update(id, params, RequestOptions.none())

    /** @see update */
    fun update(params: ProductUpdateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see update */
    fun update(params: ProductUpdateParams) = update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions) =
        update(id, ProductUpdateParams.none(), requestOptions)

    fun list(): ProductListPage = list(ProductListParams.none())

    /** @see list */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductListPage

    /** @see list */
    fun list(params: ProductListParams = ProductListParams.none()): ProductListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ProductListPage =
        list(ProductListParams.none(), requestOptions)

    fun delete(id: String) = delete(id, ProductDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(id: String, params: ProductDeleteParams = ProductDeleteParams.none()) =
        delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: ProductDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: ProductDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions) =
        delete(id, ProductDeleteParams.none(), requestOptions)

    fun unarchive(id: String) = unarchive(id, ProductUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(id: String, params: ProductUnarchiveParams = ProductUnarchiveParams.none()) =
        unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see unarchive */
    fun unarchive(params: ProductUnarchiveParams) = unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(id: String, requestOptions: RequestOptions) =
        unarchive(id, ProductUnarchiveParams.none(), requestOptions)

    fun updateFiles(id: String, params: ProductUpdateFilesParams): ProductUpdateFilesResponse =
        updateFiles(id, params, RequestOptions.none())

    /** @see updateFiles */
    fun updateFiles(
        id: String,
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateFilesResponse = updateFiles(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateFiles */
    fun updateFiles(params: ProductUpdateFilesParams): ProductUpdateFilesResponse =
        updateFiles(params, RequestOptions.none())

    /** @see updateFiles */
    fun updateFiles(
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProductUpdateFilesResponse

    /** A view of [ProductService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductService.WithRawResponse

        fun images(): ImageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products`, but is otherwise the same as
         * [ProductService.create].
         */
        @MustBeClosed
        fun create(params: ProductCreateParams): HttpResponseFor<Product> =
            create(params, RequestOptions.none())

        /** @see create */
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
        fun retrieve(id: String): HttpResponseFor<Product> =
            retrieve(id, ProductRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product> = retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
        ): HttpResponseFor<Product> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Product>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: ProductRetrieveParams): HttpResponseFor<Product> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Product> =
            retrieve(id, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductService.update].
         */
        @MustBeClosed fun update(id: String): HttpResponse = update(id, ProductUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ProductUpdateParams = ProductUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            id: String,
            params: ProductUpdateParams = ProductUpdateParams.none(),
        ): HttpResponse = update(id, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see update */
        @MustBeClosed
        fun update(params: ProductUpdateParams): HttpResponse =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(id: String, requestOptions: RequestOptions): HttpResponse =
            update(id, ProductUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /products`, but is otherwise the same as
         * [ProductService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<ProductListPage> = list(ProductListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): HttpResponseFor<ProductListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ProductListPage> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{id}`, but is otherwise the same as
         * [ProductService.delete].
         */
        @MustBeClosed fun delete(id: String): HttpResponse = delete(id, ProductDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
        ): HttpResponse = delete(id, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: ProductDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(id: String, requestOptions: RequestOptions): HttpResponse =
            delete(id, ProductDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductService.unarchive].
         */
        @MustBeClosed
        fun unarchive(id: String): HttpResponse = unarchive(id, ProductUnarchiveParams.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            id: String,
            params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
        ): HttpResponse = unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(params: ProductUnarchiveParams): HttpResponse =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        @MustBeClosed
        fun unarchive(id: String, requestOptions: RequestOptions): HttpResponse =
            unarchive(id, ProductUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /products/{id}/files`, but is otherwise the same as
         * [ProductService.updateFiles].
         */
        @MustBeClosed
        fun updateFiles(
            id: String,
            params: ProductUpdateFilesParams,
        ): HttpResponseFor<ProductUpdateFilesResponse> =
            updateFiles(id, params, RequestOptions.none())

        /** @see updateFiles */
        @MustBeClosed
        fun updateFiles(
            id: String,
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateFilesResponse> =
            updateFiles(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateFiles */
        @MustBeClosed
        fun updateFiles(
            params: ProductUpdateFilesParams
        ): HttpResponseFor<ProductUpdateFilesResponse> = updateFiles(params, RequestOptions.none())

        /** @see updateFiles */
        @MustBeClosed
        fun updateFiles(
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ProductUpdateFilesResponse>
    }
}
