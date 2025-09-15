// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.NewCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CheckoutSessionRequest
private constructor(
    private val productCart: JsonField<List<ProductCart>>,
    private val allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>,
    private val billingAddress: JsonField<BillingAddress>,
    private val billingCurrency: JsonField<Currency>,
    private val confirm: JsonField<Boolean>,
    private val customer: JsonField<CustomerRequest>,
    private val customization: JsonField<Customization>,
    private val discountCode: JsonField<String>,
    private val featureFlags: JsonField<FeatureFlags>,
    private val metadata: JsonField<Metadata>,
    private val returnUrl: JsonField<String>,
    private val showSavedPaymentMethods: JsonField<Boolean>,
    private val subscriptionData: JsonField<SubscriptionData>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("product_cart")
        @ExcludeMissing
        productCart: JsonField<List<ProductCart>> = JsonMissing.of(),
        @JsonProperty("allowed_payment_method_types")
        @ExcludeMissing
        allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>> = JsonMissing.of(),
        @JsonProperty("billing_address")
        @ExcludeMissing
        billingAddress: JsonField<BillingAddress> = JsonMissing.of(),
        @JsonProperty("billing_currency")
        @ExcludeMissing
        billingCurrency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("confirm") @ExcludeMissing confirm: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("customer")
        @ExcludeMissing
        customer: JsonField<CustomerRequest> = JsonMissing.of(),
        @JsonProperty("customization")
        @ExcludeMissing
        customization: JsonField<Customization> = JsonMissing.of(),
        @JsonProperty("discount_code")
        @ExcludeMissing
        discountCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("feature_flags")
        @ExcludeMissing
        featureFlags: JsonField<FeatureFlags> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("return_url") @ExcludeMissing returnUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("show_saved_payment_methods")
        @ExcludeMissing
        showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("subscription_data")
        @ExcludeMissing
        subscriptionData: JsonField<SubscriptionData> = JsonMissing.of(),
    ) : this(
        productCart,
        allowedPaymentMethodTypes,
        billingAddress,
        billingCurrency,
        confirm,
        customer,
        customization,
        discountCode,
        featureFlags,
        metadata,
        returnUrl,
        showSavedPaymentMethods,
        subscriptionData,
        mutableMapOf(),
    )

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productCart(): List<ProductCart> = productCart.getRequired("product_cart")

    /**
     * Customers will never see payment methods that are not in this list. However, adding a method
     * here does not guarantee customers will see it. Availability still depends on other factors
     * (e.g., customer location, merchant settings).
     *
     * Disclaimar: Always provide 'credit' and 'debit' as a fallback. If all payment methods are
     * unavailable, checkout session will fail.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun allowedPaymentMethodTypes(): Optional<List<PaymentMethodTypes>> =
        allowedPaymentMethodTypes.getOptional("allowed_payment_method_types")

    /**
     * Billing address information for the session
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingAddress(): Optional<BillingAddress> = billingAddress.getOptional("billing_address")

    /**
     * This field is ingored if adaptive pricing is disabled
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun billingCurrency(): Optional<Currency> = billingCurrency.getOptional("billing_currency")

    /**
     * If confirm is true, all the details will be finalized. If required data is missing, an API
     * error is thrown.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun confirm(): Optional<Boolean> = confirm.getOptional("confirm")

    /**
     * Customer details for the session
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customer(): Optional<CustomerRequest> = customer.getOptional("customer")

    /**
     * Customization for the checkout session page
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customization(): Optional<Customization> = customization.getOptional("customization")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun discountCode(): Optional<String> = discountCode.getOptional("discount_code")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun featureFlags(): Optional<FeatureFlags> = featureFlags.getOptional("feature_flags")

    /**
     * Additional metadata associated with the payment. Defaults to empty if not provided.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * The url to redirect after payment failure or success.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun returnUrl(): Optional<String> = returnUrl.getOptional("return_url")

    /**
     * Display saved payment methods of a returning customer False by default
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun showSavedPaymentMethods(): Optional<Boolean> =
        showSavedPaymentMethods.getOptional("show_saved_payment_methods")

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun subscriptionData(): Optional<SubscriptionData> =
        subscriptionData.getOptional("subscription_data")

    /**
     * Returns the raw JSON value of [productCart].
     *
     * Unlike [productCart], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_cart")
    @ExcludeMissing
    fun _productCart(): JsonField<List<ProductCart>> = productCart

    /**
     * Returns the raw JSON value of [allowedPaymentMethodTypes].
     *
     * Unlike [allowedPaymentMethodTypes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("allowed_payment_method_types")
    @ExcludeMissing
    fun _allowedPaymentMethodTypes(): JsonField<List<PaymentMethodTypes>> =
        allowedPaymentMethodTypes

    /**
     * Returns the raw JSON value of [billingAddress].
     *
     * Unlike [billingAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_address")
    @ExcludeMissing
    fun _billingAddress(): JsonField<BillingAddress> = billingAddress

    /**
     * Returns the raw JSON value of [billingCurrency].
     *
     * Unlike [billingCurrency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("billing_currency")
    @ExcludeMissing
    fun _billingCurrency(): JsonField<Currency> = billingCurrency

    /**
     * Returns the raw JSON value of [confirm].
     *
     * Unlike [confirm], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("confirm") @ExcludeMissing fun _confirm(): JsonField<Boolean> = confirm

    /**
     * Returns the raw JSON value of [customer].
     *
     * Unlike [customer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<CustomerRequest> = customer

    /**
     * Returns the raw JSON value of [customization].
     *
     * Unlike [customization], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customization")
    @ExcludeMissing
    fun _customization(): JsonField<Customization> = customization

    /**
     * Returns the raw JSON value of [discountCode].
     *
     * Unlike [discountCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("discount_code")
    @ExcludeMissing
    fun _discountCode(): JsonField<String> = discountCode

    /**
     * Returns the raw JSON value of [featureFlags].
     *
     * Unlike [featureFlags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feature_flags")
    @ExcludeMissing
    fun _featureFlags(): JsonField<FeatureFlags> = featureFlags

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [returnUrl].
     *
     * Unlike [returnUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("return_url") @ExcludeMissing fun _returnUrl(): JsonField<String> = returnUrl

    /**
     * Returns the raw JSON value of [showSavedPaymentMethods].
     *
     * Unlike [showSavedPaymentMethods], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("show_saved_payment_methods")
    @ExcludeMissing
    fun _showSavedPaymentMethods(): JsonField<Boolean> = showSavedPaymentMethods

    /**
     * Returns the raw JSON value of [subscriptionData].
     *
     * Unlike [subscriptionData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("subscription_data")
    @ExcludeMissing
    fun _subscriptionData(): JsonField<SubscriptionData> = subscriptionData

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
         * Returns a mutable builder for constructing an instance of [CheckoutSessionRequest].
         *
         * The following fields are required:
         * ```java
         * .productCart()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CheckoutSessionRequest]. */
    class Builder internal constructor() {

        private var productCart: JsonField<MutableList<ProductCart>>? = null
        private var allowedPaymentMethodTypes: JsonField<MutableList<PaymentMethodTypes>>? = null
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var billingCurrency: JsonField<Currency> = JsonMissing.of()
        private var confirm: JsonField<Boolean> = JsonMissing.of()
        private var customer: JsonField<CustomerRequest> = JsonMissing.of()
        private var customization: JsonField<Customization> = JsonMissing.of()
        private var discountCode: JsonField<String> = JsonMissing.of()
        private var featureFlags: JsonField<FeatureFlags> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var returnUrl: JsonField<String> = JsonMissing.of()
        private var showSavedPaymentMethods: JsonField<Boolean> = JsonMissing.of()
        private var subscriptionData: JsonField<SubscriptionData> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(checkoutSessionRequest: CheckoutSessionRequest) = apply {
            productCart = checkoutSessionRequest.productCart.map { it.toMutableList() }
            allowedPaymentMethodTypes =
                checkoutSessionRequest.allowedPaymentMethodTypes.map { it.toMutableList() }
            billingAddress = checkoutSessionRequest.billingAddress
            billingCurrency = checkoutSessionRequest.billingCurrency
            confirm = checkoutSessionRequest.confirm
            customer = checkoutSessionRequest.customer
            customization = checkoutSessionRequest.customization
            discountCode = checkoutSessionRequest.discountCode
            featureFlags = checkoutSessionRequest.featureFlags
            metadata = checkoutSessionRequest.metadata
            returnUrl = checkoutSessionRequest.returnUrl
            showSavedPaymentMethods = checkoutSessionRequest.showSavedPaymentMethods
            subscriptionData = checkoutSessionRequest.subscriptionData
            additionalProperties = checkoutSessionRequest.additionalProperties.toMutableMap()
        }

        fun productCart(productCart: List<ProductCart>) = productCart(JsonField.of(productCart))

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
         * Customers will never see payment methods that are not in this list. However, adding a
         * method here does not guarantee customers will see it. Availability still depends on other
         * factors (e.g., customer location, merchant settings).
         *
         * Disclaimar: Always provide 'credit' and 'debit' as a fallback. If all payment methods are
         * unavailable, checkout session will fail.
         */
        fun allowedPaymentMethodTypes(allowedPaymentMethodTypes: List<PaymentMethodTypes>?) =
            allowedPaymentMethodTypes(JsonField.ofNullable(allowedPaymentMethodTypes))

        /**
         * Alias for calling [Builder.allowedPaymentMethodTypes] with
         * `allowedPaymentMethodTypes.orElse(null)`.
         */
        fun allowedPaymentMethodTypes(
            allowedPaymentMethodTypes: Optional<List<PaymentMethodTypes>>
        ) = allowedPaymentMethodTypes(allowedPaymentMethodTypes.getOrNull())

        /**
         * Sets [Builder.allowedPaymentMethodTypes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedPaymentMethodTypes] with a well-typed
         * `List<PaymentMethodTypes>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun allowedPaymentMethodTypes(
            allowedPaymentMethodTypes: JsonField<List<PaymentMethodTypes>>
        ) = apply {
            this.allowedPaymentMethodTypes = allowedPaymentMethodTypes.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentMethodTypes] to [allowedPaymentMethodTypes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedPaymentMethodType(allowedPaymentMethodType: PaymentMethodTypes) = apply {
            allowedPaymentMethodTypes =
                (allowedPaymentMethodTypes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedPaymentMethodTypes", it).add(allowedPaymentMethodType)
                }
        }

        /** Billing address information for the session */
        fun billingAddress(billingAddress: BillingAddress?) =
            billingAddress(JsonField.ofNullable(billingAddress))

        /** Alias for calling [Builder.billingAddress] with `billingAddress.orElse(null)`. */
        fun billingAddress(billingAddress: Optional<BillingAddress>) =
            billingAddress(billingAddress.getOrNull())

        /**
         * Sets [Builder.billingAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingAddress] with a well-typed [BillingAddress] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /** This field is ingored if adaptive pricing is disabled */
        fun billingCurrency(billingCurrency: Currency?) =
            billingCurrency(JsonField.ofNullable(billingCurrency))

        /** Alias for calling [Builder.billingCurrency] with `billingCurrency.orElse(null)`. */
        fun billingCurrency(billingCurrency: Optional<Currency>) =
            billingCurrency(billingCurrency.getOrNull())

        /**
         * Sets [Builder.billingCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingCurrency] with a well-typed [Currency] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingCurrency(billingCurrency: JsonField<Currency>) = apply {
            this.billingCurrency = billingCurrency
        }

        /**
         * If confirm is true, all the details will be finalized. If required data is missing, an
         * API error is thrown.
         */
        fun confirm(confirm: Boolean) = confirm(JsonField.of(confirm))

        /**
         * Sets [Builder.confirm] to an arbitrary JSON value.
         *
         * You should usually call [Builder.confirm] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun confirm(confirm: JsonField<Boolean>) = apply { this.confirm = confirm }

        /** Customer details for the session */
        fun customer(customer: CustomerRequest?) = customer(JsonField.ofNullable(customer))

        /** Alias for calling [Builder.customer] with `customer.orElse(null)`. */
        fun customer(customer: Optional<CustomerRequest>) = customer(customer.getOrNull())

        /**
         * Sets [Builder.customer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customer] with a well-typed [CustomerRequest] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customer(customer: JsonField<CustomerRequest>) = apply { this.customer = customer }

        /**
         * Alias for calling [customer] with
         * `CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer)`.
         */
        fun customer(attachExistingCustomer: AttachExistingCustomer) =
            customer(CustomerRequest.ofAttachExistingCustomer(attachExistingCustomer))

        /** Alias for calling [customer] with `CustomerRequest.ofNewCustomer(newCustomer)`. */
        fun customer(newCustomer: NewCustomer) =
            customer(CustomerRequest.ofNewCustomer(newCustomer))

        /** Customization for the checkout session page */
        fun customization(customization: Customization) = customization(JsonField.of(customization))

        /**
         * Sets [Builder.customization] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customization] with a well-typed [Customization] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customization(customization: JsonField<Customization>) = apply {
            this.customization = customization
        }

        fun discountCode(discountCode: String?) = discountCode(JsonField.ofNullable(discountCode))

        /** Alias for calling [Builder.discountCode] with `discountCode.orElse(null)`. */
        fun discountCode(discountCode: Optional<String>) = discountCode(discountCode.getOrNull())

        /**
         * Sets [Builder.discountCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discountCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun discountCode(discountCode: JsonField<String>) = apply {
            this.discountCode = discountCode
        }

        fun featureFlags(featureFlags: FeatureFlags) = featureFlags(JsonField.of(featureFlags))

        /**
         * Sets [Builder.featureFlags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.featureFlags] with a well-typed [FeatureFlags] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun featureFlags(featureFlags: JsonField<FeatureFlags>) = apply {
            this.featureFlags = featureFlags
        }

        /** Additional metadata associated with the payment. Defaults to empty if not provided. */
        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** The url to redirect after payment failure or success. */
        fun returnUrl(returnUrl: String?) = returnUrl(JsonField.ofNullable(returnUrl))

        /** Alias for calling [Builder.returnUrl] with `returnUrl.orElse(null)`. */
        fun returnUrl(returnUrl: Optional<String>) = returnUrl(returnUrl.getOrNull())

        /**
         * Sets [Builder.returnUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.returnUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun returnUrl(returnUrl: JsonField<String>) = apply { this.returnUrl = returnUrl }

        /** Display saved payment methods of a returning customer False by default */
        fun showSavedPaymentMethods(showSavedPaymentMethods: Boolean) =
            showSavedPaymentMethods(JsonField.of(showSavedPaymentMethods))

        /**
         * Sets [Builder.showSavedPaymentMethods] to an arbitrary JSON value.
         *
         * You should usually call [Builder.showSavedPaymentMethods] with a well-typed [Boolean]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun showSavedPaymentMethods(showSavedPaymentMethods: JsonField<Boolean>) = apply {
            this.showSavedPaymentMethods = showSavedPaymentMethods
        }

        fun subscriptionData(subscriptionData: SubscriptionData?) =
            subscriptionData(JsonField.ofNullable(subscriptionData))

        /** Alias for calling [Builder.subscriptionData] with `subscriptionData.orElse(null)`. */
        fun subscriptionData(subscriptionData: Optional<SubscriptionData>) =
            subscriptionData(subscriptionData.getOrNull())

        /**
         * Sets [Builder.subscriptionData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subscriptionData] with a well-typed [SubscriptionData]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun subscriptionData(subscriptionData: JsonField<SubscriptionData>) = apply {
            this.subscriptionData = subscriptionData
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
         * Returns an immutable instance of [CheckoutSessionRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .productCart()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckoutSessionRequest =
            CheckoutSessionRequest(
                checkRequired("productCart", productCart).map { it.toImmutable() },
                (allowedPaymentMethodTypes ?: JsonMissing.of()).map { it.toImmutable() },
                billingAddress,
                billingCurrency,
                confirm,
                customer,
                customization,
                discountCode,
                featureFlags,
                metadata,
                returnUrl,
                showSavedPaymentMethods,
                subscriptionData,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CheckoutSessionRequest = apply {
        if (validated) {
            return@apply
        }

        productCart().forEach { it.validate() }
        allowedPaymentMethodTypes().ifPresent { it.forEach { it.validate() } }
        billingAddress().ifPresent { it.validate() }
        billingCurrency().ifPresent { it.validate() }
        confirm()
        customer().ifPresent { it.validate() }
        customization().ifPresent { it.validate() }
        discountCode()
        featureFlags().ifPresent { it.validate() }
        metadata().ifPresent { it.validate() }
        returnUrl()
        showSavedPaymentMethods()
        subscriptionData().ifPresent { it.validate() }
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
        (productCart.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (allowedPaymentMethodTypes.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                ?: 0) +
            (billingAddress.asKnown().getOrNull()?.validity() ?: 0) +
            (billingCurrency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (confirm.asKnown().isPresent) 1 else 0) +
            (customer.asKnown().getOrNull()?.validity() ?: 0) +
            (customization.asKnown().getOrNull()?.validity() ?: 0) +
            (if (discountCode.asKnown().isPresent) 1 else 0) +
            (featureFlags.asKnown().getOrNull()?.validity() ?: 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (returnUrl.asKnown().isPresent) 1 else 0) +
            (if (showSavedPaymentMethods.asKnown().isPresent) 1 else 0) +
            (subscriptionData.asKnown().getOrNull()?.validity() ?: 0)

    class ProductCart
    private constructor(
        private val productId: JsonField<String>,
        private val quantity: JsonField<Int>,
        private val addons: JsonField<List<AttachAddon>>,
        private val amount: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity") @ExcludeMissing quantity: JsonField<Int> = JsonMissing.of(),
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<AttachAddon>> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Int> = JsonMissing.of(),
        ) : this(productId, quantity, addons, amount, mutableMapOf())

        /**
         * unique id of the product
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Int = quantity.getRequired("quantity")

        /**
         * only valid if product is a subscription
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addons(): Optional<List<AttachAddon>> = addons.getOptional("addons")

        /**
         * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount will be
         * ignored Represented in the lowest denomination of the currency (e.g., cents for USD). For
         * example, to charge $1.00, pass `100`. Only applicable for one time payments
         *
         * If amount is not set for pay_what_you_want product, customer is allowed to select the
         * amount.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun amount(): Optional<Int> = amount.getOptional("amount")

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
         * Returns the raw JSON value of [addons].
         *
         * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<AttachAddon>> = addons

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Int> = amount

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
            private var quantity: JsonField<Int>? = null
            private var addons: JsonField<MutableList<AttachAddon>>? = null
            private var amount: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(productCart: ProductCart) = apply {
                productId = productCart.productId
                quantity = productCart.quantity
                addons = productCart.addons.map { it.toMutableList() }
                amount = productCart.amount
                additionalProperties = productCart.additionalProperties.toMutableMap()
            }

            /** unique id of the product */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun quantity(quantity: Int) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Int] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Int>) = apply { this.quantity = quantity }

            /** only valid if product is a subscription */
            fun addons(addons: List<AttachAddon>?) = addons(JsonField.ofNullable(addons))

            /** Alias for calling [Builder.addons] with `addons.orElse(null)`. */
            fun addons(addons: Optional<List<AttachAddon>>) = addons(addons.getOrNull())

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed `List<AttachAddon>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addons(addons: JsonField<List<AttachAddon>>) = apply {
                this.addons = addons.map { it.toMutableList() }
            }

            /**
             * Adds a single [AttachAddon] to [addons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddon(addon: AttachAddon) = apply {
                addons =
                    (addons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addons", it).add(addon)
                    }
            }

            /**
             * Amount the customer pays if pay_what_you_want is enabled. If disabled then amount
             * will be ignored Represented in the lowest denomination of the currency (e.g., cents
             * for USD). For example, to charge $1.00, pass `100`. Only applicable for one time
             * payments
             *
             * If amount is not set for pay_what_you_want product, customer is allowed to select the
             * amount.
             */
            fun amount(amount: Int?) = amount(JsonField.ofNullable(amount))

            /**
             * Alias for [Builder.amount].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun amount(amount: Int) = amount(amount as Int?)

            /** Alias for calling [Builder.amount] with `amount.orElse(null)`. */
            fun amount(amount: Optional<Int>) = amount(amount.getOrNull())

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Int] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Int>) = apply { this.amount = amount }

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
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    amount,
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
            addons().ifPresent { it.forEach { it.validate() } }
            amount()
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
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (addons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (amount.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProductCart &&
                productId == other.productId &&
                quantity == other.quantity &&
                addons == other.addons &&
                amount == other.amount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(productId, quantity, addons, amount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProductCart{productId=$productId, quantity=$quantity, addons=$addons, amount=$amount, additionalProperties=$additionalProperties}"
    }

    /** Billing address information for the session */
    class BillingAddress
    private constructor(
        private val country: JsonField<CountryCode>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val street: JsonField<String>,
        private val zipcode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country")
            @ExcludeMissing
            country: JsonField<CountryCode> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            @JsonProperty("street") @ExcludeMissing street: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zipcode") @ExcludeMissing zipcode: JsonField<String> = JsonMissing.of(),
        ) : this(country, city, state, street, zipcode, mutableMapOf())

        /**
         * Two-letter ISO country code (ISO 3166-1 alpha-2)
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun country(): CountryCode = country.getRequired("country")

        /**
         * City name
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * State or province name
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): Optional<String> = state.getOptional("state")

        /**
         * Street address including house number and unit/apartment if applicable
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun street(): Optional<String> = street.getOptional("street")

        /**
         * Postal code or ZIP code
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun zipcode(): Optional<String> = zipcode.getOptional("zipcode")

        /**
         * Returns the raw JSON value of [country].
         *
         * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<CountryCode> = country

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        /**
         * Returns the raw JSON value of [street].
         *
         * Unlike [street], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("street") @ExcludeMissing fun _street(): JsonField<String> = street

        /**
         * Returns the raw JSON value of [zipcode].
         *
         * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

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
             * Returns a mutable builder for constructing an instance of [BillingAddress].
             *
             * The following fields are required:
             * ```java
             * .country()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingAddress]. */
        class Builder internal constructor() {

            private var country: JsonField<CountryCode>? = null
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var street: JsonField<String> = JsonMissing.of()
            private var zipcode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingAddress: BillingAddress) = apply {
                country = billingAddress.country
                city = billingAddress.city
                state = billingAddress.state
                street = billingAddress.street
                zipcode = billingAddress.zipcode
                additionalProperties = billingAddress.additionalProperties.toMutableMap()
            }

            /** Two-letter ISO country code (ISO 3166-1 alpha-2) */
            fun country(country: CountryCode) = country(JsonField.of(country))

            /**
             * Sets [Builder.country] to an arbitrary JSON value.
             *
             * You should usually call [Builder.country] with a well-typed [CountryCode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun country(country: JsonField<CountryCode>) = apply { this.country = country }

            /** City name */
            fun city(city: String?) = city(JsonField.ofNullable(city))

            /** Alias for calling [Builder.city] with `city.orElse(null)`. */
            fun city(city: Optional<String>) = city(city.getOrNull())

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** State or province name */
            fun state(state: String?) = state(JsonField.ofNullable(state))

            /** Alias for calling [Builder.state] with `state.orElse(null)`. */
            fun state(state: Optional<String>) = state(state.getOrNull())

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** Street address including house number and unit/apartment if applicable */
            fun street(street: String?) = street(JsonField.ofNullable(street))

            /** Alias for calling [Builder.street] with `street.orElse(null)`. */
            fun street(street: Optional<String>) = street(street.getOrNull())

            /**
             * Sets [Builder.street] to an arbitrary JSON value.
             *
             * You should usually call [Builder.street] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun street(street: JsonField<String>) = apply { this.street = street }

            /** Postal code or ZIP code */
            fun zipcode(zipcode: String?) = zipcode(JsonField.ofNullable(zipcode))

            /** Alias for calling [Builder.zipcode] with `zipcode.orElse(null)`. */
            fun zipcode(zipcode: Optional<String>) = zipcode(zipcode.getOrNull())

            /**
             * Sets [Builder.zipcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zipcode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

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
             * Returns an immutable instance of [BillingAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .country()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingAddress =
                BillingAddress(
                    checkRequired("country", country),
                    city,
                    state,
                    street,
                    zipcode,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BillingAddress = apply {
            if (validated) {
                return@apply
            }

            country().validate()
            city()
            state()
            street()
            zipcode()
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
            (country.asKnown().getOrNull()?.validity() ?: 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (state.asKnown().isPresent) 1 else 0) +
                (if (street.asKnown().isPresent) 1 else 0) +
                (if (zipcode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingAddress &&
                country == other.country &&
                city == other.city &&
                state == other.state &&
                street == other.street &&
                zipcode == other.zipcode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(country, city, state, street, zipcode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingAddress{country=$country, city=$city, state=$state, street=$street, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    /** Customization for the checkout session page */
    class Customization
    private constructor(
        private val showOnDemandTag: JsonField<Boolean>,
        private val showOrderDetails: JsonField<Boolean>,
        private val theme: JsonField<Theme>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("show_on_demand_tag")
            @ExcludeMissing
            showOnDemandTag: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("show_order_details")
            @ExcludeMissing
            showOrderDetails: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("theme") @ExcludeMissing theme: JsonField<Theme> = JsonMissing.of(),
        ) : this(showOnDemandTag, showOrderDetails, theme, mutableMapOf())

        /**
         * Show on demand tag
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun showOnDemandTag(): Optional<Boolean> = showOnDemandTag.getOptional("show_on_demand_tag")

        /**
         * Show order details by default
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun showOrderDetails(): Optional<Boolean> =
            showOrderDetails.getOptional("show_order_details")

        /**
         * Theme of the page
         *
         * Default is `System`.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun theme(): Optional<Theme> = theme.getOptional("theme")

        /**
         * Returns the raw JSON value of [showOnDemandTag].
         *
         * Unlike [showOnDemandTag], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("show_on_demand_tag")
        @ExcludeMissing
        fun _showOnDemandTag(): JsonField<Boolean> = showOnDemandTag

        /**
         * Returns the raw JSON value of [showOrderDetails].
         *
         * Unlike [showOrderDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("show_order_details")
        @ExcludeMissing
        fun _showOrderDetails(): JsonField<Boolean> = showOrderDetails

        /**
         * Returns the raw JSON value of [theme].
         *
         * Unlike [theme], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("theme") @ExcludeMissing fun _theme(): JsonField<Theme> = theme

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

            /** Returns a mutable builder for constructing an instance of [Customization]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Customization]. */
        class Builder internal constructor() {

            private var showOnDemandTag: JsonField<Boolean> = JsonMissing.of()
            private var showOrderDetails: JsonField<Boolean> = JsonMissing.of()
            private var theme: JsonField<Theme> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customization: Customization) = apply {
                showOnDemandTag = customization.showOnDemandTag
                showOrderDetails = customization.showOrderDetails
                theme = customization.theme
                additionalProperties = customization.additionalProperties.toMutableMap()
            }

            /**
             * Show on demand tag
             *
             * Default is true
             */
            fun showOnDemandTag(showOnDemandTag: Boolean) =
                showOnDemandTag(JsonField.of(showOnDemandTag))

            /**
             * Sets [Builder.showOnDemandTag] to an arbitrary JSON value.
             *
             * You should usually call [Builder.showOnDemandTag] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun showOnDemandTag(showOnDemandTag: JsonField<Boolean>) = apply {
                this.showOnDemandTag = showOnDemandTag
            }

            /**
             * Show order details by default
             *
             * Default is true
             */
            fun showOrderDetails(showOrderDetails: Boolean) =
                showOrderDetails(JsonField.of(showOrderDetails))

            /**
             * Sets [Builder.showOrderDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.showOrderDetails] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun showOrderDetails(showOrderDetails: JsonField<Boolean>) = apply {
                this.showOrderDetails = showOrderDetails
            }

            /**
             * Theme of the page
             *
             * Default is `System`.
             */
            fun theme(theme: Theme) = theme(JsonField.of(theme))

            /**
             * Sets [Builder.theme] to an arbitrary JSON value.
             *
             * You should usually call [Builder.theme] with a well-typed [Theme] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun theme(theme: JsonField<Theme>) = apply { this.theme = theme }

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
             * Returns an immutable instance of [Customization].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Customization =
                Customization(
                    showOnDemandTag,
                    showOrderDetails,
                    theme,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Customization = apply {
            if (validated) {
                return@apply
            }

            showOnDemandTag()
            showOrderDetails()
            theme().ifPresent { it.validate() }
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
            (if (showOnDemandTag.asKnown().isPresent) 1 else 0) +
                (if (showOrderDetails.asKnown().isPresent) 1 else 0) +
                (theme.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * Theme of the page
         *
         * Default is `System`.
         */
        class Theme @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DARK = of("dark")

                @JvmField val LIGHT = of("light")

                @JvmField val SYSTEM = of("system")

                @JvmStatic fun of(value: String) = Theme(JsonField.of(value))
            }

            /** An enum containing [Theme]'s known values. */
            enum class Known {
                DARK,
                LIGHT,
                SYSTEM,
            }

            /**
             * An enum containing [Theme]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Theme] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DARK,
                LIGHT,
                SYSTEM,
                /**
                 * An enum member indicating that [Theme] was instantiated with an unknown value.
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
                    DARK -> Value.DARK
                    LIGHT -> Value.LIGHT
                    SYSTEM -> Value.SYSTEM
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
                    DARK -> Known.DARK
                    LIGHT -> Known.LIGHT
                    SYSTEM -> Known.SYSTEM
                    else -> throw DodoPaymentsInvalidDataException("Unknown Theme: $value")
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

            fun validate(): Theme = apply {
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

                return other is Theme && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Customization &&
                showOnDemandTag == other.showOnDemandTag &&
                showOrderDetails == other.showOrderDetails &&
                theme == other.theme &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(showOnDemandTag, showOrderDetails, theme, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customization{showOnDemandTag=$showOnDemandTag, showOrderDetails=$showOrderDetails, theme=$theme, additionalProperties=$additionalProperties}"
    }

    class FeatureFlags
    private constructor(
        private val allowCurrencySelection: JsonField<Boolean>,
        private val allowDiscountCode: JsonField<Boolean>,
        private val allowPhoneNumberCollection: JsonField<Boolean>,
        private val allowTaxId: JsonField<Boolean>,
        private val alwaysCreateNewCustomer: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_currency_selection")
            @ExcludeMissing
            allowCurrencySelection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_discount_code")
            @ExcludeMissing
            allowDiscountCode: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_phone_number_collection")
            @ExcludeMissing
            allowPhoneNumberCollection: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("allow_tax_id")
            @ExcludeMissing
            allowTaxId: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("always_create_new_customer")
            @ExcludeMissing
            alwaysCreateNewCustomer: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            allowCurrencySelection,
            allowDiscountCode,
            allowPhoneNumberCollection,
            allowTaxId,
            alwaysCreateNewCustomer,
            mutableMapOf(),
        )

        /**
         * if customer is allowed to change currency, set it to true
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowCurrencySelection(): Optional<Boolean> =
            allowCurrencySelection.getOptional("allow_currency_selection")

        /**
         * If the customer is allowed to apply discount code, set it to true.
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowDiscountCode(): Optional<Boolean> =
            allowDiscountCode.getOptional("allow_discount_code")

        /**
         * If phone number is collected from customer, set it to rue
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowPhoneNumberCollection(): Optional<Boolean> =
            allowPhoneNumberCollection.getOptional("allow_phone_number_collection")

        /**
         * If the customer is allowed to add tax id, set it to true
         *
         * Default is true
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun allowTaxId(): Optional<Boolean> = allowTaxId.getOptional("allow_tax_id")

        /**
         * Set to true if a new customer object should be created. By default email is used to find
         * an existing customer to attach the session to
         *
         * Default is false
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alwaysCreateNewCustomer(): Optional<Boolean> =
            alwaysCreateNewCustomer.getOptional("always_create_new_customer")

        /**
         * Returns the raw JSON value of [allowCurrencySelection].
         *
         * Unlike [allowCurrencySelection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_currency_selection")
        @ExcludeMissing
        fun _allowCurrencySelection(): JsonField<Boolean> = allowCurrencySelection

        /**
         * Returns the raw JSON value of [allowDiscountCode].
         *
         * Unlike [allowDiscountCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allow_discount_code")
        @ExcludeMissing
        fun _allowDiscountCode(): JsonField<Boolean> = allowDiscountCode

        /**
         * Returns the raw JSON value of [allowPhoneNumberCollection].
         *
         * Unlike [allowPhoneNumberCollection], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("allow_phone_number_collection")
        @ExcludeMissing
        fun _allowPhoneNumberCollection(): JsonField<Boolean> = allowPhoneNumberCollection

        /**
         * Returns the raw JSON value of [allowTaxId].
         *
         * Unlike [allowTaxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("allow_tax_id")
        @ExcludeMissing
        fun _allowTaxId(): JsonField<Boolean> = allowTaxId

        /**
         * Returns the raw JSON value of [alwaysCreateNewCustomer].
         *
         * Unlike [alwaysCreateNewCustomer], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("always_create_new_customer")
        @ExcludeMissing
        fun _alwaysCreateNewCustomer(): JsonField<Boolean> = alwaysCreateNewCustomer

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

            /** Returns a mutable builder for constructing an instance of [FeatureFlags]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [FeatureFlags]. */
        class Builder internal constructor() {

            private var allowCurrencySelection: JsonField<Boolean> = JsonMissing.of()
            private var allowDiscountCode: JsonField<Boolean> = JsonMissing.of()
            private var allowPhoneNumberCollection: JsonField<Boolean> = JsonMissing.of()
            private var allowTaxId: JsonField<Boolean> = JsonMissing.of()
            private var alwaysCreateNewCustomer: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(featureFlags: FeatureFlags) = apply {
                allowCurrencySelection = featureFlags.allowCurrencySelection
                allowDiscountCode = featureFlags.allowDiscountCode
                allowPhoneNumberCollection = featureFlags.allowPhoneNumberCollection
                allowTaxId = featureFlags.allowTaxId
                alwaysCreateNewCustomer = featureFlags.alwaysCreateNewCustomer
                additionalProperties = featureFlags.additionalProperties.toMutableMap()
            }

            /**
             * if customer is allowed to change currency, set it to true
             *
             * Default is true
             */
            fun allowCurrencySelection(allowCurrencySelection: Boolean) =
                allowCurrencySelection(JsonField.of(allowCurrencySelection))

            /**
             * Sets [Builder.allowCurrencySelection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowCurrencySelection] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowCurrencySelection(allowCurrencySelection: JsonField<Boolean>) = apply {
                this.allowCurrencySelection = allowCurrencySelection
            }

            /**
             * If the customer is allowed to apply discount code, set it to true.
             *
             * Default is true
             */
            fun allowDiscountCode(allowDiscountCode: Boolean) =
                allowDiscountCode(JsonField.of(allowDiscountCode))

            /**
             * Sets [Builder.allowDiscountCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowDiscountCode] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowDiscountCode(allowDiscountCode: JsonField<Boolean>) = apply {
                this.allowDiscountCode = allowDiscountCode
            }

            /**
             * If phone number is collected from customer, set it to rue
             *
             * Default is true
             */
            fun allowPhoneNumberCollection(allowPhoneNumberCollection: Boolean) =
                allowPhoneNumberCollection(JsonField.of(allowPhoneNumberCollection))

            /**
             * Sets [Builder.allowPhoneNumberCollection] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowPhoneNumberCollection] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun allowPhoneNumberCollection(allowPhoneNumberCollection: JsonField<Boolean>) = apply {
                this.allowPhoneNumberCollection = allowPhoneNumberCollection
            }

            /**
             * If the customer is allowed to add tax id, set it to true
             *
             * Default is true
             */
            fun allowTaxId(allowTaxId: Boolean) = allowTaxId(JsonField.of(allowTaxId))

            /**
             * Sets [Builder.allowTaxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowTaxId] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun allowTaxId(allowTaxId: JsonField<Boolean>) = apply { this.allowTaxId = allowTaxId }

            /**
             * Set to true if a new customer object should be created. By default email is used to
             * find an existing customer to attach the session to
             *
             * Default is false
             */
            fun alwaysCreateNewCustomer(alwaysCreateNewCustomer: Boolean) =
                alwaysCreateNewCustomer(JsonField.of(alwaysCreateNewCustomer))

            /**
             * Sets [Builder.alwaysCreateNewCustomer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alwaysCreateNewCustomer] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun alwaysCreateNewCustomer(alwaysCreateNewCustomer: JsonField<Boolean>) = apply {
                this.alwaysCreateNewCustomer = alwaysCreateNewCustomer
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
             * Returns an immutable instance of [FeatureFlags].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): FeatureFlags =
                FeatureFlags(
                    allowCurrencySelection,
                    allowDiscountCode,
                    allowPhoneNumberCollection,
                    allowTaxId,
                    alwaysCreateNewCustomer,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): FeatureFlags = apply {
            if (validated) {
                return@apply
            }

            allowCurrencySelection()
            allowDiscountCode()
            allowPhoneNumberCollection()
            allowTaxId()
            alwaysCreateNewCustomer()
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
            (if (allowCurrencySelection.asKnown().isPresent) 1 else 0) +
                (if (allowDiscountCode.asKnown().isPresent) 1 else 0) +
                (if (allowPhoneNumberCollection.asKnown().isPresent) 1 else 0) +
                (if (allowTaxId.asKnown().isPresent) 1 else 0) +
                (if (alwaysCreateNewCustomer.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeatureFlags &&
                allowCurrencySelection == other.allowCurrencySelection &&
                allowDiscountCode == other.allowDiscountCode &&
                allowPhoneNumberCollection == other.allowPhoneNumberCollection &&
                allowTaxId == other.allowTaxId &&
                alwaysCreateNewCustomer == other.alwaysCreateNewCustomer &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                allowCurrencySelection,
                allowDiscountCode,
                allowPhoneNumberCollection,
                allowTaxId,
                alwaysCreateNewCustomer,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeatureFlags{allowCurrencySelection=$allowCurrencySelection, allowDiscountCode=$allowDiscountCode, allowPhoneNumberCollection=$allowPhoneNumberCollection, allowTaxId=$allowTaxId, alwaysCreateNewCustomer=$alwaysCreateNewCustomer, additionalProperties=$additionalProperties}"
    }

    /** Additional metadata associated with the payment. Defaults to empty if not provided. */
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

    class SubscriptionData
    private constructor(
        private val onDemand: JsonField<OnDemandSubscription>,
        private val trialPeriodDays: JsonField<Int>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("on_demand")
            @ExcludeMissing
            onDemand: JsonField<OnDemandSubscription> = JsonMissing.of(),
            @JsonProperty("trial_period_days")
            @ExcludeMissing
            trialPeriodDays: JsonField<Int> = JsonMissing.of(),
        ) : this(onDemand, trialPeriodDays, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onDemand(): Optional<OnDemandSubscription> = onDemand.getOptional("on_demand")

        /**
         * Optional trial period in days If specified, this value overrides the trial period set in
         * the product's price Must be between 0 and 10000 days
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun trialPeriodDays(): Optional<Int> = trialPeriodDays.getOptional("trial_period_days")

        /**
         * Returns the raw JSON value of [onDemand].
         *
         * Unlike [onDemand], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("on_demand")
        @ExcludeMissing
        fun _onDemand(): JsonField<OnDemandSubscription> = onDemand

        /**
         * Returns the raw JSON value of [trialPeriodDays].
         *
         * Unlike [trialPeriodDays], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("trial_period_days")
        @ExcludeMissing
        fun _trialPeriodDays(): JsonField<Int> = trialPeriodDays

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

            /** Returns a mutable builder for constructing an instance of [SubscriptionData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SubscriptionData]. */
        class Builder internal constructor() {

            private var onDemand: JsonField<OnDemandSubscription> = JsonMissing.of()
            private var trialPeriodDays: JsonField<Int> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(subscriptionData: SubscriptionData) = apply {
                onDemand = subscriptionData.onDemand
                trialPeriodDays = subscriptionData.trialPeriodDays
                additionalProperties = subscriptionData.additionalProperties.toMutableMap()
            }

            fun onDemand(onDemand: OnDemandSubscription?) = onDemand(JsonField.ofNullable(onDemand))

            /** Alias for calling [Builder.onDemand] with `onDemand.orElse(null)`. */
            fun onDemand(onDemand: Optional<OnDemandSubscription>) = onDemand(onDemand.getOrNull())

            /**
             * Sets [Builder.onDemand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onDemand] with a well-typed [OnDemandSubscription]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun onDemand(onDemand: JsonField<OnDemandSubscription>) = apply {
                this.onDemand = onDemand
            }

            /**
             * Optional trial period in days If specified, this value overrides the trial period set
             * in the product's price Must be between 0 and 10000 days
             */
            fun trialPeriodDays(trialPeriodDays: Int?) =
                trialPeriodDays(JsonField.ofNullable(trialPeriodDays))

            /**
             * Alias for [Builder.trialPeriodDays].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun trialPeriodDays(trialPeriodDays: Int) = trialPeriodDays(trialPeriodDays as Int?)

            /** Alias for calling [Builder.trialPeriodDays] with `trialPeriodDays.orElse(null)`. */
            fun trialPeriodDays(trialPeriodDays: Optional<Int>) =
                trialPeriodDays(trialPeriodDays.getOrNull())

            /**
             * Sets [Builder.trialPeriodDays] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trialPeriodDays] with a well-typed [Int] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trialPeriodDays(trialPeriodDays: JsonField<Int>) = apply {
                this.trialPeriodDays = trialPeriodDays
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
             * Returns an immutable instance of [SubscriptionData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SubscriptionData =
                SubscriptionData(onDemand, trialPeriodDays, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SubscriptionData = apply {
            if (validated) {
                return@apply
            }

            onDemand().ifPresent { it.validate() }
            trialPeriodDays()
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
            (onDemand.asKnown().getOrNull()?.validity() ?: 0) +
                (if (trialPeriodDays.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SubscriptionData &&
                onDemand == other.onDemand &&
                trialPeriodDays == other.trialPeriodDays &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(onDemand, trialPeriodDays, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SubscriptionData{onDemand=$onDemand, trialPeriodDays=$trialPeriodDays, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckoutSessionRequest &&
            productCart == other.productCart &&
            allowedPaymentMethodTypes == other.allowedPaymentMethodTypes &&
            billingAddress == other.billingAddress &&
            billingCurrency == other.billingCurrency &&
            confirm == other.confirm &&
            customer == other.customer &&
            customization == other.customization &&
            discountCode == other.discountCode &&
            featureFlags == other.featureFlags &&
            metadata == other.metadata &&
            returnUrl == other.returnUrl &&
            showSavedPaymentMethods == other.showSavedPaymentMethods &&
            subscriptionData == other.subscriptionData &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            productCart,
            allowedPaymentMethodTypes,
            billingAddress,
            billingCurrency,
            confirm,
            customer,
            customization,
            discountCode,
            featureFlags,
            metadata,
            returnUrl,
            showSavedPaymentMethods,
            subscriptionData,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckoutSessionRequest{productCart=$productCart, allowedPaymentMethodTypes=$allowedPaymentMethodTypes, billingAddress=$billingAddress, billingCurrency=$billingCurrency, confirm=$confirm, customer=$customer, customization=$customization, discountCode=$discountCode, featureFlags=$featureFlags, metadata=$metadata, returnUrl=$returnUrl, showSavedPaymentMethods=$showSavedPaymentMethods, subscriptionData=$subscriptionData, additionalProperties=$additionalProperties}"
}
