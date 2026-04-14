// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.checkKnown
import com.dodopayments.api.core.checkRequired
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.core.toImmutable
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.misc.TaxCategory
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProductListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val businessId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val entitlements: JsonField<List<Entitlement>>,
    private val isRecurring: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val productId: JsonField<String>,
    private val taxCategory: JsonField<TaxCategory>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val description: JsonField<String>,
    private val image: JsonField<String>,
    private val name: JsonField<String>,
    private val price: JsonField<Int>,
    private val priceDetail: JsonField<Price>,
    private val taxInclusive: JsonField<Boolean>,
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
        @JsonProperty("entitlements")
        @ExcludeMissing
        entitlements: JsonField<List<Entitlement>> = JsonMissing.of(),
        @JsonProperty("is_recurring")
        @ExcludeMissing
        isRecurring: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("product_id") @ExcludeMissing productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax_category")
        @ExcludeMissing
        taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("image") @ExcludeMissing image: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("price") @ExcludeMissing price: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("price_detail")
        @ExcludeMissing
        priceDetail: JsonField<Price> = JsonMissing.of(),
        @JsonProperty("tax_inclusive")
        @ExcludeMissing
        taxInclusive: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        businessId,
        createdAt,
        entitlements,
        isRecurring,
        metadata,
        productId,
        taxCategory,
        updatedAt,
        currency,
        description,
        image,
        name,
        price,
        priceDetail,
        taxInclusive,
        mutableMapOf(),
    )

    /**
     * Unique identifier for the business to which the product belongs.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun businessId(): String = businessId.getRequired("business_id")

    /**
     * Timestamp when the product was created.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * Entitlements linked to this product
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entitlements(): List<Entitlement> = entitlements.getRequired("entitlements")

    /**
     * Indicates if the product is recurring (e.g., subscriptions).
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isRecurring(): Boolean = isRecurring.getRequired("is_recurring")

    /**
     * Additional custom data associated with the product
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun metadata(): Metadata = metadata.getRequired("metadata")

    /**
     * Unique identifier for the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun productId(): String = productId.getRequired("product_id")

    /**
     * Tax category associated with the product.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun taxCategory(): TaxCategory = taxCategory.getRequired("tax_category")

    /**
     * Timestamp when the product was last updated.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * Currency of the price
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): Optional<Currency> = currency.getOptional("currency")

    /**
     * Description of the product, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * URL of the product image, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun image(): Optional<String> = image.getOptional("image")

    /**
     * Name of the product, optional.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Price of the product, optional.
     *
     * The price is represented in the lowest denomination of the currency. For example:
     * - In USD, a price of `$12.34` would be represented as `1234` (cents).
     * - In JPY, a price of `¥1500` would be represented as `1500` (yen).
     * - In INR, a price of `₹1234.56` would be represented as `123456` (paise).
     *
     * This ensures precision and avoids floating-point rounding errors.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun price(): Optional<Int> = price.getOptional("price")

    /**
     * Details of the price
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun priceDetail(): Optional<Price> = priceDetail.getOptional("price_detail")

    /**
     * Indicates if the price is tax inclusive
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxInclusive(): Optional<Boolean> = taxInclusive.getOptional("tax_inclusive")

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
     * Returns the raw JSON value of [entitlements].
     *
     * Unlike [entitlements], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entitlements")
    @ExcludeMissing
    fun _entitlements(): JsonField<List<Entitlement>> = entitlements

    /**
     * Returns the raw JSON value of [isRecurring].
     *
     * Unlike [isRecurring], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_recurring")
    @ExcludeMissing
    fun _isRecurring(): JsonField<Boolean> = isRecurring

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [productId].
     *
     * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /**
     * Returns the raw JSON value of [taxCategory].
     *
     * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_category")
    @ExcludeMissing
    fun _taxCategory(): JsonField<TaxCategory> = taxCategory

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [image].
     *
     * Unlike [image], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("image") @ExcludeMissing fun _image(): JsonField<String> = image

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Int> = price

    /**
     * Returns the raw JSON value of [priceDetail].
     *
     * Unlike [priceDetail], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("price_detail") @ExcludeMissing fun _priceDetail(): JsonField<Price> = priceDetail

    /**
     * Returns the raw JSON value of [taxInclusive].
     *
     * Unlike [taxInclusive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tax_inclusive")
    @ExcludeMissing
    fun _taxInclusive(): JsonField<Boolean> = taxInclusive

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
         * Returns a mutable builder for constructing an instance of [ProductListResponse].
         *
         * The following fields are required:
         * ```java
         * .businessId()
         * .createdAt()
         * .entitlements()
         * .isRecurring()
         * .metadata()
         * .productId()
         * .taxCategory()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductListResponse]. */
    class Builder internal constructor() {

        private var businessId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var entitlements: JsonField<MutableList<Entitlement>>? = null
        private var isRecurring: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var productId: JsonField<String>? = null
        private var taxCategory: JsonField<TaxCategory>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var image: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var price: JsonField<Int> = JsonMissing.of()
        private var priceDetail: JsonField<Price> = JsonMissing.of()
        private var taxInclusive: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(productListResponse: ProductListResponse) = apply {
            businessId = productListResponse.businessId
            createdAt = productListResponse.createdAt
            entitlements = productListResponse.entitlements.map { it.toMutableList() }
            isRecurring = productListResponse.isRecurring
            metadata = productListResponse.metadata
            productId = productListResponse.productId
            taxCategory = productListResponse.taxCategory
            updatedAt = productListResponse.updatedAt
            currency = productListResponse.currency
            description = productListResponse.description
            image = productListResponse.image
            name = productListResponse.name
            price = productListResponse.price
            priceDetail = productListResponse.priceDetail
            taxInclusive = productListResponse.taxInclusive
            additionalProperties = productListResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for the business to which the product belongs. */
        fun businessId(businessId: String) = businessId(JsonField.of(businessId))

        /**
         * Sets [Builder.businessId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun businessId(businessId: JsonField<String>) = apply { this.businessId = businessId }

        /** Timestamp when the product was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** Entitlements linked to this product */
        fun entitlements(entitlements: List<Entitlement>) = entitlements(JsonField.of(entitlements))

        /**
         * Sets [Builder.entitlements] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entitlements] with a well-typed `List<Entitlement>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun entitlements(entitlements: JsonField<List<Entitlement>>) = apply {
            this.entitlements = entitlements.map { it.toMutableList() }
        }

        /**
         * Adds a single [Entitlement] to [entitlements].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEntitlement(entitlement: Entitlement) = apply {
            entitlements =
                (entitlements ?: JsonField.of(mutableListOf())).also {
                    checkKnown("entitlements", it).add(entitlement)
                }
        }

        /** Indicates if the product is recurring (e.g., subscriptions). */
        fun isRecurring(isRecurring: Boolean) = isRecurring(JsonField.of(isRecurring))

        /**
         * Sets [Builder.isRecurring] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRecurring] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRecurring(isRecurring: JsonField<Boolean>) = apply { this.isRecurring = isRecurring }

        /** Additional custom data associated with the product */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        /** Unique identifier for the product. */
        fun productId(productId: String) = productId(JsonField.of(productId))

        /**
         * Sets [Builder.productId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Tax category associated with the product. */
        fun taxCategory(taxCategory: TaxCategory) = taxCategory(JsonField.of(taxCategory))

        /**
         * Sets [Builder.taxCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
            this.taxCategory = taxCategory
        }

        /** Timestamp when the product was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** Currency of the price */
        fun currency(currency: Currency?) = currency(JsonField.ofNullable(currency))

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<Currency>) = currency(currency.getOrNull())

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Description of the product, optional. */
        fun description(description: String?) = description(JsonField.ofNullable(description))

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** URL of the product image, optional. */
        fun image(image: String?) = image(JsonField.ofNullable(image))

        /** Alias for calling [Builder.image] with `image.orElse(null)`. */
        fun image(image: Optional<String>) = image(image.getOrNull())

        /**
         * Sets [Builder.image] to an arbitrary JSON value.
         *
         * You should usually call [Builder.image] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun image(image: JsonField<String>) = apply { this.image = image }

        /** Name of the product, optional. */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * Price of the product, optional.
         *
         * The price is represented in the lowest denomination of the currency. For example:
         * - In USD, a price of `$12.34` would be represented as `1234` (cents).
         * - In JPY, a price of `¥1500` would be represented as `1500` (yen).
         * - In INR, a price of `₹1234.56` would be represented as `123456` (paise).
         *
         * This ensures precision and avoids floating-point rounding errors.
         */
        fun price(price: Int?) = price(JsonField.ofNullable(price))

        /**
         * Alias for [Builder.price].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun price(price: Int) = price(price as Int?)

        /** Alias for calling [Builder.price] with `price.orElse(null)`. */
        fun price(price: Optional<Int>) = price(price.getOrNull())

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Int] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Int>) = apply { this.price = price }

        /** Details of the price */
        fun priceDetail(priceDetail: Price?) = priceDetail(JsonField.ofNullable(priceDetail))

        /** Alias for calling [Builder.priceDetail] with `priceDetail.orElse(null)`. */
        fun priceDetail(priceDetail: Optional<Price>) = priceDetail(priceDetail.getOrNull())

        /**
         * Sets [Builder.priceDetail] to an arbitrary JSON value.
         *
         * You should usually call [Builder.priceDetail] with a well-typed [Price] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun priceDetail(priceDetail: JsonField<Price>) = apply { this.priceDetail = priceDetail }

        /** Alias for calling [priceDetail] with `Price.ofOneTime(oneTime)`. */
        fun priceDetail(oneTime: Price.OneTimePrice) = priceDetail(Price.ofOneTime(oneTime))

        /** Alias for calling [priceDetail] with `Price.ofRecurring(recurring)`. */
        fun priceDetail(recurring: Price.RecurringPrice) = priceDetail(Price.ofRecurring(recurring))

        /** Alias for calling [priceDetail] with `Price.ofUsageBased(usageBased)`. */
        fun priceDetail(usageBased: Price.UsageBasedPrice) =
            priceDetail(Price.ofUsageBased(usageBased))

        /** Indicates if the price is tax inclusive */
        fun taxInclusive(taxInclusive: Boolean?) = taxInclusive(JsonField.ofNullable(taxInclusive))

        /**
         * Alias for [Builder.taxInclusive].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun taxInclusive(taxInclusive: Boolean) = taxInclusive(taxInclusive as Boolean?)

        /** Alias for calling [Builder.taxInclusive] with `taxInclusive.orElse(null)`. */
        fun taxInclusive(taxInclusive: Optional<Boolean>) = taxInclusive(taxInclusive.getOrNull())

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
         * Returns an immutable instance of [ProductListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .businessId()
         * .createdAt()
         * .entitlements()
         * .isRecurring()
         * .metadata()
         * .productId()
         * .taxCategory()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductListResponse =
            ProductListResponse(
                checkRequired("businessId", businessId),
                checkRequired("createdAt", createdAt),
                checkRequired("entitlements", entitlements).map { it.toImmutable() },
                checkRequired("isRecurring", isRecurring),
                checkRequired("metadata", metadata),
                checkRequired("productId", productId),
                checkRequired("taxCategory", taxCategory),
                checkRequired("updatedAt", updatedAt),
                currency,
                description,
                image,
                name,
                price,
                priceDetail,
                taxInclusive,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ProductListResponse = apply {
        if (validated) {
            return@apply
        }

        businessId()
        createdAt()
        entitlements().forEach { it.validate() }
        isRecurring()
        metadata().validate()
        productId()
        taxCategory().validate()
        updatedAt()
        currency().ifPresent { it.validate() }
        description()
        image()
        name()
        price()
        priceDetail().ifPresent { it.validate() }
        taxInclusive()
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
            (entitlements.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isRecurring.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (productId.asKnown().isPresent) 1 else 0) +
            (taxCategory.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (currency.asKnown().getOrNull()?.validity() ?: 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (image.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (price.asKnown().isPresent) 1 else 0) +
            (priceDetail.asKnown().getOrNull()?.validity() ?: 0) +
            (if (taxInclusive.asKnown().isPresent) 1 else 0)

    /** Summary of an entitlement attached to a product */
    class Entitlement
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val integrationConfig: JsonField<IntegrationConfig>,
        private val integrationType: JsonField<IntegrationType>,
        private val name: JsonField<String>,
        private val description: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("integration_config")
            @ExcludeMissing
            integrationConfig: JsonField<IntegrationConfig> = JsonMissing.of(),
            @JsonProperty("integration_type")
            @ExcludeMissing
            integrationType: JsonField<IntegrationType> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
        ) : this(id, integrationConfig, integrationType, name, description, mutableMapOf())

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * Platform-specific configuration for an entitlement. Each variant uses unique field names
         * so `#[serde(untagged)]` can disambiguate correctly.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationConfig(): IntegrationConfig =
            integrationConfig.getRequired("integration_config")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun integrationType(): IntegrationType = integrationType.getRequired("integration_type")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [integrationConfig].
         *
         * Unlike [integrationConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_config")
        @ExcludeMissing
        fun _integrationConfig(): JsonField<IntegrationConfig> = integrationConfig

        /**
         * Returns the raw JSON value of [integrationType].
         *
         * Unlike [integrationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("integration_type")
        @ExcludeMissing
        fun _integrationType(): JsonField<IntegrationType> = integrationType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
             * Returns a mutable builder for constructing an instance of [Entitlement].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .integrationConfig()
             * .integrationType()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Entitlement]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var integrationConfig: JsonField<IntegrationConfig>? = null
            private var integrationType: JsonField<IntegrationType>? = null
            private var name: JsonField<String>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(entitlement: Entitlement) = apply {
                id = entitlement.id
                integrationConfig = entitlement.integrationConfig
                integrationType = entitlement.integrationType
                name = entitlement.name
                description = entitlement.description
                additionalProperties = entitlement.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * Platform-specific configuration for an entitlement. Each variant uses unique field
             * names so `#[serde(untagged)]` can disambiguate correctly.
             */
            fun integrationConfig(integrationConfig: IntegrationConfig) =
                integrationConfig(JsonField.of(integrationConfig))

            /**
             * Sets [Builder.integrationConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationConfig] with a well-typed
             * [IntegrationConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun integrationConfig(integrationConfig: JsonField<IntegrationConfig>) = apply {
                this.integrationConfig = integrationConfig
            }

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofGitHub(github)`. */
            fun integrationConfig(github: IntegrationConfig.GitHubConfig) =
                integrationConfig(IntegrationConfig.ofGitHub(github))

            /**
             * Alias for calling [integrationConfig] with `IntegrationConfig.ofDiscord(discord)`.
             */
            fun integrationConfig(discord: IntegrationConfig.DiscordConfig) =
                integrationConfig(IntegrationConfig.ofDiscord(discord))

            /**
             * Alias for calling [integrationConfig] with `IntegrationConfig.ofTelegram(telegram)`.
             */
            fun integrationConfig(telegram: IntegrationConfig.TelegramConfig) =
                integrationConfig(IntegrationConfig.ofTelegram(telegram))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFigma(figma)`. */
            fun integrationConfig(figma: IntegrationConfig.FigmaConfig) =
                integrationConfig(IntegrationConfig.ofFigma(figma))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofFramer(framer)`. */
            fun integrationConfig(framer: IntegrationConfig.FramerConfig) =
                integrationConfig(IntegrationConfig.ofFramer(framer))

            /** Alias for calling [integrationConfig] with `IntegrationConfig.ofNotion(notion)`. */
            fun integrationConfig(notion: IntegrationConfig.NotionConfig) =
                integrationConfig(IntegrationConfig.ofNotion(notion))

            /**
             * Alias for calling [integrationConfig] with
             * `IntegrationConfig.ofDigitalFiles(digitalFiles)`.
             */
            fun integrationConfig(digitalFiles: IntegrationConfig.DigitalFilesConfig) =
                integrationConfig(IntegrationConfig.ofDigitalFiles(digitalFiles))

            /**
             * Alias for calling [integrationConfig] with
             * `IntegrationConfig.ofLicenseKey(licenseKey)`.
             */
            fun integrationConfig(licenseKey: IntegrationConfig.LicenseKeyConfig) =
                integrationConfig(IntegrationConfig.ofLicenseKey(licenseKey))

            fun integrationType(integrationType: IntegrationType) =
                integrationType(JsonField.of(integrationType))

            /**
             * Sets [Builder.integrationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.integrationType] with a well-typed [IntegrationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun integrationType(integrationType: JsonField<IntegrationType>) = apply {
                this.integrationType = integrationType
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

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
             * Returns an immutable instance of [Entitlement].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .integrationConfig()
             * .integrationType()
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Entitlement =
                Entitlement(
                    checkRequired("id", id),
                    checkRequired("integrationConfig", integrationConfig),
                    checkRequired("integrationType", integrationType),
                    checkRequired("name", name),
                    description,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Entitlement = apply {
            if (validated) {
                return@apply
            }

            id()
            integrationConfig().validate()
            integrationType().validate()
            name()
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (integrationConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (integrationType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (description.asKnown().isPresent) 1 else 0)

        /**
         * Platform-specific configuration for an entitlement. Each variant uses unique field names
         * so `#[serde(untagged)]` can disambiguate correctly.
         */
        @JsonDeserialize(using = IntegrationConfig.Deserializer::class)
        @JsonSerialize(using = IntegrationConfig.Serializer::class)
        class IntegrationConfig
        private constructor(
            private val github: GitHubConfig? = null,
            private val discord: DiscordConfig? = null,
            private val telegram: TelegramConfig? = null,
            private val figma: FigmaConfig? = null,
            private val framer: FramerConfig? = null,
            private val notion: NotionConfig? = null,
            private val digitalFiles: DigitalFilesConfig? = null,
            private val licenseKey: LicenseKeyConfig? = null,
            private val _json: JsonValue? = null,
        ) {

            fun github(): Optional<GitHubConfig> = Optional.ofNullable(github)

            fun discord(): Optional<DiscordConfig> = Optional.ofNullable(discord)

            fun telegram(): Optional<TelegramConfig> = Optional.ofNullable(telegram)

            fun figma(): Optional<FigmaConfig> = Optional.ofNullable(figma)

            fun framer(): Optional<FramerConfig> = Optional.ofNullable(framer)

            fun notion(): Optional<NotionConfig> = Optional.ofNullable(notion)

            fun digitalFiles(): Optional<DigitalFilesConfig> = Optional.ofNullable(digitalFiles)

            fun licenseKey(): Optional<LicenseKeyConfig> = Optional.ofNullable(licenseKey)

            fun isGitHub(): Boolean = github != null

            fun isDiscord(): Boolean = discord != null

            fun isTelegram(): Boolean = telegram != null

            fun isFigma(): Boolean = figma != null

            fun isFramer(): Boolean = framer != null

            fun isNotion(): Boolean = notion != null

            fun isDigitalFiles(): Boolean = digitalFiles != null

            fun isLicenseKey(): Boolean = licenseKey != null

            fun asGitHub(): GitHubConfig = github.getOrThrow("github")

            fun asDiscord(): DiscordConfig = discord.getOrThrow("discord")

            fun asTelegram(): TelegramConfig = telegram.getOrThrow("telegram")

            fun asFigma(): FigmaConfig = figma.getOrThrow("figma")

            fun asFramer(): FramerConfig = framer.getOrThrow("framer")

            fun asNotion(): NotionConfig = notion.getOrThrow("notion")

            fun asDigitalFiles(): DigitalFilesConfig = digitalFiles.getOrThrow("digitalFiles")

            fun asLicenseKey(): LicenseKeyConfig = licenseKey.getOrThrow("licenseKey")

            fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    github != null -> visitor.visitGitHub(github)
                    discord != null -> visitor.visitDiscord(discord)
                    telegram != null -> visitor.visitTelegram(telegram)
                    figma != null -> visitor.visitFigma(figma)
                    framer != null -> visitor.visitFramer(framer)
                    notion != null -> visitor.visitNotion(notion)
                    digitalFiles != null -> visitor.visitDigitalFiles(digitalFiles)
                    licenseKey != null -> visitor.visitLicenseKey(licenseKey)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): IntegrationConfig = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitGitHub(github: GitHubConfig) {
                            github.validate()
                        }

                        override fun visitDiscord(discord: DiscordConfig) {
                            discord.validate()
                        }

                        override fun visitTelegram(telegram: TelegramConfig) {
                            telegram.validate()
                        }

                        override fun visitFigma(figma: FigmaConfig) {
                            figma.validate()
                        }

                        override fun visitFramer(framer: FramerConfig) {
                            framer.validate()
                        }

                        override fun visitNotion(notion: NotionConfig) {
                            notion.validate()
                        }

                        override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) {
                            digitalFiles.validate()
                        }

                        override fun visitLicenseKey(licenseKey: LicenseKeyConfig) {
                            licenseKey.validate()
                        }
                    }
                )
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
                accept(
                    object : Visitor<Int> {
                        override fun visitGitHub(github: GitHubConfig) = github.validity()

                        override fun visitDiscord(discord: DiscordConfig) = discord.validity()

                        override fun visitTelegram(telegram: TelegramConfig) = telegram.validity()

                        override fun visitFigma(figma: FigmaConfig) = figma.validity()

                        override fun visitFramer(framer: FramerConfig) = framer.validity()

                        override fun visitNotion(notion: NotionConfig) = notion.validity()

                        override fun visitDigitalFiles(digitalFiles: DigitalFilesConfig) =
                            digitalFiles.validity()

                        override fun visitLicenseKey(licenseKey: LicenseKeyConfig) =
                            licenseKey.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is IntegrationConfig &&
                    github == other.github &&
                    discord == other.discord &&
                    telegram == other.telegram &&
                    figma == other.figma &&
                    framer == other.framer &&
                    notion == other.notion &&
                    digitalFiles == other.digitalFiles &&
                    licenseKey == other.licenseKey
            }

            override fun hashCode(): Int =
                Objects.hash(
                    github,
                    discord,
                    telegram,
                    figma,
                    framer,
                    notion,
                    digitalFiles,
                    licenseKey,
                )

            override fun toString(): String =
                when {
                    github != null -> "IntegrationConfig{github=$github}"
                    discord != null -> "IntegrationConfig{discord=$discord}"
                    telegram != null -> "IntegrationConfig{telegram=$telegram}"
                    figma != null -> "IntegrationConfig{figma=$figma}"
                    framer != null -> "IntegrationConfig{framer=$framer}"
                    notion != null -> "IntegrationConfig{notion=$notion}"
                    digitalFiles != null -> "IntegrationConfig{digitalFiles=$digitalFiles}"
                    licenseKey != null -> "IntegrationConfig{licenseKey=$licenseKey}"
                    _json != null -> "IntegrationConfig{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid IntegrationConfig")
                }

            companion object {

                @JvmStatic fun ofGitHub(github: GitHubConfig) = IntegrationConfig(github = github)

                @JvmStatic
                fun ofDiscord(discord: DiscordConfig) = IntegrationConfig(discord = discord)

                @JvmStatic
                fun ofTelegram(telegram: TelegramConfig) = IntegrationConfig(telegram = telegram)

                @JvmStatic fun ofFigma(figma: FigmaConfig) = IntegrationConfig(figma = figma)

                @JvmStatic fun ofFramer(framer: FramerConfig) = IntegrationConfig(framer = framer)

                @JvmStatic fun ofNotion(notion: NotionConfig) = IntegrationConfig(notion = notion)

                @JvmStatic
                fun ofDigitalFiles(digitalFiles: DigitalFilesConfig) =
                    IntegrationConfig(digitalFiles = digitalFiles)

                @JvmStatic
                fun ofLicenseKey(licenseKey: LicenseKeyConfig) =
                    IntegrationConfig(licenseKey = licenseKey)
            }

            /**
             * An interface that defines how to map each variant of [IntegrationConfig] to a value
             * of type [T].
             */
            interface Visitor<out T> {

                fun visitGitHub(github: GitHubConfig): T

                fun visitDiscord(discord: DiscordConfig): T

                fun visitTelegram(telegram: TelegramConfig): T

                fun visitFigma(figma: FigmaConfig): T

                fun visitFramer(framer: FramerConfig): T

                fun visitNotion(notion: NotionConfig): T

                fun visitDigitalFiles(digitalFiles: DigitalFilesConfig): T

                fun visitLicenseKey(licenseKey: LicenseKeyConfig): T

                /**
                 * Maps an unknown variant of [IntegrationConfig] to a value of type [T].
                 *
                 * An instance of [IntegrationConfig] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws DodoPaymentsInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw DodoPaymentsInvalidDataException("Unknown IntegrationConfig: $json")
                }
            }

            internal class Deserializer :
                BaseDeserializer<IntegrationConfig>(IntegrationConfig::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): IntegrationConfig {
                    val json = JsonValue.fromJsonNode(node)

                    val bestMatches =
                        sequenceOf(
                                tryDeserialize(node, jacksonTypeRef<GitHubConfig>())?.let {
                                    IntegrationConfig(github = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<DiscordConfig>())?.let {
                                    IntegrationConfig(discord = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<TelegramConfig>())?.let {
                                    IntegrationConfig(telegram = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FigmaConfig>())?.let {
                                    IntegrationConfig(figma = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<FramerConfig>())?.let {
                                    IntegrationConfig(framer = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<NotionConfig>())?.let {
                                    IntegrationConfig(notion = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<DigitalFilesConfig>())?.let {
                                    IntegrationConfig(digitalFiles = it, _json = json)
                                },
                                tryDeserialize(node, jacksonTypeRef<LicenseKeyConfig>())?.let {
                                    IntegrationConfig(licenseKey = it, _json = json)
                                },
                            )
                            .filterNotNull()
                            .allMaxBy { it.validity() }
                            .toList()
                    return when (bestMatches.size) {
                        // This can happen if what we're deserializing is completely incompatible
                        // with all the possible variants (e.g. deserializing from boolean).
                        0 -> IntegrationConfig(_json = json)
                        1 -> bestMatches.single()
                        // If there's more than one match with the highest validity, then use the
                        // first completely valid match, or simply the first match if none are
                        // completely valid.
                        else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                    }
                }
            }

            internal class Serializer :
                BaseSerializer<IntegrationConfig>(IntegrationConfig::class) {

                override fun serialize(
                    value: IntegrationConfig,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.github != null -> generator.writeObject(value.github)
                        value.discord != null -> generator.writeObject(value.discord)
                        value.telegram != null -> generator.writeObject(value.telegram)
                        value.figma != null -> generator.writeObject(value.figma)
                        value.framer != null -> generator.writeObject(value.framer)
                        value.notion != null -> generator.writeObject(value.notion)
                        value.digitalFiles != null -> generator.writeObject(value.digitalFiles)
                        value.licenseKey != null -> generator.writeObject(value.licenseKey)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid IntegrationConfig")
                    }
                }
            }

            class GitHubConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val permission: JsonField<String>,
                private val targetId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("permission")
                    @ExcludeMissing
                    permission: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("target_id")
                    @ExcludeMissing
                    targetId: JsonField<String> = JsonMissing.of(),
                ) : this(permission, targetId, mutableMapOf())

                /**
                 * One of: pull, push, admin, maintain, triage
                 *
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun permission(): String = permission.getRequired("permission")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun targetId(): String = targetId.getRequired("target_id")

                /**
                 * Returns the raw JSON value of [permission].
                 *
                 * Unlike [permission], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("permission")
                @ExcludeMissing
                fun _permission(): JsonField<String> = permission

                /**
                 * Returns the raw JSON value of [targetId].
                 *
                 * Unlike [targetId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("target_id")
                @ExcludeMissing
                fun _targetId(): JsonField<String> = targetId

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
                     * Returns a mutable builder for constructing an instance of [GitHubConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .permission()
                     * .targetId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [GitHubConfig]. */
                class Builder internal constructor() {

                    private var permission: JsonField<String>? = null
                    private var targetId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(githubConfig: GitHubConfig) = apply {
                        permission = githubConfig.permission
                        targetId = githubConfig.targetId
                        additionalProperties = githubConfig.additionalProperties.toMutableMap()
                    }

                    /** One of: pull, push, admin, maintain, triage */
                    fun permission(permission: String) = permission(JsonField.of(permission))

                    /**
                     * Sets [Builder.permission] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.permission] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun permission(permission: JsonField<String>) = apply {
                        this.permission = permission
                    }

                    fun targetId(targetId: String) = targetId(JsonField.of(targetId))

                    /**
                     * Sets [Builder.targetId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.targetId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun targetId(targetId: JsonField<String>) = apply { this.targetId = targetId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [GitHubConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .permission()
                     * .targetId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): GitHubConfig =
                        GitHubConfig(
                            checkRequired("permission", permission),
                            checkRequired("targetId", targetId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): GitHubConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    permission()
                    targetId()
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
                    (if (permission.asKnown().isPresent) 1 else 0) +
                        (if (targetId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is GitHubConfig &&
                        permission == other.permission &&
                        targetId == other.targetId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(permission, targetId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "GitHubConfig{permission=$permission, targetId=$targetId, additionalProperties=$additionalProperties}"
            }

            class DiscordConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val guildId: JsonField<String>,
                private val roleId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("guild_id")
                    @ExcludeMissing
                    guildId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("role_id")
                    @ExcludeMissing
                    roleId: JsonField<String> = JsonMissing.of(),
                ) : this(guildId, roleId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun guildId(): String = guildId.getRequired("guild_id")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun roleId(): Optional<String> = roleId.getOptional("role_id")

                /**
                 * Returns the raw JSON value of [guildId].
                 *
                 * Unlike [guildId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("guild_id")
                @ExcludeMissing
                fun _guildId(): JsonField<String> = guildId

                /**
                 * Returns the raw JSON value of [roleId].
                 *
                 * Unlike [roleId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("role_id") @ExcludeMissing fun _roleId(): JsonField<String> = roleId

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
                     * Returns a mutable builder for constructing an instance of [DiscordConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .guildId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DiscordConfig]. */
                class Builder internal constructor() {

                    private var guildId: JsonField<String>? = null
                    private var roleId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(discordConfig: DiscordConfig) = apply {
                        guildId = discordConfig.guildId
                        roleId = discordConfig.roleId
                        additionalProperties = discordConfig.additionalProperties.toMutableMap()
                    }

                    fun guildId(guildId: String) = guildId(JsonField.of(guildId))

                    /**
                     * Sets [Builder.guildId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.guildId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun guildId(guildId: JsonField<String>) = apply { this.guildId = guildId }

                    fun roleId(roleId: String?) = roleId(JsonField.ofNullable(roleId))

                    /** Alias for calling [Builder.roleId] with `roleId.orElse(null)`. */
                    fun roleId(roleId: Optional<String>) = roleId(roleId.getOrNull())

                    /**
                     * Sets [Builder.roleId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.roleId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun roleId(roleId: JsonField<String>) = apply { this.roleId = roleId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [DiscordConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .guildId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DiscordConfig =
                        DiscordConfig(
                            checkRequired("guildId", guildId),
                            roleId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DiscordConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    guildId()
                    roleId()
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
                    (if (guildId.asKnown().isPresent) 1 else 0) +
                        (if (roleId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DiscordConfig &&
                        guildId == other.guildId &&
                        roleId == other.roleId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(guildId, roleId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DiscordConfig{guildId=$guildId, roleId=$roleId, additionalProperties=$additionalProperties}"
            }

            class TelegramConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val chatId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("chat_id")
                    @ExcludeMissing
                    chatId: JsonField<String> = JsonMissing.of()
                ) : this(chatId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun chatId(): String = chatId.getRequired("chat_id")

                /**
                 * Returns the raw JSON value of [chatId].
                 *
                 * Unlike [chatId], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("chat_id") @ExcludeMissing fun _chatId(): JsonField<String> = chatId

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
                     * Returns a mutable builder for constructing an instance of [TelegramConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .chatId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TelegramConfig]. */
                class Builder internal constructor() {

                    private var chatId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(telegramConfig: TelegramConfig) = apply {
                        chatId = telegramConfig.chatId
                        additionalProperties = telegramConfig.additionalProperties.toMutableMap()
                    }

                    fun chatId(chatId: String) = chatId(JsonField.of(chatId))

                    /**
                     * Sets [Builder.chatId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.chatId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun chatId(chatId: JsonField<String>) = apply { this.chatId = chatId }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [TelegramConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .chatId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TelegramConfig =
                        TelegramConfig(
                            checkRequired("chatId", chatId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): TelegramConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    chatId()
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
                internal fun validity(): Int = (if (chatId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TelegramConfig &&
                        chatId == other.chatId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(chatId, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TelegramConfig{chatId=$chatId, additionalProperties=$additionalProperties}"
            }

            class FigmaConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val figmaFileId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("figma_file_id")
                    @ExcludeMissing
                    figmaFileId: JsonField<String> = JsonMissing.of()
                ) : this(figmaFileId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun figmaFileId(): String = figmaFileId.getRequired("figma_file_id")

                /**
                 * Returns the raw JSON value of [figmaFileId].
                 *
                 * Unlike [figmaFileId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("figma_file_id")
                @ExcludeMissing
                fun _figmaFileId(): JsonField<String> = figmaFileId

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
                     * Returns a mutable builder for constructing an instance of [FigmaConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .figmaFileId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FigmaConfig]. */
                class Builder internal constructor() {

                    private var figmaFileId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(figmaConfig: FigmaConfig) = apply {
                        figmaFileId = figmaConfig.figmaFileId
                        additionalProperties = figmaConfig.additionalProperties.toMutableMap()
                    }

                    fun figmaFileId(figmaFileId: String) = figmaFileId(JsonField.of(figmaFileId))

                    /**
                     * Sets [Builder.figmaFileId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.figmaFileId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun figmaFileId(figmaFileId: JsonField<String>) = apply {
                        this.figmaFileId = figmaFileId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [FigmaConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .figmaFileId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FigmaConfig =
                        FigmaConfig(
                            checkRequired("figmaFileId", figmaFileId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FigmaConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    figmaFileId()
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
                internal fun validity(): Int = (if (figmaFileId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FigmaConfig &&
                        figmaFileId == other.figmaFileId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(figmaFileId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FigmaConfig{figmaFileId=$figmaFileId, additionalProperties=$additionalProperties}"
            }

            class FramerConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val framerTemplateId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("framer_template_id")
                    @ExcludeMissing
                    framerTemplateId: JsonField<String> = JsonMissing.of()
                ) : this(framerTemplateId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun framerTemplateId(): String = framerTemplateId.getRequired("framer_template_id")

                /**
                 * Returns the raw JSON value of [framerTemplateId].
                 *
                 * Unlike [framerTemplateId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("framer_template_id")
                @ExcludeMissing
                fun _framerTemplateId(): JsonField<String> = framerTemplateId

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
                     * Returns a mutable builder for constructing an instance of [FramerConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .framerTemplateId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [FramerConfig]. */
                class Builder internal constructor() {

                    private var framerTemplateId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(framerConfig: FramerConfig) = apply {
                        framerTemplateId = framerConfig.framerTemplateId
                        additionalProperties = framerConfig.additionalProperties.toMutableMap()
                    }

                    fun framerTemplateId(framerTemplateId: String) =
                        framerTemplateId(JsonField.of(framerTemplateId))

                    /**
                     * Sets [Builder.framerTemplateId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.framerTemplateId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun framerTemplateId(framerTemplateId: JsonField<String>) = apply {
                        this.framerTemplateId = framerTemplateId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [FramerConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .framerTemplateId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FramerConfig =
                        FramerConfig(
                            checkRequired("framerTemplateId", framerTemplateId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): FramerConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    framerTemplateId()
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
                internal fun validity(): Int = (if (framerTemplateId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FramerConfig &&
                        framerTemplateId == other.framerTemplateId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(framerTemplateId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FramerConfig{framerTemplateId=$framerTemplateId, additionalProperties=$additionalProperties}"
            }

            class NotionConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val notionTemplateId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("notion_template_id")
                    @ExcludeMissing
                    notionTemplateId: JsonField<String> = JsonMissing.of()
                ) : this(notionTemplateId, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun notionTemplateId(): String = notionTemplateId.getRequired("notion_template_id")

                /**
                 * Returns the raw JSON value of [notionTemplateId].
                 *
                 * Unlike [notionTemplateId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("notion_template_id")
                @ExcludeMissing
                fun _notionTemplateId(): JsonField<String> = notionTemplateId

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
                     * Returns a mutable builder for constructing an instance of [NotionConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .notionTemplateId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [NotionConfig]. */
                class Builder internal constructor() {

                    private var notionTemplateId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(notionConfig: NotionConfig) = apply {
                        notionTemplateId = notionConfig.notionTemplateId
                        additionalProperties = notionConfig.additionalProperties.toMutableMap()
                    }

                    fun notionTemplateId(notionTemplateId: String) =
                        notionTemplateId(JsonField.of(notionTemplateId))

                    /**
                     * Sets [Builder.notionTemplateId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.notionTemplateId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun notionTemplateId(notionTemplateId: JsonField<String>) = apply {
                        this.notionTemplateId = notionTemplateId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [NotionConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .notionTemplateId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): NotionConfig =
                        NotionConfig(
                            checkRequired("notionTemplateId", notionTemplateId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): NotionConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    notionTemplateId()
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
                internal fun validity(): Int = (if (notionTemplateId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is NotionConfig &&
                        notionTemplateId == other.notionTemplateId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(notionTemplateId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NotionConfig{notionTemplateId=$notionTemplateId, additionalProperties=$additionalProperties}"
            }

            class DigitalFilesConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val digitalFileIds: JsonField<List<String>>,
                private val externalUrl: JsonField<String>,
                private val instructions: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("digital_file_ids")
                    @ExcludeMissing
                    digitalFileIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("external_url")
                    @ExcludeMissing
                    externalUrl: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("instructions")
                    @ExcludeMissing
                    instructions: JsonField<String> = JsonMissing.of(),
                ) : this(digitalFileIds, externalUrl, instructions, mutableMapOf())

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun digitalFileIds(): List<String> = digitalFileIds.getRequired("digital_file_ids")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun externalUrl(): Optional<String> = externalUrl.getOptional("external_url")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun instructions(): Optional<String> = instructions.getOptional("instructions")

                /**
                 * Returns the raw JSON value of [digitalFileIds].
                 *
                 * Unlike [digitalFileIds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("digital_file_ids")
                @ExcludeMissing
                fun _digitalFileIds(): JsonField<List<String>> = digitalFileIds

                /**
                 * Returns the raw JSON value of [externalUrl].
                 *
                 * Unlike [externalUrl], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("external_url")
                @ExcludeMissing
                fun _externalUrl(): JsonField<String> = externalUrl

                /**
                 * Returns the raw JSON value of [instructions].
                 *
                 * Unlike [instructions], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("instructions")
                @ExcludeMissing
                fun _instructions(): JsonField<String> = instructions

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
                     * [DigitalFilesConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .digitalFileIds()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [DigitalFilesConfig]. */
                class Builder internal constructor() {

                    private var digitalFileIds: JsonField<MutableList<String>>? = null
                    private var externalUrl: JsonField<String> = JsonMissing.of()
                    private var instructions: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(digitalFilesConfig: DigitalFilesConfig) = apply {
                        digitalFileIds =
                            digitalFilesConfig.digitalFileIds.map { it.toMutableList() }
                        externalUrl = digitalFilesConfig.externalUrl
                        instructions = digitalFilesConfig.instructions
                        additionalProperties =
                            digitalFilesConfig.additionalProperties.toMutableMap()
                    }

                    fun digitalFileIds(digitalFileIds: List<String>) =
                        digitalFileIds(JsonField.of(digitalFileIds))

                    /**
                     * Sets [Builder.digitalFileIds] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.digitalFileIds] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun digitalFileIds(digitalFileIds: JsonField<List<String>>) = apply {
                        this.digitalFileIds = digitalFileIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [String] to [digitalFileIds].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addDigitalFileId(digitalFileId: String) = apply {
                        digitalFileIds =
                            (digitalFileIds ?: JsonField.of(mutableListOf())).also {
                                checkKnown("digitalFileIds", it).add(digitalFileId)
                            }
                    }

                    fun externalUrl(externalUrl: String?) =
                        externalUrl(JsonField.ofNullable(externalUrl))

                    /** Alias for calling [Builder.externalUrl] with `externalUrl.orElse(null)`. */
                    fun externalUrl(externalUrl: Optional<String>) =
                        externalUrl(externalUrl.getOrNull())

                    /**
                     * Sets [Builder.externalUrl] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.externalUrl] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun externalUrl(externalUrl: JsonField<String>) = apply {
                        this.externalUrl = externalUrl
                    }

                    fun instructions(instructions: String?) =
                        instructions(JsonField.ofNullable(instructions))

                    /**
                     * Alias for calling [Builder.instructions] with `instructions.orElse(null)`.
                     */
                    fun instructions(instructions: Optional<String>) =
                        instructions(instructions.getOrNull())

                    /**
                     * Sets [Builder.instructions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.instructions] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun instructions(instructions: JsonField<String>) = apply {
                        this.instructions = instructions
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [DigitalFilesConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .digitalFileIds()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): DigitalFilesConfig =
                        DigitalFilesConfig(
                            checkRequired("digitalFileIds", digitalFileIds).map {
                                it.toImmutable()
                            },
                            externalUrl,
                            instructions,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): DigitalFilesConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    digitalFileIds()
                    externalUrl()
                    instructions()
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
                    (digitalFileIds.asKnown().getOrNull()?.size ?: 0) +
                        (if (externalUrl.asKnown().isPresent) 1 else 0) +
                        (if (instructions.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DigitalFilesConfig &&
                        digitalFileIds == other.digitalFileIds &&
                        externalUrl == other.externalUrl &&
                        instructions == other.instructions &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(digitalFileIds, externalUrl, instructions, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "DigitalFilesConfig{digitalFileIds=$digitalFileIds, externalUrl=$externalUrl, instructions=$instructions, additionalProperties=$additionalProperties}"
            }

            class LicenseKeyConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val activationMessage: JsonField<String>,
                private val activationsLimit: JsonField<Int>,
                private val durationCount: JsonField<Int>,
                private val durationInterval: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("activation_message")
                    @ExcludeMissing
                    activationMessage: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("activations_limit")
                    @ExcludeMissing
                    activationsLimit: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("duration_count")
                    @ExcludeMissing
                    durationCount: JsonField<Int> = JsonMissing.of(),
                    @JsonProperty("duration_interval")
                    @ExcludeMissing
                    durationInterval: JsonField<String> = JsonMissing.of(),
                ) : this(
                    activationMessage,
                    activationsLimit,
                    durationCount,
                    durationInterval,
                    mutableMapOf(),
                )

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun activationMessage(): Optional<String> =
                    activationMessage.getOptional("activation_message")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun activationsLimit(): Optional<Int> =
                    activationsLimit.getOptional("activations_limit")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun durationCount(): Optional<Int> = durationCount.getOptional("duration_count")

                /**
                 * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun durationInterval(): Optional<String> =
                    durationInterval.getOptional("duration_interval")

                /**
                 * Returns the raw JSON value of [activationMessage].
                 *
                 * Unlike [activationMessage], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("activation_message")
                @ExcludeMissing
                fun _activationMessage(): JsonField<String> = activationMessage

                /**
                 * Returns the raw JSON value of [activationsLimit].
                 *
                 * Unlike [activationsLimit], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("activations_limit")
                @ExcludeMissing
                fun _activationsLimit(): JsonField<Int> = activationsLimit

                /**
                 * Returns the raw JSON value of [durationCount].
                 *
                 * Unlike [durationCount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("duration_count")
                @ExcludeMissing
                fun _durationCount(): JsonField<Int> = durationCount

                /**
                 * Returns the raw JSON value of [durationInterval].
                 *
                 * Unlike [durationInterval], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("duration_interval")
                @ExcludeMissing
                fun _durationInterval(): JsonField<String> = durationInterval

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
                     * Returns a mutable builder for constructing an instance of [LicenseKeyConfig].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [LicenseKeyConfig]. */
                class Builder internal constructor() {

                    private var activationMessage: JsonField<String> = JsonMissing.of()
                    private var activationsLimit: JsonField<Int> = JsonMissing.of()
                    private var durationCount: JsonField<Int> = JsonMissing.of()
                    private var durationInterval: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(licenseKeyConfig: LicenseKeyConfig) = apply {
                        activationMessage = licenseKeyConfig.activationMessage
                        activationsLimit = licenseKeyConfig.activationsLimit
                        durationCount = licenseKeyConfig.durationCount
                        durationInterval = licenseKeyConfig.durationInterval
                        additionalProperties = licenseKeyConfig.additionalProperties.toMutableMap()
                    }

                    fun activationMessage(activationMessage: String?) =
                        activationMessage(JsonField.ofNullable(activationMessage))

                    /**
                     * Alias for calling [Builder.activationMessage] with
                     * `activationMessage.orElse(null)`.
                     */
                    fun activationMessage(activationMessage: Optional<String>) =
                        activationMessage(activationMessage.getOrNull())

                    /**
                     * Sets [Builder.activationMessage] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.activationMessage] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun activationMessage(activationMessage: JsonField<String>) = apply {
                        this.activationMessage = activationMessage
                    }

                    fun activationsLimit(activationsLimit: Int?) =
                        activationsLimit(JsonField.ofNullable(activationsLimit))

                    /**
                     * Alias for [Builder.activationsLimit].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun activationsLimit(activationsLimit: Int) =
                        activationsLimit(activationsLimit as Int?)

                    /**
                     * Alias for calling [Builder.activationsLimit] with
                     * `activationsLimit.orElse(null)`.
                     */
                    fun activationsLimit(activationsLimit: Optional<Int>) =
                        activationsLimit(activationsLimit.getOrNull())

                    /**
                     * Sets [Builder.activationsLimit] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.activationsLimit] with a well-typed [Int]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun activationsLimit(activationsLimit: JsonField<Int>) = apply {
                        this.activationsLimit = activationsLimit
                    }

                    fun durationCount(durationCount: Int?) =
                        durationCount(JsonField.ofNullable(durationCount))

                    /**
                     * Alias for [Builder.durationCount].
                     *
                     * This unboxed primitive overload exists for backwards compatibility.
                     */
                    fun durationCount(durationCount: Int) = durationCount(durationCount as Int?)

                    /**
                     * Alias for calling [Builder.durationCount] with `durationCount.orElse(null)`.
                     */
                    fun durationCount(durationCount: Optional<Int>) =
                        durationCount(durationCount.getOrNull())

                    /**
                     * Sets [Builder.durationCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.durationCount] with a well-typed [Int] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun durationCount(durationCount: JsonField<Int>) = apply {
                        this.durationCount = durationCount
                    }

                    fun durationInterval(durationInterval: String?) =
                        durationInterval(JsonField.ofNullable(durationInterval))

                    /**
                     * Alias for calling [Builder.durationInterval] with
                     * `durationInterval.orElse(null)`.
                     */
                    fun durationInterval(durationInterval: Optional<String>) =
                        durationInterval(durationInterval.getOrNull())

                    /**
                     * Sets [Builder.durationInterval] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.durationInterval] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun durationInterval(durationInterval: JsonField<String>) = apply {
                        this.durationInterval = durationInterval
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [LicenseKeyConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): LicenseKeyConfig =
                        LicenseKeyConfig(
                            activationMessage,
                            activationsLimit,
                            durationCount,
                            durationInterval,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): LicenseKeyConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    activationMessage()
                    activationsLimit()
                    durationCount()
                    durationInterval()
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
                    (if (activationMessage.asKnown().isPresent) 1 else 0) +
                        (if (activationsLimit.asKnown().isPresent) 1 else 0) +
                        (if (durationCount.asKnown().isPresent) 1 else 0) +
                        (if (durationInterval.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is LicenseKeyConfig &&
                        activationMessage == other.activationMessage &&
                        activationsLimit == other.activationsLimit &&
                        durationCount == other.durationCount &&
                        durationInterval == other.durationInterval &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        activationMessage,
                        activationsLimit,
                        durationCount,
                        durationInterval,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "LicenseKeyConfig{activationMessage=$activationMessage, activationsLimit=$activationsLimit, durationCount=$durationCount, durationInterval=$durationInterval, additionalProperties=$additionalProperties}"
            }
        }

        class IntegrationType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val DISCORD = of("discord")

                @JvmField val TELEGRAM = of("telegram")

                @JvmField val GITHUB = of("github")

                @JvmField val FIGMA = of("figma")

                @JvmField val FRAMER = of("framer")

                @JvmField val NOTION = of("notion")

                @JvmField val DIGITAL_FILES = of("digital_files")

                @JvmField val LICENSE_KEY = of("license_key")

                @JvmStatic fun of(value: String) = IntegrationType(JsonField.of(value))
            }

            /** An enum containing [IntegrationType]'s known values. */
            enum class Known {
                DISCORD,
                TELEGRAM,
                GITHUB,
                FIGMA,
                FRAMER,
                NOTION,
                DIGITAL_FILES,
                LICENSE_KEY,
            }

            /**
             * An enum containing [IntegrationType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IntegrationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DISCORD,
                TELEGRAM,
                GITHUB,
                FIGMA,
                FRAMER,
                NOTION,
                DIGITAL_FILES,
                LICENSE_KEY,
                /**
                 * An enum member indicating that [IntegrationType] was instantiated with an unknown
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
                    DISCORD -> Value.DISCORD
                    TELEGRAM -> Value.TELEGRAM
                    GITHUB -> Value.GITHUB
                    FIGMA -> Value.FIGMA
                    FRAMER -> Value.FRAMER
                    NOTION -> Value.NOTION
                    DIGITAL_FILES -> Value.DIGITAL_FILES
                    LICENSE_KEY -> Value.LICENSE_KEY
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
                    DISCORD -> Known.DISCORD
                    TELEGRAM -> Known.TELEGRAM
                    GITHUB -> Known.GITHUB
                    FIGMA -> Known.FIGMA
                    FRAMER -> Known.FRAMER
                    NOTION -> Known.NOTION
                    DIGITAL_FILES -> Known.DIGITAL_FILES
                    LICENSE_KEY -> Known.LICENSE_KEY
                    else ->
                        throw DodoPaymentsInvalidDataException("Unknown IntegrationType: $value")
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

            fun validate(): IntegrationType = apply {
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

                return other is IntegrationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entitlement &&
                id == other.id &&
                integrationConfig == other.integrationConfig &&
                integrationType == other.integrationType &&
                name == other.name &&
                description == other.description &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                integrationConfig,
                integrationType,
                name,
                description,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Entitlement{id=$id, integrationConfig=$integrationConfig, integrationType=$integrationType, name=$name, description=$description, additionalProperties=$additionalProperties}"
    }

    /** Additional custom data associated with the product */
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

        return other is ProductListResponse &&
            businessId == other.businessId &&
            createdAt == other.createdAt &&
            entitlements == other.entitlements &&
            isRecurring == other.isRecurring &&
            metadata == other.metadata &&
            productId == other.productId &&
            taxCategory == other.taxCategory &&
            updatedAt == other.updatedAt &&
            currency == other.currency &&
            description == other.description &&
            image == other.image &&
            name == other.name &&
            price == other.price &&
            priceDetail == other.priceDetail &&
            taxInclusive == other.taxInclusive &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            businessId,
            createdAt,
            entitlements,
            isRecurring,
            metadata,
            productId,
            taxCategory,
            updatedAt,
            currency,
            description,
            image,
            name,
            price,
            priceDetail,
            taxInclusive,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProductListResponse{businessId=$businessId, createdAt=$createdAt, entitlements=$entitlements, isRecurring=$isRecurring, metadata=$metadata, productId=$productId, taxCategory=$taxCategory, updatedAt=$updatedAt, currency=$currency, description=$description, image=$image, name=$name, price=$price, priceDetail=$priceDetail, taxInclusive=$taxInclusive, additionalProperties=$additionalProperties}"
}
