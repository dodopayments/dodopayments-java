// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.PayoutServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [PayoutServiceAsync.list] */
class PayoutListPageAsync
private constructor(
    private val service: PayoutServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: PayoutListParams,
    private val response: PayoutListPageResponse,
) : PageAsync<PayoutListResponse> {

    /**
     * Delegates to [PayoutListPageResponse], but gracefully handles missing data.
     *
     * @see [PayoutListPageResponse.items]
     */
    override fun items(): List<PayoutListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PayoutListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<PayoutListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PayoutListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): PayoutListParams = params

    /** The response that this page was parsed from. */
    fun response(): PayoutListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PayoutListPageAsync].
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

    /** A builder for [PayoutListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayoutServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: PayoutListParams? = null
        private var response: PayoutListPageResponse? = null

        @JvmSynthetic
        internal fun from(payoutListPageAsync: PayoutListPageAsync) = apply {
            service = payoutListPageAsync.service
            streamHandlerExecutor = payoutListPageAsync.streamHandlerExecutor
            params = payoutListPageAsync.params
            response = payoutListPageAsync.response
        }

        fun service(service: PayoutServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: PayoutListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PayoutListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PayoutListPageAsync].
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
        fun build(): PayoutListPageAsync =
            PayoutListPageAsync(
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

        return /* spotless:off */ other is PayoutListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "PayoutListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
