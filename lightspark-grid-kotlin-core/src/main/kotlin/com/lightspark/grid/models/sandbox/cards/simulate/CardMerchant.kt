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

class CardMerchant
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val descriptor: JsonField<String>,
    private val country: JsonField<String>,
    private val mcc: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("descriptor")
        @ExcludeMissing
        descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
    ) : this(descriptor, country, mcc, mutableMapOf())

    /**
     * Merchant descriptor string captured from the card network at authorization time.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun descriptor(): String = descriptor.getRequired("descriptor")

    /**
     * Two-letter ISO 3166-1 alpha-2 country code of the merchant.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun country(): String? = country.getNullable("country")

    /**
     * Merchant Category Code (ISO 18245) — four-digit numeric string.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun mcc(): String? = mcc.getNullable("mcc")

    /**
     * Returns the raw JSON value of [descriptor].
     *
     * Unlike [descriptor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor(): JsonField<String> = descriptor

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [mcc].
     *
     * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

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
         * Returns a mutable builder for constructing an instance of [CardMerchant].
         *
         * The following fields are required:
         * ```kotlin
         * .descriptor()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardMerchant]. */
    class Builder internal constructor() {

        private var descriptor: JsonField<String>? = null
        private var country: JsonField<String> = JsonMissing.of()
        private var mcc: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardMerchant: CardMerchant) = apply {
            descriptor = cardMerchant.descriptor
            country = cardMerchant.country
            mcc = cardMerchant.mcc
            additionalProperties = cardMerchant.additionalProperties.toMutableMap()
        }

        /** Merchant descriptor string captured from the card network at authorization time. */
        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        /**
         * Sets [Builder.descriptor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.descriptor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /** Two-letter ISO 3166-1 alpha-2 country code of the merchant. */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Merchant Category Code (ISO 18245) — four-digit numeric string. */
        fun mcc(mcc: String) = mcc(JsonField.of(mcc))

        /**
         * Sets [Builder.mcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

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
         * Returns an immutable instance of [CardMerchant].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .descriptor()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardMerchant =
            CardMerchant(
                checkRequired("descriptor", descriptor),
                country,
                mcc,
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
    fun validate(): CardMerchant = apply {
        if (validated) {
            return@apply
        }

        descriptor()
        country()
        mcc()
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
        (if (descriptor.asKnown() == null) 0 else 1) +
            (if (country.asKnown() == null) 0 else 1) +
            (if (mcc.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardMerchant &&
            descriptor == other.descriptor &&
            country == other.country &&
            mcc == other.mcc &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(descriptor, country, mcc, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardMerchant{descriptor=$descriptor, country=$country, mcc=$mcc, additionalProperties=$additionalProperties}"
}
