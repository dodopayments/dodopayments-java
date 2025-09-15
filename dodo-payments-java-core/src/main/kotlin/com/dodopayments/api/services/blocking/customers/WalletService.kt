// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.blocking.customers

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.customers.wallets.WalletListParams
import com.dodopayments.api.models.customers.wallets.WalletListResponse
import com.dodopayments.api.services.blocking.customers.wallets.LedgerEntryService
import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer

interface WalletService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WalletService

    fun ledgerEntries(): LedgerEntryService

    fun list(customerId: String): WalletListResponse = list(customerId, WalletListParams.none())

    /** @see list */
    fun list(
        customerId: String,
        params: WalletListParams = WalletListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WalletListResponse = list(params.toBuilder().customerId(customerId).build(), requestOptions)

    /** @see list */
    fun list(
        customerId: String,
        params: WalletListParams = WalletListParams.none(),
    ): WalletListResponse = list(customerId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: WalletListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WalletListResponse

    /** @see list */
    fun list(params: WalletListParams): WalletListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(customerId: String, requestOptions: RequestOptions): WalletListResponse =
        list(customerId, WalletListParams.none(), requestOptions)

    /** A view of [WalletService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): WalletService.WithRawResponse

        fun ledgerEntries(): LedgerEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /customers/{customer_id}/wallets`, but is otherwise
         * the same as [WalletService.list].
         */
        @MustBeClosed
        fun list(customerId: String): HttpResponseFor<WalletListResponse> =
            list(customerId, WalletListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            params: WalletListParams = WalletListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WalletListResponse> =
            list(params.toBuilder().customerId(customerId).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            params: WalletListParams = WalletListParams.none(),
        ): HttpResponseFor<WalletListResponse> = list(customerId, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: WalletListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WalletListResponse>

        /** @see list */
        @MustBeClosed
        fun list(params: WalletListParams): HttpResponseFor<WalletListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            customerId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WalletListResponse> =
            list(customerId, WalletListParams.none(), requestOptions)
    }
}
