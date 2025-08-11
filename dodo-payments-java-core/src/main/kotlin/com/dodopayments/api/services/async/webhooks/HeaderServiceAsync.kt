// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.webhooks

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveParams
import com.dodopayments.api.models.webhooks.headers.HeaderRetrieveResponse
import com.dodopayments.api.models.webhooks.headers.HeaderUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HeaderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HeaderServiceAsync

    /** Get a webhook by id */
    fun retrieve(webhookId: String): CompletableFuture<HeaderRetrieveResponse> =
        retrieve(webhookId, HeaderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: HeaderRetrieveParams = HeaderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HeaderRetrieveResponse> =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: HeaderRetrieveParams = HeaderRetrieveParams.none(),
    ): CompletableFuture<HeaderRetrieveResponse> =
        retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HeaderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HeaderRetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: HeaderRetrieveParams): CompletableFuture<HeaderRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HeaderRetrieveResponse> =
        retrieve(webhookId, HeaderRetrieveParams.none(), requestOptions)

    /** Patch a webhook by id */
    fun update(webhookId: String, params: HeaderUpdateParams): CompletableFuture<Void?> =
        update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: HeaderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(params: HeaderUpdateParams): CompletableFuture<Void?> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: HeaderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [HeaderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HeaderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}/headers`, but is otherwise
         * the same as [HeaderServiceAsync.retrieve].
         */
        fun retrieve(
            webhookId: String
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>> =
            retrieve(webhookId, HeaderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: HeaderRetrieveParams = HeaderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: HeaderRetrieveParams = HeaderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>> =
            retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HeaderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: HeaderRetrieveParams
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HeaderRetrieveResponse>> =
            retrieve(webhookId, HeaderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhook_id}/headers`, but is otherwise
         * the same as [HeaderServiceAsync.update].
         */
        fun update(webhookId: String, params: HeaderUpdateParams): CompletableFuture<HttpResponse> =
            update(webhookId, params, RequestOptions.none())

        /** @see update */
        fun update(
            webhookId: String,
            params: HeaderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        fun update(params: HeaderUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: HeaderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
