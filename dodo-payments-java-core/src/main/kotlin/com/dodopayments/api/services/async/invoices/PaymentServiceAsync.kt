// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.invoices

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.models.invoices.payments.PaymentRetrieveParams
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun retrieve(paymentId: String): CompletableFuture<HttpResponse> =
        retrieve(paymentId, PaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): CompletableFuture<HttpResponse> = retrieve(paymentId, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see [retrieve] */
    fun retrieve(params: PaymentRetrieveParams): CompletableFuture<HttpResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        paymentId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /invoices/payments/{payment_id}`, but is otherwise
         * the same as [PaymentServiceAsync.retrieve].
         */
        fun retrieve(paymentId: String): CompletableFuture<HttpResponse> =
            retrieve(paymentId, PaymentRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponse> = retrieve(paymentId, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [retrieve] */
        fun retrieve(params: PaymentRetrieveParams): CompletableFuture<HttpResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            paymentId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)
    }
}
