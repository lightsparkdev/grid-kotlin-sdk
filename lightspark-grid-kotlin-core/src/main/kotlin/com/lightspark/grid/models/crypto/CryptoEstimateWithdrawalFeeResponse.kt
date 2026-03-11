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

class CryptoEstimateWithdrawalFeeResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val applicationFee: JsonField<Long>,
    private val netAmount: JsonField<Long>,
    private val networkFee: JsonField<Long>,
    private val networkFeeAsset: JsonField<String>,
    private val totalFee: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("applicationFee")
        @ExcludeMissing
        applicationFee: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("netAmount") @ExcludeMissing netAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("networkFee") @ExcludeMissing networkFee: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("networkFeeAsset")
        @ExcludeMissing
        networkFeeAsset: JsonField<String> = JsonMissing.of(),
        @JsonProperty("totalFee") @ExcludeMissing totalFee: JsonField<Long> = JsonMissing.of(),
    ) : this(applicationFee, netAmount, networkFee, networkFeeAsset, totalFee, mutableMapOf())

    /**
     * The application fee charged by the platform in the smallest unit of the withdrawal currency.
     * Zero if no application fee applies.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun applicationFee(): Long = applicationFee.getRequired("applicationFee")

    /**
     * The net amount the recipient will receive after fees, in the smallest unit of the withdrawal
     * currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun netAmount(): Long = netAmount.getRequired("netAmount")

    /**
     * The estimated network (gas) fee in the smallest unit of the network fee asset (e.g. lamports
     * for SOL). This is provided for informational purposes to show the raw on-chain cost. Note
     * that this value is denominated in networkFeeAsset, not in the withdrawal currency — it cannot
     * be directly added to applicationFee or compared to totalFee.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun networkFee(): Long = networkFee.getRequired("networkFee")

    /**
     * The asset used to pay the network fee (e.g. SOL for Solana transactions).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun networkFeeAsset(): String = networkFeeAsset.getRequired("networkFeeAsset")

    /**
     * The total cost of the withdrawal in the smallest unit of the withdrawal currency. This equals
     * the network fee converted to the withdrawal currency at current rates plus the application
     * fee. This is the amount deducted from the withdrawal in addition to netAmount.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun totalFee(): Long = totalFee.getRequired("totalFee")

    /**
     * Returns the raw JSON value of [applicationFee].
     *
     * Unlike [applicationFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("applicationFee")
    @ExcludeMissing
    fun _applicationFee(): JsonField<Long> = applicationFee

    /**
     * Returns the raw JSON value of [netAmount].
     *
     * Unlike [netAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("netAmount") @ExcludeMissing fun _netAmount(): JsonField<Long> = netAmount

    /**
     * Returns the raw JSON value of [networkFee].
     *
     * Unlike [networkFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("networkFee") @ExcludeMissing fun _networkFee(): JsonField<Long> = networkFee

    /**
     * Returns the raw JSON value of [networkFeeAsset].
     *
     * Unlike [networkFeeAsset], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("networkFeeAsset")
    @ExcludeMissing
    fun _networkFeeAsset(): JsonField<String> = networkFeeAsset

    /**
     * Returns the raw JSON value of [totalFee].
     *
     * Unlike [totalFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("totalFee") @ExcludeMissing fun _totalFee(): JsonField<Long> = totalFee

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
         * [CryptoEstimateWithdrawalFeeResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .applicationFee()
         * .netAmount()
         * .networkFee()
         * .networkFeeAsset()
         * .totalFee()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CryptoEstimateWithdrawalFeeResponse]. */
    class Builder internal constructor() {

        private var applicationFee: JsonField<Long>? = null
        private var netAmount: JsonField<Long>? = null
        private var networkFee: JsonField<Long>? = null
        private var networkFeeAsset: JsonField<String>? = null
        private var totalFee: JsonField<Long>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            cryptoEstimateWithdrawalFeeResponse: CryptoEstimateWithdrawalFeeResponse
        ) = apply {
            applicationFee = cryptoEstimateWithdrawalFeeResponse.applicationFee
            netAmount = cryptoEstimateWithdrawalFeeResponse.netAmount
            networkFee = cryptoEstimateWithdrawalFeeResponse.networkFee
            networkFeeAsset = cryptoEstimateWithdrawalFeeResponse.networkFeeAsset
            totalFee = cryptoEstimateWithdrawalFeeResponse.totalFee
            additionalProperties =
                cryptoEstimateWithdrawalFeeResponse.additionalProperties.toMutableMap()
        }

        /**
         * The application fee charged by the platform in the smallest unit of the withdrawal
         * currency. Zero if no application fee applies.
         */
        fun applicationFee(applicationFee: Long) = applicationFee(JsonField.of(applicationFee))

        /**
         * Sets [Builder.applicationFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationFee] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun applicationFee(applicationFee: JsonField<Long>) = apply {
            this.applicationFee = applicationFee
        }

        /**
         * The net amount the recipient will receive after fees, in the smallest unit of the
         * withdrawal currency.
         */
        fun netAmount(netAmount: Long) = netAmount(JsonField.of(netAmount))

        /**
         * Sets [Builder.netAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netAmount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun netAmount(netAmount: JsonField<Long>) = apply { this.netAmount = netAmount }

        /**
         * The estimated network (gas) fee in the smallest unit of the network fee asset (e.g.
         * lamports for SOL). This is provided for informational purposes to show the raw on-chain
         * cost. Note that this value is denominated in networkFeeAsset, not in the withdrawal
         * currency — it cannot be directly added to applicationFee or compared to totalFee.
         */
        fun networkFee(networkFee: Long) = networkFee(JsonField.of(networkFee))

        /**
         * Sets [Builder.networkFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkFee] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun networkFee(networkFee: JsonField<Long>) = apply { this.networkFee = networkFee }

        /** The asset used to pay the network fee (e.g. SOL for Solana transactions). */
        fun networkFeeAsset(networkFeeAsset: String) =
            networkFeeAsset(JsonField.of(networkFeeAsset))

        /**
         * Sets [Builder.networkFeeAsset] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkFeeAsset] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkFeeAsset(networkFeeAsset: JsonField<String>) = apply {
            this.networkFeeAsset = networkFeeAsset
        }

        /**
         * The total cost of the withdrawal in the smallest unit of the withdrawal currency. This
         * equals the network fee converted to the withdrawal currency at current rates plus the
         * application fee. This is the amount deducted from the withdrawal in addition to
         * netAmount.
         */
        fun totalFee(totalFee: Long) = totalFee(JsonField.of(totalFee))

        /**
         * Sets [Builder.totalFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalFee] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalFee(totalFee: JsonField<Long>) = apply { this.totalFee = totalFee }

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
         * Returns an immutable instance of [CryptoEstimateWithdrawalFeeResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .applicationFee()
         * .netAmount()
         * .networkFee()
         * .networkFeeAsset()
         * .totalFee()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CryptoEstimateWithdrawalFeeResponse =
            CryptoEstimateWithdrawalFeeResponse(
                checkRequired("applicationFee", applicationFee),
                checkRequired("netAmount", netAmount),
                checkRequired("networkFee", networkFee),
                checkRequired("networkFeeAsset", networkFeeAsset),
                checkRequired("totalFee", totalFee),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CryptoEstimateWithdrawalFeeResponse = apply {
        if (validated) {
            return@apply
        }

        applicationFee()
        netAmount()
        networkFee()
        networkFeeAsset()
        totalFee()
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
        (if (applicationFee.asKnown() == null) 0 else 1) +
            (if (netAmount.asKnown() == null) 0 else 1) +
            (if (networkFee.asKnown() == null) 0 else 1) +
            (if (networkFeeAsset.asKnown() == null) 0 else 1) +
            (if (totalFee.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CryptoEstimateWithdrawalFeeResponse &&
            applicationFee == other.applicationFee &&
            netAmount == other.netAmount &&
            networkFee == other.networkFee &&
            networkFeeAsset == other.networkFeeAsset &&
            totalFee == other.totalFee &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            applicationFee,
            netAmount,
            networkFee,
            networkFeeAsset,
            totalFee,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CryptoEstimateWithdrawalFeeResponse{applicationFee=$applicationFee, netAmount=$netAmount, networkFee=$networkFee, networkFeeAsset=$networkFeeAsset, totalFee=$totalFee, additionalProperties=$additionalProperties}"
}
