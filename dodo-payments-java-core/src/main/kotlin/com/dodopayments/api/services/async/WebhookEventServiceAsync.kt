// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhookevents.WebhookEvent
import com.dodopayments.api.models.webhookevents.WebhookEventListPageAsync
import com.dodopayments.api.models.webhookevents.WebhookEventListParams
import com.dodopayments.api.models.webhookevents.WebhookEventRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookEventServiceAsync

    @Deprecated("deprecated")
    fun retrieve(webhookEventId: String): CompletableFuture<WebhookEvent> =
        retrieve(webhookEventId, WebhookEventRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        webhookEventId: String,
        params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEvent> =
        retrieve(params.toBuilder().webhookEventId(webhookEventId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        webhookEventId: String,
        params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
    ): CompletableFuture<WebhookEvent> = retrieve(webhookEventId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEvent>

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: WebhookEventRetrieveParams): CompletableFuture<WebhookEvent> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        webhookEventId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookEvent> =
        retrieve(webhookEventId, WebhookEventRetrieveParams.none(), requestOptions)

    fun list(): CompletableFuture<WebhookEventListPageAsync> = list(WebhookEventListParams.none())

    /** @see list */
    fun list(
        params: WebhookEventListParams = WebhookEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEventListPageAsync>

    /** @see list */
    fun list(
        params: WebhookEventListParams = WebhookEventListParams.none()
    ): CompletableFuture<WebhookEventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookEventListPageAsync> =
        list(WebhookEventListParams.none(), requestOptions)

    /**
     * A view of [WebhookEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): WebhookEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhook_events/{webhook_event_id}`, but is
         * otherwise the same as [WebhookEventServiceAsync.retrieve].
         */
        @Deprecated("deprecated")
        fun retrieve(webhookEventId: String): CompletableFuture<HttpResponseFor<WebhookEvent>> =
            retrieve(webhookEventId, WebhookEventRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            webhookEventId: String,
            params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEvent>> =
            retrieve(params.toBuilder().webhookEventId(webhookEventId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            webhookEventId: String,
            params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEvent>> =
            retrieve(webhookEventId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEvent>>

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            params: WebhookEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookEvent>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        fun retrieve(
            webhookEventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookEvent>> =
            retrieve(webhookEventId, WebhookEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_events`, but is otherwise the same as
         * [WebhookEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>> =
            list(WebhookEventListParams.none())

        /** @see list */
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>>

        /** @see list */
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>> =
            list(WebhookEventListParams.none(), requestOptions)
    }
}
