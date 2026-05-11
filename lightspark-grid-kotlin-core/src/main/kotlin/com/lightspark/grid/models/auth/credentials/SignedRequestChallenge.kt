// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Common base for two-step signed-retry challenge responses on Embedded Wallet endpoints
 * (credential revocation, session revocation, wallet export, and similar). Holds the signing fields
 * shared across every challenge shape; each variant composes this base via `allOf` and adds its own
 * resource `id` (and `type`, when applicable) with variant-specific description and example.
 */
class SignedRequestChallenge
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val payloadToSign: JsonField<String>,
    private val requestId: JsonField<String>,
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
    ) : this(expiresAt, payloadToSign, requestId, mutableMapOf())

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
         * Returns a mutable builder for constructing an instance of [SignedRequestChallenge].
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .payloadToSign()
         * .requestId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SignedRequestChallenge]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var payloadToSign: JsonField<String>? = null
        private var requestId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(signedRequestChallenge: SignedRequestChallenge) = apply {
            expiresAt = signedRequestChallenge.expiresAt
            payloadToSign = signedRequestChallenge.payloadToSign
            requestId = signedRequestChallenge.requestId
            additionalProperties = signedRequestChallenge.additionalProperties.toMutableMap()
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
         * Returns an immutable instance of [SignedRequestChallenge].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .payloadToSign()
         * .requestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SignedRequestChallenge =
            SignedRequestChallenge(
                checkRequired("expiresAt", expiresAt),
                checkRequired("payloadToSign", payloadToSign),
                checkRequired("requestId", requestId),
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
    fun validate(): SignedRequestChallenge = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        payloadToSign()
        requestId()
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
            (if (requestId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SignedRequestChallenge &&
            expiresAt == other.expiresAt &&
            payloadToSign == other.payloadToSign &&
            requestId == other.requestId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresAt, payloadToSign, requestId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SignedRequestChallenge{expiresAt=$expiresAt, payloadToSign=$payloadToSign, requestId=$requestId, additionalProperties=$additionalProperties}"
}
