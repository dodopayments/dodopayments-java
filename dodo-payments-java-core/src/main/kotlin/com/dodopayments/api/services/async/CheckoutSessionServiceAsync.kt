// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionCreateParams
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionResponse
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
    }
}
