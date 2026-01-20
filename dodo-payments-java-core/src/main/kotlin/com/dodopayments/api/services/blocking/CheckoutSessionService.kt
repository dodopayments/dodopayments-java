// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionCreateParams
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionPreviewParams
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionPreviewResponse
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionResponse
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRetrieveParams
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionStatus
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CheckoutSessionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckoutSessionService

    fun create(params: CheckoutSessionCreateParams): CheckoutSessionResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CheckoutSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionResponse

    /** @see create */
    fun create(
        checkoutSessionRequest: CheckoutSessionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionResponse =
        create(
            CheckoutSessionCreateParams.builder()
                .checkoutSessionRequest(checkoutSessionRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(checkoutSessionRequest: CheckoutSessionRequest): CheckoutSessionResponse =
        create(checkoutSessionRequest, RequestOptions.none())

    fun retrieve(id: String): CheckoutSessionStatus =
        retrieve(id, CheckoutSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionStatus = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
    ): CheckoutSessionStatus = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckoutSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionStatus

    /** @see retrieve */
    fun retrieve(params: CheckoutSessionRetrieveParams): CheckoutSessionStatus =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): CheckoutSessionStatus =
        retrieve(id, CheckoutSessionRetrieveParams.none(), requestOptions)

    fun preview(params: CheckoutSessionPreviewParams): CheckoutSessionPreviewResponse =
        preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: CheckoutSessionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionPreviewResponse

    /** @see preview */
    fun preview(
        checkoutSessionRequest: CheckoutSessionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckoutSessionPreviewResponse =
        preview(
            CheckoutSessionPreviewParams.builder()
                .checkoutSessionRequest(checkoutSessionRequest)
                .build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(checkoutSessionRequest: CheckoutSessionRequest): CheckoutSessionPreviewResponse =
        preview(checkoutSessionRequest, RequestOptions.none())

    /**
     * A view of [CheckoutSessionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CheckoutSessionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /checkouts`, but is otherwise the same as
         * [CheckoutSessionService.create].
         */
        @MustBeClosed
        fun create(params: CheckoutSessionCreateParams): HttpResponseFor<CheckoutSessionResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CheckoutSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            checkoutSessionRequest: CheckoutSessionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionResponse> =
            create(
                CheckoutSessionCreateParams.builder()
                    .checkoutSessionRequest(checkoutSessionRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            checkoutSessionRequest: CheckoutSessionRequest
        ): HttpResponseFor<CheckoutSessionResponse> =
            create(checkoutSessionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /checkouts/{id}`, but is otherwise the same as
         * [CheckoutSessionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<CheckoutSessionStatus> =
            retrieve(id, CheckoutSessionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionStatus> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
        ): HttpResponseFor<CheckoutSessionStatus> = retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CheckoutSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionStatus>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CheckoutSessionRetrieveParams
        ): HttpResponseFor<CheckoutSessionStatus> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckoutSessionStatus> =
            retrieve(id, CheckoutSessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkouts/preview`, but is otherwise the same as
         * [CheckoutSessionService.preview].
         */
        @MustBeClosed
        fun preview(
            params: CheckoutSessionPreviewParams
        ): HttpResponseFor<CheckoutSessionPreviewResponse> = preview(params, RequestOptions.none())

        /** @see preview */
        @MustBeClosed
        fun preview(
            params: CheckoutSessionPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionPreviewResponse>

        /** @see preview */
        @MustBeClosed
        fun preview(
            checkoutSessionRequest: CheckoutSessionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckoutSessionPreviewResponse> =
            preview(
                CheckoutSessionPreviewParams.builder()
                    .checkoutSessionRequest(checkoutSessionRequest)
                    .build(),
                requestOptions,
            )

        /** @see preview */
        @MustBeClosed
        fun preview(
            checkoutSessionRequest: CheckoutSessionRequest
        ): HttpResponseFor<CheckoutSessionPreviewResponse> =
            preview(checkoutSessionRequest, RequestOptions.none())
    }
}
