// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * Discriminated response shape returned from `POST /auth/credentials/{id}/challenge`. For
 * `EMAIL_OTP` and `OAUTH` credentials the body is a plain `AuthMethod` (wrapped as
 * `AuthMethodResponse` to disambiguate the oneOf). For `PASSKEY` credentials the body is a
 * `PasskeyAuthChallenge` — the base `AuthMethod` fields plus the Grid-issued `challenge`,
 * `requestId`, and `expiresAt` that drive the subsequent assertion. Registration responses from
 * `POST /auth/credentials` use the simpler `AuthMethodResponse` shape directly for all three
 * credential types.
 */
@JsonDeserialize(using = CredentialResendChallengeResponse.Deserializer::class)
@JsonSerialize(using = CredentialResendChallengeResponse.Serializer::class)
class CredentialResendChallengeResponse
private constructor(
    private val authMethod: AuthMethod? = null,
    private val passkeyAuthChallenge: PasskeyAuthChallenge? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
     * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf` for
     * the `EMAIL_OTP` and `OAUTH` branches of `POST /auth/credentials/{id}/challenge`. The only
     * difference from `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the oneOf
     * against `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields
     * would ambiguously match both branches.
     */
    fun authMethod(): AuthMethod? = authMethod

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST /auth/credentials`
     * (first-authentication case) and `POST /auth/credentials/{id}/challenge` (reauthentication
     * case). Adds a Grid-issued `challenge`, the corresponding `requestId`, and the challenge's
     * `expiresAt` to the base `AuthMethod` fields. The client signs the challenge with the passkey
     * to produce the assertion submitted to `POST /auth/credentials/{id}/verify`.
     */
    fun passkeyAuthChallenge(): PasskeyAuthChallenge? = passkeyAuthChallenge

    fun isAuthMethod(): Boolean = authMethod != null

    fun isPasskeyAuthChallenge(): Boolean = passkeyAuthChallenge != null

    /**
     * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
     * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf` for
     * the `EMAIL_OTP` and `OAUTH` branches of `POST /auth/credentials/{id}/challenge`. The only
     * difference from `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the oneOf
     * against `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields
     * would ambiguously match both branches.
     */
    fun asAuthMethod(): AuthMethod = authMethod.getOrThrow("authMethod")

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST /auth/credentials`
     * (first-authentication case) and `POST /auth/credentials/{id}/challenge` (reauthentication
     * case). Adds a Grid-issued `challenge`, the corresponding `requestId`, and the challenge's
     * `expiresAt` to the base `AuthMethod` fields. The client signs the challenge with the passkey
     * to produce the assertion submitted to `POST /auth/credentials/{id}/verify`.
     */
    fun asPasskeyAuthChallenge(): PasskeyAuthChallenge =
        passkeyAuthChallenge.getOrThrow("passkeyAuthChallenge")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            authMethod != null -> visitor.visitAuthMethod(authMethod)
            passkeyAuthChallenge != null -> visitor.visitPasskeyAuthChallenge(passkeyAuthChallenge)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CredentialResendChallengeResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAuthMethod(authMethod: AuthMethod) {
                    authMethod.validate()
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
                override fun visitAuthMethod(authMethod: AuthMethod) = authMethod.validity()

                override fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
                    passkeyAuthChallenge.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialResendChallengeResponse &&
            authMethod == other.authMethod &&
            passkeyAuthChallenge == other.passkeyAuthChallenge
    }

    override fun hashCode(): Int = Objects.hash(authMethod, passkeyAuthChallenge)

    override fun toString(): String =
        when {
            authMethod != null -> "CredentialResendChallengeResponse{authMethod=$authMethod}"
            passkeyAuthChallenge != null ->
                "CredentialResendChallengeResponse{passkeyAuthChallenge=$passkeyAuthChallenge}"
            _json != null -> "CredentialResendChallengeResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CredentialResendChallengeResponse")
        }

    companion object {

        /**
         * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
         * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf`
         * for the `EMAIL_OTP` and `OAUTH` branches of `POST /auth/credentials/{id}/challenge`. The
         * only difference from `AuthMethod` is `unevaluatedProperties: false`, which disambiguates
         * the oneOf against `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with
         * extra fields would ambiguously match both branches.
         */
        fun ofAuthMethod(authMethod: AuthMethod) =
            CredentialResendChallengeResponse(authMethod = authMethod)

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials` (first-authentication case) and `POST
         * /auth/credentials/{id}/challenge` (reauthentication case). Adds a Grid-issued
         * `challenge`, the corresponding `requestId`, and the challenge's `expiresAt` to the base
         * `AuthMethod` fields. The client signs the challenge with the passkey to produce the
         * assertion submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun ofPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
            CredentialResendChallengeResponse(passkeyAuthChallenge = passkeyAuthChallenge)
    }

    /**
     * An interface that defines how to map each variant of [CredentialResendChallengeResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        /**
         * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
         * /auth/credentials` (all three credential types) and inside `AuthCredentialResponseOneOf`
         * for the `EMAIL_OTP` and `OAUTH` branches of `POST /auth/credentials/{id}/challenge`. The
         * only difference from `AuthMethod` is `unevaluatedProperties: false`, which disambiguates
         * the oneOf against `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with
         * extra fields would ambiguously match both branches.
         */
        fun visitAuthMethod(authMethod: AuthMethod): T

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials` (first-authentication case) and `POST
         * /auth/credentials/{id}/challenge` (reauthentication case). Adds a Grid-issued
         * `challenge`, the corresponding `requestId`, and the challenge's `expiresAt` to the base
         * `AuthMethod` fields. The client signs the challenge with the passkey to produce the
         * assertion submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge): T

        /**
         * Maps an unknown variant of [CredentialResendChallengeResponse] to a value of type [T].
         *
         * An instance of [CredentialResendChallengeResponse] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException(
                "Unknown CredentialResendChallengeResponse: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<CredentialResendChallengeResponse>(
            CredentialResendChallengeResponse::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): CredentialResendChallengeResponse {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AuthMethod>())?.let {
                            CredentialResendChallengeResponse(authMethod = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PasskeyAuthChallenge>())?.let {
                            CredentialResendChallengeResponse(
                                passkeyAuthChallenge = it,
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
                0 -> CredentialResendChallengeResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CredentialResendChallengeResponse>(
            CredentialResendChallengeResponse::class
        ) {

        override fun serialize(
            value: CredentialResendChallengeResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.authMethod != null -> generator.writeObject(value.authMethod)
                value.passkeyAuthChallenge != null ->
                    generator.writeObject(value.passkeyAuthChallenge)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CredentialResendChallengeResponse")
            }
        }
    }

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST /auth/credentials`
     * (first-authentication case) and `POST /auth/credentials/{id}/challenge` (reauthentication
     * case). Adds a Grid-issued `challenge`, the corresponding `requestId`, and the challenge's
     * `expiresAt` to the base `AuthMethod` fields. The client signs the challenge with the passkey
     * to produce the assertion submitted to `POST /auth/credentials/{id}/verify`.
     */
    class PasskeyAuthChallenge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val nickname: JsonField<String>,
        private val type: JsonField<AuthMethod.Type>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val challenge: JsonField<String>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val requestId: JsonField<String>,
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
            @JsonProperty("challenge")
            @ExcludeMissing
            challenge: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("requestId")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            accountId,
            createdAt,
            nickname,
            type,
            updatedAt,
            challenge,
            expiresAt,
            requestId,
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
         * Base64url-encoded challenge issued by Grid for the pending passkey authentication. The
         * client passes it into `navigator.credentials.get()` as the WebAuthn challenge; the
         * resulting assertion is submitted to `POST /auth/credentials/{id}/verify`. Single-use; a
         * new challenge is issued on the next call to `POST /auth/credentials/{id}/challenge`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun challenge(): String = challenge.getRequired("challenge")

        /**
         * Timestamp after which the issued challenge is no longer valid. The assertion must reach
         * `POST /auth/credentials/{id}/verify` before this time; otherwise the client must request
         * a fresh challenge via `POST /auth/credentials/{id}/challenge`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

        /**
         * Unique identifier for this pending passkey authentication request. Must be echoed as the
         * `Request-Id` header on the subsequent `POST /auth/credentials/{id}/verify` call so Grid
         * can correlate the assertion with the issued challenge.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestId(): String = requestId.getRequired("requestId")

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
         * Returns the raw JSON value of [challenge].
         *
         * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("challenge") @ExcludeMissing fun _challenge(): JsonField<String> = challenge

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiresAt")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("requestId") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
             * Returns a mutable builder for constructing an instance of [PasskeyAuthChallenge].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .accountId()
             * .createdAt()
             * .nickname()
             * .type()
             * .updatedAt()
             * .challenge()
             * .expiresAt()
             * .requestId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PasskeyAuthChallenge]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var nickname: JsonField<String>? = null
            private var type: JsonField<AuthMethod.Type>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var challenge: JsonField<String>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var requestId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(passkeyAuthChallenge: PasskeyAuthChallenge) = apply {
                id = passkeyAuthChallenge.id
                accountId = passkeyAuthChallenge.accountId
                createdAt = passkeyAuthChallenge.createdAt
                nickname = passkeyAuthChallenge.nickname
                type = passkeyAuthChallenge.type
                updatedAt = passkeyAuthChallenge.updatedAt
                challenge = passkeyAuthChallenge.challenge
                expiresAt = passkeyAuthChallenge.expiresAt
                requestId = passkeyAuthChallenge.requestId
                additionalProperties = passkeyAuthChallenge.additionalProperties.toMutableMap()
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
             * Base64url-encoded challenge issued by Grid for the pending passkey authentication.
             * The client passes it into `navigator.credentials.get()` as the WebAuthn challenge;
             * the resulting assertion is submitted to `POST /auth/credentials/{id}/verify`.
             * Single-use; a new challenge is issued on the next call to `POST
             * /auth/credentials/{id}/challenge`.
             */
            fun challenge(challenge: String) = challenge(JsonField.of(challenge))

            /**
             * Sets [Builder.challenge] to an arbitrary JSON value.
             *
             * You should usually call [Builder.challenge] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun challenge(challenge: JsonField<String>) = apply { this.challenge = challenge }

            /**
             * Timestamp after which the issued challenge is no longer valid. The assertion must
             * reach `POST /auth/credentials/{id}/verify` before this time; otherwise the client
             * must request a fresh challenge via `POST /auth/credentials/{id}/challenge`.
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
             * Unique identifier for this pending passkey authentication request. Must be echoed as
             * the `Request-Id` header on the subsequent `POST /auth/credentials/{id}/verify` call
             * so Grid can correlate the assertion with the issued challenge.
             */
            fun requestId(requestId: String) = requestId(JsonField.of(requestId))

            /**
             * Sets [Builder.requestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

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
             * Returns an immutable instance of [PasskeyAuthChallenge].
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
             * .challenge()
             * .expiresAt()
             * .requestId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PasskeyAuthChallenge =
                PasskeyAuthChallenge(
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("nickname", nickname),
                    checkRequired("type", type),
                    checkRequired("updatedAt", updatedAt),
                    checkRequired("challenge", challenge),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("requestId", requestId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PasskeyAuthChallenge = apply {
            if (validated) {
                return@apply
            }

            id()
            accountId()
            createdAt()
            nickname()
            type().validate()
            updatedAt()
            challenge()
            expiresAt()
            requestId()
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
                (if (challenge.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (requestId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PasskeyAuthChallenge &&
                id == other.id &&
                accountId == other.accountId &&
                createdAt == other.createdAt &&
                nickname == other.nickname &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                challenge == other.challenge &&
                expiresAt == other.expiresAt &&
                requestId == other.requestId &&
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
                challenge,
                expiresAt,
                requestId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PasskeyAuthChallenge{id=$id, accountId=$accountId, createdAt=$createdAt, nickname=$nickname, type=$type, updatedAt=$updatedAt, challenge=$challenge, expiresAt=$expiresAt, requestId=$requestId, additionalProperties=$additionalProperties}"
    }
}
