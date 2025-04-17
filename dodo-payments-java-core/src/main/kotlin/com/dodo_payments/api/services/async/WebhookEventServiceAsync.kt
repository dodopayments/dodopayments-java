// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.webhookevents.WebhookEvent
import com.dodo_payments.api.models.webhookevents.WebhookEventListPageAsync
import com.dodo_payments.api.models.webhookevents.WebhookEventListParams
import com.dodo_payments.api.models.webhookevents.WebhookEventRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface WebhookEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(params: WebhookEventRetrieveParams): CompletableFuture<WebhookEvent> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEvent>

    fun list(): CompletableFuture<WebhookEventListPageAsync> = list(WebhookEventListParams.none())

    /** @see [list] */
    fun list(
        params: WebhookEventListParams = WebhookEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookEventListPageAsync>

    /** @see [list] */
    fun list(
        params: WebhookEventListParams = WebhookEventListParams.none()
    ): CompletableFuture<WebhookEventListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookEventListPageAsync> =
        list(WebhookEventListParams.none(), requestOptions)

    /**
     * A view of [WebhookEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /webhook_events/{webhook_event_id}`, but is
         * otherwise the same as [WebhookEventServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: WebhookEventRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookEvent>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEvent>>

        /**
         * Returns a raw HTTP response for `get /webhook_events`, but is otherwise the same as
         * [WebhookEventServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>> =
            list(WebhookEventListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookEventListPageAsync>> =
            list(WebhookEventListParams.none(), requestOptions)
    }
}
