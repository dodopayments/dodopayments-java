// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async.payouts.breakup

import com.dodopayments.api.core.ClientOptions
import com.dodopayments.api.core.RequestOptions
import com.dodopayments.api.core.http.HttpResponse
import com.dodopayments.api.core.http.HttpResponseFor
import com.dodopayments.api.models.payouts.breakup.details.DetailDownloadCsvParams
import com.dodopayments.api.models.payouts.breakup.details.DetailListPageAsync
import com.dodopayments.api.models.payouts.breakup.details.DetailListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DetailServiceAsync

    /**
     * Returns paginated individual balance ledger entries for a payout, with each entry's amount
     * pro-rated into the payout's currency. Supports pagination via `page_size` (default 10,
     * max 100) and `page_number` (default 0) query parameters.
     */
    fun list(payoutId: String): CompletableFuture<DetailListPageAsync> =
        list(payoutId, DetailListParams.none())

    /** @see list */
    fun list(
        payoutId: String,
        params: DetailListParams = DetailListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailListPageAsync> =
        list(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see list */
    fun list(
        payoutId: String,
        params: DetailListParams = DetailListParams.none(),
    ): CompletableFuture<DetailListPageAsync> = list(payoutId, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: DetailListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DetailListPageAsync>

    /** @see list */
    fun list(params: DetailListParams): CompletableFuture<DetailListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        payoutId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DetailListPageAsync> =
        list(payoutId, DetailListParams.none(), requestOptions)

    /**
     * Downloads the complete payout breakup as a CSV file. Each row represents a balance ledger
     * entry with columns: Ledger ID, Event Type, Original Amount, Original Currency, Reference
     * Object ID, Description, Created At, USD Equivalent Amount, and Payout Currency Amount.
     */
    fun downloadCsv(payoutId: String): CompletableFuture<Void?> =
        downloadCsv(payoutId, DetailDownloadCsvParams.none())

    /** @see downloadCsv */
    fun downloadCsv(
        payoutId: String,
        params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        downloadCsv(params.toBuilder().payoutId(payoutId).build(), requestOptions)

    /** @see downloadCsv */
    fun downloadCsv(
        payoutId: String,
        params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
    ): CompletableFuture<Void?> = downloadCsv(payoutId, params, RequestOptions.none())

    /** @see downloadCsv */
    fun downloadCsv(
        params: DetailDownloadCsvParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see downloadCsv */
    fun downloadCsv(params: DetailDownloadCsvParams): CompletableFuture<Void?> =
        downloadCsv(params, RequestOptions.none())

    /** @see downloadCsv */
    fun downloadCsv(payoutId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        downloadCsv(payoutId, DetailDownloadCsvParams.none(), requestOptions)

    /**
     * A view of [DetailServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup/details`, but is
         * otherwise the same as [DetailServiceAsync.list].
         */
        fun list(payoutId: String): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(payoutId, DetailListParams.none())

        /** @see list */
        fun list(
            payoutId: String,
            params: DetailListParams = DetailListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see list */
        fun list(
            payoutId: String,
            params: DetailListParams = DetailListParams.none(),
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(payoutId, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: DetailListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>>

        /** @see list */
        fun list(
            params: DetailListParams
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            payoutId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DetailListPageAsync>> =
            list(payoutId, DetailListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /payouts/{payout_id}/breakup/details/csv`, but is
         * otherwise the same as [DetailServiceAsync.downloadCsv].
         */
        fun downloadCsv(payoutId: String): CompletableFuture<HttpResponse> =
            downloadCsv(payoutId, DetailDownloadCsvParams.none())

        /** @see downloadCsv */
        fun downloadCsv(
            payoutId: String,
            params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            downloadCsv(params.toBuilder().payoutId(payoutId).build(), requestOptions)

        /** @see downloadCsv */
        fun downloadCsv(
            payoutId: String,
            params: DetailDownloadCsvParams = DetailDownloadCsvParams.none(),
        ): CompletableFuture<HttpResponse> = downloadCsv(payoutId, params, RequestOptions.none())

        /** @see downloadCsv */
        fun downloadCsv(
            params: DetailDownloadCsvParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see downloadCsv */
        fun downloadCsv(params: DetailDownloadCsvParams): CompletableFuture<HttpResponse> =
            downloadCsv(params, RequestOptions.none())

        /** @see downloadCsv */
        fun downloadCsv(
            payoutId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            downloadCsv(payoutId, DetailDownloadCsvParams.none(), requestOptions)
    }
}
