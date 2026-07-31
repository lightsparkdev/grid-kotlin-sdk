// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

class UsdAccountInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountNumber: JsonField<String>,
    private val accountType: JsonField<AccountType>,
    private val paymentRails: JsonField<List<PaymentRail>>,
    private val routingNumber: JsonField<String>,
    private val bankAccountType: JsonField<BankAccountType>,
    private val bankName: JsonField<String>,
    private val fiToFiInformation: JsonField<String>,
    private val intermediaryBankName: JsonField<String>,
    private val intermediaryRoutingNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountNumber")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("accountType")
        @ExcludeMissing
        accountType: JsonField<AccountType> = JsonMissing.of(),
        @JsonProperty("paymentRails")
        @ExcludeMissing
        paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
        @JsonProperty("routingNumber")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("bankAccountType")
        @ExcludeMissing
        bankAccountType: JsonField<BankAccountType> = JsonMissing.of(),
        @JsonProperty("bankName") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiToFiInformation")
        @ExcludeMissing
        fiToFiInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intermediaryBankName")
        @ExcludeMissing
        intermediaryBankName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("intermediaryRoutingNumber")
        @ExcludeMissing
        intermediaryRoutingNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountNumber,
        accountType,
        paymentRails,
        routingNumber,
        bankAccountType,
        bankName,
        fiToFiInformation,
        intermediaryBankName,
        intermediaryRoutingNumber,
        mutableMapOf(),
    )

    /**
     * The account number of the bank
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("accountNumber")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountType(): AccountType = accountType.getRequired("accountType")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

    /**
     * The ABA routing number
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = routingNumber.getRequired("routingNumber")

    /**
     * Whether the account is a checking or a savings account. Optional on every rail; when omitted,
     * the account is treated as a checking account.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankAccountType(): BankAccountType? = bankAccountType.getNullable("bankAccountType")

    /**
     * The name of the financial institution holding the account. Optional on every rail, and
     * recommended for wires, where it identifies the beneficiary's institution on the payment
     * message.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun bankName(): String? = bankName.getNullable("bankName")

    /**
     * Bank-to-bank instructions carried alongside the payment. Used on the WIRE rail; ignored on
     * ACH, RTP and FEDNOW.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fiToFiInformation(): String? = fiToFiInformation.getNullable("fiToFiInformation")

    /**
     * The name of the intermediary financial institution, for accounts reachable only through a
     * correspondent bank. Used on the WIRE rail; ignored on ACH, RTP and FEDNOW.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun intermediaryBankName(): String? = intermediaryBankName.getNullable("intermediaryBankName")

    /**
     * The ABA routing number of the intermediary financial institution. Used on the WIRE rail;
     * ignored on ACH, RTP and FEDNOW.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun intermediaryRoutingNumber(): String? =
        intermediaryRoutingNumber.getNullable("intermediaryRoutingNumber")

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountNumber")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [accountType].
     *
     * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountType")
    @ExcludeMissing
    fun _accountType(): JsonField<AccountType> = accountType

    /**
     * Returns the raw JSON value of [paymentRails].
     *
     * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("paymentRails")
    @ExcludeMissing
    fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routingNumber")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [bankAccountType].
     *
     * Unlike [bankAccountType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankAccountType")
    @ExcludeMissing
    fun _bankAccountType(): JsonField<BankAccountType> = bankAccountType

    /**
     * Returns the raw JSON value of [bankName].
     *
     * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

    /**
     * Returns the raw JSON value of [fiToFiInformation].
     *
     * Unlike [fiToFiInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fiToFiInformation")
    @ExcludeMissing
    fun _fiToFiInformation(): JsonField<String> = fiToFiInformation

    /**
     * Returns the raw JSON value of [intermediaryBankName].
     *
     * Unlike [intermediaryBankName], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("intermediaryBankName")
    @ExcludeMissing
    fun _intermediaryBankName(): JsonField<String> = intermediaryBankName

    /**
     * Returns the raw JSON value of [intermediaryRoutingNumber].
     *
     * Unlike [intermediaryRoutingNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("intermediaryRoutingNumber")
    @ExcludeMissing
    fun _intermediaryRoutingNumber(): JsonField<String> = intermediaryRoutingNumber

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
         * Returns a mutable builder for constructing an instance of [UsdAccountInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumber()
         * .accountType()
         * .paymentRails()
         * .routingNumber()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [UsdAccountInfo]. */
    class Builder internal constructor() {

        private var accountNumber: JsonField<String>? = null
        private var accountType: JsonField<AccountType>? = null
        private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
        private var routingNumber: JsonField<String>? = null
        private var bankAccountType: JsonField<BankAccountType> = JsonMissing.of()
        private var bankName: JsonField<String> = JsonMissing.of()
        private var fiToFiInformation: JsonField<String> = JsonMissing.of()
        private var intermediaryBankName: JsonField<String> = JsonMissing.of()
        private var intermediaryRoutingNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(usdAccountInfo: UsdAccountInfo) = apply {
            accountNumber = usdAccountInfo.accountNumber
            accountType = usdAccountInfo.accountType
            paymentRails = usdAccountInfo.paymentRails.map { it.toMutableList() }
            routingNumber = usdAccountInfo.routingNumber
            bankAccountType = usdAccountInfo.bankAccountType
            bankName = usdAccountInfo.bankName
            fiToFiInformation = usdAccountInfo.fiToFiInformation
            intermediaryBankName = usdAccountInfo.intermediaryBankName
            intermediaryRoutingNumber = usdAccountInfo.intermediaryRoutingNumber
            additionalProperties = usdAccountInfo.additionalProperties.toMutableMap()
        }

        /** The account number of the bank */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

        /**
         * Sets [Builder.accountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountType] with a well-typed [AccountType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountType(accountType: JsonField<AccountType>) = apply {
            this.accountType = accountType
        }

        fun paymentRails(paymentRails: List<PaymentRail>) = paymentRails(JsonField.of(paymentRails))

        /**
         * Sets [Builder.paymentRails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun paymentRails(paymentRails: JsonField<List<PaymentRail>>) = apply {
            this.paymentRails = paymentRails.map { it.toMutableList() }
        }

        /**
         * Adds a single [PaymentRail] to [paymentRails].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPaymentRail(paymentRail: PaymentRail) = apply {
            paymentRails =
                (paymentRails ?: JsonField.of(mutableListOf())).also {
                    checkKnown("paymentRails", it).add(paymentRail)
                }
        }

        /** The ABA routing number */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * Whether the account is a checking or a savings account. Optional on every rail; when
         * omitted, the account is treated as a checking account.
         */
        fun bankAccountType(bankAccountType: BankAccountType) =
            bankAccountType(JsonField.of(bankAccountType))

        /**
         * Sets [Builder.bankAccountType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankAccountType] with a well-typed [BankAccountType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun bankAccountType(bankAccountType: JsonField<BankAccountType>) = apply {
            this.bankAccountType = bankAccountType
        }

        /**
         * The name of the financial institution holding the account. Optional on every rail, and
         * recommended for wires, where it identifies the beneficiary's institution on the payment
         * message.
         */
        fun bankName(bankName: String) = bankName(JsonField.of(bankName))

        /**
         * Sets [Builder.bankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bankName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

        /**
         * Bank-to-bank instructions carried alongside the payment. Used on the WIRE rail; ignored
         * on ACH, RTP and FEDNOW.
         */
        fun fiToFiInformation(fiToFiInformation: String) =
            fiToFiInformation(JsonField.of(fiToFiInformation))

        /**
         * Sets [Builder.fiToFiInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fiToFiInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fiToFiInformation(fiToFiInformation: JsonField<String>) = apply {
            this.fiToFiInformation = fiToFiInformation
        }

        /**
         * The name of the intermediary financial institution, for accounts reachable only through a
         * correspondent bank. Used on the WIRE rail; ignored on ACH, RTP and FEDNOW.
         */
        fun intermediaryBankName(intermediaryBankName: String) =
            intermediaryBankName(JsonField.of(intermediaryBankName))

        /**
         * Sets [Builder.intermediaryBankName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intermediaryBankName] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun intermediaryBankName(intermediaryBankName: JsonField<String>) = apply {
            this.intermediaryBankName = intermediaryBankName
        }

        /**
         * The ABA routing number of the intermediary financial institution. Used on the WIRE rail;
         * ignored on ACH, RTP and FEDNOW.
         */
        fun intermediaryRoutingNumber(intermediaryRoutingNumber: String) =
            intermediaryRoutingNumber(JsonField.of(intermediaryRoutingNumber))

        /**
         * Sets [Builder.intermediaryRoutingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.intermediaryRoutingNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun intermediaryRoutingNumber(intermediaryRoutingNumber: JsonField<String>) = apply {
            this.intermediaryRoutingNumber = intermediaryRoutingNumber
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
         * Returns an immutable instance of [UsdAccountInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumber()
         * .accountType()
         * .paymentRails()
         * .routingNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UsdAccountInfo =
            UsdAccountInfo(
                checkRequired("accountNumber", accountNumber),
                checkRequired("accountType", accountType),
                checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                checkRequired("routingNumber", routingNumber),
                bankAccountType,
                bankName,
                fiToFiInformation,
                intermediaryBankName,
                intermediaryRoutingNumber,
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
    fun validate(): UsdAccountInfo = apply {
        if (validated) {
            return@apply
        }

        accountNumber()
        accountType().validate()
        paymentRails().forEach { it.validate() }
        routingNumber()
        bankAccountType()?.validate()
        bankName()
        fiToFiInformation()
        intermediaryBankName()
        intermediaryRoutingNumber()
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
        (if (accountNumber.asKnown() == null) 0 else 1) +
            (accountType.asKnown()?.validity() ?: 0) +
            (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (routingNumber.asKnown() == null) 0 else 1) +
            (bankAccountType.asKnown()?.validity() ?: 0) +
            (if (bankName.asKnown() == null) 0 else 1) +
            (if (fiToFiInformation.asKnown() == null) 0 else 1) +
            (if (intermediaryBankName.asKnown() == null) 0 else 1) +
            (if (intermediaryRoutingNumber.asKnown() == null) 0 else 1)

    class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val USD_ACCOUNT = of("USD_ACCOUNT")

            fun of(value: String) = AccountType(JsonField.of(value))
        }

        /** An enum containing [AccountType]'s known values. */
        enum class Known {
            USD_ACCOUNT
        }

        /**
         * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            USD_ACCOUNT,
            /**
             * An enum member indicating that [AccountType] was instantiated with an unknown value.
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
                USD_ACCOUNT -> Value.USD_ACCOUNT
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
                USD_ACCOUNT -> Known.USD_ACCOUNT
                else -> throw LightsparkGridInvalidDataException("Unknown AccountType: $value")
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
        fun validate(): AccountType = apply {
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

            return other is AccountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val ACH = of("ACH")

            val WIRE = of("WIRE")

            val RTP = of("RTP")

            val FEDNOW = of("FEDNOW")

            fun of(value: String) = PaymentRail(JsonField.of(value))
        }

        /** An enum containing [PaymentRail]'s known values. */
        enum class Known {
            ACH,
            WIRE,
            RTP,
            FEDNOW,
        }

        /**
         * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            WIRE,
            RTP,
            FEDNOW,
            /**
             * An enum member indicating that [PaymentRail] was instantiated with an unknown value.
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
                ACH -> Value.ACH
                WIRE -> Value.WIRE
                RTP -> Value.RTP
                FEDNOW -> Value.FEDNOW
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
                ACH -> Known.ACH
                WIRE -> Known.WIRE
                RTP -> Known.RTP
                FEDNOW -> Known.FEDNOW
                else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

    /**
     * Whether the account is a checking or a savings account. Optional on every rail; when omitted,
     * the account is treated as a checking account.
     */
    class BankAccountType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val CHECKING = of("CHECKING")

            val SAVINGS = of("SAVINGS")

            fun of(value: String) = BankAccountType(JsonField.of(value))
        }

        /** An enum containing [BankAccountType]'s known values. */
        enum class Known {
            CHECKING,
            SAVINGS,
        }

        /**
         * An enum containing [BankAccountType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BankAccountType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKING,
            SAVINGS,
            /**
             * An enum member indicating that [BankAccountType] was instantiated with an unknown
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw LightsparkGridInvalidDataException("Unknown BankAccountType: $value")
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
        fun validate(): BankAccountType = apply {
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

            return other is BankAccountType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UsdAccountInfo &&
            accountNumber == other.accountNumber &&
            accountType == other.accountType &&
            paymentRails == other.paymentRails &&
            routingNumber == other.routingNumber &&
            bankAccountType == other.bankAccountType &&
            bankName == other.bankName &&
            fiToFiInformation == other.fiToFiInformation &&
            intermediaryBankName == other.intermediaryBankName &&
            intermediaryRoutingNumber == other.intermediaryRoutingNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountNumber,
            accountType,
            paymentRails,
            routingNumber,
            bankAccountType,
            bankName,
            fiToFiInformation,
            intermediaryBankName,
            intermediaryRoutingNumber,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UsdAccountInfo{accountNumber=$accountNumber, accountType=$accountType, paymentRails=$paymentRails, routingNumber=$routingNumber, bankAccountType=$bankAccountType, bankName=$bankName, fiToFiInformation=$fiToFiInformation, intermediaryBankName=$intermediaryBankName, intermediaryRoutingNumber=$intermediaryRoutingNumber, additionalProperties=$additionalProperties}"
}
