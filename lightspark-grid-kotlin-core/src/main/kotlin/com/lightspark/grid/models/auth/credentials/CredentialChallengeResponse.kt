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
import java.util.Collections
import java.util.Objects

/**
 * Response body for `POST /auth/credentials/{id}/challenge`. Normally an
 * `AuthCredentialResponseOneOf` — the re-issued challenge or re-sent OTP. When the OTP send's
 * underlying wallet-provider activity is still in flight, this is instead a
 * `WalletOperationProcessing` body with `status: "PROCESSING"` — re-request the challenge until the
 * send settles; the backend also reconciles it to terminal on its own.
 */
@JsonDeserialize(using = CredentialChallengeResponse.Deserializer::class)
@JsonSerialize(using = CredentialChallengeResponse.Serializer::class)
class CredentialChallengeResponse
private constructor(
    private val authMethod: AuthMethodResponse? = null,
    private val passkeyAuthChallenge: PasskeyAuthChallenge? = null,
    private val walletOperationProcessing: WalletOperationProcessing? = null,
    private val _json: JsonValue? = null,
) {

    /**
     * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
     * /auth/credentials` and inside `AuthCredentialResponseOneOf` for the `EMAIL_OTP` / `SMS_OTP`
     * branches of `POST /auth/credentials/{id}/challenge`. The only difference from `AuthMethod` is
     * `unevaluatedProperties: false`, which disambiguates the oneOf against `PasskeyAuthChallenge`
     * — without the strictness, an `AuthMethod` with extra fields would ambiguously match both
     * branches.
     *
     * For `EMAIL_OTP` and `SMS_OTP` credentials, responses that initiate or reissue an OTP
     * challenge carry `otpEncryptionTargetBundle` so the client can HPKE-encrypt the OTP code in
     * the subsequent `POST /auth/credentials/{id}/verify` call without the plaintext code ever
     * transiting the server. First-time EMAIL_OTP wallet bootstrap registration can omit it; call
     * `POST /auth/credentials/{id}/challenge` if it is absent.
     */
    fun authMethod(): AuthMethodResponse? = authMethod

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
     * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target the
     * passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
     * `expiresAt`. The `challenge` value is the lowercase hex-encoded SHA-256 digest of the
     * canonical session-creation request body, not a base64url string. The client UTF-8 encodes
     * this string as the WebAuthn challenge and signs it with the passkey to produce the assertion
     * submitted to `POST /auth/credentials/{id}/verify`.
     */
    fun passkeyAuthChallenge(): PasskeyAuthChallenge? = passkeyAuthChallenge

    /**
     * `200` response returned by an Embedded Wallet operation that the wallet provider has accepted
     * but not yet settled — a consensus- or approval-gated activity that is still in flight. It is
     * not an error and needs no client action beyond patience: the backend reconciles the operation
     * to its terminal state on its own. The client MAY re-send the byte-identical request to
     * converge sooner; the request is idempotent and returns the settled success response once the
     * operation completes.
     */
    fun walletOperationProcessing(): WalletOperationProcessing? = walletOperationProcessing

    fun isAuthMethod(): Boolean = authMethod != null

    fun isPasskeyAuthChallenge(): Boolean = passkeyAuthChallenge != null

    fun isWalletOperationProcessing(): Boolean = walletOperationProcessing != null

    /**
     * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
     * /auth/credentials` and inside `AuthCredentialResponseOneOf` for the `EMAIL_OTP` / `SMS_OTP`
     * branches of `POST /auth/credentials/{id}/challenge`. The only difference from `AuthMethod` is
     * `unevaluatedProperties: false`, which disambiguates the oneOf against `PasskeyAuthChallenge`
     * — without the strictness, an `AuthMethod` with extra fields would ambiguously match both
     * branches.
     *
     * For `EMAIL_OTP` and `SMS_OTP` credentials, responses that initiate or reissue an OTP
     * challenge carry `otpEncryptionTargetBundle` so the client can HPKE-encrypt the OTP code in
     * the subsequent `POST /auth/credentials/{id}/verify` call without the plaintext code ever
     * transiting the server. First-time EMAIL_OTP wallet bootstrap registration can omit it; call
     * `POST /auth/credentials/{id}/challenge` if it is absent.
     */
    fun asAuthMethod(): AuthMethodResponse = authMethod.getOrThrow("authMethod")

    /**
     * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
     * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target the
     * passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
     * `expiresAt`. The `challenge` value is the lowercase hex-encoded SHA-256 digest of the
     * canonical session-creation request body, not a base64url string. The client UTF-8 encodes
     * this string as the WebAuthn challenge and signs it with the passkey to produce the assertion
     * submitted to `POST /auth/credentials/{id}/verify`.
     */
    fun asPasskeyAuthChallenge(): PasskeyAuthChallenge =
        passkeyAuthChallenge.getOrThrow("passkeyAuthChallenge")

    /**
     * `200` response returned by an Embedded Wallet operation that the wallet provider has accepted
     * but not yet settled — a consensus- or approval-gated activity that is still in flight. It is
     * not an error and needs no client action beyond patience: the backend reconciles the operation
     * to its terminal state on its own. The client MAY re-send the byte-identical request to
     * converge sooner; the request is idempotent and returns the settled success response once the
     * operation completes.
     */
    fun asWalletOperationProcessing(): WalletOperationProcessing =
        walletOperationProcessing.getOrThrow("walletOperationProcessing")

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
     * val result: String? = credentialChallengeResponse.accept(object : CredentialChallengeResponse.Visitor<String?> {
     *     override fun visitAuthMethod(authMethod: AuthMethodResponse): String? = authMethod.toString()
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
            authMethod != null -> visitor.visitAuthMethod(authMethod)
            passkeyAuthChallenge != null -> visitor.visitPasskeyAuthChallenge(passkeyAuthChallenge)
            walletOperationProcessing != null ->
                visitor.visitWalletOperationProcessing(walletOperationProcessing)
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
    fun validate(): CredentialChallengeResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAuthMethod(authMethod: AuthMethodResponse) {
                    authMethod.validate()
                }

                override fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) {
                    passkeyAuthChallenge.validate()
                }

                override fun visitWalletOperationProcessing(
                    walletOperationProcessing: WalletOperationProcessing
                ) {
                    walletOperationProcessing.validate()
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
                override fun visitAuthMethod(authMethod: AuthMethodResponse) = authMethod.validity()

                override fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
                    passkeyAuthChallenge.validity()

                override fun visitWalletOperationProcessing(
                    walletOperationProcessing: WalletOperationProcessing
                ) = walletOperationProcessing.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialChallengeResponse &&
            authMethod == other.authMethod &&
            passkeyAuthChallenge == other.passkeyAuthChallenge &&
            walletOperationProcessing == other.walletOperationProcessing
    }

    override fun hashCode(): Int =
        Objects.hash(authMethod, passkeyAuthChallenge, walletOperationProcessing)

    override fun toString(): String =
        when {
            authMethod != null -> "CredentialChallengeResponse{authMethod=$authMethod}"
            passkeyAuthChallenge != null ->
                "CredentialChallengeResponse{passkeyAuthChallenge=$passkeyAuthChallenge}"
            walletOperationProcessing != null ->
                "CredentialChallengeResponse{walletOperationProcessing=$walletOperationProcessing}"
            _json != null -> "CredentialChallengeResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CredentialChallengeResponse")
        }

    companion object {

        /**
         * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
         * /auth/credentials` and inside `AuthCredentialResponseOneOf` for the `EMAIL_OTP` /
         * `SMS_OTP` branches of `POST /auth/credentials/{id}/challenge`. The only difference from
         * `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the oneOf against
         * `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields would
         * ambiguously match both branches.
         *
         * For `EMAIL_OTP` and `SMS_OTP` credentials, responses that initiate or reissue an OTP
         * challenge carry `otpEncryptionTargetBundle` so the client can HPKE-encrypt the OTP code
         * in the subsequent `POST /auth/credentials/{id}/verify` call without the plaintext code
         * ever transiting the server. First-time EMAIL_OTP wallet bootstrap registration can omit
         * it; call `POST /auth/credentials/{id}/challenge` if it is absent.
         */
        fun ofAuthMethod(authMethod: AuthMethodResponse) =
            CredentialChallengeResponse(authMethod = authMethod)

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target
         * the passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
         * `expiresAt`. The `challenge` value is the lowercase hex-encoded SHA-256 digest of the
         * canonical session-creation request body, not a base64url string. The client UTF-8 encodes
         * this string as the WebAuthn challenge and signs it with the passkey to produce the
         * assertion submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun ofPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge) =
            CredentialChallengeResponse(passkeyAuthChallenge = passkeyAuthChallenge)

        /**
         * `200` response returned by an Embedded Wallet operation that the wallet provider has
         * accepted but not yet settled — a consensus- or approval-gated activity that is still in
         * flight. It is not an error and needs no client action beyond patience: the backend
         * reconciles the operation to its terminal state on its own. The client MAY re-send the
         * byte-identical request to converge sooner; the request is idempotent and returns the
         * settled success response once the operation completes.
         */
        fun ofWalletOperationProcessing(walletOperationProcessing: WalletOperationProcessing) =
            CredentialChallengeResponse(walletOperationProcessing = walletOperationProcessing)
    }

    /**
     * An interface that defines how to map each variant of [CredentialChallengeResponse] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /**
         * Strict wrapper around `AuthMethod`. Used directly as the registration response on `POST
         * /auth/credentials` and inside `AuthCredentialResponseOneOf` for the `EMAIL_OTP` /
         * `SMS_OTP` branches of `POST /auth/credentials/{id}/challenge`. The only difference from
         * `AuthMethod` is `unevaluatedProperties: false`, which disambiguates the oneOf against
         * `PasskeyAuthChallenge` — without the strictness, an `AuthMethod` with extra fields would
         * ambiguously match both branches.
         *
         * For `EMAIL_OTP` and `SMS_OTP` credentials, responses that initiate or reissue an OTP
         * challenge carry `otpEncryptionTargetBundle` so the client can HPKE-encrypt the OTP code
         * in the subsequent `POST /auth/credentials/{id}/verify` call without the plaintext code
         * ever transiting the server. First-time EMAIL_OTP wallet bootstrap registration can omit
         * it; call `POST /auth/credentials/{id}/challenge` if it is absent.
         */
        fun visitAuthMethod(authMethod: AuthMethodResponse): T

        /**
         * Extended `AuthMethod` shape returned for `PASSKEY` credentials from `POST
         * /auth/credentials/{id}/challenge`. Includes the WebAuthn `credentialId` needed to target
         * the passkey, plus the Grid-issued `challenge`, corresponding `requestId`, and challenge
         * `expiresAt`. The `challenge` value is the lowercase hex-encoded SHA-256 digest of the
         * canonical session-creation request body, not a base64url string. The client UTF-8 encodes
         * this string as the WebAuthn challenge and signs it with the passkey to produce the
         * assertion submitted to `POST /auth/credentials/{id}/verify`.
         */
        fun visitPasskeyAuthChallenge(passkeyAuthChallenge: PasskeyAuthChallenge): T

        /**
         * `200` response returned by an Embedded Wallet operation that the wallet provider has
         * accepted but not yet settled — a consensus- or approval-gated activity that is still in
         * flight. It is not an error and needs no client action beyond patience: the backend
         * reconciles the operation to its terminal state on its own. The client MAY re-send the
         * byte-identical request to converge sooner; the request is idempotent and returns the
         * settled success response once the operation completes.
         */
        fun visitWalletOperationProcessing(walletOperationProcessing: WalletOperationProcessing): T

        /**
         * Maps an unknown variant of [CredentialChallengeResponse] to a value of type [T].
         *
         * An instance of [CredentialChallengeResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown CredentialChallengeResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CredentialChallengeResponse>(CredentialChallengeResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CredentialChallengeResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AuthMethodResponse>())?.let {
                            CredentialChallengeResponse(authMethod = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PasskeyAuthChallenge>())?.let {
                            CredentialChallengeResponse(passkeyAuthChallenge = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<WalletOperationProcessing>())?.let {
                            CredentialChallengeResponse(
                                walletOperationProcessing = it,
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
                0 -> CredentialChallengeResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CredentialChallengeResponse>(CredentialChallengeResponse::class) {

        override fun serialize(
            value: CredentialChallengeResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.authMethod != null -> generator.writeObject(value.authMethod)
                value.passkeyAuthChallenge != null ->
                    generator.writeObject(value.passkeyAuthChallenge)
                value.walletOperationProcessing != null ->
                    generator.writeObject(value.walletOperationProcessing)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CredentialChallengeResponse")
            }
        }
    }

    /**
     * `200` response returned by an Embedded Wallet operation that the wallet provider has accepted
     * but not yet settled — a consensus- or approval-gated activity that is still in flight. It is
     * not an error and needs no client action beyond patience: the backend reconciles the operation
     * to its terminal state on its own. The client MAY re-send the byte-identical request to
     * converge sooner; the request is idempotent and returns the settled success response once the
     * operation completes.
     */
    class WalletOperationProcessing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<Status>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(status, message, mutableMapOf())

        /**
         * Always `PROCESSING`. Marks a still-in-flight operation whose terminal result is not yet
         * available.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Human-readable explanation that the operation is still being processed and the same
         * request may be retried.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun message(): String? = message.getNullable("message")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * [WalletOperationProcessing].
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [WalletOperationProcessing]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(walletOperationProcessing: WalletOperationProcessing) = apply {
                status = walletOperationProcessing.status
                message = walletOperationProcessing.message
                additionalProperties = walletOperationProcessing.additionalProperties.toMutableMap()
            }

            /**
             * Always `PROCESSING`. Marks a still-in-flight operation whose terminal result is not
             * yet available.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * Human-readable explanation that the operation is still being processed and the same
             * request may be retried.
             */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [WalletOperationProcessing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): WalletOperationProcessing =
                WalletOperationProcessing(
                    checkRequired("status", status),
                    message,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): WalletOperationProcessing = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            message()
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
            (status.asKnown()?.validity() ?: 0) + (if (message.asKnown() == null) 0 else 1)

        /**
         * Always `PROCESSING`. Marks a still-in-flight operation whose terminal result is not yet
         * available.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val PROCESSING = of("PROCESSING")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PROCESSING
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PROCESSING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
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
                    PROCESSING -> Value.PROCESSING
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
                    PROCESSING -> Known.PROCESSING
                    else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WalletOperationProcessing &&
                status == other.status &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(status, message, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WalletOperationProcessing{status=$status, message=$message, additionalProperties=$additionalProperties}"
    }
}
