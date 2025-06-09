// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.subscriptions.SubscriptionChangePlanParams
import com.dodopayments.api.models.subscriptions.SubscriptionChargeParams
import com.dodopayments.api.models.subscriptions.SubscriptionCreateParams
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.SubscriptionUpdateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SubscriptionServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionFuture =
            subscriptionServiceAsync.create(
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
                        SubscriptionCreateParams.Addon.builder()
                            .addonId("addon_id")
                            .quantity(0)
                            .build()
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
                            .productPrice(0)
                            .build()
                    )
                    .paymentLink(true)
                    .returnUrl("return_url")
                    .showSavedPaymentMethods(true)
                    .taxId("tax_id")
                    .trialPeriodDays(0)
                    .build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionFuture = subscriptionServiceAsync.retrieve("subscription_id")

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun update() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val subscriptionFuture =
            subscriptionServiceAsync.update(
                SubscriptionUpdateParams.builder()
                    .subscriptionId("subscription_id")
                    .billing(
                        BillingAddress.builder()
                            .city("city")
                            .country(CountryCode.AF)
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .cancelAtNextBillingDate(true)
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
                    .status(SubscriptionStatus.PENDING)
                    .taxId("tax_id")
                    .build()
            )

        val subscription = subscriptionFuture.get()
        subscription.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val pageFuture = subscriptionServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun changePlan() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val future =
            subscriptionServiceAsync.changePlan(
                SubscriptionChangePlanParams.builder()
                    .subscriptionId("subscription_id")
                    .productId("product_id")
                    .prorationBillingMode(
                        SubscriptionChangePlanParams.ProrationBillingMode.PRORATED_IMMEDIATELY
                    )
                    .quantity(0)
                    .addAddon(
                        SubscriptionChangePlanParams.Addon.builder()
                            .addonId("addon_id")
                            .quantity(0)
                            .build()
                    )
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun charge() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val subscriptionServiceAsync = client.subscriptions()

        val responseFuture =
            subscriptionServiceAsync.charge(
                SubscriptionChargeParams.builder()
                    .subscriptionId("subscription_id")
                    .productPrice(0)
                    .metadata(
                        SubscriptionChargeParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
