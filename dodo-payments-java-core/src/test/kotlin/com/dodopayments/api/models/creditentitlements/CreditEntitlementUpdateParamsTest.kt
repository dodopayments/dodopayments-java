// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.creditentitlements

import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditEntitlementUpdateParamsTest {

    @Test
    fun create() {
        CreditEntitlementUpdateParams.builder()
            .id("id")
            .currency(Currency.AED)
            .description("description")
            .expiresAfterDays(0)
            .maxRolloverCount(0)
            .name("name")
            .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
            .overageEnabled(true)
            .overageLimit(0L)
            .pricePerUnit("price_per_unit")
            .rolloverEnabled(true)
            .rolloverPercentage(0)
            .rolloverTimeframeCount(0)
            .rolloverTimeframeInterval(TimeInterval.DAY)
            .unit("unit")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CreditEntitlementUpdateParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CreditEntitlementUpdateParams.builder()
                .id("id")
                .currency(Currency.AED)
                .description("description")
                .expiresAfterDays(0)
                .maxRolloverCount(0)
                .name("name")
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .overageLimit(0L)
                .pricePerUnit("price_per_unit")
                .rolloverEnabled(true)
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .unit("unit")
                .build()

        val body = params._body()

        assertThat(body.currency()).contains(Currency.AED)
        assertThat(body.description()).contains("description")
        assertThat(body.expiresAfterDays()).contains(0)
        assertThat(body.maxRolloverCount()).contains(0)
        assertThat(body.name()).contains("name")
        assertThat(body.overageBehavior()).contains(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(body.overageEnabled()).contains(true)
        assertThat(body.overageLimit()).contains(0L)
        assertThat(body.pricePerUnit()).contains("price_per_unit")
        assertThat(body.rolloverEnabled()).contains(true)
        assertThat(body.rolloverPercentage()).contains(0)
        assertThat(body.rolloverTimeframeCount()).contains(0)
        assertThat(body.rolloverTimeframeInterval()).contains(TimeInterval.DAY)
        assertThat(body.unit()).contains("unit")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditEntitlementUpdateParams.builder().id("id").build()

        val body = params._body()
    }
}
