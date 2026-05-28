// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Partial request body for `PATCH /internal-accounts/{id}`. At least one update field must be
 * provided. On step 1 of the signed-retry flow Grid binds the submitted update fields into
 * `payloadToSign`; on step 2 the client echoes the same fields back and Grid applies the update to
 * the internal account.
 */
class InternalAccountUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val privateEnabled: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("privateEnabled")
        @ExcludeMissing
        privateEnabled: JsonField<Boolean> = JsonMissing.of()
    ) : this(privateEnabled, mutableMapOf())

    /**
     * Whether wallet privacy should be enabled for the Embedded Wallet.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun privateEnabled(): Boolean? = privateEnabled.getNullable("privateEnabled")

    /**
     * Returns the raw JSON value of [privateEnabled].
     *
     * Unlike [privateEnabled], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("privateEnabled")
    @ExcludeMissing
    fun _privateEnabled(): JsonField<Boolean> = privateEnabled

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
         * Returns a mutable builder for constructing an instance of [InternalAccountUpdateRequest].
         */
        fun builder() = Builder()
    }

    /** A builder for [InternalAccountUpdateRequest]. */
    class Builder internal constructor() {

        private var privateEnabled: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(internalAccountUpdateRequest: InternalAccountUpdateRequest) = apply {
            privateEnabled = internalAccountUpdateRequest.privateEnabled
            additionalProperties = internalAccountUpdateRequest.additionalProperties.toMutableMap()
        }

        /** Whether wallet privacy should be enabled for the Embedded Wallet. */
        fun privateEnabled(privateEnabled: Boolean) = privateEnabled(JsonField.of(privateEnabled))

        /**
         * Sets [Builder.privateEnabled] to an arbitrary JSON value.
         *
         * You should usually call [Builder.privateEnabled] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun privateEnabled(privateEnabled: JsonField<Boolean>) = apply {
            this.privateEnabled = privateEnabled
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
         * Returns an immutable instance of [InternalAccountUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): InternalAccountUpdateRequest =
            InternalAccountUpdateRequest(privateEnabled, additionalProperties.toMutableMap())
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
    fun validate(): InternalAccountUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        privateEnabled()
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
    internal fun validity(): Int = (if (privateEnabled.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InternalAccountUpdateRequest &&
            privateEnabled == other.privateEnabled &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(privateEnabled, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InternalAccountUpdateRequest{privateEnabled=$privateEnabled, additionalProperties=$additionalProperties}"
}
