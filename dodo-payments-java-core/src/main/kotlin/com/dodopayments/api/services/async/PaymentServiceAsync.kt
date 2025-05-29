// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentCreateResponse
import com.dodopayments.api.models.payments.PaymentListPageAsync
import com.dodopayments.api.models.payments.PaymentListParams
import com.dodopayments.api.models.payments.PaymentRetrieveLineItemsParams
import com.dodopayments.api.models.payments.PaymentRetrieveLineItemsResponse
import com.dodopayments.api.models.payments.PaymentRetrieveParams
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

    fun retrieve(paymentId: String): CompletableFuture<Payment> =
        retrieve(paymentId, PaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment> =
        retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): CompletableFuture<Payment> = retrieve(paymentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment>

    /** @see [retrieve] */
    fun retrieve(params: PaymentRetrieveParams): CompletableFuture<Payment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(paymentId: String, requestOptions: RequestOptions): CompletableFuture<Payment> =
        retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

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

    fun retrieveLineItems(paymentId: String): CompletableFuture<PaymentRetrieveLineItemsResponse> =
        retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none())

    /** @see [retrieveLineItems] */
    fun retrieveLineItems(
        paymentId: String,
        params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetrieveLineItemsResponse> =
        retrieveLineItems(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see [retrieveLineItems] */
    fun retrieveLineItems(
        paymentId: String,
        params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
    ): CompletableFuture<PaymentRetrieveLineItemsResponse> =
        retrieveLineItems(paymentId, params, RequestOptions.none())

    /** @see [retrieveLineItems] */
    fun retrieveLineItems(
        params: PaymentRetrieveLineItemsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetrieveLineItemsResponse>

    /** @see [retrieveLineItems] */
    fun retrieveLineItems(
        params: PaymentRetrieveLineItemsParams
    ): CompletableFuture<PaymentRetrieveLineItemsResponse> =
        retrieveLineItems(params, RequestOptions.none())

    /** @see [retrieveLineItems] */
    fun retrieveLineItems(
        paymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentRetrieveLineItemsResponse> =
        retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        fun create(
            params: PaymentCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}`, but is otherwise the same
         * as [PaymentServiceAsync.retrieve].
         */
        fun retrieve(paymentId: String): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(paymentId, PaymentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(paymentId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>>

        /** @see [retrieve] */
        fun retrieve(params: PaymentRetrieveParams): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            paymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none())

        /** @see [list] */
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>>

        /** @see [list] */
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}/line-items`, but is otherwise
         * the same as [PaymentServiceAsync.retrieveLineItems].
         */
        fun retrieveLineItems(
            paymentId: String
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveLineItemsResponse>> =
            retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none())

        /** @see [retrieveLineItems] */
        fun retrieveLineItems(
            paymentId: String,
            params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveLineItemsResponse>> =
            retrieveLineItems(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see [retrieveLineItems] */
        fun retrieveLineItems(
            paymentId: String,
            params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveLineItemsResponse>> =
            retrieveLineItems(paymentId, params, RequestOptions.none())

        /** @see [retrieveLineItems] */
        fun retrieveLineItems(
            params: PaymentRetrieveLineItemsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveLineItemsResponse>>

        /** @see [retrieveLineItems] */
        fun retrieveLineItems(
            params: PaymentRetrieveLineItemsParams
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveLineItemsResponse>> =
            retrieveLineItems(params, RequestOptions.none())

        /** @see [retrieveLineItems] */
        fun retrieveLineItems(
            paymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentRetrieveLineItemsResponse>> =
            retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none(), requestOptions)
    }
}
