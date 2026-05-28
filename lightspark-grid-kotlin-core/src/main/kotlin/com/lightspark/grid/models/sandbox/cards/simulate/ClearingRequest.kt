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
 * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/clearing`. Drives a clearing
 * event against an existing `CardTransaction`. Pass an `amount` greater than the authorized amount
 * to exercise the over-auth / restaurant-tip post-hoc-pull path; pass `0` to exercise
 * `AUTHORIZATION_EXPIRY`. Suffix-driven outcomes on the parent transaction's id govern whether the
 * post-hoc pull succeeds.
 */
class ClearingRequest
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
     * Clearing amount in the smallest unit of the transaction's currency. Set to `0` to simulate an
     * authorization expiry with no clearing.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The id of the `CardTransaction` to clear against. Must be in `AUTHORIZED` or
     * `PARTIALLY_SETTLED` state.
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
         * Returns a mutable builder for constructing an instance of [ClearingRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cardTransactionId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ClearingRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var cardTransactionId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(clearingRequest: ClearingRequest) = apply {
            amount = clearingRequest.amount
            cardTransactionId = clearingRequest.cardTransactionId
            additionalProperties = clearingRequest.additionalProperties.toMutableMap()
        }

        /**
         * Clearing amount in the smallest unit of the transaction's currency. Set to `0` to
         * simulate an authorization expiry with no clearing.
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
         * The id of the `CardTransaction` to clear against. Must be in `AUTHORIZED` or
         * `PARTIALLY_SETTLED` state.
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
         * Returns an immutable instance of [ClearingRequest].
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
        fun build(): ClearingRequest =
            ClearingRequest(
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
    fun validate(): ClearingRequest = apply {
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

        return other is ClearingRequest &&
            amount == other.amount &&
            cardTransactionId == other.cardTransactionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, cardTransactionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ClearingRequest{amount=$amount, cardTransactionId=$cardTransactionId, additionalProperties=$additionalProperties}"
}
