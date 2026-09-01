// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.blocklist

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.blocklist.customers.BlockedCustomer
import com.dodopayments.api.models.blocklist.customers.CreateBlockedCustomerRequest
import com.dodopayments.api.models.blocklist.customers.CustomerCreateParams
import com.dodopayments.api.models.blocklist.customers.CustomerDeleteParams
import com.dodopayments.api.models.blocklist.customers.CustomerListPage
import com.dodopayments.api.models.blocklist.customers.CustomerListParams
import com.dodopayments.api.models.blocklist.customers.CustomerRetrieveParams
import com.dodopayments.api.services.blocking.blocklist.customers.NoteService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface CustomerService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService

    fun notes(): NoteService

    fun create(params: CustomerCreateParams): BlockedCustomer =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer

    /** @see create */
    fun create(
        createBlockedCustomerRequest: CreateBlockedCustomerRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
        create(
            CustomerCreateParams.builder()
                .createBlockedCustomerRequest(createBlockedCustomerRequest)
                .build(),
            requestOptions,
        )

    /** @see create */
    fun create(createBlockedCustomerRequest: CreateBlockedCustomerRequest): BlockedCustomer =
        create(createBlockedCustomerRequest, RequestOptions.none())

    /** @see create */
    fun create(
        blocklistCustomersBlockByCustomerId:
            CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
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
    ): BlockedCustomer = create(blocklistCustomersBlockByCustomerId, RequestOptions.none())

    /** @see create */
    fun create(
        blocklistCustomersBlockByEmail: CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer =
        create(
            CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                blocklistCustomersBlockByEmail
            ),
            requestOptions,
        )

    /** @see create */
    fun create(
        blocklistCustomersBlockByEmail: CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail
    ): BlockedCustomer = create(blocklistCustomersBlockByEmail, RequestOptions.none())

    fun retrieve(entryId: String): BlockedCustomer =
        retrieve(entryId, CustomerRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        entryId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer = retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        entryId: String,
        params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
    ): BlockedCustomer = retrieve(entryId, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockedCustomer

    /** @see retrieve */
    fun retrieve(params: CustomerRetrieveParams): BlockedCustomer =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(entryId: String, requestOptions: RequestOptions): BlockedCustomer =
        retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

    fun list(): CustomerListPage = list(CustomerListParams.none())

    /** @see list */
    fun list(
        params: CustomerListParams = CustomerListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** @see list */
    fun list(params: CustomerListParams = CustomerListParams.none()): CustomerListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CustomerListPage =
        list(CustomerListParams.none(), requestOptions)

    fun delete(entryId: String) = delete(entryId, CustomerDeleteParams.none())

    /** @see delete */
    fun delete(
        entryId: String,
        params: CustomerDeleteParams = CustomerDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

    /** @see delete */
    fun delete(entryId: String, params: CustomerDeleteParams = CustomerDeleteParams.none()) =
        delete(entryId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: CustomerDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: CustomerDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(entryId: String, requestOptions: RequestOptions) =
        delete(entryId, CustomerDeleteParams.none(), requestOptions)

    /** A view of [CustomerService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomerService.WithRawResponse

        fun notes(): NoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /blocklist/customers`, but is otherwise the same as
         * [CustomerService.create].
         */
        @MustBeClosed
        fun create(params: CustomerCreateParams): HttpResponseFor<BlockedCustomer> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CustomerCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer>

        /** @see create */
        @MustBeClosed
        fun create(
            createBlockedCustomerRequest: CreateBlockedCustomerRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            create(
                CustomerCreateParams.builder()
                    .createBlockedCustomerRequest(createBlockedCustomerRequest)
                    .build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            createBlockedCustomerRequest: CreateBlockedCustomerRequest
        ): HttpResponseFor<BlockedCustomer> =
            create(createBlockedCustomerRequest, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            blocklistCustomersBlockByCustomerId:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            create(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByCustomerId(
                    blocklistCustomersBlockByCustomerId
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            blocklistCustomersBlockByCustomerId:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByCustomerId
        ): HttpResponseFor<BlockedCustomer> =
            create(blocklistCustomersBlockByCustomerId, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            blocklistCustomersBlockByEmail:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            create(
                CreateBlockedCustomerRequest.ofBlocklistCustomersBlockByEmail(
                    blocklistCustomersBlockByEmail
                ),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(
            blocklistCustomersBlockByEmail:
                CreateBlockedCustomerRequest.BlocklistCustomersBlockByEmail
        ): HttpResponseFor<BlockedCustomer> =
            create(blocklistCustomersBlockByEmail, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /blocklist/customers/{entry_id}`, but is otherwise
         * the same as [CustomerService.retrieve].
         */
        @MustBeClosed
        fun retrieve(entryId: String): HttpResponseFor<BlockedCustomer> =
            retrieve(entryId, CustomerRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entryId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer> =
            retrieve(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entryId: String,
            params: CustomerRetrieveParams = CustomerRetrieveParams.none(),
        ): HttpResponseFor<BlockedCustomer> = retrieve(entryId, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CustomerRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockedCustomer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CustomerRetrieveParams): HttpResponseFor<BlockedCustomer> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            entryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockedCustomer> =
            retrieve(entryId, CustomerRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /blocklist/customers`, but is otherwise the same as
         * [CustomerService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CustomerListPage> = list(CustomerListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomerListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CustomerListParams = CustomerListParams.none()
        ): HttpResponseFor<CustomerListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CustomerListPage> =
            list(CustomerListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /blocklist/customers/{entry_id}`, but is
         * otherwise the same as [CustomerService.delete].
         */
        @MustBeClosed
        fun delete(entryId: String): HttpResponse = delete(entryId, CustomerDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            entryId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().entryId(entryId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            entryId: String,
            params: CustomerDeleteParams = CustomerDeleteParams.none(),
        ): HttpResponse = delete(entryId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: CustomerDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: CustomerDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(entryId: String, requestOptions: RequestOptions): HttpResponse =
            delete(entryId, CustomerDeleteParams.none(), requestOptions)
    }
}
