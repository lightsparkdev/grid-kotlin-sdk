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
import java.util.Collections
import java.util.Objects

/**
 * Verify an SMS-OTP credential via the same secure two-leg flow as email OTP. The client
 * HPKE-encrypts the OTP code (together with its public key) under the `otpEncryptionTargetBundle`
 * returned from registration or `POST /auth/credentials/{id}/challenge`, submits the result here,
 * and receives `202` with a `payloadToSign` carrying a `verificationToken` bound to the client's
 * public key. The client signs that token with the matching private key and retries this request
 * with `Grid-Wallet-Signature` + `Request-Id` headers to obtain the session. Plaintext OTP codes
 * are never sent over the wire.
 */
class AuthCredentialVerifyRequestOneOf
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val type: JsonValue,
    private val encryptedOtpBundle: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing type: JsonValue = JsonMissing.of(),
        @JsonProperty("encryptedOtpBundle")
        @ExcludeMissing
        encryptedOtpBundle: JsonField<String> = JsonMissing.of(),
    ) : this(type, encryptedOtpBundle, mutableMapOf())

    fun toAuthCredentialVerifyRequest(): AuthCredentialVerifyRequest =
        AuthCredentialVerifyRequest.builder().type(type).build()

    /**
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```kotlin
     * val myObject: MyClass = authCredentialVerifyRequestOneOf.type().convert(MyClass::class.java)
     * ```
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonValue = type

    /**
     * HPKE-sealed OTP attempt. Same format and retry semantics as
     * `EmailOtpCredentialVerifyRequest.encryptedOtpBundle`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun encryptedOtpBundle(): String = encryptedOtpBundle.getRequired("encryptedOtpBundle")

    /**
     * Returns the raw JSON value of [encryptedOtpBundle].
     *
     * Unlike [encryptedOtpBundle], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("encryptedOtpBundle")
    @ExcludeMissing
    fun _encryptedOtpBundle(): JsonField<String> = encryptedOtpBundle

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
         * [AuthCredentialVerifyRequestOneOf].
         *
         * The following fields are required:
         * ```kotlin
         * .type()
         * .encryptedOtpBundle()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthCredentialVerifyRequestOneOf]. */
    class Builder internal constructor() {

        private var type: JsonValue? = null
        private var encryptedOtpBundle: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authCredentialVerifyRequestOneOf: AuthCredentialVerifyRequestOneOf) =
            apply {
                type = authCredentialVerifyRequestOneOf.type
                encryptedOtpBundle = authCredentialVerifyRequestOneOf.encryptedOtpBundle
                additionalProperties =
                    authCredentialVerifyRequestOneOf.additionalProperties.toMutableMap()
            }

        fun type(type: JsonValue) = apply { this.type = type }

        /**
         * HPKE-sealed OTP attempt. Same format and retry semantics as
         * `EmailOtpCredentialVerifyRequest.encryptedOtpBundle`.
         */
        fun encryptedOtpBundle(encryptedOtpBundle: String) =
            encryptedOtpBundle(JsonField.of(encryptedOtpBundle))

        /**
         * Sets [Builder.encryptedOtpBundle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encryptedOtpBundle] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun encryptedOtpBundle(encryptedOtpBundle: JsonField<String>) = apply {
            this.encryptedOtpBundle = encryptedOtpBundle
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
         * Returns an immutable instance of [AuthCredentialVerifyRequestOneOf].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .type()
         * .encryptedOtpBundle()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthCredentialVerifyRequestOneOf =
            AuthCredentialVerifyRequestOneOf(
                checkRequired("type", type),
                checkRequired("encryptedOtpBundle", encryptedOtpBundle),
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): AuthCredentialVerifyRequestOneOf = apply {
        if (validated) {
            return@apply
        }

        encryptedOtpBundle()
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
    internal fun validity(): Int = (if (encryptedOtpBundle.asKnown() == null) 0 else 1)

    /** Discriminator value identifying this as an SMS OTP verification. */
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS_OTP,
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
                SMS_OTP -> Value.SMS_OTP
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
                SMS_OTP -> Known.SMS_OTP
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
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

        return other is AuthCredentialVerifyRequestOneOf &&
            type == other.type &&
            encryptedOtpBundle == other.encryptedOtpBundle &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(type, encryptedOtpBundle, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthCredentialVerifyRequestOneOf{type=$type, encryptedOtpBundle=$encryptedOtpBundle, additionalProperties=$additionalProperties}"
}
