// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

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

/**
 * Response body for the signed retry of `POST /internal-accounts/{internalAccountId}/export`.
 * Normally an `InternalAccountExportResponse` — the encrypted wallet credentials. When the
 * underlying wallet-provider activity is still in flight, this is instead a
 * `WalletOperationProcessing` body with `status: "PROCESSING"`. The credentials are never stored
 * server-side, so re-sending the byte-identical signed retry is how they are collected: the re-send
 * returns them as soon as the activity has settled, and the challenge is consumed only by the
 * attempt that delivers them.
 */
@JsonDeserialize(using = CustomerExportResponse.Deserializer::class)
@JsonSerialize(using = CustomerExportResponse.Serializer::class)
class CustomerExportResponse
private constructor(
    private val internalAccount: InternalAccountExportResponse? = null,
    private val walletOperationProcessing: WalletOperationProcessing? = null,
    private val _json: JsonValue? = null,
) {

    fun internalAccount(): InternalAccountExportResponse? = internalAccount

    /**
     * `200` response returned by an Embedded Wallet operation that the wallet provider has accepted
     * but not yet settled — a consensus- or approval-gated activity that is still in flight. It is
     * not an error and needs no client action beyond patience: the backend reconciles the operation
     * to its terminal state on its own. The client MAY re-send the byte-identical request to
     * converge sooner; the request is idempotent and returns the settled success response once the
     * operation completes.
     */
    fun walletOperationProcessing(): WalletOperationProcessing? = walletOperationProcessing

    fun isInternalAccount(): Boolean = internalAccount != null

    fun isWalletOperationProcessing(): Boolean = walletOperationProcessing != null

    fun asInternalAccount(): InternalAccountExportResponse =
        internalAccount.getOrThrow("internalAccount")

    /**
     * `200` response returned by an Embedded Wallet operation that the wallet provider has accepted
     * but not yet settled — a consensus- or approval-gated activity that is still in flight. It is
     * not an error and needs no client action beyond patience: the backend reconciles the operation
     * to its terminal state on its own. The client MAY re-send the byte-identical request to
     * converge sooner; the request is idempotent and returns the settled success response once the
     * operation completes.
     */
    fun asWalletOperationProcessing(): WalletOperationProcessing =
        walletOperationProcessing.getOrThrow("walletOperationProcessing")

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
     * val result: String? = customerExportResponse.accept(object : CustomerExportResponse.Visitor<String?> {
     *     override fun visitInternalAccount(internalAccount: InternalAccountExportResponse): String? = internalAccount.toString()
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
            internalAccount != null -> visitor.visitInternalAccount(internalAccount)
            walletOperationProcessing != null ->
                visitor.visitWalletOperationProcessing(walletOperationProcessing)
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
    fun validate(): CustomerExportResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitInternalAccount(internalAccount: InternalAccountExportResponse) {
                    internalAccount.validate()
                }

                override fun visitWalletOperationProcessing(
                    walletOperationProcessing: WalletOperationProcessing
                ) {
                    walletOperationProcessing.validate()
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
                override fun visitInternalAccount(internalAccount: InternalAccountExportResponse) =
                    internalAccount.validity()

                override fun visitWalletOperationProcessing(
                    walletOperationProcessing: WalletOperationProcessing
                ) = walletOperationProcessing.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerExportResponse &&
            internalAccount == other.internalAccount &&
            walletOperationProcessing == other.walletOperationProcessing
    }

    override fun hashCode(): Int = Objects.hash(internalAccount, walletOperationProcessing)

    override fun toString(): String =
        when {
            internalAccount != null -> "CustomerExportResponse{internalAccount=$internalAccount}"
            walletOperationProcessing != null ->
                "CustomerExportResponse{walletOperationProcessing=$walletOperationProcessing}"
            _json != null -> "CustomerExportResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerExportResponse")
        }

    companion object {

        fun ofInternalAccount(internalAccount: InternalAccountExportResponse) =
            CustomerExportResponse(internalAccount = internalAccount)

        /**
         * `200` response returned by an Embedded Wallet operation that the wallet provider has
         * accepted but not yet settled — a consensus- or approval-gated activity that is still in
         * flight. It is not an error and needs no client action beyond patience: the backend
         * reconciles the operation to its terminal state on its own. The client MAY re-send the
         * byte-identical request to converge sooner; the request is idempotent and returns the
         * settled success response once the operation completes.
         */
        fun ofWalletOperationProcessing(walletOperationProcessing: WalletOperationProcessing) =
            CustomerExportResponse(walletOperationProcessing = walletOperationProcessing)
    }

    /**
     * An interface that defines how to map each variant of [CustomerExportResponse] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitInternalAccount(internalAccount: InternalAccountExportResponse): T

        /**
         * `200` response returned by an Embedded Wallet operation that the wallet provider has
         * accepted but not yet settled — a consensus- or approval-gated activity that is still in
         * flight. It is not an error and needs no client action beyond patience: the backend
         * reconciles the operation to its terminal state on its own. The client MAY re-send the
         * byte-identical request to converge sooner; the request is idempotent and returns the
         * settled success response once the operation completes.
         */
        fun visitWalletOperationProcessing(walletOperationProcessing: WalletOperationProcessing): T

        /**
         * Maps an unknown variant of [CustomerExportResponse] to a value of type [T].
         *
         * An instance of [CustomerExportResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown CustomerExportResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<CustomerExportResponse>(CustomerExportResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CustomerExportResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<InternalAccountExportResponse>())?.let {
                            CustomerExportResponse(internalAccount = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<WalletOperationProcessing>())?.let {
                            CustomerExportResponse(walletOperationProcessing = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CustomerExportResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<CustomerExportResponse>(CustomerExportResponse::class) {

        override fun serialize(
            value: CustomerExportResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.internalAccount != null -> generator.writeObject(value.internalAccount)
                value.walletOperationProcessing != null ->
                    generator.writeObject(value.walletOperationProcessing)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerExportResponse")
            }
        }
    }

    /**
     * `200` response returned by an Embedded Wallet operation that the wallet provider has accepted
     * but not yet settled — a consensus- or approval-gated activity that is still in flight. It is
     * not an error and needs no client action beyond patience: the backend reconciles the operation
     * to its terminal state on its own. The client MAY re-send the byte-identical request to
     * converge sooner; the request is idempotent and returns the settled success response once the
     * operation completes.
     */
    class WalletOperationProcessing
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val status: JsonField<Status>,
        private val message: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("message") @ExcludeMissing message: JsonField<String> = JsonMissing.of(),
        ) : this(status, message, mutableMapOf())

        /**
         * Always `PROCESSING`. Marks a still-in-flight operation whose terminal result is not yet
         * available.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Human-readable explanation that the operation is still being processed and the same
         * request may be retried.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun message(): String? = message.getNullable("message")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [message].
         *
         * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
             * [WalletOperationProcessing].
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [WalletOperationProcessing]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var message: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(walletOperationProcessing: WalletOperationProcessing) = apply {
                status = walletOperationProcessing.status
                message = walletOperationProcessing.message
                additionalProperties = walletOperationProcessing.additionalProperties.toMutableMap()
            }

            /**
             * Always `PROCESSING`. Marks a still-in-flight operation whose terminal result is not
             * yet available.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * Human-readable explanation that the operation is still being processed and the same
             * request may be retried.
             */
            fun message(message: String) = message(JsonField.of(message))

            /**
             * Sets [Builder.message] to an arbitrary JSON value.
             *
             * You should usually call [Builder.message] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun message(message: JsonField<String>) = apply { this.message = message }

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
             * Returns an immutable instance of [WalletOperationProcessing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): WalletOperationProcessing =
                WalletOperationProcessing(
                    checkRequired("status", status),
                    message,
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
        fun validate(): WalletOperationProcessing = apply {
            if (validated) {
                return@apply
            }

            status().validate()
            message()
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
            (status.asKnown()?.validity() ?: 0) + (if (message.asKnown() == null) 0 else 1)

        /**
         * Always `PROCESSING`. Marks a still-in-flight operation whose terminal result is not yet
         * available.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val PROCESSING = of("PROCESSING")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PROCESSING
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PROCESSING,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PROCESSING -> Value.PROCESSING
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
                    PROCESSING -> Known.PROCESSING
                    else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
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
            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WalletOperationProcessing &&
                status == other.status &&
                message == other.message &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(status, message, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WalletOperationProcessing{status=$status, message=$message, additionalProperties=$additionalProperties}"
    }
}
