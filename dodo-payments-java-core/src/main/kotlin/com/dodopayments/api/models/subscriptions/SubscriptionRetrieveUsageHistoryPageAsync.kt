// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see SubscriptionServiceAsync.retrieveUsageHistory */
class SubscriptionRetrieveUsageHistoryPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: SubscriptionRetrieveUsageHistoryParams,
    private val response: SubscriptionRetrieveUsageHistoryPageResponse,
) : PageAsync<SubscriptionRetrieveUsageHistoryResponse> {

    /**
     * Delegates to [SubscriptionRetrieveUsageHistoryPageResponse], but gracefully handles missing
     * data.
     *
     * @see SubscriptionRetrieveUsageHistoryPageResponse.items
     */
    override fun items(): List<SubscriptionRetrieveUsageHistoryResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): SubscriptionRetrieveUsageHistoryParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<SubscriptionRetrieveUsageHistoryPageAsync> =
        service.retrieveUsageHistory(nextPageParams())

    fun autoPager(): AutoPagerAsync<SubscriptionRetrieveUsageHistoryResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionRetrieveUsageHistoryParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionRetrieveUsageHistoryPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SubscriptionRetrieveUsageHistoryPageAsync].
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

    /** A builder for [SubscriptionRetrieveUsageHistoryPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: SubscriptionRetrieveUsageHistoryParams? = null
        private var response: SubscriptionRetrieveUsageHistoryPageResponse? = null

        @JvmSynthetic
        internal fun from(
            subscriptionRetrieveUsageHistoryPageAsync: SubscriptionRetrieveUsageHistoryPageAsync
        ) = apply {
            service = subscriptionRetrieveUsageHistoryPageAsync.service
            streamHandlerExecutor = subscriptionRetrieveUsageHistoryPageAsync.streamHandlerExecutor
            params = subscriptionRetrieveUsageHistoryPageAsync.params
            response = subscriptionRetrieveUsageHistoryPageAsync.response
        }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionRetrieveUsageHistoryParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionRetrieveUsageHistoryPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SubscriptionRetrieveUsageHistoryPageAsync].
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
        fun build(): SubscriptionRetrieveUsageHistoryPageAsync =
            SubscriptionRetrieveUsageHistoryPageAsync(
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

        return other is SubscriptionRetrieveUsageHistoryPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "SubscriptionRetrieveUsageHistoryPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
