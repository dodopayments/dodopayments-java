// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundCreateParams
import com.dodopayments.api.models.refunds.RefundListPageAsync
import com.dodopayments.api.models.refunds.RefundListParams
import com.dodopayments.api.models.refunds.RefundRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface RefundServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: RefundCreateParams): CompletableFuture<Refund> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: RefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Refund>

    fun retrieve(refundId: String): CompletableFuture<Refund> =
        retrieve(refundId, RefundRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        refundId: String,
        params: RefundRetrieveParams = RefundRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Refund> =
        retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        refundId: String,
        params: RefundRetrieveParams = RefundRetrieveParams.none(),
    ): CompletableFuture<Refund> = retrieve(refundId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: RefundRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Refund>

    /** @see [retrieve] */
    fun retrieve(params: RefundRetrieveParams): CompletableFuture<Refund> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(refundId: String, requestOptions: RequestOptions): CompletableFuture<Refund> =
        retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

    fun list(): CompletableFuture<RefundListPageAsync> = list(RefundListParams.none())

    /** @see [list] */
    fun list(
        params: RefundListParams = RefundListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RefundListPageAsync>

    /** @see [list] */
    fun list(
        params: RefundListParams = RefundListParams.none()
    ): CompletableFuture<RefundListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<RefundListPageAsync> =
        list(RefundListParams.none(), requestOptions)

    /**
     * A view of [RefundServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /refunds`, but is otherwise the same as
         * [RefundServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: RefundCreateParams): CompletableFuture<HttpResponseFor<Refund>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: RefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Refund>>

        /**
         * Returns a raw HTTP response for `get /refunds/{refund_id}`, but is otherwise the same as
         * [RefundServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(refundId: String): CompletableFuture<HttpResponseFor<Refund>> =
            retrieve(refundId, RefundRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            refundId: String,
            params: RefundRetrieveParams = RefundRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Refund>> =
            retrieve(params.toBuilder().refundId(refundId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            refundId: String,
            params: RefundRetrieveParams = RefundRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Refund>> =
            retrieve(refundId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: RefundRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Refund>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: RefundRetrieveParams): CompletableFuture<HttpResponseFor<Refund>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            refundId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Refund>> =
            retrieve(refundId, RefundRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /refunds`, but is otherwise the same as
         * [RefundServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<RefundListPageAsync>> =
            list(RefundListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RefundListParams = RefundListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RefundListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: RefundListParams = RefundListParams.none()
        ): CompletableFuture<HttpResponseFor<RefundListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RefundListPageAsync>> =
            list(RefundListParams.none(), requestOptions)
    }
}
