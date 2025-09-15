// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.usageevents

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.UsageEventServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see UsageEventServiceAsync.list */
class UsageEventListPageAsync
private constructor(
    private val service: UsageEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: UsageEventListParams,
    private val response: UsageEventListPageResponse,
) : PageAsync<Event> {

    /**
     * Delegates to [UsageEventListPageResponse], but gracefully handles missing data.
     *
     * @see UsageEventListPageResponse.items
     */
    override fun items(): List<Event> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): UsageEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<UsageEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Event> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): UsageEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): UsageEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UsageEventListPageAsync].
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

    /** A builder for [UsageEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: UsageEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: UsageEventListParams? = null
        private var response: UsageEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(usageEventListPageAsync: UsageEventListPageAsync) = apply {
            service = usageEventListPageAsync.service
            streamHandlerExecutor = usageEventListPageAsync.streamHandlerExecutor
            params = usageEventListPageAsync.params
            response = usageEventListPageAsync.response
        }

        fun service(service: UsageEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: UsageEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: UsageEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [UsageEventListPageAsync].
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
        fun build(): UsageEventListPageAsync =
            UsageEventListPageAsync(
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

        return other is UsageEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "UsageEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
