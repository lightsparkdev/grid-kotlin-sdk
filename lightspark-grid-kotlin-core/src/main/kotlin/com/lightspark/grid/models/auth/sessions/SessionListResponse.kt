// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.auth.credentials.AuthMethod
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class SessionListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<List<Data>> = JsonMissing.of()
    ) : this(data, mutableMapOf())

    /**
     * List of active authentication sessions for the internal account.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<Data> = data.getRequired("data")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

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
         * Returns a mutable builder for constructing an instance of [SessionListResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SessionListResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sessionListResponse: SessionListResponse) = apply {
            data = sessionListResponse.data.map { it.toMutableList() }
            additionalProperties = sessionListResponse.additionalProperties.toMutableMap()
        }

        /** List of active authentication sessions for the internal account. */
        fun data(data: List<Data>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed `List<Data>` value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [Data] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
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
         * Returns an immutable instance of [SessionListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionListResponse =
            SessionListResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionListResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
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
    internal fun validity(): Int = (data.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    /**
     * An authentication session on an Embedded Wallet internal account. Returned from `GET
     * /auth/sessions` (list) and `POST /auth/credentials/{id}/verify` (on credential verification).
     * Only the verify response includes `encryptedSessionSigningKey` — it is delivered exactly once
     * at the moment the session is issued and is never returned by the list endpoint.
     */
    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val nickname: JsonField<String>,
        private val type: JsonField<AuthMethod.Type>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val encryptedSessionSigningKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("nickname")
            @ExcludeMissing
            nickname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            type: JsonField<AuthMethod.Type> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("encryptedSessionSigningKey")
            @ExcludeMissing
            encryptedSessionSigningKey: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            accountId,
            createdAt,
            nickname,
            type,
            updatedAt,
            expiresAt,
            encryptedSessionSigningKey,
            mutableMapOf(),
        )

        fun toAuthMethod(): AuthMethod =
            AuthMethod.builder()
                .id(id)
                .accountId(accountId)
                .createdAt(createdAt)
                .nickname(nickname)
                .type(type)
                .updatedAt(updatedAt)
                .build()

        /**
         * System-generated unique identifier for the authentication credential.
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
         * Human-readable identifier for this credential. For EMAIL_OTP credentials this is the
         * email address; for OAUTH credentials it is typically the email claim from the OIDC token;
         * for PASSKEY credentials it is the nickname provided at registration time.
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
        fun type(): AuthMethod.Type = type.getRequired("type")

        /**
         * Last update timestamp.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

        /**
         * Timestamp after which the session is no longer valid and the `encryptedSessionSigningKey`
         * must not be used to sign further requests.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

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
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AuthMethod.Type> = type

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiresAt")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

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
             * Returns a mutable builder for constructing an instance of [Data].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .accountId()
             * .createdAt()
             * .nickname()
             * .type()
             * .updatedAt()
             * .expiresAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var nickname: JsonField<String>? = null
            private var type: JsonField<AuthMethod.Type>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var encryptedSessionSigningKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                accountId = data.accountId
                createdAt = data.createdAt
                nickname = data.nickname
                type = data.type
                updatedAt = data.updatedAt
                expiresAt = data.expiresAt
                encryptedSessionSigningKey = data.encryptedSessionSigningKey
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** System-generated unique identifier for the authentication credential. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Identifier of the internal account that this credential authenticates. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Human-readable identifier for this credential. For EMAIL_OTP credentials this is the
             * email address; for OAUTH credentials it is typically the email claim from the OIDC
             * token; for PASSKEY credentials it is the nickname provided at registration time.
             */
            fun nickname(nickname: String) = nickname(JsonField.of(nickname))

            /**
             * Sets [Builder.nickname] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nickname] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

            /**
             * The type of authentication credential.
             * - `OAUTH`: OpenID Connect (OIDC) token issued by an identity provider such as Google
             *   or Apple.
             * - `EMAIL_OTP`: A one-time password delivered to the user's email address.
             * - `PASSKEY`: A WebAuthn passkey bound to the user's device.
             */
            fun type(type: AuthMethod.Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [AuthMethod.Type] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun type(type: JsonField<AuthMethod.Type>) = apply { this.type = type }

            /** Last update timestamp. */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Timestamp after which the session is no longer valid and the
             * `encryptedSessionSigningKey` must not be used to sign further requests.
             */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * HPKE-encrypted session signing key, sealed to the `clientPublicKey` supplied on the
             * verify request. Encoded as a base58check string: the decoded payload is a 33-byte
             * compressed P-256 encapsulated public key followed by AES-256-GCM ciphertext. The
             * client decrypts this key with its private key and uses it to sign subsequent Embedded
             * Wallet requests until `expiresAt`.
             *
             * Only returned from `POST /auth/credentials/{id}/verify` (where the session is first
             * issued). Omitted from responses that simply surface existing sessions (e.g. `GET
             * /auth/sessions`) — Grid does not retain the plaintext key after the client has
             * decrypted it.
             */
            fun encryptedSessionSigningKey(encryptedSessionSigningKey: String) =
                encryptedSessionSigningKey(JsonField.of(encryptedSessionSigningKey))

            /**
             * Sets [Builder.encryptedSessionSigningKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.encryptedSessionSigningKey] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .accountId()
             * .createdAt()
             * .nickname()
             * .type()
             * .updatedAt()
             * .expiresAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("nickname", nickname),
                    checkRequired("type", type),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("expiresAt", expiresAt),
                    encryptedSessionSigningKey,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            accountId()
            createdAt()
            nickname()
            type().validate()
            updatedAt()
            expiresAt()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (id.asKnown() == null) 0 else 1) +
                (if (accountId.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (nickname.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (encryptedSessionSigningKey.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                accountId == other.accountId &&
                createdAt == other.createdAt &&
                nickname == other.nickname &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                expiresAt == other.expiresAt &&
                encryptedSessionSigningKey == other.encryptedSessionSigningKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountId,
                createdAt,
                nickname,
                type,
                updatedAt,
                expiresAt,
                encryptedSessionSigningKey,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, accountId=$accountId, createdAt=$createdAt, nickname=$nickname, type=$type, updatedAt=$updatedAt, expiresAt=$expiresAt, encryptedSessionSigningKey=$encryptedSessionSigningKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionListResponse &&
            data == other.data &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionListResponse{data=$data, additionalProperties=$additionalProperties}"
}
