// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

/**
 * Update mutable fields on a customer external account. Only `platformAccountId` and `beneficiary`
 * can be updated via this endpoint.
 */
class ExternalAccountUpdateParams
private constructor(
    private val externalAccountId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalAccountId(): String? = externalAccountId

    /**
     * Updated beneficiary information for the external account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun beneficiary(): Beneficiary? = body.beneficiary()

    /**
     * Optional platform-specific identifier for this account
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformAccountId(): String? = body.platformAccountId()

    /**
     * Returns the raw JSON value of [beneficiary].
     *
     * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _beneficiary(): JsonField<Beneficiary> = body._beneficiary()

    /**
     * Returns the raw JSON value of [platformAccountId].
     *
     * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _platformAccountId(): JsonField<String> = body._platformAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ExternalAccountUpdateParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountUpdateParams].
         */
        fun builder() = Builder()
    }

    /** A builder for [ExternalAccountUpdateParams]. */
    class Builder internal constructor() {

        private var externalAccountId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(externalAccountUpdateParams: ExternalAccountUpdateParams) = apply {
            externalAccountId = externalAccountUpdateParams.externalAccountId
            body = externalAccountUpdateParams.body.toBuilder()
            additionalHeaders = externalAccountUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountUpdateParams.additionalQueryParams.toBuilder()
        }

        fun externalAccountId(externalAccountId: String?) = apply {
            this.externalAccountId = externalAccountId
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [beneficiary]
         * - [platformAccountId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Updated beneficiary information for the external account */
        fun beneficiary(beneficiary: Beneficiary) = apply { body.beneficiary(beneficiary) }

        /**
         * Sets [Builder.beneficiary] to an arbitrary JSON value.
         *
         * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
            body.beneficiary(beneficiary)
        }

        /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
        fun beneficiary(individual: Beneficiary.IndividualBeneficiary) = apply {
            body.beneficiary(individual)
        }

        /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
        fun beneficiary(business: BusinessBeneficiary) = apply { body.beneficiary(business) }

        /**
         * Alias for calling [beneficiary] with the following:
         * ```kotlin
         * BusinessBeneficiary.builder()
         *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
         *     .legalName(legalName)
         *     .build()
         * ```
         */
        fun businessBeneficiary(legalName: String) = apply { body.businessBeneficiary(legalName) }

        /** Optional platform-specific identifier for this account */
        fun platformAccountId(platformAccountId: String) = apply {
            body.platformAccountId(platformAccountId)
        }

        /**
         * Sets [Builder.platformAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformAccountId(platformAccountId: JsonField<String>) = apply {
            body.platformAccountId(platformAccountId)
        }

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
         * Returns an immutable instance of [ExternalAccountUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ExternalAccountUpdateParams =
            ExternalAccountUpdateParams(
                externalAccountId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalAccountId ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    /** Request body for updating an external account. Only a limited set of fields are mutable. */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val beneficiary: JsonField<Beneficiary>,
        private val platformAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("platformAccountId")
            @ExcludeMissing
            platformAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(beneficiary, platformAccountId, mutableMapOf())

        /**
         * Updated beneficiary information for the external account
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary? = beneficiary.getNullable("beneficiary")

        /**
         * Optional platform-specific identifier for this account
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun platformAccountId(): String? = platformAccountId.getNullable("platformAccountId")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [platformAccountId].
         *
         * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platformAccountId")
        @ExcludeMissing
        fun _platformAccountId(): JsonField<String> = platformAccountId

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

            private var beneficiary: JsonField<Beneficiary> = JsonMissing.of()
            private var platformAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                beneficiary = body.beneficiary
                platformAccountId = body.platformAccountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Updated beneficiary information for the external account */
            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.IndividualBeneficiary) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** Optional platform-specific identifier for this account */
            fun platformAccountId(platformAccountId: String) =
                platformAccountId(JsonField.of(platformAccountId))

            /**
             * Sets [Builder.platformAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformAccountId(platformAccountId: JsonField<String>) = apply {
                this.platformAccountId = platformAccountId
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
                Body(beneficiary, platformAccountId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            beneficiary()?.validate()
            platformAccountId()
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
            (beneficiary.asKnown()?.validity() ?: 0) +
                (if (platformAccountId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                beneficiary == other.beneficiary &&
                platformAccountId == other.platformAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(beneficiary, platformAccountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{beneficiary=$beneficiary, platformAccountId=$platformAccountId, additionalProperties=$additionalProperties}"
    }

    /** Updated beneficiary information for the external account */
    @JsonDeserialize(using = Beneficiary.Deserializer::class)
    @JsonSerialize(using = Beneficiary.Serializer::class)
    class Beneficiary
    private constructor(
        private val individual: IndividualBeneficiary? = null,
        private val business: BusinessBeneficiary? = null,
        private val _json: JsonValue? = null,
    ) {

        fun individual(): IndividualBeneficiary? = individual

        fun business(): BusinessBeneficiary? = business

        fun isIndividual(): Boolean = individual != null

        fun isBusiness(): Boolean = business != null

        fun asIndividual(): IndividualBeneficiary = individual.getOrThrow("individual")

        fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                individual != null -> visitor.visitIndividual(individual)
                business != null -> visitor.visitBusiness(business)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): Beneficiary = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitIndividual(individual: IndividualBeneficiary) {
                        individual.validate()
                    }

                    override fun visitBusiness(business: BusinessBeneficiary) {
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
                    override fun visitIndividual(individual: IndividualBeneficiary) =
                        individual.validity()

                    override fun visitBusiness(business: BusinessBeneficiary) = business.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Beneficiary &&
                individual == other.individual &&
                business == other.business
        }

        override fun hashCode(): Int = Objects.hash(individual, business)

        override fun toString(): String =
            when {
                individual != null -> "Beneficiary{individual=$individual}"
                business != null -> "Beneficiary{business=$business}"
                _json != null -> "Beneficiary{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Beneficiary")
            }

        companion object {

            fun ofIndividual(individual: IndividualBeneficiary) =
                Beneficiary(individual = individual)

            fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
        }

        /**
         * An interface that defines how to map each variant of [Beneficiary] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitIndividual(individual: IndividualBeneficiary): T

            fun visitBusiness(business: BusinessBeneficiary): T

            /**
             * Maps an unknown variant of [Beneficiary] to a value of type [T].
             *
             * An instance of [Beneficiary] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                val json = JsonValue.fromJsonNode(node)
                val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                if (beneficiaryType == "BUSINESS") {
                    return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())?.let {
                        Beneficiary(business = it, _json = json)
                    } ?: Beneficiary(_json = json)
                }

                return tryDeserialize(node, jacksonTypeRef<IndividualBeneficiary>())?.let {
                    Beneficiary(individual = it, _json = json)
                } ?: Beneficiary(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

            override fun serialize(
                value: Beneficiary,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.individual != null -> generator.writeObject(value.individual)
                    value.business != null -> generator.writeObject(value.business)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }
            }
        }

        class IndividualBeneficiary
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val beneficiaryType: JsonField<BeneficiaryType>,
            private val birthDate: JsonField<LocalDate>,
            private val fullName: JsonField<String>,
            private val nationality: JsonField<String>,
            private val address: JsonField<Address>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                beneficiaryType: JsonField<BeneficiaryType> = JsonMissing.of(),
                @JsonProperty("birthDate")
                @ExcludeMissing
                birthDate: JsonField<LocalDate> = JsonMissing.of(),
                @JsonProperty("fullName")
                @ExcludeMissing
                fullName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("nationality")
                @ExcludeMissing
                nationality: JsonField<String> = JsonMissing.of(),
                @JsonProperty("address")
                @ExcludeMissing
                address: JsonField<Address> = JsonMissing.of(),
            ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun beneficiaryType(): BeneficiaryType = beneficiaryType.getRequired("beneficiaryType")

            /**
             * Date of birth in ISO 8601 format (YYYY-MM-DD)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

            /**
             * Individual's full name
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fullName(): String = fullName.getRequired("fullName")

            /**
             * Country code (ISO 3166-1 alpha-2)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun nationality(): String = nationality.getRequired("nationality")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun address(): Address? = address.getNullable("address")

            /**
             * Returns the raw JSON value of [beneficiaryType].
             *
             * Unlike [beneficiaryType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("beneficiaryType")
            @ExcludeMissing
            fun _beneficiaryType(): JsonField<BeneficiaryType> = beneficiaryType

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
             * Returns the raw JSON value of [nationality].
             *
             * Unlike [nationality], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("nationality")
            @ExcludeMissing
            fun _nationality(): JsonField<String> = nationality

            /**
             * Returns the raw JSON value of [address].
             *
             * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

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
                 * Returns a mutable builder for constructing an instance of
                 * [IndividualBeneficiary].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .beneficiaryType()
                 * .birthDate()
                 * .fullName()
                 * .nationality()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [IndividualBeneficiary]. */
            class Builder internal constructor() {

                private var beneficiaryType: JsonField<BeneficiaryType>? = null
                private var birthDate: JsonField<LocalDate>? = null
                private var fullName: JsonField<String>? = null
                private var nationality: JsonField<String>? = null
                private var address: JsonField<Address> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(individualBeneficiary: IndividualBeneficiary) = apply {
                    beneficiaryType = individualBeneficiary.beneficiaryType
                    birthDate = individualBeneficiary.birthDate
                    fullName = individualBeneficiary.fullName
                    nationality = individualBeneficiary.nationality
                    address = individualBeneficiary.address
                    additionalProperties = individualBeneficiary.additionalProperties.toMutableMap()
                }

                fun beneficiaryType(beneficiaryType: BeneficiaryType) =
                    beneficiaryType(JsonField.of(beneficiaryType))

                /**
                 * Sets [Builder.beneficiaryType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.beneficiaryType] with a well-typed
                 * [BeneficiaryType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun beneficiaryType(beneficiaryType: JsonField<BeneficiaryType>) = apply {
                    this.beneficiaryType = beneficiaryType
                }

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

                fun address(address: Address) = address(JsonField.of(address))

                /**
                 * Sets [Builder.address] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.address] with a well-typed [Address] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun address(address: JsonField<Address>) = apply { this.address = address }

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
                 * Returns an immutable instance of [IndividualBeneficiary].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .beneficiaryType()
                 * .birthDate()
                 * .fullName()
                 * .nationality()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): IndividualBeneficiary =
                    IndividualBeneficiary(
                        checkRequired("beneficiaryType", beneficiaryType),
                        checkRequired("birthDate", birthDate),
                        checkRequired("fullName", fullName),
                        checkRequired("nationality", nationality),
                        address,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): IndividualBeneficiary = apply {
                if (validated) {
                    return@apply
                }

                beneficiaryType().validate()
                birthDate()
                fullName()
                nationality()
                address()?.validate()
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
                (beneficiaryType.asKnown()?.validity() ?: 0) +
                    (if (birthDate.asKnown() == null) 0 else 1) +
                    (if (fullName.asKnown() == null) 0 else 1) +
                    (if (nationality.asKnown() == null) 0 else 1) +
                    (address.asKnown()?.validity() ?: 0)

            class BeneficiaryType
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

                    val INDIVIDUAL = of("INDIVIDUAL")

                    val BUSINESS = of("BUSINESS")

                    fun of(value: String) = BeneficiaryType(JsonField.of(value))
                }

                /** An enum containing [BeneficiaryType]'s known values. */
                enum class Known {
                    INDIVIDUAL,
                    BUSINESS,
                }

                /**
                 * An enum containing [BeneficiaryType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BeneficiaryType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    INDIVIDUAL,
                    BUSINESS,
                    /**
                     * An enum member indicating that [BeneficiaryType] was instantiated with an
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
                        INDIVIDUAL -> Value.INDIVIDUAL
                        BUSINESS -> Value.BUSINESS
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
                        INDIVIDUAL -> Known.INDIVIDUAL
                        BUSINESS -> Known.BUSINESS
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown BeneficiaryType: $value"
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

                fun validate(): BeneficiaryType = apply {
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

                    return other is BeneficiaryType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is IndividualBeneficiary &&
                    beneficiaryType == other.beneficiaryType &&
                    birthDate == other.birthDate &&
                    fullName == other.fullName &&
                    nationality == other.nationality &&
                    address == other.address &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    beneficiaryType,
                    birthDate,
                    fullName,
                    nationality,
                    address,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "IndividualBeneficiary{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountUpdateParams &&
            externalAccountId == other.externalAccountId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(externalAccountId, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalAccountUpdateParams{externalAccountId=$externalAccountId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
