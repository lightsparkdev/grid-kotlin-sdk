// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

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
 * Request body for `POST /auth/credentials/{id}/challenge`. Required when re-challenging a
 * `PASSKEY` credential — must carry `clientPublicKey` so Grid can bake it into the Turnkey
 * session-creation payload the returned challenge is computed from. Ignored for `EMAIL_OTP`, where
 * the credential type alone is sufficient because the OTP is delivered out-of-band. OAuth
 * credentials do not use this endpoint; authenticate or reauthenticate them with `POST
 * /auth/credentials/{id}/verify`.
 */
class AuthCredentialChallengeRequest
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
     * Required for `PASSKEY` credentials. Client-generated P-256 public key, hex-encoded in
     * uncompressed SEC1 format (`04` prefix followed by the 32-byte X and 32-byte Y coordinates;
     * 130 hex characters total). The matching private key must remain on the client. Grid bakes
     * this key into the Turnkey session-creation payload that the returned `challenge` is computed
     * from, so the resulting session signing key is sealed to the client. Ignored for `EMAIL_OTP`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun clientPublicKey(): String? = clientPublicKey.getNullable("clientPublicKey")

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
         * Returns a mutable builder for constructing an instance of
         * [AuthCredentialChallengeRequest].
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthCredentialChallengeRequest]. */
    class Builder internal constructor() {

        private var clientPublicKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authCredentialChallengeRequest: AuthCredentialChallengeRequest) = apply {
            clientPublicKey = authCredentialChallengeRequest.clientPublicKey
            additionalProperties =
                authCredentialChallengeRequest.additionalProperties.toMutableMap()
        }

        /**
         * Required for `PASSKEY` credentials. Client-generated P-256 public key, hex-encoded in
         * uncompressed SEC1 format (`04` prefix followed by the 32-byte X and 32-byte Y
         * coordinates; 130 hex characters total). The matching private key must remain on the
         * client. Grid bakes this key into the Turnkey session-creation payload that the returned
         * `challenge` is computed from, so the resulting session signing key is sealed to the
         * client. Ignored for `EMAIL_OTP`.
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
         * Returns an immutable instance of [AuthCredentialChallengeRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuthCredentialChallengeRequest =
            AuthCredentialChallengeRequest(clientPublicKey, additionalProperties.toMutableMap())
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
    fun validate(): AuthCredentialChallengeRequest = apply {
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

        return other is AuthCredentialChallengeRequest &&
            clientPublicKey == other.clientPublicKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(clientPublicKey, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthCredentialChallengeRequest{clientPublicKey=$clientPublicKey, additionalProperties=$additionalProperties}"
}
