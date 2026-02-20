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
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.transferin.BaseTransactionDestination
import java.util.Collections
import java.util.Objects

/** Destination account details */
@JsonDeserialize(using = TransactionDestinationOneOf.Deserializer::class)
@JsonSerialize(using = TransactionDestinationOneOf.Serializer::class)
class TransactionDestinationOneOf
private constructor(
    private val accountTransactionDestination: AccountTransactionDestination? = null,
    private val umaAddressTransactionDestination: UmaAddressTransactionDestination? = null,
    private val externalAccountDetails: ExternalAccountDetails? = null,
    private val _json: JsonValue? = null,
) {

    /** Destination account details */
    fun accountTransactionDestination(): AccountTransactionDestination? =
        accountTransactionDestination

    /** UMA address destination details */
    fun umaAddressTransactionDestination(): UmaAddressTransactionDestination? =
        umaAddressTransactionDestination

    /**
     * Transaction destination where external account details were provided inline at quote creation
     * rather than using a pre-registered external account.
     */
    fun externalAccountDetails(): ExternalAccountDetails? = externalAccountDetails

    fun isAccountTransactionDestination(): Boolean = accountTransactionDestination != null

    fun isUmaAddressTransactionDestination(): Boolean = umaAddressTransactionDestination != null

    fun isExternalAccountDetails(): Boolean = externalAccountDetails != null

    /** Destination account details */
    fun asAccountTransactionDestination(): AccountTransactionDestination =
        accountTransactionDestination.getOrThrow("accountTransactionDestination")

    /** UMA address destination details */
    fun asUmaAddressTransactionDestination(): UmaAddressTransactionDestination =
        umaAddressTransactionDestination.getOrThrow("umaAddressTransactionDestination")

    /**
     * Transaction destination where external account details were provided inline at quote creation
     * rather than using a pre-registered external account.
     */
    fun asExternalAccountDetails(): ExternalAccountDetails =
        externalAccountDetails.getOrThrow("externalAccountDetails")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountTransactionDestination != null ->
                visitor.visitAccountTransactionDestination(accountTransactionDestination)
            umaAddressTransactionDestination != null ->
                visitor.visitUmaAddressTransactionDestination(umaAddressTransactionDestination)
            externalAccountDetails != null ->
                visitor.visitExternalAccountDetails(externalAccountDetails)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): TransactionDestinationOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAccountTransactionDestination(
                    accountTransactionDestination: AccountTransactionDestination
                ) {
                    accountTransactionDestination.validate()
                }

                override fun visitUmaAddressTransactionDestination(
                    umaAddressTransactionDestination: UmaAddressTransactionDestination
                ) {
                    umaAddressTransactionDestination.validate()
                }

                override fun visitExternalAccountDetails(
                    externalAccountDetails: ExternalAccountDetails
                ) {
                    externalAccountDetails.validate()
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
                override fun visitAccountTransactionDestination(
                    accountTransactionDestination: AccountTransactionDestination
                ) = accountTransactionDestination.validity()

                override fun visitUmaAddressTransactionDestination(
                    umaAddressTransactionDestination: UmaAddressTransactionDestination
                ) = umaAddressTransactionDestination.validity()

                override fun visitExternalAccountDetails(
                    externalAccountDetails: ExternalAccountDetails
                ) = externalAccountDetails.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionDestinationOneOf &&
            accountTransactionDestination == other.accountTransactionDestination &&
            umaAddressTransactionDestination == other.umaAddressTransactionDestination &&
            externalAccountDetails == other.externalAccountDetails
    }

    override fun hashCode(): Int =
        Objects.hash(
            accountTransactionDestination,
            umaAddressTransactionDestination,
            externalAccountDetails,
        )

    override fun toString(): String =
        when {
            accountTransactionDestination != null ->
                "TransactionDestinationOneOf{accountTransactionDestination=$accountTransactionDestination}"
            umaAddressTransactionDestination != null ->
                "TransactionDestinationOneOf{umaAddressTransactionDestination=$umaAddressTransactionDestination}"
            externalAccountDetails != null ->
                "TransactionDestinationOneOf{externalAccountDetails=$externalAccountDetails}"
            _json != null -> "TransactionDestinationOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid TransactionDestinationOneOf")
        }

    companion object {

        /** Destination account details */
        fun ofAccountTransactionDestination(
            accountTransactionDestination: AccountTransactionDestination
        ) =
            TransactionDestinationOneOf(
                accountTransactionDestination = accountTransactionDestination
            )

        /** UMA address destination details */
        fun ofUmaAddressTransactionDestination(
            umaAddressTransactionDestination: UmaAddressTransactionDestination
        ) =
            TransactionDestinationOneOf(
                umaAddressTransactionDestination = umaAddressTransactionDestination
            )

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        fun ofExternalAccountDetails(externalAccountDetails: ExternalAccountDetails) =
            TransactionDestinationOneOf(externalAccountDetails = externalAccountDetails)
    }

    /**
     * An interface that defines how to map each variant of [TransactionDestinationOneOf] to a value
     * of type [T].
     */
    interface Visitor<out T> {

        /** Destination account details */
        fun visitAccountTransactionDestination(
            accountTransactionDestination: AccountTransactionDestination
        ): T

        /** UMA address destination details */
        fun visitUmaAddressTransactionDestination(
            umaAddressTransactionDestination: UmaAddressTransactionDestination
        ): T

        /**
         * Transaction destination where external account details were provided inline at quote
         * creation rather than using a pre-registered external account.
         */
        fun visitExternalAccountDetails(externalAccountDetails: ExternalAccountDetails): T

        /**
         * Maps an unknown variant of [TransactionDestinationOneOf] to a value of type [T].
         *
         * An instance of [TransactionDestinationOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown TransactionDestinationOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<TransactionDestinationOneOf>(TransactionDestinationOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): TransactionDestinationOneOf {
            val json = JsonValue.fromJsonNode(node)
            val destinationType = json.asObject()?.get("destinationType")?.asString()

            if (destinationType == "EXTERNAL_ACCOUNT_DETAILS") {
                return tryDeserialize(node, jacksonTypeRef<ExternalAccountDetails>())?.let {
                    TransactionDestinationOneOf(externalAccountDetails = it, _json = json)
                } ?: TransactionDestinationOneOf(_json = json)
            }

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<AccountTransactionDestination>())?.let {
                            TransactionDestinationOneOf(
                                accountTransactionDestination = it,
                                _json = json,
                            )
                        },
                        tryDeserialize(node, jacksonTypeRef<UmaAddressTransactionDestination>())
                            ?.let {
                                TransactionDestinationOneOf(
                                    umaAddressTransactionDestination = it,
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
                0 -> TransactionDestinationOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<TransactionDestinationOneOf>(TransactionDestinationOneOf::class) {

        override fun serialize(
            value: TransactionDestinationOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.accountTransactionDestination != null ->
                    generator.writeObject(value.accountTransactionDestination)
                value.umaAddressTransactionDestination != null ->
                    generator.writeObject(value.umaAddressTransactionDestination)
                value.externalAccountDetails != null ->
                    generator.writeObject(value.externalAccountDetails)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid TransactionDestinationOneOf")
            }
        }
    }

    /** Destination account details */
    class AccountTransactionDestination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val destinationType: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonValue = JsonMissing.of(),
        ) : this(accountId, destinationType, mutableMapOf())

        /**
         * Destination account identifier
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
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonValue = destinationType

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
             * Returns a mutable builder for constructing an instance of
             * [AccountTransactionDestination].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [AccountTransactionDestination]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var destinationType: JsonValue = JsonValue.from("ACCOUNT")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(accountTransactionDestination: AccountTransactionDestination) =
                apply {
                    accountId = accountTransactionDestination.accountId
                    destinationType = accountTransactionDestination.destinationType
                    additionalProperties =
                        accountTransactionDestination.additionalProperties.toMutableMap()
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
            fun destinationType(destinationType: JsonValue) = apply {
                this.destinationType = destinationType
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
             * Returns an immutable instance of [AccountTransactionDestination].
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
            fun build(): AccountTransactionDestination =
                AccountTransactionDestination(
                    checkRequired("accountId", accountId),
                    destinationType,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): AccountTransactionDestination = apply {
            if (validated) {
                return@apply
            }

            accountId()
            _destinationType().let {
                if (it != JsonValue.from("ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'destinationType' is invalid, received $it"
                    )
                }
            }
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
                destinationType.let { if (it == JsonValue.from("ACCOUNT")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountTransactionDestination &&
                accountId == other.accountId &&
                destinationType == other.destinationType &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, destinationType, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccountTransactionDestination{accountId=$accountId, destinationType=$destinationType, additionalProperties=$additionalProperties}"
    }

    /** UMA address destination details */
    class UmaAddressTransactionDestination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destinationType: JsonValue,
        private val umaAddress: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonValue = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
        ) : this(destinationType, umaAddress, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("UMA_ADDRESS")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonValue = destinationType

        /**
         * UMA address of the recipient
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

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
             * [UmaAddressTransactionDestination].
             *
             * The following fields are required:
             * ```kotlin
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UmaAddressTransactionDestination]. */
        class Builder internal constructor() {

            private var destinationType: JsonValue = JsonValue.from("UMA_ADDRESS")
            private var umaAddress: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(umaAddressTransactionDestination: UmaAddressTransactionDestination) =
                apply {
                    destinationType = umaAddressTransactionDestination.destinationType
                    umaAddress = umaAddressTransactionDestination.umaAddress
                    additionalProperties =
                        umaAddressTransactionDestination.additionalProperties.toMutableMap()
                }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("UMA_ADDRESS")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun destinationType(destinationType: JsonValue) = apply {
                this.destinationType = destinationType
            }

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
             * Returns an immutable instance of [UmaAddressTransactionDestination].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UmaAddressTransactionDestination =
                UmaAddressTransactionDestination(
                    destinationType,
                    checkRequired("umaAddress", umaAddress),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UmaAddressTransactionDestination = apply {
            if (validated) {
                return@apply
            }

            _destinationType().let {
                if (it != JsonValue.from("UMA_ADDRESS")) {
                    throw LightsparkGridInvalidDataException(
                        "'destinationType' is invalid, received $it"
                    )
                }
            }
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
            destinationType.let { if (it == JsonValue.from("UMA_ADDRESS")) 1 else 0 } +
                (if (umaAddress.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UmaAddressTransactionDestination &&
                destinationType == other.destinationType &&
                umaAddress == other.umaAddress &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(destinationType, umaAddress, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UmaAddressTransactionDestination{destinationType=$destinationType, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
    }

    /**
     * Transaction destination where external account details were provided inline at quote creation
     * rather than using a pre-registered external account.
     */
    class ExternalAccountDetails
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val currency: JsonField<String>,
        private val destinationType: JsonField<DestinationType>,
        private val externalAccountDetails: JsonField<ExternalAccountCreate>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("destinationType")
            @ExcludeMissing
            destinationType: JsonField<DestinationType> = JsonMissing.of(),
            @JsonProperty("externalAccountDetails")
            @ExcludeMissing
            externalAccountDetails: JsonField<ExternalAccountCreate> = JsonMissing.of(),
        ) : this(currency, destinationType, externalAccountDetails, mutableMapOf())

        fun toBaseTransactionDestination(): BaseTransactionDestination =
            BaseTransactionDestination.builder().currency(currency).build()

        /**
         * Currency code for the destination
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destinationType(): DestinationType = destinationType.getRequired("destinationType")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun externalAccountDetails(): ExternalAccountCreate =
            externalAccountDetails.getRequired("externalAccountDetails")

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [destinationType].
         *
         * Unlike [destinationType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("destinationType")
        @ExcludeMissing
        fun _destinationType(): JsonField<DestinationType> = destinationType

        /**
         * Returns the raw JSON value of [externalAccountDetails].
         *
         * Unlike [externalAccountDetails], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("externalAccountDetails")
        @ExcludeMissing
        fun _externalAccountDetails(): JsonField<ExternalAccountCreate> = externalAccountDetails

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
             * Returns a mutable builder for constructing an instance of [ExternalAccountDetails].
             *
             * The following fields are required:
             * ```kotlin
             * .destinationType()
             * .externalAccountDetails()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ExternalAccountDetails]. */
        class Builder internal constructor() {

            private var currency: JsonField<String> = JsonMissing.of()
            private var destinationType: JsonField<DestinationType>? = null
            private var externalAccountDetails: JsonField<ExternalAccountCreate>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(externalAccountDetails: ExternalAccountDetails) = apply {
                currency = externalAccountDetails.currency
                destinationType = externalAccountDetails.destinationType
                this.externalAccountDetails = externalAccountDetails.externalAccountDetails
                additionalProperties = externalAccountDetails.additionalProperties.toMutableMap()
            }

            /** Currency code for the destination */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            fun destinationType(destinationType: DestinationType) =
                destinationType(JsonField.of(destinationType))

            /**
             * Sets [Builder.destinationType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destinationType] with a well-typed [DestinationType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun destinationType(destinationType: JsonField<DestinationType>) = apply {
                this.destinationType = destinationType
            }

            fun externalAccountDetails(externalAccountDetails: ExternalAccountCreate) =
                externalAccountDetails(JsonField.of(externalAccountDetails))

            /**
             * Sets [Builder.externalAccountDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalAccountDetails] with a well-typed
             * [ExternalAccountCreate] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun externalAccountDetails(externalAccountDetails: JsonField<ExternalAccountCreate>) =
                apply {
                    this.externalAccountDetails = externalAccountDetails
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
             * Returns an immutable instance of [ExternalAccountDetails].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .destinationType()
             * .externalAccountDetails()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalAccountDetails =
                ExternalAccountDetails(
                    currency,
                    checkRequired("destinationType", destinationType),
                    checkRequired("externalAccountDetails", externalAccountDetails),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExternalAccountDetails = apply {
            if (validated) {
                return@apply
            }

            currency()
            destinationType().validate()
            externalAccountDetails().validate()
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
                (destinationType.asKnown()?.validity() ?: 0) +
                (externalAccountDetails.asKnown()?.validity() ?: 0)

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

                val EXTERNAL_ACCOUNT_DETAILS = of("EXTERNAL_ACCOUNT_DETAILS")

                fun of(value: String) = DestinationType(JsonField.of(value))
            }

            /** An enum containing [DestinationType]'s known values. */
            enum class Known {
                EXTERNAL_ACCOUNT_DETAILS
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
                EXTERNAL_ACCOUNT_DETAILS,
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
                    EXTERNAL_ACCOUNT_DETAILS -> Value.EXTERNAL_ACCOUNT_DETAILS
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
                    EXTERNAL_ACCOUNT_DETAILS -> Known.EXTERNAL_ACCOUNT_DETAILS
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

            return other is ExternalAccountDetails &&
                currency == other.currency &&
                destinationType == other.destinationType &&
                externalAccountDetails == other.externalAccountDetails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(currency, destinationType, externalAccountDetails, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalAccountDetails{currency=$currency, destinationType=$destinationType, externalAccountDetails=$externalAccountDetails, additionalProperties=$additionalProperties}"
    }
}
