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

/** Destination account details */
@JsonDeserialize(using = QuoteDestinationOneOf.Deserializer::class)
@JsonSerialize(using = QuoteDestinationOneOf.Serializer::class)
class QuoteDestinationOneOf
private constructor(
    private val account: Account? = null,
    private val umaAddress: UmaAddress? = null,
    private val _json: JsonValue? = null,
) {

    /** Destination account details */
    fun account(): Account? = account

    /** UMA address destination details */
    fun umaAddress(): UmaAddress? = umaAddress

    fun isAccount(): Boolean = account != null

    fun isUmaAddress(): Boolean = umaAddress != null

    /** Destination account details */
    fun asAccount(): Account = account.getOrThrow("account")

    /** UMA address destination details */
    fun asUmaAddress(): UmaAddress = umaAddress.getOrThrow("umaAddress")

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
     * val result: String? = quoteDestinationOneOf.accept(object : QuoteDestinationOneOf.Visitor<String?> {
     *     override fun visitAccount(account: Account): String? = account.toString()
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
            account != null -> visitor.visitAccount(account)
            umaAddress != null -> visitor.visitUmaAddress(umaAddress)
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
    fun validate(): QuoteDestinationOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccount(account: Account) {
                    account.validate()
                }

                override fun visitUmaAddress(umaAddress: UmaAddress) {
                    umaAddress.validate()
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
                override fun visitAccount(account: Account) = account.validity()

                override fun visitUmaAddress(umaAddress: UmaAddress) = umaAddress.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteDestinationOneOf &&
            account == other.account &&
            umaAddress == other.umaAddress
    }

    override fun hashCode(): Int = Objects.hash(account, umaAddress)

    override fun toString(): String =
        when {
            account != null -> "QuoteDestinationOneOf{account=$account}"
            umaAddress != null -> "QuoteDestinationOneOf{umaAddress=$umaAddress}"
            _json != null -> "QuoteDestinationOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid QuoteDestinationOneOf")
        }

    companion object {

        /** Destination account details */
        fun ofAccount(account: Account) = QuoteDestinationOneOf(account = account)

        /** UMA address destination details */
        fun ofUmaAddress(umaAddress: UmaAddress) = QuoteDestinationOneOf(umaAddress = umaAddress)
    }

    /**
     * An interface that defines how to map each variant of [QuoteDestinationOneOf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        /** Destination account details */
        fun visitAccount(account: Account): T

        /** UMA address destination details */
        fun visitUmaAddress(umaAddress: UmaAddress): T

        /**
         * Maps an unknown variant of [QuoteDestinationOneOf] to a value of type [T].
         *
         * An instance of [QuoteDestinationOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown QuoteDestinationOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<QuoteDestinationOneOf>(QuoteDestinationOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): QuoteDestinationOneOf {
            val json = JsonValue.fromJsonNode(node)
            val destinationType = json.asObject()?.get("destinationType")?.asString()

            when (destinationType) {}

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Account>())?.let {
                            QuoteDestinationOneOf(account = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UmaAddress>())?.let {
                            QuoteDestinationOneOf(umaAddress = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> QuoteDestinationOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<QuoteDestinationOneOf>(QuoteDestinationOneOf::class) {

        override fun serialize(
            value: QuoteDestinationOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.account != null -> generator.writeObject(value.account)
                value.umaAddress != null -> generator.writeObject(value.umaAddress)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid QuoteDestinationOneOf")
            }
        }
    }

    /** Destination account details */
    class Account
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destinationType: JsonField<BaseDestination.DestinationType>,
        private val accountId: JsonField<String>,
        private val paymentRail: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<BaseDestination.DestinationType> = JsonMissing.of(),
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRail") @ExcludeMissing paymentRail: JsonValue = JsonMissing.of(),
        ) : this(destinationType, accountId, paymentRail, mutableMapOf())

        fun toBaseDestination(): BaseDestination =
            BaseDestination.builder().destinationType(destinationType).build()

        /**
         * Type of payment destination
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationType(): BaseDestination.DestinationType =
            destinationType.getRequired("destinationType")

        /**
         * Destination account identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * The payment rail to use for the transfer. Must be one of the rails supported by the
         * destination account. If not specified, the system will select a default rail.
         *
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = account.paymentRail().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("paymentRail") @ExcludeMissing fun _paymentRail(): JsonValue = paymentRail

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<BaseDestination.DestinationType> = destinationType

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
             * Returns a mutable builder for constructing an instance of [Account].
             *
             * The following fields are required:
             * ```kotlin
             * .destinationType()
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Account]. */
        class Builder internal constructor() {

            private var destinationType: JsonField<BaseDestination.DestinationType>? = null
            private var accountId: JsonField<String>? = null
            private var paymentRail: JsonValue = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(account: Account) = apply {
                destinationType = account.destinationType
                accountId = account.accountId
                paymentRail = account.paymentRail
                additionalProperties = account.additionalProperties.toMutableMap()
            }

            /** Type of payment destination */
            fun destinationType(destinationType: BaseDestination.DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed
             * [BaseDestination.DestinationType] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun destinationType(destinationType: JsonField<BaseDestination.DestinationType>) =
                apply {
                    this.destinationType = destinationType
                }

            /** Destination account identifier */
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
             * The payment rail to use for the transfer. Must be one of the rails supported by the
             * destination account. If not specified, the system will select a default rail.
             */
            fun paymentRail(paymentRail: JsonValue) = apply { this.paymentRail = paymentRail }

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
             * Returns an immutable instance of [Account].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .destinationType()
             * .accountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Account =
                Account(
                    checkRequired("destinationType", destinationType),
                    checkRequired("accountId", accountId),
                    paymentRail,
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
        fun validate(): Account = apply {
            if (validated) {
                return@apply
            }

            destinationType().validate()
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
            (destinationType.asKnown()?.validity() ?: 0) +
                (if (accountId.asKnown() == null) 0 else 1)

        /** Type of payment destination */
        class DestinationType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                fun of(value: String) = DestinationType(JsonField.of(value))
            }

            /** An enum containing [DestinationType]'s known values. */
            enum class Known {
                ACCOUNT
            }

            /**
             * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DestinationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT,
                /**
                 * An enum member indicating that [DestinationType] was instantiated with an unknown
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
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown DestinationType: $value")
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
            fun validate(): DestinationType = apply {
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

                return other is DestinationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Account &&
                destinationType == other.destinationType &&
                accountId == other.accountId &&
                paymentRail == other.paymentRail &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(destinationType, accountId, paymentRail, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Account{destinationType=$destinationType, accountId=$accountId, paymentRail=$paymentRail, additionalProperties=$additionalProperties}"
    }

    /** UMA address destination details */
    class UmaAddress
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destinationType: JsonField<BaseDestination.DestinationType>,
        private val currency: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<BaseDestination.DestinationType> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
        ) : this(destinationType, currency, umaAddress, mutableMapOf())

        fun toBaseDestination(): BaseDestination =
            BaseDestination.builder().destinationType(destinationType).build()

        /**
         * Type of payment destination
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationType(): BaseDestination.DestinationType =
            destinationType.getRequired("destinationType")

        /**
         * Currency code for the destination. See
         * [Supported Currencies](https://docs.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
         * for the full list of supported fiat and crypto currencies.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * UMA address of the recipient
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<BaseDestination.DestinationType> = destinationType

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
             * Returns a mutable builder for constructing an instance of [UmaAddress].
             *
             * The following fields are required:
             * ```kotlin
             * .destinationType()
             * .currency()
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UmaAddress]. */
        class Builder internal constructor() {

            private var destinationType: JsonField<BaseDestination.DestinationType>? = null
            private var currency: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(umaAddress: UmaAddress) = apply {
                destinationType = umaAddress.destinationType
                currency = umaAddress.currency
                this.umaAddress = umaAddress.umaAddress
                additionalProperties = umaAddress.additionalProperties.toMutableMap()
            }

            /** Type of payment destination */
            fun destinationType(destinationType: BaseDestination.DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed
             * [BaseDestination.DestinationType] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun destinationType(destinationType: JsonField<BaseDestination.DestinationType>) =
                apply {
                    this.destinationType = destinationType
                }

            /**
             * Currency code for the destination. See
             * [Supported Currencies](https://docs.lightspark.com/platform-overview/core-concepts/currencies-and-rails)
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

            /** UMA address of the recipient */
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
             * Returns an immutable instance of [UmaAddress].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .destinationType()
             * .currency()
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UmaAddress =
                UmaAddress(
                    checkRequired("destinationType", destinationType),
                    checkRequired("currency", currency),
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
        fun validate(): UmaAddress = apply {
            if (validated) {
                return@apply
            }

            destinationType().validate()
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
            (destinationType.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1)

        /** Type of payment destination */
        class DestinationType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                fun of(value: String) = DestinationType(JsonField.of(value))
            }

            /** An enum containing [DestinationType]'s known values. */
            enum class Known {
                UMA_ADDRESS
            }

            /**
             * An enum containing [DestinationType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DestinationType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                UMA_ADDRESS,
                /**
                 * An enum member indicating that [DestinationType] was instantiated with an unknown
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
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown DestinationType: $value")
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
            fun validate(): DestinationType = apply {
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

                return other is DestinationType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UmaAddress &&
                destinationType == other.destinationType &&
                currency == other.currency &&
                umaAddress == other.umaAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(destinationType, currency, umaAddress, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UmaAddress{destinationType=$destinationType, currency=$currency, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
    }
}
