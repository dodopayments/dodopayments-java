// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentCreateResponse
import com.dodopayments.api.models.payments.PaymentListPage
import com.dodopayments.api.models.payments.PaymentListParams
import com.dodopayments.api.models.payments.PaymentRetrieveParams
import com.google.errorprone.annotations.MustBeClosed

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: PaymentCreateParams): PaymentCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    fun retrieve(paymentId: String): Payment = retrieve(paymentId, PaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment = retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): Payment = retrieve(paymentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** @see [retrieve] */
    fun retrieve(params: PaymentRetrieveParams): Payment = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(paymentId: String, requestOptions: RequestOptions): Payment =
        retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

    fun list(): PaymentListPage = list(PaymentListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPage

    /** @see [list] */
    fun list(params: PaymentListParams = PaymentListParams.none()): PaymentListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaymentListPage =
        list(PaymentListParams.none(), requestOptions)

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentService.create].
         */
        @MustBeClosed
        fun create(params: PaymentCreateParams): HttpResponseFor<PaymentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}`, but is otherwise the same
         * as [PaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(paymentId: String): HttpResponseFor<Payment> =
            retrieve(paymentId, PaymentRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment> =
            retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): HttpResponseFor<Payment> = retrieve(paymentId, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: PaymentRetrieveParams): HttpResponseFor<Payment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(paymentId: String, requestOptions: RequestOptions): HttpResponseFor<Payment> =
            retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments`, but is otherwise the same as
         * [PaymentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PaymentListPage> = list(PaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): HttpResponseFor<PaymentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPage> =
            list(PaymentListParams.none(), requestOptions)
    }
}
