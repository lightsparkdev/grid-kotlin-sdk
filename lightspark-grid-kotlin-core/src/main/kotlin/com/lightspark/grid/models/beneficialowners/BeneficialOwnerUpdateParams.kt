// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Update details of a specific beneficial owner. Only provided fields are updated. */
class BeneficialOwnerUpdateParams
private constructor(
    private val beneficialOwnerId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun beneficialOwnerId(): String? = beneficialOwnerId

    /**
     * Percentage of ownership in the business (0-100)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun ownershipPercentage(): Long? = body.ownershipPercentage()

    /**
     * Partial update for beneficial owner personal information. Only provided fields are updated.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun personalInfo(): PersonalInfo? = body.personalInfo()

    /**
     * Roles of this person within the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun roles(): List<Role>? = body.roles()

    /**
     * Returns the raw JSON value of [ownershipPercentage].
     *
     * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _ownershipPercentage(): JsonField<Long> = body._ownershipPercentage()

    /**
     * Returns the raw JSON value of [personalInfo].
     *
     * Unlike [personalInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _personalInfo(): JsonField<PersonalInfo> = body._personalInfo()

    /**
     * Returns the raw JSON value of [roles].
     *
     * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _roles(): JsonField<List<Role>> = body._roles()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): BeneficialOwnerUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [BeneficialOwnerUpdateParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [BeneficialOwnerUpdateParams]. */
    class Builder internal constructor() {

        private var beneficialOwnerId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(beneficialOwnerUpdateParams: BeneficialOwnerUpdateParams) = apply {
            beneficialOwnerId = beneficialOwnerUpdateParams.beneficialOwnerId
            body = beneficialOwnerUpdateParams.body.toBuilder()
            additionalHeaders = beneficialOwnerUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = beneficialOwnerUpdateParams.additionalQueryParams.toBuilder()
        }

        fun beneficialOwnerId(beneficialOwnerId: String?) = apply {
            this.beneficialOwnerId = beneficialOwnerId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [ownershipPercentage]
         * - [personalInfo]
         * - [roles]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Percentage of ownership in the business (0-100) */
        fun ownershipPercentage(ownershipPercentage: Long) = apply {
            body.ownershipPercentage(ownershipPercentage)
        }

        /**
         * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ownershipPercentage] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
            body.ownershipPercentage(ownershipPercentage)
        }

        /**
         * Partial update for beneficial owner personal information. Only provided fields are
         * updated.
         */
        fun personalInfo(personalInfo: PersonalInfo) = apply { body.personalInfo(personalInfo) }

        /**
         * Sets [Builder.personalInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalInfo] with a well-typed [PersonalInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun personalInfo(personalInfo: JsonField<PersonalInfo>) = apply {
            body.personalInfo(personalInfo)
        }

        /** Roles of this person within the business */
        fun roles(roles: List<Role>) = apply { body.roles(roles) }

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<Role>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun roles(roles: JsonField<List<Role>>) = apply { body.roles(roles) }

        /**
         * Adds a single [Role] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: Role) = apply { body.addRole(role) }

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
         * Returns an immutable instance of [BeneficialOwnerUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): BeneficialOwnerUpdateParams =
            BeneficialOwnerUpdateParams(
                beneficialOwnerId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> beneficialOwnerId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val ownershipPercentage: JsonField<Long>,
        private val personalInfo: JsonField<PersonalInfo>,
        private val roles: JsonField<List<Role>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("ownershipPercentage")
            @ExcludeMissing
            ownershipPercentage: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("personalInfo")
            @ExcludeMissing
            personalInfo: JsonField<PersonalInfo> = JsonMissing.of(),
            @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<Role>> = JsonMissing.of(),
        ) : this(ownershipPercentage, personalInfo, roles, mutableMapOf())

        /**
         * Percentage of ownership in the business (0-100)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun ownershipPercentage(): Long? = ownershipPercentage.getNullable("ownershipPercentage")

        /**
         * Partial update for beneficial owner personal information. Only provided fields are
         * updated.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun personalInfo(): PersonalInfo? = personalInfo.getNullable("personalInfo")

        /**
         * Roles of this person within the business
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun roles(): List<Role>? = roles.getNullable("roles")

        /**
         * Returns the raw JSON value of [ownershipPercentage].
         *
         * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("ownershipPercentage")
        @ExcludeMissing
        fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

        /**
         * Returns the raw JSON value of [personalInfo].
         *
         * Unlike [personalInfo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("personalInfo")
        @ExcludeMissing
        fun _personalInfo(): JsonField<PersonalInfo> = personalInfo

        /**
         * Returns the raw JSON value of [roles].
         *
         * Unlike [roles], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("roles") @ExcludeMissing fun _roles(): JsonField<List<Role>> = roles

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

            private var ownershipPercentage: JsonField<Long> = JsonMissing.of()
            private var personalInfo: JsonField<PersonalInfo> = JsonMissing.of()
            private var roles: JsonField<MutableList<Role>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                ownershipPercentage = body.ownershipPercentage
                personalInfo = body.personalInfo
                roles = body.roles.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Percentage of ownership in the business (0-100) */
            fun ownershipPercentage(ownershipPercentage: Long) =
                ownershipPercentage(JsonField.of(ownershipPercentage))

            /**
             * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ownershipPercentage] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                this.ownershipPercentage = ownershipPercentage
            }

            /**
             * Partial update for beneficial owner personal information. Only provided fields are
             * updated.
             */
            fun personalInfo(personalInfo: PersonalInfo) = personalInfo(JsonField.of(personalInfo))

            /**
             * Sets [Builder.personalInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.personalInfo] with a well-typed [PersonalInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun personalInfo(personalInfo: JsonField<PersonalInfo>) = apply {
                this.personalInfo = personalInfo
            }

            /** Roles of this person within the business */
            fun roles(roles: List<Role>) = roles(JsonField.of(roles))

            /**
             * Sets [Builder.roles] to an arbitrary JSON value.
             *
             * You should usually call [Builder.roles] with a well-typed `List<Role>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun roles(roles: JsonField<List<Role>>) = apply {
                this.roles = roles.map { it.toMutableList() }
            }

            /**
             * Adds a single [Role] to [roles].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRole(role: Role) = apply {
                roles =
                    (roles ?: JsonField.of(mutableListOf())).also {
                        checkKnown("roles", it).add(role)
                    }
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    ownershipPercentage,
                    personalInfo,
                    (roles ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            ownershipPercentage()
            personalInfo()?.validate()
            roles()?.forEach { it.validate() }
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
            (if (ownershipPercentage.asKnown() == null) 0 else 1) +
                (personalInfo.asKnown()?.validity() ?: 0) +
                (roles.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                ownershipPercentage == other.ownershipPercentage &&
                personalInfo == other.personalInfo &&
                roles == other.roles &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(ownershipPercentage, personalInfo, roles, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{ownershipPercentage=$ownershipPercentage, personalInfo=$personalInfo, roles=$roles, additionalProperties=$additionalProperties}"
    }

    /**
     * Partial update for beneficial owner personal information. Only provided fields are updated.
     */
    class PersonalInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<Address>,
        private val birthDate: JsonField<LocalDate>,
        private val countryOfIssuance: JsonField<String>,
        private val email: JsonField<String>,
        private val firstName: JsonField<String>,
        private val identifier: JsonField<String>,
        private val idType: JsonField<IdType>,
        private val lastName: JsonField<String>,
        private val middleName: JsonField<String>,
        private val nationality: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("birthDate")
            @ExcludeMissing
            birthDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("countryOfIssuance")
            @ExcludeMissing
            countryOfIssuance: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("firstName")
            @ExcludeMissing
            firstName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("identifier")
            @ExcludeMissing
            identifier: JsonField<String> = JsonMissing.of(),
            @JsonProperty("idType") @ExcludeMissing idType: JsonField<IdType> = JsonMissing.of(),
            @JsonProperty("lastName")
            @ExcludeMissing
            lastName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("middleName")
            @ExcludeMissing
            middleName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("nationality")
            @ExcludeMissing
            nationality: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(
            address,
            birthDate,
            countryOfIssuance,
            email,
            firstName,
            identifier,
            idType,
            lastName,
            middleName,
            nationality,
            phoneNumber,
            mutableMapOf(),
        )

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Address? = address.getNullable("address")

        /**
         * Date of birth in ISO 8601 format (YYYY-MM-DD)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun birthDate(): LocalDate? = birthDate.getNullable("birthDate")

        /**
         * Country that issued the identification (ISO 3166-1 alpha-2)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun countryOfIssuance(): String? = countryOfIssuance.getNullable("countryOfIssuance")

        /**
         * Email address of the individual
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * First name of the individual
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun firstName(): String? = firstName.getNullable("firstName")

        /**
         * The identification number or value
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun identifier(): String? = identifier.getNullable("identifier")

        /**
         * Type of tax identification
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun idType(): IdType? = idType.getNullable("idType")

        /**
         * Last name of the individual
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lastName(): String? = lastName.getNullable("lastName")

        /**
         * Middle name of the individual
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun middleName(): String? = middleName.getNullable("middleName")

        /**
         * Country of nationality (ISO 3166-1 alpha-2)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nationality(): String? = nationality.getNullable("nationality")

        /**
         * Phone number in E.164 format
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [birthDate].
         *
         * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("birthDate")
        @ExcludeMissing
        fun _birthDate(): JsonField<LocalDate> = birthDate

        /**
         * Returns the raw JSON value of [countryOfIssuance].
         *
         * Unlike [countryOfIssuance], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("countryOfIssuance")
        @ExcludeMissing
        fun _countryOfIssuance(): JsonField<String> = countryOfIssuance

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [firstName].
         *
         * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("firstName") @ExcludeMissing fun _firstName(): JsonField<String> = firstName

        /**
         * Returns the raw JSON value of [identifier].
         *
         * Unlike [identifier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("identifier")
        @ExcludeMissing
        fun _identifier(): JsonField<String> = identifier

        /**
         * Returns the raw JSON value of [idType].
         *
         * Unlike [idType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("idType") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

        /**
         * Returns the raw JSON value of [lastName].
         *
         * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lastName") @ExcludeMissing fun _lastName(): JsonField<String> = lastName

        /**
         * Returns the raw JSON value of [middleName].
         *
         * Unlike [middleName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("middleName")
        @ExcludeMissing
        fun _middleName(): JsonField<String> = middleName

        /**
         * Returns the raw JSON value of [nationality].
         *
         * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nationality")
        @ExcludeMissing
        fun _nationality(): JsonField<String> = nationality

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

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

            /** Returns a mutable builder for constructing an instance of [PersonalInfo]. */
            fun builder() = Builder()
        }

        /** A builder for [PersonalInfo]. */
        class Builder internal constructor() {

            private var address: JsonField<Address> = JsonMissing.of()
            private var birthDate: JsonField<LocalDate> = JsonMissing.of()
            private var countryOfIssuance: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var firstName: JsonField<String> = JsonMissing.of()
            private var identifier: JsonField<String> = JsonMissing.of()
            private var idType: JsonField<IdType> = JsonMissing.of()
            private var lastName: JsonField<String> = JsonMissing.of()
            private var middleName: JsonField<String> = JsonMissing.of()
            private var nationality: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(personalInfo: PersonalInfo) = apply {
                address = personalInfo.address
                birthDate = personalInfo.birthDate
                countryOfIssuance = personalInfo.countryOfIssuance
                email = personalInfo.email
                firstName = personalInfo.firstName
                identifier = personalInfo.identifier
                idType = personalInfo.idType
                lastName = personalInfo.lastName
                middleName = personalInfo.middleName
                nationality = personalInfo.nationality
                phoneNumber = personalInfo.phoneNumber
                additionalProperties = personalInfo.additionalProperties.toMutableMap()
            }

            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
            fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

            /**
             * Sets [Builder.birthDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun birthDate(birthDate: JsonField<LocalDate>) = apply { this.birthDate = birthDate }

            /** Country that issued the identification (ISO 3166-1 alpha-2) */
            fun countryOfIssuance(countryOfIssuance: String) =
                countryOfIssuance(JsonField.of(countryOfIssuance))

            /**
             * Sets [Builder.countryOfIssuance] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryOfIssuance] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryOfIssuance(countryOfIssuance: JsonField<String>) = apply {
                this.countryOfIssuance = countryOfIssuance
            }

            /** Email address of the individual */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

            /** First name of the individual */
            fun firstName(firstName: String) = firstName(JsonField.of(firstName))

            /**
             * Sets [Builder.firstName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.firstName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun firstName(firstName: JsonField<String>) = apply { this.firstName = firstName }

            /** The identification number or value */
            fun identifier(identifier: String) = identifier(JsonField.of(identifier))

            /**
             * Sets [Builder.identifier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.identifier] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun identifier(identifier: JsonField<String>) = apply { this.identifier = identifier }

            /** Type of tax identification */
            fun idType(idType: IdType) = idType(JsonField.of(idType))

            /**
             * Sets [Builder.idType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.idType] with a well-typed [IdType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

            /** Last name of the individual */
            fun lastName(lastName: String) = lastName(JsonField.of(lastName))

            /**
             * Sets [Builder.lastName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lastName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

            /** Middle name of the individual */
            fun middleName(middleName: String) = middleName(JsonField.of(middleName))

            /**
             * Sets [Builder.middleName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.middleName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun middleName(middleName: JsonField<String>) = apply { this.middleName = middleName }

            /** Country of nationality (ISO 3166-1 alpha-2) */
            fun nationality(nationality: String) = nationality(JsonField.of(nationality))

            /**
             * Sets [Builder.nationality] to an arbitrary JSON value.
             *
             * You should usually call [Builder.nationality] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun nationality(nationality: JsonField<String>) = apply {
                this.nationality = nationality
            }

            /** Phone number in E.164 format */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
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
             * Returns an immutable instance of [PersonalInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PersonalInfo =
                PersonalInfo(
                    address,
                    birthDate,
                    countryOfIssuance,
                    email,
                    firstName,
                    identifier,
                    idType,
                    lastName,
                    middleName,
                    nationality,
                    phoneNumber,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PersonalInfo = apply {
            if (validated) {
                return@apply
            }

            address()?.validate()
            birthDate()
            countryOfIssuance()
            email()
            firstName()
            identifier()
            idType()?.validate()
            lastName()
            middleName()
            nationality()
            phoneNumber()
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
            (address.asKnown()?.validity() ?: 0) +
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (countryOfIssuance.asKnown() == null) 0 else 1) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (firstName.asKnown() == null) 0 else 1) +
                (if (identifier.asKnown() == null) 0 else 1) +
                (idType.asKnown()?.validity() ?: 0) +
                (if (lastName.asKnown() == null) 0 else 1) +
                (if (middleName.asKnown() == null) 0 else 1) +
                (if (nationality.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1)

        /** Type of tax identification */
        class IdType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val SSN = of("SSN")

                val ITIN = of("ITIN")

                val EIN = of("EIN")

                val NON_US_TAX_ID = of("NON_US_TAX_ID")

                fun of(value: String) = IdType(JsonField.of(value))
            }

            /** An enum containing [IdType]'s known values. */
            enum class Known {
                SSN,
                ITIN,
                EIN,
                NON_US_TAX_ID,
            }

            /**
             * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [IdType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SSN,
                ITIN,
                EIN,
                NON_US_TAX_ID,
                /**
                 * An enum member indicating that [IdType] was instantiated with an unknown value.
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
                    SSN -> Value.SSN
                    ITIN -> Value.ITIN
                    EIN -> Value.EIN
                    NON_US_TAX_ID -> Value.NON_US_TAX_ID
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
                    SSN -> Known.SSN
                    ITIN -> Known.ITIN
                    EIN -> Known.EIN
                    NON_US_TAX_ID -> Known.NON_US_TAX_ID
                    else -> throw LightsparkGridInvalidDataException("Unknown IdType: $value")
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

            fun validate(): IdType = apply {
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

                return other is IdType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PersonalInfo &&
                address == other.address &&
                birthDate == other.birthDate &&
                countryOfIssuance == other.countryOfIssuance &&
                email == other.email &&
                firstName == other.firstName &&
                identifier == other.identifier &&
                idType == other.idType &&
                lastName == other.lastName &&
                middleName == other.middleName &&
                nationality == other.nationality &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                address,
                birthDate,
                countryOfIssuance,
                email,
                firstName,
                identifier,
                idType,
                lastName,
                middleName,
                nationality,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PersonalInfo{address=$address, birthDate=$birthDate, countryOfIssuance=$countryOfIssuance, email=$email, firstName=$firstName, identifier=$identifier, idType=$idType, lastName=$lastName, middleName=$middleName, nationality=$nationality, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    /** Role of the beneficial owner within the business */
    class Role @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val UBO = of("UBO")

            val DIRECTOR = of("DIRECTOR")

            val COMPANY_OFFICER = of("COMPANY_OFFICER")

            val CONTROL_PERSON = of("CONTROL_PERSON")

            val TRUSTEE = of("TRUSTEE")

            val GENERAL_PARTNER = of("GENERAL_PARTNER")

            fun of(value: String) = Role(JsonField.of(value))
        }

        /** An enum containing [Role]'s known values. */
        enum class Known {
            UBO,
            DIRECTOR,
            COMPANY_OFFICER,
            CONTROL_PERSON,
            TRUSTEE,
            GENERAL_PARTNER,
        }

        /**
         * An enum containing [Role]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Role] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UBO,
            DIRECTOR,
            COMPANY_OFFICER,
            CONTROL_PERSON,
            TRUSTEE,
            GENERAL_PARTNER,
            /** An enum member indicating that [Role] was instantiated with an unknown value. */
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
                UBO -> Value.UBO
                DIRECTOR -> Value.DIRECTOR
                COMPANY_OFFICER -> Value.COMPANY_OFFICER
                CONTROL_PERSON -> Value.CONTROL_PERSON
                TRUSTEE -> Value.TRUSTEE
                GENERAL_PARTNER -> Value.GENERAL_PARTNER
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
                UBO -> Known.UBO
                DIRECTOR -> Known.DIRECTOR
                COMPANY_OFFICER -> Known.COMPANY_OFFICER
                CONTROL_PERSON -> Known.CONTROL_PERSON
                TRUSTEE -> Known.TRUSTEE
                GENERAL_PARTNER -> Known.GENERAL_PARTNER
                else -> throw LightsparkGridInvalidDataException("Unknown Role: $value")
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

        fun validate(): Role = apply {
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

            return other is Role && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BeneficialOwnerUpdateParams &&
            beneficialOwnerId == other.beneficialOwnerId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(beneficialOwnerId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "BeneficialOwnerUpdateParams{beneficialOwnerId=$beneficialOwnerId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
