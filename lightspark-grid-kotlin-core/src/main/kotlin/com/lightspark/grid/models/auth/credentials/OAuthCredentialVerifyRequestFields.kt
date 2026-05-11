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

class OAuthCredentialVerifyRequestFields
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val clientPublicKey: JsonField<String>,
    private val oidcToken: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("clientPublicKey")
        @ExcludeMissing
        clientPublicKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("oidcToken") @ExcludeMissing oidcToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(clientPublicKey, oidcToken, type, mutableMapOf())

    /**
     * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04 prefix
     * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The matching
     * private key must remain on the client. Grid encrypts the session signing key returned in the
     * response to this public key. The key is ephemeral and one-time-use per verification request.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientPublicKey(): String = clientPublicKey.getRequired("clientPublicKey")

    /**
     * OIDC ID token issued by the identity provider. For reauthentication after a prior session
     * expired, supply a fresh token — the token's `iat` claim must be less than 60 seconds before
     * the request timestamp. Grid fetches the issuer's signing key from the `iss` claim's
     * `.well-known` OpenID configuration and verifies the token signature.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun oidcToken(): String = oidcToken.getRequired("oidcToken")

    /**
     * Discriminator value identifying this as an OAuth verification.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [clientPublicKey].
     *
     * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientPublicKey")
    @ExcludeMissing
    fun _clientPublicKey(): JsonField<String> = clientPublicKey

    /**
     * Returns the raw JSON value of [oidcToken].
     *
     * Unlike [oidcToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oidcToken") @ExcludeMissing fun _oidcToken(): JsonField<String> = oidcToken

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
         * [OAuthCredentialVerifyRequestFields].
         *
         * The following fields are required:
         * ```kotlin
         * .clientPublicKey()
         * .oidcToken()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OAuthCredentialVerifyRequestFields]. */
    class Builder internal constructor() {

        private var clientPublicKey: JsonField<String>? = null
        private var oidcToken: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oauthCredentialVerifyRequestFields: OAuthCredentialVerifyRequestFields) =
            apply {
                clientPublicKey = oauthCredentialVerifyRequestFields.clientPublicKey
                oidcToken = oauthCredentialVerifyRequestFields.oidcToken
                type = oauthCredentialVerifyRequestFields.type
                additionalProperties =
                    oauthCredentialVerifyRequestFields.additionalProperties.toMutableMap()
            }

        /**
         * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04 prefix
         * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The
         * matching private key must remain on the client. Grid encrypts the session signing key
         * returned in the response to this public key. The key is ephemeral and one-time-use per
         * verification request.
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

        /**
         * OIDC ID token issued by the identity provider. For reauthentication after a prior session
         * expired, supply a fresh token — the token's `iat` claim must be less than 60 seconds
         * before the request timestamp. Grid fetches the issuer's signing key from the `iss`
         * claim's `.well-known` OpenID configuration and verifies the token signature.
         */
        fun oidcToken(oidcToken: String) = oidcToken(JsonField.of(oidcToken))

        /**
         * Sets [Builder.oidcToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.oidcToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun oidcToken(oidcToken: JsonField<String>) = apply { this.oidcToken = oidcToken }

        /** Discriminator value identifying this as an OAuth verification. */
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
         * Returns an immutable instance of [OAuthCredentialVerifyRequestFields].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .clientPublicKey()
         * .oidcToken()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthCredentialVerifyRequestFields =
            OAuthCredentialVerifyRequestFields(
                checkRequired("clientPublicKey", clientPublicKey),
                checkRequired("oidcToken", oidcToken),
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
    fun validate(): OAuthCredentialVerifyRequestFields = apply {
        if (validated) {
            return@apply
        }

        clientPublicKey()
        oidcToken()
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
        (if (clientPublicKey.asKnown() == null) 0 else 1) +
            (if (oidcToken.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    /** Discriminator value identifying this as an OAuth verification. */
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

            val OAUTH = of("OAUTH")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OAUTH
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
            OAUTH,
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
                OAUTH -> Value.OAUTH
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
                OAUTH -> Known.OAUTH
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

        return other is OAuthCredentialVerifyRequestFields &&
            clientPublicKey == other.clientPublicKey &&
            oidcToken == other.oidcToken &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(clientPublicKey, oidcToken, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthCredentialVerifyRequestFields{clientPublicKey=$clientPublicKey, oidcToken=$oidcToken, type=$type, additionalProperties=$additionalProperties}"
}
