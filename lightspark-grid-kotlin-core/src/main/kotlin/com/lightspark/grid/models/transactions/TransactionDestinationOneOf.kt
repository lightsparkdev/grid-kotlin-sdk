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
@JsonDeserialize(using = TransactionDestinationOneOf.Deserializer::class)
@JsonSerialize(using = TransactionDestinationOneOf.Serializer::class)
class TransactionDestinationOneOf
private constructor(
    private val accountTransactionDestination: AccountTransactionDestination? = null,
    private val umaAddressTransactionDestination: UmaAddressTransactionDestination? = null,
    private val _json: JsonValue? = null,
) {

    /** Destination account details */
    fun accountTransactionDestination(): AccountTransactionDestination? =
        accountTransactionDestination

    /** UMA address destination details */
    fun umaAddressTransactionDestination(): UmaAddressTransactionDestination? =
        umaAddressTransactionDestination

    fun isAccountTransactionDestination(): Boolean = accountTransactionDestination != null

    fun isUmaAddressTransactionDestination(): Boolean = umaAddressTransactionDestination != null

    /** Destination account details */
    fun asAccountTransactionDestination(): AccountTransactionDestination =
        accountTransactionDestination.getOrThrow("accountTransactionDestination")

    /** UMA address destination details */
    fun asUmaAddressTransactionDestination(): UmaAddressTransactionDestination =
        umaAddressTransactionDestination.getOrThrow("umaAddressTransactionDestination")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            accountTransactionDestination != null ->
                visitor.visitAccountTransactionDestination(accountTransactionDestination)
            umaAddressTransactionDestination != null ->
                visitor.visitUmaAddressTransactionDestination(umaAddressTransactionDestination)
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

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionDestinationOneOf &&
            accountTransactionDestination == other.accountTransactionDestination &&
            umaAddressTransactionDestination == other.umaAddressTransactionDestination
    }

    override fun hashCode(): Int =
        Objects.hash(accountTransactionDestination, umaAddressTransactionDestination)

    override fun toString(): String =
        when {
            accountTransactionDestination != null ->
                "TransactionDestinationOneOf{accountTransactionDestination=$accountTransactionDestination}"
            umaAddressTransactionDestination != null ->
                "TransactionDestinationOneOf{umaAddressTransactionDestination=$umaAddressTransactionDestination}"
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

            when (destinationType) {}

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
}
