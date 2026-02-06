// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerPageAsync
import com.dodopayments.api.models.balances.BalanceRetrieveLedgerParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

    fun retrieveLedger(): CompletableFuture<BalanceRetrieveLedgerPageAsync> =
        retrieveLedger(BalanceRetrieveLedgerParams.none())

    /** @see retrieveLedger */
    fun retrieveLedger(
        params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceRetrieveLedgerPageAsync>

    /** @see retrieveLedger */
    fun retrieveLedger(
        params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none()
    ): CompletableFuture<BalanceRetrieveLedgerPageAsync> =
        retrieveLedger(params, RequestOptions.none())

    /** @see retrieveLedger */
    fun retrieveLedger(
        requestOptions: RequestOptions
    ): CompletableFuture<BalanceRetrieveLedgerPageAsync> =
        retrieveLedger(BalanceRetrieveLedgerParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /balances/ledger`, but is otherwise the same as
         * [BalanceServiceAsync.retrieveLedger].
         */
        fun retrieveLedger(): CompletableFuture<HttpResponseFor<BalanceRetrieveLedgerPageAsync>> =
            retrieveLedger(BalanceRetrieveLedgerParams.none())

        /** @see retrieveLedger */
        fun retrieveLedger(
            params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceRetrieveLedgerPageAsync>>

        /** @see retrieveLedger */
        fun retrieveLedger(
            params: BalanceRetrieveLedgerParams = BalanceRetrieveLedgerParams.none()
        ): CompletableFuture<HttpResponseFor<BalanceRetrieveLedgerPageAsync>> =
            retrieveLedger(params, RequestOptions.none())

        /** @see retrieveLedger */
        fun retrieveLedger(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BalanceRetrieveLedgerPageAsync>> =
            retrieveLedger(BalanceRetrieveLedgerParams.none(), requestOptions)
    }
}
