// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

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
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.Payment
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class PaymentProcessingWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("business_id")
        @ExcludeMissing
        businessId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(businessId, data, timestamp, type, mutableMapOf())

    /**
     * The business identifier
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Event-specific data
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * The timestamp of when the event occurred
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * The event type
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [businessId].
     *
     * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("business_id") @ExcludeMissing fun _businessId(): JsonField<String> = businessId

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of
         * [PaymentProcessingWebhookEvent].
         *
         * The following fields are required:
         * ```java
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentProcessingWebhookEvent]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentProcessingWebhookEvent: PaymentProcessingWebhookEvent) = apply {
            businessId = paymentProcessingWebhookEvent.businessId
            data = paymentProcessingWebhookEvent.data
            timestamp = paymentProcessingWebhookEvent.timestamp
            type = paymentProcessingWebhookEvent.type
            additionalProperties = paymentProcessingWebhookEvent.additionalProperties.toMutableMap()
        }

        /** The business identifier */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Event-specific data */
        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** The timestamp of when the event occurred */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** The event type */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [PaymentProcessingWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessId()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentProcessingWebhookEvent =
            PaymentProcessingWebhookEvent(
                checkRequired("businessId", businessId),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): PaymentProcessingWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        businessId()
        data().validate()
        timestamp()
        type().validate()
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
            (data.asKnown().getOrNull()?.validity() ?: 0) +
            (if (timestamp.asKnown().isPresent) 1 else 0) +
            (type.asKnown().getOrNull()?.validity() ?: 0)

    /** Event-specific data */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billing: JsonField<BillingAddress>,
        private val brandId: JsonField<String>,
        private val businessId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val customer: JsonField<CustomerLimitedDetails>,
        private val digitalProductsDelivered: JsonField<Boolean>,
        private val disputes: JsonField<List<Dispute>>,
        private val metadata: JsonField<Payment.Metadata>,
        private val paymentId: JsonField<String>,
        private val refunds: JsonField<List<Payment.Refund>>,
        private val settlementAmount: JsonField<Int>,
        private val settlementCurrency: JsonField<Currency>,
        private val totalAmount: JsonField<Int>,
        private val cardIssuingCountry: JsonField<CountryCode>,
        private val cardLastFour: JsonField<String>,
        private val cardNetwork: JsonField<String>,
        private val cardType: JsonField<String>,
        private val checkoutSessionId: JsonField<String>,
        private val discountId: JsonField<String>,
        private val errorCode: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val paymentLink: JsonField<String>,
        private val paymentMethod: JsonField<String>,
        private val paymentMethodType: JsonField<String>,
        private val productCart: JsonField<List<Payment.ProductCart>>,
        private val settlementTax: JsonField<Int>,
        private val status: JsonField<IntentStatus>,
        private val subscriptionId: JsonField<String>,
        private val tax: JsonField<Int>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val payloadType: JsonField<PayloadType>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing")
            @ExcludeMissing
            billing: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("brand_id") @ExcludeMissing brandId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("business_id")
            @ExcludeMissing
            businessId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("customer")
            @ExcludeMissing
            customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
            @JsonProperty("digital_products_delivered")
            @ExcludeMissing
            digitalProductsDelivered: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("disputes")
            @ExcludeMissing
            disputes: JsonField<List<Dispute>> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Payment.Metadata> = JsonMissing.of(),
            @JsonProperty("payment_id")
            @ExcludeMissing
            paymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("refunds")
            @ExcludeMissing
            refunds: JsonField<List<Payment.Refund>> = JsonMissing.of(),
            @JsonProperty("settlement_amount")
            @ExcludeMissing
            settlementAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("settlement_currency")
            @ExcludeMissing
            settlementCurrency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("total_amount")
            @ExcludeMissing
            totalAmount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("card_issuing_country")
            @ExcludeMissing
            cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of(),
            @JsonProperty("card_last_four")
            @ExcludeMissing
            cardLastFour: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_network")
            @ExcludeMissing
            cardNetwork: JsonField<String> = JsonMissing.of(),
            @JsonProperty("card_type")
            @ExcludeMissing
            cardType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("checkout_session_id")
            @ExcludeMissing
            checkoutSessionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("discount_id")
            @ExcludeMissing
            discountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_code")
            @ExcludeMissing
            errorCode: JsonField<String> = JsonMissing.of(),
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
            productCart: JsonField<List<Payment.ProductCart>> = JsonMissing.of(),
            @JsonProperty("settlement_tax")
            @ExcludeMissing
            settlementTax: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<IntentStatus> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("updated_at")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("payload_type")
            @ExcludeMissing
            payloadType: JsonField<PayloadType> = JsonMissing.of(),
        ) : this(
            billing,
            brandId,
            businessId,
            createdAt,
            currency,
            customer,
            digitalProductsDelivered,
            disputes,
            metadata,
            paymentId,
            refunds,
            settlementAmount,
            settlementCurrency,
            totalAmount,
            cardIssuingCountry,
            cardLastFour,
            cardNetwork,
            cardType,
            checkoutSessionId,
            discountId,
            errorCode,
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
            payloadType,
            mutableMapOf(),
        )

        fun toPayment(): Payment =
            Payment.builder()
                .billing(billing)
                .brandId(brandId)
                .businessId(businessId)
                .createdAt(createdAt)
                .currency(currency)
                .customer(customer)
                .digitalProductsDelivered(digitalProductsDelivered)
                .disputes(disputes)
                .metadata(metadata)
                .paymentId(paymentId)
                .refunds(refunds)
                .settlementAmount(settlementAmount)
                .settlementCurrency(settlementCurrency)
                .totalAmount(totalAmount)
                .cardIssuingCountry(cardIssuingCountry)
                .cardLastFour(cardLastFour)
                .cardNetwork(cardNetwork)
                .cardType(cardType)
                .checkoutSessionId(checkoutSessionId)
                .discountId(discountId)
                .errorCode(errorCode)
                .errorMessage(errorMessage)
                .paymentLink(paymentLink)
                .paymentMethod(paymentMethod)
                .paymentMethodType(paymentMethodType)
                .productCart(productCart)
                .settlementTax(settlementTax)
                .status(status)
                .subscriptionId(subscriptionId)
                .tax(tax)
                .updatedAt(updatedAt)
                .build()

        /**
         * Billing address details for payments
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billing(): BillingAddress = billing.getRequired("billing")

        /**
         * brand id this payment belongs to
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun brandId(): String = brandId.getRequired("brand_id")

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
         * Currency used for the payment
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * Details about the customer who made the payment
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

        /**
         * brand id this payment belongs to
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun digitalProductsDelivered(): Boolean =
            digitalProductsDelivered.getRequired("digital_products_delivered")

        /**
         * List of disputes associated with this payment
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun disputes(): List<Dispute> = disputes.getRequired("disputes")

        /**
         * Additional custom data associated with the payment
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun metadata(): Payment.Metadata = metadata.getRequired("metadata")

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
        fun refunds(): List<Payment.Refund> = refunds.getRequired("refunds")

        /**
         * The amount that will be credited to your Dodo balance after currency conversion and
         * processing. Especially relevant for adaptive pricing where the customer's payment
         * currency differs from your settlement currency.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlementAmount(): Int = settlementAmount.getRequired("settlement_amount")

        /**
         * The currency in which the settlement_amount will be credited to your Dodo balance. This
         * may differ from the customer's payment currency in adaptive pricing scenarios.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlementCurrency(): Currency = settlementCurrency.getRequired("settlement_currency")

        /**
         * Total amount charged to the customer including tax, in smallest currency unit (e.g.
         * cents)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun totalAmount(): Int = totalAmount.getRequired("total_amount")

        /**
         * ISO2 country code of the card
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cardIssuingCountry(): Optional<CountryCode> =
            cardIssuingCountry.getOptional("card_issuing_country")

        /**
         * The last four digits of the card
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cardLastFour(): Optional<String> = cardLastFour.getOptional("card_last_four")

        /**
         * Card network like VISA, MASTERCARD etc.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cardNetwork(): Optional<String> = cardNetwork.getOptional("card_network")

        /**
         * The type of card DEBIT or CREDIT
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cardType(): Optional<String> = cardType.getOptional("card_type")

        /**
         * If payment is made using a checkout session, this field is set to the id of the session.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun checkoutSessionId(): Optional<String> =
            checkoutSessionId.getOptional("checkout_session_id")

        /**
         * The discount id if discount is applied
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun discountId(): Optional<String> = discountId.getOptional("discount_id")

        /**
         * An error code if the payment failed
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun errorCode(): Optional<String> = errorCode.getOptional("error_code")

        /**
         * An error message if the payment failed
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

        /**
         * Checkout URL
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentLink(): Optional<String> = paymentLink.getOptional("payment_link")

        /**
         * Payment method used by customer (e.g. "card", "bank_transfer")
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethod(): Optional<String> = paymentMethod.getOptional("payment_method")

        /**
         * Specific type of payment method (e.g. "visa", "mastercard")
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentMethodType(): Optional<String> =
            paymentMethodType.getOptional("payment_method_type")

        /**
         * List of products purchased in a one-time payment
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun productCart(): Optional<List<Payment.ProductCart>> =
            productCart.getOptional("product_cart")

        /**
         * This represents the portion of settlement_amount that corresponds to taxes collected.
         * Especially relevant for adaptive pricing where the tax component must be tracked
         * separately in your Dodo balance.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun settlementTax(): Optional<Int> = settlementTax.getOptional("settlement_tax")

        /**
         * Current status of the payment intent
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<IntentStatus> = status.getOptional("status")

        /**
         * Identifier of the subscription if payment is part of a subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscription_id")

        /**
         * Amount of tax collected in smallest currency unit (e.g. cents)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun tax(): Optional<Int> = tax.getOptional("tax")

        /**
         * Timestamp when the payment was last updated
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

        /**
         * The type of payload in the data field
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun payloadType(): Optional<PayloadType> = payloadType.getOptional("payload_type")

        /**
         * Returns the raw JSON value of [billing].
         *
         * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

        /**
         * Returns the raw JSON value of [brandId].
         *
         * Unlike [brandId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("brand_id") @ExcludeMissing fun _brandId(): JsonField<String> = brandId

        /**
         * Returns the raw JSON value of [businessId].
         *
         * Unlike [businessId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("business_id")
        @ExcludeMissing
        fun _businessId(): JsonField<String> = businessId

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
         * Returns the raw JSON value of [digitalProductsDelivered].
         *
         * Unlike [digitalProductsDelivered], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("digital_products_delivered")
        @ExcludeMissing
        fun _digitalProductsDelivered(): JsonField<Boolean> = digitalProductsDelivered

        /**
         * Returns the raw JSON value of [disputes].
         *
         * Unlike [disputes], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("disputes")
        @ExcludeMissing
        fun _disputes(): JsonField<List<Dispute>> = disputes

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun _metadata(): JsonField<Payment.Metadata> = metadata

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
        @JsonProperty("refunds")
        @ExcludeMissing
        fun _refunds(): JsonField<List<Payment.Refund>> = refunds

        /**
         * Returns the raw JSON value of [settlementAmount].
         *
         * Unlike [settlementAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settlement_amount")
        @ExcludeMissing
        fun _settlementAmount(): JsonField<Int> = settlementAmount

        /**
         * Returns the raw JSON value of [settlementCurrency].
         *
         * Unlike [settlementCurrency], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("settlement_currency")
        @ExcludeMissing
        fun _settlementCurrency(): JsonField<Currency> = settlementCurrency

        /**
         * Returns the raw JSON value of [totalAmount].
         *
         * Unlike [totalAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_amount")
        @ExcludeMissing
        fun _totalAmount(): JsonField<Int> = totalAmount

        /**
         * Returns the raw JSON value of [cardIssuingCountry].
         *
         * Unlike [cardIssuingCountry], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("card_issuing_country")
        @ExcludeMissing
        fun _cardIssuingCountry(): JsonField<CountryCode> = cardIssuingCountry

        /**
         * Returns the raw JSON value of [cardLastFour].
         *
         * Unlike [cardLastFour], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("card_last_four")
        @ExcludeMissing
        fun _cardLastFour(): JsonField<String> = cardLastFour

        /**
         * Returns the raw JSON value of [cardNetwork].
         *
         * Unlike [cardNetwork], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_network")
        @ExcludeMissing
        fun _cardNetwork(): JsonField<String> = cardNetwork

        /**
         * Returns the raw JSON value of [cardType].
         *
         * Unlike [cardType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("card_type") @ExcludeMissing fun _cardType(): JsonField<String> = cardType

        /**
         * Returns the raw JSON value of [checkoutSessionId].
         *
         * Unlike [checkoutSessionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("checkout_session_id")
        @ExcludeMissing
        fun _checkoutSessionId(): JsonField<String> = checkoutSessionId

        /**
         * Returns the raw JSON value of [discountId].
         *
         * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount_id")
        @ExcludeMissing
        fun _discountId(): JsonField<String> = discountId

        /**
         * Returns the raw JSON value of [errorCode].
         *
         * Unlike [errorCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("error_code") @ExcludeMissing fun _errorCode(): JsonField<String> = errorCode

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [paymentMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        fun _productCart(): JsonField<List<Payment.ProductCart>> = productCart

        /**
         * Returns the raw JSON value of [settlementTax].
         *
         * Unlike [settlementTax], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("settlement_tax")
        @ExcludeMissing
        fun _settlementTax(): JsonField<Int> = settlementTax

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<IntentStatus> = status

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Int> = tax

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updated_at")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [payloadType].
         *
         * Unlike [payloadType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payload_type")
        @ExcludeMissing
        fun _payloadType(): JsonField<PayloadType> = payloadType

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```java
             * .billing()
             * .brandId()
             * .businessId()
             * .createdAt()
             * .currency()
             * .customer()
             * .digitalProductsDelivered()
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var billing: JsonField<BillingAddress>? = null
            private var brandId: JsonField<String>? = null
            private var businessId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var currency: JsonField<Currency>? = null
            private var customer: JsonField<CustomerLimitedDetails>? = null
            private var digitalProductsDelivered: JsonField<Boolean>? = null
            private var disputes: JsonField<MutableList<Dispute>>? = null
            private var metadata: JsonField<Payment.Metadata>? = null
            private var paymentId: JsonField<String>? = null
            private var refunds: JsonField<MutableList<Payment.Refund>>? = null
            private var settlementAmount: JsonField<Int>? = null
            private var settlementCurrency: JsonField<Currency>? = null
            private var totalAmount: JsonField<Int>? = null
            private var cardIssuingCountry: JsonField<CountryCode> = JsonMissing.of()
            private var cardLastFour: JsonField<String> = JsonMissing.of()
            private var cardNetwork: JsonField<String> = JsonMissing.of()
            private var cardType: JsonField<String> = JsonMissing.of()
            private var checkoutSessionId: JsonField<String> = JsonMissing.of()
            private var discountId: JsonField<String> = JsonMissing.of()
            private var errorCode: JsonField<String> = JsonMissing.of()
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var paymentLink: JsonField<String> = JsonMissing.of()
            private var paymentMethod: JsonField<String> = JsonMissing.of()
            private var paymentMethodType: JsonField<String> = JsonMissing.of()
            private var productCart: JsonField<MutableList<Payment.ProductCart>>? = null
            private var settlementTax: JsonField<Int> = JsonMissing.of()
            private var status: JsonField<IntentStatus> = JsonMissing.of()
            private var subscriptionId: JsonField<String> = JsonMissing.of()
            private var tax: JsonField<Int> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var payloadType: JsonField<PayloadType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                billing = data.billing
                brandId = data.brandId
                businessId = data.businessId
                createdAt = data.createdAt
                currency = data.currency
                customer = data.customer
                digitalProductsDelivered = data.digitalProductsDelivered
                disputes = data.disputes.map { it.toMutableList() }
                metadata = data.metadata
                paymentId = data.paymentId
                refunds = data.refunds.map { it.toMutableList() }
                settlementAmount = data.settlementAmount
                settlementCurrency = data.settlementCurrency
                totalAmount = data.totalAmount
                cardIssuingCountry = data.cardIssuingCountry
                cardLastFour = data.cardLastFour
                cardNetwork = data.cardNetwork
                cardType = data.cardType
                checkoutSessionId = data.checkoutSessionId
                discountId = data.discountId
                errorCode = data.errorCode
                errorMessage = data.errorMessage
                paymentLink = data.paymentLink
                paymentMethod = data.paymentMethod
                paymentMethodType = data.paymentMethodType
                productCart = data.productCart.map { it.toMutableList() }
                settlementTax = data.settlementTax
                status = data.status
                subscriptionId = data.subscriptionId
                tax = data.tax
                updatedAt = data.updatedAt
                payloadType = data.payloadType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** Billing address details for payments */
            fun billing(billing: BillingAddress) = billing(JsonField.of(billing))

            /**
             * Sets [Builder.billing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

            /** brand id this payment belongs to */
            fun brandId(brandId: String) = brandId(JsonField.of(brandId))

            /**
             * Sets [Builder.brandId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brandId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun brandId(brandId: JsonField<String>) = apply { this.brandId = brandId }

            /** Identifier of the business associated with the payment */
            fun businessId(businessId: String) = businessId(JsonField.of(businessId))

            /**
             * Sets [Builder.businessId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Currency used for the payment */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** Details about the customer who made the payment */
            fun customer(customer: CustomerLimitedDetails) = customer(JsonField.of(customer))

            /**
             * Sets [Builder.customer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customer] with a well-typed [CustomerLimitedDetails]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun customer(customer: JsonField<CustomerLimitedDetails>) = apply {
                this.customer = customer
            }

            /** brand id this payment belongs to */
            fun digitalProductsDelivered(digitalProductsDelivered: Boolean) =
                digitalProductsDelivered(JsonField.of(digitalProductsDelivered))

            /**
             * Sets [Builder.digitalProductsDelivered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.digitalProductsDelivered] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun digitalProductsDelivered(digitalProductsDelivered: JsonField<Boolean>) = apply {
                this.digitalProductsDelivered = digitalProductsDelivered
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

            /** Additional custom data associated with the payment */
            fun metadata(metadata: Payment.Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Payment.Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Payment.Metadata>) = apply { this.metadata = metadata }

            /** Unique identifier for the payment */
            fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

            /**
             * Sets [Builder.paymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

            /** List of refunds issued for this payment */
            fun refunds(refunds: List<Payment.Refund>) = refunds(JsonField.of(refunds))

            /**
             * Sets [Builder.refunds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.refunds] with a well-typed `List<Payment.Refund>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun refunds(refunds: JsonField<List<Payment.Refund>>) = apply {
                this.refunds = refunds.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payment.Refund] to [refunds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRefund(refund: Payment.Refund) = apply {
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
            fun settlementAmount(settlementAmount: Int) =
                settlementAmount(JsonField.of(settlementAmount))

            /**
             * Sets [Builder.settlementAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementAmount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settlementAmount(settlementAmount: JsonField<Int>) = apply {
                this.settlementAmount = settlementAmount
            }

            /**
             * The currency in which the settlement_amount will be credited to your Dodo balance.
             * This may differ from the customer's payment currency in adaptive pricing scenarios.
             */
            fun settlementCurrency(settlementCurrency: Currency) =
                settlementCurrency(JsonField.of(settlementCurrency))

            /**
             * Sets [Builder.settlementCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementCurrency] with a well-typed [Currency]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun settlementCurrency(settlementCurrency: JsonField<Currency>) = apply {
                this.settlementCurrency = settlementCurrency
            }

            /**
             * Total amount charged to the customer including tax, in smallest currency unit (e.g.
             * cents)
             */
            fun totalAmount(totalAmount: Int) = totalAmount(JsonField.of(totalAmount))

            /**
             * Sets [Builder.totalAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalAmount] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalAmount(totalAmount: JsonField<Int>) = apply { this.totalAmount = totalAmount }

            /** ISO2 country code of the card */
            fun cardIssuingCountry(cardIssuingCountry: CountryCode?) =
                cardIssuingCountry(JsonField.ofNullable(cardIssuingCountry))

            /**
             * Alias for calling [Builder.cardIssuingCountry] with
             * `cardIssuingCountry.orElse(null)`.
             */
            fun cardIssuingCountry(cardIssuingCountry: Optional<CountryCode>) =
                cardIssuingCountry(cardIssuingCountry.getOrNull())

            /**
             * Sets [Builder.cardIssuingCountry] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardIssuingCountry] with a well-typed [CountryCode]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cardIssuingCountry(cardIssuingCountry: JsonField<CountryCode>) = apply {
                this.cardIssuingCountry = cardIssuingCountry
            }

            /** The last four digits of the card */
            fun cardLastFour(cardLastFour: String?) =
                cardLastFour(JsonField.ofNullable(cardLastFour))

            /** Alias for calling [Builder.cardLastFour] with `cardLastFour.orElse(null)`. */
            fun cardLastFour(cardLastFour: Optional<String>) =
                cardLastFour(cardLastFour.getOrNull())

            /**
             * Sets [Builder.cardLastFour] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardLastFour] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardLastFour(cardLastFour: JsonField<String>) = apply {
                this.cardLastFour = cardLastFour
            }

            /** Card network like VISA, MASTERCARD etc. */
            fun cardNetwork(cardNetwork: String?) = cardNetwork(JsonField.ofNullable(cardNetwork))

            /** Alias for calling [Builder.cardNetwork] with `cardNetwork.orElse(null)`. */
            fun cardNetwork(cardNetwork: Optional<String>) = cardNetwork(cardNetwork.getOrNull())

            /**
             * Sets [Builder.cardNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardNetwork(cardNetwork: JsonField<String>) = apply {
                this.cardNetwork = cardNetwork
            }

            /** The type of card DEBIT or CREDIT */
            fun cardType(cardType: String?) = cardType(JsonField.ofNullable(cardType))

            /** Alias for calling [Builder.cardType] with `cardType.orElse(null)`. */
            fun cardType(cardType: Optional<String>) = cardType(cardType.getOrNull())

            /**
             * Sets [Builder.cardType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardType] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardType(cardType: JsonField<String>) = apply { this.cardType = cardType }

            /**
             * If payment is made using a checkout session, this field is set to the id of the
             * session.
             */
            fun checkoutSessionId(checkoutSessionId: String?) =
                checkoutSessionId(JsonField.ofNullable(checkoutSessionId))

            /**
             * Alias for calling [Builder.checkoutSessionId] with `checkoutSessionId.orElse(null)`.
             */
            fun checkoutSessionId(checkoutSessionId: Optional<String>) =
                checkoutSessionId(checkoutSessionId.getOrNull())

            /**
             * Sets [Builder.checkoutSessionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.checkoutSessionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun checkoutSessionId(checkoutSessionId: JsonField<String>) = apply {
                this.checkoutSessionId = checkoutSessionId
            }

            /** The discount id if discount is applied */
            fun discountId(discountId: String?) = discountId(JsonField.ofNullable(discountId))

            /** Alias for calling [Builder.discountId] with `discountId.orElse(null)`. */
            fun discountId(discountId: Optional<String>) = discountId(discountId.getOrNull())

            /**
             * Sets [Builder.discountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

            /** An error code if the payment failed */
            fun errorCode(errorCode: String?) = errorCode(JsonField.ofNullable(errorCode))

            /** Alias for calling [Builder.errorCode] with `errorCode.orElse(null)`. */
            fun errorCode(errorCode: Optional<String>) = errorCode(errorCode.getOrNull())

            /**
             * Sets [Builder.errorCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorCode(errorCode: JsonField<String>) = apply { this.errorCode = errorCode }

            /** An error message if the payment failed */
            fun errorMessage(errorMessage: String?) =
                errorMessage(JsonField.ofNullable(errorMessage))

            /** Alias for calling [Builder.errorMessage] with `errorMessage.orElse(null)`. */
            fun errorMessage(errorMessage: Optional<String>) =
                errorMessage(errorMessage.getOrNull())

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * You should usually call [Builder.paymentLink] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentLink(paymentLink: JsonField<String>) = apply {
                this.paymentLink = paymentLink
            }

            /** Payment method used by customer (e.g. "card", "bank_transfer") */
            fun paymentMethod(paymentMethod: String?) =
                paymentMethod(JsonField.ofNullable(paymentMethod))

            /** Alias for calling [Builder.paymentMethod] with `paymentMethod.orElse(null)`. */
            fun paymentMethod(paymentMethod: Optional<String>) =
                paymentMethod(paymentMethod.getOrNull())

            /**
             * Sets [Builder.paymentMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentMethod] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentMethod(paymentMethod: JsonField<String>) = apply {
                this.paymentMethod = paymentMethod
            }

            /** Specific type of payment method (e.g. "visa", "mastercard") */
            fun paymentMethodType(paymentMethodType: String?) =
                paymentMethodType(JsonField.ofNullable(paymentMethodType))

            /**
             * Alias for calling [Builder.paymentMethodType] with `paymentMethodType.orElse(null)`.
             */
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
            fun productCart(productCart: List<Payment.ProductCart>?) =
                productCart(JsonField.ofNullable(productCart))

            /** Alias for calling [Builder.productCart] with `productCart.orElse(null)`. */
            fun productCart(productCart: Optional<List<Payment.ProductCart>>) =
                productCart(productCart.getOrNull())

            /**
             * Sets [Builder.productCart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productCart] with a well-typed
             * `List<Payment.ProductCart>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun productCart(productCart: JsonField<List<Payment.ProductCart>>) = apply {
                this.productCart = productCart.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payment.ProductCart] to [Builder.productCart].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductCart(productCart: Payment.ProductCart) = apply {
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
            fun settlementTax(settlementTax: Int?) =
                settlementTax(JsonField.ofNullable(settlementTax))

            /**
             * Alias for [Builder.settlementTax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun settlementTax(settlementTax: Int) = settlementTax(settlementTax as Int?)

            /** Alias for calling [Builder.settlementTax] with `settlementTax.orElse(null)`. */
            fun settlementTax(settlementTax: Optional<Int>) =
                settlementTax(settlementTax.getOrNull())

            /**
             * Sets [Builder.settlementTax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlementTax] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settlementTax(settlementTax: JsonField<Int>) = apply {
                this.settlementTax = settlementTax
            }

            /** Current status of the payment intent */
            fun status(status: IntentStatus?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<IntentStatus>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [IntentStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun tax(tax: Int?) = tax(JsonField.ofNullable(tax))

            /**
             * Alias for [Builder.tax].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun tax(tax: Int) = tax(tax as Int?)

            /** Alias for calling [Builder.tax] with `tax.orElse(null)`. */
            fun tax(tax: Optional<Int>) = tax(tax.getOrNull())

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Int>) = apply { this.tax = tax }

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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /** The type of payload in the data field */
            fun payloadType(payloadType: PayloadType) = payloadType(JsonField.of(payloadType))

            /**
             * Sets [Builder.payloadType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payloadType] with a well-typed [PayloadType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payloadType(payloadType: JsonField<PayloadType>) = apply {
                this.payloadType = payloadType
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billing()
             * .brandId()
             * .businessId()
             * .createdAt()
             * .currency()
             * .customer()
             * .digitalProductsDelivered()
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
            fun build(): Data =
                Data(
                    checkRequired("billing", billing),
                    checkRequired("brandId", brandId),
                    checkRequired("businessId", businessId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("customer", customer),
                    checkRequired("digitalProductsDelivered", digitalProductsDelivered),
                    checkRequired("disputes", disputes).map { it.toImmutable() },
                    checkRequired("metadata", metadata),
                    checkRequired("paymentId", paymentId),
                    checkRequired("refunds", refunds).map { it.toImmutable() },
                    checkRequired("settlementAmount", settlementAmount),
                    checkRequired("settlementCurrency", settlementCurrency),
                    checkRequired("totalAmount", totalAmount),
                    cardIssuingCountry,
                    cardLastFour,
                    cardNetwork,
                    cardType,
                    checkoutSessionId,
                    discountId,
                    errorCode,
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
                    payloadType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            billing().validate()
            brandId()
            businessId()
            createdAt()
            currency().validate()
            customer().validate()
            digitalProductsDelivered()
            disputes().forEach { it.validate() }
            metadata().validate()
            paymentId()
            refunds().forEach { it.validate() }
            settlementAmount()
            settlementCurrency().validate()
            totalAmount()
            cardIssuingCountry().ifPresent { it.validate() }
            cardLastFour()
            cardNetwork()
            cardType()
            checkoutSessionId()
            discountId()
            errorCode()
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
            payloadType().ifPresent { it.validate() }
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
            (billing.asKnown().getOrNull()?.validity() ?: 0) +
                (if (brandId.asKnown().isPresent) 1 else 0) +
                (if (businessId.asKnown().isPresent) 1 else 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (customer.asKnown().getOrNull()?.validity() ?: 0) +
                (if (digitalProductsDelivered.asKnown().isPresent) 1 else 0) +
                (disputes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (paymentId.asKnown().isPresent) 1 else 0) +
                (refunds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (settlementAmount.asKnown().isPresent) 1 else 0) +
                (settlementCurrency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (totalAmount.asKnown().isPresent) 1 else 0) +
                (cardIssuingCountry.asKnown().getOrNull()?.validity() ?: 0) +
                (if (cardLastFour.asKnown().isPresent) 1 else 0) +
                (if (cardNetwork.asKnown().isPresent) 1 else 0) +
                (if (cardType.asKnown().isPresent) 1 else 0) +
                (if (checkoutSessionId.asKnown().isPresent) 1 else 0) +
                (if (discountId.asKnown().isPresent) 1 else 0) +
                (if (errorCode.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (if (paymentLink.asKnown().isPresent) 1 else 0) +
                (if (paymentMethod.asKnown().isPresent) 1 else 0) +
                (if (paymentMethodType.asKnown().isPresent) 1 else 0) +
                (productCart.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (settlementTax.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                (if (tax.asKnown().isPresent) 1 else 0) +
                (if (updatedAt.asKnown().isPresent) 1 else 0) +
                (payloadType.asKnown().getOrNull()?.validity() ?: 0)

        /** The type of payload in the data field */
        class PayloadType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PAYMENT = of("Payment")

                @JvmStatic fun of(value: String) = PayloadType(JsonField.of(value))
            }

            /** An enum containing [PayloadType]'s known values. */
            enum class Known {
                PAYMENT
            }

            /**
             * An enum containing [PayloadType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PayloadType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PAYMENT,
                /**
                 * An enum member indicating that [PayloadType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PAYMENT -> Value.PAYMENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PAYMENT -> Known.PAYMENT
                    else -> throw DodoPaymentsInvalidDataException("Unknown PayloadType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws DodoPaymentsInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    DodoPaymentsInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): PayloadType = apply {
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

                return other is PayloadType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                billing == other.billing &&
                brandId == other.brandId &&
                businessId == other.businessId &&
                createdAt == other.createdAt &&
                currency == other.currency &&
                customer == other.customer &&
                digitalProductsDelivered == other.digitalProductsDelivered &&
                disputes == other.disputes &&
                metadata == other.metadata &&
                paymentId == other.paymentId &&
                refunds == other.refunds &&
                settlementAmount == other.settlementAmount &&
                settlementCurrency == other.settlementCurrency &&
                totalAmount == other.totalAmount &&
                cardIssuingCountry == other.cardIssuingCountry &&
                cardLastFour == other.cardLastFour &&
                cardNetwork == other.cardNetwork &&
                cardType == other.cardType &&
                checkoutSessionId == other.checkoutSessionId &&
                discountId == other.discountId &&
                errorCode == other.errorCode &&
                errorMessage == other.errorMessage &&
                paymentLink == other.paymentLink &&
                paymentMethod == other.paymentMethod &&
                paymentMethodType == other.paymentMethodType &&
                productCart == other.productCart &&
                settlementTax == other.settlementTax &&
                status == other.status &&
                subscriptionId == other.subscriptionId &&
                tax == other.tax &&
                updatedAt == other.updatedAt &&
                payloadType == other.payloadType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billing,
                brandId,
                businessId,
                createdAt,
                currency,
                customer,
                digitalProductsDelivered,
                disputes,
                metadata,
                paymentId,
                refunds,
                settlementAmount,
                settlementCurrency,
                totalAmount,
                cardIssuingCountry,
                cardLastFour,
                cardNetwork,
                cardType,
                checkoutSessionId,
                discountId,
                errorCode,
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
                payloadType,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{billing=$billing, brandId=$brandId, businessId=$businessId, createdAt=$createdAt, currency=$currency, customer=$customer, digitalProductsDelivered=$digitalProductsDelivered, disputes=$disputes, metadata=$metadata, paymentId=$paymentId, refunds=$refunds, settlementAmount=$settlementAmount, settlementCurrency=$settlementCurrency, totalAmount=$totalAmount, cardIssuingCountry=$cardIssuingCountry, cardLastFour=$cardLastFour, cardNetwork=$cardNetwork, cardType=$cardType, checkoutSessionId=$checkoutSessionId, discountId=$discountId, errorCode=$errorCode, errorMessage=$errorMessage, paymentLink=$paymentLink, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, productCart=$productCart, settlementTax=$settlementTax, status=$status, subscriptionId=$subscriptionId, tax=$tax, updatedAt=$updatedAt, payloadType=$payloadType, additionalProperties=$additionalProperties}"
    }

    /** The event type */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PAYMENT_PROCESSING = of("payment.processing")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PAYMENT_PROCESSING
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENT_PROCESSING,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                PAYMENT_PROCESSING -> Value.PAYMENT_PROCESSING
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
                PAYMENT_PROCESSING -> Known.PAYMENT_PROCESSING
                else -> throw DodoPaymentsInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentProcessingWebhookEvent &&
            businessId == other.businessId &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(businessId, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentProcessingWebhookEvent{businessId=$businessId, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
