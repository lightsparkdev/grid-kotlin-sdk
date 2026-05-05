// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.devicecodes

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

class DeviceCodeRegenerateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val agentId: JsonField<String>,
    private val code: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val redeemed: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("agentId") @ExcludeMissing agentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("redeemed") @ExcludeMissing redeemed: JsonField<Boolean> = JsonMissing.of(),
    ) : this(agentId, code, expiresAt, redeemed, mutableMapOf())

    /**
     * The agent this device code belongs to.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun agentId(): String = agentId.getRequired("agentId")

    /**
     * Human-readable device code used to install and connect the agent software.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun code(): String = code.getRequired("code")

    /**
     * Timestamp when this device code expires.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * Whether this device code has already been redeemed by the agent.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun redeemed(): Boolean = redeemed.getRequired("redeemed")

    /**
     * Returns the raw JSON value of [agentId].
     *
     * Unlike [agentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("agentId") @ExcludeMissing fun _agentId(): JsonField<String> = agentId

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [redeemed].
     *
     * Unlike [redeemed], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("redeemed") @ExcludeMissing fun _redeemed(): JsonField<Boolean> = redeemed

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
         * Returns a mutable builder for constructing an instance of [DeviceCodeRegenerateResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .agentId()
         * .code()
         * .expiresAt()
         * .redeemed()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DeviceCodeRegenerateResponse]. */
    class Builder internal constructor() {

        private var agentId: JsonField<String>? = null
        private var code: JsonField<String>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var redeemed: JsonField<Boolean>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(deviceCodeRegenerateResponse: DeviceCodeRegenerateResponse) = apply {
            agentId = deviceCodeRegenerateResponse.agentId
            code = deviceCodeRegenerateResponse.code
            expiresAt = deviceCodeRegenerateResponse.expiresAt
            redeemed = deviceCodeRegenerateResponse.redeemed
            additionalProperties = deviceCodeRegenerateResponse.additionalProperties.toMutableMap()
        }

        /** The agent this device code belongs to. */
        fun agentId(agentId: String) = agentId(JsonField.of(agentId))

        /**
         * Sets [Builder.agentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.agentId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun agentId(agentId: JsonField<String>) = apply { this.agentId = agentId }

        /** Human-readable device code used to install and connect the agent software. */
        fun code(code: String) = code(JsonField.of(code))

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { this.code = code }

        /** Timestamp when this device code expires. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** Whether this device code has already been redeemed by the agent. */
        fun redeemed(redeemed: Boolean) = redeemed(JsonField.of(redeemed))

        /**
         * Sets [Builder.redeemed] to an arbitrary JSON value.
         *
         * You should usually call [Builder.redeemed] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun redeemed(redeemed: JsonField<Boolean>) = apply { this.redeemed = redeemed }

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
         * Returns an immutable instance of [DeviceCodeRegenerateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .agentId()
         * .code()
         * .expiresAt()
         * .redeemed()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DeviceCodeRegenerateResponse =
            DeviceCodeRegenerateResponse(
                checkRequired("agentId", agentId),
                checkRequired("code", code),
                checkRequired("expiresAt", expiresAt),
                checkRequired("redeemed", redeemed),
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
    fun validate(): DeviceCodeRegenerateResponse = apply {
        if (validated) {
            return@apply
        }

        agentId()
        code()
        expiresAt()
        redeemed()
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
        (if (agentId.asKnown() == null) 0 else 1) +
            (if (code.asKnown() == null) 0 else 1) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (redeemed.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeviceCodeRegenerateResponse &&
            agentId == other.agentId &&
            code == other.code &&
            expiresAt == other.expiresAt &&
            redeemed == other.redeemed &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(agentId, code, expiresAt, redeemed, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DeviceCodeRegenerateResponse{agentId=$agentId, code=$code, expiresAt=$expiresAt, redeemed=$redeemed, additionalProperties=$additionalProperties}"
}
