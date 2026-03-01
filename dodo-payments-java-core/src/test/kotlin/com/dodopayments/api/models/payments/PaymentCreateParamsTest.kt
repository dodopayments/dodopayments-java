// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(
                BillingAddress.builder()
                    .country(CountryCode.AF)
                    .city("city")
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
        assertThat(body.productCart())
            .containsExactly(
                PaymentCreateParams.ProductCart.builder()
                    .productId("product_id")
                    .quantity(0)
                    .amount(0)
                    .build()
            )
        assertThat(body.allowedPaymentMethodTypes().getOrNull())
            .containsExactly(PaymentMethodTypes.ACH)
        assertThat(body.billingCurrency()).contains(Currency.AED)
        assertThat(body.discountCode()).contains("discount_code")
        assertThat(body.force3ds()).contains(true)
        assertThat(body.metadata())
            .contains(
                PaymentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentLink()).contains(true)
        assertThat(body.paymentMethodId()).contains("payment_method_id")
        assertThat(body.redirectImmediately()).contains(true)
        assertThat(body.returnUrl()).contains("return_url")
        assertThat(body.shortLink()).contains(true)
        assertThat(body.showSavedPaymentMethods()).contains(true)
        assertThat(body.taxId()).contains("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentCreateParams.builder()
                .billing(BillingAddress.builder().country(CountryCode.AF).build())
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .addProductCart(
                    PaymentCreateParams.ProductCart.builder()
                        .productId("product_id")
                        .quantity(0)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.billing())
            .isEqualTo(BillingAddress.builder().country(CountryCode.AF).build())
        assertThat(body.customer())
            .isEqualTo(
                CustomerRequest.ofAttachExistingCustomer(
                    AttachExistingCustomer.builder().customerId("customer_id").build()
                )
            )
        assertThat(body.productCart())
            .containsExactly(
                PaymentCreateParams.ProductCart.builder()
                    .productId("product_id")
                    .quantity(0)
                    .build()
            )
    }
}
