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

@JsonDeserialize(using = AuthCredentialCreateRequestOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialCreateRequestOneOf.Serializer::class)
class AuthCredentialCreateRequestOneOf
private constructor(
    private val emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest? = null,
    private val smsOtpCredentialCreateRequest: SmsOtpCredentialCreateRequest? = null,
    private val oauthCredentialCreateRequest: OAuthCredentialCreateRequest? = null,
    private val passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun emailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest? =
        emailOtpCredentialCreateRequest

    fun smsOtpCredentialCreateRequest(): SmsOtpCredentialCreateRequest? =
        smsOtpCredentialCreateRequest

    fun oauthCredentialCreateRequest(): OAuthCredentialCreateRequest? = oauthCredentialCreateRequest

    fun passkeyCredentialCreateRequest(): PasskeyCredentialCreateRequest? =
        passkeyCredentialCreateRequest

    fun isEmailOtpCredentialCreateRequest(): Boolean = emailOtpCredentialCreateRequest != null

    fun isSmsOtpCredentialCreateRequest(): Boolean = smsOtpCredentialCreateRequest != null

    fun isOAuthCredentialCreateRequest(): Boolean = oauthCredentialCreateRequest != null

    fun isPasskeyCredentialCreateRequest(): Boolean = passkeyCredentialCreateRequest != null

    fun asEmailOtpCredentialCreateRequest(): EmailOtpCredentialCreateRequest =
        emailOtpCredentialCreateRequest.getOrThrow("emailOtpCredentialCreateRequest")

    fun asSmsOtpCredentialCreateRequest(): SmsOtpCredentialCreateRequest =
        smsOtpCredentialCreateRequest.getOrThrow("smsOtpCredentialCreateRequest")

    fun asOAuthCredentialCreateRequest(): OAuthCredentialCreateRequest =
        oauthCredentialCreateRequest.getOrThrow("oauthCredentialCreateRequest")

    fun asPasskeyCredentialCreateRequest(): PasskeyCredentialCreateRequest =
        passkeyCredentialCreateRequest.getOrThrow("passkeyCredentialCreateRequest")

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
     * val result: String? = authCredentialCreateRequestOneOf.accept(object : AuthCredentialCreateRequestOneOf.Visitor<String?> {
     *     override fun visitEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest): String? = emailOtpCredentialCreateRequest.toString()
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
            emailOtpCredentialCreateRequest != null ->
                visitor.visitEmailOtpCredentialCreateRequest(emailOtpCredentialCreateRequest)
            smsOtpCredentialCreateRequest != null ->
                visitor.visitSmsOtpCredentialCreateRequest(smsOtpCredentialCreateRequest)
            oauthCredentialCreateRequest != null ->
                visitor.visitOAuthCredentialCreateRequest(oauthCredentialCreateRequest)
            passkeyCredentialCreateRequest != null ->
                visitor.visitPasskeyCredentialCreateRequest(passkeyCredentialCreateRequest)
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
    fun validate(): AuthCredentialCreateRequestOneOf = apply {
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

                override fun visitSmsOtpCredentialCreateRequest(
                    smsOtpCredentialCreateRequest: SmsOtpCredentialCreateRequest
                ) {
                    smsOtpCredentialCreateRequest.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitEmailOtpCredentialCreateRequest(
                    emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
                ) = emailOtpCredentialCreateRequest.validity()

                override fun visitSmsOtpCredentialCreateRequest(
                    smsOtpCredentialCreateRequest: SmsOtpCredentialCreateRequest
                ) = smsOtpCredentialCreateRequest.validity()

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

        return other is AuthCredentialCreateRequestOneOf &&
            emailOtpCredentialCreateRequest == other.emailOtpCredentialCreateRequest &&
            smsOtpCredentialCreateRequest == other.smsOtpCredentialCreateRequest &&
            oauthCredentialCreateRequest == other.oauthCredentialCreateRequest &&
            passkeyCredentialCreateRequest == other.passkeyCredentialCreateRequest
    }

    override fun hashCode(): Int =
        Objects.hash(
            emailOtpCredentialCreateRequest,
            smsOtpCredentialCreateRequest,
            oauthCredentialCreateRequest,
            passkeyCredentialCreateRequest,
        )

    override fun toString(): String =
        when {
            emailOtpCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{emailOtpCredentialCreateRequest=$emailOtpCredentialCreateRequest}"
            smsOtpCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{smsOtpCredentialCreateRequest=$smsOtpCredentialCreateRequest}"
            oauthCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{oauthCredentialCreateRequest=$oauthCredentialCreateRequest}"
            passkeyCredentialCreateRequest != null ->
                "AuthCredentialCreateRequestOneOf{passkeyCredentialCreateRequest=$passkeyCredentialCreateRequest}"
            _json != null -> "AuthCredentialCreateRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
        }

    companion object {

        fun ofEmailOtpCredentialCreateRequest(
            emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                emailOtpCredentialCreateRequest = emailOtpCredentialCreateRequest
            )

        fun ofSmsOtpCredentialCreateRequest(
            smsOtpCredentialCreateRequest: SmsOtpCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                smsOtpCredentialCreateRequest = smsOtpCredentialCreateRequest
            )

        fun ofOAuthCredentialCreateRequest(
            oauthCredentialCreateRequest: OAuthCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                oauthCredentialCreateRequest = oauthCredentialCreateRequest
            )

        fun ofPasskeyCredentialCreateRequest(
            passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
        ) =
            AuthCredentialCreateRequestOneOf(
                passkeyCredentialCreateRequest = passkeyCredentialCreateRequest
            )
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialCreateRequestOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitEmailOtpCredentialCreateRequest(
            emailOtpCredentialCreateRequest: EmailOtpCredentialCreateRequest
        ): T

        fun visitSmsOtpCredentialCreateRequest(
            smsOtpCredentialCreateRequest: SmsOtpCredentialCreateRequest
        ): T

        fun visitOAuthCredentialCreateRequest(
            oauthCredentialCreateRequest: OAuthCredentialCreateRequest
        ): T

        fun visitPasskeyCredentialCreateRequest(
            passkeyCredentialCreateRequest: PasskeyCredentialCreateRequest
        ): T

        /**
         * Maps an unknown variant of [AuthCredentialCreateRequestOneOf] to a value of type [T].
         *
         * An instance of [AuthCredentialCreateRequestOneOf] can contain an unknown variant if it
         * was deserialized from data that doesn't match any known variant. For example, if the SDK
         * is on an older version than the API, then the API may respond with new variants that the
         * SDK is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException(
                "Unknown AuthCredentialCreateRequestOneOf: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<AuthCredentialCreateRequestOneOf>(
            AuthCredentialCreateRequestOneOf::class
        ) {

        override fun ObjectCodec.deserialize(node: JsonNode): AuthCredentialCreateRequestOneOf {
            val json = JsonValue.fromJsonNode(node)
            val type = json.asObject()?.get("type")?.asString()

            when (type) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialCreateRequest>())
                            ?.let {
                                AuthCredentialCreateRequestOneOf(
                                    emailOtpCredentialCreateRequest = it,
                                    _json = json,
                                )
                            },
                        tryDeserialize(node, jacksonTypeRef<SmsOtpCredentialCreateRequest>())?.let {
                            AuthCredentialCreateRequestOneOf(
                                smsOtpCredentialCreateRequest = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<OAuthCredentialCreateRequest>())?.let {
                            AuthCredentialCreateRequestOneOf(
                                oauthCredentialCreateRequest = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<PasskeyCredentialCreateRequest>())
                            ?.let {
                                AuthCredentialCreateRequestOneOf(
                                    passkeyCredentialCreateRequest = it,
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
                0 -> AuthCredentialCreateRequestOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<AuthCredentialCreateRequestOneOf>(AuthCredentialCreateRequestOneOf::class) {

        override fun serialize(
            value: AuthCredentialCreateRequestOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.emailOtpCredentialCreateRequest != null ->
                    generator.writeObject(value.emailOtpCredentialCreateRequest)
                value.smsOtpCredentialCreateRequest != null ->
                    generator.writeObject(value.smsOtpCredentialCreateRequest)
                value.oauthCredentialCreateRequest != null ->
                    generator.writeObject(value.oauthCredentialCreateRequest)
                value.passkeyCredentialCreateRequest != null ->
                    generator.writeObject(value.passkeyCredentialCreateRequest)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
            }
        }
    }

    class SmsOtpCredentialCreateRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val type: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        ) : this(accountId, type, mutableMapOf())

        fun toAuthCredentialCreateRequest(): AuthCredentialCreateRequest =
            AuthCredentialCreateRequest.builder().accountId(accountId).type(type).build()

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
         * val myObject: MyClass = smsOtpCredentialCreateRequest.type().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

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
             * [SmsOtpCredentialCreateRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SmsOtpCredentialCreateRequest]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var type: JsonValue? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(smsOtpCredentialCreateRequest: SmsOtpCredentialCreateRequest) =
                apply {
                    accountId = smsOtpCredentialCreateRequest.accountId
                    type = smsOtpCredentialCreateRequest.type
                    additionalProperties =
                        smsOtpCredentialCreateRequest.additionalProperties.toMutableMap()
                }

            /** Identifier of the internal account that this credential will authenticate. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            fun type(type: JsonValue) = apply { this.type = type }

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
             * Returns an immutable instance of [SmsOtpCredentialCreateRequest].
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
            fun build(): SmsOtpCredentialCreateRequest =
                SmsOtpCredentialCreateRequest(
                    checkRequired("accountId", accountId),
                    checkRequired("type", type),
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
        fun validate(): SmsOtpCredentialCreateRequest = apply {
            if (validated) {
                return@apply
            }

            accountId()
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
        internal fun validity(): Int = (if (accountId.asKnown() == null) 0 else 1)

        /** Discriminator value identifying this as an SMS OTP credential. */
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

                val SMS_OTP = of("SMS_OTP")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                SMS_OTP
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
                SMS_OTP,
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
                    SMS_OTP -> Value.SMS_OTP
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
                    SMS_OTP -> Known.SMS_OTP
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

            return other is SmsOtpCredentialCreateRequest &&
                accountId == other.accountId &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(accountId, type, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SmsOtpCredentialCreateRequest{accountId=$accountId, type=$type, additionalProperties=$additionalProperties}"
    }
}
