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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * WebAuthn assertion returned by `navigator.credentials.get()`. In sandbox, Grid validates the
 * assertion against the registered passkey credential so the client-side flow can match production.
 * In production, Turnkey validates the WebAuthn assertion.
 */
class PasskeyAssertion
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticatorData: JsonField<String>,
    private val clientDataJson: JsonField<String>,
    private val credentialId: JsonField<String>,
    private val signature: JsonField<String>,
    private val userHandle: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authenticatorData")
        @ExcludeMissing
        authenticatorData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("clientDataJson")
        @ExcludeMissing
        clientDataJson: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credentialId")
        @ExcludeMissing
        credentialId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signature") @ExcludeMissing signature: JsonField<String> = JsonMissing.of(),
        @JsonProperty("userHandle") @ExcludeMissing userHandle: JsonField<String> = JsonMissing.of(),
    ) : this(authenticatorData, clientDataJson, credentialId, signature, userHandle, mutableMapOf())

    /**
     * Base64url-encoded authenticator data returned by the authenticator during the assertion.
     * Corresponds to `AuthenticatorAssertionResponse.authenticatorData`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticatorData(): String = authenticatorData.getRequired("authenticatorData")

    /**
     * Base64url-encoded JSON client data collected by the browser during the WebAuthn
     * `navigator.credentials.get()` call. Corresponds to
     * `AuthenticatorAssertionResponse.clientDataJSON` from the WebAuthn spec — Grid's field name is
     * intentionally camelCased as `clientDataJson` (lowercase JSON) for consistency with the rest
     * of the API; the value is the same bytes the browser returns. Contains the challenge, origin,
     * and `type: "webauthn.get"`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientDataJson(): String = clientDataJson.getRequired("clientDataJson")

    /**
     * Base64url-encoded credential identifier returned during the WebAuthn assertion. Corresponds
     * to `PublicKeyCredential.rawId`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialId(): String = credentialId.getRequired("credentialId")

    /**
     * Base64url-encoded signature produced by the authenticator over `authenticatorData ||
     * SHA-256(clientDataJSON)`. Corresponds to `AuthenticatorAssertionResponse.signature`. The
     * signature byte format is determined by the credential's public-key algorithm — DER-encoded
     * ECDSA for ES256 (P-256, typical for passkeys), PKCS#1 v1.5 for RS256, or a raw 64-byte
     * signature for EdDSA.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signature(): String = signature.getRequired("signature")

    /**
     * Base64url-encoded user handle returned by the authenticator. Corresponds to
     * `AuthenticatorAssertionResponse.userHandle`. Populated (and required by the WebAuthn spec)
     * for discoverable credentials — resident keys used in the "Sign in with passkey" autofill flow
     * — and typically present for passkey registrations. Omit this field entirely for
     * non-discoverable credentials specified via `allowCredentials` where the authenticator returns
     * no user handle.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun userHandle(): String? = userHandle.getNullable("userHandle")

    /**
     * Returns the raw JSON value of [authenticatorData].
     *
     * Unlike [authenticatorData], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authenticatorData")
    @ExcludeMissing
    fun _authenticatorData(): JsonField<String> = authenticatorData

    /**
     * Returns the raw JSON value of [clientDataJson].
     *
     * Unlike [clientDataJson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientDataJson")
    @ExcludeMissing
    fun _clientDataJson(): JsonField<String> = clientDataJson

    /**
     * Returns the raw JSON value of [credentialId].
     *
     * Unlike [credentialId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentialId")
    @ExcludeMissing
    fun _credentialId(): JsonField<String> = credentialId

    /**
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signature") @ExcludeMissing fun _signature(): JsonField<String> = signature

    /**
     * Returns the raw JSON value of [userHandle].
     *
     * Unlike [userHandle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("userHandle") @ExcludeMissing fun _userHandle(): JsonField<String> = userHandle

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
         * Returns a mutable builder for constructing an instance of [PasskeyAssertion].
         *
         * The following fields are required:
         * ```kotlin
         * .authenticatorData()
         * .clientDataJson()
         * .credentialId()
         * .signature()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PasskeyAssertion]. */
    class Builder internal constructor() {

        private var authenticatorData: JsonField<String>? = null
        private var clientDataJson: JsonField<String>? = null
        private var credentialId: JsonField<String>? = null
        private var signature: JsonField<String>? = null
        private var userHandle: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(passkeyAssertion: PasskeyAssertion) = apply {
            authenticatorData = passkeyAssertion.authenticatorData
            clientDataJson = passkeyAssertion.clientDataJson
            credentialId = passkeyAssertion.credentialId
            signature = passkeyAssertion.signature
            userHandle = passkeyAssertion.userHandle
            additionalProperties = passkeyAssertion.additionalProperties.toMutableMap()
        }

        /**
         * Base64url-encoded authenticator data returned by the authenticator during the assertion.
         * Corresponds to `AuthenticatorAssertionResponse.authenticatorData`.
         */
        fun authenticatorData(authenticatorData: String) =
            authenticatorData(JsonField.of(authenticatorData))

        /**
         * Sets [Builder.authenticatorData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticatorData] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authenticatorData(authenticatorData: JsonField<String>) = apply {
            this.authenticatorData = authenticatorData
        }

        /**
         * Base64url-encoded JSON client data collected by the browser during the WebAuthn
         * `navigator.credentials.get()` call. Corresponds to
         * `AuthenticatorAssertionResponse.clientDataJSON` from the WebAuthn spec — Grid's field
         * name is intentionally camelCased as `clientDataJson` (lowercase JSON) for consistency
         * with the rest of the API; the value is the same bytes the browser returns. Contains the
         * challenge, origin, and `type: "webauthn.get"`.
         */
        fun clientDataJson(clientDataJson: String) = clientDataJson(JsonField.of(clientDataJson))

        /**
         * Sets [Builder.clientDataJson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientDataJson] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientDataJson(clientDataJson: JsonField<String>) = apply {
            this.clientDataJson = clientDataJson
        }

        /**
         * Base64url-encoded credential identifier returned during the WebAuthn assertion.
         * Corresponds to `PublicKeyCredential.rawId`.
         */
        fun credentialId(credentialId: String) = credentialId(JsonField.of(credentialId))

        /**
         * Sets [Builder.credentialId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun credentialId(credentialId: JsonField<String>) = apply {
            this.credentialId = credentialId
        }

        /**
         * Base64url-encoded signature produced by the authenticator over `authenticatorData ||
         * SHA-256(clientDataJSON)`. Corresponds to `AuthenticatorAssertionResponse.signature`. The
         * signature byte format is determined by the credential's public-key algorithm —
         * DER-encoded ECDSA for ES256 (P-256, typical for passkeys), PKCS#1 v1.5 for RS256, or a
         * raw 64-byte signature for EdDSA.
         */
        fun signature(signature: String) = signature(JsonField.of(signature))

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signature(signature: JsonField<String>) = apply { this.signature = signature }

        /**
         * Base64url-encoded user handle returned by the authenticator. Corresponds to
         * `AuthenticatorAssertionResponse.userHandle`. Populated (and required by the WebAuthn
         * spec) for discoverable credentials — resident keys used in the "Sign in with passkey"
         * autofill flow — and typically present for passkey registrations. Omit this field entirely
         * for non-discoverable credentials specified via `allowCredentials` where the authenticator
         * returns no user handle.
         */
        fun userHandle(userHandle: String) = userHandle(JsonField.of(userHandle))

        /**
         * Sets [Builder.userHandle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userHandle] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun userHandle(userHandle: JsonField<String>) = apply { this.userHandle = userHandle }

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
         * Returns an immutable instance of [PasskeyAssertion].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .authenticatorData()
         * .clientDataJson()
         * .credentialId()
         * .signature()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PasskeyAssertion =
            PasskeyAssertion(
                checkRequired("authenticatorData", authenticatorData),
                checkRequired("clientDataJson", clientDataJson),
                checkRequired("credentialId", credentialId),
                checkRequired("signature", signature),
                userHandle,
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
    fun validate(): PasskeyAssertion = apply {
        if (validated) {
            return@apply
        }

        authenticatorData()
        clientDataJson()
        credentialId()
        signature()
        userHandle()
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
        (if (authenticatorData.asKnown() == null) 0 else 1) +
            (if (clientDataJson.asKnown() == null) 0 else 1) +
            (if (credentialId.asKnown() == null) 0 else 1) +
            (if (signature.asKnown() == null) 0 else 1) +
            (if (userHandle.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PasskeyAssertion &&
            authenticatorData == other.authenticatorData &&
            clientDataJson == other.clientDataJson &&
            credentialId == other.credentialId &&
            signature == other.signature &&
            userHandle == other.userHandle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authenticatorData,
            clientDataJson,
            credentialId,
            signature,
            userHandle,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PasskeyAssertion{authenticatorData=$authenticatorData, clientDataJson=$clientDataJson, credentialId=$credentialId, signature=$signature, userHandle=$userHandle, additionalProperties=$additionalProperties}"
}
