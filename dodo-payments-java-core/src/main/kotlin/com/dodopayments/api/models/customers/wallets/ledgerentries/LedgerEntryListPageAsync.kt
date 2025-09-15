// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.customers.wallets.LedgerEntryServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see LedgerEntryServiceAsync.list */
class LedgerEntryListPageAsync
private constructor(
    private val service: LedgerEntryServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LedgerEntryListParams,
    private val response: LedgerEntryListPageResponse,
) : PageAsync<CustomerWalletTransaction> {

    /**
     * Delegates to [LedgerEntryListPageResponse], but gracefully handles missing data.
     *
     * @see LedgerEntryListPageResponse.items
     */
    override fun items(): List<CustomerWalletTransaction> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LedgerEntryListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<LedgerEntryListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CustomerWalletTransaction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): LedgerEntryListParams = params

    /** The response that this page was parsed from. */
    fun response(): LedgerEntryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LedgerEntryListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LedgerEntryListPageAsync]. */
    class Builder internal constructor() {

        private var service: LedgerEntryServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LedgerEntryListParams? = null
        private var response: LedgerEntryListPageResponse? = null

        @JvmSynthetic
        internal fun from(ledgerEntryListPageAsync: LedgerEntryListPageAsync) = apply {
            service = ledgerEntryListPageAsync.service
            streamHandlerExecutor = ledgerEntryListPageAsync.streamHandlerExecutor
            params = ledgerEntryListPageAsync.params
            response = ledgerEntryListPageAsync.response
        }

        fun service(service: LedgerEntryServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: LedgerEntryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LedgerEntryListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LedgerEntryListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LedgerEntryListPageAsync =
            LedgerEntryListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LedgerEntryListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LedgerEntryListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
