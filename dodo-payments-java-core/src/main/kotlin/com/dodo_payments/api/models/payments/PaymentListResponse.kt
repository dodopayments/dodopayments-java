// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.ExcludeMissing
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.core.JsonMissing
import com.dodo_payments.api.core.JsonValue
import com.dodo_payments.api.core.NoAutoDetect
import com.dodo_payments.api.core.checkRequired
import com.dodo_payments.api.core.immutableEmptyMap
import com.dodo_payments.api.core.toImmutable
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@NoAutoDetect
class PaymentListResponse
@JsonCreator
private constructor(
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("customer")
    @ExcludeMissing
    private val customer: JsonField<Customer> = JsonMissing.of(),
    @JsonProperty("metadata")
    @ExcludeMissing
    private val metadata: JsonField<Metadata> = JsonMissing.of(),
    @JsonProperty("payment_id")
    @ExcludeMissing
    private val paymentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total_amount")
    @ExcludeMissing
    private val totalAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("payment_method")
    @ExcludeMissing
    private val paymentMethod: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payment_method_type")
    @ExcludeMissing
    private val paymentMethodType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("subscription_id")
    @ExcludeMissing
    private val subscriptionId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    fun currency(): Currency = currency.getRequired("currency")

    fun customer(): Customer = customer.getRequired("customer")

    fun metadata(): Metadata = metadata.getRequired("metadata")

    fun paymentId(): String = paymentId.getRequired("payment_id")

    fun totalAmount(): Long = totalAmount.getRequired("total_amount")

    fun paymentMethod(): Optional<String> =
        Optional.ofNullable(paymentMethod.getNullable("payment_method"))

    fun paymentMethodType(): Optional<String> =
        Optional.ofNullable(paymentMethodType.getNullable("payment_method_type"))

    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    fun subscriptionId(): Optional<String> =
        Optional.ofNullable(subscriptionId.getNullable("subscription_id"))

    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    @JsonProperty("customer") @ExcludeMissing fun _customer(): JsonField<Customer> = customer

    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    @JsonProperty("payment_id") @ExcludeMissing fun _paymentId(): JsonField<String> = paymentId

    @JsonProperty("total_amount") @ExcludeMissing fun _totalAmount(): JsonField<Long> = totalAmount

    @JsonProperty("payment_method")
    @ExcludeMissing
    fun _paymentMethod(): JsonField<String> = paymentMethod

    @JsonProperty("payment_method_type")
    @ExcludeMissing
    fun _paymentMethodType(): JsonField<String> = paymentMethodType

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("subscription_id")
    @ExcludeMissing
    fun _subscriptionId(): JsonField<String> = subscriptionId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PaymentListResponse = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        currency()
        customer().validate()
        metadata().validate()
        paymentId()
        totalAmount()
        paymentMethod()
        paymentMethodType()
        status()
        subscriptionId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentListResponse].
         *
         * The following fields are required:
         * ```java
         * .createdAt()
         * .currency()
         * .customer()
         * .metadata()
         * .paymentId()
         * .totalAmount()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PaymentListResponse]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var customer: JsonField<Customer>? = null
        private var metadata: JsonField<Metadata>? = null
        private var paymentId: JsonField<String>? = null
        private var totalAmount: JsonField<Long>? = null
        private var paymentMethod: JsonField<String> = JsonMissing.of()
        private var paymentMethodType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var subscriptionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentListResponse: PaymentListResponse) = apply {
            createdAt = paymentListResponse.createdAt
            currency = paymentListResponse.currency
            customer = paymentListResponse.customer
            metadata = paymentListResponse.metadata
            paymentId = paymentListResponse.paymentId
            totalAmount = paymentListResponse.totalAmount
            paymentMethod = paymentListResponse.paymentMethod
            paymentMethodType = paymentListResponse.paymentMethodType
            status = paymentListResponse.status
            subscriptionId = paymentListResponse.subscriptionId
            additionalProperties = paymentListResponse.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun customer(customer: Customer) = customer(JsonField.of(customer))

        fun customer(customer: JsonField<Customer>) = apply { this.customer = customer }

        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun paymentId(paymentId: String) = paymentId(JsonField.of(paymentId))

        fun paymentId(paymentId: JsonField<String>) = apply { this.paymentId = paymentId }

        fun totalAmount(totalAmount: Long) = totalAmount(JsonField.of(totalAmount))

        fun totalAmount(totalAmount: JsonField<Long>) = apply { this.totalAmount = totalAmount }

        fun paymentMethod(paymentMethod: String?) =
            paymentMethod(JsonField.ofNullable(paymentMethod))

        fun paymentMethod(paymentMethod: Optional<String>) =
            paymentMethod(paymentMethod.getOrNull())

        fun paymentMethod(paymentMethod: JsonField<String>) = apply {
            this.paymentMethod = paymentMethod
        }

        fun paymentMethodType(paymentMethodType: String?) =
            paymentMethodType(JsonField.ofNullable(paymentMethodType))

        fun paymentMethodType(paymentMethodType: Optional<String>) =
            paymentMethodType(paymentMethodType.getOrNull())

        fun paymentMethodType(paymentMethodType: JsonField<String>) = apply {
            this.paymentMethodType = paymentMethodType
        }

        fun status(status: Status?) = status(JsonField.ofNullable(status))

        fun status(status: Optional<Status>) = status(status.getOrNull())

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun subscriptionId(subscriptionId: String?) =
            subscriptionId(JsonField.ofNullable(subscriptionId))

        fun subscriptionId(subscriptionId: Optional<String>) =
            subscriptionId(subscriptionId.getOrNull())

        fun subscriptionId(subscriptionId: JsonField<String>) = apply {
            this.subscriptionId = subscriptionId
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

        fun build(): PaymentListResponse =
            PaymentListResponse(
                checkRequired("createdAt", createdAt),
                checkRequired("currency", currency),
                checkRequired("customer", customer),
                checkRequired("metadata", metadata),
                checkRequired("paymentId", paymentId),
                checkRequired("totalAmount", totalAmount),
                paymentMethod,
                paymentMethodType,
                status,
                subscriptionId,
                additionalProperties.toImmutable(),
            )
    }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Customer
    @JsonCreator
    private constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique identifier for the customer */
        fun customerId(): String = customerId.getRequired("customer_id")

        /** Email address of the customer */
        fun email(): String = email.getRequired("email")

        /** Full name of the customer */
        fun name(): String = name.getRequired("name")

        /** Unique identifier for the customer */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** Email address of the customer */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /** Full name of the customer */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Customer = apply {
            if (validated) {
                return@apply
            }

            customerId()
            email()
            name()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Customer].
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .email()
             * .name()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Customer]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var email: JsonField<String>? = null
            private var name: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customer: Customer) = apply {
                customerId = customer.customerId
                email = customer.email
                name = customer.name
                additionalProperties = customer.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the customer */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** Unique identifier for the customer */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** Email address of the customer */
            fun email(email: String) = email(JsonField.of(email))

            /** Email address of the customer */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** Full name of the customer */
            fun name(name: String) = name(JsonField.of(name))

            /** Full name of the customer */
            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Customer =
                Customer(
                    checkRequired("customerId", customerId),
                    checkRequired("email", email),
                    checkRequired("name", name),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Customer && customerId == other.customerId && email == other.email && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, email, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Customer{customerId=$customerId, email=$email, name=$name, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

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

            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

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

            @JvmField val SUCCEEDED = of("succeeded")

            @JvmField val FAILED = of("failed")

            @JvmField val CANCELLED = of("cancelled")

            @JvmField val PROCESSING = of("processing")

            @JvmField val REQUIRES_CUSTOMER_ACTION = of("requires_customer_action")

            @JvmField val REQUIRES_MERCHANT_ACTION = of("requires_merchant_action")

            @JvmField val REQUIRES_PAYMENT_METHOD = of("requires_payment_method")

            @JvmField val REQUIRES_CONFIRMATION = of("requires_confirmation")

            @JvmField val REQUIRES_CAPTURE = of("requires_capture")

            @JvmField val PARTIALLY_CAPTURED = of("partially_captured")

            @JvmField
            val PARTIALLY_CAPTURED_AND_CAPTURABLE = of("partially_captured_and_capturable")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SUCCEEDED,
            FAILED,
            CANCELLED,
            PROCESSING,
            REQUIRES_CUSTOMER_ACTION,
            REQUIRES_MERCHANT_ACTION,
            REQUIRES_PAYMENT_METHOD,
            REQUIRES_CONFIRMATION,
            REQUIRES_CAPTURE,
            PARTIALLY_CAPTURED,
            PARTIALLY_CAPTURED_AND_CAPTURABLE,
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
            SUCCEEDED,
            FAILED,
            CANCELLED,
            PROCESSING,
            REQUIRES_CUSTOMER_ACTION,
            REQUIRES_MERCHANT_ACTION,
            REQUIRES_PAYMENT_METHOD,
            REQUIRES_CONFIRMATION,
            REQUIRES_CAPTURE,
            PARTIALLY_CAPTURED,
            PARTIALLY_CAPTURED_AND_CAPTURABLE,
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
                SUCCEEDED -> Value.SUCCEEDED
                FAILED -> Value.FAILED
                CANCELLED -> Value.CANCELLED
                PROCESSING -> Value.PROCESSING
                REQUIRES_CUSTOMER_ACTION -> Value.REQUIRES_CUSTOMER_ACTION
                REQUIRES_MERCHANT_ACTION -> Value.REQUIRES_MERCHANT_ACTION
                REQUIRES_PAYMENT_METHOD -> Value.REQUIRES_PAYMENT_METHOD
                REQUIRES_CONFIRMATION -> Value.REQUIRES_CONFIRMATION
                REQUIRES_CAPTURE -> Value.REQUIRES_CAPTURE
                PARTIALLY_CAPTURED -> Value.PARTIALLY_CAPTURED
                PARTIALLY_CAPTURED_AND_CAPTURABLE -> Value.PARTIALLY_CAPTURED_AND_CAPTURABLE
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
                SUCCEEDED -> Known.SUCCEEDED
                FAILED -> Known.FAILED
                CANCELLED -> Known.CANCELLED
                PROCESSING -> Known.PROCESSING
                REQUIRES_CUSTOMER_ACTION -> Known.REQUIRES_CUSTOMER_ACTION
                REQUIRES_MERCHANT_ACTION -> Known.REQUIRES_MERCHANT_ACTION
                REQUIRES_PAYMENT_METHOD -> Known.REQUIRES_PAYMENT_METHOD
                REQUIRES_CONFIRMATION -> Known.REQUIRES_CONFIRMATION
                REQUIRES_CAPTURE -> Known.REQUIRES_CAPTURE
                PARTIALLY_CAPTURED -> Known.PARTIALLY_CAPTURED
                PARTIALLY_CAPTURED_AND_CAPTURABLE -> Known.PARTIALLY_CAPTURED_AND_CAPTURABLE
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentListResponse && createdAt == other.createdAt && currency == other.currency && customer == other.customer && metadata == other.metadata && paymentId == other.paymentId && totalAmount == other.totalAmount && paymentMethod == other.paymentMethod && paymentMethodType == other.paymentMethodType && status == other.status && subscriptionId == other.subscriptionId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(createdAt, currency, customer, metadata, paymentId, totalAmount, paymentMethod, paymentMethodType, status, subscriptionId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentListResponse{createdAt=$createdAt, currency=$currency, customer=$customer, metadata=$metadata, paymentId=$paymentId, totalAmount=$totalAmount, paymentMethod=$paymentMethod, paymentMethodType=$paymentMethodType, status=$status, subscriptionId=$subscriptionId, additionalProperties=$additionalProperties}"
}
