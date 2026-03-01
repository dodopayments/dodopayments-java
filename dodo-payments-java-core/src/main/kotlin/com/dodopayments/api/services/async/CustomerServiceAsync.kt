// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.Customer
import com.dodopayments.api.models.customers.CustomerCreateParams
import com.dodopayments.api.models.customers.CustomerListCreditEntitlementsParams
import com.dodopayments.api.models.customers.CustomerListCreditEntitlementsResponse
import com.dodopayments.api.models.customers.CustomerListPageAsync
import com.dodopayments.api.models.customers.CustomerListParams
import com.dodopayments.api.models.customers.CustomerRetrieveParams
import com.dodopayments.api.models.customers.CustomerRetrievePaymentMethodsParams
import com.dodopayments.api.models.customers.CustomerRetrievePaymentMethodsResponse
import com.dodopayments.api.models.customers.CustomerUpdateParams
import com.dodopayments.api.services.async.customers.CustomerPortalServiceAsync
import com.dodopayments.api.services.async.customers.WalletServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomerServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerServiceAsync

    fun customerPortal(): CustomerPortalServiceAsync

    fun wallets(): WalletServiceAsync

    fun create(params: CustomerCreateParams): CompletableFuture<Customer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    fun retrieve(customerId: String): CompletableFuture<Customer> =
        retrieve(customerId, CustomerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        customerId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer> =
        retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        customerId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
    ): CompletableFuture<Customer> = retrieve(customerId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /** @see retrieve */
    fun retrieve(params: CustomerRetrieveParams): CompletableFuture<Customer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(customerId: String, requestOptions: RequestOptions): CompletableFuture<Customer> =
        retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

    fun update(customerId: String): CompletableFuture<Customer> =
        update(customerId, CustomerUpdateParams.none())

    /** @see update */
    fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer> =
        update(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see update */
    fun update(
        customerId: String,
        params: CustomerUpdateParams = CustomerUpdateParams.none(),
    ): CompletableFuture<Customer> = update(customerId, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CustomerUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Customer>

    /** @see update */
    fun update(params: CustomerUpdateParams): CompletableFuture<Customer> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(customerId: String, requestOptions: RequestOptions): CompletableFuture<Customer> =
        update(customerId, CustomerUpdateParams.none(), requestOptions)

    fun list(): CompletableFuture<CustomerListPageAsync> = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListPageAsync>

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none()
    ): CompletableFuture<CustomerListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CustomerListPageAsync> =
        list(CustomerListParams.none(), requestOptions)

    /** List all credit entitlements for a customer with their current balances */
    fun listCreditEntitlements(
        customerId: String
    ): CompletableFuture<CustomerListCreditEntitlementsResponse> =
        listCreditEntitlements(customerId, CustomerListCreditEntitlementsParams.none())

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        customerId: String,
        params: CustomerListCreditEntitlementsParams = CustomerListCreditEntitlementsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListCreditEntitlementsResponse> =
        listCreditEntitlements(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        customerId: String,
        params: CustomerListCreditEntitlementsParams = CustomerListCreditEntitlementsParams.none(),
    ): CompletableFuture<CustomerListCreditEntitlementsResponse> =
        listCreditEntitlements(customerId, params, RequestOptions.none())

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        params: CustomerListCreditEntitlementsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerListCreditEntitlementsResponse>

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        params: CustomerListCreditEntitlementsParams
    ): CompletableFuture<CustomerListCreditEntitlementsResponse> =
        listCreditEntitlements(params, RequestOptions.none())

    /** @see listCreditEntitlements */
    fun listCreditEntitlements(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerListCreditEntitlementsResponse> =
        listCreditEntitlements(
            customerId,
            CustomerListCreditEntitlementsParams.none(),
            requestOptions,
        )

    fun retrievePaymentMethods(
        customerId: String
    ): CompletableFuture<CustomerRetrievePaymentMethodsResponse> =
        retrievePaymentMethods(customerId, CustomerRetrievePaymentMethodsParams.none())

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        customerId: String,
        params: CustomerRetrievePaymentMethodsParams = CustomerRetrievePaymentMethodsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrievePaymentMethodsResponse> =
        retrievePaymentMethods(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        customerId: String,
        params: CustomerRetrievePaymentMethodsParams = CustomerRetrievePaymentMethodsParams.none(),
    ): CompletableFuture<CustomerRetrievePaymentMethodsResponse> =
        retrievePaymentMethods(customerId, params, RequestOptions.none())

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        params: CustomerRetrievePaymentMethodsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerRetrievePaymentMethodsResponse>

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        params: CustomerRetrievePaymentMethodsParams
    ): CompletableFuture<CustomerRetrievePaymentMethodsResponse> =
        retrievePaymentMethods(params, RequestOptions.none())

    /** @see retrievePaymentMethods */
    fun retrievePaymentMethods(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerRetrievePaymentMethodsResponse> =
        retrievePaymentMethods(
            customerId,
            CustomerRetrievePaymentMethodsParams.none(),
            requestOptions,
        )

    /**
     * A view of [CustomerServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomerServiceAsync.WithRawResponse

        fun customerPortal(): CustomerPortalServiceAsync.WithRawResponse

        fun wallets(): WalletServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        fun create(params: CustomerCreateParams): CompletableFuture<HttpResponseFor<Customer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}`, but is otherwise the same
         * as [CustomerServiceAsync.retrieve].
         */
        fun retrieve(customerId: String): CompletableFuture<HttpResponseFor<Customer>> =
            retrieve(customerId, CustomerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            customerId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            retrieve(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            customerId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            retrieve(customerId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /** @see retrieve */
        fun retrieve(params: CustomerRetrieveParams): CompletableFuture<HttpResponseFor<Customer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> =
            retrieve(customerId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /customers/{customer_id}`, but is otherwise the
         * same as [CustomerServiceAsync.update].
         */
        fun update(customerId: String): CompletableFuture<HttpResponseFor<Customer>> =
            update(customerId, CustomerUpdateParams.none())

        /** @see update */
        fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            update(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see update */
        fun update(
            customerId: String,
            params: CustomerUpdateParams = CustomerUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Customer>> =
            update(customerId, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CustomerUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Customer>>

        /** @see update */
        fun update(params: CustomerUpdateParams): CompletableFuture<HttpResponseFor<Customer>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Customer>> =
            update(customerId, CustomerUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers`, but is otherwise the same as
         * [CustomerServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none())

        /** @see list */
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>>

        /** @see list */
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomerListPageAsync>> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/credit-entitlements`, but
         * is otherwise the same as [CustomerServiceAsync.listCreditEntitlements].
         */
        fun listCreditEntitlements(
            customerId: String
        ): CompletableFuture<HttpResponseFor<CustomerListCreditEntitlementsResponse>> =
            listCreditEntitlements(customerId, CustomerListCreditEntitlementsParams.none())

        /** @see listCreditEntitlements */
        fun listCreditEntitlements(
            customerId: String,
            params: CustomerListCreditEntitlementsParams =
                CustomerListCreditEntitlementsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListCreditEntitlementsResponse>> =
            listCreditEntitlements(
                params.toBuilder().customerId(customerId).build(),
                requestOptions,
            )

        /** @see listCreditEntitlements */
        fun listCreditEntitlements(
            customerId: String,
            params: CustomerListCreditEntitlementsParams =
                CustomerListCreditEntitlementsParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListCreditEntitlementsResponse>> =
            listCreditEntitlements(customerId, params, RequestOptions.none())

        /** @see listCreditEntitlements */
        fun listCreditEntitlements(
            params: CustomerListCreditEntitlementsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerListCreditEntitlementsResponse>>

        /** @see listCreditEntitlements */
        fun listCreditEntitlements(
            params: CustomerListCreditEntitlementsParams
        ): CompletableFuture<HttpResponseFor<CustomerListCreditEntitlementsResponse>> =
            listCreditEntitlements(params, RequestOptions.none())

        /** @see listCreditEntitlements */
        fun listCreditEntitlements(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerListCreditEntitlementsResponse>> =
            listCreditEntitlements(
                customerId,
                CustomerListCreditEntitlementsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/payment-methods`, but is
         * otherwise the same as [CustomerServiceAsync.retrievePaymentMethods].
         */
        fun retrievePaymentMethods(
            customerId: String
        ): CompletableFuture<HttpResponseFor<CustomerRetrievePaymentMethodsResponse>> =
            retrievePaymentMethods(customerId, CustomerRetrievePaymentMethodsParams.none())

        /** @see retrievePaymentMethods */
        fun retrievePaymentMethods(
            customerId: String,
            params: CustomerRetrievePaymentMethodsParams =
                CustomerRetrievePaymentMethodsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrievePaymentMethodsResponse>> =
            retrievePaymentMethods(
                params.toBuilder().customerId(customerId).build(),
                requestOptions,
            )

        /** @see retrievePaymentMethods */
        fun retrievePaymentMethods(
            customerId: String,
            params: CustomerRetrievePaymentMethodsParams =
                CustomerRetrievePaymentMethodsParams.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrievePaymentMethodsResponse>> =
            retrievePaymentMethods(customerId, params, RequestOptions.none())

        /** @see retrievePaymentMethods */
        fun retrievePaymentMethods(
            params: CustomerRetrievePaymentMethodsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerRetrievePaymentMethodsResponse>>

        /** @see retrievePaymentMethods */
        fun retrievePaymentMethods(
            params: CustomerRetrievePaymentMethodsParams
        ): CompletableFuture<HttpResponseFor<CustomerRetrievePaymentMethodsResponse>> =
            retrievePaymentMethods(params, RequestOptions.none())

        /** @see retrievePaymentMethods */
        fun retrievePaymentMethods(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomerRetrievePaymentMethodsResponse>> =
            retrievePaymentMethods(
                customerId,
                CustomerRetrievePaymentMethodsParams.none(),
                requestOptions,
            )
    }
}
