// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.productcollections.groups

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.groups.items.ItemCreateParams
import com.dodopayments.api.models.productcollections.groups.items.ItemDeleteParams
import com.dodopayments.api.models.productcollections.groups.items.ItemUpdateParams
import com.dodopayments.api.models.productcollections.groups.items.ProductCollectionProduct
import com.dodopayments.api.services.async.productcollections.groups.ItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ItemServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync

    fun create(groupId: String, params: ItemCreateParams): CompletableFuture<List<ProductCollectionProduct>> =
        create(
          groupId,
          params,
          RequestOptions.none(),
        )

    /** @see create */
    fun create(groupId: String, params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ProductCollectionProduct>> =
        create(
          params.toBuilder()
              .groupId(groupId)
              .build(), requestOptions
        )

    /** @see create */
    fun create(params: ItemCreateParams): CompletableFuture<List<ProductCollectionProduct>> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<List<ProductCollectionProduct>>

    fun update(itemId: String, params: ItemUpdateParams): CompletableFuture<Void?> =
        update(
          itemId,
          params,
          RequestOptions.none(),
        )

    /** @see update */
    fun update(itemId: String, params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        update(
          params.toBuilder()
              .itemId(itemId)
              .build(), requestOptions
        )

    /** @see update */
    fun update(params: ItemUpdateParams): CompletableFuture<Void?> =
        update(
          params, RequestOptions.none()
        )

    /** @see update */
    fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    fun delete(itemId: String, params: ItemDeleteParams): CompletableFuture<Void?> =
        delete(
          itemId,
          params,
          RequestOptions.none(),
        )

    /** @see delete */
    fun delete(itemId: String, params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?> =
        delete(
          params.toBuilder()
              .itemId(itemId)
              .build(), requestOptions
        )

    /** @see delete */
    fun delete(params: ItemDeleteParams): CompletableFuture<Void?> =
        delete(
          params, RequestOptions.none()
        )

    /** @see delete */
    fun delete(params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<Void?>

    /** A view of [ItemServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ItemServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /product-collections/{id}/groups/{group_id}/items`, but is otherwise the             same as [ItemServiceAsync.create]. */
        fun create(groupId: String, params: ItemCreateParams): CompletableFuture<HttpResponseFor<List<ProductCollectionProduct>>> =
            create(
              groupId,
              params,
              RequestOptions.none(),
            )

        /** @see create */
        fun create(groupId: String, params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ProductCollectionProduct>>> =
            create(
              params.toBuilder()
                  .groupId(groupId)
                  .build(), requestOptions
            )

        /** @see create */
        fun create(params: ItemCreateParams): CompletableFuture<HttpResponseFor<List<ProductCollectionProduct>>> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: ItemCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<List<ProductCollectionProduct>>>

        /** Returns a raw HTTP response for `patch /product-collections/{id}/groups/{group_id}/items/{item_id}`, but is otherwise the             same as [ItemServiceAsync.update]. */
        fun update(itemId: String, params: ItemUpdateParams): CompletableFuture<HttpResponse> =
            update(
              itemId,
              params,
              RequestOptions.none(),
            )

        /** @see update */
        fun update(itemId: String, params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            update(
              params.toBuilder()
                  .itemId(itemId)
                  .build(), requestOptions
            )

        /** @see update */
        fun update(params: ItemUpdateParams): CompletableFuture<HttpResponse> =
            update(
              params, RequestOptions.none()
            )

        /** @see update */
        fun update(params: ItemUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>

        /** Returns a raw HTTP response for `delete /product-collections/{id}/groups/{group_id}/items/{item_id}`, but is otherwise the             same as [ItemServiceAsync.delete]. */
        fun delete(itemId: String, params: ItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              itemId,
              params,
              RequestOptions.none(),
            )

        /** @see delete */
        fun delete(itemId: String, params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse> =
            delete(
              params.toBuilder()
                  .itemId(itemId)
                  .build(), requestOptions
            )

        /** @see delete */
        fun delete(params: ItemDeleteParams): CompletableFuture<HttpResponse> =
            delete(
              params, RequestOptions.none()
            )

        /** @see delete */
        fun delete(params: ItemDeleteParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponse>
    }
}
