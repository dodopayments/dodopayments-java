// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.refunds.RefundStatus
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnwrapWebhookEventTest {

    @Test
    fun ofDisputeAccepted() {
        val disputeAccepted =
            DisputeAcceptedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeAcceptedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeAccepted(disputeAccepted)

        assertThat(unwrapWebhookEvent.disputeAccepted()).contains(disputeAccepted)
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeAcceptedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeAccepted(
                DisputeAcceptedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeAcceptedWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeAcceptedWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeAcceptedWebhookEvent.Type.DISPUTE_ACCEPTED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofDisputeCancelled() {
        val disputeCancelled =
            DisputeCancelledWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeCancelledWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeCancelledWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeCancelledWebhookEvent.Type.DISPUTE_CANCELLED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeCancelled(disputeCancelled)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).contains(disputeCancelled)
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeCancelledRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeCancelled(
                DisputeCancelledWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeCancelledWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeCancelledWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeCancelledWebhookEvent.Type.DISPUTE_CANCELLED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofDisputeChallenged() {
        val disputeChallenged =
            DisputeChallengedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeChallengedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeChallenged(disputeChallenged)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).contains(disputeChallenged)
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeChallengedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeChallenged(
                DisputeChallengedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeChallengedWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeChallengedWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeChallengedWebhookEvent.Type.DISPUTE_CHALLENGED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofDisputeExpired() {
        val disputeExpired =
            DisputeExpiredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeExpiredWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeExpiredWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeExpired(disputeExpired)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).contains(disputeExpired)
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeExpiredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeExpired(
                DisputeExpiredWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeExpiredWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeExpiredWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeExpiredWebhookEvent.Type.DISPUTE_EXPIRED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofDisputeLost() {
        val disputeLost =
            DisputeLostWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeLostWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeLost(disputeLost)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).contains(disputeLost)
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeLostRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeLost(
                DisputeLostWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeLostWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeLostWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeLostWebhookEvent.Type.DISPUTE_LOST)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofDisputeOpened() {
        val disputeOpened =
            DisputeOpenedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeOpenedWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeOpenedWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeOpened(disputeOpened)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).contains(disputeOpened)
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeOpenedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeOpened(
                DisputeOpenedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeOpenedWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeOpenedWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeOpenedWebhookEvent.Type.DISPUTE_OPENED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofDisputeWon() {
        val disputeWon =
            DisputeWonWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    DisputeWonWebhookEvent.Data.builder()
                        .amount("amount")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency("currency")
                        .disputeId("dispute_id")
                        .disputeStage(DisputeStage.PRE_DISPUTE)
                        .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                        .paymentId("payment_id")
                        .remarks("remarks")
                        .payloadType(DisputeWonWebhookEvent.Data.PayloadType.DISPUTE)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(DisputeWonWebhookEvent.Type.DISPUTE_WON)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofDisputeWon(disputeWon)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).contains(disputeWon)
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofDisputeWonRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofDisputeWon(
                DisputeWonWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        DisputeWonWebhookEvent.Data.builder()
                            .amount("amount")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency("currency")
                            .disputeId("dispute_id")
                            .disputeStage(DisputeStage.PRE_DISPUTE)
                            .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                            .paymentId("payment_id")
                            .remarks("remarks")
                            .payloadType(DisputeWonWebhookEvent.Data.PayloadType.DISPUTE)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(DisputeWonWebhookEvent.Type.DISPUTE_WON)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofLicenseKeyCreated() {
        val licenseKeyCreated =
            LicenseKeyCreatedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    LicenseKeyCreatedWebhookEvent.Data.builder()
                        .id("lic_123")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .customerId("cus_123")
                        .instancesCount(0)
                        .key("key")
                        .paymentId("payment_id")
                        .productId("product_id")
                        .status(LicenseKeyStatus.ACTIVE)
                        .activationsLimit(5)
                        .expiresAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                        .subscriptionId("subscription_id")
                        .payloadType(LicenseKeyCreatedWebhookEvent.Data.PayloadType.LICENSE_KEY)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(LicenseKeyCreatedWebhookEvent.Type.LICENSE_KEY_CREATED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofLicenseKeyCreated(licenseKeyCreated)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).contains(licenseKeyCreated)
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofLicenseKeyCreatedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofLicenseKeyCreated(
                LicenseKeyCreatedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        LicenseKeyCreatedWebhookEvent.Data.builder()
                            .id("lic_123")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                            .customerId("cus_123")
                            .instancesCount(0)
                            .key("key")
                            .paymentId("payment_id")
                            .productId("product_id")
                            .status(LicenseKeyStatus.ACTIVE)
                            .activationsLimit(5)
                            .expiresAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
                            .subscriptionId("subscription_id")
                            .payloadType(LicenseKeyCreatedWebhookEvent.Data.PayloadType.LICENSE_KEY)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(LicenseKeyCreatedWebhookEvent.Type.LICENSE_KEY_CREATED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofPaymentCancelled() {
        val paymentCancelled =
            PaymentCancelledWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentCancelledWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
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
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentCancelledWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentCancelledWebhookEvent.Type.PAYMENT_CANCELLED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofPaymentCancelled(paymentCancelled)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).contains(paymentCancelled)
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofPaymentCancelledRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofPaymentCancelled(
                PaymentCancelledWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentCancelledWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .city("city")
                                    .country(CountryCode.AF)
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
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
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentCancelledWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentCancelledWebhookEvent.Type.PAYMENT_CANCELLED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofPaymentFailed() {
        val paymentFailed =
            PaymentFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentFailedWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
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
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentFailedWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentFailedWebhookEvent.Type.PAYMENT_FAILED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofPaymentFailed(paymentFailed)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).contains(paymentFailed)
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofPaymentFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofPaymentFailed(
                PaymentFailedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentFailedWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .city("city")
                                    .country(CountryCode.AF)
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
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
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentFailedWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentFailedWebhookEvent.Type.PAYMENT_FAILED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofPaymentProcessing() {
        val paymentProcessing =
            PaymentProcessingWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentProcessingWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
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
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentProcessingWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentProcessingWebhookEvent.Type.PAYMENT_PROCESSING)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofPaymentProcessing(paymentProcessing)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).contains(paymentProcessing)
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofPaymentProcessingRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofPaymentProcessing(
                PaymentProcessingWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentProcessingWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .city("city")
                                    .country(CountryCode.AF)
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
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
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentProcessingWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentProcessingWebhookEvent.Type.PAYMENT_PROCESSING)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofPaymentSucceeded() {
        val paymentSucceeded =
            PaymentSucceededWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    PaymentSucceededWebhookEvent.Data.builder()
                        .billing(
                            BillingAddress.builder()
                                .city("city")
                                .country(CountryCode.AF)
                                .state("state")
                                .street("street")
                                .zipcode("zipcode")
                                .build()
                        )
                        .brandId("brand_id")
                        .businessId("business_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .digitalProductsDelivered(true)
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
                                .remarks("remarks")
                                .build()
                        )
                        .metadata(
                            Payment.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .paymentId("payment_id")
                        .addRefund(
                            Payment.Refund.builder()
                                .businessId("business_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .isPartial(true)
                                .paymentId("payment_id")
                                .refundId("refund_id")
                                .status(RefundStatus.SUCCEEDED)
                                .amount(0)
                                .currency(Currency.AED)
                                .reason("reason")
                                .build()
                        )
                        .settlementAmount(0)
                        .settlementCurrency(Currency.AED)
                        .totalAmount(0)
                        .cardIssuingCountry(CountryCode.AF)
                        .cardLastFour("card_last_four")
                        .cardNetwork("card_network")
                        .cardType("card_type")
                        .checkoutSessionId("checkout_session_id")
                        .discountId("discount_id")
                        .errorCode("error_code")
                        .errorMessage("error_message")
                        .paymentLink("payment_link")
                        .paymentMethod("payment_method")
                        .paymentMethodType("payment_method_type")
                        .addProductCart(
                            Payment.ProductCart.builder()
                                .productId("product_id")
                                .quantity(0)
                                .build()
                        )
                        .settlementTax(0)
                        .status(IntentStatus.SUCCEEDED)
                        .subscriptionId("subscription_id")
                        .tax(0)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .payloadType(PaymentSucceededWebhookEvent.Data.PayloadType.PAYMENT)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(PaymentSucceededWebhookEvent.Type.PAYMENT_SUCCEEDED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofPaymentSucceeded(paymentSucceeded)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).contains(paymentSucceeded)
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofPaymentSucceededRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofPaymentSucceeded(
                PaymentSucceededWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        PaymentSucceededWebhookEvent.Data.builder()
                            .billing(
                                BillingAddress.builder()
                                    .city("city")
                                    .country(CountryCode.AF)
                                    .state("state")
                                    .street("street")
                                    .zipcode("zipcode")
                                    .build()
                            )
                            .brandId("brand_id")
                            .businessId("business_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .digitalProductsDelivered(true)
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
                                    .remarks("remarks")
                                    .build()
                            )
                            .metadata(
                                Payment.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .paymentId("payment_id")
                            .addRefund(
                                Payment.Refund.builder()
                                    .businessId("business_id")
                                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                    .isPartial(true)
                                    .paymentId("payment_id")
                                    .refundId("refund_id")
                                    .status(RefundStatus.SUCCEEDED)
                                    .amount(0)
                                    .currency(Currency.AED)
                                    .reason("reason")
                                    .build()
                            )
                            .settlementAmount(0)
                            .settlementCurrency(Currency.AED)
                            .totalAmount(0)
                            .cardIssuingCountry(CountryCode.AF)
                            .cardLastFour("card_last_four")
                            .cardNetwork("card_network")
                            .cardType("card_type")
                            .checkoutSessionId("checkout_session_id")
                            .discountId("discount_id")
                            .errorCode("error_code")
                            .errorMessage("error_message")
                            .paymentLink("payment_link")
                            .paymentMethod("payment_method")
                            .paymentMethodType("payment_method_type")
                            .addProductCart(
                                Payment.ProductCart.builder()
                                    .productId("product_id")
                                    .quantity(0)
                                    .build()
                            )
                            .settlementTax(0)
                            .status(IntentStatus.SUCCEEDED)
                            .subscriptionId("subscription_id")
                            .tax(0)
                            .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .payloadType(PaymentSucceededWebhookEvent.Data.PayloadType.PAYMENT)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(PaymentSucceededWebhookEvent.Type.PAYMENT_SUCCEEDED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofRefundFailed() {
        val refundFailed =
            RefundFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    RefundFailedWebhookEvent.Data.builder()
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
                        .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RefundFailedWebhookEvent.Type.REFUND_FAILED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofRefundFailed(refundFailed)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).contains(refundFailed)
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofRefundFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofRefundFailed(
                RefundFailedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        RefundFailedWebhookEvent.Data.builder()
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
                            .payloadType(RefundFailedWebhookEvent.Data.PayloadType.REFUND)
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(RefundFailedWebhookEvent.Type.REFUND_FAILED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofRefundSucceeded() {
        val refundSucceeded =
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

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofRefundSucceeded(refundSucceeded)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).contains(refundSucceeded)
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofRefundSucceededRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofRefundSucceeded(
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
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionActive() {
        val subscriptionActive =
            SubscriptionActiveWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionActiveWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionActiveWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionActiveWebhookEvent.Type.SUBSCRIPTION_ACTIVE)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofSubscriptionActive(subscriptionActive)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).contains(subscriptionActive)
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofSubscriptionActiveRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionActive(
                SubscriptionActiveWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionActiveWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionActiveWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionActiveWebhookEvent.Type.SUBSCRIPTION_ACTIVE)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionCancelled() {
        val subscriptionCancelled =
            SubscriptionCancelledWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionCancelledWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(
                            SubscriptionCancelledWebhookEvent.Data.PayloadType.SUBSCRIPTION
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionCancelledWebhookEvent.Type.SUBSCRIPTION_CANCELLED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofSubscriptionCancelled(subscriptionCancelled)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).contains(subscriptionCancelled)
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofSubscriptionCancelledRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionCancelled(
                SubscriptionCancelledWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionCancelledWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionCancelledWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionCancelledWebhookEvent.Type.SUBSCRIPTION_CANCELLED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionExpired() {
        val subscriptionExpired =
            SubscriptionExpiredWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionExpiredWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionExpiredWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionExpiredWebhookEvent.Type.SUBSCRIPTION_EXPIRED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofSubscriptionExpired(subscriptionExpired)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).contains(subscriptionExpired)
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofSubscriptionExpiredRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionExpired(
                SubscriptionExpiredWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionExpiredWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionExpiredWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionExpiredWebhookEvent.Type.SUBSCRIPTION_EXPIRED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionFailed() {
        val subscriptionFailed =
            SubscriptionFailedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionFailedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionFailedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionFailedWebhookEvent.Type.SUBSCRIPTION_FAILED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofSubscriptionFailed(subscriptionFailed)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).contains(subscriptionFailed)
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofSubscriptionFailedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionFailed(
                SubscriptionFailedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionFailedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionFailedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionFailedWebhookEvent.Type.SUBSCRIPTION_FAILED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionOnHold() {
        val subscriptionOnHold =
            SubscriptionOnHoldWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionOnHoldWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionOnHoldWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionOnHoldWebhookEvent.Type.SUBSCRIPTION_ON_HOLD)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofSubscriptionOnHold(subscriptionOnHold)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).contains(subscriptionOnHold)
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofSubscriptionOnHoldRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionOnHold(
                SubscriptionOnHoldWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionOnHoldWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionOnHoldWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionOnHoldWebhookEvent.Type.SUBSCRIPTION_ON_HOLD)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionPlanChanged() {
        val subscriptionPlanChanged =
            SubscriptionPlanChangedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionPlanChangedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(
                            SubscriptionPlanChangedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionPlanChangedWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
                .build()

        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionPlanChanged(subscriptionPlanChanged)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).contains(subscriptionPlanChanged)
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).isEmpty
    }

    @Test
    fun ofSubscriptionPlanChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionPlanChanged(
                SubscriptionPlanChangedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionPlanChangedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionPlanChangedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionPlanChangedWebhookEvent.Type.SUBSCRIPTION_PLAN_CHANGED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionRenewed() {
        val subscriptionRenewed =
            SubscriptionRenewedWebhookEvent.builder()
                .businessId("business_id")
                .data(
                    SubscriptionRenewedWebhookEvent.Data.builder()
                        .addAddon(
                            AddonCartResponseItem.builder().addonId("addon_id").quantity(0).build()
                        )
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
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .currency(Currency.AED)
                        .customer(
                            CustomerLimitedDetails.builder()
                                .customerId("customer_id")
                                .email("email")
                                .name("name")
                                .phoneNumber("phone_number")
                                .build()
                        )
                        .metadata(
                            Subscription.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .addMeter(
                            Subscription.Meter.builder()
                                .currency(Currency.AED)
                                .freeThreshold(0L)
                                .measurementUnit("measurement_unit")
                                .meterId("meter_id")
                                .name("name")
                                .pricePerUnit("10.50")
                                .description("description")
                                .build()
                        )
                        .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onDemand(true)
                        .paymentFrequencyCount(0)
                        .paymentFrequencyInterval(TimeInterval.DAY)
                        .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .productId("product_id")
                        .quantity(0)
                        .recurringPreTaxAmount(0)
                        .status(SubscriptionStatus.PENDING)
                        .subscriptionId("subscription_id")
                        .subscriptionPeriodCount(0)
                        .subscriptionPeriodInterval(TimeInterval.DAY)
                        .taxInclusive(true)
                        .trialPeriodDays(0)
                        .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .discountCyclesRemaining(0)
                        .discountId("discount_id")
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .taxId("tax_id")
                        .payloadType(SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofSubscriptionRenewed(subscriptionRenewed)

        assertThat(unwrapWebhookEvent.disputeAccepted()).isEmpty
        assertThat(unwrapWebhookEvent.disputeCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.disputeChallenged()).isEmpty
        assertThat(unwrapWebhookEvent.disputeExpired()).isEmpty
        assertThat(unwrapWebhookEvent.disputeLost()).isEmpty
        assertThat(unwrapWebhookEvent.disputeOpened()).isEmpty
        assertThat(unwrapWebhookEvent.disputeWon()).isEmpty
        assertThat(unwrapWebhookEvent.licenseKeyCreated()).isEmpty
        assertThat(unwrapWebhookEvent.paymentCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.paymentFailed()).isEmpty
        assertThat(unwrapWebhookEvent.paymentProcessing()).isEmpty
        assertThat(unwrapWebhookEvent.paymentSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.refundFailed()).isEmpty
        assertThat(unwrapWebhookEvent.refundSucceeded()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionActive()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionCancelled()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionExpired()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionFailed()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionOnHold()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
        assertThat(unwrapWebhookEvent.subscriptionRenewed()).contains(subscriptionRenewed)
    }

    @Test
    fun ofSubscriptionRenewedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofSubscriptionRenewed(
                SubscriptionRenewedWebhookEvent.builder()
                    .businessId("business_id")
                    .data(
                        SubscriptionRenewedWebhookEvent.Data.builder()
                            .addAddon(
                                AddonCartResponseItem.builder()
                                    .addonId("addon_id")
                                    .quantity(0)
                                    .build()
                            )
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
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .currency(Currency.AED)
                            .customer(
                                CustomerLimitedDetails.builder()
                                    .customerId("customer_id")
                                    .email("email")
                                    .name("name")
                                    .phoneNumber("phone_number")
                                    .build()
                            )
                            .metadata(
                                Subscription.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("string"))
                                    .build()
                            )
                            .addMeter(
                                Subscription.Meter.builder()
                                    .currency(Currency.AED)
                                    .freeThreshold(0L)
                                    .measurementUnit("measurement_unit")
                                    .meterId("meter_id")
                                    .name("name")
                                    .pricePerUnit("10.50")
                                    .description("description")
                                    .build()
                            )
                            .nextBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onDemand(true)
                            .paymentFrequencyCount(0)
                            .paymentFrequencyInterval(TimeInterval.DAY)
                            .previousBillingDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .productId("product_id")
                            .quantity(0)
                            .recurringPreTaxAmount(0)
                            .status(SubscriptionStatus.PENDING)
                            .subscriptionId("subscription_id")
                            .subscriptionPeriodCount(0)
                            .subscriptionPeriodInterval(TimeInterval.DAY)
                            .taxInclusive(true)
                            .trialPeriodDays(0)
                            .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .discountCyclesRemaining(0)
                            .discountId("discount_id")
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .taxId("tax_id")
                            .payloadType(
                                SubscriptionRenewedWebhookEvent.Data.PayloadType.SUBSCRIPTION
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(SubscriptionRenewedWebhookEvent.Type.SUBSCRIPTION_RENEWED)
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val unwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnwrapWebhookEvent>())

        val e = assertThrows<DodoPaymentsInvalidDataException> { unwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
