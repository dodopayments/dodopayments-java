// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.services.async.customers

import com.dodo_payments.api.core.RequestOptions
import com.dodo_payments.api.core.http.HttpResponseFor
import com.dodo_payments.api.models.customers.CustomerPortalSession
import com.dodo_payments.api.models.customers.customerportal.CustomerPortalCreateParams
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface CustomerPortalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun create(params: CustomerPortalCreateParams): CompletableFuture<CustomerPortalSession> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CustomerPortalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerPortalSession>

    /**
     * A view of [CustomerPortalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/customer-portal/session`,
         * but is otherwise the same as [CustomerPortalServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CustomerPortalCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CustomerPortalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerPortalSession>>
    }
}
