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

class OAuthCredentialCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val type: JsonValue,
    private val oidcToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("oidcToken") @ExcludeMissing oidcToken: JsonField<String> = JsonMissing.of(),
    ) : this(accountId, type, oidcToken, mutableMapOf())

    fun toAuthCredentialCreateRequest(): AuthCredentialCreateRequest =
        AuthCredentialCreateRequest.builder().accountId(accountId).type(type).build()

    /**
     * Identifier of the internal account that this credential will authenticate.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("accountId")

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = oauthCredentialCreateRequest.type().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * OIDC ID token issued by the identity provider (e.g. Google, Apple). The token's `iss`, `aud`,
     * and `sub` claims define the OAuth identity registered to this credential. In production, the
     * provider signature is verified against the issuer's JWKS. In sandbox, the token must still be
     * JWT-shaped with supported `iss`, non-empty `aud` and `sub`, numeric `iat` and `exp`, and
     * `iat` less than 60 seconds before the request timestamp, but the signature segment may be a
     * dummy value.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun oidcToken(): String = oidcToken.getRequired("oidcToken")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [oidcToken].
     *
     * Unlike [oidcToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("oidcToken") @ExcludeMissing fun _oidcToken(): JsonField<String> = oidcToken

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
         * Returns a mutable builder for constructing an instance of [OAuthCredentialCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .type()
         * .oidcToken()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OAuthCredentialCreateRequest]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var type: JsonValue? = null
        private var oidcToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oauthCredentialCreateRequest: OAuthCredentialCreateRequest) = apply {
            accountId = oauthCredentialCreateRequest.accountId
            type = oauthCredentialCreateRequest.type
            oidcToken = oauthCredentialCreateRequest.oidcToken
            additionalProperties = oauthCredentialCreateRequest.additionalProperties.toMutableMap()
        }

        /** Identifier of the internal account that this credential will authenticate. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun type(type: JsonValue) = apply { this.type = type }

        /**
         * OIDC ID token issued by the identity provider (e.g. Google, Apple). The token's `iss`,
         * `aud`, and `sub` claims define the OAuth identity registered to this credential. In
         * production, the provider signature is verified against the issuer's JWKS. In sandbox, the
         * token must still be JWT-shaped with supported `iss`, non-empty `aud` and `sub`, numeric
         * `iat` and `exp`, and `iat` less than 60 seconds before the request timestamp, but the
         * signature segment may be a dummy value.
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
         * Returns an immutable instance of [OAuthCredentialCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .type()
         * .oidcToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthCredentialCreateRequest =
            OAuthCredentialCreateRequest(
                checkRequired("accountId", accountId),
                checkRequired("type", type),
                checkRequired("oidcToken", oidcToken),
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
    fun validate(): OAuthCredentialCreateRequest = apply {
        if (validated) {
            return@apply
        }

        accountId()
        oidcToken()
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
        (if (accountId.asKnown() == null) 0 else 1) + (if (oidcToken.asKnown() == null) 0 else 1)

    /** Discriminator value identifying this as an OAuth credential. */
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

        return other is OAuthCredentialCreateRequest &&
            accountId == other.accountId &&
            type == other.type &&
            oidcToken == other.oidcToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountId, type, oidcToken, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthCredentialCreateRequest{accountId=$accountId, type=$type, oidcToken=$oidcToken, additionalProperties=$additionalProperties}"
}
