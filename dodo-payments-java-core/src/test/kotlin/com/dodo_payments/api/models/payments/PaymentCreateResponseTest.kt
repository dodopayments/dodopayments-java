// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.payments

import com.dodo_payments.api.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PaymentCreateResponseTest {

    @Test
    fun createPaymentCreateResponse() {
        val paymentCreateResponse =
            PaymentCreateResponse.builder()
                .clientSecret("client_secret")
                .customer(
                    PaymentCreateResponse.Customer.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .metadata(
                    PaymentCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .totalAmount(0L)
                .discountId("discount_id")
                .paymentLink("payment_link")
                .addProductCart(
                    PaymentCreateResponse.ProductCart.builder()
                        .productId("product_id")
                        .quantity(0L)
                        .amount(0L)
                        .build()
                )
                .build()
        assertThat(paymentCreateResponse).isNotNull
        assertThat(paymentCreateResponse.clientSecret()).isEqualTo("client_secret")
        assertThat(paymentCreateResponse.customer())
            .isEqualTo(
                PaymentCreateResponse.Customer.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(paymentCreateResponse.metadata())
            .isEqualTo(
                PaymentCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(paymentCreateResponse.paymentId()).isEqualTo("payment_id")
        assertThat(paymentCreateResponse.totalAmount()).isEqualTo(0L)
        assertThat(paymentCreateResponse.discountId()).contains("discount_id")
        assertThat(paymentCreateResponse.paymentLink()).contains("payment_link")
        assertThat(paymentCreateResponse.productCart().get())
            .containsExactly(
                PaymentCreateResponse.ProductCart.builder()
                    .productId("product_id")
                    .quantity(0L)
                    .amount(0L)
                    .build()
            )
    }
}
