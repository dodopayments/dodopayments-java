// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.LicenseKeyInstanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [LicenseKeyInstanceServiceAsync.list] */
class LicenseKeyInstanceListPageAsync
private constructor(
    private val service: LicenseKeyInstanceServiceAsync,
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

    fun getNextPage(): CompletableFuture<Optional<LicenseKeyInstanceListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LicenseKeyInstanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): LicenseKeyInstanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [LicenseKeyInstanceListPageAsync].
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

    /** A builder for [LicenseKeyInstanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: LicenseKeyInstanceServiceAsync? = null
        private var params: LicenseKeyInstanceListParams? = null
        private var response: LicenseKeyInstanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseKeyInstanceListPageAsync: LicenseKeyInstanceListPageAsync) =
            apply {
                service = licenseKeyInstanceListPageAsync.service
                params = licenseKeyInstanceListPageAsync.params
                response = licenseKeyInstanceListPageAsync.response
            }

        fun service(service: LicenseKeyInstanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LicenseKeyInstanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LicenseKeyInstanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [LicenseKeyInstanceListPageAsync].
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
        fun build(): LicenseKeyInstanceListPageAsync =
            LicenseKeyInstanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: LicenseKeyInstanceListPageAsync) {

        fun forEach(
            action: Predicate<LicenseKeyInstance>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<LicenseKeyInstanceListPageAsync>>.forEach(
                action: (LicenseKeyInstance) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<LicenseKeyInstance>> {
            val values = mutableListOf<LicenseKeyInstance>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LicenseKeyInstanceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "LicenseKeyInstanceListPageAsync{service=$service, params=$params, response=$response}"
}
