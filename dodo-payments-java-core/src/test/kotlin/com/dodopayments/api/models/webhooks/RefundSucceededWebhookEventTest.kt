// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.refunds.RefundStatus
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RefundSucceededWebhookEventTest {

    @Test
    fun create() {
        val refundSucceededWebhookEvent =
            RefundSucceededWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundSucceededWebhookEvent.Data.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .isPartial(true)
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0)
                        .currency(Currency.AED)
                        .reason("reason")
                        .payloadType(RefundSucceededWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundSucceededWebhookEvent.Type.REFUND_SUCCEEDED)
                .build()

        assertThat(refundSucceededWebhookEvent.businessId()).isEqualTo("business_id")
        assertThat(refundSucceededWebhookEvent.data())
            .isEqualTo(
                RefundSucceededWebhookEvent.Data.builder()
                    .businessId("business_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customer(
                        CustomerLimitedDetails.builder()
                            .customerId("customer_id")
                            .email("email")
                            .name("name")
                            .phoneNumber("phone_number")
                            .build()
                    )
                    .isPartial(true)
                    .paymentId("payment_id")
                    .refundId("refund_id")
                    .status(RefundStatus.SUCCEEDED)
                    .amount(0)
                    .currency(Currency.AED)
                    .reason("reason")
                    .payloadType(RefundSucceededWebhookEvent.Data.PayloadType.REFUND)
                    .build()
            )
        assertThat(refundSucceededWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(refundSucceededWebhookEvent.type())
            .isEqualTo(RefundSucceededWebhookEvent.Type.REFUND_SUCCEEDED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val refundSucceededWebhookEvent =
            RefundSucceededWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundSucceededWebhookEvent.Data.builder()
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .isPartial(true)
                        .paymentId("payment_id")
                        .refundId("refund_id")
                        .status(RefundStatus.SUCCEEDED)
                        .amount(0)
                        .currency(Currency.AED)
                        .reason("reason")
                        .payloadType(RefundSucceededWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundSucceededWebhookEvent.Type.REFUND_SUCCEEDED)
                .build()

        val roundtrippedRefundSucceededWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(refundSucceededWebhookEvent),
                jacksonTypeRef<RefundSucceededWebhookEvent>(),
            )

        assertThat(roundtrippedRefundSucceededWebhookEvent).isEqualTo(refundSucceededWebhookEvent)
    }
}
