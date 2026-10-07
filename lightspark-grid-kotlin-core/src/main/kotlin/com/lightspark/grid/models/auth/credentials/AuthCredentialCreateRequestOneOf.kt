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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = AuthCredentialCreateRequestOneOf.Deserializer::class)
@JsonSerialize(using = AuthCredentialCreateRequestOneOf.Serializer::class)
class AuthCredentialCreateRequestOneOf
private constructor(
    private val emailOtp: EmailOtpCredentialCreateRequest? = null,
    private val smsOtp: SmsOtp? = null,
    private val oauth: OAuthCredentialCreateRequest? = null,
    private val passkey: PasskeyCredentialCreateRequest? = null,
    private val _json: JsonValue? = null,
) {

    fun emailOtp(): EmailOtpCredentialCreateRequest? = emailOtp

    fun smsOtp(): SmsOtp? = smsOtp

    fun oauth(): OAuthCredentialCreateRequest? = oauth

    fun passkey(): PasskeyCredentialCreateRequest? = passkey

    fun isEmailOtp(): Boolean = emailOtp != null

    fun isSmsOtp(): Boolean = smsOtp != null

    fun isOAuth(): Boolean = oauth != null

    fun isPasskey(): Boolean = passkey != null

    fun asEmailOtp(): EmailOtpCredentialCreateRequest = emailOtp.getOrThrow("emailOtp")

    fun asSmsOtp(): SmsOtp = smsOtp.getOrThrow("smsOtp")

    fun asOAuth(): OAuthCredentialCreateRequest = oauth.getOrThrow("oauth")

    fun asPasskey(): PasskeyCredentialCreateRequest = passkey.getOrThrow("passkey")

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
     *     override fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest): String? = emailOtp.toString()
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
            emailOtp != null -> visitor.visitEmailOtp(emailOtp)
            smsOtp != null -> visitor.visitSmsOtp(smsOtp)
            oauth != null -> visitor.visitOAuth(oauth)
            passkey != null -> visitor.visitPasskey(passkey)
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
                override fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest) {
                    emailOtp.validate()
                }

                override fun visitSmsOtp(smsOtp: SmsOtp) {
                    smsOtp.validate()
                }

                override fun visitOAuth(oauth: OAuthCredentialCreateRequest) {
                    oauth.validate()
                }

                override fun visitPasskey(passkey: PasskeyCredentialCreateRequest) {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest) =
                    emailOtp.validity()

                override fun visitSmsOtp(smsOtp: SmsOtp) = smsOtp.validity()

                override fun visitOAuth(oauth: OAuthCredentialCreateRequest) = oauth.validity()

                override fun visitPasskey(passkey: PasskeyCredentialCreateRequest) =
                    passkey.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthCredentialCreateRequestOneOf &&
            emailOtp == other.emailOtp &&
            smsOtp == other.smsOtp &&
            oauth == other.oauth &&
            passkey == other.passkey
    }

    override fun hashCode(): Int = Objects.hash(emailOtp, smsOtp, oauth, passkey)

    override fun toString(): String =
        when {
            emailOtp != null -> "AuthCredentialCreateRequestOneOf{emailOtp=$emailOtp}"
            smsOtp != null -> "AuthCredentialCreateRequestOneOf{smsOtp=$smsOtp}"
            oauth != null -> "AuthCredentialCreateRequestOneOf{oauth=$oauth}"
            passkey != null -> "AuthCredentialCreateRequestOneOf{passkey=$passkey}"
            _json != null -> "AuthCredentialCreateRequestOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
        }

    companion object {

        fun ofEmailOtp(emailOtp: EmailOtpCredentialCreateRequest) =
            AuthCredentialCreateRequestOneOf(emailOtp = emailOtp)

        fun ofSmsOtp(smsOtp: SmsOtp) = AuthCredentialCreateRequestOneOf(smsOtp = smsOtp)

        fun ofOAuth(oauth: OAuthCredentialCreateRequest) =
            AuthCredentialCreateRequestOneOf(oauth = oauth)

        fun ofPasskey(passkey: PasskeyCredentialCreateRequest) =
            AuthCredentialCreateRequestOneOf(passkey = passkey)
    }

    /**
     * An interface that defines how to map each variant of [AuthCredentialCreateRequestOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitEmailOtp(emailOtp: EmailOtpCredentialCreateRequest): T

        fun visitSmsOtp(smsOtp: SmsOtp): T

        fun visitOAuth(oauth: OAuthCredentialCreateRequest): T

        fun visitPasskey(passkey: PasskeyCredentialCreateRequest): T

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

            when (type) {
                "EMAIL_OTP" -> {
                    return tryDeserialize(node, jacksonTypeRef<EmailOtpCredentialCreateRequest>())
                        ?.let { AuthCredentialCreateRequestOneOf(emailOtp = it, _json = json) }
                        ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
                "SMS_OTP" -> {
                    return tryDeserialize(node, jacksonTypeRef<SmsOtp>())?.let {
                        AuthCredentialCreateRequestOneOf(smsOtp = it, _json = json)
                    } ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
                "OAUTH" -> {
                    return tryDeserialize(node, jacksonTypeRef<OAuthCredentialCreateRequest>())
                        ?.let { AuthCredentialCreateRequestOneOf(oauth = it, _json = json) }
                        ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
                "PASSKEY" -> {
                    return tryDeserialize(node, jacksonTypeRef<PasskeyCredentialCreateRequest>())
                        ?.let { AuthCredentialCreateRequestOneOf(passkey = it, _json = json) }
                        ?: AuthCredentialCreateRequestOneOf(_json = json)
                }
            }

            return AuthCredentialCreateRequestOneOf(_json = json)
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
                value.emailOtp != null -> generator.writeObject(value.emailOtp)
                value.smsOtp != null -> generator.writeObject(value.smsOtp)
                value.oauth != null -> generator.writeObject(value.oauth)
                value.passkey != null -> generator.writeObject(value.passkey)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid AuthCredentialCreateRequestOneOf")
            }
        }
    }

    class SmsOtp
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val type: JsonField<Type>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, type, phoneNumber, mutableMapOf())

        fun toAuthCredentialCreateRequest(): AuthCredentialCreateRequest =
            AuthCredentialCreateRequest.builder().accountId(accountId).build()

        /**
         * Identifier of the internal account that this credential will authenticate.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountId(): String? = accountId.getNullable("accountId")

        /**
         * Discriminator value identifying this as an SMS OTP credential.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * A new phone number, in strict E.164 format, to register as a replacement credential.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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
             * Returns a mutable builder for constructing an instance of [SmsOtp].
             *
             * The following fields are required:
             * ```kotlin
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SmsOtp]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type>? = null
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(smsOtp: SmsOtp) = apply {
                accountId = smsOtp.accountId
                type = smsOtp.type
                phoneNumber = smsOtp.phoneNumber
                additionalProperties = smsOtp.additionalProperties.toMutableMap()
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

            /** Discriminator value identifying this as an SMS OTP credential. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * A new phone number, in strict E.164 format, to register as a replacement credential.
             */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             * Returns an immutable instance of [SmsOtp].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SmsOtp =
                SmsOtp(
                    accountId,
                    checkRequired("type", type),
                    phoneNumber,
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
        fun validate(): SmsOtp = apply {
            if (validated) {
                return@apply
            }

            accountId()
            type().validate()
            phoneNumber()
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
                (type.asKnown()?.validity() ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1)

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

            return other is SmsOtp &&
                accountId == other.accountId &&
                type == other.type &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, type, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SmsOtp{accountId=$accountId, type=$type, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }
}
