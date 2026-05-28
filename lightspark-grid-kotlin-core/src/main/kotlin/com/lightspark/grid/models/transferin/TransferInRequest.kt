// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

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

class TransferInRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destination: JsonField<InternalAccountReference>,
    private val source: JsonField<ExternalAccountReference>,
    private val amount: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<InternalAccountReference> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<ExternalAccountReference> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
    ) : this(destination, source, amount, mutableMapOf())

    /**
     * Destination internal account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): InternalAccountReference = destination.getRequired("destination")

    /**
     * Source external account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): ExternalAccountReference = source.getRequired("source")

    /**
     * Amount in the smallest unit of the currency (e.g., cents for USD/EUR, satoshis for BTC)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Long? = amount.getNullable("amount")

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<InternalAccountReference> = destination

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<ExternalAccountReference> = source

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
         * Returns a mutable builder for constructing an instance of [TransferInRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransferInRequest]. */
    class Builder internal constructor() {

        private var destination: JsonField<InternalAccountReference>? = null
        private var source: JsonField<ExternalAccountReference>? = null
        private var amount: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transferInRequest: TransferInRequest) = apply {
            destination = transferInRequest.destination
            source = transferInRequest.source
            amount = transferInRequest.amount
            additionalProperties = transferInRequest.additionalProperties.toMutableMap()
        }

        /** Destination internal account details */
        fun destination(destination: InternalAccountReference) =
            destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed
         * [InternalAccountReference] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun destination(destination: JsonField<InternalAccountReference>) = apply {
            this.destination = destination
        }

        /** Source external account details */
        fun source(source: ExternalAccountReference) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [ExternalAccountReference]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun source(source: JsonField<ExternalAccountReference>) = apply { this.source = source }

        /**
         * Amount in the smallest unit of the currency (e.g., cents for USD/EUR, satoshis for BTC)
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
         * Returns an immutable instance of [TransferInRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferInRequest =
            TransferInRequest(
                checkRequired("destination", destination),
                checkRequired("source", source),
                amount,
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
    fun validate(): TransferInRequest = apply {
        if (validated) {
            return@apply
        }

        destination().validate()
        source().validate()
        amount()
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
        (destination.asKnown()?.validity() ?: 0) +
            (source.asKnown()?.validity() ?: 0) +
            (if (amount.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferInRequest &&
            destination == other.destination &&
            source == other.source &&
            amount == other.amount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(destination, source, amount, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferInRequest{destination=$destination, source=$source, amount=$amount, additionalProperties=$additionalProperties}"
}
