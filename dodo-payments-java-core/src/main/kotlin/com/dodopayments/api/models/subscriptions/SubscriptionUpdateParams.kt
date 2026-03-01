// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.payments.BillingAddress
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class SubscriptionUpdateParams
private constructor(
    private val subscriptionId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun subscriptionId(): Optional<String> = Optional.ofNullable(subscriptionId)

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billing(): Optional<BillingAddress> = body.billing()

    /**
     * When set, the subscription will remain active until the end of billing period
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cancelAtNextBillingDate(): Optional<Boolean> = body.cancelAtNextBillingDate()

    /**
     * Update credit entitlement cart settings
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun creditEntitlementCart(): Optional<List<CreditEntitlementCart>> =
        body.creditEntitlementCart()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerName(): Optional<String> = body.customerName()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun disableOnDemand(): Optional<DisableOnDemand> = body.disableOnDemand()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun nextBillingDate(): Optional<OffsetDateTime> = body.nextBillingDate()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Optional<SubscriptionStatus> = body.status()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): Optional<String> = body.taxId()

    /**
     * Returns the raw JSON value of [billing].
     *
     * Unlike [billing], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billing(): JsonField<BillingAddress> = body._billing()

    /**
     * Returns the raw JSON value of [cancelAtNextBillingDate].
     *
     * Unlike [cancelAtNextBillingDate], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _cancelAtNextBillingDate(): JsonField<Boolean> = body._cancelAtNextBillingDate()

    /**
     * Returns the raw JSON value of [creditEntitlementCart].
     *
     * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCart>> =
        body._creditEntitlementCart()

    /**
     * Returns the raw JSON value of [customerName].
     *
     * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerName(): JsonField<String> = body._customerName()

    /**
     * Returns the raw JSON value of [disableOnDemand].
     *
     * Unlike [disableOnDemand], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _disableOnDemand(): JsonField<DisableOnDemand> = body._disableOnDemand()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [nextBillingDate].
     *
     * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _nextBillingDate(): JsonField<OffsetDateTime> = body._nextBillingDate()

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _status(): JsonField<SubscriptionStatus> = body._status()

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxId(): JsonField<String> = body._taxId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): SubscriptionUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [SubscriptionUpdateParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SubscriptionUpdateParams]. */
    class Builder internal constructor() {

        private var subscriptionId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(subscriptionUpdateParams: SubscriptionUpdateParams) = apply {
            subscriptionId = subscriptionUpdateParams.subscriptionId
            body = subscriptionUpdateParams.body.toBuilder()
            additionalHeaders = subscriptionUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = subscriptionUpdateParams.additionalQueryParams.toBuilder()
        }

        fun subscriptionId(subscriptionId: String?) = apply { this.subscriptionId = subscriptionId }

        /** Alias for calling [Builder.subscriptionId] with `subscriptionId.orElse(null)`. */
        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [billing]
         * - [cancelAtNextBillingDate]
         * - [creditEntitlementCart]
         * - [customerName]
         * - [disableOnDemand]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun billing(billing: BillingAddress?) = apply { body.billing(billing) }

        /** Alias for calling [Builder.billing] with `billing.orElse(null)`. */
        fun billing(billing: Optional<BillingAddress>) = billing(billing.getOrNull())

        /**
         * Sets [Builder.billing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billing(billing: JsonField<BillingAddress>) = apply { body.billing(billing) }

        /** When set, the subscription will remain active until the end of billing period */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean?) = apply {
            body.cancelAtNextBillingDate(cancelAtNextBillingDate)
        }

        /**
         * Alias for [Builder.cancelAtNextBillingDate].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
            cancelAtNextBillingDate(cancelAtNextBillingDate as Boolean?)

        /**
         * Alias for calling [Builder.cancelAtNextBillingDate] with
         * `cancelAtNextBillingDate.orElse(null)`.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: Optional<Boolean>) =
            cancelAtNextBillingDate(cancelAtNextBillingDate.getOrNull())

        /**
         * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
            body.cancelAtNextBillingDate(cancelAtNextBillingDate)
        }

        /** Update credit entitlement cart settings */
        fun creditEntitlementCart(creditEntitlementCart: List<CreditEntitlementCart>?) = apply {
            body.creditEntitlementCart(creditEntitlementCart)
        }

        /**
         * Alias for calling [Builder.creditEntitlementCart] with
         * `creditEntitlementCart.orElse(null)`.
         */
        fun creditEntitlementCart(creditEntitlementCart: Optional<List<CreditEntitlementCart>>) =
            creditEntitlementCart(creditEntitlementCart.getOrNull())

        /**
         * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditEntitlementCart] with a well-typed
         * `List<CreditEntitlementCart>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun creditEntitlementCart(creditEntitlementCart: JsonField<List<CreditEntitlementCart>>) =
            apply {
                body.creditEntitlementCart(creditEntitlementCart)
            }

        /**
         * Adds a single [CreditEntitlementCart] to [Builder.creditEntitlementCart].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCart) = apply {
            body.addCreditEntitlementCart(creditEntitlementCart)
        }

        fun customerName(customerName: String?) = apply { body.customerName(customerName) }

        /** Alias for calling [Builder.customerName] with `customerName.orElse(null)`. */
        fun customerName(customerName: Optional<String>) = customerName(customerName.getOrNull())

        /**
         * Sets [Builder.customerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerName(customerName: JsonField<String>) = apply {
            body.customerName(customerName)
        }

        fun disableOnDemand(disableOnDemand: DisableOnDemand?) = apply {
            body.disableOnDemand(disableOnDemand)
        }

        /** Alias for calling [Builder.disableOnDemand] with `disableOnDemand.orElse(null)`. */
        fun disableOnDemand(disableOnDemand: Optional<DisableOnDemand>) =
            disableOnDemand(disableOnDemand.getOrNull())

        /**
         * Sets [Builder.disableOnDemand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.disableOnDemand] with a well-typed [DisableOnDemand]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun disableOnDemand(disableOnDemand: JsonField<DisableOnDemand>) = apply {
            body.disableOnDemand(disableOnDemand)
        }

        fun metadata(metadata: Metadata?) = apply { body.metadata(metadata) }

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        fun nextBillingDate(nextBillingDate: OffsetDateTime?) = apply {
            body.nextBillingDate(nextBillingDate)
        }

        /** Alias for calling [Builder.nextBillingDate] with `nextBillingDate.orElse(null)`. */
        fun nextBillingDate(nextBillingDate: Optional<OffsetDateTime>) =
            nextBillingDate(nextBillingDate.getOrNull())

        /**
         * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
            body.nextBillingDate(nextBillingDate)
        }

        fun status(status: SubscriptionStatus?) = apply { body.status(status) }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<SubscriptionStatus>) = status(status.getOrNull())

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [SubscriptionStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<SubscriptionStatus>) = apply { body.status(status) }

        fun taxId(taxId: String?) = apply { body.taxId(taxId) }

        /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
        fun taxId(taxId: Optional<String>) = taxId(taxId.getOrNull())

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { body.taxId(taxId) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [SubscriptionUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): SubscriptionUpdateParams =
            SubscriptionUpdateParams(
                subscriptionId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> subscriptionId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billing: JsonField<BillingAddress>,
        private val cancelAtNextBillingDate: JsonField<Boolean>,
        private val creditEntitlementCart: JsonField<List<CreditEntitlementCart>>,
        private val customerName: JsonField<String>,
        private val disableOnDemand: JsonField<DisableOnDemand>,
        private val metadata: JsonField<Metadata>,
        private val nextBillingDate: JsonField<OffsetDateTime>,
        private val status: JsonField<SubscriptionStatus>,
        private val taxId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing")
            @ExcludeMissing
            billing: JsonField<BillingAddress> = JsonMissing.of(),
            @JsonProperty("cancel_at_next_billing_date")
            @ExcludeMissing
            cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("credit_entitlement_cart")
            @ExcludeMissing
            creditEntitlementCart: JsonField<List<CreditEntitlementCart>> = JsonMissing.of(),
            @JsonProperty("customer_name")
            @ExcludeMissing
            customerName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("disable_on_demand")
            @ExcludeMissing
            disableOnDemand: JsonField<DisableOnDemand> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("next_billing_date")
            @ExcludeMissing
            nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            status: JsonField<SubscriptionStatus> = JsonMissing.of(),
            @JsonProperty("tax_id") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        ) : this(
            billing,
            cancelAtNextBillingDate,
            creditEntitlementCart,
            customerName,
            disableOnDemand,
            metadata,
            nextBillingDate,
            status,
            taxId,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun billing(): Optional<BillingAddress> = billing.getOptional("billing")

        /**
         * When set, the subscription will remain active until the end of billing period
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun cancelAtNextBillingDate(): Optional<Boolean> =
            cancelAtNextBillingDate.getOptional("cancel_at_next_billing_date")

        /**
         * Update credit entitlement cart settings
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditEntitlementCart(): Optional<List<CreditEntitlementCart>> =
            creditEntitlementCart.getOptional("credit_entitlement_cart")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerName(): Optional<String> = customerName.getOptional("customer_name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun disableOnDemand(): Optional<DisableOnDemand> =
            disableOnDemand.getOptional("disable_on_demand")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nextBillingDate(): Optional<OffsetDateTime> =
            nextBillingDate.getOptional("next_billing_date")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun status(): Optional<SubscriptionStatus> = status.getOptional("status")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxId(): Optional<String> = taxId.getOptional("tax_id")

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
         * Returns the raw JSON value of [creditEntitlementCart].
         *
         * Unlike [creditEntitlementCart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_cart")
        @ExcludeMissing
        fun _creditEntitlementCart(): JsonField<List<CreditEntitlementCart>> = creditEntitlementCart

        /**
         * Returns the raw JSON value of [customerName].
         *
         * Unlike [customerName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customer_name")
        @ExcludeMissing
        fun _customerName(): JsonField<String> = customerName

        /**
         * Returns the raw JSON value of [disableOnDemand].
         *
         * Unlike [disableOnDemand], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("disable_on_demand")
        @ExcludeMissing
        fun _disableOnDemand(): JsonField<DisableOnDemand> = disableOnDemand

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [nextBillingDate].
         *
         * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun _status(): JsonField<SubscriptionStatus> = status

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_id") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var billing: JsonField<BillingAddress> = JsonMissing.of()
            private var cancelAtNextBillingDate: JsonField<Boolean> = JsonMissing.of()
            private var creditEntitlementCart: JsonField<MutableList<CreditEntitlementCart>>? = null
            private var customerName: JsonField<String> = JsonMissing.of()
            private var disableOnDemand: JsonField<DisableOnDemand> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<SubscriptionStatus> = JsonMissing.of()
            private var taxId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                billing = body.billing
                cancelAtNextBillingDate = body.cancelAtNextBillingDate
                creditEntitlementCart = body.creditEntitlementCart.map { it.toMutableList() }
                customerName = body.customerName
                disableOnDemand = body.disableOnDemand
                metadata = body.metadata
                nextBillingDate = body.nextBillingDate
                status = body.status
                taxId = body.taxId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun billing(billing: BillingAddress?) = billing(JsonField.ofNullable(billing))

            /** Alias for calling [Builder.billing] with `billing.orElse(null)`. */
            fun billing(billing: Optional<BillingAddress>) = billing(billing.getOrNull())

            /**
             * Sets [Builder.billing] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billing] with a well-typed [BillingAddress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billing(billing: JsonField<BillingAddress>) = apply { this.billing = billing }

            /** When set, the subscription will remain active until the end of billing period */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean?) =
                cancelAtNextBillingDate(JsonField.ofNullable(cancelAtNextBillingDate))

            /**
             * Alias for [Builder.cancelAtNextBillingDate].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: Boolean) =
                cancelAtNextBillingDate(cancelAtNextBillingDate as Boolean?)

            /**
             * Alias for calling [Builder.cancelAtNextBillingDate] with
             * `cancelAtNextBillingDate.orElse(null)`.
             */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: Optional<Boolean>) =
                cancelAtNextBillingDate(cancelAtNextBillingDate.getOrNull())

            /**
             * Sets [Builder.cancelAtNextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cancelAtNextBillingDate] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cancelAtNextBillingDate(cancelAtNextBillingDate: JsonField<Boolean>) = apply {
                this.cancelAtNextBillingDate = cancelAtNextBillingDate
            }

            /** Update credit entitlement cart settings */
            fun creditEntitlementCart(creditEntitlementCart: List<CreditEntitlementCart>?) =
                creditEntitlementCart(JsonField.ofNullable(creditEntitlementCart))

            /**
             * Alias for calling [Builder.creditEntitlementCart] with
             * `creditEntitlementCart.orElse(null)`.
             */
            fun creditEntitlementCart(
                creditEntitlementCart: Optional<List<CreditEntitlementCart>>
            ) = creditEntitlementCart(creditEntitlementCart.getOrNull())

            /**
             * Sets [Builder.creditEntitlementCart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementCart] with a well-typed
             * `List<CreditEntitlementCart>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun creditEntitlementCart(
                creditEntitlementCart: JsonField<List<CreditEntitlementCart>>
            ) = apply {
                this.creditEntitlementCart = creditEntitlementCart.map { it.toMutableList() }
            }

            /**
             * Adds a single [CreditEntitlementCart] to [Builder.creditEntitlementCart].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCreditEntitlementCart(creditEntitlementCart: CreditEntitlementCart) = apply {
                this.creditEntitlementCart =
                    (this.creditEntitlementCart ?: JsonField.of(mutableListOf())).also {
                        checkKnown("creditEntitlementCart", it).add(creditEntitlementCart)
                    }
            }

            fun customerName(customerName: String?) =
                customerName(JsonField.ofNullable(customerName))

            /** Alias for calling [Builder.customerName] with `customerName.orElse(null)`. */
            fun customerName(customerName: Optional<String>) =
                customerName(customerName.getOrNull())

            /**
             * Sets [Builder.customerName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerName(customerName: JsonField<String>) = apply {
                this.customerName = customerName
            }

            fun disableOnDemand(disableOnDemand: DisableOnDemand?) =
                disableOnDemand(JsonField.ofNullable(disableOnDemand))

            /** Alias for calling [Builder.disableOnDemand] with `disableOnDemand.orElse(null)`. */
            fun disableOnDemand(disableOnDemand: Optional<DisableOnDemand>) =
                disableOnDemand(disableOnDemand.getOrNull())

            /**
             * Sets [Builder.disableOnDemand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.disableOnDemand] with a well-typed [DisableOnDemand]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun disableOnDemand(disableOnDemand: JsonField<DisableOnDemand>) = apply {
                this.disableOnDemand = disableOnDemand
            }

            fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

            /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
            fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            fun nextBillingDate(nextBillingDate: OffsetDateTime?) =
                nextBillingDate(JsonField.ofNullable(nextBillingDate))

            /** Alias for calling [Builder.nextBillingDate] with `nextBillingDate.orElse(null)`. */
            fun nextBillingDate(nextBillingDate: Optional<OffsetDateTime>) =
                nextBillingDate(nextBillingDate.getOrNull())

            /**
             * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
                this.nextBillingDate = nextBillingDate
            }

            fun status(status: SubscriptionStatus?) = status(JsonField.ofNullable(status))

            /** Alias for calling [Builder.status] with `status.orElse(null)`. */
            fun status(status: Optional<SubscriptionStatus>) = status(status.getOrNull())

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [SubscriptionStatus] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<SubscriptionStatus>) = apply { this.status = status }

            fun taxId(taxId: String?) = taxId(JsonField.ofNullable(taxId))

            /** Alias for calling [Builder.taxId] with `taxId.orElse(null)`. */
            fun taxId(taxId: Optional<String>) = taxId(taxId.getOrNull())

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    billing,
                    cancelAtNextBillingDate,
                    (creditEntitlementCart ?: JsonMissing.of()).map { it.toImmutable() },
                    customerName,
                    disableOnDemand,
                    metadata,
                    nextBillingDate,
                    status,
                    taxId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            billing().ifPresent { it.validate() }
            cancelAtNextBillingDate()
            creditEntitlementCart().ifPresent { it.forEach { it.validate() } }
            customerName()
            disableOnDemand().ifPresent { it.validate() }
            metadata().ifPresent { it.validate() }
            nextBillingDate()
            status().ifPresent { it.validate() }
            taxId()
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
                (if (cancelAtNextBillingDate.asKnown().isPresent) 1 else 0) +
                (creditEntitlementCart.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                    ?: 0) +
                (if (customerName.asKnown().isPresent) 1 else 0) +
                (disableOnDemand.asKnown().getOrNull()?.validity() ?: 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (nextBillingDate.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (taxId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                billing == other.billing &&
                cancelAtNextBillingDate == other.cancelAtNextBillingDate &&
                creditEntitlementCart == other.creditEntitlementCart &&
                customerName == other.customerName &&
                disableOnDemand == other.disableOnDemand &&
                metadata == other.metadata &&
                nextBillingDate == other.nextBillingDate &&
                status == other.status &&
                taxId == other.taxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billing,
                cancelAtNextBillingDate,
                creditEntitlementCart,
                customerName,
                disableOnDemand,
                metadata,
                nextBillingDate,
                status,
                taxId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{billing=$billing, cancelAtNextBillingDate=$cancelAtNextBillingDate, creditEntitlementCart=$creditEntitlementCart, customerName=$customerName, disableOnDemand=$disableOnDemand, metadata=$metadata, nextBillingDate=$nextBillingDate, status=$status, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    class CreditEntitlementCart
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditEntitlementId: JsonField<String>,
        private val creditsAmount: JsonField<String>,
        private val expiresAfterDays: JsonField<Int>,
        private val lowBalanceThresholdPercent: JsonField<Int>,
        private val maxRolloverCount: JsonField<Int>,
        private val overageEnabled: JsonField<Boolean>,
        private val overageLimit: JsonField<String>,
        private val rolloverEnabled: JsonField<Boolean>,
        private val rolloverPercentage: JsonField<Int>,
        private val rolloverTimeframeCount: JsonField<Int>,
        private val rolloverTimeframeInterval: JsonField<TimeInterval>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_entitlement_id")
            @ExcludeMissing
            creditEntitlementId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credits_amount")
            @ExcludeMissing
            creditsAmount: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_after_days")
            @ExcludeMissing
            expiresAfterDays: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("low_balance_threshold_percent")
            @ExcludeMissing
            lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("max_rollover_count")
            @ExcludeMissing
            maxRolloverCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("overage_enabled")
            @ExcludeMissing
            overageEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("overage_limit")
            @ExcludeMissing
            overageLimit: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rollover_enabled")
            @ExcludeMissing
            rolloverEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("rollover_percentage")
            @ExcludeMissing
            rolloverPercentage: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rollover_timeframe_count")
            @ExcludeMissing
            rolloverTimeframeCount: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("rollover_timeframe_interval")
            @ExcludeMissing
            rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of(),
        ) : this(
            creditEntitlementId,
            creditsAmount,
            expiresAfterDays,
            lowBalanceThresholdPercent,
            maxRolloverCount,
            overageEnabled,
            overageLimit,
            rolloverEnabled,
            rolloverPercentage,
            rolloverTimeframeCount,
            rolloverTimeframeInterval,
            mutableMapOf(),
        )

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditEntitlementId(): String = creditEntitlementId.getRequired("credit_entitlement_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun creditsAmount(): Optional<String> = creditsAmount.getOptional("credits_amount")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expiresAfterDays(): Optional<Int> = expiresAfterDays.getOptional("expires_after_days")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lowBalanceThresholdPercent(): Optional<Int> =
            lowBalanceThresholdPercent.getOptional("low_balance_threshold_percent")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxRolloverCount(): Optional<Int> = maxRolloverCount.getOptional("max_rollover_count")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageEnabled(): Optional<Boolean> = overageEnabled.getOptional("overage_enabled")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun overageLimit(): Optional<String> = overageLimit.getOptional("overage_limit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverEnabled(): Optional<Boolean> = rolloverEnabled.getOptional("rollover_enabled")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverPercentage(): Optional<Int> =
            rolloverPercentage.getOptional("rollover_percentage")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeCount(): Optional<Int> =
            rolloverTimeframeCount.getOptional("rollover_timeframe_count")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun rolloverTimeframeInterval(): Optional<TimeInterval> =
            rolloverTimeframeInterval.getOptional("rollover_timeframe_interval")

        /**
         * Returns the raw JSON value of [creditEntitlementId].
         *
         * Unlike [creditEntitlementId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_entitlement_id")
        @ExcludeMissing
        fun _creditEntitlementId(): JsonField<String> = creditEntitlementId

        /**
         * Returns the raw JSON value of [creditsAmount].
         *
         * Unlike [creditsAmount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credits_amount")
        @ExcludeMissing
        fun _creditsAmount(): JsonField<String> = creditsAmount

        /**
         * Returns the raw JSON value of [expiresAfterDays].
         *
         * Unlike [expiresAfterDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expires_after_days")
        @ExcludeMissing
        fun _expiresAfterDays(): JsonField<Int> = expiresAfterDays

        /**
         * Returns the raw JSON value of [lowBalanceThresholdPercent].
         *
         * Unlike [lowBalanceThresholdPercent], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("low_balance_threshold_percent")
        @ExcludeMissing
        fun _lowBalanceThresholdPercent(): JsonField<Int> = lowBalanceThresholdPercent

        /**
         * Returns the raw JSON value of [maxRolloverCount].
         *
         * Unlike [maxRolloverCount], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("max_rollover_count")
        @ExcludeMissing
        fun _maxRolloverCount(): JsonField<Int> = maxRolloverCount

        /**
         * Returns the raw JSON value of [overageEnabled].
         *
         * Unlike [overageEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_enabled")
        @ExcludeMissing
        fun _overageEnabled(): JsonField<Boolean> = overageEnabled

        /**
         * Returns the raw JSON value of [overageLimit].
         *
         * Unlike [overageLimit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overage_limit")
        @ExcludeMissing
        fun _overageLimit(): JsonField<String> = overageLimit

        /**
         * Returns the raw JSON value of [rolloverEnabled].
         *
         * Unlike [rolloverEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_enabled")
        @ExcludeMissing
        fun _rolloverEnabled(): JsonField<Boolean> = rolloverEnabled

        /**
         * Returns the raw JSON value of [rolloverPercentage].
         *
         * Unlike [rolloverPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_percentage")
        @ExcludeMissing
        fun _rolloverPercentage(): JsonField<Int> = rolloverPercentage

        /**
         * Returns the raw JSON value of [rolloverTimeframeCount].
         *
         * Unlike [rolloverTimeframeCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_timeframe_count")
        @ExcludeMissing
        fun _rolloverTimeframeCount(): JsonField<Int> = rolloverTimeframeCount

        /**
         * Returns the raw JSON value of [rolloverTimeframeInterval].
         *
         * Unlike [rolloverTimeframeInterval], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("rollover_timeframe_interval")
        @ExcludeMissing
        fun _rolloverTimeframeInterval(): JsonField<TimeInterval> = rolloverTimeframeInterval

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
             * Returns a mutable builder for constructing an instance of [CreditEntitlementCart].
             *
             * The following fields are required:
             * ```java
             * .creditEntitlementId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreditEntitlementCart]. */
        class Builder internal constructor() {

            private var creditEntitlementId: JsonField<String>? = null
            private var creditsAmount: JsonField<String> = JsonMissing.of()
            private var expiresAfterDays: JsonField<Int> = JsonMissing.of()
            private var lowBalanceThresholdPercent: JsonField<Int> = JsonMissing.of()
            private var maxRolloverCount: JsonField<Int> = JsonMissing.of()
            private var overageEnabled: JsonField<Boolean> = JsonMissing.of()
            private var overageLimit: JsonField<String> = JsonMissing.of()
            private var rolloverEnabled: JsonField<Boolean> = JsonMissing.of()
            private var rolloverPercentage: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeCount: JsonField<Int> = JsonMissing.of()
            private var rolloverTimeframeInterval: JsonField<TimeInterval> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditEntitlementCart: CreditEntitlementCart) = apply {
                creditEntitlementId = creditEntitlementCart.creditEntitlementId
                creditsAmount = creditEntitlementCart.creditsAmount
                expiresAfterDays = creditEntitlementCart.expiresAfterDays
                lowBalanceThresholdPercent = creditEntitlementCart.lowBalanceThresholdPercent
                maxRolloverCount = creditEntitlementCart.maxRolloverCount
                overageEnabled = creditEntitlementCart.overageEnabled
                overageLimit = creditEntitlementCart.overageLimit
                rolloverEnabled = creditEntitlementCart.rolloverEnabled
                rolloverPercentage = creditEntitlementCart.rolloverPercentage
                rolloverTimeframeCount = creditEntitlementCart.rolloverTimeframeCount
                rolloverTimeframeInterval = creditEntitlementCart.rolloverTimeframeInterval
                additionalProperties = creditEntitlementCart.additionalProperties.toMutableMap()
            }

            fun creditEntitlementId(creditEntitlementId: String) =
                creditEntitlementId(JsonField.of(creditEntitlementId))

            /**
             * Sets [Builder.creditEntitlementId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditEntitlementId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun creditEntitlementId(creditEntitlementId: JsonField<String>) = apply {
                this.creditEntitlementId = creditEntitlementId
            }

            fun creditsAmount(creditsAmount: String?) =
                creditsAmount(JsonField.ofNullable(creditsAmount))

            /** Alias for calling [Builder.creditsAmount] with `creditsAmount.orElse(null)`. */
            fun creditsAmount(creditsAmount: Optional<String>) =
                creditsAmount(creditsAmount.getOrNull())

            /**
             * Sets [Builder.creditsAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditsAmount] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditsAmount(creditsAmount: JsonField<String>) = apply {
                this.creditsAmount = creditsAmount
            }

            fun expiresAfterDays(expiresAfterDays: Int?) =
                expiresAfterDays(JsonField.ofNullable(expiresAfterDays))

            /**
             * Alias for [Builder.expiresAfterDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun expiresAfterDays(expiresAfterDays: Int) = expiresAfterDays(expiresAfterDays as Int?)

            /**
             * Alias for calling [Builder.expiresAfterDays] with `expiresAfterDays.orElse(null)`.
             */
            fun expiresAfterDays(expiresAfterDays: Optional<Int>) =
                expiresAfterDays(expiresAfterDays.getOrNull())

            /**
             * Sets [Builder.expiresAfterDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAfterDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAfterDays(expiresAfterDays: JsonField<Int>) = apply {
                this.expiresAfterDays = expiresAfterDays
            }

            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int?) =
                lowBalanceThresholdPercent(JsonField.ofNullable(lowBalanceThresholdPercent))

            /**
             * Alias for [Builder.lowBalanceThresholdPercent].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Int) =
                lowBalanceThresholdPercent(lowBalanceThresholdPercent as Int?)

            /**
             * Alias for calling [Builder.lowBalanceThresholdPercent] with
             * `lowBalanceThresholdPercent.orElse(null)`.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: Optional<Int>) =
                lowBalanceThresholdPercent(lowBalanceThresholdPercent.getOrNull())

            /**
             * Sets [Builder.lowBalanceThresholdPercent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lowBalanceThresholdPercent] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun lowBalanceThresholdPercent(lowBalanceThresholdPercent: JsonField<Int>) = apply {
                this.lowBalanceThresholdPercent = lowBalanceThresholdPercent
            }

            fun maxRolloverCount(maxRolloverCount: Int?) =
                maxRolloverCount(JsonField.ofNullable(maxRolloverCount))

            /**
             * Alias for [Builder.maxRolloverCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxRolloverCount(maxRolloverCount: Int) = maxRolloverCount(maxRolloverCount as Int?)

            /**
             * Alias for calling [Builder.maxRolloverCount] with `maxRolloverCount.orElse(null)`.
             */
            fun maxRolloverCount(maxRolloverCount: Optional<Int>) =
                maxRolloverCount(maxRolloverCount.getOrNull())

            /**
             * Sets [Builder.maxRolloverCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxRolloverCount] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxRolloverCount(maxRolloverCount: JsonField<Int>) = apply {
                this.maxRolloverCount = maxRolloverCount
            }

            fun overageEnabled(overageEnabled: Boolean?) =
                overageEnabled(JsonField.ofNullable(overageEnabled))

            /**
             * Alias for [Builder.overageEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun overageEnabled(overageEnabled: Boolean) = overageEnabled(overageEnabled as Boolean?)

            /** Alias for calling [Builder.overageEnabled] with `overageEnabled.orElse(null)`. */
            fun overageEnabled(overageEnabled: Optional<Boolean>) =
                overageEnabled(overageEnabled.getOrNull())

            /**
             * Sets [Builder.overageEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageEnabled(overageEnabled: JsonField<Boolean>) = apply {
                this.overageEnabled = overageEnabled
            }

            fun overageLimit(overageLimit: String?) =
                overageLimit(JsonField.ofNullable(overageLimit))

            /** Alias for calling [Builder.overageLimit] with `overageLimit.orElse(null)`. */
            fun overageLimit(overageLimit: Optional<String>) =
                overageLimit(overageLimit.getOrNull())

            /**
             * Sets [Builder.overageLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overageLimit] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overageLimit(overageLimit: JsonField<String>) = apply {
                this.overageLimit = overageLimit
            }

            fun rolloverEnabled(rolloverEnabled: Boolean?) =
                rolloverEnabled(JsonField.ofNullable(rolloverEnabled))

            /**
             * Alias for [Builder.rolloverEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverEnabled(rolloverEnabled: Boolean) =
                rolloverEnabled(rolloverEnabled as Boolean?)

            /** Alias for calling [Builder.rolloverEnabled] with `rolloverEnabled.orElse(null)`. */
            fun rolloverEnabled(rolloverEnabled: Optional<Boolean>) =
                rolloverEnabled(rolloverEnabled.getOrNull())

            /**
             * Sets [Builder.rolloverEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverEnabled(rolloverEnabled: JsonField<Boolean>) = apply {
                this.rolloverEnabled = rolloverEnabled
            }

            fun rolloverPercentage(rolloverPercentage: Int?) =
                rolloverPercentage(JsonField.ofNullable(rolloverPercentage))

            /**
             * Alias for [Builder.rolloverPercentage].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverPercentage(rolloverPercentage: Int) =
                rolloverPercentage(rolloverPercentage as Int?)

            /**
             * Alias for calling [Builder.rolloverPercentage] with
             * `rolloverPercentage.orElse(null)`.
             */
            fun rolloverPercentage(rolloverPercentage: Optional<Int>) =
                rolloverPercentage(rolloverPercentage.getOrNull())

            /**
             * Sets [Builder.rolloverPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverPercentage] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverPercentage(rolloverPercentage: JsonField<Int>) = apply {
                this.rolloverPercentage = rolloverPercentage
            }

            fun rolloverTimeframeCount(rolloverTimeframeCount: Int?) =
                rolloverTimeframeCount(JsonField.ofNullable(rolloverTimeframeCount))

            /**
             * Alias for [Builder.rolloverTimeframeCount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: Int) =
                rolloverTimeframeCount(rolloverTimeframeCount as Int?)

            /**
             * Alias for calling [Builder.rolloverTimeframeCount] with
             * `rolloverTimeframeCount.orElse(null)`.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: Optional<Int>) =
                rolloverTimeframeCount(rolloverTimeframeCount.getOrNull())

            /**
             * Sets [Builder.rolloverTimeframeCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeCount] with a well-typed [Int]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun rolloverTimeframeCount(rolloverTimeframeCount: JsonField<Int>) = apply {
                this.rolloverTimeframeCount = rolloverTimeframeCount
            }

            fun rolloverTimeframeInterval(rolloverTimeframeInterval: TimeInterval?) =
                rolloverTimeframeInterval(JsonField.ofNullable(rolloverTimeframeInterval))

            /**
             * Alias for calling [Builder.rolloverTimeframeInterval] with
             * `rolloverTimeframeInterval.orElse(null)`.
             */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: Optional<TimeInterval>) =
                rolloverTimeframeInterval(rolloverTimeframeInterval.getOrNull())

            /**
             * Sets [Builder.rolloverTimeframeInterval] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverTimeframeInterval] with a well-typed
             * [TimeInterval] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun rolloverTimeframeInterval(rolloverTimeframeInterval: JsonField<TimeInterval>) =
                apply {
                    this.rolloverTimeframeInterval = rolloverTimeframeInterval
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
             * Returns an immutable instance of [CreditEntitlementCart].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditEntitlementId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreditEntitlementCart =
                CreditEntitlementCart(
                    checkRequired("creditEntitlementId", creditEntitlementId),
                    creditsAmount,
                    expiresAfterDays,
                    lowBalanceThresholdPercent,
                    maxRolloverCount,
                    overageEnabled,
                    overageLimit,
                    rolloverEnabled,
                    rolloverPercentage,
                    rolloverTimeframeCount,
                    rolloverTimeframeInterval,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreditEntitlementCart = apply {
            if (validated) {
                return@apply
            }

            creditEntitlementId()
            creditsAmount()
            expiresAfterDays()
            lowBalanceThresholdPercent()
            maxRolloverCount()
            overageEnabled()
            overageLimit()
            rolloverEnabled()
            rolloverPercentage()
            rolloverTimeframeCount()
            rolloverTimeframeInterval().ifPresent { it.validate() }
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
            (if (creditEntitlementId.asKnown().isPresent) 1 else 0) +
                (if (creditsAmount.asKnown().isPresent) 1 else 0) +
                (if (expiresAfterDays.asKnown().isPresent) 1 else 0) +
                (if (lowBalanceThresholdPercent.asKnown().isPresent) 1 else 0) +
                (if (maxRolloverCount.asKnown().isPresent) 1 else 0) +
                (if (overageEnabled.asKnown().isPresent) 1 else 0) +
                (if (overageLimit.asKnown().isPresent) 1 else 0) +
                (if (rolloverEnabled.asKnown().isPresent) 1 else 0) +
                (if (rolloverPercentage.asKnown().isPresent) 1 else 0) +
                (if (rolloverTimeframeCount.asKnown().isPresent) 1 else 0) +
                (rolloverTimeframeInterval.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditEntitlementCart &&
                creditEntitlementId == other.creditEntitlementId &&
                creditsAmount == other.creditsAmount &&
                expiresAfterDays == other.expiresAfterDays &&
                lowBalanceThresholdPercent == other.lowBalanceThresholdPercent &&
                maxRolloverCount == other.maxRolloverCount &&
                overageEnabled == other.overageEnabled &&
                overageLimit == other.overageLimit &&
                rolloverEnabled == other.rolloverEnabled &&
                rolloverPercentage == other.rolloverPercentage &&
                rolloverTimeframeCount == other.rolloverTimeframeCount &&
                rolloverTimeframeInterval == other.rolloverTimeframeInterval &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditEntitlementId,
                creditsAmount,
                expiresAfterDays,
                lowBalanceThresholdPercent,
                maxRolloverCount,
                overageEnabled,
                overageLimit,
                rolloverEnabled,
                rolloverPercentage,
                rolloverTimeframeCount,
                rolloverTimeframeInterval,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditEntitlementCart{creditEntitlementId=$creditEntitlementId, creditsAmount=$creditsAmount, expiresAfterDays=$expiresAfterDays, lowBalanceThresholdPercent=$lowBalanceThresholdPercent, maxRolloverCount=$maxRolloverCount, overageEnabled=$overageEnabled, overageLimit=$overageLimit, rolloverEnabled=$rolloverEnabled, rolloverPercentage=$rolloverPercentage, rolloverTimeframeCount=$rolloverTimeframeCount, rolloverTimeframeInterval=$rolloverTimeframeInterval, additionalProperties=$additionalProperties}"
    }

    class DisableOnDemand
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val nextBillingDate: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("next_billing_date")
            @ExcludeMissing
            nextBillingDate: JsonField<OffsetDateTime> = JsonMissing.of()
        ) : this(nextBillingDate, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nextBillingDate(): OffsetDateTime = nextBillingDate.getRequired("next_billing_date")

        /**
         * Returns the raw JSON value of [nextBillingDate].
         *
         * Unlike [nextBillingDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("next_billing_date")
        @ExcludeMissing
        fun _nextBillingDate(): JsonField<OffsetDateTime> = nextBillingDate

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
             * Returns a mutable builder for constructing an instance of [DisableOnDemand].
             *
             * The following fields are required:
             * ```java
             * .nextBillingDate()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DisableOnDemand]. */
        class Builder internal constructor() {

            private var nextBillingDate: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(disableOnDemand: DisableOnDemand) = apply {
                nextBillingDate = disableOnDemand.nextBillingDate
                additionalProperties = disableOnDemand.additionalProperties.toMutableMap()
            }

            fun nextBillingDate(nextBillingDate: OffsetDateTime) =
                nextBillingDate(JsonField.of(nextBillingDate))

            /**
             * Sets [Builder.nextBillingDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nextBillingDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun nextBillingDate(nextBillingDate: JsonField<OffsetDateTime>) = apply {
                this.nextBillingDate = nextBillingDate
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
             * Returns an immutable instance of [DisableOnDemand].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .nextBillingDate()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DisableOnDemand =
                DisableOnDemand(
                    checkRequired("nextBillingDate", nextBillingDate),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): DisableOnDemand = apply {
            if (validated) {
                return@apply
            }

            nextBillingDate()
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
        internal fun validity(): Int = (if (nextBillingDate.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DisableOnDemand &&
                nextBillingDate == other.nextBillingDate &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(nextBillingDate, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DisableOnDemand{nextBillingDate=$nextBillingDate, additionalProperties=$additionalProperties}"
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

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SubscriptionUpdateParams &&
            subscriptionId == other.subscriptionId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(subscriptionId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SubscriptionUpdateParams{subscriptionId=$subscriptionId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
