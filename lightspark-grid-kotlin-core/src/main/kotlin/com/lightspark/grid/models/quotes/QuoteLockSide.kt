// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`. For
 * example, if I want to send exactly $5 MXN from my wallet, I would set this to "sending", and the
 * `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to receive exactly $10 USD, I
 * would set this to "receiving" and the `lockedCurrencyAmount` to 10000 (in cents).
 */
class QuoteLockSide @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val SENDING = of("SENDING")

        val RECEIVING = of("RECEIVING")

        fun of(value: String) = QuoteLockSide(JsonField.of(value))
    }

    /** An enum containing [QuoteLockSide]'s known values. */
    enum class Known {
        SENDING,
        RECEIVING,
    }

    /**
     * An enum containing [QuoteLockSide]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [QuoteLockSide] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SENDING,
        RECEIVING,
        /**
         * An enum member indicating that [QuoteLockSide] was instantiated with an unknown value.
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
            SENDING -> Value.SENDING
            RECEIVING -> Value.RECEIVING
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
            SENDING -> Known.SENDING
            RECEIVING -> Known.RECEIVING
            else -> throw LightsparkGridInvalidDataException("Unknown QuoteLockSide: $value")
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
    fun validate(): QuoteLockSide = apply {
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

        return other is QuoteLockSide && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
