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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Complete the verification step for a previously created authentication credential and issue a
 * session signing key.
 *
 * For `EMAIL_OTP` credentials, supply the one-time password that was emailed to the user along with
 * a client-generated public key. For `OAUTH` credentials, supply a fresh OIDC token (`iat` must be
 * less than 60 seconds before the request) along with the client-generated public key; this is also
 * the reauthentication path after a prior session expired. For `PASSKEY` credentials, the client
 * completes a WebAuthn assertion (`navigator.credentials.get()`) against the Grid-issued
 * `challenge` returned from either `POST /auth/credentials` (first authentication) or `POST
 * /auth/credentials/{id}/challenge` (reauthentication), and submits the resulting `assertion` along
 * with the client-generated public key. The `requestId` that accompanied the challenge must be
 * echoed in the `Request-Id` header so Grid can correlate the assertion with the pending challenge;
 * Grid verifies the WebAuthn signature against the stored credential before issuing the session.
 *
 * On success, the response contains an `encryptedSessionSigningKey` that is encrypted to the
 * supplied `clientPublicKey`, along with an `expiresAt` timestamp marking when the session expires.
 * The `clientPublicKey` is ephemeral and one-time-use per verification request.
 */
class CredentialVerifyParams
private constructor(
    private val id: String?,
    private val requestId: String?,
    private val authCredentialVerifyRequest: AuthCredentialVerifyRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun requestId(): String? = requestId

    fun authCredentialVerifyRequest(): AuthCredentialVerifyRequest = authCredentialVerifyRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CredentialVerifyParams].
         *
         * The following fields are required:
         * ```kotlin
         * .authCredentialVerifyRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CredentialVerifyParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var requestId: String? = null
        private var authCredentialVerifyRequest: AuthCredentialVerifyRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(credentialVerifyParams: CredentialVerifyParams) = apply {
            id = credentialVerifyParams.id
            requestId = credentialVerifyParams.requestId
            authCredentialVerifyRequest = credentialVerifyParams.authCredentialVerifyRequest
            additionalHeaders = credentialVerifyParams.additionalHeaders.toBuilder()
            additionalQueryParams = credentialVerifyParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        fun authCredentialVerifyRequest(authCredentialVerifyRequest: AuthCredentialVerifyRequest) =
            apply {
                this.authCredentialVerifyRequest = authCredentialVerifyRequest
            }

        /**
         * Alias for calling [authCredentialVerifyRequest] with
         * `AuthCredentialVerifyRequest.ofEmailOtp(emailOtp)`.
         */
        fun authCredentialVerifyRequest(
            emailOtp: AuthCredentialVerifyRequest.EmailOtpCredentialVerifyRequest
        ) = authCredentialVerifyRequest(AuthCredentialVerifyRequest.ofEmailOtp(emailOtp))

        /**
         * Alias for calling [authCredentialVerifyRequest] with
         * `AuthCredentialVerifyRequest.ofOAuth(oauth)`.
         */
        fun authCredentialVerifyRequest(
            oauth: AuthCredentialVerifyRequest.OAuthCredentialVerifyRequest
        ) = authCredentialVerifyRequest(AuthCredentialVerifyRequest.ofOAuth(oauth))

        /**
         * Alias for calling [authCredentialVerifyRequest] with
         * `AuthCredentialVerifyRequest.ofPasskey(passkey)`.
         */
        fun authCredentialVerifyRequest(
            passkey: AuthCredentialVerifyRequest.PasskeyCredentialVerifyRequest
        ) = authCredentialVerifyRequest(AuthCredentialVerifyRequest.ofPasskey(passkey))

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
         * Returns an immutable instance of [CredentialVerifyParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .authCredentialVerifyRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CredentialVerifyParams =
            CredentialVerifyParams(
                id,
                requestId,
                checkRequired("authCredentialVerifyRequest", authCredentialVerifyRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AuthCredentialVerifyRequest = authCredentialVerifyRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                requestId?.let { put("Request-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = AuthCredentialVerifyRequest.Deserializer::class)
    @JsonSerialize(using = AuthCredentialVerifyRequest.Serializer::class)
    class AuthCredentialVerifyRequest
    private constructor(
        private val emailOtp: EmailOtpCredentialVerifyRequest? = null,
        private val oauth: OAuthCredentialVerifyRequest? = null,
        private val passkey: PasskeyCredentialVerifyRequest? = null,
        private val _json: JsonValue? = null,
    ) {

        fun emailOtp(): EmailOtpCredentialVerifyRequest? = emailOtp

        fun oauth(): OAuthCredentialVerifyRequest? = oauth

        fun passkey(): PasskeyCredentialVerifyRequest? = passkey

        fun isEmailOtp(): Boolean = emailOtp != null

        fun isOAuth(): Boolean = oauth != null

        fun isPasskey(): Boolean = passkey != null

        fun asEmailOtp(): EmailOtpCredentialVerifyRequest = emailOtp.getOrThrow("emailOtp")

        fun asOAuth(): OAuthCredentialVerifyRequest = oauth.getOrThrow("oauth")

        fun asPasskey(): PasskeyCredentialVerifyRequest = passkey.getOrThrow("passkey")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                emailOtp != null -> visitor.visitEmailOtp(emailOtp)
                oauth != null -> visitor.visitOAuth(oauth)
                passkey != null -> visitor.visitPasskey(passkey)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AuthCredentialVerifyRequest = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest) {
                        emailOtp.validate()
                    }

                    override fun visitOAuth(oauth: OAuthCredentialVerifyRequest) {
                        oauth.validate()
                    }

                    override fun visitPasskey(passkey: PasskeyCredentialVerifyRequest) {
                        passkey.validate()
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
                    override fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest) =
                        emailOtp.validity()

                    override fun visitOAuth(oauth: OAuthCredentialVerifyRequest) = oauth.validity()

                    override fun visitPasskey(passkey: PasskeyCredentialVerifyRequest) =
                        passkey.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AuthCredentialVerifyRequest &&
                emailOtp == other.emailOtp &&
                oauth == other.oauth &&
                passkey == other.passkey
        }

        override fun hashCode(): Int = Objects.hash(emailOtp, oauth, passkey)

        override fun toString(): String =
            when {
                emailOtp != null -> "AuthCredentialVerifyRequest{emailOtp=$emailOtp}"
                oauth != null -> "AuthCredentialVerifyRequest{oauth=$oauth}"
                passkey != null -> "AuthCredentialVerifyRequest{passkey=$passkey}"
                _json != null -> "AuthCredentialVerifyRequest{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AuthCredentialVerifyRequest")
            }

        companion object {

            fun ofEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest) =
                AuthCredentialVerifyRequest(emailOtp = emailOtp)

            fun ofOAuth(oauth: OAuthCredentialVerifyRequest) =
                AuthCredentialVerifyRequest(oauth = oauth)

            fun ofPasskey(passkey: PasskeyCredentialVerifyRequest) =
                AuthCredentialVerifyRequest(passkey = passkey)
        }

        /**
         * An interface that defines how to map each variant of [AuthCredentialVerifyRequest] to a
         * value of type [T].
         */
        interface Visitor<out T> {

            fun visitEmailOtp(emailOtp: EmailOtpCredentialVerifyRequest): T

            fun visitOAuth(oauth: OAuthCredentialVerifyRequest): T

            fun visitPasskey(passkey: PasskeyCredentialVerifyRequest): T

            /**
             * Maps an unknown variant of [AuthCredentialVerifyRequest] to a value of type [T].
             *
             * An instance of [AuthCredentialVerifyRequest] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException(
                    "Unknown AuthCredentialVerifyRequest: $json"
                )
            }
        }

        internal class Deserializer :
            BaseDeserializer<AuthCredentialVerifyRequest>(AuthCredentialVerifyRequest::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AuthCredentialVerifyRequest {
                val json = JsonValue.fromJsonNode(node)
                val type = json.asObject()?.get("type")?.asString()

                when (type) {}

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialVerifyRequest>())
                                ?.let { AuthCredentialVerifyRequest(emailOtp = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<OAuthCredentialVerifyRequest>())
                                ?.let { AuthCredentialVerifyRequest(oauth = it, _json = json) },
                            tryDeserialize(node, jacksonTypeRef<PasskeyCredentialVerifyRequest>())
                                ?.let { AuthCredentialVerifyRequest(passkey = it, _json = json) },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AuthCredentialVerifyRequest(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer :
            BaseSerializer<AuthCredentialVerifyRequest>(AuthCredentialVerifyRequest::class) {

            override fun serialize(
                value: AuthCredentialVerifyRequest,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.emailOtp != null -> generator.writeObject(value.emailOtp)
                    value.oauth != null -> generator.writeObject(value.oauth)
                    value.passkey != null -> generator.writeObject(value.passkey)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AuthCredentialVerifyRequest")
                }
            }
        }

        class EmailOtpCredentialVerifyRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val clientPublicKey: JsonField<String>,
            private val otp: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("clientPublicKey")
                @ExcludeMissing
                clientPublicKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("otp") @ExcludeMissing otp: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(clientPublicKey, otp, type, mutableMapOf())

            /**
             * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04
             * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
             * total). The matching private key must remain on the client. Grid encrypts the session
             * signing key returned in the response to this public key. The key is ephemeral and
             * one-time-use per verification request.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clientPublicKey(): String = clientPublicKey.getRequired("clientPublicKey")

            /**
             * The one-time password received by the user via email.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun otp(): String = otp.getRequired("otp")

            /**
             * Discriminator value identifying this as an email OTP verification.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [clientPublicKey].
             *
             * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("clientPublicKey")
            @ExcludeMissing
            fun _clientPublicKey(): JsonField<String> = clientPublicKey

            /**
             * Returns the raw JSON value of [otp].
             *
             * Unlike [otp], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("otp") @ExcludeMissing fun _otp(): JsonField<String> = otp

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
                 * [EmailOtpCredentialVerifyRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .clientPublicKey()
                 * .otp()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EmailOtpCredentialVerifyRequest]. */
            class Builder internal constructor() {

                private var clientPublicKey: JsonField<String>? = null
                private var otp: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    emailOtpCredentialVerifyRequest: EmailOtpCredentialVerifyRequest
                ) = apply {
                    clientPublicKey = emailOtpCredentialVerifyRequest.clientPublicKey
                    otp = emailOtpCredentialVerifyRequest.otp
                    type = emailOtpCredentialVerifyRequest.type
                    additionalProperties =
                        emailOtpCredentialVerifyRequest.additionalProperties.toMutableMap()
                }

                /**
                 * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04
                 * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
                 * total). The matching private key must remain on the client. Grid encrypts the
                 * session signing key returned in the response to this public key. The key is
                 * ephemeral and one-time-use per verification request.
                 */
                fun clientPublicKey(clientPublicKey: String) =
                    clientPublicKey(JsonField.of(clientPublicKey))

                /**
                 * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientPublicKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
                    this.clientPublicKey = clientPublicKey
                }

                /** The one-time password received by the user via email. */
                fun otp(otp: String) = otp(JsonField.of(otp))

                /**
                 * Sets [Builder.otp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.otp] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun otp(otp: JsonField<String>) = apply { this.otp = otp }

                /** Discriminator value identifying this as an email OTP verification. */
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
                 * Returns an immutable instance of [EmailOtpCredentialVerifyRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .clientPublicKey()
                 * .otp()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EmailOtpCredentialVerifyRequest =
                    EmailOtpCredentialVerifyRequest(
                        checkRequired("clientPublicKey", clientPublicKey),
                        checkRequired("otp", otp),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): EmailOtpCredentialVerifyRequest = apply {
                if (validated) {
                    return@apply
                }

                clientPublicKey()
                otp()
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
                (if (clientPublicKey.asKnown() == null) 0 else 1) +
                    (if (otp.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            /** Discriminator value identifying this as an email OTP verification. */
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

                return other is EmailOtpCredentialVerifyRequest &&
                    clientPublicKey == other.clientPublicKey &&
                    otp == other.otp &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(clientPublicKey, otp, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmailOtpCredentialVerifyRequest{clientPublicKey=$clientPublicKey, otp=$otp, type=$type, additionalProperties=$additionalProperties}"
        }

        class OAuthCredentialVerifyRequest
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
                @JsonProperty("oidcToken")
                @ExcludeMissing
                oidcToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(clientPublicKey, oidcToken, type, mutableMapOf())

            /**
             * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04
             * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
             * total). The matching private key must remain on the client. Grid encrypts the session
             * signing key returned in the response to this public key. The key is ephemeral and
             * one-time-use per verification request.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clientPublicKey(): String = clientPublicKey.getRequired("clientPublicKey")

            /**
             * OIDC ID token issued by the identity provider. For reauthentication after a prior
             * session expired, supply a fresh token — the token's `iat` claim must be less than 60
             * seconds before the request timestamp. Grid fetches the issuer's signing key from the
             * `iss` claim's `.well-known` OpenID configuration and verifies the token signature.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun oidcToken(): String = oidcToken.getRequired("oidcToken")

            /**
             * Discriminator value identifying this as an OAuth verification.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [clientPublicKey].
             *
             * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("clientPublicKey")
            @ExcludeMissing
            fun _clientPublicKey(): JsonField<String> = clientPublicKey

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
                 * [OAuthCredentialVerifyRequest].
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

            /** A builder for [OAuthCredentialVerifyRequest]. */
            class Builder internal constructor() {

                private var clientPublicKey: JsonField<String>? = null
                private var oidcToken: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(oauthCredentialVerifyRequest: OAuthCredentialVerifyRequest) =
                    apply {
                        clientPublicKey = oauthCredentialVerifyRequest.clientPublicKey
                        oidcToken = oauthCredentialVerifyRequest.oidcToken
                        type = oauthCredentialVerifyRequest.type
                        additionalProperties =
                            oauthCredentialVerifyRequest.additionalProperties.toMutableMap()
                    }

                /**
                 * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04
                 * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
                 * total). The matching private key must remain on the client. Grid encrypts the
                 * session signing key returned in the response to this public key. The key is
                 * ephemeral and one-time-use per verification request.
                 */
                fun clientPublicKey(clientPublicKey: String) =
                    clientPublicKey(JsonField.of(clientPublicKey))

                /**
                 * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientPublicKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
                    this.clientPublicKey = clientPublicKey
                }

                /**
                 * OIDC ID token issued by the identity provider. For reauthentication after a prior
                 * session expired, supply a fresh token — the token's `iat` claim must be less than
                 * 60 seconds before the request timestamp. Grid fetches the issuer's signing key
                 * from the `iss` claim's `.well-known` OpenID configuration and verifies the token
                 * signature.
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

                /** Discriminator value identifying this as an OAuth verification. */
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
                 * Returns an immutable instance of [OAuthCredentialVerifyRequest].
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
                fun build(): OAuthCredentialVerifyRequest =
                    OAuthCredentialVerifyRequest(
                        checkRequired("clientPublicKey", clientPublicKey),
                        checkRequired("oidcToken", oidcToken),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OAuthCredentialVerifyRequest = apply {
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (clientPublicKey.asKnown() == null) 0 else 1) +
                    (if (oidcToken.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            /** Discriminator value identifying this as an OAuth verification. */
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

                return other is OAuthCredentialVerifyRequest &&
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
                "OAuthCredentialVerifyRequest{clientPublicKey=$clientPublicKey, oidcToken=$oidcToken, type=$type, additionalProperties=$additionalProperties}"
        }

        class PasskeyCredentialVerifyRequest
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val assertion: JsonField<Assertion>,
            private val clientPublicKey: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("assertion")
                @ExcludeMissing
                assertion: JsonField<Assertion> = JsonMissing.of(),
                @JsonProperty("clientPublicKey")
                @ExcludeMissing
                clientPublicKey: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(assertion, clientPublicKey, type, mutableMapOf())

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun assertion(): Assertion = assertion.getRequired("assertion")

            /**
             * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04
             * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
             * total). The matching private key must remain on the client. Grid encrypts the session
             * signing key returned in the response to this public key. The key is ephemeral and
             * one-time-use per verification request.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun clientPublicKey(): String = clientPublicKey.getRequired("clientPublicKey")

            /**
             * Discriminator value identifying this as a passkey verification.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [assertion].
             *
             * Unlike [assertion], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("assertion")
            @ExcludeMissing
            fun _assertion(): JsonField<Assertion> = assertion

            /**
             * Returns the raw JSON value of [clientPublicKey].
             *
             * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("clientPublicKey")
            @ExcludeMissing
            fun _clientPublicKey(): JsonField<String> = clientPublicKey

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
                 * [PasskeyCredentialVerifyRequest].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .assertion()
                 * .clientPublicKey()
                 * .type()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PasskeyCredentialVerifyRequest]. */
            class Builder internal constructor() {

                private var assertion: JsonField<Assertion>? = null
                private var clientPublicKey: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(passkeyCredentialVerifyRequest: PasskeyCredentialVerifyRequest) =
                    apply {
                        assertion = passkeyCredentialVerifyRequest.assertion
                        clientPublicKey = passkeyCredentialVerifyRequest.clientPublicKey
                        type = passkeyCredentialVerifyRequest.type
                        additionalProperties =
                            passkeyCredentialVerifyRequest.additionalProperties.toMutableMap()
                    }

                fun assertion(assertion: Assertion) = assertion(JsonField.of(assertion))

                /**
                 * Sets [Builder.assertion] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.assertion] with a well-typed [Assertion] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun assertion(assertion: JsonField<Assertion>) = apply {
                    this.assertion = assertion
                }

                /**
                 * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (0x04
                 * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
                 * total). The matching private key must remain on the client. Grid encrypts the
                 * session signing key returned in the response to this public key. The key is
                 * ephemeral and one-time-use per verification request.
                 */
                fun clientPublicKey(clientPublicKey: String) =
                    clientPublicKey(JsonField.of(clientPublicKey))

                /**
                 * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.clientPublicKey] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
                    this.clientPublicKey = clientPublicKey
                }

                /** Discriminator value identifying this as a passkey verification. */
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
                 * Returns an immutable instance of [PasskeyCredentialVerifyRequest].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .assertion()
                 * .clientPublicKey()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PasskeyCredentialVerifyRequest =
                    PasskeyCredentialVerifyRequest(
                        checkRequired("assertion", assertion),
                        checkRequired("clientPublicKey", clientPublicKey),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PasskeyCredentialVerifyRequest = apply {
                if (validated) {
                    return@apply
                }

                assertion().validate()
                clientPublicKey()
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
                (assertion.asKnown()?.validity() ?: 0) +
                    (if (clientPublicKey.asKnown() == null) 0 else 1) +
                    (type.asKnown()?.validity() ?: 0)

            class Assertion
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val authenticatorData: JsonField<String>,
                private val clientDataJson: JsonField<String>,
                private val credentialId: JsonField<String>,
                private val signature: JsonField<String>,
                private val userHandle: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("authenticatorData")
                    @ExcludeMissing
                    authenticatorData: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("clientDataJson")
                    @ExcludeMissing
                    clientDataJson: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("credentialId")
                    @ExcludeMissing
                    credentialId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("signature")
                    @ExcludeMissing
                    signature: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("userHandle")
                    @ExcludeMissing
                    userHandle: JsonField<String> = JsonMissing.of(),
                ) : this(
                    authenticatorData,
                    clientDataJson,
                    credentialId,
                    signature,
                    userHandle,
                    mutableMapOf(),
                )

                /**
                 * Base64url-encoded authenticator data returned by the authenticator during the
                 * assertion. Corresponds to `AuthenticatorAssertionResponse.authenticatorData`.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun authenticatorData(): String = authenticatorData.getRequired("authenticatorData")

                /**
                 * Base64url-encoded JSON client data collected by the browser during the WebAuthn
                 * `navigator.credentials.get()` call. Corresponds to
                 * `AuthenticatorAssertionResponse.clientDataJSON` from the WebAuthn spec — Grid's
                 * field name is intentionally camelCased as `clientDataJson` (lowercase JSON) for
                 * consistency with the rest of the API; the value is the same bytes the browser
                 * returns. Contains the challenge, origin, and `type: "webauthn.get"`.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun clientDataJson(): String = clientDataJson.getRequired("clientDataJson")

                /**
                 * Base64url-encoded credential identifier returned during the WebAuthn assertion.
                 * Corresponds to `PublicKeyCredential.rawId`.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun credentialId(): String = credentialId.getRequired("credentialId")

                /**
                 * Base64url-encoded signature produced by the authenticator over `authenticatorData
                 * || SHA-256(clientDataJSON)`. Corresponds to
                 * `AuthenticatorAssertionResponse.signature`. The signature byte format is
                 * determined by the credential's public-key algorithm — DER-encoded ECDSA for ES256
                 * (P-256, typical for passkeys), PKCS#1 v1.5 for RS256, or a raw 64-byte signature
                 * for EdDSA.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun signature(): String = signature.getRequired("signature")

                /**
                 * Base64url-encoded user handle returned by the authenticator. Corresponds to
                 * `AuthenticatorAssertionResponse.userHandle`. Populated (and required by the
                 * WebAuthn spec) for discoverable credentials — resident keys used in the "Sign in
                 * with passkey" autofill flow — and typically present for passkey registrations.
                 * Omit this field entirely for non-discoverable credentials specified via
                 * `allowCredentials` where the authenticator returns no user handle.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun userHandle(): String? = userHandle.getNullable("userHandle")

                /**
                 * Returns the raw JSON value of [authenticatorData].
                 *
                 * Unlike [authenticatorData], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("authenticatorData")
                @ExcludeMissing
                fun _authenticatorData(): JsonField<String> = authenticatorData

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
                 * Returns the raw JSON value of [signature].
                 *
                 * Unlike [signature], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("signature")
                @ExcludeMissing
                fun _signature(): JsonField<String> = signature

                /**
                 * Returns the raw JSON value of [userHandle].
                 *
                 * Unlike [userHandle], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("userHandle")
                @ExcludeMissing
                fun _userHandle(): JsonField<String> = userHandle

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
                     * Returns a mutable builder for constructing an instance of [Assertion].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .authenticatorData()
                     * .clientDataJson()
                     * .credentialId()
                     * .signature()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Assertion]. */
                class Builder internal constructor() {

                    private var authenticatorData: JsonField<String>? = null
                    private var clientDataJson: JsonField<String>? = null
                    private var credentialId: JsonField<String>? = null
                    private var signature: JsonField<String>? = null
                    private var userHandle: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(assertion: Assertion) = apply {
                        authenticatorData = assertion.authenticatorData
                        clientDataJson = assertion.clientDataJson
                        credentialId = assertion.credentialId
                        signature = assertion.signature
                        userHandle = assertion.userHandle
                        additionalProperties = assertion.additionalProperties.toMutableMap()
                    }

                    /**
                     * Base64url-encoded authenticator data returned by the authenticator during the
                     * assertion. Corresponds to `AuthenticatorAssertionResponse.authenticatorData`.
                     */
                    fun authenticatorData(authenticatorData: String) =
                        authenticatorData(JsonField.of(authenticatorData))

                    /**
                     * Sets [Builder.authenticatorData] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.authenticatorData] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun authenticatorData(authenticatorData: JsonField<String>) = apply {
                        this.authenticatorData = authenticatorData
                    }

                    /**
                     * Base64url-encoded JSON client data collected by the browser during the
                     * WebAuthn `navigator.credentials.get()` call. Corresponds to
                     * `AuthenticatorAssertionResponse.clientDataJSON` from the WebAuthn spec —
                     * Grid's field name is intentionally camelCased as `clientDataJson` (lowercase
                     * JSON) for consistency with the rest of the API; the value is the same bytes
                     * the browser returns. Contains the challenge, origin, and `type:
                     * "webauthn.get"`.
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
                     * Base64url-encoded credential identifier returned during the WebAuthn
                     * assertion. Corresponds to `PublicKeyCredential.rawId`.
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
                     * Base64url-encoded signature produced by the authenticator over
                     * `authenticatorData || SHA-256(clientDataJSON)`. Corresponds to
                     * `AuthenticatorAssertionResponse.signature`. The signature byte format is
                     * determined by the credential's public-key algorithm — DER-encoded ECDSA for
                     * ES256 (P-256, typical for passkeys), PKCS#1 v1.5 for RS256, or a raw 64-byte
                     * signature for EdDSA.
                     */
                    fun signature(signature: String) = signature(JsonField.of(signature))

                    /**
                     * Sets [Builder.signature] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.signature] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun signature(signature: JsonField<String>) = apply {
                        this.signature = signature
                    }

                    /**
                     * Base64url-encoded user handle returned by the authenticator. Corresponds to
                     * `AuthenticatorAssertionResponse.userHandle`. Populated (and required by the
                     * WebAuthn spec) for discoverable credentials — resident keys used in the "Sign
                     * in with passkey" autofill flow — and typically present for passkey
                     * registrations. Omit this field entirely for non-discoverable credentials
                     * specified via `allowCredentials` where the authenticator returns no user
                     * handle.
                     */
                    fun userHandle(userHandle: String) = userHandle(JsonField.of(userHandle))

                    /**
                     * Sets [Builder.userHandle] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.userHandle] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun userHandle(userHandle: JsonField<String>) = apply {
                        this.userHandle = userHandle
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
                     * Returns an immutable instance of [Assertion].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .authenticatorData()
                     * .clientDataJson()
                     * .credentialId()
                     * .signature()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Assertion =
                        Assertion(
                            checkRequired("authenticatorData", authenticatorData),
                            checkRequired("clientDataJson", clientDataJson),
                            checkRequired("credentialId", credentialId),
                            checkRequired("signature", signature),
                            userHandle,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Assertion = apply {
                    if (validated) {
                        return@apply
                    }

                    authenticatorData()
                    clientDataJson()
                    credentialId()
                    signature()
                    userHandle()
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
                    (if (authenticatorData.asKnown() == null) 0 else 1) +
                        (if (clientDataJson.asKnown() == null) 0 else 1) +
                        (if (credentialId.asKnown() == null) 0 else 1) +
                        (if (signature.asKnown() == null) 0 else 1) +
                        (if (userHandle.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Assertion &&
                        authenticatorData == other.authenticatorData &&
                        clientDataJson == other.clientDataJson &&
                        credentialId == other.credentialId &&
                        signature == other.signature &&
                        userHandle == other.userHandle &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        authenticatorData,
                        clientDataJson,
                        credentialId,
                        signature,
                        userHandle,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Assertion{authenticatorData=$authenticatorData, clientDataJson=$clientDataJson, credentialId=$credentialId, signature=$signature, userHandle=$userHandle, additionalProperties=$additionalProperties}"
            }

            /** Discriminator value identifying this as a passkey verification. */
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

                return other is PasskeyCredentialVerifyRequest &&
                    assertion == other.assertion &&
                    clientPublicKey == other.clientPublicKey &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(assertion, clientPublicKey, type, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PasskeyCredentialVerifyRequest{assertion=$assertion, clientPublicKey=$clientPublicKey, type=$type, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CredentialVerifyParams &&
            id == other.id &&
            requestId == other.requestId &&
            authCredentialVerifyRequest == other.authCredentialVerifyRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            requestId,
            authCredentialVerifyRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CredentialVerifyParams{id=$id, requestId=$requestId, authCredentialVerifyRequest=$authCredentialVerifyRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
