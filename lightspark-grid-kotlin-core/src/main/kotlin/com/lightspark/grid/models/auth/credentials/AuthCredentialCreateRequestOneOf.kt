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
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Objects

@JsonDeserialize(using = AuthCredentialCreateRequestOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialCreateRequestOneOf.Serializer::class)
class AuthCredentialCreateRequestOneOf
private constructor(
    private val emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest? = null,
    private val oauthCredentialCreateRequest: OAuthCredentialCreateRequest? = null,
    private val passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun emailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest? =
        emailOtpCredentialCreateRequest

    fun oauthCredentialCreateRequest(): OAuthCredentialCreateRequest? = oauthCredentialCreateRequest

    fun passkeyCredentialCreateRequest(): PasskeyCredentialCreateRequest? =
        passkeyCredentialCreateRequest

    fun isEmailOtpCredentialCreateRequest(): Boolean = emailOtpCredentialCreateRequest != null

    fun isOAuthCredentialCreateRequest(): Boolean = oauthCredentialCreateRequest != null

    fun isPasskeyCredentialCreateRequest(): Boolean = passkeyCredentialCreateRequest != null

    fun asEmailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest =
        emailOtpCredentialCreateRequest.getOrThrow("emailOtpCredentialCreateRequest")

    fun asOAuthCredentialCreateRequest(): OAuthCredentialCreateRequest =
        oauthCredentialCreateRequest.getOrThrow("oauthCredentialCreateRequest")

    fun asPasskeyCredentialCreateRequest(): PasskeyCredentialCreateRequest =
        passkeyCredentialCreateRequest.getOrThrow("passkeyCredentialCreateRequest")

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
     *     override fun visitEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest): String? = emailOtpCredentialCreateRequest.toString()
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
            emailOtpCredentialCreateRequest != null ->
                visitor.visitEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest)
            oauthCredentialCreateRequest != null ->
                visitor.visitOAuthCredentialCreateRequest(oauthCredentialCreateRequest)
            passkeyCredentialCreateRequest != null ->
                visitor.visitPasskeyCredentialCreateRequest(passkeyCredentialCreateRequest)
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
                override fun visitEmailOtpCredentialCreateRequest(
                    emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
                ) {
                    emailOtpCredentialCreateRequest.validate()
                }

                override fun visitOAuthCredentialCreateRequest(
                    oauthCredentialCreateRequest: OAuthCredentialCreateRequest
                ) {
                    oauthCredentialCreateRequest.validate()
                }

                override fun visitPasskeyCredentialCreateRequest(
                    passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
                ) {
                    passkeyCredentialCreateRequest.validate()
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
                override fun visitEmailOtpCredentialCreateRequest(
                    emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
                ) = emailOtpCredentialCreateRequest.validity()

                override fun visitOAuthCredentialCreateRequest(
                    oauthCredentialCreateRequest: OAuthCredentialCreateRequest
                ) = oauthCredentialCreateRequest.validity()

                override fun visitPasskeyCredentialCreateRequest(
                    passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
                ) = passkeyCredentialCreateRequest.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCredentialCreateRequestOneOf &&
            emailOtpCredentialCreateRequest == other.emailOtpCredentialCreateRequest &&
            oauthCredentialCreateRequest == other.oauthCredentialCreateRequest &&
            passkeyCredentialCreateRequest == other.passkeyCredentialCreateRequest
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailOtpCredentialCreateRequest,
            oauthCredentialCreateRequest,
            passkeyCredentialCreateRequest,
        )

    override fun toString(): String =
        when {
            emailOtpCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{emailOtpCredentialCreateRequest=$emailOtpCredentialCreateRequest}"
            oauthCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{oauthCredentialCreateRequest=$oauthCredentialCreateRequest}"
            passkeyCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{passkeyCredentialCreateRequest=$passkeyCredentialCreateRequest}"
            _json != null -> "AuthCredentialCreateRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
        }

    companion object {

        fun ofEmailOtpCredentialCreateRequest(
            emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                emailOtpCredentialCreateRequest = emailOtpCredentialCreateRequest
            )

        fun ofOAuthCredentialCreateRequest(
            oauthCredentialCreateRequest: OAuthCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                oauthCredentialCreateRequest = oauthCredentialCreateRequest
            )

        fun ofPasskeyCredentialCreateRequest(
            passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                passkeyCredentialCreateRequest = passkeyCredentialCreateRequest
            )
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialCreateRequestOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitEmailOtpCredentialCreateRequest(
            emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
        ): T

        fun visitOAuthCredentialCreateRequest(
            oauthCredentialCreateRequest: OAuthCredentialCreateRequest
        ): T

        fun visitPasskeyCredentialCreateRequest(
            passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
        ): T

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

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialCreateRequest>())
                            ?.let {
                                AuthCredentialCreateRequestOneOf(
                                    emailOtpCredentialCreateRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<OAuthCredentialCreateRequest>())?.let {
                            AuthCredentialCreateRequestOneOf(
                                oauthCredentialCreateRequest = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<PasskeyCredentialCreateRequest>())
                            ?.let {
                                AuthCredentialCreateRequestOneOf(
                                    passkeyCredentialCreateRequest = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> AuthCredentialCreateRequestOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
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
                value.emailOtpCredentialCreateRequest != null ->
                    generator.writeObject(value.emailOtpCredentialCreateRequest)
                value.oauthCredentialCreateRequest != null ->
                    generator.writeObject(value.oauthCredentialCreateRequest)
                value.passkeyCredentialCreateRequest != null ->
                    generator.writeObject(value.passkeyCredentialCreateRequest)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
            }
        }
    }
}
