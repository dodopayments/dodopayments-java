// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.Enum
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
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ProductUpdateParams
private constructor(
    private val id: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String = id

    /**
     * Available Addons for subscription products
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun addons(): Optional<List<String>> = body.addons()

    /**
     * Description of the product, optional and must be at most 1000 characters.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): Optional<String> = body.description()

    /**
     * Product image id after its uploaded to S3
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun imageId(): Optional<String> = body.imageId()

    /**
     * Message sent to the customer upon license key activation.
     *
     * Only applicable if `license_key_enabled` is `true`. This message contains instructions for
     * activating the license key.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyActivationMessage(): Optional<String> = body.licenseKeyActivationMessage()

    /**
     * Limit for the number of activations for the license key.
     *
     * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of times
     * the license key can be activated.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyActivationsLimit(): Optional<Long> = body.licenseKeyActivationsLimit()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyDuration(): Optional<LicenseKeyDuration> = body.licenseKeyDuration()

    /**
     * Whether the product requires a license key.
     *
     * If `true`, additional fields related to license key (duration, activations limit, activation
     * message) become applicable.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun licenseKeyEnabled(): Optional<Boolean> = body.licenseKeyEnabled()

    /**
     * Name of the product, optional and must be at most 100 characters.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun name(): Optional<String> = body.name()

    /**
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun price(): Optional<Price> = body.price()

    /**
     * Represents the different categories of taxation applicable to various products and services.
     *
     * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxCategory(): Optional<TaxCategory> = body.taxCategory()

    /**
     * Returns the raw JSON value of [addons].
     *
     * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _addons(): JsonField<List<String>> = body._addons()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [imageId].
     *
     * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _imageId(): JsonField<String> = body._imageId()

    /**
     * Returns the raw JSON value of [licenseKeyActivationMessage].
     *
     * Unlike [licenseKeyActivationMessage], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _licenseKeyActivationMessage(): JsonField<String> = body._licenseKeyActivationMessage()

    /**
     * Returns the raw JSON value of [licenseKeyActivationsLimit].
     *
     * Unlike [licenseKeyActivationsLimit], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _licenseKeyActivationsLimit(): JsonField<Long> = body._licenseKeyActivationsLimit()

    /**
     * Returns the raw JSON value of [licenseKeyDuration].
     *
     * Unlike [licenseKeyDuration], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = body._licenseKeyDuration()

    /**
     * Returns the raw JSON value of [licenseKeyEnabled].
     *
     * Unlike [licenseKeyEnabled], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _licenseKeyEnabled(): JsonField<Boolean> = body._licenseKeyEnabled()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [price].
     *
     * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _price(): JsonField<Price> = body._price()

    /**
     * Returns the raw JSON value of [taxCategory].
     *
     * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _taxCategory(): JsonField<TaxCategory> = body._taxCategory()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductUpdateParams].
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(productUpdateParams: ProductUpdateParams) = apply {
            id = productUpdateParams.id
            body = productUpdateParams.body.toBuilder()
            additionalHeaders = productUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = productUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String) = apply { this.id = id }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [addons]
         * - [description]
         * - [imageId]
         * - [licenseKeyActivationMessage]
         * - [licenseKeyActivationsLimit]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Available Addons for subscription products */
        fun addons(addons: List<String>?) = apply { body.addons(addons) }

        /** Alias for calling [Builder.addons] with `addons.orElse(null)`. */
        fun addons(addons: Optional<List<String>>) = addons(addons.getOrNull())

        /**
         * Sets [Builder.addons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addons] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun addons(addons: JsonField<List<String>>) = apply { body.addons(addons) }

        /**
         * Adds a single [String] to [addons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAddon(addon: String) = apply { body.addAddon(addon) }

        /** Description of the product, optional and must be at most 1000 characters. */
        fun description(description: String?) = apply { body.description(description) }

        /** Alias for calling [Builder.description] with `description.orElse(null)`. */
        fun description(description: Optional<String>) = description(description.getOrNull())

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Product image id after its uploaded to S3 */
        fun imageId(imageId: String?) = apply { body.imageId(imageId) }

        /** Alias for calling [Builder.imageId] with `imageId.orElse(null)`. */
        fun imageId(imageId: Optional<String>) = imageId(imageId.getOrNull())

        /**
         * Sets [Builder.imageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.imageId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun imageId(imageId: JsonField<String>) = apply { body.imageId(imageId) }

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) = apply {
            body.licenseKeyActivationMessage(licenseKeyActivationMessage)
        }

        /**
         * Alias for calling [Builder.licenseKeyActivationMessage] with
         * `licenseKeyActivationMessage.orElse(null)`.
         */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: Optional<String>) =
            licenseKeyActivationMessage(licenseKeyActivationMessage.getOrNull())

        /**
         * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) = apply {
            body.licenseKeyActivationMessage(licenseKeyActivationMessage)
        }

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long?) = apply {
            body.licenseKeyActivationsLimit(licenseKeyActivationsLimit)
        }

        /**
         * Alias for [Builder.licenseKeyActivationsLimit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit as Long?)

        /**
         * Alias for calling [Builder.licenseKeyActivationsLimit] with
         * `licenseKeyActivationsLimit.orElse(null)`.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Optional<Long>) =
            licenseKeyActivationsLimit(licenseKeyActivationsLimit.getOrNull())

        /**
         * Sets [Builder.licenseKeyActivationsLimit] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyActivationsLimit] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Long>) = apply {
            body.licenseKeyActivationsLimit(licenseKeyActivationsLimit)
        }

        fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) = apply {
            body.licenseKeyDuration(licenseKeyDuration)
        }

        /**
         * Alias for calling [Builder.licenseKeyDuration] with `licenseKeyDuration.orElse(null)`.
         */
        fun licenseKeyDuration(licenseKeyDuration: Optional<LicenseKeyDuration>) =
            licenseKeyDuration(licenseKeyDuration.getOrNull())

        /**
         * Sets [Builder.licenseKeyDuration] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyDuration] with a well-typed
         * [LicenseKeyDuration] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun licenseKeyDuration(licenseKeyDuration: JsonField<LicenseKeyDuration>) = apply {
            body.licenseKeyDuration(licenseKeyDuration)
        }

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean?) = apply {
            body.licenseKeyEnabled(licenseKeyEnabled)
        }

        /**
         * Alias for [Builder.licenseKeyEnabled].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
            licenseKeyEnabled(licenseKeyEnabled as Boolean?)

        /** Alias for calling [Builder.licenseKeyEnabled] with `licenseKeyEnabled.orElse(null)`. */
        fun licenseKeyEnabled(licenseKeyEnabled: Optional<Boolean>) =
            licenseKeyEnabled(licenseKeyEnabled.getOrNull())

        /**
         * Sets [Builder.licenseKeyEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.licenseKeyEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
            body.licenseKeyEnabled(licenseKeyEnabled)
        }

        /** Name of the product, optional and must be at most 100 characters. */
        fun name(name: String?) = apply { body.name(name) }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun price(price: Price?) = apply { body.price(price) }

        /** Alias for calling [Builder.price] with `price.orElse(null)`. */
        fun price(price: Optional<Price>) = price(price.getOrNull())

        /**
         * Sets [Builder.price] to an arbitrary JSON value.
         *
         * You should usually call [Builder.price] with a well-typed [Price] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun price(price: JsonField<Price>) = apply { body.price(price) }

        /** Alias for calling [price] with `Price.ofOneTime(oneTime)`. */
        fun price(oneTime: Price.OneTimePrice) = apply { body.price(oneTime) }

        /** Alias for calling [price] with `Price.ofRecurring(recurring)`. */
        fun price(recurring: Price.RecurringPrice) = apply { body.price(recurring) }

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         */
        fun taxCategory(taxCategory: TaxCategory?) = apply { body.taxCategory(taxCategory) }

        /** Alias for calling [Builder.taxCategory] with `taxCategory.orElse(null)`. */
        fun taxCategory(taxCategory: Optional<TaxCategory>) = taxCategory(taxCategory.getOrNull())

        /**
         * Sets [Builder.taxCategory] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxCategory] with a well-typed [TaxCategory] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun taxCategory(taxCategory: JsonField<TaxCategory>) = apply {
            body.taxCategory(taxCategory)
        }

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
         * Returns an immutable instance of [ProductUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductUpdateParams =
            ProductUpdateParams(
                checkRequired("id", id),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val addons: JsonField<List<String>>,
        private val description: JsonField<String>,
        private val imageId: JsonField<String>,
        private val licenseKeyActivationMessage: JsonField<String>,
        private val licenseKeyActivationsLimit: JsonField<Long>,
        private val licenseKeyDuration: JsonField<LicenseKeyDuration>,
        private val licenseKeyEnabled: JsonField<Boolean>,
        private val name: JsonField<String>,
        private val price: JsonField<Price>,
        private val taxCategory: JsonField<TaxCategory>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("addons")
            @ExcludeMissing
            addons: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("image_id") @ExcludeMissing imageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_key_activation_message")
            @ExcludeMissing
            licenseKeyActivationMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("license_key_activations_limit")
            @ExcludeMissing
            licenseKeyActivationsLimit: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("license_key_duration")
            @ExcludeMissing
            licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of(),
            @JsonProperty("license_key_enabled")
            @ExcludeMissing
            licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("price") @ExcludeMissing price: JsonField<Price> = JsonMissing.of(),
            @JsonProperty("tax_category")
            @ExcludeMissing
            taxCategory: JsonField<TaxCategory> = JsonMissing.of(),
        ) : this(
            addons,
            description,
            imageId,
            licenseKeyActivationMessage,
            licenseKeyActivationsLimit,
            licenseKeyDuration,
            licenseKeyEnabled,
            name,
            price,
            taxCategory,
            mutableMapOf(),
        )

        /**
         * Available Addons for subscription products
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun addons(): Optional<List<String>> = addons.getOptional("addons")

        /**
         * Description of the product, optional and must be at most 1000 characters.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Product image id after its uploaded to S3
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun imageId(): Optional<String> = imageId.getOptional("image_id")

        /**
         * Message sent to the customer upon license key activation.
         *
         * Only applicable if `license_key_enabled` is `true`. This message contains instructions
         * for activating the license key.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyActivationMessage(): Optional<String> =
            licenseKeyActivationMessage.getOptional("license_key_activation_message")

        /**
         * Limit for the number of activations for the license key.
         *
         * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
         * times the license key can be activated.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyActivationsLimit(): Optional<Long> =
            licenseKeyActivationsLimit.getOptional("license_key_activations_limit")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyDuration(): Optional<LicenseKeyDuration> =
            licenseKeyDuration.getOptional("license_key_duration")

        /**
         * Whether the product requires a license key.
         *
         * If `true`, additional fields related to license key (duration, activations limit,
         * activation message) become applicable.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun licenseKeyEnabled(): Optional<Boolean> =
            licenseKeyEnabled.getOptional("license_key_enabled")

        /**
         * Name of the product, optional and must be at most 100 characters.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun price(): Optional<Price> = price.getOptional("price")

        /**
         * Represents the different categories of taxation applicable to various products and
         * services.
         *
         * @throws DodoPaymentsInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun taxCategory(): Optional<TaxCategory> = taxCategory.getOptional("tax_category")

        /**
         * Returns the raw JSON value of [addons].
         *
         * Unlike [addons], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("addons") @ExcludeMissing fun _addons(): JsonField<List<String>> = addons

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [imageId].
         *
         * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

        /**
         * Returns the raw JSON value of [licenseKeyActivationMessage].
         *
         * Unlike [licenseKeyActivationMessage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("license_key_activation_message")
        @ExcludeMissing
        fun _licenseKeyActivationMessage(): JsonField<String> = licenseKeyActivationMessage

        /**
         * Returns the raw JSON value of [licenseKeyActivationsLimit].
         *
         * Unlike [licenseKeyActivationsLimit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("license_key_activations_limit")
        @ExcludeMissing
        fun _licenseKeyActivationsLimit(): JsonField<Long> = licenseKeyActivationsLimit

        /**
         * Returns the raw JSON value of [licenseKeyDuration].
         *
         * Unlike [licenseKeyDuration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("license_key_duration")
        @ExcludeMissing
        fun _licenseKeyDuration(): JsonField<LicenseKeyDuration> = licenseKeyDuration

        /**
         * Returns the raw JSON value of [licenseKeyEnabled].
         *
         * Unlike [licenseKeyEnabled], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("license_key_enabled")
        @ExcludeMissing
        fun _licenseKeyEnabled(): JsonField<Boolean> = licenseKeyEnabled

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
        @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Price> = price

        /**
         * Returns the raw JSON value of [taxCategory].
         *
         * Unlike [taxCategory], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_category")
        @ExcludeMissing
        fun _taxCategory(): JsonField<TaxCategory> = taxCategory

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

            private var addons: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var imageId: JsonField<String> = JsonMissing.of()
            private var licenseKeyActivationMessage: JsonField<String> = JsonMissing.of()
            private var licenseKeyActivationsLimit: JsonField<Long> = JsonMissing.of()
            private var licenseKeyDuration: JsonField<LicenseKeyDuration> = JsonMissing.of()
            private var licenseKeyEnabled: JsonField<Boolean> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var price: JsonField<Price> = JsonMissing.of()
            private var taxCategory: JsonField<TaxCategory> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                addons = body.addons.map { it.toMutableList() }
                description = body.description
                imageId = body.imageId
                licenseKeyActivationMessage = body.licenseKeyActivationMessage
                licenseKeyActivationsLimit = body.licenseKeyActivationsLimit
                licenseKeyDuration = body.licenseKeyDuration
                licenseKeyEnabled = body.licenseKeyEnabled
                name = body.name
                price = body.price
                taxCategory = body.taxCategory
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Available Addons for subscription products */
            fun addons(addons: List<String>?) = addons(JsonField.ofNullable(addons))

            /** Alias for calling [Builder.addons] with `addons.orElse(null)`. */
            fun addons(addons: Optional<List<String>>) = addons(addons.getOrNull())

            /**
             * Sets [Builder.addons] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addons] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addons(addons: JsonField<List<String>>) = apply {
                this.addons = addons.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [addons].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAddon(addon: String) = apply {
                addons =
                    (addons ?: JsonField.of(mutableListOf())).also {
                        checkKnown("addons", it).add(addon)
                    }
            }

            /** Description of the product, optional and must be at most 1000 characters. */
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

            /** Product image id after its uploaded to S3 */
            fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

            /** Alias for calling [Builder.imageId] with `imageId.orElse(null)`. */
            fun imageId(imageId: Optional<String>) = imageId(imageId.getOrNull())

            /**
             * Sets [Builder.imageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageId(imageId: JsonField<String>) = apply { this.imageId = imageId }

            /**
             * Message sent to the customer upon license key activation.
             *
             * Only applicable if `license_key_enabled` is `true`. This message contains
             * instructions for activating the license key.
             */
            fun licenseKeyActivationMessage(licenseKeyActivationMessage: String?) =
                licenseKeyActivationMessage(JsonField.ofNullable(licenseKeyActivationMessage))

            /**
             * Alias for calling [Builder.licenseKeyActivationMessage] with
             * `licenseKeyActivationMessage.orElse(null)`.
             */
            fun licenseKeyActivationMessage(licenseKeyActivationMessage: Optional<String>) =
                licenseKeyActivationMessage(licenseKeyActivationMessage.getOrNull())

            /**
             * Sets [Builder.licenseKeyActivationMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyActivationMessage] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun licenseKeyActivationMessage(licenseKeyActivationMessage: JsonField<String>) =
                apply {
                    this.licenseKeyActivationMessage = licenseKeyActivationMessage
                }

            /**
             * Limit for the number of activations for the license key.
             *
             * Only applicable if `license_key_enabled` is `true`. Represents the maximum number of
             * times the license key can be activated.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long?) =
                licenseKeyActivationsLimit(JsonField.ofNullable(licenseKeyActivationsLimit))

            /**
             * Alias for [Builder.licenseKeyActivationsLimit].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Long) =
                licenseKeyActivationsLimit(licenseKeyActivationsLimit as Long?)

            /**
             * Alias for calling [Builder.licenseKeyActivationsLimit] with
             * `licenseKeyActivationsLimit.orElse(null)`.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: Optional<Long>) =
                licenseKeyActivationsLimit(licenseKeyActivationsLimit.getOrNull())

            /**
             * Sets [Builder.licenseKeyActivationsLimit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyActivationsLimit] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun licenseKeyActivationsLimit(licenseKeyActivationsLimit: JsonField<Long>) = apply {
                this.licenseKeyActivationsLimit = licenseKeyActivationsLimit
            }

            fun licenseKeyDuration(licenseKeyDuration: LicenseKeyDuration?) =
                licenseKeyDuration(JsonField.ofNullable(licenseKeyDuration))

            /**
             * Alias for calling [Builder.licenseKeyDuration] with
             * `licenseKeyDuration.orElse(null)`.
             */
            fun licenseKeyDuration(licenseKeyDuration: Optional<LicenseKeyDuration>) =
                licenseKeyDuration(licenseKeyDuration.getOrNull())

            /**
             * Sets [Builder.licenseKeyDuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyDuration] with a well-typed
             * [LicenseKeyDuration] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun licenseKeyDuration(licenseKeyDuration: JsonField<LicenseKeyDuration>) = apply {
                this.licenseKeyDuration = licenseKeyDuration
            }

            /**
             * Whether the product requires a license key.
             *
             * If `true`, additional fields related to license key (duration, activations limit,
             * activation message) become applicable.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: Boolean?) =
                licenseKeyEnabled(JsonField.ofNullable(licenseKeyEnabled))

            /**
             * Alias for [Builder.licenseKeyEnabled].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: Boolean) =
                licenseKeyEnabled(licenseKeyEnabled as Boolean?)

            /**
             * Alias for calling [Builder.licenseKeyEnabled] with `licenseKeyEnabled.orElse(null)`.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: Optional<Boolean>) =
                licenseKeyEnabled(licenseKeyEnabled.getOrNull())

            /**
             * Sets [Builder.licenseKeyEnabled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.licenseKeyEnabled] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun licenseKeyEnabled(licenseKeyEnabled: JsonField<Boolean>) = apply {
                this.licenseKeyEnabled = licenseKeyEnabled
            }

            /** Name of the product, optional and must be at most 100 characters. */
            fun name(name: String?) = name(JsonField.ofNullable(name))

            /** Alias for calling [Builder.name] with `name.orElse(null)`. */
            fun name(name: Optional<String>) = name(name.getOrNull())

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun price(price: Price?) = price(JsonField.ofNullable(price))

            /** Alias for calling [Builder.price] with `price.orElse(null)`. */
            fun price(price: Optional<Price>) = price(price.getOrNull())

            /**
             * Sets [Builder.price] to an arbitrary JSON value.
             *
             * You should usually call [Builder.price] with a well-typed [Price] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun price(price: JsonField<Price>) = apply { this.price = price }

            /** Alias for calling [price] with `Price.ofOneTime(oneTime)`. */
            fun price(oneTime: Price.OneTimePrice) = price(Price.ofOneTime(oneTime))

            /** Alias for calling [price] with `Price.ofRecurring(recurring)`. */
            fun price(recurring: Price.RecurringPrice) = price(Price.ofRecurring(recurring))

            /**
             * Represents the different categories of taxation applicable to various products and
             * services.
             */
            fun taxCategory(taxCategory: TaxCategory?) =
                taxCategory(JsonField.ofNullable(taxCategory))

            /** Alias for calling [Builder.taxCategory] with `taxCategory.orElse(null)`. */
            fun taxCategory(taxCategory: Optional<TaxCategory>) =
                taxCategory(taxCategory.getOrNull())

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
                    (addons ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    imageId,
                    licenseKeyActivationMessage,
                    licenseKeyActivationsLimit,
                    licenseKeyDuration,
                    licenseKeyEnabled,
                    name,
                    price,
                    taxCategory,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            addons()
            description()
            imageId()
            licenseKeyActivationMessage()
            licenseKeyActivationsLimit()
            licenseKeyDuration().ifPresent { it.validate() }
            licenseKeyEnabled()
            name()
            price().ifPresent { it.validate() }
            taxCategory().ifPresent { it.validate() }
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
            (addons.asKnown().getOrNull()?.size ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (imageId.asKnown().isPresent) 1 else 0) +
                (if (licenseKeyActivationMessage.asKnown().isPresent) 1 else 0) +
                (if (licenseKeyActivationsLimit.asKnown().isPresent) 1 else 0) +
                (licenseKeyDuration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (licenseKeyEnabled.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (price.asKnown().getOrNull()?.validity() ?: 0) +
                (taxCategory.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && addons == other.addons && description == other.description && imageId == other.imageId && licenseKeyActivationMessage == other.licenseKeyActivationMessage && licenseKeyActivationsLimit == other.licenseKeyActivationsLimit && licenseKeyDuration == other.licenseKeyDuration && licenseKeyEnabled == other.licenseKeyEnabled && name == other.name && price == other.price && taxCategory == other.taxCategory && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addons, description, imageId, licenseKeyActivationMessage, licenseKeyActivationsLimit, licenseKeyDuration, licenseKeyEnabled, name, price, taxCategory, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{addons=$addons, description=$description, imageId=$imageId, licenseKeyActivationMessage=$licenseKeyActivationMessage, licenseKeyActivationsLimit=$licenseKeyActivationsLimit, licenseKeyDuration=$licenseKeyDuration, licenseKeyEnabled=$licenseKeyEnabled, name=$name, price=$price, taxCategory=$taxCategory, additionalProperties=$additionalProperties}"
    }

    /**
     * Represents the different categories of taxation applicable to various products and services.
     */
    class TaxCategory @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val DIGITAL_PRODUCTS = of("digital_products")

            @JvmField val SAAS = of("saas")

            @JvmField val E_BOOK = of("e_book")

            @JvmField val EDTECH = of("edtech")

            @JvmStatic fun of(value: String) = TaxCategory(JsonField.of(value))
        }

        /** An enum containing [TaxCategory]'s known values. */
        enum class Known {
            DIGITAL_PRODUCTS,
            SAAS,
            E_BOOK,
            EDTECH,
        }

        /**
         * An enum containing [TaxCategory]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TaxCategory] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DIGITAL_PRODUCTS,
            SAAS,
            E_BOOK,
            EDTECH,
            /**
             * An enum member indicating that [TaxCategory] was instantiated with an unknown value.
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
                DIGITAL_PRODUCTS -> Value.DIGITAL_PRODUCTS
                SAAS -> Value.SAAS
                E_BOOK -> Value.E_BOOK
                EDTECH -> Value.EDTECH
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
                DIGITAL_PRODUCTS -> Known.DIGITAL_PRODUCTS
                SAAS -> Known.SAAS
                E_BOOK -> Known.E_BOOK
                EDTECH -> Known.EDTECH
                else -> throw DodoPaymentsInvalidDataException("Unknown TaxCategory: $value")
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

        fun validate(): TaxCategory = apply {
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

            return /* spotless:off */ other is TaxCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProductUpdateParams && id == other.id && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(id, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ProductUpdateParams{id=$id, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
