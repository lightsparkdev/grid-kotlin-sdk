// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/**
 * The type of action the agent is requesting.
 *
 * | Type            | Description                                              |
 * |-----------------|----------------------------------------------------------|
 * | `EXECUTE_QUOTE` | Execute a cross-currency quote                           |
 * | `TRANSFER_OUT`  | Transfer from an internal account to an external account |
 * | `TRANSFER_IN`   | Transfer from an external account to an internal account |
 */
class AgentActionType @JsonCreator private constructor(private val value: JsonField<String>) :
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

        val EXECUTE_QUOTE = of("EXECUTE_QUOTE")

        val TRANSFER_OUT = of("TRANSFER_OUT")

        val TRANSFER_IN = of("TRANSFER_IN")

        fun of(value: String) = AgentActionType(JsonField.of(value))
    }

    /** An enum containing [AgentActionType]'s known values. */
    enum class Known {
        EXECUTE_QUOTE,
        TRANSFER_OUT,
        TRANSFER_IN,
    }

    /**
     * An enum containing [AgentActionType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [AgentActionType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        EXECUTE_QUOTE,
        TRANSFER_OUT,
        TRANSFER_IN,
        /**
         * An enum member indicating that [AgentActionType] was instantiated with an unknown value.
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
            EXECUTE_QUOTE -> Value.EXECUTE_QUOTE
            TRANSFER_OUT -> Value.TRANSFER_OUT
            TRANSFER_IN -> Value.TRANSFER_IN
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
            EXECUTE_QUOTE -> Known.EXECUTE_QUOTE
            TRANSFER_OUT -> Known.TRANSFER_OUT
            TRANSFER_IN -> Known.TRANSFER_IN
            else -> throw LightsparkGridInvalidDataException("Unknown AgentActionType: $value")
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
    fun validate(): AgentActionType = apply {
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

        return other is AgentActionType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
