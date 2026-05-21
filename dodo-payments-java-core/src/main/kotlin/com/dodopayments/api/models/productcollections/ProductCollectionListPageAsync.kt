// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.productcollections

import com.dodopayments.api.core.AutoPagerAsync
import com.dodopayments.api.core.PageAsync
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.services.async.ProductCollectionServiceAsync
import java.util.Objects
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrDefault
import kotlin.jvm.optionals.getOrNull

/** @see ProductCollectionServiceAsync.list */
class ProductCollectionListPageAsync
private constructor(
    private val service: ProductCollectionServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ProductCollectionListParams,
    private val response: ProductCollectionListPageResponse,
) : PageAsync<ProductCollectionListResponse> {

    /**
     * Delegates to [ProductCollectionListPageResponse], but gracefully handles missing data.
     *
     * @see ProductCollectionListPageResponse.items
     */
    override fun items(): List<ProductCollectionListResponse> =
        response._items().getOptional("items").getOrNull() ?: emptyList()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ProductCollectionListParams {
        val pageNumber = params.pageNumber().getOrDefault(1)
        return params.toBuilder().pageNumber(pageNumber + 1).build()
    }

    override fun nextPage(): CompletableFuture<ProductCollectionListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ProductCollectionListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ProductCollectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProductCollectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProductCollectionListPageAsync].
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

    /** A builder for [ProductCollectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProductCollectionServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ProductCollectionListParams? = null
        private var response: ProductCollectionListPageResponse? = null

        @JvmSynthetic
        internal fun from(productCollectionListPageAsync: ProductCollectionListPageAsync) = apply {
            service = productCollectionListPageAsync.service
            streamHandlerExecutor = productCollectionListPageAsync.streamHandlerExecutor
            params = productCollectionListPageAsync.params
            response = productCollectionListPageAsync.response
        }

        fun service(service: ProductCollectionServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProductCollectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProductCollectionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProductCollectionListPageAsync].
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
        fun build(): ProductCollectionListPageAsync =
            ProductCollectionListPageAsync(
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

        return other is ProductCollectionListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "ProductCollectionListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
