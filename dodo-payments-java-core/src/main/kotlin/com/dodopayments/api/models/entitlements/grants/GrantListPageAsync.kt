// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements.grants

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.entitlements.GrantServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see GrantServiceAsync.list */
class GrantListPageAsync
private constructor(
    private val service: GrantServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: GrantListParams,
    private val response: GrantListPageResponse,
) : PageAsync<EntitlementGrant> {

    /**
     * Delegates to [GrantListPageResponse], but gracefully handles missing data.
     *
     * @see GrantListPageResponse.items
     */
    override fun items(): List<EntitlementGrant> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): GrantListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<GrantListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<EntitlementGrant> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): GrantListParams = params

    /** The response that this page was parsed from. */
    fun response(): GrantListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [GrantListPageAsync].
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

    /** A builder for [GrantListPageAsync]. */
    class Builder internal constructor() {

        private var service: GrantServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: GrantListParams? = null
        private var response: GrantListPageResponse? = null

        @JvmSynthetic
        internal fun from(grantListPageAsync: GrantListPageAsync) = apply {
            service = grantListPageAsync.service
            streamHandlerExecutor = grantListPageAsync.streamHandlerExecutor
            params = grantListPageAsync.params
            response = grantListPageAsync.response
        }

        fun service(service: GrantServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: GrantListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: GrantListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [GrantListPageAsync].
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
        fun build(): GrantListPageAsync =
            GrantListPageAsync(
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

        return other is GrantListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "GrantListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
