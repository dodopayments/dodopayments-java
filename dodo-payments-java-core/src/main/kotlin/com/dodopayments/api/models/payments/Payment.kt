// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.refunds.Refund
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Payment
private constructor(
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val disputes: JsonField<List<Dispute>>,
    private val metadata: JsonField<Metadata>,
    private val paymentId: JsonField<String>,
    private val refunds: JsonField<List<Refund>>,
    private val settlementAmount: JsonField<Long>,
    private val settlementCurrency: JsonField<SettlementCurrency>,
    private val totalAmount: JsonField<Long>,
    private val discountId: JsonField<String>,
    private val errorMessage: JsonField<String>,
    private val paymentLink: JsonField<String>,
    private val paymentMethod: JsonField<String>,
    private val paymentMethodType: JsonField<String>,
    private val productCart: JsonField<List<ProductCart>>,
    private val settlementTax: JsonField<Long>,
    private val status: JsonField<IntentStatus>,
    private val subscriptionId: JsonField<String>,
    private val tax: JsonField<Long>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
        @JsonProperty("disputes")
        @ExcludeMissing
        disputes: JsonField<List<Dispute>> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("payment_id") @ExcludeMissing paymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("refunds")
        @ExcludeMissing
        refunds: JsonField<List<Refund>> = JsonMissing.of(),
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        settlementAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        settlementCurrency: JsonField<SettlementCurrency> = JsonMissing.of(),
        @JsonProperty("total_amount")
        @ExcludeMissing
        totalAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_link")
        @ExcludeMissing
        paymentLink: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method")
        @ExcludeMissing
        paymentMethod: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payment_method_type")
        @ExcludeMissing
        paymentMethodType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_cart")
        @ExcludeMissing
        productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
        @JsonProperty("settlement_tax")
        @ExcludeMissing
        settlementTax: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<IntentStatus> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing tax: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        businessId,
        createdAt,
        currency,
        customer,
        disputes,
        metadata,
        paymentId,
        refunds,
        settlementAmount,
        settlementCurrency,
        totalAmount,
        discountId,
        errorMessage,
        paymentLink,
        paymentMethod,
        paymentMethodType,
        productCart,
        settlementTax,
        status,
        subscriptionId,
        tax,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Identifier of the business associated with the payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Timestamp when the payment was created
     *
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
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * List of disputes associated with this payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun disputes(): List<Dispute> = disputes.getRequired("disputes")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Unique identifier for the payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentId(): String = paymentId.getRequired("payment_id")

    /**
     * List of refunds issued for this payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun refunds(): List<Refund> = refunds.getRequired("refunds")

    /**
     * The amount that will be credited to your Dodo balance after currency conversion and
     * processing. Especially relevant for adaptive pricing where the customer's payment currency
     * differs from your settlement currency.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementAmount(): Long = settlementAmount.getRequired("settlement_amount")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun settlementCurrency(): SettlementCurrency =
        settlementCurrency.getRequired("settlement_currency")

    /**
     * Total amount charged to the customer including tax, in smallest currency unit (e.g. cents)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    /**
     * The discount id if discount is applied
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountId(): Optional<String> = discountId.getOptional("discount_id")

    /**
     * An error message if the payment failed
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

    /**
     * Checkout URL
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentLink(): Optional<String> = paymentLink.getOptional("payment_link")

    /**
     * Payment method used by customer (e.g. "card", "bank_transfer")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethod(): Optional<String> = paymentMethod.getOptional("payment_method")

    /**
     * Specific type of payment method (e.g. "visa", "mastercard")
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun paymentMethodType(): Optional<String> = paymentMethodType.getOptional("payment_method_type")

    /**
     * List of products purchased in a one-time payment
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun productCart(): Optional<List<ProductCart>> = productCart.getOptional("product_cart")

    /**
     * This represents the portion of settlement_amount that corresponds to taxes collected.
     * Especially relevant for adaptive pricing where the tax component must be tracked separately
     * in your Dodo balance.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settlementTax(): Optional<Long> = settlementTax.getOptional("settlement_tax")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<IntentStatus> = status.getOptional("status")

    /**
     * Identifier of the subscription if payment is part of a subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscription_id")

    /**
     * Amount of tax collected in smallest currency unit (e.g. cents)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun tax(): Optional<Long> = tax.getOptional("tax")

    /**
     * Timestamp when the payment was last updated
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

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
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer")
    @ExcludeMissing
    fun _customer(): JsonField<CustomerLimitedDetails> = customer

    /**
     * Returns the raw JSON value of [disputes].
     *
     * Unlike [disputes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("disputes") @ExcludeMissing fun _disputes(): JsonField<List<Dispute>> = disputes

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [paymentId].
     *
     * Unlike [paymentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    /**
     * Returns the raw JSON value of [refunds].
     *
     * Unlike [refunds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("refunds") @ExcludeMissing fun _refunds(): JsonField<List<Refund>> = refunds

    /**
     * Returns the raw JSON value of [settlementAmount].
     *
     * Unlike [settlementAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_amount")
    @ExcludeMissing
    fun _settlementAmount(): JsonField<Long> = settlementAmount

    /**
     * Returns the raw JSON value of [settlementCurrency].
     *
     * Unlike [settlementCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("settlement_currency")
    @ExcludeMissing
    fun _settlementCurrency(): JsonField<SettlementCurrency> = settlementCurrency

    /**
     * Returns the raw JSON value of [totalAmount].
     *
     * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    /**
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /**
     * Returns the raw JSON value of [errorMessage].
     *
     * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("error_message")
    @ExcludeMissing
    fun _errorMessage(): JsonField<String> = errorMessage

    /**
     * Returns the raw JSON value of [paymentLink].
     *
     * Unlike [paymentLink], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_link")
    @ExcludeMissing
    fun _paymentLink(): JsonField<String> = paymentLink

    /**
     * Returns the raw JSON value of [paymentMethod].
     *
     * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    /**
     * Returns the raw JSON value of [paymentMethodType].
     *
     * Unlike [paymentMethodType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_method_type")
    @ExcludeMissing
    fun _paymentMethodType(): JsonField<String> = paymentMethodType

    /**
     * Returns the raw JSON value of [productCart].
     *
     * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

    /**
     * Returns the raw JSON value of [settlementTax].
     *
     * Unlike [settlementTax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settlement_tax")
    @ExcludeMissing
    fun _settlementTax(): JsonField<Long> = settlementTax

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [tax].
     *
     * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Long> = tax

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
         * Returns a mutable builder for constructing an instance of [Payment].
         *
         * The following fields are required:
         * ```java
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputes()
         * .metadata()
         * .paymentId()
         * .refunds()
         * .settlementAmount()
         * .settlementCurrency()
         * .totalAmount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Payment]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var disputes: JsonField<MutableList<Dispute>>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var refunds: JsonField<MutableList<Refund>>? = null
        private var settlementAmount: JsonField<Long>? = null
        private var settlementCurrency: JsonField<SettlementCurrency>? = null
        private var totalAmount: JsonField<Long>? = null
        private var discountId: JsonField<String> = JsonMissing.of()
        private var errorMessage: JsonField<String> = JsonMissing.of()
        private var paymentLink: JsonField<String> = JsonMissing.of()
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var paymentMethodType: JsonField<String> = JsonMissing.of()
        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var settlementTax: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<IntentStatus> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var tax: JsonField<Long> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(payment: Payment) = apply {
            businessId = payment.businessId
            createdAt = payment.createdAt
            currency = payment.currency
            customer = payment.customer
            disputes = payment.disputes.map { it.toMutableList() }
            metadata = payment.metadata
            paymentId = payment.paymentId
            refunds = payment.refunds.map { it.toMutableList() }
            settlementAmount = payment.settlementAmount
            settlementCurrency = payment.settlementCurrency
            totalAmount = payment.totalAmount
            discountId = payment.discountId
            errorMessage = payment.errorMessage
            paymentLink = payment.paymentLink
            paymentMethod = payment.paymentMethod
            paymentMethodType = payment.paymentMethodType
            productCart = payment.productCart.map { it.toMutableList() }
            settlementTax = payment.settlementTax
            status = payment.status
            subscriptionId = payment.subscriptionId
            tax = payment.tax
            updatedAt = payment.updatedAt
            additionalProperties = payment.additionalProperties.toMutableMap()
        }

        /** Identifier of the business associated with the payment */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the payment was created */
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

        fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerLimitedDetails]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
            this.customer = customer
        }

        /** List of disputes associated with this payment */
        fun disputes(disputes: List<Dispute>) = disputes(JsonField.of(disputes))

        /**
         * Sets [Builder.disputes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disputes] with a well-typed `List<Dispute>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun disputes(disputes: JsonField<List<Dispute>>) = apply {
            this.disputes = disputes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Dispute] to [disputes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDispute(dispute: Dispute) = apply {
            disputes =
                (disputes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("disputes", it).add(dispute)
                }
        }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Unique identifier for the payment */
        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        /**
         * Sets [Builder.paymentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        /** List of refunds issued for this payment */
        fun refunds(refunds: List<Refund>) = refunds(JsonField.of(refunds))

        /**
         * Sets [Builder.refunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.refunds] with a well-typed `List<Refund>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun refunds(refunds: JsonField<List<Refund>>) = apply {
            this.refunds = refunds.map { it.toMutableList() }
        }

        /**
         * Adds a single [Refund] to [refunds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRefund(refund: Refund) = apply {
            refunds =
                (refunds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("refunds", it).add(refund)
                }
        }

        /**
         * The amount that will be credited to your Dodo balance after currency conversion and
         * processing. Especially relevant for adaptive pricing where the customer's payment
         * currency differs from your settlement currency.
         */
        fun settlementAmount(settlementAmount: Long) =
            settlementAmount(JsonField.of(settlementAmount))

        /**
         * Sets [Builder.settlementAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settlementAmount(settlementAmount: JsonField<Long>) = apply {
            this.settlementAmount = settlementAmount
        }

        fun settlementCurrency(settlementCurrency: SettlementCurrency) =
            settlementCurrency(JsonField.of(settlementCurrency))

        /**
         * Sets [Builder.settlementCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementCurrency] with a well-typed
         * [SettlementCurrency] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun settlementCurrency(settlementCurrency: JsonField<SettlementCurrency>) = apply {
            this.settlementCurrency = settlementCurrency
        }

        /**
         * Total amount charged to the customer including tax, in smallest currency unit (e.g.
         * cents)
         */
        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        /**
         * Sets [Builder.totalAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        /** The discount id if discount is applied */
        fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

        /** Alias for calling [Builder.discountId] with `discountId.orElse(null)`. */
        fun discountId(discountId: Optional<String>) = discountId(discountId.getOrNull())

        /**
         * Sets [Builder.discountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

        /** An error message if the payment failed */
        fun errorMessage(errorMessage: String?) = errorMessage(JsonField.ofNullable(errorMessage))

        /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
        fun errorMessage(errorMessage: Optional<String>) = errorMessage(errorMessage.getOrNull())

        /**
         * Sets [Builder.errorMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errorMessage] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errorMessage(errorMessage: JsonField<String>) = apply {
            this.errorMessage = errorMessage
        }

        /** Checkout URL */
        fun paymentLink(paymentLink: String?) = paymentLink(JsonField.ofNullable(paymentLink))

        /** Alias for calling [Builder.paymentLink] with `paymentLink.orElse(null)`. */
        fun paymentLink(paymentLink: Optional<String>) = paymentLink(paymentLink.getOrNull())

        /**
         * Sets [Builder.paymentLink] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentLink] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentLink(paymentLink: JsonField<String>) = apply { this.paymentLink = paymentLink }

        /** Payment method used by customer (e.g. "card", "bank_transfer") */
        fun paymentMethod(paymentMethod: String?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        /** Alias for calling [Builder.paymentMethod] with `paymentMethod.orElse(null)`. */
        fun paymentMethod(paymentMethod: Optional<String>) =
            paymentMethod(paymentMethod.getOrNull())

        /**
         * Sets [Builder.paymentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethod] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        /** Specific type of payment method (e.g. "visa", "mastercard") */
        fun paymentMethodType(paymentMethodType: String?) =
            paymentMethodType(JsonField.ofNullable(paymentMethodType))

        /** Alias for calling [Builder.paymentMethodType] with `paymentMethodType.orElse(null)`. */
        fun paymentMethodType(paymentMethodType: Optional<String>) =
            paymentMethodType(paymentMethodType.getOrNull())

        /**
         * Sets [Builder.paymentMethodType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentMethodType] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentMethodType(paymentMethodType: JsonField<String>) = apply {
            this.paymentMethodType = paymentMethodType
        }

        /** List of products purchased in a one-time payment */
        fun productCart(productCart: List<ProductCart>?) =
            productCart(JsonField.ofNullable(productCart))

        /** Alias for calling [Builder.productCart] with `productCart.orElse(null)`. */
        fun productCart(productCart: Optional<List<ProductCart>>) =
            productCart(productCart.getOrNull())

        /**
         * Sets [Builder.productCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productCart] with a well-typed `List<ProductCart>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productCart(productCart: JsonField<List<ProductCart>>) = apply {
            this.productCart = productCart.map { it.toMutableList() }
        }

        /**
         * Adds a single [ProductCart] to [Builder.productCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProductCart(productCart: ProductCart) = apply {
            this.productCart =
                (this.productCart ?: JsonField.of(mutableListOf())).also {
                    checkKnown("productCart", it).add(productCart)
                }
        }

        /**
         * This represents the portion of settlement_amount that corresponds to taxes collected.
         * Especially relevant for adaptive pricing where the tax component must be tracked
         * separately in your Dodo balance.
         */
        fun settlementTax(settlementTax: Long?) = settlementTax(JsonField.ofNullable(settlementTax))

        /**
         * Alias for [Builder.settlementTax].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun settlementTax(settlementTax: Long) = settlementTax(settlementTax as Long?)

        /** Alias for calling [Builder.settlementTax] with `settlementTax.orElse(null)`. */
        fun settlementTax(settlementTax: Optional<Long>) = settlementTax(settlementTax.getOrNull())

        /**
         * Sets [Builder.settlementTax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settlementTax] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun settlementTax(settlementTax: JsonField<Long>) = apply {
            this.settlementTax = settlementTax
        }

        fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<IntentStatus>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [IntentStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun status(status: JsonField<IntentStatus>) = apply { this.status = status }

        /** Identifier of the subscription if payment is part of a subscription */
        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

        /**
         * Sets [Builder.subscriptionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
        }

        /** Amount of tax collected in smallest currency unit (e.g. cents) */
        fun tax(tax: Long?) = tax(JsonField.ofNullable(tax))

        /**
         * Alias for [Builder.tax].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun tax(tax: Long) = tax(tax as Long?)

        /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
        fun tax(tax: Optional<Long>) = tax(tax.getOrNull())

        /**
         * Sets [Builder.tax] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tax] with a well-typed [Long] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tax(tax: JsonField<Long>) = apply { this.tax = tax }

        /** Timestamp when the payment was last updated */
        fun updatedAt(updatedAt: OffsetDateTime?) = updatedAt(JsonField.ofNullable(updatedAt))

        /** Alias for calling [Builder.updatedAt] with `updatedAt.orElse(null)`. */
        fun updatedAt(updatedAt: Optional<OffsetDateTime>) = updatedAt(updatedAt.getOrNull())

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Payment].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessId()
         * .createdAt()
         * .currency()
         * .customer()
         * .disputes()
         * .metadata()
         * .paymentId()
         * .refunds()
         * .settlementAmount()
         * .settlementCurrency()
         * .totalAmount()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Payment =
            Payment(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("disputes", disputes).map { it.toImmutable() },
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("refunds", refunds).map { it.toImmutable() },
                checkRequired("settlementAmount", settlementAmount),
                checkRequired("settlementCurrency", settlementCurrency),
                checkRequired("totalAmount", totalAmount),
                discountId,
                errorMessage,
                paymentLink,
                paymentMethod,
                paymentMethodType,
                (productCart ?: JsonMissing.of()).map { it.toImmutable() },
                settlementTax,
                status,
                subscriptionId,
                tax,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Payment = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        currency().validate()
        customer().validate()
        disputes().forEach { it.validate() }
        metadata().validate()
        paymentId()
        refunds().forEach { it.validate() }
        settlementAmount()
        settlementCurrency().validate()
        totalAmount()
        discountId()
        errorMessage()
        paymentLink()
        paymentMethod()
        paymentMethodType()
        productCart().ifPresent { it.forEach { it.validate() } }
        settlementTax()
        status().ifPresent { it.validate() }
        subscriptionId()
        tax()
        updatedAt()
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
        (if (businessId.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (disputes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (paymentId.asKnown().isPresent) 1 else 0) +
            (refunds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (settlementAmount.asKnown().isPresent) 1 else 0) +
            (settlementCurrency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (totalAmount.asKnown().isPresent) 1 else 0) +
            (if (discountId.asKnown().isPresent) 1 else 0) +
            (if (errorMessage.asKnown().isPresent) 1 else 0) +
            (if (paymentLink.asKnown().isPresent) 1 else 0) +
            (if (paymentMethod.asKnown().isPresent) 1 else 0) +
            (if (paymentMethodType.asKnown().isPresent) 1 else 0) +
            (productCart.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (settlementTax.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (if (tax.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0)

    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AED = of("AED")

            @JvmField val ALL = of("ALL")

            @JvmField val AMD = of("AMD")

            @JvmField val ANG = of("ANG")

            @JvmField val AOA = of("AOA")

            @JvmField val ARS = of("ARS")

            @JvmField val AUD = of("AUD")

            @JvmField val AWG = of("AWG")

            @JvmField val AZN = of("AZN")

            @JvmField val BAM = of("BAM")

            @JvmField val BBD = of("BBD")

            @JvmField val BDT = of("BDT")

            @JvmField val BGN = of("BGN")

            @JvmField val BHD = of("BHD")

            @JvmField val BIF = of("BIF")

            @JvmField val BMD = of("BMD")

            @JvmField val BND = of("BND")

            @JvmField val BOB = of("BOB")

            @JvmField val BRL = of("BRL")

            @JvmField val BSD = of("BSD")

            @JvmField val BWP = of("BWP")

            @JvmField val BYN = of("BYN")

            @JvmField val BZD = of("BZD")

            @JvmField val CAD = of("CAD")

            @JvmField val CHF = of("CHF")

            @JvmField val CLP = of("CLP")

            @JvmField val CNY = of("CNY")

            @JvmField val COP = of("COP")

            @JvmField val CRC = of("CRC")

            @JvmField val CUP = of("CUP")

            @JvmField val CVE = of("CVE")

            @JvmField val CZK = of("CZK")

            @JvmField val DJF = of("DJF")

            @JvmField val DKK = of("DKK")

            @JvmField val DOP = of("DOP")

            @JvmField val DZD = of("DZD")

            @JvmField val EGP = of("EGP")

            @JvmField val ETB = of("ETB")

            @JvmField val EUR = of("EUR")

            @JvmField val FJD = of("FJD")

            @JvmField val FKP = of("FKP")

            @JvmField val GBP = of("GBP")

            @JvmField val GEL = of("GEL")

            @JvmField val GHS = of("GHS")

            @JvmField val GIP = of("GIP")

            @JvmField val GMD = of("GMD")

            @JvmField val GNF = of("GNF")

            @JvmField val GTQ = of("GTQ")

            @JvmField val GYD = of("GYD")

            @JvmField val HKD = of("HKD")

            @JvmField val HNL = of("HNL")

            @JvmField val HRK = of("HRK")

            @JvmField val HTG = of("HTG")

            @JvmField val HUF = of("HUF")

            @JvmField val IDR = of("IDR")

            @JvmField val ILS = of("ILS")

            @JvmField val INR = of("INR")

            @JvmField val IQD = of("IQD")

            @JvmField val JMD = of("JMD")

            @JvmField val JOD = of("JOD")

            @JvmField val JPY = of("JPY")

            @JvmField val KES = of("KES")

            @JvmField val KGS = of("KGS")

            @JvmField val KHR = of("KHR")

            @JvmField val KMF = of("KMF")

            @JvmField val KRW = of("KRW")

            @JvmField val KWD = of("KWD")

            @JvmField val KYD = of("KYD")

            @JvmField val KZT = of("KZT")

            @JvmField val LAK = of("LAK")

            @JvmField val LBP = of("LBP")

            @JvmField val LKR = of("LKR")

            @JvmField val LRD = of("LRD")

            @JvmField val LSL = of("LSL")

            @JvmField val LYD = of("LYD")

            @JvmField val MAD = of("MAD")

            @JvmField val MDL = of("MDL")

            @JvmField val MGA = of("MGA")

            @JvmField val MKD = of("MKD")

            @JvmField val MMK = of("MMK")

            @JvmField val MNT = of("MNT")

            @JvmField val MOP = of("MOP")

            @JvmField val MRU = of("MRU")

            @JvmField val MUR = of("MUR")

            @JvmField val MVR = of("MVR")

            @JvmField val MWK = of("MWK")

            @JvmField val MXN = of("MXN")

            @JvmField val MYR = of("MYR")

            @JvmField val MZN = of("MZN")

            @JvmField val NAD = of("NAD")

            @JvmField val NGN = of("NGN")

            @JvmField val NIO = of("NIO")

            @JvmField val NOK = of("NOK")

            @JvmField val NPR = of("NPR")

            @JvmField val NZD = of("NZD")

            @JvmField val OMR = of("OMR")

            @JvmField val PAB = of("PAB")

            @JvmField val PEN = of("PEN")

            @JvmField val PGK = of("PGK")

            @JvmField val PHP = of("PHP")

            @JvmField val PKR = of("PKR")

            @JvmField val PLN = of("PLN")

            @JvmField val PYG = of("PYG")

            @JvmField val QAR = of("QAR")

            @JvmField val RON = of("RON")

            @JvmField val RSD = of("RSD")

            @JvmField val RUB = of("RUB")

            @JvmField val RWF = of("RWF")

            @JvmField val SAR = of("SAR")

            @JvmField val SBD = of("SBD")

            @JvmField val SCR = of("SCR")

            @JvmField val SEK = of("SEK")

            @JvmField val SGD = of("SGD")

            @JvmField val SHP = of("SHP")

            @JvmField val SLE = of("SLE")

            @JvmField val SLL = of("SLL")

            @JvmField val SOS = of("SOS")

            @JvmField val SRD = of("SRD")

            @JvmField val SSP = of("SSP")

            @JvmField val STN = of("STN")

            @JvmField val SVC = of("SVC")

            @JvmField val SZL = of("SZL")

            @JvmField val THB = of("THB")

            @JvmField val TND = of("TND")

            @JvmField val TOP = of("TOP")

            @JvmField val TRY = of("TRY")

            @JvmField val TTD = of("TTD")

            @JvmField val TWD = of("TWD")

            @JvmField val TZS = of("TZS")

            @JvmField val UAH = of("UAH")

            @JvmField val UGX = of("UGX")

            @JvmField val USD = of("USD")

            @JvmField val UYU = of("UYU")

            @JvmField val UZS = of("UZS")

            @JvmField val VES = of("VES")

            @JvmField val VND = of("VND")

            @JvmField val VUV = of("VUV")

            @JvmField val WST = of("WST")

            @JvmField val XAF = of("XAF")

            @JvmField val XCD = of("XCD")

            @JvmField val XOF = of("XOF")

            @JvmField val XPF = of("XPF")

            @JvmField val YER = of("YER")

            @JvmField val ZAR = of("ZAR")

            @JvmField val ZMW = of("ZMW")

            @JvmStatic fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            AED,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BRL,
            BSD,
            BWP,
            BYN,
            BZD,
            CAD,
            CHF,
            CLP,
            CNY,
            COP,
            CRC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SEK,
            SGD,
            SHP,
            SLE,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SZL,
            THB,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            UYU,
            UZS,
            VES,
            VND,
            VUV,
            WST,
            XAF,
            XCD,
            XOF,
            XPF,
            YER,
            ZAR,
            ZMW,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AED,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BRL,
            BSD,
            BWP,
            BYN,
            BZD,
            CAD,
            CHF,
            CLP,
            CNY,
            COP,
            CRC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SEK,
            SGD,
            SHP,
            SLE,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SZL,
            THB,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            UYU,
            UZS,
            VES,
            VND,
            VUV,
            WST,
            XAF,
            XCD,
            XOF,
            XPF,
            YER,
            ZAR,
            ZMW,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                AED -> Value.AED
                ALL -> Value.ALL
                AMD -> Value.AMD
                ANG -> Value.ANG
                AOA -> Value.AOA
                ARS -> Value.ARS
                AUD -> Value.AUD
                AWG -> Value.AWG
                AZN -> Value.AZN
                BAM -> Value.BAM
                BBD -> Value.BBD
                BDT -> Value.BDT
                BGN -> Value.BGN
                BHD -> Value.BHD
                BIF -> Value.BIF
                BMD -> Value.BMD
                BND -> Value.BND
                BOB -> Value.BOB
                BRL -> Value.BRL
                BSD -> Value.BSD
                BWP -> Value.BWP
                BYN -> Value.BYN
                BZD -> Value.BZD
                CAD -> Value.CAD
                CHF -> Value.CHF
                CLP -> Value.CLP
                CNY -> Value.CNY
                COP -> Value.COP
                CRC -> Value.CRC
                CUP -> Value.CUP
                CVE -> Value.CVE
                CZK -> Value.CZK
                DJF -> Value.DJF
                DKK -> Value.DKK
                DOP -> Value.DOP
                DZD -> Value.DZD
                EGP -> Value.EGP
                ETB -> Value.ETB
                EUR -> Value.EUR
                FJD -> Value.FJD
                FKP -> Value.FKP
                GBP -> Value.GBP
                GEL -> Value.GEL
                GHS -> Value.GHS
                GIP -> Value.GIP
                GMD -> Value.GMD
                GNF -> Value.GNF
                GTQ -> Value.GTQ
                GYD -> Value.GYD
                HKD -> Value.HKD
                HNL -> Value.HNL
                HRK -> Value.HRK
                HTG -> Value.HTG
                HUF -> Value.HUF
                IDR -> Value.IDR
                ILS -> Value.ILS
                INR -> Value.INR
                IQD -> Value.IQD
                JMD -> Value.JMD
                JOD -> Value.JOD
                JPY -> Value.JPY
                KES -> Value.KES
                KGS -> Value.KGS
                KHR -> Value.KHR
                KMF -> Value.KMF
                KRW -> Value.KRW
                KWD -> Value.KWD
                KYD -> Value.KYD
                KZT -> Value.KZT
                LAK -> Value.LAK
                LBP -> Value.LBP
                LKR -> Value.LKR
                LRD -> Value.LRD
                LSL -> Value.LSL
                LYD -> Value.LYD
                MAD -> Value.MAD
                MDL -> Value.MDL
                MGA -> Value.MGA
                MKD -> Value.MKD
                MMK -> Value.MMK
                MNT -> Value.MNT
                MOP -> Value.MOP
                MRU -> Value.MRU
                MUR -> Value.MUR
                MVR -> Value.MVR
                MWK -> Value.MWK
                MXN -> Value.MXN
                MYR -> Value.MYR
                MZN -> Value.MZN
                NAD -> Value.NAD
                NGN -> Value.NGN
                NIO -> Value.NIO
                NOK -> Value.NOK
                NPR -> Value.NPR
                NZD -> Value.NZD
                OMR -> Value.OMR
                PAB -> Value.PAB
                PEN -> Value.PEN
                PGK -> Value.PGK
                PHP -> Value.PHP
                PKR -> Value.PKR
                PLN -> Value.PLN
                PYG -> Value.PYG
                QAR -> Value.QAR
                RON -> Value.RON
                RSD -> Value.RSD
                RUB -> Value.RUB
                RWF -> Value.RWF
                SAR -> Value.SAR
                SBD -> Value.SBD
                SCR -> Value.SCR
                SEK -> Value.SEK
                SGD -> Value.SGD
                SHP -> Value.SHP
                SLE -> Value.SLE
                SLL -> Value.SLL
                SOS -> Value.SOS
                SRD -> Value.SRD
                SSP -> Value.SSP
                STN -> Value.STN
                SVC -> Value.SVC
                SZL -> Value.SZL
                THB -> Value.THB
                TND -> Value.TND
                TOP -> Value.TOP
                TRY -> Value.TRY
                TTD -> Value.TTD
                TWD -> Value.TWD
                TZS -> Value.TZS
                UAH -> Value.UAH
                UGX -> Value.UGX
                USD -> Value.USD
                UYU -> Value.UYU
                UZS -> Value.UZS
                VES -> Value.VES
                VND -> Value.VND
                VUV -> Value.VUV
                WST -> Value.WST
                XAF -> Value.XAF
                XCD -> Value.XCD
                XOF -> Value.XOF
                XPF -> Value.XPF
                YER -> Value.YER
                ZAR -> Value.ZAR
                ZMW -> Value.ZMW
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
                AED -> Known.AED
                ALL -> Known.ALL
                AMD -> Known.AMD
                ANG -> Known.ANG
                AOA -> Known.AOA
                ARS -> Known.ARS
                AUD -> Known.AUD
                AWG -> Known.AWG
                AZN -> Known.AZN
                BAM -> Known.BAM
                BBD -> Known.BBD
                BDT -> Known.BDT
                BGN -> Known.BGN
                BHD -> Known.BHD
                BIF -> Known.BIF
                BMD -> Known.BMD
                BND -> Known.BND
                BOB -> Known.BOB
                BRL -> Known.BRL
                BSD -> Known.BSD
                BWP -> Known.BWP
                BYN -> Known.BYN
                BZD -> Known.BZD
                CAD -> Known.CAD
                CHF -> Known.CHF
                CLP -> Known.CLP
                CNY -> Known.CNY
                COP -> Known.COP
                CRC -> Known.CRC
                CUP -> Known.CUP
                CVE -> Known.CVE
                CZK -> Known.CZK
                DJF -> Known.DJF
                DKK -> Known.DKK
                DOP -> Known.DOP
                DZD -> Known.DZD
                EGP -> Known.EGP
                ETB -> Known.ETB
                EUR -> Known.EUR
                FJD -> Known.FJD
                FKP -> Known.FKP
                GBP -> Known.GBP
                GEL -> Known.GEL
                GHS -> Known.GHS
                GIP -> Known.GIP
                GMD -> Known.GMD
                GNF -> Known.GNF
                GTQ -> Known.GTQ
                GYD -> Known.GYD
                HKD -> Known.HKD
                HNL -> Known.HNL
                HRK -> Known.HRK
                HTG -> Known.HTG
                HUF -> Known.HUF
                IDR -> Known.IDR
                ILS -> Known.ILS
                INR -> Known.INR
                IQD -> Known.IQD
                JMD -> Known.JMD
                JOD -> Known.JOD
                JPY -> Known.JPY
                KES -> Known.KES
                KGS -> Known.KGS
                KHR -> Known.KHR
                KMF -> Known.KMF
                KRW -> Known.KRW
                KWD -> Known.KWD
                KYD -> Known.KYD
                KZT -> Known.KZT
                LAK -> Known.LAK
                LBP -> Known.LBP
                LKR -> Known.LKR
                LRD -> Known.LRD
                LSL -> Known.LSL
                LYD -> Known.LYD
                MAD -> Known.MAD
                MDL -> Known.MDL
                MGA -> Known.MGA
                MKD -> Known.MKD
                MMK -> Known.MMK
                MNT -> Known.MNT
                MOP -> Known.MOP
                MRU -> Known.MRU
                MUR -> Known.MUR
                MVR -> Known.MVR
                MWK -> Known.MWK
                MXN -> Known.MXN
                MYR -> Known.MYR
                MZN -> Known.MZN
                NAD -> Known.NAD
                NGN -> Known.NGN
                NIO -> Known.NIO
                NOK -> Known.NOK
                NPR -> Known.NPR
                NZD -> Known.NZD
                OMR -> Known.OMR
                PAB -> Known.PAB
                PEN -> Known.PEN
                PGK -> Known.PGK
                PHP -> Known.PHP
                PKR -> Known.PKR
                PLN -> Known.PLN
                PYG -> Known.PYG
                QAR -> Known.QAR
                RON -> Known.RON
                RSD -> Known.RSD
                RUB -> Known.RUB
                RWF -> Known.RWF
                SAR -> Known.SAR
                SBD -> Known.SBD
                SCR -> Known.SCR
                SEK -> Known.SEK
                SGD -> Known.SGD
                SHP -> Known.SHP
                SLE -> Known.SLE
                SLL -> Known.SLL
                SOS -> Known.SOS
                SRD -> Known.SRD
                SSP -> Known.SSP
                STN -> Known.STN
                SVC -> Known.SVC
                SZL -> Known.SZL
                THB -> Known.THB
                TND -> Known.TND
                TOP -> Known.TOP
                TRY -> Known.TRY
                TTD -> Known.TTD
                TWD -> Known.TWD
                TZS -> Known.TZS
                UAH -> Known.UAH
                UGX -> Known.UGX
                USD -> Known.USD
                UYU -> Known.UYU
                UZS -> Known.UZS
                VES -> Known.VES
                VND -> Known.VND
                VUV -> Known.VUV
                WST -> Known.WST
                XAF -> Known.XAF
                XCD -> Known.XCD
                XOF -> Known.XOF
                XPF -> Known.XPF
                YER -> Known.YER
                ZAR -> Known.ZAR
                ZMW -> Known.ZMW
                else -> throw DodoPaymentsInvalidDataException("Unknown Currency: $value")
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

        fun validate(): Currency = apply {
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

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    class SettlementCurrency
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val AED = of("AED")

            @JvmField val ALL = of("ALL")

            @JvmField val AMD = of("AMD")

            @JvmField val ANG = of("ANG")

            @JvmField val AOA = of("AOA")

            @JvmField val ARS = of("ARS")

            @JvmField val AUD = of("AUD")

            @JvmField val AWG = of("AWG")

            @JvmField val AZN = of("AZN")

            @JvmField val BAM = of("BAM")

            @JvmField val BBD = of("BBD")

            @JvmField val BDT = of("BDT")

            @JvmField val BGN = of("BGN")

            @JvmField val BHD = of("BHD")

            @JvmField val BIF = of("BIF")

            @JvmField val BMD = of("BMD")

            @JvmField val BND = of("BND")

            @JvmField val BOB = of("BOB")

            @JvmField val BRL = of("BRL")

            @JvmField val BSD = of("BSD")

            @JvmField val BWP = of("BWP")

            @JvmField val BYN = of("BYN")

            @JvmField val BZD = of("BZD")

            @JvmField val CAD = of("CAD")

            @JvmField val CHF = of("CHF")

            @JvmField val CLP = of("CLP")

            @JvmField val CNY = of("CNY")

            @JvmField val COP = of("COP")

            @JvmField val CRC = of("CRC")

            @JvmField val CUP = of("CUP")

            @JvmField val CVE = of("CVE")

            @JvmField val CZK = of("CZK")

            @JvmField val DJF = of("DJF")

            @JvmField val DKK = of("DKK")

            @JvmField val DOP = of("DOP")

            @JvmField val DZD = of("DZD")

            @JvmField val EGP = of("EGP")

            @JvmField val ETB = of("ETB")

            @JvmField val EUR = of("EUR")

            @JvmField val FJD = of("FJD")

            @JvmField val FKP = of("FKP")

            @JvmField val GBP = of("GBP")

            @JvmField val GEL = of("GEL")

            @JvmField val GHS = of("GHS")

            @JvmField val GIP = of("GIP")

            @JvmField val GMD = of("GMD")

            @JvmField val GNF = of("GNF")

            @JvmField val GTQ = of("GTQ")

            @JvmField val GYD = of("GYD")

            @JvmField val HKD = of("HKD")

            @JvmField val HNL = of("HNL")

            @JvmField val HRK = of("HRK")

            @JvmField val HTG = of("HTG")

            @JvmField val HUF = of("HUF")

            @JvmField val IDR = of("IDR")

            @JvmField val ILS = of("ILS")

            @JvmField val INR = of("INR")

            @JvmField val IQD = of("IQD")

            @JvmField val JMD = of("JMD")

            @JvmField val JOD = of("JOD")

            @JvmField val JPY = of("JPY")

            @JvmField val KES = of("KES")

            @JvmField val KGS = of("KGS")

            @JvmField val KHR = of("KHR")

            @JvmField val KMF = of("KMF")

            @JvmField val KRW = of("KRW")

            @JvmField val KWD = of("KWD")

            @JvmField val KYD = of("KYD")

            @JvmField val KZT = of("KZT")

            @JvmField val LAK = of("LAK")

            @JvmField val LBP = of("LBP")

            @JvmField val LKR = of("LKR")

            @JvmField val LRD = of("LRD")

            @JvmField val LSL = of("LSL")

            @JvmField val LYD = of("LYD")

            @JvmField val MAD = of("MAD")

            @JvmField val MDL = of("MDL")

            @JvmField val MGA = of("MGA")

            @JvmField val MKD = of("MKD")

            @JvmField val MMK = of("MMK")

            @JvmField val MNT = of("MNT")

            @JvmField val MOP = of("MOP")

            @JvmField val MRU = of("MRU")

            @JvmField val MUR = of("MUR")

            @JvmField val MVR = of("MVR")

            @JvmField val MWK = of("MWK")

            @JvmField val MXN = of("MXN")

            @JvmField val MYR = of("MYR")

            @JvmField val MZN = of("MZN")

            @JvmField val NAD = of("NAD")

            @JvmField val NGN = of("NGN")

            @JvmField val NIO = of("NIO")

            @JvmField val NOK = of("NOK")

            @JvmField val NPR = of("NPR")

            @JvmField val NZD = of("NZD")

            @JvmField val OMR = of("OMR")

            @JvmField val PAB = of("PAB")

            @JvmField val PEN = of("PEN")

            @JvmField val PGK = of("PGK")

            @JvmField val PHP = of("PHP")

            @JvmField val PKR = of("PKR")

            @JvmField val PLN = of("PLN")

            @JvmField val PYG = of("PYG")

            @JvmField val QAR = of("QAR")

            @JvmField val RON = of("RON")

            @JvmField val RSD = of("RSD")

            @JvmField val RUB = of("RUB")

            @JvmField val RWF = of("RWF")

            @JvmField val SAR = of("SAR")

            @JvmField val SBD = of("SBD")

            @JvmField val SCR = of("SCR")

            @JvmField val SEK = of("SEK")

            @JvmField val SGD = of("SGD")

            @JvmField val SHP = of("SHP")

            @JvmField val SLE = of("SLE")

            @JvmField val SLL = of("SLL")

            @JvmField val SOS = of("SOS")

            @JvmField val SRD = of("SRD")

            @JvmField val SSP = of("SSP")

            @JvmField val STN = of("STN")

            @JvmField val SVC = of("SVC")

            @JvmField val SZL = of("SZL")

            @JvmField val THB = of("THB")

            @JvmField val TND = of("TND")

            @JvmField val TOP = of("TOP")

            @JvmField val TRY = of("TRY")

            @JvmField val TTD = of("TTD")

            @JvmField val TWD = of("TWD")

            @JvmField val TZS = of("TZS")

            @JvmField val UAH = of("UAH")

            @JvmField val UGX = of("UGX")

            @JvmField val USD = of("USD")

            @JvmField val UYU = of("UYU")

            @JvmField val UZS = of("UZS")

            @JvmField val VES = of("VES")

            @JvmField val VND = of("VND")

            @JvmField val VUV = of("VUV")

            @JvmField val WST = of("WST")

            @JvmField val XAF = of("XAF")

            @JvmField val XCD = of("XCD")

            @JvmField val XOF = of("XOF")

            @JvmField val XPF = of("XPF")

            @JvmField val YER = of("YER")

            @JvmField val ZAR = of("ZAR")

            @JvmField val ZMW = of("ZMW")

            @JvmStatic fun of(value: String) = SettlementCurrency(JsonField.of(value))
        }

        /** An enum containing [SettlementCurrency]'s known values. */
        enum class Known {
            AED,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BRL,
            BSD,
            BWP,
            BYN,
            BZD,
            CAD,
            CHF,
            CLP,
            CNY,
            COP,
            CRC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SEK,
            SGD,
            SHP,
            SLE,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SZL,
            THB,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            UYU,
            UZS,
            VES,
            VND,
            VUV,
            WST,
            XAF,
            XCD,
            XOF,
            XPF,
            YER,
            ZAR,
            ZMW,
        }

        /**
         * An enum containing [SettlementCurrency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SettlementCurrency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AED,
            ALL,
            AMD,
            ANG,
            AOA,
            ARS,
            AUD,
            AWG,
            AZN,
            BAM,
            BBD,
            BDT,
            BGN,
            BHD,
            BIF,
            BMD,
            BND,
            BOB,
            BRL,
            BSD,
            BWP,
            BYN,
            BZD,
            CAD,
            CHF,
            CLP,
            CNY,
            COP,
            CRC,
            CUP,
            CVE,
            CZK,
            DJF,
            DKK,
            DOP,
            DZD,
            EGP,
            ETB,
            EUR,
            FJD,
            FKP,
            GBP,
            GEL,
            GHS,
            GIP,
            GMD,
            GNF,
            GTQ,
            GYD,
            HKD,
            HNL,
            HRK,
            HTG,
            HUF,
            IDR,
            ILS,
            INR,
            IQD,
            JMD,
            JOD,
            JPY,
            KES,
            KGS,
            KHR,
            KMF,
            KRW,
            KWD,
            KYD,
            KZT,
            LAK,
            LBP,
            LKR,
            LRD,
            LSL,
            LYD,
            MAD,
            MDL,
            MGA,
            MKD,
            MMK,
            MNT,
            MOP,
            MRU,
            MUR,
            MVR,
            MWK,
            MXN,
            MYR,
            MZN,
            NAD,
            NGN,
            NIO,
            NOK,
            NPR,
            NZD,
            OMR,
            PAB,
            PEN,
            PGK,
            PHP,
            PKR,
            PLN,
            PYG,
            QAR,
            RON,
            RSD,
            RUB,
            RWF,
            SAR,
            SBD,
            SCR,
            SEK,
            SGD,
            SHP,
            SLE,
            SLL,
            SOS,
            SRD,
            SSP,
            STN,
            SVC,
            SZL,
            THB,
            TND,
            TOP,
            TRY,
            TTD,
            TWD,
            TZS,
            UAH,
            UGX,
            USD,
            UYU,
            UZS,
            VES,
            VND,
            VUV,
            WST,
            XAF,
            XCD,
            XOF,
            XPF,
            YER,
            ZAR,
            ZMW,
            /**
             * An enum member indicating that [SettlementCurrency] was instantiated with an unknown
             * value.
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
                AED -> Value.AED
                ALL -> Value.ALL
                AMD -> Value.AMD
                ANG -> Value.ANG
                AOA -> Value.AOA
                ARS -> Value.ARS
                AUD -> Value.AUD
                AWG -> Value.AWG
                AZN -> Value.AZN
                BAM -> Value.BAM
                BBD -> Value.BBD
                BDT -> Value.BDT
                BGN -> Value.BGN
                BHD -> Value.BHD
                BIF -> Value.BIF
                BMD -> Value.BMD
                BND -> Value.BND
                BOB -> Value.BOB
                BRL -> Value.BRL
                BSD -> Value.BSD
                BWP -> Value.BWP
                BYN -> Value.BYN
                BZD -> Value.BZD
                CAD -> Value.CAD
                CHF -> Value.CHF
                CLP -> Value.CLP
                CNY -> Value.CNY
                COP -> Value.COP
                CRC -> Value.CRC
                CUP -> Value.CUP
                CVE -> Value.CVE
                CZK -> Value.CZK
                DJF -> Value.DJF
                DKK -> Value.DKK
                DOP -> Value.DOP
                DZD -> Value.DZD
                EGP -> Value.EGP
                ETB -> Value.ETB
                EUR -> Value.EUR
                FJD -> Value.FJD
                FKP -> Value.FKP
                GBP -> Value.GBP
                GEL -> Value.GEL
                GHS -> Value.GHS
                GIP -> Value.GIP
                GMD -> Value.GMD
                GNF -> Value.GNF
                GTQ -> Value.GTQ
                GYD -> Value.GYD
                HKD -> Value.HKD
                HNL -> Value.HNL
                HRK -> Value.HRK
                HTG -> Value.HTG
                HUF -> Value.HUF
                IDR -> Value.IDR
                ILS -> Value.ILS
                INR -> Value.INR
                IQD -> Value.IQD
                JMD -> Value.JMD
                JOD -> Value.JOD
                JPY -> Value.JPY
                KES -> Value.KES
                KGS -> Value.KGS
                KHR -> Value.KHR
                KMF -> Value.KMF
                KRW -> Value.KRW
                KWD -> Value.KWD
                KYD -> Value.KYD
                KZT -> Value.KZT
                LAK -> Value.LAK
                LBP -> Value.LBP
                LKR -> Value.LKR
                LRD -> Value.LRD
                LSL -> Value.LSL
                LYD -> Value.LYD
                MAD -> Value.MAD
                MDL -> Value.MDL
                MGA -> Value.MGA
                MKD -> Value.MKD
                MMK -> Value.MMK
                MNT -> Value.MNT
                MOP -> Value.MOP
                MRU -> Value.MRU
                MUR -> Value.MUR
                MVR -> Value.MVR
                MWK -> Value.MWK
                MXN -> Value.MXN
                MYR -> Value.MYR
                MZN -> Value.MZN
                NAD -> Value.NAD
                NGN -> Value.NGN
                NIO -> Value.NIO
                NOK -> Value.NOK
                NPR -> Value.NPR
                NZD -> Value.NZD
                OMR -> Value.OMR
                PAB -> Value.PAB
                PEN -> Value.PEN
                PGK -> Value.PGK
                PHP -> Value.PHP
                PKR -> Value.PKR
                PLN -> Value.PLN
                PYG -> Value.PYG
                QAR -> Value.QAR
                RON -> Value.RON
                RSD -> Value.RSD
                RUB -> Value.RUB
                RWF -> Value.RWF
                SAR -> Value.SAR
                SBD -> Value.SBD
                SCR -> Value.SCR
                SEK -> Value.SEK
                SGD -> Value.SGD
                SHP -> Value.SHP
                SLE -> Value.SLE
                SLL -> Value.SLL
                SOS -> Value.SOS
                SRD -> Value.SRD
                SSP -> Value.SSP
                STN -> Value.STN
                SVC -> Value.SVC
                SZL -> Value.SZL
                THB -> Value.THB
                TND -> Value.TND
                TOP -> Value.TOP
                TRY -> Value.TRY
                TTD -> Value.TTD
                TWD -> Value.TWD
                TZS -> Value.TZS
                UAH -> Value.UAH
                UGX -> Value.UGX
                USD -> Value.USD
                UYU -> Value.UYU
                UZS -> Value.UZS
                VES -> Value.VES
                VND -> Value.VND
                VUV -> Value.VUV
                WST -> Value.WST
                XAF -> Value.XAF
                XCD -> Value.XCD
                XOF -> Value.XOF
                XPF -> Value.XPF
                YER -> Value.YER
                ZAR -> Value.ZAR
                ZMW -> Value.ZMW
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
                AED -> Known.AED
                ALL -> Known.ALL
                AMD -> Known.AMD
                ANG -> Known.ANG
                AOA -> Known.AOA
                ARS -> Known.ARS
                AUD -> Known.AUD
                AWG -> Known.AWG
                AZN -> Known.AZN
                BAM -> Known.BAM
                BBD -> Known.BBD
                BDT -> Known.BDT
                BGN -> Known.BGN
                BHD -> Known.BHD
                BIF -> Known.BIF
                BMD -> Known.BMD
                BND -> Known.BND
                BOB -> Known.BOB
                BRL -> Known.BRL
                BSD -> Known.BSD
                BWP -> Known.BWP
                BYN -> Known.BYN
                BZD -> Known.BZD
                CAD -> Known.CAD
                CHF -> Known.CHF
                CLP -> Known.CLP
                CNY -> Known.CNY
                COP -> Known.COP
                CRC -> Known.CRC
                CUP -> Known.CUP
                CVE -> Known.CVE
                CZK -> Known.CZK
                DJF -> Known.DJF
                DKK -> Known.DKK
                DOP -> Known.DOP
                DZD -> Known.DZD
                EGP -> Known.EGP
                ETB -> Known.ETB
                EUR -> Known.EUR
                FJD -> Known.FJD
                FKP -> Known.FKP
                GBP -> Known.GBP
                GEL -> Known.GEL
                GHS -> Known.GHS
                GIP -> Known.GIP
                GMD -> Known.GMD
                GNF -> Known.GNF
                GTQ -> Known.GTQ
                GYD -> Known.GYD
                HKD -> Known.HKD
                HNL -> Known.HNL
                HRK -> Known.HRK
                HTG -> Known.HTG
                HUF -> Known.HUF
                IDR -> Known.IDR
                ILS -> Known.ILS
                INR -> Known.INR
                IQD -> Known.IQD
                JMD -> Known.JMD
                JOD -> Known.JOD
                JPY -> Known.JPY
                KES -> Known.KES
                KGS -> Known.KGS
                KHR -> Known.KHR
                KMF -> Known.KMF
                KRW -> Known.KRW
                KWD -> Known.KWD
                KYD -> Known.KYD
                KZT -> Known.KZT
                LAK -> Known.LAK
                LBP -> Known.LBP
                LKR -> Known.LKR
                LRD -> Known.LRD
                LSL -> Known.LSL
                LYD -> Known.LYD
                MAD -> Known.MAD
                MDL -> Known.MDL
                MGA -> Known.MGA
                MKD -> Known.MKD
                MMK -> Known.MMK
                MNT -> Known.MNT
                MOP -> Known.MOP
                MRU -> Known.MRU
                MUR -> Known.MUR
                MVR -> Known.MVR
                MWK -> Known.MWK
                MXN -> Known.MXN
                MYR -> Known.MYR
                MZN -> Known.MZN
                NAD -> Known.NAD
                NGN -> Known.NGN
                NIO -> Known.NIO
                NOK -> Known.NOK
                NPR -> Known.NPR
                NZD -> Known.NZD
                OMR -> Known.OMR
                PAB -> Known.PAB
                PEN -> Known.PEN
                PGK -> Known.PGK
                PHP -> Known.PHP
                PKR -> Known.PKR
                PLN -> Known.PLN
                PYG -> Known.PYG
                QAR -> Known.QAR
                RON -> Known.RON
                RSD -> Known.RSD
                RUB -> Known.RUB
                RWF -> Known.RWF
                SAR -> Known.SAR
                SBD -> Known.SBD
                SCR -> Known.SCR
                SEK -> Known.SEK
                SGD -> Known.SGD
                SHP -> Known.SHP
                SLE -> Known.SLE
                SLL -> Known.SLL
                SOS -> Known.SOS
                SRD -> Known.SRD
                SSP -> Known.SSP
                STN -> Known.STN
                SVC -> Known.SVC
                SZL -> Known.SZL
                THB -> Known.THB
                TND -> Known.TND
                TOP -> Known.TOP
                TRY -> Known.TRY
                TTD -> Known.TTD
                TWD -> Known.TWD
                TZS -> Known.TZS
                UAH -> Known.UAH
                UGX -> Known.UGX
                USD -> Known.USD
                UYU -> Known.UYU
                UZS -> Known.UZS
                VES -> Known.VES
                VND -> Known.VND
                VUV -> Known.VUV
                WST -> Known.WST
                XAF -> Known.XAF
                XCD -> Known.XCD
                XOF -> Known.XOF
                XPF -> Known.XPF
                YER -> Known.YER
                ZAR -> Known.ZAR
                ZMW -> Known.ZMW
                else -> throw DodoPaymentsInvalidDataException("Unknown SettlementCurrency: $value")
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

        fun validate(): SettlementCurrency = apply {
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

            return /* spotless:off */ other is SettlementCurrency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ProductCart
    private constructor(
        private val productId: JsonField<String>,
        private val quantity: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Long> = JsonMissing.of(),
        ) : this(productId, quantity, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Long = quantity.getRequired("quantity")

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Long> = quantity

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
             * Returns a mutable builder for constructing an instance of [ProductCart].
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .quantity()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProductCart]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(productCart: ProductCart) = apply {
                productId = productCart.productId
                quantity = productCart.quantity
                additionalProperties = productCart.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun quantity(quantity: Long) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Long>) = apply { this.quantity = quantity }

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
             * Returns an immutable instance of [ProductCart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .quantity()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ProductCart =
                ProductCart(
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ProductCart = apply {
            if (validated) {
                return@apply
            }

            productId()
            quantity()
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
        @JvmSynthetic
        internal fun validity(): Int =
            (if (productId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProductCart && productId == other.productId && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, quantity, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{productId=$productId, quantity=$quantity, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Payment && businessId == other.businessId && createdAt == other.createdAt && currency == other.currency && customer == other.customer && disputes == other.disputes && metadata == other.metadata && paymentId == other.paymentId && refunds == other.refunds && settlementAmount == other.settlementAmount && settlementCurrency == other.settlementCurrency && totalAmount == other.totalAmount && discountId == other.discountId && errorMessage == other.errorMessage && paymentLink == other.paymentLink && paymentMethod == other.paymentMethod && paymentMethodType == other.paymentMethodType && productCart == other.productCart && settlementTax == other.settlementTax && status == other.status && subscriptionId == other.subscriptionId && tax == other.tax && updatedAt == other.updatedAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(businessId, createdAt, currency, customer, disputes, metadata, paymentId, refunds, settlementAmount, settlementCurrency, totalAmount, discountId, errorMessage, paymentLink, paymentMethod, paymentMethodType, productCart, settlementTax, status, subscriptionId, tax, updatedAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Payment{businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, disputes=$disputes, metadata=$metadata, paymentId=$paymentId, refunds=$refunds, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, totalAmount=$totalAmount, discountId=$discountId, errorMessage=$errorMessage, paymentLink=$paymentLink, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, productCart=$productCart, settlementTax=$settlementTax, status=$status, subscriptionId=$subscriptionId, tax=$tax, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
