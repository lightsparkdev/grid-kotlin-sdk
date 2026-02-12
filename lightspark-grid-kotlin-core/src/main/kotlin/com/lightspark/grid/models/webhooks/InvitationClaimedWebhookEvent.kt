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
import com.lightspark.grid.models.invitations.UmaInvitation
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class InvitationClaimedWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val invitation: JsonField<UmaInvitation>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val webhookId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("invitation")
        @ExcludeMissing
        invitation: JsonField<UmaInvitation> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("webhookId") @ExcludeMissing webhookId: JsonField<String> = JsonMissing.of(),
    ) : this(invitation, timestamp, type, webhookId, mutableMapOf())

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun invitation(): UmaInvitation = invitation.getRequired("invitation")

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
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhookId(): String = webhookId.getRequired("webhookId")

    /**
     * Returns the raw JSON value of [invitation].
     *
     * Unlike [invitation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("invitation")
    @ExcludeMissing
    fun _invitation(): JsonField<UmaInvitation> = invitation

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
     * Returns the raw JSON value of [webhookId].
     *
     * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookId") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

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
         * Returns a mutable builder for constructing an instance of
         * [InvitationClaimedWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .invitation()
         * .timestamp()
         * .type()
         * .webhookId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [InvitationClaimedWebhookEvent]. */
    class Builder internal constructor() {

        private var invitation: JsonField<UmaInvitation>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var webhookId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(invitationClaimedWebhookEvent: InvitationClaimedWebhookEvent) = apply {
            invitation = invitationClaimedWebhookEvent.invitation
            timestamp = invitationClaimedWebhookEvent.timestamp
            type = invitationClaimedWebhookEvent.type
            webhookId = invitationClaimedWebhookEvent.webhookId
            additionalProperties = invitationClaimedWebhookEvent.additionalProperties.toMutableMap()
        }

        fun invitation(invitation: UmaInvitation) = invitation(JsonField.of(invitation))

        /**
         * Sets [Builder.invitation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invitation] with a well-typed [UmaInvitation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun invitation(invitation: JsonField<UmaInvitation>) = apply {
            this.invitation = invitation
        }

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

        /** Unique identifier for this webhook delivery (can be used for idempotency) */
        fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

        /**
         * Sets [Builder.webhookId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

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
         * Returns an immutable instance of [InvitationClaimedWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .invitation()
         * .timestamp()
         * .type()
         * .webhookId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvitationClaimedWebhookEvent =
            InvitationClaimedWebhookEvent(
                checkRequired("invitation", invitation),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                checkRequired("webhookId", webhookId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): InvitationClaimedWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        invitation().validate()
        timestamp()
        type().validate()
        webhookId()
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
        (invitation.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (webhookId.asKnown() == null) 0 else 1)

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

            val INVITATION_CLAIMED = of("INVITATION_CLAIMED")

            val INCOMING_PAYMENT = of("INCOMING_PAYMENT")

            val OUTGOING_PAYMENT = of("OUTGOING_PAYMENT")

            val TEST = of("TEST")

            val BULK_UPLOAD = of("BULK_UPLOAD")

            val KYC_STATUS = of("KYC_STATUS")

            val ACCOUNT_STATUS = of("ACCOUNT_STATUS")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INVITATION_CLAIMED,
            INCOMING_PAYMENT,
            OUTGOING_PAYMENT,
            TEST,
            BULK_UPLOAD,
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
            INVITATION_CLAIMED,
            INCOMING_PAYMENT,
            OUTGOING_PAYMENT,
            TEST,
            BULK_UPLOAD,
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
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                INCOMING_PAYMENT -> Value.INCOMING_PAYMENT
                OUTGOING_PAYMENT -> Value.OUTGOING_PAYMENT
                TEST -> Value.TEST
                BULK_UPLOAD -> Value.BULK_UPLOAD
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
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                INCOMING_PAYMENT -> Known.INCOMING_PAYMENT
                OUTGOING_PAYMENT -> Known.OUTGOING_PAYMENT
                TEST -> Known.TEST
                BULK_UPLOAD -> Known.BULK_UPLOAD
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

        return other is InvitationClaimedWebhookEvent &&
            invitation == other.invitation &&
            timestamp == other.timestamp &&
            type == other.type &&
            webhookId == other.webhookId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(invitation, timestamp, type, webhookId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvitationClaimedWebhookEvent{invitation=$invitation, timestamp=$timestamp, type=$type, webhookId=$webhookId, additionalProperties=$additionalProperties}"
}
