// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payments.ManualRetry
import com.dodopayments.api.models.payments.ManualRetryState
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentCreateResponse
import com.dodopayments.api.models.payments.PaymentListPage
import com.dodopayments.api.models.payments.PaymentListParams
import com.dodopayments.api.models.payments.PaymentRetrieveLineItemsParams
import com.dodopayments.api.models.payments.PaymentRetrieveLineItemsResponse
import com.dodopayments.api.models.payments.PaymentRetrieveParams
import com.dodopayments.api.models.payments.PaymentRetrieveRetryStateParams
import com.dodopayments.api.models.payments.PaymentRetryParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService

    @Deprecated("deprecated")
    fun create(params: PaymentCreateParams): PaymentCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    @Deprecated("deprecated")
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    fun retrieve(paymentId: String): Payment = retrieve(paymentId, PaymentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment = retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        paymentId: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): Payment = retrieve(paymentId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** @see retrieve */
    fun retrieve(params: PaymentRetrieveParams): Payment = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(paymentId: String, requestOptions: RequestOptions): Payment =
        retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

    fun list(): PaymentListPage = list(PaymentListParams.none())

    /** @see list */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPage

    /** @see list */
    fun list(params: PaymentListParams = PaymentListParams.none()): PaymentListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PaymentListPage =
        list(PaymentListParams.none(), requestOptions)

    fun retrieveLineItems(paymentId: String): PaymentRetrieveLineItemsResponse =
        retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none())

    /** @see retrieveLineItems */
    fun retrieveLineItems(
        paymentId: String,
        params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetrieveLineItemsResponse =
        retrieveLineItems(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retrieveLineItems */
    fun retrieveLineItems(
        paymentId: String,
        params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
    ): PaymentRetrieveLineItemsResponse =
        retrieveLineItems(paymentId, params, RequestOptions.none())

    /** @see retrieveLineItems */
    fun retrieveLineItems(
        params: PaymentRetrieveLineItemsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetrieveLineItemsResponse

    /** @see retrieveLineItems */
    fun retrieveLineItems(
        params: PaymentRetrieveLineItemsParams
    ): PaymentRetrieveLineItemsResponse = retrieveLineItems(params, RequestOptions.none())

    /** @see retrieveLineItems */
    fun retrieveLineItems(
        paymentId: String,
        requestOptions: RequestOptions,
    ): PaymentRetrieveLineItemsResponse =
        retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none(), requestOptions)

    fun retrieveRetryState(paymentId: String): ManualRetryState =
        retrieveRetryState(paymentId, PaymentRetrieveRetryStateParams.none())

    /** @see retrieveRetryState */
    fun retrieveRetryState(
        paymentId: String,
        params: PaymentRetrieveRetryStateParams = PaymentRetrieveRetryStateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetryState =
        retrieveRetryState(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retrieveRetryState */
    fun retrieveRetryState(
        paymentId: String,
        params: PaymentRetrieveRetryStateParams = PaymentRetrieveRetryStateParams.none(),
    ): ManualRetryState = retrieveRetryState(paymentId, params, RequestOptions.none())

    /** @see retrieveRetryState */
    fun retrieveRetryState(
        params: PaymentRetrieveRetryStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetryState

    /** @see retrieveRetryState */
    fun retrieveRetryState(params: PaymentRetrieveRetryStateParams): ManualRetryState =
        retrieveRetryState(params, RequestOptions.none())

    /** @see retrieveRetryState */
    fun retrieveRetryState(paymentId: String, requestOptions: RequestOptions): ManualRetryState =
        retrieveRetryState(paymentId, PaymentRetrieveRetryStateParams.none(), requestOptions)

    fun retry(paymentId: String): ManualRetry = retry(paymentId, PaymentRetryParams.none())

    /** @see retry */
    fun retry(
        paymentId: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetry = retry(params.toBuilder().paymentId(paymentId).build(), requestOptions)

    /** @see retry */
    fun retry(
        paymentId: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
    ): ManualRetry = retry(paymentId, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManualRetry

    /** @see retry */
    fun retry(params: PaymentRetryParams): ManualRetry = retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(paymentId: String, requestOptions: RequestOptions): ManualRetry =
        retry(paymentId, PaymentRetryParams.none(), requestOptions)

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /payments`, but is otherwise the same as
         * [PaymentService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: PaymentCreateParams): HttpResponseFor<PaymentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @Deprecated("deprecated")
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

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment> =
            retrieve(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            paymentId: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): HttpResponseFor<Payment> = retrieve(paymentId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: PaymentRetrieveParams): HttpResponseFor<Payment> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(paymentId: String, requestOptions: RequestOptions): HttpResponseFor<Payment> =
            retrieve(paymentId, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments`, but is otherwise the same as
         * [PaymentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PaymentListPage> = list(PaymentListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): HttpResponseFor<PaymentListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPage> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}/line-items`, but is otherwise
         * the same as [PaymentService.retrieveLineItems].
         */
        @MustBeClosed
        fun retrieveLineItems(
            paymentId: String
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none())

        /** @see retrieveLineItems */
        @MustBeClosed
        fun retrieveLineItems(
            paymentId: String,
            params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retrieveLineItems */
        @MustBeClosed
        fun retrieveLineItems(
            paymentId: String,
            params: PaymentRetrieveLineItemsParams = PaymentRetrieveLineItemsParams.none(),
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(paymentId, params, RequestOptions.none())

        /** @see retrieveLineItems */
        @MustBeClosed
        fun retrieveLineItems(
            params: PaymentRetrieveLineItemsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse>

        /** @see retrieveLineItems */
        @MustBeClosed
        fun retrieveLineItems(
            params: PaymentRetrieveLineItemsParams
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(params, RequestOptions.none())

        /** @see retrieveLineItems */
        @MustBeClosed
        fun retrieveLineItems(
            paymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentRetrieveLineItemsResponse> =
            retrieveLineItems(paymentId, PaymentRetrieveLineItemsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payments/{payment_id}/retry`, but is otherwise the
         * same as [PaymentService.retrieveRetryState].
         */
        @MustBeClosed
        fun retrieveRetryState(paymentId: String): HttpResponseFor<ManualRetryState> =
            retrieveRetryState(paymentId, PaymentRetrieveRetryStateParams.none())

        /** @see retrieveRetryState */
        @MustBeClosed
        fun retrieveRetryState(
            paymentId: String,
            params: PaymentRetrieveRetryStateParams = PaymentRetrieveRetryStateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetryState> =
            retrieveRetryState(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retrieveRetryState */
        @MustBeClosed
        fun retrieveRetryState(
            paymentId: String,
            params: PaymentRetrieveRetryStateParams = PaymentRetrieveRetryStateParams.none(),
        ): HttpResponseFor<ManualRetryState> =
            retrieveRetryState(paymentId, params, RequestOptions.none())

        /** @see retrieveRetryState */
        @MustBeClosed
        fun retrieveRetryState(
            params: PaymentRetrieveRetryStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetryState>

        /** @see retrieveRetryState */
        @MustBeClosed
        fun retrieveRetryState(
            params: PaymentRetrieveRetryStateParams
        ): HttpResponseFor<ManualRetryState> = retrieveRetryState(params, RequestOptions.none())

        /** @see retrieveRetryState */
        @MustBeClosed
        fun retrieveRetryState(
            paymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManualRetryState> =
            retrieveRetryState(paymentId, PaymentRetrieveRetryStateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /payments/{payment_id}/retry`, but is otherwise the
         * same as [PaymentService.retry].
         */
        @MustBeClosed
        fun retry(paymentId: String): HttpResponseFor<ManualRetry> =
            retry(paymentId, PaymentRetryParams.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            paymentId: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetry> =
            retry(params.toBuilder().paymentId(paymentId).build(), requestOptions)

        /** @see retry */
        @MustBeClosed
        fun retry(
            paymentId: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
        ): HttpResponseFor<ManualRetry> = retry(paymentId, params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManualRetry>

        /** @see retry */
        @MustBeClosed
        fun retry(params: PaymentRetryParams): HttpResponseFor<ManualRetry> =
            retry(params, RequestOptions.none())

        /** @see retry */
        @MustBeClosed
        fun retry(paymentId: String, requestOptions: RequestOptions): HttpResponseFor<ManualRetry> =
            retry(paymentId, PaymentRetryParams.none(), requestOptions)
    }
}
