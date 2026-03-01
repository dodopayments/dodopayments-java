// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.products

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AttachCreditEntitlementTest {

    @Test
    fun create() {
        val attachCreditEntitlement =
            AttachCreditEntitlement.builder()
                .creditEntitlementId("credit_entitlement_id")
                .creditsAmount("credits_amount")
                .currency(Currency.AED)
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .overageLimit("overage_limit")
                .pricePerUnit("price_per_unit")
                .prorationBehavior(CbbProrationBehavior.PRORATE)
                .rolloverEnabled(true)
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .trialCredits("trial_credits")
                .trialCreditsExpireAfterTrial(true)
                .build()

        assertThat(attachCreditEntitlement.creditEntitlementId()).isEqualTo("credit_entitlement_id")
        assertThat(attachCreditEntitlement.creditsAmount()).isEqualTo("credits_amount")
        assertThat(attachCreditEntitlement.currency()).contains(Currency.AED)
        assertThat(attachCreditEntitlement.expiresAfterDays()).contains(0)
        assertThat(attachCreditEntitlement.lowBalanceThresholdPercent()).contains(0)
        assertThat(attachCreditEntitlement.maxRolloverCount()).contains(0)
        assertThat(attachCreditEntitlement.overageBehavior())
            .contains(CbbOverageBehavior.FORGIVE_AT_RESET)
        assertThat(attachCreditEntitlement.overageEnabled()).contains(true)
        assertThat(attachCreditEntitlement.overageLimit()).contains("overage_limit")
        assertThat(attachCreditEntitlement.pricePerUnit()).contains("price_per_unit")
        assertThat(attachCreditEntitlement.prorationBehavior())
            .contains(CbbProrationBehavior.PRORATE)
        assertThat(attachCreditEntitlement.rolloverEnabled()).contains(true)
        assertThat(attachCreditEntitlement.rolloverPercentage()).contains(0)
        assertThat(attachCreditEntitlement.rolloverTimeframeCount()).contains(0)
        assertThat(attachCreditEntitlement.rolloverTimeframeInterval()).contains(TimeInterval.DAY)
        assertThat(attachCreditEntitlement.trialCredits()).contains("trial_credits")
        assertThat(attachCreditEntitlement.trialCreditsExpireAfterTrial()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val attachCreditEntitlement =
            AttachCreditEntitlement.builder()
                .creditEntitlementId("credit_entitlement_id")
                .creditsAmount("credits_amount")
                .currency(Currency.AED)
                .expiresAfterDays(0)
                .lowBalanceThresholdPercent(0)
                .maxRolloverCount(0)
                .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                .overageEnabled(true)
                .overageLimit("overage_limit")
                .pricePerUnit("price_per_unit")
                .prorationBehavior(CbbProrationBehavior.PRORATE)
                .rolloverEnabled(true)
                .rolloverPercentage(0)
                .rolloverTimeframeCount(0)
                .rolloverTimeframeInterval(TimeInterval.DAY)
                .trialCredits("trial_credits")
                .trialCreditsExpireAfterTrial(true)
                .build()

        val roundtrippedAttachCreditEntitlement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(attachCreditEntitlement),
                jacksonTypeRef<AttachCreditEntitlement>(),
            )

        assertThat(roundtrippedAttachCreditEntitlement).isEqualTo(attachCreditEntitlement)
    }
}
