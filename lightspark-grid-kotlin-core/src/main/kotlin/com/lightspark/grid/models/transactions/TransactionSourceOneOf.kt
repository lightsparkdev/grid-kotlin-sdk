// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

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
import com.lightspark.grid.core.Enum
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
@JsonDeserialize(using = TransactionSourceOneOf.Deserializer::class)
@JsonSerialize(using = TransactionSourceOneOf.Serializer::class)
class TransactionSourceOneOf
private constructor(
    private val accountTransactionSource: AccountTransactionSource? = null,
    private val umaAddressTransactionSource: UmaAddressTransactionSource? = null,
    private val realtimeFundingTransactionSource: RealtimeFundingTransactionSource? = null,
    private val _json: JsonValue? = null,
) {

    /** Source account details */
    fun accountTransactionSource(): AccountTransactionSource? = accountTransactionSource

    /** UMA address source details */
    fun umaAddressTransactionSource(): UmaAddressTransactionSource? = umaAddressTransactionSource

    /**
     * Transaction was funded using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
     * etc.).
     */
    fun realtimeFundingTransactionSource(): RealtimeFundingTransactionSource? =
        realtimeFundingTransactionSource

    fun isAccountTransactionSource(): Boolean = accountTransactionSource != null

    fun isUmaAddressTransactionSource(): Boolean = umaAddressTransactionSource != null

    fun isRealtimeFundingTransactionSource(): Boolean = realtimeFundingTransactionSource != null

    /** Source account details */
    fun asAccountTransactionSource(): AccountTransactionSource =
        accountTransactionSource.getOrThrow("accountTransactionSource")

    /** UMA address source details */
    fun asUmaAddressTransactionSource(): UmaAddressTransactionSource =
        umaAddressTransactionSource.getOrThrow("umaAddressTransactionSource")

    /**
     * Transaction was funded using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
     * etc.).
     */
    fun asRealtimeFundingTransactionSource(): RealtimeFundingTransactionSource =
        realtimeFundingTransactionSource.getOrThrow("realtimeFundingTransactionSource")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountTransactionSource != null ->
                visitor.visitAccountTransactionSource(accountTransactionSource)
            umaAddressTransactionSource != null ->
                visitor.visitUmaAddressTransactionSource(umaAddressTransactionSource)
            realtimeFundingTransactionSource != null ->
                visitor.visitRealtimeFundingTransactionSource(realtimeFundingTransactionSource)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TransactionSourceOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountTransactionSource(
                    accountTransactionSource: AccountTransactionSource
                ) {
                    accountTransactionSource.validate()
                }

                override fun visitUmaAddressTransactionSource(
                    umaAddressTransactionSource: UmaAddressTransactionSource
                ) {
                    umaAddressTransactionSource.validate()
                }

                override fun visitRealtimeFundingTransactionSource(
                    realtimeFundingTransactionSource: RealtimeFundingTransactionSource
                ) {
                    realtimeFundingTransactionSource.validate()
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
                override fun visitAccountTransactionSource(
                    accountTransactionSource: AccountTransactionSource
                ) = accountTransactionSource.validity()

                override fun visitUmaAddressTransactionSource(
                    umaAddressTransactionSource: UmaAddressTransactionSource
                ) = umaAddressTransactionSource.validity()

                override fun visitRealtimeFundingTransactionSource(
                    realtimeFundingTransactionSource: RealtimeFundingTransactionSource
                ) = realtimeFundingTransactionSource.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionSourceOneOf &&
            accountTransactionSource == other.accountTransactionSource &&
            umaAddressTransactionSource == other.umaAddressTransactionSource &&
            realtimeFundingTransactionSource == other.realtimeFundingTransactionSource
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountTransactionSource,
            umaAddressTransactionSource,
            realtimeFundingTransactionSource,
        )

    override fun toString(): String =
        when {
            accountTransactionSource != null ->
                "TransactionSourceOneOf{accountTransactionSource=$accountTransactionSource}"
            umaAddressTransactionSource != null ->
                "TransactionSourceOneOf{umaAddressTransactionSource=$umaAddressTransactionSource}"
            realtimeFundingTransactionSource != null ->
                "TransactionSourceOneOf{realtimeFundingTransactionSource=$realtimeFundingTransactionSource}"
            _json != null -> "TransactionSourceOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TransactionSourceOneOf")
        }

    companion object {

        /** Source account details */
        fun ofAccountTransactionSource(accountTransactionSource: AccountTransactionSource) =
            TransactionSourceOneOf(accountTransactionSource = accountTransactionSource)

        /** UMA address source details */
        fun ofUmaAddressTransactionSource(
            umaAddressTransactionSource: UmaAddressTransactionSource
        ) = TransactionSourceOneOf(umaAddressTransactionSource = umaAddressTransactionSource)

        /**
         * Transaction was funded using a real-time funding source (RTP, SEPA Instant, Spark,
         * Stables, etc.).
         */
        fun ofRealtimeFundingTransactionSource(
            realtimeFundingTransactionSource: RealtimeFundingTransactionSource
        ) =
            TransactionSourceOneOf(
                realtimeFundingTransactionSource = realtimeFundingTransactionSource
            )
    }

    /**
     * An interface that defines how to map each variant of [TransactionSourceOneOf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Source account details */
        fun visitAccountTransactionSource(accountTransactionSource: AccountTransactionSource): T

        /** UMA address source details */
        fun visitUmaAddressTransactionSource(
            umaAddressTransactionSource: UmaAddressTransactionSource
        ): T

        /**
         * Transaction was funded using a real-time funding source (RTP, SEPA Instant, Spark,
         * Stables, etc.).
         */
        fun visitRealtimeFundingTransactionSource(
            realtimeFundingTransactionSource: RealtimeFundingTransactionSource
        ): T

        /**
         * Maps an unknown variant of [TransactionSourceOneOf] to a value of type [T].
         *
         * An instance of [TransactionSourceOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown TransactionSourceOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TransactionSourceOneOf>(TransactionSourceOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TransactionSourceOneOf {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AccountTransactionSource>())?.let {
                            TransactionSourceOneOf(accountTransactionSource = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UmaAddressTransactionSource>())?.let {
                            TransactionSourceOneOf(umaAddressTransactionSource = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RealtimeFundingTransactionSource>())
                            ?.let {
                                TransactionSourceOneOf(
                                    realtimeFundingTransactionSource = it,
                                    _json = json,
                                )
                            },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> TransactionSourceOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TransactionSourceOneOf>(TransactionSourceOneOf::class) {

        override fun serialize(
            value: TransactionSourceOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accountTransactionSource != null ->
                    generator.writeObject(value.accountTransactionSource)
                value.umaAddressTransactionSource != null ->
                    generator.writeObject(value.umaAddressTransactionSource)
                value.realtimeFundingTransactionSource != null ->
                    generator.writeObject(value.realtimeFundingTransactionSource)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TransactionSourceOneOf")
            }
        }
    }

    /** Source account details */
    class AccountTransactionSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sourceType: JsonField<BaseTransactionSource.SourceType>,
        private val currency: JsonField<String>,
        private val accountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<BaseTransactionSource.SourceType> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
        ) : this(sourceType, currency, accountId, mutableMapOf())

        fun toBaseTransactionSource(): BaseTransactionSource =
            BaseTransactionSource.builder().sourceType(sourceType).currency(currency).build()

        /**
         * Type of transaction source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): BaseTransactionSource.SourceType = sourceType.getRequired("sourceType")

        /**
         * Currency code for the source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * Source account identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<BaseTransactionSource.SourceType> = sourceType

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

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
             * Returns a mutable builder for constructing an instance of [AccountTransactionSource].
             *
             * The following fields are required:
             * ```kotlin
             * .sourceType()
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountTransactionSource]. */
        class Builder internal constructor() {

            private var sourceType: JsonField<BaseTransactionSource.SourceType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var accountId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountTransactionSource: AccountTransactionSource) = apply {
                sourceType = accountTransactionSource.sourceType
                currency = accountTransactionSource.currency
                accountId = accountTransactionSource.accountId
                additionalProperties = accountTransactionSource.additionalProperties.toMutableMap()
            }

            /** Type of transaction source */
            fun sourceType(sourceType: BaseTransactionSource.SourceType) =
                sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed
             * [BaseTransactionSource.SourceType] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun sourceType(sourceType: JsonField<BaseTransactionSource.SourceType>) = apply {
                this.sourceType = sourceType
            }

            /** Currency code for the source */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
             * Returns an immutable instance of [AccountTransactionSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sourceType()
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountTransactionSource =
                AccountTransactionSource(
                    checkRequired("sourceType", sourceType),
                    currency,
                    checkRequired("accountId", accountId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountTransactionSource = apply {
            if (validated) {
                return@apply
            }

            sourceType().validate()
            currency()
            accountId()
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
            (sourceType.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (accountId.asKnown() == null) 0 else 1)

        class SourceType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCOUNT = of("ACCOUNT")

                fun of(value: String) = SourceType(JsonField.of(value))
            }

            /** An enum containing [SourceType]'s known values. */
            enum class Known {
                ACCOUNT
            }

            /**
             * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SourceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT,
                /**
                 * An enum member indicating that [SourceType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT -> Value.ACCOUNT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT -> Known.ACCOUNT
                    else -> throw LightsparkGridInvalidDataException("Unknown SourceType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): SourceType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SourceType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountTransactionSource &&
                sourceType == other.sourceType &&
                currency == other.currency &&
                accountId == other.accountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(sourceType, currency, accountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountTransactionSource{sourceType=$sourceType, currency=$currency, accountId=$accountId, additionalProperties=$additionalProperties}"
    }

    /** UMA address source details */
    class UmaAddressTransactionSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sourceType: JsonField<BaseTransactionSource.SourceType>,
        private val currency: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<BaseTransactionSource.SourceType> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
        ) : this(sourceType, currency, umaAddress, mutableMapOf())

        fun toBaseTransactionSource(): BaseTransactionSource =
            BaseTransactionSource.builder().sourceType(sourceType).currency(currency).build()

        /**
         * Type of transaction source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): BaseTransactionSource.SourceType = sourceType.getRequired("sourceType")

        /**
         * Currency code for the source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * UMA address of the sender
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<BaseTransactionSource.SourceType> = sourceType

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [umaAddress].
         *
         * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("umaAddress")
        @ExcludeMissing
        fun _umaAddress(): JsonField<String> = umaAddress

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
             * [UmaAddressTransactionSource].
             *
             * The following fields are required:
             * ```kotlin
             * .sourceType()
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UmaAddressTransactionSource]. */
        class Builder internal constructor() {

            private var sourceType: JsonField<BaseTransactionSource.SourceType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var umaAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(umaAddressTransactionSource: UmaAddressTransactionSource) = apply {
                sourceType = umaAddressTransactionSource.sourceType
                currency = umaAddressTransactionSource.currency
                umaAddress = umaAddressTransactionSource.umaAddress
                additionalProperties =
                    umaAddressTransactionSource.additionalProperties.toMutableMap()
            }

            /** Type of transaction source */
            fun sourceType(sourceType: BaseTransactionSource.SourceType) =
                sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed
             * [BaseTransactionSource.SourceType] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun sourceType(sourceType: JsonField<BaseTransactionSource.SourceType>) = apply {
                this.sourceType = sourceType
            }

            /** Currency code for the source */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** UMA address of the sender */
            fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

            /**
             * Sets [Builder.umaAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.umaAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

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
             * Returns an immutable instance of [UmaAddressTransactionSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sourceType()
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UmaAddressTransactionSource =
                UmaAddressTransactionSource(
                    checkRequired("sourceType", sourceType),
                    currency,
                    checkRequired("umaAddress", umaAddress),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UmaAddressTransactionSource = apply {
            if (validated) {
                return@apply
            }

            sourceType().validate()
            currency()
            umaAddress()
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
            (sourceType.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1)

        class SourceType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val UMA_ADDRESS = of("UMA_ADDRESS")

                fun of(value: String) = SourceType(JsonField.of(value))
            }

            /** An enum containing [SourceType]'s known values. */
            enum class Known {
                UMA_ADDRESS
            }

            /**
             * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SourceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UMA_ADDRESS,
                /**
                 * An enum member indicating that [SourceType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    UMA_ADDRESS -> Value.UMA_ADDRESS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    UMA_ADDRESS -> Known.UMA_ADDRESS
                    else -> throw LightsparkGridInvalidDataException("Unknown SourceType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): SourceType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SourceType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UmaAddressTransactionSource &&
                sourceType == other.sourceType &&
                currency == other.currency &&
                umaAddress == other.umaAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(sourceType, currency, umaAddress, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UmaAddressTransactionSource{sourceType=$sourceType, currency=$currency, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
    }

    /**
     * Transaction was funded using a real-time funding source (RTP, SEPA Instant, Spark, Stables,
     * etc.).
     */
    class RealtimeFundingTransactionSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val sourceType: JsonField<BaseTransactionSource.SourceType>,
        private val currency: JsonField<String>,
        private val customerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<BaseTransactionSource.SourceType> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
        ) : this(sourceType, currency, customerId, mutableMapOf())

        fun toBaseTransactionSource(): BaseTransactionSource =
            BaseTransactionSource.builder().sourceType(sourceType).currency(currency).build()

        /**
         * Type of transaction source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): BaseTransactionSource.SourceType = sourceType.getRequired("sourceType")

        /**
         * Currency code for the source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * The customer on whose behalf the transaction was initiated.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customerId")

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<BaseTransactionSource.SourceType> = sourceType

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
             * [RealtimeFundingTransactionSource].
             *
             * The following fields are required:
             * ```kotlin
             * .sourceType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RealtimeFundingTransactionSource]. */
        class Builder internal constructor() {

            private var sourceType: JsonField<BaseTransactionSource.SourceType>? = null
            private var currency: JsonField<String> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(realtimeFundingTransactionSource: RealtimeFundingTransactionSource) =
                apply {
                    sourceType = realtimeFundingTransactionSource.sourceType
                    currency = realtimeFundingTransactionSource.currency
                    customerId = realtimeFundingTransactionSource.customerId
                    additionalProperties =
                        realtimeFundingTransactionSource.additionalProperties.toMutableMap()
                }

            /** Type of transaction source */
            fun sourceType(sourceType: BaseTransactionSource.SourceType) =
                sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed
             * [BaseTransactionSource.SourceType] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun sourceType(sourceType: JsonField<BaseTransactionSource.SourceType>) = apply {
                this.sourceType = sourceType
            }

            /** Currency code for the source */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** The customer on whose behalf the transaction was initiated. */
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
             * Returns an immutable instance of [RealtimeFundingTransactionSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .sourceType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RealtimeFundingTransactionSource =
                RealtimeFundingTransactionSource(
                    checkRequired("sourceType", sourceType),
                    currency,
                    customerId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RealtimeFundingTransactionSource = apply {
            if (validated) {
                return@apply
            }

            sourceType().validate()
            currency()
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
            (sourceType.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1)

        class SourceType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val REALTIME_FUNDING = of("REALTIME_FUNDING")

                fun of(value: String) = SourceType(JsonField.of(value))
            }

            /** An enum containing [SourceType]'s known values. */
            enum class Known {
                REALTIME_FUNDING
            }

            /**
             * An enum containing [SourceType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SourceType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                REALTIME_FUNDING,
                /**
                 * An enum member indicating that [SourceType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    REALTIME_FUNDING -> Value.REALTIME_FUNDING
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    REALTIME_FUNDING -> Known.REALTIME_FUNDING
                    else -> throw LightsparkGridInvalidDataException("Unknown SourceType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): SourceType = apply {
                if (validated) {
                    return@apply
                }

                known()
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
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SourceType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RealtimeFundingTransactionSource &&
                sourceType == other.sourceType &&
                currency == other.currency &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(sourceType, currency, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealtimeFundingTransactionSource{sourceType=$sourceType, currency=$currency, customerId=$customerId, additionalProperties=$additionalProperties}"
    }
}
