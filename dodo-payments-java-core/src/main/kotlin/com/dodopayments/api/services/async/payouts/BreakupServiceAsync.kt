// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveParams
import com.dodopayments.api.models.payouts.breakup.BreakupRetrieveResponse
import com.dodopayments.api.services.async.payouts.breakup.DetailServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BreakupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BreakupServiceAsync

    fun details(): DetailServiceAsync

    /**
     * Returns the breakdown of a payout by event type (payments, refunds, disputes, fees, etc.) in
     * the payout's currency. Each amount is proportionally allocated based on USD equivalent
     * values, ensuring the total sums exactly to the payout amount.
     */
    fun retrieve(payoutId: String): CompletableFuture<List<BreakupRetrieveResponse>> =
        retrieve(payoutId, BreakupRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        payoutId: String,
        params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BreakupRetrieveResponse>> =
        retrieve(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        payoutId: String,
        params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
    ): CompletableFuture<List<BreakupRetrieveResponse>> =
        retrieve(payoutId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BreakupRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<List<BreakupRetrieveResponse>>

    /** @see retrieve */
    fun retrieve(params: BreakupRetrieveParams): CompletableFuture<List<BreakupRetrieveResponse>> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        payoutId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<BreakupRetrieveResponse>> =
        retrieve(payoutId, BreakupRetrieveParams.none(), requestOptions)

    /**
     * A view of [BreakupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BreakupServiceAsync.WithRawResponse

        fun details(): DetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup`, but is otherwise the
         * same as [BreakupServiceAsync.retrieve].
         */
        fun retrieve(
            payoutId: String
        ): CompletableFuture<HttpResponseFor<List<BreakupRetrieveResponse>>> =
            retrieve(payoutId, BreakupRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            payoutId: String,
            params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BreakupRetrieveResponse>>> =
            retrieve(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            payoutId: String,
            params: BreakupRetrieveParams = BreakupRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<List<BreakupRetrieveResponse>>> =
            retrieve(payoutId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BreakupRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<List<BreakupRetrieveResponse>>>

        /** @see retrieve */
        fun retrieve(
            params: BreakupRetrieveParams
        ): CompletableFuture<HttpResponseFor<List<BreakupRetrieveResponse>>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            payoutId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<BreakupRetrieveResponse>>> =
            retrieve(payoutId, BreakupRetrieveParams.none(), requestOptions)
    }
}
