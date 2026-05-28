// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.invitations

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class UmaInvitationCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inviterUma: JsonField<String>,
    private val amountToSend: JsonField<Long>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val firstName: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inviterUma")
        @ExcludeMissing
        inviterUma: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amountToSend")
        @ExcludeMissing
        amountToSend: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("firstName") @ExcludeMissing firstName: JsonField<String> = JsonMissing.of(),
    ) : this(inviterUma, amountToSend, expiresAt, firstName, mutableMapOf())

    /**
     * The UMA address of the customer creating the invitation
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inviterUma(): String = inviterUma.getRequired("inviterUma")

    /**
     * An amount to send (in the smallest unit of the customer's currency) to the invitee when the
     * invitation is claimed. This is optional and if not provided, the invitee will not receive any
     * amount. Note that the actual sending of the amount must be done by the inviter platform once
     * the INVITATION_CLAIMED webhook is received. If the inviter platform either does not send the
     * payment or the payment fails, the invitee will not receive this amount. This field is
     * primarily used for display purposes on the claiming side of the invitation.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amountToSend(): Long? = amountToSend.getNullable("amountToSend")

    /**
     * When the invitation expires (if at all)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime? = expiresAt.getNullable("expiresAt")

    /**
     * First name of the invitee to show as part of the invite
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun firstName(): String? = firstName.getNullable("firstName")

    /**
     * Returns the raw JSON value of [inviterUma].
     *
     * Unlike [inviterUma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inviterUma") @ExcludeMissing fun _inviterUma(): JsonField<String> = inviterUma

    /**
     * Returns the raw JSON value of [amountToSend].
     *
     * Unlike [amountToSend], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amountToSend")
    @ExcludeMissing
    fun _amountToSend(): JsonField<Long> = amountToSend

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [firstName].
     *
     * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

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
         * Returns a mutable builder for constructing an instance of [UmaInvitationCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .inviterUma()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UmaInvitationCreateRequest]. */
    class Builder internal constructor() {

        private var inviterUma: JsonField<String>? = null
        private var amountToSend: JsonField<Long> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var firstName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(umaInvitationCreateRequest: UmaInvitationCreateRequest) = apply {
            inviterUma = umaInvitationCreateRequest.inviterUma
            amountToSend = umaInvitationCreateRequest.amountToSend
            expiresAt = umaInvitationCreateRequest.expiresAt
            firstName = umaInvitationCreateRequest.firstName
            additionalProperties = umaInvitationCreateRequest.additionalProperties.toMutableMap()
        }

        /** The UMA address of the customer creating the invitation */
        fun inviterUma(inviterUma: String) = inviterUma(JsonField.of(inviterUma))

        /**
         * Sets [Builder.inviterUma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviterUma] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inviterUma(inviterUma: JsonField<String>) = apply { this.inviterUma = inviterUma }

        /**
         * An amount to send (in the smallest unit of the customer's currency) to the invitee when
         * the invitation is claimed. This is optional and if not provided, the invitee will not
         * receive any amount. Note that the actual sending of the amount must be done by the
         * inviter platform once the INVITATION_CLAIMED webhook is received. If the inviter platform
         * either does not send the payment or the payment fails, the invitee will not receive this
         * amount. This field is primarily used for display purposes on the claiming side of the
         * invitation.
         */
        fun amountToSend(amountToSend: Long) = amountToSend(JsonField.of(amountToSend))

        /**
         * Sets [Builder.amountToSend] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amountToSend] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amountToSend(amountToSend: JsonField<Long>) = apply { this.amountToSend = amountToSend }

        /** When the invitation expires (if at all) */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** First name of the invitee to show as part of the invite */
        fun firstName(firstName: String) = firstName(JsonField.of(firstName))

        /**
         * Sets [Builder.firstName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.firstName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

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
         * Returns an immutable instance of [UmaInvitationCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .inviterUma()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UmaInvitationCreateRequest =
            UmaInvitationCreateRequest(
                checkRequired("inviterUma", inviterUma),
                amountToSend,
                expiresAt,
                firstName,
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
    fun validate(): UmaInvitationCreateRequest = apply {
        if (validated) {
            return@apply
        }

        inviterUma()
        amountToSend()
        expiresAt()
        firstName()
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
        (if (inviterUma.asKnown() == null) 0 else 1) +
            (if (amountToSend.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (firstName.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UmaInvitationCreateRequest &&
            inviterUma == other.inviterUma &&
            amountToSend == other.amountToSend &&
            expiresAt == other.expiresAt &&
            firstName == other.firstName &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(inviterUma, amountToSend, expiresAt, firstName, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UmaInvitationCreateRequest{inviterUma=$inviterUma, amountToSend=$amountToSend, expiresAt=$expiresAt, firstName=$firstName, additionalProperties=$additionalProperties}"
}
