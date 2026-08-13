// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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
 * Completes a `WALLET_SIGNATURE` challenge by submitting the signature the wallet produced for the
 * challenge's `messageToSign`.
 */
class OwnershipVerifyRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val signature: JsonField<String>,
    private val signatureScheme: JsonField<SignatureScheme>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("signature") @ExcludeMissing signature: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signatureScheme")
        @ExcludeMissing
        signatureScheme: JsonField<SignatureScheme> = JsonMissing.of(),
    ) : this(signature, signatureScheme, mutableMapOf())

    /**
     * The signature produced over the exact `messageToSign` — EIP-191 hex for EVM chains, base64
     * for Bitcoin, base58-encoded Ed25519 for Solana.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun signature(): String = signature.getRequired("signature")

    /**
     * Bitcoin message-signing format. Defaults to `bip137`; use `electrum` for Electrum/Sparrow
     * wallets. Ignored for non-Bitcoin chains.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun signatureScheme(): SignatureScheme? = signatureScheme.getNullable("signatureScheme")

    /**
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signature") @ExcludeMissing fun _signature(): JsonField<String> = signature

    /**
     * Returns the raw JSON value of [signatureScheme].
     *
     * Unlike [signatureScheme], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signatureScheme")
    @ExcludeMissing
    fun _signatureScheme(): JsonField<SignatureScheme> = signatureScheme

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
         * Returns a mutable builder for constructing an instance of [OwnershipVerifyRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .signature()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OwnershipVerifyRequest]. */
    class Builder internal constructor() {

        private var signature: JsonField<String>? = null
        private var signatureScheme: JsonField<SignatureScheme> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(ownershipVerifyRequest: OwnershipVerifyRequest) = apply {
            signature = ownershipVerifyRequest.signature
            signatureScheme = ownershipVerifyRequest.signatureScheme
            additionalProperties = ownershipVerifyRequest.additionalProperties.toMutableMap()
        }

        /**
         * The signature produced over the exact `messageToSign` — EIP-191 hex for EVM chains,
         * base64 for Bitcoin, base58-encoded Ed25519 for Solana.
         */
        fun signature(signature: String) = signature(JsonField.of(signature))

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signature(signature: JsonField<String>) = apply { this.signature = signature }

        /**
         * Bitcoin message-signing format. Defaults to `bip137`; use `electrum` for Electrum/Sparrow
         * wallets. Ignored for non-Bitcoin chains.
         */
        fun signatureScheme(signatureScheme: SignatureScheme) =
            signatureScheme(JsonField.of(signatureScheme))

        /**
         * Sets [Builder.signatureScheme] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signatureScheme] with a well-typed [SignatureScheme]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun signatureScheme(signatureScheme: JsonField<SignatureScheme>) = apply {
            this.signatureScheme = signatureScheme
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
         * Returns an immutable instance of [OwnershipVerifyRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .signature()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OwnershipVerifyRequest =
            OwnershipVerifyRequest(
                checkRequired("signature", signature),
                signatureScheme,
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
    fun validate(): OwnershipVerifyRequest = apply {
        if (validated) {
            return@apply
        }

        signature()
        signatureScheme()?.validate()
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
        (if (signature.asKnown() == null) 0 else 1) + (signatureScheme.asKnown()?.validity() ?: 0)

    /**
     * Bitcoin message-signing format. Defaults to `bip137`; use `electrum` for Electrum/Sparrow
     * wallets. Ignored for non-Bitcoin chains.
     */
    class SignatureScheme @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val BIP137 = of("bip137")

            val ELECTRUM = of("electrum")

            fun of(value: String) = SignatureScheme(JsonField.of(value))
        }

        /** An enum containing [SignatureScheme]'s known values. */
        enum class Known {
            BIP137,
            ELECTRUM,
        }

        /**
         * An enum containing [SignatureScheme]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SignatureScheme] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BIP137,
            ELECTRUM,
            /**
             * An enum member indicating that [SignatureScheme] was instantiated with an unknown
             * value.
             */
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
                BIP137 -> Value.BIP137
                ELECTRUM -> Value.ELECTRUM
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
                BIP137 -> Known.BIP137
                ELECTRUM -> Known.ELECTRUM
                else -> throw LightsparkGridInvalidDataException("Unknown SignatureScheme: $value")
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
        fun validate(): SignatureScheme = apply {
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

            return other is SignatureScheme && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnershipVerifyRequest &&
            signature == other.signature &&
            signatureScheme == other.signatureScheme &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(signature, signatureScheme, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OwnershipVerifyRequest{signature=$signature, signatureScheme=$signatureScheme, additionalProperties=$additionalProperties}"
}
