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
import java.util.Collections
import java.util.Objects

class UmaInvitationClaimRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val inviteeUma: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("inviteeUma") @ExcludeMissing inviteeUma: JsonField<String> = JsonMissing.of()
    ) : this(inviteeUma, mutableMapOf())

    /**
     * The UMA address of the customer claiming the invitation
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun inviteeUma(): String = inviteeUma.getRequired("inviteeUma")

    /**
     * Returns the raw JSON value of [inviteeUma].
     *
     * Unlike [inviteeUma], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("inviteeUma") @ExcludeMissing fun _inviteeUma(): JsonField<String> = inviteeUma

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
         * Returns a mutable builder for constructing an instance of [UmaInvitationClaimRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .inviteeUma()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UmaInvitationClaimRequest]. */
    class Builder internal constructor() {

        private var inviteeUma: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(umaInvitationClaimRequest: UmaInvitationClaimRequest) = apply {
            inviteeUma = umaInvitationClaimRequest.inviteeUma
            additionalProperties = umaInvitationClaimRequest.additionalProperties.toMutableMap()
        }

        /** The UMA address of the customer claiming the invitation */
        fun inviteeUma(inviteeUma: String) = inviteeUma(JsonField.of(inviteeUma))

        /**
         * Sets [Builder.inviteeUma] to an arbitrary JSON value.
         *
         * You should usually call [Builder.inviteeUma] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun inviteeUma(inviteeUma: JsonField<String>) = apply { this.inviteeUma = inviteeUma }

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
         * Returns an immutable instance of [UmaInvitationClaimRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .inviteeUma()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UmaInvitationClaimRequest =
            UmaInvitationClaimRequest(
                checkRequired("inviteeUma", inviteeUma),
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
    fun validate(): UmaInvitationClaimRequest = apply {
        if (validated) {
            return@apply
        }

        inviteeUma()
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
    internal fun validity(): Int = (if (inviteeUma.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UmaInvitationClaimRequest &&
            inviteeUma == other.inviteeUma &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(inviteeUma, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UmaInvitationClaimRequest{inviteeUma=$inviteeUma, additionalProperties=$additionalProperties}"
}
