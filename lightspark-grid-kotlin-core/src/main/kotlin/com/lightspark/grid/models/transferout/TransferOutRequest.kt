// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferout

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
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.transferin.InternalAccountReference
import java.util.Collections
import java.util.Objects

class TransferOutRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val destination: JsonField<Destination>,
    private val source: JsonField<InternalAccountReference>,
    private val amount: JsonField<Long>,
    private val purposeOfPayment: JsonField<PurposeOfPayment>,
    private val remittanceInformation: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("destination")
        @ExcludeMissing
        destination: JsonField<Destination> = JsonMissing.of(),
        @JsonProperty("source")
        @ExcludeMissing
        source: JsonField<InternalAccountReference> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("purposeOfPayment")
        @ExcludeMissing
        purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of(),
        @JsonProperty("remittanceInformation")
        @ExcludeMissing
        remittanceInformation: JsonField<String> = JsonMissing.of(),
    ) : this(destination, source, amount, purposeOfPayment, remittanceInformation, mutableMapOf())

    /**
     * Destination external account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): Destination = destination.getRequired("destination")

    /**
     * Source internal account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): InternalAccountReference = source.getRequired("source")

    /**
     * Amount in the smallest unit of the currency (e.g., cents for USD/EUR, satoshis for BTC)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun amount(): Long? = amount.getNullable("amount")

    /**
     * The purpose of the payment. This may be required when sending to certain geographies (e.g.
     * India).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purposeOfPayment(): PurposeOfPayment? = purposeOfPayment.getNullable("purposeOfPayment")

    /**
     * Free-form information about the payment that travels with it to the recipient. The field this
     * populates depends on the payment rail: for ACH it populates the Addenda record, for FedNow
     * and RTP it populates the remittanceInformation field, and for wires it populates the OBI
     * (Originator to Beneficiary Information) / beneficiary information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remittanceInformation(): String? =
        remittanceInformation.getNullable("remittanceInformation")

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("destination")
    @ExcludeMissing
    fun _destination(): JsonField<Destination> = destination

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source")
    @ExcludeMissing
    fun _source(): JsonField<InternalAccountReference> = source

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

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
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("remittanceInformation")
    @ExcludeMissing
    fun _remittanceInformation(): JsonField<String> = remittanceInformation

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
         * Returns a mutable builder for constructing an instance of [TransferOutRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [TransferOutRequest]. */
    class Builder internal constructor() {

        private var destination: JsonField<Destination>? = null
        private var source: JsonField<InternalAccountReference>? = null
        private var amount: JsonField<Long> = JsonMissing.of()
        private var purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transferOutRequest: TransferOutRequest) = apply {
            destination = transferOutRequest.destination
            source = transferOutRequest.source
            amount = transferOutRequest.amount
            purposeOfPayment = transferOutRequest.purposeOfPayment
            remittanceInformation = transferOutRequest.remittanceInformation
            additionalProperties = transferOutRequest.additionalProperties.toMutableMap()
        }

        /** Destination external account details */
        fun destination(destination: Destination) = destination(JsonField.of(destination))

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [Destination] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun destination(destination: JsonField<Destination>) = apply {
            this.destination = destination
        }

        /** Source internal account details */
        fun source(source: InternalAccountReference) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [InternalAccountReference]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun source(source: JsonField<InternalAccountReference>) = apply { this.source = source }

        /**
         * Amount in the smallest unit of the currency (e.g., cents for USD/EUR, satoshis for BTC)
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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
         * Free-form information about the payment that travels with it to the recipient. The field
         * this populates depends on the payment rail: for ACH it populates the Addenda record, for
         * FedNow and RTP it populates the remittanceInformation field, and for wires it populates
         * the OBI (Originator to Beneficiary Information) / beneficiary information.
         */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /**
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
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
         * Returns an immutable instance of [TransferOutRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransferOutRequest =
            TransferOutRequest(
                checkRequired("destination", destination),
                checkRequired("source", source),
                amount,
                purposeOfPayment,
                remittanceInformation,
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
    fun validate(): TransferOutRequest = apply {
        if (validated) {
            return@apply
        }

        destination().validate()
        source().validate()
        amount()
        purposeOfPayment()?.validate()
        remittanceInformation()
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
        (destination.asKnown()?.validity() ?: 0) +
            (source.asKnown()?.validity() ?: 0) +
            (if (amount.asKnown() == null) 0 else 1) +
            (purposeOfPayment.asKnown()?.validity() ?: 0) +
            (if (remittanceInformation.asKnown() == null) 0 else 1)

    /** Destination external account details */
    class Destination
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountId: JsonField<String>,
        private val paymentRail: JsonField<PaymentRail>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountId")
            @ExcludeMissing
            accountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRail")
            @ExcludeMissing
            paymentRail: JsonField<PaymentRail> = JsonMissing.of(),
        ) : this(accountId, paymentRail, mutableMapOf())

        /**
         * Reference to an external account ID
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountId(): String = accountId.getRequired("accountId")

        /**
         * The payment rail to use for the transfer. Must be one of the rails supported by the
         * destination account. If not specified, the system will select a default rail.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun paymentRail(): PaymentRail? = paymentRail.getNullable("paymentRail")

        /**
         * Returns the raw JSON value of [accountId].
         *
         * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * Returns the raw JSON value of [paymentRail].
         *
         * Unlike [paymentRail], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("paymentRail")
        @ExcludeMissing
        fun _paymentRail(): JsonField<PaymentRail> = paymentRail

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
             * Returns a mutable builder for constructing an instance of [Destination].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Destination]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var paymentRail: JsonField<PaymentRail> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(destination: Destination) = apply {
                accountId = destination.accountId
                paymentRail = destination.paymentRail
                additionalProperties = destination.additionalProperties.toMutableMap()
            }

            /** Reference to an external account ID */
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
             * Returns an immutable instance of [Destination].
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
            fun build(): Destination =
                Destination(
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
        fun validate(): Destination = apply {
            if (validated) {
                return@apply
            }

            accountId()
            paymentRail()?.validate()
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
            (if (accountId.asKnown() == null) 0 else 1) + (paymentRail.asKnown()?.validity() ?: 0)

        /**
         * The payment rail to use for the transfer. Must be one of the rails supported by the
         * destination account. If not specified, the system will select a default rail.
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

            return other is Destination &&
                accountId == other.accountId &&
                paymentRail == other.paymentRail &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountId, paymentRail, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Destination{accountId=$accountId, paymentRail=$paymentRail, additionalProperties=$additionalProperties}"
    }

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

            val FAMILY_SUPPORT = of("FAMILY_SUPPORT")

            val SALARY_PAYMENT = of("SALARY_PAYMENT")

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
            FAMILY_SUPPORT,
            SALARY_PAYMENT,
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
            FAMILY_SUPPORT,
            SALARY_PAYMENT,
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
                FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                SALARY_PAYMENT -> Value.SALARY_PAYMENT
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
                FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                SALARY_PAYMENT -> Known.SALARY_PAYMENT
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferOutRequest &&
            destination == other.destination &&
            source == other.source &&
            amount == other.amount &&
            purposeOfPayment == other.purposeOfPayment &&
            remittanceInformation == other.remittanceInformation &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            destination,
            source,
            amount,
            purposeOfPayment,
            remittanceInformation,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransferOutRequest{destination=$destination, source=$source, amount=$amount, purposeOfPayment=$purposeOfPayment, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"
}
