// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements.balances

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.creditentitlements.BalanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see BalanceServiceAsync.listLedger */
class BalanceListLedgerPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: BalanceListLedgerParams,
    private val response: BalanceListLedgerPageResponse,
) : PageAsync<CreditLedgerEntry> {

    /**
     * Delegates to [BalanceListLedgerPageResponse], but gracefully handles missing data.
     *
     * @see BalanceListLedgerPageResponse.items
     */
    override fun items(): List<CreditLedgerEntry> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BalanceListLedgerParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<BalanceListLedgerPageAsync> =
        service.listLedger(nextPageParams())

    fun autoPager(): AutoPagerAsync<CreditLedgerEntry> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): BalanceListLedgerParams = params

    /** The response that this page was parsed from. */
    fun response(): BalanceListLedgerPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BalanceListLedgerPageAsync].
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

    /** A builder for [BalanceListLedgerPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: BalanceListLedgerParams? = null
        private var response: BalanceListLedgerPageResponse? = null

        @JvmSynthetic
        internal fun from(balanceListLedgerPageAsync: BalanceListLedgerPageAsync) = apply {
            service = balanceListLedgerPageAsync.service
            streamHandlerExecutor = balanceListLedgerPageAsync.streamHandlerExecutor
            params = balanceListLedgerPageAsync.params
            response = balanceListLedgerPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: BalanceListLedgerParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BalanceListLedgerPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BalanceListLedgerPageAsync].
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
        fun build(): BalanceListLedgerPageAsync =
            BalanceListLedgerPageAsync(
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

        return other is BalanceListLedgerPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "BalanceListLedgerPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
