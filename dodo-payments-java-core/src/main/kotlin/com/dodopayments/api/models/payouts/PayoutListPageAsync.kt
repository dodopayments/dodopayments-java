// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.PayoutServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [PayoutServiceAsync.list] */
class PayoutListPageAsync
private constructor(
    private val service: PayoutServiceAsync,
    private val params: PayoutListParams,
    private val response: PayoutListPageResponse,
) {

    /**
     * Delegates to [PayoutListPageResponse], but gracefully handles missing data.
     *
     * @see [PayoutListPageResponse.items]
     */
    fun items(): List<PayoutListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<PayoutListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<PayoutListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PayoutListPageAsync]. */
    class Builder internal constructor() {

        private var service: PayoutServiceAsync? = null
        private var params: PayoutListParams? = null
        private var response: PayoutListPageResponse? = null

        @JvmSynthetic
        internal fun from(payoutListPageAsync: PayoutListPageAsync) = apply {
            service = payoutListPageAsync.service
            params = payoutListPageAsync.params
            response = payoutListPageAsync.response
        }

        fun service(service: PayoutServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PayoutListPageAsync =
            PayoutListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PayoutListPageAsync) {

        fun forEach(
            action: Predicate<PayoutListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PayoutListPageAsync>>.forEach(
                action: (PayoutListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<PayoutListResponse>> {
            val values = mutableListOf<PayoutListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PayoutListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PayoutListPageAsync{service=$service, params=$params, response=$response}"
}
