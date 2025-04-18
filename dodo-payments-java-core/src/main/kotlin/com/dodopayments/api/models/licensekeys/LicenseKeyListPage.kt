// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.LicenseKeyService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [LicenseKeyService.list] */
class LicenseKeyListPage
private constructor(
    private val service: LicenseKeyService,
    private val params: LicenseKeyListParams,
    private val response: LicenseKeyListPageResponse,
) {

    /**
     * Delegates to [LicenseKeyListPageResponse], but gracefully handles missing data.
     *
     * @see [LicenseKeyListPageResponse.items]
     */
    fun items(): List<LicenseKey> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<LicenseKeyListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): Optional<LicenseKeyListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseKeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseKeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyListPage].
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

    /** A builder for [LicenseKeyListPage]. */
    class Builder internal constructor() {

        private var service: LicenseKeyService? = null
        private var params: LicenseKeyListParams? = null
        private var response: LicenseKeyListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseKeyListPage: LicenseKeyListPage) = apply {
            service = licenseKeyListPage.service
            params = licenseKeyListPage.params
            response = licenseKeyListPage.response
        }

        fun service(service: LicenseKeyService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseKeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseKeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseKeyListPage].
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
        fun build(): LicenseKeyListPage =
            LicenseKeyListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: LicenseKeyListPage) : Iterable<LicenseKey> {

        override fun iterator(): Iterator<LicenseKey> = iterator {
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

        fun stream(): Stream<LicenseKey> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "LicenseKeyListPage{service=$service, params=$params, response=$response}"
}
