// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.webhooks.WebhookCreateParams
import com.dodopayments.api.models.webhooks.WebhookDeleteParams
import com.dodopayments.api.models.webhooks.WebhookDetails
import com.dodopayments.api.models.webhooks.WebhookListPageAsync
import com.dodopayments.api.models.webhooks.WebhookListParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveSecretParams
import com.dodopayments.api.models.webhooks.WebhookRetrieveSecretResponse
import com.dodopayments.api.models.webhooks.WebhookUpdateParams
import com.dodopayments.api.services.async.webhooks.HeaderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebhookServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebhookServiceAsync

    fun headers(): HeaderServiceAsync

    /** Create a new webhook */
    fun create(params: WebhookCreateParams): CompletableFuture<WebhookDetails> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebhookCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDetails>

    /** Get a webhook by id */
    fun retrieve(webhookId: String): CompletableFuture<WebhookDetails> =
        retrieve(webhookId, WebhookRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDetails> =
        retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
    ): CompletableFuture<WebhookDetails> = retrieve(webhookId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: WebhookRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDetails>

    /** @see retrieve */
    fun retrieve(params: WebhookRetrieveParams): CompletableFuture<WebhookDetails> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDetails> =
        retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

    /** Patch a webhook by id */
    fun update(webhookId: String): CompletableFuture<WebhookDetails> =
        update(webhookId, WebhookUpdateParams.none())

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDetails> =
        update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see update */
    fun update(
        webhookId: String,
        params: WebhookUpdateParams = WebhookUpdateParams.none(),
    ): CompletableFuture<WebhookDetails> = update(webhookId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebhookUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookDetails>

    /** @see update */
    fun update(params: WebhookUpdateParams): CompletableFuture<WebhookDetails> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookDetails> =
        update(webhookId, WebhookUpdateParams.none(), requestOptions)

    /** List all webhooks */
    fun list(): CompletableFuture<WebhookListPageAsync> = list(WebhookListParams.none())

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookListPageAsync>

    /** @see list */
    fun list(
        params: WebhookListParams = WebhookListParams.none()
    ): CompletableFuture<WebhookListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebhookListPageAsync> =
        list(WebhookListParams.none(), requestOptions)

    /** Delete a webhook by id */
    fun delete(webhookId: String): CompletableFuture<Void?> =
        delete(webhookId, WebhookDeleteParams.none())

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see delete */
    fun delete(
        webhookId: String,
        params: WebhookDeleteParams = WebhookDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(webhookId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebhookDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WebhookDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(webhookId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(webhookId, WebhookDeleteParams.none(), requestOptions)

    /** Get webhook secret by id */
    fun retrieveSecret(webhookId: String): CompletableFuture<WebhookRetrieveSecretResponse> =
        retrieveSecret(webhookId, WebhookRetrieveSecretParams.none())

    /** @see retrieveSecret */
    fun retrieveSecret(
        webhookId: String,
        params: WebhookRetrieveSecretParams = WebhookRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookRetrieveSecretResponse> =
        retrieveSecret(params.toBuilder().webhookId(webhookId).build(), requestOptions)

    /** @see retrieveSecret */
    fun retrieveSecret(
        webhookId: String,
        params: WebhookRetrieveSecretParams = WebhookRetrieveSecretParams.none(),
    ): CompletableFuture<WebhookRetrieveSecretResponse> =
        retrieveSecret(webhookId, params, RequestOptions.none())

    /** @see retrieveSecret */
    fun retrieveSecret(
        params: WebhookRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebhookRetrieveSecretResponse>

    /** @see retrieveSecret */
    fun retrieveSecret(
        params: WebhookRetrieveSecretParams
    ): CompletableFuture<WebhookRetrieveSecretResponse> =
        retrieveSecret(params, RequestOptions.none())

    /** @see retrieveSecret */
    fun retrieveSecret(
        webhookId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WebhookRetrieveSecretResponse> =
        retrieveSecret(webhookId, WebhookRetrieveSecretParams.none(), requestOptions)

    /**
     * A view of [WebhookServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WebhookServiceAsync.WithRawResponse

        fun headers(): HeaderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.create].
         */
        fun create(
            params: WebhookCreateParams
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebhookCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>>

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookServiceAsync.retrieve].
         */
        fun retrieve(webhookId: String): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            retrieve(webhookId, WebhookRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            retrieve(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            params: WebhookRetrieveParams = WebhookRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            retrieve(webhookId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>>

        /** @see retrieve */
        fun retrieve(
            params: WebhookRetrieveParams
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            retrieve(webhookId, WebhookRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /webhooks/{webhook_id}`, but is otherwise the same
         * as [WebhookServiceAsync.update].
         */
        fun update(webhookId: String): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            update(webhookId, WebhookUpdateParams.none())

        /** @see update */
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            update(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see update */
        fun update(
            webhookId: String,
            params: WebhookUpdateParams = WebhookUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            update(webhookId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebhookUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookDetails>>

        /** @see update */
        fun update(
            params: WebhookUpdateParams
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookDetails>> =
            update(webhookId, WebhookUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks`, but is otherwise the same as
         * [WebhookServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(WebhookListParams.none())

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>>

        /** @see list */
        fun list(
            params: WebhookListParams = WebhookListParams.none()
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebhookListPageAsync>> =
            list(WebhookListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /webhooks/{webhook_id}`, but is otherwise the
         * same as [WebhookServiceAsync.delete].
         */
        fun delete(webhookId: String): CompletableFuture<HttpResponse> =
            delete(webhookId, WebhookDeleteParams.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see delete */
        fun delete(
            webhookId: String,
            params: WebhookDeleteParams = WebhookDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(webhookId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebhookDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WebhookDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(webhookId, WebhookDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /webhooks/{webhook_id}/secret`, but is otherwise the
         * same as [WebhookServiceAsync.retrieveSecret].
         */
        fun retrieveSecret(
            webhookId: String
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveSecretResponse>> =
            retrieveSecret(webhookId, WebhookRetrieveSecretParams.none())

        /** @see retrieveSecret */
        fun retrieveSecret(
            webhookId: String,
            params: WebhookRetrieveSecretParams = WebhookRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveSecretResponse>> =
            retrieveSecret(params.toBuilder().webhookId(webhookId).build(), requestOptions)

        /** @see retrieveSecret */
        fun retrieveSecret(
            webhookId: String,
            params: WebhookRetrieveSecretParams = WebhookRetrieveSecretParams.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveSecretResponse>> =
            retrieveSecret(webhookId, params, RequestOptions.none())

        /** @see retrieveSecret */
        fun retrieveSecret(
            params: WebhookRetrieveSecretParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveSecretResponse>>

        /** @see retrieveSecret */
        fun retrieveSecret(
            params: WebhookRetrieveSecretParams
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveSecretResponse>> =
            retrieveSecret(params, RequestOptions.none())

        /** @see retrieveSecret */
        fun retrieveSecret(
            webhookId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WebhookRetrieveSecretResponse>> =
            retrieveSecret(webhookId, WebhookRetrieveSecretParams.none(), requestOptions)
    }
}
