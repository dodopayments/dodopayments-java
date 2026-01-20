// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CheckoutSessionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CheckoutSessionServiceAsync

    fun create(params: CheckoutSessionCreateParams): CompletableFuture<CheckoutSessionResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CheckoutSessionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckoutSessionResponse>

    /** @see create */
    fun create(
        checkoutSessionRequest: CheckoutSessionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckoutSessionResponse> =
        create(
            CheckoutSessionCreateParams.builder()
                .checkoutSessionRequest(checkoutSessionRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        checkoutSessionRequest: CheckoutSessionRequest
    ): CompletableFuture<CheckoutSessionResponse> =
        create(checkoutSessionRequest, RequestOptions.none())

    fun retrieve(id: String): CompletableFuture<CheckoutSessionStatus> =
        retrieve(id, CheckoutSessionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckoutSessionStatus> =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
    ): CompletableFuture<CheckoutSessionStatus> = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CheckoutSessionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckoutSessionStatus>

    /** @see retrieve */
    fun retrieve(params: CheckoutSessionRetrieveParams): CompletableFuture<CheckoutSessionStatus> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CheckoutSessionStatus> =
        retrieve(id, CheckoutSessionRetrieveParams.none(), requestOptions)

    fun preview(
        params: CheckoutSessionPreviewParams
    ): CompletableFuture<CheckoutSessionPreviewResponse> = preview(params, RequestOptions.none())

    /** @see preview */
    fun preview(
        params: CheckoutSessionPreviewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckoutSessionPreviewResponse>

    /** @see preview */
    fun preview(
        checkoutSessionRequest: CheckoutSessionRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CheckoutSessionPreviewResponse> =
        preview(
            CheckoutSessionPreviewParams.builder()
                .checkoutSessionRequest(checkoutSessionRequest)
                .build(),
            requestOptions,
        )

    /** @see preview */
    fun preview(
        checkoutSessionRequest: CheckoutSessionRequest
    ): CompletableFuture<CheckoutSessionPreviewResponse> =
        preview(checkoutSessionRequest, RequestOptions.none())

    /**
     * A view of [CheckoutSessionServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckoutSessionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /checkouts`, but is otherwise the same as
         * [CheckoutSessionServiceAsync.create].
         */
        fun create(
            params: CheckoutSessionCreateParams
        ): CompletableFuture<HttpResponseFor<CheckoutSessionResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CheckoutSessionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionResponse>>

        /** @see create */
        fun create(
            checkoutSessionRequest: CheckoutSessionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionResponse>> =
            create(
                CheckoutSessionCreateParams.builder()
                    .checkoutSessionRequest(checkoutSessionRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            checkoutSessionRequest: CheckoutSessionRequest
        ): CompletableFuture<HttpResponseFor<CheckoutSessionResponse>> =
            create(checkoutSessionRequest, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /checkouts/{id}`, but is otherwise the same as
         * [CheckoutSessionServiceAsync.retrieve].
         */
        fun retrieve(id: String): CompletableFuture<HttpResponseFor<CheckoutSessionStatus>> =
            retrieve(id, CheckoutSessionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionStatus>> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            id: String,
            params: CheckoutSessionRetrieveParams = CheckoutSessionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionStatus>> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CheckoutSessionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionStatus>>

        /** @see retrieve */
        fun retrieve(
            params: CheckoutSessionRetrieveParams
        ): CompletableFuture<HttpResponseFor<CheckoutSessionStatus>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CheckoutSessionStatus>> =
            retrieve(id, CheckoutSessionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /checkouts/preview`, but is otherwise the same as
         * [CheckoutSessionServiceAsync.preview].
         */
        fun preview(
            params: CheckoutSessionPreviewParams
        ): CompletableFuture<HttpResponseFor<CheckoutSessionPreviewResponse>> =
            preview(params, RequestOptions.none())

        /** @see preview */
        fun preview(
            params: CheckoutSessionPreviewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionPreviewResponse>>

        /** @see preview */
        fun preview(
            checkoutSessionRequest: CheckoutSessionRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CheckoutSessionPreviewResponse>> =
            preview(
                CheckoutSessionPreviewParams.builder()
                    .checkoutSessionRequest(checkoutSessionRequest)
                    .build(),
                requestOptions,
            )

        /** @see preview */
        fun preview(
            checkoutSessionRequest: CheckoutSessionRequest
        ): CompletableFuture<HttpResponseFor<CheckoutSessionPreviewResponse>> =
            preview(checkoutSessionRequest, RequestOptions.none())
    }
}
