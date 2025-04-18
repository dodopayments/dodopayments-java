// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [SubscriptionServiceAsync.list] */
class SubscriptionListPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: SubscriptionListParams,
    private val response: SubscriptionListPageResponse,
) {

    /**
     * Delegates to [SubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [SubscriptionListPageResponse.items]
     */
    fun items(): List<Subscription> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<SubscriptionListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<SubscriptionListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): SubscriptionListParams = params

    /** The response that this page was parsed from. */
    fun response(): SubscriptionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SubscriptionListPageAsync].
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

    /** A builder for [SubscriptionListPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: SubscriptionListParams? = null
        private var response: SubscriptionListPageResponse? = null

        @JvmSynthetic
        internal fun from(subscriptionListPageAsync: SubscriptionListPageAsync) = apply {
            service = subscriptionListPageAsync.service
            params = subscriptionListPageAsync.params
            response = subscriptionListPageAsync.response
        }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SubscriptionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SubscriptionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [SubscriptionListPageAsync].
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
        fun build(): SubscriptionListPageAsync =
            SubscriptionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: SubscriptionListPageAsync) {

        fun forEach(action: Predicate<Subscription>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<SubscriptionListPageAsync>>.forEach(
                action: (Subscription) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Subscription>> {
            val values = mutableListOf<Subscription>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SubscriptionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SubscriptionListPageAsync{service=$service, params=$params, response=$response}"
}
