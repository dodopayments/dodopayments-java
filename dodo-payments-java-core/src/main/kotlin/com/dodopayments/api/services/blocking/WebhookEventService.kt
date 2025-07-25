// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhookevents.WebhookEvent
import com.dodopayments.api.models.webhookevents.WebhookEventListPage
import com.dodopayments.api.models.webhookevents.WebhookEventListParams
import com.dodopayments.api.models.webhookevents.WebhookEventRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface WebhookEventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookEventService

    @Deprecated("deprecated")
    fun retrieve(webhookEventId: String): WebhookEvent =
        retrieve(webhookEventId, WebhookEventRetrieveParams.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        webhookEventId: String,
        params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEvent =
        retrieve(params.toBuilder().webhookEventId(webhookEventId).build(), requestOptions)

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        webhookEventId: String,
        params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
    ): WebhookEvent = retrieve(webhookEventId, params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(
        params: WebhookEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEvent

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(params: WebhookEventRetrieveParams): WebhookEvent =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    @Deprecated("deprecated")
    fun retrieve(webhookEventId: String, requestOptions: RequestOptions): WebhookEvent =
        retrieve(webhookEventId, WebhookEventRetrieveParams.none(), requestOptions)

    fun list(): WebhookEventListPage = list(WebhookEventListParams.none())

    /** @see list */
    fun list(
        params: WebhookEventListParams = WebhookEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WebhookEventListPage

    /** @see list */
    fun list(params: WebhookEventListParams = WebhookEventListParams.none()): WebhookEventListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): WebhookEventListPage =
        list(WebhookEventListParams.none(), requestOptions)

    /**
     * A view of [WebhookEventService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookEventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /webhook_events/{webhook_event_id}`, but is
         * otherwise the same as [WebhookEventService.retrieve].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(webhookEventId: String): HttpResponseFor<WebhookEvent> =
            retrieve(webhookEventId, WebhookEventRetrieveParams.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            webhookEventId: String,
            params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEvent> =
            retrieve(params.toBuilder().webhookEventId(webhookEventId).build(), requestOptions)

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            webhookEventId: String,
            params: WebhookEventRetrieveParams = WebhookEventRetrieveParams.none(),
        ): HttpResponseFor<WebhookEvent> = retrieve(webhookEventId, params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            params: WebhookEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEvent>

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(params: WebhookEventRetrieveParams): HttpResponseFor<WebhookEvent> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @Deprecated("deprecated")
        @MustBeClosed
        fun retrieve(
            webhookEventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WebhookEvent> =
            retrieve(webhookEventId, WebhookEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhook_events`, but is otherwise the same as
         * [WebhookEventService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<WebhookEventListPage> = list(WebhookEventListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WebhookEventListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: WebhookEventListParams = WebhookEventListParams.none()
        ): HttpResponseFor<WebhookEventListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<WebhookEventListPage> =
            list(WebhookEventListParams.none(), requestOptions)
    }
}
