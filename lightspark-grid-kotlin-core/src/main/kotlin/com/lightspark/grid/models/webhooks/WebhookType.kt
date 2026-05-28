// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * Type of webhook event in OBJECT.EVENT dot-notation. The part before the dot identifies the
 * resource, the part after identifies the event. This lets consumers route purely on type without
 * inspecting data.status.
 */
class WebhookType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val OUTGOING_PAYMENT_PENDING = of("OUTGOING_PAYMENT.PENDING")

        val OUTGOING_PAYMENT_PROCESSING = of("OUTGOING_PAYMENT.PROCESSING")

        val OUTGOING_PAYMENT_COMPLETED = of("OUTGOING_PAYMENT.COMPLETED")

        val OUTGOING_PAYMENT_FAILED = of("OUTGOING_PAYMENT.FAILED")

        val OUTGOING_PAYMENT_EXPIRED = of("OUTGOING_PAYMENT.EXPIRED")

        val OUTGOING_PAYMENT_REFUND_PENDING = of("OUTGOING_PAYMENT.REFUND_PENDING")

        val OUTGOING_PAYMENT_REFUND_COMPLETED = of("OUTGOING_PAYMENT.REFUND_COMPLETED")

        val OUTGOING_PAYMENT_REFUND_FAILED = of("OUTGOING_PAYMENT.REFUND_FAILED")

        val INCOMING_PAYMENT_PENDING = of("INCOMING_PAYMENT.PENDING")

        val INCOMING_PAYMENT_COMPLETED = of("INCOMING_PAYMENT.COMPLETED")

        val INCOMING_PAYMENT_FAILED = of("INCOMING_PAYMENT.FAILED")

        val CUSTOMER_KYC_APPROVED = of("CUSTOMER.KYC_APPROVED")

        val CUSTOMER_KYC_REJECTED = of("CUSTOMER.KYC_REJECTED")

        val CUSTOMER_KYC_PENDING = of("CUSTOMER.KYC_PENDING")

        val CUSTOMER_KYB_APPROVED = of("CUSTOMER.KYB_APPROVED")

        val CUSTOMER_KYB_REJECTED = of("CUSTOMER.KYB_REJECTED")

        val CUSTOMER_KYB_PENDING = of("CUSTOMER.KYB_PENDING")

        val VERIFICATION_APPROVED = of("VERIFICATION.APPROVED")

        val VERIFICATION_REJECTED = of("VERIFICATION.REJECTED")

        val VERIFICATION_RESOLVE_ERRORS = of("VERIFICATION.RESOLVE_ERRORS")

        val VERIFICATION_IN_PROGRESS = of("VERIFICATION.IN_PROGRESS")

        val VERIFICATION_PENDING_MANUAL_REVIEW = of("VERIFICATION.PENDING_MANUAL_REVIEW")

        val VERIFICATION_READY_FOR_VERIFICATION = of("VERIFICATION.READY_FOR_VERIFICATION")

        val INTERNAL_ACCOUNT_BALANCE_UPDATED = of("INTERNAL_ACCOUNT.BALANCE_UPDATED")

        val INTERNAL_ACCOUNT_STATUS_UPDATED = of("INTERNAL_ACCOUNT.STATUS_UPDATED")

        val INVITATION_CLAIMED = of("INVITATION.CLAIMED")

        val BULK_UPLOAD_COMPLETED = of("BULK_UPLOAD.COMPLETED")

        val BULK_UPLOAD_FAILED = of("BULK_UPLOAD.FAILED")

        val AGENT_ACTION_PENDING_APPROVAL = of("AGENT_ACTION.PENDING_APPROVAL")

        val CARD_STATE_CHANGE = of("CARD.STATE_CHANGE")

        val CARD_FUNDING_SOURCE_CHANGE = of("CARD.FUNDING_SOURCE_CHANGE")

        val TEST = of("TEST")

        fun of(value: String) = WebhookType(JsonField.of(value))
    }

    /** An enum containing [WebhookType]'s known values. */
    enum class Known {
        OUTGOING_PAYMENT_PENDING,
        OUTGOING_PAYMENT_PROCESSING,
        OUTGOING_PAYMENT_COMPLETED,
        OUTGOING_PAYMENT_FAILED,
        OUTGOING_PAYMENT_EXPIRED,
        OUTGOING_PAYMENT_REFUND_PENDING,
        OUTGOING_PAYMENT_REFUND_COMPLETED,
        OUTGOING_PAYMENT_REFUND_FAILED,
        INCOMING_PAYMENT_PENDING,
        INCOMING_PAYMENT_COMPLETED,
        INCOMING_PAYMENT_FAILED,
        CUSTOMER_KYC_APPROVED,
        CUSTOMER_KYC_REJECTED,
        CUSTOMER_KYC_PENDING,
        CUSTOMER_KYB_APPROVED,
        CUSTOMER_KYB_REJECTED,
        CUSTOMER_KYB_PENDING,
        VERIFICATION_APPROVED,
        VERIFICATION_REJECTED,
        VERIFICATION_RESOLVE_ERRORS,
        VERIFICATION_IN_PROGRESS,
        VERIFICATION_PENDING_MANUAL_REVIEW,
        VERIFICATION_READY_FOR_VERIFICATION,
        INTERNAL_ACCOUNT_BALANCE_UPDATED,
        INTERNAL_ACCOUNT_STATUS_UPDATED,
        INVITATION_CLAIMED,
        BULK_UPLOAD_COMPLETED,
        BULK_UPLOAD_FAILED,
        AGENT_ACTION_PENDING_APPROVAL,
        CARD_STATE_CHANGE,
        CARD_FUNDING_SOURCE_CHANGE,
        TEST,
    }

    /**
     * An enum containing [WebhookType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [WebhookType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        OUTGOING_PAYMENT_PENDING,
        OUTGOING_PAYMENT_PROCESSING,
        OUTGOING_PAYMENT_COMPLETED,
        OUTGOING_PAYMENT_FAILED,
        OUTGOING_PAYMENT_EXPIRED,
        OUTGOING_PAYMENT_REFUND_PENDING,
        OUTGOING_PAYMENT_REFUND_COMPLETED,
        OUTGOING_PAYMENT_REFUND_FAILED,
        INCOMING_PAYMENT_PENDING,
        INCOMING_PAYMENT_COMPLETED,
        INCOMING_PAYMENT_FAILED,
        CUSTOMER_KYC_APPROVED,
        CUSTOMER_KYC_REJECTED,
        CUSTOMER_KYC_PENDING,
        CUSTOMER_KYB_APPROVED,
        CUSTOMER_KYB_REJECTED,
        CUSTOMER_KYB_PENDING,
        VERIFICATION_APPROVED,
        VERIFICATION_REJECTED,
        VERIFICATION_RESOLVE_ERRORS,
        VERIFICATION_IN_PROGRESS,
        VERIFICATION_PENDING_MANUAL_REVIEW,
        VERIFICATION_READY_FOR_VERIFICATION,
        INTERNAL_ACCOUNT_BALANCE_UPDATED,
        INTERNAL_ACCOUNT_STATUS_UPDATED,
        INVITATION_CLAIMED,
        BULK_UPLOAD_COMPLETED,
        BULK_UPLOAD_FAILED,
        AGENT_ACTION_PENDING_APPROVAL,
        CARD_STATE_CHANGE,
        CARD_FUNDING_SOURCE_CHANGE,
        TEST,
        /** An enum member indicating that [WebhookType] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            OUTGOING_PAYMENT_PENDING -> Value.OUTGOING_PAYMENT_PENDING
            OUTGOING_PAYMENT_PROCESSING -> Value.OUTGOING_PAYMENT_PROCESSING
            OUTGOING_PAYMENT_COMPLETED -> Value.OUTGOING_PAYMENT_COMPLETED
            OUTGOING_PAYMENT_FAILED -> Value.OUTGOING_PAYMENT_FAILED
            OUTGOING_PAYMENT_EXPIRED -> Value.OUTGOING_PAYMENT_EXPIRED
            OUTGOING_PAYMENT_REFUND_PENDING -> Value.OUTGOING_PAYMENT_REFUND_PENDING
            OUTGOING_PAYMENT_REFUND_COMPLETED -> Value.OUTGOING_PAYMENT_REFUND_COMPLETED
            OUTGOING_PAYMENT_REFUND_FAILED -> Value.OUTGOING_PAYMENT_REFUND_FAILED
            INCOMING_PAYMENT_PENDING -> Value.INCOMING_PAYMENT_PENDING
            INCOMING_PAYMENT_COMPLETED -> Value.INCOMING_PAYMENT_COMPLETED
            INCOMING_PAYMENT_FAILED -> Value.INCOMING_PAYMENT_FAILED
            CUSTOMER_KYC_APPROVED -> Value.CUSTOMER_KYC_APPROVED
            CUSTOMER_KYC_REJECTED -> Value.CUSTOMER_KYC_REJECTED
            CUSTOMER_KYC_PENDING -> Value.CUSTOMER_KYC_PENDING
            CUSTOMER_KYB_APPROVED -> Value.CUSTOMER_KYB_APPROVED
            CUSTOMER_KYB_REJECTED -> Value.CUSTOMER_KYB_REJECTED
            CUSTOMER_KYB_PENDING -> Value.CUSTOMER_KYB_PENDING
            VERIFICATION_APPROVED -> Value.VERIFICATION_APPROVED
            VERIFICATION_REJECTED -> Value.VERIFICATION_REJECTED
            VERIFICATION_RESOLVE_ERRORS -> Value.VERIFICATION_RESOLVE_ERRORS
            VERIFICATION_IN_PROGRESS -> Value.VERIFICATION_IN_PROGRESS
            VERIFICATION_PENDING_MANUAL_REVIEW -> Value.VERIFICATION_PENDING_MANUAL_REVIEW
            VERIFICATION_READY_FOR_VERIFICATION -> Value.VERIFICATION_READY_FOR_VERIFICATION
            INTERNAL_ACCOUNT_BALANCE_UPDATED -> Value.INTERNAL_ACCOUNT_BALANCE_UPDATED
            INTERNAL_ACCOUNT_STATUS_UPDATED -> Value.INTERNAL_ACCOUNT_STATUS_UPDATED
            INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
            BULK_UPLOAD_COMPLETED -> Value.BULK_UPLOAD_COMPLETED
            BULK_UPLOAD_FAILED -> Value.BULK_UPLOAD_FAILED
            AGENT_ACTION_PENDING_APPROVAL -> Value.AGENT_ACTION_PENDING_APPROVAL
            CARD_STATE_CHANGE -> Value.CARD_STATE_CHANGE
            CARD_FUNDING_SOURCE_CHANGE -> Value.CARD_FUNDING_SOURCE_CHANGE
            TEST -> Value.TEST
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            OUTGOING_PAYMENT_PENDING -> Known.OUTGOING_PAYMENT_PENDING
            OUTGOING_PAYMENT_PROCESSING -> Known.OUTGOING_PAYMENT_PROCESSING
            OUTGOING_PAYMENT_COMPLETED -> Known.OUTGOING_PAYMENT_COMPLETED
            OUTGOING_PAYMENT_FAILED -> Known.OUTGOING_PAYMENT_FAILED
            OUTGOING_PAYMENT_EXPIRED -> Known.OUTGOING_PAYMENT_EXPIRED
            OUTGOING_PAYMENT_REFUND_PENDING -> Known.OUTGOING_PAYMENT_REFUND_PENDING
            OUTGOING_PAYMENT_REFUND_COMPLETED -> Known.OUTGOING_PAYMENT_REFUND_COMPLETED
            OUTGOING_PAYMENT_REFUND_FAILED -> Known.OUTGOING_PAYMENT_REFUND_FAILED
            INCOMING_PAYMENT_PENDING -> Known.INCOMING_PAYMENT_PENDING
            INCOMING_PAYMENT_COMPLETED -> Known.INCOMING_PAYMENT_COMPLETED
            INCOMING_PAYMENT_FAILED -> Known.INCOMING_PAYMENT_FAILED
            CUSTOMER_KYC_APPROVED -> Known.CUSTOMER_KYC_APPROVED
            CUSTOMER_KYC_REJECTED -> Known.CUSTOMER_KYC_REJECTED
            CUSTOMER_KYC_PENDING -> Known.CUSTOMER_KYC_PENDING
            CUSTOMER_KYB_APPROVED -> Known.CUSTOMER_KYB_APPROVED
            CUSTOMER_KYB_REJECTED -> Known.CUSTOMER_KYB_REJECTED
            CUSTOMER_KYB_PENDING -> Known.CUSTOMER_KYB_PENDING
            VERIFICATION_APPROVED -> Known.VERIFICATION_APPROVED
            VERIFICATION_REJECTED -> Known.VERIFICATION_REJECTED
            VERIFICATION_RESOLVE_ERRORS -> Known.VERIFICATION_RESOLVE_ERRORS
            VERIFICATION_IN_PROGRESS -> Known.VERIFICATION_IN_PROGRESS
            VERIFICATION_PENDING_MANUAL_REVIEW -> Known.VERIFICATION_PENDING_MANUAL_REVIEW
            VERIFICATION_READY_FOR_VERIFICATION -> Known.VERIFICATION_READY_FOR_VERIFICATION
            INTERNAL_ACCOUNT_BALANCE_UPDATED -> Known.INTERNAL_ACCOUNT_BALANCE_UPDATED
            INTERNAL_ACCOUNT_STATUS_UPDATED -> Known.INTERNAL_ACCOUNT_STATUS_UPDATED
            INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
            BULK_UPLOAD_COMPLETED -> Known.BULK_UPLOAD_COMPLETED
            BULK_UPLOAD_FAILED -> Known.BULK_UPLOAD_FAILED
            AGENT_ACTION_PENDING_APPROVAL -> Known.AGENT_ACTION_PENDING_APPROVAL
            CARD_STATE_CHANGE -> Known.CARD_STATE_CHANGE
            CARD_FUNDING_SOURCE_CHANGE -> Known.CARD_FUNDING_SOURCE_CHANGE
            TEST -> Known.TEST
            else -> throw LightsparkGridInvalidDataException("Unknown WebhookType: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LightsparkGridInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WebhookType = apply {
        if (validated) {
            return@apply
        }

        known()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LightsparkGridInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WebhookType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
