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
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.BusinessInfoUpdate
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
         * Alias for calling [createCustomerRequest] with
         * `CreateCustomerRequest.ofBusiness(business)`.
         */
        fun createCustomerRequest(business: CreateCustomerRequest.Business) =
            createCustomerRequest(CreateCustomerRequest.ofBusiness(business))

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

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.lightspark.grid.core.JsonValue
         *
         * val result: String? = createCustomerRequest.accept(object : CreateCustomerRequest.Visitor<String?> {
         *     override fun visitIndividual(individual: Individual): String? = individual.toString()
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
                individual != null -> visitor.visitIndividual(individual)
                business != null -> visitor.visitBusiness(business)
                else -> visitor.unknown(_json)
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
            private val customerType: JsonValue,
            private val address: JsonField<Address>,
            private val birthDate: JsonField<LocalDate>,
            private val currencies: JsonField<List<String>>,
            private val email: JsonField<String>,
            private val fullName: JsonField<String>,
            private val kycStatus: JsonField<KycStatus>,
            private val nationality: JsonField<String>,
            private val platformCustomerId: JsonField<String>,
            private val region: JsonField<String>,
            private val umaAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("customerType")
                @ExcludeMissing
                customerType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("birthDate")
                @ExcludeMissing
                birthDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("currencies")
                @ExcludeMissing
                currencies: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fullName")
                @ExcludeMissing
                fullName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kycStatus")
                @ExcludeMissing
                kycStatus: JsonField<KycStatus> = JsonMissing.of(),
                @JsonProperty("nationality")
                @ExcludeMissing
                nationality: JsonField<String> = JsonMissing.of(),
                @JsonProperty("platformCustomerId")
                @ExcludeMissing
                platformCustomerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("umaAddress")
                @ExcludeMissing
                umaAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                customerType,
                address,
                birthDate,
                currencies,
                email,
                fullName,
                kycStatus,
                nationality,
                platformCustomerId,
                region,
                umaAddress,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("INDIVIDUAL")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("customerType")
            @ExcludeMissing
            fun _customerType(): JsonValue = customerType

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
             * Email address for the customer.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

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
            fun kycStatus(): KycStatus? = kycStatus.getNullable("kycStatus")

            /**
             * Country code (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun nationality(): String? = nationality.getNullable("nationality")

            /**
             * Platform-specific customer identifier. If not provided, one will be generated by the
             * system.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun platformCustomerId(): String? = platformCustomerId.getNullable("platformCustomerId")

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
             * Returns the raw JSON value of [currencies].
             *
             * Unlike [currencies], this method doesn't throw if the JSON field has an unexpected
             * type.
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
            fun _kycStatus(): JsonField<KycStatus> = kycStatus

            /**
             * Returns the raw JSON value of [nationality].
             *
             * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nationality")
            @ExcludeMissing
            fun _nationality(): JsonField<String> = nationality

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

                /** Returns a mutable builder for constructing an instance of [Individual]. */
                fun builder() = Builder()
            }

            /** A builder for [Individual]. */
            class Builder internal constructor() {

                private var customerType: JsonValue = JsonValue.from("INDIVIDUAL")
                private var address: JsonField<Address> = JsonMissing.of()
                private var birthDate: JsonField<LocalDate> = JsonMissing.of()
                private var currencies: JsonField<MutableList<String>>? = null
                private var email: JsonField<String> = JsonMissing.of()
                private var fullName: JsonField<String> = JsonMissing.of()
                private var kycStatus: JsonField<KycStatus> = JsonMissing.of()
                private var nationality: JsonField<String> = JsonMissing.of()
                private var platformCustomerId: JsonField<String> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var umaAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(individual: Individual) = apply {
                    customerType = individual.customerType
                    address = individual.address
                    birthDate = individual.birthDate
                    currencies = individual.currencies.map { it.toMutableList() }
                    email = individual.email
                    fullName = individual.fullName
                    kycStatus = individual.kycStatus
                    nationality = individual.nationality
                    platformCustomerId = individual.platformCustomerId
                    region = individual.region
                    umaAddress = individual.umaAddress
                    additionalProperties = individual.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun customerType(customerType: JsonValue) = apply {
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
                 */
                fun build(): Individual =
                    Individual(
                        customerType,
                        address,
                        birthDate,
                        (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                        email,
                        fullName,
                        kycStatus,
                        nationality,
                        platformCustomerId,
                        region,
                        umaAddress,
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
            fun validate(): Individual = apply {
                if (validated) {
                    return@apply
                }

                _customerType().let {
                    if (it != JsonValue.from("INDIVIDUAL")) {
                        throw LightsparkGridInvalidDataException(
                            "'customerType' is invalid, received $it"
                        )
                    }
                }
                address()?.validate()
                birthDate()
                currencies()
                email()
                fullName()
                kycStatus()?.validate()
                nationality()
                platformCustomerId()
                region()
                umaAddress()
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
                customerType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                    (address.asKnown()?.validity() ?: 0) +
                    (if (birthDate.asKnown() == null) 0 else 1) +
                    (currencies.asKnown()?.size ?: 0) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (if (fullName.asKnown() == null) 0 else 1) +
                    (kycStatus.asKnown()?.validity() ?: 0) +
                    (if (nationality.asKnown() == null) 0 else 1) +
                    (if (platformCustomerId.asKnown() == null) 0 else 1) +
                    (if (region.asKnown() == null) 0 else 1) +
                    (if (umaAddress.asKnown() == null) 0 else 1)

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Individual &&
                    customerType == other.customerType &&
                    address == other.address &&
                    birthDate == other.birthDate &&
                    currencies == other.currencies &&
                    email == other.email &&
                    fullName == other.fullName &&
                    kycStatus == other.kycStatus &&
                    nationality == other.nationality &&
                    platformCustomerId == other.platformCustomerId &&
                    region == other.region &&
                    umaAddress == other.umaAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    customerType,
                    address,
                    birthDate,
                    currencies,
                    email,
                    fullName,
                    kycStatus,
                    nationality,
                    platformCustomerId,
                    region,
                    umaAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Individual{customerType=$customerType, address=$address, birthDate=$birthDate, currencies=$currencies, email=$email, fullName=$fullName, kycStatus=$kycStatus, nationality=$nationality, platformCustomerId=$platformCustomerId, region=$region, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
        }

        class Business
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val customerType: JsonValue,
            private val address: JsonField<Address>,
            private val businessInfo: JsonField<BusinessInfo>,
            private val currencies: JsonField<List<String>>,
            private val email: JsonField<String>,
            private val kybStatus: JsonField<KybStatus>,
            private val platformCustomerId: JsonField<String>,
            private val region: JsonField<String>,
            private val umaAddress: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("customerType")
                @ExcludeMissing
                customerType: JsonValue = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
                @JsonProperty("businessInfo")
                @ExcludeMissing
                businessInfo: JsonField<BusinessInfo> = JsonMissing.of(),
                @JsonProperty("currencies")
                @ExcludeMissing
                currencies: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
                @JsonProperty("kybStatus")
                @ExcludeMissing
                kybStatus: JsonField<KybStatus> = JsonMissing.of(),
                @JsonProperty("platformCustomerId")
                @ExcludeMissing
                platformCustomerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("region")
                @ExcludeMissing
                region: JsonField<String> = JsonMissing.of(),
                @JsonProperty("umaAddress")
                @ExcludeMissing
                umaAddress: JsonField<String> = JsonMissing.of(),
            ) : this(
                customerType,
                address,
                businessInfo,
                currencies,
                email,
                kybStatus,
                platformCustomerId,
                region,
                umaAddress,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("BUSINESS")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("customerType")
            @ExcludeMissing
            fun _customerType(): JsonValue = customerType

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
            fun businessInfo(): BusinessInfo? = businessInfo.getNullable("businessInfo")

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
             * Email address for the customer.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun email(): String? = email.getNullable("email")

            /**
             * The current KYB status of a business customer
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun kybStatus(): KybStatus? = kybStatus.getNullable("kybStatus")

            /**
             * Platform-specific customer identifier. If not provided, one will be generated by the
             * system.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun platformCustomerId(): String? = platformCustomerId.getNullable("platformCustomerId")

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
            fun _businessInfo(): JsonField<BusinessInfo> = businessInfo

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
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            /**
             * Returns the raw JSON value of [kybStatus].
             *
             * Unlike [kybStatus], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("kybStatus")
            @ExcludeMissing
            fun _kybStatus(): JsonField<KybStatus> = kybStatus

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

                /** Returns a mutable builder for constructing an instance of [Business]. */
                fun builder() = Builder()
            }

            /** A builder for [Business]. */
            class Builder internal constructor() {

                private var customerType: JsonValue = JsonValue.from("BUSINESS")
                private var address: JsonField<Address> = JsonMissing.of()
                private var businessInfo: JsonField<BusinessInfo> = JsonMissing.of()
                private var currencies: JsonField<MutableList<String>>? = null
                private var email: JsonField<String> = JsonMissing.of()
                private var kybStatus: JsonField<KybStatus> = JsonMissing.of()
                private var platformCustomerId: JsonField<String> = JsonMissing.of()
                private var region: JsonField<String> = JsonMissing.of()
                private var umaAddress: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(business: Business) = apply {
                    customerType = business.customerType
                    address = business.address
                    businessInfo = business.businessInfo
                    currencies = business.currencies.map { it.toMutableList() }
                    email = business.email
                    kybStatus = business.kybStatus
                    platformCustomerId = business.platformCustomerId
                    region = business.region
                    umaAddress = business.umaAddress
                    additionalProperties = business.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("BUSINESS")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun customerType(customerType: JsonValue) = apply {
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
                fun businessInfo(businessInfo: BusinessInfo) =
                    businessInfo(JsonField.of(businessInfo))

                /**
                 * Sets [Builder.businessInfo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.businessInfo] with a well-typed [BusinessInfo]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun businessInfo(businessInfo: JsonField<BusinessInfo>) = apply {
                    this.businessInfo = businessInfo
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

                /** The current KYB status of a business customer */
                fun kybStatus(kybStatus: KybStatus) = kybStatus(JsonField.of(kybStatus))

                /**
                 * Sets [Builder.kybStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.kybStatus] with a well-typed [KybStatus] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun kybStatus(kybStatus: JsonField<KybStatus>) = apply {
                    this.kybStatus = kybStatus
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
                 */
                fun build(): Business =
                    Business(
                        customerType,
                        address,
                        businessInfo,
                        (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                        email,
                        kybStatus,
                        platformCustomerId,
                        region,
                        umaAddress,
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
            fun validate(): Business = apply {
                if (validated) {
                    return@apply
                }

                _customerType().let {
                    if (it != JsonValue.from("BUSINESS")) {
                        throw LightsparkGridInvalidDataException(
                            "'customerType' is invalid, received $it"
                        )
                    }
                }
                address()?.validate()
                businessInfo()?.validate()
                currencies()
                email()
                kybStatus()?.validate()
                platformCustomerId()
                region()
                umaAddress()
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
                customerType.let { if (it == JsonValue.from("BUSINESS")) 1 else 0 } +
                    (address.asKnown()?.validity() ?: 0) +
                    (businessInfo.asKnown()?.validity() ?: 0) +
                    (currencies.asKnown()?.size ?: 0) +
                    (if (email.asKnown() == null) 0 else 1) +
                    (kybStatus.asKnown()?.validity() ?: 0) +
                    (if (platformCustomerId.asKnown() == null) 0 else 1) +
                    (if (region.asKnown() == null) 0 else 1) +
                    (if (umaAddress.asKnown() == null) 0 else 1)

            /** Additional information for business entities */
            class BusinessInfo
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val businessType: JsonField<BusinessInfoUpdate.BusinessType>,
                private val countriesOfOperation: JsonField<List<String>>,
                private val country: JsonField<String>,
                private val doingBusinessAs: JsonField<String>,
                private val entityType: JsonField<BusinessInfoUpdate.EntityType>,
                private val expectedMonthlyTransactionCount:
                    JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionCount>,
                private val expectedMonthlyTransactionVolume:
                    JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionVolume>,
                private val expectedRecipientJurisdictions: JsonField<List<String>>,
                private val incorporatedOn: JsonField<LocalDate>,
                private val legalName: JsonField<String>,
                private val purposeOfAccount: JsonField<BusinessInfoUpdate.PurposeOfAccount>,
                private val registrationNumber: JsonField<String>,
                private val sourceOfFunds: JsonField<String>,
                private val taxId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("businessType")
                    @ExcludeMissing
                    businessType: JsonField<BusinessInfoUpdate.BusinessType> = JsonMissing.of(),
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
                    entityType: JsonField<BusinessInfoUpdate.EntityType> = JsonMissing.of(),
                    @JsonProperty("expectedMonthlyTransactionCount")
                    @ExcludeMissing
                    expectedMonthlyTransactionCount:
                        JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionCount> =
                        JsonMissing.of(),
                    @JsonProperty("expectedMonthlyTransactionVolume")
                    @ExcludeMissing
                    expectedMonthlyTransactionVolume:
                        JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionVolume> =
                        JsonMissing.of(),
                    @JsonProperty("expectedRecipientJurisdictions")
                    @ExcludeMissing
                    expectedRecipientJurisdictions: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("incorporatedOn")
                    @ExcludeMissing
                    incorporatedOn: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("legalName")
                    @ExcludeMissing
                    legalName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("purposeOfAccount")
                    @ExcludeMissing
                    purposeOfAccount: JsonField<BusinessInfoUpdate.PurposeOfAccount> =
                        JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("sourceOfFunds")
                    @ExcludeMissing
                    sourceOfFunds: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("taxId")
                    @ExcludeMissing
                    taxId: JsonField<String> = JsonMissing.of(),
                ) : this(
                    businessType,
                    countriesOfOperation,
                    country,
                    doingBusinessAs,
                    entityType,
                    expectedMonthlyTransactionCount,
                    expectedMonthlyTransactionVolume,
                    expectedRecipientJurisdictions,
                    incorporatedOn,
                    legalName,
                    purposeOfAccount,
                    registrationNumber,
                    sourceOfFunds,
                    taxId,
                    mutableMapOf(),
                )

                fun toBusinessInfoUpdate(): BusinessInfoUpdate =
                    BusinessInfoUpdate.builder()
                        .businessType(businessType)
                        .countriesOfOperation(countriesOfOperation)
                        .country(country)
                        .doingBusinessAs(doingBusinessAs)
                        .entityType(entityType)
                        .expectedMonthlyTransactionCount(expectedMonthlyTransactionCount)
                        .expectedMonthlyTransactionVolume(expectedMonthlyTransactionVolume)
                        .expectedRecipientJurisdictions(expectedRecipientJurisdictions)
                        .incorporatedOn(incorporatedOn)
                        .legalName(legalName)
                        .purposeOfAccount(purposeOfAccount)
                        .registrationNumber(registrationNumber)
                        .sourceOfFunds(sourceOfFunds)
                        .taxId(taxId)
                        .build()

                /**
                 * The high-level industry category of the business
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun businessType(): BusinessInfoUpdate.BusinessType? =
                    businessType.getNullable("businessType")

                /**
                 * List of countries where the business operates (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countriesOfOperation(): List<String>? =
                    countriesOfOperation.getNullable("countriesOfOperation")

                /**
                 * Country of incorporation or registration (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun country(): String? = country.getNullable("country")

                /**
                 * Trade name or DBA name of the business, if different from the legal name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun doingBusinessAs(): String? = doingBusinessAs.getNullable("doingBusinessAs")

                /**
                 * Legal entity type of the business
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun entityType(): BusinessInfoUpdate.EntityType? =
                    entityType.getNullable("entityType")

                /**
                 * Expected number of transactions per month
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun expectedMonthlyTransactionCount():
                    BusinessInfoUpdate.ExpectedMonthlyTransactionCount? =
                    expectedMonthlyTransactionCount.getNullable("expectedMonthlyTransactionCount")

                /**
                 * Expected total transaction volume per month in USD equivalent
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun expectedMonthlyTransactionVolume():
                    BusinessInfoUpdate.ExpectedMonthlyTransactionVolume? =
                    expectedMonthlyTransactionVolume.getNullable("expectedMonthlyTransactionVolume")

                /**
                 * List of countries where the business expects to send payments (ISO 3166-1
                 * alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun expectedRecipientJurisdictions(): List<String>? =
                    expectedRecipientJurisdictions.getNullable("expectedRecipientJurisdictions")

                /**
                 * Date of incorporation in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun incorporatedOn(): LocalDate? = incorporatedOn.getNullable("incorporatedOn")

                /**
                 * Legal name of the business
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun legalName(): String? = legalName.getNullable("legalName")

                /**
                 * The intended purpose for using the Grid account
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun purposeOfAccount(): BusinessInfoUpdate.PurposeOfAccount? =
                    purposeOfAccount.getNullable("purposeOfAccount")

                /**
                 * Business registration number
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

                /**
                 * The primary source of funds for the business
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun sourceOfFunds(): String? = sourceOfFunds.getNullable("sourceOfFunds")

                /**
                 * Tax identification number
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun taxId(): String? = taxId.getNullable("taxId")

                /**
                 * Returns the raw JSON value of [businessType].
                 *
                 * Unlike [businessType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("businessType")
                @ExcludeMissing
                fun _businessType(): JsonField<BusinessInfoUpdate.BusinessType> = businessType

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
                 * Unlike [country], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                 * Unlike [entityType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("entityType")
                @ExcludeMissing
                fun _entityType(): JsonField<BusinessInfoUpdate.EntityType> = entityType

                /**
                 * Returns the raw JSON value of [expectedMonthlyTransactionCount].
                 *
                 * Unlike [expectedMonthlyTransactionCount], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("expectedMonthlyTransactionCount")
                @ExcludeMissing
                fun _expectedMonthlyTransactionCount():
                    JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionCount> =
                    expectedMonthlyTransactionCount

                /**
                 * Returns the raw JSON value of [expectedMonthlyTransactionVolume].
                 *
                 * Unlike [expectedMonthlyTransactionVolume], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("expectedMonthlyTransactionVolume")
                @ExcludeMissing
                fun _expectedMonthlyTransactionVolume():
                    JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionVolume> =
                    expectedMonthlyTransactionVolume

                /**
                 * Returns the raw JSON value of [expectedRecipientJurisdictions].
                 *
                 * Unlike [expectedRecipientJurisdictions], this method doesn't throw if the JSON
                 * field has an unexpected type.
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
                 * Returns the raw JSON value of [legalName].
                 *
                 * Unlike [legalName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("legalName")
                @ExcludeMissing
                fun _legalName(): JsonField<String> = legalName

                /**
                 * Returns the raw JSON value of [purposeOfAccount].
                 *
                 * Unlike [purposeOfAccount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("purposeOfAccount")
                @ExcludeMissing
                fun _purposeOfAccount(): JsonField<BusinessInfoUpdate.PurposeOfAccount> =
                    purposeOfAccount

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
                 * Unlike [sourceOfFunds], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("sourceOfFunds")
                @ExcludeMissing
                fun _sourceOfFunds(): JsonField<String> = sourceOfFunds

                /**
                 * Returns the raw JSON value of [taxId].
                 *
                 * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected
                 * type.
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

                    /** Returns a mutable builder for constructing an instance of [BusinessInfo]. */
                    fun builder() = Builder()
                }

                /** A builder for [BusinessInfo]. */
                class Builder internal constructor() {

                    private var businessType: JsonField<BusinessInfoUpdate.BusinessType> =
                        JsonMissing.of()
                    private var countriesOfOperation: JsonField<MutableList<String>>? = null
                    private var country: JsonField<String> = JsonMissing.of()
                    private var doingBusinessAs: JsonField<String> = JsonMissing.of()
                    private var entityType: JsonField<BusinessInfoUpdate.EntityType> =
                        JsonMissing.of()
                    private var expectedMonthlyTransactionCount:
                        JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionCount> =
                        JsonMissing.of()
                    private var expectedMonthlyTransactionVolume:
                        JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionVolume> =
                        JsonMissing.of()
                    private var expectedRecipientJurisdictions: JsonField<MutableList<String>>? =
                        null
                    private var incorporatedOn: JsonField<LocalDate> = JsonMissing.of()
                    private var legalName: JsonField<String> = JsonMissing.of()
                    private var purposeOfAccount: JsonField<BusinessInfoUpdate.PurposeOfAccount> =
                        JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var sourceOfFunds: JsonField<String> = JsonMissing.of()
                    private var taxId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(businessInfo: BusinessInfo) = apply {
                        businessType = businessInfo.businessType
                        countriesOfOperation =
                            businessInfo.countriesOfOperation.map { it.toMutableList() }
                        country = businessInfo.country
                        doingBusinessAs = businessInfo.doingBusinessAs
                        entityType = businessInfo.entityType
                        expectedMonthlyTransactionCount =
                            businessInfo.expectedMonthlyTransactionCount
                        expectedMonthlyTransactionVolume =
                            businessInfo.expectedMonthlyTransactionVolume
                        expectedRecipientJurisdictions =
                            businessInfo.expectedRecipientJurisdictions.map { it.toMutableList() }
                        incorporatedOn = businessInfo.incorporatedOn
                        legalName = businessInfo.legalName
                        purposeOfAccount = businessInfo.purposeOfAccount
                        registrationNumber = businessInfo.registrationNumber
                        sourceOfFunds = businessInfo.sourceOfFunds
                        taxId = businessInfo.taxId
                        additionalProperties = businessInfo.additionalProperties.toMutableMap()
                    }

                    /** The high-level industry category of the business */
                    fun businessType(businessType: BusinessInfoUpdate.BusinessType) =
                        businessType(JsonField.of(businessType))

                    /**
                     * Sets [Builder.businessType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.businessType] with a well-typed
                     * [BusinessInfoUpdate.BusinessType] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun businessType(businessType: JsonField<BusinessInfoUpdate.BusinessType>) =
                        apply {
                            this.businessType = businessType
                        }

                    /** List of countries where the business operates (ISO 3166-1 alpha-2) */
                    fun countriesOfOperation(countriesOfOperation: List<String>) =
                        countriesOfOperation(JsonField.of(countriesOfOperation))

                    /**
                     * Sets [Builder.countriesOfOperation] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countriesOfOperation] with a well-typed
                     * `List<String>` value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun countriesOfOperation(countriesOfOperation: JsonField<List<String>>) =
                        apply {
                            this.countriesOfOperation =
                                countriesOfOperation.map { it.toMutableList() }
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
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun country(country: JsonField<String>) = apply { this.country = country }

                    /** Trade name or DBA name of the business, if different from the legal name */
                    fun doingBusinessAs(doingBusinessAs: String) =
                        doingBusinessAs(JsonField.of(doingBusinessAs))

                    /**
                     * Sets [Builder.doingBusinessAs] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.doingBusinessAs] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun doingBusinessAs(doingBusinessAs: JsonField<String>) = apply {
                        this.doingBusinessAs = doingBusinessAs
                    }

                    /** Legal entity type of the business */
                    fun entityType(entityType: BusinessInfoUpdate.EntityType) =
                        entityType(JsonField.of(entityType))

                    /**
                     * Sets [Builder.entityType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.entityType] with a well-typed
                     * [BusinessInfoUpdate.EntityType] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun entityType(entityType: JsonField<BusinessInfoUpdate.EntityType>) = apply {
                        this.entityType = entityType
                    }

                    /** Expected number of transactions per month */
                    fun expectedMonthlyTransactionCount(
                        expectedMonthlyTransactionCount:
                            BusinessInfoUpdate.ExpectedMonthlyTransactionCount
                    ) =
                        expectedMonthlyTransactionCount(
                            JsonField.of(expectedMonthlyTransactionCount)
                        )

                    /**
                     * Sets [Builder.expectedMonthlyTransactionCount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expectedMonthlyTransactionCount] with a
                     * well-typed [BusinessInfoUpdate.ExpectedMonthlyTransactionCount] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun expectedMonthlyTransactionCount(
                        expectedMonthlyTransactionCount:
                            JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionCount>
                    ) = apply {
                        this.expectedMonthlyTransactionCount = expectedMonthlyTransactionCount
                    }

                    /** Expected total transaction volume per month in USD equivalent */
                    fun expectedMonthlyTransactionVolume(
                        expectedMonthlyTransactionVolume:
                            BusinessInfoUpdate.ExpectedMonthlyTransactionVolume
                    ) =
                        expectedMonthlyTransactionVolume(
                            JsonField.of(expectedMonthlyTransactionVolume)
                        )

                    /**
                     * Sets [Builder.expectedMonthlyTransactionVolume] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expectedMonthlyTransactionVolume] with a
                     * well-typed [BusinessInfoUpdate.ExpectedMonthlyTransactionVolume] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun expectedMonthlyTransactionVolume(
                        expectedMonthlyTransactionVolume:
                            JsonField<BusinessInfoUpdate.ExpectedMonthlyTransactionVolume>
                    ) = apply {
                        this.expectedMonthlyTransactionVolume = expectedMonthlyTransactionVolume
                    }

                    /**
                     * List of countries where the business expects to send payments (ISO 3166-1
                     * alpha-2)
                     */
                    fun expectedRecipientJurisdictions(
                        expectedRecipientJurisdictions: List<String>
                    ) = expectedRecipientJurisdictions(JsonField.of(expectedRecipientJurisdictions))

                    /**
                     * Sets [Builder.expectedRecipientJurisdictions] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expectedRecipientJurisdictions] with a
                     * well-typed `List<String>` value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
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
                                (expectedRecipientJurisdictions ?: JsonField.of(mutableListOf()))
                                    .also {
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
                     * You should usually call [Builder.incorporatedOn] with a well-typed
                     * [LocalDate] value instead. This method is primarily for setting the field to
                     * an undocumented or not yet supported value.
                     */
                    fun incorporatedOn(incorporatedOn: JsonField<LocalDate>) = apply {
                        this.incorporatedOn = incorporatedOn
                    }

                    /** Legal name of the business */
                    fun legalName(legalName: String) = legalName(JsonField.of(legalName))

                    /**
                     * Sets [Builder.legalName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.legalName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun legalName(legalName: JsonField<String>) = apply {
                        this.legalName = legalName
                    }

                    /** The intended purpose for using the Grid account */
                    fun purposeOfAccount(purposeOfAccount: BusinessInfoUpdate.PurposeOfAccount) =
                        purposeOfAccount(JsonField.of(purposeOfAccount))

                    /**
                     * Sets [Builder.purposeOfAccount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.purposeOfAccount] with a well-typed
                     * [BusinessInfoUpdate.PurposeOfAccount] value instead. This method is primarily
                     * for setting the field to an undocumented or not yet supported value.
                     */
                    fun purposeOfAccount(
                        purposeOfAccount: JsonField<BusinessInfoUpdate.PurposeOfAccount>
                    ) = apply { this.purposeOfAccount = purposeOfAccount }

                    /** Business registration number */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
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
                     * You should usually call [Builder.sourceOfFunds] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun sourceOfFunds(sourceOfFunds: JsonField<String>) = apply {
                        this.sourceOfFunds = sourceOfFunds
                    }

                    /** Tax identification number */
                    fun taxId(taxId: String) = taxId(JsonField.of(taxId))

                    /**
                     * Sets [Builder.taxId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxId] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
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
                     */
                    fun build(): BusinessInfo =
                        BusinessInfo(
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
                            legalName,
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): BusinessInfo = apply {
                    if (validated) {
                        return@apply
                    }

                    businessType()?.validate()
                    countriesOfOperation()
                    country()
                    doingBusinessAs()
                    entityType()?.validate()
                    expectedMonthlyTransactionCount()?.validate()
                    expectedMonthlyTransactionVolume()?.validate()
                    expectedRecipientJurisdictions()
                    incorporatedOn()
                    legalName()
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
                    (businessType.asKnown()?.validity() ?: 0) +
                        (countriesOfOperation.asKnown()?.size ?: 0) +
                        (if (country.asKnown() == null) 0 else 1) +
                        (if (doingBusinessAs.asKnown() == null) 0 else 1) +
                        (entityType.asKnown()?.validity() ?: 0) +
                        (expectedMonthlyTransactionCount.asKnown()?.validity() ?: 0) +
                        (expectedMonthlyTransactionVolume.asKnown()?.validity() ?: 0) +
                        (expectedRecipientJurisdictions.asKnown()?.size ?: 0) +
                        (if (incorporatedOn.asKnown() == null) 0 else 1) +
                        (if (legalName.asKnown() == null) 0 else 1) +
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                        val HEALTH_CARE_AND_SOCIAL_ASSISTANCE =
                            of("HEALTH_CARE_AND_SOCIAL_ASSISTANCE")

                        val ARTS_ENTERTAINMENT_AND_RECREATION =
                            of("ARTS_ENTERTAINMENT_AND_RECREATION")

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
                     * An instance of [BusinessType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                            HEALTH_CARE_AND_SOCIAL_ASSISTANCE ->
                                Value.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
                            ARTS_ENTERTAINMENT_AND_RECREATION ->
                                Value.ARTS_ENTERTAINMENT_AND_RECREATION
                            ACCOMMODATION_AND_FOOD_SERVICES -> Value.ACCOMMODATION_AND_FOOD_SERVICES
                            OTHER_SERVICES -> Value.OTHER_SERVICES
                            PUBLIC_ADMINISTRATION -> Value.PUBLIC_ADMINISTRATION
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
                            HEALTH_CARE_AND_SOCIAL_ASSISTANCE ->
                                Known.HEALTH_CARE_AND_SOCIAL_ASSISTANCE
                            ARTS_ENTERTAINMENT_AND_RECREATION ->
                                Known.ARTS_ENTERTAINMENT_AND_RECREATION
                            ACCOMMODATION_AND_FOOD_SERVICES -> Known.ACCOMMODATION_AND_FOOD_SERVICES
                            OTHER_SERVICES -> Known.OTHER_SERVICES
                            PUBLIC_ADMINISTRATION -> Known.PUBLIC_ADMINISTRATION
                            else ->
                                throw LightsparkGridInvalidDataException(
                                    "Unknown BusinessType: $value"
                                )
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [EntityType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [EntityType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [EntityType] was instantiated with an
                         * unknown value.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
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
                                throw LightsparkGridInvalidDataException(
                                    "Unknown EntityType: $value"
                                )
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

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [ExpectedMonthlyTransactionCount]'s known values, as well
                     * as an [_UNKNOWN] member.
                     *
                     * An instance of [ExpectedMonthlyTransactionCount] can contain an unknown value
                     * in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
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
                     * @throws LightsparkGridInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LightsparkGridInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val VOLUME_UNDER_10_K = of("VOLUME_UNDER_10K")

                        val VOLUME_10_K_TO_100_K = of("VOLUME_10K_TO_100K")

                        val VOLUME_100_K_TO_1_M = of("VOLUME_100K_TO_1M")

                        val VOLUME_1_M_TO_10_M = of("VOLUME_1M_TO_10M")

                        val VOLUME_OVER_10_M = of("VOLUME_OVER_10M")

                        fun of(value: String) =
                            ExpectedMonthlyTransactionVolume(JsonField.of(value))
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
                     * An enum containing [ExpectedMonthlyTransactionVolume]'s known values, as well
                     * as an [_UNKNOWN] member.
                     *
                     * An instance of [ExpectedMonthlyTransactionVolume] can contain an unknown
                     * value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
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
                     * @throws LightsparkGridInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LightsparkGridInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
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
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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
                     * An enum containing [PurposeOfAccount]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [PurposeOfAccount] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [PurposeOfAccount] was instantiated with
                         * an unknown value.
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws LightsparkGridInvalidDataException if this class instance's value is
                     *   a not a known member.
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
                     * @throws LightsparkGridInvalidDataException if this class instance's value
                     *   does not have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString()
                            ?: throw LightsparkGridInvalidDataException("Value is not a String")

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
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
                        businessType == other.businessType &&
                        countriesOfOperation == other.countriesOfOperation &&
                        country == other.country &&
                        doingBusinessAs == other.doingBusinessAs &&
                        entityType == other.entityType &&
                        expectedMonthlyTransactionCount == other.expectedMonthlyTransactionCount &&
                        expectedMonthlyTransactionVolume ==
                            other.expectedMonthlyTransactionVolume &&
                        expectedRecipientJurisdictions == other.expectedRecipientJurisdictions &&
                        incorporatedOn == other.incorporatedOn &&
                        legalName == other.legalName &&
                        purposeOfAccount == other.purposeOfAccount &&
                        registrationNumber == other.registrationNumber &&
                        sourceOfFunds == other.sourceOfFunds &&
                        taxId == other.taxId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        businessType,
                        countriesOfOperation,
                        country,
                        doingBusinessAs,
                        entityType,
                        expectedMonthlyTransactionCount,
                        expectedMonthlyTransactionVolume,
                        expectedRecipientJurisdictions,
                        incorporatedOn,
                        legalName,
                        purposeOfAccount,
                        registrationNumber,
                        sourceOfFunds,
                        taxId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "BusinessInfo{businessType=$businessType, countriesOfOperation=$countriesOfOperation, country=$country, doingBusinessAs=$doingBusinessAs, entityType=$entityType, expectedMonthlyTransactionCount=$expectedMonthlyTransactionCount, expectedMonthlyTransactionVolume=$expectedMonthlyTransactionVolume, expectedRecipientJurisdictions=$expectedRecipientJurisdictions, incorporatedOn=$incorporatedOn, legalName=$legalName, purposeOfAccount=$purposeOfAccount, registrationNumber=$registrationNumber, sourceOfFunds=$sourceOfFunds, taxId=$taxId, additionalProperties=$additionalProperties}"
            }

            /** The current KYB status of a business customer */
            class KybStatus @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    fun of(value: String) = KybStatus(JsonField.of(value))
                }

                /** An enum containing [KybStatus]'s known values. */
                enum class Known {
                    UNVERIFIED,
                    PENDING,
                    APPROVED,
                    REJECTED,
                }

                /**
                 * An enum containing [KybStatus]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [KybStatus] can contain an unknown value in a couple of cases:
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
                     * An enum member indicating that [KybStatus] was instantiated with an unknown
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
                            throw LightsparkGridInvalidDataException("Unknown KybStatus: $value")
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
                fun validate(): KybStatus = apply {
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

                    return other is KybStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Business &&
                    customerType == other.customerType &&
                    address == other.address &&
                    businessInfo == other.businessInfo &&
                    currencies == other.currencies &&
                    email == other.email &&
                    kybStatus == other.kybStatus &&
                    platformCustomerId == other.platformCustomerId &&
                    region == other.region &&
                    umaAddress == other.umaAddress &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    customerType,
                    address,
                    businessInfo,
                    currencies,
                    email,
                    kybStatus,
                    platformCustomerId,
                    region,
                    umaAddress,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Business{customerType=$customerType, address=$address, businessInfo=$businessInfo, currencies=$currencies, email=$email, kybStatus=$kybStatus, platformCustomerId=$platformCustomerId, region=$region, umaAddress=$umaAddress, additionalProperties=$additionalProperties}"
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
