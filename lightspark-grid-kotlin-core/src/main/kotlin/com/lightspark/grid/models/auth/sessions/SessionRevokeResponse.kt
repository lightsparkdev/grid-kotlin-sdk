// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

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
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * 202 response returned from Embedded Wallet Auth endpoints that require a signed retry — `POST
 * /auth/credentials` (adding an additional credential), `DELETE /auth/credentials/{id}` (revoking a
 * credential), and `DELETE /auth/sessions/{id}` (revoking a session). Carries the signing fields
 * from `SignedRequestChallenge` plus the `type` of the authentication credential involved (being
 * added, being revoked, or that issued the session being revoked). The client already knows the
 * target resource id from the request path / body it just sent, so nothing beyond `type` is echoed
 * in the response.
 */
class SessionRevokeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val payloadToSign: JsonField<String>,
    private val requestId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("payloadToSign")
        @ExcludeMissing
        payloadToSign: JsonField<String> = JsonMissing.of(),
        @JsonProperty("requestId") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(expiresAt, payloadToSign, requestId, type, mutableMapOf())

    /**
     * Timestamp after which this challenge is no longer valid. The signed retry must be submitted
     * before this time.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * Canonical payload for the retry authorization stamp. Build an API-key stamp over this exact
     * value with the session API keypair, then send the full base64url-encoded stamp in
     * `Grid-Wallet-Signature` on the retry that completes the original request.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun payloadToSign(): String = payloadToSign.getRequired("payloadToSign")

    /**
     * Unique identifier for this request. Must be echoed in the `Request-Id` header on the signed
     * retry so the server can correlate the retry with the issued challenge.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestId(): String = requestId.getRequired("requestId")

    /**
     * Credential type relevant to this challenge: the credential type being added (`POST
     * /auth/credentials`), the credential type being revoked (`DELETE /auth/credentials/{id}`), or
     * the type of credential that issued the session being revoked (`DELETE /auth/sessions/{id}`).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [payloadToSign].
     *
     * Unlike [payloadToSign], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payloadToSign")
    @ExcludeMissing
    fun _payloadToSign(): JsonField<String> = payloadToSign

    /**
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("requestId") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
         * Returns a mutable builder for constructing an instance of [SessionRevokeResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .payloadToSign()
         * .requestId()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SessionRevokeResponse]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var payloadToSign: JsonField<String>? = null
        private var requestId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sessionRevokeResponse: SessionRevokeResponse) = apply {
            expiresAt = sessionRevokeResponse.expiresAt
            payloadToSign = sessionRevokeResponse.payloadToSign
            requestId = sessionRevokeResponse.requestId
            type = sessionRevokeResponse.type
            additionalProperties = sessionRevokeResponse.additionalProperties.toMutableMap()
        }

        /**
         * Timestamp after which this challenge is no longer valid. The signed retry must be
         * submitted before this time.
         */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Canonical payload for the retry authorization stamp. Build an API-key stamp over this
         * exact value with the session API keypair, then send the full base64url-encoded stamp in
         * `Grid-Wallet-Signature` on the retry that completes the original request.
         */
        fun payloadToSign(payloadToSign: String) = payloadToSign(JsonField.of(payloadToSign))

        /**
         * Sets [Builder.payloadToSign] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payloadToSign] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payloadToSign(payloadToSign: JsonField<String>) = apply {
            this.payloadToSign = payloadToSign
        }

        /**
         * Unique identifier for this request. Must be echoed in the `Request-Id` header on the
         * signed retry so the server can correlate the retry with the issued challenge.
         */
        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

        /**
         * Credential type relevant to this challenge: the credential type being added (`POST
         * /auth/credentials`), the credential type being revoked (`DELETE /auth/credentials/{id}`),
         * or the type of credential that issued the session being revoked (`DELETE
         * /auth/sessions/{id}`).
         */
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
         * Returns an immutable instance of [SessionRevokeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .payloadToSign()
         * .requestId()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionRevokeResponse =
            SessionRevokeResponse(
                checkRequired("expiresAt", expiresAt),
                checkRequired("payloadToSign", payloadToSign),
                checkRequired("requestId", requestId),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): SessionRevokeResponse = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        payloadToSign()
        requestId()
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
        (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (payloadToSign.asKnown() == null) 0 else 1) +
            (if (requestId.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    /**
     * Credential type relevant to this challenge: the credential type being added (`POST
     * /auth/credentials`), the credential type being revoked (`DELETE /auth/credentials/{id}`), or
     * the type of credential that issued the session being revoked (`DELETE /auth/sessions/{id}`).
     */
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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OAUTH,
            EMAIL_OTP,
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
                OAUTH -> Value.OAUTH
                EMAIL_OTP -> Value.EMAIL_OTP
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
                OAUTH -> Known.OAUTH
                EMAIL_OTP -> Known.EMAIL_OTP
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

        return other is SessionRevokeResponse &&
            expiresAt == other.expiresAt &&
            payloadToSign == other.payloadToSign &&
            requestId == other.requestId &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresAt, payloadToSign, requestId, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SessionRevokeResponse{expiresAt=$expiresAt, payloadToSign=$payloadToSign, requestId=$requestId, type=$type, additionalProperties=$additionalProperties}"
}
