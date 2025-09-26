// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Response struct representing subscription details */
class Subscription
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addons: JsonField<List<AddonCartResponseItem>>,
    private val billing: JsonField<BillingAddress>,
    private val cancelAtNextBillingDate: JsonField<Boolean>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val customer: JsonField<CustomerLimitedDetails>,
    private val metadata: JsonField<Metadata>,
    private val meters: JsonField<List<Meter>>,
    private val nextBillingDate: JsonField<OffsetDateTime>,
    private val onDemand: JsonField<Boolean>,
    private val paymentFrequencyCount: JsonField<Int>,
    private val paymentFrequencyInterval: JsonField<TimeInterval>,
    private val previousBillingDate: JsonField<OffsetDateTime>,
    private val productId: JsonField<String>,
    private val quantity: JsonField<Int>,
    private val recurringPreTaxAmount: JsonField<Int>,
    private val status: JsonField<SubscriptionStatus>,
    private val subscriptionId: JsonField<String>,
    private val subscriptionPeriodCount: JsonField<Int>,
    private val subscriptionPeriodInterval: JsonField<TimeInterval>,
    private val taxInclusive: JsonField<Boolean>,
    private val trialPeriodDays: JsonField<Int>,
    private val cancelledAt: JsonField<OffsetDateTime>,
    private val discountCyclesRemaining: JsonField<Int>,
    private val discountId: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("addons")
        @ExcludeMissing
        addons: JsonField<List<AddonCartResponseItem>> = JsonMissing.of(),
        @JsonProperty("billing")
        @ExcludeMissing
        billing: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("cancel_at_next_billing_date")
        @ExcludeMissing
        cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerLimitedDetails> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("meters") @ExcludeMissing meters: JsonField<List<Meter>> = JsonMissing.of(),
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("on_demand") @ExcludeMissing onDemand: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("payment_frequency_count")
        @ExcludeMissing
        paymentFrequencyCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("payment_frequency_interval")
        @ExcludeMissing
        paymentFrequencyInterval: JsonField<TimeInterval> = JsonMissing.of(),
        @JsonProperty("previous_billing_date")
        @ExcludeMissing
        previousBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("recurring_pre_tax_amount")
        @ExcludeMissing
        recurringPreTaxAmount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<SubscriptionStatus> = JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("subscription_period_count")
        @ExcludeMissing
        subscriptionPeriodCount: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("subscription_period_interval")
        @ExcludeMissing
        subscriptionPeriodInterval: JsonField<TimeInterval> = JsonMissing.of(),
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        taxInclusive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("cancelled_at")
        @ExcludeMissing
        cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("discount_cycles_remaining")
        @ExcludeMissing
        discountCyclesRemaining: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        addons,
        billing,
        cancelAtNextBillingDate,
        createdAt,
        currency,
        customer,
        metadata,
        meters,
        nextBillingDate,
        onDemand,
        paymentFrequencyCount,
        paymentFrequencyInterval,
        previousBillingDate,
        productId,
        quantity,
        recurringPreTaxAmount,
        status,
        subscriptionId,
        subscriptionPeriodCount,
        subscriptionPeriodInterval,
        taxInclusive,
        trialPeriodDays,
        cancelledAt,
        discountCyclesRemaining,
        discountId,
        expiresAt,
        mutableMapOf(),
    )

    /**
     * Addons associated with this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun addons(): List<AddonCartResponseItem> = addons.getRequired("addons")

    /**
     * Billing address details for payments
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun billing(): BillingAddress = billing.getRequired("billing")

    /**
     * Indicates if the subscription will cancel at the next billing date
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cancelAtNextBillingDate(): Boolean =
        cancelAtNextBillingDate.getRequired("cancel_at_next_billing_date")

    /**
     * Timestamp when the subscription was created
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Currency used for the subscription payments
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Customer details associated with the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customer(): CustomerLimitedDetails = customer.getRequired("customer")

    /**
     * Additional custom data associated with the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Meters associated with this subscription (for usage-based billing)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun meters(): List<Meter> = meters.getRequired("meters")

    /**
     * Timestamp of the next scheduled billing. Indicates the end of current billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nextBillingDate(): OffsetDateTime = nextBillingDate.getRequired("next_billing_date")

    /**
     * Wether the subscription is on-demand or not
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun onDemand(): Boolean = onDemand.getRequired("on_demand")

    /**
     * Number of payment frequency intervals
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentFrequencyCount(): Int = paymentFrequencyCount.getRequired("payment_frequency_count")

    /**
     * Time interval for payment frequency (e.g. month, year)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentFrequencyInterval(): TimeInterval =
        paymentFrequencyInterval.getRequired("payment_frequency_interval")

    /**
     * Timestamp of the last payment. Indicates the start of current billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun previousBillingDate(): OffsetDateTime =
        previousBillingDate.getRequired("previous_billing_date")

    /**
     * Identifier of the product associated with this subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Number of units/items included in the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quantity(): Int = quantity.getRequired("quantity")

    /**
     * Amount charged before tax for each recurring payment in smallest currency unit (e.g. cents)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recurringPreTaxAmount(): Int = recurringPreTaxAmount.getRequired("recurring_pre_tax_amount")

    /**
     * Current status of the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): SubscriptionStatus = status.getRequired("status")

    /**
     * Unique identifier for the subscription
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionId(): String = subscriptionId.getRequired("subscription_id")

    /**
     * Number of subscription period intervals
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionPeriodCount(): Int =
        subscriptionPeriodCount.getRequired("subscription_period_count")

    /**
     * Time interval for the subscription period (e.g. month, year)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun subscriptionPeriodInterval(): TimeInterval =
        subscriptionPeriodInterval.getRequired("subscription_period_interval")

    /**
     * Indicates if the recurring_pre_tax_amount is tax inclusive
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxInclusive(): Boolean = taxInclusive.getRequired("tax_inclusive")

    /**
     * Number of days in the trial period (0 if no trial)
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun trialPeriodDays(): Int = trialPeriodDays.getRequired("trial_period_days")

    /**
     * Cancelled timestamp if the subscription is cancelled
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelledAt(): Optional<OffsetDateTime> = cancelledAt.getOptional("cancelled_at")

    /**
     * Number of remaining discount cycles if discount is applied
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCyclesRemaining(): Optional<Int> =
        discountCyclesRemaining.getOptional("discount_cycles_remaining")

    /**
     * The discount id if discount is applied
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountId(): Optional<String> = discountId.getOptional("discount_id")

    /**
     * Timestamp when the subscription will expire
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): Optional<OffsetDateTime> = expiresAt.getOptional("expires_at")

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("addons")
    @ExcludeMissing
    fun _addons(): JsonField<List<AddonCartResponseItem>> = addons

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing") @ExcludeMissing fun _billing(): JsonField<BillingAddress> = billing

    /**
     * Returns the raw JSON value of [cancelAtNextBillingDate].
     *
     * Unlike [cancelAtNextBillingDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cancel_at_next_billing_date")
    @ExcludeMissing
    fun _cancelAtNextBillingDate(): JsonField<Boolean> = cancelAtNextBillingDate

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
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [meters].
     *
     * Unlike [meters], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meters") @ExcludeMissing fun _meters(): JsonField<List<Meter>> = meters

    /**
     * Returns the raw JSON value of [nextBillingDate].
     *
     * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_billing_date")
    @ExcludeMissing
    fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

    /**
     * Returns the raw JSON value of [onDemand].
     *
     * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("on_demand") @ExcludeMissing fun _onDemand(): JsonField<Boolean> = onDemand

    /**
     * Returns the raw JSON value of [paymentFrequencyCount].
     *
     * Unlike [paymentFrequencyCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("payment_frequency_count")
    @ExcludeMissing
    fun _paymentFrequencyCount(): JsonField<Int> = paymentFrequencyCount

    /**
     * Returns the raw JSON value of [paymentFrequencyInterval].
     *
     * Unlike [paymentFrequencyInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("payment_frequency_interval")
    @ExcludeMissing
    fun _paymentFrequencyInterval(): JsonField<TimeInterval> = paymentFrequencyInterval

    /**
     * Returns the raw JSON value of [previousBillingDate].
     *
     * Unlike [previousBillingDate], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("previous_billing_date")
    @ExcludeMissing
    fun _previousBillingDate(): JsonField<OffsetDateTime> = previousBillingDate

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
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Int> = quantity

    /**
     * Returns the raw JSON value of [recurringPreTaxAmount].
     *
     * Unlike [recurringPreTaxAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("recurring_pre_tax_amount")
    @ExcludeMissing
    fun _recurringPreTaxAmount(): JsonField<Int> = recurringPreTaxAmount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<SubscriptionStatus> = status

    /**
     * Returns the raw JSON value of [subscriptionId].
     *
     * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    /**
     * Returns the raw JSON value of [subscriptionPeriodCount].
     *
     * Unlike [subscriptionPeriodCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscription_period_count")
    @ExcludeMissing
    fun _subscriptionPeriodCount(): JsonField<Int> = subscriptionPeriodCount

    /**
     * Returns the raw JSON value of [subscriptionPeriodInterval].
     *
     * Unlike [subscriptionPeriodInterval], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("subscription_period_interval")
    @ExcludeMissing
    fun _subscriptionPeriodInterval(): JsonField<TimeInterval> = subscriptionPeriodInterval

    /**
     * Returns the raw JSON value of [taxInclusive].
     *
     * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    fun _taxInclusive(): JsonField<Boolean> = taxInclusive

    /**
     * Returns the raw JSON value of [trialPeriodDays].
     *
     * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("trial_period_days")
    @ExcludeMissing
    fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

    /**
     * Returns the raw JSON value of [cancelledAt].
     *
     * Unlike [cancelledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancelled_at")
    @ExcludeMissing
    fun _cancelledAt(): JsonField<OffsetDateTime> = cancelledAt

    /**
     * Returns the raw JSON value of [discountCyclesRemaining].
     *
     * Unlike [discountCyclesRemaining], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("discount_cycles_remaining")
    @ExcludeMissing
    fun _discountCyclesRemaining(): JsonField<Int> = discountCyclesRemaining

    /**
     * Returns the raw JSON value of [discountId].
     *
     * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_id") @ExcludeMissing fun _discountId(): JsonField<String> = discountId

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
         * Returns a mutable builder for constructing an instance of [Subscription].
         *
         * The following fields are required:
         * ```java
         * .addons()
         * .billing()
         * .cancelAtNextBillingDate()
         * .createdAt()
         * .currency()
         * .customer()
         * .metadata()
         * .meters()
         * .nextBillingDate()
         * .onDemand()
         * .paymentFrequencyCount()
         * .paymentFrequencyInterval()
         * .previousBillingDate()
         * .productId()
         * .quantity()
         * .recurringPreTaxAmount()
         * .status()
         * .subscriptionId()
         * .subscriptionPeriodCount()
         * .subscriptionPeriodInterval()
         * .taxInclusive()
         * .trialPeriodDays()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Subscription]. */
    class Builder internal constructor() {

        private var addons: JsonField<MutableList<AddonCartResponseItem>>? = null
        private var billing: JsonField<BillingAddress>? = null
        private var cancelAtNextBillingDate: JsonField<Boolean>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<CustomerLimitedDetails>? = null
        private var metadata: JsonField<Metadata>? = null
        private var meters: JsonField<MutableList<Meter>>? = null
        private var nextBillingDate: JsonField<OffsetDateTime>? = null
        private var onDemand: JsonField<Boolean>? = null
        private var paymentFrequencyCount: JsonField<Int>? = null
        private var paymentFrequencyInterval: JsonField<TimeInterval>? = null
        private var previousBillingDate: JsonField<OffsetDateTime>? = null
        private var productId: JsonField<String>? = null
        private var quantity: JsonField<Int>? = null
        private var recurringPreTaxAmount: JsonField<Int>? = null
        private var status: JsonField<SubscriptionStatus>? = null
        private var subscriptionId: JsonField<String>? = null
        private var subscriptionPeriodCount: JsonField<Int>? = null
        private var subscriptionPeriodInterval: JsonField<TimeInterval>? = null
        private var taxInclusive: JsonField<Boolean>? = null
        private var trialPeriodDays: JsonField<Int>? = null
        private var cancelledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var discountCyclesRemaining: JsonField<Int> = JsonMissing.of()
        private var discountId: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(subscription: Subscription) = apply {
            addons = subscription.addons.map { it.toMutableList() }
            billing = subscription.billing
            cancelAtNextBillingDate = subscription.cancelAtNextBillingDate
            createdAt = subscription.createdAt
            currency = subscription.currency
            customer = subscription.customer
            metadata = subscription.metadata
            meters = subscription.meters.map { it.toMutableList() }
            nextBillingDate = subscription.nextBillingDate
            onDemand = subscription.onDemand
            paymentFrequencyCount = subscription.paymentFrequencyCount
            paymentFrequencyInterval = subscription.paymentFrequencyInterval
            previousBillingDate = subscription.previousBillingDate
            productId = subscription.productId
            quantity = subscription.quantity
            recurringPreTaxAmount = subscription.recurringPreTaxAmount
            status = subscription.status
            subscriptionId = subscription.subscriptionId
            subscriptionPeriodCount = subscription.subscriptionPeriodCount
            subscriptionPeriodInterval = subscription.subscriptionPeriodInterval
            taxInclusive = subscription.taxInclusive
            trialPeriodDays = subscription.trialPeriodDays
            cancelledAt = subscription.cancelledAt
            discountCyclesRemaining = subscription.discountCyclesRemaining
            discountId = subscription.discountId
            expiresAt = subscription.expiresAt
            additionalProperties = subscription.additionalProperties.toMutableMap()
        }

        /** Addons associated with this subscription */
        fun addons(addons: List<AddonCartResponseItem>) = addons(JsonField.of(addons))

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<AddonCartResponseItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun addons(addons: JsonField<List<AddonCartResponseItem>>) = apply {
            this.addons = addons.map { it.toMutableList() }
        }

        /**
         * Adds a single [AddonCartResponseItem] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: AddonCartResponseItem) = apply {
            addons =
                (addons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("addons", it).add(addon)
                }
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

        /** Indicates if the subscription will cancel at the next billing date */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
            cancelAtNextBillingDate(JsonField.of(cancelAtNextBillingDate))

        /**
         * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
            this.cancelAtNextBillingDate = cancelAtNextBillingDate
        }

        /** Timestamp when the subscription was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Currency used for the subscription payments */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Customer details associated with the subscription */
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

        /** Additional custom data associated with the subscription */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Meters associated with this subscription (for usage-based billing) */
        fun meters(meters: List<Meter>) = meters(JsonField.of(meters))

        /**
         * Sets [Builder.meters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.meters] with a well-typed `List<Meter>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun meters(meters: JsonField<List<Meter>>) = apply {
            this.meters = meters.map { it.toMutableList() }
        }

        /**
         * Adds a single [Meter] to [meters].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMeter(meter: Meter) = apply {
            meters =
                (meters ?: JsonField.of(mutableListOf())).also {
                    checkKnown("meters", it).add(meter)
                }
        }

        /** Timestamp of the next scheduled billing. Indicates the end of current billing period */
        fun nextBillingDate(nextBillingDate: OffsetDateTime) =
            nextBillingDate(JsonField.of(nextBillingDate))

        /**
         * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
            this.nextBillingDate = nextBillingDate
        }

        /** Wether the subscription is on-demand or not */
        fun onDemand(onDemand: Boolean) = onDemand(JsonField.of(onDemand))

        /**
         * Sets [Builder.onDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.onDemand] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun onDemand(onDemand: JsonField<Boolean>) = apply { this.onDemand = onDemand }

        /** Number of payment frequency intervals */
        fun paymentFrequencyCount(paymentFrequencyCount: Int) =
            paymentFrequencyCount(JsonField.of(paymentFrequencyCount))

        /**
         * Sets [Builder.paymentFrequencyCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentFrequencyCount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun paymentFrequencyCount(paymentFrequencyCount: JsonField<Int>) = apply {
            this.paymentFrequencyCount = paymentFrequencyCount
        }

        /** Time interval for payment frequency (e.g. month, year) */
        fun paymentFrequencyInterval(paymentFrequencyInterval: TimeInterval) =
            paymentFrequencyInterval(JsonField.of(paymentFrequencyInterval))

        /**
         * Sets [Builder.paymentFrequencyInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentFrequencyInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun paymentFrequencyInterval(paymentFrequencyInterval: JsonField<TimeInterval>) = apply {
            this.paymentFrequencyInterval = paymentFrequencyInterval
        }

        /** Timestamp of the last payment. Indicates the start of current billing period */
        fun previousBillingDate(previousBillingDate: OffsetDateTime) =
            previousBillingDate(JsonField.of(previousBillingDate))

        /**
         * Sets [Builder.previousBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.previousBillingDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun previousBillingDate(previousBillingDate: JsonField<OffsetDateTime>) = apply {
            this.previousBillingDate = previousBillingDate
        }

        /** Identifier of the product associated with this subscription */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Number of units/items included in the subscription */
        fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

        /**
         * Sets [Builder.quantity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantity] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

        /**
         * Amount charged before tax for each recurring payment in smallest currency unit (e.g.
         * cents)
         */
        fun recurringPreTaxAmount(recurringPreTaxAmount: Int) =
            recurringPreTaxAmount(JsonField.of(recurringPreTaxAmount))

        /**
         * Sets [Builder.recurringPreTaxAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recurringPreTaxAmount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun recurringPreTaxAmount(recurringPreTaxAmount: JsonField<Int>) = apply {
            this.recurringPreTaxAmount = recurringPreTaxAmount
        }

        /** Current status of the subscription */
        fun status(status: SubscriptionStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SubscriptionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<SubscriptionStatus>) = apply { this.status = status }

        /** Unique identifier for the subscription */
        fun subscriptionId(subscriptionId: String) = subscriptionId(JsonField.of(subscriptionId))

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

        /** Number of subscription period intervals */
        fun subscriptionPeriodCount(subscriptionPeriodCount: Int) =
            subscriptionPeriodCount(JsonField.of(subscriptionPeriodCount))

        /**
         * Sets [Builder.subscriptionPeriodCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionPeriodCount] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun subscriptionPeriodCount(subscriptionPeriodCount: JsonField<Int>) = apply {
            this.subscriptionPeriodCount = subscriptionPeriodCount
        }

        /** Time interval for the subscription period (e.g. month, year) */
        fun subscriptionPeriodInterval(subscriptionPeriodInterval: TimeInterval) =
            subscriptionPeriodInterval(JsonField.of(subscriptionPeriodInterval))

        /**
         * Sets [Builder.subscriptionPeriodInterval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionPeriodInterval] with a well-typed
         * [TimeInterval] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun subscriptionPeriodInterval(subscriptionPeriodInterval: JsonField<TimeInterval>) =
            apply {
                this.subscriptionPeriodInterval = subscriptionPeriodInterval
            }

        /** Indicates if the recurring_pre_tax_amount is tax inclusive */
        fun taxInclusive(taxInclusive: Boolean) = taxInclusive(JsonField.of(taxInclusive))

        /**
         * Sets [Builder.taxInclusive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxInclusive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun taxInclusive(taxInclusive: JsonField<Boolean>) = apply {
            this.taxInclusive = taxInclusive
        }

        /** Number of days in the trial period (0 if no trial) */
        fun trialPeriodDays(trialPeriodDays: Int) = trialPeriodDays(JsonField.of(trialPeriodDays))

        /**
         * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
            this.trialPeriodDays = trialPeriodDays
        }

        /** Cancelled timestamp if the subscription is cancelled */
        fun cancelledAt(cancelledAt: OffsetDateTime?) =
            cancelledAt(JsonField.ofNullable(cancelledAt))

        /** Alias for calling [Builder.cancelledAt] with `cancelledAt.orElse(null)`. */
        fun cancelledAt(cancelledAt: Optional<OffsetDateTime>) =
            cancelledAt(cancelledAt.getOrNull())

        /**
         * Sets [Builder.cancelledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancelledAt(cancelledAt: JsonField<OffsetDateTime>) = apply {
            this.cancelledAt = cancelledAt
        }

        /** Number of remaining discount cycles if discount is applied */
        fun discountCyclesRemaining(discountCyclesRemaining: Int?) =
            discountCyclesRemaining(JsonField.ofNullable(discountCyclesRemaining))

        /**
         * Alias for [Builder.discountCyclesRemaining].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun discountCyclesRemaining(discountCyclesRemaining: Int) =
            discountCyclesRemaining(discountCyclesRemaining as Int?)

        /**
         * Alias for calling [Builder.discountCyclesRemaining] with
         * `discountCyclesRemaining.orElse(null)`.
         */
        fun discountCyclesRemaining(discountCyclesRemaining: Optional<Int>) =
            discountCyclesRemaining(discountCyclesRemaining.getOrNull())

        /**
         * Sets [Builder.discountCyclesRemaining] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCyclesRemaining] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discountCyclesRemaining(discountCyclesRemaining: JsonField<Int>) = apply {
            this.discountCyclesRemaining = discountCyclesRemaining
        }

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

        /** Timestamp when the subscription will expire */
        fun expiresAt(expiresAt: OffsetDateTime?) = expiresAt(JsonField.ofNullable(expiresAt))

        /** Alias for calling [Builder.expiresAt] with `expiresAt.orElse(null)`. */
        fun expiresAt(expiresAt: Optional<OffsetDateTime>) = expiresAt(expiresAt.getOrNull())

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

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
         * Returns an immutable instance of [Subscription].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .addons()
         * .billing()
         * .cancelAtNextBillingDate()
         * .createdAt()
         * .currency()
         * .customer()
         * .metadata()
         * .meters()
         * .nextBillingDate()
         * .onDemand()
         * .paymentFrequencyCount()
         * .paymentFrequencyInterval()
         * .previousBillingDate()
         * .productId()
         * .quantity()
         * .recurringPreTaxAmount()
         * .status()
         * .subscriptionId()
         * .subscriptionPeriodCount()
         * .subscriptionPeriodInterval()
         * .taxInclusive()
         * .trialPeriodDays()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Subscription =
            Subscription(
                checkRequired("addons", addons).map { it.toImmutable() },
                checkRequired("billing", billing),
                checkRequired("cancelAtNextBillingDate", cancelAtNextBillingDate),
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("meters", meters).map { it.toImmutable() },
                checkRequired("nextBillingDate", nextBillingDate),
                checkRequired("onDemand", onDemand),
                checkRequired("paymentFrequencyCount", paymentFrequencyCount),
                checkRequired("paymentFrequencyInterval", paymentFrequencyInterval),
                checkRequired("previousBillingDate", previousBillingDate),
                checkRequired("productId", productId),
                checkRequired("quantity", quantity),
                checkRequired("recurringPreTaxAmount", recurringPreTaxAmount),
                checkRequired("status", status),
                checkRequired("subscriptionId", subscriptionId),
                checkRequired("subscriptionPeriodCount", subscriptionPeriodCount),
                checkRequired("subscriptionPeriodInterval", subscriptionPeriodInterval),
                checkRequired("taxInclusive", taxInclusive),
                checkRequired("trialPeriodDays", trialPeriodDays),
                cancelledAt,
                discountCyclesRemaining,
                discountId,
                expiresAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Subscription = apply {
        if (validated) {
            return@apply
        }

        addons().forEach { it.validate() }
        billing().validate()
        cancelAtNextBillingDate()
        createdAt()
        currency().validate()
        customer().validate()
        metadata().validate()
        meters().forEach { it.validate() }
        nextBillingDate()
        onDemand()
        paymentFrequencyCount()
        paymentFrequencyInterval().validate()
        previousBillingDate()
        productId()
        quantity()
        recurringPreTaxAmount()
        status().validate()
        subscriptionId()
        subscriptionPeriodCount()
        subscriptionPeriodInterval().validate()
        taxInclusive()
        trialPeriodDays()
        cancelledAt()
        discountCyclesRemaining()
        discountId()
        expiresAt()
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
        (addons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (billing.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cancelAtNextBillingDate.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (meters.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextBillingDate.asKnown().isPresent) 1 else 0) +
            (if (onDemand.asKnown().isPresent) 1 else 0) +
            (if (paymentFrequencyCount.asKnown().isPresent) 1 else 0) +
            (paymentFrequencyInterval.asKnown().getOrNull()?.validity() ?: 0) +
            (if (previousBillingDate.asKnown().isPresent) 1 else 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (if (quantity.asKnown().isPresent) 1 else 0) +
            (if (recurringPreTaxAmount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (subscriptionId.asKnown().isPresent) 1 else 0) +
            (if (subscriptionPeriodCount.asKnown().isPresent) 1 else 0) +
            (subscriptionPeriodInterval.asKnown().getOrNull()?.validity() ?: 0) +
            (if (taxInclusive.asKnown().isPresent) 1 else 0) +
            (if (trialPeriodDays.asKnown().isPresent) 1 else 0) +
            (if (cancelledAt.asKnown().isPresent) 1 else 0) +
            (if (discountCyclesRemaining.asKnown().isPresent) 1 else 0) +
            (if (discountId.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0)

    /** Additional custom data associated with the subscription */
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    /** Response struct representing usage-based meter cart details for a subscription */
    class Meter
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<Currency>,
        private val freeThreshold: JsonField<Long>,
        private val measurementUnit: JsonField<String>,
        private val meterId: JsonField<String>,
        private val name: JsonField<String>,
        private val pricePerUnit: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("free_threshold")
            @ExcludeMissing
            freeThreshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("measurement_unit")
            @ExcludeMissing
            measurementUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("meter_id") @ExcludeMissing meterId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price_per_unit")
            @ExcludeMissing
            pricePerUnit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(
            currency,
            freeThreshold,
            measurementUnit,
            meterId,
            name,
            pricePerUnit,
            description,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): Currency = currency.getRequired("currency")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun freeThreshold(): Long = freeThreshold.getRequired("free_threshold")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun measurementUnit(): String = measurementUnit.getRequired("measurement_unit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun meterId(): String = meterId.getRequired("meter_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pricePerUnit(): String = pricePerUnit.getRequired("price_per_unit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

        /**
         * Returns the raw JSON value of [freeThreshold].
         *
         * Unlike [freeThreshold], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("free_threshold")
        @ExcludeMissing
        fun _freeThreshold(): JsonField<Long> = freeThreshold

        /**
         * Returns the raw JSON value of [measurementUnit].
         *
         * Unlike [measurementUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("measurement_unit")
        @ExcludeMissing
        fun _measurementUnit(): JsonField<String> = measurementUnit

        /**
         * Returns the raw JSON value of [meterId].
         *
         * Unlike [meterId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("meter_id") @ExcludeMissing fun _meterId(): JsonField<String> = meterId

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [pricePerUnit].
         *
         * Unlike [pricePerUnit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("price_per_unit")
        @ExcludeMissing
        fun _pricePerUnit(): JsonField<String> = pricePerUnit

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

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
             * Returns a mutable builder for constructing an instance of [Meter].
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .freeThreshold()
             * .measurementUnit()
             * .meterId()
             * .name()
             * .pricePerUnit()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Meter]. */
        class Builder internal constructor() {

            private var currency: JsonField<Currency>? = null
            private var freeThreshold: JsonField<Long>? = null
            private var measurementUnit: JsonField<String>? = null
            private var meterId: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var pricePerUnit: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(meter: Meter) = apply {
                currency = meter.currency
                freeThreshold = meter.freeThreshold
                measurementUnit = meter.measurementUnit
                meterId = meter.meterId
                name = meter.name
                pricePerUnit = meter.pricePerUnit
                description = meter.description
                additionalProperties = meter.additionalProperties.toMutableMap()
            }

            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [Currency] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            fun freeThreshold(freeThreshold: Long) = freeThreshold(JsonField.of(freeThreshold))

            /**
             * Sets [Builder.freeThreshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.freeThreshold] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun freeThreshold(freeThreshold: JsonField<Long>) = apply {
                this.freeThreshold = freeThreshold
            }

            fun measurementUnit(measurementUnit: String) =
                measurementUnit(JsonField.of(measurementUnit))

            /**
             * Sets [Builder.measurementUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.measurementUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun measurementUnit(measurementUnit: JsonField<String>) = apply {
                this.measurementUnit = measurementUnit
            }

            fun meterId(meterId: String) = meterId(JsonField.of(meterId))

            /**
             * Sets [Builder.meterId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.meterId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun meterId(meterId: JsonField<String>) = apply { this.meterId = meterId }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun pricePerUnit(pricePerUnit: String) = pricePerUnit(JsonField.of(pricePerUnit))

            /**
             * Sets [Builder.pricePerUnit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricePerUnit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pricePerUnit(pricePerUnit: JsonField<String>) = apply {
                this.pricePerUnit = pricePerUnit
            }

            fun description(description: String?) = description(JsonField.ofNullable(description))

            /** Alias for calling [Builder.description] with `description.orElse(null)`. */
            fun description(description: Optional<String>) = description(description.getOrNull())

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
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
             * Returns an immutable instance of [Meter].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .currency()
             * .freeThreshold()
             * .measurementUnit()
             * .meterId()
             * .name()
             * .pricePerUnit()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Meter =
                Meter(
                    checkRequired("currency", currency),
                    checkRequired("freeThreshold", freeThreshold),
                    checkRequired("measurementUnit", measurementUnit),
                    checkRequired("meterId", meterId),
                    checkRequired("name", name),
                    checkRequired("pricePerUnit", pricePerUnit),
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Meter = apply {
            if (validated) {
                return@apply
            }

            currency().validate()
            freeThreshold()
            measurementUnit()
            meterId()
            name()
            pricePerUnit()
            description()
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
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
                (if (freeThreshold.asKnown().isPresent) 1 else 0) +
                (if (measurementUnit.asKnown().isPresent) 1 else 0) +
                (if (meterId.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (pricePerUnit.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Meter &&
                currency == other.currency &&
                freeThreshold == other.freeThreshold &&
                measurementUnit == other.measurementUnit &&
                meterId == other.meterId &&
                name == other.name &&
                pricePerUnit == other.pricePerUnit &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                freeThreshold,
                measurementUnit,
                meterId,
                name,
                pricePerUnit,
                description,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Meter{currency=$currency, freeThreshold=$freeThreshold, measurementUnit=$measurementUnit, meterId=$meterId, name=$name, pricePerUnit=$pricePerUnit, description=$description, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Subscription &&
            addons == other.addons &&
            billing == other.billing &&
            cancelAtNextBillingDate == other.cancelAtNextBillingDate &&
            createdAt == other.createdAt &&
            currency == other.currency &&
            customer == other.customer &&
            metadata == other.metadata &&
            meters == other.meters &&
            nextBillingDate == other.nextBillingDate &&
            onDemand == other.onDemand &&
            paymentFrequencyCount == other.paymentFrequencyCount &&
            paymentFrequencyInterval == other.paymentFrequencyInterval &&
            previousBillingDate == other.previousBillingDate &&
            productId == other.productId &&
            quantity == other.quantity &&
            recurringPreTaxAmount == other.recurringPreTaxAmount &&
            status == other.status &&
            subscriptionId == other.subscriptionId &&
            subscriptionPeriodCount == other.subscriptionPeriodCount &&
            subscriptionPeriodInterval == other.subscriptionPeriodInterval &&
            taxInclusive == other.taxInclusive &&
            trialPeriodDays == other.trialPeriodDays &&
            cancelledAt == other.cancelledAt &&
            discountCyclesRemaining == other.discountCyclesRemaining &&
            discountId == other.discountId &&
            expiresAt == other.expiresAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            addons,
            billing,
            cancelAtNextBillingDate,
            createdAt,
            currency,
            customer,
            metadata,
            meters,
            nextBillingDate,
            onDemand,
            paymentFrequencyCount,
            paymentFrequencyInterval,
            previousBillingDate,
            productId,
            quantity,
            recurringPreTaxAmount,
            status,
            subscriptionId,
            subscriptionPeriodCount,
            subscriptionPeriodInterval,
            taxInclusive,
            trialPeriodDays,
            cancelledAt,
            discountCyclesRemaining,
            discountId,
            expiresAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Subscription{addons=$addons, billing=$billing, cancelAtNextBillingDate=$cancelAtNextBillingDate, createdAt=$createdAt, currency=$currency, customer=$customer, metadata=$metadata, meters=$meters, nextBillingDate=$nextBillingDate, onDemand=$onDemand, paymentFrequencyCount=$paymentFrequencyCount, paymentFrequencyInterval=$paymentFrequencyInterval, previousBillingDate=$previousBillingDate, productId=$productId, quantity=$quantity, recurringPreTaxAmount=$recurringPreTaxAmount, status=$status, subscriptionId=$subscriptionId, subscriptionPeriodCount=$subscriptionPeriodCount, subscriptionPeriodInterval=$subscriptionPeriodInterval, taxInclusive=$taxInclusive, trialPeriodDays=$trialPeriodDays, cancelledAt=$cancelledAt, discountCyclesRemaining=$discountCyclesRemaining, discountId=$discountId, expiresAt=$expiresAt, additionalProperties=$additionalProperties}"
}
