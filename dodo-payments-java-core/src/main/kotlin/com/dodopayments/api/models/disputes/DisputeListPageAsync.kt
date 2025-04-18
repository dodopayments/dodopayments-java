// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.disputes

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.DisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [DisputeServiceAsync.list] */
class DisputeListPageAsync
private constructor(
    private val service: DisputeServiceAsync,
    private val params: DisputeListParams,
    private val response: DisputeListPageResponse,
) {

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListPageResponse.items]
     */
    fun items(): List<Dispute> = response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<DisputeListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<DisputeListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputeListParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputeListPageAsync].
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

    /** A builder for [DisputeListPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputeServiceAsync? = null
        private var params: DisputeListParams? = null
        private var response: DisputeListPageResponse? = null

        @JvmSynthetic
        internal fun from(disputeListPageAsync: DisputeListPageAsync) = apply {
            service = disputeListPageAsync.service
            params = disputeListPageAsync.params
            response = disputeListPageAsync.response
        }

        fun service(service: DisputeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DisputeListPageAsync].
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
        fun build(): DisputeListPageAsync =
            DisputeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DisputeListPageAsync) {

        fun forEach(action: Predicate<Dispute>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DisputeListPageAsync>>.forEach(
                action: (Dispute) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Dispute>> {
            val values = mutableListOf<Dispute>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListPageAsync{service=$service, params=$params, response=$response}"
}
