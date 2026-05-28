// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox

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
import java.util.Collections
import java.util.Objects

class SendRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val currencyCode: JsonField<String>,
    private val quoteId: JsonField<String>,
    private val currencyAmount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("currencyCode")
        @ExcludeMissing
        currencyCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quoteId") @ExcludeMissing quoteId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currencyAmount")
        @ExcludeMissing
        currencyAmount: JsonField<Long> = JsonMissing.of(),
    ) : this(currencyCode, quoteId, currencyAmount, mutableMapOf())

    /**
     * Currency code for the funds to be sent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currencyCode(): String = currencyCode.getRequired("currencyCode")

    /**
     * The unique identifier of the quote
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun quoteId(): String = quoteId.getRequired("quoteId")

    /**
     * The amount to send in the smallest unit of the currency (eg. cents). If not provided, the
     * amount will be derived from the quote.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencyAmount(): Long? = currencyAmount.getNullable("currencyAmount")

    /**
     * Returns the raw JSON value of [currencyCode].
     *
     * Unlike [currencyCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyCode")
    @ExcludeMissing
    fun _currencyCode(): JsonField<String> = currencyCode

    /**
     * Returns the raw JSON value of [quoteId].
     *
     * Unlike [quoteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quoteId") @ExcludeMissing fun _quoteId(): JsonField<String> = quoteId

    /**
     * Returns the raw JSON value of [currencyAmount].
     *
     * Unlike [currencyAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currencyAmount")
    @ExcludeMissing
    fun _currencyAmount(): JsonField<Long> = currencyAmount

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
         * Returns a mutable builder for constructing an instance of [SendRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .currencyCode()
         * .quoteId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SendRequest]. */
    class Builder internal constructor() {

        private var currencyCode: JsonField<String>? = null
        private var quoteId: JsonField<String>? = null
        private var currencyAmount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(sendRequest: SendRequest) = apply {
            currencyCode = sendRequest.currencyCode
            quoteId = sendRequest.quoteId
            currencyAmount = sendRequest.currencyAmount
            additionalProperties = sendRequest.additionalProperties.toMutableMap()
        }

        /** Currency code for the funds to be sent */
        fun currencyCode(currencyCode: String) = currencyCode(JsonField.of(currencyCode))

        /**
         * Sets [Builder.currencyCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyCode(currencyCode: JsonField<String>) = apply {
            this.currencyCode = currencyCode
        }

        /** The unique identifier of the quote */
        fun quoteId(quoteId: String) = quoteId(JsonField.of(quoteId))

        /**
         * Sets [Builder.quoteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

        /**
         * The amount to send in the smallest unit of the currency (eg. cents). If not provided, the
         * amount will be derived from the quote.
         */
        fun currencyAmount(currencyAmount: Long) = currencyAmount(JsonField.of(currencyAmount))

        /**
         * Sets [Builder.currencyAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currencyAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currencyAmount(currencyAmount: JsonField<Long>) = apply {
            this.currencyAmount = currencyAmount
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
         * Returns an immutable instance of [SendRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .currencyCode()
         * .quoteId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SendRequest =
            SendRequest(
                checkRequired("currencyCode", currencyCode),
                checkRequired("quoteId", quoteId),
                currencyAmount,
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
    fun validate(): SendRequest = apply {
        if (validated) {
            return@apply
        }

        currencyCode()
        quoteId()
        currencyAmount()
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
        (if (currencyCode.asKnown() == null) 0 else 1) +
            (if (quoteId.asKnown() == null) 0 else 1) +
            (if (currencyAmount.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SendRequest &&
            currencyCode == other.currencyCode &&
            quoteId == other.quoteId &&
            currencyAmount == other.currencyAmount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(currencyCode, quoteId, currencyAmount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "SendRequest{currencyCode=$currencyCode, quoteId=$quoteId, currencyAmount=$currencyAmount, additionalProperties=$additionalProperties}"
}
