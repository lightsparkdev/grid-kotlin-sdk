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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class CardCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerId: JsonField<String>,
    private val form: JsonField<Form>,
    private val fundingSource: JsonField<String>,
    private val maxSpendPerDay: JsonField<Long>,
    private val maxSpendPerTransaction: JsonField<Long>,
    private val maxTransactionsPerDay: JsonField<Int>,
    private val platformCardId: JsonField<String>,
    private val threeDSecurePassword: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("form") @ExcludeMissing form: JsonField<Form> = JsonMissing.of(),
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
        @JsonProperty("platformCardId")
        @ExcludeMissing
        platformCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("threeDSecurePassword")
        @ExcludeMissing
        threeDSecurePassword: JsonField<String> = JsonMissing.of(),
    ) : this(
        customerId,
        form,
        fundingSource,
        maxSpendPerDay,
        maxSpendPerTransaction,
        maxTransactionsPerDay,
        platformCardId,
        threeDSecurePassword,
        mutableMapOf(),
    )

    /**
     * The id of the `Customer` to issue the card to. The customer must have KYC status `APPROVED`;
     * otherwise the request is rejected with `CARDHOLDER_KYC_NOT_APPROVED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be added
     * in a later release.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun form(): Form = form.getRequired("form")

    /**
     * Internal account id that funds this card. The account must belong to the customer and be
     * denominated in a card-eligible currency; otherwise the request is rejected with
     * `FUNDING_SOURCE_INELIGIBLE`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fundingSource(): String = fundingSource.getRequired("fundingSource")

    /**
     * Optional card-specific cap on cumulative new spend during one UTC calendar day, in the
     * smallest unit of the card currency derived from its funding source. Omit this field for no
     * card-specific daily cap. When the platform config also supplies `cardConfigs.maxSpendPerDay`,
     * Grid enforces the lower of the two values. The window resets at 00:00 UTC, and refunds,
     * reversals, and authorization expiries do not restore capacity during the day. Accepted only
     * when the funding-source internal account's `cardCapabilities.supportsSpendLimits` is true.
     * Spend exactly equal to the effective limit is allowed.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxSpendPerDay(): Long? = maxSpendPerDay.getNullable("maxSpendPerDay")

    /**
     * Optional card-specific cap on a single transaction, in the smallest unit of the card currency
     * derived from its funding source. Omit this field for no card-specific cap. When the platform
     * config also supplies `cardConfigs.maxSpendPerTransaction`, Grid enforces the lower of the two
     * values. Accepted only when the funding-source internal account's
     * `cardCapabilities.supportsSpendLimits` is true. A transaction for exactly the effective limit
     * is allowed.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxSpendPerTransaction(): Long? =
        maxSpendPerTransaction.getNullable("maxSpendPerTransaction")

    /**
     * Optional card-specific cap on the number of transactions the card may authorize during one
     * UTC calendar day. Omit this field for no card-specific daily transaction cap. When the
     * platform config also supplies `cardConfigs.maxTransactionsPerDay`, Grid enforces the lower of
     * the two values. The window resets at 00:00 UTC. Each approved authorization counts once;
     * refunds, reversals, and authorization expiries do not restore capacity during the day.
     * Accepted only when the funding-source internal account's
     * `cardCapabilities.supportsTransactionCountLimit` is true.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun maxTransactionsPerDay(): Int? = maxTransactionsPerDay.getNullable("maxTransactionsPerDay")

    /**
     * Platform-specific card identifier. Always generated by the server; any value supplied in the
     * request is ignored.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformCardId(): String? = platformCardId.getNullable("platformCardId")

    /**
     * Static password used as the card's 3-D Secure factor. Required when the first funding-source
     * internal account's `cardCapabilities.supports3dSecurePassword` is true; omitting it or
     * supplying an empty or whitespace-only string is rejected with `INVALID_INPUT`. When the
     * capability is false, supplying this field is rejected with `INVALID_INPUT` because cards in
     * that program have no static-password factor. Grid does not retain the value: it is forwarded
     * to the issuer and discarded, so it cannot be read back afterwards; a cardholder who forgets
     * it must set a new one through `PATCH /cards/{id}`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun threeDSecurePassword(): String? = threeDSecurePassword.getNullable("threeDSecurePassword")

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [form].
     *
     * Unlike [form], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("form") @ExcludeMissing fun _form(): JsonField<Form> = form

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
     * Returns the raw JSON value of [platformCardId].
     *
     * Unlike [platformCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platformCardId")
    @ExcludeMissing
    fun _platformCardId(): JsonField<String> = platformCardId

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

        /**
         * Returns a mutable builder for constructing an instance of [CardCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .form()
         * .fundingSource()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardCreateRequest]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String>? = null
        private var form: JsonField<Form>? = null
        private var fundingSource: JsonField<String>? = null
        private var maxSpendPerDay: JsonField<Long> = JsonMissing.of()
        private var maxSpendPerTransaction: JsonField<Long> = JsonMissing.of()
        private var maxTransactionsPerDay: JsonField<Int> = JsonMissing.of()
        private var platformCardId: JsonField<String> = JsonMissing.of()
        private var threeDSecurePassword: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardCreateRequest: CardCreateRequest) = apply {
            customerId = cardCreateRequest.customerId
            form = cardCreateRequest.form
            fundingSource = cardCreateRequest.fundingSource
            maxSpendPerDay = cardCreateRequest.maxSpendPerDay
            maxSpendPerTransaction = cardCreateRequest.maxSpendPerTransaction
            maxTransactionsPerDay = cardCreateRequest.maxTransactionsPerDay
            platformCardId = cardCreateRequest.platformCardId
            threeDSecurePassword = cardCreateRequest.threeDSecurePassword
            additionalProperties = cardCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * The id of the `Customer` to issue the card to. The customer must have KYC status
         * `APPROVED`; otherwise the request is rejected with `CARDHOLDER_KYC_NOT_APPROVED`.
         */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be
         * added in a later release.
         */
        fun form(form: Form) = form(JsonField.of(form))

        /**
         * Sets [Builder.form] to an arbitrary JSON value.
         *
         * You should usually call [Builder.form] with a well-typed [Form] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun form(form: JsonField<Form>) = apply { this.form = form }

        /**
         * Internal account id that funds this card. The account must belong to the customer and be
         * denominated in a card-eligible currency; otherwise the request is rejected with
         * `FUNDING_SOURCE_INELIGIBLE`.
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
         * Optional card-specific cap on cumulative new spend during one UTC calendar day, in the
         * smallest unit of the card currency derived from its funding source. Omit this field for
         * no card-specific daily cap. When the platform config also supplies
         * `cardConfigs.maxSpendPerDay`, Grid enforces the lower of the two values. The window
         * resets at 00:00 UTC, and refunds, reversals, and authorization expiries do not restore
         * capacity during the day. Accepted only when the funding-source internal account's
         * `cardCapabilities.supportsSpendLimits` is true. Spend exactly equal to the effective
         * limit is allowed.
         */
        fun maxSpendPerDay(maxSpendPerDay: Long) = maxSpendPerDay(JsonField.of(maxSpendPerDay))

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
         * Optional card-specific cap on a single transaction, in the smallest unit of the card
         * currency derived from its funding source. Omit this field for no card-specific cap. When
         * the platform config also supplies `cardConfigs.maxSpendPerTransaction`, Grid enforces the
         * lower of the two values. Accepted only when the funding-source internal account's
         * `cardCapabilities.supportsSpendLimits` is true. A transaction for exactly the effective
         * limit is allowed.
         */
        fun maxSpendPerTransaction(maxSpendPerTransaction: Long) =
            maxSpendPerTransaction(JsonField.of(maxSpendPerTransaction))

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
         * Optional card-specific cap on the number of transactions the card may authorize during
         * one UTC calendar day. Omit this field for no card-specific daily transaction cap. When
         * the platform config also supplies `cardConfigs.maxTransactionsPerDay`, Grid enforces the
         * lower of the two values. The window resets at 00:00 UTC. Each approved authorization
         * counts once; refunds, reversals, and authorization expiries do not restore capacity
         * during the day. Accepted only when the funding-source internal account's
         * `cardCapabilities.supportsTransactionCountLimit` is true.
         */
        fun maxTransactionsPerDay(maxTransactionsPerDay: Int) =
            maxTransactionsPerDay(JsonField.of(maxTransactionsPerDay))

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
         * Platform-specific card identifier. Always generated by the server; any value supplied in
         * the request is ignored.
         */
        fun platformCardId(platformCardId: String) = platformCardId(JsonField.of(platformCardId))

        /**
         * Sets [Builder.platformCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformCardId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformCardId(platformCardId: JsonField<String>) = apply {
            this.platformCardId = platformCardId
        }

        /**
         * Static password used as the card's 3-D Secure factor. Required when the first
         * funding-source internal account's `cardCapabilities.supports3dSecurePassword` is true;
         * omitting it or supplying an empty or whitespace-only string is rejected with
         * `INVALID_INPUT`. When the capability is false, supplying this field is rejected with
         * `INVALID_INPUT` because cards in that program have no static-password factor. Grid does
         * not retain the value: it is forwarded to the issuer and discarded, so it cannot be read
         * back afterwards; a cardholder who forgets it must set a new one through `PATCH
         * /cards/{id}`.
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
         * Returns an immutable instance of [CardCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .form()
         * .fundingSource()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardCreateRequest =
            CardCreateRequest(
                checkRequired("customerId", customerId),
                checkRequired("form", form),
                checkRequired("fundingSource", fundingSource),
                maxSpendPerDay,
                maxSpendPerTransaction,
                maxTransactionsPerDay,
                platformCardId,
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
    fun validate(): CardCreateRequest = apply {
        if (validated) {
            return@apply
        }

        customerId()
        form().validate()
        fundingSource()
        maxSpendPerDay()
        maxSpendPerTransaction()
        maxTransactionsPerDay()
        platformCardId()
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
        (if (customerId.asKnown() == null) 0 else 1) +
            (form.asKnown()?.validity() ?: 0) +
            (if (fundingSource.asKnown() == null) 0 else 1) +
            (if (maxSpendPerDay.asKnown() == null) 0 else 1) +
            (if (maxSpendPerTransaction.asKnown() == null) 0 else 1) +
            (if (maxTransactionsPerDay.asKnown() == null) 0 else 1) +
            (if (platformCardId.asKnown() == null) 0 else 1) +
            (if (threeDSecurePassword.asKnown() == null) 0 else 1)

    /**
     * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be added
     * in a later release.
     */
    class Form @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val VIRTUAL = of("VIRTUAL")

            fun of(value: String) = Form(JsonField.of(value))
        }

        /** An enum containing [Form]'s known values. */
        enum class Known {
            VIRTUAL
        }

        /**
         * An enum containing [Form]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Form] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VIRTUAL,
            /** An enum member indicating that [Form] was instantiated with an unknown value. */
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
                VIRTUAL -> Value.VIRTUAL
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
                VIRTUAL -> Known.VIRTUAL
                else -> throw LightsparkGridInvalidDataException("Unknown Form: $value")
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
        fun validate(): Form = apply {
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

            return other is Form && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardCreateRequest &&
            customerId == other.customerId &&
            form == other.form &&
            fundingSource == other.fundingSource &&
            maxSpendPerDay == other.maxSpendPerDay &&
            maxSpendPerTransaction == other.maxSpendPerTransaction &&
            maxTransactionsPerDay == other.maxTransactionsPerDay &&
            platformCardId == other.platformCardId &&
            threeDSecurePassword == other.threeDSecurePassword &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            customerId,
            form,
            fundingSource,
            maxSpendPerDay,
            maxSpendPerTransaction,
            maxTransactionsPerDay,
            platformCardId,
            threeDSecurePassword,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardCreateRequest{customerId=$customerId, form=$form, fundingSource=$fundingSource, maxSpendPerDay=$maxSpendPerDay, maxSpendPerTransaction=$maxSpendPerTransaction, maxTransactionsPerDay=$maxTransactionsPerDay, platformCardId=$platformCardId, threeDSecurePassword=$threeDSecurePassword, additionalProperties=$additionalProperties}"
}
