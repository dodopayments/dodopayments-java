// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.entitlements

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.models.entitlements.Entitlement
import com.dodopayments.api.models.entitlements.EntitlementListPageResponse
import com.dodopayments.api.models.entitlements.EntitlementListParams
import com.dodopayments.api.services.async.EntitlementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see EntitlementServiceAsync.list */
class EntitlementListPageAsync private constructor(
    private val service: EntitlementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: EntitlementListParams,
    private val response: EntitlementListPageResponse,

) : PageAsync<Entitlement> {

    /**
     * Delegates to [EntitlementListPageResponse], but gracefully handles missing data.
     *
     * @see EntitlementListPageResponse.items
     */
    override fun items(): List<Entitlement> = response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EntitlementListParams {
      val pageNumber = params.pageNumber().getOrDefault(1)
      return params.toBuilder()
          .pageNumber(pageNumber + 1)
          .build()
    }

    override fun nextPage(): CompletableFuture<EntitlementListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Entitlement> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): EntitlementListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntitlementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntitlementListPageAsync].
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic
        fun builder() = Builder()
    }

    /** A builder for [EntitlementListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntitlementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: EntitlementListParams? = null
        private var response: EntitlementListPageResponse? = null

        @JvmSynthetic
        internal fun from(entitlementListPageAsync: EntitlementListPageAsync) =
            apply {
                service = entitlementListPageAsync.service
                streamHandlerExecutor = entitlementListPageAsync.streamHandlerExecutor
                params = entitlementListPageAsync.params
                response = entitlementListPageAsync.response
            }

        fun service(service: EntitlementServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: EntitlementListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(response: EntitlementListPageResponse) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [EntitlementListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         *
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntitlementListPageAsync =
            EntitlementListPageAsync(
              checkRequired(
                "service", service
              ),
              checkRequired(
                "streamHandlerExecutor", streamHandlerExecutor
              ),
              checkRequired(
                "params", params
              ),
              checkRequired(
                "response", response
              ),
            )
    }

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is EntitlementListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() = "EntitlementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
