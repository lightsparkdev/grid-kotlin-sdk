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

/**
 * Discriminated response shape returned from `POST /auth/credentials/{id}/challenge`. For
 * `EMAIL_OTP` credentials the body is a plain `AuthMethod` (wrapped as `AuthMethodResponse` to
 * disambiguate the oneOf). For `PASSKEY` credentials the body is a `PasskeyAuthChallenge` — the
 * passkey auth method fields plus the WebAuthn `credentialId`, Grid-issued `challenge`,
 * `requestId`, and `expiresAt` that drive the subsequent assertion. OAuth credentials do not use
 * the challenge endpoint. Registration responses from `POST /auth/credentials` use the simpler
 * `AuthMethodResponse` shape directly for all three credential types.
 */
@JsonDeserialize(using = AuthCredentialResponseOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialResponseOneOf.Serializer::class)
class AuthCredentialResponseOneOf
private constructor(
    private val methodResponse: AuthMethodResponse? = null,
    private val passkeyAuthChallenge: PasskeyAuthChallenge? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
     * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf` for
     * the `EMAIL_OTP` branch of `POST /auth/credentials/{id}/challenge`. The only difference from
     * `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the oneOf against
     * `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields would
     * ambiguously match both branches.
     */
    fun methodResponse(): AuthMethodResponse? = methodResponse

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
     * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target the
     * passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
     * `expiresAt`. The client signs the challenge with the passkey to produce the assertion
     * submitted to `POST /auth/credentials/{id}/verify`.
     */
    fun passkeyAuthChallenge(): PasskeyAuthChallenge? = passkeyAuthChallenge

    fun isMethodResponse(): Boolean = methodResponse != null

    fun isPasskeyAuthChallenge(): Boolean = passkeyAuthChallenge != null

    /**
     * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
     * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf` for
     * the `EMAIL_OTP` branch of `POST /auth/credentials/{id}/challenge`. The only difference from
     * `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the oneOf against
     * `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields would
     * ambiguously match both branches.
     */
    fun asMethodResponse(): AuthMethodResponse = methodResponse.getOrThrow("methodResponse")

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
     * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target the
     * passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
     * `expiresAt`. The client signs the challenge with the passkey to produce the assertion
     * submitted to `POST /auth/credentials/{id}/verify`.
     */
    fun asPasskeyAuthChallenge(): PasskeyAuthChallenge =
        passkeyAuthChallenge.getOrThrow("passkeyAuthChallenge")

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
     * val result: String? = authCredentialResponseOneOf.accept(object : AuthCredentialResponseOneOf.Visitor<String?> {
     *     override fun visitMethodResponse(methodResponse: AuthMethodResponse): String? = methodResponse.toString()
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
            methodResponse != null -> visitor.visitMethodResponse(methodResponse)
            passkeyAuthChallenge != null -> visitor.visitPasskeyAuthChallenge(passkeyAuthChallenge)
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
    fun validate(): AuthCredentialResponseOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitMethodResponse(methodResponse: AuthMethodResponse) {
                    methodResponse.validate()
                }

                override fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) {
                    passkeyAuthChallenge.validate()
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
                override fun visitMethodResponse(methodResponse: AuthMethodResponse) =
                    methodResponse.validity()

                override fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
                    passkeyAuthChallenge.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCredentialResponseOneOf &&
            methodResponse == other.methodResponse &&
            passkeyAuthChallenge == other.passkeyAuthChallenge
    }

    override fun hashCode(): Int = Objects.hash(methodResponse, passkeyAuthChallenge)

    override fun toString(): String =
        when {
            methodResponse != null -> "AuthCredentialResponseOneOf{methodResponse=$methodResponse}"
            passkeyAuthChallenge != null ->
                "AuthCredentialResponseOneOf{passkeyAuthChallenge=$passkeyAuthChallenge}"
            _json != null -> "AuthCredentialResponseOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialResponseOneOf")
        }

    companion object {

        /**
         * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
         * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf`
         * for the `EMAIL_OTP` branch of `POST /auth/credentials/{id}/challenge`. The only
         * difference from `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the
         * oneOf against `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra
         * fields would ambiguously match both branches.
         */
        fun ofMethodResponse(methodResponse: AuthMethodResponse) =
            AuthCredentialResponseOneOf(methodResponse = methodResponse)

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target
         * the passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
         * `expiresAt`. The client signs the challenge with the passkey to produce the assertion
         * submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun ofPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
            AuthCredentialResponseOneOf(passkeyAuthChallenge = passkeyAuthChallenge)
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialResponseOneOf] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /**
         * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
         * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf`
         * for the `EMAIL_OTP` branch of `POST /auth/credentials/{id}/challenge`. The only
         * difference from `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the
         * oneOf against `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra
         * fields would ambiguously match both branches.
         */
        fun visitMethodResponse(methodResponse: AuthMethodResponse): T

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target
         * the passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
         * `expiresAt`. The client signs the challenge with the passkey to produce the assertion
         * submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge): T

        /**
         * Maps an unknown variant of [AuthCredentialResponseOneOf] to a value of type [T].
         *
         * An instance of [AuthCredentialResponseOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown AuthCredentialResponseOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<AuthCredentialResponseOneOf>(AuthCredentialResponseOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): AuthCredentialResponseOneOf {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AuthMethodResponse>())?.let {
                            AuthCredentialResponseOneOf(methodResponse = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PasskeyAuthChallenge>())?.let {
                            AuthCredentialResponseOneOf(passkeyAuthChallenge = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> AuthCredentialResponseOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<AuthCredentialResponseOneOf>(AuthCredentialResponseOneOf::class) {

        override fun serialize(
            value: AuthCredentialResponseOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.methodResponse != null -> generator.writeObject(value.methodResponse)
                value.passkeyAuthChallenge != null ->
                    generator.writeObject(value.passkeyAuthChallenge)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialResponseOneOf")
            }
        }
    }
}
