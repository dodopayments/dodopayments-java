// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTest {

    @Test
    fun create() {
        val subscription =
            Subscription.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Subscription.Currency.AED)
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    Subscription.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentFrequencyCount(0L)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .productId("product_id")
                .quantity(0L)
                .recurringPreTaxAmount(0L)
                .status(SubscriptionStatus.PENDING)
                .subscriptionId("subscription_id")
                .subscriptionPeriodCount(0L)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .taxInclusive(true)
                .trialPeriodDays(0L)
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .build()

        assertThat(subscription.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(subscription.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.currency()).isEqualTo(Subscription.Currency.AED)
        assertThat(subscription.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(subscription.metadata())
            .isEqualTo(
                Subscription.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(subscription.nextBillingDate())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.paymentFrequencyCount()).isEqualTo(0L)
        assertThat(subscription.paymentFrequencyInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscription.productId()).isEqualTo("product_id")
        assertThat(subscription.quantity()).isEqualTo(0L)
        assertThat(subscription.recurringPreTaxAmount()).isEqualTo(0L)
        assertThat(subscription.status()).isEqualTo(SubscriptionStatus.PENDING)
        assertThat(subscription.subscriptionId()).isEqualTo("subscription_id")
        assertThat(subscription.subscriptionPeriodCount()).isEqualTo(0L)
        assertThat(subscription.subscriptionPeriodInterval()).isEqualTo(TimeInterval.DAY)
        assertThat(subscription.taxInclusive()).isEqualTo(true)
        assertThat(subscription.trialPeriodDays()).isEqualTo(0L)
        assertThat(subscription.cancelledAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.discountId()).contains("discount_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscription =
            Subscription.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Subscription.Currency.AED)
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    Subscription.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .paymentFrequencyCount(0L)
                .paymentFrequencyInterval(TimeInterval.DAY)
                .productId("product_id")
                .quantity(0L)
                .recurringPreTaxAmount(0L)
                .status(SubscriptionStatus.PENDING)
                .subscriptionId("subscription_id")
                .subscriptionPeriodCount(0L)
                .subscriptionPeriodInterval(TimeInterval.DAY)
                .taxInclusive(true)
                .trialPeriodDays(0L)
                .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .discountId("discount_id")
                .build()

        val roundtrippedSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscription),
                jacksonTypeRef<Subscription>(),
            )

        assertThat(roundtrippedSubscription).isEqualTo(subscription)
    }
}
