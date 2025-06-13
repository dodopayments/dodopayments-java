// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.disputes.DisputeListPageAsync
import com.dodopayments.api.models.disputes.DisputeListParams
import com.dodopayments.api.models.disputes.DisputeRetrieveParams
import com.dodopayments.api.models.disputes.DisputeRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputeServiceAsync

    fun retrieve(disputeId: String): CompletableFuture<DisputeRetrieveResponse> =
        retrieve(disputeId, DisputeRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        disputeId: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeRetrieveResponse> =
        retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        disputeId: String,
        params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
    ): CompletableFuture<DisputeRetrieveResponse> =
        retrieve(disputeId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(params: DisputeRetrieveParams): CompletableFuture<DisputeRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        disputeId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputeRetrieveResponse> =
        retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

    fun list(): CompletableFuture<DisputeListPageAsync> = list(DisputeListParams.none())

    /** @see [list] */
    fun list(
        params: DisputeListParams = DisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeListPageAsync>

    /** @see [list] */
    fun list(
        params: DisputeListParams = DisputeListParams.none()
    ): CompletableFuture<DisputeListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DisputeListPageAsync> =
        list(DisputeListParams.none(), requestOptions)

    /**
     * A view of [DisputeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /disputes/{dispute_id}`, but is otherwise the same
         * as [DisputeServiceAsync.retrieve].
         */
        fun retrieve(
            disputeId: String
        ): CompletableFuture<HttpResponseFor<DisputeRetrieveResponse>> =
            retrieve(disputeId, DisputeRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            disputeId: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeRetrieveResponse>> =
            retrieve(params.toBuilder().disputeId(disputeId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            disputeId: String,
            params: DisputeRetrieveParams = DisputeRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DisputeRetrieveResponse>> =
            retrieve(disputeId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: DisputeRetrieveParams
        ): CompletableFuture<HttpResponseFor<DisputeRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            disputeId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputeRetrieveResponse>> =
            retrieve(disputeId, DisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /disputes`, but is otherwise the same as
         * [DisputeServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none())

        /** @see [list] */
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>>

        /** @see [list] */
        fun list(
            params: DisputeListParams = DisputeListParams.none()
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none(), requestOptions)
    }
}
