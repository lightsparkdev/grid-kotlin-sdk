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
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Register an authentication credential for an Embedded Wallet customer.
 *
 * **First credential on an internal account**
 *
 * If the target internal account does not yet have any authentication credential registered, call
 * this endpoint with the credential details. The response is `201` with the created `AuthMethod`.
 * For `EMAIL_OTP` credentials, this call also triggers a one-time password email to the address on
 * the customer record tied to the internal account; the credential must be activated via `POST
 * /auth/credentials/{id}/verify` before it can sign requests. For `OAUTH` credentials, the supplied
 * `oidcToken` is validated inline against the issuer's `.well-known` OpenID configuration (the
 * token's `iat` must be less than 60 seconds before the request); activation still happens via
 * `POST /auth/credentials/{id}/verify`. For `PASSKEY` credentials, the client completes a WebAuthn
 * registration (`navigator.credentials.create()`) using a `challenge` issued by the platform
 * backend and submits the resulting `attestation` here; the credential must still be activated via
 * `POST /auth/credentials/{id}/verify` by completing a WebAuthn assertion. Unlike the registration
 * `challenge` (platform-issued), the challenge for the first authentication is issued by Grid and
 * returned inline on the `201` response alongside the `AuthMethod` fields, plus a `requestId` and
 * challenge `expiresAt` (see `PasskeyAuthChallenge`). The client uses that Grid-issued `challenge`
 * to produce the assertion and submits it with `Request-Id: <requestId>` to `POST
 * /auth/credentials/{id}/verify`. On every subsequent reauthentication the challenge is re-issued
 * via `POST /auth/credentials/{id}/challenge`. Only one `PASSKEY` credential is supported per
 * internal account in v1.
 *
 * **Adding an additional credential**
 *
 * Registering an additional credential against an internal account that already has one requires a
 * signature from an existing verified credential. Call this endpoint with the new credential's
 * details; if an existing credential is already registered on the internal account the response is
 * `202` with a `payloadToSign` and a `requestId`. Sign the payload with the session private key of
 * an existing verified credential on the same internal account (decrypted client-side from its
 * `encryptedSessionSigningKey`) and retry the same request with the signature supplied as the
 * `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header. The
 * signed retry returns `201` with the created `AuthMethod`. For `EMAIL_OTP`, the OTP email is
 * triggered on the signed retry, and the credential must then be activated via `POST
 * /auth/credentials/{id}/verify`.
 */
class CredentialCreateParams
private constructor(
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    fun body(): Body = body

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CredentialCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialCreateParams]. */
    class Builder internal constructor() {

        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var body: Body? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialCreateParams: CredentialCreateParams) = apply {
            gridWalletSignature = credentialCreateParams.gridWalletSignature
            requestId = credentialCreateParams.requestId
            body = credentialCreateParams.body
            additionalHeaders = credentialCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialCreateParams.additionalQueryParams.toBuilder()
        }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        fun body(body: Body) = apply { this.body = body }

        /**
         * Alias for calling [body] with
         * `Body.ofEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest)`.
         */
        fun body(emailOtpCredentialCreateRequest: Body.EmailOtpCredentialCreateRequest) =
            body(Body.ofEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest))

        /**
         * Alias for calling [body] with
         * `Body.ofOAuthCredentialCreateRequest(oauthCredentialCreateRequest)`.
         */
        fun body(oauthCredentialCreateRequest: Body.OAuthCredentialCreateRequest) =
            body(Body.ofOAuthCredentialCreateRequest(oauthCredentialCreateRequest))

        /**
         * Alias for calling [body] with
         * `Body.ofPasskeyCredentialCreateRequest(passkeyCredentialCreateRequest)`.
         */
        fun body(passkeyCredentialCreateRequest: Body.PasskeyCredentialCreateRequest) =
            body(Body.ofPasskeyCredentialCreateRequest(passkeyCredentialCreateRequest))

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CredentialCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .body()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialCreateParams =
            CredentialCreateParams(
                gridWalletSignature,
                requestId,
                checkRequired("body", body),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                gridWalletSignature?.let { put("Grid-Wallet-Signature", it) }
                requestId?.let { put("Request-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = Body.Deserializer::class)
    @JsonSerialize(using = Body.Serializer::class)
    class Body
    private constructor(
        private val emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest? = null,
        private val oauthCredentialCreateRequest: OAuthCredentialCreateRequest? = null,
        private val passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        fun emailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest? =
            emailOtpCredentialCreateRequest

        fun oauthCredentialCreateRequest(): OAuthCredentialCreateRequest? =
            oauthCredentialCreateRequest

        fun passkeyCredentialCreateRequest(): PasskeyCredentialCreateRequest? =
            passkeyCredentialCreateRequest

        fun isEmailOtpCredentialCreateRequest(): Boolean = emailOtpCredentialCreateRequest != null

        fun isOAuthCredentialCreateRequest(): Boolean = oauthCredentialCreateRequest != null

        fun isPasskeyCredentialCreateRequest(): Boolean = passkeyCredentialCreateRequest != null

        fun asEmailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest =
            emailOtpCredentialCreateRequest.getOrThrow("emailOtpCredentialCreateRequest")

        fun asOAuthCredentialCreateRequest(): OAuthCredentialCreateRequest =
            oauthCredentialCreateRequest.getOrThrow("oauthCredentialCreateRequest")

        fun asPasskeyCredentialCreateRequest(): PasskeyCredentialCreateRequest =
            passkeyCredentialCreateRequest.getOrThrow("passkeyCredentialCreateRequest")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                emailOtpCredentialCreateRequest != null ->
                    visitor.visitEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest)
                oauthCredentialCreateRequest != null ->
                    visitor.visitOAuthCredentialCreateRequest(oauthCredentialCreateRequest)
                passkeyCredentialCreateRequest != null ->
                    visitor.visitPasskeyCredentialCreateRequest(passkeyCredentialCreateRequest)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitEmailOtpCredentialCreateRequest(
                        emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
                    ) {
                        emailOtpCredentialCreateRequest.validate()
                    }

                    override fun visitOAuthCredentialCreateRequest(
                        oauthCredentialCreateRequest: OAuthCredentialCreateRequest
                    ) {
                        oauthCredentialCreateRequest.validate()
                    }

                    override fun visitPasskeyCredentialCreateRequest(
                        passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
                    ) {
                        passkeyCredentialCreateRequest.validate()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            accept(
                object : Visitor<Int> {
                    override fun visitEmailOtpCredentialCreateRequest(
                        emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
                    ) = emailOtpCredentialCreateRequest.validity()

                    override fun visitOAuthCredentialCreateRequest(
                        oauthCredentialCreateRequest: OAuthCredentialCreateRequest
                    ) = oauthCredentialCreateRequest.validity()

                    override fun visitPasskeyCredentialCreateRequest(
                        passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
                    ) = passkeyCredentialCreateRequest.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                emailOtpCredentialCreateRequest == other.emailOtpCredentialCreateRequest &&
                oauthCredentialCreateRequest == other.oauthCredentialCreateRequest &&
                passkeyCredentialCreateRequest == other.passkeyCredentialCreateRequest
        }

        override fun hashCode(): Int =
            Objects.hash(
                emailOtpCredentialCreateRequest,
                oauthCredentialCreateRequest,
                passkeyCredentialCreateRequest,
            )

        override fun toString(): String =
            when {
                emailOtpCredentialCreateRequest != null ->
                    "Body{emailOtpCredentialCreateRequest=$emailOtpCredentialCreateRequest}"
                oauthCredentialCreateRequest != null ->
                    "Body{oauthCredentialCreateRequest=$oauthCredentialCreateRequest}"
                passkeyCredentialCreateRequest != null ->
                    "Body{passkeyCredentialCreateRequest=$passkeyCredentialCreateRequest}"
                _json != null -> "Body{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Body")
            }

        companion object {

            fun ofEmailOtpCredentialCreateRequest(
                emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
            ) = Body(emailOtpCredentialCreateRequest = emailOtpCredentialCreateRequest)

            fun ofOAuthCredentialCreateRequest(
                oauthCredentialCreateRequest: OAuthCredentialCreateRequest
            ) = Body(oauthCredentialCreateRequest = oauthCredentialCreateRequest)

            fun ofPasskeyCredentialCreateRequest(
                passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
            ) = Body(passkeyCredentialCreateRequest = passkeyCredentialCreateRequest)
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitEmailOtpCredentialCreateRequest(
                emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
            ): T

            fun visitOAuthCredentialCreateRequest(
                oauthCredentialCreateRequest: OAuthCredentialCreateRequest
            ): T

            fun visitPasskeyCredentialCreateRequest(
                passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
            ): T

            /**
             * Maps an unknown variant of [Body] to a value of type [T].
             *
             * An instance of [Body] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Body: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Body>(Body::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Body {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialCreateRequest>())
                                ?.let { Body(emailOtpCredentialCreateRequest = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<OAuthCredentialCreateRequest>())
                                ?.let { Body(oauthCredentialCreateRequest = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PasskeyCredentialCreateRequest>())
                                ?.let { Body(passkeyCredentialCreateRequest = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> Body(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<Body>(Body::class) {

            override fun serialize(
                value: Body,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.emailOtpCredentialCreateRequest != null ->
                        generator.writeObject(value.emailOtpCredentialCreateRequest)
                    value.oauthCredentialCreateRequest != null ->
                        generator.writeObject(value.oauthCredentialCreateRequest)
                    value.passkeyCredentialCreateRequest != null ->
                        generator.writeObject(value.passkeyCredentialCreateRequest)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Body")
                }
            }
        }

        class EmailOtpCredentialCreateRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountId")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(accountId, type, mutableMapOf())

            /**
             * Identifier of the internal account that this credential will authenticate.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountId(): String = accountId.getRequired("accountId")

            /**
             * Discriminator value identifying this as an email OTP credential.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [accountId].
             *
             * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountId")
            @ExcludeMissing
            fun _accountId(): JsonField<String> = accountId

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
                 * [EmailOtpCredentialCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EmailOtpCredentialCreateRequest]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
                ) = apply {
                    accountId = emailOtpCredentialCreateRequest.accountId
                    type = emailOtpCredentialCreateRequest.type
                    additionalProperties =
                        emailOtpCredentialCreateRequest.additionalProperties.toMutableMap()
                }

                /** Identifier of the internal account that this credential will authenticate. */
                fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                /**
                 * Sets [Builder.accountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

                /** Discriminator value identifying this as an email OTP credential. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [EmailOtpCredentialCreateRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EmailOtpCredentialCreateRequest =
                    EmailOtpCredentialCreateRequest(
                        checkRequired("accountId", accountId),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EmailOtpCredentialCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                accountId()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (accountId.asKnown() == null) 0 else 1) + (type.asKnown()?.validity() ?: 0)

            /** Discriminator value identifying this as an email OTP credential. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val EMAIL_OTP = of("EMAIL_OTP")

                    val OAUTH = of("OAUTH")

                    val PASSKEY = of("PASSKEY")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    EMAIL_OTP,
                    OAUTH,
                    PASSKEY,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    EMAIL_OTP,
                    OAUTH,
                    PASSKEY,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        EMAIL_OTP -> Value.EMAIL_OTP
                        OAUTH -> Value.OAUTH
                        PASSKEY -> Value.PASSKEY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        EMAIL_OTP -> Known.EMAIL_OTP
                        OAUTH -> Known.OAUTH
                        PASSKEY -> Known.PASSKEY
                        else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

                return other is EmailOtpCredentialCreateRequest &&
                    accountId == other.accountId &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmailOtpCredentialCreateRequest{accountId=$accountId, type=$type, additionalProperties=$additionalProperties}"
        }

        class OAuthCredentialCreateRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val oidcToken: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountId")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("oidcToken")
                @ExcludeMissing
                oidcToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(accountId, oidcToken, type, mutableMapOf())

            /**
             * Identifier of the internal account that this credential will authenticate.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountId(): String = accountId.getRequired("accountId")

            /**
             * OIDC ID token issued by the identity provider (e.g. Google, Apple). Grid fetches the
             * issuer's signing key from the `iss` claim's `.well-known` OpenID configuration and
             * verifies the token signature. The token's `iat` claim must be less than 60 seconds
             * before the request timestamp.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun oidcToken(): String = oidcToken.getRequired("oidcToken")

            /**
             * Discriminator value identifying this as an OAuth credential.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [accountId].
             *
             * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountId")
            @ExcludeMissing
            fun _accountId(): JsonField<String> = accountId

            /**
             * Returns the raw JSON value of [oidcToken].
             *
             * Unlike [oidcToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("oidcToken")
            @ExcludeMissing
            fun _oidcToken(): JsonField<String> = oidcToken

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
                 * [OAuthCredentialCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * .oidcToken()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OAuthCredentialCreateRequest]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var oidcToken: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(oauthCredentialCreateRequest: OAuthCredentialCreateRequest) =
                    apply {
                        accountId = oauthCredentialCreateRequest.accountId
                        oidcToken = oauthCredentialCreateRequest.oidcToken
                        type = oauthCredentialCreateRequest.type
                        additionalProperties =
                            oauthCredentialCreateRequest.additionalProperties.toMutableMap()
                    }

                /** Identifier of the internal account that this credential will authenticate. */
                fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                /**
                 * Sets [Builder.accountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

                /**
                 * OIDC ID token issued by the identity provider (e.g. Google, Apple). Grid fetches
                 * the issuer's signing key from the `iss` claim's `.well-known` OpenID
                 * configuration and verifies the token signature. The token's `iat` claim must be
                 * less than 60 seconds before the request timestamp.
                 */
                fun oidcToken(oidcToken: String) = oidcToken(JsonField.of(oidcToken))

                /**
                 * Sets [Builder.oidcToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.oidcToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun oidcToken(oidcToken: JsonField<String>) = apply { this.oidcToken = oidcToken }

                /** Discriminator value identifying this as an OAuth credential. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                 * .oidcToken()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OAuthCredentialCreateRequest =
                    OAuthCredentialCreateRequest(
                        checkRequired("accountId", accountId),
                        checkRequired("oidcToken", oidcToken),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OAuthCredentialCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                accountId()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (accountId.asKnown() == null) 0 else 1) +
                    (if (oidcToken.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            /** Discriminator value identifying this as an OAuth credential. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OAUTH,
                    EMAIL_OTP,
                    PASSKEY,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

                return other is OAuthCredentialCreateRequest &&
                    accountId == other.accountId &&
                    oidcToken == other.oidcToken &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountId, oidcToken, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthCredentialCreateRequest{accountId=$accountId, oidcToken=$oidcToken, type=$type, additionalProperties=$additionalProperties}"
        }

        class PasskeyCredentialCreateRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountId: JsonField<String>,
            private val attestation: JsonField<Attestation>,
            private val challenge: JsonField<String>,
            private val nickname: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountId")
                @ExcludeMissing
                accountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("attestation")
                @ExcludeMissing
                attestation: JsonField<Attestation> = JsonMissing.of(),
                @JsonProperty("challenge")
                @ExcludeMissing
                challenge: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nickname")
                @ExcludeMissing
                nickname: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(accountId, attestation, challenge, nickname, type, mutableMapOf())

            /**
             * Identifier of the internal account that this credential will authenticate.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountId(): String = accountId.getRequired("accountId")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attestation(): Attestation = attestation.getRequired("attestation")

            /**
             * Base64url-encoded WebAuthn challenge issued by the platform backend and passed to the
             * client before `navigator.credentials.create()`. Grid verifies it matches the
             * challenge embedded in the attestation's `clientDataJson`, binding the attestation to
             * this registration. Must be single-use.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun challenge(): String = challenge.getRequired("challenge")

            /**
             * Human-readable identifier for the passkey, chosen by the user at registration time
             * (e.g. "iPhone Face-ID", "YubiKey 5C"). Shown back on `AuthMethod` responses and in
             * credential listings.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nickname(): String = nickname.getRequired("nickname")

            /**
             * Discriminator value identifying this as a passkey credential.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [accountId].
             *
             * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountId")
            @ExcludeMissing
            fun _accountId(): JsonField<String> = accountId

            /**
             * Returns the raw JSON value of [attestation].
             *
             * Unlike [attestation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attestation")
            @ExcludeMissing
            fun _attestation(): JsonField<Attestation> = attestation

            /**
             * Returns the raw JSON value of [challenge].
             *
             * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("challenge")
            @ExcludeMissing
            fun _challenge(): JsonField<String> = challenge

            /**
             * Returns the raw JSON value of [nickname].
             *
             * Unlike [nickname], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

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
                 * [PasskeyCredentialCreateRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountId()
                 * .attestation()
                 * .challenge()
                 * .nickname()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PasskeyCredentialCreateRequest]. */
            class Builder internal constructor() {

                private var accountId: JsonField<String>? = null
                private var attestation: JsonField<Attestation>? = null
                private var challenge: JsonField<String>? = null
                private var nickname: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest) =
                    apply {
                        accountId = passkeyCredentialCreateRequest.accountId
                        attestation = passkeyCredentialCreateRequest.attestation
                        challenge = passkeyCredentialCreateRequest.challenge
                        nickname = passkeyCredentialCreateRequest.nickname
                        type = passkeyCredentialCreateRequest.type
                        additionalProperties =
                            passkeyCredentialCreateRequest.additionalProperties.toMutableMap()
                    }

                /** Identifier of the internal account that this credential will authenticate. */
                fun accountId(accountId: String) = accountId(JsonField.of(accountId))

                /**
                 * Sets [Builder.accountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

                fun attestation(attestation: Attestation) = attestation(JsonField.of(attestation))

                /**
                 * Sets [Builder.attestation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attestation] with a well-typed [Attestation]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun attestation(attestation: JsonField<Attestation>) = apply {
                    this.attestation = attestation
                }

                /**
                 * Base64url-encoded WebAuthn challenge issued by the platform backend and passed to
                 * the client before `navigator.credentials.create()`. Grid verifies it matches the
                 * challenge embedded in the attestation's `clientDataJson`, binding the attestation
                 * to this registration. Must be single-use.
                 */
                fun challenge(challenge: String) = challenge(JsonField.of(challenge))

                /**
                 * Sets [Builder.challenge] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.challenge] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun challenge(challenge: JsonField<String>) = apply { this.challenge = challenge }

                /**
                 * Human-readable identifier for the passkey, chosen by the user at registration
                 * time (e.g. "iPhone Face-ID", "YubiKey 5C"). Shown back on `AuthMethod` responses
                 * and in credential listings.
                 */
                fun nickname(nickname: String) = nickname(JsonField.of(nickname))

                /**
                 * Sets [Builder.nickname] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.nickname] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

                /** Discriminator value identifying this as a passkey credential. */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

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
                 * .attestation()
                 * .challenge()
                 * .nickname()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PasskeyCredentialCreateRequest =
                    PasskeyCredentialCreateRequest(
                        checkRequired("accountId", accountId),
                        checkRequired("attestation", attestation),
                        checkRequired("challenge", challenge),
                        checkRequired("nickname", nickname),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PasskeyCredentialCreateRequest = apply {
                if (validated) {
                    return@apply
                }

                accountId()
                attestation().validate()
                challenge()
                nickname()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (accountId.asKnown() == null) 0 else 1) +
                    (attestation.asKnown()?.validity() ?: 0) +
                    (if (challenge.asKnown() == null) 0 else 1) +
                    (if (nickname.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            class Attestation
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val attestationObject: JsonField<String>,
                private val clientDataJson: JsonField<String>,
                private val credentialId: JsonField<String>,
                private val transports: JsonField<List<Transport>>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("attestationObject")
                    @ExcludeMissing
                    attestationObject: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("clientDataJson")
                    @ExcludeMissing
                    clientDataJson: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("credentialId")
                    @ExcludeMissing
                    credentialId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("transports")
                    @ExcludeMissing
                    transports: JsonField<List<Transport>> = JsonMissing.of(),
                ) : this(
                    attestationObject,
                    clientDataJson,
                    credentialId,
                    transports,
                    mutableMapOf(),
                )

                /**
                 * Base64url-encoded CBOR attestation object produced by the authenticator during
                 * registration. Corresponds to
                 * `AuthenticatorAttestationResponse.attestationObject`.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun attestationObject(): String = attestationObject.getRequired("attestationObject")

                /**
                 * Base64url-encoded JSON client data collected by the browser during the WebAuthn
                 * `navigator.credentials.create()` call. Corresponds to
                 * `AuthenticatorAttestationResponse.clientDataJSON` from the WebAuthn spec — Grid's
                 * field name is intentionally camelCased as `clientDataJson` (lowercase JSON) for
                 * consistency with the rest of the API; the value is the same bytes the browser
                 * returns. Contains the challenge, origin, and `type: "webauthn.create"`.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun clientDataJson(): String = clientDataJson.getRequired("clientDataJson")

                /**
                 * Base64url-encoded credential identifier produced by the authenticator at
                 * registration time. Typically the base64url of `PublicKeyCredential.rawId`.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun credentialId(): String = credentialId.getRequired("credentialId")

                /**
                 * Optional. WebAuthn transports as returned by
                 * `AuthenticatorAttestationResponse.getTransports()`. Values follow the W3C
                 * `AuthenticatorTransport` enum — pass the raw values through to Grid;
                 * provider-specific translation is handled server-side. Some authenticators return
                 * an empty array; omit the field or send `[]` in that case.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun transports(): List<Transport>? = transports.getNullable("transports")

                /**
                 * Returns the raw JSON value of [attestationObject].
                 *
                 * Unlike [attestationObject], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("attestationObject")
                @ExcludeMissing
                fun _attestationObject(): JsonField<String> = attestationObject

                /**
                 * Returns the raw JSON value of [clientDataJson].
                 *
                 * Unlike [clientDataJson], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("clientDataJson")
                @ExcludeMissing
                fun _clientDataJson(): JsonField<String> = clientDataJson

                /**
                 * Returns the raw JSON value of [credentialId].
                 *
                 * Unlike [credentialId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("credentialId")
                @ExcludeMissing
                fun _credentialId(): JsonField<String> = credentialId

                /**
                 * Returns the raw JSON value of [transports].
                 *
                 * Unlike [transports], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transports")
                @ExcludeMissing
                fun _transports(): JsonField<List<Transport>> = transports

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
                     * Returns a mutable builder for constructing an instance of [Attestation].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .attestationObject()
                     * .clientDataJson()
                     * .credentialId()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Attestation]. */
                class Builder internal constructor() {

                    private var attestationObject: JsonField<String>? = null
                    private var clientDataJson: JsonField<String>? = null
                    private var credentialId: JsonField<String>? = null
                    private var transports: JsonField<MutableList<Transport>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(attestation: Attestation) = apply {
                        attestationObject = attestation.attestationObject
                        clientDataJson = attestation.clientDataJson
                        credentialId = attestation.credentialId
                        transports = attestation.transports.map { it.toMutableList() }
                        additionalProperties = attestation.additionalProperties.toMutableMap()
                    }

                    /**
                     * Base64url-encoded CBOR attestation object produced by the authenticator
                     * during registration. Corresponds to
                     * `AuthenticatorAttestationResponse.attestationObject`.
                     */
                    fun attestationObject(attestationObject: String) =
                        attestationObject(JsonField.of(attestationObject))

                    /**
                     * Sets [Builder.attestationObject] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.attestationObject] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun attestationObject(attestationObject: JsonField<String>) = apply {
                        this.attestationObject = attestationObject
                    }

                    /**
                     * Base64url-encoded JSON client data collected by the browser during the
                     * WebAuthn `navigator.credentials.create()` call. Corresponds to
                     * `AuthenticatorAttestationResponse.clientDataJSON` from the WebAuthn spec —
                     * Grid's field name is intentionally camelCased as `clientDataJson` (lowercase
                     * JSON) for consistency with the rest of the API; the value is the same bytes
                     * the browser returns. Contains the challenge, origin, and `type:
                     * "webauthn.create"`.
                     */
                    fun clientDataJson(clientDataJson: String) =
                        clientDataJson(JsonField.of(clientDataJson))

                    /**
                     * Sets [Builder.clientDataJson] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.clientDataJson] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun clientDataJson(clientDataJson: JsonField<String>) = apply {
                        this.clientDataJson = clientDataJson
                    }

                    /**
                     * Base64url-encoded credential identifier produced by the authenticator at
                     * registration time. Typically the base64url of `PublicKeyCredential.rawId`.
                     */
                    fun credentialId(credentialId: String) =
                        credentialId(JsonField.of(credentialId))

                    /**
                     * Sets [Builder.credentialId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.credentialId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun credentialId(credentialId: JsonField<String>) = apply {
                        this.credentialId = credentialId
                    }

                    /**
                     * Optional. WebAuthn transports as returned by
                     * `AuthenticatorAttestationResponse.getTransports()`. Values follow the W3C
                     * `AuthenticatorTransport` enum — pass the raw values through to Grid;
                     * provider-specific translation is handled server-side. Some authenticators
                     * return an empty array; omit the field or send `[]` in that case.
                     */
                    fun transports(transports: List<Transport>) =
                        transports(JsonField.of(transports))

                    /**
                     * Sets [Builder.transports] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transports] with a well-typed
                     * `List<Transport>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun transports(transports: JsonField<List<Transport>>) = apply {
                        this.transports = transports.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [Transport] to [transports].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addTransport(transport: Transport) = apply {
                        transports =
                            (transports ?: JsonField.of(mutableListOf())).also {
                                checkKnown("transports", it).add(transport)
                            }
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Attestation].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .attestationObject()
                     * .clientDataJson()
                     * .credentialId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Attestation =
                        Attestation(
                            checkRequired("attestationObject", attestationObject),
                            checkRequired("clientDataJson", clientDataJson),
                            checkRequired("credentialId", credentialId),
                            (transports ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Attestation = apply {
                    if (validated) {
                        return@apply
                    }

                    attestationObject()
                    clientDataJson()
                    credentialId()
                    transports()?.forEach { it.validate() }
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
                    (if (attestationObject.asKnown() == null) 0 else 1) +
                        (if (clientDataJson.asKnown() == null) 0 else 1) +
                        (if (credentialId.asKnown() == null) 0 else 1) +
                        (transports.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

                class Transport
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val USB = of("usb")

                        val NFC = of("nfc")

                        val BLE = of("ble")

                        val INTERNAL = of("internal")

                        val HYBRID = of("hybrid")

                        fun of(value: String) = Transport(JsonField.of(value))
                    }

                    /** An enum containing [Transport]'s known values. */
                    enum class Known {
                        USB,
                        NFC,
                        BLE,
                        INTERNAL,
                        HYBRID,
                    }

                    /**
                     * An enum containing [Transport]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Transport] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        USB,
                        NFC,
                        BLE,
                        INTERNAL,
                        HYBRID,
                        /**
                         * An enum member indicating that [Transport] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            USB -> Value.USB
                            NFC -> Value.NFC
                            BLE -> Value.BLE
                            INTERNAL -> Value.INTERNAL
                            HYBRID -> Value.HYBRID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            USB -> Known.USB
                            NFC -> Known.NFC
                            BLE -> Known.BLE
                            INTERNAL -> Known.INTERNAL
                            HYBRID -> Known.HYBRID
                            else ->
                                throw LightsparkGridInvalidDataException(
                                    "Unknown Transport: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LightsparkGridInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    fun validate(): Transport = apply {
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

                        return other is Transport && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Attestation &&
                        attestationObject == other.attestationObject &&
                        clientDataJson == other.clientDataJson &&
                        credentialId == other.credentialId &&
                        transports == other.transports &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        attestationObject,
                        clientDataJson,
                        credentialId,
                        transports,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attestation{attestationObject=$attestationObject, clientDataJson=$clientDataJson, credentialId=$credentialId, transports=$transports, additionalProperties=$additionalProperties}"
            }

            /** Discriminator value identifying this as a passkey credential. */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val PASSKEY = of("PASSKEY")

                    val OAUTH = of("OAUTH")

                    val EMAIL_OTP = of("EMAIL_OTP")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PASSKEY,
                    OAUTH,
                    EMAIL_OTP,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PASSKEY,
                    OAUTH,
                    EMAIL_OTP,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PASSKEY -> Value.PASSKEY
                        OAUTH -> Value.OAUTH
                        EMAIL_OTP -> Value.EMAIL_OTP
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        PASSKEY -> Known.PASSKEY
                        OAUTH -> Known.OAUTH
                        EMAIL_OTP -> Known.EMAIL_OTP
                        else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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

                return other is PasskeyCredentialCreateRequest &&
                    accountId == other.accountId &&
                    attestation == other.attestation &&
                    challenge == other.challenge &&
                    nickname == other.nickname &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountId,
                    attestation,
                    challenge,
                    nickname,
                    type,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PasskeyCredentialCreateRequest{accountId=$accountId, attestation=$attestation, challenge=$challenge, nickname=$nickname, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialCreateParams &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(gridWalletSignature, requestId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CredentialCreateParams{gridWalletSignature=$gridWalletSignature, requestId=$requestId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
