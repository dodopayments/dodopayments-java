// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.ProductServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [ProductServiceAsync.list] */
class ProductListPageAsync
private constructor(
    private val service: ProductServiceAsync,
    private val params: ProductListParams,
    private val response: ProductListPageResponse,
) {

    /**
     * Delegates to [ProductListPageResponse], but gracefully handles missing data.
     *
     * @see [ProductListPageResponse.items]
     */
    fun items(): List<ProductListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<ProductListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<ProductListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListPageAsync].
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

    /** A builder for [ProductListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProductServiceAsync? = null
        private var params: ProductListParams? = null
        private var response: ProductListPageResponse? = null

        @JvmSynthetic
        internal fun from(productListPageAsync: ProductListPageAsync) = apply {
            service = productListPageAsync.service
            params = productListPageAsync.params
            response = productListPageAsync.response
        }

        fun service(service: ProductServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListPageAsync].
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
        fun build(): ProductListPageAsync =
            ProductListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProductListPageAsync) {

        fun forEach(
            action: Predicate<ProductListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ProductListPageAsync>>.forEach(
                action: (ProductListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ProductListResponse>> {
            val values = mutableListOf<ProductListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProductListPageAsync{service=$service, params=$params, response=$response}"
}
