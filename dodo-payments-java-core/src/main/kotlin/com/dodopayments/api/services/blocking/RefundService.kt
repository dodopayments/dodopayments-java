// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundCreateParams
import com.dodopayments.api.models.refunds.RefundListPage
import com.dodopayments.api.models.refunds.RefundListParams
import com.dodopayments.api.models.refunds.RefundRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface RefundService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: RefundCreateParams): Refund = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    fun retrieve(refundId: String): Refund = retrieve(refundId, RefundRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        refundId: String,
        params: RefundRetrieveParams = RefundRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund = retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        refundId: String,
        params: RefundRetrieveParams = RefundRetrieveParams.none(),
    ): Refund = retrieve(refundId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Refund

    /** @see [retrieve] */
    fun retrieve(params: RefundRetrieveParams): Refund = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(refundId: String, requestOptions: RequestOptions): Refund =
        retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

    fun list(): RefundListPage = list(RefundListParams.none())

    /** @see [list] */
    fun list(
        params: RefundListParams = RefundListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RefundListPage

    /** @see [list] */
    fun list(params: RefundListParams = RefundListParams.none()): RefundListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): RefundListPage =
        list(RefundListParams.none(), requestOptions)

    /** A view of [RefundService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /refunds`, but is otherwise the same as
         * [RefundService.create].
         */
        @MustBeClosed
        fun create(params: RefundCreateParams): HttpResponseFor<Refund> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /**
         * Returns a raw HTTP response for `get /refunds/{refund_id}`, but is otherwise the same as
         * [RefundService.retrieve].
         */
        @MustBeClosed
        fun retrieve(refundId: String): HttpResponseFor<Refund> =
            retrieve(refundId, RefundRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            refundId: String,
            params: RefundRetrieveParams = RefundRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund> =
            retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            refundId: String,
            params: RefundRetrieveParams = RefundRetrieveParams.none(),
        ): HttpResponseFor<Refund> = retrieve(refundId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RefundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Refund>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: RefundRetrieveParams): HttpResponseFor<Refund> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(refundId: String, requestOptions: RequestOptions): HttpResponseFor<Refund> =
            retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /refunds`, but is otherwise the same as
         * [RefundService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<RefundListPage> = list(RefundListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RefundListParams = RefundListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RefundListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RefundListParams = RefundListParams.none()
        ): HttpResponseFor<RefundListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<RefundListPage> =
            list(RefundListParams.none(), requestOptions)
    }
}
