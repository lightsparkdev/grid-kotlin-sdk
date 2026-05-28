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

    fun toOAuthCredentialCreateRequestFields(): OAuthCredentialCreateRequestFields =
        OAuthCredentialCreateRequestFields.builder().oidcToken(oidcToken).type(type).build()

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
     * OIDC ID token issued by the identity provider (e.g. Google, Apple). Grid fetches the issuer's
     * signing key from the `iss` claim's `.well-known` OpenID configuration and verifies the token
     * signature. The token's `iat` claim must be less than 60 seconds before the request timestamp.
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
         * OIDC ID token issued by the identity provider (e.g. Google, Apple). Grid fetches the
         * issuer's signing key from the `iss` claim's `.well-known` OpenID configuration and
         * verifies the token signature. The token's `iat` claim must be less than 60 seconds before
         * the request timestamp.
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
