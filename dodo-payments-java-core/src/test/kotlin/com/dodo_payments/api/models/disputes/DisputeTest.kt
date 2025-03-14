// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.disputes

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DisputeTest {

    @Test
    fun createDispute() {
        val dispute =
            Dispute.builder()
                .amount("amount")
                .businessId("business_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency("currency")
                .disputeId("dispute_id")
                .disputeStage(Dispute.DisputeStage.PRE_DISPUTE)
                .disputeStatus(Dispute.DisputeStatus.DISPUTE_OPENED)
                .paymentId("payment_id")
                .build()
        assertThat(dispute).isNotNull
        assertThat(dispute.amount()).isEqualTo("amount")
        assertThat(dispute.businessId()).isEqualTo("business_id")
        assertThat(dispute.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(dispute.currency()).isEqualTo("currency")
        assertThat(dispute.disputeId()).isEqualTo("dispute_id")
        assertThat(dispute.disputeStage()).isEqualTo(Dispute.DisputeStage.PRE_DISPUTE)
        assertThat(dispute.disputeStatus()).isEqualTo(Dispute.DisputeStatus.DISPUTE_OPENED)
        assertThat(dispute.paymentId()).isEqualTo("payment_id")
    }
}
