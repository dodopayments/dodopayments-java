// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.BalanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BalanceServiceAsync.retrieveLedger */
class BalanceRetrieveLedgerPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BalanceRetrieveLedgerParams,
    private val response: BalanceRetrieveLedgerPageResponse,
) : PageAsync<BalanceLedgerEntry> {

    /**
     * Delegates to [BalanceRetrieveLedgerPageResponse], but gracefully handles missing data.
     *
     * @see BalanceRetrieveLedgerPageResponse.items
     */
    override fun items(): List<BalanceLedgerEntry> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceRetrieveLedgerParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BalanceRetrieveLedgerPageAsync> =
        service.retrieveLedger(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceLedgerEntry> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BalanceRetrieveLedgerParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceRetrieveLedgerPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BalanceRetrieveLedgerPageAsync].
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

    /** A builder for [BalanceRetrieveLedgerPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BalanceRetrieveLedgerParams? = null
        private var response: BalanceRetrieveLedgerPageResponse? = null

        @JvmSynthetic
        internal fun from(balanceRetrieveLedgerPageAsync: BalanceRetrieveLedgerPageAsync) = apply {
            service = balanceRetrieveLedgerPageAsync.service
            streamHandlerExecutor = balanceRetrieveLedgerPageAsync.streamHandlerExecutor
            params = balanceRetrieveLedgerPageAsync.params
            response = balanceRetrieveLedgerPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceRetrieveLedgerParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceRetrieveLedgerPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BalanceRetrieveLedgerPageAsync].
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
        fun build(): BalanceRetrieveLedgerPageAsync =
            BalanceRetrieveLedgerPageAsync(
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

        return other is BalanceRetrieveLedgerPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BalanceRetrieveLedgerPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
