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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class QuoteRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destination: JsonField<QuoteDestinationOneOf>,
    private val lockedCurrencyAmount: JsonField<Long>,
    private val lockedCurrencySide: JsonField<QuoteLockSide>,
    private val source: JsonField<QuoteSourceOneOf>,
    private val description: JsonField<String>,
    private val immediatelyExecute: JsonField<Boolean>,
    private val lookupId: JsonField<String>,
    private val purposeOfPayment: JsonField<PurposeOfPayment>,
    private val senderCustomerInfo: JsonField<SenderCustomerInfo>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<QuoteDestinationOneOf> = JsonMissing.of(),
        @JsonProperty("lockedCurrencyAmount")
        @ExcludeMissing
        lockedCurrencyAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lockedCurrencySide")
        @ExcludeMissing
        lockedCurrencySide: JsonField<QuoteLockSide> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<QuoteSourceOneOf> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("immediatelyExecute")
        @ExcludeMissing
        immediatelyExecute: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("lookupId") @ExcludeMissing lookupId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("purposeOfPayment")
        @ExcludeMissing
        purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of(),
        @JsonProperty("senderCustomerInfo")
        @ExcludeMissing
        senderCustomerInfo: JsonField<SenderCustomerInfo> = JsonMissing.of(),
    ) : this(
        destination,
        lockedCurrencyAmount,
        lockedCurrencySide,
        source,
        description,
        immediatelyExecute,
        lookupId,
        purposeOfPayment,
        senderCustomerInfo,
        mutableMapOf(),
    )

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): QuoteDestinationOneOf = destination.getRequired("destination")

    /**
     * The amount to send/receive in the smallest unit of the locked currency (eg. cents). See
     * `lockedCurrencySide` for more information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lockedCurrencyAmount(): Long = lockedCurrencyAmount.getRequired("lockedCurrencyAmount")

    /**
     * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`. For
     * example, if I want to send exactly $5 MXN from my wallet, I would set this to "sending", and
     * the `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to receive exactly $10
     * USD, I would set this to "receiving" and the `lockedCurrencyAmount` to 10000 (in cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lockedCurrencySide(): QuoteLockSide = lockedCurrencySide.getRequired("lockedCurrencySide")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): QuoteSourceOneOf = source.getRequired("source")

    /**
     * Optional description/memo for the transfer
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = description.getNullable("description")

    /**
     * Whether to immediately execute the quote after creation. If true, the quote will be executed
     * and the transaction will be created at the current exchange rate. It should only be used if
     * you don't want to lock and view rate details before executing the quote. If you are executing
     * a pre-existing quote, use the `/quotes/{quoteId}/execute` endpoint instead. This is false by
     * default. This can only be used for quotes with a `source` which is either an internal
     * account, or has direct pull functionality (e.g. ACH pull with an external account). Not
     * supported when the `source` is an internal account of type `EMBEDDED_WALLET`: those transfers
     * require a `Grid-Wallet-Signature` over the `payloadToSign` returned in the quote response,
     * which is not available in a combined create-and-execute call. Create the quote first with
     * `immediatelyExecute: false` and then call `POST /quotes/{quoteId}/execute` with the
     * `Grid-Wallet-Signature` stamp header.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun immediatelyExecute(): Boolean? = immediatelyExecute.getNullable("immediatelyExecute")

    /**
     * Lookup ID from a previous receiver lookup request. If provided, this can make the quote
     * creation more efficient by reusing cached lookup data. NOTE: This is required for UMA
     * destinations due to counterparty institution requirements. See `senderCustomerInfo` for more
     * information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lookupId(): String? = lookupId.getNullable("lookupId")

    /**
     * The purpose of the payment. This may be required when sending to certain geographies (e.g.
     * India).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purposeOfPayment(): PurposeOfPayment? = purposeOfPayment.getNullable("purposeOfPayment")

    /**
     * Key-value pairs of additional information about the sender which was requested by the
     * destination. This is relevant when the destination requires more sender info than was
     * provided during customer creation. Any fields specified in `requiredPayerDataFields` from the
     * response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
     * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be provided
     * here if they were requested. If the destination did not request any additional information,
     * this field can be omitted.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun senderCustomerInfo(): SenderCustomerInfo? =
        senderCustomerInfo.getNullable("senderCustomerInfo")

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<QuoteDestinationOneOf> = destination

    /**
     * Returns the raw JSON value of [lockedCurrencyAmount].
     *
     * Unlike [lockedCurrencyAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lockedCurrencyAmount")
    @ExcludeMissing
    fun _lockedCurrencyAmount(): JsonField<Long> = lockedCurrencyAmount

    /**
     * Returns the raw JSON value of [lockedCurrencySide].
     *
     * Unlike [lockedCurrencySide], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lockedCurrencySide")
    @ExcludeMissing
    fun _lockedCurrencySide(): JsonField<QuoteLockSide> = lockedCurrencySide

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<QuoteSourceOneOf> = source

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [immediatelyExecute].
     *
     * Unlike [immediatelyExecute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("immediatelyExecute")
    @ExcludeMissing
    fun _immediatelyExecute(): JsonField<Boolean> = immediatelyExecute

    /**
     * Returns the raw JSON value of [lookupId].
     *
     * Unlike [lookupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lookupId") @ExcludeMissing fun _lookupId(): JsonField<String> = lookupId

    /**
     * Returns the raw JSON value of [purposeOfPayment].
     *
     * Unlike [purposeOfPayment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("purposeOfPayment")
    @ExcludeMissing
    fun _purposeOfPayment(): JsonField<PurposeOfPayment> = purposeOfPayment

    /**
     * Returns the raw JSON value of [senderCustomerInfo].
     *
     * Unlike [senderCustomerInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("senderCustomerInfo")
    @ExcludeMissing
    fun _senderCustomerInfo(): JsonField<SenderCustomerInfo> = senderCustomerInfo

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
         * Returns a mutable builder for constructing an instance of [QuoteRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .lockedCurrencyAmount()
         * .lockedCurrencySide()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [QuoteRequest]. */
    class Builder internal constructor() {

        private var destination: JsonField<QuoteDestinationOneOf>? = null
        private var lockedCurrencyAmount: JsonField<Long>? = null
        private var lockedCurrencySide: JsonField<QuoteLockSide>? = null
        private var source: JsonField<QuoteSourceOneOf>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var immediatelyExecute: JsonField<Boolean> = JsonMissing.of()
        private var lookupId: JsonField<String> = JsonMissing.of()
        private var purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of()
        private var senderCustomerInfo: JsonField<SenderCustomerInfo> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(quoteRequest: QuoteRequest) = apply {
            destination = quoteRequest.destination
            lockedCurrencyAmount = quoteRequest.lockedCurrencyAmount
            lockedCurrencySide = quoteRequest.lockedCurrencySide
            source = quoteRequest.source
            description = quoteRequest.description
            immediatelyExecute = quoteRequest.immediatelyExecute
            lookupId = quoteRequest.lookupId
            purposeOfPayment = quoteRequest.purposeOfPayment
            senderCustomerInfo = quoteRequest.senderCustomerInfo
            additionalProperties = quoteRequest.additionalProperties.toMutableMap()
        }

        fun destination(destination: QuoteDestinationOneOf) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [QuoteDestinationOneOf]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destination(destination: JsonField<QuoteDestinationOneOf>) = apply {
            this.destination = destination
        }

        /**
         * The amount to send/receive in the smallest unit of the locked currency (eg. cents). See
         * `lockedCurrencySide` for more information.
         */
        fun lockedCurrencyAmount(lockedCurrencyAmount: Long) =
            lockedCurrencyAmount(JsonField.of(lockedCurrencyAmount))

        /**
         * Sets [Builder.lockedCurrencyAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockedCurrencyAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lockedCurrencyAmount(lockedCurrencyAmount: JsonField<Long>) = apply {
            this.lockedCurrencyAmount = lockedCurrencyAmount
        }

        /**
         * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`.
         * For example, if I want to send exactly $5 MXN from my wallet, I would set this to
         * "sending", and the `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to
         * receive exactly $10 USD, I would set this to "receiving" and the `lockedCurrencyAmount`
         * to 10000 (in cents).
         */
        fun lockedCurrencySide(lockedCurrencySide: QuoteLockSide) =
            lockedCurrencySide(JsonField.of(lockedCurrencySide))

        /**
         * Sets [Builder.lockedCurrencySide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockedCurrencySide] with a well-typed [QuoteLockSide]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lockedCurrencySide(lockedCurrencySide: JsonField<QuoteLockSide>) = apply {
            this.lockedCurrencySide = lockedCurrencySide
        }

        fun source(source: QuoteSourceOneOf) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [QuoteSourceOneOf] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<QuoteSourceOneOf>) = apply { this.source = source }

        /** Optional description/memo for the transfer */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * Whether to immediately execute the quote after creation. If true, the quote will be
         * executed and the transaction will be created at the current exchange rate. It should only
         * be used if you don't want to lock and view rate details before executing the quote. If
         * you are executing a pre-existing quote, use the `/quotes/{quoteId}/execute` endpoint
         * instead. This is false by default. This can only be used for quotes with a `source` which
         * is either an internal account, or has direct pull functionality (e.g. ACH pull with an
         * external account). Not supported when the `source` is an internal account of type
         * `EMBEDDED_WALLET`: those transfers require a `Grid-Wallet-Signature` over the
         * `payloadToSign` returned in the quote response, which is not available in a combined
         * create-and-execute call. Create the quote first with `immediatelyExecute: false` and then
         * call `POST /quotes/{quoteId}/execute` with the `Grid-Wallet-Signature` stamp header.
         */
        fun immediatelyExecute(immediatelyExecute: Boolean) =
            immediatelyExecute(JsonField.of(immediatelyExecute))

        /**
         * Sets [Builder.immediatelyExecute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.immediatelyExecute] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun immediatelyExecute(immediatelyExecute: JsonField<Boolean>) = apply {
            this.immediatelyExecute = immediatelyExecute
        }

        /**
         * Lookup ID from a previous receiver lookup request. If provided, this can make the quote
         * creation more efficient by reusing cached lookup data. NOTE: This is required for UMA
         * destinations due to counterparty institution requirements. See `senderCustomerInfo` for
         * more information.
         */
        fun lookupId(lookupId: String) = lookupId(JsonField.of(lookupId))

        /**
         * Sets [Builder.lookupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lookupId(lookupId: JsonField<String>) = apply { this.lookupId = lookupId }

        /**
         * The purpose of the payment. This may be required when sending to certain geographies
         * (e.g. India).
         */
        fun purposeOfPayment(purposeOfPayment: PurposeOfPayment) =
            purposeOfPayment(JsonField.of(purposeOfPayment))

        /**
         * Sets [Builder.purposeOfPayment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purposeOfPayment] with a well-typed [PurposeOfPayment]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun purposeOfPayment(purposeOfPayment: JsonField<PurposeOfPayment>) = apply {
            this.purposeOfPayment = purposeOfPayment
        }

        /**
         * Key-value pairs of additional information about the sender which was requested by the
         * destination. This is relevant when the destination requires more sender info than was
         * provided during customer creation. Any fields specified in `requiredPayerDataFields` from
         * the response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
         * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be
         * provided here if they were requested. If the destination did not request any additional
         * information, this field can be omitted.
         */
        fun senderCustomerInfo(senderCustomerInfo: SenderCustomerInfo) =
            senderCustomerInfo(JsonField.of(senderCustomerInfo))

        /**
         * Sets [Builder.senderCustomerInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderCustomerInfo] with a well-typed
         * [SenderCustomerInfo] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun senderCustomerInfo(senderCustomerInfo: JsonField<SenderCustomerInfo>) = apply {
            this.senderCustomerInfo = senderCustomerInfo
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
         * Returns an immutable instance of [QuoteRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .lockedCurrencyAmount()
         * .lockedCurrencySide()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuoteRequest =
            QuoteRequest(
                checkRequired("destination", destination),
                checkRequired("lockedCurrencyAmount", lockedCurrencyAmount),
                checkRequired("lockedCurrencySide", lockedCurrencySide),
                checkRequired("source", source),
                description,
                immediatelyExecute,
                lookupId,
                purposeOfPayment,
                senderCustomerInfo,
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
    fun validate(): QuoteRequest = apply {
        if (validated) {
            return@apply
        }

        lockedCurrencyAmount()
        lockedCurrencySide().validate()
        description()
        immediatelyExecute()
        lookupId()
        purposeOfPayment()?.validate()
        senderCustomerInfo()?.validate()
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
        (if (lockedCurrencyAmount.asKnown() == null) 0 else 1) +
            (lockedCurrencySide.asKnown()?.validity() ?: 0) +
            (if (description.asKnown() == null) 0 else 1) +
            (if (immediatelyExecute.asKnown() == null) 0 else 1) +
            (if (lookupId.asKnown() == null) 0 else 1) +
            (purposeOfPayment.asKnown()?.validity() ?: 0) +
            (senderCustomerInfo.asKnown()?.validity() ?: 0)

    /**
     * The purpose of the payment. This may be required when sending to certain geographies (e.g.
     * India).
     */
    class PurposeOfPayment @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val GIFT = of("GIFT")

            val SELF = of("SELF")

            val GOODS_OR_SERVICES = of("GOODS_OR_SERVICES")

            val EDUCATION = of("EDUCATION")

            val HEALTH_OR_MEDICAL = of("HEALTH_OR_MEDICAL")

            val REAL_ESTATE_PURCHASE = of("REAL_ESTATE_PURCHASE")

            val TAX_PAYMENT = of("TAX_PAYMENT")

            val LOAN_PAYMENT = of("LOAN_PAYMENT")

            val UTILITY_BILL = of("UTILITY_BILL")

            val DONATION = of("DONATION")

            val TRAVEL = of("TRAVEL")

            val OTHER = of("OTHER")

            fun of(value: String) = PurposeOfPayment(JsonField.of(value))
        }

        /** An enum containing [PurposeOfPayment]'s known values. */
        enum class Known {
            GIFT,
            SELF,
            GOODS_OR_SERVICES,
            EDUCATION,
            HEALTH_OR_MEDICAL,
            REAL_ESTATE_PURCHASE,
            TAX_PAYMENT,
            LOAN_PAYMENT,
            UTILITY_BILL,
            DONATION,
            TRAVEL,
            OTHER,
        }

        /**
         * An enum containing [PurposeOfPayment]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PurposeOfPayment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GIFT,
            SELF,
            GOODS_OR_SERVICES,
            EDUCATION,
            HEALTH_OR_MEDICAL,
            REAL_ESTATE_PURCHASE,
            TAX_PAYMENT,
            LOAN_PAYMENT,
            UTILITY_BILL,
            DONATION,
            TRAVEL,
            OTHER,
            /**
             * An enum member indicating that [PurposeOfPayment] was instantiated with an unknown
             * value.
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
                GIFT -> Value.GIFT
                SELF -> Value.SELF
                GOODS_OR_SERVICES -> Value.GOODS_OR_SERVICES
                EDUCATION -> Value.EDUCATION
                HEALTH_OR_MEDICAL -> Value.HEALTH_OR_MEDICAL
                REAL_ESTATE_PURCHASE -> Value.REAL_ESTATE_PURCHASE
                TAX_PAYMENT -> Value.TAX_PAYMENT
                LOAN_PAYMENT -> Value.LOAN_PAYMENT
                UTILITY_BILL -> Value.UTILITY_BILL
                DONATION -> Value.DONATION
                TRAVEL -> Value.TRAVEL
                OTHER -> Value.OTHER
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
                GIFT -> Known.GIFT
                SELF -> Known.SELF
                GOODS_OR_SERVICES -> Known.GOODS_OR_SERVICES
                EDUCATION -> Known.EDUCATION
                HEALTH_OR_MEDICAL -> Known.HEALTH_OR_MEDICAL
                REAL_ESTATE_PURCHASE -> Known.REAL_ESTATE_PURCHASE
                TAX_PAYMENT -> Known.TAX_PAYMENT
                LOAN_PAYMENT -> Known.LOAN_PAYMENT
                UTILITY_BILL -> Known.UTILITY_BILL
                DONATION -> Known.DONATION
                TRAVEL -> Known.TRAVEL
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown PurposeOfPayment: $value")
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
        fun validate(): PurposeOfPayment = apply {
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

            return other is PurposeOfPayment && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Key-value pairs of additional information about the sender which was requested by the
     * destination. This is relevant when the destination requires more sender info than was
     * provided during customer creation. Any fields specified in `requiredPayerDataFields` from the
     * response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
     * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be provided
     * here if they were requested. If the destination did not request any additional information,
     * this field can be omitted.
     */
    class SenderCustomerInfo
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [SenderCustomerInfo]. */
            fun builder() = Builder()
        }

        /** A builder for [SenderCustomerInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(senderCustomerInfo: SenderCustomerInfo) = apply {
                additionalProperties = senderCustomerInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SenderCustomerInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SenderCustomerInfo = SenderCustomerInfo(additionalProperties.toImmutable())
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
        fun validate(): SenderCustomerInfo = apply {
            if (validated) {
                return@apply
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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SenderCustomerInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SenderCustomerInfo{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteRequest &&
            destination == other.destination &&
            lockedCurrencyAmount == other.lockedCurrencyAmount &&
            lockedCurrencySide == other.lockedCurrencySide &&
            source == other.source &&
            description == other.description &&
            immediatelyExecute == other.immediatelyExecute &&
            lookupId == other.lookupId &&
            purposeOfPayment == other.purposeOfPayment &&
            senderCustomerInfo == other.senderCustomerInfo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            destination,
            lockedCurrencyAmount,
            lockedCurrencySide,
            source,
            description,
            immediatelyExecute,
            lookupId,
            purposeOfPayment,
            senderCustomerInfo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "QuoteRequest{destination=$destination, lockedCurrencyAmount=$lockedCurrencyAmount, lockedCurrencySide=$lockedCurrencySide, source=$source, description=$description, immediatelyExecute=$immediatelyExecute, lookupId=$lookupId, purposeOfPayment=$purposeOfPayment, senderCustomerInfo=$senderCustomerInfo, additionalProperties=$additionalProperties}"
}
