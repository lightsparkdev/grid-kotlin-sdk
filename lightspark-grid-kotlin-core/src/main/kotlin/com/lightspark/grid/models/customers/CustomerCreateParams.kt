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
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/** Register a new customer in the system with an account identifier and bank account information */
class CustomerCreateParams
private constructor(
    private val createCustomerRequest: CreateCustomerRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun createCustomerRequest(): CreateCustomerRequest = createCustomerRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .createCustomerRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerCreateParams]. */
    class Builder internal constructor() {

        private var createCustomerRequest: CreateCustomerRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            createCustomerRequest = customerCreateParams.createCustomerRequest
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
        }

        fun createCustomerRequest(createCustomerRequest: CreateCustomerRequest) = apply {
            this.createCustomerRequest = createCustomerRequest
        }

        /**
         * Alias for calling [createCustomerRequest] with
         * `CreateCustomerRequest.ofIndividual(individual)`.
         */
        fun createCustomerRequest(individual: CreateCustomerRequest.Individual) =
            createCustomerRequest(CreateCustomerRequest.ofIndividual(individual))

        /**
         * Alias for calling [createCustomerRequest] with the following:
         * ```kotlin
         * CreateCustomerRequest.Individual.builder()
         *     .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
         *     .platformCustomerId(platformCustomerId)
         *     .build()
         * ```
         */
        fun individualCreateCustomerRequest(platformCustomerId: String) =
            createCustomerRequest(
                CreateCustomerRequest.Individual.builder()
                    .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
                    .platformCustomerId(platformCustomerId)
                    .build()
            )

        /**
         * Alias for calling [createCustomerRequest] with
         * `CreateCustomerRequest.ofBusiness(business)`.
         */
        fun createCustomerRequest(business: CreateCustomerRequest.Business) =
            createCustomerRequest(CreateCustomerRequest.ofBusiness(business))

        /**
         * Alias for calling [createCustomerRequest] with the following:
         * ```kotlin
         * CreateCustomerRequest.Business.builder()
         *     .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
         *     .platformCustomerId(platformCustomerId)
         *     .build()
         * ```
         */
        fun businessCreateCustomerRequest(platformCustomerId: String) =
            createCustomerRequest(
                CreateCustomerRequest.Business.builder()
                    .customerType(BusinessCustomerFields.CustomerType.BUSINESS)
                    .platformCustomerId(platformCustomerId)
                    .build()
            )

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
         * Returns an immutable instance of [CustomerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .createCustomerRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreateParams =
            CustomerCreateParams(
                checkRequired("createCustomerRequest", createCustomerRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CreateCustomerRequest = createCustomerRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(using = CreateCustomerRequest.Deserializer::class)
    @JsonSerialize(using = CreateCustomerRequest.Serializer::class)
    class CreateCustomerRequest
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

        fun validate(): CreateCustomerRequest = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is CreateCustomerRequest &&
                individual == other.individual &&
                business == other.business
        }

        override fun hashCode(): Int = Objects.hash(individual, business)

        override fun toString(): String =
            when {
                individual != null -> "CreateCustomerRequest{individual=$individual}"
                business != null -> "CreateCustomerRequest{business=$business}"
                _json != null -> "CreateCustomerRequest{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid CreateCustomerRequest")
            }

        companion object {

            fun ofIndividual(individual: Individual) =
                CreateCustomerRequest(individual = individual)

            fun ofBusiness(business: Business) = CreateCustomerRequest(business = business)
        }

        /**
         * An interface that defines how to map each variant of [CreateCustomerRequest] to a value
         * of type [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: Individual): T

            fun visitBusiness(business: Business): T

            /**
             * Maps an unknown variant of [CreateCustomerRequest] to a value of type [T].
             *
             * An instance of [CreateCustomerRequest] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown CreateCustomerRequest: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<CreateCustomerRequest>(CreateCustomerRequest::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): CreateCustomerRequest {
                val json = JsonValue.fromJsonNode(node)
                val customerType = json.asObject()?.get("customerType")?.asString()

                when (customerType) {
                    "INDIVIDUAL" -> {
                        return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                            CreateCustomerRequest(individual = it, _json = json)
                        } ?: CreateCustomerRequest(_json = json)
                    }
                    "BUSINESS" -> {
                        return tryDeserialize(node, jacksonTypeRef<Business>())?.let {
                            CreateCustomerRequest(business = it, _json = json)
                        } ?: CreateCustomerRequest(_json = json)
                    }
                }

                return CreateCustomerRequest(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<CreateCustomerRequest>(CreateCustomerRequest::class) {

            override fun serialize(
                value: CreateCustomerRequest,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.individual != null -> generator.writeObject(value.individual)
                    value.business != null -> generator.writeObject(value.business)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid CreateCustomerRequest")
                }
            }
        }

        class Individual
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val platformCustomerId: JsonField<String>,
            private val currencies: JsonField<List<String>>,
            private val region: JsonField<String>,
            private val umaAddress: JsonField<String>,
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
                @JsonProperty("currencies")
                @ExcludeMissing
                currencies: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("umaAddress")
                @ExcludeMissing
                umaAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customerType")
                @ExcludeMissing
                customerType: JsonField<IndividualCustomerFields.CustomerType> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
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
                currencies,
                region,
                umaAddress,
                customerType,
                address,
                birthDate,
                fullName,
                kycStatus,
                nationality,
                mutableMapOf(),
            )

            fun toCustomerCreate(): CustomerCreate =
                CustomerCreate.builder()
                    .platformCustomerId(platformCustomerId)
                    .currencies(currencies)
                    .region(region)
                    .umaAddress(umaAddress)
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
             * Platform-specific customer identifier. If not provided, one will be generated by the
             * system.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

            /**
             * List of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD", "EUR";
             * tickers for crypto, e.g. "BTC", "USDC"). Required if the customer will use more than
             * one sending currency, since the correct currencies cannot always be inferred. If not
             * provided, currencies will be inferred from the customer's region. Some currency
             * combinations may require separate customers — if so, the request will be rejected
             * with details.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currencies(): List<String>? = currencies.getNullable("currencies")

            /**
             * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity. This
             * determines the regulatory jurisdiction and KYC requirements for the customer.
             * Required if the customer will use currencies with different KYC requirements across
             * regions. A customer with accounts in multiple regions should be registered as
             * separate customers. This field is immutable after creation.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun region(): String? = region.getNullable("region")

            /**
             * Optional UMA address identifier. If not provided during customer creation, one will
             * be generated by the system. If provided during customer update, the UMA address will
             * be updated to the provided value. This is an optional identifier to route payments to
             * the customer. This is an optional identifier to route payments to the customer.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun umaAddress(): String? = umaAddress.getNullable("umaAddress")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerType(): IndividualCustomerFields.CustomerType =
                customerType.getRequired("customerType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun address(): Address? = address.getNullable("address")

            /**
             * Date of birth in ISO 8601 format (YYYY-MM-DD)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun birthDate(): LocalDate? = birthDate.getNullable("birthDate")

            /**
             * Individual's full name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fullName(): String? = fullName.getNullable("fullName")

            /**
             * The current KYC status of a customer
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun kycStatus(): IndividualCustomerFields.KycStatus? =
                kycStatus.getNullable("kycStatus")

            /**
             * Country code (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
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
             * Returns the raw JSON value of [currencies].
             *
             * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currencies")
            @ExcludeMissing
            fun _currencies(): JsonField<List<String>> = currencies

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /**
             * Returns the raw JSON value of [umaAddress].
             *
             * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("umaAddress")
            @ExcludeMissing
            fun _umaAddress(): JsonField<String> = umaAddress

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
             * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("birthDate")
            @ExcludeMissing
            fun _birthDate(): JsonField<LocalDate> = birthDate

            /**
             * Returns the raw JSON value of [fullName].
             *
             * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fullName") @ExcludeMissing fun _fullName(): JsonField<String> = fullName

            /**
             * Returns the raw JSON value of [kycStatus].
             *
             * Unlike [kycStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("kycStatus")
            @ExcludeMissing
            fun _kycStatus(): JsonField<IndividualCustomerFields.KycStatus> = kycStatus

            /**
             * Returns the raw JSON value of [nationality].
             *
             * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * .customerType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Individual]. */
            class Builder internal constructor() {

                private var platformCustomerId: JsonField<String>? = null
                private var currencies: JsonField<MutableList<String>>? = null
                private var region: JsonField<String> = JsonMissing.of()
                private var umaAddress: JsonField<String> = JsonMissing.of()
                private var customerType: JsonField<IndividualCustomerFields.CustomerType>? = null
                private var address: JsonField<Address> = JsonMissing.of()
                private var birthDate: JsonField<LocalDate> = JsonMissing.of()
                private var fullName: JsonField<String> = JsonMissing.of()
                private var kycStatus: JsonField<IndividualCustomerFields.KycStatus> =
                    JsonMissing.of()
                private var nationality: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(individual: Individual) = apply {
                    platformCustomerId = individual.platformCustomerId
                    currencies = individual.currencies.map { it.toMutableList() }
                    region = individual.region
                    umaAddress = individual.umaAddress
                    customerType = individual.customerType
                    address = individual.address
                    birthDate = individual.birthDate
                    fullName = individual.fullName
                    kycStatus = individual.kycStatus
                    nationality = individual.nationality
                    additionalProperties = individual.additionalProperties.toMutableMap()
                }

                /**
                 * Platform-specific customer identifier. If not provided, one will be generated by
                 * the system.
                 */
                fun platformCustomerId(platformCustomerId: String) =
                    platformCustomerId(JsonField.of(platformCustomerId))

                /**
                 * Sets [Builder.platformCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platformCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun platformCustomerId(platformCustomerId: JsonField<String>) = apply {
                    this.platformCustomerId = platformCustomerId
                }

                /**
                 * List of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD",
                 * "EUR"; tickers for crypto, e.g. "BTC", "USDC"). Required if the customer will use
                 * more than one sending currency, since the correct currencies cannot always be
                 * inferred. If not provided, currencies will be inferred from the customer's
                 * region. Some currency combinations may require separate customers — if so, the
                 * request will be rejected with details.
                 */
                fun currencies(currencies: List<String>) = currencies(JsonField.of(currencies))

                /**
                 * Sets [Builder.currencies] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencies] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity.
                 * This determines the regulatory jurisdiction and KYC requirements for the
                 * customer. Required if the customer will use currencies with different KYC
                 * requirements across regions. A customer with accounts in multiple regions should
                 * be registered as separate customers. This field is immutable after creation.
                 */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                /**
                 * Optional UMA address identifier. If not provided during customer creation, one
                 * will be generated by the system. If provided during customer update, the UMA
                 * address will be updated to the provided value. This is an optional identifier to
                 * route payments to the customer. This is an optional identifier to route payments
                 * to the customer.
                 */
                fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

                /**
                 * Sets [Builder.umaAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.umaAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun umaAddress(umaAddress: JsonField<String>) = apply {
                    this.umaAddress = umaAddress
                }

                fun customerType(customerType: IndividualCustomerFields.CustomerType) =
                    customerType(JsonField.of(customerType))

                /**
                 * Sets [Builder.customerType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerType] with a well-typed
                 * [IndividualCustomerFields.CustomerType] value instead. This method is primarily
                 * for setting the field to an undocumented or not yet supported value.
                 */
                fun customerType(customerType: JsonField<IndividualCustomerFields.CustomerType>) =
                    apply {
                        this.customerType = customerType
                    }

                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

                /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                /**
                 * Sets [Builder.birthDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.birthDate] with a well-typed [LocalDate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                    this.birthDate = birthDate
                }

                /** Individual's full name */
                fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                /**
                 * Sets [Builder.fullName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fullName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * Returns an immutable instance of [Individual].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .platformCustomerId()
                 * .customerType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Individual =
                    Individual(
                        checkRequired("platformCustomerId", platformCustomerId),
                        (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                        region,
                        umaAddress,
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
                currencies()
                region()
                umaAddress()
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
                    (currencies.asKnown()?.size ?: 0) +
                    (if (region.asKnown() == null) 0 else 1) +
                    (if (umaAddress.asKnown() == null) 0 else 1) +
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
                    currencies == other.currencies &&
                    region == other.region &&
                    umaAddress == other.umaAddress &&
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
                    currencies,
                    region,
                    umaAddress,
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
                "Individual{platformCustomerId=$platformCustomerId, currencies=$currencies, region=$region, umaAddress=$umaAddress, customerType=$customerType, address=$address, birthDate=$birthDate, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, additionalProperties=$additionalProperties}"
        }

        class Business
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val platformCustomerId: JsonField<String>,
            private val currencies: JsonField<List<String>>,
            private val region: JsonField<String>,
            private val umaAddress: JsonField<String>,
            private val customerType: JsonField<BusinessCustomerFields.CustomerType>,
            private val address: JsonField<Address>,
            private val businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>,
            private val kybStatus: JsonField<BusinessCustomerFields.KybStatus>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("platformCustomerId")
                @ExcludeMissing
                platformCustomerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currencies")
                @ExcludeMissing
                currencies: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("umaAddress")
                @ExcludeMissing
                umaAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customerType")
                @ExcludeMissing
                customerType: JsonField<BusinessCustomerFields.CustomerType> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("businessInfo")
                @ExcludeMissing
                businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> = JsonMissing.of(),
                @JsonProperty("kybStatus")
                @ExcludeMissing
                kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of(),
            ) : this(
                platformCustomerId,
                currencies,
                region,
                umaAddress,
                customerType,
                address,
                businessInfo,
                kybStatus,
                mutableMapOf(),
            )

            fun toCustomerCreate(): CustomerCreate =
                CustomerCreate.builder()
                    .platformCustomerId(platformCustomerId)
                    .currencies(currencies)
                    .region(region)
                    .umaAddress(umaAddress)
                    .build()

            fun toBusinessCustomerFields(): BusinessCustomerFields =
                BusinessCustomerFields.builder()
                    .customerType(customerType)
                    .address(address)
                    .businessInfo(businessInfo)
                    .kybStatus(kybStatus)
                    .build()

            /**
             * Platform-specific customer identifier. If not provided, one will be generated by the
             * system.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

            /**
             * List of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD", "EUR";
             * tickers for crypto, e.g. "BTC", "USDC"). Required if the customer will use more than
             * one sending currency, since the correct currencies cannot always be inferred. If not
             * provided, currencies will be inferred from the customer's region. Some currency
             * combinations may require separate customers — if so, the request will be rejected
             * with details.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun currencies(): List<String>? = currencies.getNullable("currencies")

            /**
             * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity. This
             * determines the regulatory jurisdiction and KYC requirements for the customer.
             * Required if the customer will use currencies with different KYC requirements across
             * regions. A customer with accounts in multiple regions should be registered as
             * separate customers. This field is immutable after creation.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun region(): String? = region.getNullable("region")

            /**
             * Optional UMA address identifier. If not provided during customer creation, one will
             * be generated by the system. If provided during customer update, the UMA address will
             * be updated to the provided value. This is an optional identifier to route payments to
             * the customer. This is an optional identifier to route payments to the customer.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun umaAddress(): String? = umaAddress.getNullable("umaAddress")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerType(): BusinessCustomerFields.CustomerType =
                customerType.getRequired("customerType")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun address(): Address? = address.getNullable("address")

            /**
             * Additional information for business entities
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun businessInfo(): BusinessCustomerFields.BusinessInfo? =
                businessInfo.getNullable("businessInfo")

            /**
             * The current KYB status of a business customer
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun kybStatus(): BusinessCustomerFields.KybStatus? = kybStatus.getNullable("kybStatus")

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
             * Returns the raw JSON value of [currencies].
             *
             * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currencies")
            @ExcludeMissing
            fun _currencies(): JsonField<List<String>> = currencies

            /**
             * Returns the raw JSON value of [region].
             *
             * Unlike [region], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("region") @ExcludeMissing fun _region(): JsonField<String> = region

            /**
             * Returns the raw JSON value of [umaAddress].
             *
             * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("umaAddress")
            @ExcludeMissing
            fun _umaAddress(): JsonField<String> = umaAddress

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
             * Unlike [kybStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
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
                 * Returns a mutable builder for constructing an instance of [Business].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .platformCustomerId()
                 * .customerType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Business]. */
            class Builder internal constructor() {

                private var platformCustomerId: JsonField<String>? = null
                private var currencies: JsonField<MutableList<String>>? = null
                private var region: JsonField<String> = JsonMissing.of()
                private var umaAddress: JsonField<String> = JsonMissing.of()
                private var customerType: JsonField<BusinessCustomerFields.CustomerType>? = null
                private var address: JsonField<Address> = JsonMissing.of()
                private var businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> =
                    JsonMissing.of()
                private var kybStatus: JsonField<BusinessCustomerFields.KybStatus> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(business: Business) = apply {
                    platformCustomerId = business.platformCustomerId
                    currencies = business.currencies.map { it.toMutableList() }
                    region = business.region
                    umaAddress = business.umaAddress
                    customerType = business.customerType
                    address = business.address
                    businessInfo = business.businessInfo
                    kybStatus = business.kybStatus
                    additionalProperties = business.additionalProperties.toMutableMap()
                }

                /**
                 * Platform-specific customer identifier. If not provided, one will be generated by
                 * the system.
                 */
                fun platformCustomerId(platformCustomerId: String) =
                    platformCustomerId(JsonField.of(platformCustomerId))

                /**
                 * Sets [Builder.platformCustomerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platformCustomerId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun platformCustomerId(platformCustomerId: JsonField<String>) = apply {
                    this.platformCustomerId = platformCustomerId
                }

                /**
                 * List of currency codes the customer will use (ISO 4217 for fiat, e.g. "USD",
                 * "EUR"; tickers for crypto, e.g. "BTC", "USDC"). Required if the customer will use
                 * more than one sending currency, since the correct currencies cannot always be
                 * inferred. If not provided, currencies will be inferred from the customer's
                 * region. Some currency combinations may require separate customers — if so, the
                 * request will be rejected with details.
                 */
                fun currencies(currencies: List<String>) = currencies(JsonField.of(currencies))

                /**
                 * Sets [Builder.currencies] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currencies] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
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

                /**
                 * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity.
                 * This determines the regulatory jurisdiction and KYC requirements for the
                 * customer. Required if the customer will use currencies with different KYC
                 * requirements across regions. A customer with accounts in multiple regions should
                 * be registered as separate customers. This field is immutable after creation.
                 */
                fun region(region: String) = region(JsonField.of(region))

                /**
                 * Sets [Builder.region] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.region] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun region(region: JsonField<String>) = apply { this.region = region }

                /**
                 * Optional UMA address identifier. If not provided during customer creation, one
                 * will be generated by the system. If provided during customer update, the UMA
                 * address will be updated to the provided value. This is an optional identifier to
                 * route payments to the customer. This is an optional identifier to route payments
                 * to the customer.
                 */
                fun umaAddress(umaAddress: String) = umaAddress(JsonField.of(umaAddress))

                /**
                 * Sets [Builder.umaAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.umaAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun umaAddress(umaAddress: JsonField<String>) = apply {
                    this.umaAddress = umaAddress
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
                fun customerType(customerType: JsonField<BusinessCustomerFields.CustomerType>) =
                    apply {
                        this.customerType = customerType
                    }

                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                fun businessInfo(businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>) =
                    apply {
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
                 * Returns an immutable instance of [Business].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .platformCustomerId()
                 * .customerType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Business =
                    Business(
                        checkRequired("platformCustomerId", platformCustomerId),
                        (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                        region,
                        umaAddress,
                        checkRequired("customerType", customerType),
                        address,
                        businessInfo,
                        kybStatus,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Business = apply {
                if (validated) {
                    return@apply
                }

                platformCustomerId()
                currencies()
                region()
                umaAddress()
                customerType().validate()
                address()?.validate()
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
                (if (platformCustomerId.asKnown() == null) 0 else 1) +
                    (currencies.asKnown()?.size ?: 0) +
                    (if (region.asKnown() == null) 0 else 1) +
                    (if (umaAddress.asKnown() == null) 0 else 1) +
                    (customerType.asKnown()?.validity() ?: 0) +
                    (address.asKnown()?.validity() ?: 0) +
                    (businessInfo.asKnown()?.validity() ?: 0) +
                    (kybStatus.asKnown()?.validity() ?: 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Business &&
                    platformCustomerId == other.platformCustomerId &&
                    currencies == other.currencies &&
                    region == other.region &&
                    umaAddress == other.umaAddress &&
                    customerType == other.customerType &&
                    address == other.address &&
                    businessInfo == other.businessInfo &&
                    kybStatus == other.kybStatus &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    platformCustomerId,
                    currencies,
                    region,
                    umaAddress,
                    customerType,
                    address,
                    businessInfo,
                    kybStatus,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Business{platformCustomerId=$platformCustomerId, currencies=$currencies, region=$region, umaAddress=$umaAddress, customerType=$customerType, address=$address, businessInfo=$businessInfo, kybStatus=$kybStatus, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreateParams &&
            createCustomerRequest == other.createCustomerRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(createCustomerRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerCreateParams{createCustomerRequest=$createCustomerRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
