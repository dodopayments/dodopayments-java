// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.payments.BillingAddress
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionUpdateParamsTest {

    @Test
    fun create() {
        SubscriptionUpdateParams.builder()
            .subscriptionId("subscription_id")
            .billing(
                BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .cancelAtNextBillingDate(true)
            .customerName("customer_name")
            .disableOnDemand(
                SubscriptionUpdateParams.DisableOnDemand.builder()
                    .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .metadata(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .status(SubscriptionStatus.PENDING)
            .taxId("tax_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()

        assertThat(params._pathParam(0)).isEqualTo("subscription_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SubscriptionUpdateParams.builder()
                .subscriptionId("subscription_id")
                .billing(
                    BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .cancelAtNextBillingDate(true)
                .customerName("customer_name")
                .disableOnDemand(
                    SubscriptionUpdateParams.DisableOnDemand.builder()
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .metadata(
                    SubscriptionUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .status(SubscriptionStatus.PENDING)
                .taxId("tax_id")
                .build()

        val body = params._body()

        assertThat(body.billing())
            .contains(
                BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.cancelAtNextBillingDate()).contains(true)
        assertThat(body.customerName()).contains("customer_name")
        assertThat(body.disableOnDemand())
            .contains(
                SubscriptionUpdateParams.DisableOnDemand.builder()
                    .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                SubscriptionUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.nextBillingDate())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.status()).contains(SubscriptionStatus.PENDING)
        assertThat(body.taxId()).contains("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SubscriptionUpdateParams.builder().subscriptionId("subscription_id").build()

        val body = params._body()
    }
}
