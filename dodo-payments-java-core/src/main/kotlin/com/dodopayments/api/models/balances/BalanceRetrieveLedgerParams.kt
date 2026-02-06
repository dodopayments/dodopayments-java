// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.balances

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.core.Params
import com.dodopayments.api.core.http.Headers
import com.dodopayments.api.core.http.QueryParams
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class BalanceRetrieveLedgerParams
private constructor(
    private val createdAtGte: OffsetDateTime?,
    private val createdAtLte: OffsetDateTime?,
    private val currency: Currency?,
    private val eventType: EventType?,
    private val limit: Long?,
    private val pageNumber: Int?,
    private val pageSize: Int?,
    private val referenceObjectId: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Get events after this created time */
    fun createdAtGte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtGte)

    /** Get events created before this time */
    fun createdAtLte(): Optional<OffsetDateTime> = Optional.ofNullable(createdAtLte)

    /** Filter by currency */
    fun currency(): Optional<Currency> = Optional.ofNullable(currency)

    /** Filter by Ledger Event Type */
    fun eventType(): Optional<EventType> = Optional.ofNullable(eventType)

    /** Min : 1, Max : 100, default 10 */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Page number default is 0 */
    fun pageNumber(): Optional<Int> = Optional.ofNullable(pageNumber)

    /** Page size default is 10 max is 100 */
    fun pageSize(): Optional<Int> = Optional.ofNullable(pageSize)

    /** Get events history of a specific object like payment/subscription/refund/dispute */
    fun referenceObjectId(): Optional<String> = Optional.ofNullable(referenceObjectId)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): BalanceRetrieveLedgerParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [BalanceRetrieveLedgerParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [BalanceRetrieveLedgerParams]. */
    class Builder internal constructor() {

        private var createdAtGte: OffsetDateTime? = null
        private var createdAtLte: OffsetDateTime? = null
        private var currency: Currency? = null
        private var eventType: EventType? = null
        private var limit: Long? = null
        private var pageNumber: Int? = null
        private var pageSize: Int? = null
        private var referenceObjectId: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(balanceRetrieveLedgerParams: BalanceRetrieveLedgerParams) = apply {
            createdAtGte = balanceRetrieveLedgerParams.createdAtGte
            createdAtLte = balanceRetrieveLedgerParams.createdAtLte
            currency = balanceRetrieveLedgerParams.currency
            eventType = balanceRetrieveLedgerParams.eventType
            limit = balanceRetrieveLedgerParams.limit
            pageNumber = balanceRetrieveLedgerParams.pageNumber
            pageSize = balanceRetrieveLedgerParams.pageSize
            referenceObjectId = balanceRetrieveLedgerParams.referenceObjectId
            additionalHeaders = balanceRetrieveLedgerParams.additionalHeaders.toBuilder()
            additionalQueryParams = balanceRetrieveLedgerParams.additionalQueryParams.toBuilder()
        }

        /** Get events after this created time */
        fun createdAtGte(createdAtGte: OffsetDateTime?) = apply { this.createdAtGte = createdAtGte }

        /** Alias for calling [Builder.createdAtGte] with `createdAtGte.orElse(null)`. */
        fun createdAtGte(createdAtGte: Optional<OffsetDateTime>) =
            createdAtGte(createdAtGte.getOrNull())

        /** Get events created before this time */
        fun createdAtLte(createdAtLte: OffsetDateTime?) = apply { this.createdAtLte = createdAtLte }

        /** Alias for calling [Builder.createdAtLte] with `createdAtLte.orElse(null)`. */
        fun createdAtLte(createdAtLte: Optional<OffsetDateTime>) =
            createdAtLte(createdAtLte.getOrNull())

        /** Filter by currency */
        fun currency(currency: Currency?) = apply { this.currency = currency }

        /** Alias for calling [Builder.currency] with `currency.orElse(null)`. */
        fun currency(currency: Optional<Currency>) = currency(currency.getOrNull())

        /** Filter by Ledger Event Type */
        fun eventType(eventType: EventType?) = apply { this.eventType = eventType }

        /** Alias for calling [Builder.eventType] with `eventType.orElse(null)`. */
        fun eventType(eventType: Optional<EventType>) = eventType(eventType.getOrNull())

        /** Min : 1, Max : 100, default 10 */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Page number default is 0 */
        fun pageNumber(pageNumber: Int?) = apply { this.pageNumber = pageNumber }

        /**
         * Alias for [Builder.pageNumber].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageNumber(pageNumber: Int) = pageNumber(pageNumber as Int?)

        /** Alias for calling [Builder.pageNumber] with `pageNumber.orElse(null)`. */
        fun pageNumber(pageNumber: Optional<Int>) = pageNumber(pageNumber.getOrNull())

        /** Page size default is 10 max is 100 */
        fun pageSize(pageSize: Int?) = apply { this.pageSize = pageSize }

        /**
         * Alias for [Builder.pageSize].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun pageSize(pageSize: Int) = pageSize(pageSize as Int?)

        /** Alias for calling [Builder.pageSize] with `pageSize.orElse(null)`. */
        fun pageSize(pageSize: Optional<Int>) = pageSize(pageSize.getOrNull())

        /** Get events history of a specific object like payment/subscription/refund/dispute */
        fun referenceObjectId(referenceObjectId: String?) = apply {
            this.referenceObjectId = referenceObjectId
        }

        /** Alias for calling [Builder.referenceObjectId] with `referenceObjectId.orElse(null)`. */
        fun referenceObjectId(referenceObjectId: Optional<String>) =
            referenceObjectId(referenceObjectId.getOrNull())

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
         * Returns an immutable instance of [BalanceRetrieveLedgerParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BalanceRetrieveLedgerParams =
            BalanceRetrieveLedgerParams(
                createdAtGte,
                createdAtLte,
                currency,
                eventType,
                limit,
                pageNumber,
                pageSize,
                referenceObjectId,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                createdAtGte?.let {
                    put("created_at_gte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                createdAtLte?.let {
                    put("created_at_lte", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                currency?.let { put("currency", it.toString()) }
                eventType?.let { put("event_type", it.toString()) }
                limit?.let { put("limit", it.toString()) }
                pageNumber?.let { put("page_number", it.toString()) }
                pageSize?.let { put("page_size", it.toString()) }
                referenceObjectId?.let { put("reference_object_id", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Filter by currency */
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

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Filter by Ledger Event Type */
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

            @JvmField val REFUND = of("refund")

            @JvmField val REFUND_REVERSAL = of("refund_reversal")

            @JvmField val DISPUTE = of("dispute")

            @JvmField val DISPUTE_REVERSAL = of("dispute_reversal")

            @JvmField val TAX = of("tax")

            @JvmField val TAX_REVERSAL = of("tax_reversal")

            @JvmField val PAYMENT_FEES = of("payment_fees")

            @JvmField val REFUND_FEES = of("refund_fees")

            @JvmField val REFUND_FEES_REVERSAL = of("refund_fees_reversal")

            @JvmField val DISPUTE_FEES = of("dispute_fees")

            @JvmField val PAYOUT = of("payout")

            @JvmField val PAYOUT_FEES = of("payout_fees")

            @JvmField val PAYOUT_REVERSAL = of("payout_reversal")

            @JvmField val PAYOUT_FEES_REVERSAL = of("payout_fees_reversal")

            @JvmField val DODO_CREDITS = of("dodo_credits")

            @JvmField val ADJUSTMENT = of("adjustment")

            @JvmField val CURRENCY_CONVERSION = of("currency_conversion")

            @JvmStatic fun of(value: String) = EventType(JsonField.of(value))
        }

        /** An enum containing [EventType]'s known values. */
        enum class Known {
            PAYMENT,
            REFUND,
            REFUND_REVERSAL,
            DISPUTE,
            DISPUTE_REVERSAL,
            TAX,
            TAX_REVERSAL,
            PAYMENT_FEES,
            REFUND_FEES,
            REFUND_FEES_REVERSAL,
            DISPUTE_FEES,
            PAYOUT,
            PAYOUT_FEES,
            PAYOUT_REVERSAL,
            PAYOUT_FEES_REVERSAL,
            DODO_CREDITS,
            ADJUSTMENT,
            CURRENCY_CONVERSION,
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
            REFUND,
            REFUND_REVERSAL,
            DISPUTE,
            DISPUTE_REVERSAL,
            TAX,
            TAX_REVERSAL,
            PAYMENT_FEES,
            REFUND_FEES,
            REFUND_FEES_REVERSAL,
            DISPUTE_FEES,
            PAYOUT,
            PAYOUT_FEES,
            PAYOUT_REVERSAL,
            PAYOUT_FEES_REVERSAL,
            DODO_CREDITS,
            ADJUSTMENT,
            CURRENCY_CONVERSION,
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
                REFUND -> Value.REFUND
                REFUND_REVERSAL -> Value.REFUND_REVERSAL
                DISPUTE -> Value.DISPUTE
                DISPUTE_REVERSAL -> Value.DISPUTE_REVERSAL
                TAX -> Value.TAX
                TAX_REVERSAL -> Value.TAX_REVERSAL
                PAYMENT_FEES -> Value.PAYMENT_FEES
                REFUND_FEES -> Value.REFUND_FEES
                REFUND_FEES_REVERSAL -> Value.REFUND_FEES_REVERSAL
                DISPUTE_FEES -> Value.DISPUTE_FEES
                PAYOUT -> Value.PAYOUT
                PAYOUT_FEES -> Value.PAYOUT_FEES
                PAYOUT_REVERSAL -> Value.PAYOUT_REVERSAL
                PAYOUT_FEES_REVERSAL -> Value.PAYOUT_FEES_REVERSAL
                DODO_CREDITS -> Value.DODO_CREDITS
                ADJUSTMENT -> Value.ADJUSTMENT
                CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
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
                REFUND -> Known.REFUND
                REFUND_REVERSAL -> Known.REFUND_REVERSAL
                DISPUTE -> Known.DISPUTE
                DISPUTE_REVERSAL -> Known.DISPUTE_REVERSAL
                TAX -> Known.TAX
                TAX_REVERSAL -> Known.TAX_REVERSAL
                PAYMENT_FEES -> Known.PAYMENT_FEES
                REFUND_FEES -> Known.REFUND_FEES
                REFUND_FEES_REVERSAL -> Known.REFUND_FEES_REVERSAL
                DISPUTE_FEES -> Known.DISPUTE_FEES
                PAYOUT -> Known.PAYOUT
                PAYOUT_FEES -> Known.PAYOUT_FEES
                PAYOUT_REVERSAL -> Known.PAYOUT_REVERSAL
                PAYOUT_FEES_REVERSAL -> Known.PAYOUT_FEES_REVERSAL
                DODO_CREDITS -> Known.DODO_CREDITS
                ADJUSTMENT -> Known.ADJUSTMENT
                CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
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

        return other is BalanceRetrieveLedgerParams &&
            createdAtGte == other.createdAtGte &&
            createdAtLte == other.createdAtLte &&
            currency == other.currency &&
            eventType == other.eventType &&
            limit == other.limit &&
            pageNumber == other.pageNumber &&
            pageSize == other.pageSize &&
            referenceObjectId == other.referenceObjectId &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            createdAtGte,
            createdAtLte,
            currency,
            eventType,
            limit,
            pageNumber,
            pageSize,
            referenceObjectId,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "BalanceRetrieveLedgerParams{createdAtGte=$createdAtGte, createdAtLte=$createdAtLte, currency=$currency, eventType=$eventType, limit=$limit, pageNumber=$pageNumber, pageSize=$pageSize, referenceObjectId=$referenceObjectId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
