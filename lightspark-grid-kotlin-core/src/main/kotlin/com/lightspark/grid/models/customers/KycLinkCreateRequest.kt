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

/** Request body for generating a hosted KYC link for an existing customer. */
class KycLinkCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val redirectUri: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("redirectUri")
        @ExcludeMissing
        redirectUri: JsonField<String> = JsonMissing.of()
    ) : this(redirectUri, mutableMapOf())

    /**
     * URI the customer is redirected to after completing the hosted KYC flow. Must start with
     * `https://` (or `http://` for local development). Embedded in the returned `kycUrl`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun redirectUri(): String? = redirectUri.getNullable("redirectUri")

    /**
     * Returns the raw JSON value of [redirectUri].
     *
     * Unlike [redirectUri], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redirectUri") @ExcludeMissing fun _redirectUri(): JsonField<String> = redirectUri

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

        /** Returns a mutable builder for constructing an instance of [KycLinkCreateRequest]. */
        fun builder() = Builder()
    }

    /** A builder for [KycLinkCreateRequest]. */
    class Builder internal constructor() {

        private var redirectUri: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(kycLinkCreateRequest: KycLinkCreateRequest) = apply {
            redirectUri = kycLinkCreateRequest.redirectUri
            additionalProperties = kycLinkCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * URI the customer is redirected to after completing the hosted KYC flow. Must start with
         * `https://` (or `http://` for local development). Embedded in the returned `kycUrl`.
         */
        fun redirectUri(redirectUri: String) = redirectUri(JsonField.of(redirectUri))

        /**
         * Sets [Builder.redirectUri] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redirectUri] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redirectUri(redirectUri: JsonField<String>) = apply { this.redirectUri = redirectUri }

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
         * Returns an immutable instance of [KycLinkCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): KycLinkCreateRequest =
            KycLinkCreateRequest(redirectUri, additionalProperties.toMutableMap())
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
    fun validate(): KycLinkCreateRequest = apply {
        if (validated) {
            return@apply
        }

        redirectUri()
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
    internal fun validity(): Int = (if (redirectUri.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KycLinkCreateRequest &&
            redirectUri == other.redirectUri &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(redirectUri, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KycLinkCreateRequest{redirectUri=$redirectUri, additionalProperties=$additionalProperties}"
}
