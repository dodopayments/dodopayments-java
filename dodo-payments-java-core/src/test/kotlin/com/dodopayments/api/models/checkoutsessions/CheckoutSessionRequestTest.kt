// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.checkoutsessions

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.CustomerRequest
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckoutSessionRequestTest {

    @Test
    fun create() {
        val checkoutSessionRequest =
            CheckoutSessionRequest.builder()
                .addProductCart(
                    CheckoutSessionRequest.ProductCart.builder()
                        .productId("product_id")
                        .quantity(0)
                        .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                        .amount(0)
                        .build()
                )
                .addAllowedPaymentMethodType(PaymentMethodTypes.CREDIT)
                .billingAddress(
                    CheckoutSessionRequest.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .billingCurrency(Currency.AED)
                .confirm(true)
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .customization(
                    CheckoutSessionRequest.Customization.builder()
                        .showOnDemandTag(true)
                        .showOrderDetails(true)
                        .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                        .build()
                )
                .discountCode("discount_code")
                .featureFlags(
                    CheckoutSessionRequest.FeatureFlags.builder()
                        .allowCurrencySelection(true)
                        .allowDiscountCode(true)
                        .allowPhoneNumberCollection(true)
                        .allowTaxId(true)
                        .alwaysCreateNewCustomer(true)
                        .build()
                )
                .metadata(
                    CheckoutSessionRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .returnUrl("return_url")
                .showSavedPaymentMethods(true)
                .subscriptionData(
                    CheckoutSessionRequest.SubscriptionData.builder()
                        .onDemand(
                            OnDemandSubscription.builder()
                                .mandateOnly(true)
                                .adaptiveCurrencyFeesInclusive(true)
                                .productCurrency(Currency.AED)
                                .productDescription("product_description")
                                .productPrice(0)
                                .build()
                        )
                        .trialPeriodDays(0)
                        .build()
                )
                .build()

        assertThat(checkoutSessionRequest.productCart())
            .containsExactly(
                CheckoutSessionRequest.ProductCart.builder()
                    .productId("product_id")
                    .quantity(0)
                    .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                    .amount(0)
                    .build()
            )
        assertThat(checkoutSessionRequest.allowedPaymentMethodTypes().getOrNull())
            .containsExactly(PaymentMethodTypes.CREDIT)
        assertThat(checkoutSessionRequest.billingAddress())
            .contains(
                CheckoutSessionRequest.BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
                    .state("state")
                    .street("street")
                    .zipcode("zipcode")
                    .build()
            )
        assertThat(checkoutSessionRequest.billingCurrency()).contains(Currency.AED)
        assertThat(checkoutSessionRequest.confirm()).contains(true)
        assertThat(checkoutSessionRequest.customer())
            .contains(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(checkoutSessionRequest.customization())
            .contains(
                CheckoutSessionRequest.Customization.builder()
                    .showOnDemandTag(true)
                    .showOrderDetails(true)
                    .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                    .build()
            )
        assertThat(checkoutSessionRequest.discountCode()).contains("discount_code")
        assertThat(checkoutSessionRequest.featureFlags())
            .contains(
                CheckoutSessionRequest.FeatureFlags.builder()
                    .allowCurrencySelection(true)
                    .allowDiscountCode(true)
                    .allowPhoneNumberCollection(true)
                    .allowTaxId(true)
                    .alwaysCreateNewCustomer(true)
                    .build()
            )
        assertThat(checkoutSessionRequest.metadata())
            .contains(
                CheckoutSessionRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(checkoutSessionRequest.returnUrl()).contains("return_url")
        assertThat(checkoutSessionRequest.showSavedPaymentMethods()).contains(true)
        assertThat(checkoutSessionRequest.subscriptionData())
            .contains(
                CheckoutSessionRequest.SubscriptionData.builder()
                    .onDemand(
                        OnDemandSubscription.builder()
                            .mandateOnly(true)
                            .adaptiveCurrencyFeesInclusive(true)
                            .productCurrency(Currency.AED)
                            .productDescription("product_description")
                            .productPrice(0)
                            .build()
                    )
                    .trialPeriodDays(0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val checkoutSessionRequest =
            CheckoutSessionRequest.builder()
                .addProductCart(
                    CheckoutSessionRequest.ProductCart.builder()
                        .productId("product_id")
                        .quantity(0)
                        .addAddon(AttachAddon.builder().addonId("addon_id").quantity(0).build())
                        .amount(0)
                        .build()
                )
                .addAllowedPaymentMethodType(PaymentMethodTypes.CREDIT)
                .billingAddress(
                    CheckoutSessionRequest.BillingAddress.builder()
                        .country(CountryCode.AF)
                        .city("city")
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .billingCurrency(Currency.AED)
                .confirm(true)
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .customization(
                    CheckoutSessionRequest.Customization.builder()
                        .showOnDemandTag(true)
                        .showOrderDetails(true)
                        .theme(CheckoutSessionRequest.Customization.Theme.DARK)
                        .build()
                )
                .discountCode("discount_code")
                .featureFlags(
                    CheckoutSessionRequest.FeatureFlags.builder()
                        .allowCurrencySelection(true)
                        .allowDiscountCode(true)
                        .allowPhoneNumberCollection(true)
                        .allowTaxId(true)
                        .alwaysCreateNewCustomer(true)
                        .build()
                )
                .metadata(
                    CheckoutSessionRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .returnUrl("return_url")
                .showSavedPaymentMethods(true)
                .subscriptionData(
                    CheckoutSessionRequest.SubscriptionData.builder()
                        .onDemand(
                            OnDemandSubscription.builder()
                                .mandateOnly(true)
                                .adaptiveCurrencyFeesInclusive(true)
                                .productCurrency(Currency.AED)
                                .productDescription("product_description")
                                .productPrice(0)
                                .build()
                        )
                        .trialPeriodDays(0)
                        .build()
                )
                .build()

        val roundtrippedCheckoutSessionRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(checkoutSessionRequest),
                jacksonTypeRef<CheckoutSessionRequest>(),
            )

        assertThat(roundtrippedCheckoutSessionRequest).isEqualTo(checkoutSessionRequest)
    }
}
