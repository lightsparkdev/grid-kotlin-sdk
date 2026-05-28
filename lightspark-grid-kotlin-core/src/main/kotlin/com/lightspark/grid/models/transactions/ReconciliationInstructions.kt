// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

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

class ReconciliationInstructions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val reference: JsonField<String>,
    private val transactionHash: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("reference") @ExcludeMissing reference: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transactionHash")
        @ExcludeMissing
        transactionHash: JsonField<String> = JsonMissing.of(),
    ) : this(reference, transactionHash, mutableMapOf())

    /**
     * Unique reference code to include with the payment to match it with the correct incoming
     * transaction, when available.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun reference(): String? = reference.getNullable("reference")

    /**
     * Transaction hash for the crypto transfer that delivered funds to the transaction destination,
     * when available.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun transactionHash(): String? = transactionHash.getNullable("transactionHash")

    /**
     * Returns the raw JSON value of [reference].
     *
     * Unlike [reference], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reference") @ExcludeMissing fun _reference(): JsonField<String> = reference

    /**
     * Returns the raw JSON value of [transactionHash].
     *
     * Unlike [transactionHash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transactionHash")
    @ExcludeMissing
    fun _transactionHash(): JsonField<String> = transactionHash

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
         * Returns a mutable builder for constructing an instance of [ReconciliationInstructions].
         */
        fun builder() = Builder()
    }

    /** A builder for [ReconciliationInstructions]. */
    class Builder internal constructor() {

        private var reference: JsonField<String> = JsonMissing.of()
        private var transactionHash: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(reconciliationInstructions: ReconciliationInstructions) = apply {
            reference = reconciliationInstructions.reference
            transactionHash = reconciliationInstructions.transactionHash
            additionalProperties = reconciliationInstructions.additionalProperties.toMutableMap()
        }

        /**
         * Unique reference code to include with the payment to match it with the correct incoming
         * transaction, when available.
         */
        fun reference(reference: String) = reference(JsonField.of(reference))

        /**
         * Sets [Builder.reference] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reference] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reference(reference: JsonField<String>) = apply { this.reference = reference }

        /**
         * Transaction hash for the crypto transfer that delivered funds to the transaction
         * destination, when available.
         */
        fun transactionHash(transactionHash: String) =
            transactionHash(JsonField.of(transactionHash))

        /**
         * Sets [Builder.transactionHash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transactionHash] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transactionHash(transactionHash: JsonField<String>) = apply {
            this.transactionHash = transactionHash
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
         * Returns an immutable instance of [ReconciliationInstructions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ReconciliationInstructions =
            ReconciliationInstructions(
                reference,
                transactionHash,
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
    fun validate(): ReconciliationInstructions = apply {
        if (validated) {
            return@apply
        }

        reference()
        transactionHash()
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
        (if (reference.asKnown() == null) 0 else 1) +
            (if (transactionHash.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReconciliationInstructions &&
            reference == other.reference &&
            transactionHash == other.transactionHash &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(reference, transactionHash, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ReconciliationInstructions{reference=$reference, transactionHash=$transactionHash, additionalProperties=$additionalProperties}"
}
