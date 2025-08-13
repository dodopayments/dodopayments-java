// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.licensekeyinstances

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.LicenseKeyInstanceServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see LicenseKeyInstanceServiceAsync.list */
class LicenseKeyInstanceListPageAsync
private constructor(
    private val service: LicenseKeyInstanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: LicenseKeyInstanceListParams,
    private val response: LicenseKeyInstanceListPageResponse,
) : PageAsync<LicenseKeyInstance> {

    /**
     * Delegates to [LicenseKeyInstanceListPageResponse], but gracefully handles missing data.
     *
     * @see LicenseKeyInstanceListPageResponse.items
     */
    override fun items(): List<LicenseKeyInstance> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): LicenseKeyInstanceListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<LicenseKeyInstanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LicenseKeyInstance> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LicenseKeyInstanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: LicenseKeyInstanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: LicenseKeyInstanceListParams? = null
        private var response: LicenseKeyInstanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(licenseKeyInstanceListPageAsync: LicenseKeyInstanceListPageAsync) =
            apply {
                service = licenseKeyInstanceListPageAsync.service
                streamHandlerExecutor = licenseKeyInstanceListPageAsync.streamHandlerExecutor
                params = licenseKeyInstanceListPageAsync.params
                response = licenseKeyInstanceListPageAsync.response
            }

        fun service(service: LicenseKeyInstanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

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
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): LicenseKeyInstanceListPageAsync =
            LicenseKeyInstanceListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LicenseKeyInstanceListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "LicenseKeyInstanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
