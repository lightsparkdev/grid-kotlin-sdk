// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
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
@JsonDeserialize(using = AuthCredentialVerifyRequestOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialVerifyRequestOneOf.Serializer::class)
class AuthCredentialVerifyRequestOneOf
private constructor(
    private val emailOtp: EmailOtpCredentialVerifyRequest? = null,
    private val smsOtp: SmsOtp? = null,
    private val oauth: OAuthCredentialVerifyRequest? = null,
    private val passkey: PasskeyCredentialVerifyRequest? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Verify an email-OTP credential via the secure two-leg flow. The client HPKE-encrypts the OTP
     * code (together with its public key) under the `otpEncryptionTargetBundle` returned from
     * registration when present, or from `POST /auth/credentials/{id}/challenge` when registration
     * omitted it or the OTP must be reissued, submits the result here, and receives `202` with a
     * `payloadToSign` containing a login signing message bound to the client's public key. The
     * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK private
     * key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers to obtain
     * the session. Plaintext OTP codes are never sent over the wire.
     */
    fun emailOtp(): EmailOtpCredentialVerifyRequest? = emailOtp

    /**
     * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
     * HPKE-encrypts the OTP code (together with its public key) under the
     * `otpEncryptionTargetBundle` returned from registration or `POST
     * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
     * `payloadToSign` containing a login signing message bound to the client's public key. The
     * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK private
     * key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers to obtain
     * the session. Plaintext OTP codes are never sent over the wire.
     */
    fun smsOtp(): SmsOtp? = smsOtp

    fun oauth(): OAuthCredentialVerifyRequest? = oauth

    fun passkey(): PasskeyCredentialVerifyRequest? = passkey

    fun isEmailOtp(): Boolean = emailOtp != null

    fun isSmsOtp(): Boolean = smsOtp != null

    fun isOAuth(): Boolean = oauth != null

    fun isPasskey(): Boolean = passkey != null

    /**
     * Verify an email-OTP credential via the secure two-leg flow. The client HPKE-encrypts the OTP
     * code (together with its public key) under the `otpEncryptionTargetBundle` returned from
     * registration when present, or from `POST /auth/credentials/{id}/challenge` when registration
     * omitted it or the OTP must be reissued, submits the result here, and receives `202` with a
     * `payloadToSign` containing a login signing message bound to the client's public key. The
     * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK private
     * key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers to obtain
     * the session. Plaintext OTP codes are never sent over the wire.
     */
    fun asEmailOtp(): EmailOtpCredentialVerifyRequest = emailOtp.getOrThrow("emailOtp")

    /**
     * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
     * HPKE-encrypts the OTP code (together with its public key) under the
     * `otpEncryptionTargetBundle` returned from registration or `POST
     * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
     * `payloadToSign` containing a login signing message bound to the client's public key. The
     * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK private
     * key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers to obtain
     * the session. Plaintext OTP codes are never sent over the wire.
     */
    fun asSmsOtp(): SmsOtp = smsOtp.getOrThrow("smsOtp")

    fun asOAuth(): OAuthCredentialVerifyRequest = oauth.getOrThrow("oauth")

    fun asPasskey(): PasskeyCredentialVerifyRequest = passkey.getOrThrow("passkey")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.lightspark.grid.core.JsonValue
     *
     * val result: String? = authCredentialVerifyRequestOneOf.accept(object : AuthCredentialVerifyRequestOneOf.Visitor<String?> {
     *     override fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest): String? = emailOtp.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
     *   [visitor] and the current variant is unknown.
     */
    fun <T> accept(visitor: Visitor<T>): T =
        when {
            emailOtp != null -> visitor.visitEmailOtp(emailOtp)
            smsOtp != null -> visitor.visitSmsOtp(smsOtp)
            oauth != null -> visitor.visitOAuth(oauth)
            passkey != null -> visitor.visitPasskey(passkey)
            else -> visitor.unknown(_json)
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
    fun validate(): AuthCredentialVerifyRequestOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest) {
                    emailOtp.validate()
                }

                override fun visitSmsOtp(smsOtp: SmsOtp) {
                    smsOtp.validate()
                }

                override fun visitOAuth(oauth: OAuthCredentialVerifyRequest) {
                    oauth.validate()
                }

                override fun visitPasskey(passkey: PasskeyCredentialVerifyRequest) {
                    passkey.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest) =
                    emailOtp.validity()

                override fun visitSmsOtp(smsOtp: SmsOtp) = smsOtp.validity()

                override fun visitOAuth(oauth: OAuthCredentialVerifyRequest) = oauth.validity()

                override fun visitPasskey(passkey: PasskeyCredentialVerifyRequest) =
                    passkey.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCredentialVerifyRequestOneOf &&
            emailOtp == other.emailOtp &&
            smsOtp == other.smsOtp &&
            oauth == other.oauth &&
            passkey == other.passkey
    }

    override fun hashCode(): Int = Objects.hash(emailOtp, smsOtp, oauth, passkey)

    override fun toString(): String =
        when {
            emailOtp != null -> "AuthCredentialVerifyRequestOneOf{emailOtp=$emailOtp}"
            smsOtp != null -> "AuthCredentialVerifyRequestOneOf{smsOtp=$smsOtp}"
            oauth != null -> "AuthCredentialVerifyRequestOneOf{oauth=$oauth}"
            passkey != null -> "AuthCredentialVerifyRequestOneOf{passkey=$passkey}"
            _json != null -> "AuthCredentialVerifyRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialVerifyRequestOneOf")
        }

    companion object {

        /**
         * Verify an email-OTP credential via the secure two-leg flow. The client HPKE-encrypts the
         * OTP code (together with its public key) under the `otpEncryptionTargetBundle` returned
         * from registration when present, or from `POST /auth/credentials/{id}/challenge` when
         * registration omitted it or the OTP must be reissued, submits the result here, and
         * receives `202` with a `payloadToSign` containing a login signing message bound to the
         * client's public key. The client stamps the exact UTF-8 bytes of that string, unchanged,
         * with the matching TEK private key and retries this request with `Grid-Wallet-Signature` +
         * `Request-Id` headers to obtain the session. Plaintext OTP codes are never sent over the
         * wire.
         */
        fun ofEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest) =
            AuthCredentialVerifyRequestOneOf(emailOtp = emailOtp)

        /**
         * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
         * HPKE-encrypts the OTP code (together with its public key) under the
         * `otpEncryptionTargetBundle` returned from registration or `POST
         * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
         * `payloadToSign` containing a login signing message bound to the client's public key. The
         * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK
         * private key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers
         * to obtain the session. Plaintext OTP codes are never sent over the wire.
         */
        fun ofSmsOtp(smsOtp: SmsOtp) = AuthCredentialVerifyRequestOneOf(smsOtp = smsOtp)

        fun ofOAuth(oauth: OAuthCredentialVerifyRequest) =
            AuthCredentialVerifyRequestOneOf(oauth = oauth)

        fun ofPasskey(passkey: PasskeyCredentialVerifyRequest) =
            AuthCredentialVerifyRequestOneOf(passkey = passkey)
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialVerifyRequestOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Verify an email-OTP credential via the secure two-leg flow. The client HPKE-encrypts the
         * OTP code (together with its public key) under the `otpEncryptionTargetBundle` returned
         * from registration when present, or from `POST /auth/credentials/{id}/challenge` when
         * registration omitted it or the OTP must be reissued, submits the result here, and
         * receives `202` with a `payloadToSign` containing a login signing message bound to the
         * client's public key. The client stamps the exact UTF-8 bytes of that string, unchanged,
         * with the matching TEK private key and retries this request with `Grid-Wallet-Signature` +
         * `Request-Id` headers to obtain the session. Plaintext OTP codes are never sent over the
         * wire.
         */
        fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest): T

        /**
         * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
         * HPKE-encrypts the OTP code (together with its public key) under the
         * `otpEncryptionTargetBundle` returned from registration or `POST
         * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
         * `payloadToSign` containing a login signing message bound to the client's public key. The
         * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK
         * private key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers
         * to obtain the session. Plaintext OTP codes are never sent over the wire.
         */
        fun visitSmsOtp(smsOtp: SmsOtp): T

        fun visitOAuth(oauth: OAuthCredentialVerifyRequest): T

        fun visitPasskey(passkey: PasskeyCredentialVerifyRequest): T

        /**
         * Maps an unknown variant of [AuthCredentialVerifyRequestOneOf] to a value of type [T].
         *
         * An instance of [AuthCredentialVerifyRequestOneOf] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException(
                "Unknown AuthCredentialVerifyRequestOneOf: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<AuthCredentialVerifyRequestOneOf>(
            AuthCredentialVerifyRequestOneOf::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): AuthCredentialVerifyRequestOneOf {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "EMAIL_OTP" -> {
                    return tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialVerifyRequest>())
                        ?.let { AuthCredentialVerifyRequestOneOf(emailOtp = it, _json = json) }
                        ?: AuthCredentialVerifyRequestOneOf(_json = json)
                }
                "SMS_OTP" -> {
                    return tryDeserialize(node, jacksonTypeRef<SmsOtp>())?.let {
                        AuthCredentialVerifyRequestOneOf(smsOtp = it, _json = json)
                    } ?: AuthCredentialVerifyRequestOneOf(_json = json)
                }
                "OAUTH" -> {
                    return tryDeserialize(node, jacksonTypeRef<OAuthCredentialVerifyRequest>())
                        ?.let { AuthCredentialVerifyRequestOneOf(oauth = it, _json = json) }
                        ?: AuthCredentialVerifyRequestOneOf(_json = json)
                }
                "PASSKEY" -> {
                    return tryDeserialize(node, jacksonTypeRef<PasskeyCredentialVerifyRequest>())
                        ?.let { AuthCredentialVerifyRequestOneOf(passkey = it, _json = json) }
                        ?: AuthCredentialVerifyRequestOneOf(_json = json)
                }
            }

            return AuthCredentialVerifyRequestOneOf(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<AuthCredentialVerifyRequestOneOf>(AuthCredentialVerifyRequestOneOf::class) {

        override fun serialize(
            value: AuthCredentialVerifyRequestOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.emailOtp != null -> generator.writeObject(value.emailOtp)
                value.smsOtp != null -> generator.writeObject(value.smsOtp)
                value.oauth != null -> generator.writeObject(value.oauth)
                value.passkey != null -> generator.writeObject(value.passkey)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialVerifyRequestOneOf")
            }
        }
    }

    /**
     * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
     * HPKE-encrypts the OTP code (together with its public key) under the
     * `otpEncryptionTargetBundle` returned from registration or `POST
     * /auth/credentials/{id}/challenge`, submits the result here, and receives `202` with a
     * `payloadToSign` containing a login signing message bound to the client's public key. The
     * client stamps the exact UTF-8 bytes of that string, unchanged, with the matching TEK private
     * key and retries this request with `Grid-Wallet-Signature` + `Request-Id` headers to obtain
     * the session. Plaintext OTP codes are never sent over the wire.
     */
    class SmsOtp
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val encryptedOtpBundle: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("encryptedOtpBundle")
            @ExcludeMissing
            encryptedOtpBundle: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(encryptedOtpBundle, type, mutableMapOf())

        /**
         * HPKE-sealed OTP attempt. Same format and retry semantics as
         * `EmailOtpCredentialVerifyRequest.encryptedOtpBundle`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun encryptedOtpBundle(): String = encryptedOtpBundle.getRequired("encryptedOtpBundle")

        /**
         * Discriminator value identifying this as an SMS OTP verification.
         *
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("SMS_OTP")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [encryptedOtpBundle].
         *
         * Unlike [encryptedOtpBundle], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("encryptedOtpBundle")
        @ExcludeMissing
        fun _encryptedOtpBundle(): JsonField<String> = encryptedOtpBundle

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
             * Returns a mutable builder for constructing an instance of [SmsOtp].
             *
             * The following fields are required:
             * ```kotlin
             * .encryptedOtpBundle()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SmsOtp]. */
        class Builder internal constructor() {

            private var encryptedOtpBundle: JsonField<String>? = null
            private var type: JsonValue = JsonValue.from("SMS_OTP")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(smsOtp: SmsOtp) = apply {
                encryptedOtpBundle = smsOtp.encryptedOtpBundle
                type = smsOtp.type
                additionalProperties = smsOtp.additionalProperties.toMutableMap()
            }

            /**
             * HPKE-sealed OTP attempt. Same format and retry semantics as
             * `EmailOtpCredentialVerifyRequest.encryptedOtpBundle`.
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

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("SMS_OTP")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonValue) = apply { this.type = type }

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
             * Returns an immutable instance of [SmsOtp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .encryptedOtpBundle()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SmsOtp =
                SmsOtp(
                    checkRequired("encryptedOtpBundle", encryptedOtpBundle),
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): SmsOtp = apply {
            if (validated) {
                return@apply
            }

            encryptedOtpBundle()
            _type().let {
                if (it != JsonValue.from("SMS_OTP")) {
                    throw LightsparkGridInvalidDataException("'type' is invalid, received $it")
                }
            }
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
        internal fun validity(): Int =
            (if (encryptedOtpBundle.asKnown() == null) 0 else 1) +
                type.let { if (it == JsonValue.from("SMS_OTP")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SmsOtp &&
                encryptedOtpBundle == other.encryptedOtpBundle &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(encryptedOtpBundle, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SmsOtp{encryptedOtpBundle=$encryptedOtpBundle, type=$type, additionalProperties=$additionalProperties}"
    }
}
