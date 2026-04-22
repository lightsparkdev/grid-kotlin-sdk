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
 * `POST /auth/credentials/{id}/verify`.
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
        private val _json: JsonValue? = null,
    ) {

        fun emailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest? =
            emailOtpCredentialCreateRequest

        fun oauthCredentialCreateRequest(): OAuthCredentialCreateRequest? =
            oauthCredentialCreateRequest

        fun isEmailOtpCredentialCreateRequest(): Boolean = emailOtpCredentialCreateRequest != null

        fun isOAuthCredentialCreateRequest(): Boolean = oauthCredentialCreateRequest != null

        fun asEmailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest =
            emailOtpCredentialCreateRequest.getOrThrow("emailOtpCredentialCreateRequest")

        fun asOAuthCredentialCreateRequest(): OAuthCredentialCreateRequest =
            oauthCredentialCreateRequest.getOrThrow("oauthCredentialCreateRequest")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                emailOtpCredentialCreateRequest != null ->
                    visitor.visitEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest)
                oauthCredentialCreateRequest != null ->
                    visitor.visitOAuthCredentialCreateRequest(oauthCredentialCreateRequest)
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

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                emailOtpCredentialCreateRequest == other.emailOtpCredentialCreateRequest &&
                oauthCredentialCreateRequest == other.oauthCredentialCreateRequest
        }

        override fun hashCode(): Int =
            Objects.hash(emailOtpCredentialCreateRequest, oauthCredentialCreateRequest)

        override fun toString(): String =
            when {
                emailOtpCredentialCreateRequest != null ->
                    "Body{emailOtpCredentialCreateRequest=$emailOtpCredentialCreateRequest}"
                oauthCredentialCreateRequest != null ->
                    "Body{oauthCredentialCreateRequest=$oauthCredentialCreateRequest}"
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
        }

        /** An interface that defines how to map each variant of [Body] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitEmailOtpCredentialCreateRequest(
                emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
            ): T

            fun visitOAuthCredentialCreateRequest(
                oauthCredentialCreateRequest: OAuthCredentialCreateRequest
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
