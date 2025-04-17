// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.disputes.Dispute
import com.dodo_payments.api.models.disputes.DisputeListPageAsync
import com.dodo_payments.api.models.disputes.DisputeListParams
import com.dodo_payments.api.models.disputes.DisputeRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface DisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(params: DisputeRetrieveParams): CompletableFuture<Dispute> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Dispute>

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
         * Returns a raw HTTP response for `get /disputes/{dispute_id}`, but is otherwise the same
         * as [DisputeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: DisputeRetrieveParams): CompletableFuture<HttpResponseFor<Dispute>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Dispute>>

        /**
         * Returns a raw HTTP response for `get /disputes`, but is otherwise the same as
         * [DisputeServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DisputeListParams = DisputeListParams.none()
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisputeListPageAsync>> =
            list(DisputeListParams.none(), requestOptions)
    }
}
