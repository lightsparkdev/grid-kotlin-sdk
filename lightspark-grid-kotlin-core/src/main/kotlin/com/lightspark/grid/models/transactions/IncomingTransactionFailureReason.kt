// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * Reason for failure of an incoming transaction. This is used to provide more context on why a
 * transaction failed. If the transaction is not in a failed state, this field is omitted.
 */
class IncomingTransactionFailureReason
@JsonCreator
private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val LNURLP_FAILED = of("LNURLP_FAILED")

        val PAY_REQUEST_FAILED = of("PAY_REQUEST_FAILED")

        val PAYMENT_APPROVAL_WEBHOOK_ERROR = of("PAYMENT_APPROVAL_WEBHOOK_ERROR")

        val PAYMENT_APPROVAL_TIMED_OUT = of("PAYMENT_APPROVAL_TIMED_OUT")

        val OFFRAMP_FAILED = of("OFFRAMP_FAILED")

        val MISSING_MANDATORY_PAYEE_DATA = of("MISSING_MANDATORY_PAYEE_DATA")

        val QUOTE_EXPIRED = of("QUOTE_EXPIRED")

        val QUOTE_EXECUTION_FAILED = of("QUOTE_EXECUTION_FAILED")

        fun of(value: String) = IncomingTransactionFailureReason(JsonField.of(value))
    }

    /** An enum containing [IncomingTransactionFailureReason]'s known values. */
    enum class Known {
        LNURLP_FAILED,
        PAY_REQUEST_FAILED,
        PAYMENT_APPROVAL_WEBHOOK_ERROR,
        PAYMENT_APPROVAL_TIMED_OUT,
        OFFRAMP_FAILED,
        MISSING_MANDATORY_PAYEE_DATA,
        QUOTE_EXPIRED,
        QUOTE_EXECUTION_FAILED,
    }

    /**
     * An enum containing [IncomingTransactionFailureReason]'s known values, as well as an
     * [_UNKNOWN] member.
     *
     * An instance of [IncomingTransactionFailureReason] can contain an unknown value in a couple of
     * cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        LNURLP_FAILED,
        PAY_REQUEST_FAILED,
        PAYMENT_APPROVAL_WEBHOOK_ERROR,
        PAYMENT_APPROVAL_TIMED_OUT,
        OFFRAMP_FAILED,
        MISSING_MANDATORY_PAYEE_DATA,
        QUOTE_EXPIRED,
        QUOTE_EXECUTION_FAILED,
        /**
         * An enum member indicating that [IncomingTransactionFailureReason] was instantiated with
         * an unknown value.
         */
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
            LNURLP_FAILED -> Value.LNURLP_FAILED
            PAY_REQUEST_FAILED -> Value.PAY_REQUEST_FAILED
            PAYMENT_APPROVAL_WEBHOOK_ERROR -> Value.PAYMENT_APPROVAL_WEBHOOK_ERROR
            PAYMENT_APPROVAL_TIMED_OUT -> Value.PAYMENT_APPROVAL_TIMED_OUT
            OFFRAMP_FAILED -> Value.OFFRAMP_FAILED
            MISSING_MANDATORY_PAYEE_DATA -> Value.MISSING_MANDATORY_PAYEE_DATA
            QUOTE_EXPIRED -> Value.QUOTE_EXPIRED
            QUOTE_EXECUTION_FAILED -> Value.QUOTE_EXECUTION_FAILED
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
            LNURLP_FAILED -> Known.LNURLP_FAILED
            PAY_REQUEST_FAILED -> Known.PAY_REQUEST_FAILED
            PAYMENT_APPROVAL_WEBHOOK_ERROR -> Known.PAYMENT_APPROVAL_WEBHOOK_ERROR
            PAYMENT_APPROVAL_TIMED_OUT -> Known.PAYMENT_APPROVAL_TIMED_OUT
            OFFRAMP_FAILED -> Known.OFFRAMP_FAILED
            MISSING_MANDATORY_PAYEE_DATA -> Known.MISSING_MANDATORY_PAYEE_DATA
            QUOTE_EXPIRED -> Known.QUOTE_EXPIRED
            QUOTE_EXECUTION_FAILED -> Known.QUOTE_EXECUTION_FAILED
            else ->
                throw LightsparkGridInvalidDataException(
                    "Unknown IncomingTransactionFailureReason: $value"
                )
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
    fun validate(): IncomingTransactionFailureReason = apply {
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

        return other is IncomingTransactionFailureReason && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
