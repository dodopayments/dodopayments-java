// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.blocklist.customers.notes.BlockedCustomerNote
import com.dodopayments.api.models.blocklist.customers.notes.NoteCreateParams
import com.dodopayments.api.models.blocklist.customers.notes.NoteUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NoteServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteServiceAsync

    fun create(entryId: String, params: NoteCreateParams): CompletableFuture<BlockedCustomerNote> =
        create(entryId, params, RequestOptions.none())

    /** @see create */
    fun create(
        entryId: String,
        params: NoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomerNote> =
        create(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see create */
    fun create(params: NoteCreateParams): CompletableFuture<BlockedCustomerNote> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: NoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomerNote>

    fun update(noteId: String, params: NoteUpdateParams): CompletableFuture<BlockedCustomerNote> =
        update(noteId, params, RequestOptions.none())

    /** @see update */
    fun update(
        noteId: String,
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomerNote> =
        update(params.toBuilder().noteId(noteId).build(), requestOptions)

    /** @see update */
    fun update(params: NoteUpdateParams): CompletableFuture<BlockedCustomerNote> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: NoteUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomerNote>

    /** A view of [NoteServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NoteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /blocklist/customers/{entry_id}/notes`, but is
         * otherwise the same as [NoteServiceAsync.create].
         */
        fun create(
            entryId: String,
            params: NoteCreateParams,
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> =
            create(entryId, params, RequestOptions.none())

        /** @see create */
        fun create(
            entryId: String,
            params: NoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> =
            create(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see create */
        fun create(
            params: NoteCreateParams
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: NoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>>

        /**
         * Returns a raw HTTP response for `patch /blocklist/customers/{entry_id}/notes/{note_id}`,
         * but is otherwise the same as [NoteServiceAsync.update].
         */
        fun update(
            noteId: String,
            params: NoteUpdateParams,
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> =
            update(noteId, params, RequestOptions.none())

        /** @see update */
        fun update(
            noteId: String,
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> =
            update(params.toBuilder().noteId(noteId).build(), requestOptions)

        /** @see update */
        fun update(
            params: NoteUpdateParams
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: NoteUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomerNote>>
    }
}
