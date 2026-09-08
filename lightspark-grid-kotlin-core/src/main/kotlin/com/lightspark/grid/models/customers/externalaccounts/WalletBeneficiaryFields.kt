// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class WalletBeneficiaryFields
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val beneficiary: JsonField<WalletBeneficiaryOneOf>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("beneficiary")
        @ExcludeMissing
        beneficiary: JsonField<WalletBeneficiaryOneOf> = JsonMissing.of()
    ) : this(beneficiary, mutableMapOf())

    /**
     * The wallet's owner. Optional for `FIRST_PARTY` accounts — the customer's verified identity is
     * used. Required for `THIRD_PARTY` wallets on platforms with counterparty requirements (e.g. EU
     * Travel Rule); if missing there, creation fails with `400 INVALID_INPUT`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun beneficiary(): WalletBeneficiaryOneOf? = beneficiary.getNullable("beneficiary")

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("beneficiary")
    @ExcludeMissing
    fun _beneficiary(): JsonField<WalletBeneficiaryOneOf> = beneficiary

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

        /** Returns a mutable builder for constructing an instance of [WalletBeneficiaryFields]. */
        fun builder() = Builder()
    }

    /** A builder for [WalletBeneficiaryFields]. */
    class Builder internal constructor() {

        private var beneficiary: JsonField<WalletBeneficiaryOneOf> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(walletBeneficiaryFields: WalletBeneficiaryFields) = apply {
            beneficiary = walletBeneficiaryFields.beneficiary
            additionalProperties = walletBeneficiaryFields.additionalProperties.toMutableMap()
        }

        /**
         * The wallet's owner. Optional for `FIRST_PARTY` accounts — the customer's verified
         * identity is used. Required for `THIRD_PARTY` wallets on platforms with counterparty
         * requirements (e.g. EU Travel Rule); if missing there, creation fails with `400
         * INVALID_INPUT`.
         */
        fun beneficiary(beneficiary: WalletBeneficiaryOneOf) =
            beneficiary(JsonField.of(beneficiary))

        /**
         * Sets [Builder.beneficiary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiary] with a well-typed [WalletBeneficiaryOneOf]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun beneficiary(beneficiary: JsonField<WalletBeneficiaryOneOf>) = apply {
            this.beneficiary = beneficiary
        }

        /**
         * Alias for calling [beneficiary] with `WalletBeneficiaryOneOf.ofIndividual(individual)`.
         */
        fun beneficiary(individual: WalletIndividualBeneficiary) =
            beneficiary(WalletBeneficiaryOneOf.ofIndividual(individual))

        /** Alias for calling [beneficiary] with `WalletBeneficiaryOneOf.ofBusiness(business)`. */
        fun beneficiary(business: BusinessBeneficiary) =
            beneficiary(WalletBeneficiaryOneOf.ofBusiness(business))

        /**
         * Alias for calling [beneficiary] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessBeneficiary(legalName: String) =
            beneficiary(
                BusinessBeneficiary.builder()
                    .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                    .legalName(legalName)
                    .build()
            )

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
         * Returns an immutable instance of [WalletBeneficiaryFields].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): WalletBeneficiaryFields =
            WalletBeneficiaryFields(beneficiary, additionalProperties.toMutableMap())
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
    fun validate(): WalletBeneficiaryFields = apply {
        if (validated) {
            return@apply
        }

        beneficiary()?.validate()
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
    internal fun validity(): Int = (beneficiary.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WalletBeneficiaryFields &&
            beneficiary == other.beneficiary &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(beneficiary, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WalletBeneficiaryFields{beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
}
