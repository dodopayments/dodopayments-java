// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers.wallets

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.wallets.CustomerWallet
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryCreateParams
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListPageAsync
import com.dodopayments.api.models.customers.wallets.ledgerentries.LedgerEntryListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LedgerEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LedgerEntryServiceAsync

    fun create(
        customerId: String,
        params: LedgerEntryCreateParams,
    ): CompletableFuture<CustomerWallet> = create(customerId, params, RequestOptions.none())

    /** @see create */
    fun create(
        customerId: String,
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerWallet> =
        create(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see create */
    fun create(params: LedgerEntryCreateParams): CompletableFuture<CustomerWallet> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LedgerEntryCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomerWallet>

    fun list(customerId: String): CompletableFuture<LedgerEntryListPageAsync> =
        list(customerId, LedgerEntryListParams.none())

    /** @see list */
    fun list(
        customerId: String,
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntryListPageAsync> =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        customerId: String,
        params: LedgerEntryListParams = LedgerEntryListParams.none(),
    ): CompletableFuture<LedgerEntryListPageAsync> = list(customerId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: LedgerEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LedgerEntryListPageAsync>

    /** @see list */
    fun list(params: LedgerEntryListParams): CompletableFuture<LedgerEntryListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LedgerEntryListPageAsync> =
        list(customerId, LedgerEntryListParams.none(), requestOptions)

    /**
     * A view of [LedgerEntryServiceAsync] that provides access to raw HTTP responses for each
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
        ): LedgerEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/{customer_id}/wallets/ledger-entries`,
         * but is otherwise the same as [LedgerEntryServiceAsync.create].
         */
        fun create(
            customerId: String,
            params: LedgerEntryCreateParams,
        ): CompletableFuture<HttpResponseFor<CustomerWallet>> =
            create(customerId, params, RequestOptions.none())

        /** @see create */
        fun create(
            customerId: String,
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerWallet>> =
            create(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see create */
        fun create(
            params: LedgerEntryCreateParams
        ): CompletableFuture<HttpResponseFor<CustomerWallet>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LedgerEntryCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomerWallet>>

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/wallets/ledger-entries`,
         * but is otherwise the same as [LedgerEntryServiceAsync.list].
         */
        fun list(customerId: String): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(customerId, LedgerEntryListParams.none())

        /** @see list */
        fun list(
            customerId: String,
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        fun list(
            customerId: String,
            params: LedgerEntryListParams = LedgerEntryListParams.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(customerId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: LedgerEntryListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>>

        /** @see list */
        fun list(
            params: LedgerEntryListParams
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LedgerEntryListPageAsync>> =
            list(customerId, LedgerEntryListParams.none(), requestOptions)
    }
}
