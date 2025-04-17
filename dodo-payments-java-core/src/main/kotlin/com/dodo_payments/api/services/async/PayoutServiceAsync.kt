// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.payouts.PayoutListPageAsync
import com.dodo_payments.api.models.payouts.PayoutListParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface PayoutServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun list(): CompletableFuture<PayoutListPageAsync> = list(PayoutListParams.none())

    /** @see [list] */
    fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PayoutListPageAsync>

    /** @see [list] */
    fun list(
        params: PayoutListParams = PayoutListParams.none()
    ): CompletableFuture<PayoutListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PayoutListPageAsync> =
        list(PayoutListParams.none(), requestOptions)

    /**
     * A view of [PayoutServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /payouts`, but is otherwise the same as
         * [PayoutServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> =
            list(PayoutListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PayoutListParams = PayoutListParams.none()
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PayoutListPageAsync>> =
            list(PayoutListParams.none(), requestOptions)
    }
}
