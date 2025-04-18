// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.RefundServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [RefundServiceAsync.list] */
class RefundListPageAsync
private constructor(
    private val service: RefundServiceAsync,
    private val params: RefundListParams,
    private val response: RefundListPageResponse,
) {

    /**
     * Delegates to [RefundListPageResponse], but gracefully handles missing data.
     *
     * @see [RefundListPageResponse.items]
     */
    fun items(): List<Refund> = response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<RefundListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<RefundListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): RefundListParams = params

    /** The response that this page was parsed from. */
    fun response(): RefundListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RefundListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [RefundListPageAsync]. */
    class Builder internal constructor() {

        private var service: RefundServiceAsync? = null
        private var params: RefundListParams? = null
        private var response: RefundListPageResponse? = null

        @JvmSynthetic
        internal fun from(refundListPageAsync: RefundListPageAsync) = apply {
            service = refundListPageAsync.service
            params = refundListPageAsync.params
            response = refundListPageAsync.response
        }

        fun service(service: RefundServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RefundListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RefundListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RefundListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RefundListPageAsync =
            RefundListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: RefundListPageAsync) {

        fun forEach(action: Predicate<Refund>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RefundListPageAsync>>.forEach(
                action: (Refund) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.items().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<Refund>> {
            val values = mutableListOf<Refund>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RefundListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RefundListPageAsync{service=$service, params=$params, response=$response}"
}
