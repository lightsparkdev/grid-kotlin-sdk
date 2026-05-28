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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.beneficialowners.BeneficialOwnerPersonalInfo
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

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.lightspark.grid.core.JsonValue
     *
     * val result: String? = customerOneOf.accept(object : CustomerOneOf.Visitor<String?> {
     *     override fun visitIndividualCustomer(individualCustomer: IndividualCustomer): String? = individualCustomer.toString()
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
            individualCustomer != null -> visitor.visitIndividualCustomer(individualCustomer)
            businessCustomer != null -> visitor.visitBusinessCustomer(businessCustomer)
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
            val customerType = json.asObject()?.get("customerType")?.asString()

            when (customerType) {}

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
        private val customerType: JsonValue,
        private val platformCustomerId: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencies: JsonField<List<String>>,
        private val email: JsonField<String>,
        private val isDeleted: JsonField<Boolean>,
        private val region: JsonField<String>,
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
            customerType: JsonValue = JsonMissing.of(),
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
            @JsonProperty("currencies")
            @ExcludeMissing
            currencies: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isDeleted")
            @ExcludeMissing
            isDeleted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
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
            currencies,
            email,
            isDeleted,
            region,
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
                .currencies(currencies)
                .email(email)
                .isDeleted(isDeleted)
                .region(region)
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
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = individualCustomer.customerType().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("customerType") @ExcludeMissing fun _customerType(): JsonValue = customerType

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
         * List of currency codes enabled for this customer.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currencies(): List<String>? = currencies.getNullable("currencies")

        /**
         * Email address for the customer.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * Whether the customer is marked as deleted
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isDeleted(): Boolean? = isDeleted.getNullable("isDeleted")

        /**
         * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity and
         * regulatory jurisdiction.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun region(): String? = region.getNullable("region")

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
         * Returns the raw JSON value of [currencies].
         *
         * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencies")
        @ExcludeMissing
        fun _currencies(): JsonField<List<String>> = currencies

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [isDeleted].
         *
         * Unlike [isDeleted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isDeleted") @ExcludeMissing fun _isDeleted(): JsonField<Boolean> = isDeleted

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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

            private var customerType: JsonValue? = null
            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencies: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
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
                currencies = individualCustomer.currencies.map { it.toMutableList() }
                email = individualCustomer.email
                isDeleted = individualCustomer.isDeleted
                region = individualCustomer.region
                updatedAt = individualCustomer.updatedAt
                address = individualCustomer.address
                birthDate = individualCustomer.birthDate
                fullName = individualCustomer.fullName
                kycStatus = individualCustomer.kycStatus
                nationality = individualCustomer.nationality
                additionalProperties = individualCustomer.additionalProperties.toMutableMap()
            }

            fun customerType(customerType: JsonValue) = apply { this.customerType = customerType }

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

            /** List of currency codes enabled for this customer. */
            fun currencies(currencies: List<String>) = currencies(JsonField.of(currencies))

            /**
             * Sets [Builder.currencies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencies] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencies(currencies: JsonField<List<String>>) = apply {
                this.currencies = currencies.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [currencies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCurrency(currency: String) = apply {
                currencies =
                    (currencies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("currencies", it).add(currency)
                    }
            }

            /** Email address for the customer. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            /**
             * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity and
             * regulatory jurisdiction.
             */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

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
                    (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    isDeleted,
                    region,
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): IndividualCustomer = apply {
            if (validated) {
                return@apply
            }

            platformCustomerId()
            umaAddress()
            id()
            createdAt()
            currencies()
            email()
            isDeleted()
            region()
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
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (currencies.asKnown()?.size ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (region.asKnown() == null) 0 else 1) +
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
                currencies == other.currencies &&
                email == other.email &&
                isDeleted == other.isDeleted &&
                region == other.region &&
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
                currencies,
                email,
                isDeleted,
                region,
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
            "IndividualCustomer{customerType=$customerType, platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, currencies=$currencies, email=$email, isDeleted=$isDeleted, region=$region, updatedAt=$updatedAt, address=$address, birthDate=$birthDate, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, additionalProperties=$additionalProperties}"
    }

    class BusinessCustomer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customerType: JsonValue,
        private val platformCustomerId: JsonField<String>,
        private val umaAddress: JsonField<String>,
        private val id: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currencies: JsonField<List<String>>,
        private val email: JsonField<String>,
        private val isDeleted: JsonField<Boolean>,
        private val region: JsonField<String>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val address: JsonField<Address>,
        private val businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>,
        private val kybStatus: JsonField<BusinessCustomerFields.KybStatus>,
        private val beneficialOwners: JsonField<List<BeneficialOwner>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customerType")
            @ExcludeMissing
            customerType: JsonValue = JsonMissing.of(),
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
            @JsonProperty("currencies")
            @ExcludeMissing
            currencies: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
            @JsonProperty("isDeleted")
            @ExcludeMissing
            isDeleted: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
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
            customerType,
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            currencies,
            email,
            isDeleted,
            region,
            updatedAt,
            address,
            businessInfo,
            kybStatus,
            beneficialOwners,
            mutableMapOf(),
        )

        fun toCustomer(): Customer =
            Customer.builder()
                .customerType(customerType)
                .platformCustomerId(platformCustomerId)
                .umaAddress(umaAddress)
                .id(id)
                .createdAt(createdAt)
                .currencies(currencies)
                .email(email)
                .isDeleted(isDeleted)
                .region(region)
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
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```kotlin
         * val myObject: MyClass = businessCustomer.customerType().convert(MyClass::class.java)
         * ```
         */
        @JsonProperty("customerType") @ExcludeMissing fun _customerType(): JsonValue = customerType

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
         * List of currency codes enabled for this customer.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currencies(): List<String>? = currencies.getNullable("currencies")

        /**
         * Email address for the customer.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): String? = email.getNullable("email")

        /**
         * Whether the customer is marked as deleted
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun isDeleted(): Boolean? = isDeleted.getNullable("isDeleted")

        /**
         * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity and
         * regulatory jurisdiction.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun region(): String? = region.getNullable("region")

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
         * Returns the raw JSON value of [currencies].
         *
         * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currencies")
        @ExcludeMissing
        fun _currencies(): JsonField<List<String>> = currencies

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        /**
         * Returns the raw JSON value of [isDeleted].
         *
         * Unlike [isDeleted], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("isDeleted") @ExcludeMissing fun _isDeleted(): JsonField<Boolean> = isDeleted

        /**
         * Returns the raw JSON value of [region].
         *
         * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

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

            private var customerType: JsonValue? = null
            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currencies: JsonField<MutableList<String>>? = null
            private var email: JsonField<String> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var region: JsonField<String> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var address: JsonField<Address> = JsonMissing.of()
            private var businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> =
                JsonMissing.of()
            private var kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of()
            private var beneficialOwners: JsonField<MutableList<BeneficialOwner>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(businessCustomer: BusinessCustomer) = apply {
                customerType = businessCustomer.customerType
                platformCustomerId = businessCustomer.platformCustomerId
                umaAddress = businessCustomer.umaAddress
                id = businessCustomer.id
                createdAt = businessCustomer.createdAt
                currencies = businessCustomer.currencies.map { it.toMutableList() }
                email = businessCustomer.email
                isDeleted = businessCustomer.isDeleted
                region = businessCustomer.region
                updatedAt = businessCustomer.updatedAt
                address = businessCustomer.address
                businessInfo = businessCustomer.businessInfo
                kybStatus = businessCustomer.kybStatus
                beneficialOwners = businessCustomer.beneficialOwners.map { it.toMutableList() }
                additionalProperties = businessCustomer.additionalProperties.toMutableMap()
            }

            fun customerType(customerType: JsonValue) = apply { this.customerType = customerType }

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

            /** List of currency codes enabled for this customer. */
            fun currencies(currencies: List<String>) = currencies(JsonField.of(currencies))

            /**
             * Sets [Builder.currencies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currencies] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currencies(currencies: JsonField<List<String>>) = apply {
                this.currencies = currencies.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [currencies].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCurrency(currency: String) = apply {
                currencies =
                    (currencies ?: JsonField.of(mutableListOf())).also {
                        checkKnown("currencies", it).add(currency)
                    }
            }

            /** Email address for the customer. */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun email(email: JsonField<String>) = apply { this.email = email }

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

            /**
             * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity and
             * regulatory jurisdiction.
             */
            fun region(region: String) = region(JsonField.of(region))

            /**
             * Sets [Builder.region] to an arbitrary JSON value.
             *
             * You should usually call [Builder.region] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun region(region: JsonField<String>) = apply { this.region = region }

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
                    (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                    email,
                    isDeleted,
                    region,
                    updatedAt,
                    address,
                    businessInfo,
                    kybStatus,
                    (beneficialOwners ?: JsonMissing.of()).map { it.toImmutable() },
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
        fun validate(): BusinessCustomer = apply {
            if (validated) {
                return@apply
            }

            platformCustomerId()
            umaAddress()
            id()
            createdAt()
            currencies()
            email()
            isDeleted()
            region()
            updatedAt()
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
                (currencies.asKnown()?.size ?: 0) +
                (if (email.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (region.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
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
            private val personalInfo: JsonField<BeneficialOwnerPersonalInfo>,
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
                personalInfo: JsonField<BeneficialOwnerPersonalInfo> = JsonMissing.of(),
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
            fun personalInfo(): BeneficialOwnerPersonalInfo =
                personalInfo.getRequired("personalInfo")

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
            fun _personalInfo(): JsonField<BeneficialOwnerPersonalInfo> = personalInfo

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
                private var personalInfo: JsonField<BeneficialOwnerPersonalInfo>? = null
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

                fun personalInfo(personalInfo: BeneficialOwnerPersonalInfo) =
                    personalInfo(JsonField.of(personalInfo))

                /**
                 * Sets [Builder.personalInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.personalInfo] with a well-typed
                 * [BeneficialOwnerPersonalInfo] value instead. This method is primarily for setting
                 * the field to an undocumented or not yet supported value.
                 */
                fun personalInfo(personalInfo: JsonField<BeneficialOwnerPersonalInfo>) = apply {
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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

        /**
         * Business information returned on a customer. `taxId` and `incorporatedOn` are required on
         * creation but may be absent on legacy customers that pre-date the requirement, so both are
         * optional in responses.
         */
        class BusinessInfo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val legalName: JsonField<String>,
            private val businessType: JsonField<BusinessType>,
            private val countriesOfOperation: JsonField<List<String>>,
            private val country: JsonField<String>,
            private val doingBusinessAs: JsonField<String>,
            private val entityType: JsonField<EntityType>,
            private val expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount>,
            private val expectedMonthlyTransactionVolume:
                JsonField<ExpectedMonthlyTransactionVolume>,
            private val expectedRecipientJurisdictions: JsonField<List<String>>,
            private val incorporatedOn: JsonField<LocalDate>,
            private val purposeOfAccount: JsonField<PurposeOfAccount>,
            private val registrationNumber: JsonField<String>,
            private val sourceOfFunds: JsonField<String>,
            private val taxId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("legalName")
                @ExcludeMissing
                legalName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("businessType")
                @ExcludeMissing
                businessType: JsonField<BusinessType> = JsonMissing.of(),
                @JsonProperty("countriesOfOperation")
                @ExcludeMissing
                countriesOfOperation: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("doingBusinessAs")
                @ExcludeMissing
                doingBusinessAs: JsonField<String> = JsonMissing.of(),
                @JsonProperty("entityType")
                @ExcludeMissing
                entityType: JsonField<EntityType> = JsonMissing.of(),
                @JsonProperty("expectedMonthlyTransactionCount")
                @ExcludeMissing
                expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount> =
                    JsonMissing.of(),
                @JsonProperty("expectedMonthlyTransactionVolume")
                @ExcludeMissing
                expectedMonthlyTransactionVolume: JsonField<ExpectedMonthlyTransactionVolume> =
                    JsonMissing.of(),
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
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun legalName(): String = legalName.getRequired("legalName")

            /**
             * The high-level industry category of the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun businessType(): BusinessType? = businessType.getNullable("businessType")

            /**
             * List of countries where the business operates (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun countriesOfOperation(): List<String>? =
                countriesOfOperation.getNullable("countriesOfOperation")

            /**
             * Country of incorporation or registration (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun country(): String? = country.getNullable("country")

            /**
             * Trade name or DBA name of the business, if different from the legal name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun doingBusinessAs(): String? = doingBusinessAs.getNullable("doingBusinessAs")

            /**
             * Legal entity type of the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun entityType(): EntityType? = entityType.getNullable("entityType")

            /**
             * Expected number of transactions per month
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expectedMonthlyTransactionCount(): ExpectedMonthlyTransactionCount? =
                expectedMonthlyTransactionCount.getNullable("expectedMonthlyTransactionCount")

            /**
             * Expected total transaction volume per month in USD equivalent
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expectedMonthlyTransactionVolume(): ExpectedMonthlyTransactionVolume? =
                expectedMonthlyTransactionVolume.getNullable("expectedMonthlyTransactionVolume")

            /**
             * List of countries where the business expects to send payments (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun expectedRecipientJurisdictions(): List<String>? =
                expectedRecipientJurisdictions.getNullable("expectedRecipientJurisdictions")

            /**
             * Date of incorporation in ISO 8601 format (YYYY-MM-DD)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun incorporatedOn(): LocalDate? = incorporatedOn.getNullable("incorporatedOn")

            /**
             * The intended purpose for using the Grid account
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun purposeOfAccount(): PurposeOfAccount? =
                purposeOfAccount.getNullable("purposeOfAccount")

            /**
             * Business registration number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun registrationNumber(): String? = registrationNumber.getNullable("registrationNumber")

            /**
             * The primary source of funds for the business
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun sourceOfFunds(): String? = sourceOfFunds.getNullable("sourceOfFunds")

            /**
             * Tax identification number
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun taxId(): String? = taxId.getNullable("taxId")

            /**
             * Returns the raw JSON value of [legalName].
             *
             * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("legalName")
            @ExcludeMissing
            fun _legalName(): JsonField<String> = legalName

            /**
             * Returns the raw JSON value of [businessType].
             *
             * Unlike [businessType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("businessType")
            @ExcludeMissing
            fun _businessType(): JsonField<BusinessType> = businessType

            /**
             * Returns the raw JSON value of [countriesOfOperation].
             *
             * Unlike [countriesOfOperation], this method doesn't throw if the JSON field has an
             * unexpected type.
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
             * Unlike [doingBusinessAs], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("doingBusinessAs")
            @ExcludeMissing
            fun _doingBusinessAs(): JsonField<String> = doingBusinessAs

            /**
             * Returns the raw JSON value of [entityType].
             *
             * Unlike [entityType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("entityType")
            @ExcludeMissing
            fun _entityType(): JsonField<EntityType> = entityType

            /**
             * Returns the raw JSON value of [expectedMonthlyTransactionCount].
             *
             * Unlike [expectedMonthlyTransactionCount], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("expectedMonthlyTransactionCount")
            @ExcludeMissing
            fun _expectedMonthlyTransactionCount(): JsonField<ExpectedMonthlyTransactionCount> =
                expectedMonthlyTransactionCount

            /**
             * Returns the raw JSON value of [expectedMonthlyTransactionVolume].
             *
             * Unlike [expectedMonthlyTransactionVolume], this method doesn't throw if the JSON
             * field has an unexpected type.
             */
            @JsonProperty("expectedMonthlyTransactionVolume")
            @ExcludeMissing
            fun _expectedMonthlyTransactionVolume(): JsonField<ExpectedMonthlyTransactionVolume> =
                expectedMonthlyTransactionVolume

            /**
             * Returns the raw JSON value of [expectedRecipientJurisdictions].
             *
             * Unlike [expectedRecipientJurisdictions], this method doesn't throw if the JSON field
             * has an unexpected type.
             */
            @JsonProperty("expectedRecipientJurisdictions")
            @ExcludeMissing
            fun _expectedRecipientJurisdictions(): JsonField<List<String>> =
                expectedRecipientJurisdictions

            /**
             * Returns the raw JSON value of [incorporatedOn].
             *
             * Unlike [incorporatedOn], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("incorporatedOn")
            @ExcludeMissing
            fun _incorporatedOn(): JsonField<LocalDate> = incorporatedOn

            /**
             * Returns the raw JSON value of [purposeOfAccount].
             *
             * Unlike [purposeOfAccount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("purposeOfAccount")
            @ExcludeMissing
            fun _purposeOfAccount(): JsonField<PurposeOfAccount> = purposeOfAccount

            /**
             * Returns the raw JSON value of [registrationNumber].
             *
             * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("registrationNumber")
            @ExcludeMissing
            fun _registrationNumber(): JsonField<String> = registrationNumber

            /**
             * Returns the raw JSON value of [sourceOfFunds].
             *
             * Unlike [sourceOfFunds], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                private var expectedMonthlyTransactionCount:
                    JsonField<ExpectedMonthlyTransactionCount> =
                    JsonMissing.of()
                private var expectedMonthlyTransactionVolume:
                    JsonField<ExpectedMonthlyTransactionVolume> =
                    JsonMissing.of()
                private var expectedRecipientJurisdictions: JsonField<MutableList<String>>? = null
                private var incorporatedOn: JsonField<LocalDate> = JsonMissing.of()
                private var purposeOfAccount: JsonField<PurposeOfAccount> = JsonMissing.of()
                private var registrationNumber: JsonField<String> = JsonMissing.of()
                private var sourceOfFunds: JsonField<String> = JsonMissing.of()
                private var taxId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(businessInfo: BusinessInfo) = apply {
                    legalName = businessInfo.legalName
                    businessType = businessInfo.businessType
                    countriesOfOperation =
                        businessInfo.countriesOfOperation.map { it.toMutableList() }
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
                 * You should usually call [Builder.legalName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun legalName(legalName: JsonField<String>) = apply { this.legalName = legalName }

                /** The high-level industry category of the business */
                fun businessType(businessType: BusinessType) =
                    businessType(JsonField.of(businessType))

                /**
                 * Sets [Builder.businessType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessType] with a well-typed [BusinessType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.countriesOfOperation] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
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
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                /** Trade name or DBA name of the business, if different from the legal name */
                fun doingBusinessAs(doingBusinessAs: String) =
                    doingBusinessAs(JsonField.of(doingBusinessAs))

                /**
                 * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doingBusinessAs] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun entityType(entityType: JsonField<EntityType>) = apply {
                    this.entityType = entityType
                }

                /** Expected number of transactions per month */
                fun expectedMonthlyTransactionCount(
                    expectedMonthlyTransactionCount: ExpectedMonthlyTransactionCount
                ) = expectedMonthlyTransactionCount(JsonField.of(expectedMonthlyTransactionCount))

                /**
                 * Sets [Builder.expectedMonthlyTransactionCount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expectedMonthlyTransactionCount] with a
                 * well-typed [ExpectedMonthlyTransactionCount] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun expectedMonthlyTransactionCount(
                    expectedMonthlyTransactionCount: JsonField<ExpectedMonthlyTransactionCount>
                ) = apply { this.expectedMonthlyTransactionCount = expectedMonthlyTransactionCount }

                /** Expected total transaction volume per month in USD equivalent */
                fun expectedMonthlyTransactionVolume(
                    expectedMonthlyTransactionVolume: ExpectedMonthlyTransactionVolume
                ) = expectedMonthlyTransactionVolume(JsonField.of(expectedMonthlyTransactionVolume))

                /**
                 * Sets [Builder.expectedMonthlyTransactionVolume] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expectedMonthlyTransactionVolume] with a
                 * well-typed [ExpectedMonthlyTransactionVolume] value instead. This method is
                 * primarily for setting the field to an undocumented or not yet supported value.
                 */
                fun expectedMonthlyTransactionVolume(
                    expectedMonthlyTransactionVolume: JsonField<ExpectedMonthlyTransactionVolume>
                ) = apply {
                    this.expectedMonthlyTransactionVolume = expectedMonthlyTransactionVolume
                }

                /**
                 * List of countries where the business expects to send payments (ISO 3166-1
                 * alpha-2)
                 */
                fun expectedRecipientJurisdictions(expectedRecipientJurisdictions: List<String>) =
                    expectedRecipientJurisdictions(JsonField.of(expectedRecipientJurisdictions))

                /**
                 * Sets [Builder.expectedRecipientJurisdictions] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.expectedRecipientJurisdictions] with a
                 * well-typed `List<String>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
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
                fun addExpectedRecipientJurisdiction(expectedRecipientJurisdiction: String) =
                    apply {
                        expectedRecipientJurisdictions =
                            (expectedRecipientJurisdictions ?: JsonField.of(mutableListOf())).also {
                                checkKnown("expectedRecipientJurisdictions", it)
                                    .add(expectedRecipientJurisdiction)
                            }
                    }

                /** Date of incorporation in ISO 8601 format (YYYY-MM-DD) */
                fun incorporatedOn(incorporatedOn: LocalDate) =
                    incorporatedOn(JsonField.of(incorporatedOn))

                /**
                 * Sets [Builder.incorporatedOn] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.incorporatedOn] with a well-typed [LocalDate]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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
                 * You should usually call [Builder.purposeOfAccount] with a well-typed
                 * [PurposeOfAccount] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
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
                 * You should usually call [Builder.registrationNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                    this.registrationNumber = registrationNumber
                }

                /** The primary source of funds for the business */
                fun sourceOfFunds(sourceOfFunds: String) =
                    sourceOfFunds(JsonField.of(sourceOfFunds))

                /**
                 * Sets [Builder.sourceOfFunds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceOfFunds] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceOfFunds(sourceOfFunds: JsonField<String>) = apply {
                    this.sourceOfFunds = sourceOfFunds
                }

                /** Tax identification number */
                fun taxId(taxId: String) = taxId(JsonField.of(taxId))

                /**
                 * Sets [Builder.taxId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxId] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
                        (expectedRecipientJurisdictions ?: JsonMissing.of()).map {
                            it.toImmutable()
                        },
                        incorporatedOn,
                        purposeOfAccount,
                        registrationNumber,
                        sourceOfFunds,
                        taxId,
                        additionalProperties.toMutableMap(),
                    )
            }

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
                expectedMonthlyTransactionCount()?.validate()
                expectedMonthlyTransactionVolume()?.validate()
                expectedRecipientJurisdictions()
                incorporatedOn()
                purposeOfAccount()?.validate()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
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
                    (expectedMonthlyTransactionCount.asKnown()?.validity() ?: 0) +
                    (expectedMonthlyTransactionVolume.asKnown()?.validity() ?: 0) +
                    (expectedRecipientJurisdictions.asKnown()?.size ?: 0) +
                    (if (incorporatedOn.asKnown() == null) 0 else 1) +
                    (purposeOfAccount.asKnown()?.validity() ?: 0) +
                    (if (registrationNumber.asKnown() == null) 0 else 1) +
                    (if (sourceOfFunds.asKnown() == null) 0 else 1) +
                    (if (taxId.asKnown() == null) 0 else 1)

            /** The high-level industry category of the business */
            class BusinessType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val REAL_ESTATE_AND_RENTAL_AND_LEASING =
                        of("REAL_ESTATE_AND_RENTAL_AND_LEASING")

                    val PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES =
                        of("PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES")

                    val MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES =
                        of("MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES")

                    val ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES =
                        of(
                            "ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES"
                        )

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
                 * An enum containing [BusinessType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BusinessType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [BusinessType] was instantiated with an
                     * unknown value.
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
                        REAL_ESTATE_AND_RENTAL_AND_LEASING ->
                            Value.REAL_ESTATE_AND_RENTAL_AND_LEASING
                        PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES ->
                            Value.PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES
                        MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES ->
                            Value.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
                        ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES ->
                            Value
                                .ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                        REAL_ESTATE_AND_RENTAL_AND_LEASING ->
                            Known.REAL_ESTATE_AND_RENTAL_AND_LEASING
                        PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES ->
                            Known.PROFESSIONAL_SCIENTIFIC_AND_TECHNICAL_SERVICES
                        MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES ->
                            Known.MANAGEMENT_OF_COMPANIES_AND_ENTERPRISES
                        ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES ->
                            Known
                                .ADMINISTRATIVE_AND_SUPPORT_AND_WASTE_MANAGEMENT_AND_REMEDIATION_SERVICES
                        EDUCATIONAL_SERVICES -> Known.EDUCATIONAL_SERVICES
                        HEALTH_CARE_AND_SOCIAL_ASSISTANCE -> Known.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
                        ARTS_ENTERTAINMENT_AND_RECREATION -> Known.ARTS_ENTERTAINMENT_AND_RECREATION
                        ACCOMMODATION_AND_FOOD_SERVICES -> Known.ACCOMMODATION_AND_FOOD_SERVICES
                        OTHER_SERVICES -> Known.OTHER_SERVICES
                        PUBLIC_ADMINISTRATION -> Known.PUBLIC_ADMINISTRATION
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown BusinessType: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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
            class EntityType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
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
                     * An enum member indicating that [EntityType] was instantiated with an unknown
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
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
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
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown EntityType: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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

            /** Expected number of transactions per month */
            class ExpectedMonthlyTransactionCount
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val COUNT_UNDER_10 = of("COUNT_UNDER_10")

                    val COUNT_10_TO_100 = of("COUNT_10_TO_100")

                    val COUNT_100_TO_500 = of("COUNT_100_TO_500")

                    val COUNT_500_TO_1000 = of("COUNT_500_TO_1000")

                    val COUNT_OVER_1000 = of("COUNT_OVER_1000")

                    fun of(value: String) = ExpectedMonthlyTransactionCount(JsonField.of(value))
                }

                /** An enum containing [ExpectedMonthlyTransactionCount]'s known values. */
                enum class Known {
                    COUNT_UNDER_10,
                    COUNT_10_TO_100,
                    COUNT_100_TO_500,
                    COUNT_500_TO_1000,
                    COUNT_OVER_1000,
                }

                /**
                 * An enum containing [ExpectedMonthlyTransactionCount]'s known values, as well as
                 * an [_UNKNOWN] member.
                 *
                 * An instance of [ExpectedMonthlyTransactionCount] can contain an unknown value in
                 * a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COUNT_UNDER_10,
                    COUNT_10_TO_100,
                    COUNT_100_TO_500,
                    COUNT_500_TO_1000,
                    COUNT_OVER_1000,
                    /**
                     * An enum member indicating that [ExpectedMonthlyTransactionCount] was
                     * instantiated with an unknown value.
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
                        COUNT_UNDER_10 -> Value.COUNT_UNDER_10
                        COUNT_10_TO_100 -> Value.COUNT_10_TO_100
                        COUNT_100_TO_500 -> Value.COUNT_100_TO_500
                        COUNT_500_TO_1000 -> Value.COUNT_500_TO_1000
                        COUNT_OVER_1000 -> Value.COUNT_OVER_1000
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
                        COUNT_UNDER_10 -> Known.COUNT_UNDER_10
                        COUNT_10_TO_100 -> Known.COUNT_10_TO_100
                        COUNT_100_TO_500 -> Known.COUNT_100_TO_500
                        COUNT_500_TO_1000 -> Known.COUNT_500_TO_1000
                        COUNT_OVER_1000 -> Known.COUNT_OVER_1000
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown ExpectedMonthlyTransactionCount: $value"
                            )
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): ExpectedMonthlyTransactionCount = apply {
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

                    return other is ExpectedMonthlyTransactionCount && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Expected total transaction volume per month in USD equivalent */
            class ExpectedMonthlyTransactionVolume
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val VOLUME_UNDER_10_K = of("VOLUME_UNDER_10K")

                    val VOLUME_10_K_TO_100_K = of("VOLUME_10K_TO_100K")

                    val VOLUME_100_K_TO_1_M = of("VOLUME_100K_TO_1M")

                    val VOLUME_1_M_TO_10_M = of("VOLUME_1M_TO_10M")

                    val VOLUME_OVER_10_M = of("VOLUME_OVER_10M")

                    fun of(value: String) = ExpectedMonthlyTransactionVolume(JsonField.of(value))
                }

                /** An enum containing [ExpectedMonthlyTransactionVolume]'s known values. */
                enum class Known {
                    VOLUME_UNDER_10_K,
                    VOLUME_10_K_TO_100_K,
                    VOLUME_100_K_TO_1_M,
                    VOLUME_1_M_TO_10_M,
                    VOLUME_OVER_10_M,
                }

                /**
                 * An enum containing [ExpectedMonthlyTransactionVolume]'s known values, as well as
                 * an [_UNKNOWN] member.
                 *
                 * An instance of [ExpectedMonthlyTransactionVolume] can contain an unknown value in
                 * a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    VOLUME_UNDER_10_K,
                    VOLUME_10_K_TO_100_K,
                    VOLUME_100_K_TO_1_M,
                    VOLUME_1_M_TO_10_M,
                    VOLUME_OVER_10_M,
                    /**
                     * An enum member indicating that [ExpectedMonthlyTransactionVolume] was
                     * instantiated with an unknown value.
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
                        VOLUME_UNDER_10_K -> Value.VOLUME_UNDER_10_K
                        VOLUME_10_K_TO_100_K -> Value.VOLUME_10_K_TO_100_K
                        VOLUME_100_K_TO_1_M -> Value.VOLUME_100_K_TO_1_M
                        VOLUME_1_M_TO_10_M -> Value.VOLUME_1_M_TO_10_M
                        VOLUME_OVER_10_M -> Value.VOLUME_OVER_10_M
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
                        VOLUME_UNDER_10_K -> Known.VOLUME_UNDER_10_K
                        VOLUME_10_K_TO_100_K -> Known.VOLUME_10_K_TO_100_K
                        VOLUME_100_K_TO_1_M -> Known.VOLUME_100_K_TO_1_M
                        VOLUME_1_M_TO_10_M -> Known.VOLUME_1_M_TO_10_M
                        VOLUME_OVER_10_M -> Known.VOLUME_OVER_10_M
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown ExpectedMonthlyTransactionVolume: $value"
                            )
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): ExpectedMonthlyTransactionVolume = apply {
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

                    return other is ExpectedMonthlyTransactionVolume && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The intended purpose for using the Grid account */
            class PurposeOfAccount
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

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

                    val CONTRACTOR_PAYOUTS = of("CONTRACTOR_PAYOUTS")

                    val CREATOR_PAYOUTS = of("CREATOR_PAYOUTS")

                    val EMPLOYEE_PAYOUTS = of("EMPLOYEE_PAYOUTS")

                    val MARKETPLACE_SELLER_PAYOUTS = of("MARKETPLACE_SELLER_PAYOUTS")

                    val SUPPLIER_PAYMENTS = of("SUPPLIER_PAYMENTS")

                    val CROSS_BORDER_B2_B = of("CROSS_BORDER_B2B")

                    val AR_AUTOMATION = of("AR_AUTOMATION")

                    val AP_AUTOMATION = of("AP_AUTOMATION")

                    val EMBEDDED_PAYMENTS = of("EMBEDDED_PAYMENTS")

                    val PLATFORM_FEE_COLLECTION = of("PLATFORM_FEE_COLLECTION")

                    val P2_P_TRANSFERS = of("P2P_TRANSFERS")

                    val CHARITABLE_DONATIONS = of("CHARITABLE_DONATIONS")

                    val OTHER = of("OTHER")

                    fun of(value: String) = PurposeOfAccount(JsonField.of(value))
                }

                /** An enum containing [PurposeOfAccount]'s known values. */
                enum class Known {
                    CONTRACTOR_PAYOUTS,
                    CREATOR_PAYOUTS,
                    EMPLOYEE_PAYOUTS,
                    MARKETPLACE_SELLER_PAYOUTS,
                    SUPPLIER_PAYMENTS,
                    CROSS_BORDER_B2_B,
                    AR_AUTOMATION,
                    AP_AUTOMATION,
                    EMBEDDED_PAYMENTS,
                    PLATFORM_FEE_COLLECTION,
                    P2_P_TRANSFERS,
                    CHARITABLE_DONATIONS,
                    OTHER,
                }

                /**
                 * An enum containing [PurposeOfAccount]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PurposeOfAccount] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CONTRACTOR_PAYOUTS,
                    CREATOR_PAYOUTS,
                    EMPLOYEE_PAYOUTS,
                    MARKETPLACE_SELLER_PAYOUTS,
                    SUPPLIER_PAYMENTS,
                    CROSS_BORDER_B2_B,
                    AR_AUTOMATION,
                    AP_AUTOMATION,
                    EMBEDDED_PAYMENTS,
                    PLATFORM_FEE_COLLECTION,
                    P2_P_TRANSFERS,
                    CHARITABLE_DONATIONS,
                    OTHER,
                    /**
                     * An enum member indicating that [PurposeOfAccount] was instantiated with an
                     * unknown value.
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
                        CONTRACTOR_PAYOUTS -> Value.CONTRACTOR_PAYOUTS
                        CREATOR_PAYOUTS -> Value.CREATOR_PAYOUTS
                        EMPLOYEE_PAYOUTS -> Value.EMPLOYEE_PAYOUTS
                        MARKETPLACE_SELLER_PAYOUTS -> Value.MARKETPLACE_SELLER_PAYOUTS
                        SUPPLIER_PAYMENTS -> Value.SUPPLIER_PAYMENTS
                        CROSS_BORDER_B2_B -> Value.CROSS_BORDER_B2_B
                        AR_AUTOMATION -> Value.AR_AUTOMATION
                        AP_AUTOMATION -> Value.AP_AUTOMATION
                        EMBEDDED_PAYMENTS -> Value.EMBEDDED_PAYMENTS
                        PLATFORM_FEE_COLLECTION -> Value.PLATFORM_FEE_COLLECTION
                        P2_P_TRANSFERS -> Value.P2_P_TRANSFERS
                        CHARITABLE_DONATIONS -> Value.CHARITABLE_DONATIONS
                        OTHER -> Value.OTHER
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
                        CONTRACTOR_PAYOUTS -> Known.CONTRACTOR_PAYOUTS
                        CREATOR_PAYOUTS -> Known.CREATOR_PAYOUTS
                        EMPLOYEE_PAYOUTS -> Known.EMPLOYEE_PAYOUTS
                        MARKETPLACE_SELLER_PAYOUTS -> Known.MARKETPLACE_SELLER_PAYOUTS
                        SUPPLIER_PAYMENTS -> Known.SUPPLIER_PAYMENTS
                        CROSS_BORDER_B2_B -> Known.CROSS_BORDER_B2_B
                        AR_AUTOMATION -> Known.AR_AUTOMATION
                        AP_AUTOMATION -> Known.AP_AUTOMATION
                        EMBEDDED_PAYMENTS -> Known.EMBEDDED_PAYMENTS
                        PLATFORM_FEE_COLLECTION -> Known.PLATFORM_FEE_COLLECTION
                        P2_P_TRANSFERS -> Known.P2_P_TRANSFERS
                        CHARITABLE_DONATIONS -> Known.CHARITABLE_DONATIONS
                        OTHER -> Known.OTHER
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown PurposeOfAccount: $value"
                            )
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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
                currencies == other.currencies &&
                email == other.email &&
                isDeleted == other.isDeleted &&
                region == other.region &&
                updatedAt == other.updatedAt &&
                address == other.address &&
                businessInfo == other.businessInfo &&
                kybStatus == other.kybStatus &&
                beneficialOwners == other.beneficialOwners &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerType,
                platformCustomerId,
                umaAddress,
                id,
                createdAt,
                currencies,
                email,
                isDeleted,
                region,
                updatedAt,
                address,
                businessInfo,
                kybStatus,
                beneficialOwners,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BusinessCustomer{customerType=$customerType, platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, currencies=$currencies, email=$email, isDeleted=$isDeleted, region=$region, updatedAt=$updatedAt, address=$address, businessInfo=$businessInfo, kybStatus=$kybStatus, beneficialOwners=$beneficialOwners, additionalProperties=$additionalProperties}"
    }
}
