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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = CustomerOneOf.Deserializer::class)
@JsonSerialize(using = CustomerOneOf.Serializer::class)
class CustomerOneOf
private constructor(
    private val individual: Individual? = null,
    private val business: Business? = null,
    private val _json: JsonValue? = null,
) {

    fun individual(): Individual? = individual

    fun business(): Business? = business

    fun isIndividual(): Boolean = individual != null

    fun isBusiness(): Boolean = business != null

    fun asIndividual(): Individual = individual.getOrThrow("individual")

    fun asBusiness(): Business = business.getOrThrow("business")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            individual != null -> visitor.visitIndividual(individual)
            business != null -> visitor.visitBusiness(business)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CustomerOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIndividual(individual: Individual) {
                    individual.validate()
                }

                override fun visitBusiness(business: Business) {
                    business.validate()
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
                override fun visitIndividual(individual: Individual) = individual.validity()

                override fun visitBusiness(business: Business) = business.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerOneOf &&
            individual == other.individual &&
            business == other.business
    }

    override fun hashCode(): Int = Objects.hash(individual, business)

    override fun toString(): String =
        when {
            individual != null -> "CustomerOneOf{individual=$individual}"
            business != null -> "CustomerOneOf{business=$business}"
            _json != null -> "CustomerOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerOneOf")
        }

    companion object {

        fun ofIndividual(individual: Individual) = CustomerOneOf(individual = individual)

        fun ofBusiness(business: Business) = CustomerOneOf(business = business)
    }

    /**
     * An interface that defines how to map each variant of [CustomerOneOf] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitIndividual(individual: Individual): T

        fun visitBusiness(business: Business): T

        /**
         * Maps an unknown variant of [CustomerOneOf] to a value of type [T].
         *
         * An instance of [CustomerOneOf] can contain an unknown variant if it was deserialized from
         * data that doesn't match any known variant. For example, if the SDK is on an older version
         * than the API, then the API may respond with new variants that the SDK is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown CustomerOneOf: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<CustomerOneOf>(CustomerOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): CustomerOneOf {
            val json = JsonValue.fromJsonNode(node)
            val customerType = json.asObject()?.get("customerType")?.asString()

            when (customerType) {
                "INDIVIDUAL" -> {
                    return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                        CustomerOneOf(individual = it, _json = json)
                    } ?: CustomerOneOf(_json = json)
                }
                "BUSINESS" -> {
                    return tryDeserialize(node, jacksonTypeRef<Business>())?.let {
                        CustomerOneOf(business = it, _json = json)
                    } ?: CustomerOneOf(_json = json)
                }
            }

            return CustomerOneOf(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<CustomerOneOf>(CustomerOneOf::class) {

        override fun serialize(
            value: CustomerOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.individual != null -> generator.writeObject(value.individual)
                value.business != null -> generator.writeObject(value.business)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerOneOf")
            }
        }
    }

    class Individual
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val platformCustomerId: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val isDeleted: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val customerType: JsonField<IndividualCustomerFields.CustomerType>,
        private val address: JsonField<Address>,
        private val birthDate: JsonField<LocalDate>,
        private val fullName: JsonField<String>,
        private val kycStatus: JsonField<IndividualCustomerFields.KycStatus>,
        private val nationality: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("platformCustomerId")
            @ExcludeMissing
            platformCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("isDeleted")
            @ExcludeMissing
            isDeleted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customerType")
            @ExcludeMissing
            customerType: JsonField<IndividualCustomerFields.CustomerType> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("birthDate")
            @ExcludeMissing
            birthDate: JsonField<LocalDate> = JsonMissing.of(),
            @JsonProperty("fullName")
            @ExcludeMissing
            fullName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("kycStatus")
            @ExcludeMissing
            kycStatus: JsonField<IndividualCustomerFields.KycStatus> = JsonMissing.of(),
            @JsonProperty("nationality")
            @ExcludeMissing
            nationality: JsonField<String> = JsonMissing.of(),
        ) : this(
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            isDeleted,
            updatedAt,
            customerType,
            address,
            birthDate,
            fullName,
            kycStatus,
            nationality,
            mutableMapOf(),
        )

        fun toCustomer(): Customer =
            Customer.builder()
                .platformCustomerId(platformCustomerId)
                .umaAddress(umaAddress)
                .id(id)
                .createdAt(createdAt)
                .isDeleted(isDeleted)
                .updatedAt(updatedAt)
                .build()

        fun toIndividualCustomerFields(): IndividualCustomerFields =
            IndividualCustomerFields.builder()
                .customerType(customerType)
                .address(address)
                .birthDate(birthDate)
                .fullName(fullName)
                .kycStatus(kycStatus)
                .nationality(nationality)
                .build()

        /**
         * Platform-specific customer identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

        /**
         * Full UMA address (always present in responses, even if system-generated). This is an
         * optional identifier to route payments to the customer.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * System-generated unique identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * Creation timestamp
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

        /**
         * Whether the customer is marked as deleted
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isDeleted(): Boolean? = isDeleted.getNullable("isDeleted")

        /**
         * Last update timestamp
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerType(): IndividualCustomerFields.CustomerType =
            customerType.getRequired("customerType")

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
         * Individual's full name
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fullName(): String? = fullName.getNullable("fullName")

        /**
         * The current KYC status of a customer
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun kycStatus(): IndividualCustomerFields.KycStatus? = kycStatus.getNullable("kycStatus")

        /**
         * Country code (ISO 3166-1 alpha-2)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun nationality(): String? = nationality.getNullable("nationality")

        /**
         * Returns the raw JSON value of [platformCustomerId].
         *
         * Unlike [platformCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        fun _platformCustomerId(): JsonField<String> = platformCustomerId

        /**
         * Returns the raw JSON value of [umaAddress].
         *
         * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("umaAddress")
        @ExcludeMissing
        fun _umaAddress(): JsonField<String> = umaAddress

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [isDeleted].
         *
         * Unlike [isDeleted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isDeleted") @ExcludeMissing fun _isDeleted(): JsonField<Boolean> = isDeleted

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [customerType].
         *
         * Unlike [customerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customerType")
        @ExcludeMissing
        fun _customerType(): JsonField<IndividualCustomerFields.CustomerType> = customerType

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
         * Returns the raw JSON value of [fullName].
         *
         * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

        /**
         * Returns the raw JSON value of [kycStatus].
         *
         * Unlike [kycStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kycStatus")
        @ExcludeMissing
        fun _kycStatus(): JsonField<IndividualCustomerFields.KycStatus> = kycStatus

        /**
         * Returns the raw JSON value of [nationality].
         *
         * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("nationality")
        @ExcludeMissing
        fun _nationality(): JsonField<String> = nationality

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
             * Returns a mutable builder for constructing an instance of [Individual].
             *
             * The following fields are required:
             * ```kotlin
             * .platformCustomerId()
             * .umaAddress()
             * .customerType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Individual]. */
        class Builder internal constructor() {

            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerType: JsonField<IndividualCustomerFields.CustomerType>? = null
            private var address: JsonField<Address> = JsonMissing.of()
            private var birthDate: JsonField<LocalDate> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var kycStatus: JsonField<IndividualCustomerFields.KycStatus> = JsonMissing.of()
            private var nationality: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(individual: Individual) = apply {
                platformCustomerId = individual.platformCustomerId
                umaAddress = individual.umaAddress
                id = individual.id
                createdAt = individual.createdAt
                isDeleted = individual.isDeleted
                updatedAt = individual.updatedAt
                customerType = individual.customerType
                address = individual.address
                birthDate = individual.birthDate
                fullName = individual.fullName
                kycStatus = individual.kycStatus
                nationality = individual.nationality
                additionalProperties = individual.additionalProperties.toMutableMap()
            }

            /** Platform-specific customer identifier */
            fun platformCustomerId(platformCustomerId: String) =
                platformCustomerId(JsonField.of(platformCustomerId))

            /**
             * Sets [Builder.platformCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformCustomerId(platformCustomerId: JsonField<String>) = apply {
                this.platformCustomerId = platformCustomerId
            }

            /**
             * Full UMA address (always present in responses, even if system-generated). This is an
             * optional identifier to route payments to the customer.
             */
            fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

            /**
             * Sets [Builder.umaAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.umaAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

            /** System-generated unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Creation timestamp */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Whether the customer is marked as deleted */
            fun isDeleted(isDeleted: Boolean) = isDeleted(JsonField.of(isDeleted))

            /**
             * Sets [Builder.isDeleted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDeleted] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDeleted(isDeleted: JsonField<Boolean>) = apply { this.isDeleted = isDeleted }

            /** Last update timestamp */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun customerType(customerType: IndividualCustomerFields.CustomerType) =
                customerType(JsonField.of(customerType))

            /**
             * Sets [Builder.customerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerType] with a well-typed
             * [IndividualCustomerFields.CustomerType] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun customerType(customerType: JsonField<IndividualCustomerFields.CustomerType>) =
                apply {
                    this.customerType = customerType
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

            /** Individual's full name */
            fun fullName(fullName: String) = fullName(JsonField.of(fullName))

            /**
             * Sets [Builder.fullName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fullName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

            /** The current KYC status of a customer */
            fun kycStatus(kycStatus: IndividualCustomerFields.KycStatus) =
                kycStatus(JsonField.of(kycStatus))

            /**
             * Sets [Builder.kycStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kycStatus] with a well-typed
             * [IndividualCustomerFields.KycStatus] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun kycStatus(kycStatus: JsonField<IndividualCustomerFields.KycStatus>) = apply {
                this.kycStatus = kycStatus
            }

            /** Country code (ISO 3166-1 alpha-2) */
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
             * Returns an immutable instance of [Individual].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .platformCustomerId()
             * .umaAddress()
             * .customerType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Individual =
                Individual(
                    checkRequired("platformCustomerId", platformCustomerId),
                    checkRequired("umaAddress", umaAddress),
                    id,
                    createdAt,
                    isDeleted,
                    updatedAt,
                    checkRequired("customerType", customerType),
                    address,
                    birthDate,
                    fullName,
                    kycStatus,
                    nationality,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Individual = apply {
            if (validated) {
                return@apply
            }

            platformCustomerId()
            umaAddress()
            id()
            createdAt()
            isDeleted()
            updatedAt()
            customerType().validate()
            address()?.validate()
            birthDate()
            fullName()
            kycStatus()?.validate()
            nationality()
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
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (customerType.asKnown()?.validity() ?: 0) +
                (address.asKnown()?.validity() ?: 0) +
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (fullName.asKnown() == null) 0 else 1) +
                (kycStatus.asKnown()?.validity() ?: 0) +
                (if (nationality.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Individual &&
                platformCustomerId == other.platformCustomerId &&
                umaAddress == other.umaAddress &&
                id == other.id &&
                createdAt == other.createdAt &&
                isDeleted == other.isDeleted &&
                updatedAt == other.updatedAt &&
                customerType == other.customerType &&
                address == other.address &&
                birthDate == other.birthDate &&
                fullName == other.fullName &&
                kycStatus == other.kycStatus &&
                nationality == other.nationality &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                platformCustomerId,
                umaAddress,
                id,
                createdAt,
                isDeleted,
                updatedAt,
                customerType,
                address,
                birthDate,
                fullName,
                kycStatus,
                nationality,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Individual{platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, isDeleted=$isDeleted, updatedAt=$updatedAt, customerType=$customerType, address=$address, birthDate=$birthDate, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, additionalProperties=$additionalProperties}"
    }

    class Business
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val platformCustomerId: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val isDeleted: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val customerType: JsonField<BusinessCustomerFields.CustomerType>,
        private val address: JsonField<Address>,
        private val businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>,
        private val kybStatus: JsonField<BusinessCustomerFields.KybStatus>,
        private val beneficialOwners: JsonField<List<BeneficialOwner>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("platformCustomerId")
            @ExcludeMissing
            platformCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("umaAddress")
            @ExcludeMissing
            umaAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("createdAt")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("isDeleted")
            @ExcludeMissing
            isDeleted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("customerType")
            @ExcludeMissing
            customerType: JsonField<BusinessCustomerFields.CustomerType> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("businessInfo")
            @ExcludeMissing
            businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> = JsonMissing.of(),
            @JsonProperty("kybStatus")
            @ExcludeMissing
            kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of(),
            @JsonProperty("beneficialOwners")
            @ExcludeMissing
            beneficialOwners: JsonField<List<BeneficialOwner>> = JsonMissing.of(),
        ) : this(
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            isDeleted,
            updatedAt,
            customerType,
            address,
            businessInfo,
            kybStatus,
            beneficialOwners,
            mutableMapOf(),
        )

        fun toCustomer(): Customer =
            Customer.builder()
                .platformCustomerId(platformCustomerId)
                .umaAddress(umaAddress)
                .id(id)
                .createdAt(createdAt)
                .isDeleted(isDeleted)
                .updatedAt(updatedAt)
                .build()

        fun toBusinessCustomerFields(): BusinessCustomerFields =
            BusinessCustomerFields.builder()
                .customerType(customerType)
                .address(address)
                .businessInfo(businessInfo)
                .kybStatus(kybStatus)
                .build()

        /**
         * Platform-specific customer identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

        /**
         * Full UMA address (always present in responses, even if system-generated). This is an
         * optional identifier to route payments to the customer.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun umaAddress(): String = umaAddress.getRequired("umaAddress")

        /**
         * System-generated unique identifier
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun id(): String? = id.getNullable("id")

        /**
         * Creation timestamp
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

        /**
         * Whether the customer is marked as deleted
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isDeleted(): Boolean? = isDeleted.getNullable("isDeleted")

        /**
         * Last update timestamp
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerType(): BusinessCustomerFields.CustomerType =
            customerType.getRequired("customerType")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Address? = address.getNullable("address")

        /**
         * Additional information for business entities
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun businessInfo(): BusinessCustomerFields.BusinessInfo? =
            businessInfo.getNullable("businessInfo")

        /**
         * The current KYB status of a business customer
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun kybStatus(): BusinessCustomerFields.KybStatus? = kybStatus.getNullable("kybStatus")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun beneficialOwners(): List<BeneficialOwner>? =
            beneficialOwners.getNullable("beneficialOwners")

        /**
         * Returns the raw JSON value of [platformCustomerId].
         *
         * Unlike [platformCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("platformCustomerId")
        @ExcludeMissing
        fun _platformCustomerId(): JsonField<String> = platformCustomerId

        /**
         * Returns the raw JSON value of [umaAddress].
         *
         * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("umaAddress")
        @ExcludeMissing
        fun _umaAddress(): JsonField<String> = umaAddress

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("createdAt")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [isDeleted].
         *
         * Unlike [isDeleted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isDeleted") @ExcludeMissing fun _isDeleted(): JsonField<Boolean> = isDeleted

        /**
         * Returns the raw JSON value of [updatedAt].
         *
         * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("updatedAt")
        @ExcludeMissing
        fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

        /**
         * Returns the raw JSON value of [customerType].
         *
         * Unlike [customerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customerType")
        @ExcludeMissing
        fun _customerType(): JsonField<BusinessCustomerFields.CustomerType> = customerType

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [businessInfo].
         *
         * Unlike [businessInfo], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("businessInfo")
        @ExcludeMissing
        fun _businessInfo(): JsonField<BusinessCustomerFields.BusinessInfo> = businessInfo

        /**
         * Returns the raw JSON value of [kybStatus].
         *
         * Unlike [kybStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("kybStatus")
        @ExcludeMissing
        fun _kybStatus(): JsonField<BusinessCustomerFields.KybStatus> = kybStatus

        /**
         * Returns the raw JSON value of [beneficialOwners].
         *
         * Unlike [beneficialOwners], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("beneficialOwners")
        @ExcludeMissing
        fun _beneficialOwners(): JsonField<List<BeneficialOwner>> = beneficialOwners

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
             * Returns a mutable builder for constructing an instance of [Business].
             *
             * The following fields are required:
             * ```kotlin
             * .platformCustomerId()
             * .umaAddress()
             * .customerType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Business]. */
        class Builder internal constructor() {

            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerType: JsonField<BusinessCustomerFields.CustomerType>? = null
            private var address: JsonField<Address> = JsonMissing.of()
            private var businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> =
                JsonMissing.of()
            private var kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of()
            private var beneficialOwners: JsonField<MutableList<BeneficialOwner>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(business: Business) = apply {
                platformCustomerId = business.platformCustomerId
                umaAddress = business.umaAddress
                id = business.id
                createdAt = business.createdAt
                isDeleted = business.isDeleted
                updatedAt = business.updatedAt
                customerType = business.customerType
                address = business.address
                businessInfo = business.businessInfo
                kybStatus = business.kybStatus
                beneficialOwners = business.beneficialOwners.map { it.toMutableList() }
                additionalProperties = business.additionalProperties.toMutableMap()
            }

            /** Platform-specific customer identifier */
            fun platformCustomerId(platformCustomerId: String) =
                platformCustomerId(JsonField.of(platformCustomerId))

            /**
             * Sets [Builder.platformCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformCustomerId(platformCustomerId: JsonField<String>) = apply {
                this.platformCustomerId = platformCustomerId
            }

            /**
             * Full UMA address (always present in responses, even if system-generated). This is an
             * optional identifier to route payments to the customer.
             */
            fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

            /**
             * Sets [Builder.umaAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.umaAddress] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

            /** System-generated unique identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** Creation timestamp */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Whether the customer is marked as deleted */
            fun isDeleted(isDeleted: Boolean) = isDeleted(JsonField.of(isDeleted))

            /**
             * Sets [Builder.isDeleted] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isDeleted] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isDeleted(isDeleted: JsonField<Boolean>) = apply { this.isDeleted = isDeleted }

            /** Last update timestamp */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            fun customerType(customerType: BusinessCustomerFields.CustomerType) =
                customerType(JsonField.of(customerType))

            /**
             * Sets [Builder.customerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerType] with a well-typed
             * [BusinessCustomerFields.CustomerType] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun customerType(customerType: JsonField<BusinessCustomerFields.CustomerType>) = apply {
                this.customerType = customerType
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

            /** Additional information for business entities */
            fun businessInfo(businessInfo: BusinessCustomerFields.BusinessInfo) =
                businessInfo(JsonField.of(businessInfo))

            /**
             * Sets [Builder.businessInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.businessInfo] with a well-typed
             * [BusinessCustomerFields.BusinessInfo] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun businessInfo(businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>) = apply {
                this.businessInfo = businessInfo
            }

            /** The current KYB status of a business customer */
            fun kybStatus(kybStatus: BusinessCustomerFields.KybStatus) =
                kybStatus(JsonField.of(kybStatus))

            /**
             * Sets [Builder.kybStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.kybStatus] with a well-typed
             * [BusinessCustomerFields.KybStatus] value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun kybStatus(kybStatus: JsonField<BusinessCustomerFields.KybStatus>) = apply {
                this.kybStatus = kybStatus
            }

            fun beneficialOwners(beneficialOwners: List<BeneficialOwner>) =
                beneficialOwners(JsonField.of(beneficialOwners))

            /**
             * Sets [Builder.beneficialOwners] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficialOwners] with a well-typed
             * `List<BeneficialOwner>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun beneficialOwners(beneficialOwners: JsonField<List<BeneficialOwner>>) = apply {
                this.beneficialOwners = beneficialOwners.map { it.toMutableList() }
            }

            /**
             * Adds a single [BeneficialOwner] to [beneficialOwners].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBeneficialOwner(beneficialOwner: BeneficialOwner) = apply {
                beneficialOwners =
                    (beneficialOwners ?: JsonField.of(mutableListOf())).also {
                        checkKnown("beneficialOwners", it).add(beneficialOwner)
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
             * Returns an immutable instance of [Business].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .platformCustomerId()
             * .umaAddress()
             * .customerType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Business =
                Business(
                    checkRequired("platformCustomerId", platformCustomerId),
                    checkRequired("umaAddress", umaAddress),
                    id,
                    createdAt,
                    isDeleted,
                    updatedAt,
                    checkRequired("customerType", customerType),
                    address,
                    businessInfo,
                    kybStatus,
                    (beneficialOwners ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Business = apply {
            if (validated) {
                return@apply
            }

            platformCustomerId()
            umaAddress()
            id()
            createdAt()
            isDeleted()
            updatedAt()
            customerType().validate()
            address()?.validate()
            businessInfo()?.validate()
            kybStatus()?.validate()
            beneficialOwners()?.forEach { it.validate() }
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
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (customerType.asKnown()?.validity() ?: 0) +
                (address.asKnown()?.validity() ?: 0) +
                (businessInfo.asKnown()?.validity() ?: 0) +
                (kybStatus.asKnown()?.validity() ?: 0) +
                (beneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class BeneficialOwner
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val customerId: JsonField<String>,
            private val kycStatus: JsonField<KycStatus>,
            private val ownershipPercentage: JsonField<Long>,
            private val personalInfo: JsonField<PersonalInfo>,
            private val roles: JsonField<List<Role>>,
            private val updatedAt: JsonField<OffsetDateTime>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("createdAt")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("customerId")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kycStatus")
                @ExcludeMissing
                kycStatus: JsonField<KycStatus> = JsonMissing.of(),
                @JsonProperty("ownershipPercentage")
                @ExcludeMissing
                ownershipPercentage: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("personalInfo")
                @ExcludeMissing
                personalInfo: JsonField<PersonalInfo> = JsonMissing.of(),
                @JsonProperty("roles")
                @ExcludeMissing
                roles: JsonField<List<Role>> = JsonMissing.of(),
                @JsonProperty("updatedAt")
                @ExcludeMissing
                updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            ) : this(
                id,
                createdAt,
                customerId,
                kycStatus,
                ownershipPercentage,
                personalInfo,
                roles,
                updatedAt,
                mutableMapOf(),
            )

            /**
             * Unique identifier for this beneficial owner
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * When this beneficial owner was created
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

            /**
             * The ID of the business customer this beneficial owner is associated with
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customerId")

            /**
             * The current KYC status of a customer
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun kycStatus(): KycStatus = kycStatus.getRequired("kycStatus")

            /**
             * Percentage of ownership in the business (0-100)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ownershipPercentage(): Long = ownershipPercentage.getRequired("ownershipPercentage")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun personalInfo(): PersonalInfo = personalInfo.getRequired("personalInfo")

            /**
             * Roles of this person within the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun roles(): List<Role> = roles.getRequired("roles")

            /**
             * When this beneficial owner was last updated
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("createdAt")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customerId")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [kycStatus].
             *
             * Unlike [kycStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("kycStatus")
            @ExcludeMissing
            fun _kycStatus(): JsonField<KycStatus> = kycStatus

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

            /**
             * Returns the raw JSON value of [updatedAt].
             *
             * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("updatedAt")
            @ExcludeMissing
            fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
                 * Returns a mutable builder for constructing an instance of [BeneficialOwner].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .createdAt()
                 * .customerId()
                 * .kycStatus()
                 * .ownershipPercentage()
                 * .personalInfo()
                 * .roles()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [BeneficialOwner]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var customerId: JsonField<String>? = null
                private var kycStatus: JsonField<KycStatus>? = null
                private var ownershipPercentage: JsonField<Long>? = null
                private var personalInfo: JsonField<PersonalInfo>? = null
                private var roles: JsonField<MutableList<Role>>? = null
                private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(beneficialOwner: BeneficialOwner) = apply {
                    id = beneficialOwner.id
                    createdAt = beneficialOwner.createdAt
                    customerId = beneficialOwner.customerId
                    kycStatus = beneficialOwner.kycStatus
                    ownershipPercentage = beneficialOwner.ownershipPercentage
                    personalInfo = beneficialOwner.personalInfo
                    roles = beneficialOwner.roles.map { it.toMutableList() }
                    updatedAt = beneficialOwner.updatedAt
                    additionalProperties = beneficialOwner.additionalProperties.toMutableMap()
                }

                /** Unique identifier for this beneficial owner */
                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** When this beneficial owner was created */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** The ID of the business customer this beneficial owner is associated with */
                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                /** The current KYC status of a customer */
                fun kycStatus(kycStatus: KycStatus) = kycStatus(JsonField.of(kycStatus))

                /**
                 * Sets [Builder.kycStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kycStatus] with a well-typed [KycStatus] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun kycStatus(kycStatus: JsonField<KycStatus>) = apply {
                    this.kycStatus = kycStatus
                }

                /** Percentage of ownership in the business (0-100) */
                fun ownershipPercentage(ownershipPercentage: Long) =
                    ownershipPercentage(JsonField.of(ownershipPercentage))

                /**
                 * Sets [Builder.ownershipPercentage] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ownershipPercentage] with a well-typed [Long]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun ownershipPercentage(ownershipPercentage: JsonField<Long>) = apply {
                    this.ownershipPercentage = ownershipPercentage
                }

                fun personalInfo(personalInfo: PersonalInfo) =
                    personalInfo(JsonField.of(personalInfo))

                /**
                 * Sets [Builder.personalInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.personalInfo] with a well-typed [PersonalInfo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun personalInfo(personalInfo: JsonField<PersonalInfo>) = apply {
                    this.personalInfo = personalInfo
                }

                /** Roles of this person within the business */
                fun roles(roles: List<Role>) = roles(JsonField.of(roles))

                /**
                 * Sets [Builder.roles] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.roles] with a well-typed `List<Role>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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

                /** When this beneficial owner was last updated */
                fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

                /**
                 * Sets [Builder.updatedAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                    this.updatedAt = updatedAt
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [BeneficialOwner].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .id()
                 * .createdAt()
                 * .customerId()
                 * .kycStatus()
                 * .ownershipPercentage()
                 * .personalInfo()
                 * .roles()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): BeneficialOwner =
                    BeneficialOwner(
                        checkRequired("id", id),
                        checkRequired("createdAt", createdAt),
                        checkRequired("customerId", customerId),
                        checkRequired("kycStatus", kycStatus),
                        checkRequired("ownershipPercentage", ownershipPercentage),
                        checkRequired("personalInfo", personalInfo),
                        checkRequired("roles", roles).map { it.toImmutable() },
                        updatedAt,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): BeneficialOwner = apply {
                if (validated) {
                    return@apply
                }

                id()
                createdAt()
                customerId()
                kycStatus().validate()
                ownershipPercentage()
                personalInfo().validate()
                roles().forEach { it.validate() }
                updatedAt()
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
                (if (id.asKnown() == null) 0 else 1) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (customerId.asKnown() == null) 0 else 1) +
                    (kycStatus.asKnown()?.validity() ?: 0) +
                    (if (ownershipPercentage.asKnown() == null) 0 else 1) +
                    (personalInfo.asKnown()?.validity() ?: 0) +
                    (roles.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (updatedAt.asKnown() == null) 0 else 1)

            /** The current KYC status of a customer */
            class KycStatus @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val UNVERIFIED = of("UNVERIFIED")

                    val PENDING = of("PENDING")

                    val APPROVED = of("APPROVED")

                    val REJECTED = of("REJECTED")

                    fun of(value: String) = KycStatus(JsonField.of(value))
                }

                /** An enum containing [KycStatus]'s known values. */
                enum class Known {
                    UNVERIFIED,
                    PENDING,
                    APPROVED,
                    REJECTED,
                }

                /**
                 * An enum containing [KycStatus]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [KycStatus] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UNVERIFIED,
                    PENDING,
                    APPROVED,
                    REJECTED,
                    /**
                     * An enum member indicating that [KycStatus] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        UNVERIFIED -> Value.UNVERIFIED
                        PENDING -> Value.PENDING
                        APPROVED -> Value.APPROVED
                        REJECTED -> Value.REJECTED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        UNVERIFIED -> Known.UNVERIFIED
                        PENDING -> Known.PENDING
                        APPROVED -> Known.APPROVED
                        REJECTED -> Known.REJECTED
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown KycStatus: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): KycStatus = apply {
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

                    return other is KycStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class PersonalInfo
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val address: JsonField<Address>,
                private val birthDate: JsonField<LocalDate>,
                private val firstName: JsonField<String>,
                private val identifier: JsonField<String>,
                private val idType: JsonField<IdType>,
                private val lastName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val countryOfIssuance: JsonField<String>,
                private val email: JsonField<String>,
                private val middleName: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("firstName")
                    @ExcludeMissing
                    firstName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("identifier")
                    @ExcludeMissing
                    identifier: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("idType")
                    @ExcludeMissing
                    idType: JsonField<IdType> = JsonMissing.of(),
                    @JsonProperty("lastName")
                    @ExcludeMissing
                    lastName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfIssuance")
                    @ExcludeMissing
                    countryOfIssuance: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("middleName")
                    @ExcludeMissing
                    middleName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    address,
                    birthDate,
                    firstName,
                    identifier,
                    idType,
                    lastName,
                    nationality,
                    countryOfIssuance,
                    email,
                    middleName,
                    phoneNumber,
                    mutableMapOf(),
                )

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun address(): Address = address.getRequired("address")

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * First name of the individual
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun firstName(): String = firstName.getRequired("firstName")

                /**
                 * The identification number or value
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun identifier(): String = identifier.getRequired("identifier")

                /**
                 * Type of personal identification document
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun idType(): IdType = idType.getRequired("idType")

                /**
                 * Last name of the individual
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun lastName(): String = lastName.getRequired("lastName")

                /**
                 * Country of nationality (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * Country that issued the identification (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfIssuance(): String? =
                    countryOfIssuance.getNullable("countryOfIssuance")

                /**
                 * Email address of the individual
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * Middle name of the individual
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun middleName(): String? = middleName.getNullable("middleName")

                /**
                 * Phone number in E.164 format
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [firstName].
                 *
                 * Unlike [firstName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("firstName")
                @ExcludeMissing
                fun _firstName(): JsonField<String> = firstName

                /**
                 * Returns the raw JSON value of [identifier].
                 *
                 * Unlike [identifier], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("identifier")
                @ExcludeMissing
                fun _identifier(): JsonField<String> = identifier

                /**
                 * Returns the raw JSON value of [idType].
                 *
                 * Unlike [idType], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("idType") @ExcludeMissing fun _idType(): JsonField<IdType> = idType

                /**
                 * Returns the raw JSON value of [lastName].
                 *
                 * Unlike [lastName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("lastName")
                @ExcludeMissing
                fun _lastName(): JsonField<String> = lastName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [countryOfIssuance].
                 *
                 * Unlike [countryOfIssuance], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfIssuance")
                @ExcludeMissing
                fun _countryOfIssuance(): JsonField<String> = countryOfIssuance

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

                /**
                 * Returns the raw JSON value of [middleName].
                 *
                 * Unlike [middleName], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("middleName")
                @ExcludeMissing
                fun _middleName(): JsonField<String> = middleName

                /**
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
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

                    /**
                     * Returns a mutable builder for constructing an instance of [PersonalInfo].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .address()
                     * .birthDate()
                     * .firstName()
                     * .identifier()
                     * .idType()
                     * .lastName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [PersonalInfo]. */
                class Builder internal constructor() {

                    private var address: JsonField<Address>? = null
                    private var birthDate: JsonField<LocalDate>? = null
                    private var firstName: JsonField<String>? = null
                    private var identifier: JsonField<String>? = null
                    private var idType: JsonField<IdType>? = null
                    private var lastName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var countryOfIssuance: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var middleName: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(personalInfo: PersonalInfo) = apply {
                        address = personalInfo.address
                        birthDate = personalInfo.birthDate
                        firstName = personalInfo.firstName
                        identifier = personalInfo.identifier
                        idType = personalInfo.idType
                        lastName = personalInfo.lastName
                        nationality = personalInfo.nationality
                        countryOfIssuance = personalInfo.countryOfIssuance
                        email = personalInfo.email
                        middleName = personalInfo.middleName
                        phoneNumber = personalInfo.phoneNumber
                        additionalProperties = personalInfo.additionalProperties.toMutableMap()
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** First name of the individual */
                    fun firstName(firstName: String) = firstName(JsonField.of(firstName))

                    /**
                     * Sets [Builder.firstName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.firstName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun firstName(firstName: JsonField<String>) = apply {
                        this.firstName = firstName
                    }

                    /** The identification number or value */
                    fun identifier(identifier: String) = identifier(JsonField.of(identifier))

                    /**
                     * Sets [Builder.identifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.identifier] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun identifier(identifier: JsonField<String>) = apply {
                        this.identifier = identifier
                    }

                    /** Type of personal identification document */
                    fun idType(idType: IdType) = idType(JsonField.of(idType))

                    /**
                     * Sets [Builder.idType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.idType] with a well-typed [IdType] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun idType(idType: JsonField<IdType>) = apply { this.idType = idType }

                    /** Last name of the individual */
                    fun lastName(lastName: String) = lastName(JsonField.of(lastName))

                    /**
                     * Sets [Builder.lastName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.lastName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun lastName(lastName: JsonField<String>) = apply { this.lastName = lastName }

                    /** Country of nationality (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    /** Country that issued the identification (ISO 3166-1 alpha-2) */
                    fun countryOfIssuance(countryOfIssuance: String) =
                        countryOfIssuance(JsonField.of(countryOfIssuance))

                    /**
                     * Sets [Builder.countryOfIssuance] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfIssuance] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfIssuance(countryOfIssuance: JsonField<String>) = apply {
                        this.countryOfIssuance = countryOfIssuance
                    }

                    /** Email address of the individual */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** Middle name of the individual */
                    fun middleName(middleName: String) = middleName(JsonField.of(middleName))

                    /**
                     * Sets [Builder.middleName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.middleName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun middleName(middleName: JsonField<String>) = apply {
                        this.middleName = middleName
                    }

                    /** Phone number in E.164 format */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PersonalInfo].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .address()
                     * .birthDate()
                     * .firstName()
                     * .identifier()
                     * .idType()
                     * .lastName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PersonalInfo =
                        PersonalInfo(
                            checkRequired("address", address),
                            checkRequired("birthDate", birthDate),
                            checkRequired("firstName", firstName),
                            checkRequired("identifier", identifier),
                            checkRequired("idType", idType),
                            checkRequired("lastName", lastName),
                            checkRequired("nationality", nationality),
                            countryOfIssuance,
                            email,
                            middleName,
                            phoneNumber,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): PersonalInfo = apply {
                    if (validated) {
                        return@apply
                    }

                    address().validate()
                    birthDate()
                    firstName()
                    identifier()
                    idType().validate()
                    lastName()
                    nationality()
                    countryOfIssuance()
                    email()
                    middleName()
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
                        (if (firstName.asKnown() == null) 0 else 1) +
                        (if (identifier.asKnown() == null) 0 else 1) +
                        (idType.asKnown()?.validity() ?: 0) +
                        (if (lastName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (countryOfIssuance.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (middleName.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1)

                /** Type of personal identification document */
                class IdType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val SSN = of("SSN")

                        val PASSPORT = of("PASSPORT")

                        val NATIONAL_ID = of("NATIONAL_ID")

                        val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

                        val TAX_ID = of("TAX_ID")

                        val ITIN = of("ITIN")

                        val CPF = of("CPF")

                        fun of(value: String) = IdType(JsonField.of(value))
                    }

                    /** An enum containing [IdType]'s known values. */
                    enum class Known {
                        SSN,
                        PASSPORT,
                        NATIONAL_ID,
                        DRIVERS_LICENSE,
                        TAX_ID,
                        ITIN,
                        CPF,
                    }

                    /**
                     * An enum containing [IdType]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [IdType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SSN,
                        PASSPORT,
                        NATIONAL_ID,
                        DRIVERS_LICENSE,
                        TAX_ID,
                        ITIN,
                        CPF,
                        /**
                         * An enum member indicating that [IdType] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SSN -> Value.SSN
                            PASSPORT -> Value.PASSPORT
                            NATIONAL_ID -> Value.NATIONAL_ID
                            DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                            TAX_ID -> Value.TAX_ID
                            ITIN -> Value.ITIN
                            CPF -> Value.CPF
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SSN -> Known.SSN
                            PASSPORT -> Known.PASSPORT
                            NATIONAL_ID -> Known.NATIONAL_ID
                            DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                            TAX_ID -> Known.TAX_ID
                            ITIN -> Known.ITIN
                            CPF -> Known.CPF
                            else ->
                                throw LightsparkGridInvalidDataException("Unknown IdType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
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
                        firstName == other.firstName &&
                        identifier == other.identifier &&
                        idType == other.idType &&
                        lastName == other.lastName &&
                        nationality == other.nationality &&
                        countryOfIssuance == other.countryOfIssuance &&
                        email == other.email &&
                        middleName == other.middleName &&
                        phoneNumber == other.phoneNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        address,
                        birthDate,
                        firstName,
                        identifier,
                        idType,
                        lastName,
                        nationality,
                        countryOfIssuance,
                        email,
                        middleName,
                        phoneNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PersonalInfo{address=$address, birthDate=$birthDate, firstName=$firstName, identifier=$identifier, idType=$idType, lastName=$lastName, nationality=$nationality, countryOfIssuance=$countryOfIssuance, email=$email, middleName=$middleName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
            }

            /** Role of the beneficial owner within the business */
            class Role @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    UBO,
                    DIRECTOR,
                    COMPANY_OFFICER,
                    CONTROL_PERSON,
                    TRUSTEE,
                    GENERAL_PARTNER,
                    /**
                     * An enum member indicating that [Role] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw LightsparkGridInvalidDataException("Value is not a String")

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

                return other is BeneficialOwner &&
                    id == other.id &&
                    createdAt == other.createdAt &&
                    customerId == other.customerId &&
                    kycStatus == other.kycStatus &&
                    ownershipPercentage == other.ownershipPercentage &&
                    personalInfo == other.personalInfo &&
                    roles == other.roles &&
                    updatedAt == other.updatedAt &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    id,
                    createdAt,
                    customerId,
                    kycStatus,
                    ownershipPercentage,
                    personalInfo,
                    roles,
                    updatedAt,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "BeneficialOwner{id=$id, createdAt=$createdAt, customerId=$customerId, kycStatus=$kycStatus, ownershipPercentage=$ownershipPercentage, personalInfo=$personalInfo, roles=$roles, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Business &&
                platformCustomerId == other.platformCustomerId &&
                umaAddress == other.umaAddress &&
                id == other.id &&
                createdAt == other.createdAt &&
                isDeleted == other.isDeleted &&
                updatedAt == other.updatedAt &&
                customerType == other.customerType &&
                address == other.address &&
                businessInfo == other.businessInfo &&
                kybStatus == other.kybStatus &&
                beneficialOwners == other.beneficialOwners &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                platformCustomerId,
                umaAddress,
                id,
                createdAt,
                isDeleted,
                updatedAt,
                customerType,
                address,
                businessInfo,
                kybStatus,
                beneficialOwners,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Business{platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, isDeleted=$isDeleted, updatedAt=$updatedAt, customerType=$customerType, address=$address, businessInfo=$businessInfo, kybStatus=$kybStatus, beneficialOwners=$beneficialOwners, additionalProperties=$additionalProperties}"
    }
}
