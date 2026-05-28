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
import com.lightspark.grid.models.quotes.Currency
import java.util.Collections
import java.util.Objects

/**
 * Sandbox-only request body for `POST /sandbox/cards/{id}/simulate/authorization`. Drives the same
 * internal authorization + reconcile paths that the issuer would call in production. The
 * decisioning outcome is controlled by the last three characters of `merchant.descriptor` — see the
 * endpoint documentation for the suffix table.
 */
class AuthorizationRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val merchant: JsonField<CardMerchant>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("merchant")
        @ExcludeMissing
        merchant: JsonField<CardMerchant> = JsonMissing.of(),
    ) : this(amount, currency, merchant, mutableMapOf())

    /**
     * Authorization amount in the smallest unit of `currency` (e.g. cents for USD).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): CardMerchant = merchant.getRequired("merchant")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<CardMerchant> = merchant

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
         * Returns a mutable builder for constructing an instance of [AuthorizationRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .currency()
         * .merchant()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AuthorizationRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var currency: JsonField<Currency>? = null
        private var merchant: JsonField<CardMerchant>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(authorizationRequest: AuthorizationRequest) = apply {
            amount = authorizationRequest.amount
            currency = authorizationRequest.currency
            merchant = authorizationRequest.merchant
            additionalProperties = authorizationRequest.additionalProperties.toMutableMap()
        }

        /** Authorization amount in the smallest unit of `currency` (e.g. cents for USD). */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        fun merchant(merchant: CardMerchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [CardMerchant] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun merchant(merchant: JsonField<CardMerchant>) = apply { this.merchant = merchant }

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
         * Returns an immutable instance of [AuthorizationRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .currency()
         * .merchant()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthorizationRequest =
            AuthorizationRequest(
                checkRequired("amount", amount),
                checkRequired("currency", currency),
                checkRequired("merchant", merchant),
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
    fun validate(): AuthorizationRequest = apply {
        if (validated) {
            return@apply
        }

        amount()
        currency().validate()
        merchant().validate()
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
            (currency.asKnown()?.validity() ?: 0) +
            (merchant.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthorizationRequest &&
            amount == other.amount &&
            currency == other.currency &&
            merchant == other.merchant &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(amount, currency, merchant, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthorizationRequest{amount=$amount, currency=$currency, merchant=$merchant, additionalProperties=$additionalProperties}"
}
