// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentCreateResponse
import com.dodopayments.api.models.payments.PaymentListPageAsync
import com.dodopayments.api.models.payments.PaymentListParams
import com.dodopayments.api.models.payments.PaymentRetrieveParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: PaymentCreateParams): CompletableFuture<PaymentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCreateResponse>

    fun retrieve(params: PaymentRetrieveParams): CompletableFuture<Payment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment>

    fun list(): CompletableFuture<PaymentListPageAsync> = list(PaymentListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentListParams = PaymentListParams.none()
    ): CompletableFuture<PaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentListPageAsync> =
        list(PaymentListParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}`, but is otherwise the same
         * as [PaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PaymentRetrieveParams): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>>

        /**
         * Returns a raw HTTP response for `get /payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none(), requestOptions)
    }
}
