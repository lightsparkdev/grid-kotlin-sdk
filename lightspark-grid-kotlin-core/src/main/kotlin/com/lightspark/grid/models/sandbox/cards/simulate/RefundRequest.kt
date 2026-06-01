// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

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

/**
 * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/return`. Drives a `RETURN` event
 * against an existing settled `CardTransaction`, which creates a `CardRefund` and pushes the parent
 * transaction towards `REFUNDED` (full) or keeps it `SETTLED` (partial).
 */
class RefundRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val cardTransactionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cardTransactionId")
        @ExcludeMissing
        cardTransactionId: JsonField<String> = JsonMissing.of(),
    ) : this(amount, cardTransactionId, mutableMapOf())

    /**
     * Return amount in the smallest unit of the transaction's currency. Must be less than or equal
     * to the net settled amount (settled minus previously-refunded).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The id of the `CardTransaction` to refund against. Must have at least one settled clearing.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardTransactionId(): String = cardTransactionId.getRequired("cardTransactionId")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [cardTransactionId].
     *
     * Unlike [cardTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("cardTransactionId")
    @ExcludeMissing
    fun _cardTransactionId(): JsonField<String> = cardTransactionId

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
         * Returns a mutable builder for constructing an instance of [RefundRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cardTransactionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [RefundRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var cardTransactionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(refundRequest: RefundRequest) = apply {
            amount = refundRequest.amount
            cardTransactionId = refundRequest.cardTransactionId
            additionalProperties = refundRequest.additionalProperties.toMutableMap()
        }

        /**
         * Return amount in the smallest unit of the transaction's currency. Must be less than or
         * equal to the net settled amount (settled minus previously-refunded).
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The id of the `CardTransaction` to refund against. Must have at least one settled
         * clearing.
         */
        fun cardTransactionId(cardTransactionId: String) =
            cardTransactionId(JsonField.of(cardTransactionId))

        /**
         * Sets [Builder.cardTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardTransactionId(cardTransactionId: JsonField<String>) = apply {
            this.cardTransactionId = cardTransactionId
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
         * Returns an immutable instance of [RefundRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cardTransactionId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): RefundRequest =
            RefundRequest(
                checkRequired("amount", amount),
                checkRequired("cardTransactionId", cardTransactionId),
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
    fun validate(): RefundRequest = apply {
        if (validated) {
            return@apply
        }

        amount()
        cardTransactionId()
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
        (if (amount.asKnown() == null) 0 else 1) +
            (if (cardTransactionId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RefundRequest &&
            amount == other.amount &&
            cardTransactionId == other.cardTransactionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, cardTransactionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RefundRequest{amount=$amount, cardTransactionId=$cardTransactionId, additionalProperties=$additionalProperties}"
}
