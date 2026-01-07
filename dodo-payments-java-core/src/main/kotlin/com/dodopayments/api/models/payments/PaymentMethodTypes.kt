// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.Enum
import com.dodopayments.api.core.JsonField
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

class PaymentMethodTypes @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val ACH = of("ach")

        @JvmField val AFFIRM = of("affirm")

        @JvmField val AFTERPAY_CLEARPAY = of("afterpay_clearpay")

        @JvmField val ALFAMART = of("alfamart")

        @JvmField val ALI_PAY = of("ali_pay")

        @JvmField val ALI_PAY_HK = of("ali_pay_hk")

        @JvmField val ALMA = of("alma")

        @JvmField val AMAZON_PAY = of("amazon_pay")

        @JvmField val APPLE_PAY = of("apple_pay")

        @JvmField val ATOME = of("atome")

        @JvmField val BACS = of("bacs")

        @JvmField val BANCONTACT_CARD = of("bancontact_card")

        @JvmField val BECS = of("becs")

        @JvmField val BENEFIT = of("benefit")

        @JvmField val BIZUM = of("bizum")

        @JvmField val BLIK = of("blik")

        @JvmField val BOLETO = of("boleto")

        @JvmField val BCA_BANK_TRANSFER = of("bca_bank_transfer")

        @JvmField val BNI_VA = of("bni_va")

        @JvmField val BRI_VA = of("bri_va")

        @JvmField val CARD_REDIRECT = of("card_redirect")

        @JvmField val CIMB_VA = of("cimb_va")

        @JvmField val CLASSIC = of("classic")

        @JvmField val CREDIT = of("credit")

        @JvmField val CRYPTO_CURRENCY = of("crypto_currency")

        @JvmField val CASHAPP = of("cashapp")

        @JvmField val DANA = of("dana")

        @JvmField val DANAMON_VA = of("danamon_va")

        @JvmField val DEBIT = of("debit")

        @JvmField val DUIT_NOW = of("duit_now")

        @JvmField val EFECTY = of("efecty")

        @JvmField val EFT = of("eft")

        @JvmField val EPS = of("eps")

        @JvmField val FPS = of("fps")

        @JvmField val EVOUCHER = of("evoucher")

        @JvmField val GIROPAY = of("giropay")

        @JvmField val GIVEX = of("givex")

        @JvmField val GOOGLE_PAY = of("google_pay")

        @JvmField val GO_PAY = of("go_pay")

        @JvmField val GCASH = of("gcash")

        @JvmField val IDEAL = of("ideal")

        @JvmField val INTERAC = of("interac")

        @JvmField val INDOMARET = of("indomaret")

        @JvmField val KLARNA = of("klarna")

        @JvmField val KAKAO_PAY = of("kakao_pay")

        @JvmField val LOCAL_BANK_REDIRECT = of("local_bank_redirect")

        @JvmField val MANDIRI_VA = of("mandiri_va")

        @JvmField val KNET = of("knet")

        @JvmField val MB_WAY = of("mb_way")

        @JvmField val MOBILE_PAY = of("mobile_pay")

        @JvmField val MOMO = of("momo")

        @JvmField val MOMO_ATM = of("momo_atm")

        @JvmField val MULTIBANCO = of("multibanco")

        @JvmField val ONLINE_BANKING_THAILAND = of("online_banking_thailand")

        @JvmField val ONLINE_BANKING_CZECH_REPUBLIC = of("online_banking_czech_republic")

        @JvmField val ONLINE_BANKING_FINLAND = of("online_banking_finland")

        @JvmField val ONLINE_BANKING_FPX = of("online_banking_fpx")

        @JvmField val ONLINE_BANKING_POLAND = of("online_banking_poland")

        @JvmField val ONLINE_BANKING_SLOVAKIA = of("online_banking_slovakia")

        @JvmField val OXXO = of("oxxo")

        @JvmField val PAGO_EFECTIVO = of("pago_efectivo")

        @JvmField val PERMATA_BANK_TRANSFER = of("permata_bank_transfer")

        @JvmField val OPEN_BANKING_UK = of("open_banking_uk")

        @JvmField val PAY_BRIGHT = of("pay_bright")

        @JvmField val PAYPAL = of("paypal")

        @JvmField val PAZE = of("paze")

        @JvmField val PIX = of("pix")

        @JvmField val PAY_SAFE_CARD = of("pay_safe_card")

        @JvmField val PRZELEWY24 = of("przelewy24")

        @JvmField val PROMPT_PAY = of("prompt_pay")

        @JvmField val PSE = of("pse")

        @JvmField val RED_COMPRA = of("red_compra")

        @JvmField val RED_PAGOS = of("red_pagos")

        @JvmField val SAMSUNG_PAY = of("samsung_pay")

        @JvmField val SEPA = of("sepa")

        @JvmField val SEPA_BANK_TRANSFER = of("sepa_bank_transfer")

        @JvmField val SOFORT = of("sofort")

        @JvmField val SWISH = of("swish")

        @JvmField val TOUCH_N_GO = of("touch_n_go")

        @JvmField val TRUSTLY = of("trustly")

        @JvmField val TWINT = of("twint")

        @JvmField val UPI_COLLECT = of("upi_collect")

        @JvmField val UPI_INTENT = of("upi_intent")

        @JvmField val VIPPS = of("vipps")

        @JvmField val VIET_QR = of("viet_qr")

        @JvmField val VENMO = of("venmo")

        @JvmField val WALLEY = of("walley")

        @JvmField val WE_CHAT_PAY = of("we_chat_pay")

        @JvmField val SEVEN_ELEVEN = of("seven_eleven")

        @JvmField val LAWSON = of("lawson")

        @JvmField val MINI_STOP = of("mini_stop")

        @JvmField val FAMILY_MART = of("family_mart")

        @JvmField val SEICOMART = of("seicomart")

        @JvmField val PAY_EASY = of("pay_easy")

        @JvmField val LOCAL_BANK_TRANSFER = of("local_bank_transfer")

        @JvmField val MIFINITY = of("mifinity")

        @JvmField val OPEN_BANKING_PIS = of("open_banking_pis")

        @JvmField val DIRECT_CARRIER_BILLING = of("direct_carrier_billing")

        @JvmField val INSTANT_BANK_TRANSFER = of("instant_bank_transfer")

        @JvmField val BILLIE = of("billie")

        @JvmField val ZIP = of("zip")

        @JvmField val REVOLUT_PAY = of("revolut_pay")

        @JvmField val NAVER_PAY = of("naver_pay")

        @JvmField val PAYCO = of("payco")

        @JvmStatic fun of(value: String) = PaymentMethodTypes(JsonField.of(value))
    }

    /** An enum containing [PaymentMethodTypes]'s known values. */
    enum class Known {
        ACH,
        AFFIRM,
        AFTERPAY_CLEARPAY,
        ALFAMART,
        ALI_PAY,
        ALI_PAY_HK,
        ALMA,
        AMAZON_PAY,
        APPLE_PAY,
        ATOME,
        BACS,
        BANCONTACT_CARD,
        BECS,
        BENEFIT,
        BIZUM,
        BLIK,
        BOLETO,
        BCA_BANK_TRANSFER,
        BNI_VA,
        BRI_VA,
        CARD_REDIRECT,
        CIMB_VA,
        CLASSIC,
        CREDIT,
        CRYPTO_CURRENCY,
        CASHAPP,
        DANA,
        DANAMON_VA,
        DEBIT,
        DUIT_NOW,
        EFECTY,
        EFT,
        EPS,
        FPS,
        EVOUCHER,
        GIROPAY,
        GIVEX,
        GOOGLE_PAY,
        GO_PAY,
        GCASH,
        IDEAL,
        INTERAC,
        INDOMARET,
        KLARNA,
        KAKAO_PAY,
        LOCAL_BANK_REDIRECT,
        MANDIRI_VA,
        KNET,
        MB_WAY,
        MOBILE_PAY,
        MOMO,
        MOMO_ATM,
        MULTIBANCO,
        ONLINE_BANKING_THAILAND,
        ONLINE_BANKING_CZECH_REPUBLIC,
        ONLINE_BANKING_FINLAND,
        ONLINE_BANKING_FPX,
        ONLINE_BANKING_POLAND,
        ONLINE_BANKING_SLOVAKIA,
        OXXO,
        PAGO_EFECTIVO,
        PERMATA_BANK_TRANSFER,
        OPEN_BANKING_UK,
        PAY_BRIGHT,
        PAYPAL,
        PAZE,
        PIX,
        PAY_SAFE_CARD,
        PRZELEWY24,
        PROMPT_PAY,
        PSE,
        RED_COMPRA,
        RED_PAGOS,
        SAMSUNG_PAY,
        SEPA,
        SEPA_BANK_TRANSFER,
        SOFORT,
        SWISH,
        TOUCH_N_GO,
        TRUSTLY,
        TWINT,
        UPI_COLLECT,
        UPI_INTENT,
        VIPPS,
        VIET_QR,
        VENMO,
        WALLEY,
        WE_CHAT_PAY,
        SEVEN_ELEVEN,
        LAWSON,
        MINI_STOP,
        FAMILY_MART,
        SEICOMART,
        PAY_EASY,
        LOCAL_BANK_TRANSFER,
        MIFINITY,
        OPEN_BANKING_PIS,
        DIRECT_CARRIER_BILLING,
        INSTANT_BANK_TRANSFER,
        BILLIE,
        ZIP,
        REVOLUT_PAY,
        NAVER_PAY,
        PAYCO,
    }

    /**
     * An enum containing [PaymentMethodTypes]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [PaymentMethodTypes] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        ACH,
        AFFIRM,
        AFTERPAY_CLEARPAY,
        ALFAMART,
        ALI_PAY,
        ALI_PAY_HK,
        ALMA,
        AMAZON_PAY,
        APPLE_PAY,
        ATOME,
        BACS,
        BANCONTACT_CARD,
        BECS,
        BENEFIT,
        BIZUM,
        BLIK,
        BOLETO,
        BCA_BANK_TRANSFER,
        BNI_VA,
        BRI_VA,
        CARD_REDIRECT,
        CIMB_VA,
        CLASSIC,
        CREDIT,
        CRYPTO_CURRENCY,
        CASHAPP,
        DANA,
        DANAMON_VA,
        DEBIT,
        DUIT_NOW,
        EFECTY,
        EFT,
        EPS,
        FPS,
        EVOUCHER,
        GIROPAY,
        GIVEX,
        GOOGLE_PAY,
        GO_PAY,
        GCASH,
        IDEAL,
        INTERAC,
        INDOMARET,
        KLARNA,
        KAKAO_PAY,
        LOCAL_BANK_REDIRECT,
        MANDIRI_VA,
        KNET,
        MB_WAY,
        MOBILE_PAY,
        MOMO,
        MOMO_ATM,
        MULTIBANCO,
        ONLINE_BANKING_THAILAND,
        ONLINE_BANKING_CZECH_REPUBLIC,
        ONLINE_BANKING_FINLAND,
        ONLINE_BANKING_FPX,
        ONLINE_BANKING_POLAND,
        ONLINE_BANKING_SLOVAKIA,
        OXXO,
        PAGO_EFECTIVO,
        PERMATA_BANK_TRANSFER,
        OPEN_BANKING_UK,
        PAY_BRIGHT,
        PAYPAL,
        PAZE,
        PIX,
        PAY_SAFE_CARD,
        PRZELEWY24,
        PROMPT_PAY,
        PSE,
        RED_COMPRA,
        RED_PAGOS,
        SAMSUNG_PAY,
        SEPA,
        SEPA_BANK_TRANSFER,
        SOFORT,
        SWISH,
        TOUCH_N_GO,
        TRUSTLY,
        TWINT,
        UPI_COLLECT,
        UPI_INTENT,
        VIPPS,
        VIET_QR,
        VENMO,
        WALLEY,
        WE_CHAT_PAY,
        SEVEN_ELEVEN,
        LAWSON,
        MINI_STOP,
        FAMILY_MART,
        SEICOMART,
        PAY_EASY,
        LOCAL_BANK_TRANSFER,
        MIFINITY,
        OPEN_BANKING_PIS,
        DIRECT_CARRIER_BILLING,
        INSTANT_BANK_TRANSFER,
        BILLIE,
        ZIP,
        REVOLUT_PAY,
        NAVER_PAY,
        PAYCO,
        /**
         * An enum member indicating that [PaymentMethodTypes] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            ACH -> Value.ACH
            AFFIRM -> Value.AFFIRM
            AFTERPAY_CLEARPAY -> Value.AFTERPAY_CLEARPAY
            ALFAMART -> Value.ALFAMART
            ALI_PAY -> Value.ALI_PAY
            ALI_PAY_HK -> Value.ALI_PAY_HK
            ALMA -> Value.ALMA
            AMAZON_PAY -> Value.AMAZON_PAY
            APPLE_PAY -> Value.APPLE_PAY
            ATOME -> Value.ATOME
            BACS -> Value.BACS
            BANCONTACT_CARD -> Value.BANCONTACT_CARD
            BECS -> Value.BECS
            BENEFIT -> Value.BENEFIT
            BIZUM -> Value.BIZUM
            BLIK -> Value.BLIK
            BOLETO -> Value.BOLETO
            BCA_BANK_TRANSFER -> Value.BCA_BANK_TRANSFER
            BNI_VA -> Value.BNI_VA
            BRI_VA -> Value.BRI_VA
            CARD_REDIRECT -> Value.CARD_REDIRECT
            CIMB_VA -> Value.CIMB_VA
            CLASSIC -> Value.CLASSIC
            CREDIT -> Value.CREDIT
            CRYPTO_CURRENCY -> Value.CRYPTO_CURRENCY
            CASHAPP -> Value.CASHAPP
            DANA -> Value.DANA
            DANAMON_VA -> Value.DANAMON_VA
            DEBIT -> Value.DEBIT
            DUIT_NOW -> Value.DUIT_NOW
            EFECTY -> Value.EFECTY
            EFT -> Value.EFT
            EPS -> Value.EPS
            FPS -> Value.FPS
            EVOUCHER -> Value.EVOUCHER
            GIROPAY -> Value.GIROPAY
            GIVEX -> Value.GIVEX
            GOOGLE_PAY -> Value.GOOGLE_PAY
            GO_PAY -> Value.GO_PAY
            GCASH -> Value.GCASH
            IDEAL -> Value.IDEAL
            INTERAC -> Value.INTERAC
            INDOMARET -> Value.INDOMARET
            KLARNA -> Value.KLARNA
            KAKAO_PAY -> Value.KAKAO_PAY
            LOCAL_BANK_REDIRECT -> Value.LOCAL_BANK_REDIRECT
            MANDIRI_VA -> Value.MANDIRI_VA
            KNET -> Value.KNET
            MB_WAY -> Value.MB_WAY
            MOBILE_PAY -> Value.MOBILE_PAY
            MOMO -> Value.MOMO
            MOMO_ATM -> Value.MOMO_ATM
            MULTIBANCO -> Value.MULTIBANCO
            ONLINE_BANKING_THAILAND -> Value.ONLINE_BANKING_THAILAND
            ONLINE_BANKING_CZECH_REPUBLIC -> Value.ONLINE_BANKING_CZECH_REPUBLIC
            ONLINE_BANKING_FINLAND -> Value.ONLINE_BANKING_FINLAND
            ONLINE_BANKING_FPX -> Value.ONLINE_BANKING_FPX
            ONLINE_BANKING_POLAND -> Value.ONLINE_BANKING_POLAND
            ONLINE_BANKING_SLOVAKIA -> Value.ONLINE_BANKING_SLOVAKIA
            OXXO -> Value.OXXO
            PAGO_EFECTIVO -> Value.PAGO_EFECTIVO
            PERMATA_BANK_TRANSFER -> Value.PERMATA_BANK_TRANSFER
            OPEN_BANKING_UK -> Value.OPEN_BANKING_UK
            PAY_BRIGHT -> Value.PAY_BRIGHT
            PAYPAL -> Value.PAYPAL
            PAZE -> Value.PAZE
            PIX -> Value.PIX
            PAY_SAFE_CARD -> Value.PAY_SAFE_CARD
            PRZELEWY24 -> Value.PRZELEWY24
            PROMPT_PAY -> Value.PROMPT_PAY
            PSE -> Value.PSE
            RED_COMPRA -> Value.RED_COMPRA
            RED_PAGOS -> Value.RED_PAGOS
            SAMSUNG_PAY -> Value.SAMSUNG_PAY
            SEPA -> Value.SEPA
            SEPA_BANK_TRANSFER -> Value.SEPA_BANK_TRANSFER
            SOFORT -> Value.SOFORT
            SWISH -> Value.SWISH
            TOUCH_N_GO -> Value.TOUCH_N_GO
            TRUSTLY -> Value.TRUSTLY
            TWINT -> Value.TWINT
            UPI_COLLECT -> Value.UPI_COLLECT
            UPI_INTENT -> Value.UPI_INTENT
            VIPPS -> Value.VIPPS
            VIET_QR -> Value.VIET_QR
            VENMO -> Value.VENMO
            WALLEY -> Value.WALLEY
            WE_CHAT_PAY -> Value.WE_CHAT_PAY
            SEVEN_ELEVEN -> Value.SEVEN_ELEVEN
            LAWSON -> Value.LAWSON
            MINI_STOP -> Value.MINI_STOP
            FAMILY_MART -> Value.FAMILY_MART
            SEICOMART -> Value.SEICOMART
            PAY_EASY -> Value.PAY_EASY
            LOCAL_BANK_TRANSFER -> Value.LOCAL_BANK_TRANSFER
            MIFINITY -> Value.MIFINITY
            OPEN_BANKING_PIS -> Value.OPEN_BANKING_PIS
            DIRECT_CARRIER_BILLING -> Value.DIRECT_CARRIER_BILLING
            INSTANT_BANK_TRANSFER -> Value.INSTANT_BANK_TRANSFER
            BILLIE -> Value.BILLIE
            ZIP -> Value.ZIP
            REVOLUT_PAY -> Value.REVOLUT_PAY
            NAVER_PAY -> Value.NAVER_PAY
            PAYCO -> Value.PAYCO
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            ACH -> Known.ACH
            AFFIRM -> Known.AFFIRM
            AFTERPAY_CLEARPAY -> Known.AFTERPAY_CLEARPAY
            ALFAMART -> Known.ALFAMART
            ALI_PAY -> Known.ALI_PAY
            ALI_PAY_HK -> Known.ALI_PAY_HK
            ALMA -> Known.ALMA
            AMAZON_PAY -> Known.AMAZON_PAY
            APPLE_PAY -> Known.APPLE_PAY
            ATOME -> Known.ATOME
            BACS -> Known.BACS
            BANCONTACT_CARD -> Known.BANCONTACT_CARD
            BECS -> Known.BECS
            BENEFIT -> Known.BENEFIT
            BIZUM -> Known.BIZUM
            BLIK -> Known.BLIK
            BOLETO -> Known.BOLETO
            BCA_BANK_TRANSFER -> Known.BCA_BANK_TRANSFER
            BNI_VA -> Known.BNI_VA
            BRI_VA -> Known.BRI_VA
            CARD_REDIRECT -> Known.CARD_REDIRECT
            CIMB_VA -> Known.CIMB_VA
            CLASSIC -> Known.CLASSIC
            CREDIT -> Known.CREDIT
            CRYPTO_CURRENCY -> Known.CRYPTO_CURRENCY
            CASHAPP -> Known.CASHAPP
            DANA -> Known.DANA
            DANAMON_VA -> Known.DANAMON_VA
            DEBIT -> Known.DEBIT
            DUIT_NOW -> Known.DUIT_NOW
            EFECTY -> Known.EFECTY
            EFT -> Known.EFT
            EPS -> Known.EPS
            FPS -> Known.FPS
            EVOUCHER -> Known.EVOUCHER
            GIROPAY -> Known.GIROPAY
            GIVEX -> Known.GIVEX
            GOOGLE_PAY -> Known.GOOGLE_PAY
            GO_PAY -> Known.GO_PAY
            GCASH -> Known.GCASH
            IDEAL -> Known.IDEAL
            INTERAC -> Known.INTERAC
            INDOMARET -> Known.INDOMARET
            KLARNA -> Known.KLARNA
            KAKAO_PAY -> Known.KAKAO_PAY
            LOCAL_BANK_REDIRECT -> Known.LOCAL_BANK_REDIRECT
            MANDIRI_VA -> Known.MANDIRI_VA
            KNET -> Known.KNET
            MB_WAY -> Known.MB_WAY
            MOBILE_PAY -> Known.MOBILE_PAY
            MOMO -> Known.MOMO
            MOMO_ATM -> Known.MOMO_ATM
            MULTIBANCO -> Known.MULTIBANCO
            ONLINE_BANKING_THAILAND -> Known.ONLINE_BANKING_THAILAND
            ONLINE_BANKING_CZECH_REPUBLIC -> Known.ONLINE_BANKING_CZECH_REPUBLIC
            ONLINE_BANKING_FINLAND -> Known.ONLINE_BANKING_FINLAND
            ONLINE_BANKING_FPX -> Known.ONLINE_BANKING_FPX
            ONLINE_BANKING_POLAND -> Known.ONLINE_BANKING_POLAND
            ONLINE_BANKING_SLOVAKIA -> Known.ONLINE_BANKING_SLOVAKIA
            OXXO -> Known.OXXO
            PAGO_EFECTIVO -> Known.PAGO_EFECTIVO
            PERMATA_BANK_TRANSFER -> Known.PERMATA_BANK_TRANSFER
            OPEN_BANKING_UK -> Known.OPEN_BANKING_UK
            PAY_BRIGHT -> Known.PAY_BRIGHT
            PAYPAL -> Known.PAYPAL
            PAZE -> Known.PAZE
            PIX -> Known.PIX
            PAY_SAFE_CARD -> Known.PAY_SAFE_CARD
            PRZELEWY24 -> Known.PRZELEWY24
            PROMPT_PAY -> Known.PROMPT_PAY
            PSE -> Known.PSE
            RED_COMPRA -> Known.RED_COMPRA
            RED_PAGOS -> Known.RED_PAGOS
            SAMSUNG_PAY -> Known.SAMSUNG_PAY
            SEPA -> Known.SEPA
            SEPA_BANK_TRANSFER -> Known.SEPA_BANK_TRANSFER
            SOFORT -> Known.SOFORT
            SWISH -> Known.SWISH
            TOUCH_N_GO -> Known.TOUCH_N_GO
            TRUSTLY -> Known.TRUSTLY
            TWINT -> Known.TWINT
            UPI_COLLECT -> Known.UPI_COLLECT
            UPI_INTENT -> Known.UPI_INTENT
            VIPPS -> Known.VIPPS
            VIET_QR -> Known.VIET_QR
            VENMO -> Known.VENMO
            WALLEY -> Known.WALLEY
            WE_CHAT_PAY -> Known.WE_CHAT_PAY
            SEVEN_ELEVEN -> Known.SEVEN_ELEVEN
            LAWSON -> Known.LAWSON
            MINI_STOP -> Known.MINI_STOP
            FAMILY_MART -> Known.FAMILY_MART
            SEICOMART -> Known.SEICOMART
            PAY_EASY -> Known.PAY_EASY
            LOCAL_BANK_TRANSFER -> Known.LOCAL_BANK_TRANSFER
            MIFINITY -> Known.MIFINITY
            OPEN_BANKING_PIS -> Known.OPEN_BANKING_PIS
            DIRECT_CARRIER_BILLING -> Known.DIRECT_CARRIER_BILLING
            INSTANT_BANK_TRANSFER -> Known.INSTANT_BANK_TRANSFER
            BILLIE -> Known.BILLIE
            ZIP -> Known.ZIP
            REVOLUT_PAY -> Known.REVOLUT_PAY
            NAVER_PAY -> Known.NAVER_PAY
            PAYCO -> Known.PAYCO
            else -> throw DodoPaymentsInvalidDataException("Unknown PaymentMethodTypes: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            DodoPaymentsInvalidDataException("Value is not a String")
        }

    private var validated: Boolean = false

    fun validate(): PaymentMethodTypes = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentMethodTypes && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
