// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payouts.breakup.details

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.models.payouts.breakup.details.DetailListPageResponse
import com.dodopayments.api.models.payouts.breakup.details.DetailListParams
import com.dodopayments.api.models.payouts.breakup.details.DetailListResponse
import com.dodopayments.api.services.async.payouts.breakup.DetailServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see DetailServiceAsync.list */
class DetailListPageAsync private constructor(
    private val service: DetailServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DetailListParams,
    private val response: DetailListPageResponse,

) : PageAsync<DetailListResponse> {

    /**
     * Delegates to [DetailListPageResponse], but gracefully handles missing data.
     *
     * @see DetailListPageResponse.items
     */
    override fun items(): List<DetailListResponse> = response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DetailListParams {
      val pageNumber = params.pageNumber().getOrDefault(1)
      return params.toBuilder()
          .pageNumber(pageNumber + 1)
          .build()
    }

    override fun nextPage(): CompletableFuture<DetailListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DetailListResponse> =
        AutoPagerAsync.from(
          this, streamHandlerExecutor
        )

    /** The parameters that were used to request this page. */
    fun params(): DetailListParams = params

    /** The response that this page was parsed from. */
    fun response(): DetailListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DetailListPageAsync].
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

    /** A builder for [DetailListPageAsync]. */
    class Builder internal constructor() {

        private var service: DetailServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DetailListParams? = null
        private var response: DetailListPageResponse? = null

        @JvmSynthetic
        internal fun from(detailListPageAsync: DetailListPageAsync) =
            apply {
                service = detailListPageAsync.service
                streamHandlerExecutor = detailListPageAsync.streamHandlerExecutor
                params = detailListPageAsync.params
                response = detailListPageAsync.response
            }

        fun service(service: DetailServiceAsync) =
            apply {
                this.service = service
            }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) =
            apply {
                this.streamHandlerExecutor = streamHandlerExecutor
            }

        /** The parameters that were used to request this page. */
        fun params(params: DetailListParams) =
            apply {
                this.params = params
            }

        /** The response that this page was parsed from. */
        fun response(response: DetailListPageResponse) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [DetailListPageAsync].
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
        fun build(): DetailListPageAsync =
            DetailListPageAsync(
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

      return other is DetailListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() = "DetailListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
