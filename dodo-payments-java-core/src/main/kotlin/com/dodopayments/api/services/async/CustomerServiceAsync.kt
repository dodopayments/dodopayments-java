// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.Customer
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerListPageAsync
import com.dodopayments.api.models.customers.CustomerListParams
import com.dodopayments.api.models.customers.CustomerRetrieveParams
import com.dodopayments.api.models.customers.CustomerUpdateParams
import com.dodopayments.api.services.async.customers.CustomerPortalServiceAsync
import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun customerPortal(): CustomerPortalServiceAsync

    fun create(params: CustomerCreateParams): CompletableFuture<Customer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    fun retrieve(params: CustomerRetrieveParams): CompletableFuture<Customer> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    fun update(params: CustomerUpdateParams): CompletableFuture<Customer> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    fun list(): CompletableFuture<CustomerListPageAsync> = list(CustomerListParams.none())

    /** @see [list] */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListPageAsync>

    /** @see [list] */
    fun list(
        params: CustomerListParams = CustomerListParams.none()
    ): CompletableFuture<CustomerListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomerListPageAsync> =
        list(CustomerListParams.none(), requestOptions)

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun customerPortal(): CustomerPortalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        @MustBeClosed
        fun create(params: CustomerCreateParams): CompletableFuture<HttpResponseFor<Customer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CustomerRetrieveParams): CompletableFuture<HttpResponseFor<Customer>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /**
         * Returns a raw HTTP response for `patch /customers/{customer_id}`, but is otherwise the
         * same as [CustomerServiceAsync.update].
         */
        @MustBeClosed
        fun update(params: CustomerUpdateParams): CompletableFuture<HttpResponseFor<Customer>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none(), requestOptions)
    }
}
