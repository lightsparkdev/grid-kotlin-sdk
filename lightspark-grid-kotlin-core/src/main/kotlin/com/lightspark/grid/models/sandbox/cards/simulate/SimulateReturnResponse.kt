// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

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
 * Response body for the sandbox card-event simulators. The simulate call pokes the card issuer's
 * sandbox; the resulting card operation is delivered asynchronously via the issuer's events
 * webhook, never synchronously in this response.
 */
class SimulateReturnResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val issuerTransactionToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("issuerTransactionToken")
        @ExcludeMissing
        issuerTransactionToken: JsonField<String> = JsonMissing.of()
    ) : this(issuerTransactionToken, mutableMapOf())

    /**
     * The card issuer's transaction token for the simulated event. Correlates the eventual
     * webhook-delivered card operation back to this simulate call.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun issuerTransactionToken(): String =
        issuerTransactionToken.getRequired("issuerTransactionToken")

    /**
     * Returns the raw JSON value of [issuerTransactionToken].
     *
     * Unlike [issuerTransactionToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("issuerTransactionToken")
    @ExcludeMissing
    fun _issuerTransactionToken(): JsonField<String> = issuerTransactionToken

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
         * Returns a mutable builder for constructing an instance of [SimulateReturnResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .issuerTransactionToken()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SimulateReturnResponse]. */
    class Builder internal constructor() {

        private var issuerTransactionToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(simulateReturnResponse: SimulateReturnResponse) = apply {
            issuerTransactionToken = simulateReturnResponse.issuerTransactionToken
            additionalProperties = simulateReturnResponse.additionalProperties.toMutableMap()
        }

        /**
         * The card issuer's transaction token for the simulated event. Correlates the eventual
         * webhook-delivered card operation back to this simulate call.
         */
        fun issuerTransactionToken(issuerTransactionToken: String) =
            issuerTransactionToken(JsonField.of(issuerTransactionToken))

        /**
         * Sets [Builder.issuerTransactionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuerTransactionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuerTransactionToken(issuerTransactionToken: JsonField<String>) = apply {
            this.issuerTransactionToken = issuerTransactionToken
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
         * Returns an immutable instance of [SimulateReturnResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .issuerTransactionToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SimulateReturnResponse =
            SimulateReturnResponse(
                checkRequired("issuerTransactionToken", issuerTransactionToken),
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
    fun validate(): SimulateReturnResponse = apply {
        if (validated) {
            return@apply
        }

        issuerTransactionToken()
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
    internal fun validity(): Int = (if (issuerTransactionToken.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SimulateReturnResponse &&
            issuerTransactionToken == other.issuerTransactionToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(issuerTransactionToken, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SimulateReturnResponse{issuerTransactionToken=$issuerTransactionToken, additionalProperties=$additionalProperties}"
}
