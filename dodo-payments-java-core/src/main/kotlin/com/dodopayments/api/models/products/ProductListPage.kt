// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.ProductService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [ProductService.list] */
class ProductListPage
private constructor(
    private val service: ProductService,
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

    fun getNextPage(): Optional<ProductListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProductListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductListPage].
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

    /** A builder for [ProductListPage]. */
    class Builder internal constructor() {

        private var service: ProductService? = null
        private var params: ProductListParams? = null
        private var response: ProductListPageResponse? = null

        @JvmSynthetic
        internal fun from(productListPage: ProductListPage) = apply {
            service = productListPage.service
            params = productListPage.params
            response = productListPage.response
        }

        fun service(service: ProductService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProductListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProductListPage].
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
        fun build(): ProductListPage =
            ProductListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProductListPage) : Iterable<ProductListResponse> {

        override fun iterator(): Iterator<ProductListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.items().size) {
                    yield(page.items()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<ProductListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProductListPage{service=$service, params=$params, response=$response}"
}
