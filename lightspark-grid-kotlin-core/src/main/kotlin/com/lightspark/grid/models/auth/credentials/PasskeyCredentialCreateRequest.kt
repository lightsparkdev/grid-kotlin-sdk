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

class PasskeyCredentialCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val type: JsonValue,
    private val attestation: JsonField<PasskeyAttestation>,
    private val challenge: JsonField<String>,
    private val nickname: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("attestation")
        @ExcludeMissing
        attestation: JsonField<PasskeyAttestation> = JsonMissing.of(),
        @JsonProperty("challenge") @ExcludeMissing challenge: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
    ) : this(accountId, type, attestation, challenge, nickname, mutableMapOf())

    fun toAuthCredentialCreateRequest(): AuthCredentialCreateRequest =
        AuthCredentialCreateRequest.builder().accountId(accountId).type(type).build()

    fun toPasskeyCredentialCreateRequestFields(): PasskeyCredentialCreateRequestFields =
        PasskeyCredentialCreateRequestFields.builder()
            .attestation(attestation)
            .challenge(challenge)
            .nickname(nickname)
            .type(type)
            .build()

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
     * val myObject: MyClass = passkeyCredentialCreateRequest.type().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attestation(): PasskeyAttestation = attestation.getRequired("attestation")

    /**
     * Base64url-encoded WebAuthn challenge issued by the platform backend and passed to the client
     * before `navigator.credentials.create()`. Grid verifies it matches the challenge embedded in
     * the attestation's `clientDataJson`, binding the attestation to this registration. Must be
     * single-use.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challenge(): String = challenge.getRequired("challenge")

    /**
     * Human-readable identifier for the passkey, chosen by the user at registration time (e.g.
     * "iPhone Face-ID", "YubiKey 5C"). Leading and trailing whitespace is ignored. Must be 1-100
     * characters and may contain Unicode letters, numbers, spaces, and the following separators:
     * period, underscore, hyphen, apostrophe, and parentheses. Shown back on AuthMethod responses
     * and in credential listings.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nickname(): String = nickname.getRequired("nickname")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [attestation].
     *
     * Unlike [attestation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attestation")
    @ExcludeMissing
    fun _attestation(): JsonField<PasskeyAttestation> = attestation

    /**
     * Returns the raw JSON value of [challenge].
     *
     * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenge") @ExcludeMissing fun _challenge(): JsonField<String> = challenge

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

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
         * [PasskeyCredentialCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .type()
         * .attestation()
         * .challenge()
         * .nickname()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PasskeyCredentialCreateRequest]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String>? = null
        private var type: JsonValue? = null
        private var attestation: JsonField<PasskeyAttestation>? = null
        private var challenge: JsonField<String>? = null
        private var nickname: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest) = apply {
            accountId = passkeyCredentialCreateRequest.accountId
            type = passkeyCredentialCreateRequest.type
            attestation = passkeyCredentialCreateRequest.attestation
            challenge = passkeyCredentialCreateRequest.challenge
            nickname = passkeyCredentialCreateRequest.nickname
            additionalProperties =
                passkeyCredentialCreateRequest.additionalProperties.toMutableMap()
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

        fun attestation(attestation: PasskeyAttestation) = attestation(JsonField.of(attestation))

        /**
         * Sets [Builder.attestation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attestation] with a well-typed [PasskeyAttestation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attestation(attestation: JsonField<PasskeyAttestation>) = apply {
            this.attestation = attestation
        }

        /**
         * Base64url-encoded WebAuthn challenge issued by the platform backend and passed to the
         * client before `navigator.credentials.create()`. Grid verifies it matches the challenge
         * embedded in the attestation's `clientDataJson`, binding the attestation to this
         * registration. Must be single-use.
         */
        fun challenge(challenge: String) = challenge(JsonField.of(challenge))

        /**
         * Sets [Builder.challenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challenge] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun challenge(challenge: JsonField<String>) = apply { this.challenge = challenge }

        /**
         * Human-readable identifier for the passkey, chosen by the user at registration time (e.g.
         * "iPhone Face-ID", "YubiKey 5C"). Leading and trailing whitespace is ignored. Must be
         * 1-100 characters and may contain Unicode letters, numbers, spaces, and the following
         * separators: period, underscore, hyphen, apostrophe, and parentheses. Shown back on
         * AuthMethod responses and in credential listings.
         */
        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

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
         * Returns an immutable instance of [PasskeyCredentialCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .type()
         * .attestation()
         * .challenge()
         * .nickname()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PasskeyCredentialCreateRequest =
            PasskeyCredentialCreateRequest(
                checkRequired("accountId", accountId),
                checkRequired("type", type),
                checkRequired("attestation", attestation),
                checkRequired("challenge", challenge),
                checkRequired("nickname", nickname),
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
    fun validate(): PasskeyCredentialCreateRequest = apply {
        if (validated) {
            return@apply
        }

        accountId()
        attestation().validate()
        challenge()
        nickname()
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
        (if (accountId.asKnown() == null) 0 else 1) +
            (attestation.asKnown()?.validity() ?: 0) +
            (if (challenge.asKnown() == null) 0 else 1) +
            (if (nickname.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PasskeyCredentialCreateRequest &&
            accountId == other.accountId &&
            type == other.type &&
            attestation == other.attestation &&
            challenge == other.challenge &&
            nickname == other.nickname &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(accountId, type, attestation, challenge, nickname, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PasskeyCredentialCreateRequest{accountId=$accountId, type=$type, attestation=$attestation, challenge=$challenge, nickname=$nickname, additionalProperties=$additionalProperties}"
}
