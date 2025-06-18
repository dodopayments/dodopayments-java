// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.products.Product
import com.dodopayments.api.models.products.ProductCreateParams
import com.dodopayments.api.models.products.ProductDeleteParams
import com.dodopayments.api.models.products.ProductListPageAsync
import com.dodopayments.api.models.products.ProductListParams
import com.dodopayments.api.models.products.ProductRetrieveParams
import com.dodopayments.api.models.products.ProductUnarchiveParams
import com.dodopayments.api.models.products.ProductUpdateFilesParams
import com.dodopayments.api.models.products.ProductUpdateFilesResponse
import com.dodopayments.api.models.products.ProductUpdateParams
import com.dodopayments.api.services.async.products.ImageServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductServiceAsync

    fun images(): ImageServiceAsync

    fun create(params: ProductCreateParams): CompletableFuture<Product> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ProductCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

    fun retrieve(id: String): CompletableFuture<Product> =
        retrieve(id, ProductRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product> = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        id: String,
        params: ProductRetrieveParams = ProductRetrieveParams.none(),
    ): CompletableFuture<Product> = retrieve(id, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ProductRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Product>

    /** @see [retrieve] */
    fun retrieve(params: ProductRetrieveParams): CompletableFuture<Product> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<Product> =
        retrieve(id, ProductRetrieveParams.none(), requestOptions)

    fun update(id: String): CompletableFuture<Void?> = update(id, ProductUpdateParams.none())

    /** @see [update] */
    fun update(
        id: String,
        params: ProductUpdateParams = ProductUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see [update] */
    fun update(
        id: String,
        params: ProductUpdateParams = ProductUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ProductUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [update] */
    fun update(params: ProductUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, ProductUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<ProductListPageAsync> = list(ProductListParams.none())

    /** @see [list] */
    fun list(
        params: ProductListParams = ProductListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductListPageAsync>

    /** @see [list] */
    fun list(
        params: ProductListParams = ProductListParams.none()
    ): CompletableFuture<ProductListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductListPageAsync> =
        list(ProductListParams.none(), requestOptions)

    fun delete(id: String): CompletableFuture<Void?> = delete(id, ProductDeleteParams.none())

    /** @see [delete] */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see [delete] */
    fun delete(
        id: String,
        params: ProductDeleteParams = ProductDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: ProductDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [delete] */
    fun delete(params: ProductDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ProductDeleteParams.none(), requestOptions)

    fun unarchive(id: String): CompletableFuture<Void?> =
        unarchive(id, ProductUnarchiveParams.none())

    /** @see [unarchive] */
    fun unarchive(
        id: String,
        params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see [unarchive] */
    fun unarchive(
        id: String,
        params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
    ): CompletableFuture<Void?> = unarchive(id, params, RequestOptions.none())

    /** @see [unarchive] */
    fun unarchive(
        params: ProductUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [unarchive] */
    fun unarchive(params: ProductUnarchiveParams): CompletableFuture<Void?> =
        unarchive(params, RequestOptions.none())

    /** @see [unarchive] */
    fun unarchive(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        unarchive(id, ProductUnarchiveParams.none(), requestOptions)

    fun updateFiles(
        id: String,
        params: ProductUpdateFilesParams,
    ): CompletableFuture<ProductUpdateFilesResponse> =
        updateFiles(id, params, RequestOptions.none())

    /** @see [updateFiles] */
    fun updateFiles(
        id: String,
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUpdateFilesResponse> =
        updateFiles(params.toBuilder().id(id).build(), requestOptions)

    /** @see [updateFiles] */
    fun updateFiles(
        params: ProductUpdateFilesParams
    ): CompletableFuture<ProductUpdateFilesResponse> = updateFiles(params, RequestOptions.none())

    /** @see [updateFiles] */
    fun updateFiles(
        params: ProductUpdateFilesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductUpdateFilesResponse>

    /**
     * A view of [ProductServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ProductServiceAsync.WithRawResponse

        fun images(): ImageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /products`, but is otherwise the same as
         * [ProductServiceAsync.create].
         */
        fun create(params: ProductCreateParams): CompletableFuture<HttpResponseFor<Product>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: ProductCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

        /**
         * Returns a raw HTTP response for `get /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<Product>> =
            retrieve(id, ProductRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            params: ProductRetrieveParams = ProductRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Product>> = retrieve(id, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ProductRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Product>>

        /** @see [retrieve] */
        fun retrieve(params: ProductRetrieveParams): CompletableFuture<HttpResponseFor<Product>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Product>> =
            retrieve(id, ProductRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, ProductUpdateParams.none())

        /** @see [update] */
        fun update(
            id: String,
            params: ProductUpdateParams = ProductUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see [update] */
        fun update(
            id: String,
            params: ProductUpdateParams = ProductUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: ProductUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [update] */
        fun update(params: ProductUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, ProductUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /products`, but is otherwise the same as
         * [ProductServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none())

        /** @see [list] */
        fun list(
            params: ProductListParams = ProductListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>>

        /** @see [list] */
        fun list(
            params: ProductListParams = ProductListParams.none()
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductListPageAsync>> =
            list(ProductListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /products/{id}`, but is otherwise the same as
         * [ProductServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ProductDeleteParams.none())

        /** @see [delete] */
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see [delete] */
        fun delete(
            id: String,
            params: ProductDeleteParams = ProductDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see [delete] */
        fun delete(
            params: ProductDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [delete] */
        fun delete(params: ProductDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ProductDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /products/{id}/unarchive`, but is otherwise the
         * same as [ProductServiceAsync.unarchive].
         */
        fun unarchive(id: String): CompletableFuture<HttpResponse> =
            unarchive(id, ProductUnarchiveParams.none())

        /** @see [unarchive] */
        fun unarchive(
            id: String,
            params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see [unarchive] */
        fun unarchive(
            id: String,
            params: ProductUnarchiveParams = ProductUnarchiveParams.none(),
        ): CompletableFuture<HttpResponse> = unarchive(id, params, RequestOptions.none())

        /** @see [unarchive] */
        fun unarchive(
            params: ProductUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [unarchive] */
        fun unarchive(params: ProductUnarchiveParams): CompletableFuture<HttpResponse> =
            unarchive(params, RequestOptions.none())

        /** @see [unarchive] */
        fun unarchive(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            unarchive(id, ProductUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /products/{id}/files`, but is otherwise the same as
         * [ProductServiceAsync.updateFiles].
         */
        fun updateFiles(
            id: String,
            params: ProductUpdateFilesParams,
        ): CompletableFuture<HttpResponseFor<ProductUpdateFilesResponse>> =
            updateFiles(id, params, RequestOptions.none())

        /** @see [updateFiles] */
        fun updateFiles(
            id: String,
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUpdateFilesResponse>> =
            updateFiles(params.toBuilder().id(id).build(), requestOptions)

        /** @see [updateFiles] */
        fun updateFiles(
            params: ProductUpdateFilesParams
        ): CompletableFuture<HttpResponseFor<ProductUpdateFilesResponse>> =
            updateFiles(params, RequestOptions.none())

        /** @see [updateFiles] */
        fun updateFiles(
            params: ProductUpdateFilesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductUpdateFilesResponse>>
    }
}
