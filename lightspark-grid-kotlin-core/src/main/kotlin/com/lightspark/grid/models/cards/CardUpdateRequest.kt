// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Update request for `PATCH /cards/{id}`. At least one of `status`, `fundingSource`,
 * `maxSpendPerTransaction`, `maxSpendPerDay`, `maxTransactionsPerDay`, or `threeDSecurePassword`
 * must be supplied. Supplying `status` also requires `substatus` and `reason`, so every card state
 * change carries why it happened. `status` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE
 * | FROZEN → CLOSED`; any other transition returns `409 INVALID_STATE_TRANSITION`. `CLOSED` is
 * terminal and irreversible and cannot be combined with `fundingSource`, `maxSpendPerTransaction`,
 * `maxSpendPerDay`, or `maxTransactionsPerDay`.
 */
class CardUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val fundingSource: JsonField<String>,
    private val maxSpendPerDay: JsonField<Long>,
    private val maxSpendPerTransaction: JsonField<Long>,
    private val maxTransactionsPerDay: JsonField<Int>,
    private val reason: JsonField<String>,
    private val status: JsonField<Status>,
    private val substatus: JsonField<Substatus>,
    private val threeDSecurePassword: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("fundingSource")
        @ExcludeMissing
        fundingSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("maxSpendPerDay")
        @ExcludeMissing
        maxSpendPerDay: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("maxSpendPerTransaction")
        @ExcludeMissing
        maxSpendPerTransaction: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("maxTransactionsPerDay")
        @ExcludeMissing
        maxTransactionsPerDay: JsonField<Int> = JsonMissing.of(),
        @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("substatus")
        @ExcludeMissing
        substatus: JsonField<Substatus> = JsonMissing.of(),
        @JsonProperty("threeDSecurePassword")
        @ExcludeMissing
        threeDSecurePassword: JsonField<String> = JsonMissing.of(),
    ) : this(
        fundingSource,
        maxSpendPerDay,
        maxSpendPerTransaction,
        maxTransactionsPerDay,
        reason,
        status,
        substatus,
        threeDSecurePassword,
        mutableMapOf(),
    )

    /**
     * Replaces the card's funding source. Must belong to the customer and be denominated in a
     * currency supported by the card's program, including USDB for USD cards. Changing the funding
     * source does not change the card's currency or spending-limit units. Cannot be supplied
     * alongside `status: CLOSED`. To stop a card from spending, set `status: FROZEN` instead.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fundingSource(): String? = fundingSource.getNullable("fundingSource")

    /**
     * Replacement card-specific UTC-calendar-day cap, in the smallest unit of the card's currency.
     * Omit this field to leave the current cap unchanged, supply null to clear it, or supply a
     * positive integer to set it. When the platform config also supplies
     * `cardConfigs.maxSpendPerDay`, Grid enforces the lower of the two values. Refunds, reversals,
     * and authorization expiries do not restore capacity during the day. Accepted only when the
     * card's `cardCapabilities.supportsSpendLimits` is true. Cannot be supplied alongside `status:
     * CLOSED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxSpendPerDay(): Long? = maxSpendPerDay.getNullable("maxSpendPerDay")

    /**
     * A new limit on the largest amount this card can authorize on a single transaction, in the
     * smallest unit of its currency (cents for USD). An authorization for exactly the limit is
     * allowed. A later clearing can still settle above it — a restaurant tip, for example — so this
     * caps the authorization, not the final settled amount. Send a positive integer to set the
     * limit, `null` to remove it, or omit the field to leave it unchanged. If your platform config
     * also sets `cardConfigs.maxSpendPerTransaction`, the lower of the two applies. You can only
     * send this when the card's `cardCapabilities.supportsSpendLimits` is true, and not together
     * with `status: CLOSED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxSpendPerTransaction(): Long? =
        maxSpendPerTransaction.getNullable("maxSpendPerTransaction")

    /**
     * Replacement card-specific cap on the number of transactions the card may authorize during one
     * UTC calendar day. Omit this field to leave the current cap unchanged, supply null to clear
     * it, or supply a positive integer to set it. When the platform config also supplies
     * `cardConfigs.maxTransactionsPerDay`, Grid enforces the lower of the two values. Refunds,
     * reversals, and authorization expiries do not restore capacity during the day. Accepted only
     * when the card's `cardCapabilities.supportsTransactionCountLimit` is true. Cannot be supplied
     * alongside `status: CLOSED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxTransactionsPerDay(): Int? = maxTransactionsPerDay.getNullable("maxTransactionsPerDay")

    /**
     * A short sentence naming why the card is moving. Required whenever `status` is supplied, and
     * recorded against the card so a later reader can tell why it changed.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reason(): String? = reason.getNullable("reason")

    /**
     * Target status for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN
     * → CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in the system
     * for audit and reconciliation but cannot transact again.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun status(): Status? = status.getNullable("status")

    /**
     * Why the card is moving, in the card issuer's vocabulary. Required whenever `status` is
     * supplied, and forwarded to the issuer. Pick `OTHER` when none of the named values fit and say
     * why in `reason`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun substatus(): Substatus? = substatus.getNullable("substatus")

    /**
     * Sets a new static 3-D Secure password on the card. Send it on its own, and only when the
     * card's `cardCapabilities.supports3dSecurePassword` is true.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun threeDSecurePassword(): String? = threeDSecurePassword.getNullable("threeDSecurePassword")

    /**
     * Returns the raw JSON value of [fundingSource].
     *
     * Unlike [fundingSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fundingSource")
    @ExcludeMissing
    fun _fundingSource(): JsonField<String> = fundingSource

    /**
     * Returns the raw JSON value of [maxSpendPerDay].
     *
     * Unlike [maxSpendPerDay], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("maxSpendPerDay")
    @ExcludeMissing
    fun _maxSpendPerDay(): JsonField<Long> = maxSpendPerDay

    /**
     * Returns the raw JSON value of [maxSpendPerTransaction].
     *
     * Unlike [maxSpendPerTransaction], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("maxSpendPerTransaction")
    @ExcludeMissing
    fun _maxSpendPerTransaction(): JsonField<Long> = maxSpendPerTransaction

    /**
     * Returns the raw JSON value of [maxTransactionsPerDay].
     *
     * Unlike [maxTransactionsPerDay], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("maxTransactionsPerDay")
    @ExcludeMissing
    fun _maxTransactionsPerDay(): JsonField<Int> = maxTransactionsPerDay

    /**
     * Returns the raw JSON value of [reason].
     *
     * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [substatus].
     *
     * Unlike [substatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("substatus") @ExcludeMissing fun _substatus(): JsonField<Substatus> = substatus

    /**
     * Returns the raw JSON value of [threeDSecurePassword].
     *
     * Unlike [threeDSecurePassword], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("threeDSecurePassword")
    @ExcludeMissing
    fun _threeDSecurePassword(): JsonField<String> = threeDSecurePassword

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

        /** Returns a mutable builder for constructing an instance of [CardUpdateRequest]. */
        fun builder() = Builder()
    }

    /** A builder for [CardUpdateRequest]. */
    class Builder internal constructor() {

        private var fundingSource: JsonField<String> = JsonMissing.of()
        private var maxSpendPerDay: JsonField<Long> = JsonMissing.of()
        private var maxSpendPerTransaction: JsonField<Long> = JsonMissing.of()
        private var maxTransactionsPerDay: JsonField<Int> = JsonMissing.of()
        private var reason: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var substatus: JsonField<Substatus> = JsonMissing.of()
        private var threeDSecurePassword: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardUpdateRequest: CardUpdateRequest) = apply {
            fundingSource = cardUpdateRequest.fundingSource
            maxSpendPerDay = cardUpdateRequest.maxSpendPerDay
            maxSpendPerTransaction = cardUpdateRequest.maxSpendPerTransaction
            maxTransactionsPerDay = cardUpdateRequest.maxTransactionsPerDay
            reason = cardUpdateRequest.reason
            status = cardUpdateRequest.status
            substatus = cardUpdateRequest.substatus
            threeDSecurePassword = cardUpdateRequest.threeDSecurePassword
            additionalProperties = cardUpdateRequest.additionalProperties.toMutableMap()
        }

        /**
         * Replaces the card's funding source. Must belong to the customer and be denominated in a
         * currency supported by the card's program, including USDB for USD cards. Changing the
         * funding source does not change the card's currency or spending-limit units. Cannot be
         * supplied alongside `status: CLOSED`. To stop a card from spending, set `status: FROZEN`
         * instead.
         */
        fun fundingSource(fundingSource: String) = fundingSource(JsonField.of(fundingSource))

        /**
         * Sets [Builder.fundingSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fundingSource(fundingSource: JsonField<String>) = apply {
            this.fundingSource = fundingSource
        }

        /**
         * Replacement card-specific UTC-calendar-day cap, in the smallest unit of the card's
         * currency. Omit this field to leave the current cap unchanged, supply null to clear it, or
         * supply a positive integer to set it. When the platform config also supplies
         * `cardConfigs.maxSpendPerDay`, Grid enforces the lower of the two values. Refunds,
         * reversals, and authorization expiries do not restore capacity during the day. Accepted
         * only when the card's `cardCapabilities.supportsSpendLimits` is true. Cannot be supplied
         * alongside `status: CLOSED`.
         */
        fun maxSpendPerDay(maxSpendPerDay: Long?) =
            maxSpendPerDay(JsonField.ofNullable(maxSpendPerDay))

        /**
         * Alias for [Builder.maxSpendPerDay].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxSpendPerDay(maxSpendPerDay: Long) = maxSpendPerDay(maxSpendPerDay as Long?)

        /**
         * Sets [Builder.maxSpendPerDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSpendPerDay] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxSpendPerDay(maxSpendPerDay: JsonField<Long>) = apply {
            this.maxSpendPerDay = maxSpendPerDay
        }

        /**
         * A new limit on the largest amount this card can authorize on a single transaction, in the
         * smallest unit of its currency (cents for USD). An authorization for exactly the limit is
         * allowed. A later clearing can still settle above it — a restaurant tip, for example — so
         * this caps the authorization, not the final settled amount. Send a positive integer to set
         * the limit, `null` to remove it, or omit the field to leave it unchanged. If your platform
         * config also sets `cardConfigs.maxSpendPerTransaction`, the lower of the two applies. You
         * can only send this when the card's `cardCapabilities.supportsSpendLimits` is true, and
         * not together with `status: CLOSED`.
         */
        fun maxSpendPerTransaction(maxSpendPerTransaction: Long?) =
            maxSpendPerTransaction(JsonField.ofNullable(maxSpendPerTransaction))

        /**
         * Alias for [Builder.maxSpendPerTransaction].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxSpendPerTransaction(maxSpendPerTransaction: Long) =
            maxSpendPerTransaction(maxSpendPerTransaction as Long?)

        /**
         * Sets [Builder.maxSpendPerTransaction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxSpendPerTransaction] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxSpendPerTransaction(maxSpendPerTransaction: JsonField<Long>) = apply {
            this.maxSpendPerTransaction = maxSpendPerTransaction
        }

        /**
         * Replacement card-specific cap on the number of transactions the card may authorize during
         * one UTC calendar day. Omit this field to leave the current cap unchanged, supply null to
         * clear it, or supply a positive integer to set it. When the platform config also supplies
         * `cardConfigs.maxTransactionsPerDay`, Grid enforces the lower of the two values. Refunds,
         * reversals, and authorization expiries do not restore capacity during the day. Accepted
         * only when the card's `cardCapabilities.supportsTransactionCountLimit` is true. Cannot be
         * supplied alongside `status: CLOSED`.
         */
        fun maxTransactionsPerDay(maxTransactionsPerDay: Int?) =
            maxTransactionsPerDay(JsonField.ofNullable(maxTransactionsPerDay))

        /**
         * Alias for [Builder.maxTransactionsPerDay].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxTransactionsPerDay(maxTransactionsPerDay: Int) =
            maxTransactionsPerDay(maxTransactionsPerDay as Int?)

        /**
         * Sets [Builder.maxTransactionsPerDay] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxTransactionsPerDay] with a well-typed [Int] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun maxTransactionsPerDay(maxTransactionsPerDay: JsonField<Int>) = apply {
            this.maxTransactionsPerDay = maxTransactionsPerDay
        }

        /**
         * A short sentence naming why the card is moving. Required whenever `status` is supplied,
         * and recorded against the card so a later reader can tell why it changed.
         */
        fun reason(reason: String) = reason(JsonField.of(reason))

        /**
         * Sets [Builder.reason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reason] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun reason(reason: JsonField<String>) = apply { this.reason = reason }

        /**
         * Target status for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE |
         * FROZEN → CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in
         * the system for audit and reconciliation but cannot transact again.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * Why the card is moving, in the card issuer's vocabulary. Required whenever `status` is
         * supplied, and forwarded to the issuer. Pick `OTHER` when none of the named values fit and
         * say why in `reason`.
         */
        fun substatus(substatus: Substatus) = substatus(JsonField.of(substatus))

        /**
         * Sets [Builder.substatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.substatus] with a well-typed [Substatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun substatus(substatus: JsonField<Substatus>) = apply { this.substatus = substatus }

        /**
         * Sets a new static 3-D Secure password on the card. Send it on its own, and only when the
         * card's `cardCapabilities.supports3dSecurePassword` is true.
         */
        fun threeDSecurePassword(threeDSecurePassword: String) =
            threeDSecurePassword(JsonField.of(threeDSecurePassword))

        /**
         * Sets [Builder.threeDSecurePassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSecurePassword] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun threeDSecurePassword(threeDSecurePassword: JsonField<String>) = apply {
            this.threeDSecurePassword = threeDSecurePassword
        }

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
         * Returns an immutable instance of [CardUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardUpdateRequest =
            CardUpdateRequest(
                fundingSource,
                maxSpendPerDay,
                maxSpendPerTransaction,
                maxTransactionsPerDay,
                reason,
                status,
                substatus,
                threeDSecurePassword,
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
    fun validate(): CardUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        fundingSource()
        maxSpendPerDay()
        maxSpendPerTransaction()
        maxTransactionsPerDay()
        reason()
        status()?.validate()
        substatus()?.validate()
        threeDSecurePassword()
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
        (if (fundingSource.asKnown() == null) 0 else 1) +
            (if (maxSpendPerDay.asKnown() == null) 0 else 1) +
            (if (maxSpendPerTransaction.asKnown() == null) 0 else 1) +
            (if (maxTransactionsPerDay.asKnown() == null) 0 else 1) +
            (if (reason.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (substatus.asKnown()?.validity() ?: 0) +
            (if (threeDSecurePassword.asKnown() == null) 0 else 1)

    /**
     * Target status for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN
     * → CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in the system
     * for audit and reconciliation but cannot transact again.
     */
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

            val ACTIVE = of("ACTIVE")

            val FROZEN = of("FROZEN")

            val CLOSED = of("CLOSED")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            ACTIVE,
            FROZEN,
            CLOSED,
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
            ACTIVE,
            FROZEN,
            CLOSED,
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
                ACTIVE -> Value.ACTIVE
                FROZEN -> Value.FROZEN
                CLOSED -> Value.CLOSED
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
                ACTIVE -> Known.ACTIVE
                FROZEN -> Known.FROZEN
                CLOSED -> Known.CLOSED
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

    /**
     * Why the card is moving, in the card issuer's vocabulary. Required whenever `status` is
     * supplied, and forwarded to the issuer. Pick `OTHER` when none of the named values fit and say
     * why in `reason`.
     */
    class Substatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val LOST = of("LOST")

            val COMPROMISED = of("COMPROMISED")

            val DAMAGED = of("DAMAGED")

            val END_USER_REQUEST = of("END_USER_REQUEST")

            val ISSUER_REQUEST = of("ISSUER_REQUEST")

            val NOT_ACTIVE = of("NOT_ACTIVE")

            val SUSPICIOUS_ACTIVITY = of("SUSPICIOUS_ACTIVITY")

            val INTERNAL_REVIEW = of("INTERNAL_REVIEW")

            val EXPIRED = of("EXPIRED")

            val UNDELIVERABLE = of("UNDELIVERABLE")

            val OTHER = of("OTHER")

            fun of(value: String) = Substatus(JsonField.of(value))
        }

        /** An enum containing [Substatus]'s known values. */
        enum class Known {
            LOST,
            COMPROMISED,
            DAMAGED,
            END_USER_REQUEST,
            ISSUER_REQUEST,
            NOT_ACTIVE,
            SUSPICIOUS_ACTIVITY,
            INTERNAL_REVIEW,
            EXPIRED,
            UNDELIVERABLE,
            OTHER,
        }

        /**
         * An enum containing [Substatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Substatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LOST,
            COMPROMISED,
            DAMAGED,
            END_USER_REQUEST,
            ISSUER_REQUEST,
            NOT_ACTIVE,
            SUSPICIOUS_ACTIVITY,
            INTERNAL_REVIEW,
            EXPIRED,
            UNDELIVERABLE,
            OTHER,
            /**
             * An enum member indicating that [Substatus] was instantiated with an unknown value.
             */
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
                LOST -> Value.LOST
                COMPROMISED -> Value.COMPROMISED
                DAMAGED -> Value.DAMAGED
                END_USER_REQUEST -> Value.END_USER_REQUEST
                ISSUER_REQUEST -> Value.ISSUER_REQUEST
                NOT_ACTIVE -> Value.NOT_ACTIVE
                SUSPICIOUS_ACTIVITY -> Value.SUSPICIOUS_ACTIVITY
                INTERNAL_REVIEW -> Value.INTERNAL_REVIEW
                EXPIRED -> Value.EXPIRED
                UNDELIVERABLE -> Value.UNDELIVERABLE
                OTHER -> Value.OTHER
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
                LOST -> Known.LOST
                COMPROMISED -> Known.COMPROMISED
                DAMAGED -> Known.DAMAGED
                END_USER_REQUEST -> Known.END_USER_REQUEST
                ISSUER_REQUEST -> Known.ISSUER_REQUEST
                NOT_ACTIVE -> Known.NOT_ACTIVE
                SUSPICIOUS_ACTIVITY -> Known.SUSPICIOUS_ACTIVITY
                INTERNAL_REVIEW -> Known.INTERNAL_REVIEW
                EXPIRED -> Known.EXPIRED
                UNDELIVERABLE -> Known.UNDELIVERABLE
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown Substatus: $value")
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
        fun validate(): Substatus = apply {
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

            return other is Substatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardUpdateRequest &&
            fundingSource == other.fundingSource &&
            maxSpendPerDay == other.maxSpendPerDay &&
            maxSpendPerTransaction == other.maxSpendPerTransaction &&
            maxTransactionsPerDay == other.maxTransactionsPerDay &&
            reason == other.reason &&
            status == other.status &&
            substatus == other.substatus &&
            threeDSecurePassword == other.threeDSecurePassword &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            fundingSource,
            maxSpendPerDay,
            maxSpendPerTransaction,
            maxTransactionsPerDay,
            reason,
            status,
            substatus,
            threeDSecurePassword,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardUpdateRequest{fundingSource=$fundingSource, maxSpendPerDay=$maxSpendPerDay, maxSpendPerTransaction=$maxSpendPerTransaction, maxTransactionsPerDay=$maxTransactionsPerDay, reason=$reason, status=$status, substatus=$substatus, threeDSecurePassword=$threeDSecurePassword, additionalProperties=$additionalProperties}"
}
