// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.customers.wallets.ledgerentries

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerWalletTransaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val afterBalance: JsonField<Long>,
    private val amount: JsonField<Long>,
    private val beforeBalance: JsonField<Long>,
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customerId: JsonField<String>,
    private val eventType: JsonField<EventType>,
    private val isCredit: JsonField<Boolean>,
    private val reason: JsonField<String>,
    private val referenceObjectId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("after_balance")
        @ExcludeMissing
        afterBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("before_balance")
        @ExcludeMissing
        beforeBalance: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("event_type")
        @ExcludeMissing
        eventType: JsonField<EventType> = JsonMissing.of(),
        @JsonProperty("is_credit") @ExcludeMissing isCredit: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reference_object_id")
        @ExcludeMissing
        referenceObjectId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        afterBalance,
        amount,
        beforeBalance,
        businessId,
        createdAt,
        currency,
        customerId,
        eventType,
        isCredit,
        reason,
        referenceObjectId,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun afterBalance(): Long = afterBalance.getRequired("after_balance")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun beforeBalance(): Long = beforeBalance.getRequired("before_balance")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun eventType(): EventType = eventType.getRequired("event_type")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isCredit(): Boolean = isCredit.getRequired("is_credit")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): Optional<String> = reason.getOptional("reason")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun referenceObjectId(): Optional<String> = referenceObjectId.getOptional("reference_object_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [afterBalance].
     *
     * Unlike [afterBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("after_balance")
    @ExcludeMissing
    fun _afterBalance(): JsonField<Long> = afterBalance

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [beforeBalance].
     *
     * Unlike [beforeBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("before_balance")
    @ExcludeMissing
    fun _beforeBalance(): JsonField<Long> = beforeBalance

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [eventType].
     *
     * Unlike [eventType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType(): JsonField<EventType> = eventType

    /**
     * Returns the raw JSON value of [isCredit].
     *
     * Unlike [isCredit], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_credit") @ExcludeMissing fun _isCredit(): JsonField<Boolean> = isCredit

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [referenceObjectId].
     *
     * Unlike [referenceObjectId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("reference_object_id")
    @ExcludeMissing
    fun _referenceObjectId(): JsonField<String> = referenceObjectId

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerWalletTransaction].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .afterBalance()
         * .amount()
         * .beforeBalance()
         * .businessId()
         * .createdAt()
         * .currency()
         * .customerId()
         * .eventType()
         * .isCredit()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerWalletTransaction]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var afterBalance: JsonField<Long>? = null
        private var amount: JsonField<Long>? = null
        private var beforeBalance: JsonField<Long>? = null
        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customerId: JsonField<String>? = null
        private var eventType: JsonField<EventType>? = null
        private var isCredit: JsonField<Boolean>? = null
        private var reason: JsonField<String> = JsonMissing.of()
        private var referenceObjectId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerWalletTransaction: CustomerWalletTransaction) = apply {
            id = customerWalletTransaction.id
            afterBalance = customerWalletTransaction.afterBalance
            amount = customerWalletTransaction.amount
            beforeBalance = customerWalletTransaction.beforeBalance
            businessId = customerWalletTransaction.businessId
            createdAt = customerWalletTransaction.createdAt
            currency = customerWalletTransaction.currency
            customerId = customerWalletTransaction.customerId
            eventType = customerWalletTransaction.eventType
            isCredit = customerWalletTransaction.isCredit
            reason = customerWalletTransaction.reason
            referenceObjectId = customerWalletTransaction.referenceObjectId
            additionalProperties = customerWalletTransaction.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun afterBalance(afterBalance: Long) = afterBalance(JsonField.of(afterBalance))

        /**
         * Sets [Builder.afterBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.afterBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun afterBalance(afterBalance: JsonField<Long>) = apply { this.afterBalance = afterBalance }

        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun beforeBalance(beforeBalance: Long) = beforeBalance(JsonField.of(beforeBalance))

        /**
         * Sets [Builder.beforeBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beforeBalance] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun beforeBalance(beforeBalance: JsonField<Long>) = apply {
            this.beforeBalance = beforeBalance
        }

        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun eventType(eventType: EventType) = eventType(JsonField.of(eventType))

        /**
         * Sets [Builder.eventType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.eventType] with a well-typed [EventType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun eventType(eventType: JsonField<EventType>) = apply { this.eventType = eventType }

        fun isCredit(isCredit: Boolean) = isCredit(JsonField.of(isCredit))

        /**
         * Sets [Builder.isCredit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isCredit] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isCredit(isCredit: JsonField<Boolean>) = apply { this.isCredit = isCredit }

        fun reason(reason: String?) = reason(JsonField.ofNullable(reason))

        /** Alias for calling [Builder.reason] with `reason.orElse(null)`. */
        fun reason(reason: Optional<String>) = reason(reason.getOrNull())

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        fun referenceObjectId(referenceObjectId: String?) =
            referenceObjectId(JsonField.ofNullable(referenceObjectId))

        /** Alias for calling [Builder.referenceObjectId] with `referenceObjectId.orElse(null)`. */
        fun referenceObjectId(referenceObjectId: Optional<String>) =
            referenceObjectId(referenceObjectId.getOrNull())

        /**
         * Sets [Builder.referenceObjectId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.referenceObjectId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun referenceObjectId(referenceObjectId: JsonField<String>) = apply {
            this.referenceObjectId = referenceObjectId
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [CustomerWalletTransaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .afterBalance()
         * .amount()
         * .beforeBalance()
         * .businessId()
         * .createdAt()
         * .currency()
         * .customerId()
         * .eventType()
         * .isCredit()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerWalletTransaction =
            CustomerWalletTransaction(
                checkRequired("id", id),
                checkRequired("afterBalance", afterBalance),
                checkRequired("amount", amount),
                checkRequired("beforeBalance", beforeBalance),
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customerId", customerId),
                checkRequired("eventType", eventType),
                checkRequired("isCredit", isCredit),
                reason,
                referenceObjectId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerWalletTransaction = apply {
        if (validated) {
            return@apply
        }

        id()
        afterBalance()
        amount()
        beforeBalance()
        businessId()
        createdAt()
        currency().validate()
        customerId()
        eventType().validate()
        isCredit()
        reason()
        referenceObjectId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (afterBalance.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (if (beforeBalance.asKnown().isPresent) 1 else 0) +
            (if (businessId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (eventType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (isCredit.asKnown().isPresent) 1 else 0) +
            (if (reason.asKnown().isPresent) 1 else 0) +
            (if (referenceObjectId.asKnown().isPresent) 1 else 0)

    class EventType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAYMENT = of("payment")

            @JvmField val PAYMENT_REVERSAL = of("payment_reversal")

            @JvmField val REFUND = of("refund")

            @JvmField val REFUND_REVERSAL = of("refund_reversal")

            @JvmField val DISPUTE = of("dispute")

            @JvmField val DISPUTE_REVERSAL = of("dispute_reversal")

            @JvmField val MERCHANT_ADJUSTMENT = of("merchant_adjustment")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            PAYMENT,
            PAYMENT_REVERSAL,
            REFUND,
            REFUND_REVERSAL,
            DISPUTE,
            DISPUTE_REVERSAL,
            MERCHANT_ADJUSTMENT,
        }

        /**
         * An enum containing [EventType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EventType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT,
            PAYMENT_REVERSAL,
            REFUND,
            REFUND_REVERSAL,
            DISPUTE,
            DISPUTE_REVERSAL,
            MERCHANT_ADJUSTMENT,
            /**
             * An enum member indicating that [EventType] was instantiated with an unknown value.
             */
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
                PAYMENT -> Value.PAYMENT
                PAYMENT_REVERSAL -> Value.PAYMENT_REVERSAL
                REFUND -> Value.REFUND
                REFUND_REVERSAL -> Value.REFUND_REVERSAL
                DISPUTE -> Value.DISPUTE
                DISPUTE_REVERSAL -> Value.DISPUTE_REVERSAL
                MERCHANT_ADJUSTMENT -> Value.MERCHANT_ADJUSTMENT
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
                PAYMENT -> Known.PAYMENT
                PAYMENT_REVERSAL -> Known.PAYMENT_REVERSAL
                REFUND -> Known.REFUND
                REFUND_REVERSAL -> Known.REFUND_REVERSAL
                DISPUTE -> Known.DISPUTE
                DISPUTE_REVERSAL -> Known.DISPUTE_REVERSAL
                MERCHANT_ADJUSTMENT -> Known.MERCHANT_ADJUSTMENT
                else -> throw DodoPaymentsInvalidDataException("Unknown EventType: $value")
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

        fun validate(): EventType = apply {
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

            return other is EventType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerWalletTransaction &&
            id == other.id &&
            afterBalance == other.afterBalance &&
            amount == other.amount &&
            beforeBalance == other.beforeBalance &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            customerId == other.customerId &&
            eventType == other.eventType &&
            isCredit == other.isCredit &&
            reason == other.reason &&
            referenceObjectId == other.referenceObjectId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            afterBalance,
            amount,
            beforeBalance,
            businessId,
            createdAt,
            currency,
            customerId,
            eventType,
            isCredit,
            reason,
            referenceObjectId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerWalletTransaction{id=$id, afterBalance=$afterBalance, amount=$amount, beforeBalance=$beforeBalance, businessId=$businessId, createdAt=$createdAt, currency=$currency, customerId=$customerId, eventType=$eventType, isCredit=$isCredit, reason=$reason, referenceObjectId=$referenceObjectId, additionalProperties=$additionalProperties}"
}
