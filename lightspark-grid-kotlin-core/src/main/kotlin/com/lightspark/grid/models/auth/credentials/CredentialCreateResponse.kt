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
import com.lightspark.grid.core.Enum
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
 * Discriminated response shape returned from `POST /auth/credentials` (on successful registration)
 * and `POST /auth/credentials/{id}/challenge` (on challenge re-issue). For `EMAIL_OTP` and `OAUTH`
 * credentials the body is a plain `AuthMethod` (wrapped as `AuthMethodResponse` to disambiguate the
 * oneOf). For `PASSKEY` credentials the body is a `PasskeyAuthChallenge` — the base `AuthMethod`
 * fields plus the Grid-issued `challenge`, `requestId`, and `expiresAt` that drive the subsequent
 * assertion.
 */
@JsonDeserialize(using = CredentialCreateResponse.Deserializer::class)
@JsonSerialize(using = CredentialCreateResponse.Serializer::class)
class CredentialCreateResponse
private constructor(
    private val authMethod: AuthMethod? = null,
    private val passkeyAuthChallenge: PasskeyAuthChallenge? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Strict wrapper around `AuthMethod` used inside `AuthCredentialResponseOneOf` for the
     * `EMAIL_OTP` and `OAUTH` branches. The only difference from `AuthMethod` is
     * `unevaluatedProperties: false`, which disambiguates the oneOf against `PasskeyAuthChallenge`
     * — without the strictness, an `AuthMethod` with extra fields would ambiguously match both
     * branches.
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
     * Strict wrapper around `AuthMethod` used inside `AuthCredentialResponseOneOf` for the
     * `EMAIL_OTP` and `OAUTH` branches. The only difference from `AuthMethod` is
     * `unevaluatedProperties: false`, which disambiguates the oneOf against `PasskeyAuthChallenge`
     * — without the strictness, an `AuthMethod` with extra fields would ambiguously match both
     * branches.
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

    fun validate(): CredentialCreateResponse = apply {
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

        return other is CredentialCreateResponse &&
            authMethod == other.authMethod &&
            passkeyAuthChallenge == other.passkeyAuthChallenge
    }

    override fun hashCode(): Int = Objects.hash(authMethod, passkeyAuthChallenge)

    override fun toString(): String =
        when {
            authMethod != null -> "CredentialCreateResponse{authMethod=$authMethod}"
            passkeyAuthChallenge != null ->
                "CredentialCreateResponse{passkeyAuthChallenge=$passkeyAuthChallenge}"
            _json != null -> "CredentialCreateResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CredentialCreateResponse")
        }

    companion object {

        /**
         * Strict wrapper around `AuthMethod` used inside `AuthCredentialResponseOneOf` for the
         * `EMAIL_OTP` and `OAUTH` branches. The only difference from `AuthMethod` is
         * `unevaluatedProperties: false`, which disambiguates the oneOf against
         * `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields would
         * ambiguously match both branches.
         */
        fun ofAuthMethod(authMethod: AuthMethod) = CredentialCreateResponse(authMethod = authMethod)

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials` (first-authentication case) and `POST
         * /auth/credentials/{id}/challenge` (reauthentication case). Adds a Grid-issued
         * `challenge`, the corresponding `requestId`, and the challenge's `expiresAt` to the base
         * `AuthMethod` fields. The client signs the challenge with the passkey to produce the
         * assertion submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun ofPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
            CredentialCreateResponse(passkeyAuthChallenge = passkeyAuthChallenge)
    }

    /**
     * An interface that defines how to map each variant of [CredentialCreateResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /**
         * Strict wrapper around `AuthMethod` used inside `AuthCredentialResponseOneOf` for the
         * `EMAIL_OTP` and `OAUTH` branches. The only difference from `AuthMethod` is
         * `unevaluatedProperties: false`, which disambiguates the oneOf against
         * `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields would
         * ambiguously match both branches.
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
         * Maps an unknown variant of [CredentialCreateResponse] to a value of type [T].
         *
         * An instance of [CredentialCreateResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown CredentialCreateResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CredentialCreateResponse>(CredentialCreateResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CredentialCreateResponse {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AuthMethod>())?.let {
                            CredentialCreateResponse(authMethod = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PasskeyAuthChallenge>())?.let {
                            CredentialCreateResponse(passkeyAuthChallenge = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CredentialCreateResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CredentialCreateResponse>(CredentialCreateResponse::class) {

        override fun serialize(
            value: CredentialCreateResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.authMethod != null -> generator.writeObject(value.authMethod)
                value.passkeyAuthChallenge != null ->
                    generator.writeObject(value.passkeyAuthChallenge)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CredentialCreateResponse")
            }
        }
    }

    /**
     * Strict wrapper around `AuthMethod` used inside `AuthCredentialResponseOneOf` for the
     * `EMAIL_OTP` and `OAUTH` branches. The only difference from `AuthMethod` is
     * `unevaluatedProperties: false`, which disambiguates the oneOf against `PasskeyAuthChallenge`
     * — without the strictness, an `AuthMethod` with extra fields would ambiguously match both
     * branches.
     */
    class AuthMethod
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val accountId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val nickname: JsonField<String>,
        private val type: JsonField<Type>,
        private val updatedAt: JsonField<OffsetDateTime>,
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
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(id, accountId, createdAt, nickname, type, updatedAt, mutableMapOf())

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
        fun type(): Type = type.getRequired("type")

        /**
         * Last update timestamp.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

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
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
             * Returns a mutable builder for constructing an instance of [AuthMethod].
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .accountId()
             * .createdAt()
             * .nickname()
             * .type()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AuthMethod]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var nickname: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(authMethod: AuthMethod) = apply {
                id = authMethod.id
                accountId = authMethod.accountId
                createdAt = authMethod.createdAt
                nickname = authMethod.nickname
                type = authMethod.type
                updatedAt = authMethod.updatedAt
                additionalProperties = authMethod.additionalProperties.toMutableMap()
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
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [AuthMethod].
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
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AuthMethod =
                AuthMethod(
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("createdAt", createdAt),
                    checkRequired("nickname", nickname),
                    checkRequired("type", type),
                    checkRequired("updatedAt", updatedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AuthMethod = apply {
            if (validated) {
                return@apply
            }

            id()
            accountId()
            createdAt()
            nickname()
            type().validate()
            updatedAt()
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
                (if (updatedAt.asKnown() == null) 0 else 1)

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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

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

            return other is AuthMethod &&
                id == other.id &&
                accountId == other.accountId &&
                createdAt == other.createdAt &&
                nickname == other.nickname &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(id, accountId, createdAt, nickname, type, updatedAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AuthMethod{id=$id, accountId=$accountId, createdAt=$createdAt, nickname=$nickname, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
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
        private val challenge: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val expiresAt: JsonField<OffsetDateTime>,
        private val nickname: JsonField<String>,
        private val requestId: JsonField<String>,
        private val type: JsonField<Type>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("challenge")
            @ExcludeMissing
            challenge: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("nickname")
            @ExcludeMissing
            nickname: JsonField<String> = JsonMissing.of(),
            @JsonProperty("requestId")
            @ExcludeMissing
            requestId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            id,
            accountId,
            challenge,
            createdAt,
            expiresAt,
            nickname,
            requestId,
            type,
            updatedAt,
            mutableMapOf(),
        )

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
         * Creation timestamp.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

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
         * Human-readable identifier for this credential. For EMAIL_OTP credentials this is the
         * email address; for OAUTH credentials it is typically the email claim from the OIDC token;
         * for PASSKEY credentials it is the nickname provided at registration time.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun nickname(): String = nickname.getRequired("nickname")

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
         * Returns the raw JSON value of [challenge].
         *
         * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("challenge") @ExcludeMissing fun _challenge(): JsonField<String> = challenge

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
         * Returns the raw JSON value of [requestId].
         *
         * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("requestId") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
             * .challenge()
             * .createdAt()
             * .expiresAt()
             * .nickname()
             * .requestId()
             * .type()
             * .updatedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PasskeyAuthChallenge]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var accountId: JsonField<String>? = null
            private var challenge: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var nickname: JsonField<String>? = null
            private var requestId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(passkeyAuthChallenge: PasskeyAuthChallenge) = apply {
                id = passkeyAuthChallenge.id
                accountId = passkeyAuthChallenge.accountId
                challenge = passkeyAuthChallenge.challenge
                createdAt = passkeyAuthChallenge.createdAt
                expiresAt = passkeyAuthChallenge.expiresAt
                nickname = passkeyAuthChallenge.nickname
                requestId = passkeyAuthChallenge.requestId
                type = passkeyAuthChallenge.type
                updatedAt = passkeyAuthChallenge.updatedAt
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

            /**
             * The type of authentication credential.
             * - `OAUTH`: OpenID Connect (OIDC) token issued by an identity provider such as Google
             *   or Apple.
             * - `EMAIL_OTP`: A one-time password delivered to the user's email address.
             * - `PASSKEY`: A WebAuthn passkey bound to the user's device.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
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
             * Returns an immutable instance of [PasskeyAuthChallenge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .id()
             * .accountId()
             * .challenge()
             * .createdAt()
             * .expiresAt()
             * .nickname()
             * .requestId()
             * .type()
             * .updatedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PasskeyAuthChallenge =
                PasskeyAuthChallenge(
                    checkRequired("id", id),
                    checkRequired("accountId", accountId),
                    checkRequired("challenge", challenge),
                    checkRequired("createdAt", createdAt),
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("nickname", nickname),
                    checkRequired("requestId", requestId),
                    checkRequired("type", type),
                    checkRequired("updatedAt", updatedAt),
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
            challenge()
            createdAt()
            expiresAt()
            nickname()
            requestId()
            type().validate()
            updatedAt()
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
                (if (challenge.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (nickname.asKnown() == null) 0 else 1) +
                (if (requestId.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (if (updatedAt.asKnown() == null) 0 else 1)

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
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

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

            return other is PasskeyAuthChallenge &&
                id == other.id &&
                accountId == other.accountId &&
                challenge == other.challenge &&
                createdAt == other.createdAt &&
                expiresAt == other.expiresAt &&
                nickname == other.nickname &&
                requestId == other.requestId &&
                type == other.type &&
                updatedAt == other.updatedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                accountId,
                challenge,
                createdAt,
                expiresAt,
                nickname,
                requestId,
                type,
                updatedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PasskeyAuthChallenge{id=$id, accountId=$accountId, challenge=$challenge, createdAt=$createdAt, expiresAt=$expiresAt, nickname=$nickname, requestId=$requestId, type=$type, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
    }
}
