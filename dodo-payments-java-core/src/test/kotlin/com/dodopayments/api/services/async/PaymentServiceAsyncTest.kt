// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.services.async

import com.dodopayments.api.TestServerExtension
import com.dodopayments.api.client.okhttp.DodoPaymentsOkHttpClientAsync
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.AttachExistingCustomer
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.PaymentCreateParams
import com.dodopayments.api.models.payments.PaymentMethodTypes
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PaymentServiceAsyncTest {

    @Test
    fun create() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val paymentFuture =
            paymentServiceAsync.create(
                PaymentCreateParams.builder()
                    .billing(
                        BillingAddress.builder()
                            .country(CountryCode.AF)
                            .city("city")
                            .state("state")
                            .street("street")
                            .zipcode("zipcode")
                            .build()
                    )
                    .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                    .addProductCart(
                        PaymentCreateParams.ProductCart.builder()
                            .productId("product_id")
                            .quantity(0)
                            .amount(0)
                            .build()
                    )
                    .addAllowedPaymentMethodType(PaymentMethodTypes.ACH)
                    .billingCurrency(Currency.AED)
                    .discountCode("discount_code")
                    .force3ds(true)
                    .metadata(
                        PaymentCreateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .paymentLink(true)
                    .paymentMethodId("payment_method_id")
                    .redirectImmediately(true)
                    .returnUrl("return_url")
                    .shortLink(true)
                    .showSavedPaymentMethods(true)
                    .taxId("tax_id")
                    .build()
            )

        val payment = paymentFuture.get()
        payment.validate()
    }

    @Test
    fun retrieve() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val paymentFuture = paymentServiceAsync.retrieve("payment_id")

        val payment = paymentFuture.get()
        payment.validate()
    }

    @Test
    fun list() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val pageFuture = paymentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun retrieveLineItems() {
        val client =
            DodoPaymentsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val paymentServiceAsync = client.payments()

        val responseFuture = paymentServiceAsync.retrieveLineItems("payment_id")

        val response = responseFuture.get()
        response.validate()
    }
}
