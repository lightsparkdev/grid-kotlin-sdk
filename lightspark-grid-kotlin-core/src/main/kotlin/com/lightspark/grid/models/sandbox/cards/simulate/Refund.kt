// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Refund
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val initiatedAt: JsonField<OffsetDateTime>,
    private val reference: JsonField<String>,
    private val status: JsonField<Status>,
    private val reason: JsonField<Reason>,
    private val settledAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("initiatedAt")
        @ExcludeMissing
        initiatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("reference") @ExcludeMissing reference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
        @JsonProperty("settledAt")
        @ExcludeMissing
        settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(initiatedAt, reference, status, reason, settledAt, mutableMapOf())

    /**
     * When the refund was initiated
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun initiatedAt(): OffsetDateTime = initiatedAt.getRequired("initiatedAt")

    /**
     * The unique reference ID of the refund
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reference(): String = reference.getRequired("reference")

    /**
     * Current status of the refund
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Reason for the refund
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): Reason? = reason.getNullable("reason")

    /**
     * When the refund was settled
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun settledAt(): OffsetDateTime? = settledAt.getNullable("settledAt")

    /**
     * Returns the raw JSON value of [initiatedAt].
     *
     * Unlike [initiatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("initiatedAt")
    @ExcludeMissing
    fun _initiatedAt(): JsonField<OffsetDateTime> = initiatedAt

    /**
     * Returns the raw JSON value of [reference].
     *
     * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

    /**
     * Returns the raw JSON value of [settledAt].
     *
     * Unlike [settledAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("settledAt")
    @ExcludeMissing
    fun _settledAt(): JsonField<OffsetDateTime> = settledAt

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Refund].
         *
         * The following fields are required:
         * ```kotlin
         * .initiatedAt()
         * .reference()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Refund]. */
    class Builder internal constructor() {

        private var initiatedAt: JsonField<OffsetDateTime>? = null
        private var reference: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var reason: JsonField<Reason> = JsonMissing.of()
        private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(refund: Refund) = apply {
            initiatedAt = refund.initiatedAt
            reference = refund.reference
            status = refund.status
            reason = refund.reason
            settledAt = refund.settledAt
            additionalProperties = refund.additionalProperties.toMutableMap()
        }

        /** When the refund was initiated */
        fun initiatedAt(initiatedAt: OffsetDateTime) = initiatedAt(JsonField.of(initiatedAt))

        /**
         * Sets [Builder.initiatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.initiatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun initiatedAt(initiatedAt: JsonField<OffsetDateTime>) = apply {
            this.initiatedAt = initiatedAt
        }

        /** The unique reference ID of the refund */
        fun reference(reference: String) = reference(JsonField.of(reference))

        /**
         * Sets [Builder.reference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reference] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reference(reference: JsonField<String>) = apply { this.reference = reference }

        /** Current status of the refund */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Reason for the refund */
        fun reason(reason: Reason) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [Reason] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

        /** When the refund was settled */
        fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

        /**
         * Sets [Builder.settledAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply { this.settledAt = settledAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Refund].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .initiatedAt()
         * .reference()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Refund =
            Refund(
                checkRequired("initiatedAt", initiatedAt),
                checkRequired("reference", reference),
                checkRequired("status", status),
                reason,
                settledAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Refund = apply {
        if (validated) {
            return@apply
        }

        initiatedAt()
        reference()
        status().validate()
        reason()?.validate()
        settledAt()
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
    internal fun validity(): Int =
        (if (initiatedAt.asKnown() == null) 0 else 1) +
            (if (reference.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (reason.asKnown()?.validity() ?: 0) +
            (if (settledAt.asKnown() == null) 0 else 1)

    /** Current status of the refund */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("PENDING")

            val COMPLETED = of("COMPLETED")

            val FAILED = of("FAILED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            PENDING,
            COMPLETED,
            FAILED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PENDING,
            COMPLETED,
            FAILED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETED -> Value.COMPLETED
                FAILED -> Value.FAILED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETED -> Known.COMPLETED
                FAILED -> Known.FAILED
                else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Status = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Reason for the refund */
    class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val TRANSACTION_FAILED = of("TRANSACTION_FAILED")

            val USER_CANCELLATION = of("USER_CANCELLATION")

            val TIMEOUT = of("TIMEOUT")

            fun of(value: String) = Reason(JsonField.of(value))
        }

        /** An enum containing [Reason]'s known values. */
        enum class Known {
            TRANSACTION_FAILED,
            USER_CANCELLATION,
            TIMEOUT,
        }

        /**
         * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Reason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRANSACTION_FAILED,
            USER_CANCELLATION,
            TIMEOUT,
            /** An enum member indicating that [Reason] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                TRANSACTION_FAILED -> Value.TRANSACTION_FAILED
                USER_CANCELLATION -> Value.USER_CANCELLATION
                TIMEOUT -> Value.TIMEOUT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                TRANSACTION_FAILED -> Known.TRANSACTION_FAILED
                USER_CANCELLATION -> Known.USER_CANCELLATION
                TIMEOUT -> Known.TIMEOUT
                else -> throw LightsparkGridInvalidDataException("Unknown Reason: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Reason = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Reason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Refund &&
            initiatedAt == other.initiatedAt &&
            reference == other.reference &&
            status == other.status &&
            reason == other.reason &&
            settledAt == other.settledAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(initiatedAt, reference, status, reason, settledAt, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Refund{initiatedAt=$initiatedAt, reference=$reference, status=$status, reason=$reason, settledAt=$settledAt, additionalProperties=$additionalProperties}"
}
