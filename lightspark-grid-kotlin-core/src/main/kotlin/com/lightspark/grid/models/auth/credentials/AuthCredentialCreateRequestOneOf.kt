// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Objects

@JsonDeserialize(using = AuthCredentialCreateRequestOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialCreateRequestOneOf.Serializer::class)
class AuthCredentialCreateRequestOneOf
private constructor(
    private val emailOtp: EmailOtpCredentialCreateRequest? = null,
    private val oauth: OAuthCredentialCreateRequest? = null,
    private val passkey: PasskeyCredentialCreateRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun emailOtp(): EmailOtpCredentialCreateRequest? = emailOtp

    fun oauth(): OAuthCredentialCreateRequest? = oauth

    fun passkey(): PasskeyCredentialCreateRequest? = passkey

    fun isEmailOtp(): Boolean = emailOtp != null

    fun isOAuth(): Boolean = oauth != null

    fun isPasskey(): Boolean = passkey != null

    fun asEmailOtp(): EmailOtpCredentialCreateRequest = emailOtp.getOrThrow("emailOtp")

    fun asOAuth(): OAuthCredentialCreateRequest = oauth.getOrThrow("oauth")

    fun asPasskey(): PasskeyCredentialCreateRequest = passkey.getOrThrow("passkey")

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
     * val result: String? = authCredentialCreateRequestOneOf.accept(object : AuthCredentialCreateRequestOneOf.Visitor<String?> {
     *     override fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest): String? = emailOtp.toString()
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
    fun validate(): AuthCredentialCreateRequestOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest) {
                    emailOtp.validate()
                }

                override fun visitOAuth(oauth: OAuthCredentialCreateRequest) {
                    oauth.validate()
                }

                override fun visitPasskey(passkey: PasskeyCredentialCreateRequest) {
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
                override fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest) =
                    emailOtp.validity()

                override fun visitOAuth(oauth: OAuthCredentialCreateRequest) = oauth.validity()

                override fun visitPasskey(passkey: PasskeyCredentialCreateRequest) =
                    passkey.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCredentialCreateRequestOneOf &&
            emailOtp == other.emailOtp &&
            oauth == other.oauth &&
            passkey == other.passkey
    }

    override fun hashCode(): Int = Objects.hash(emailOtp, oauth, passkey)

    override fun toString(): String =
        when {
            emailOtp != null -> "AuthCredentialCreateRequestOneOf{emailOtp=$emailOtp}"
            oauth != null -> "AuthCredentialCreateRequestOneOf{oauth=$oauth}"
            passkey != null -> "AuthCredentialCreateRequestOneOf{passkey=$passkey}"
            _json != null -> "AuthCredentialCreateRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
        }

    companion object {

        fun ofEmailOtp(emailOtp: EmailOtpCredentialCreateRequest) =
            AuthCredentialCreateRequestOneOf(emailOtp = emailOtp)

        fun ofOAuth(oauth: OAuthCredentialCreateRequest) =
            AuthCredentialCreateRequestOneOf(oauth = oauth)

        fun ofPasskey(passkey: PasskeyCredentialCreateRequest) =
            AuthCredentialCreateRequestOneOf(passkey = passkey)
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialCreateRequestOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest): T

        fun visitOAuth(oauth: OAuthCredentialCreateRequest): T

        fun visitPasskey(passkey: PasskeyCredentialCreateRequest): T

        /**
         * Maps an unknown variant of [AuthCredentialCreateRequestOneOf] to a value of type [T].
         *
         * An instance of [AuthCredentialCreateRequestOneOf] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException(
                "Unknown AuthCredentialCreateRequestOneOf: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<AuthCredentialCreateRequestOneOf>(
            AuthCredentialCreateRequestOneOf::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): AuthCredentialCreateRequestOneOf {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {
                "EMAIL_OTP" -> {
                    return tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialCreateRequest>())
                        ?.let { AuthCredentialCreateRequestOneOf(emailOtp = it, _json = json) }
                        ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
                "OAUTH" -> {
                    return tryDeserialize(node, jacksonTypeRef<OAuthCredentialCreateRequest>())
                        ?.let { AuthCredentialCreateRequestOneOf(oauth = it, _json = json) }
                        ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
                "PASSKEY" -> {
                    return tryDeserialize(node, jacksonTypeRef<PasskeyCredentialCreateRequest>())
                        ?.let { AuthCredentialCreateRequestOneOf(passkey = it, _json = json) }
                        ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
            }

            return AuthCredentialCreateRequestOneOf(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<AuthCredentialCreateRequestOneOf>(AuthCredentialCreateRequestOneOf::class) {

        override fun serialize(
            value: AuthCredentialCreateRequestOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.emailOtp != null -> generator.writeObject(value.emailOtp)
                value.oauth != null -> generator.writeObject(value.oauth)
                value.passkey != null -> generator.writeObject(value.passkey)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
            }
        }
    }
}
