// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.annotation.JsonCreator
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.errors.LightsparkGridInvalidDataException

/** Legal entity type of the business */
class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        val SOLE_PROPRIETORSHIP = of("SOLE_PROPRIETORSHIP")

        val PARTNERSHIP = of("PARTNERSHIP")

        val LLC = of("LLC")

        val CORPORATION = of("CORPORATION")

        val S_CORPORATION = of("S_CORPORATION")

        val NON_PROFIT = of("NON_PROFIT")

        val OTHER = of("OTHER")

        fun of(value: String) = EntityType(JsonField.of(value))
    }

    /** An enum containing [EntityType]'s known values. */
    enum class Known {
        SOLE_PROPRIETORSHIP,
        PARTNERSHIP,
        LLC,
        CORPORATION,
        S_CORPORATION,
        NON_PROFIT,
        OTHER,
    }

    /**
     * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [EntityType] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        SOLE_PROPRIETORSHIP,
        PARTNERSHIP,
        LLC,
        CORPORATION,
        S_CORPORATION,
        NON_PROFIT,
        OTHER,
        /** An enum member indicating that [EntityType] was instantiated with an unknown value. */
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
            SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
            PARTNERSHIP -> Value.PARTNERSHIP
            LLC -> Value.LLC
            CORPORATION -> Value.CORPORATION
            S_CORPORATION -> Value.S_CORPORATION
            NON_PROFIT -> Value.NON_PROFIT
            OTHER -> Value.OTHER
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
            SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
            PARTNERSHIP -> Known.PARTNERSHIP
            LLC -> Known.LLC
            CORPORATION -> Known.CORPORATION
            S_CORPORATION -> Known.S_CORPORATION
            NON_PROFIT -> Known.NON_PROFIT
            OTHER -> Known.OTHER
            else -> throw LightsparkGridInvalidDataException("Unknown EntityType: $value")
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
    fun validate(): EntityType = apply {
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

        return other is EntityType && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
