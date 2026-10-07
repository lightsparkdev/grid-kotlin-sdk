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
     * Transaction was funded using an external funding source. All originator fields are optional
     * and populated on a best-effort basis depending on what the funding source provides.
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
     * Transaction was funded using an external funding source. All originator fields are optional
     * and populated on a best-effort basis depending on what the funding source provides.
     */
    fun asRealtimeFundingTransactionSource(): RealtimeFundingTransactionSource =
        realtimeFundingTransactionSource.getOrThrow("realtimeFundingTransactionSource")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.lightspark.grid.core.JsonValue
     *
     * val result: String? = transactionSourceOneOf.accept(object : TransactionSourceOneOf.Visitor<String?> {
     *     override fun visitAccountTransactionSource(accountTransactionSource: AccountTransactionSource): String? = accountTransactionSource.toString()
     *
     *     // ...
     *
     *     override fun unknown(json: JsonValue?): String? {
     *         // Or inspect the `json`.
     *         return null
     *     }
     * })
     * ```
     *
     * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
     *   [visitor] and the current variant is unknown.
     */
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
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
         * Transaction was funded using an external funding source. All originator fields are
         * optional and populated on a best-effort basis depending on what the funding source
         * provides.
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
         * Transaction was funded using an external funding source. All originator fields are
         * optional and populated on a best-effort basis depending on what the funding source
         * provides.
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
            val sourceType = json.asObject()?.get("sourceType")?.asString()

            when (sourceType) {
                "ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<AccountTransactionSource>())?.let {
                        TransactionSourceOneOf(accountTransactionSource = it, _json = json)
                    } ?: TransactionSourceOneOf(_json = json)
                }
                "UMA_ADDRESS" -> {
                    return tryDeserialize(node, jacksonTypeRef<UmaAddressTransactionSource>())
                        ?.let {
                            TransactionSourceOneOf(umaAddressTransactionSource = it, _json = json)
                        } ?: TransactionSourceOneOf(_json = json)
                }
                "REALTIME_FUNDING" -> {
                    return tryDeserialize(node, jacksonTypeRef<RealtimeFundingTransactionSource>())
                        ?.let {
                            TransactionSourceOneOf(
                                realtimeFundingTransactionSource = it,
                                _json = json,
                            )
                        } ?: TransactionSourceOneOf(_json = json)
                }
            }

            return TransactionSourceOneOf(_json = json)
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
        private val currency: JsonField<String>,
        private val accountId: JsonField<String>,
        private val sourceType: JsonField<SourceType>,
        private val onChainTransaction: JsonField<OnChainTransaction>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<SourceType> = JsonMissing.of(),
            @JsonProperty("onChainTransaction")
            @ExcludeMissing
            onChainTransaction: JsonField<OnChainTransaction> = JsonMissing.of(),
        ) : this(currency, accountId, sourceType, onChainTransaction, mutableMapOf())

        fun toBaseTransactionSource(): BaseTransactionSource =
            BaseTransactionSource.builder().currency(currency).build()

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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): SourceType = sourceType.getRequired("sourceType")

        /**
         * On-chain transaction that delivered funds from this source, when the source is an
         * external crypto wallet. Populated once the crypto transfer has settled.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onChainTransaction(): OnChainTransaction? =
            onChainTransaction.getNullable("onChainTransaction")

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

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<SourceType> = sourceType

        /**
         * Returns the raw JSON value of [onChainTransaction].
         *
         * Unlike [onChainTransaction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onChainTransaction")
        @ExcludeMissing
        fun _onChainTransaction(): JsonField<OnChainTransaction> = onChainTransaction

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
             * .accountId()
             * .sourceType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountTransactionSource]. */
        class Builder internal constructor() {

            private var currency: JsonField<String> = JsonMissing.of()
            private var accountId: JsonField<String>? = null
            private var sourceType: JsonField<SourceType>? = null
            private var onChainTransaction: JsonField<OnChainTransaction> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountTransactionSource: AccountTransactionSource) = apply {
                currency = accountTransactionSource.currency
                accountId = accountTransactionSource.accountId
                sourceType = accountTransactionSource.sourceType
                onChainTransaction = accountTransactionSource.onChainTransaction
                additionalProperties = accountTransactionSource.additionalProperties.toMutableMap()
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

            fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceType(sourceType: JsonField<SourceType>) = apply {
                this.sourceType = sourceType
            }

            /**
             * On-chain transaction that delivered funds from this source, when the source is an
             * external crypto wallet. Populated once the crypto transfer has settled.
             */
            fun onChainTransaction(onChainTransaction: OnChainTransaction) =
                onChainTransaction(JsonField.of(onChainTransaction))

            /**
             * Sets [Builder.onChainTransaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onChainTransaction] with a well-typed
             * [OnChainTransaction] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun onChainTransaction(onChainTransaction: JsonField<OnChainTransaction>) = apply {
                this.onChainTransaction = onChainTransaction
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
             * Returns an immutable instance of [AccountTransactionSource].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * .sourceType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): AccountTransactionSource =
                AccountTransactionSource(
                    currency,
                    checkRequired("accountId", accountId),
                    checkRequired("sourceType", sourceType),
                    onChainTransaction,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): AccountTransactionSource = apply {
            if (validated) {
                return@apply
            }

            currency()
            accountId()
            sourceType().validate()
            onChainTransaction()?.validate()
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
                (if (accountId.asKnown() == null) 0 else 1) +
                (sourceType.asKnown()?.validity() ?: 0) +
                (onChainTransaction.asKnown()?.validity() ?: 0)

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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

        /**
         * On-chain transaction that delivered funds from this source, when the source is an
         * external crypto wallet. Populated once the crypto transfer has settled.
         */
        class OnChainTransaction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val network: JsonField<Network>,
            private val transactionHash: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("network")
                @ExcludeMissing
                network: JsonField<Network> = JsonMissing.of(),
                @JsonProperty("transactionHash")
                @ExcludeMissing
                transactionHash: JsonField<String> = JsonMissing.of(),
            ) : this(network, transactionHash, mutableMapOf())

            /**
             * Blockchain network the transaction settled on (mainnet vs test network is determined
             * by your platform environment).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun network(): Network = network.getRequired("network")

            /**
             * On-chain transaction hash of the crypto transfer for this leg of the transaction.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transactionHash(): String = transactionHash.getRequired("transactionHash")

            /**
             * Returns the raw JSON value of [network].
             *
             * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

            /**
             * Returns the raw JSON value of [transactionHash].
             *
             * Unlike [transactionHash], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [OnChainTransaction].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .network()
                 * .transactionHash()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OnChainTransaction]. */
            class Builder internal constructor() {

                private var network: JsonField<Network>? = null
                private var transactionHash: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(onChainTransaction: OnChainTransaction) = apply {
                    network = onChainTransaction.network
                    transactionHash = onChainTransaction.transactionHash
                    additionalProperties = onChainTransaction.additionalProperties.toMutableMap()
                }

                /**
                 * Blockchain network the transaction settled on (mainnet vs test network is
                 * determined by your platform environment).
                 */
                fun network(network: Network) = network(JsonField.of(network))

                /**
                 * Sets [Builder.network] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.network] with a well-typed [Network] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /**
                 * On-chain transaction hash of the crypto transfer for this leg of the transaction.
                 */
                fun transactionHash(transactionHash: String) =
                    transactionHash(JsonField.of(transactionHash))

                /**
                 * Sets [Builder.transactionHash] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionHash] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OnChainTransaction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .network()
                 * .transactionHash()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OnChainTransaction =
                    OnChainTransaction(
                        checkRequired("network", network),
                        checkRequired("transactionHash", transactionHash),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): OnChainTransaction = apply {
                if (validated) {
                    return@apply
                }

                network().validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (network.asKnown()?.validity() ?: 0) +
                    (if (transactionHash.asKnown() == null) 0 else 1)

            /**
             * Blockchain network the transaction settled on (mainnet vs test network is determined
             * by your platform environment).
             */
            class Network @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BITCOIN = of("BITCOIN")

                    val ETHEREUM = of("ETHEREUM")

                    val SOLANA = of("SOLANA")

                    val BASE = of("BASE")

                    val POLYGON = of("POLYGON")

                    val TRON = of("TRON")

                    val PLASMA = of("PLASMA")

                    val ARBITRUM = of("ARBITRUM")

                    val SPARK = of("SPARK")

                    fun of(value: String) = Network(JsonField.of(value))
                }

                /** An enum containing [Network]'s known values. */
                enum class Known {
                    BITCOIN,
                    ETHEREUM,
                    SOLANA,
                    BASE,
                    POLYGON,
                    TRON,
                    PLASMA,
                    ARBITRUM,
                    SPARK,
                }

                /**
                 * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Network] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BITCOIN,
                    ETHEREUM,
                    SOLANA,
                    BASE,
                    POLYGON,
                    TRON,
                    PLASMA,
                    ARBITRUM,
                    SPARK,
                    /**
                     * An enum member indicating that [Network] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BITCOIN -> Value.BITCOIN
                        ETHEREUM -> Value.ETHEREUM
                        SOLANA -> Value.SOLANA
                        BASE -> Value.BASE
                        POLYGON -> Value.POLYGON
                        TRON -> Value.TRON
                        PLASMA -> Value.PLASMA
                        ARBITRUM -> Value.ARBITRUM
                        SPARK -> Value.SPARK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        BITCOIN -> Known.BITCOIN
                        ETHEREUM -> Known.ETHEREUM
                        SOLANA -> Known.SOLANA
                        BASE -> Known.BASE
                        POLYGON -> Known.POLYGON
                        TRON -> Known.TRON
                        PLASMA -> Known.PLASMA
                        ARBITRUM -> Known.ARBITRUM
                        SPARK -> Known.SPARK
                        else -> throw LightsparkGridInvalidDataException("Unknown Network: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): Network = apply {
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

                    return other is Network && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OnChainTransaction &&
                    network == other.network &&
                    transactionHash == other.transactionHash &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(network, transactionHash, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OnChainTransaction{network=$network, transactionHash=$transactionHash, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountTransactionSource &&
                currency == other.currency &&
                accountId == other.accountId &&
                sourceType == other.sourceType &&
                onChainTransaction == other.onChainTransaction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, accountId, sourceType, onChainTransaction, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountTransactionSource{currency=$currency, accountId=$accountId, sourceType=$sourceType, onChainTransaction=$onChainTransaction, additionalProperties=$additionalProperties}"
    }

    /** UMA address source details */
    class UmaAddressTransactionSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val sourceType: JsonField<SourceType>,
        private val umaAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<SourceType> = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
        ) : this(currency, sourceType, umaAddress, mutableMapOf())

        fun toBaseTransactionSource(): BaseTransactionSource =
            BaseTransactionSource.builder().currency(currency).build()

        /**
         * Currency code for the source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): SourceType = sourceType.getRequired("sourceType")

        /**
         * UMA address of the sender
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<SourceType> = sourceType

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

            private var currency: JsonField<String> = JsonMissing.of()
            private var sourceType: JsonField<SourceType>? = null
            private var umaAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(umaAddressTransactionSource: UmaAddressTransactionSource) = apply {
                currency = umaAddressTransactionSource.currency
                sourceType = umaAddressTransactionSource.sourceType
                umaAddress = umaAddressTransactionSource.umaAddress
                additionalProperties =
                    umaAddressTransactionSource.additionalProperties.toMutableMap()
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

            fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceType(sourceType: JsonField<SourceType>) = apply {
                this.sourceType = sourceType
            }

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
                    currency,
                    checkRequired("sourceType", sourceType),
                    checkRequired("umaAddress", umaAddress),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): UmaAddressTransactionSource = apply {
            if (validated) {
                return@apply
            }

            currency()
            sourceType().validate()
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
            (if (currency.asKnown() == null) 0 else 1) +
                (sourceType.asKnown()?.validity() ?: 0) +
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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
                currency == other.currency &&
                sourceType == other.sourceType &&
                umaAddress == other.umaAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, sourceType, umaAddress, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UmaAddressTransactionSource{currency=$currency, sourceType=$sourceType, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
    }

    /**
     * Transaction was funded using an external funding source. All originator fields are optional
     * and populated on a best-effort basis depending on what the funding source provides.
     */
    class RealtimeFundingTransactionSource
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val sourceType: JsonField<SourceType>,
        private val accountHolderName: JsonField<String>,
        private val accountIdentifier: JsonField<String>,
        private val bankIdentifier: JsonField<String>,
        private val bankName: JsonField<String>,
        private val customerId: JsonField<String>,
        private val endToEndId: JsonField<String>,
        private val onChainTransaction: JsonField<OnChainTransaction>,
        private val paymentRail: JsonField<PaymentRail>,
        private val remittanceInformation: JsonField<String>,
        private val traceNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sourceType")
            @ExcludeMissing
            sourceType: JsonField<SourceType> = JsonMissing.of(),
            @JsonProperty("accountHolderName")
            @ExcludeMissing
            accountHolderName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountIdentifier")
            @ExcludeMissing
            accountIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bankIdentifier")
            @ExcludeMissing
            bankIdentifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bankName")
            @ExcludeMissing
            bankName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customerId")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("endToEndId")
            @ExcludeMissing
            endToEndId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("onChainTransaction")
            @ExcludeMissing
            onChainTransaction: JsonField<OnChainTransaction> = JsonMissing.of(),
            @JsonProperty("paymentRail")
            @ExcludeMissing
            paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
            @JsonProperty("remittanceInformation")
            @ExcludeMissing
            remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("traceNumber")
            @ExcludeMissing
            traceNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            currency,
            sourceType,
            accountHolderName,
            accountIdentifier,
            bankIdentifier,
            bankName,
            customerId,
            endToEndId,
            onChainTransaction,
            paymentRail,
            remittanceInformation,
            traceNumber,
            mutableMapOf(),
        )

        fun toBaseTransactionSource(): BaseTransactionSource =
            BaseTransactionSource.builder().currency(currency).build()

        /**
         * Currency code for the source
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceType(): SourceType = sourceType.getRequired("sourceType")

        /**
         * The name of the originator (sender) of the payment.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountHolderName(): String? = accountHolderName.getNullable("accountHolderName")

        /**
         * The originator's account number or IBAN. May be masked or partial depending on the rail.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountIdentifier(): String? = accountIdentifier.getNullable("accountIdentifier")

        /**
         * The identifier of the originating bank, such as a routing number, BIC, or SWIFT code.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankIdentifier(): String? = bankIdentifier.getNullable("bankIdentifier")

        /**
         * The name of the originating bank.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankName(): String? = bankName.getNullable("bankName")

        /**
         * The customer on whose behalf the transaction was initiated.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun customerId(): String? = customerId.getNullable("customerId")

        /**
         * The originator's own end-to-end reference for the payment.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun endToEndId(): String? = endToEndId.getNullable("endToEndId")

        /**
         * On-chain transaction that delivered the funding, when the funds arrived from an external
         * crypto wallet. Populated once the crypto transfer has settled.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun onChainTransaction(): OnChainTransaction? =
            onChainTransaction.getNullable("onChainTransaction")

        /**
         * The payment rail used for the transfer. Payment rails represent the underlying payment
         * network or system used to move funds between accounts.
         *
         * `ACH_SAME_DAY` requests same-business-day settlement for a USD payout and is priced
         * separately. It is subject to the NACHA per-entry same-day limit, which the network
         * applies to every originator: $1,000,000 per entry, rising to $10,000,000 on 2027-09-17. A
         * payout above that limit is rejected rather than slowed — check the amount before
         * requesting this rail, or send it over `ACH`, which settles on the standard schedule and
         * has no such limit.
         *
         * `ACH` will settle on the standard next-business-day schedule. Until a date we announce in
         * advance, `ACH` continues to settle same-business-day on production platforms; it already
         * settles next-business-day on sandbox platforms. To guarantee same-day settlement after
         * that date, request `ACH_SAME_DAY`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentRail(): PaymentRail? = paymentRail.getNullable("paymentRail")

        /**
         * Free-form information about the payment provided by the originator. The source field
         * depends on the payment rail: the Addenda record for ACH, the OBI / beneficiary
         * information for wires, and the remittanceInformation field for RTP and FedNow.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String? =
            remittanceInformation.getNullable("remittanceInformation")

        /**
         * Rail-level tracking identifier for the payment, such as an ACH trace number or a wire
         * IMAD/OMAD, useful for reconciliation.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun traceNumber(): String? = traceNumber.getNullable("traceNumber")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [sourceType].
         *
         * Unlike [sourceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sourceType")
        @ExcludeMissing
        fun _sourceType(): JsonField<SourceType> = sourceType

        /**
         * Returns the raw JSON value of [accountHolderName].
         *
         * Unlike [accountHolderName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accountHolderName")
        @ExcludeMissing
        fun _accountHolderName(): JsonField<String> = accountHolderName

        /**
         * Returns the raw JSON value of [accountIdentifier].
         *
         * Unlike [accountIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accountIdentifier")
        @ExcludeMissing
        fun _accountIdentifier(): JsonField<String> = accountIdentifier

        /**
         * Returns the raw JSON value of [bankIdentifier].
         *
         * Unlike [bankIdentifier], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bankIdentifier")
        @ExcludeMissing
        fun _bankIdentifier(): JsonField<String> = bankIdentifier

        /**
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customerId")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [endToEndId].
         *
         * Unlike [endToEndId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("endToEndId")
        @ExcludeMissing
        fun _endToEndId(): JsonField<String> = endToEndId

        /**
         * Returns the raw JSON value of [onChainTransaction].
         *
         * Unlike [onChainTransaction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("onChainTransaction")
        @ExcludeMissing
        fun _onChainTransaction(): JsonField<OnChainTransaction> = onChainTransaction

        /**
         * Returns the raw JSON value of [paymentRail].
         *
         * Unlike [paymentRail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paymentRail")
        @ExcludeMissing
        fun _paymentRail(): JsonField<PaymentRail> = paymentRail

        /**
         * Returns the raw JSON value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remittanceInformation")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /**
         * Returns the raw JSON value of [traceNumber].
         *
         * Unlike [traceNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("traceNumber")
        @ExcludeMissing
        fun _traceNumber(): JsonField<String> = traceNumber

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

            private var currency: JsonField<String> = JsonMissing.of()
            private var sourceType: JsonField<SourceType>? = null
            private var accountHolderName: JsonField<String> = JsonMissing.of()
            private var accountIdentifier: JsonField<String> = JsonMissing.of()
            private var bankIdentifier: JsonField<String> = JsonMissing.of()
            private var bankName: JsonField<String> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var endToEndId: JsonField<String> = JsonMissing.of()
            private var onChainTransaction: JsonField<OnChainTransaction> = JsonMissing.of()
            private var paymentRail: JsonField<PaymentRail> = JsonMissing.of()
            private var remittanceInformation: JsonField<String> = JsonMissing.of()
            private var traceNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(realtimeFundingTransactionSource: RealtimeFundingTransactionSource) =
                apply {
                    currency = realtimeFundingTransactionSource.currency
                    sourceType = realtimeFundingTransactionSource.sourceType
                    accountHolderName = realtimeFundingTransactionSource.accountHolderName
                    accountIdentifier = realtimeFundingTransactionSource.accountIdentifier
                    bankIdentifier = realtimeFundingTransactionSource.bankIdentifier
                    bankName = realtimeFundingTransactionSource.bankName
                    customerId = realtimeFundingTransactionSource.customerId
                    endToEndId = realtimeFundingTransactionSource.endToEndId
                    onChainTransaction = realtimeFundingTransactionSource.onChainTransaction
                    paymentRail = realtimeFundingTransactionSource.paymentRail
                    remittanceInformation = realtimeFundingTransactionSource.remittanceInformation
                    traceNumber = realtimeFundingTransactionSource.traceNumber
                    additionalProperties =
                        realtimeFundingTransactionSource.additionalProperties.toMutableMap()
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

            fun sourceType(sourceType: SourceType) = sourceType(JsonField.of(sourceType))

            /**
             * Sets [Builder.sourceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceType] with a well-typed [SourceType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceType(sourceType: JsonField<SourceType>) = apply {
                this.sourceType = sourceType
            }

            /** The name of the originator (sender) of the payment. */
            fun accountHolderName(accountHolderName: String) =
                accountHolderName(JsonField.of(accountHolderName))

            /**
             * Sets [Builder.accountHolderName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountHolderName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountHolderName(accountHolderName: JsonField<String>) = apply {
                this.accountHolderName = accountHolderName
            }

            /**
             * The originator's account number or IBAN. May be masked or partial depending on the
             * rail.
             */
            fun accountIdentifier(accountIdentifier: String) =
                accountIdentifier(JsonField.of(accountIdentifier))

            /**
             * Sets [Builder.accountIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountIdentifier(accountIdentifier: JsonField<String>) = apply {
                this.accountIdentifier = accountIdentifier
            }

            /**
             * The identifier of the originating bank, such as a routing number, BIC, or SWIFT code.
             */
            fun bankIdentifier(bankIdentifier: String) =
                bankIdentifier(JsonField.of(bankIdentifier))

            /**
             * Sets [Builder.bankIdentifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankIdentifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankIdentifier(bankIdentifier: JsonField<String>) = apply {
                this.bankIdentifier = bankIdentifier
            }

            /** The name of the originating bank. */
            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

            /**
             * Sets [Builder.bankName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

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

            /** The originator's own end-to-end reference for the payment. */
            fun endToEndId(endToEndId: String) = endToEndId(JsonField.of(endToEndId))

            /**
             * Sets [Builder.endToEndId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endToEndId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun endToEndId(endToEndId: JsonField<String>) = apply { this.endToEndId = endToEndId }

            /**
             * On-chain transaction that delivered the funding, when the funds arrived from an
             * external crypto wallet. Populated once the crypto transfer has settled.
             */
            fun onChainTransaction(onChainTransaction: OnChainTransaction) =
                onChainTransaction(JsonField.of(onChainTransaction))

            /**
             * Sets [Builder.onChainTransaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.onChainTransaction] with a well-typed
             * [OnChainTransaction] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun onChainTransaction(onChainTransaction: JsonField<OnChainTransaction>) = apply {
                this.onChainTransaction = onChainTransaction
            }

            /**
             * The payment rail used for the transfer. Payment rails represent the underlying
             * payment network or system used to move funds between accounts.
             *
             * `ACH_SAME_DAY` requests same-business-day settlement for a USD payout and is priced
             * separately. It is subject to the NACHA per-entry same-day limit, which the network
             * applies to every originator: $1,000,000 per entry, rising to $10,000,000 on
             * 2027-09-17. A payout above that limit is rejected rather than slowed — check the
             * amount before requesting this rail, or send it over `ACH`, which settles on the
             * standard schedule and has no such limit.
             *
             * `ACH` will settle on the standard next-business-day schedule. Until a date we
             * announce in advance, `ACH` continues to settle same-business-day on production
             * platforms; it already settles next-business-day on sandbox platforms. To guarantee
             * same-day settlement after that date, request `ACH_SAME_DAY`.
             */
            fun paymentRail(paymentRail: PaymentRail) = paymentRail(JsonField.of(paymentRail))

            /**
             * Sets [Builder.paymentRail] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRail] with a well-typed [PaymentRail] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun paymentRail(paymentRail: JsonField<PaymentRail>) = apply {
                this.paymentRail = paymentRail
            }

            /**
             * Free-form information about the payment provided by the originator. The source field
             * depends on the payment rail: the Addenda record for ACH, the OBI / beneficiary
             * information for wires, and the remittanceInformation field for RTP and FedNow.
             */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * Rail-level tracking identifier for the payment, such as an ACH trace number or a wire
             * IMAD/OMAD, useful for reconciliation.
             */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /**
             * Sets [Builder.traceNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.traceNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
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
                    currency,
                    checkRequired("sourceType", sourceType),
                    accountHolderName,
                    accountIdentifier,
                    bankIdentifier,
                    bankName,
                    customerId,
                    endToEndId,
                    onChainTransaction,
                    paymentRail,
                    remittanceInformation,
                    traceNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): RealtimeFundingTransactionSource = apply {
            if (validated) {
                return@apply
            }

            currency()
            sourceType().validate()
            accountHolderName()
            accountIdentifier()
            bankIdentifier()
            bankName()
            customerId()
            endToEndId()
            onChainTransaction()?.validate()
            paymentRail()?.validate()
            remittanceInformation()
            traceNumber()
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
                (sourceType.asKnown()?.validity() ?: 0) +
                (if (accountHolderName.asKnown() == null) 0 else 1) +
                (if (accountIdentifier.asKnown() == null) 0 else 1) +
                (if (bankIdentifier.asKnown() == null) 0 else 1) +
                (if (bankName.asKnown() == null) 0 else 1) +
                (if (customerId.asKnown() == null) 0 else 1) +
                (if (endToEndId.asKnown() == null) 0 else 1) +
                (onChainTransaction.asKnown()?.validity() ?: 0) +
                (paymentRail.asKnown()?.validity() ?: 0) +
                (if (remittanceInformation.asKnown() == null) 0 else 1) +
                (if (traceNumber.asKnown() == null) 0 else 1)

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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
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

        /**
         * On-chain transaction that delivered the funding, when the funds arrived from an external
         * crypto wallet. Populated once the crypto transfer has settled.
         */
        class OnChainTransaction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val network: JsonField<Network>,
            private val transactionHash: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("network")
                @ExcludeMissing
                network: JsonField<Network> = JsonMissing.of(),
                @JsonProperty("transactionHash")
                @ExcludeMissing
                transactionHash: JsonField<String> = JsonMissing.of(),
            ) : this(network, transactionHash, mutableMapOf())

            /**
             * Blockchain network the transaction settled on (mainnet vs test network is determined
             * by your platform environment).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun network(): Network = network.getRequired("network")

            /**
             * On-chain transaction hash of the crypto transfer for this leg of the transaction.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun transactionHash(): String = transactionHash.getRequired("transactionHash")

            /**
             * Returns the raw JSON value of [network].
             *
             * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

            /**
             * Returns the raw JSON value of [transactionHash].
             *
             * Unlike [transactionHash], this method doesn't throw if the JSON field has an
             * unexpected type.
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
                 * Returns a mutable builder for constructing an instance of [OnChainTransaction].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .network()
                 * .transactionHash()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OnChainTransaction]. */
            class Builder internal constructor() {

                private var network: JsonField<Network>? = null
                private var transactionHash: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(onChainTransaction: OnChainTransaction) = apply {
                    network = onChainTransaction.network
                    transactionHash = onChainTransaction.transactionHash
                    additionalProperties = onChainTransaction.additionalProperties.toMutableMap()
                }

                /**
                 * Blockchain network the transaction settled on (mainnet vs test network is
                 * determined by your platform environment).
                 */
                fun network(network: Network) = network(JsonField.of(network))

                /**
                 * Sets [Builder.network] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.network] with a well-typed [Network] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun network(network: JsonField<Network>) = apply { this.network = network }

                /**
                 * On-chain transaction hash of the crypto transfer for this leg of the transaction.
                 */
                fun transactionHash(transactionHash: String) =
                    transactionHash(JsonField.of(transactionHash))

                /**
                 * Sets [Builder.transactionHash] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionHash] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OnChainTransaction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .network()
                 * .transactionHash()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OnChainTransaction =
                    OnChainTransaction(
                        checkRequired("network", network),
                        checkRequired("transactionHash", transactionHash),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): OnChainTransaction = apply {
                if (validated) {
                    return@apply
                }

                network().validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (network.asKnown()?.validity() ?: 0) +
                    (if (transactionHash.asKnown() == null) 0 else 1)

            /**
             * Blockchain network the transaction settled on (mainnet vs test network is determined
             * by your platform environment).
             */
            class Network @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val BITCOIN = of("BITCOIN")

                    val ETHEREUM = of("ETHEREUM")

                    val SOLANA = of("SOLANA")

                    val BASE = of("BASE")

                    val POLYGON = of("POLYGON")

                    val TRON = of("TRON")

                    val PLASMA = of("PLASMA")

                    val ARBITRUM = of("ARBITRUM")

                    val SPARK = of("SPARK")

                    fun of(value: String) = Network(JsonField.of(value))
                }

                /** An enum containing [Network]'s known values. */
                enum class Known {
                    BITCOIN,
                    ETHEREUM,
                    SOLANA,
                    BASE,
                    POLYGON,
                    TRON,
                    PLASMA,
                    ARBITRUM,
                    SPARK,
                }

                /**
                 * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Network] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BITCOIN,
                    ETHEREUM,
                    SOLANA,
                    BASE,
                    POLYGON,
                    TRON,
                    PLASMA,
                    ARBITRUM,
                    SPARK,
                    /**
                     * An enum member indicating that [Network] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        BITCOIN -> Value.BITCOIN
                        ETHEREUM -> Value.ETHEREUM
                        SOLANA -> Value.SOLANA
                        BASE -> Value.BASE
                        POLYGON -> Value.POLYGON
                        TRON -> Value.TRON
                        PLASMA -> Value.PLASMA
                        ARBITRUM -> Value.ARBITRUM
                        SPARK -> Value.SPARK
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        BITCOIN -> Known.BITCOIN
                        ETHEREUM -> Known.ETHEREUM
                        SOLANA -> Known.SOLANA
                        BASE -> Known.BASE
                        POLYGON -> Known.POLYGON
                        TRON -> Known.TRON
                        PLASMA -> Known.PLASMA
                        ARBITRUM -> Known.ARBITRUM
                        SPARK -> Known.SPARK
                        else -> throw LightsparkGridInvalidDataException("Unknown Network: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): Network = apply {
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

                    return other is Network && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OnChainTransaction &&
                    network == other.network &&
                    transactionHash == other.transactionHash &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(network, transactionHash, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OnChainTransaction{network=$network, transactionHash=$transactionHash, additionalProperties=$additionalProperties}"
        }

        /**
         * The payment rail used for the transfer. Payment rails represent the underlying payment
         * network or system used to move funds between accounts.
         *
         * `ACH_SAME_DAY` requests same-business-day settlement for a USD payout and is priced
         * separately. It is subject to the NACHA per-entry same-day limit, which the network
         * applies to every originator: $1,000,000 per entry, rising to $10,000,000 on 2027-09-17. A
         * payout above that limit is rejected rather than slowed — check the amount before
         * requesting this rail, or send it over `ACH`, which settles on the standard schedule and
         * has no such limit.
         *
         * `ACH` will settle on the standard next-business-day schedule. Until a date we announce in
         * advance, `ACH` continues to settle same-business-day on production platforms; it already
         * settles next-business-day on sandbox platforms. To guarantee same-day settlement after
         * that date, request `ACH_SAME_DAY`.
         */
        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ACH = of("ACH")

                val ACH_COLOMBIA = of("ACH_COLOMBIA")

                val ACH_SAME_DAY = of("ACH_SAME_DAY")

                val BANK_TRANSFER = of("BANK_TRANSFER")

                val BRE_B = of("BRE_B")

                val CIPS = of("CIPS")

                val FAST = of("FAST")

                val FASTER_PAYMENTS = of("FASTER_PAYMENTS")

                val FEDNOW = of("FEDNOW")

                val INSTAPAY = of("INSTAPAY")

                val MOBILE_MONEY = of("MOBILE_MONEY")

                val NEFT = of("NEFT")

                val PAYNOW = of("PAYNOW")

                val PESONET = of("PESONET")

                val PIX = of("PIX")

                val RTGS = of("RTGS")

                val RTP = of("RTP")

                val SEPA = of("SEPA")

                val SEPA_INSTANT = of("SEPA_INSTANT")

                val SPEI = of("SPEI")

                val SWIFT = of("SWIFT")

                val UNIONPAY = of("UNIONPAY")

                val UPI = of("UPI")

                val WIRE = of("WIRE")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                ACH,
                ACH_COLOMBIA,
                ACH_SAME_DAY,
                BANK_TRANSFER,
                BRE_B,
                CIPS,
                FAST,
                FASTER_PAYMENTS,
                FEDNOW,
                INSTAPAY,
                MOBILE_MONEY,
                NEFT,
                PAYNOW,
                PESONET,
                PIX,
                RTGS,
                RTP,
                SEPA,
                SEPA_INSTANT,
                SPEI,
                SWIFT,
                UNIONPAY,
                UPI,
                WIRE,
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACH,
                ACH_COLOMBIA,
                ACH_SAME_DAY,
                BANK_TRANSFER,
                BRE_B,
                CIPS,
                FAST,
                FASTER_PAYMENTS,
                FEDNOW,
                INSTAPAY,
                MOBILE_MONEY,
                NEFT,
                PAYNOW,
                PESONET,
                PIX,
                RTGS,
                RTP,
                SEPA,
                SEPA_INSTANT,
                SPEI,
                SWIFT,
                UNIONPAY,
                UPI,
                WIRE,
                /**
                 * An enum member indicating that [PaymentRail] was instantiated with an unknown
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
                    ACH -> Value.ACH
                    ACH_COLOMBIA -> Value.ACH_COLOMBIA
                    ACH_SAME_DAY -> Value.ACH_SAME_DAY
                    BANK_TRANSFER -> Value.BANK_TRANSFER
                    BRE_B -> Value.BRE_B
                    CIPS -> Value.CIPS
                    FAST -> Value.FAST
                    FASTER_PAYMENTS -> Value.FASTER_PAYMENTS
                    FEDNOW -> Value.FEDNOW
                    INSTAPAY -> Value.INSTAPAY
                    MOBILE_MONEY -> Value.MOBILE_MONEY
                    NEFT -> Value.NEFT
                    PAYNOW -> Value.PAYNOW
                    PESONET -> Value.PESONET
                    PIX -> Value.PIX
                    RTGS -> Value.RTGS
                    RTP -> Value.RTP
                    SEPA -> Value.SEPA
                    SEPA_INSTANT -> Value.SEPA_INSTANT
                    SPEI -> Value.SPEI
                    SWIFT -> Value.SWIFT
                    UNIONPAY -> Value.UNIONPAY
                    UPI -> Value.UPI
                    WIRE -> Value.WIRE
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
                    ACH -> Known.ACH
                    ACH_COLOMBIA -> Known.ACH_COLOMBIA
                    ACH_SAME_DAY -> Known.ACH_SAME_DAY
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    BRE_B -> Known.BRE_B
                    CIPS -> Known.CIPS
                    FAST -> Known.FAST
                    FASTER_PAYMENTS -> Known.FASTER_PAYMENTS
                    FEDNOW -> Known.FEDNOW
                    INSTAPAY -> Known.INSTAPAY
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    NEFT -> Known.NEFT
                    PAYNOW -> Known.PAYNOW
                    PESONET -> Known.PESONET
                    PIX -> Known.PIX
                    RTGS -> Known.RTGS
                    RTP -> Known.RTP
                    SEPA -> Known.SEPA
                    SEPA_INSTANT -> Known.SEPA_INSTANT
                    SPEI -> Known.SPEI
                    SWIFT -> Known.SWIFT
                    UNIONPAY -> Known.UNIONPAY
                    UPI -> Known.UPI
                    WIRE -> Known.WIRE
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): PaymentRail = apply {
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

                return other is PaymentRail && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RealtimeFundingTransactionSource &&
                currency == other.currency &&
                sourceType == other.sourceType &&
                accountHolderName == other.accountHolderName &&
                accountIdentifier == other.accountIdentifier &&
                bankIdentifier == other.bankIdentifier &&
                bankName == other.bankName &&
                customerId == other.customerId &&
                endToEndId == other.endToEndId &&
                onChainTransaction == other.onChainTransaction &&
                paymentRail == other.paymentRail &&
                remittanceInformation == other.remittanceInformation &&
                traceNumber == other.traceNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                currency,
                sourceType,
                accountHolderName,
                accountIdentifier,
                bankIdentifier,
                bankName,
                customerId,
                endToEndId,
                onChainTransaction,
                paymentRail,
                remittanceInformation,
                traceNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RealtimeFundingTransactionSource{currency=$currency, sourceType=$sourceType, accountHolderName=$accountHolderName, accountIdentifier=$accountIdentifier, bankIdentifier=$bankIdentifier, bankName=$bankName, customerId=$customerId, endToEndId=$endToEndId, onChainTransaction=$onChainTransaction, paymentRail=$paymentRail, remittanceInformation=$remittanceInformation, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"
    }
}
