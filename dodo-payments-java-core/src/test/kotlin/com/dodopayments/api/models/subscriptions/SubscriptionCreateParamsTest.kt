// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.subscriptions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerRequest
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionCreateParamsTest {

    @Test
    fun create() {
        SubscriptionCreateParams.builder()
            .billing(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
            .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
            .productId("product_id")
            .quantity(0)
            .addAddon(
                SubscriptionCreateParams.Addon.builder().addonId("addon_id").quantity(0).build()
            )
            .addAllowedPaymentMethodType(SubscriptionCreateParams.AllowedPaymentMethodType.CREDIT)
            .billingCurrency(Currency.AED)
            .discountCode("discount_code")
            .metadata(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .onDemand(
                SubscriptionCreateParams.OnDemand.builder()
                    .mandateOnly(true)
                    .adaptiveCurrencyFeesInclusive(true)
                    .productCurrency(Currency.AED)
                    .productDescription("product_description")
                    .productPrice(0)
                    .build()
            )
            .paymentLink(true)
            .returnUrl("return_url")
            .showSavedPaymentMethods(true)
            .taxId("tax_id")
            .trialPeriodDays(0)
            .build()
    }

    @Test
    fun body() {
        val params =
            SubscriptionCreateParams.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .productId("product_id")
                .quantity(0)
                .addAddon(
                    SubscriptionCreateParams.Addon.builder().addonId("addon_id").quantity(0).build()
                )
                .addAllowedPaymentMethodType(
                    SubscriptionCreateParams.AllowedPaymentMethodType.CREDIT
                )
                .billingCurrency(Currency.AED)
                .discountCode("discount_code")
                .metadata(
                    SubscriptionCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .onDemand(
                    SubscriptionCreateParams.OnDemand.builder()
                        .mandateOnly(true)
                        .adaptiveCurrencyFeesInclusive(true)
                        .productCurrency(Currency.AED)
                        .productDescription("product_description")
                        .productPrice(0)
                        .build()
                )
                .paymentLink(true)
                .returnUrl("return_url")
                .showSavedPaymentMethods(true)
                .taxId("tax_id")
                .trialPeriodDays(0)
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.quantity()).isEqualTo(0)
        assertThat(body.addons().getOrNull())
            .containsExactly(
                SubscriptionCreateParams.Addon.builder().addonId("addon_id").quantity(0).build()
            )
        assertThat(body.allowedPaymentMethodTypes().getOrNull())
            .containsExactly(SubscriptionCreateParams.AllowedPaymentMethodType.CREDIT)
        assertThat(body.billingCurrency()).contains(Currency.AED)
        assertThat(body.discountCode()).contains("discount_code")
        assertThat(body.metadata())
            .contains(
                SubscriptionCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.onDemand())
            .contains(
                SubscriptionCreateParams.OnDemand.builder()
                    .mandateOnly(true)
                    .adaptiveCurrencyFeesInclusive(true)
                    .productCurrency(Currency.AED)
                    .productDescription("product_description")
                    .productPrice(0)
                    .build()
            )
        assertThat(body.paymentLink()).contains(true)
        assertThat(body.returnUrl()).contains("return_url")
        assertThat(body.showSavedPaymentMethods()).contains(true)
        assertThat(body.taxId()).contains("tax_id")
        assertThat(body.trialPeriodDays()).contains(0)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SubscriptionCreateParams.builder()
                .billing(
                    BillingAddress.builder()
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .productId("product_id")
                .quantity(0)
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .city("city")
                    .country(CountryCode.AF)
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productId()).isEqualTo("product_id")
        assertThat(body.quantity()).isEqualTo(0)
    }
}
