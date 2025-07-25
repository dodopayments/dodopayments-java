// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.CustomerPortalSession
import com.dodopayments.api.models.customers.customerportal.CustomerPortalCreateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CustomerPortalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerPortalService

    fun create(customerId: String): CustomerPortalSession =
        create(customerId, CustomerPortalCreateParams.none())

    /** @see create */
    fun create(
        customerId: String,
        params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPortalSession =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(
        customerId: String,
        params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
    ): CustomerPortalSession = create(customerId, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerPortalSession

    /** @see create */
    fun create(params: CustomerPortalCreateParams): CustomerPortalSession =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(customerId: String, requestOptions: RequestOptions): CustomerPortalSession =
        create(customerId, CustomerPortalCreateParams.none(), requestOptions)

    /**
     * A view of [CustomerPortalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerPortalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/customer-portal/session`,
         * but is otherwise the same as [CustomerPortalService.create].
         */
        @MustBeClosed
        fun create(customerId: String): HttpResponseFor<CustomerPortalSession> =
            create(customerId, CustomerPortalCreateParams.none())

        /** @see create */
        @MustBeClosed
        fun create(
            customerId: String,
            params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPortalSession> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(
            customerId: String,
            params: CustomerPortalCreateParams = CustomerPortalCreateParams.none(),
        ): HttpResponseFor<CustomerPortalSession> =
            create(customerId, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerPortalSession>

        /** @see create */
        @MustBeClosed
        fun create(params: CustomerPortalCreateParams): HttpResponseFor<CustomerPortalSession> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomerPortalSession> =
            create(customerId, CustomerPortalCreateParams.none(), requestOptions)
    }
}
