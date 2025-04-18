// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.WebhookEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [WebhookEventServiceAsync.list] */
class WebhookEventListPageAsync
private constructor(
    private val service: WebhookEventServiceAsync,
    private val params: WebhookEventListParams,
    private val response: WebhookEventListPageResponse,
) {

    /**
     * Delegates to [WebhookEventListPageResponse], but gracefully handles missing data.
     *
     * @see [WebhookEventListPageResponse.items]
     */
    fun items(): List<WebhookEvent> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    fun hasNextPage(): Boolean = items().isNotEmpty()

    fun getNextPageParams(): Optional<WebhookEventListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        val pageNumber = params.pageNumber().getOrDefault(1)
        return Optional.of(params.toBuilder().pageNumber(pageNumber + 1).build())
    }

    fun getNextPage(): CompletableFuture<Optional<WebhookEventListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WebhookEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: WebhookEventServiceAsync? = null
        private var params: WebhookEventListParams? = null
        private var response: WebhookEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookEventListPageAsync: WebhookEventListPageAsync) = apply {
            service = webhookEventListPageAsync.service
            params = webhookEventListPageAsync.params
            response = webhookEventListPageAsync.response
        }

        fun service(service: WebhookEventServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WebhookEventListPageAsync =
            WebhookEventListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: WebhookEventListPageAsync) {

        fun forEach(action: Predicate<WebhookEvent>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<WebhookEventListPageAsync>>.forEach(
                action: (WebhookEvent) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<WebhookEvent>> {
            val values = mutableListOf<WebhookEvent>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookEventListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "WebhookEventListPageAsync{service=$service, params=$params, response=$response}"
}
