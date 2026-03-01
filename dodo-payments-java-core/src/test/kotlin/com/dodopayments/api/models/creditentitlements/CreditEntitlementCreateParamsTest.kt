// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementCreateParamsTest {

    @Test
    fun create() {
        CreditEntitlementCreateParams.builder()
            .name("name")
            .overageEnabled(true)
            .precision(0)
            .rolloverEnabled(true)
            .unit("unit")
            .currency(Currency.AED)
            .description("description")
            .expiresAfterDays(0)
            .maxRolloverCount(0)
            .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
            .overageLimit(0L)
            .pricePerUnit("price_per_unit")
            .rolloverPercentage(0)
            .rolloverTimeframeCount(0)
            .rolloverTimeframeInterval(TimeInterval.DAY)
            .build()
    }

    @Test
    fun body() {
        val params =
            CreditEntitlementCreateParams.builder()
                .name("name")
                .overageEnabled(true)
                .precision(0)
                .rolloverEnabled(true)
                .unit("unit")
                .currency(Currency.AED)
                .description("description")
                .expiresAfterDays(0)
                .maxRolloverCount(0)
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageLimit(0L)
                .pricePerUnit("price_per_unit")
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.overageEnabled()).isEqualTo(true)
        assertThat(body.precision()).isEqualTo(0)
        assertThat(body.rolloverEnabled()).isEqualTo(true)
        assertThat(body.unit()).isEqualTo("unit")
        assertThat(body.currency()).contains(Currency.AED)
        assertThat(body.description()).contains("description")
        assertThat(body.expiresAfterDays()).contains(0)
        assertThat(body.maxRolloverCount()).contains(0)
        assertThat(body.overageBehavior()).contains(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(body.overageLimit()).contains(0L)
        assertThat(body.pricePerUnit()).contains("price_per_unit")
        assertThat(body.rolloverPercentage()).contains(0)
        assertThat(body.rolloverTimeframeCount()).contains(0)
        assertThat(body.rolloverTimeframeInterval()).contains(TimeInterval.DAY)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CreditEntitlementCreateParams.builder()
                .name("name")
                .overageEnabled(true)
                .precision(0)
                .rolloverEnabled(true)
                .unit("unit")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.overageEnabled()).isEqualTo(true)
        assertThat(body.precision()).isEqualTo(0)
        assertThat(body.rolloverEnabled()).isEqualTo(true)
        assertThat(body.unit()).isEqualTo("unit")
    }
}
