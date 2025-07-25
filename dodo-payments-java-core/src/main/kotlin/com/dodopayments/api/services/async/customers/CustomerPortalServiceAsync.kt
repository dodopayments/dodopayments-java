// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.CustomerPortalSession
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomerPortalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerPortalServiceAsync

    fun create(customerId: String): CompletableFuture<CustomerPortalSession> =
        create(customerId, CustomerPortalCreateParams.none())

    /** @see create */
    fun create(
        customerId: String,
        params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPortalSession> =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(
        customerId: String,
        params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
    ): CompletableFuture<CustomerPortalSession> = create(customerId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPortalSession>

    /** @see create */
    fun create(params: CustomerPortalCreateParams): CompletableFuture<CustomerPortalSession> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerPortalSession> =
        create(customerId, CustomerPortalCreateParams.none(), requestOptions)

    /**
     * A view of [CustomerPortalServiceAsync] that provides access to raw HTTP responses for each
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
        ): CustomerPortalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/customer-portal/session`,
         * but is otherwise the same as [CustomerPortalServiceAsync.create].
         */
        fun create(customerId: String): CompletableFuture<HttpResponseFor<CustomerPortalSession>> =
            create(customerId, CustomerPortalCreateParams.none())

        /** @see create */
        fun create(
            customerId: String,
            params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        fun create(
            customerId: String,
            params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>> =
            create(customerId, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>>

        /** @see create */
        fun create(
            params: CustomerPortalCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>> =
            create(customerId, CustomerPortalCreateParams.none(), requestOptions)
    }
}
