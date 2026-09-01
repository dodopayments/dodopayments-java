// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.blocklist

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.blocklist.customers.BlockedCustomer
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
import com.dodopayments.api.models.blocklist.customers.CustomerCreateParams
import com.dodopayments.api.models.blocklist.customers.CustomerDeleteParams
import com.dodopayments.api.models.blocklist.customers.CustomerListPageAsync
import com.dodopayments.api.models.blocklist.customers.CustomerListParams
import com.dodopayments.api.models.blocklist.customers.CustomerRetrieveParams
import com.dodopayments.api.services.async.blocklist.customers.NoteServiceAsync
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

    fun notes(): NoteServiceAsync

    fun create(params: CustomerCreateParams): CompletableFuture<BlockedCustomer> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomer>

    /** @see create */
    fun create(
        createBlockedCustomerRequest: CreateBlockedCustomerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomer> =
        create(
            CustomerCreateParams.builder()
                .createBlockedCustomerRequest(createBlockedCustomerRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        createBlockedCustomerRequest: CreateBlockedCustomerRequest
    ): CompletableFuture<BlockedCustomer> =
        create(createBlockedCustomerRequest, RequestOptions.none())

    /** @see create */
    fun create(
        blocklistCustomersBlockByCustomerId:
            CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomer> =
        create(
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                blocklistCustomersBlockByCustomerId
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        blocklistCustomersBlockByCustomerId:
            CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId
    ): CompletableFuture<BlockedCustomer> =
        create(blocklistCustomersBlockByCustomerId, RequestOptions.none())

    /** @see create */
    fun create(
        blocklistCustomersBlockByEmail: CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomer> =
        create(
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                blocklistCustomersBlockByEmail
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        blocklistCustomersBlockByEmail: CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail
    ): CompletableFuture<BlockedCustomer> =
        create(blocklistCustomersBlockByEmail, RequestOptions.none())

    fun retrieve(entryId: String): CompletableFuture<BlockedCustomer> =
        retrieve(entryId, CustomerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entryId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomer> =
        retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        entryId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
    ): CompletableFuture<BlockedCustomer> = retrieve(entryId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockedCustomer>

    /** @see retrieve */
    fun retrieve(params: CustomerRetrieveParams): CompletableFuture<BlockedCustomer> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        entryId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlockedCustomer> =
        retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

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

    fun delete(entryId: String): CompletableFuture<Void?> =
        delete(entryId, CustomerDeleteParams.none())

    /** @see delete */
    fun delete(
        entryId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see delete */
    fun delete(
        entryId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(entryId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: CustomerDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: CustomerDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(entryId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(entryId, CustomerDeleteParams.none(), requestOptions)

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

        fun notes(): NoteServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /blocklist/customers`, but is otherwise the same as
         * [CustomerServiceAsync.create].
         */
        fun create(
            params: CustomerCreateParams
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>>

        /** @see create */
        fun create(
            createBlockedCustomerRequest: CreateBlockedCustomerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(
                CustomerCreateParams.builder()
                    .createBlockedCustomerRequest(createBlockedCustomerRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            createBlockedCustomerRequest: CreateBlockedCustomerRequest
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(createBlockedCustomerRequest, RequestOptions.none())

        /** @see create */
        fun create(
            blocklistCustomersBlockByCustomerId:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                    blocklistCustomersBlockByCustomerId
                ),
                requestOptions,
            )

        /** @see create */
        fun create(
            blocklistCustomersBlockByCustomerId:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(blocklistCustomersBlockByCustomerId, RequestOptions.none())

        /** @see create */
        fun create(
            blocklistCustomersBlockByEmail:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                    blocklistCustomersBlockByEmail
                ),
                requestOptions,
            )

        /** @see create */
        fun create(
            blocklistCustomersBlockByEmail:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            create(blocklistCustomersBlockByEmail, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /blocklist/customers/{entry_id}`, but is otherwise
         * the same as [CustomerServiceAsync.retrieve].
         */
        fun retrieve(entryId: String): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            retrieve(entryId, CustomerRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            entryId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            entryId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            retrieve(entryId, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>>

        /** @see retrieve */
        fun retrieve(
            params: CustomerRetrieveParams
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            entryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlockedCustomer>> =
            retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /blocklist/customers`, but is otherwise the same as
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
         * Returns a raw HTTP response for `delete /blocklist/customers/{entry_id}`, but is
         * otherwise the same as [CustomerServiceAsync.delete].
         */
        fun delete(entryId: String): CompletableFuture<HttpResponse> =
            delete(entryId, CustomerDeleteParams.none())

        /** @see delete */
        fun delete(
            entryId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see delete */
        fun delete(
            entryId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(entryId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: CustomerDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            entryId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(entryId, CustomerDeleteParams.none(), requestOptions)
    }
}
