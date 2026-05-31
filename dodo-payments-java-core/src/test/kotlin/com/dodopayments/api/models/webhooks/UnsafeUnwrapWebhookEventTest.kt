// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.jsonMapper
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.dodopayments.api.models.creditentitlements.CbbOverageBehavior
import com.dodopayments.api.models.creditentitlements.balances.CreditLedgerEntry
import com.dodopayments.api.models.discounts.DiscountDetail
import com.dodopayments.api.models.discounts.DiscountType
import com.dodopayments.api.models.disputes.Dispute
import com.dodopayments.api.models.disputes.DisputeStage
import com.dodopayments.api.models.disputes.DisputeStatus
import com.dodopayments.api.models.entitlements.grants.EntitlementGrant
import com.dodopayments.api.models.entitlements.grants.LicenseKeyGrant
import com.dodopayments.api.models.licensekeys.LicenseKey
import com.dodopayments.api.models.licensekeys.LicenseKeyStatus
import com.dodopayments.api.models.misc.CountryCode
import com.dodopayments.api.models.misc.Currency
import com.dodopayments.api.models.payments.BillingAddress
import com.dodopayments.api.models.payments.CustomFieldResponse
import com.dodopayments.api.models.payments.CustomerLimitedDetails
import com.dodopayments.api.models.payments.IntentStatus
import com.dodopayments.api.models.payments.Payment
import com.dodopayments.api.models.payments.PaymentRefundStatus
import com.dodopayments.api.models.payments.RefundListItem
import com.dodopayments.api.models.products.DigitalProductDelivery
import com.dodopayments.api.models.products.DigitalProductDeliveryFile
import com.dodopayments.api.models.refunds.Refund
import com.dodopayments.api.models.refunds.RefundStatus
import com.dodopayments.api.models.subscriptions.AddonCartResponseItem
import com.dodopayments.api.models.subscriptions.CancellationFeedback
import com.dodopayments.api.models.subscriptions.CreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.MeterCartResponseItem
import com.dodopayments.api.models.subscriptions.MeterCreditEntitlementCartResponse
import com.dodopayments.api.models.subscriptions.ScheduledPlanChange
import com.dodopayments.api.models.subscriptions.Subscription
import com.dodopayments.api.models.subscriptions.SubscriptionStatus
import com.dodopayments.api.models.subscriptions.TimeInterval
import com.dodopayments.api.models.webhooks.AbandonedCheckoutDetectedWebhookEvent
import com.dodopayments.api.models.webhooks.AbandonedCheckoutRecoveredWebhookEvent
import com.dodopayments.api.models.webhooks.CreditAddedWebhookEvent
import com.dodopayments.api.models.webhooks.CreditBalanceLowWebhookEvent
import com.dodopayments.api.models.webhooks.CreditDeductedWebhookEvent
import com.dodopayments.api.models.webhooks.CreditExpiredWebhookEvent
import com.dodopayments.api.models.webhooks.CreditManualAdjustmentWebhookEvent
import com.dodopayments.api.models.webhooks.CreditOverageChargedWebhookEvent
import com.dodopayments.api.models.webhooks.CreditOverageResetWebhookEvent
import com.dodopayments.api.models.webhooks.CreditRolledOverWebhookEvent
import com.dodopayments.api.models.webhooks.CreditRolloverForfeitedWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeAcceptedWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeCancelledWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeChallengedWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeExpiredWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeLostWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeOpenedWebhookEvent
import com.dodopayments.api.models.webhooks.DisputeWonWebhookEvent
import com.dodopayments.api.models.webhooks.DunningRecoveredWebhookEvent
import com.dodopayments.api.models.webhooks.DunningStartedWebhookEvent
import com.dodopayments.api.models.webhooks.EntitlementGrantCreatedWebhookEvent
import com.dodopayments.api.models.webhooks.EntitlementGrantDeliveredWebhookEvent
import com.dodopayments.api.models.webhooks.EntitlementGrantFailedWebhookEvent
import com.dodopayments.api.models.webhooks.EntitlementGrantRevokedWebhookEvent
import com.dodopayments.api.models.webhooks.LicenseKeyCreatedWebhookEvent
import com.dodopayments.api.models.webhooks.PaymentCancelledWebhookEvent
import com.dodopayments.api.models.webhooks.PaymentFailedWebhookEvent
import com.dodopayments.api.models.webhooks.PaymentProcessingWebhookEvent
import com.dodopayments.api.models.webhooks.PaymentSucceededWebhookEvent
import com.dodopayments.api.models.webhooks.RefundFailedWebhookEvent
import com.dodopayments.api.models.webhooks.RefundSucceededWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionActiveWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionCancelledWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionExpiredWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionFailedWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionOnHoldWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionPlanChangedWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionRenewedWebhookEvent
import com.dodopayments.api.models.webhooks.SubscriptionUpdatedWebhookEvent
import com.dodopayments.api.models.webhooks.UnsafeUnwrapWebhookEvent
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnsafeUnwrapWebhookEventTest {

    @Test
    fun ofAbandonedCheckoutDetected() {
      val abandonedCheckoutDetected = AbandonedCheckoutDetectedWebhookEvent.builder()
          .businessId("business_id")
          .data(AbandonedCheckoutDetectedWebhookEvent.Data.builder()
              .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .abandonmentReason(AbandonedCheckoutDetectedWebhookEvent.Data.AbandonmentReason.PAYMENT_FAILED)
              .customerId("customer_id")
              .paymentId("payment_id")
              .status(AbandonedCheckoutDetectedWebhookEvent.Data.Status.ABANDONED)
              .recoveredPaymentId("recovered_payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofAbandonedCheckoutDetected(abandonedCheckoutDetected)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).contains(abandonedCheckoutDetected)
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofAbandonedCheckoutDetectedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofAbandonedCheckoutDetected(AbandonedCheckoutDetectedWebhookEvent.builder()
          .businessId("business_id")
          .data(AbandonedCheckoutDetectedWebhookEvent.Data.builder()
              .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .abandonmentReason(AbandonedCheckoutDetectedWebhookEvent.Data.AbandonmentReason.PAYMENT_FAILED)
              .customerId("customer_id")
              .paymentId("payment_id")
              .status(AbandonedCheckoutDetectedWebhookEvent.Data.Status.ABANDONED)
              .recoveredPaymentId("recovered_payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofAbandonedCheckoutRecovered() {
      val abandonedCheckoutRecovered = AbandonedCheckoutRecoveredWebhookEvent.builder()
          .businessId("business_id")
          .data(AbandonedCheckoutRecoveredWebhookEvent.Data.builder()
              .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .abandonmentReason(AbandonedCheckoutRecoveredWebhookEvent.Data.AbandonmentReason.PAYMENT_FAILED)
              .customerId("customer_id")
              .paymentId("payment_id")
              .status(AbandonedCheckoutRecoveredWebhookEvent.Data.Status.ABANDONED)
              .recoveredPaymentId("recovered_payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofAbandonedCheckoutRecovered(abandonedCheckoutRecovered)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).contains(abandonedCheckoutRecovered)
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofAbandonedCheckoutRecoveredRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofAbandonedCheckoutRecovered(AbandonedCheckoutRecoveredWebhookEvent.builder()
          .businessId("business_id")
          .data(AbandonedCheckoutRecoveredWebhookEvent.Data.builder()
              .abandonedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .abandonmentReason(AbandonedCheckoutRecoveredWebhookEvent.Data.AbandonmentReason.PAYMENT_FAILED)
              .customerId("customer_id")
              .paymentId("payment_id")
              .status(AbandonedCheckoutRecoveredWebhookEvent.Data.Status.ABANDONED)
              .recoveredPaymentId("recovered_payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditAdded() {
      val creditAdded = CreditAddedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditAdded(creditAdded)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).contains(creditAdded)
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditAddedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditAdded(CreditAddedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditBalanceLow() {
      val creditBalanceLow = CreditBalanceLowWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditBalanceLowWebhookEvent.Data.builder()
              .availableBalance("available_balance")
              .creditEntitlementId("credit_entitlement_id")
              .creditEntitlementName("credit_entitlement_name")
              .customerId("customer_id")
              .subscriptionCreditsAmount("subscription_credits_amount")
              .subscriptionId("subscription_id")
              .thresholdAmount("threshold_amount")
              .thresholdPercent(0)
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditBalanceLow(creditBalanceLow)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).contains(creditBalanceLow)
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditBalanceLowRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditBalanceLow(CreditBalanceLowWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditBalanceLowWebhookEvent.Data.builder()
              .availableBalance("available_balance")
              .creditEntitlementId("credit_entitlement_id")
              .creditEntitlementName("credit_entitlement_name")
              .customerId("customer_id")
              .subscriptionCreditsAmount("subscription_credits_amount")
              .subscriptionId("subscription_id")
              .thresholdAmount("threshold_amount")
              .thresholdPercent(0)
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditDeducted() {
      val creditDeducted = CreditDeductedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditDeducted(creditDeducted)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).contains(creditDeducted)
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditDeductedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditDeducted(CreditDeductedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditExpired() {
      val creditExpired = CreditExpiredWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditExpired(creditExpired)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).contains(creditExpired)
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditExpiredRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditExpired(CreditExpiredWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditManualAdjustment() {
      val creditManualAdjustment = CreditManualAdjustmentWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditManualAdjustment(creditManualAdjustment)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).contains(creditManualAdjustment)
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditManualAdjustmentRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditManualAdjustment(CreditManualAdjustmentWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditOverageCharged() {
      val creditOverageCharged = CreditOverageChargedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditOverageCharged(creditOverageCharged)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).contains(creditOverageCharged)
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditOverageChargedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditOverageCharged(CreditOverageChargedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditOverageReset() {
      val creditOverageReset = CreditOverageResetWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditOverageReset(creditOverageReset)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).contains(creditOverageReset)
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditOverageResetRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditOverageReset(CreditOverageResetWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditRolledOver() {
      val creditRolledOver = CreditRolledOverWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditRolledOver(creditRolledOver)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).contains(creditRolledOver)
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditRolledOverRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditRolledOver(CreditRolledOverWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofCreditRolloverForfeited() {
      val creditRolloverForfeited = CreditRolloverForfeitedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditRolloverForfeited(creditRolloverForfeited)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).contains(creditRolloverForfeited)
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofCreditRolloverForfeitedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofCreditRolloverForfeited(CreditRolloverForfeitedWebhookEvent.builder()
          .businessId("business_id")
          .data(CreditLedgerEntry.builder()
              .id("id")
              .amount("amount")
              .balanceAfter("balance_after")
              .balanceBefore("balance_before")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .creditEntitlementId("credit_entitlement_id")
              .customerId("customer_id")
              .isCredit(true)
              .overageAfter("overage_after")
              .overageBefore("overage_before")
              .transactionType(CreditLedgerEntry.TransactionType.CREDIT_ADDED)
              .description("description")
              .grantId("grant_id")
              .referenceId("reference_id")
              .referenceType("reference_type")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeAccepted() {
      val disputeAccepted = DisputeAcceptedWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeAccepted(disputeAccepted)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).contains(disputeAccepted)
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeAcceptedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeAccepted(DisputeAcceptedWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeCancelled() {
      val disputeCancelled = DisputeCancelledWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeCancelled(disputeCancelled)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).contains(disputeCancelled)
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeCancelledRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeCancelled(DisputeCancelledWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeChallenged() {
      val disputeChallenged = DisputeChallengedWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeChallenged(disputeChallenged)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).contains(disputeChallenged)
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeChallengedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeChallenged(DisputeChallengedWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeExpired() {
      val disputeExpired = DisputeExpiredWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeExpired(disputeExpired)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).contains(disputeExpired)
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeExpiredRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeExpired(DisputeExpiredWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeLost() {
      val disputeLost = DisputeLostWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeLost(disputeLost)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).contains(disputeLost)
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeLostRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeLost(DisputeLostWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeOpened() {
      val disputeOpened = DisputeOpenedWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeOpened(disputeOpened)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).contains(disputeOpened)
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeOpenedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeOpened(DisputeOpenedWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDisputeWon() {
      val disputeWon = DisputeWonWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeWon(disputeWon)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).contains(disputeWon)
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDisputeWonRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDisputeWon(DisputeWonWebhookEvent.builder()
          .businessId("business_id")
          .data(Dispute.builder()
              .amount("amount")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency("currency")
              .disputeId("dispute_id")
              .disputeStage(DisputeStage.PRE_DISPUTE)
              .disputeStatus(DisputeStatus.DISPUTE_OPENED)
              .paymentId("payment_id")
              .isResolvedByRdr(true)
              .remarks("remarks")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDunningRecovered() {
      val dunningRecovered = DunningRecoveredWebhookEvent.builder()
          .businessId("business_id")
          .data(DunningRecoveredWebhookEvent.Data.builder()
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .status(DunningRecoveredWebhookEvent.Data.Status.RECOVERING)
              .subscriptionId("subscription_id")
              .triggerState(DunningRecoveredWebhookEvent.Data.TriggerState.ON_HOLD)
              .paymentId("payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDunningRecovered(dunningRecovered)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).contains(dunningRecovered)
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDunningRecoveredRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDunningRecovered(DunningRecoveredWebhookEvent.builder()
          .businessId("business_id")
          .data(DunningRecoveredWebhookEvent.Data.builder()
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .status(DunningRecoveredWebhookEvent.Data.Status.RECOVERING)
              .subscriptionId("subscription_id")
              .triggerState(DunningRecoveredWebhookEvent.Data.TriggerState.ON_HOLD)
              .paymentId("payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofDunningStarted() {
      val dunningStarted = DunningStartedWebhookEvent.builder()
          .businessId("business_id")
          .data(DunningStartedWebhookEvent.Data.builder()
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .status(DunningStartedWebhookEvent.Data.Status.RECOVERING)
              .subscriptionId("subscription_id")
              .triggerState(DunningStartedWebhookEvent.Data.TriggerState.ON_HOLD)
              .paymentId("payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDunningStarted(dunningStarted)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).contains(dunningStarted)
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofDunningStartedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofDunningStarted(DunningStartedWebhookEvent.builder()
          .businessId("business_id")
          .data(DunningStartedWebhookEvent.Data.builder()
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .status(DunningStartedWebhookEvent.Data.Status.RECOVERING)
              .subscriptionId("subscription_id")
              .triggerState(DunningStartedWebhookEvent.Data.TriggerState.ON_HOLD)
              .paymentId("payment_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofEntitlementGrantCreated() {
      val entitlementGrantCreated = EntitlementGrantCreatedWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantCreated(entitlementGrantCreated)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).contains(entitlementGrantCreated)
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofEntitlementGrantCreatedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantCreated(EntitlementGrantCreatedWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofEntitlementGrantDelivered() {
      val entitlementGrantDelivered = EntitlementGrantDeliveredWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantDelivered(entitlementGrantDelivered)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).contains(entitlementGrantDelivered)
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofEntitlementGrantDeliveredRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantDelivered(EntitlementGrantDeliveredWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofEntitlementGrantFailed() {
      val entitlementGrantFailed = EntitlementGrantFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantFailed(entitlementGrantFailed)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).contains(entitlementGrantFailed)
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofEntitlementGrantFailedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantFailed(EntitlementGrantFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofEntitlementGrantRevoked() {
      val entitlementGrantRevoked = EntitlementGrantRevokedWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantRevoked(entitlementGrantRevoked)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).contains(entitlementGrantRevoked)
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofEntitlementGrantRevokedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofEntitlementGrantRevoked(EntitlementGrantRevokedWebhookEvent.builder()
          .businessId("business_id")
          .data(EntitlementGrant.builder()
              .id("id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customerId("customer_id")
              .entitlementId("entitlement_id")
              .metadata(EntitlementGrant.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .status(EntitlementGrant.Status.PENDING)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .deliveredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .digitalProductDelivery(DigitalProductDelivery.builder()
                  .addFile(DigitalProductDeliveryFile.builder()
                      .downloadUrl("download_url")
                      .expiresIn(0L)
                      .fileId("file_id")
                      .filename("filename")
                      .contentType("content_type")
                      .fileSize(0L)
                      .build())
                  .externalUrl("external_url")
                  .instructions("instructions")
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .licenseKey(LicenseKeyGrant.builder()
                  .activationsUsed(0)
                  .key("key")
                  .activationsLimit(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .build())
              .oauthExpiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .oauthUrl("oauth_url")
              .paymentId("payment_id")
              .revocationReason("revocation_reason")
              .revokedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofLicenseKeyCreated() {
      val licenseKeyCreated = LicenseKeyCreatedWebhookEvent.builder()
          .businessId("business_id")
          .data(LicenseKey.builder()
              .id("lic_123")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
              .customerId("cus_123")
              .instancesCount(0)
              .key("key")
              .productId("product_id")
              .source(LicenseKey.Source.AUTO)
              .status(LicenseKeyStatus.ACTIVE)
              .activationsLimit(5)
              .expiresAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
              .paymentId("payment_id")
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofLicenseKeyCreated(licenseKeyCreated)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).contains(licenseKeyCreated)
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofLicenseKeyCreatedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofLicenseKeyCreated(LicenseKeyCreatedWebhookEvent.builder()
          .businessId("business_id")
          .data(LicenseKey.builder()
              .id("lic_123")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
              .customerId("cus_123")
              .instancesCount(0)
              .key("key")
              .productId("product_id")
              .source(LicenseKey.Source.AUTO)
              .status(LicenseKeyStatus.ACTIVE)
              .activationsLimit(5)
              .expiresAt(OffsetDateTime.parse("2024-12-31T23:59:59Z"))
              .paymentId("payment_id")
              .subscriptionId("subscription_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentCancelled() {
      val paymentCancelled = PaymentCancelledWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentCancelled(paymentCancelled)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).contains(paymentCancelled)
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofPaymentCancelledRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentCancelled(PaymentCancelledWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentFailed() {
      val paymentFailed = PaymentFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentFailed(paymentFailed)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).contains(paymentFailed)
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofPaymentFailedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentFailed(PaymentFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentProcessing() {
      val paymentProcessing = PaymentProcessingWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentProcessing(paymentProcessing)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).contains(paymentProcessing)
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofPaymentProcessingRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentProcessing(PaymentProcessingWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofPaymentSucceeded() {
      val paymentSucceeded = PaymentSucceededWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentSucceeded(paymentSucceeded)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).contains(paymentSucceeded)
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofPaymentSucceededRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofPaymentSucceeded(PaymentSucceededWebhookEvent.builder()
          .businessId("business_id")
          .data(Payment.builder()
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .brandId("brand_id")
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .digitalProductsDelivered(true)
              .addDispute(Dispute.builder()
                  .amount("amount")
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .currency("currency")
                  .disputeId("dispute_id")
                  .disputeStage(DisputeStage.PRE_DISPUTE)
                  .disputeStatus(DisputeStatus.DISPUTE_OPENED)
                  .paymentId("payment_id")
                  .isResolvedByRdr(true)
                  .remarks("remarks")
                  .build())
              .metadata(Payment.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .addRefund(RefundListItem.builder()
                  .businessId("business_id")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .isPartial(true)
                  .paymentId("payment_id")
                  .refundId("refund_id")
                  .status(RefundStatus.SUCCEEDED)
                  .amount(0)
                  .currency(Currency.AED)
                  .reason("reason")
                  .build())
              .settlementAmount(0)
              .settlementCurrency(Currency.AED)
              .totalAmount(0)
              .cardHolderName("card_holder_name")
              .cardIssuingCountry(CountryCode.AF)
              .cardLastFour("card_last_four")
              .cardNetwork("card_network")
              .cardType("card_type")
              .checkoutSessionId("checkout_session_id")
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .errorCode("error_code")
              .errorMessage("error_message")
              .invoiceId("invoice_id")
              .invoiceUrl("invoice_url")
              .paymentLink("payment_link")
              .paymentMethod("payment_method")
              .paymentMethodType("payment_method_type")
              .addProductCart(Payment.ProductCart.builder()
                  .productId("product_id")
                  .quantity(0)
                  .build())
              .refundStatus(PaymentRefundStatus.PARTIAL)
              .settlementTax(0)
              .status(IntentStatus.SUCCEEDED)
              .subscriptionId("subscription_id")
              .tax(0)
              .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofRefundFailed() {
      val refundFailed = RefundFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(Refund.builder()
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .isPartial(true)
              .metadata(Refund.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .refundId("refund_id")
              .status(RefundStatus.SUCCEEDED)
              .amount(0)
              .currency(Currency.AED)
              .reason("reason")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofRefundFailed(refundFailed)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).contains(refundFailed)
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofRefundFailedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofRefundFailed(RefundFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(Refund.builder()
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .isPartial(true)
              .metadata(Refund.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .refundId("refund_id")
              .status(RefundStatus.SUCCEEDED)
              .amount(0)
              .currency(Currency.AED)
              .reason("reason")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofRefundSucceeded() {
      val refundSucceeded = RefundSucceededWebhookEvent.builder()
          .businessId("business_id")
          .data(Refund.builder()
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .isPartial(true)
              .metadata(Refund.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .refundId("refund_id")
              .status(RefundStatus.SUCCEEDED)
              .amount(0)
              .currency(Currency.AED)
              .reason("reason")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofRefundSucceeded(refundSucceeded)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).contains(refundSucceeded)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofRefundSucceededRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofRefundSucceeded(RefundSucceededWebhookEvent.builder()
          .businessId("business_id")
          .data(Refund.builder()
              .businessId("business_id")
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .isPartial(true)
              .metadata(Refund.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .paymentId("payment_id")
              .refundId("refund_id")
              .status(RefundStatus.SUCCEEDED)
              .amount(0)
              .currency(Currency.AED)
              .reason("reason")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionActive() {
      val subscriptionActive = SubscriptionActiveWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionActive(subscriptionActive)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).contains(subscriptionActive)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionActiveRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionActive(SubscriptionActiveWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionCancelled() {
      val subscriptionCancelled = SubscriptionCancelledWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionCancelled(subscriptionCancelled)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).contains(subscriptionCancelled)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionCancelledRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionCancelled(SubscriptionCancelledWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionExpired() {
      val subscriptionExpired = SubscriptionExpiredWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionExpired(subscriptionExpired)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).contains(subscriptionExpired)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionExpiredRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionExpired(SubscriptionExpiredWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionFailed() {
      val subscriptionFailed = SubscriptionFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionFailed(subscriptionFailed)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).contains(subscriptionFailed)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionFailedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionFailed(SubscriptionFailedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionOnHold() {
      val subscriptionOnHold = SubscriptionOnHoldWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionOnHold(subscriptionOnHold)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).contains(subscriptionOnHold)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionOnHoldRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionOnHold(SubscriptionOnHoldWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionPlanChanged() {
      val subscriptionPlanChanged = SubscriptionPlanChangedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionPlanChanged(subscriptionPlanChanged)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).contains(subscriptionPlanChanged)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionPlanChangedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionPlanChanged(SubscriptionPlanChangedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionRenewed() {
      val subscriptionRenewed = SubscriptionRenewedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionRenewed(subscriptionRenewed)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).contains(subscriptionRenewed)
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).isEmpty
    }

    @Test
    fun ofSubscriptionRenewedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionRenewed(SubscriptionRenewedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    @Test
    fun ofSubscriptionUpdated() {
      val subscriptionUpdated = SubscriptionUpdatedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionUpdated(subscriptionUpdated)

      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutDetected()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.abandonedCheckoutRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditAdded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditBalanceLow()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditDeducted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditManualAdjustment()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageCharged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditOverageReset()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolledOver()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.creditRolloverForfeited()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeAccepted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeChallenged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeLost()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeOpened()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.disputeWon()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningRecovered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.dunningStarted()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantDelivered()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.entitlementGrantRevoked()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.licenseKeyCreated()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentProcessing()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.paymentSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.refundSucceeded()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionActive()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionCancelled()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionExpired()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionFailed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionOnHold()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionPlanChanged()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionRenewed()).isEmpty
      assertThat(unsafeUnwrapWebhookEvent.subscriptionUpdated()).contains(subscriptionUpdated)
    }

    @Test
    fun ofSubscriptionUpdatedRoundtrip() {
      val jsonMapper = jsonMapper()
      val unsafeUnwrapWebhookEvent = UnsafeUnwrapWebhookEvent.ofSubscriptionUpdated(SubscriptionUpdatedWebhookEvent.builder()
          .businessId("business_id")
          .data(Subscription.builder()
              .addAddon(AddonCartResponseItem.builder()
                  .addonId("addon_id")
                  .quantity(0)
                  .build())
              .billing(BillingAddress.builder()
                  .country(CountryCode.AF)
                  .city("city")
                  .state("state")
                  .street("street")
                  .zipcode("zipcode")
                  .build())
              .cancelAtNextBillingDate(true)
              .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCreditEntitlementCart(CreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .creditEntitlementName("credit_entitlement_name")
                  .creditsAmount("credits_amount")
                  .overageBalance("overage_balance")
                  .overageBehavior(CbbOverageBehavior.FORGIVE_AT_RESET)
                  .overageEnabled(true)
                  .productId("product_id")
                  .remainingBalance("remaining_balance")
                  .rolloverEnabled(true)
                  .unit("unit")
                  .expiresAfterDays(0)
                  .lowBalanceThresholdPercent(0)
                  .maxRolloverCount(0)
                  .overageLimit("overage_limit")
                  .rolloverPercentage(0)
                  .rolloverTimeframeCount(0)
                  .rolloverTimeframeInterval(TimeInterval.DAY)
                  .build())
              .currency(Currency.AED)
              .customer(CustomerLimitedDetails.builder()
                  .customerId("customer_id")
                  .email("email")
                  .name("name")
                  .metadata(CustomerLimitedDetails.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .phoneNumber("phone_number")
                  .build())
              .metadata(Subscription.Metadata.builder()
                  .putAdditionalProperty("foo", JsonValue.from("string"))
                  .build())
              .addMeterCreditEntitlementCart(MeterCreditEntitlementCartResponse.builder()
                  .creditEntitlementId("credit_entitlement_id")
                  .meterId("meter_id")
                  .meterName("meter_name")
                  .meterUnitsPerCredit("meter_units_per_credit")
                  .productId("product_id")
                  .build())
              .addMeter(MeterCartResponseItem.builder()
                  .currency(Currency.AED)
                  .freeThreshold(0L)
                  .measurementUnit("measurement_unit")
                  .meterId("meter_id")
                  .name("name")
                  .description("description")
                  .pricePerUnit("10.50")
                  .build())
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
              .cancellationComment("cancellation_comment")
              .cancellationFeedback(CancellationFeedback.TOO_EXPENSIVE)
              .cancelledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .addCustomFieldResponse(CustomFieldResponse.builder()
                  .key("key")
                  .value("value")
                  .build())
              .customerBusinessName("customer_business_name")
              .discountCyclesRemaining(0)
              .discountId("discount_id")
              .addDiscount(DiscountDetail.builder()
                  .amount(0)
                  .businessId("business_id")
                  .code("code")
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .discountId("discount_id")
                  .metadata(DiscountDetail.Metadata.builder()
                      .putAdditionalProperty("foo", JsonValue.from("string"))
                      .build())
                  .position(0)
                  .preserveOnPlanChange(true)
                  .addRestrictedTo("string")
                  .timesUsed(0)
                  .type(DiscountType.PERCENTAGE)
                  .cyclesRemaining(0)
                  .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .name("name")
                  .subscriptionCycles(0)
                  .usageLimit(0)
                  .build())
              .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .paymentMethodId("payment_method_id")
              .scheduledChange(ScheduledPlanChange.builder()
                  .id("id")
                  .addAddon(ScheduledPlanChange.Addon.builder()
                      .addonId("addon_id")
                      .name("name")
                      .quantity(0)
                      .build())
                  .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .effectiveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                  .productId("product_id")
                  .quantity(0)
                  .productDescription("product_description")
                  .productName("product_name")
                  .build())
              .taxId("tax_id")
              .build())
          .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build())

      val roundtrippedUnsafeUnwrapWebhookEvent = jsonMapper.readValue(jsonMapper.writeValueAsString(unsafeUnwrapWebhookEvent), jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      assertThat(roundtrippedUnsafeUnwrapWebhookEvent).isEqualTo(unsafeUnwrapWebhookEvent)
    }

    enum class IncompatibleJsonShapeTestCase(
        val value: JsonValue
    ) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf(
          "invalid", "array"
        ))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
      val unsafeUnwrapWebhookEvent = jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnsafeUnwrapWebhookEvent>())

      val e = assertThrows<DodoPaymentsInvalidDataException> {
        unsafeUnwrapWebhookEvent.validate()
      }
      assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
