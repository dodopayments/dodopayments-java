// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.ExcludeMissing
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.JsonMissing
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.Params
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
         * - [disableOnDemand]
         * - [metadata]
         * - [nextBillingDate]
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
            "Body{billing=$billing, cancelAtNextBillingDate=$cancelAtNextBillingDate, disableOnDemand=$disableOnDemand, metadata=$metadata, nextBillingDate=$nextBillingDate, status=$status, taxId=$taxId, additionalProperties=$additionalProperties}"
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
