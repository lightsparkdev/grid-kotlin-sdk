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

class PasskeyCredentialCreateRequestFields
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val attestation: JsonField<PasskeyAttestation>,
    private val challenge: JsonField<String>,
    private val nickname: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("attestation")
        @ExcludeMissing
        attestation: JsonField<PasskeyAttestation> = JsonMissing.of(),
        @JsonProperty("challenge") @ExcludeMissing challenge: JsonField<String> = JsonMissing.of(),
        @JsonProperty("nickname") @ExcludeMissing nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(attestation, challenge, nickname, type, mutableMapOf())

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attestation(): PasskeyAttestation = attestation.getRequired("attestation")

    /**
     * Base64url-encoded WebAuthn challenge issued by the platform backend and passed to the client
     * before `navigator.credentials.create()`. Grid verifies it matches the challenge embedded in
     * the attestation's `clientDataJson`, binding the attestation to this registration. Must be
     * single-use.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun challenge(): String = challenge.getRequired("challenge")

    /**
     * Human-readable identifier for the passkey, chosen by the user at registration time (e.g.
     * "iPhone Face-ID", "YubiKey 5C"). Leading and trailing whitespace is ignored. Must be 1-100
     * characters and may contain Unicode letters, numbers, spaces, and the following separators:
     * period, underscore, hyphen, apostrophe, and parentheses. Shown back on AuthMethod responses
     * and in credential listings.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun nickname(): String = nickname.getRequired("nickname")

    /**
     * Discriminator value identifying this as a passkey credential.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [attestation].
     *
     * Unlike [attestation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("attestation")
    @ExcludeMissing
    fun _attestation(): JsonField<PasskeyAttestation> = attestation

    /**
     * Returns the raw JSON value of [challenge].
     *
     * Unlike [challenge], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("challenge") @ExcludeMissing fun _challenge(): JsonField<String> = challenge

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
         * [PasskeyCredentialCreateRequestFields].
         *
         * The following fields are required:
         * ```kotlin
         * .attestation()
         * .challenge()
         * .nickname()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PasskeyCredentialCreateRequestFields]. */
    class Builder internal constructor() {

        private var attestation: JsonField<PasskeyAttestation>? = null
        private var challenge: JsonField<String>? = null
        private var nickname: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            passkeyCredentialCreateRequestFields: PasskeyCredentialCreateRequestFields
        ) = apply {
            attestation = passkeyCredentialCreateRequestFields.attestation
            challenge = passkeyCredentialCreateRequestFields.challenge
            nickname = passkeyCredentialCreateRequestFields.nickname
            type = passkeyCredentialCreateRequestFields.type
            additionalProperties =
                passkeyCredentialCreateRequestFields.additionalProperties.toMutableMap()
        }

        fun attestation(attestation: PasskeyAttestation) = attestation(JsonField.of(attestation))

        /**
         * Sets [Builder.attestation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attestation] with a well-typed [PasskeyAttestation]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun attestation(attestation: JsonField<PasskeyAttestation>) = apply {
            this.attestation = attestation
        }

        /**
         * Base64url-encoded WebAuthn challenge issued by the platform backend and passed to the
         * client before `navigator.credentials.create()`. Grid verifies it matches the challenge
         * embedded in the attestation's `clientDataJson`, binding the attestation to this
         * registration. Must be single-use.
         */
        fun challenge(challenge: String) = challenge(JsonField.of(challenge))

        /**
         * Sets [Builder.challenge] to an arbitrary JSON value.
         *
         * You should usually call [Builder.challenge] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun challenge(challenge: JsonField<String>) = apply { this.challenge = challenge }

        /**
         * Human-readable identifier for the passkey, chosen by the user at registration time (e.g.
         * "iPhone Face-ID", "YubiKey 5C"). Leading and trailing whitespace is ignored. Must be
         * 1-100 characters and may contain Unicode letters, numbers, spaces, and the following
         * separators: period, underscore, hyphen, apostrophe, and parentheses. Shown back on
         * AuthMethod responses and in credential listings.
         */
        fun nickname(nickname: String) = nickname(JsonField.of(nickname))

        /**
         * Sets [Builder.nickname] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nickname] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

        /** Discriminator value identifying this as a passkey credential. */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [PasskeyCredentialCreateRequestFields].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .attestation()
         * .challenge()
         * .nickname()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PasskeyCredentialCreateRequestFields =
            PasskeyCredentialCreateRequestFields(
                checkRequired("attestation", attestation),
                checkRequired("challenge", challenge),
                checkRequired("nickname", nickname),
                checkRequired("type", type),
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
    fun validate(): PasskeyCredentialCreateRequestFields = apply {
        if (validated) {
            return@apply
        }

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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (attestation.asKnown()?.validity() ?: 0) +
            (if (challenge.asKnown() == null) 0 else 1) +
            (if (nickname.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    /** Discriminator value identifying this as a passkey credential. */
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

            val PASSKEY = of("PASSKEY")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            PASSKEY
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
            PASSKEY,
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
                PASSKEY -> Value.PASSKEY
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
                PASSKEY -> Known.PASSKEY
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

        return other is PasskeyCredentialCreateRequestFields &&
            attestation == other.attestation &&
            challenge == other.challenge &&
            nickname == other.nickname &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(attestation, challenge, nickname, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PasskeyCredentialCreateRequestFields{attestation=$attestation, challenge=$challenge, nickname=$nickname, type=$type, additionalProperties=$additionalProperties}"
}
