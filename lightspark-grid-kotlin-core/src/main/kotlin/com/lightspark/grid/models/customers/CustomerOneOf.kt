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
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.allMaxBy
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
    private val individualCustomer: IndividualCustomer? = null,
    private val businessCustomer: BusinessCustomer? = null,
    private val _json: JsonValue? = null,
) {

    fun individualCustomer(): IndividualCustomer? = individualCustomer

    fun businessCustomer(): BusinessCustomer? = businessCustomer

    fun isIndividualCustomer(): Boolean = individualCustomer != null

    fun isBusinessCustomer(): Boolean = businessCustomer != null

    fun asIndividualCustomer(): IndividualCustomer =
        individualCustomer.getOrThrow("individualCustomer")

    fun asBusinessCustomer(): BusinessCustomer = businessCustomer.getOrThrow("businessCustomer")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            individualCustomer != null -> visitor.visitIndividualCustomer(individualCustomer)
            businessCustomer != null -> visitor.visitBusinessCustomer(businessCustomer)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): CustomerOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitIndividualCustomer(individualCustomer: IndividualCustomer) {
                    individualCustomer.validate()
                }

                override fun visitBusinessCustomer(businessCustomer: BusinessCustomer) {
                    businessCustomer.validate()
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
                override fun visitIndividualCustomer(individualCustomer: IndividualCustomer) =
                    individualCustomer.validity()

                override fun visitBusinessCustomer(businessCustomer: BusinessCustomer) =
                    businessCustomer.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerOneOf &&
            individualCustomer == other.individualCustomer &&
            businessCustomer == other.businessCustomer
    }

    override fun hashCode(): Int = Objects.hash(individualCustomer, businessCustomer)

    override fun toString(): String =
        when {
            individualCustomer != null -> "CustomerOneOf{individualCustomer=$individualCustomer}"
            businessCustomer != null -> "CustomerOneOf{businessCustomer=$businessCustomer}"
            _json != null -> "CustomerOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid CustomerOneOf")
        }

    companion object {

        fun ofIndividualCustomer(individualCustomer: IndividualCustomer) =
            CustomerOneOf(individualCustomer = individualCustomer)

        fun ofBusinessCustomer(businessCustomer: BusinessCustomer) =
            CustomerOneOf(businessCustomer = businessCustomer)
    }

    /**
     * An interface that defines how to map each variant of [CustomerOneOf] to a value of type [T].
     */
    interface Visitor<out T> {

        fun visitIndividualCustomer(individualCustomer: IndividualCustomer): T

        fun visitBusinessCustomer(businessCustomer: BusinessCustomer): T

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

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<IndividualCustomer>())?.let {
                            CustomerOneOf(individualCustomer = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BusinessCustomer>())?.let {
                            CustomerOneOf(businessCustomer = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> CustomerOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer : BaseSerializer<CustomerOneOf>(CustomerOneOf::class) {

        override fun serialize(
            value: CustomerOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.individualCustomer != null -> generator.writeObject(value.individualCustomer)
                value.businessCustomer != null -> generator.writeObject(value.businessCustomer)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid CustomerOneOf")
            }
        }
    }

    class IndividualCustomer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerType: JsonField<CustomerType>,
        private val platformCustomerId: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val isDeleted: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val address: JsonField<Address>,
        private val birthDate: JsonField<LocalDate>,
        private val fullName: JsonField<String>,
        private val kycStatus: JsonField<IndividualCustomerFields.KycStatus>,
        private val nationality: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customerType")
            @ExcludeMissing
            customerType: JsonField<CustomerType> = JsonMissing.of(),
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
            customerType,
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            isDeleted,
            updatedAt,
            address,
            birthDate,
            fullName,
            kycStatus,
            nationality,
            mutableMapOf(),
        )

        fun toCustomer(): Customer =
            Customer.builder()
                .customerType(customerType)
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
         * Whether the customer is an individual or a business entity
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerType(): CustomerType = customerType.getRequired("customerType")

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
         * Returns the raw JSON value of [customerType].
         *
         * Unlike [customerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customerType")
        @ExcludeMissing
        fun _customerType(): JsonField<CustomerType> = customerType

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
             * Returns a mutable builder for constructing an instance of [IndividualCustomer].
             *
             * The following fields are required:
             * ```kotlin
             * .customerType()
             * .platformCustomerId()
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [IndividualCustomer]. */
        class Builder internal constructor() {

            private var customerType: JsonField<CustomerType>? = null
            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var birthDate: JsonField<LocalDate> = JsonMissing.of()
            private var fullName: JsonField<String> = JsonMissing.of()
            private var kycStatus: JsonField<IndividualCustomerFields.KycStatus> = JsonMissing.of()
            private var nationality: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(individualCustomer: IndividualCustomer) = apply {
                customerType = individualCustomer.customerType
                platformCustomerId = individualCustomer.platformCustomerId
                umaAddress = individualCustomer.umaAddress
                id = individualCustomer.id
                createdAt = individualCustomer.createdAt
                isDeleted = individualCustomer.isDeleted
                updatedAt = individualCustomer.updatedAt
                address = individualCustomer.address
                birthDate = individualCustomer.birthDate
                fullName = individualCustomer.fullName
                kycStatus = individualCustomer.kycStatus
                nationality = individualCustomer.nationality
                additionalProperties = individualCustomer.additionalProperties.toMutableMap()
            }

            /** Whether the customer is an individual or a business entity */
            fun customerType(customerType: CustomerType) = customerType(JsonField.of(customerType))

            /**
             * Sets [Builder.customerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerType] with a well-typed [CustomerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerType(customerType: JsonField<CustomerType>) = apply {
                this.customerType = customerType
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
             * Returns an immutable instance of [IndividualCustomer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .customerType()
             * .platformCustomerId()
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): IndividualCustomer =
                IndividualCustomer(
                    checkRequired("customerType", customerType),
                    checkRequired("platformCustomerId", platformCustomerId),
                    checkRequired("umaAddress", umaAddress),
                    id,
                    createdAt,
                    isDeleted,
                    updatedAt,
                    address,
                    birthDate,
                    fullName,
                    kycStatus,
                    nationality,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): IndividualCustomer = apply {
            if (validated) {
                return@apply
            }

            customerType().validate()
            platformCustomerId()
            umaAddress()
            id()
            createdAt()
            isDeleted()
            updatedAt()
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
            (customerType.asKnown()?.validity() ?: 0) +
                (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (address.asKnown()?.validity() ?: 0) +
                (if (birthDate.asKnown() == null) 0 else 1) +
                (if (fullName.asKnown() == null) 0 else 1) +
                (kycStatus.asKnown()?.validity() ?: 0) +
                (if (nationality.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is IndividualCustomer &&
                customerType == other.customerType &&
                platformCustomerId == other.platformCustomerId &&
                umaAddress == other.umaAddress &&
                id == other.id &&
                createdAt == other.createdAt &&
                isDeleted == other.isDeleted &&
                updatedAt == other.updatedAt &&
                address == other.address &&
                birthDate == other.birthDate &&
                fullName == other.fullName &&
                kycStatus == other.kycStatus &&
                nationality == other.nationality &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerType,
                platformCustomerId,
                umaAddress,
                id,
                createdAt,
                isDeleted,
                updatedAt,
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
            "IndividualCustomer{customerType=$customerType, platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, isDeleted=$isDeleted, updatedAt=$updatedAt, address=$address, birthDate=$birthDate, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, additionalProperties=$additionalProperties}"
    }

    class BusinessCustomer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerType: JsonField<CustomerType>,
        private val platformCustomerId: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val isDeleted: JsonField<Boolean>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val address: JsonField<Address>,
        private val beneficialOwners: JsonField<List<BusinessCustomerFields.BeneficialOwner>>,
        private val businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>,
        private val kybStatus: JsonField<BusinessCustomerFields.KybStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customerType")
            @ExcludeMissing
            customerType: JsonField<CustomerType> = JsonMissing.of(),
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
            @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
            @JsonProperty("beneficialOwners")
            @ExcludeMissing
            beneficialOwners: JsonField<List<BusinessCustomerFields.BeneficialOwner>> =
                JsonMissing.of(),
            @JsonProperty("businessInfo")
            @ExcludeMissing
            businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> = JsonMissing.of(),
            @JsonProperty("kybStatus")
            @ExcludeMissing
            kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of(),
        ) : this(
            customerType,
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            isDeleted,
            updatedAt,
            address,
            beneficialOwners,
            businessInfo,
            kybStatus,
            mutableMapOf(),
        )

        fun toCustomer(): Customer =
            Customer.builder()
                .customerType(customerType)
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
                .beneficialOwners(beneficialOwners)
                .businessInfo(businessInfo)
                .kybStatus(kybStatus)
                .build()

        /**
         * Whether the customer is an individual or a business entity
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerType(): CustomerType = customerType.getRequired("customerType")

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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun address(): Address? = address.getNullable("address")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun beneficialOwners(): List<BusinessCustomerFields.BeneficialOwner>? =
            beneficialOwners.getNullable("beneficialOwners")

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
         * Returns the raw JSON value of [customerType].
         *
         * Unlike [customerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("customerType")
        @ExcludeMissing
        fun _customerType(): JsonField<CustomerType> = customerType

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
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

        /**
         * Returns the raw JSON value of [beneficialOwners].
         *
         * Unlike [beneficialOwners], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("beneficialOwners")
        @ExcludeMissing
        fun _beneficialOwners(): JsonField<List<BusinessCustomerFields.BeneficialOwner>> =
            beneficialOwners

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
             * Returns a mutable builder for constructing an instance of [BusinessCustomer].
             *
             * The following fields are required:
             * ```kotlin
             * .customerType()
             * .platformCustomerId()
             * .umaAddress()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BusinessCustomer]. */
        class Builder internal constructor() {

            private var customerType: JsonField<CustomerType>? = null
            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var beneficialOwners:
                JsonField<MutableList<BusinessCustomerFields.BeneficialOwner>>? =
                null
            private var businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> =
                JsonMissing.of()
            private var kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(businessCustomer: BusinessCustomer) = apply {
                customerType = businessCustomer.customerType
                platformCustomerId = businessCustomer.platformCustomerId
                umaAddress = businessCustomer.umaAddress
                id = businessCustomer.id
                createdAt = businessCustomer.createdAt
                isDeleted = businessCustomer.isDeleted
                updatedAt = businessCustomer.updatedAt
                address = businessCustomer.address
                beneficialOwners = businessCustomer.beneficialOwners.map { it.toMutableList() }
                businessInfo = businessCustomer.businessInfo
                kybStatus = businessCustomer.kybStatus
                additionalProperties = businessCustomer.additionalProperties.toMutableMap()
            }

            /** Whether the customer is an individual or a business entity */
            fun customerType(customerType: CustomerType) = customerType(JsonField.of(customerType))

            /**
             * Sets [Builder.customerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerType] with a well-typed [CustomerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerType(customerType: JsonField<CustomerType>) = apply {
                this.customerType = customerType
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

            fun address(address: Address) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [Address] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<Address>) = apply { this.address = address }

            fun beneficialOwners(beneficialOwners: List<BusinessCustomerFields.BeneficialOwner>) =
                beneficialOwners(JsonField.of(beneficialOwners))

            /**
             * Sets [Builder.beneficialOwners] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficialOwners] with a well-typed
             * `List<BusinessCustomerFields.BeneficialOwner>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun beneficialOwners(
                beneficialOwners: JsonField<List<BusinessCustomerFields.BeneficialOwner>>
            ) = apply { this.beneficialOwners = beneficialOwners.map { it.toMutableList() } }

            /**
             * Adds a single [BusinessCustomerFields.BeneficialOwner] to [beneficialOwners].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBeneficialOwner(beneficialOwner: BusinessCustomerFields.BeneficialOwner) =
                apply {
                    beneficialOwners =
                        (beneficialOwners ?: JsonField.of(mutableListOf())).also {
                            checkKnown("beneficialOwners", it).add(beneficialOwner)
                        }
                }

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
             * Returns an immutable instance of [BusinessCustomer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .customerType()
             * .platformCustomerId()
             * .umaAddress()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BusinessCustomer =
                BusinessCustomer(
                    checkRequired("customerType", customerType),
                    checkRequired("platformCustomerId", platformCustomerId),
                    checkRequired("umaAddress", umaAddress),
                    id,
                    createdAt,
                    isDeleted,
                    updatedAt,
                    address,
                    (beneficialOwners ?: JsonMissing.of()).map { it.toImmutable() },
                    businessInfo,
                    kybStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BusinessCustomer = apply {
            if (validated) {
                return@apply
            }

            customerType().validate()
            platformCustomerId()
            umaAddress()
            id()
            createdAt()
            isDeleted()
            updatedAt()
            address()?.validate()
            beneficialOwners()?.forEach { it.validate() }
            businessInfo()?.validate()
            kybStatus()?.validate()
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
            (customerType.asKnown()?.validity() ?: 0) +
                (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (address.asKnown()?.validity() ?: 0) +
                (beneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (businessInfo.asKnown()?.validity() ?: 0) +
                (kybStatus.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BusinessCustomer &&
                customerType == other.customerType &&
                platformCustomerId == other.platformCustomerId &&
                umaAddress == other.umaAddress &&
                id == other.id &&
                createdAt == other.createdAt &&
                isDeleted == other.isDeleted &&
                updatedAt == other.updatedAt &&
                address == other.address &&
                beneficialOwners == other.beneficialOwners &&
                businessInfo == other.businessInfo &&
                kybStatus == other.kybStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerType,
                platformCustomerId,
                umaAddress,
                id,
                createdAt,
                isDeleted,
                updatedAt,
                address,
                beneficialOwners,
                businessInfo,
                kybStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BusinessCustomer{customerType=$customerType, platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, isDeleted=$isDeleted, updatedAt=$updatedAt, address=$address, beneficialOwners=$beneficialOwners, businessInfo=$businessInfo, kybStatus=$kybStatus, additionalProperties=$additionalProperties}"
    }
}
