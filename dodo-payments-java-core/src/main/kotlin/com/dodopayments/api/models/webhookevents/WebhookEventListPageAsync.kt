// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.WebhookEventServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [WebhookEventServiceAsync.list] */
class WebhookEventListPageAsync
private constructor(
    private val service: WebhookEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: WebhookEventListParams,
    private val response: WebhookEventListPageResponse,
) : PageAsync<WebhookEvent> {

    /**
     * Delegates to [WebhookEventListPageResponse], but gracefully handles missing data.
     *
     * @see [WebhookEventListPageResponse.items]
     */
    override fun items(): List<WebhookEvent> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): WebhookEventListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<WebhookEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WebhookEvent> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): WebhookEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookEventListPageAsync].
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

    /** A builder for [WebhookEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: WebhookEventListParams? = null
        private var response: WebhookEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookEventListPageAsync: WebhookEventListPageAsync) = apply {
            service = webhookEventListPageAsync.service
            streamHandlerExecutor = webhookEventListPageAsync.streamHandlerExecutor
            params = webhookEventListPageAsync.params
            response = webhookEventListPageAsync.response
        }

        fun service(service: WebhookEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookEventListPageAsync].
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
        fun build(): WebhookEventListPageAsync =
            WebhookEventListPageAsync(
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

        return /* spotless:off */ other is WebhookEventListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "WebhookEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
