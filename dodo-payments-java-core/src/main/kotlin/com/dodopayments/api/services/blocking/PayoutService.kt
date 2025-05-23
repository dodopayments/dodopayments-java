// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.PayoutListPage
import com.dodopayments.api.models.payouts.PayoutListParams
import com.google.errorprone.annotations.MustBeClosed

interface PayoutService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun list(): PayoutListPage = list(PayoutListParams.none())

    /** @see [list] */
    fun list(
        params: PayoutListParams = PayoutListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PayoutListPage

    /** @see [list] */
    fun list(params: PayoutListParams = PayoutListParams.none()): PayoutListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PayoutListPage =
        list(PayoutListParams.none(), requestOptions)

    /** A view of [PayoutService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /payouts`, but is otherwise the same as
         * [PayoutService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PayoutListPage> = list(PayoutListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PayoutListParams = PayoutListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PayoutListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PayoutListParams = PayoutListParams.none()
        ): HttpResponseFor<PayoutListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PayoutListPage> =
            list(PayoutListParams.none(), requestOptions)
    }
}
