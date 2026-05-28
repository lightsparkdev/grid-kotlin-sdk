// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * Lifecycle status of a card transaction.
 *
 * |Status             |Description                                                                                                                                                                                                                                    |
 * |-------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
 * |`AUTHORIZED`       |The auth has been approved and a hold placed on the funding source; no clearing has arrived yet.                                                                                                                                               |
 * |`PARTIALLY_SETTLED`|At least one clearing has arrived and posted, but more clearings are still expected (split shipments, tips, multi-leg trips).                                                                                                                  |
 * |`SETTLED`          |All clearings for the auth have posted and the transaction is closed against the funding source.                                                                                                                                               |
 * |`REFUNDED`         |A `RETURN` was received from the merchant; the net settled amount has been refunded in part or whole.                                                                                                                                          |
 * |`EXCEPTION`        |The transaction settled to the card network but the corresponding pull from the funding source failed (e.g. balance no longer covers the post-hoc clearing). Surfaces high-urgency alerts and is the dashboard query for stuck reconciliations.|
 */
class CardTransactionStatus @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val AUTHORIZED = of("AUTHORIZED")

        val PARTIALLY_SETTLED = of("PARTIALLY_SETTLED")

        val SETTLED = of("SETTLED")

        val REFUNDED = of("REFUNDED")

        val EXCEPTION = of("EXCEPTION")

        fun of(value: String) = CardTransactionStatus(JsonField.of(value))
    }

    /** An enum containing [CardTransactionStatus]'s known values. */
    enum class Known {
        AUTHORIZED,
        PARTIALLY_SETTLED,
        SETTLED,
        REFUNDED,
        EXCEPTION,
    }

    /**
     * An enum containing [CardTransactionStatus]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CardTransactionStatus] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AUTHORIZED,
        PARTIALLY_SETTLED,
        SETTLED,
        REFUNDED,
        EXCEPTION,
        /**
         * An enum member indicating that [CardTransactionStatus] was instantiated with an unknown
         * value.
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
            AUTHORIZED -> Value.AUTHORIZED
            PARTIALLY_SETTLED -> Value.PARTIALLY_SETTLED
            SETTLED -> Value.SETTLED
            REFUNDED -> Value.REFUNDED
            EXCEPTION -> Value.EXCEPTION
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
            AUTHORIZED -> Known.AUTHORIZED
            PARTIALLY_SETTLED -> Known.PARTIALLY_SETTLED
            SETTLED -> Known.SETTLED
            REFUNDED -> Known.REFUNDED
            EXCEPTION -> Known.EXCEPTION
            else ->
                throw LightsparkGridInvalidDataException("Unknown CardTransactionStatus: $value")
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
    fun validate(): CardTransactionStatus = apply {
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

        return other is CardTransactionStatus && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
