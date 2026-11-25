// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.models.invoices.CollectionMethod
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionStartTrialParamsTest {

    @Test
    fun create() {
        SubscriptionStartTrialParams.builder()
            .collectionMethod(CollectionMethod.AUTO_CHARGE)
            .currency(Currency.AED)
            .customerId("customer_id")
            .productId("product_id")
            .billingAddress(
                SubscriptionStartTrialParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .paymentMethodId("payment_method_id")
            .paymentTermsDueOnReceipt()
            .quantity(0)
            .reviewRequired(true)
            .taxId("tax_id")
            .trialPeriodDays(0)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionStartTrialParams.builder()
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .productId("product_id")
                .billingAddress(
                    SubscriptionStartTrialParams.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .paymentMethodId("payment_method_id")
                .paymentTermsDueOnReceipt()
                .quantity(0)
                .reviewRequired(true)
                .taxId("tax_id")
                .trialPeriodDays(0)
                .build()

        val body = params._body()

        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.billingAddress())
            .contains(
                SubscriptionStartTrialParams.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.paymentMethodId()).contains("payment_method_id")
        assertThat(body.paymentTerms())
            .contains(SubscriptionStartTrialParams.PaymentTerms.ofDueOnReceipt())
        assertThat(body.quantity()).contains(0)
        assertThat(body.reviewRequired()).contains(true)
        assertThat(body.taxId()).contains("tax_id")
        assertThat(body.trialPeriodDays()).contains(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionStartTrialParams.builder()
                .collectionMethod(CollectionMethod.AUTO_CHARGE)
                .currency(Currency.AED)
                .customerId("customer_id")
                .productId("product_id")
                .build()

        val body = params._body()

        assertThat(body.collectionMethod()).isEqualTo(CollectionMethod.AUTO_CHARGE)
        assertThat(body.currency()).isEqualTo(Currency.AED)
        assertThat(body.customerId()).isEqualTo("customer_id")
        assertThat(body.productId()).isEqualTo("product_id")
    }
}
