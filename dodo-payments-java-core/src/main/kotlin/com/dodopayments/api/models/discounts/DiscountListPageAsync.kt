// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.DiscountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [DiscountServiceAsync.list] */
class DiscountListPageAsync
private constructor(
    private val service: DiscountServiceAsync,
    private val params: DiscountListParams,
    private val response: DiscountListPageResponse,
) {

    /**
     * Delegates to [DiscountListPageResponse], but gracefully handles missing data.
     *
     * @see [DiscountListPageResponse.items]
     */
    fun items(): List<Discount> = response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<DiscountListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<DiscountListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DiscountListPageAsync]. */
    class Builder internal constructor() {

        private var service: DiscountServiceAsync? = null
        private var params: DiscountListParams? = null
        private var response: DiscountListPageResponse? = null

        @JvmSynthetic
        internal fun from(discountListPageAsync: DiscountListPageAsync) = apply {
            service = discountListPageAsync.service
            params = discountListPageAsync.params
            response = discountListPageAsync.response
        }

        fun service(service: DiscountServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DiscountListPageAsync =
            DiscountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DiscountListPageAsync) {

        fun forEach(action: Predicate<Discount>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DiscountListPageAsync>>.forEach(
                action: (Discount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Discount>> {
            val values = mutableListOf<Discount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DiscountListPageAsync{service=$service, params=$params, response=$response}"
}
