// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.DiscountServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DiscountServiceAsync.list */
class DiscountListPageAsync
private constructor(
    private val service: DiscountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DiscountListParams,
    private val response: DiscountListPageResponse,
) : PageAsync<Discount> {

    /**
     * Delegates to [DiscountListPageResponse], but gracefully handles missing data.
     *
     * @see DiscountListPageResponse.items
     */
    override fun items(): List<Discount> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DiscountListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<DiscountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Discount> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DiscountListParams = params

    /** The response that this page was parsed from. */
    fun response(): DiscountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountListPageAsync].
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

    /** A builder for [DiscountListPageAsync]. */
    class Builder internal constructor() {

        private var service: DiscountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DiscountListParams? = null
        private var response: DiscountListPageResponse? = null

        @JvmSynthetic
        internal fun from(discountListPageAsync: DiscountListPageAsync) = apply {
            service = discountListPageAsync.service
            streamHandlerExecutor = discountListPageAsync.streamHandlerExecutor
            params = discountListPageAsync.params
            response = discountListPageAsync.response
        }

        fun service(service: DiscountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DiscountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DiscountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DiscountListPageAsync].
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
        fun build(): DiscountListPageAsync =
            DiscountListPageAsync(
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

        return /* spotless:off */ other is DiscountListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DiscountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
