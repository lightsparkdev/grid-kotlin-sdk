// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/** Source account details */
@JsonDeserialize(using = QuoteSourceOneOf.Deserializer::class)
@JsonSerialize(using = QuoteSourceOneOf.Serializer::class)
class QuoteSourceOneOf
private constructor(
    private val accountQuoteSource: AccountQuoteSource? = null,
    private val realtimeFundingQuoteSource: RealtimeFundingQuoteSource? = null,
    private val _json: JsonValue? = null,
) {

    /** Source account details */
    fun accountQuoteSource(): AccountQuoteSource? = accountQuoteSource

    /**
     * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables, etc.).
     * This will require manual just-in-time funding using `paymentInstructions` in the response.
     * Because quotes expire quickly, this option is only valid for instant payment methods. Do not
     * try to fund a quote with a non-instant payment method (ACH, etc.).
     */
    fun realtimeFundingQuoteSource(): RealtimeFundingQuoteSource? = realtimeFundingQuoteSource

    fun isAccountQuoteSource(): Boolean = accountQuoteSource != null

    fun isRealtimeFundingQuoteSource(): Boolean = realtimeFundingQuoteSource != null

    /** Source account details */
    fun asAccountQuoteSource(): AccountQuoteSource =
        accountQuoteSource.getOrThrow("accountQuoteSource")

    /**
     * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables, etc.).
     * This will require manual just-in-time funding using `paymentInstructions` in the response.
     * Because quotes expire quickly, this option is only valid for instant payment methods. Do not
     * try to fund a quote with a non-instant payment method (ACH, etc.).
     */
    fun asRealtimeFundingQuoteSource(): RealtimeFundingQuoteSource =
        realtimeFundingQuoteSource.getOrThrow("realtimeFundingQuoteSource")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountQuoteSource != null -> visitor.visitAccountQuoteSource(accountQuoteSource)
            realtimeFundingQuoteSource != null ->
                visitor.visitRealtimeFundingQuoteSource(realtimeFundingQuoteSource)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): QuoteSourceOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountQuoteSource(accountQuoteSource: AccountQuoteSource) {
                    accountQuoteSource.validate()
                }

                override fun visitRealtimeFundingQuoteSource(
                    realtimeFundingQuoteSource: RealtimeFundingQuoteSource
                ) {
                    realtimeFundingQuoteSource.validate()
                }
            }
        )
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
        accept(
            object : Visitor<Int> {
                override fun visitAccountQuoteSource(accountQuoteSource: AccountQuoteSource) =
                    accountQuoteSource.validity()

                override fun visitRealtimeFundingQuoteSource(
                    realtimeFundingQuoteSource: RealtimeFundingQuoteSource
                ) = realtimeFundingQuoteSource.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteSourceOneOf &&
            accountQuoteSource == other.accountQuoteSource &&
            realtimeFundingQuoteSource == other.realtimeFundingQuoteSource
    }

    override fun hashCode(): Int = Objects.hash(accountQuoteSource, realtimeFundingQuoteSource)

    override fun toString(): String =
        when {
            accountQuoteSource != null -> "QuoteSourceOneOf{accountQuoteSource=$accountQuoteSource}"
            realtimeFundingQuoteSource != null ->
                "QuoteSourceOneOf{realtimeFundingQuoteSource=$realtimeFundingQuoteSource}"
            _json != null -> "QuoteSourceOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid QuoteSourceOneOf")
        }

    companion object {

        /** Source account details */
        fun ofAccountQuoteSource(accountQuoteSource: AccountQuoteSource) =
            QuoteSourceOneOf(accountQuoteSource = accountQuoteSource)

        /**
         * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
         * etc.). This will require manual just-in-time funding using `paymentInstructions` in the
         * response. Because quotes expire quickly, this option is only valid for instant payment
         * methods. Do not try to fund a quote with a non-instant payment method (ACH, etc.).
         */
        fun ofRealtimeFundingQuoteSource(realtimeFundingQuoteSource: RealtimeFundingQuoteSource) =
            QuoteSourceOneOf(realtimeFundingQuoteSource = realtimeFundingQuoteSource)
    }

    /**
     * An interface that defines how to map each variant of [QuoteSourceOneOf] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /** Source account details */
        fun visitAccountQuoteSource(accountQuoteSource: AccountQuoteSource): T

        /**
         * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
         * etc.). This will require manual just-in-time funding using `paymentInstructions` in the
         * response. Because quotes expire quickly, this option is only valid for instant payment
         * methods. Do not try to fund a quote with a non-instant payment method (ACH, etc.).
         */
        fun visitRealtimeFundingQuoteSource(
            realtimeFundingQuoteSource: RealtimeFundingQuoteSource
        ): T

        /**
         * Maps an unknown variant of [QuoteSourceOneOf] to a value of type [T].
         *
         * An instance of [QuoteSourceOneOf] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown QuoteSourceOneOf: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<QuoteSourceOneOf>(QuoteSourceOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): QuoteSourceOneOf {
            val json = JsonValue.fromJsonNode(node)
            val sourceType = json.asObject()?.get("sourceType")?.asString()

            when (sourceType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AccountQuoteSource>())?.let {
                            QuoteSourceOneOf(accountQuoteSource = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RealtimeFundingQuoteSource>())?.let {
                            QuoteSourceOneOf(realtimeFundingQuoteSource = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> QuoteSourceOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<QuoteSourceOneOf>(QuoteSourceOneOf::class) {

        override fun serialize(
            value: QuoteSourceOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accountQuoteSource != null -> generator.writeObject(value.accountQuoteSource)
                value.realtimeFundingQuoteSource != null ->
                    generator.writeObject(value.realtimeFundingQuoteSource)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid QuoteSourceOneOf")
            }
        }
    }

    /** Source account details */
    class AccountQuoteSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val sourceType: JsonValue,
        private val customerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceType") @ExcludeMissing sourceType: JsonValue = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
        ) : this(accountId, sourceType, customerId, mutableMapOf())

        /**
         * Source account identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("sourceType") @ExcludeMissing fun _sourceType(): JsonValue = sourceType

        /**
         * Required when funding from an FBO account to identify the customer on whose behalf the
         * transaction is being initiated. Otherwise, will default to the customerId of the account
         * owner.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customerId")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
             * Returns a mutable builder for constructing an instance of [AccountQuoteSource].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountQuoteSource]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var sourceType: JsonValue = JsonValue.from("ACCOUNT")
            private var customerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountQuoteSource: AccountQuoteSource) = apply {
                accountId = accountQuoteSource.accountId
                sourceType = accountQuoteSource.sourceType
                customerId = accountQuoteSource.customerId
                additionalProperties = accountQuoteSource.additionalProperties.toMutableMap()
            }

            /** Source account identifier */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /**
             * Sets [Builder.accountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceType(sourceType: JsonValue) = apply { this.sourceType = sourceType }

            /**
             * Required when funding from an FBO account to identify the customer on whose behalf
             * the transaction is being initiated. Otherwise, will default to the customerId of the
             * account owner.
             */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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
             * Returns an immutable instance of [AccountQuoteSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountQuoteSource =
                AccountQuoteSource(
                    checkRequired("accountId", accountId),
                    sourceType,
                    customerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountQuoteSource = apply {
            if (validated) {
                return@apply
            }

            accountId()
            _sourceType().let {
                if (it != JsonValue.from("ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'sourceType' is invalid, received $it"
                    )
                }
            }
            customerId()
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
            (if (accountId.asKnown() == null) 0 else 1) +
                sourceType.let { if (it == JsonValue.from("ACCOUNT")) 1 else 0 } +
                (if (customerId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountQuoteSource &&
                accountId == other.accountId &&
                sourceType == other.sourceType &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, sourceType, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountQuoteSource{accountId=$accountId, sourceType=$sourceType, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    /**
     * Fund the quote using a real-time funding source (RTP, SEPA Instant, Spark, Stables, etc.).
     * This will require manual just-in-time funding using `paymentInstructions` in the response.
     * Because quotes expire quickly, this option is only valid for instant payment methods. Do not
     * try to fund a quote with a non-instant payment method (ACH, etc.).
     */
    class RealtimeFundingQuoteSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val sourceType: JsonValue,
        private val customerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceType") @ExcludeMissing sourceType: JsonValue = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
        ) : this(currency, sourceType, customerId, mutableMapOf())

        /**
         * Currency code for the funding source. See
         * [Supported Currencies](https://grid.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
         * for the full list of supported fiat and crypto currencies.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("REALTIME_FUNDING")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("sourceType") @ExcludeMissing fun _sourceType(): JsonValue = sourceType

        /**
         * Source customer ID. If this transaction is being initiated on behalf of a customer, this
         * is required. If customerId is not provided, the quote will be created on behalf of the
         * platform itself.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customerId")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

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
             * [RealtimeFundingQuoteSource].
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RealtimeFundingQuoteSource]. */
        class Builder internal constructor() {

            private var currency: JsonField<String>? = null
            private var sourceType: JsonValue = JsonValue.from("REALTIME_FUNDING")
            private var customerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(realtimeFundingQuoteSource: RealtimeFundingQuoteSource) = apply {
                currency = realtimeFundingQuoteSource.currency
                sourceType = realtimeFundingQuoteSource.sourceType
                customerId = realtimeFundingQuoteSource.customerId
                additionalProperties =
                    realtimeFundingQuoteSource.additionalProperties.toMutableMap()
            }

            /**
             * Currency code for the funding source. See
             * [Supported Currencies](https://grid.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
             * for the full list of supported fiat and crypto currencies.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("REALTIME_FUNDING")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceType(sourceType: JsonValue) = apply { this.sourceType = sourceType }

            /**
             * Source customer ID. If this transaction is being initiated on behalf of a customer,
             * this is required. If customerId is not provided, the quote will be created on behalf
             * of the platform itself.
             */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

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
             * Returns an immutable instance of [RealtimeFundingQuoteSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .currency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RealtimeFundingQuoteSource =
                RealtimeFundingQuoteSource(
                    checkRequired("currency", currency),
                    sourceType,
                    customerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RealtimeFundingQuoteSource = apply {
            if (validated) {
                return@apply
            }

            currency()
            _sourceType().let {
                if (it != JsonValue.from("REALTIME_FUNDING")) {
                    throw LightsparkGridInvalidDataException(
                        "'sourceType' is invalid, received $it"
                    )
                }
            }
            customerId()
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
            (if (currency.asKnown() == null) 0 else 1) +
                sourceType.let { if (it == JsonValue.from("REALTIME_FUNDING")) 1 else 0 } +
                (if (customerId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RealtimeFundingQuoteSource &&
                currency == other.currency &&
                sourceType == other.sourceType &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, sourceType, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealtimeFundingQuoteSource{currency=$currency, sourceType=$sourceType, customerId=$customerId, additionalProperties=$additionalProperties}"
    }
}
