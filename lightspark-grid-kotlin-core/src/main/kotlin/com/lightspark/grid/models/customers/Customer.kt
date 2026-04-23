// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Customer
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val platformCustomerId: JsonField<String>,
    private val umaAddress: JsonField<String>,
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currencies: JsonField<List<String>>,
    private val email: JsonField<String>,
    private val isDeleted: JsonField<Boolean>,
    private val region: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
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
        @JsonProperty("currencies")
        @ExcludeMissing
        currencies: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isDeleted") @ExcludeMissing isDeleted: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("region") @ExcludeMissing region: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        platformCustomerId,
        umaAddress,
        id,
        createdAt,
        currencies,
        email,
        isDeleted,
        region,
        updatedAt,
        mutableMapOf(),
    )

    /**
     * Platform-specific customer identifier
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun platformCustomerId(): String = platformCustomerId.getRequired("platformCustomerId")

    /**
     * Full UMA address (always present in responses, even if system-generated). This is an optional
     * identifier to route payments to the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun umaAddress(): String = umaAddress.getRequired("umaAddress")

    /**
     * System-generated unique identifier
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun id(): String? = id.getNullable("id")

    /**
     * Creation timestamp
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime? = createdAt.getNullable("createdAt")

    /**
     * List of currency codes enabled for this customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currencies(): List<String>? = currencies.getNullable("currencies")

    /**
     * Email address for the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun email(): String? = email.getNullable("email")

    /**
     * Whether the customer is marked as deleted
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isDeleted(): Boolean? = isDeleted.getNullable("isDeleted")

    /**
     * Country code (ISO 3166-1 alpha-2) representing the customer's regional identity and
     * regulatory jurisdiction.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun region(): String? = region.getNullable("region")

    /**
     * Last update timestamp
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

    /**
     * Returns the raw JSON value of [platformCustomerId].
     *
     * Unlike [platformCustomerId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("platformCustomerId")
    @ExcludeMissing
    fun _platformCustomerId(): JsonField<String> = platformCustomerId

    /**
     * Returns the raw JSON value of [umaAddress].
     *
     * Unlike [umaAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("umaAddress") @ExcludeMissing fun _umaAddress(): JsonField<String> = umaAddress

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
         * Returns a mutable builder for constructing an instance of [Customer].
         *
         * The following fields are required:
         * ```kotlin
         * .platformCustomerId()
         * .umaAddress()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Customer]. */
    class Builder internal constructor() {

        private var platformCustomerId: JsonField<String>? = null
        private var umaAddress: JsonField<String>? = null
        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currencies: JsonField<MutableList<String>>? = null
        private var email: JsonField<String> = JsonMissing.of()
        private var isDeleted: JsonField<Boolean> = JsonMissing.of()
        private var region: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customer: Customer) = apply {
            platformCustomerId = customer.platformCustomerId
            umaAddress = customer.umaAddress
            id = customer.id
            createdAt = customer.createdAt
            currencies = customer.currencies.map { it.toMutableList() }
            email = customer.email
            isDeleted = customer.isDeleted
            region = customer.region
            updatedAt = customer.updatedAt
            additionalProperties = customer.additionalProperties.toMutableMap()
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
         * You should usually call [Builder.umaAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun umaAddress(umaAddress: JsonField<String>) = apply { this.umaAddress = umaAddress }

        /** System-generated unique identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        /** Whether the customer is marked as deleted */
        fun isDeleted(isDeleted: Boolean) = isDeleted(JsonField.of(isDeleted))

        /**
         * Sets [Builder.isDeleted] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDeleted] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         * You should usually call [Builder.region] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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
         * Returns an immutable instance of [Customer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .platformCustomerId()
         * .umaAddress()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Customer =
            Customer(
                checkRequired("platformCustomerId", platformCustomerId),
                checkRequired("umaAddress", umaAddress),
                id,
                createdAt,
                (currencies ?: JsonMissing.of()).map { it.toImmutable() },
                email,
                isDeleted,
                region,
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Customer = apply {
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
        (if (platformCustomerId.asKnown() == null) 0 else 1) +
            (if (umaAddress.asKnown() == null) 0 else 1) +
            (if (id.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (currencies.asKnown()?.size ?: 0) +
            (if (email.asKnown() == null) 0 else 1) +
            (if (isDeleted.asKnown() == null) 0 else 1) +
            (if (region.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Customer &&
            platformCustomerId == other.platformCustomerId &&
            umaAddress == other.umaAddress &&
            id == other.id &&
            createdAt == other.createdAt &&
            currencies == other.currencies &&
            email == other.email &&
            isDeleted == other.isDeleted &&
            region == other.region &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            platformCustomerId,
            umaAddress,
            id,
            createdAt,
            currencies,
            email,
            isDeleted,
            region,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Customer{platformCustomerId=$platformCustomerId, umaAddress=$umaAddress, id=$id, createdAt=$createdAt, currencies=$currencies, email=$email, isDeleted=$isDeleted, region=$region, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
