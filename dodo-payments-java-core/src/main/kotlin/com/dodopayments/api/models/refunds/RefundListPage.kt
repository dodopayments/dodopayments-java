// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.refunds

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.RefundService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [RefundService.list] */
class RefundListPage
private constructor(
    private val service: RefundService,
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

    fun getNextPage(): Optional<RefundListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): RefundListParams = params

    /** The response that this page was parsed from. */
    fun response(): RefundListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RefundListPage].
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

    /** A builder for [RefundListPage]. */
    class Builder internal constructor() {

        private var service: RefundService? = null
        private var params: RefundListParams? = null
        private var response: RefundListPageResponse? = null

        @JvmSynthetic
        internal fun from(refundListPage: RefundListPage) = apply {
            service = refundListPage.service
            params = refundListPage.params
            response = refundListPage.response
        }

        fun service(service: RefundService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RefundListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RefundListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RefundListPage].
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
        fun build(): RefundListPage =
            RefundListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: RefundListPage) : Iterable<Refund> {

        override fun iterator(): Iterator<Refund> = iterator {
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

        fun stream(): Stream<Refund> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RefundListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "RefundListPage{service=$service, params=$params, response=$response}"
}
