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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class BeneficialOwnerCreateResponse
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
        @JsonProperty("roles") @ExcludeMissing roles: JsonField<List<Role>> = JsonMissing.of(),
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
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When this beneficial owner was created
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The ID of the business customer this beneficial owner is associated with
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * The current KYC status of a customer
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kycStatus(): KycStatus = kycStatus.getRequired("kycStatus")

    /**
     * Percentage of ownership in the business (0-100)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ownershipPercentage(): Long = ownershipPercentage.getRequired("ownershipPercentage")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun personalInfo(): BeneficialOwnerPersonalInfo = personalInfo.getRequired("personalInfo")

    /**
     * Roles of this person within the business
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun roles(): List<Role> = roles.getRequired("roles")

    /**
     * When this beneficial owner was last updated
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
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
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [kycStatus].
     *
     * Unlike [kycStatus], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kycStatus") @ExcludeMissing fun _kycStatus(): JsonField<KycStatus> = kycStatus

    /**
     * Returns the raw JSON value of [ownershipPercentage].
     *
     * Unlike [ownershipPercentage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ownershipPercentage")
    @ExcludeMissing
    fun _ownershipPercentage(): JsonField<Long> = ownershipPercentage

    /**
     * Returns the raw JSON value of [personalInfo].
     *
     * Unlike [personalInfo], this method doesn't throw if the JSON field has an unexpected type.
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
         * Returns a mutable builder for constructing an instance of
         * [BeneficialOwnerCreateResponse].
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

    /** A builder for [BeneficialOwnerCreateResponse]. */
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

        internal fun from(beneficialOwnerCreateResponse: BeneficialOwnerCreateResponse) = apply {
            id = beneficialOwnerCreateResponse.id
            createdAt = beneficialOwnerCreateResponse.createdAt
            customerId = beneficialOwnerCreateResponse.customerId
            kycStatus = beneficialOwnerCreateResponse.kycStatus
            ownershipPercentage = beneficialOwnerCreateResponse.ownershipPercentage
            personalInfo = beneficialOwnerCreateResponse.personalInfo
            roles = beneficialOwnerCreateResponse.roles.map { it.toMutableList() }
            updatedAt = beneficialOwnerCreateResponse.updatedAt
            additionalProperties = beneficialOwnerCreateResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this beneficial owner */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When this beneficial owner was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of the business customer this beneficial owner is associated with */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /** The current KYC status of a customer */
        fun kycStatus(kycStatus: KycStatus) = kycStatus(JsonField.of(kycStatus))

        /**
         * Sets [Builder.kycStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kycStatus] with a well-typed [KycStatus] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun kycStatus(kycStatus: JsonField<KycStatus>) = apply { this.kycStatus = kycStatus }

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

        fun personalInfo(personalInfo: BeneficialOwnerPersonalInfo) =
            personalInfo(JsonField.of(personalInfo))

        /**
         * Sets [Builder.personalInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.personalInfo] with a well-typed
         * [BeneficialOwnerPersonalInfo] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun personalInfo(personalInfo: JsonField<BeneficialOwnerPersonalInfo>) = apply {
            this.personalInfo = personalInfo
        }

        /** Roles of this person within the business */
        fun roles(roles: List<Role>) = roles(JsonField.of(roles))

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<Role>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
                (roles ?: JsonField.of(mutableListOf())).also { checkKnown("roles", it).add(role) }
        }

        /** When this beneficial owner was last updated */
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
         * Returns an immutable instance of [BeneficialOwnerCreateResponse].
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
        fun build(): BeneficialOwnerCreateResponse =
            BeneficialOwnerCreateResponse(
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

    fun validate(): BeneficialOwnerCreateResponse = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
    class KycStatus @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            UNVERIFIED,
            PENDING,
            APPROVED,
            REJECTED,
            /**
             * An enum member indicating that [KycStatus] was instantiated with an unknown value.
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
                UNVERIFIED -> Value.UNVERIFIED
                PENDING -> Value.PENDING
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
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
                UNVERIFIED -> Known.UNVERIFIED
                PENDING -> Known.PENDING
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                else -> throw LightsparkGridInvalidDataException("Unknown KycStatus: $value")
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

        return other is BeneficialOwnerCreateResponse &&
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
        "BeneficialOwnerCreateResponse{id=$id, createdAt=$createdAt, customerId=$customerId, kycStatus=$kycStatus, ownershipPercentage=$ownershipPercentage, personalInfo=$personalInfo, roles=$roles, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
