// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

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
import com.lightspark.grid.models.invitations.CurrencyAmount
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AccountStatusWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val customerId: JsonField<String>,
    private val newBalance: JsonField<CurrencyAmount>,
    private val oldBalance: JsonField<CurrencyAmount>,
    private val platformCustomerId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("newBalance")
        @ExcludeMissing
        newBalance: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("oldBalance")
        @ExcludeMissing
        oldBalance: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        platformCustomerId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        timestamp,
        type,
        customerId,
        newBalance,
        oldBalance,
        platformCustomerId,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The id of the account whose balance has changed
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("accountId")

    /**
     * ISO8601 timestamp when the webhook was sent (can be used to prevent replay attacks)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * Type of webhook event
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The ID of the customer associated with the internal account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = customerId.getNullable("customerId")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun newBalance(): CurrencyAmount? = newBalance.getNullable("newBalance")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun oldBalance(): CurrencyAmount? = oldBalance.getNullable("oldBalance")

    /**
     * The ID of the customer as associated in your platform
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformCustomerId(): String? = platformCustomerId.getNullable("platformCustomerId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [newBalance].
     *
     * Unlike [newBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("newBalance")
    @ExcludeMissing
    fun _newBalance(): JsonField<CurrencyAmount> = newBalance

    /**
     * Returns the raw JSON value of [oldBalance].
     *
     * Unlike [oldBalance], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oldBalance")
    @ExcludeMissing
    fun _oldBalance(): JsonField<CurrencyAmount> = oldBalance

    /**
     * Returns the raw JSON value of [platformCustomerId].
     *
     * Unlike [platformCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platformCustomerId")
    @ExcludeMissing
    fun _platformCustomerId(): JsonField<String> = platformCustomerId

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
         * Returns a mutable builder for constructing an instance of [AccountStatusWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AccountStatusWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var customerId: JsonField<String> = JsonMissing.of()
        private var newBalance: JsonField<CurrencyAmount> = JsonMissing.of()
        private var oldBalance: JsonField<CurrencyAmount> = JsonMissing.of()
        private var platformCustomerId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(accountStatusWebhookEvent: AccountStatusWebhookEvent) = apply {
            id = accountStatusWebhookEvent.id
            accountId = accountStatusWebhookEvent.accountId
            timestamp = accountStatusWebhookEvent.timestamp
            type = accountStatusWebhookEvent.type
            customerId = accountStatusWebhookEvent.customerId
            newBalance = accountStatusWebhookEvent.newBalance
            oldBalance = accountStatusWebhookEvent.oldBalance
            platformCustomerId = accountStatusWebhookEvent.platformCustomerId
            additionalProperties = accountStatusWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this webhook delivery (can be used for idempotency) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The id of the account whose balance has changed */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** ISO8601 timestamp when the webhook was sent (can be used to prevent replay attacks) */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** Type of webhook event */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** The ID of the customer associated with the internal account */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun newBalance(newBalance: CurrencyAmount) = newBalance(JsonField.of(newBalance))

        /**
         * Sets [Builder.newBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.newBalance] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun newBalance(newBalance: JsonField<CurrencyAmount>) = apply {
            this.newBalance = newBalance
        }

        fun oldBalance(oldBalance: CurrencyAmount) = oldBalance(JsonField.of(oldBalance))

        /**
         * Sets [Builder.oldBalance] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oldBalance] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun oldBalance(oldBalance: JsonField<CurrencyAmount>) = apply {
            this.oldBalance = oldBalance
        }

        /** The ID of the customer as associated in your platform */
        fun platformCustomerId(platformCustomerId: String) =
            platformCustomerId(JsonField.of(platformCustomerId))

        /**
         * Sets [Builder.platformCustomerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformCustomerId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformCustomerId(platformCustomerId: JsonField<String>) = apply {
            this.platformCustomerId = platformCustomerId
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
         * Returns an immutable instance of [AccountStatusWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountStatusWebhookEvent =
            AccountStatusWebhookEvent(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                customerId,
                newBalance,
                oldBalance,
                platformCustomerId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AccountStatusWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        timestamp()
        type().validate()
        customerId()
        newBalance()?.validate()
        oldBalance()?.validate()
        platformCustomerId()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (accountId.asKnown() == null) 0 else 1) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (newBalance.asKnown()?.validity() ?: 0) +
            (oldBalance.asKnown()?.validity() ?: 0) +
            (if (platformCustomerId.asKnown() == null) 0 else 1)

    /** Type of webhook event */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val INCOMING_PAYMENT = of("INCOMING_PAYMENT")

            val OUTGOING_PAYMENT = of("OUTGOING_PAYMENT")

            val TEST = of("TEST")

            val BULK_UPLOAD = of("BULK_UPLOAD")

            val INVITATION_CLAIMED = of("INVITATION_CLAIMED")

            val KYC_STATUS = of("KYC_STATUS")

            val ACCOUNT_STATUS = of("ACCOUNT_STATUS")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INCOMING_PAYMENT,
            OUTGOING_PAYMENT,
            TEST,
            BULK_UPLOAD,
            INVITATION_CLAIMED,
            KYC_STATUS,
            ACCOUNT_STATUS,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INCOMING_PAYMENT,
            OUTGOING_PAYMENT,
            TEST,
            BULK_UPLOAD,
            INVITATION_CLAIMED,
            KYC_STATUS,
            ACCOUNT_STATUS,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                INCOMING_PAYMENT -> Value.INCOMING_PAYMENT
                OUTGOING_PAYMENT -> Value.OUTGOING_PAYMENT
                TEST -> Value.TEST
                BULK_UPLOAD -> Value.BULK_UPLOAD
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                KYC_STATUS -> Value.KYC_STATUS
                ACCOUNT_STATUS -> Value.ACCOUNT_STATUS
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
                INCOMING_PAYMENT -> Known.INCOMING_PAYMENT
                OUTGOING_PAYMENT -> Known.OUTGOING_PAYMENT
                TEST -> Known.TEST
                BULK_UPLOAD -> Known.BULK_UPLOAD
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                KYC_STATUS -> Known.KYC_STATUS
                ACCOUNT_STATUS -> Known.ACCOUNT_STATUS
                else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AccountStatusWebhookEvent &&
            id == other.id &&
            accountId == other.accountId &&
            timestamp == other.timestamp &&
            type == other.type &&
            customerId == other.customerId &&
            newBalance == other.newBalance &&
            oldBalance == other.oldBalance &&
            platformCustomerId == other.platformCustomerId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            timestamp,
            type,
            customerId,
            newBalance,
            oldBalance,
            platformCustomerId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AccountStatusWebhookEvent{id=$id, accountId=$accountId, timestamp=$timestamp, type=$type, customerId=$customerId, newBalance=$newBalance, oldBalance=$oldBalance, platformCustomerId=$platformCustomerId, additionalProperties=$additionalProperties}"
}
