// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.discounts

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.DiscountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [DiscountService.list] */
class DiscountListPage
private constructor(
    private val service: DiscountService,
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

    fun getNextPage(): Optional<DiscountListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DiscountListParams = params

    /** The response that this page was parsed from. */
    fun response(): DiscountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DiscountListPage].
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

    /** A builder for [DiscountListPage]. */
    class Builder internal constructor() {

        private var service: DiscountService? = null
        private var params: DiscountListParams? = null
        private var response: DiscountListPageResponse? = null

        @JvmSynthetic
        internal fun from(discountListPage: DiscountListPage) = apply {
            service = discountListPage.service
            params = discountListPage.params
            response = discountListPage.response
        }

        fun service(service: DiscountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DiscountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DiscountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DiscountListPage].
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
        fun build(): DiscountListPage =
            DiscountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DiscountListPage) : Iterable<Discount> {

        override fun iterator(): Iterator<Discount> = iterator {
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

        fun stream(): Stream<Discount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DiscountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DiscountListPage{service=$service, params=$params, response=$response}"
}
