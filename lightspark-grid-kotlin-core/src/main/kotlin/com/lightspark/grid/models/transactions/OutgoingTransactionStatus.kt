// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * Status of an outgoing payment transaction.
 *
 * | Status       | Description                                             |
 * |--------------|---------------------------------------------------------|
 * | `PENDING`    | Quote is pending confirmation                           |
 * | `EXPIRED`    | Quote wasn't executed before expiry window              |
 * | `PROCESSING` | Executing the quote after receiving funds               |
 * | `COMPLETED`  | Payout successfully reached the destination             |
 * | `FAILED`     | Something went wrong — accompanied by a `failureReason` |
 */
class OutgoingTransactionStatus
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

        val PENDING = of("PENDING")

        val EXPIRED = of("EXPIRED")

        val PROCESSING = of("PROCESSING")

        val COMPLETED = of("COMPLETED")

        val FAILED = of("FAILED")

        fun of(value: String) = OutgoingTransactionStatus(JsonField.of(value))
    }

    /** An enum containing [OutgoingTransactionStatus]'s known values. */
    enum class Known {
        PENDING,
        EXPIRED,
        PROCESSING,
        COMPLETED,
        FAILED,
    }

    /**
     * An enum containing [OutgoingTransactionStatus]'s known values, as well as an [_UNKNOWN]
     * member.
     *
     * An instance of [OutgoingTransactionStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        PENDING,
        EXPIRED,
        PROCESSING,
        COMPLETED,
        FAILED,
        /**
         * An enum member indicating that [OutgoingTransactionStatus] was instantiated with an
         * unknown value.
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
            PENDING -> Value.PENDING
            EXPIRED -> Value.EXPIRED
            PROCESSING -> Value.PROCESSING
            COMPLETED -> Value.COMPLETED
            FAILED -> Value.FAILED
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
            PENDING -> Known.PENDING
            EXPIRED -> Known.EXPIRED
            PROCESSING -> Known.PROCESSING
            COMPLETED -> Known.COMPLETED
            FAILED -> Known.FAILED
            else ->
                throw LightsparkGridInvalidDataException(
                    "Unknown OutgoingTransactionStatus: $value"
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

    fun validate(): OutgoingTransactionStatus = apply {
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

        return other is OutgoingTransactionStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
