// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.ProductCollection
import com.dodopayments.api.models.productcollections.ProductCollectionCreateParams
import com.dodopayments.api.models.productcollections.ProductCollectionDeleteParams
import com.dodopayments.api.models.productcollections.ProductCollectionListPageAsync
import com.dodopayments.api.models.productcollections.ProductCollectionListParams
import com.dodopayments.api.models.productcollections.ProductCollectionRetrieveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveParams
import com.dodopayments.api.models.productcollections.ProductCollectionUnarchiveResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesParams
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateImagesResponse
import com.dodopayments.api.models.productcollections.ProductCollectionUpdateParams
import com.dodopayments.api.services.async.productcollections.GroupServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ProductCollectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ProductCollectionServiceAsync

    fun groups(): GroupServiceAsync

    fun create(params: ProductCollectionCreateParams): CompletableFuture<ProductCollection> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ProductCollectionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollection>

    fun retrieve(id: String): CompletableFuture<ProductCollection> =
        retrieve(id, ProductCollectionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollection> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
    ): CompletableFuture<ProductCollection> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ProductCollectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollection>

    /** @see retrieve */
    fun retrieve(params: ProductCollectionRetrieveParams): CompletableFuture<ProductCollection> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CompletableFuture<ProductCollection> =
        retrieve(id, ProductCollectionRetrieveParams.none(), requestOptions)

    fun update(id: String): CompletableFuture<Void?> =
        update(id, ProductCollectionUpdateParams.none())

    /** @see update */
    fun update(
        id: String,
        params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = update(params.toBuilder().id(id).build(), requestOptions)

    /** @see update */
    fun update(
        id: String,
        params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
    ): CompletableFuture<Void?> = update(id, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ProductCollectionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see update */
    fun update(params: ProductCollectionUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        update(id, ProductCollectionUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<ProductCollectionListPageAsync> =
        list(ProductCollectionListParams.none())

    /** @see list */
    fun list(
        params: ProductCollectionListParams = ProductCollectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollectionListPageAsync>

    /** @see list */
    fun list(
        params: ProductCollectionListParams = ProductCollectionListParams.none()
    ): CompletableFuture<ProductCollectionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ProductCollectionListPageAsync> =
        list(ProductCollectionListParams.none(), requestOptions)

    fun delete(id: String): CompletableFuture<Void?> =
        delete(id, ProductCollectionDeleteParams.none())

    /** @see delete */
    fun delete(
        id: String,
        params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = delete(params.toBuilder().id(id).build(), requestOptions)

    /** @see delete */
    fun delete(
        id: String,
        params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(id, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: ProductCollectionDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: ProductCollectionDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(id, ProductCollectionDeleteParams.none(), requestOptions)

    fun unarchive(id: String): CompletableFuture<ProductCollectionUnarchiveResponse> =
        unarchive(id, ProductCollectionUnarchiveParams.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollectionUnarchiveResponse> =
        unarchive(params.toBuilder().id(id).build(), requestOptions)

    /** @see unarchive */
    fun unarchive(
        id: String,
        params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
    ): CompletableFuture<ProductCollectionUnarchiveResponse> =
        unarchive(id, params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        params: ProductCollectionUnarchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollectionUnarchiveResponse>

    /** @see unarchive */
    fun unarchive(
        params: ProductCollectionUnarchiveParams
    ): CompletableFuture<ProductCollectionUnarchiveResponse> =
        unarchive(params, RequestOptions.none())

    /** @see unarchive */
    fun unarchive(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductCollectionUnarchiveResponse> =
        unarchive(id, ProductCollectionUnarchiveParams.none(), requestOptions)

    fun updateImages(id: String): CompletableFuture<ProductCollectionUpdateImagesResponse> =
        updateImages(id, ProductCollectionUpdateImagesParams.none())

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: ProductCollectionUpdateImagesParams = ProductCollectionUpdateImagesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollectionUpdateImagesResponse> =
        updateImages(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateImages */
    fun updateImages(
        id: String,
        params: ProductCollectionUpdateImagesParams = ProductCollectionUpdateImagesParams.none(),
    ): CompletableFuture<ProductCollectionUpdateImagesResponse> =
        updateImages(id, params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(
        params: ProductCollectionUpdateImagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ProductCollectionUpdateImagesResponse>

    /** @see updateImages */
    fun updateImages(
        params: ProductCollectionUpdateImagesParams
    ): CompletableFuture<ProductCollectionUpdateImagesResponse> =
        updateImages(params, RequestOptions.none())

    /** @see updateImages */
    fun updateImages(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ProductCollectionUpdateImagesResponse> =
        updateImages(id, ProductCollectionUpdateImagesParams.none(), requestOptions)

    /**
     * A view of [ProductCollectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): ProductCollectionServiceAsync.WithRawResponse

        fun groups(): GroupServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections`, but is otherwise the same as
         * [ProductCollectionServiceAsync.create].
         */
        fun create(
            params: ProductCollectionCreateParams
        ): CompletableFuture<HttpResponseFor<ProductCollection>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ProductCollectionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollection>>

        /**
         * Returns a raw HTTP response for `get /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<ProductCollection>> =
            retrieve(id, ProductCollectionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollection>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: ProductCollectionRetrieveParams = ProductCollectionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollection>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ProductCollectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollection>>

        /** @see retrieve */
        fun retrieve(
            params: ProductCollectionRetrieveParams
        ): CompletableFuture<HttpResponseFor<ProductCollection>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductCollection>> =
            retrieve(id, ProductCollectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionServiceAsync.update].
         */
        fun update(id: String): CompletableFuture<HttpResponse> =
            update(id, ProductCollectionUpdateParams.none())

        /** @see update */
        fun update(
            id: String,
            params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().id(id).build(), requestOptions)

        /** @see update */
        fun update(
            id: String,
            params: ProductCollectionUpdateParams = ProductCollectionUpdateParams.none(),
        ): CompletableFuture<HttpResponse> = update(id, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ProductCollectionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see update */
        fun update(params: ProductCollectionUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            update(id, ProductCollectionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /product-collections`, but is otherwise the same as
         * [ProductCollectionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ProductCollectionListPageAsync>> =
            list(ProductCollectionListParams.none())

        /** @see list */
        fun list(
            params: ProductCollectionListParams = ProductCollectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionListPageAsync>>

        /** @see list */
        fun list(
            params: ProductCollectionListParams = ProductCollectionListParams.none()
        ): CompletableFuture<HttpResponseFor<ProductCollectionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ProductCollectionListPageAsync>> =
            list(ProductCollectionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /product-collections/{id}`, but is otherwise the
         * same as [ProductCollectionServiceAsync.delete].
         */
        fun delete(id: String): CompletableFuture<HttpResponse> =
            delete(id, ProductCollectionDeleteParams.none())

        /** @see delete */
        fun delete(
            id: String,
            params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().id(id).build(), requestOptions)

        /** @see delete */
        fun delete(
            id: String,
            params: ProductCollectionDeleteParams = ProductCollectionDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(id, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: ProductCollectionDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: ProductCollectionDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(id: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            delete(id, ProductCollectionDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/unarchive`, but is
         * otherwise the same as [ProductCollectionServiceAsync.unarchive].
         */
        fun unarchive(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>> =
            unarchive(id, ProductCollectionUnarchiveParams.none())

        /** @see unarchive */
        fun unarchive(
            id: String,
            params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>> =
            unarchive(params.toBuilder().id(id).build(), requestOptions)

        /** @see unarchive */
        fun unarchive(
            id: String,
            params: ProductCollectionUnarchiveParams = ProductCollectionUnarchiveParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>> =
            unarchive(id, params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            params: ProductCollectionUnarchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>>

        /** @see unarchive */
        fun unarchive(
            params: ProductCollectionUnarchiveParams
        ): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>> =
            unarchive(params, RequestOptions.none())

        /** @see unarchive */
        fun unarchive(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductCollectionUnarchiveResponse>> =
            unarchive(id, ProductCollectionUnarchiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /product-collections/{id}/images`, but is otherwise
         * the same as [ProductCollectionServiceAsync.updateImages].
         */
        fun updateImages(
            id: String
        ): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>> =
            updateImages(id, ProductCollectionUpdateImagesParams.none())

        /** @see updateImages */
        fun updateImages(
            id: String,
            params: ProductCollectionUpdateImagesParams =
                ProductCollectionUpdateImagesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>> =
            updateImages(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateImages */
        fun updateImages(
            id: String,
            params: ProductCollectionUpdateImagesParams = ProductCollectionUpdateImagesParams.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>> =
            updateImages(id, params, RequestOptions.none())

        /** @see updateImages */
        fun updateImages(
            params: ProductCollectionUpdateImagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>>

        /** @see updateImages */
        fun updateImages(
            params: ProductCollectionUpdateImagesParams
        ): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>> =
            updateImages(params, RequestOptions.none())

        /** @see updateImages */
        fun updateImages(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ProductCollectionUpdateImagesResponse>> =
            updateImages(id, ProductCollectionUpdateImagesParams.none(), requestOptions)
    }
}
