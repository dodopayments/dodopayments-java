// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.models.misc.CountryCode
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateParamsTest {

    @Test
    fun create() {
        PaymentCreateParams.builder()
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
            .addProductCart(
                OneTimeProductCartItem.builder()
                    .productId("product_id")
                    .quantity(0L)
                    .amount(0L)
                    .build()
            )
            .addAllowedPaymentMethodType(PaymentCreateParams.AllowedPaymentMethodType.CREDIT)
            .billingCurrency(PaymentCreateParams.BillingCurrency.AED)
            .discountCode("discount_code")
            .metadata(
                PaymentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .paymentLink(true)
            .returnUrl("return_url")
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
                        .city("city")
                        .country(CountryCode.AF)
                        .state("state")
                        .street("street")
                        .zipcode("zipcode")
                        .build()
                )
                .customer(AttachExistingCustomer.builder().customerId("customer_id").build())
                .addProductCart(
                    OneTimeProductCartItem.builder()
                        .productId("product_id")
                        .quantity(0L)
                        .amount(0L)
                        .build()
                )
                .addAllowedPaymentMethodType(PaymentCreateParams.AllowedPaymentMethodType.CREDIT)
                .billingCurrency(PaymentCreateParams.BillingCurrency.AED)
                .discountCode("discount_code")
                .metadata(
                    PaymentCreateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentLink(true)
                .returnUrl("return_url")
                .showSavedPaymentMethods(true)
                .taxId("tax_id")
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
        assertThat(body.productCart())
            .containsExactly(
                OneTimeProductCartItem.builder()
                    .productId("product_id")
                    .quantity(0L)
                    .amount(0L)
                    .build()
            )
        assertThat(body.allowedPaymentMethodTypes().getOrNull())
            .containsExactly(PaymentCreateParams.AllowedPaymentMethodType.CREDIT)
        assertThat(body.billingCurrency()).contains(PaymentCreateParams.BillingCurrency.AED)
        assertThat(body.discountCode()).contains("discount_code")
        assertThat(body.metadata())
            .contains(
                PaymentCreateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.paymentLink()).contains(true)
        assertThat(body.returnUrl()).contains("return_url")
        assertThat(body.showSavedPaymentMethods()).contains(true)
        assertThat(body.taxId()).contains("tax_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PaymentCreateParams.builder()
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
                .addProductCart(
                    OneTimeProductCartItem.builder().productId("product_id").quantity(0L).build()
                )
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
        assertThat(body.productCart())
            .containsExactly(
                OneTimeProductCartItem.builder().productId("product_id").quantity(0L).build()
            )
    }
}
