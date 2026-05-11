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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class PasskeyAttestation
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
    ) : this(attestationObject, clientDataJson, credentialId, transports, mutableMapOf())

    /**
     * Base64url-encoded CBOR attestation object produced by the authenticator during registration.
     * Corresponds to `AuthenticatorAttestationResponse.attestationObject`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun attestationObject(): String = attestationObject.getRequired("attestationObject")

    /**
     * Base64url-encoded JSON client data collected by the browser during the WebAuthn
     * `navigator.credentials.create()` call. Corresponds to
     * `AuthenticatorAttestationResponse.clientDataJSON` from the WebAuthn spec — Grid's field name
     * is intentionally camelCased as `clientDataJson` (lowercase JSON) for consistency with the
     * rest of the API; the value is the same bytes the browser returns. Contains the challenge,
     * origin, and `type: "webauthn.create"`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientDataJson(): String = clientDataJson.getRequired("clientDataJson")

    /**
     * Base64url-encoded credential identifier produced by the authenticator at registration time.
     * Typically the base64url of `PublicKeyCredential.rawId`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun credentialId(): String = credentialId.getRequired("credentialId")

    /**
     * Optional. WebAuthn transports as returned by
     * `AuthenticatorAttestationResponse.getTransports()`. Values follow the W3C
     * `AuthenticatorTransport` enum — pass the raw values through to Grid; provider-specific
     * translation is handled server-side. Some authenticators return an empty array; omit the field
     * or send `[]` in that case.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transports(): List<Transport>? = transports.getNullable("transports")

    /**
     * Returns the raw JSON value of [attestationObject].
     *
     * Unlike [attestationObject], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("attestationObject")
    @ExcludeMissing
    fun _attestationObject(): JsonField<String> = attestationObject

    /**
     * Returns the raw JSON value of [clientDataJson].
     *
     * Unlike [clientDataJson], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("clientDataJson")
    @ExcludeMissing
    fun _clientDataJson(): JsonField<String> = clientDataJson

    /**
     * Returns the raw JSON value of [credentialId].
     *
     * Unlike [credentialId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credentialId")
    @ExcludeMissing
    fun _credentialId(): JsonField<String> = credentialId

    /**
     * Returns the raw JSON value of [transports].
     *
     * Unlike [transports], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of [PasskeyAttestation].
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

    /** A builder for [PasskeyAttestation]. */
    class Builder internal constructor() {

        private var attestationObject: JsonField<String>? = null
        private var clientDataJson: JsonField<String>? = null
        private var credentialId: JsonField<String>? = null
        private var transports: JsonField<MutableList<Transport>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(passkeyAttestation: PasskeyAttestation) = apply {
            attestationObject = passkeyAttestation.attestationObject
            clientDataJson = passkeyAttestation.clientDataJson
            credentialId = passkeyAttestation.credentialId
            transports = passkeyAttestation.transports.map { it.toMutableList() }
            additionalProperties = passkeyAttestation.additionalProperties.toMutableMap()
        }

        /**
         * Base64url-encoded CBOR attestation object produced by the authenticator during
         * registration. Corresponds to `AuthenticatorAttestationResponse.attestationObject`.
         */
        fun attestationObject(attestationObject: String) =
            attestationObject(JsonField.of(attestationObject))

        /**
         * Sets [Builder.attestationObject] to an arbitrary JSON value.
         *
         * You should usually call [Builder.attestationObject] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun attestationObject(attestationObject: JsonField<String>) = apply {
            this.attestationObject = attestationObject
        }

        /**
         * Base64url-encoded JSON client data collected by the browser during the WebAuthn
         * `navigator.credentials.create()` call. Corresponds to
         * `AuthenticatorAttestationResponse.clientDataJSON` from the WebAuthn spec — Grid's field
         * name is intentionally camelCased as `clientDataJson` (lowercase JSON) for consistency
         * with the rest of the API; the value is the same bytes the browser returns. Contains the
         * challenge, origin, and `type: "webauthn.create"`.
         */
        fun clientDataJson(clientDataJson: String) = clientDataJson(JsonField.of(clientDataJson))

        /**
         * Sets [Builder.clientDataJson] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientDataJson] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientDataJson(clientDataJson: JsonField<String>) = apply {
            this.clientDataJson = clientDataJson
        }

        /**
         * Base64url-encoded credential identifier produced by the authenticator at registration
         * time. Typically the base64url of `PublicKeyCredential.rawId`.
         */
        fun credentialId(credentialId: String) = credentialId(JsonField.of(credentialId))

        /**
         * Sets [Builder.credentialId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credentialId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun credentialId(credentialId: JsonField<String>) = apply {
            this.credentialId = credentialId
        }

        /**
         * Optional. WebAuthn transports as returned by
         * `AuthenticatorAttestationResponse.getTransports()`. Values follow the W3C
         * `AuthenticatorTransport` enum — pass the raw values through to Grid; provider-specific
         * translation is handled server-side. Some authenticators return an empty array; omit the
         * field or send `[]` in that case.
         */
        fun transports(transports: List<Transport>) = transports(JsonField.of(transports))

        /**
         * Sets [Builder.transports] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transports] with a well-typed `List<Transport>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [PasskeyAttestation].
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
        fun build(): PasskeyAttestation =
            PasskeyAttestation(
                checkRequired("attestationObject", attestationObject),
                checkRequired("clientDataJson", clientDataJson),
                checkRequired("credentialId", credentialId),
                (transports ?: JsonMissing.of()).map { it.toImmutable() },
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
    fun validate(): PasskeyAttestation = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (attestationObject.asKnown() == null) 0 else 1) +
            (if (clientDataJson.asKnown() == null) 0 else 1) +
            (if (credentialId.asKnown() == null) 0 else 1) +
            (transports.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    class Transport @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * An enum containing [Transport]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Transport] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USB,
            NFC,
            BLE,
            INTERNAL,
            HYBRID,
            /**
             * An enum member indicating that [Transport] was instantiated with an unknown value.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                USB -> Known.USB
                NFC -> Known.NFC
                BLE -> Known.BLE
                INTERNAL -> Known.INTERNAL
                HYBRID -> Known.HYBRID
                else -> throw LightsparkGridInvalidDataException("Unknown Transport: $value")
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

        return other is PasskeyAttestation &&
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
        "PasskeyAttestation{attestationObject=$attestationObject, clientDataJson=$clientDataJson, credentialId=$credentialId, transports=$transports, additionalProperties=$additionalProperties}"
}
