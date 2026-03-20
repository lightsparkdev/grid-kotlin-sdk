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
    private val expectedActivityVolumes: JsonField<ExpectedActivityVolumes>,
    private val expectedRecipientJurisdictions: JsonField<List<String>>,
    private val incorporatedOn: JsonField<LocalDate>,
    private val purposeOfAccount: JsonField<PurposeOfAccount>,
    private val registrationNumber: JsonField<String>,
    private val sourceOfFunds: JsonField<SourceOfFunds>,
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
        @JsonProperty("expectedActivityVolumes")
        @ExcludeMissing
        expectedActivityVolumes: JsonField<ExpectedActivityVolumes> = JsonMissing.of(),
        @JsonProperty("expectedRecipientJurisdictions")
        @ExcludeMissing
        expectedRecipientJurisdictions: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("incorporatedOn")
        @ExcludeMissing
        incorporatedOn: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("purposeOfAccount")
        @ExcludeMissing
        purposeOfAccount: JsonField<PurposeOfAccount> = JsonMissing.of(),
        @JsonProperty("registrationNumber")
        @ExcludeMissing
        registrationNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sourceOfFunds")
        @ExcludeMissing
        sourceOfFunds: JsonField<SourceOfFunds> = JsonMissing.of(),
        @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
    ) : this(
        legalName,
        businessType,
        countriesOfOperation,
        country,
        doingBusinessAs,
        entityType,
        expectedActivityVolumes,
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
     * Expected monthly transaction activity for the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expectedActivityVolumes(): ExpectedActivityVolumes? =
        expectedActivityVolumes.getNullable("expectedActivityVolumes")

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
    fun purposeOfAccount(): PurposeOfAccount? = purposeOfAccount.getNullable("purposeOfAccount")

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
    fun sourceOfFunds(): SourceOfFunds? = sourceOfFunds.getNullable("sourceOfFunds")

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
     * Returns the raw JSON value of [expectedActivityVolumes].
     *
     * Unlike [expectedActivityVolumes], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("expectedActivityVolumes")
    @ExcludeMissing
    fun _expectedActivityVolumes(): JsonField<ExpectedActivityVolumes> = expectedActivityVolumes

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
    fun _purposeOfAccount(): JsonField<PurposeOfAccount> = purposeOfAccount

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
    fun _sourceOfFunds(): JsonField<SourceOfFunds> = sourceOfFunds

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
        private var expectedActivityVolumes: JsonField<ExpectedActivityVolumes> = JsonMissing.of()
        private var expectedRecipientJurisdictions: JsonField<MutableList<String>>? = null
        private var incorporatedOn: JsonField<LocalDate> = JsonMissing.of()
        private var purposeOfAccount: JsonField<PurposeOfAccount> = JsonMissing.of()
        private var registrationNumber: JsonField<String> = JsonMissing.of()
        private var sourceOfFunds: JsonField<SourceOfFunds> = JsonMissing.of()
        private var taxId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(businessInfo: BusinessInfo) = apply {
            legalName = businessInfo.legalName
            businessType = businessInfo.businessType
            countriesOfOperation = businessInfo.countriesOfOperation.map { it.toMutableList() }
            country = businessInfo.country
            doingBusinessAs = businessInfo.doingBusinessAs
            entityType = businessInfo.entityType
            expectedActivityVolumes = businessInfo.expectedActivityVolumes
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

        /** Expected monthly transaction activity for the business */
        fun expectedActivityVolumes(expectedActivityVolumes: ExpectedActivityVolumes) =
            expectedActivityVolumes(JsonField.of(expectedActivityVolumes))

        /**
         * Sets [Builder.expectedActivityVolumes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expectedActivityVolumes] with a well-typed
         * [ExpectedActivityVolumes] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun expectedActivityVolumes(expectedActivityVolumes: JsonField<ExpectedActivityVolumes>) =
            apply {
                this.expectedActivityVolumes = expectedActivityVolumes
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
        fun purposeOfAccount(purposeOfAccount: PurposeOfAccount) =
            purposeOfAccount(JsonField.of(purposeOfAccount))

        /**
         * Sets [Builder.purposeOfAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purposeOfAccount] with a well-typed [PurposeOfAccount]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun purposeOfAccount(purposeOfAccount: JsonField<PurposeOfAccount>) = apply {
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
        fun sourceOfFunds(sourceOfFunds: SourceOfFunds) = sourceOfFunds(JsonField.of(sourceOfFunds))

        /**
         * Sets [Builder.sourceOfFunds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceOfFunds] with a well-typed [SourceOfFunds] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceOfFunds(sourceOfFunds: JsonField<SourceOfFunds>) = apply {
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
                expectedActivityVolumes,
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
        expectedActivityVolumes()?.validate()
        expectedRecipientJurisdictions()
        incorporatedOn()
        purposeOfAccount()?.validate()
        registrationNumber()
        sourceOfFunds()?.validate()
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
            (expectedActivityVolumes.asKnown()?.validity() ?: 0) +
            (expectedRecipientJurisdictions.asKnown()?.size ?: 0) +
            (if (incorporatedOn.asKnown() == null) 0 else 1) +
            (purposeOfAccount.asKnown()?.validity() ?: 0) +
            (if (registrationNumber.asKnown() == null) 0 else 1) +
            (sourceOfFunds.asKnown()?.validity() ?: 0) +
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

    /** Expected monthly transaction activity for the business */
    class ExpectedActivityVolumes
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val monthlyTransactionCount: JsonField<MonthlyTransactionCount>,
        private val monthlyTransactionVolume: JsonField<MonthlyTransactionVolume>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("monthlyTransactionCount")
            @ExcludeMissing
            monthlyTransactionCount: JsonField<MonthlyTransactionCount> = JsonMissing.of(),
            @JsonProperty("monthlyTransactionVolume")
            @ExcludeMissing
            monthlyTransactionVolume: JsonField<MonthlyTransactionVolume> = JsonMissing.of(),
        ) : this(monthlyTransactionCount, monthlyTransactionVolume, mutableMapOf())

        /**
         * Expected number of transactions per month
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun monthlyTransactionCount(): MonthlyTransactionCount? =
            monthlyTransactionCount.getNullable("monthlyTransactionCount")

        /**
         * Expected total transaction volume per month in USD equivalent
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun monthlyTransactionVolume(): MonthlyTransactionVolume? =
            monthlyTransactionVolume.getNullable("monthlyTransactionVolume")

        /**
         * Returns the raw JSON value of [monthlyTransactionCount].
         *
         * Unlike [monthlyTransactionCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("monthlyTransactionCount")
        @ExcludeMissing
        fun _monthlyTransactionCount(): JsonField<MonthlyTransactionCount> = monthlyTransactionCount

        /**
         * Returns the raw JSON value of [monthlyTransactionVolume].
         *
         * Unlike [monthlyTransactionVolume], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("monthlyTransactionVolume")
        @ExcludeMissing
        fun _monthlyTransactionVolume(): JsonField<MonthlyTransactionVolume> =
            monthlyTransactionVolume

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
             * Returns a mutable builder for constructing an instance of [ExpectedActivityVolumes].
             */
            fun builder() = Builder()
        }

        /** A builder for [ExpectedActivityVolumes]. */
        class Builder internal constructor() {

            private var monthlyTransactionCount: JsonField<MonthlyTransactionCount> =
                JsonMissing.of()
            private var monthlyTransactionVolume: JsonField<MonthlyTransactionVolume> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(expectedActivityVolumes: ExpectedActivityVolumes) = apply {
                monthlyTransactionCount = expectedActivityVolumes.monthlyTransactionCount
                monthlyTransactionVolume = expectedActivityVolumes.monthlyTransactionVolume
                additionalProperties = expectedActivityVolumes.additionalProperties.toMutableMap()
            }

            /** Expected number of transactions per month */
            fun monthlyTransactionCount(monthlyTransactionCount: MonthlyTransactionCount) =
                monthlyTransactionCount(JsonField.of(monthlyTransactionCount))

            /**
             * Sets [Builder.monthlyTransactionCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyTransactionCount] with a well-typed
             * [MonthlyTransactionCount] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun monthlyTransactionCount(
                monthlyTransactionCount: JsonField<MonthlyTransactionCount>
            ) = apply { this.monthlyTransactionCount = monthlyTransactionCount }

            /** Expected total transaction volume per month in USD equivalent */
            fun monthlyTransactionVolume(monthlyTransactionVolume: MonthlyTransactionVolume) =
                monthlyTransactionVolume(JsonField.of(monthlyTransactionVolume))

            /**
             * Sets [Builder.monthlyTransactionVolume] to an arbitrary JSON value.
             *
             * You should usually call [Builder.monthlyTransactionVolume] with a well-typed
             * [MonthlyTransactionVolume] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun monthlyTransactionVolume(
                monthlyTransactionVolume: JsonField<MonthlyTransactionVolume>
            ) = apply { this.monthlyTransactionVolume = monthlyTransactionVolume }

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
             * Returns an immutable instance of [ExpectedActivityVolumes].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ExpectedActivityVolumes =
                ExpectedActivityVolumes(
                    monthlyTransactionCount,
                    monthlyTransactionVolume,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ExpectedActivityVolumes = apply {
            if (validated) {
                return@apply
            }

            monthlyTransactionCount()?.validate()
            monthlyTransactionVolume()?.validate()
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
            (monthlyTransactionCount.asKnown()?.validity() ?: 0) +
                (monthlyTransactionVolume.asKnown()?.validity() ?: 0)

        /** Expected number of transactions per month */
        class MonthlyTransactionCount
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

                val LESS_THAN_10 = of("LESS_THAN_10")

                val _10_TO_100 = of("10_TO_100")

                val _100_TO_500 = of("100_TO_500")

                val _500_TO_1000 = of("500_TO_1000")

                val MORE_THAN_1000 = of("MORE_THAN_1000")

                fun of(value: String) = MonthlyTransactionCount(JsonField.of(value))
            }

            /** An enum containing [MonthlyTransactionCount]'s known values. */
            enum class Known {
                LESS_THAN_10,
                _10_TO_100,
                _100_TO_500,
                _500_TO_1000,
                MORE_THAN_1000,
            }

            /**
             * An enum containing [MonthlyTransactionCount]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [MonthlyTransactionCount] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LESS_THAN_10,
                _10_TO_100,
                _100_TO_500,
                _500_TO_1000,
                MORE_THAN_1000,
                /**
                 * An enum member indicating that [MonthlyTransactionCount] was instantiated with an
                 * unknown value.
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
                    LESS_THAN_10 -> Value.LESS_THAN_10
                    _10_TO_100 -> Value._10_TO_100
                    _100_TO_500 -> Value._100_TO_500
                    _500_TO_1000 -> Value._500_TO_1000
                    MORE_THAN_1000 -> Value.MORE_THAN_1000
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
                    LESS_THAN_10 -> Known.LESS_THAN_10
                    _10_TO_100 -> Known._10_TO_100
                    _100_TO_500 -> Known._100_TO_500
                    _500_TO_1000 -> Known._500_TO_1000
                    MORE_THAN_1000 -> Known.MORE_THAN_1000
                    else ->
                        throw LightsparkGridInvalidDataException(
                            "Unknown MonthlyTransactionCount: $value"
                        )
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

            fun validate(): MonthlyTransactionCount = apply {
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

                return other is MonthlyTransactionCount && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Expected total transaction volume per month in USD equivalent */
        class MonthlyTransactionVolume
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

                val LESS_THAN_10_K = of("LESS_THAN_10K")

                val _10_K_TO_100_K = of("10K_TO_100K")

                val _100_K_TO_1_M = of("100K_TO_1M")

                val _1_M_TO_10_M = of("1M_TO_10M")

                val MORE_THAN_10_M = of("MORE_THAN_10M")

                fun of(value: String) = MonthlyTransactionVolume(JsonField.of(value))
            }

            /** An enum containing [MonthlyTransactionVolume]'s known values. */
            enum class Known {
                LESS_THAN_10_K,
                _10_K_TO_100_K,
                _100_K_TO_1_M,
                _1_M_TO_10_M,
                MORE_THAN_10_M,
            }

            /**
             * An enum containing [MonthlyTransactionVolume]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [MonthlyTransactionVolume] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                LESS_THAN_10_K,
                _10_K_TO_100_K,
                _100_K_TO_1_M,
                _1_M_TO_10_M,
                MORE_THAN_10_M,
                /**
                 * An enum member indicating that [MonthlyTransactionVolume] was instantiated with
                 * an unknown value.
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
                    LESS_THAN_10_K -> Value.LESS_THAN_10_K
                    _10_K_TO_100_K -> Value._10_K_TO_100_K
                    _100_K_TO_1_M -> Value._100_K_TO_1_M
                    _1_M_TO_10_M -> Value._1_M_TO_10_M
                    MORE_THAN_10_M -> Value.MORE_THAN_10_M
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
                    LESS_THAN_10_K -> Known.LESS_THAN_10_K
                    _10_K_TO_100_K -> Known._10_K_TO_100_K
                    _100_K_TO_1_M -> Known._100_K_TO_1_M
                    _1_M_TO_10_M -> Known._1_M_TO_10_M
                    MORE_THAN_10_M -> Known.MORE_THAN_10_M
                    else ->
                        throw LightsparkGridInvalidDataException(
                            "Unknown MonthlyTransactionVolume: $value"
                        )
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

            fun validate(): MonthlyTransactionVolume = apply {
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

                return other is MonthlyTransactionVolume && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExpectedActivityVolumes &&
                monthlyTransactionCount == other.monthlyTransactionCount &&
                monthlyTransactionVolume == other.monthlyTransactionVolume &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(monthlyTransactionCount, monthlyTransactionVolume, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExpectedActivityVolumes{monthlyTransactionCount=$monthlyTransactionCount, monthlyTransactionVolume=$monthlyTransactionVolume, additionalProperties=$additionalProperties}"
    }

    /** The intended purpose for using the Grid account */
    class PurposeOfAccount @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val PAYMENTS = of("PAYMENTS")

            val PAYROLL = of("PAYROLL")

            val TREASURY = of("TREASURY")

            val TRADING = of("TRADING")

            val LENDING = of("LENDING")

            val COLLECTIONS = of("COLLECTIONS")

            val OTHER = of("OTHER")

            fun of(value: String) = PurposeOfAccount(JsonField.of(value))
        }

        /** An enum containing [PurposeOfAccount]'s known values. */
        enum class Known {
            PAYMENTS,
            PAYROLL,
            TREASURY,
            TRADING,
            LENDING,
            COLLECTIONS,
            OTHER,
        }

        /**
         * An enum containing [PurposeOfAccount]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PurposeOfAccount] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PAYMENTS,
            PAYROLL,
            TREASURY,
            TRADING,
            LENDING,
            COLLECTIONS,
            OTHER,
            /**
             * An enum member indicating that [PurposeOfAccount] was instantiated with an unknown
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
                PAYMENTS -> Value.PAYMENTS
                PAYROLL -> Value.PAYROLL
                TREASURY -> Value.TREASURY
                TRADING -> Value.TRADING
                LENDING -> Value.LENDING
                COLLECTIONS -> Value.COLLECTIONS
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
                PAYMENTS -> Known.PAYMENTS
                PAYROLL -> Known.PAYROLL
                TREASURY -> Known.TREASURY
                TRADING -> Known.TRADING
                LENDING -> Known.LENDING
                COLLECTIONS -> Known.COLLECTIONS
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown PurposeOfAccount: $value")
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

        fun validate(): PurposeOfAccount = apply {
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

            return other is PurposeOfAccount && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The primary source of funds for the business */
    class SourceOfFunds @JsonCreator private constructor(private val value: JsonField<String>) :
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

            val OPERATING_REVENUE = of("OPERATING_REVENUE")

            val INVESTMENT_INCOME = of("INVESTMENT_INCOME")

            val LOANS = of("LOANS")

            val VENTURE_CAPITAL = of("VENTURE_CAPITAL")

            val PERSONAL_SAVINGS = of("PERSONAL_SAVINGS")

            val DONATIONS = of("DONATIONS")

            val OTHER = of("OTHER")

            fun of(value: String) = SourceOfFunds(JsonField.of(value))
        }

        /** An enum containing [SourceOfFunds]'s known values. */
        enum class Known {
            OPERATING_REVENUE,
            INVESTMENT_INCOME,
            LOANS,
            VENTURE_CAPITAL,
            PERSONAL_SAVINGS,
            DONATIONS,
            OTHER,
        }

        /**
         * An enum containing [SourceOfFunds]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SourceOfFunds] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OPERATING_REVENUE,
            INVESTMENT_INCOME,
            LOANS,
            VENTURE_CAPITAL,
            PERSONAL_SAVINGS,
            DONATIONS,
            OTHER,
            /**
             * An enum member indicating that [SourceOfFunds] was instantiated with an unknown
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
                OPERATING_REVENUE -> Value.OPERATING_REVENUE
                INVESTMENT_INCOME -> Value.INVESTMENT_INCOME
                LOANS -> Value.LOANS
                VENTURE_CAPITAL -> Value.VENTURE_CAPITAL
                PERSONAL_SAVINGS -> Value.PERSONAL_SAVINGS
                DONATIONS -> Value.DONATIONS
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
                OPERATING_REVENUE -> Known.OPERATING_REVENUE
                INVESTMENT_INCOME -> Known.INVESTMENT_INCOME
                LOANS -> Known.LOANS
                VENTURE_CAPITAL -> Known.VENTURE_CAPITAL
                PERSONAL_SAVINGS -> Known.PERSONAL_SAVINGS
                DONATIONS -> Known.DONATIONS
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown SourceOfFunds: $value")
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

        fun validate(): SourceOfFunds = apply {
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

            return other is SourceOfFunds && value == other.value
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
            expectedActivityVolumes == other.expectedActivityVolumes &&
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
            expectedActivityVolumes,
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
        "BusinessInfo{legalName=$legalName, businessType=$businessType, countriesOfOperation=$countriesOfOperation, country=$country, doingBusinessAs=$doingBusinessAs, entityType=$entityType, expectedActivityVolumes=$expectedActivityVolumes, expectedRecipientJurisdictions=$expectedRecipientJurisdictions, incorporatedOn=$incorporatedOn, purposeOfAccount=$purposeOfAccount, registrationNumber=$registrationNumber, sourceOfFunds=$sourceOfFunds, taxId=$taxId, additionalProperties=$additionalProperties}"
}
