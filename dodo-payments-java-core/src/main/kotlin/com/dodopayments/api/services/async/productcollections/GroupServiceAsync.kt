// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.productcollections

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.productcollections.groups.GroupCreateParams
import com.dodopayments.api.models.productcollections.groups.GroupCreateResponse
import com.dodopayments.api.models.productcollections.groups.GroupDeleteParams
import com.dodopayments.api.models.productcollections.groups.GroupUpdateParams
import com.dodopayments.api.services.async.productcollections.groups.ItemServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface GroupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): GroupServiceAsync

    fun items(): ItemServiceAsync

    fun create(id: String, params: GroupCreateParams): CompletableFuture<GroupCreateResponse> =
        create(id, params, RequestOptions.none())

    /** @see create */
    fun create(
        id: String,
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupCreateResponse> =
        create(params.toBuilder().id(id).build(), requestOptions)

    /** @see create */
    fun create(params: GroupCreateParams): CompletableFuture<GroupCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: GroupCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<GroupCreateResponse>

    fun update(groupId: String, params: GroupUpdateParams): CompletableFuture<Void?> =
        update(groupId, params, RequestOptions.none())

    /** @see update */
    fun update(
        groupId: String,
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see update */
    fun update(params: GroupUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: GroupUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    fun delete(groupId: String, params: GroupDeleteParams): CompletableFuture<Void?> =
        delete(groupId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        groupId: String,
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().groupId(groupId).build(), requestOptions)

    /** @see delete */
    fun delete(params: GroupDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: GroupDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** A view of [GroupServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): GroupServiceAsync.WithRawResponse

        fun items(): ItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /product-collections/{id}/groups`, but is otherwise
         * the same as [GroupServiceAsync.create].
         */
        fun create(
            id: String,
            params: GroupCreateParams,
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(id, params, RequestOptions.none())

        /** @see create */
        fun create(
            id: String,
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(params.toBuilder().id(id).build(), requestOptions)

        /** @see create */
        fun create(
            params: GroupCreateParams
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: GroupCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<GroupCreateResponse>>

        /**
         * Returns a raw HTTP response for `patch /product-collections/{id}/groups/{group_id}`, but
         * is otherwise the same as [GroupServiceAsync.update].
         */
        fun update(groupId: String, params: GroupUpdateParams): CompletableFuture<HttpResponse> =
            update(groupId, params, RequestOptions.none())

        /** @see update */
        fun update(
            groupId: String,
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see update */
        fun update(params: GroupUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: GroupUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `delete /product-collections/{id}/groups/{group_id}`, but
         * is otherwise the same as [GroupServiceAsync.delete].
         */
        fun delete(groupId: String, params: GroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(groupId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            groupId: String,
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().groupId(groupId).build(), requestOptions)

        /** @see delete */
        fun delete(params: GroupDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: GroupDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
