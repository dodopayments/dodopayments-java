// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.usageevents.Event
import com.dodopayments.api.models.usageevents.UsageEventIngestParams
import com.dodopayments.api.models.usageevents.UsageEventIngestResponse
import com.dodopayments.api.models.usageevents.UsageEventListPageAsync
import com.dodopayments.api.models.usageevents.UsageEventListParams
import com.dodopayments.api.models.usageevents.UsageEventRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface UsageEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UsageEventServiceAsync

    /**
     * Fetch detailed information about a single event using its unique event ID. This endpoint is
     * useful for:
     * - Debugging specific event ingestion issues
     * - Retrieving event details for customer support
     * - Validating that events were processed correctly
     * - Getting the complete metadata for an event
     *
     * ## Event ID Format:
     *
     * The event ID should be the same value that was provided during event ingestion via the
     * `/events/ingest` endpoint. Event IDs are case-sensitive and must match exactly.
     *
     * ## Response Details:
     *
     * The response includes all event data including:
     * - Complete metadata key-value pairs
     * - Original timestamp (preserved from ingestion)
     * - Customer and business association
     * - Event name and processing information
     *
     * ## Example Usage:
     * ```text
     * GET /events/api_call_12345
     * ```
     */
    fun retrieve(eventId: String): CompletableFuture<Event> =
        retrieve(eventId, UsageEventRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: UsageEventRetrieveParams = UsageEventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event> =
        retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        eventId: String,
        params: UsageEventRetrieveParams = UsageEventRetrieveParams.none(),
    ): CompletableFuture<Event> = retrieve(eventId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: UsageEventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Event>

    /** @see retrieve */
    fun retrieve(params: UsageEventRetrieveParams): CompletableFuture<Event> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(eventId: String, requestOptions: RequestOptions): CompletableFuture<Event> =
        retrieve(eventId, UsageEventRetrieveParams.none(), requestOptions)

    /**
     * Fetch events from your account with powerful filtering capabilities. This endpoint is ideal
     * for:
     * - Debugging event ingestion issues
     * - Analyzing customer usage patterns
     * - Building custom analytics dashboards
     * - Auditing billing-related events
     *
     * ## Filtering Options:
     * - **Customer filtering**: Filter by specific customer ID
     * - **Event name filtering**: Filter by event type/name
     * - **Meter-based filtering**: Use a meter ID to apply the meter's event name and filter
     *   criteria automatically
     * - **Time range filtering**: Filter events within a specific date range
     * - **Pagination**: Navigate through large result sets
     *
     * ## Meter Integration:
     *
     * When using `meter_id`, the endpoint automatically applies:
     * - The meter's configured `event_name` filter
     * - The meter's custom filter criteria (if any)
     * - If you also provide `event_name`, it must match the meter's event name
     *
     * ## Example Queries:
     * - Get all events for a customer: `?customer_id=cus_abc123`
     * - Get API request events: `?event_name=api_request`
     * - Get events from last 24 hours: `?start=2024-01-14T10:30:00Z&end=2024-01-15T10:30:00Z`
     * - Get events with meter filtering: `?meter_id=mtr_xyz789`
     * - Paginate results: `?page_size=50&page_number=2`
     */
    fun list(): CompletableFuture<UsageEventListPageAsync> = list(UsageEventListParams.none())

    /** @see list */
    fun list(
        params: UsageEventListParams = UsageEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageEventListPageAsync>

    /** @see list */
    fun list(
        params: UsageEventListParams = UsageEventListParams.none()
    ): CompletableFuture<UsageEventListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<UsageEventListPageAsync> =
        list(UsageEventListParams.none(), requestOptions)

    /**
     * This endpoint allows you to ingest custom events that can be used for:
     * - Usage-based billing and metering
     * - Analytics and reporting
     * - Customer behavior tracking
     *
     * ## Important Notes:
     * - **Duplicate Prevention**:
     *     - Duplicate `event_id` values within the same request are rejected (entire request fails)
     *     - Subsequent requests with existing `event_id` values are ignored (idempotent behavior)
     * - **Rate Limiting**: Maximum 1000 events per request
     * - **Time Validation**: Events with timestamps older than 1 hour or more than 5 minutes in the
     *   future will be rejected
     * - **Metadata Limits**: Maximum 50 key-value pairs per event, keys max 100 chars, values max
     *   500 chars
     *
     * ## Example Usage:
     * ```json
     * {
     *   "events": [
     *     {
     *       "event_id": "api_call_12345",
     *       "customer_id": "cus_abc123",
     *       "event_name": "api_request",
     *       "timestamp": "2024-01-15T10:30:00Z",
     *       "metadata": {
     *         "endpoint": "/api/v1/users",
     *         "method": "GET",
     *         "tokens_used": "150"
     *       }
     *     }
     *   ]
     * }
     * ```
     */
    fun ingest(params: UsageEventIngestParams): CompletableFuture<UsageEventIngestResponse> =
        ingest(params, RequestOptions.none())

    /** @see ingest */
    fun ingest(
        params: UsageEventIngestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UsageEventIngestResponse>

    /**
     * A view of [UsageEventServiceAsync] that provides access to raw HTTP responses for each
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
        ): UsageEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/{event_id}`, but is otherwise the same as
         * [UsageEventServiceAsync.retrieve].
         */
        fun retrieve(eventId: String): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(eventId, UsageEventRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            eventId: String,
            params: UsageEventRetrieveParams = UsageEventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            eventId: String,
            params: UsageEventRetrieveParams = UsageEventRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(eventId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: UsageEventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Event>>

        /** @see retrieve */
        fun retrieve(params: UsageEventRetrieveParams): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            eventId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Event>> =
            retrieve(eventId, UsageEventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events`, but is otherwise the same as
         * [UsageEventServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<UsageEventListPageAsync>> =
            list(UsageEventListParams.none())

        /** @see list */
        fun list(
            params: UsageEventListParams = UsageEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageEventListPageAsync>>

        /** @see list */
        fun list(
            params: UsageEventListParams = UsageEventListParams.none()
        ): CompletableFuture<HttpResponseFor<UsageEventListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<UsageEventListPageAsync>> =
            list(UsageEventListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /events/ingest`, but is otherwise the same as
         * [UsageEventServiceAsync.ingest].
         */
        fun ingest(
            params: UsageEventIngestParams
        ): CompletableFuture<HttpResponseFor<UsageEventIngestResponse>> =
            ingest(params, RequestOptions.none())

        /** @see ingest */
        fun ingest(
            params: UsageEventIngestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UsageEventIngestResponse>>
    }
}
