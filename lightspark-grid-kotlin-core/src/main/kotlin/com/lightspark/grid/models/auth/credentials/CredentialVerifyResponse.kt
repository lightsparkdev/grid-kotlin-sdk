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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * An authentication session on an Embedded Wallet internal account. Returned from `GET
 * /auth/sessions` (list) and `POST /auth/credentials/{id}/verify` (on credential verification).
 * Only the verify response includes `encryptedSessionSigningKey` — it is delivered exactly once at
 * the moment the session is issued and is never returned by the list endpoint.
 */
class CredentialVerifyResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val nickname: JsonField<String>,
    private val type: JsonField<Type>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val encryptedSessionSigningKey: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("encryptedSessionSigningKey")
        @ExcludeMissing
        encryptedSessionSigningKey: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        createdAt,
        expiresAt,
        nickname,
        type,
        updatedAt,
        encryptedSessionSigningKey,
        mutableMapOf(),
    )

    /**
     * System-generated unique identifier for the session. Pass this value to `DELETE
     * /auth/sessions/{id}` to revoke the session before `expiresAt`. Overrides the `id` inherited
     * from `AuthMethod` so this response identifies the session rather than the authenticating
     * credential.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * Identifier of the internal account that this credential authenticates.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("accountId")

    /**
     * Creation timestamp.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Timestamp after which the session is no longer valid and the `encryptedSessionSigningKey`
     * must not be used to sign further requests.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * Human-readable identifier for this credential. For EMAIL_OTP credentials this is the email
     * address; for OAUTH credentials it is typically the email claim from the OIDC token; for
     * PASSKEY credentials it is the nickname provided at registration time.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nickname(): String = nickname.getRequired("nickname")

    /**
     * The type of authentication credential.
     * - `OAUTH`: OpenID Connect (OIDC) token issued by an identity provider such as Google or
     *   Apple.
     * - `EMAIL_OTP`: A one-time password delivered to the user's email address.
     * - `PASSKEY`: A WebAuthn passkey bound to the user's device.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Last update timestamp.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * HPKE-encrypted session signing key, sealed to the `clientPublicKey` supplied on the verify
     * request. Encoded as a base58check string: the decoded payload is a 33-byte compressed P-256
     * encapsulated public key followed by AES-256-GCM ciphertext. The client decrypts this key with
     * its private key and uses it to sign subsequent Embedded Wallet requests until `expiresAt`.
     *
     * Only returned from `POST /auth/credentials/{id}/verify` (where the session is first issued).
     * Omitted from responses that simply surface existing sessions (e.g. `GET /auth/sessions`) —
     * Grid does not retain the plaintext key after the client has decrypted it.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun encryptedSessionSigningKey(): String? =
        encryptedSessionSigningKey.getNullable("encryptedSessionSigningKey")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [nickname].
     *
     * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [encryptedSessionSigningKey].
     *
     * Unlike [encryptedSessionSigningKey], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("encryptedSessionSigningKey")
    @ExcludeMissing
    fun _encryptedSessionSigningKey(): JsonField<String> = encryptedSessionSigningKey

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
         * Returns a mutable builder for constructing an instance of [CredentialVerifyResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .createdAt()
         * .expiresAt()
         * .nickname()
         * .type()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialVerifyResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var nickname: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var encryptedSessionSigningKey: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(credentialVerifyResponse: CredentialVerifyResponse) = apply {
            id = credentialVerifyResponse.id
            accountId = credentialVerifyResponse.accountId
            createdAt = credentialVerifyResponse.createdAt
            expiresAt = credentialVerifyResponse.expiresAt
            nickname = credentialVerifyResponse.nickname
            type = credentialVerifyResponse.type
            updatedAt = credentialVerifyResponse.updatedAt
            encryptedSessionSigningKey = credentialVerifyResponse.encryptedSessionSigningKey
            additionalProperties = credentialVerifyResponse.additionalProperties.toMutableMap()
        }

        /**
         * System-generated unique identifier for the session. Pass this value to `DELETE
         * /auth/sessions/{id}` to revoke the session before `expiresAt`. Overrides the `id`
         * inherited from `AuthMethod` so this response identifies the session rather than the
         * authenticating credential.
         */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Identifier of the internal account that this credential authenticates. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** Creation timestamp. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Timestamp after which the session is no longer valid and the `encryptedSessionSigningKey`
         * must not be used to sign further requests.
         */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Human-readable identifier for this credential. For EMAIL_OTP credentials this is the
         * email address; for OAUTH credentials it is typically the email claim from the OIDC token;
         * for PASSKEY credentials it is the nickname provided at registration time.
         */
        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /**
         * The type of authentication credential.
         * - `OAUTH`: OpenID Connect (OIDC) token issued by an identity provider such as Google or
         *   Apple.
         * - `EMAIL_OTP`: A one-time password delivered to the user's email address.
         * - `PASSKEY`: A WebAuthn passkey bound to the user's device.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Last update timestamp. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * HPKE-encrypted session signing key, sealed to the `clientPublicKey` supplied on the
         * verify request. Encoded as a base58check string: the decoded payload is a 33-byte
         * compressed P-256 encapsulated public key followed by AES-256-GCM ciphertext. The client
         * decrypts this key with its private key and uses it to sign subsequent Embedded Wallet
         * requests until `expiresAt`.
         *
         * Only returned from `POST /auth/credentials/{id}/verify` (where the session is first
         * issued). Omitted from responses that simply surface existing sessions (e.g. `GET
         * /auth/sessions`) — Grid does not retain the plaintext key after the client has decrypted
         * it.
         */
        fun encryptedSessionSigningKey(encryptedSessionSigningKey: String) =
            encryptedSessionSigningKey(JsonField.of(encryptedSessionSigningKey))

        /**
         * Sets [Builder.encryptedSessionSigningKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedSessionSigningKey] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun encryptedSessionSigningKey(encryptedSessionSigningKey: JsonField<String>) = apply {
            this.encryptedSessionSigningKey = encryptedSessionSigningKey
        }

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
         * Returns an immutable instance of [CredentialVerifyResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .createdAt()
         * .expiresAt()
         * .nickname()
         * .type()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialVerifyResponse =
            CredentialVerifyResponse(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("nickname", nickname),
                checkRequired("type", type),
                checkRequired("updatedAt", updatedAt),
                encryptedSessionSigningKey,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CredentialVerifyResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        createdAt()
        expiresAt()
        nickname()
        type().validate()
        updatedAt()
        encryptedSessionSigningKey()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (accountId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (nickname.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (encryptedSessionSigningKey.asKnown() == null) 0 else 1)

    /**
     * The type of authentication credential.
     * - `OAUTH`: OpenID Connect (OIDC) token issued by an identity provider such as Google or
     *   Apple.
     * - `EMAIL_OTP`: A one-time password delivered to the user's email address.
     * - `PASSKEY`: A WebAuthn passkey bound to the user's device.
     */
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

            val EMAIL_OTP = of("EMAIL_OTP")

            val PASSKEY = of("PASSKEY")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OAUTH,
            EMAIL_OTP,
            PASSKEY,
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
            EMAIL_OTP,
            PASSKEY,
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
                EMAIL_OTP -> Value.EMAIL_OTP
                PASSKEY -> Value.PASSKEY
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
                EMAIL_OTP -> Known.EMAIL_OTP
                PASSKEY -> Known.PASSKEY
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

        return other is CredentialVerifyResponse &&
            id == other.id &&
            accountId == other.accountId &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            nickname == other.nickname &&
            type == other.type &&
            updatedAt == other.updatedAt &&
            encryptedSessionSigningKey == other.encryptedSessionSigningKey &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            createdAt,
            expiresAt,
            nickname,
            type,
            updatedAt,
            encryptedSessionSigningKey,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CredentialVerifyResponse{id=$id, accountId=$accountId, createdAt=$createdAt, expiresAt=$expiresAt, nickname=$nickname, type=$type, updatedAt=$updatedAt, encryptedSessionSigningKey=$encryptedSessionSigningKey, additionalProperties=$additionalProperties}"
}
