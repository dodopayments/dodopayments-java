// File generated from our OpenAPI spec by Stainless.

package com.dodopayments.api.models.webhooks

import com.dodopayments.api.core.BaseDeserializer
import com.dodopayments.api.core.BaseSerializer
import com.dodopayments.api.core.JsonValue
import com.dodopayments.api.core.allMaxBy
import com.dodopayments.api.core.getOrThrow
import com.dodopayments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = UnsafeUnwrapWebhookEvent.Deserializer::class)
@JsonSerialize(using = UnsafeUnwrapWebhookEvent.Serializer::class)
class UnsafeUnwrapWebhookEvent
private constructor(
    private val creditAdded: CreditAddedWebhookEvent? = null,
    private val creditBalanceLow: CreditBalanceLowWebhookEvent? = null,
    private val creditDeducted: CreditDeductedWebhookEvent? = null,
    private val creditExpired: CreditExpiredWebhookEvent? = null,
    private val creditManualAdjustment: CreditManualAdjustmentWebhookEvent? = null,
    private val creditOverageCharged: CreditOverageChargedWebhookEvent? = null,
    private val creditRolledOver: CreditRolledOverWebhookEvent? = null,
    private val creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent? = null,
    private val disputeAccepted: DisputeAcceptedWebhookEvent? = null,
    private val disputeCancelled: DisputeCancelledWebhookEvent? = null,
    private val disputeChallenged: DisputeChallengedWebhookEvent? = null,
    private val disputeExpired: DisputeExpiredWebhookEvent? = null,
    private val disputeLost: DisputeLostWebhookEvent? = null,
    private val disputeOpened: DisputeOpenedWebhookEvent? = null,
    private val disputeWon: DisputeWonWebhookEvent? = null,
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

    fun creditAdded(): Optional<CreditAddedWebhookEvent> = Optional.ofNullable(creditAdded)

    fun creditBalanceLow(): Optional<CreditBalanceLowWebhookEvent> =
        Optional.ofNullable(creditBalanceLow)

    fun creditDeducted(): Optional<CreditDeductedWebhookEvent> = Optional.ofNullable(creditDeducted)

    fun creditExpired(): Optional<CreditExpiredWebhookEvent> = Optional.ofNullable(creditExpired)

    fun creditManualAdjustment(): Optional<CreditManualAdjustmentWebhookEvent> =
        Optional.ofNullable(creditManualAdjustment)

    fun creditOverageCharged(): Optional<CreditOverageChargedWebhookEvent> =
        Optional.ofNullable(creditOverageCharged)

    fun creditRolledOver(): Optional<CreditRolledOverWebhookEvent> =
        Optional.ofNullable(creditRolledOver)

    fun creditRolloverForfeited(): Optional<CreditRolloverForfeitedWebhookEvent> =
        Optional.ofNullable(creditRolloverForfeited)

    fun disputeAccepted(): Optional<DisputeAcceptedWebhookEvent> =
        Optional.ofNullable(disputeAccepted)

    fun disputeCancelled(): Optional<DisputeCancelledWebhookEvent> =
        Optional.ofNullable(disputeCancelled)

    fun disputeChallenged(): Optional<DisputeChallengedWebhookEvent> =
        Optional.ofNullable(disputeChallenged)

    fun disputeExpired(): Optional<DisputeExpiredWebhookEvent> = Optional.ofNullable(disputeExpired)

    fun disputeLost(): Optional<DisputeLostWebhookEvent> = Optional.ofNullable(disputeLost)

    fun disputeOpened(): Optional<DisputeOpenedWebhookEvent> = Optional.ofNullable(disputeOpened)

    fun disputeWon(): Optional<DisputeWonWebhookEvent> = Optional.ofNullable(disputeWon)

    fun licenseKeyCreated(): Optional<LicenseKeyCreatedWebhookEvent> =
        Optional.ofNullable(licenseKeyCreated)

    fun paymentCancelled(): Optional<PaymentCancelledWebhookEvent> =
        Optional.ofNullable(paymentCancelled)

    fun paymentFailed(): Optional<PaymentFailedWebhookEvent> = Optional.ofNullable(paymentFailed)

    fun paymentProcessing(): Optional<PaymentProcessingWebhookEvent> =
        Optional.ofNullable(paymentProcessing)

    fun paymentSucceeded(): Optional<PaymentSucceededWebhookEvent> =
        Optional.ofNullable(paymentSucceeded)

    fun refundFailed(): Optional<RefundFailedWebhookEvent> = Optional.ofNullable(refundFailed)

    fun refundSucceeded(): Optional<RefundSucceededWebhookEvent> =
        Optional.ofNullable(refundSucceeded)

    fun subscriptionActive(): Optional<SubscriptionActiveWebhookEvent> =
        Optional.ofNullable(subscriptionActive)

    fun subscriptionCancelled(): Optional<SubscriptionCancelledWebhookEvent> =
        Optional.ofNullable(subscriptionCancelled)

    fun subscriptionExpired(): Optional<SubscriptionExpiredWebhookEvent> =
        Optional.ofNullable(subscriptionExpired)

    fun subscriptionFailed(): Optional<SubscriptionFailedWebhookEvent> =
        Optional.ofNullable(subscriptionFailed)

    fun subscriptionOnHold(): Optional<SubscriptionOnHoldWebhookEvent> =
        Optional.ofNullable(subscriptionOnHold)

    fun subscriptionPlanChanged(): Optional<SubscriptionPlanChangedWebhookEvent> =
        Optional.ofNullable(subscriptionPlanChanged)

    fun subscriptionRenewed(): Optional<SubscriptionRenewedWebhookEvent> =
        Optional.ofNullable(subscriptionRenewed)

    fun subscriptionUpdated(): Optional<SubscriptionUpdatedWebhookEvent> =
        Optional.ofNullable(subscriptionUpdated)

    fun isCreditAdded(): Boolean = creditAdded != null

    fun isCreditBalanceLow(): Boolean = creditBalanceLow != null

    fun isCreditDeducted(): Boolean = creditDeducted != null

    fun isCreditExpired(): Boolean = creditExpired != null

    fun isCreditManualAdjustment(): Boolean = creditManualAdjustment != null

    fun isCreditOverageCharged(): Boolean = creditOverageCharged != null

    fun isCreditRolledOver(): Boolean = creditRolledOver != null

    fun isCreditRolloverForfeited(): Boolean = creditRolloverForfeited != null

    fun isDisputeAccepted(): Boolean = disputeAccepted != null

    fun isDisputeCancelled(): Boolean = disputeCancelled != null

    fun isDisputeChallenged(): Boolean = disputeChallenged != null

    fun isDisputeExpired(): Boolean = disputeExpired != null

    fun isDisputeLost(): Boolean = disputeLost != null

    fun isDisputeOpened(): Boolean = disputeOpened != null

    fun isDisputeWon(): Boolean = disputeWon != null

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

    fun asCreditAdded(): CreditAddedWebhookEvent = creditAdded.getOrThrow("creditAdded")

    fun asCreditBalanceLow(): CreditBalanceLowWebhookEvent =
        creditBalanceLow.getOrThrow("creditBalanceLow")

    fun asCreditDeducted(): CreditDeductedWebhookEvent = creditDeducted.getOrThrow("creditDeducted")

    fun asCreditExpired(): CreditExpiredWebhookEvent = creditExpired.getOrThrow("creditExpired")

    fun asCreditManualAdjustment(): CreditManualAdjustmentWebhookEvent =
        creditManualAdjustment.getOrThrow("creditManualAdjustment")

    fun asCreditOverageCharged(): CreditOverageChargedWebhookEvent =
        creditOverageCharged.getOrThrow("creditOverageCharged")

    fun asCreditRolledOver(): CreditRolledOverWebhookEvent =
        creditRolledOver.getOrThrow("creditRolledOver")

    fun asCreditRolloverForfeited(): CreditRolloverForfeitedWebhookEvent =
        creditRolloverForfeited.getOrThrow("creditRolloverForfeited")

    fun asDisputeAccepted(): DisputeAcceptedWebhookEvent =
        disputeAccepted.getOrThrow("disputeAccepted")

    fun asDisputeCancelled(): DisputeCancelledWebhookEvent =
        disputeCancelled.getOrThrow("disputeCancelled")

    fun asDisputeChallenged(): DisputeChallengedWebhookEvent =
        disputeChallenged.getOrThrow("disputeChallenged")

    fun asDisputeExpired(): DisputeExpiredWebhookEvent = disputeExpired.getOrThrow("disputeExpired")

    fun asDisputeLost(): DisputeLostWebhookEvent = disputeLost.getOrThrow("disputeLost")

    fun asDisputeOpened(): DisputeOpenedWebhookEvent = disputeOpened.getOrThrow("disputeOpened")

    fun asDisputeWon(): DisputeWonWebhookEvent = disputeWon.getOrThrow("disputeWon")

    fun asLicenseKeyCreated(): LicenseKeyCreatedWebhookEvent =
        licenseKeyCreated.getOrThrow("licenseKeyCreated")

    fun asPaymentCancelled(): PaymentCancelledWebhookEvent =
        paymentCancelled.getOrThrow("paymentCancelled")

    fun asPaymentFailed(): PaymentFailedWebhookEvent = paymentFailed.getOrThrow("paymentFailed")

    fun asPaymentProcessing(): PaymentProcessingWebhookEvent =
        paymentProcessing.getOrThrow("paymentProcessing")

    fun asPaymentSucceeded(): PaymentSucceededWebhookEvent =
        paymentSucceeded.getOrThrow("paymentSucceeded")

    fun asRefundFailed(): RefundFailedWebhookEvent = refundFailed.getOrThrow("refundFailed")

    fun asRefundSucceeded(): RefundSucceededWebhookEvent =
        refundSucceeded.getOrThrow("refundSucceeded")

    fun asSubscriptionActive(): SubscriptionActiveWebhookEvent =
        subscriptionActive.getOrThrow("subscriptionActive")

    fun asSubscriptionCancelled(): SubscriptionCancelledWebhookEvent =
        subscriptionCancelled.getOrThrow("subscriptionCancelled")

    fun asSubscriptionExpired(): SubscriptionExpiredWebhookEvent =
        subscriptionExpired.getOrThrow("subscriptionExpired")

    fun asSubscriptionFailed(): SubscriptionFailedWebhookEvent =
        subscriptionFailed.getOrThrow("subscriptionFailed")

    fun asSubscriptionOnHold(): SubscriptionOnHoldWebhookEvent =
        subscriptionOnHold.getOrThrow("subscriptionOnHold")

    fun asSubscriptionPlanChanged(): SubscriptionPlanChangedWebhookEvent =
        subscriptionPlanChanged.getOrThrow("subscriptionPlanChanged")

    fun asSubscriptionRenewed(): SubscriptionRenewedWebhookEvent =
        subscriptionRenewed.getOrThrow("subscriptionRenewed")

    fun asSubscriptionUpdated(): SubscriptionUpdatedWebhookEvent =
        subscriptionUpdated.getOrThrow("subscriptionUpdated")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            creditAdded != null -> visitor.visitCreditAdded(creditAdded)
            creditBalanceLow != null -> visitor.visitCreditBalanceLow(creditBalanceLow)
            creditDeducted != null -> visitor.visitCreditDeducted(creditDeducted)
            creditExpired != null -> visitor.visitCreditExpired(creditExpired)
            creditManualAdjustment != null ->
                visitor.visitCreditManualAdjustment(creditManualAdjustment)
            creditOverageCharged != null -> visitor.visitCreditOverageCharged(creditOverageCharged)
            creditRolledOver != null -> visitor.visitCreditRolledOver(creditRolledOver)
            creditRolloverForfeited != null ->
                visitor.visitCreditRolloverForfeited(creditRolloverForfeited)
            disputeAccepted != null -> visitor.visitDisputeAccepted(disputeAccepted)
            disputeCancelled != null -> visitor.visitDisputeCancelled(disputeCancelled)
            disputeChallenged != null -> visitor.visitDisputeChallenged(disputeChallenged)
            disputeExpired != null -> visitor.visitDisputeExpired(disputeExpired)
            disputeLost != null -> visitor.visitDisputeLost(disputeLost)
            disputeOpened != null -> visitor.visitDisputeOpened(disputeOpened)
            disputeWon != null -> visitor.visitDisputeWon(disputeWon)
            licenseKeyCreated != null -> visitor.visitLicenseKeyCreated(licenseKeyCreated)
            paymentCancelled != null -> visitor.visitPaymentCancelled(paymentCancelled)
            paymentFailed != null -> visitor.visitPaymentFailed(paymentFailed)
            paymentProcessing != null -> visitor.visitPaymentProcessing(paymentProcessing)
            paymentSucceeded != null -> visitor.visitPaymentSucceeded(paymentSucceeded)
            refundFailed != null -> visitor.visitRefundFailed(refundFailed)
            refundSucceeded != null -> visitor.visitRefundSucceeded(refundSucceeded)
            subscriptionActive != null -> visitor.visitSubscriptionActive(subscriptionActive)
            subscriptionCancelled != null ->
                visitor.visitSubscriptionCancelled(subscriptionCancelled)
            subscriptionExpired != null -> visitor.visitSubscriptionExpired(subscriptionExpired)
            subscriptionFailed != null -> visitor.visitSubscriptionFailed(subscriptionFailed)
            subscriptionOnHold != null -> visitor.visitSubscriptionOnHold(subscriptionOnHold)
            subscriptionPlanChanged != null ->
                visitor.visitSubscriptionPlanChanged(subscriptionPlanChanged)
            subscriptionRenewed != null -> visitor.visitSubscriptionRenewed(subscriptionRenewed)
            subscriptionUpdated != null -> visitor.visitSubscriptionUpdated(subscriptionUpdated)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): UnsafeUnwrapWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
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

                override fun visitCreditManualAdjustment(
                    creditManualAdjustment: CreditManualAdjustmentWebhookEvent
                ) {
                    creditManualAdjustment.validate()
                }

                override fun visitCreditOverageCharged(
                    creditOverageCharged: CreditOverageChargedWebhookEvent
                ) {
                    creditOverageCharged.validate()
                }

                override fun visitCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent) {
                    creditRolledOver.validate()
                }

                override fun visitCreditRolloverForfeited(
                    creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent
                ) {
                    creditRolloverForfeited.validate()
                }

                override fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) {
                    disputeAccepted.validate()
                }

                override fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) {
                    disputeCancelled.validate()
                }

                override fun visitDisputeChallenged(
                    disputeChallenged: DisputeChallengedWebhookEvent
                ) {
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

                override fun visitLicenseKeyCreated(
                    licenseKeyCreated: LicenseKeyCreatedWebhookEvent
                ) {
                    licenseKeyCreated.validate()
                }

                override fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) {
                    paymentCancelled.validate()
                }

                override fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) {
                    paymentFailed.validate()
                }

                override fun visitPaymentProcessing(
                    paymentProcessing: PaymentProcessingWebhookEvent
                ) {
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

                override fun visitSubscriptionActive(
                    subscriptionActive: SubscriptionActiveWebhookEvent
                ) {
                    subscriptionActive.validate()
                }

                override fun visitSubscriptionCancelled(
                    subscriptionCancelled: SubscriptionCancelledWebhookEvent
                ) {
                    subscriptionCancelled.validate()
                }

                override fun visitSubscriptionExpired(
                    subscriptionExpired: SubscriptionExpiredWebhookEvent
                ) {
                    subscriptionExpired.validate()
                }

                override fun visitSubscriptionFailed(
                    subscriptionFailed: SubscriptionFailedWebhookEvent
                ) {
                    subscriptionFailed.validate()
                }

                override fun visitSubscriptionOnHold(
                    subscriptionOnHold: SubscriptionOnHoldWebhookEvent
                ) {
                    subscriptionOnHold.validate()
                }

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
                ) {
                    subscriptionPlanChanged.validate()
                }

                override fun visitSubscriptionRenewed(
                    subscriptionRenewed: SubscriptionRenewedWebhookEvent
                ) {
                    subscriptionRenewed.validate()
                }

                override fun visitSubscriptionUpdated(
                    subscriptionUpdated: SubscriptionUpdatedWebhookEvent
                ) {
                    subscriptionUpdated.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitCreditAdded(creditAdded: CreditAddedWebhookEvent) =
                    creditAdded.validity()

                override fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent) =
                    creditBalanceLow.validity()

                override fun visitCreditDeducted(creditDeducted: CreditDeductedWebhookEvent) =
                    creditDeducted.validity()

                override fun visitCreditExpired(creditExpired: CreditExpiredWebhookEvent) =
                    creditExpired.validity()

                override fun visitCreditManualAdjustment(
                    creditManualAdjustment: CreditManualAdjustmentWebhookEvent
                ) = creditManualAdjustment.validity()

                override fun visitCreditOverageCharged(
                    creditOverageCharged: CreditOverageChargedWebhookEvent
                ) = creditOverageCharged.validity()

                override fun visitCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent) =
                    creditRolledOver.validity()

                override fun visitCreditRolloverForfeited(
                    creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent
                ) = creditRolloverForfeited.validity()

                override fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) =
                    disputeAccepted.validity()

                override fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) =
                    disputeCancelled.validity()

                override fun visitDisputeChallenged(
                    disputeChallenged: DisputeChallengedWebhookEvent
                ) = disputeChallenged.validity()

                override fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) =
                    disputeExpired.validity()

                override fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent) =
                    disputeLost.validity()

                override fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) =
                    disputeOpened.validity()

                override fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent) =
                    disputeWon.validity()

                override fun visitLicenseKeyCreated(
                    licenseKeyCreated: LicenseKeyCreatedWebhookEvent
                ) = licenseKeyCreated.validity()

                override fun visitPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) =
                    paymentCancelled.validity()

                override fun visitPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) =
                    paymentFailed.validity()

                override fun visitPaymentProcessing(
                    paymentProcessing: PaymentProcessingWebhookEvent
                ) = paymentProcessing.validity()

                override fun visitPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) =
                    paymentSucceeded.validity()

                override fun visitRefundFailed(refundFailed: RefundFailedWebhookEvent) =
                    refundFailed.validity()

                override fun visitRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) =
                    refundSucceeded.validity()

                override fun visitSubscriptionActive(
                    subscriptionActive: SubscriptionActiveWebhookEvent
                ) = subscriptionActive.validity()

                override fun visitSubscriptionCancelled(
                    subscriptionCancelled: SubscriptionCancelledWebhookEvent
                ) = subscriptionCancelled.validity()

                override fun visitSubscriptionExpired(
                    subscriptionExpired: SubscriptionExpiredWebhookEvent
                ) = subscriptionExpired.validity()

                override fun visitSubscriptionFailed(
                    subscriptionFailed: SubscriptionFailedWebhookEvent
                ) = subscriptionFailed.validity()

                override fun visitSubscriptionOnHold(
                    subscriptionOnHold: SubscriptionOnHoldWebhookEvent
                ) = subscriptionOnHold.validity()

                override fun visitSubscriptionPlanChanged(
                    subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
                ) = subscriptionPlanChanged.validity()

                override fun visitSubscriptionRenewed(
                    subscriptionRenewed: SubscriptionRenewedWebhookEvent
                ) = subscriptionRenewed.validity()

                override fun visitSubscriptionUpdated(
                    subscriptionUpdated: SubscriptionUpdatedWebhookEvent
                ) = subscriptionUpdated.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UnsafeUnwrapWebhookEvent &&
            creditAdded == other.creditAdded &&
            creditBalanceLow == other.creditBalanceLow &&
            creditDeducted == other.creditDeducted &&
            creditExpired == other.creditExpired &&
            creditManualAdjustment == other.creditManualAdjustment &&
            creditOverageCharged == other.creditOverageCharged &&
            creditRolledOver == other.creditRolledOver &&
            creditRolloverForfeited == other.creditRolloverForfeited &&
            disputeAccepted == other.disputeAccepted &&
            disputeCancelled == other.disputeCancelled &&
            disputeChallenged == other.disputeChallenged &&
            disputeExpired == other.disputeExpired &&
            disputeLost == other.disputeLost &&
            disputeOpened == other.disputeOpened &&
            disputeWon == other.disputeWon &&
            licenseKeyCreated == other.licenseKeyCreated &&
            paymentCancelled == other.paymentCancelled &&
            paymentFailed == other.paymentFailed &&
            paymentProcessing == other.paymentProcessing &&
            paymentSucceeded == other.paymentSucceeded &&
            refundFailed == other.refundFailed &&
            refundSucceeded == other.refundSucceeded &&
            subscriptionActive == other.subscriptionActive &&
            subscriptionCancelled == other.subscriptionCancelled &&
            subscriptionExpired == other.subscriptionExpired &&
            subscriptionFailed == other.subscriptionFailed &&
            subscriptionOnHold == other.subscriptionOnHold &&
            subscriptionPlanChanged == other.subscriptionPlanChanged &&
            subscriptionRenewed == other.subscriptionRenewed &&
            subscriptionUpdated == other.subscriptionUpdated
    }

    override fun hashCode(): Int =
        Objects.hash(
            creditAdded,
            creditBalanceLow,
            creditDeducted,
            creditExpired,
            creditManualAdjustment,
            creditOverageCharged,
            creditRolledOver,
            creditRolloverForfeited,
            disputeAccepted,
            disputeCancelled,
            disputeChallenged,
            disputeExpired,
            disputeLost,
            disputeOpened,
            disputeWon,
            licenseKeyCreated,
            paymentCancelled,
            paymentFailed,
            paymentProcessing,
            paymentSucceeded,
            refundFailed,
            refundSucceeded,
            subscriptionActive,
            subscriptionCancelled,
            subscriptionExpired,
            subscriptionFailed,
            subscriptionOnHold,
            subscriptionPlanChanged,
            subscriptionRenewed,
            subscriptionUpdated,
        )

    override fun toString(): String =
        when {
            creditAdded != null -> "UnsafeUnwrapWebhookEvent{creditAdded=$creditAdded}"
            creditBalanceLow != null ->
                "UnsafeUnwrapWebhookEvent{creditBalanceLow=$creditBalanceLow}"
            creditDeducted != null -> "UnsafeUnwrapWebhookEvent{creditDeducted=$creditDeducted}"
            creditExpired != null -> "UnsafeUnwrapWebhookEvent{creditExpired=$creditExpired}"
            creditManualAdjustment != null ->
                "UnsafeUnwrapWebhookEvent{creditManualAdjustment=$creditManualAdjustment}"
            creditOverageCharged != null ->
                "UnsafeUnwrapWebhookEvent{creditOverageCharged=$creditOverageCharged}"
            creditRolledOver != null ->
                "UnsafeUnwrapWebhookEvent{creditRolledOver=$creditRolledOver}"
            creditRolloverForfeited != null ->
                "UnsafeUnwrapWebhookEvent{creditRolloverForfeited=$creditRolloverForfeited}"
            disputeAccepted != null -> "UnsafeUnwrapWebhookEvent{disputeAccepted=$disputeAccepted}"
            disputeCancelled != null ->
                "UnsafeUnwrapWebhookEvent{disputeCancelled=$disputeCancelled}"
            disputeChallenged != null ->
                "UnsafeUnwrapWebhookEvent{disputeChallenged=$disputeChallenged}"
            disputeExpired != null -> "UnsafeUnwrapWebhookEvent{disputeExpired=$disputeExpired}"
            disputeLost != null -> "UnsafeUnwrapWebhookEvent{disputeLost=$disputeLost}"
            disputeOpened != null -> "UnsafeUnwrapWebhookEvent{disputeOpened=$disputeOpened}"
            disputeWon != null -> "UnsafeUnwrapWebhookEvent{disputeWon=$disputeWon}"
            licenseKeyCreated != null ->
                "UnsafeUnwrapWebhookEvent{licenseKeyCreated=$licenseKeyCreated}"
            paymentCancelled != null ->
                "UnsafeUnwrapWebhookEvent{paymentCancelled=$paymentCancelled}"
            paymentFailed != null -> "UnsafeUnwrapWebhookEvent{paymentFailed=$paymentFailed}"
            paymentProcessing != null ->
                "UnsafeUnwrapWebhookEvent{paymentProcessing=$paymentProcessing}"
            paymentSucceeded != null ->
                "UnsafeUnwrapWebhookEvent{paymentSucceeded=$paymentSucceeded}"
            refundFailed != null -> "UnsafeUnwrapWebhookEvent{refundFailed=$refundFailed}"
            refundSucceeded != null -> "UnsafeUnwrapWebhookEvent{refundSucceeded=$refundSucceeded}"
            subscriptionActive != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionActive=$subscriptionActive}"
            subscriptionCancelled != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionCancelled=$subscriptionCancelled}"
            subscriptionExpired != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionExpired=$subscriptionExpired}"
            subscriptionFailed != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionFailed=$subscriptionFailed}"
            subscriptionOnHold != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionOnHold=$subscriptionOnHold}"
            subscriptionPlanChanged != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionPlanChanged=$subscriptionPlanChanged}"
            subscriptionRenewed != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionRenewed=$subscriptionRenewed}"
            subscriptionUpdated != null ->
                "UnsafeUnwrapWebhookEvent{subscriptionUpdated=$subscriptionUpdated}"
            _json != null -> "UnsafeUnwrapWebhookEvent{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid UnsafeUnwrapWebhookEvent")
        }

    companion object {

        @JvmStatic
        fun ofCreditAdded(creditAdded: CreditAddedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditAdded = creditAdded)

        @JvmStatic
        fun ofCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditBalanceLow = creditBalanceLow)

        @JvmStatic
        fun ofCreditDeducted(creditDeducted: CreditDeductedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditDeducted = creditDeducted)

        @JvmStatic
        fun ofCreditExpired(creditExpired: CreditExpiredWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditExpired = creditExpired)

        @JvmStatic
        fun ofCreditManualAdjustment(creditManualAdjustment: CreditManualAdjustmentWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditManualAdjustment = creditManualAdjustment)

        @JvmStatic
        fun ofCreditOverageCharged(creditOverageCharged: CreditOverageChargedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditOverageCharged = creditOverageCharged)

        @JvmStatic
        fun ofCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent) =
            UnsafeUnwrapWebhookEvent(creditRolledOver = creditRolledOver)

        @JvmStatic
        fun ofCreditRolloverForfeited(
            creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent
        ) = UnsafeUnwrapWebhookEvent(creditRolloverForfeited = creditRolloverForfeited)

        @JvmStatic
        fun ofDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeAccepted = disputeAccepted)

        @JvmStatic
        fun ofDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeCancelled = disputeCancelled)

        @JvmStatic
        fun ofDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeChallenged = disputeChallenged)

        @JvmStatic
        fun ofDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeExpired = disputeExpired)

        @JvmStatic
        fun ofDisputeLost(disputeLost: DisputeLostWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeLost = disputeLost)

        @JvmStatic
        fun ofDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeOpened = disputeOpened)

        @JvmStatic
        fun ofDisputeWon(disputeWon: DisputeWonWebhookEvent) =
            UnsafeUnwrapWebhookEvent(disputeWon = disputeWon)

        @JvmStatic
        fun ofLicenseKeyCreated(licenseKeyCreated: LicenseKeyCreatedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(licenseKeyCreated = licenseKeyCreated)

        @JvmStatic
        fun ofPaymentCancelled(paymentCancelled: PaymentCancelledWebhookEvent) =
            UnsafeUnwrapWebhookEvent(paymentCancelled = paymentCancelled)

        @JvmStatic
        fun ofPaymentFailed(paymentFailed: PaymentFailedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(paymentFailed = paymentFailed)

        @JvmStatic
        fun ofPaymentProcessing(paymentProcessing: PaymentProcessingWebhookEvent) =
            UnsafeUnwrapWebhookEvent(paymentProcessing = paymentProcessing)

        @JvmStatic
        fun ofPaymentSucceeded(paymentSucceeded: PaymentSucceededWebhookEvent) =
            UnsafeUnwrapWebhookEvent(paymentSucceeded = paymentSucceeded)

        @JvmStatic
        fun ofRefundFailed(refundFailed: RefundFailedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(refundFailed = refundFailed)

        @JvmStatic
        fun ofRefundSucceeded(refundSucceeded: RefundSucceededWebhookEvent) =
            UnsafeUnwrapWebhookEvent(refundSucceeded = refundSucceeded)

        @JvmStatic
        fun ofSubscriptionActive(subscriptionActive: SubscriptionActiveWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionActive = subscriptionActive)

        @JvmStatic
        fun ofSubscriptionCancelled(subscriptionCancelled: SubscriptionCancelledWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionCancelled = subscriptionCancelled)

        @JvmStatic
        fun ofSubscriptionExpired(subscriptionExpired: SubscriptionExpiredWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionExpired = subscriptionExpired)

        @JvmStatic
        fun ofSubscriptionFailed(subscriptionFailed: SubscriptionFailedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionFailed = subscriptionFailed)

        @JvmStatic
        fun ofSubscriptionOnHold(subscriptionOnHold: SubscriptionOnHoldWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionOnHold = subscriptionOnHold)

        @JvmStatic
        fun ofSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
        ) = UnsafeUnwrapWebhookEvent(subscriptionPlanChanged = subscriptionPlanChanged)

        @JvmStatic
        fun ofSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionRenewed = subscriptionRenewed)

        @JvmStatic
        fun ofSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent) =
            UnsafeUnwrapWebhookEvent(subscriptionUpdated = subscriptionUpdated)
    }

    /**
     * An interface that defines how to map each variant of [UnsafeUnwrapWebhookEvent] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitCreditAdded(creditAdded: CreditAddedWebhookEvent): T

        fun visitCreditBalanceLow(creditBalanceLow: CreditBalanceLowWebhookEvent): T

        fun visitCreditDeducted(creditDeducted: CreditDeductedWebhookEvent): T

        fun visitCreditExpired(creditExpired: CreditExpiredWebhookEvent): T

        fun visitCreditManualAdjustment(
            creditManualAdjustment: CreditManualAdjustmentWebhookEvent
        ): T

        fun visitCreditOverageCharged(creditOverageCharged: CreditOverageChargedWebhookEvent): T

        fun visitCreditRolledOver(creditRolledOver: CreditRolledOverWebhookEvent): T

        fun visitCreditRolloverForfeited(
            creditRolloverForfeited: CreditRolloverForfeitedWebhookEvent
        ): T

        fun visitDisputeAccepted(disputeAccepted: DisputeAcceptedWebhookEvent): T

        fun visitDisputeCancelled(disputeCancelled: DisputeCancelledWebhookEvent): T

        fun visitDisputeChallenged(disputeChallenged: DisputeChallengedWebhookEvent): T

        fun visitDisputeExpired(disputeExpired: DisputeExpiredWebhookEvent): T

        fun visitDisputeLost(disputeLost: DisputeLostWebhookEvent): T

        fun visitDisputeOpened(disputeOpened: DisputeOpenedWebhookEvent): T

        fun visitDisputeWon(disputeWon: DisputeWonWebhookEvent): T

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

        fun visitSubscriptionPlanChanged(
            subscriptionPlanChanged: SubscriptionPlanChangedWebhookEvent
        ): T

        fun visitSubscriptionRenewed(subscriptionRenewed: SubscriptionRenewedWebhookEvent): T

        fun visitSubscriptionUpdated(subscriptionUpdated: SubscriptionUpdatedWebhookEvent): T

        /**
         * Maps an unknown variant of [UnsafeUnwrapWebhookEvent] to a value of type [T].
         *
         * An instance of [UnsafeUnwrapWebhookEvent] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws DodoPaymentsInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw DodoPaymentsInvalidDataException("Unknown UnsafeUnwrapWebhookEvent: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<UnsafeUnwrapWebhookEvent>(UnsafeUnwrapWebhookEvent::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): UnsafeUnwrapWebhookEvent {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<CreditAddedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(creditAdded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreditBalanceLowWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(creditBalanceLow = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreditDeductedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(creditDeducted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreditExpiredWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(creditExpired = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreditManualAdjustmentWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(creditManualAdjustment = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<CreditOverageChargedWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(creditOverageCharged = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<CreditRolledOverWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(creditRolledOver = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<CreditRolloverForfeitedWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(creditRolloverForfeited = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<DisputeAcceptedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeAccepted = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeCancelledWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeCancelled = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeChallengedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeChallenged = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeExpiredWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeExpired = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeLostWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeLost = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeOpenedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeOpened = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<DisputeWonWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(disputeWon = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LicenseKeyCreatedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(licenseKeyCreated = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentCancelledWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(paymentCancelled = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentFailedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(paymentFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentProcessingWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(paymentProcessing = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PaymentSucceededWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(paymentSucceeded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RefundFailedWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(refundFailed = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RefundSucceededWebhookEvent>())?.let {
                            UnsafeUnwrapWebhookEvent(refundSucceeded = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionActiveWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionActive = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionCancelledWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionCancelled = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionExpiredWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionExpired = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionFailedWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionFailed = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionOnHoldWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionOnHold = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionPlanChangedWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionPlanChanged = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionRenewedWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionRenewed = it, _json = json)
                            },
                        tryDeserialize(node, jacksonTypeRef<SubscriptionUpdatedWebhookEvent>())
                            ?.let {
                                UnsafeUnwrapWebhookEvent(subscriptionUpdated = it, _json = json)
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> UnsafeUnwrapWebhookEvent(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<UnsafeUnwrapWebhookEvent>(UnsafeUnwrapWebhookEvent::class) {

        override fun serialize(
            value: UnsafeUnwrapWebhookEvent,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.creditAdded != null -> generator.writeObject(value.creditAdded)
                value.creditBalanceLow != null -> generator.writeObject(value.creditBalanceLow)
                value.creditDeducted != null -> generator.writeObject(value.creditDeducted)
                value.creditExpired != null -> generator.writeObject(value.creditExpired)
                value.creditManualAdjustment != null ->
                    generator.writeObject(value.creditManualAdjustment)
                value.creditOverageCharged != null ->
                    generator.writeObject(value.creditOverageCharged)
                value.creditRolledOver != null -> generator.writeObject(value.creditRolledOver)
                value.creditRolloverForfeited != null ->
                    generator.writeObject(value.creditRolloverForfeited)
                value.disputeAccepted != null -> generator.writeObject(value.disputeAccepted)
                value.disputeCancelled != null -> generator.writeObject(value.disputeCancelled)
                value.disputeChallenged != null -> generator.writeObject(value.disputeChallenged)
                value.disputeExpired != null -> generator.writeObject(value.disputeExpired)
                value.disputeLost != null -> generator.writeObject(value.disputeLost)
                value.disputeOpened != null -> generator.writeObject(value.disputeOpened)
                value.disputeWon != null -> generator.writeObject(value.disputeWon)
                value.licenseKeyCreated != null -> generator.writeObject(value.licenseKeyCreated)
                value.paymentCancelled != null -> generator.writeObject(value.paymentCancelled)
                value.paymentFailed != null -> generator.writeObject(value.paymentFailed)
                value.paymentProcessing != null -> generator.writeObject(value.paymentProcessing)
                value.paymentSucceeded != null -> generator.writeObject(value.paymentSucceeded)
                value.refundFailed != null -> generator.writeObject(value.refundFailed)
                value.refundSucceeded != null -> generator.writeObject(value.refundSucceeded)
                value.subscriptionActive != null -> generator.writeObject(value.subscriptionActive)
                value.subscriptionCancelled != null ->
                    generator.writeObject(value.subscriptionCancelled)
                value.subscriptionExpired != null ->
                    generator.writeObject(value.subscriptionExpired)
                value.subscriptionFailed != null -> generator.writeObject(value.subscriptionFailed)
                value.subscriptionOnHold != null -> generator.writeObject(value.subscriptionOnHold)
                value.subscriptionPlanChanged != null ->
                    generator.writeObject(value.subscriptionPlanChanged)
                value.subscriptionRenewed != null ->
                    generator.writeObject(value.subscriptionRenewed)
                value.subscriptionUpdated != null ->
                    generator.writeObject(value.subscriptionUpdated)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid UnsafeUnwrapWebhookEvent")
            }
        }
    }
}
