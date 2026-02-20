// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionListParams
private constructor(
    private val brandId: String?,
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val customerId: String?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val productId: String?,
    private val status: Status?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** filter by Brand id */
    fun brandId(): Optional<String> = Optional.ofNullable(brandId)

    /** Get events after this created time */
    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    /** Get events created before this time */
    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    /** Filter by customer id */
    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    /** Page number default is 0 */
    fun pageNumber(): Optional<Int> = Optional.ofNullable(pageNumber)

    /** Page size default is 10 max is 100 */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Filter by product id */
    fun productId(): Optional<String> = Optional.ofNullable(productId)

    /** Filter by status */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionListParams]. */
    class Builder internal constructor() {

        private var brandId: String? = null
        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var customerId: String? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var productId: String? = null
        private var status: Status? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionListParams: SubscriptionListParams) = apply {
            brandId = subscriptionListParams.brandId
            createdAtGte = subscriptionListParams.createdAtGte
            createdAtLte = subscriptionListParams.createdAtLte
            customerId = subscriptionListParams.customerId
            pageNumber = subscriptionListParams.pageNumber
            pageSize = subscriptionListParams.pageSize
            productId = subscriptionListParams.productId
            status = subscriptionListParams.status
            additionalHeaders = subscriptionListParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionListParams.additionalQueryParams.toBuilder()
        }

        /** filter by Brand id */
        fun brandId(brandId: String?) = apply { this.brandId = brandId }

        /** Alias for calling [Builder.brandId] with `brandId.orElse(null)`. */
        fun brandId(brandId: Optional<String>) = brandId(brandId.getOrNull())

        /** Get events after this created time */
        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Alias for calling [Builder.createdAtGte] with `createdAtGte.orElse(null)`. */
        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.getOrNull())

        /** Get events created before this time */
        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Alias for calling [Builder.createdAtLte] with `createdAtLte.orElse(null)`. */
        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.getOrNull())

        /** Filter by customer id */
        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        /** Alias for calling [Builder.customerId] with `customerId.orElse(null)`. */
        fun customerId(customerId: Optional<String>) = customerId(customerId.getOrNull())

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Int>) = pageNumber(pageNumber.getOrNull())

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /** Filter by product id */
        fun productId(productId: String?) = apply { this.productId = productId }

        /** Alias for calling [Builder.productId] with `productId.orElse(null)`. */
        fun productId(productId: Optional<String>) = productId(productId.getOrNull())

        /** Filter by status */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [SubscriptionListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionListParams =
            SubscriptionListParams(
                brandId,
                createdAtGte,
                createdAtLte,
                customerId,
                pageNumber,
                pageSize,
                productId,
                status,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                brandId?.let { put("brand_id", it) }
                createdAtGte?.let {
                    put("created_at_gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at_lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                customerId?.let { put("customer_id", it) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                productId?.let { put("product_id", it) }
                status?.let { put("status", it.toString()) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by status */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val PENDING = of("pending")

            @JvmField val ACTIVE = of("active")

            @JvmField val ON_HOLD = of("on_hold")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val FAILED = of("failed")

            @JvmField val EXPIRED = of("expired")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            ACTIVE,
            ON_HOLD,
            CANCELLED,
            FAILED,
            EXPIRED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            ACTIVE,
            ON_HOLD,
            CANCELLED,
            FAILED,
            EXPIRED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                ACTIVE -> Value.ACTIVE
                ON_HOLD -> Value.ON_HOLD
                CANCELLED -> Value.CANCELLED
                FAILED -> Value.FAILED
                EXPIRED -> Value.EXPIRED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                ACTIVE -> Known.ACTIVE
                ON_HOLD -> Known.ON_HOLD
                CANCELLED -> Known.CANCELLED
                FAILED -> Known.FAILED
                EXPIRED -> Known.EXPIRED
                else -> throw DodoPaymentsInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                DodoPaymentsInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: DodoPaymentsInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionListParams &&
            brandId == other.brandId &&
            createdAtGte == other.createdAtGte &&
            createdAtLte == other.createdAtLte &&
            customerId == other.customerId &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            productId == other.productId &&
            status == other.status &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            brandId,
            createdAtGte,
            createdAtLte,
            customerId,
            pageNumber,
            pageSize,
            productId,
            status,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SubscriptionListParams{brandId=$brandId, createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, customerId=$customerId, pageNumber=$pageNumber, pageSize=$pageSize, productId=$productId, status=$status, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
