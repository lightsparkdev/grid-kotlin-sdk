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
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Estimate the network and application fees for a cryptocurrency withdrawal from a crypto internal
 * account to an external blockchain address. Use this to show fee information to customers before
 * they initiate a withdrawal.
 */
class CryptoEstimateWithdrawalFeeParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The amount to withdraw in the smallest unit of the currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = body.amount()

    /**
     * The blockchain network for the withdrawal. Example values: SOLANA_MAINNET, SOLANA_DEVNET,
     * ETHEREUM_MAINNET, ETHEREUM_TESTNET, BASE_MAINNET, BASE_TESTNET, SPARK_MAINNET, SPARK_TESTNET,
     * LIGHTNING_MAINNET, LIGHTNING_REGTEST.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cryptoNetwork(): String = body.cryptoNetwork()

    /**
     * The currency code of the asset to withdraw (e.g. USDC).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * The blockchain address to withdraw funds to.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destinationAddress(): String = body.destinationAddress()

    /**
     * The ID of the crypto internal account to withdraw from.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun internalAccountId(): String = body.internalAccountId()

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * Returns the raw JSON value of [cryptoNetwork].
     *
     * Unlike [cryptoNetwork], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _cryptoNetwork(): JsonField<String> = body._cryptoNetwork()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [destinationAddress].
     *
     * Unlike [destinationAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _destinationAddress(): JsonField<String> = body._destinationAddress()

    /**
     * Returns the raw JSON value of [internalAccountId].
     *
     * Unlike [internalAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _internalAccountId(): JsonField<String> = body._internalAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CryptoEstimateWithdrawalFeeParams].
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

    /** A builder for [CryptoEstimateWithdrawalFeeParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cryptoEstimateWithdrawalFeeParams: CryptoEstimateWithdrawalFeeParams) =
            apply {
                body = cryptoEstimateWithdrawalFeeParams.body.toBuilder()
                additionalHeaders = cryptoEstimateWithdrawalFeeParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    cryptoEstimateWithdrawalFeeParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [amount]
         * - [cryptoNetwork]
         * - [currency]
         * - [destinationAddress]
         * - [internalAccountId]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The amount to withdraw in the smallest unit of the currency. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * The blockchain network for the withdrawal. Example values: SOLANA_MAINNET, SOLANA_DEVNET,
         * ETHEREUM_MAINNET, ETHEREUM_TESTNET, BASE_MAINNET, BASE_TESTNET, SPARK_MAINNET,
         * SPARK_TESTNET, LIGHTNING_MAINNET, LIGHTNING_REGTEST.
         */
        fun cryptoNetwork(cryptoNetwork: String) = apply { body.cryptoNetwork(cryptoNetwork) }

        /**
         * Sets [Builder.cryptoNetwork] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cryptoNetwork] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cryptoNetwork(cryptoNetwork: JsonField<String>) = apply {
            body.cryptoNetwork(cryptoNetwork)
        }

        /** The currency code of the asset to withdraw (e.g. USDC). */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /** The blockchain address to withdraw funds to. */
        fun destinationAddress(destinationAddress: String) = apply {
            body.destinationAddress(destinationAddress)
        }

        /**
         * Sets [Builder.destinationAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destinationAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destinationAddress(destinationAddress: JsonField<String>) = apply {
            body.destinationAddress(destinationAddress)
        }

        /** The ID of the crypto internal account to withdraw from. */
        fun internalAccountId(internalAccountId: String) = apply {
            body.internalAccountId(internalAccountId)
        }

        /**
         * Sets [Builder.internalAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.internalAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun internalAccountId(internalAccountId: JsonField<String>) = apply {
            body.internalAccountId(internalAccountId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [CryptoEstimateWithdrawalFeeParams].
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
        fun build(): CryptoEstimateWithdrawalFeeParams =
            CryptoEstimateWithdrawalFeeParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationAddress")
            @ExcludeMissing
            destinationAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("internalAccountId")
            @ExcludeMissing
            internalAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(
            amount,
            cryptoNetwork,
            currency,
            destinationAddress,
            internalAccountId,
            mutableMapOf(),
        )

        /**
         * The amount to withdraw in the smallest unit of the currency.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * The blockchain network for the withdrawal. Example values: SOLANA_MAINNET, SOLANA_DEVNET,
         * ETHEREUM_MAINNET, ETHEREUM_TESTNET, BASE_MAINNET, BASE_TESTNET, SPARK_MAINNET,
         * SPARK_TESTNET, LIGHTNING_MAINNET, LIGHTNING_REGTEST.
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
         * Unlike [cryptoNetwork], this method doesn't throw if the JSON field has an unexpected
         * type.
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
         * Unlike [destinationAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
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
             * Returns a mutable builder for constructing an instance of [Body].
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

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var cryptoNetwork: JsonField<String>? = null
            private var currency: JsonField<String>? = null
            private var destinationAddress: JsonField<String>? = null
            private var internalAccountId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                amount = body.amount
                cryptoNetwork = body.cryptoNetwork
                currency = body.currency
                destinationAddress = body.destinationAddress
                internalAccountId = body.internalAccountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The amount to withdraw in the smallest unit of the currency. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * The blockchain network for the withdrawal. Example values: SOLANA_MAINNET,
             * SOLANA_DEVNET, ETHEREUM_MAINNET, ETHEREUM_TESTNET, BASE_MAINNET, BASE_TESTNET,
             * SPARK_MAINNET, SPARK_TESTNET, LIGHTNING_MAINNET, LIGHTNING_REGTEST.
             */
            fun cryptoNetwork(cryptoNetwork: String) = cryptoNetwork(JsonField.of(cryptoNetwork))

            /**
             * Sets [Builder.cryptoNetwork] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cryptoNetwork] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cryptoNetwork(cryptoNetwork: JsonField<String>) = apply {
                this.cryptoNetwork = cryptoNetwork
            }

            /** The currency code of the asset to withdraw (e.g. USDC). */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
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
            fun build(): Body =
                Body(
                    checkRequired("amount", amount),
                    checkRequired("cryptoNetwork", cryptoNetwork),
                    checkRequired("currency", currency),
                    checkRequired("destinationAddress", destinationAddress),
                    checkRequired("internalAccountId", internalAccountId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Body &&
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
            "Body{amount=$amount, cryptoNetwork=$cryptoNetwork, currency=$currency, destinationAddress=$destinationAddress, internalAccountId=$internalAccountId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CryptoEstimateWithdrawalFeeParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CryptoEstimateWithdrawalFeeParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
