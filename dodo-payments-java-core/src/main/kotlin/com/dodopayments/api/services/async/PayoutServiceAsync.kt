// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.PayoutListPageAsync
import com.dodopayments.api.models.payouts.PayoutListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PayoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PayoutServiceAsync

    fun list(): CompletableFuture<PayoutListPageAsync> = list(PayoutListParams.none())

    /** @see list */
    fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PayoutListPageAsync>

    /** @see list */
    fun list(
        params: PayoutListParams = PayoutListParams.none()
    ): CompletableFuture<PayoutListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PayoutListPageAsync> =
        list(PayoutListParams.none(), requestOptions)

    /**
     * A view of [PayoutServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PayoutServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts`, but is otherwise the same as
         * [PayoutServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> =
            list(PayoutListParams.none())

        /** @see list */
        fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>>

        /** @see list */
        fun list(
            params: PayoutListParams = PayoutListParams.none()
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> =
            list(PayoutListParams.none(), requestOptions)
    }
}
