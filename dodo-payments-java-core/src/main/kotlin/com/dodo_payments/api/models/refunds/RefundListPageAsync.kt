// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.refunds

import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.services.async.RefundServiceAsync
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

class RefundListPageAsync
private constructor(
    private val refundsService: RefundServiceAsync,
    private val params: RefundListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun items(): List<Refund> = response().items()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RefundListPageAsync && refundsService == other.refundsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(refundsService, params, response) /* spotless:on */

    override fun toString() =
        "RefundListPageAsync{refundsService=$refundsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        return !items().isEmpty()
    }

    fun getNextPageParams(): Optional<RefundListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            RefundListParams.builder()
                .from(params)
                .pageNumber(params.pageNumber().orElse(0) + 1)
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<RefundListPageAsync>> {
        return getNextPageParams()
            .map { refundsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(refundsService: RefundServiceAsync, params: RefundListParams, response: Response) =
            RefundListPageAsync(refundsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("items") private val items: JsonField<List<Refund>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun items(): List<Refund> = items.getNullable("items") ?: listOf()

        @JsonProperty("items")
        fun _items(): Optional<JsonField<List<Refund>>> = Optional.ofNullable(items)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            items().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && items == other.items && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(items, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{items=$items, additionalProperties=$additionalProperties}"

        companion object {

            /** Returns a mutable builder for constructing an instance of [RefundListPageAsync]. */
            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var items: JsonField<List<Refund>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.items = page.items
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun items(items: List<Refund>) = items(JsonField.of(items))

            fun items(items: JsonField<List<Refund>>) = apply { this.items = items }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(items, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: RefundListPageAsync) {

        fun forEach(action: Predicate<Refund>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<RefundListPageAsync>>.forEach(
                action: (Refund) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Refund>> {
            val values = mutableListOf<Refund>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
