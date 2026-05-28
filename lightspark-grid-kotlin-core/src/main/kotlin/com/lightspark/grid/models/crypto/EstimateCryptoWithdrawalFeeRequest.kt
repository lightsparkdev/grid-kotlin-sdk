// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.crypto

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

class EstimateCryptoWithdrawalFeeRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<Long>,
    private val cryptoNetwork: JsonField<String>,
    private val currency: JsonField<String>,
    private val destinationAddress: JsonField<String>,
    private val internalAccountId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("cryptoNetwork")
        @ExcludeMissing
        cryptoNetwork: JsonField<String> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("destinationAddress")
        @ExcludeMissing
        destinationAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("internalAccountId")
        @ExcludeMissing
        internalAccountId: JsonField<String> = JsonMissing.of(),
    ) : this(amount, cryptoNetwork, currency, destinationAddress, internalAccountId, mutableMapOf())

    /**
     * The amount to withdraw in the smallest unit of the currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The blockchain network for the withdrawal. Example values: SOLANA, ETHEREUM, BASE, POLYGON,
     * SPARK, LIGHTNING, BITCOIN.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cryptoNetwork(): String = cryptoNetwork.getRequired("cryptoNetwork")

    /**
     * The currency code of the asset to withdraw (e.g. USDC).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = currency.getRequired("currency")

    /**
     * The blockchain address to withdraw funds to.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destinationAddress(): String = destinationAddress.getRequired("destinationAddress")

    /**
     * The ID of the crypto internal account to withdraw from.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = internalAccountId.getRequired("internalAccountId")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [cryptoNetwork].
     *
     * Unlike [cryptoNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cryptoNetwork")
    @ExcludeMissing
    fun _cryptoNetwork(): JsonField<String> = cryptoNetwork

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [destinationAddress].
     *
     * Unlike [destinationAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("destinationAddress")
    @ExcludeMissing
    fun _destinationAddress(): JsonField<String> = destinationAddress

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("internalAccountId")
    @ExcludeMissing
    fun _internalAccountId(): JsonField<String> = internalAccountId

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
         * Returns a mutable builder for constructing an instance of
         * [EstimateCryptoWithdrawalFeeRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cryptoNetwork()
         * .currency()
         * .destinationAddress()
         * .internalAccountId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EstimateCryptoWithdrawalFeeRequest]. */
    class Builder internal constructor() {

        private var amount: JsonField<Long>? = null
        private var cryptoNetwork: JsonField<String>? = null
        private var currency: JsonField<String>? = null
        private var destinationAddress: JsonField<String>? = null
        private var internalAccountId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(estimateCryptoWithdrawalFeeRequest: EstimateCryptoWithdrawalFeeRequest) =
            apply {
                amount = estimateCryptoWithdrawalFeeRequest.amount
                cryptoNetwork = estimateCryptoWithdrawalFeeRequest.cryptoNetwork
                currency = estimateCryptoWithdrawalFeeRequest.currency
                destinationAddress = estimateCryptoWithdrawalFeeRequest.destinationAddress
                internalAccountId = estimateCryptoWithdrawalFeeRequest.internalAccountId
                additionalProperties =
                    estimateCryptoWithdrawalFeeRequest.additionalProperties.toMutableMap()
            }

        /** The amount to withdraw in the smallest unit of the currency. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The blockchain network for the withdrawal. Example values: SOLANA, ETHEREUM, BASE,
         * POLYGON, SPARK, LIGHTNING, BITCOIN.
         */
        fun cryptoNetwork(cryptoNetwork: String) = cryptoNetwork(JsonField.of(cryptoNetwork))

        /**
         * Sets [Builder.cryptoNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cryptoNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cryptoNetwork(cryptoNetwork: JsonField<String>) = apply {
            this.cryptoNetwork = cryptoNetwork
        }

        /** The currency code of the asset to withdraw (e.g. USDC). */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** The blockchain address to withdraw funds to. */
        fun destinationAddress(destinationAddress: String) =
            destinationAddress(JsonField.of(destinationAddress))

        /**
         * Sets [Builder.destinationAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationAddress(destinationAddress: JsonField<String>) = apply {
            this.destinationAddress = destinationAddress
        }

        /** The ID of the crypto internal account to withdraw from. */
        fun internalAccountId(internalAccountId: String) =
            internalAccountId(JsonField.of(internalAccountId))

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            this.internalAccountId = internalAccountId
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
         * Returns an immutable instance of [EstimateCryptoWithdrawalFeeRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .amount()
         * .cryptoNetwork()
         * .currency()
         * .destinationAddress()
         * .internalAccountId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EstimateCryptoWithdrawalFeeRequest =
            EstimateCryptoWithdrawalFeeRequest(
                checkRequired("amount", amount),
                checkRequired("cryptoNetwork", cryptoNetwork),
                checkRequired("currency", currency),
                checkRequired("destinationAddress", destinationAddress),
                checkRequired("internalAccountId", internalAccountId),
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
    fun validate(): EstimateCryptoWithdrawalFeeRequest = apply {
        if (validated) {
            return@apply
        }

        amount()
        cryptoNetwork()
        currency()
        destinationAddress()
        internalAccountId()
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
            (if (cryptoNetwork.asKnown() == null) 0 else 1) +
            (if (currency.asKnown() == null) 0 else 1) +
            (if (destinationAddress.asKnown() == null) 0 else 1) +
            (if (internalAccountId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EstimateCryptoWithdrawalFeeRequest &&
            amount == other.amount &&
            cryptoNetwork == other.cryptoNetwork &&
            currency == other.currency &&
            destinationAddress == other.destinationAddress &&
            internalAccountId == other.internalAccountId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            amount,
            cryptoNetwork,
            currency,
            destinationAddress,
            internalAccountId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EstimateCryptoWithdrawalFeeRequest{amount=$amount, cryptoNetwork=$cryptoNetwork, currency=$currency, destinationAddress=$destinationAddress, internalAccountId=$internalAccountId, additionalProperties=$additionalProperties}"
}
