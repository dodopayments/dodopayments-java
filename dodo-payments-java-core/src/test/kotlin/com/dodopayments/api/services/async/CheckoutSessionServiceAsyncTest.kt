// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.checkoutsessions.CheckoutSessionRequest
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.PaymentMethodTypes
import com.dodopayments.api.models.subscriptions.AttachAddon
import com.dodopayments.api.models.subscriptions.OnDemandSubscription
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CheckoutSessionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val checkoutSessionServiceAsync = client.checkoutSessions()

        val checkoutSessionResponseFuture =
            checkoutSessionServiceAsync.create(
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
                            .forceLanguage("force_language")
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
                    .force3ds(true)
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
            )

        val checkoutSessionResponse = checkoutSessionResponseFuture.get()
        checkoutSessionResponse.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val checkoutSessionServiceAsync = client.checkoutSessions()

        val checkoutSessionStatusFuture = checkoutSessionServiceAsync.retrieve("id")

        val checkoutSessionStatus = checkoutSessionStatusFuture.get()
        checkoutSessionStatus.validate()
    }
}
