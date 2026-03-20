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
import com.lightspark.grid.models.transactions.OutgoingTransaction
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class OutgoingPaymentWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val data: JsonField<OutgoingTransaction>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<OutgoingTransaction> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, data, timestamp, type, mutableMapOf())

    /**
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): OutgoingTransaction = data.getRequired("data")

    /**
     * ISO 8601 timestamp of when the webhook was sent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<OutgoingTransaction> = data

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
         * Returns a mutable builder for constructing an instance of [OutgoingPaymentWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OutgoingPaymentWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<OutgoingTransaction>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(outgoingPaymentWebhookEvent: OutgoingPaymentWebhookEvent) = apply {
            id = outgoingPaymentWebhookEvent.id
            data = outgoingPaymentWebhookEvent.data
            timestamp = outgoingPaymentWebhookEvent.timestamp
            type = outgoingPaymentWebhookEvent.type
            additionalProperties = outgoingPaymentWebhookEvent.additionalProperties.toMutableMap()
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

        fun data(data: OutgoingTransaction) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [OutgoingTransaction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun data(data: JsonField<OutgoingTransaction>) = apply { this.data = data }

        /** ISO 8601 timestamp of when the webhook was sent */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [OutgoingPaymentWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OutgoingPaymentWebhookEvent =
            OutgoingPaymentWebhookEvent(
                checkRequired("id", id),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): OutgoingPaymentWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        data().validate()
        timestamp()
        type().validate()
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
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

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

            val OUTGOING_PAYMENT_PENDING = of("OUTGOING_PAYMENT.PENDING")

            val OUTGOING_PAYMENT_PROCESSING = of("OUTGOING_PAYMENT.PROCESSING")

            val OUTGOING_PAYMENT_COMPLETED = of("OUTGOING_PAYMENT.COMPLETED")

            val OUTGOING_PAYMENT_FAILED = of("OUTGOING_PAYMENT.FAILED")

            val OUTGOING_PAYMENT_EXPIRED = of("OUTGOING_PAYMENT.EXPIRED")

            val OUTGOING_PAYMENT_REFUND_PENDING = of("OUTGOING_PAYMENT.REFUND_PENDING")

            val OUTGOING_PAYMENT_REFUND_COMPLETED = of("OUTGOING_PAYMENT.REFUND_COMPLETED")

            val OUTGOING_PAYMENT_REFUND_FAILED = of("OUTGOING_PAYMENT.REFUND_FAILED")

            val INCOMING_PAYMENT_PENDING = of("INCOMING_PAYMENT.PENDING")

            val INCOMING_PAYMENT_COMPLETED = of("INCOMING_PAYMENT.COMPLETED")

            val INCOMING_PAYMENT_FAILED = of("INCOMING_PAYMENT.FAILED")

            val CUSTOMER_KYC_APPROVED = of("CUSTOMER.KYC_APPROVED")

            val CUSTOMER_KYC_REJECTED = of("CUSTOMER.KYC_REJECTED")

            val CUSTOMER_KYC_PENDING = of("CUSTOMER.KYC_PENDING")

            val CUSTOMER_KYB_APPROVED = of("CUSTOMER.KYB_APPROVED")

            val CUSTOMER_KYB_REJECTED = of("CUSTOMER.KYB_REJECTED")

            val CUSTOMER_KYB_PENDING = of("CUSTOMER.KYB_PENDING")

            val VERIFICATION_APPROVED = of("VERIFICATION.APPROVED")

            val VERIFICATION_REJECTED = of("VERIFICATION.REJECTED")

            val VERIFICATION_RESOLVE_ERRORS = of("VERIFICATION.RESOLVE_ERRORS")

            val VERIFICATION_IN_PROGRESS = of("VERIFICATION.IN_PROGRESS")

            val VERIFICATION_PENDING_MANUAL_REVIEW = of("VERIFICATION.PENDING_MANUAL_REVIEW")

            val INTERNAL_ACCOUNT_BALANCE_UPDATED = of("INTERNAL_ACCOUNT.BALANCE_UPDATED")

            val INVITATION_CLAIMED = of("INVITATION.CLAIMED")

            val BULK_UPLOAD_COMPLETED = of("BULK_UPLOAD.COMPLETED")

            val BULK_UPLOAD_FAILED = of("BULK_UPLOAD.FAILED")

            val TEST = of("TEST")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_PENDING,
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_PENDING,
            VERIFICATION_APPROVED,
            VERIFICATION_REJECTED,
            VERIFICATION_RESOLVE_ERRORS,
            VERIFICATION_IN_PROGRESS,
            VERIFICATION_PENDING_MANUAL_REVIEW,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            TEST,
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
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_PENDING,
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_PENDING,
            VERIFICATION_APPROVED,
            VERIFICATION_REJECTED,
            VERIFICATION_RESOLVE_ERRORS,
            VERIFICATION_IN_PROGRESS,
            VERIFICATION_PENDING_MANUAL_REVIEW,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            TEST,
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
                OUTGOING_PAYMENT_PENDING -> Value.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Value.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Value.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Value.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Value.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Value.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Value.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Value.OUTGOING_PAYMENT_REFUND_FAILED
                INCOMING_PAYMENT_PENDING -> Value.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Value.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Value.INCOMING_PAYMENT_FAILED
                CUSTOMER_KYC_APPROVED -> Value.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Value.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_PENDING -> Value.CUSTOMER_KYC_PENDING
                CUSTOMER_KYB_APPROVED -> Value.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Value.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_PENDING -> Value.CUSTOMER_KYB_PENDING
                VERIFICATION_APPROVED -> Value.VERIFICATION_APPROVED
                VERIFICATION_REJECTED -> Value.VERIFICATION_REJECTED
                VERIFICATION_RESOLVE_ERRORS -> Value.VERIFICATION_RESOLVE_ERRORS
                VERIFICATION_IN_PROGRESS -> Value.VERIFICATION_IN_PROGRESS
                VERIFICATION_PENDING_MANUAL_REVIEW -> Value.VERIFICATION_PENDING_MANUAL_REVIEW
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Value.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Value.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Value.BULK_UPLOAD_FAILED
                TEST -> Value.TEST
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
                OUTGOING_PAYMENT_PENDING -> Known.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Known.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Known.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Known.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Known.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Known.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Known.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Known.OUTGOING_PAYMENT_REFUND_FAILED
                INCOMING_PAYMENT_PENDING -> Known.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Known.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Known.INCOMING_PAYMENT_FAILED
                CUSTOMER_KYC_APPROVED -> Known.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Known.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_PENDING -> Known.CUSTOMER_KYC_PENDING
                CUSTOMER_KYB_APPROVED -> Known.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Known.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_PENDING -> Known.CUSTOMER_KYB_PENDING
                VERIFICATION_APPROVED -> Known.VERIFICATION_APPROVED
                VERIFICATION_REJECTED -> Known.VERIFICATION_REJECTED
                VERIFICATION_RESOLVE_ERRORS -> Known.VERIFICATION_RESOLVE_ERRORS
                VERIFICATION_IN_PROGRESS -> Known.VERIFICATION_IN_PROGRESS
                VERIFICATION_PENDING_MANUAL_REVIEW -> Known.VERIFICATION_PENDING_MANUAL_REVIEW
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Known.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Known.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Known.BULK_UPLOAD_FAILED
                TEST -> Known.TEST
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

        return other is OutgoingPaymentWebhookEvent &&
            id == other.id &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OutgoingPaymentWebhookEvent{id=$id, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
