// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

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
import java.util.Collections
import java.util.Objects

/**
 * Verify an email-OTP credential via the secure two-leg flow. The client HPKE-encrypts the OTP code
 * (together with its public key) under the `otpEncryptionTargetBundle` returned from registration
 * when present, or from `POST /auth/credentials/{id}/challenge` when registration omitted it or the
 * OTP must be reissued, submits the result here, and receives `202` with a `payloadToSign`
 * containing a login signing message bound to the client's public key. The client stamps the exact
 * UTF-8 bytes of that string, unchanged, with the matching TEK private key and retries this request
 * with `Grid-Wallet-Signature` + `Request-Id` headers to obtain the session. Plaintext OTP codes
 * are never sent over the wire.
 */
class EmailOtpCredentialVerifyRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val encryptedOtpBundle: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("encryptedOtpBundle")
        @ExcludeMissing
        encryptedOtpBundle: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(encryptedOtpBundle, type, mutableMapOf())

    fun toAuthCredentialVerifyRequest(): AuthCredentialVerifyRequest =
        AuthCredentialVerifyRequest.builder().build()

    /**
     * HPKE-sealed OTP attempt — the OTP code never reaches Grid in plaintext. The client generates
     * a fresh ephemeral P-256 key pair (the session signing key pair it keeps once login
     * completes), HPKE-encrypts `{otp_code, public_key}` (the code the user entered plus that key
     * pair's public key) to the key in `otpEncryptionTargetBundle`, and submits the encrypted
     * result here. `public_key` must be the compressed public key: 66 hex characters starting with
     * `02` or `03`. In production, a bundle with an uncompressed key fails with `400
     * INVALID_INPUT`, even when the OTP code is correct. A wrong OTP code returns the same error.
     * The `verificationToken` is bound to this key, so the signed retry's `Grid-Wallet-Signature`
     * stamp must carry the same compressed `publicKey`. The value is the `{encappedPublic,
     * ciphertext}` JSON an HPKE library produces; the Global Accounts client-keys guide has a
     * worked example.
     *
     * On success the response is `202` with a `payloadToSign` containing a login signing message
     * bound to the public key sealed in this bundle. Build an API-key stamp over the exact UTF-8
     * bytes of that string with the matching TEK private key, without parsing, re-serializing, or
     * trimming it, then retry this request with the full stamp in `Grid-Wallet-Signature` and the
     * `requestId` in `Request-Id` to complete the flow and receive the session. The client keeps
     * that private key as the session signing key, and its public key becomes the session API key.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedOtpBundle(): String = encryptedOtpBundle.getRequired("encryptedOtpBundle")

    /**
     * Discriminator value identifying this as an email OTP verification.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [encryptedOtpBundle].
     *
     * Unlike [encryptedOtpBundle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("encryptedOtpBundle")
    @ExcludeMissing
    fun _encryptedOtpBundle(): JsonField<String> = encryptedOtpBundle

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
         * Returns a mutable builder for constructing an instance of
         * [EmailOtpCredentialVerifyRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .encryptedOtpBundle()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EmailOtpCredentialVerifyRequest]. */
    class Builder internal constructor() {

        private var encryptedOtpBundle: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(emailOtpCredentialVerifyRequest: EmailOtpCredentialVerifyRequest) =
            apply {
                encryptedOtpBundle = emailOtpCredentialVerifyRequest.encryptedOtpBundle
                type = emailOtpCredentialVerifyRequest.type
                additionalProperties =
                    emailOtpCredentialVerifyRequest.additionalProperties.toMutableMap()
            }

        /**
         * HPKE-sealed OTP attempt — the OTP code never reaches Grid in plaintext. The client
         * generates a fresh ephemeral P-256 key pair (the session signing key pair it keeps once
         * login completes), HPKE-encrypts `{otp_code, public_key}` (the code the user entered plus
         * that key pair's public key) to the key in `otpEncryptionTargetBundle`, and submits the
         * encrypted result here. `public_key` must be the compressed public key: 66 hex characters
         * starting with `02` or `03`. In production, a bundle with an uncompressed key fails with
         * `400 INVALID_INPUT`, even when the OTP code is correct. A wrong OTP code returns the same
         * error. The `verificationToken` is bound to this key, so the signed retry's
         * `Grid-Wallet-Signature` stamp must carry the same compressed `publicKey`. The value is
         * the `{encappedPublic, ciphertext}` JSON an HPKE library produces; the Global Accounts
         * client-keys guide has a worked example.
         *
         * On success the response is `202` with a `payloadToSign` containing a login signing
         * message bound to the public key sealed in this bundle. Build an API-key stamp over the
         * exact UTF-8 bytes of that string with the matching TEK private key, without parsing,
         * re-serializing, or trimming it, then retry this request with the full stamp in
         * `Grid-Wallet-Signature` and the `requestId` in `Request-Id` to complete the flow and
         * receive the session. The client keeps that private key as the session signing key, and
         * its public key becomes the session API key.
         */
        fun encryptedOtpBundle(encryptedOtpBundle: String) =
            encryptedOtpBundle(JsonField.of(encryptedOtpBundle))

        /**
         * Sets [Builder.encryptedOtpBundle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedOtpBundle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedOtpBundle(encryptedOtpBundle: JsonField<String>) = apply {
            this.encryptedOtpBundle = encryptedOtpBundle
        }

        /** Discriminator value identifying this as an email OTP verification. */
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
         * Returns an immutable instance of [EmailOtpCredentialVerifyRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .encryptedOtpBundle()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EmailOtpCredentialVerifyRequest =
            EmailOtpCredentialVerifyRequest(
                checkRequired("encryptedOtpBundle", encryptedOtpBundle),
                checkRequired("type", type),
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
    fun validate(): EmailOtpCredentialVerifyRequest = apply {
        if (validated) {
            return@apply
        }

        encryptedOtpBundle()
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
        (if (encryptedOtpBundle.asKnown() == null) 0 else 1) + (type.asKnown()?.validity() ?: 0)

    /** Discriminator value identifying this as an email OTP verification. */
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

            val EMAIL_OTP = of("EMAIL_OTP")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            EMAIL_OTP
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
            EMAIL_OTP,
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
                EMAIL_OTP -> Value.EMAIL_OTP
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
                EMAIL_OTP -> Known.EMAIL_OTP
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
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

        return other is EmailOtpCredentialVerifyRequest &&
            encryptedOtpBundle == other.encryptedOtpBundle &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(encryptedOtpBundle, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EmailOtpCredentialVerifyRequest{encryptedOtpBundle=$encryptedOtpBundle, type=$type, additionalProperties=$additionalProperties}"
}
