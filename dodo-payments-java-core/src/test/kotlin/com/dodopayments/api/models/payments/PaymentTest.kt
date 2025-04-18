// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.payments

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentTest {

    @Test
    fun create() {
        val payment =
            Payment.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Payment.Currency.AED)
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .addDispute(
                    Dispute.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .build()
                )
                .metadata(
                    Payment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .addRefund(
                    Refund.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0L)
                        .currency(Refund.Currency.AED)
                        .reason("reason")
                        .build()
                )
                .totalAmount(0L)
                .discountId("discount_id")
                .errorMessage("error_message")
                .paymentLink("payment_link")
                .paymentMethod("payment_method")
                .paymentMethodType("payment_method_type")
                .addProductCart(
                    Payment.ProductCart.builder().productId("product_id").quantity(0L).build()
                )
                .status(IntentStatus.SUCCEEDED)
                .subscriptionId("subscription_id")
                .tax(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(payment.businessId()).isEqualTo("business_id")
        assertThat(payment.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(payment.currency()).isEqualTo(Payment.Currency.AED)
        assertThat(payment.customer())
            .isEqualTo(
                CustomerLimitedDetails.builder()
                    .customerId("customer_id")
                    .email("email")
                    .name("name")
                    .build()
            )
        assertThat(payment.disputes())
            .containsExactly(
                Dispute.builder()
                    .amount("amount")
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .currency("currency")
                    .disputeId("dispute_id")
                    .disputeStage(DisputeStage.PRE_DISPUTE)
                    .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                    .paymentId("payment_id")
                    .build()
            )
        assertThat(payment.metadata())
            .isEqualTo(
                Payment.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(payment.paymentId()).isEqualTo("payment_id")
        assertThat(payment.refunds())
            .containsExactly(
                Refund.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .paymentId("payment_id")
                    .refundId("refund_id")
                    .status(RefundStatus.SUCCEEDED)
                    .amount(0L)
                    .currency(Refund.Currency.AED)
                    .reason("reason")
                    .build()
            )
        assertThat(payment.totalAmount()).isEqualTo(0L)
        assertThat(payment.discountId()).contains("discount_id")
        assertThat(payment.errorMessage()).contains("error_message")
        assertThat(payment.paymentLink()).contains("payment_link")
        assertThat(payment.paymentMethod()).contains("payment_method")
        assertThat(payment.paymentMethodType()).contains("payment_method_type")
        assertThat(payment.productCart().getOrNull())
            .containsExactly(
                Payment.ProductCart.builder().productId("product_id").quantity(0L).build()
            )
        assertThat(payment.status()).contains(IntentStatus.SUCCEEDED)
        assertThat(payment.subscriptionId()).contains("subscription_id")
        assertThat(payment.tax()).contains(0L)
        assertThat(payment.updatedAt()).contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val payment =
            Payment.builder()
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Payment.Currency.AED)
                .customer(
                    CustomerLimitedDetails.builder()
                        .customerId("customer_id")
                        .email("email")
                        .name("name")
                        .build()
                )
                .addDispute(
                    Dispute.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .build()
                )
                .metadata(
                    Payment.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .paymentId("payment_id")
                .addRefund(
                    Refund.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0L)
                        .currency(Refund.Currency.AED)
                        .reason("reason")
                        .build()
                )
                .totalAmount(0L)
                .discountId("discount_id")
                .errorMessage("error_message")
                .paymentLink("payment_link")
                .paymentMethod("payment_method")
                .paymentMethodType("payment_method_type")
                .addProductCart(
                    Payment.ProductCart.builder().productId("product_id").quantity(0L).build()
                )
                .status(IntentStatus.SUCCEEDED)
                .subscriptionId("subscription_id")
                .tax(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPayment =
            jsonMapper.readValue(jsonMapper.writeValueAsString(payment), jacksonTypeRef<Payment>())

        assertThat(roundtrippedPayment).isEqualTo(payment)
    }
}
