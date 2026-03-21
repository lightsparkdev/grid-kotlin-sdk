// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

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
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Additional information required for business entities */
class BusinessInfo
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val legalName: JsonField<String>,
    private val businessType: JsonField<BusinessType>,
    private val countriesOfOperation: JsonField<List<String>>,
    private val country: JsonField<String>,
    private val doingBusinessAs: JsonField<String>,
    private val entityType: JsonField<EntityType>,
    private val expectedMonthlyTransactionCount: JsonField<String>,
    private val expectedMonthlyTransactionVolume: JsonField<String>,
    private val expectedRecipientJurisdictions: JsonField<List<String>>,
    private val incorporatedOn: JsonField<LocalDate>,
    private val purposeOfAccount: JsonField<String>,
    private val registrationNumber: JsonField<String>,
    private val sourceOfFunds: JsonField<String>,
    private val taxId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("legalName") @ExcludeMissing legalName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("businessType")
        @ExcludeMissing
        businessType: JsonField<BusinessType> = JsonMissing.of(),
        @JsonProperty("countriesOfOperation")
        @ExcludeMissing
        countriesOfOperation: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("country") @ExcludeMissing country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("doingBusinessAs")
        @ExcludeMissing
        doingBusinessAs: JsonField<String> = JsonMissing.of(),
        @JsonProperty("entityType")
        @ExcludeMissing
        entityType: JsonField<EntityType> = JsonMissing.of(),
        @JsonProperty("expectedMonthlyTransactionCount")
        @ExcludeMissing
        expectedMonthlyTransactionCount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expectedMonthlyTransactionVolume")
        @ExcludeMissing
        expectedMonthlyTransactionVolume: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expectedRecipientJurisdictions")
        @ExcludeMissing
        expectedRecipientJurisdictions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("incorporatedOn")
        @ExcludeMissing
        incorporatedOn: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("purposeOfAccount")
        @ExcludeMissing
        purposeOfAccount: JsonField<String> = JsonMissing.of(),
        @JsonProperty("registrationNumber")
        @ExcludeMissing
        registrationNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceOfFunds")
        @ExcludeMissing
        sourceOfFunds: JsonField<String> = JsonMissing.of(),
        @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
    ) : this(
        legalName,
        businessType,
        countriesOfOperation,
        country,
        doingBusinessAs,
        entityType,
        expectedMonthlyTransactionCount,
        expectedMonthlyTransactionVolume,
        expectedRecipientJurisdictions,
        incorporatedOn,
        purposeOfAccount,
        registrationNumber,
        sourceOfFunds,
        taxId,
        mutableMapOf(),
    )

    /**
     * Legal name of the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun legalName(): String = legalName.getRequired("legalName")

    /**
     * The high-level industry category of the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun businessType(): BusinessType? = businessType.getNullable("businessType")

    /**
     * List of countries where the business operates (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun countriesOfOperation(): List<String>? =
        countriesOfOperation.getNullable("countriesOfOperation")

    /**
     * Country of incorporation or registration (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun country(): String? = country.getNullable("country")

    /**
     * Trade name or DBA name of the business, if different from the legal name
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun doingBusinessAs(): String? = doingBusinessAs.getNullable("doingBusinessAs")

    /**
     * Legal entity type of the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun entityType(): EntityType? = entityType.getNullable("entityType")

    /**
     * Expected number of transactions per month
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedMonthlyTransactionCount(): String? =
        expectedMonthlyTransactionCount.getNullable("expectedMonthlyTransactionCount")

    /**
     * Expected total transaction volume per month in USD equivalent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedMonthlyTransactionVolume(): String? =
        expectedMonthlyTransactionVolume.getNullable("expectedMonthlyTransactionVolume")

    /**
     * List of countries where the business expects to send payments (ISO 3166-1 alpha-2)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedRecipientJurisdictions(): List<String>? =
        expectedRecipientJurisdictions.getNullable("expectedRecipientJurisdictions")

    /**
     * Date of incorporation in ISO 8601 format (YYYY-MM-DD)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun incorporatedOn(): LocalDate? = incorporatedOn.getNullable("incorporatedOn")

    /**
     * The intended purpose for using the Grid account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purposeOfAccount(): String? = purposeOfAccount.getNullable("purposeOfAccount")

    /**
     * Business registration number
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun registrationNumber(): String? = registrationNumber.getNullable("registrationNumber")

    /**
     * The primary source of funds for the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sourceOfFunds(): String? = sourceOfFunds.getNullable("sourceOfFunds")

    /**
     * Tax identification number
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun taxId(): String? = taxId.getNullable("taxId")

    /**
     * Returns the raw JSON value of [legalName].
     *
     * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("legalName") @ExcludeMissing fun _legalName(): JsonField<String> = legalName

    /**
     * Returns the raw JSON value of [businessType].
     *
     * Unlike [businessType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("businessType")
    @ExcludeMissing
    fun _businessType(): JsonField<BusinessType> = businessType

    /**
     * Returns the raw JSON value of [countriesOfOperation].
     *
     * Unlike [countriesOfOperation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("countriesOfOperation")
    @ExcludeMissing
    fun _countriesOfOperation(): JsonField<List<String>> = countriesOfOperation

    /**
     * Returns the raw JSON value of [country].
     *
     * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

    /**
     * Returns the raw JSON value of [doingBusinessAs].
     *
     * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("doingBusinessAs")
    @ExcludeMissing
    fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

    /**
     * Returns the raw JSON value of [entityType].
     *
     * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("entityType")
    @ExcludeMissing
    fun _entityType(): JsonField<EntityType> = entityType

    /**
     * Returns the raw JSON value of [expectedMonthlyTransactionCount].
     *
     * Unlike [expectedMonthlyTransactionCount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expectedMonthlyTransactionCount")
    @ExcludeMissing
    fun _expectedMonthlyTransactionCount(): JsonField<String> = expectedMonthlyTransactionCount

    /**
     * Returns the raw JSON value of [expectedMonthlyTransactionVolume].
     *
     * Unlike [expectedMonthlyTransactionVolume], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expectedMonthlyTransactionVolume")
    @ExcludeMissing
    fun _expectedMonthlyTransactionVolume(): JsonField<String> = expectedMonthlyTransactionVolume

    /**
     * Returns the raw JSON value of [expectedRecipientJurisdictions].
     *
     * Unlike [expectedRecipientJurisdictions], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expectedRecipientJurisdictions")
    @ExcludeMissing
    fun _expectedRecipientJurisdictions(): JsonField<List<String>> = expectedRecipientJurisdictions

    /**
     * Returns the raw JSON value of [incorporatedOn].
     *
     * Unlike [incorporatedOn], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("incorporatedOn")
    @ExcludeMissing
    fun _incorporatedOn(): JsonField<LocalDate> = incorporatedOn

    /**
     * Returns the raw JSON value of [purposeOfAccount].
     *
     * Unlike [purposeOfAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("purposeOfAccount")
    @ExcludeMissing
    fun _purposeOfAccount(): JsonField<String> = purposeOfAccount

    /**
     * Returns the raw JSON value of [registrationNumber].
     *
     * Unlike [registrationNumber], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("registrationNumber")
    @ExcludeMissing
    fun _registrationNumber(): JsonField<String> = registrationNumber

    /**
     * Returns the raw JSON value of [sourceOfFunds].
     *
     * Unlike [sourceOfFunds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sourceOfFunds")
    @ExcludeMissing
    fun _sourceOfFunds(): JsonField<String> = sourceOfFunds

    /**
     * Returns the raw JSON value of [taxId].
     *
     * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
         * Returns a mutable builder for constructing an instance of [BusinessInfo].
         *
         * The following fields are required:
         * ```kotlin
         * .legalName()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BusinessInfo]. */
    class Builder internal constructor() {

        private var legalName: JsonField<String>? = null
        private var businessType: JsonField<BusinessType> = JsonMissing.of()
        private var countriesOfOperation: JsonField<MutableList<String>>? = null
        private var country: JsonField<String> = JsonMissing.of()
        private var doingBusinessAs: JsonField<String> = JsonMissing.of()
        private var entityType: JsonField<EntityType> = JsonMissing.of()
        private var expectedMonthlyTransactionCount: JsonField<String> = JsonMissing.of()
        private var expectedMonthlyTransactionVolume: JsonField<String> = JsonMissing.of()
        private var expectedRecipientJurisdictions: JsonField<MutableList<String>>? = null
        private var incorporatedOn: JsonField<LocalDate> = JsonMissing.of()
        private var purposeOfAccount: JsonField<String> = JsonMissing.of()
        private var registrationNumber: JsonField<String> = JsonMissing.of()
        private var sourceOfFunds: JsonField<String> = JsonMissing.of()
        private var taxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(businessInfo: BusinessInfo) = apply {
            legalName = businessInfo.legalName
            businessType = businessInfo.businessType
            countriesOfOperation = businessInfo.countriesOfOperation.map { it.toMutableList() }
            country = businessInfo.country
            doingBusinessAs = businessInfo.doingBusinessAs
            entityType = businessInfo.entityType
            expectedMonthlyTransactionCount = businessInfo.expectedMonthlyTransactionCount
            expectedMonthlyTransactionVolume = businessInfo.expectedMonthlyTransactionVolume
            expectedRecipientJurisdictions =
                businessInfo.expectedRecipientJurisdictions.map { it.toMutableList() }
            incorporatedOn = businessInfo.incorporatedOn
            purposeOfAccount = businessInfo.purposeOfAccount
            registrationNumber = businessInfo.registrationNumber
            sourceOfFunds = businessInfo.sourceOfFunds
            taxId = businessInfo.taxId
            additionalProperties = businessInfo.additionalProperties.toMutableMap()
        }

        /** Legal name of the business */
        fun legalName(legalName: String) = legalName(JsonField.of(legalName))

        /**
         * Sets [Builder.legalName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.legalName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

        /** The high-level industry category of the business */
        fun businessType(businessType: BusinessType) = businessType(JsonField.of(businessType))

        /**
         * Sets [Builder.businessType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.businessType] with a well-typed [BusinessType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun businessType(businessType: JsonField<BusinessType>) = apply {
            this.businessType = businessType
        }

        /** List of countries where the business operates (ISO 3166-1 alpha-2) */
        fun countriesOfOperation(countriesOfOperation: List<String>) =
            countriesOfOperation(JsonField.of(countriesOfOperation))

        /**
         * Sets [Builder.countriesOfOperation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countriesOfOperation] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun countriesOfOperation(countriesOfOperation: JsonField<List<String>>) = apply {
            this.countriesOfOperation = countriesOfOperation.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.countriesOfOperation].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCountriesOfOperation(countriesOfOperation: String) = apply {
            this.countriesOfOperation =
                (this.countriesOfOperation ?: JsonField.of(mutableListOf())).also {
                    checkKnown("countriesOfOperation", it).add(countriesOfOperation)
                }
        }

        /** Country of incorporation or registration (ISO 3166-1 alpha-2) */
        fun country(country: String) = country(JsonField.of(country))

        /**
         * Sets [Builder.country] to an arbitrary JSON value.
         *
         * You should usually call [Builder.country] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun country(country: JsonField<String>) = apply { this.country = country }

        /** Trade name or DBA name of the business, if different from the legal name */
        fun doingBusinessAs(doingBusinessAs: String) =
            doingBusinessAs(JsonField.of(doingBusinessAs))

        /**
         * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.doingBusinessAs] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
            this.doingBusinessAs = doingBusinessAs
        }

        /** Legal entity type of the business */
        fun entityType(entityType: EntityType) = entityType(JsonField.of(entityType))

        /**
         * Sets [Builder.entityType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityType] with a well-typed [EntityType] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun entityType(entityType: JsonField<EntityType>) = apply { this.entityType = entityType }

        /** Expected number of transactions per month */
        fun expectedMonthlyTransactionCount(expectedMonthlyTransactionCount: String) =
            expectedMonthlyTransactionCount(JsonField.of(expectedMonthlyTransactionCount))

        /**
         * Sets [Builder.expectedMonthlyTransactionCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedMonthlyTransactionCount] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun expectedMonthlyTransactionCount(expectedMonthlyTransactionCount: JsonField<String>) =
            apply {
                this.expectedMonthlyTransactionCount = expectedMonthlyTransactionCount
            }

        /** Expected total transaction volume per month in USD equivalent */
        fun expectedMonthlyTransactionVolume(expectedMonthlyTransactionVolume: String) =
            expectedMonthlyTransactionVolume(JsonField.of(expectedMonthlyTransactionVolume))

        /**
         * Sets [Builder.expectedMonthlyTransactionVolume] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedMonthlyTransactionVolume] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun expectedMonthlyTransactionVolume(expectedMonthlyTransactionVolume: JsonField<String>) =
            apply {
                this.expectedMonthlyTransactionVolume = expectedMonthlyTransactionVolume
            }

        /** List of countries where the business expects to send payments (ISO 3166-1 alpha-2) */
        fun expectedRecipientJurisdictions(expectedRecipientJurisdictions: List<String>) =
            expectedRecipientJurisdictions(JsonField.of(expectedRecipientJurisdictions))

        /**
         * Sets [Builder.expectedRecipientJurisdictions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedRecipientJurisdictions] with a well-typed
         * `List<String>` value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun expectedRecipientJurisdictions(
            expectedRecipientJurisdictions: JsonField<List<String>>
        ) = apply {
            this.expectedRecipientJurisdictions =
                expectedRecipientJurisdictions.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [expectedRecipientJurisdictions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addExpectedRecipientJurisdiction(expectedRecipientJurisdiction: String) = apply {
            expectedRecipientJurisdictions =
                (expectedRecipientJurisdictions ?: JsonField.of(mutableListOf())).also {
                    checkKnown("expectedRecipientJurisdictions", it)
                        .add(expectedRecipientJurisdiction)
                }
        }

        /** Date of incorporation in ISO 8601 format (YYYY-MM-DD) */
        fun incorporatedOn(incorporatedOn: LocalDate) = incorporatedOn(JsonField.of(incorporatedOn))

        /**
         * Sets [Builder.incorporatedOn] to an arbitrary JSON value.
         *
         * You should usually call [Builder.incorporatedOn] with a well-typed [LocalDate] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun incorporatedOn(incorporatedOn: JsonField<LocalDate>) = apply {
            this.incorporatedOn = incorporatedOn
        }

        /** The intended purpose for using the Grid account */
        fun purposeOfAccount(purposeOfAccount: String) =
            purposeOfAccount(JsonField.of(purposeOfAccount))

        /**
         * Sets [Builder.purposeOfAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purposeOfAccount] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun purposeOfAccount(purposeOfAccount: JsonField<String>) = apply {
            this.purposeOfAccount = purposeOfAccount
        }

        /** Business registration number */
        fun registrationNumber(registrationNumber: String) =
            registrationNumber(JsonField.of(registrationNumber))

        /**
         * Sets [Builder.registrationNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.registrationNumber] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun registrationNumber(registrationNumber: JsonField<String>) = apply {
            this.registrationNumber = registrationNumber
        }

        /** The primary source of funds for the business */
        fun sourceOfFunds(sourceOfFunds: String) = sourceOfFunds(JsonField.of(sourceOfFunds))

        /**
         * Sets [Builder.sourceOfFunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfFunds] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sourceOfFunds(sourceOfFunds: JsonField<String>) = apply {
            this.sourceOfFunds = sourceOfFunds
        }

        /** Tax identification number */
        fun taxId(taxId: String) = taxId(JsonField.of(taxId))

        /**
         * Sets [Builder.taxId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.taxId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
         * Returns an immutable instance of [BusinessInfo].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .legalName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BusinessInfo =
            BusinessInfo(
                checkRequired("legalName", legalName),
                businessType,
                (countriesOfOperation ?: JsonMissing.of()).map { it.toImmutable() },
                country,
                doingBusinessAs,
                entityType,
                expectedMonthlyTransactionCount,
                expectedMonthlyTransactionVolume,
                (expectedRecipientJurisdictions ?: JsonMissing.of()).map { it.toImmutable() },
                incorporatedOn,
                purposeOfAccount,
                registrationNumber,
                sourceOfFunds,
                taxId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BusinessInfo = apply {
        if (validated) {
            return@apply
        }

        legalName()
        businessType()?.validate()
        countriesOfOperation()
        country()
        doingBusinessAs()
        entityType()?.validate()
        expectedMonthlyTransactionCount()
        expectedMonthlyTransactionVolume()
        expectedRecipientJurisdictions()
        incorporatedOn()
        purposeOfAccount()
        registrationNumber()
        sourceOfFunds()
        taxId()
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
        (if (legalName.asKnown() == null) 0 else 1) +
            (businessType.asKnown()?.validity() ?: 0) +
            (countriesOfOperation.asKnown()?.size ?: 0) +
            (if (country.asKnown() == null) 0 else 1) +
            (if (doingBusinessAs.asKnown() == null) 0 else 1) +
            (entityType.asKnown()?.validity() ?: 0) +
            (if (expectedMonthlyTransactionCount.asKnown() == null) 0 else 1) +
            (if (expectedMonthlyTransactionVolume.asKnown() == null) 0 else 1) +
            (expectedRecipientJurisdictions.asKnown()?.size ?: 0) +
            (if (incorporatedOn.asKnown() == null) 0 else 1) +
            (if (purposeOfAccount.asKnown() == null) 0 else 1) +
            (if (registrationNumber.asKnown() == null) 0 else 1) +
            (if (sourceOfFunds.asKnown() == null) 0 else 1) +
            (if (taxId.asKnown() == null) 0 else 1)

    /** The high-level industry category of the business */
    class BusinessType @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val AGRICULTURE_FORESTRY_FISHING_AND_HUNTING =
                of("AGRICULTURE_FORESTRY_FISHING_AND_HUNTING")

            val MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION =
                of("MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION")

            val UTILITIES = of("UTILITIES")

            val CONSTRUCTION = of("CONSTRUCTION")

            val MANUFACTURING = of("MANUFACTURING")

            val WHOLESALE_TRADE = of("WHOLESALE_TRADE")

            val RETAIL_TRADE = of("RETAIL_TRADE")

            val TRANSPORTATION_AND_WAREHOUSING = of("TRANSPORTATION_AND_WAREHOUSING")

            val INFORMATION = of("INFORMATION")

            val FINANCE_AND_INSURANCE = of("FINANCE_AND_INSURANCE")

            val REAL_ESTATE_AND_RENTAL_AND_LEASING = of("REAL_ESTATE_AND_RENTAL_AND_LEASING")

            val PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES =
                of("PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES")

            val MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES =
                of("MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES")

            val ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES =
                of("ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES")

            val EDUCATIONAL_SERVICES = of("EDUCATIONAL_SERVICES")

            val HEALTH_CARE_AND_SOCIAL_ASSISTANCE = of("HEALTH_CARE_AND_SOCIAL_ASSISTANCE")

            val ARTS_ENTERTAINMENT_AND_RECREATION = of("ARTS_ENTERTAINMENT_AND_RECREATION")

            val ACCOMMODATION_AND_FOOD_SERVICES = of("ACCOMMODATION_AND_FOOD_SERVICES")

            val OTHER_SERVICES = of("OTHER_SERVICES")

            val PUBLIC_ADMINISTRATION = of("PUBLIC_ADMINISTRATION")

            fun of(value: String) = BusinessType(JsonField.of(value))
        }

        /** An enum containing [BusinessType]'s known values. */
        enum class Known {
            AGRICULTURE_FORESTRY_FISHING_AND_HUNTING,
            MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION,
            UTILITIES,
            CONSTRUCTION,
            MANUFACTURING,
            WHOLESALE_TRADE,
            RETAIL_TRADE,
            TRANSPORTATION_AND_WAREHOUSING,
            INFORMATION,
            FINANCE_AND_INSURANCE,
            REAL_ESTATE_AND_RENTAL_AND_LEASING,
            PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES,
            MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES,
            ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES,
            EDUCATIONAL_SERVICES,
            HEALTH_CARE_AND_SOCIAL_ASSISTANCE,
            ARTS_ENTERTAINMENT_AND_RECREATION,
            ACCOMMODATION_AND_FOOD_SERVICES,
            OTHER_SERVICES,
            PUBLIC_ADMINISTRATION,
        }

        /**
         * An enum containing [BusinessType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BusinessType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AGRICULTURE_FORESTRY_FISHING_AND_HUNTING,
            MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION,
            UTILITIES,
            CONSTRUCTION,
            MANUFACTURING,
            WHOLESALE_TRADE,
            RETAIL_TRADE,
            TRANSPORTATION_AND_WAREHOUSING,
            INFORMATION,
            FINANCE_AND_INSURANCE,
            REAL_ESTATE_AND_RENTAL_AND_LEASING,
            PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES,
            MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES,
            ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES,
            EDUCATIONAL_SERVICES,
            HEALTH_CARE_AND_SOCIAL_ASSISTANCE,
            ARTS_ENTERTAINMENT_AND_RECREATION,
            ACCOMMODATION_AND_FOOD_SERVICES,
            OTHER_SERVICES,
            PUBLIC_ADMINISTRATION,
            /**
             * An enum member indicating that [BusinessType] was instantiated with an unknown value.
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
                AGRICULTURE_FORESTRY_FISHING_AND_HUNTING ->
                    Value.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION ->
                    Value.MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION
                UTILITIES -> Value.UTILITIES
                CONSTRUCTION -> Value.CONSTRUCTION
                MANUFACTURING -> Value.MANUFACTURING
                WHOLESALE_TRADE -> Value.WHOLESALE_TRADE
                RETAIL_TRADE -> Value.RETAIL_TRADE
                TRANSPORTATION_AND_WAREHOUSING -> Value.TRANSPORTATION_AND_WAREHOUSING
                INFORMATION -> Value.INFORMATION
                FINANCE_AND_INSURANCE -> Value.FINANCE_AND_INSURANCE
                REAL_ESTATE_AND_RENTAL_AND_LEASING -> Value.REAL_ESTATE_AND_RENTAL_AND_LEASING
                PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES ->
                    Value.PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES
                MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES ->
                    Value.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
                ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES ->
                    Value.ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
                EDUCATIONAL_SERVICES -> Value.EDUCATIONAL_SERVICES
                HEALTH_CARE_AND_SOCIAL_ASSISTANCE -> Value.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
                ARTS_ENTERTAINMENT_AND_RECREATION -> Value.ARTS_ENTERTAINMENT_AND_RECREATION
                ACCOMMODATION_AND_FOOD_SERVICES -> Value.ACCOMMODATION_AND_FOOD_SERVICES
                OTHER_SERVICES -> Value.OTHER_SERVICES
                PUBLIC_ADMINISTRATION -> Value.PUBLIC_ADMINISTRATION
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
                AGRICULTURE_FORESTRY_FISHING_AND_HUNTING ->
                    Known.AGRICULTURE_FORESTRY_FISHING_AND_HUNTING
                MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION ->
                    Known.MINING_QUARRYING_AND_OIL_AND_GAS_EXTRACTION
                UTILITIES -> Known.UTILITIES
                CONSTRUCTION -> Known.CONSTRUCTION
                MANUFACTURING -> Known.MANUFACTURING
                WHOLESALE_TRADE -> Known.WHOLESALE_TRADE
                RETAIL_TRADE -> Known.RETAIL_TRADE
                TRANSPORTATION_AND_WAREHOUSING -> Known.TRANSPORTATION_AND_WAREHOUSING
                INFORMATION -> Known.INFORMATION
                FINANCE_AND_INSURANCE -> Known.FINANCE_AND_INSURANCE
                REAL_ESTATE_AND_RENTAL_AND_LEASING -> Known.REAL_ESTATE_AND_RENTAL_AND_LEASING
                PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES ->
                    Known.PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES
                MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES ->
                    Known.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
                ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES ->
                    Known.ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
                EDUCATIONAL_SERVICES -> Known.EDUCATIONAL_SERVICES
                HEALTH_CARE_AND_SOCIAL_ASSISTANCE -> Known.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
                ARTS_ENTERTAINMENT_AND_RECREATION -> Known.ARTS_ENTERTAINMENT_AND_RECREATION
                ACCOMMODATION_AND_FOOD_SERVICES -> Known.ACCOMMODATION_AND_FOOD_SERVICES
                OTHER_SERVICES -> Known.OTHER_SERVICES
                PUBLIC_ADMINISTRATION -> Known.PUBLIC_ADMINISTRATION
                else -> throw LightsparkGridInvalidDataException("Unknown BusinessType: $value")
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

        fun validate(): BusinessType = apply {
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

            return other is BusinessType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Legal entity type of the business */
    class EntityType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SOLE_PROPRIETORSHIP = of("SOLE_PROPRIETORSHIP")

            val PARTNERSHIP = of("PARTNERSHIP")

            val LLC = of("LLC")

            val CORPORATION = of("CORPORATION")

            val S_CORPORATION = of("S_CORPORATION")

            val NON_PROFIT = of("NON_PROFIT")

            val OTHER = of("OTHER")

            fun of(value: String) = EntityType(JsonField.of(value))
        }

        /** An enum containing [EntityType]'s known values. */
        enum class Known {
            SOLE_PROPRIETORSHIP,
            PARTNERSHIP,
            LLC,
            CORPORATION,
            S_CORPORATION,
            NON_PROFIT,
            OTHER,
        }

        /**
         * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EntityType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SOLE_PROPRIETORSHIP,
            PARTNERSHIP,
            LLC,
            CORPORATION,
            S_CORPORATION,
            NON_PROFIT,
            OTHER,
            /**
             * An enum member indicating that [EntityType] was instantiated with an unknown value.
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
                SOLE_PROPRIETORSHIP -> Value.SOLE_PROPRIETORSHIP
                PARTNERSHIP -> Value.PARTNERSHIP
                LLC -> Value.LLC
                CORPORATION -> Value.CORPORATION
                S_CORPORATION -> Value.S_CORPORATION
                NON_PROFIT -> Value.NON_PROFIT
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
                SOLE_PROPRIETORSHIP -> Known.SOLE_PROPRIETORSHIP
                PARTNERSHIP -> Known.PARTNERSHIP
                LLC -> Known.LLC
                CORPORATION -> Known.CORPORATION
                S_CORPORATION -> Known.S_CORPORATION
                NON_PROFIT -> Known.NON_PROFIT
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown EntityType: $value")
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

        fun validate(): EntityType = apply {
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

            return other is EntityType && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BusinessInfo &&
            legalName == other.legalName &&
            businessType == other.businessType &&
            countriesOfOperation == other.countriesOfOperation &&
            country == other.country &&
            doingBusinessAs == other.doingBusinessAs &&
            entityType == other.entityType &&
            expectedMonthlyTransactionCount == other.expectedMonthlyTransactionCount &&
            expectedMonthlyTransactionVolume == other.expectedMonthlyTransactionVolume &&
            expectedRecipientJurisdictions == other.expectedRecipientJurisdictions &&
            incorporatedOn == other.incorporatedOn &&
            purposeOfAccount == other.purposeOfAccount &&
            registrationNumber == other.registrationNumber &&
            sourceOfFunds == other.sourceOfFunds &&
            taxId == other.taxId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            legalName,
            businessType,
            countriesOfOperation,
            country,
            doingBusinessAs,
            entityType,
            expectedMonthlyTransactionCount,
            expectedMonthlyTransactionVolume,
            expectedRecipientJurisdictions,
            incorporatedOn,
            purposeOfAccount,
            registrationNumber,
            sourceOfFunds,
            taxId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BusinessInfo{legalName=$legalName, businessType=$businessType, countriesOfOperation=$countriesOfOperation, country=$country, doingBusinessAs=$doingBusinessAs, entityType=$entityType, expectedMonthlyTransactionCount=$expectedMonthlyTransactionCount, expectedMonthlyTransactionVolume=$expectedMonthlyTransactionVolume, expectedRecipientJurisdictions=$expectedRecipientJurisdictions, incorporatedOn=$incorporatedOn, purposeOfAccount=$purposeOfAccount, registrationNumber=$registrationNumber, sourceOfFunds=$sourceOfFunds, taxId=$taxId, additionalProperties=$additionalProperties}"
}
