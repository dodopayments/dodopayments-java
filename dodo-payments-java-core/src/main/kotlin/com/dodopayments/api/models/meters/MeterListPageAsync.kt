// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.meters

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.MeterServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see MeterServiceAsync.list */
class MeterListPageAsync
private constructor(
    private val service: MeterServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: MeterListParams,
    private val response: MeterListPageResponse,
) : PageAsync<Meter> {

    /**
     * Delegates to [MeterListPageResponse], but gracefully handles missing data.
     *
     * @see MeterListPageResponse.items
     */
    override fun items(): List<Meter> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): MeterListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<MeterListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Meter> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): MeterListParams = params

    /** The response that this page was parsed from. */
    fun response(): MeterListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [MeterListPageAsync].
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

    /** A builder for [MeterListPageAsync]. */
    class Builder internal constructor() {

        private var service: MeterServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: MeterListParams? = null
        private var response: MeterListPageResponse? = null

        @JvmSynthetic
        internal fun from(meterListPageAsync: MeterListPageAsync) = apply {
            service = meterListPageAsync.service
            streamHandlerExecutor = meterListPageAsync.streamHandlerExecutor
            params = meterListPageAsync.params
            response = meterListPageAsync.response
        }

        fun service(service: MeterServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: MeterListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: MeterListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [MeterListPageAsync].
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
        fun build(): MeterListPageAsync =
            MeterListPageAsync(
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

        return other is MeterListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "MeterListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
