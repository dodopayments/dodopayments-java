// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
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
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

@JsonDeserialize(using = UnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnwrapWebhookEvent.Serializer::class)
class UnwrapWebhookEvent private constructor(
    private val abandonedCheckoutDetected: AbandonedCheckoutDetectedWebhookEvent? = null,
    private val abandonedCheckoutRecovered: AbandonedCheckoutRecoveredWebhookEvent? = null,
    private val creditAdded: CreditAddedWebhookEvent? = null,
    private val creditBalanceLow: CreditBalanceLowWebhookEvent? = null,
    private val creditDeducted: CreditDeductedWebhookEvent? = null,
    private val creditExpired: CreditExpiredWebhookEvent? = null,
    private val creditManualAdjustment: CreditManualAdjustmentWebhookEvent? = null,
    private val creditOverageCharged: CreditOverageChargedWebhookEvent? = null,
    private val creditOverageReset: CreditOverageResetWebhookEvent? = null,
    private val creditRolledOver: CreditRolledOverWebhookEvent? = null,
    private val creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent? = null,
    private val disputeAccepted: DisputeAcceptedWebhookEvent? = null,
    private val disputeCancelled: DisputeCancelledWebhookEvent? = null,
    private val disputeChallenged: DisputeChallengedWebhookEvent? = null,
    private val disputeExpired: DisputeExpiredWebhookEvent? = null,
    private val disputeLost: DisputeLostWebhookEvent? = null,
    private val disputeOpened: DisputeOpenedWebhookEvent? = null,
    private val disputeWon: DisputeWonWebhookEvent? = null,
    private val dunningRecovered: DunningRecoveredWebhookEvent? = null,
    private val dunningStarted: DunningStartedWebhookEvent? = null,
    private val entitlementGrantCreated: EntitlementGrantCreatedWebhookEvent? = null,
    private val entitlementGrantDelivered: EntitlementGrantDeliveredWebhookEvent? = null,
    private val entitlementGrantFailed: EntitlementGrantFailedWebhookEvent? = null,
    private val entitlementGrantRevoked: EntitlementGrantRevokedWebhookEvent? = null,
    private val licenseKeyCreated: LicenseKeyCreatedWebhookEvent? = null,
    private val paymentCancelled: PaymentCancelledWebhookEvent? = null,
    private val paymentFailed: PaymentFailedWebhookEvent? = null,
    private val paymentProcessing: PaymentProcessingWebhookEvent? = null,
    private val paymentSucceeded: PaymentSucceededWebhookEvent? = null,
    private val refundFailed: RefundFailedWebhookEvent? = null,
    private val refundSucceeded: RefundSucceededWebhookEvent? = null,
    private val subscriptionActive: SubscriptionActiveWebhookEvent? = null,
    private val subscriptionCancelled: SubscriptionCancelledWebhookEvent? = null,
    private val subscriptionExpired: SubscriptionExpiredWebhookEvent? = null,
    private val subscriptionFailed: SubscriptionFailedWebhookEvent? = null,
    private val subscriptionOnHold: SubscriptionOnHoldWebhookEvent? = null,
    private val subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent? = null,
    private val subscriptionRenewed: SubscriptionRenewedWebhookEvent? = null,
    private val subscriptionUpdated: SubscriptionUpdatedWebhookEvent? = null,
    private val _json: JsonValue? = null,

) {

    fun abandonedCheckoutDetected(): Optional<AbandonedCheckoutDetectedWebhookEvent> = Optional.ofNullable(abandonedCheckoutDetected)

    fun abandonedCheckoutRecovered(): Optional<AbandonedCheckoutRecoveredWebhookEvent> = Optional.ofNullable(abandonedCheckoutRecovered)

    fun creditAdded(): Optional<CreditAddedWebhookEvent> = Optional.ofNullable(creditAdded)

    fun creditBalanceLow(): Optional<CreditBalanceLowWebhookEvent> = Optional.ofNullable(creditBalanceLow)

    fun creditDeducted(): Optional<CreditDeductedWebhookEvent> = Optional.ofNullable(creditDeducted)

    fun creditExpired(): Optional<CreditExpiredWebhookEvent> = Optional.ofNullable(creditExpired)

    fun creditManualAdjustment(): Optional<CreditManualAdjustmentWebhookEvent> = Optional.ofNullable(creditManualAdjustment)

    fun creditOverageCharged(): Optional<CreditOverageChargedWebhookEvent> = Optional.ofNullable(creditOverageCharged)

    fun creditOverageReset(): Optional<CreditOverageResetWebhookEvent> = Optional.ofNullable(creditOverageReset)

    fun creditRolledOver(): Optional<CreditRolledOverWebhookEvent> = Optional.ofNullable(creditRolledOver)

    fun creditRolloverForfeited(): Optional<CreditRolloverForfeitedWebhookEvent> = Optional.ofNullable(creditRolloverForfeited)

    fun disputeAccepted(): Optional<DisputeAcceptedWebhookEvent> = Optional.ofNullable(disputeAccepted)

    fun disputeCancelled(): Optional<DisputeCancelledWebhookEvent> = Optional.ofNullable(disputeCancelled)

    fun disputeChallenged(): Optional<DisputeChallengedWebhookEvent> = Optional.ofNullable(disputeChallenged)

    fun disputeExpired(): Optional<DisputeExpiredWebhookEvent> = Optional.ofNullable(disputeExpired)

    fun disputeLost(): Optional<DisputeLostWebhookEvent> = Optional.ofNullable(disputeLost)

    fun disputeOpened(): Optional<DisputeOpenedWebhookEvent> = Optional.ofNullable(disputeOpened)

    fun disputeWon(): Optional<DisputeWonWebhookEvent> = Optional.ofNullable(disputeWon)

    fun dunningRecovered(): Optional<DunningRecoveredWebhookEvent> = Optional.ofNullable(dunningRecovered)

    fun dunningStarted(): Optional<DunningStartedWebhookEvent> = Optional.ofNullable(dunningStarted)

    fun entitlementGrantCreated(): Optional<EntitlementGrantCreatedWebhookEvent> = Optional.ofNullable(entitlementGrantCreated)

    fun entitlementGrantDelivered(): Optional<EntitlementGrantDeliveredWebhookEvent> = Optional.ofNullable(entitlementGrantDelivered)

    fun entitlementGrantFailed(): Optional<EntitlementGrantFailedWebhookEvent> = Optional.ofNullable(entitlementGrantFailed)

    fun entitlementGrantRevoked(): Optional<EntitlementGrantRevokedWebhookEvent> = Optional.ofNullable(entitlementGrantRevoked)

    fun licenseKeyCreated(): Optional<LicenseKeyCreatedWebhookEvent> = Optional.ofNullable(licenseKeyCreated)

    fun paymentCancelled(): Optional<PaymentCancelledWebhookEvent> = Optional.ofNullable(paymentCancelled)

    fun paymentFailed(): Optional<PaymentFailedWebhookEvent> = Optional.ofNullable(paymentFailed)

    fun paymentProcessing(): Optional<PaymentProcessingWebhookEvent> = Optional.ofNullable(paymentProcessing)

    fun paymentSucceeded(): Optional<PaymentSucceededWebhookEvent> = Optional.ofNullable(paymentSucceeded)

    fun refundFailed(): Optional<RefundFailedWebhookEvent> = Optional.ofNullable(refundFailed)

    fun refundSucceeded(): Optional<RefundSucceededWebhookEvent> = Optional.ofNullable(refundSucceeded)

    fun subscriptionActive(): Optional<SubscriptionActiveWebhookEvent> = Optional.ofNullable(subscriptionActive)

    fun subscriptionCancelled(): Optional<SubscriptionCancelledWebhookEvent> = Optional.ofNullable(subscriptionCancelled)

    fun subscriptionExpired(): Optional<SubscriptionExpiredWebhookEvent> = Optional.ofNullable(subscriptionExpired)

    fun subscriptionFailed(): Optional<SubscriptionFailedWebhookEvent> = Optional.ofNullable(subscriptionFailed)

    fun subscriptionOnHold(): Optional<SubscriptionOnHoldWebhookEvent> = Optional.ofNullable(subscriptionOnHold)

    fun subscriptionPlanChanged(): Optional<SubscriptionPlanChangedWebhookEvent> = Optional.ofNullable(subscriptionPlanChanged)

    fun subscriptionRenewed(): Optional<SubscriptionRenewedWebhookEvent> = Optional.ofNullable(subscriptionRenewed)

    fun subscriptionUpdated(): Optional<SubscriptionUpdatedWebhookEvent> = Optional.ofNullable(subscriptionUpdated)

    fun isAbandonedCheckoutDetected(): Boolean = abandonedCheckoutDetected != null

    fun isAbandonedCheckoutRecovered(): Boolean = abandonedCheckoutRecovered != null

    fun isCreditAdded(): Boolean = creditAdded != null

    fun isCreditBalanceLow(): Boolean = creditBalanceLow != null

    fun isCreditDeducted(): Boolean = creditDeducted != null

    fun isCreditExpired(): Boolean = creditExpired != null

    fun isCreditManualAdjustment(): Boolean = creditManualAdjustment != null

    fun isCreditOverageCharged(): Boolean = creditOverageCharged != null

    fun isCreditOverageReset(): Boolean = creditOverageReset != null

    fun isCreditRolledOver(): Boolean = creditRolledOver != null

    fun isCreditRolloverForfeited(): Boolean = creditRolloverForfeited != null

    fun isDisputeAccepted(): Boolean = disputeAccepted != null

    fun isDisputeCancelled(): Boolean = disputeCancelled != null

    fun isDisputeChallenged(): Boolean = disputeChallenged != null

    fun isDisputeExpired(): Boolean = disputeExpired != null

    fun isDisputeLost(): Boolean = disputeLost != null

    fun isDisputeOpened(): Boolean = disputeOpened != null

    fun isDisputeWon(): Boolean = disputeWon != null

    fun isDunningRecovered(): Boolean = dunningRecovered != null

    fun isDunningStarted(): Boolean = dunningStarted != null

    fun isEntitlementGrantCreated(): Boolean = entitlementGrantCreated != null

    fun isEntitlementGrantDelivered(): Boolean = entitlementGrantDelivered != null

    fun isEntitlementGrantFailed(): Boolean = entitlementGrantFailed != null

    fun isEntitlementGrantRevoked(): Boolean = entitlementGrantRevoked != null

    fun isLicenseKeyCreated(): Boolean = licenseKeyCreated != null

    fun isPaymentCancelled(): Boolean = paymentCancelled != null

    fun isPaymentFailed(): Boolean = paymentFailed != null

    fun isPaymentProcessing(): Boolean = paymentProcessing != null

    fun isPaymentSucceeded(): Boolean = paymentSucceeded != null

    fun isRefundFailed(): Boolean = refundFailed != null

    fun isRefundSucceeded(): Boolean = refundSucceeded != null

    fun isSubscriptionActive(): Boolean = subscriptionActive != null

    fun isSubscriptionCancelled(): Boolean = subscriptionCancelled != null

    fun isSubscriptionExpired(): Boolean = subscriptionExpired != null

    fun isSubscriptionFailed(): Boolean = subscriptionFailed != null

    fun isSubscriptionOnHold(): Boolean = subscriptionOnHold != null

    fun isSubscriptionPlanChanged(): Boolean = subscriptionPlanChanged != null

    fun isSubscriptionRenewed(): Boolean = subscriptionRenewed != null

    fun isSubscriptionUpdated(): Boolean = subscriptionUpdated != null

    fun asAbandonedCheckoutDetected(): AbandonedCheckoutDetectedWebhookEvent = abandonedCheckoutDetected.getOrThrow("abandonedCheckoutDetected")

    fun asAbandonedCheckoutRecovered(): AbandonedCheckoutRecoveredWebhookEvent = abandonedCheckoutRecovered.getOrThrow("abandonedCheckoutRecovered")

    fun asCreditAdded(): CreditAddedWebhookEvent = creditAdded.getOrThrow("creditAdded")

    fun asCreditBalanceLow(): CreditBalanceLowWebhookEvent = creditBalanceLow.getOrThrow("creditBalanceLow")

    fun asCreditDeducted(): CreditDeductedWebhookEvent = creditDeducted.getOrThrow("creditDeducted")

    fun asCreditExpired(): CreditExpiredWebhookEvent = creditExpired.getOrThrow("creditExpired")

    fun asCreditManualAdjustment(): CreditManualAdjustmentWebhookEvent = creditManualAdjustment.getOrThrow("creditManualAdjustment")

    fun asCreditOverageCharged(): CreditOverageChargedWebhookEvent = creditOverageCharged.getOrThrow("creditOverageCharged")

    fun asCreditOverageReset(): CreditOverageResetWebhookEvent = creditOverageReset.getOrThrow("creditOverageReset")

    fun asCreditRolledOver(): CreditRolledOverWebhookEvent = creditRolledOver.getOrThrow("creditRolledOver")

    fun asCreditRolloverForfeited(): CreditRolloverForfeitedWebhookEvent = creditRolloverForfeited.getOrThrow("creditRolloverForfeited")

    fun asDisputeAccepted(): DisputeAcceptedWebhookEvent = disputeAccepted.getOrThrow("disputeAccepted")

    fun asDisputeCancelled(): DisputeCancelledWebhookEvent = disputeCancelled.getOrThrow("disputeCancelled")

    fun asDisputeChallenged(): DisputeChallengedWebhookEvent = disputeChallenged.getOrThrow("disputeChallenged")

    fun asDisputeExpired(): DisputeExpiredWebhookEvent = disputeExpired.getOrThrow("disputeExpired")

    fun asDisputeLost(): DisputeLostWebhookEvent = disputeLost.getOrThrow("disputeLost")

    fun asDisputeOpened(): DisputeOpenedWebhookEvent = disputeOpened.getOrThrow("disputeOpened")

    fun asDisputeWon(): DisputeWonWebhookEvent = disputeWon.getOrThrow("disputeWon")

    fun asDunningRecovered(): DunningRecoveredWebhookEvent = dunningRecovered.getOrThrow("dunningRecovered")

    fun asDunningStarted(): DunningStartedWebhookEvent = dunningStarted.getOrThrow("dunningStarted")

    fun asEntitlementGrantCreated(): EntitlementGrantCreatedWebhookEvent = entitlementGrantCreated.getOrThrow("entitlementGrantCreated")

    fun asEntitlementGrantDelivered(): EntitlementGrantDeliveredWebhookEvent = entitlementGrantDelivered.getOrThrow("entitlementGrantDelivered")

    fun asEntitlementGrantFailed(): EntitlementGrantFailedWebhookEvent = entitlementGrantFailed.getOrThrow("entitlementGrantFailed")

    fun asEntitlementGrantRevoked(): EntitlementGrantRevokedWebhookEvent = entitlementGrantRevoked.getOrThrow("entitlementGrantRevoked")

    fun asLicenseKeyCreated(): LicenseKeyCreatedWebhookEvent = licenseKeyCreated.getOrThrow("licenseKeyCreated")

    fun asPaymentCancelled(): PaymentCancelledWebhookEvent = paymentCancelled.getOrThrow("paymentCancelled")

    fun asPaymentFailed(): PaymentFailedWebhookEvent = paymentFailed.getOrThrow("paymentFailed")

    fun asPaymentProcessing(): PaymentProcessingWebhookEvent = paymentProcessing.getOrThrow("paymentProcessing")

    fun asPaymentSucceeded(): PaymentSucceededWebhookEvent = paymentSucceeded.getOrThrow("paymentSucceeded")

    fun asRefundFailed(): RefundFailedWebhookEvent = refundFailed.getOrThrow("refundFailed")

    fun asRefundSucceeded(): RefundSucceededWebhookEvent = refundSucceeded.getOrThrow("refundSucceeded")

    fun asSubscriptionActive(): SubscriptionActiveWebhookEvent = subscriptionActive.getOrThrow("subscriptionActive")

    fun asSubscriptionCancelled(): SubscriptionCancelledWebhookEvent = subscriptionCancelled.getOrThrow("subscriptionCancelled")

    fun asSubscriptionExpired(): SubscriptionExpiredWebhookEvent = subscriptionExpired.getOrThrow("subscriptionExpired")

    fun asSubscriptionFailed(): SubscriptionFailedWebhookEvent = subscriptionFailed.getOrThrow("subscriptionFailed")

    fun asSubscriptionOnHold(): SubscriptionOnHoldWebhookEvent = subscriptionOnHold.getOrThrow("subscriptionOnHold")

    fun asSubscriptionPlanChanged(): SubscriptionPlanChangedWebhookEvent = subscriptionPlanChanged.getOrThrow("subscriptionPlanChanged")

    fun asSubscriptionRenewed(): SubscriptionRenewedWebhookEvent = subscriptionRenewed.getOrThrow("subscriptionRenewed")

    fun asSubscriptionUpdated(): SubscriptionUpdatedWebhookEvent = subscriptionUpdated.getOrThrow("subscriptionUpdated")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the SDK
     * gracefully, consider overriding [Visitor.unknown]:
     *
     * ```java
     * import com.dodopayments.api.core.JsonValue;
     * import java.util.Optional;
     *
     * Optional<String> result = unwrapWebhookEvent.accept(new UnwrapWebhookEvent.Visitor<Optional<String>>() {
     *     @Override
     *     public Optional<String> visitAbandonedCheckoutDetected(AbandonedCheckoutDetectedWebhookEvent abandonedCheckoutDetected) {
     *         return Optional.of(abandonedCheckoutDetected.toString());
     *     }
     *
     *     // ...
     *
     *     @Override
     *     public Optional<String> unknown(JsonValue json) {
     *         // Or inspect the `json`.
     *         return Optional.empty();
     *     }
     * });
     * ```
     *
     * @throws DodoPaymentsInvalidDataException if [Visitor.unknown] is not overridden in
     *   [visitor] and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            abandonedCheckoutDetected != null -> visitor.visitAbandonedCheckoutDetected(abandonedCheckoutDetected)
            abandonedCheckoutRecovered != null -> visitor.visitAbandonedCheckoutRecovered(abandonedCheckoutRecovered)
            creditAdded != null -> visitor.visitCreditAdded(creditAdded)
            creditBalanceLow != null -> visitor.visitCreditBalanceLow(creditBalanceLow)
            creditDeducted != null -> visitor.visitCreditDeducted(creditDeducted)
            creditExpired != null -> visitor.visitCreditExpired(creditExpired)
            creditManualAdjustment != null -> visitor.visitCreditManualAdjustment(creditManualAdjustment)
            creditOverageCharged != null -> visitor.visitCreditOverageCharged(creditOverageCharged)
            creditOverageReset != null -> visitor.visitCreditOverageReset(creditOverageReset)
            creditRolledOver != null -> visitor.visitCreditRolledOver(creditRolledOver)
            creditRolloverForfeited != null -> visitor.visitCreditRolloverForfeited(creditRolloverForfeited)
            disputeAccepted != null -> visitor.visitDisputeAccepted(disputeAccepted)
            disputeCancelled != null -> visitor.visitDisputeCancelled(disputeCancelled)
            disputeChallenged != null -> visitor.visitDisputeChallenged(disputeChallenged)
            disputeExpired != null -> visitor.visitDisputeExpired(disputeExpired)
            disputeLost != null -> visitor.visitDisputeLost(disputeLost)
            disputeOpened != null -> visitor.visitDisputeOpened(disputeOpened)
            disputeWon != null -> visitor.visitDisputeWon(disputeWon)
            dunningRecovered != null -> visitor.visitDunningRecovered(dunningRecovered)
            dunningStarted != null -> visitor.visitDunningStarted(dunningStarted)
            entitlementGrantCreated != null -> visitor.visitEntitlementGrantCreated(entitlementGrantCreated)
            entitlementGrantDelivered != null -> visitor.visitEntitlementGrantDelivered(entitlementGrantDelivered)
            entitlementGrantFailed != null -> visitor.visitEntitlementGrantFailed(entitlementGrantFailed)
            entitlementGrantRevoked != null -> visitor.visitEntitlementGrantRevoked(entitlementGrantRevoked)
            licenseKeyCreated != null -> visitor.visitLicenseKeyCreated(licenseKeyCreated)
            paymentCancelled != null -> visitor.visitPaymentCancelled(paymentCancelled)
            paymentFailed != null -> visitor.visitPaymentFailed(paymentFailed)
            paymentProcessing != null -> visitor.visitPaymentProcessing(paymentProcessing)
            paymentSucceeded != null -> visitor.visitPaymentSucceeded(paymentSucceeded)
            refundFailed != null -> visitor.visitRefundFailed(refundFailed)
            refundSucceeded != null -> visitor.visitRefundSucceeded(refundSucceeded)
            subscriptionActive != null -> visitor.visitSubscriptionActive(subscriptionActive)
            subscriptionCancelled != null -> visitor.visitSubscriptionCancelled(subscriptionCancelled)
            subscriptionExpired != null -> visitor.visitSubscriptionExpired(subscriptionExpired)
            subscriptionFailed != null -> visitor.visitSubscriptionFailed(subscriptionFailed)
            subscriptionOnHold != null -> visitor.visitSubscriptionOnHold(subscriptionOnHold)
            subscriptionPlanChanged != null -> visitor.visitSubscriptionPlanChanged(subscriptionPlanChanged)
            subscriptionRenewed != null -> visitor.visitSubscriptionRenewed(subscriptionRenewed)
            subscriptionUpdated != null -> visitor.visitSubscriptionUpdated(subscriptionUpdated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws DodoPaymentsInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UnwrapWebhookEvent =
        apply {
            if (validated) {
              return@apply
            }

            accept(object : Visitor<Unit> {
                override fun visitAbandonedCheckoutDetected(abandonedCheckoutDetected: AbandonedCheckoutDetectedWebhookEvent) {
                  abandonedCheckoutDetected.validate()
                }

                override fun visitAbandonedCheckoutRecovered(abandonedCheckoutRecovered: AbandonedCheckoutRecoveredWebhookEvent) {
                  abandonedCheckoutRecovered.validate()
                }

                override fun visitCreditAdded(creditAdded: CreditAddedWebhookEvent) {
                  creditAdded.validate()
                }

                override fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent) {
                  creditBalanceLow.validate()
                }

                override fun visitCreditDeducted(creditDeducted: CreditDeductedWebhookEvent) {
                  creditDeducted.validate()
                }

                override fun visitCreditExpired(creditExpired: CreditExpiredWebhookEvent) {
                  creditExpired.validate()
                }

                override fun visitCreditManualAdjustment(creditManualAdjustment: CreditManualAdjustmentWebhookEvent) {
                  creditManualAdjustment.validate()
                }

                override fun visitCreditOverageCharged(creditOverageCharged: CreditOverageChargedWebhookEvent) {
                  creditOverageCharged.validate()
                }

                override fun visitCreditOverageReset(creditOverageReset: CreditOverageResetWebhookEvent) {
                  creditOverageReset.validate()
                }

                override fun visitCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent) {
                  creditRolledOver.validate()
                }

                override fun visitCreditRolloverForfeited(creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent) {
                  creditRolloverForfeited.validate()
                }

                override fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) {
                  disputeAccepted.validate()
                }

                override fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) {
                  disputeCancelled.validate()
                }

                override fun visitDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent) {
                  disputeChallenged.validate()
                }

                override fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) {
                  disputeExpired.validate()
                }

                override fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent) {
                  disputeLost.validate()
                }

                override fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) {
                  disputeOpened.validate()
                }

                override fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent) {
                  disputeWon.validate()
                }

                override fun visitDunningRecovered(dunningRecovered: DunningRecoveredWebhookEvent) {
                  dunningRecovered.validate()
                }

                override fun visitDunningStarted(dunningStarted: DunningStartedWebhookEvent) {
                  dunningStarted.validate()
                }

                override fun visitEntitlementGrantCreated(entitlementGrantCreated: EntitlementGrantCreatedWebhookEvent) {
                  entitlementGrantCreated.validate()
                }

                override fun visitEntitlementGrantDelivered(entitlementGrantDelivered: EntitlementGrantDeliveredWebhookEvent) {
                  entitlementGrantDelivered.validate()
                }

                override fun visitEntitlementGrantFailed(entitlementGrantFailed: EntitlementGrantFailedWebhookEvent) {
                  entitlementGrantFailed.validate()
                }

                override fun visitEntitlementGrantRevoked(entitlementGrantRevoked: EntitlementGrantRevokedWebhookEvent) {
                  entitlementGrantRevoked.validate()
                }

                override fun visitLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent) {
                  licenseKeyCreated.validate()
                }

                override fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) {
                  paymentCancelled.validate()
                }

                override fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) {
                  paymentFailed.validate()
                }

                override fun visitPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent) {
                  paymentProcessing.validate()
                }

                override fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) {
                  paymentSucceeded.validate()
                }

                override fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent) {
                  refundFailed.validate()
                }

                override fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) {
                  refundSucceeded.validate()
                }

                override fun visitSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent) {
                  subscriptionActive.validate()
                }

                override fun visitSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent) {
                  subscriptionCancelled.validate()
                }

                override fun visitSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent) {
                  subscriptionExpired.validate()
                }

                override fun visitSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent) {
                  subscriptionFailed.validate()
                }

                override fun visitSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent) {
                  subscriptionOnHold.validate()
                }

                override fun visitSubscriptionPlanChanged(subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent) {
                  subscriptionPlanChanged.validate()
                }

                override fun visitSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent) {
                  subscriptionRenewed.validate()
                }

                override fun visitSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent) {
                  subscriptionUpdated.validate()
                }
            })
            validated = true
        }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: DodoPaymentsInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(object : Visitor<Int> {
            override fun visitAbandonedCheckoutDetected(abandonedCheckoutDetected: AbandonedCheckoutDetectedWebhookEvent) = abandonedCheckoutDetected.validity()

            override fun visitAbandonedCheckoutRecovered(abandonedCheckoutRecovered: AbandonedCheckoutRecoveredWebhookEvent) = abandonedCheckoutRecovered.validity()

            override fun visitCreditAdded(creditAdded: CreditAddedWebhookEvent) = creditAdded.validity()

            override fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent) = creditBalanceLow.validity()

            override fun visitCreditDeducted(creditDeducted: CreditDeductedWebhookEvent) = creditDeducted.validity()

            override fun visitCreditExpired(creditExpired: CreditExpiredWebhookEvent) = creditExpired.validity()

            override fun visitCreditManualAdjustment(creditManualAdjustment: CreditManualAdjustmentWebhookEvent) = creditManualAdjustment.validity()

            override fun visitCreditOverageCharged(creditOverageCharged: CreditOverageChargedWebhookEvent) = creditOverageCharged.validity()

            override fun visitCreditOverageReset(creditOverageReset: CreditOverageResetWebhookEvent) = creditOverageReset.validity()

            override fun visitCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent) = creditRolledOver.validity()

            override fun visitCreditRolloverForfeited(creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent) = creditRolloverForfeited.validity()

            override fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) = disputeAccepted.validity()

            override fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) = disputeCancelled.validity()

            override fun visitDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent) = disputeChallenged.validity()

            override fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) = disputeExpired.validity()

            override fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent) = disputeLost.validity()

            override fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) = disputeOpened.validity()

            override fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent) = disputeWon.validity()

            override fun visitDunningRecovered(dunningRecovered: DunningRecoveredWebhookEvent) = dunningRecovered.validity()

            override fun visitDunningStarted(dunningStarted: DunningStartedWebhookEvent) = dunningStarted.validity()

            override fun visitEntitlementGrantCreated(entitlementGrantCreated: EntitlementGrantCreatedWebhookEvent) = entitlementGrantCreated.validity()

            override fun visitEntitlementGrantDelivered(entitlementGrantDelivered: EntitlementGrantDeliveredWebhookEvent) = entitlementGrantDelivered.validity()

            override fun visitEntitlementGrantFailed(entitlementGrantFailed: EntitlementGrantFailedWebhookEvent) = entitlementGrantFailed.validity()

            override fun visitEntitlementGrantRevoked(entitlementGrantRevoked: EntitlementGrantRevokedWebhookEvent) = entitlementGrantRevoked.validity()

            override fun visitLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent) = licenseKeyCreated.validity()

            override fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) = paymentCancelled.validity()

            override fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) = paymentFailed.validity()

            override fun visitPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent) = paymentProcessing.validity()

            override fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) = paymentSucceeded.validity()

            override fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent) = refundFailed.validity()

            override fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) = refundSucceeded.validity()

            override fun visitSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent) = subscriptionActive.validity()

            override fun visitSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent) = subscriptionCancelled.validity()

            override fun visitSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent) = subscriptionExpired.validity()

            override fun visitSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent) = subscriptionFailed.validity()

            override fun visitSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent) = subscriptionOnHold.validity()

            override fun visitSubscriptionPlanChanged(subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent) = subscriptionPlanChanged.validity()

            override fun visitSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent) = subscriptionRenewed.validity()

            override fun visitSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent) = subscriptionUpdated.validity()

            override fun unknown(json: JsonValue?) = 0
        })

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is UnwrapWebhookEvent && abandonedCheckoutDetected == other.abandonedCheckoutDetected && abandonedCheckoutRecovered == other.abandonedCheckoutRecovered && creditAdded == other.creditAdded && creditBalanceLow == other.creditBalanceLow && creditDeducted == other.creditDeducted && creditExpired == other.creditExpired && creditManualAdjustment == other.creditManualAdjustment && creditOverageCharged == other.creditOverageCharged && creditOverageReset == other.creditOverageReset && creditRolledOver == other.creditRolledOver && creditRolloverForfeited == other.creditRolloverForfeited && disputeAccepted == other.disputeAccepted && disputeCancelled == other.disputeCancelled && disputeChallenged == other.disputeChallenged && disputeExpired == other.disputeExpired && disputeLost == other.disputeLost && disputeOpened == other.disputeOpened && disputeWon == other.disputeWon && dunningRecovered == other.dunningRecovered && dunningStarted == other.dunningStarted && entitlementGrantCreated == other.entitlementGrantCreated && entitlementGrantDelivered == other.entitlementGrantDelivered && entitlementGrantFailed == other.entitlementGrantFailed && entitlementGrantRevoked == other.entitlementGrantRevoked && licenseKeyCreated == other.licenseKeyCreated && paymentCancelled == other.paymentCancelled && paymentFailed == other.paymentFailed && paymentProcessing == other.paymentProcessing && paymentSucceeded == other.paymentSucceeded && refundFailed == other.refundFailed && refundSucceeded == other.refundSucceeded && subscriptionActive == other.subscriptionActive && subscriptionCancelled == other.subscriptionCancelled && subscriptionExpired == other.subscriptionExpired && subscriptionFailed == other.subscriptionFailed && subscriptionOnHold == other.subscriptionOnHold && subscriptionPlanChanged == other.subscriptionPlanChanged && subscriptionRenewed == other.subscriptionRenewed && subscriptionUpdated == other.subscriptionUpdated
    }

    override fun hashCode(): Int = Objects.hash(abandonedCheckoutDetected, abandonedCheckoutRecovered, creditAdded, creditBalanceLow, creditDeducted, creditExpired, creditManualAdjustment, creditOverageCharged, creditOverageReset, creditRolledOver, creditRolloverForfeited, disputeAccepted, disputeCancelled, disputeChallenged, disputeExpired, disputeLost, disputeOpened, disputeWon, dunningRecovered, dunningStarted, entitlementGrantCreated, entitlementGrantDelivered, entitlementGrantFailed, entitlementGrantRevoked, licenseKeyCreated, paymentCancelled, paymentFailed, paymentProcessing, paymentSucceeded, refundFailed, refundSucceeded, subscriptionActive, subscriptionCancelled, subscriptionExpired, subscriptionFailed, subscriptionOnHold, subscriptionPlanChanged, subscriptionRenewed, subscriptionUpdated)

    override fun toString(): String =
        when {
            abandonedCheckoutDetected != null -> "UnwrapWebhookEvent{abandonedCheckoutDetected=$abandonedCheckoutDetected}"
            abandonedCheckoutRecovered != null -> "UnwrapWebhookEvent{abandonedCheckoutRecovered=$abandonedCheckoutRecovered}"
            creditAdded != null -> "UnwrapWebhookEvent{creditAdded=$creditAdded}"
            creditBalanceLow != null -> "UnwrapWebhookEvent{creditBalanceLow=$creditBalanceLow}"
            creditDeducted != null -> "UnwrapWebhookEvent{creditDeducted=$creditDeducted}"
            creditExpired != null -> "UnwrapWebhookEvent{creditExpired=$creditExpired}"
            creditManualAdjustment != null -> "UnwrapWebhookEvent{creditManualAdjustment=$creditManualAdjustment}"
            creditOverageCharged != null -> "UnwrapWebhookEvent{creditOverageCharged=$creditOverageCharged}"
            creditOverageReset != null -> "UnwrapWebhookEvent{creditOverageReset=$creditOverageReset}"
            creditRolledOver != null -> "UnwrapWebhookEvent{creditRolledOver=$creditRolledOver}"
            creditRolloverForfeited != null -> "UnwrapWebhookEvent{creditRolloverForfeited=$creditRolloverForfeited}"
            disputeAccepted != null -> "UnwrapWebhookEvent{disputeAccepted=$disputeAccepted}"
            disputeCancelled != null -> "UnwrapWebhookEvent{disputeCancelled=$disputeCancelled}"
            disputeChallenged != null -> "UnwrapWebhookEvent{disputeChallenged=$disputeChallenged}"
            disputeExpired != null -> "UnwrapWebhookEvent{disputeExpired=$disputeExpired}"
            disputeLost != null -> "UnwrapWebhookEvent{disputeLost=$disputeLost}"
            disputeOpened != null -> "UnwrapWebhookEvent{disputeOpened=$disputeOpened}"
            disputeWon != null -> "UnwrapWebhookEvent{disputeWon=$disputeWon}"
            dunningRecovered != null -> "UnwrapWebhookEvent{dunningRecovered=$dunningRecovered}"
            dunningStarted != null -> "UnwrapWebhookEvent{dunningStarted=$dunningStarted}"
            entitlementGrantCreated != null -> "UnwrapWebhookEvent{entitlementGrantCreated=$entitlementGrantCreated}"
            entitlementGrantDelivered != null -> "UnwrapWebhookEvent{entitlementGrantDelivered=$entitlementGrantDelivered}"
            entitlementGrantFailed != null -> "UnwrapWebhookEvent{entitlementGrantFailed=$entitlementGrantFailed}"
            entitlementGrantRevoked != null -> "UnwrapWebhookEvent{entitlementGrantRevoked=$entitlementGrantRevoked}"
            licenseKeyCreated != null -> "UnwrapWebhookEvent{licenseKeyCreated=$licenseKeyCreated}"
            paymentCancelled != null -> "UnwrapWebhookEvent{paymentCancelled=$paymentCancelled}"
            paymentFailed != null -> "UnwrapWebhookEvent{paymentFailed=$paymentFailed}"
            paymentProcessing != null -> "UnwrapWebhookEvent{paymentProcessing=$paymentProcessing}"
            paymentSucceeded != null -> "UnwrapWebhookEvent{paymentSucceeded=$paymentSucceeded}"
            refundFailed != null -> "UnwrapWebhookEvent{refundFailed=$refundFailed}"
            refundSucceeded != null -> "UnwrapWebhookEvent{refundSucceeded=$refundSucceeded}"
            subscriptionActive != null -> "UnwrapWebhookEvent{subscriptionActive=$subscriptionActive}"
            subscriptionCancelled != null -> "UnwrapWebhookEvent{subscriptionCancelled=$subscriptionCancelled}"
            subscriptionExpired != null -> "UnwrapWebhookEvent{subscriptionExpired=$subscriptionExpired}"
            subscriptionFailed != null -> "UnwrapWebhookEvent{subscriptionFailed=$subscriptionFailed}"
            subscriptionOnHold != null -> "UnwrapWebhookEvent{subscriptionOnHold=$subscriptionOnHold}"
            subscriptionPlanChanged != null -> "UnwrapWebhookEvent{subscriptionPlanChanged=$subscriptionPlanChanged}"
            subscriptionRenewed != null -> "UnwrapWebhookEvent{subscriptionRenewed=$subscriptionRenewed}"
            subscriptionUpdated != null -> "UnwrapWebhookEvent{subscriptionUpdated=$subscriptionUpdated}"
            _json != null -> "UnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
        }

    companion object {

        @JvmStatic
        fun ofAbandonedCheckoutDetected(abandonedCheckoutDetected: AbandonedCheckoutDetectedWebhookEvent) = UnwrapWebhookEvent(abandonedCheckoutDetected = abandonedCheckoutDetected)

        @JvmStatic
        fun ofAbandonedCheckoutRecovered(abandonedCheckoutRecovered: AbandonedCheckoutRecoveredWebhookEvent) = UnwrapWebhookEvent(abandonedCheckoutRecovered = abandonedCheckoutRecovered)

        @JvmStatic
        fun ofCreditAdded(creditAdded: CreditAddedWebhookEvent) = UnwrapWebhookEvent(creditAdded = creditAdded)

        @JvmStatic
        fun ofCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent) = UnwrapWebhookEvent(creditBalanceLow = creditBalanceLow)

        @JvmStatic
        fun ofCreditDeducted(creditDeducted: CreditDeductedWebhookEvent) = UnwrapWebhookEvent(creditDeducted = creditDeducted)

        @JvmStatic
        fun ofCreditExpired(creditExpired: CreditExpiredWebhookEvent) = UnwrapWebhookEvent(creditExpired = creditExpired)

        @JvmStatic
        fun ofCreditManualAdjustment(creditManualAdjustment: CreditManualAdjustmentWebhookEvent) = UnwrapWebhookEvent(creditManualAdjustment = creditManualAdjustment)

        @JvmStatic
        fun ofCreditOverageCharged(creditOverageCharged: CreditOverageChargedWebhookEvent) = UnwrapWebhookEvent(creditOverageCharged = creditOverageCharged)

        @JvmStatic
        fun ofCreditOverageReset(creditOverageReset: CreditOverageResetWebhookEvent) = UnwrapWebhookEvent(creditOverageReset = creditOverageReset)

        @JvmStatic
        fun ofCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent) = UnwrapWebhookEvent(creditRolledOver = creditRolledOver)

        @JvmStatic
        fun ofCreditRolloverForfeited(creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent) = UnwrapWebhookEvent(creditRolloverForfeited = creditRolloverForfeited)

        @JvmStatic
        fun ofDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) = UnwrapWebhookEvent(disputeAccepted = disputeAccepted)

        @JvmStatic
        fun ofDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) = UnwrapWebhookEvent(disputeCancelled = disputeCancelled)

        @JvmStatic
        fun ofDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent) = UnwrapWebhookEvent(disputeChallenged = disputeChallenged)

        @JvmStatic
        fun ofDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) = UnwrapWebhookEvent(disputeExpired = disputeExpired)

        @JvmStatic
        fun ofDisputeLost(disputeLost: DisputeLostWebhookEvent) = UnwrapWebhookEvent(disputeLost = disputeLost)

        @JvmStatic
        fun ofDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) = UnwrapWebhookEvent(disputeOpened = disputeOpened)

        @JvmStatic
        fun ofDisputeWon(disputeWon: DisputeWonWebhookEvent) = UnwrapWebhookEvent(disputeWon = disputeWon)

        @JvmStatic
        fun ofDunningRecovered(dunningRecovered: DunningRecoveredWebhookEvent) = UnwrapWebhookEvent(dunningRecovered = dunningRecovered)

        @JvmStatic
        fun ofDunningStarted(dunningStarted: DunningStartedWebhookEvent) = UnwrapWebhookEvent(dunningStarted = dunningStarted)

        @JvmStatic
        fun ofEntitlementGrantCreated(entitlementGrantCreated: EntitlementGrantCreatedWebhookEvent) = UnwrapWebhookEvent(entitlementGrantCreated = entitlementGrantCreated)

        @JvmStatic
        fun ofEntitlementGrantDelivered(entitlementGrantDelivered: EntitlementGrantDeliveredWebhookEvent) = UnwrapWebhookEvent(entitlementGrantDelivered = entitlementGrantDelivered)

        @JvmStatic
        fun ofEntitlementGrantFailed(entitlementGrantFailed: EntitlementGrantFailedWebhookEvent) = UnwrapWebhookEvent(entitlementGrantFailed = entitlementGrantFailed)

        @JvmStatic
        fun ofEntitlementGrantRevoked(entitlementGrantRevoked: EntitlementGrantRevokedWebhookEvent) = UnwrapWebhookEvent(entitlementGrantRevoked = entitlementGrantRevoked)

        @JvmStatic
        fun ofLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent) = UnwrapWebhookEvent(licenseKeyCreated = licenseKeyCreated)

        @JvmStatic
        fun ofPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) = UnwrapWebhookEvent(paymentCancelled = paymentCancelled)

        @JvmStatic
        fun ofPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) = UnwrapWebhookEvent(paymentFailed = paymentFailed)

        @JvmStatic
        fun ofPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent) = UnwrapWebhookEvent(paymentProcessing = paymentProcessing)

        @JvmStatic
        fun ofPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) = UnwrapWebhookEvent(paymentSucceeded = paymentSucceeded)

        @JvmStatic
        fun ofRefundFailed(refundFailed: RefundFailedWebhookEvent) = UnwrapWebhookEvent(refundFailed = refundFailed)

        @JvmStatic
        fun ofRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) = UnwrapWebhookEvent(refundSucceeded = refundSucceeded)

        @JvmStatic
        fun ofSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent) = UnwrapWebhookEvent(subscriptionActive = subscriptionActive)

        @JvmStatic
        fun ofSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent) = UnwrapWebhookEvent(subscriptionCancelled = subscriptionCancelled)

        @JvmStatic
        fun ofSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent) = UnwrapWebhookEvent(subscriptionExpired = subscriptionExpired)

        @JvmStatic
        fun ofSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent) = UnwrapWebhookEvent(subscriptionFailed = subscriptionFailed)

        @JvmStatic
        fun ofSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent) = UnwrapWebhookEvent(subscriptionOnHold = subscriptionOnHold)

        @JvmStatic
        fun ofSubscriptionPlanChanged(subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent) = UnwrapWebhookEvent(subscriptionPlanChanged = subscriptionPlanChanged)

        @JvmStatic
        fun ofSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent) = UnwrapWebhookEvent(subscriptionRenewed = subscriptionRenewed)

        @JvmStatic
        fun ofSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent) = UnwrapWebhookEvent(subscriptionUpdated = subscriptionUpdated)
    }

    /** An interface that defines how to map each variant of [UnwrapWebhookEvent] to a value of type [T]. */
    interface Visitor<out T> {

        fun visitAbandonedCheckoutDetected(abandonedCheckoutDetected: AbandonedCheckoutDetectedWebhookEvent): T

        fun visitAbandonedCheckoutRecovered(abandonedCheckoutRecovered: AbandonedCheckoutRecoveredWebhookEvent): T

        fun visitCreditAdded(creditAdded: CreditAddedWebhookEvent): T

        fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent): T

        fun visitCreditDeducted(creditDeducted: CreditDeductedWebhookEvent): T

        fun visitCreditExpired(creditExpired: CreditExpiredWebhookEvent): T

        fun visitCreditManualAdjustment(creditManualAdjustment: CreditManualAdjustmentWebhookEvent): T

        fun visitCreditOverageCharged(creditOverageCharged: CreditOverageChargedWebhookEvent): T

        fun visitCreditOverageReset(creditOverageReset: CreditOverageResetWebhookEvent): T

        fun visitCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent): T

        fun visitCreditRolloverForfeited(creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent): T

        fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent): T

        fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent): T

        fun visitDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent): T

        fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent): T

        fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent): T

        fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent): T

        fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent): T

        fun visitDunningRecovered(dunningRecovered: DunningRecoveredWebhookEvent): T

        fun visitDunningStarted(dunningStarted: DunningStartedWebhookEvent): T

        fun visitEntitlementGrantCreated(entitlementGrantCreated: EntitlementGrantCreatedWebhookEvent): T

        fun visitEntitlementGrantDelivered(entitlementGrantDelivered: EntitlementGrantDeliveredWebhookEvent): T

        fun visitEntitlementGrantFailed(entitlementGrantFailed: EntitlementGrantFailedWebhookEvent): T

        fun visitEntitlementGrantRevoked(entitlementGrantRevoked: EntitlementGrantRevokedWebhookEvent): T

        fun visitLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent): T

        fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent): T

        fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent): T

        fun visitPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent): T

        fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent): T

        fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent): T

        fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent): T

        fun visitSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent): T

        fun visitSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent): T

        fun visitSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent): T

        fun visitSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent): T

        fun visitSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent): T

        fun visitSubscriptionPlanChanged(subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent): T

        fun visitSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent): T

        fun visitSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent): T

        /**
         * Maps an unknown variant of [UnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnwrapWebhookEvent] can contain an unknown variant if it was deserialized from data
         * that doesn't match any known variant. For example, if the SDK is on an older version than the
         * API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
          throw DodoPaymentsInvalidDataException("Unknown UnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnwrapWebhookEvent {
          val json = JsonValue.fromJsonNode(node)
          val type = json.asObject().getOrNull()?.get("type")?.asString()?.getOrNull()

          when (type) {
              "abandoned_checkout.detected" -> {
                  return tryDeserialize(node, jacksonTypeRef<AbandonedCheckoutDetectedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(abandonedCheckoutDetected = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "abandoned_checkout.recovered" -> {
                  return tryDeserialize(node, jacksonTypeRef<AbandonedCheckoutRecoveredWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(abandonedCheckoutRecovered = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.added" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditAddedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditAdded = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.balance_low" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditBalanceLowWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditBalanceLow = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.deducted" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditDeductedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditDeducted = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.expired" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditExpiredWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditExpired = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.manual_adjustment" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditManualAdjustmentWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditManualAdjustment = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.overage_charged" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditOverageChargedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditOverageCharged = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.overage_reset" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditOverageResetWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditOverageReset = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.rolled_over" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditRolledOverWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditRolledOver = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "credit.rollover_forfeited" -> {
                  return tryDeserialize(node, jacksonTypeRef<CreditRolloverForfeitedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(creditRolloverForfeited = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.accepted" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeAcceptedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeAccepted = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.cancelled" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeCancelledWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeCancelled = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.challenged" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeChallengedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeChallenged = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.expired" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeExpiredWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeExpired = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.lost" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeLostWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeLost = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.opened" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeOpenedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeOpened = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dispute.won" -> {
                  return tryDeserialize(node, jacksonTypeRef<DisputeWonWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(disputeWon = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dunning.recovered" -> {
                  return tryDeserialize(node, jacksonTypeRef<DunningRecoveredWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(dunningRecovered = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "dunning.started" -> {
                  return tryDeserialize(node, jacksonTypeRef<DunningStartedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(dunningStarted = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "entitlement_grant.created" -> {
                  return tryDeserialize(node, jacksonTypeRef<EntitlementGrantCreatedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(entitlementGrantCreated = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "entitlement_grant.delivered" -> {
                  return tryDeserialize(node, jacksonTypeRef<EntitlementGrantDeliveredWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(entitlementGrantDelivered = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "entitlement_grant.failed" -> {
                  return tryDeserialize(node, jacksonTypeRef<EntitlementGrantFailedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(entitlementGrantFailed = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "entitlement_grant.revoked" -> {
                  return tryDeserialize(node, jacksonTypeRef<EntitlementGrantRevokedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(entitlementGrantRevoked = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "license_key.created" -> {
                  return tryDeserialize(node, jacksonTypeRef<LicenseKeyCreatedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(licenseKeyCreated = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "payment.cancelled" -> {
                  return tryDeserialize(node, jacksonTypeRef<PaymentCancelledWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(paymentCancelled = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "payment.failed" -> {
                  return tryDeserialize(node, jacksonTypeRef<PaymentFailedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(paymentFailed = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "payment.processing" -> {
                  return tryDeserialize(node, jacksonTypeRef<PaymentProcessingWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(paymentProcessing = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "payment.succeeded" -> {
                  return tryDeserialize(node, jacksonTypeRef<PaymentSucceededWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(paymentSucceeded = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "refund.failed" -> {
                  return tryDeserialize(node, jacksonTypeRef<RefundFailedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(refundFailed = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "refund.succeeded" -> {
                  return tryDeserialize(node, jacksonTypeRef<RefundSucceededWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(refundSucceeded = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.active" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionActiveWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionActive = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.cancelled" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionCancelledWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionCancelled = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.expired" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionExpiredWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionExpired = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.failed" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionFailedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionFailed = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.on_hold" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionOnHoldWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionOnHold = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.plan_changed" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionPlanChangedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionPlanChanged = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.renewed" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionRenewedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionRenewed = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
              "subscription.updated" -> {
                  return tryDeserialize(node, jacksonTypeRef<SubscriptionUpdatedWebhookEvent>())
                      ?.let {
                          UnwrapWebhookEvent(subscriptionUpdated = it, _json = json)
                      } ?: UnwrapWebhookEvent(_json = json)
              }
          }

          return UnwrapWebhookEvent(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<UnwrapWebhookEvent>(UnwrapWebhookEvent::class) {

        override fun serialize(value: UnwrapWebhookEvent, generator: JsonGenerator, provider: SerializerProvider) {
          when {
              value.abandonedCheckoutDetected != null -> generator.writeObject(value.abandonedCheckoutDetected)
              value.abandonedCheckoutRecovered != null -> generator.writeObject(value.abandonedCheckoutRecovered)
              value.creditAdded != null -> generator.writeObject(value.creditAdded)
              value.creditBalanceLow != null -> generator.writeObject(value.creditBalanceLow)
              value.creditDeducted != null -> generator.writeObject(value.creditDeducted)
              value.creditExpired != null -> generator.writeObject(value.creditExpired)
              value.creditManualAdjustment != null -> generator.writeObject(value.creditManualAdjustment)
              value.creditOverageCharged != null -> generator.writeObject(value.creditOverageCharged)
              value.creditOverageReset != null -> generator.writeObject(value.creditOverageReset)
              value.creditRolledOver != null -> generator.writeObject(value.creditRolledOver)
              value.creditRolloverForfeited != null -> generator.writeObject(value.creditRolloverForfeited)
              value.disputeAccepted != null -> generator.writeObject(value.disputeAccepted)
              value.disputeCancelled != null -> generator.writeObject(value.disputeCancelled)
              value.disputeChallenged != null -> generator.writeObject(value.disputeChallenged)
              value.disputeExpired != null -> generator.writeObject(value.disputeExpired)
              value.disputeLost != null -> generator.writeObject(value.disputeLost)
              value.disputeOpened != null -> generator.writeObject(value.disputeOpened)
              value.disputeWon != null -> generator.writeObject(value.disputeWon)
              value.dunningRecovered != null -> generator.writeObject(value.dunningRecovered)
              value.dunningStarted != null -> generator.writeObject(value.dunningStarted)
              value.entitlementGrantCreated != null -> generator.writeObject(value.entitlementGrantCreated)
              value.entitlementGrantDelivered != null -> generator.writeObject(value.entitlementGrantDelivered)
              value.entitlementGrantFailed != null -> generator.writeObject(value.entitlementGrantFailed)
              value.entitlementGrantRevoked != null -> generator.writeObject(value.entitlementGrantRevoked)
              value.licenseKeyCreated != null -> generator.writeObject(value.licenseKeyCreated)
              value.paymentCancelled != null -> generator.writeObject(value.paymentCancelled)
              value.paymentFailed != null -> generator.writeObject(value.paymentFailed)
              value.paymentProcessing != null -> generator.writeObject(value.paymentProcessing)
              value.paymentSucceeded != null -> generator.writeObject(value.paymentSucceeded)
              value.refundFailed != null -> generator.writeObject(value.refundFailed)
              value.refundSucceeded != null -> generator.writeObject(value.refundSucceeded)
              value.subscriptionActive != null -> generator.writeObject(value.subscriptionActive)
              value.subscriptionCancelled != null -> generator.writeObject(value.subscriptionCancelled)
              value.subscriptionExpired != null -> generator.writeObject(value.subscriptionExpired)
              value.subscriptionFailed != null -> generator.writeObject(value.subscriptionFailed)
              value.subscriptionOnHold != null -> generator.writeObject(value.subscriptionOnHold)
              value.subscriptionPlanChanged != null -> generator.writeObject(value.subscriptionPlanChanged)
              value.subscriptionRenewed != null -> generator.writeObject(value.subscriptionRenewed)
              value.subscriptionUpdated != null -> generator.writeObject(value.subscriptionUpdated)
              value._json != null -> generator.writeObject(value._json)
              else -> throw IllegalStateException("Invalid UnwrapWebhookEvent")
          }
        }
    }
}
