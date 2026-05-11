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

@JsonDeserialize(using = AuthCredentialVerifyRequestOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialVerifyRequestOneOf.Serializer::class)
class AuthCredentialVerifyRequestOneOf
private constructor(
    private val emailOtpCredentialVerifyRequestFields: EmailOtpCredentialVerifyRequestFields? =
        null,
    private val oauthCredentialVerifyRequestFields: OAuthCredentialVerifyRequestFields? = null,
    private val passkeyCredentialVerifyRequestFields: PasskeyCredentialVerifyRequestFields? = null,
    private val _json: JsonValue? = null,
) {

    fun emailOtpCredentialVerifyRequestFields(): EmailOtpCredentialVerifyRequestFields? =
        emailOtpCredentialVerifyRequestFields

    fun oauthCredentialVerifyRequestFields(): OAuthCredentialVerifyRequestFields? =
        oauthCredentialVerifyRequestFields

    fun passkeyCredentialVerifyRequestFields(): PasskeyCredentialVerifyRequestFields? =
        passkeyCredentialVerifyRequestFields

    fun isEmailOtpCredentialVerifyRequestFields(): Boolean =
        emailOtpCredentialVerifyRequestFields != null

    fun isOAuthCredentialVerifyRequestFields(): Boolean = oauthCredentialVerifyRequestFields != null

    fun isPasskeyCredentialVerifyRequestFields(): Boolean =
        passkeyCredentialVerifyRequestFields != null

    fun asEmailOtpCredentialVerifyRequestFields(): EmailOtpCredentialVerifyRequestFields =
        emailOtpCredentialVerifyRequestFields.getOrThrow("emailOtpCredentialVerifyRequestFields")

    fun asOAuthCredentialVerifyRequestFields(): OAuthCredentialVerifyRequestFields =
        oauthCredentialVerifyRequestFields.getOrThrow("oauthCredentialVerifyRequestFields")

    fun asPasskeyCredentialVerifyRequestFields(): PasskeyCredentialVerifyRequestFields =
        passkeyCredentialVerifyRequestFields.getOrThrow("passkeyCredentialVerifyRequestFields")

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
     *     override fun visitEmailOtpCredentialVerifyRequestFields(emailOtpCredentialVerifyRequestFields: EmailOtpCredentialVerifyRequestFields): String? = emailOtpCredentialVerifyRequestFields.toString()
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
            emailOtpCredentialVerifyRequestFields != null ->
                visitor.visitEmailOtpCredentialVerifyRequestFields(
                    emailOtpCredentialVerifyRequestFields
                )
            oauthCredentialVerifyRequestFields != null ->
                visitor.visitOAuthCredentialVerifyRequestFields(oauthCredentialVerifyRequestFields)
            passkeyCredentialVerifyRequestFields != null ->
                visitor.visitPasskeyCredentialVerifyRequestFields(
                    passkeyCredentialVerifyRequestFields
                )
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
                override fun visitEmailOtpCredentialVerifyRequestFields(
                    emailOtpCredentialVerifyRequestFields: EmailOtpCredentialVerifyRequestFields
                ) {
                    emailOtpCredentialVerifyRequestFields.validate()
                }

                override fun visitOAuthCredentialVerifyRequestFields(
                    oauthCredentialVerifyRequestFields: OAuthCredentialVerifyRequestFields
                ) {
                    oauthCredentialVerifyRequestFields.validate()
                }

                override fun visitPasskeyCredentialVerifyRequestFields(
                    passkeyCredentialVerifyRequestFields: PasskeyCredentialVerifyRequestFields
                ) {
                    passkeyCredentialVerifyRequestFields.validate()
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
                override fun visitEmailOtpCredentialVerifyRequestFields(
                    emailOtpCredentialVerifyRequestFields: EmailOtpCredentialVerifyRequestFields
                ) = emailOtpCredentialVerifyRequestFields.validity()

                override fun visitOAuthCredentialVerifyRequestFields(
                    oauthCredentialVerifyRequestFields: OAuthCredentialVerifyRequestFields
                ) = oauthCredentialVerifyRequestFields.validity()

                override fun visitPasskeyCredentialVerifyRequestFields(
                    passkeyCredentialVerifyRequestFields: PasskeyCredentialVerifyRequestFields
                ) = passkeyCredentialVerifyRequestFields.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCredentialVerifyRequestOneOf &&
            emailOtpCredentialVerifyRequestFields == other.emailOtpCredentialVerifyRequestFields &&
            oauthCredentialVerifyRequestFields == other.oauthCredentialVerifyRequestFields &&
            passkeyCredentialVerifyRequestFields == other.passkeyCredentialVerifyRequestFields
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailOtpCredentialVerifyRequestFields,
            oauthCredentialVerifyRequestFields,
            passkeyCredentialVerifyRequestFields,
        )

    override fun toString(): String =
        when {
            emailOtpCredentialVerifyRequestFields != null ->
                "AuthCredentialVerifyRequestOneOf{emailOtpCredentialVerifyRequestFields=$emailOtpCredentialVerifyRequestFields}"
            oauthCredentialVerifyRequestFields != null ->
                "AuthCredentialVerifyRequestOneOf{oauthCredentialVerifyRequestFields=$oauthCredentialVerifyRequestFields}"
            passkeyCredentialVerifyRequestFields != null ->
                "AuthCredentialVerifyRequestOneOf{passkeyCredentialVerifyRequestFields=$passkeyCredentialVerifyRequestFields}"
            _json != null -> "AuthCredentialVerifyRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialVerifyRequestOneOf")
        }

    companion object {

        fun ofEmailOtpCredentialVerifyRequestFields(
            emailOtpCredentialVerifyRequestFields: EmailOtpCredentialVerifyRequestFields
        ) =
            AuthCredentialVerifyRequestOneOf(
                emailOtpCredentialVerifyRequestFields = emailOtpCredentialVerifyRequestFields
            )

        fun ofOAuthCredentialVerifyRequestFields(
            oauthCredentialVerifyRequestFields: OAuthCredentialVerifyRequestFields
        ) =
            AuthCredentialVerifyRequestOneOf(
                oauthCredentialVerifyRequestFields = oauthCredentialVerifyRequestFields
            )

        fun ofPasskeyCredentialVerifyRequestFields(
            passkeyCredentialVerifyRequestFields: PasskeyCredentialVerifyRequestFields
        ) =
            AuthCredentialVerifyRequestOneOf(
                passkeyCredentialVerifyRequestFields = passkeyCredentialVerifyRequestFields
            )
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialVerifyRequestOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitEmailOtpCredentialVerifyRequestFields(
            emailOtpCredentialVerifyRequestFields: EmailOtpCredentialVerifyRequestFields
        ): T

        fun visitOAuthCredentialVerifyRequestFields(
            oauthCredentialVerifyRequestFields: OAuthCredentialVerifyRequestFields
        ): T

        fun visitPasskeyCredentialVerifyRequestFields(
            passkeyCredentialVerifyRequestFields: PasskeyCredentialVerifyRequestFields
        ): T

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

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(
                                node,
                                jacksonTypeRef<EmailOtpCredentialVerifyRequestFields>(),
                            )
                            ?.let {
                                AuthCredentialVerifyRequestOneOf(
                                    emailOtpCredentialVerifyRequestFields = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<OAuthCredentialVerifyRequestFields>())
                            ?.let {
                                AuthCredentialVerifyRequestOneOf(
                                    oauthCredentialVerifyRequestFields = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<PasskeyCredentialVerifyRequestFields>())
                            ?.let {
                                AuthCredentialVerifyRequestOneOf(
                                    passkeyCredentialVerifyRequestFields = it,
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
                0 -> AuthCredentialVerifyRequestOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
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
                value.emailOtpCredentialVerifyRequestFields != null ->
                    generator.writeObject(value.emailOtpCredentialVerifyRequestFields)
                value.oauthCredentialVerifyRequestFields != null ->
                    generator.writeObject(value.oauthCredentialVerifyRequestFields)
                value.passkeyCredentialVerifyRequestFields != null ->
                    generator.writeObject(value.passkeyCredentialVerifyRequestFields)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialVerifyRequestOneOf")
            }
        }
    }
}
