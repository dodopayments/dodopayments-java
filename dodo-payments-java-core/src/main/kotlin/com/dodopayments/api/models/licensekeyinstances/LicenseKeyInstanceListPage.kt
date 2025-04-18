// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.LicenseKeyInstanceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [LicenseKeyInstanceService.list] */
class LicenseKeyInstanceListPage
private constructor(
    private val service: LicenseKeyInstanceService,
    private val params: LicenseKeyInstanceListParams,
    private val response: LicenseKeyInstanceListPageResponse,
) {

    /**
     * Delegates to [LicenseKeyInstanceListPageResponse], but gracefully handles missing data.
     *
     * @see [LicenseKeyInstanceListPageResponse.items]
     */
    fun items(): List<LicenseKeyInstance> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<LicenseKeyInstanceListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): Optional<LicenseKeyInstanceListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseKeyInstanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseKeyInstanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyInstanceListPage].
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

    /** A builder for [LicenseKeyInstanceListPage]. */
    class Builder internal constructor() {

        private var service: LicenseKeyInstanceService? = null
        private var params: LicenseKeyInstanceListParams? = null
        private var response: LicenseKeyInstanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseKeyInstanceListPage: LicenseKeyInstanceListPage) = apply {
            service = licenseKeyInstanceListPage.service
            params = licenseKeyInstanceListPage.params
            response = licenseKeyInstanceListPage.response
        }

        fun service(service: LicenseKeyInstanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseKeyInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseKeyInstanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LicenseKeyInstanceListPage].
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
        fun build(): LicenseKeyInstanceListPage =
            LicenseKeyInstanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: LicenseKeyInstanceListPage) :
        Iterable<LicenseKeyInstance> {

        override fun iterator(): Iterator<LicenseKeyInstance> = iterator {
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

        fun stream(): Stream<LicenseKeyInstance> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyInstanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "LicenseKeyInstanceListPage{service=$service, params=$params, response=$response}"
}
