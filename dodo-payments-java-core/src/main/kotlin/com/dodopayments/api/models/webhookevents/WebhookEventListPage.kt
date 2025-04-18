// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhookevents

import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.blocking.WebhookEventService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see [WebhookEventService.list] */
class WebhookEventListPage
private constructor(
    private val service: WebhookEventService,
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

    fun getNextPage(): Optional<WebhookEventListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): WebhookEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): WebhookEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WebhookEventListPage].
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

    /** A builder for [WebhookEventListPage]. */
    class Builder internal constructor() {

        private var service: WebhookEventService? = null
        private var params: WebhookEventListParams? = null
        private var response: WebhookEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(webhookEventListPage: WebhookEventListPage) = apply {
            service = webhookEventListPage.service
            params = webhookEventListPage.params
            response = webhookEventListPage.response
        }

        fun service(service: WebhookEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WebhookEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WebhookEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WebhookEventListPage].
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
        fun build(): WebhookEventListPage =
            WebhookEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: WebhookEventListPage) : Iterable<WebhookEvent> {

        override fun iterator(): Iterator<WebhookEvent> = iterator {
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

        fun stream(): Stream<WebhookEvent> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WebhookEventListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "WebhookEventListPage{service=$service, params=$params, response=$response}"
}
