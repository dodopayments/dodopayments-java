// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeys

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.LicenseKeyServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [LicenseKeyServiceAsync.list] */
class LicenseKeyListPageAsync
private constructor(
    private val service: LicenseKeyServiceAsync,
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

    fun getNextPage(): CompletableFuture<Optional<LicenseKeyListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseKeyListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseKeyListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LicenseKeyListPageAsync].
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

    /** A builder for [LicenseKeyListPageAsync]. */
    class Builder internal constructor() {

        private var service: LicenseKeyServiceAsync? = null
        private var params: LicenseKeyListParams? = null
        private var response: LicenseKeyListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseKeyListPageAsync: LicenseKeyListPageAsync) = apply {
            service = licenseKeyListPageAsync.service
            params = licenseKeyListPageAsync.params
            response = licenseKeyListPageAsync.response
        }

        fun service(service: LicenseKeyServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseKeyListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseKeyListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LicenseKeyListPageAsync].
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
        fun build(): LicenseKeyListPageAsync =
            LicenseKeyListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: LicenseKeyListPageAsync) {

        fun forEach(action: Predicate<LicenseKey>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LicenseKeyListPageAsync>>.forEach(
                action: (LicenseKey) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LicenseKey>> {
            val values = mutableListOf<LicenseKey>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "LicenseKeyListPageAsync{service=$service, params=$params, response=$response}"
}
