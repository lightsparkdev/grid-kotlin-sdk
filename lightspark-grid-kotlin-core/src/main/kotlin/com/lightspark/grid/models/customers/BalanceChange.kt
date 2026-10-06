// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

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
import com.lightspark.grid.models.invitations.CurrencyAmount
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * One movement of the account's balance, signed in the account holder's polarity: money out is
 * negative and money in is positive, so a window's changes sum to its closing balance less its
 * opening balance.
 */
class BalanceChange
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val amount: JsonField<CurrencyAmount>,
    private val effectiveAt: JsonField<OffsetDateTime>,
    private val fee: JsonField<CurrencyAmount>,
    private val transactionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        amount: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("effectiveAt")
        @ExcludeMissing
        effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fee") @ExcludeMissing fee: JsonField<CurrencyAmount> = JsonMissing.of(),
        @JsonProperty("transactionId")
        @ExcludeMissing
        transactionId: JsonField<String> = JsonMissing.of(),
    ) : this(id, amount, effectiveAt, fee, transactionId, mutableMapOf())

    /**
     * Stable identifier for this balance change
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): CurrencyAmount = amount.getRequired("amount")

    /**
     * When the account holder's balance moved. Changes are ordered by this time.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun effectiveAt(): OffsetDateTime = effectiveAt.getRequired("effectiveAt")

    /**
     * The part of `amount` that is a fee, signed the same way: negative for a fee charged, positive
     * for a fee refunded, zero when the change carries no fee. Already included in `amount`, so
     * never add it on top. Sum it across a period for the period's total fees.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fee(): CurrencyAmount = fee.getRequired("fee")

    /**
     * The transaction this change belongs to. Fetch it with `GET /transactions/{transactionId}` for
     * its type, counterparty, merchant and rail. Several changes can share one transaction, for
     * example an ACH deposit and its return, or a card purchase that settles in parts. Absent for
     * an adjustment with no transaction behind it.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionId(): String? = transactionId.getNullable("transactionId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<CurrencyAmount> = amount

    /**
     * Returns the raw JSON value of [effectiveAt].
     *
     * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("effectiveAt")
    @ExcludeMissing
    fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

    /**
     * Returns the raw JSON value of [fee].
     *
     * Unlike [fee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fee") @ExcludeMissing fun _fee(): JsonField<CurrencyAmount> = fee

    /**
     * Returns the raw JSON value of [transactionId].
     *
     * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionId")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

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
         * Returns a mutable builder for constructing an instance of [BalanceChange].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .effectiveAt()
         * .fee()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BalanceChange]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var amount: JsonField<CurrencyAmount>? = null
        private var effectiveAt: JsonField<OffsetDateTime>? = null
        private var fee: JsonField<CurrencyAmount>? = null
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(balanceChange: BalanceChange) = apply {
            id = balanceChange.id
            amount = balanceChange.amount
            effectiveAt = balanceChange.effectiveAt
            fee = balanceChange.fee
            transactionId = balanceChange.transactionId
            additionalProperties = balanceChange.additionalProperties.toMutableMap()
        }

        /** Stable identifier for this balance change */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun amount(amount: CurrencyAmount) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [CurrencyAmount] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amount(amount: JsonField<CurrencyAmount>) = apply { this.amount = amount }

        /** When the account holder's balance moved. Changes are ordered by this time. */
        fun effectiveAt(effectiveAt: OffsetDateTime) = effectiveAt(JsonField.of(effectiveAt))

        /**
         * Sets [Builder.effectiveAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
            this.effectiveAt = effectiveAt
        }

        /**
         * The part of `amount` that is a fee, signed the same way: negative for a fee charged,
         * positive for a fee refunded, zero when the change carries no fee. Already included in
         * `amount`, so never add it on top. Sum it across a period for the period's total fees.
         */
        fun fee(fee: CurrencyAmount) = fee(JsonField.of(fee))

        /**
         * Sets [Builder.fee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fee] with a well-typed [CurrencyAmount] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fee(fee: JsonField<CurrencyAmount>) = apply { this.fee = fee }

        /**
         * The transaction this change belongs to. Fetch it with `GET /transactions/{transactionId}`
         * for its type, counterparty, merchant and rail. Several changes can share one transaction,
         * for example an ACH deposit and its return, or a card purchase that settles in parts.
         * Absent for an adjustment with no transaction behind it.
         */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /**
         * Sets [Builder.transactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
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
         * Returns an immutable instance of [BalanceChange].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .amount()
         * .effectiveAt()
         * .fee()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BalanceChange =
            BalanceChange(
                checkRequired("id", id),
                checkRequired("amount", amount),
                checkRequired("effectiveAt", effectiveAt),
                checkRequired("fee", fee),
                transactionId,
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
    fun validate(): BalanceChange = apply {
        if (validated) {
            return@apply
        }

        id()
        amount().validate()
        effectiveAt()
        fee().validate()
        transactionId()
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
        (if (id.asKnown() == null) 0 else 1) +
            (amount.asKnown()?.validity() ?: 0) +
            (if (effectiveAt.asKnown() == null) 0 else 1) +
            (fee.asKnown()?.validity() ?: 0) +
            (if (transactionId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BalanceChange &&
            id == other.id &&
            amount == other.amount &&
            effectiveAt == other.effectiveAt &&
            fee == other.fee &&
            transactionId == other.transactionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, amount, effectiveAt, fee, transactionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BalanceChange{id=$id, amount=$amount, effectiveAt=$effectiveAt, fee=$fee, transactionId=$transactionId, additionalProperties=$additionalProperties}"
}
