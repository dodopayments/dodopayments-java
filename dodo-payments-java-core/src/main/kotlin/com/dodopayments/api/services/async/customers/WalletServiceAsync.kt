// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.wallets.WalletListParams
import com.dodopayments.api.models.customers.wallets.WalletListResponse
import com.dodopayments.api.services.async.customers.wallets.LedgerEntryServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WalletServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WalletServiceAsync

    fun ledgerEntries(): LedgerEntryServiceAsync

    fun list(customerId: String): CompletableFuture<WalletListResponse> =
        list(customerId, WalletListParams.none())

    /** @see list */
    fun list(
        customerId: String,
        params: WalletListParams = WalletListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WalletListResponse> =
        list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        customerId: String,
        params: WalletListParams = WalletListParams.none(),
    ): CompletableFuture<WalletListResponse> = list(customerId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WalletListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WalletListResponse>

    /** @see list */
    fun list(params: WalletListParams): CompletableFuture<WalletListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        customerId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<WalletListResponse> =
        list(customerId, WalletListParams.none(), requestOptions)

    /**
     * A view of [WalletServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WalletServiceAsync.WithRawResponse

        fun ledgerEntries(): LedgerEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/wallets`, but is otherwise
         * the same as [WalletServiceAsync.list].
         */
        fun list(customerId: String): CompletableFuture<HttpResponseFor<WalletListResponse>> =
            list(customerId, WalletListParams.none())

        /** @see list */
        fun list(
            customerId: String,
            params: WalletListParams = WalletListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WalletListResponse>> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        fun list(
            customerId: String,
            params: WalletListParams = WalletListParams.none(),
        ): CompletableFuture<HttpResponseFor<WalletListResponse>> =
            list(customerId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: WalletListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WalletListResponse>>

        /** @see list */
        fun list(params: WalletListParams): CompletableFuture<HttpResponseFor<WalletListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WalletListResponse>> =
            list(customerId, WalletListParams.none(), requestOptions)
    }
}
