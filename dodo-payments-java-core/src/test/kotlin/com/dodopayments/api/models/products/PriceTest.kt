// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class PriceTest {

    @Test
    fun ofOneTime() {
        val oneTime =
            Price.OneTimePrice.builder()
                .currency(Currency.AED)
                .discount(0.0f)
                .price(0)
                .purchasingPowerParity(true)
                .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                .payWhatYouWant(true)
                .suggestedPrice(0)
                .taxInclusive(true)
                .build()

        val price = Price.ofOneTime(oneTime)

        assertThat(price.oneTime()).contains(oneTime)
        assertThat(price.recurring()).isEmpty
    }

    @Test
    fun ofOneTimeRoundtrip() {
        val jsonMapper = jsonMapper()
        val price =
            Price.ofOneTime(
                Price.OneTimePrice.builder()
                    .currency(Currency.AED)
                    .discount(0.0f)
                    .price(0)
                    .purchasingPowerParity(true)
                    .type(Price.OneTimePrice.Type.ONE_TIME_PRICE)
                    .payWhatYouWant(true)
                    .suggestedPrice(0)
                    .taxInclusive(true)
                    .build()
            )

        val roundtrippedPrice =
            jsonMapper.readValue(jsonMapper.writeValueAsString(price), jacksonTypeRef<Price>())

        assertThat(roundtrippedPrice).isEqualTo(price)
    }

    @Test
    fun ofRecurring() {
        val recurring =
            Price.RecurringPrice.builder()
                .currency(Currency.AED)
                .discount(0.0f)
                .paymentFrequencyCount(0)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .price(0)
                .purchasingPowerParity(true)
                .subscriptionPeriodCount(0)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .type(Price.RecurringPrice.Type.RECURRING_PRICE)
                .taxInclusive(true)
                .trialPeriodDays(0)
                .build()

        val price = Price.ofRecurring(recurring)

        assertThat(price.oneTime()).isEmpty
        assertThat(price.recurring()).contains(recurring)
    }

    @Test
    fun ofRecurringRoundtrip() {
        val jsonMapper = jsonMapper()
        val price =
            Price.ofRecurring(
                Price.RecurringPrice.builder()
                    .currency(Currency.AED)
                    .discount(0.0f)
                    .paymentFrequencyCount(0)
                    .paymentFrequencyInterval(TimeInterval.DAY)
                    .price(0)
                    .purchasingPowerParity(true)
                    .subscriptionPeriodCount(0)
                    .subscriptionPeriodInterval(TimeInterval.DAY)
                    .type(Price.RecurringPrice.Type.RECURRING_PRICE)
                    .taxInclusive(true)
                    .trialPeriodDays(0)
                    .build()
            )

        val roundtrippedPrice =
            jsonMapper.readValue(jsonMapper.writeValueAsString(price), jacksonTypeRef<Price>())

        assertThat(roundtrippedPrice).isEqualTo(price)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val price = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Price>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { price.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
