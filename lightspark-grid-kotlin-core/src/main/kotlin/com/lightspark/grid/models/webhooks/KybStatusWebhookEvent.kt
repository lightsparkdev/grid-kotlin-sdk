// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

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
import com.lightspark.grid.models.customers.BusinessCustomerFields
import com.lightspark.grid.models.customers.Customer
import com.lightspark.grid.models.customers.externalaccounts.Address
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class KybStatusWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, data, timestamp, type, mutableMapOf())

    /**
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * ISO 8601 timestamp of when the webhook was sent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [KybStatusWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [KybStatusWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(kybStatusWebhookEvent: KybStatusWebhookEvent) = apply {
            id = kybStatusWebhookEvent.id
            data = kybStatusWebhookEvent.data
            timestamp = kybStatusWebhookEvent.timestamp
            type = kybStatusWebhookEvent.type
            additionalProperties = kybStatusWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this webhook delivery (can be used for idempotency) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** ISO 8601 timestamp of when the webhook was sent */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [KybStatusWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): KybStatusWebhookEvent =
            KybStatusWebhookEvent(
                checkRequired("id", id),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): KybStatusWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        data().validate()
        timestamp()
        type().validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    class Data
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
        private val beneficialOwners: JsonField<List<BusinessCustomerFields.BeneficialOwner>>,
        private val businessInfo: JsonField<BusinessCustomerFields.BusinessInfo>,
        private val kybStatus: JsonField<BusinessCustomerFields.KybStatus>,
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
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            isDeleted,
            updatedAt,
            customerType,
            address,
            beneficialOwners,
            businessInfo,
            kybStatus,
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
                .beneficialOwners(beneficialOwners)
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
             * Returns a mutable builder for constructing an instance of [Data].
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var platformCustomerId: JsonField<String>? = null
            private var umaAddress: JsonField<String>? = null
            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var isDeleted: JsonField<Boolean> = JsonMissing.of()
            private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerType: JsonField<BusinessCustomerFields.CustomerType>? = null
            private var address: JsonField<Address> = JsonMissing.of()
            private var beneficialOwners:
                JsonField<MutableList<BusinessCustomerFields.BeneficialOwner>>? =
                null
            private var businessInfo: JsonField<BusinessCustomerFields.BusinessInfo> =
                JsonMissing.of()
            private var kybStatus: JsonField<BusinessCustomerFields.KybStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                platformCustomerId = data.platformCustomerId
                umaAddress = data.umaAddress
                id = data.id
                createdAt = data.createdAt
                isDeleted = data.isDeleted
                updatedAt = data.updatedAt
                customerType = data.customerType
                address = data.address
                beneficialOwners = data.beneficialOwners.map { it.toMutableList() }
                businessInfo = data.businessInfo
                kybStatus = data.kybStatus
                additionalProperties = data.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Data].
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
            fun build(): Data =
                Data(
                    checkRequired("platformCustomerId", platformCustomerId),
                    checkRequired("umaAddress", umaAddress),
                    id,
                    createdAt,
                    isDeleted,
                    updatedAt,
                    checkRequired("customerType", customerType),
                    address,
                    (beneficialOwners ?: JsonMissing.of()).map { it.toImmutable() },
                    businessInfo,
                    kybStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
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
            (if (platformCustomerId.asKnown() == null) 0 else 1) +
                (if (umaAddress.asKnown() == null) 0 else 1) +
                (if (id.asKnown() == null) 0 else 1) +
                (if (createdAt.asKnown() == null) 0 else 1) +
                (if (isDeleted.asKnown() == null) 0 else 1) +
                (if (updatedAt.asKnown() == null) 0 else 1) +
                (customerType.asKnown()?.validity() ?: 0) +
                (address.asKnown()?.validity() ?: 0) +
                (beneficialOwners.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (businessInfo.asKnown()?.validity() ?: 0) +
                (kybStatus.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                platformCustomerId == other.platformCustomerId &&
                umaAddress == other.umaAddress &&
                id == other.id &&
                createdAt == other.createdAt &&
                isDeleted == other.isDeleted &&
                updatedAt == other.updatedAt &&
                customerType == other.customerType &&
                address == other.address &&
                beneficialOwners == other.beneficialOwners &&
                businessInfo == other.businessInfo &&
                kybStatus == other.kybStatus &&
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
                beneficialOwners,
                businessInfo,
                kybStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, isDeleted=$isDeleted, updatedAt=$updatedAt, customerType=$customerType, address=$address, beneficialOwners=$beneficialOwners, businessInfo=$businessInfo, kybStatus=$kybStatus, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CUSTOMER_KYB_APPROVED = of("CUSTOMER.KYB_APPROVED")

            val CUSTOMER_KYB_REJECTED = of("CUSTOMER.KYB_REJECTED")

            val CUSTOMER_KYB_SUBMITTED = of("CUSTOMER.KYB_SUBMITTED")

            val CUSTOMER_KYB_MANUALLY_APPROVED = of("CUSTOMER.KYB_MANUALLY_APPROVED")

            val CUSTOMER_KYB_MANUALLY_REJECTED = of("CUSTOMER.KYB_MANUALLY_REJECTED")

            val OUTGOING_PAYMENT_PENDING = of("OUTGOING_PAYMENT.PENDING")

            val OUTGOING_PAYMENT_PROCESSING = of("OUTGOING_PAYMENT.PROCESSING")

            val OUTGOING_PAYMENT_COMPLETED = of("OUTGOING_PAYMENT.COMPLETED")

            val OUTGOING_PAYMENT_FAILED = of("OUTGOING_PAYMENT.FAILED")

            val OUTGOING_PAYMENT_EXPIRED = of("OUTGOING_PAYMENT.EXPIRED")

            val OUTGOING_PAYMENT_REFUND_PENDING = of("OUTGOING_PAYMENT.REFUND_PENDING")

            val OUTGOING_PAYMENT_REFUND_COMPLETED = of("OUTGOING_PAYMENT.REFUND_COMPLETED")

            val OUTGOING_PAYMENT_REFUND_FAILED = of("OUTGOING_PAYMENT.REFUND_FAILED")

            val INCOMING_PAYMENT_PENDING = of("INCOMING_PAYMENT.PENDING")

            val INCOMING_PAYMENT_COMPLETED = of("INCOMING_PAYMENT.COMPLETED")

            val INCOMING_PAYMENT_FAILED = of("INCOMING_PAYMENT.FAILED")

            val CUSTOMER_KYC_APPROVED = of("CUSTOMER.KYC_APPROVED")

            val CUSTOMER_KYC_REJECTED = of("CUSTOMER.KYC_REJECTED")

            val CUSTOMER_KYC_SUBMITTED = of("CUSTOMER.KYC_SUBMITTED")

            val CUSTOMER_KYC_MANUALLY_APPROVED = of("CUSTOMER.KYC_MANUALLY_APPROVED")

            val CUSTOMER_KYC_MANUALLY_REJECTED = of("CUSTOMER.KYC_MANUALLY_REJECTED")

            val INTERNAL_ACCOUNT_BALANCE_UPDATED = of("INTERNAL_ACCOUNT.BALANCE_UPDATED")

            val INVITATION_CLAIMED = of("INVITATION.CLAIMED")

            val BULK_UPLOAD_COMPLETED = of("BULK_UPLOAD.COMPLETED")

            val BULK_UPLOAD_FAILED = of("BULK_UPLOAD.FAILED")

            val TEST = of("TEST")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_SUBMITTED,
            CUSTOMER_KYB_MANUALLY_APPROVED,
            CUSTOMER_KYB_MANUALLY_REJECTED,
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_SUBMITTED,
            CUSTOMER_KYC_MANUALLY_APPROVED,
            CUSTOMER_KYC_MANUALLY_REJECTED,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            TEST,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_SUBMITTED,
            CUSTOMER_KYB_MANUALLY_APPROVED,
            CUSTOMER_KYB_MANUALLY_REJECTED,
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_SUBMITTED,
            CUSTOMER_KYC_MANUALLY_APPROVED,
            CUSTOMER_KYC_MANUALLY_REJECTED,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            TEST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CUSTOMER_KYB_APPROVED -> Value.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Value.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_SUBMITTED -> Value.CUSTOMER_KYB_SUBMITTED
                CUSTOMER_KYB_MANUALLY_APPROVED -> Value.CUSTOMER_KYB_MANUALLY_APPROVED
                CUSTOMER_KYB_MANUALLY_REJECTED -> Value.CUSTOMER_KYB_MANUALLY_REJECTED
                OUTGOING_PAYMENT_PENDING -> Value.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Value.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Value.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Value.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Value.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Value.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Value.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Value.OUTGOING_PAYMENT_REFUND_FAILED
                INCOMING_PAYMENT_PENDING -> Value.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Value.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Value.INCOMING_PAYMENT_FAILED
                CUSTOMER_KYC_APPROVED -> Value.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Value.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_SUBMITTED -> Value.CUSTOMER_KYC_SUBMITTED
                CUSTOMER_KYC_MANUALLY_APPROVED -> Value.CUSTOMER_KYC_MANUALLY_APPROVED
                CUSTOMER_KYC_MANUALLY_REJECTED -> Value.CUSTOMER_KYC_MANUALLY_REJECTED
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Value.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Value.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Value.BULK_UPLOAD_FAILED
                TEST -> Value.TEST
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
                CUSTOMER_KYB_APPROVED -> Known.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Known.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_SUBMITTED -> Known.CUSTOMER_KYB_SUBMITTED
                CUSTOMER_KYB_MANUALLY_APPROVED -> Known.CUSTOMER_KYB_MANUALLY_APPROVED
                CUSTOMER_KYB_MANUALLY_REJECTED -> Known.CUSTOMER_KYB_MANUALLY_REJECTED
                OUTGOING_PAYMENT_PENDING -> Known.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Known.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Known.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Known.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Known.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Known.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Known.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Known.OUTGOING_PAYMENT_REFUND_FAILED
                INCOMING_PAYMENT_PENDING -> Known.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Known.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Known.INCOMING_PAYMENT_FAILED
                CUSTOMER_KYC_APPROVED -> Known.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Known.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_SUBMITTED -> Known.CUSTOMER_KYC_SUBMITTED
                CUSTOMER_KYC_MANUALLY_APPROVED -> Known.CUSTOMER_KYC_MANUALLY_APPROVED
                CUSTOMER_KYC_MANUALLY_REJECTED -> Known.CUSTOMER_KYC_MANUALLY_REJECTED
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Known.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Known.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Known.BULK_UPLOAD_FAILED
                TEST -> Known.TEST
                else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is KybStatusWebhookEvent &&
            id == other.id &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "KybStatusWebhookEvent{id=$id, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
