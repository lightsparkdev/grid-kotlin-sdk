// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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

/**
 * Starts (or restarts) an ownership verification challenge for a crypto wallet external account.
 */
class OwnershipChallengeRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val method: JsonField<OwnershipVerificationMethod>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("method")
        @ExcludeMissing
        method: JsonField<OwnershipVerificationMethod> = JsonMissing.of()
    ) : this(method, mutableMapOf())

    /**
     * The verification method to use for this challenge.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun method(): OwnershipVerificationMethod = method.getRequired("method")

    /**
     * Returns the raw JSON value of [method].
     *
     * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("method")
    @ExcludeMissing
    fun _method(): JsonField<OwnershipVerificationMethod> = method

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
         * Returns a mutable builder for constructing an instance of [OwnershipChallengeRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .method()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OwnershipChallengeRequest]. */
    class Builder internal constructor() {

        private var method: JsonField<OwnershipVerificationMethod>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ownershipChallengeRequest: OwnershipChallengeRequest) = apply {
            method = ownershipChallengeRequest.method
            additionalProperties = ownershipChallengeRequest.additionalProperties.toMutableMap()
        }

        /** The verification method to use for this challenge. */
        fun method(method: OwnershipVerificationMethod) = method(JsonField.of(method))

        /**
         * Sets [Builder.method] to an arbitrary JSON value.
         *
         * You should usually call [Builder.method] with a well-typed [OwnershipVerificationMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun method(method: JsonField<OwnershipVerificationMethod>) = apply { this.method = method }

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
         * Returns an immutable instance of [OwnershipChallengeRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .method()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OwnershipChallengeRequest =
            OwnershipChallengeRequest(
                checkRequired("method", method),
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
    fun validate(): OwnershipChallengeRequest = apply {
        if (validated) {
            return@apply
        }

        method().validate()
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
    internal fun validity(): Int = (method.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnershipChallengeRequest &&
            method == other.method &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(method, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OwnershipChallengeRequest{method=$method, additionalProperties=$additionalProperties}"
}
