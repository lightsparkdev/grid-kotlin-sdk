// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

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
 * Request body for refreshing an active authentication session. The `clientPublicKey` is required
 * on both steps of the signed-retry flow. On the initial call, Grid binds this key into the Turnkey
 * session-creation payload returned as `payloadToSign`; on the signed retry, the client echoes the
 * same key back and Grid uses it to encrypt the newly issued session signing key.
 */
class AuthSessionRefreshRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientPublicKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clientPublicKey")
        @ExcludeMissing
        clientPublicKey: JsonField<String> = JsonMissing.of()
    ) : this(clientPublicKey, mutableMapOf())

    /**
     * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (`04` prefix
     * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The matching
     * private key must remain on the client. Grid binds this key into the session-creation payload
     * on the initial call and seals the returned `encryptedSessionSigningKey` to it on the signed
     * retry.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientPublicKey(): String = clientPublicKey.getRequired("clientPublicKey")

    /**
     * Returns the raw JSON value of [clientPublicKey].
     *
     * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientPublicKey")
    @ExcludeMissing
    fun _clientPublicKey(): JsonField<String> = clientPublicKey

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
         * Returns a mutable builder for constructing an instance of [AuthSessionRefreshRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .clientPublicKey()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthSessionRefreshRequest]. */
    class Builder internal constructor() {

        private var clientPublicKey: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authSessionRefreshRequest: AuthSessionRefreshRequest) = apply {
            clientPublicKey = authSessionRefreshRequest.clientPublicKey
            additionalProperties = authSessionRefreshRequest.additionalProperties.toMutableMap()
        }

        /**
         * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (`04` prefix
         * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The
         * matching private key must remain on the client. Grid binds this key into the
         * session-creation payload on the initial call and seals the returned
         * `encryptedSessionSigningKey` to it on the signed retry.
         */
        fun clientPublicKey(clientPublicKey: String) =
            clientPublicKey(JsonField.of(clientPublicKey))

        /**
         * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientPublicKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
            this.clientPublicKey = clientPublicKey
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
         * Returns an immutable instance of [AuthSessionRefreshRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .clientPublicKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthSessionRefreshRequest =
            AuthSessionRefreshRequest(
                checkRequired("clientPublicKey", clientPublicKey),
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
    fun validate(): AuthSessionRefreshRequest = apply {
        if (validated) {
            return@apply
        }

        clientPublicKey()
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
    internal fun validity(): Int = (if (clientPublicKey.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthSessionRefreshRequest &&
            clientPublicKey == other.clientPublicKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clientPublicKey, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthSessionRefreshRequest{clientPublicKey=$clientPublicKey, additionalProperties=$additionalProperties}"
}
