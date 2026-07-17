// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Execute a quote by its ID. This endpoint initiates the transfer between the source and
 * destination accounts.
 *
 * This endpoint can only be used for quotes with a `source` which is either an internal account, or
 * has direct pull functionality (e.g. ACH pull with an external account).
 *
 * When the quote's `source` is an internal account of type `EMBEDDED_WALLET`, the request must
 * include a `Grid-Wallet-Signature` header. The header value is the full Grid wallet signature
 * built over the `payloadToSign` value from the quote's `paymentInstructions[].accountOrWalletInfo`
 * entry with the session private key of a verified authentication credential on the source Embedded
 * Wallet.
 *
 * Once executed, the quote cannot be cancelled and the transfer will be processed.
 */
class QuoteExecuteParams
private constructor(
    private val quoteId: String?,
    private val gridWalletSignature: String?,
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun quoteId(): String? = quoteId

    fun gridWalletSignature(): String? = gridWalletSignature

    fun idempotencyKey(): String? = idempotencyKey

    /**
     * Optional preferred factor for the Strong Customer Authentication challenge this call issues.
     * Only relevant for customers in a region where SCA is required (e.g. EU); ignored otherwise.
     * Valid values for a per-transaction challenge are `SMS_OTP` (default) and `PASSKEY` — `TOTP`
     * cannot carry the required dynamic linking and is rejected here. Omit to default to `SMS_OTP`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun scaFactor(): ScaFactor? = body.scaFactor()

    /**
     * Returns the raw JSON value of [scaFactor].
     *
     * Unlike [scaFactor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scaFactor(): JsonField<ScaFactor> = body._scaFactor()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): QuoteExecuteParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [QuoteExecuteParams]. */
        fun builder() = Builder()
    }

    /** A builder for [QuoteExecuteParams]. */
    class Builder internal constructor() {

        private var quoteId: String? = null
        private var gridWalletSignature: String? = null
        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(quoteExecuteParams: QuoteExecuteParams) = apply {
            quoteId = quoteExecuteParams.quoteId
            gridWalletSignature = quoteExecuteParams.gridWalletSignature
            idempotencyKey = quoteExecuteParams.idempotencyKey
            body = quoteExecuteParams.body.toBuilder()
            additionalHeaders = quoteExecuteParams.additionalHeaders.toBuilder()
            additionalQueryParams = quoteExecuteParams.additionalQueryParams.toBuilder()
        }

        fun quoteId(quoteId: String?) = apply { this.quoteId = quoteId }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [scaFactor]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Optional preferred factor for the Strong Customer Authentication challenge this call
         * issues. Only relevant for customers in a region where SCA is required (e.g. EU); ignored
         * otherwise. Valid values for a per-transaction challenge are `SMS_OTP` (default) and
         * `PASSKEY` — `TOTP` cannot carry the required dynamic linking and is rejected here. Omit
         * to default to `SMS_OTP`.
         */
        fun scaFactor(scaFactor: ScaFactor) = apply { body.scaFactor(scaFactor) }

        /**
         * Sets [Builder.scaFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scaFactor] with a well-typed [ScaFactor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scaFactor(scaFactor: JsonField<ScaFactor>) = apply { body.scaFactor(scaFactor) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [QuoteExecuteParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): QuoteExecuteParams =
            QuoteExecuteParams(
                quoteId,
                gridWalletSignature,
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> quoteId ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                gridWalletSignature?.let { put("Grid-Wallet-Signature", it) }
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Optional body for executing a quote. Only needed to request a specific Strong Customer
     * Authentication factor (`scaFactor`) for the challenge this call issues; omit the body
     * entirely otherwise.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val scaFactor: JsonField<ScaFactor>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("scaFactor")
            @ExcludeMissing
            scaFactor: JsonField<ScaFactor> = JsonMissing.of()
        ) : this(scaFactor, mutableMapOf())

        /**
         * Optional preferred factor for the Strong Customer Authentication challenge this call
         * issues. Only relevant for customers in a region where SCA is required (e.g. EU); ignored
         * otherwise. Valid values for a per-transaction challenge are `SMS_OTP` (default) and
         * `PASSKEY` — `TOTP` cannot carry the required dynamic linking and is rejected here. Omit
         * to default to `SMS_OTP`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scaFactor(): ScaFactor? = scaFactor.getNullable("scaFactor")

        /**
         * Returns the raw JSON value of [scaFactor].
         *
         * Unlike [scaFactor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scaFactor")
        @ExcludeMissing
        fun _scaFactor(): JsonField<ScaFactor> = scaFactor

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var scaFactor: JsonField<ScaFactor> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                scaFactor = body.scaFactor
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Optional preferred factor for the Strong Customer Authentication challenge this call
             * issues. Only relevant for customers in a region where SCA is required (e.g. EU);
             * ignored otherwise. Valid values for a per-transaction challenge are `SMS_OTP`
             * (default) and `PASSKEY` — `TOTP` cannot carry the required dynamic linking and is
             * rejected here. Omit to default to `SMS_OTP`.
             */
            fun scaFactor(scaFactor: ScaFactor) = scaFactor(JsonField.of(scaFactor))

            /**
             * Sets [Builder.scaFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scaFactor] with a well-typed [ScaFactor] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scaFactor(scaFactor: JsonField<ScaFactor>) = apply { this.scaFactor = scaFactor }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(scaFactor, additionalProperties.toMutableMap())
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            scaFactor()?.validate()
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
        internal fun validity(): Int = (scaFactor.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                scaFactor == other.scaFactor &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(scaFactor, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{scaFactor=$scaFactor, additionalProperties=$additionalProperties}"
    }

    /**
     * Optional preferred factor for the Strong Customer Authentication challenge this call issues.
     * Only relevant for customers in a region where SCA is required (e.g. EU); ignored otherwise.
     * Valid values for a per-transaction challenge are `SMS_OTP` (default) and `PASSKEY` — `TOTP`
     * cannot carry the required dynamic linking and is rejected here. Omit to default to `SMS_OTP`.
     */
    class ScaFactor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SMS_OTP = of("SMS_OTP")

            val TOTP = of("TOTP")

            val PASSKEY = of("PASSKEY")

            fun of(value: String) = ScaFactor(JsonField.of(value))
        }

        /** An enum containing [ScaFactor]'s known values. */
        enum class Known {
            SMS_OTP,
            TOTP,
            PASSKEY,
        }

        /**
         * An enum containing [ScaFactor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScaFactor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS_OTP,
            TOTP,
            PASSKEY,
            /**
             * An enum member indicating that [ScaFactor] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SMS_OTP -> Value.SMS_OTP
                TOTP -> Value.TOTP
                PASSKEY -> Value.PASSKEY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                SMS_OTP -> Known.SMS_OTP
                TOTP -> Known.TOTP
                PASSKEY -> Known.PASSKEY
                else -> throw LightsparkGridInvalidDataException("Unknown ScaFactor: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

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
        fun validate(): ScaFactor = apply {
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

            return other is ScaFactor && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteExecuteParams &&
            quoteId == other.quoteId &&
            gridWalletSignature == other.gridWalletSignature &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            quoteId,
            gridWalletSignature,
            idempotencyKey,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "QuoteExecuteParams{quoteId=$quoteId, gridWalletSignature=$gridWalletSignature, idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
