// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

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
import java.util.Collections
import java.util.Objects

class BeneficialOwnerCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val customerId: JsonField<String>,
    private val ownershipPercentage: JsonField<Long>,
    private val personalInfo: JsonField<BeneficialOwnerPersonalInfo>,
    private val roles: JsonField<List<BeneficialOwnerRole>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ownershipPercentage")
        @ExcludeMissing
        ownershipPercentage: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("personalInfo")
        @ExcludeMissing
        personalInfo: JsonField<BeneficialOwnerPersonalInfo> = JsonMissing.of(),
        @JsonProperty("roles")
        @ExcludeMissing
        roles: JsonField<List<BeneficialOwnerRole>> = JsonMissing.of(),
    ) : this(customerId, ownershipPercentage, personalInfo, roles, mutableMapOf())

    /**
     * The ID of the business customer this beneficial owner is associated with
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * Percentage of ownership in the business (0-100). Relevant when role includes UBO.
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
    fun roles(): List<BeneficialOwnerRole> = roles.getRequired("roles")

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

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
    @JsonProperty("roles")
    @ExcludeMissing
    fun _roles(): JsonField<List<BeneficialOwnerRole>> = roles

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
         * Returns a mutable builder for constructing an instance of [BeneficialOwnerCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .ownershipPercentage()
         * .personalInfo()
         * .roles()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BeneficialOwnerCreateRequest]. */
    class Builder internal constructor() {

        private var customerId: JsonField<String>? = null
        private var ownershipPercentage: JsonField<Long>? = null
        private var personalInfo: JsonField<BeneficialOwnerPersonalInfo>? = null
        private var roles: JsonField<MutableList<BeneficialOwnerRole>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(beneficialOwnerCreateRequest: BeneficialOwnerCreateRequest) = apply {
            customerId = beneficialOwnerCreateRequest.customerId
            ownershipPercentage = beneficialOwnerCreateRequest.ownershipPercentage
            personalInfo = beneficialOwnerCreateRequest.personalInfo
            roles = beneficialOwnerCreateRequest.roles.map { it.toMutableList() }
            additionalProperties = beneficialOwnerCreateRequest.additionalProperties.toMutableMap()
        }

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

        /** Percentage of ownership in the business (0-100). Relevant when role includes UBO. */
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
        fun roles(roles: List<BeneficialOwnerRole>) = roles(JsonField.of(roles))

        /**
         * Sets [Builder.roles] to an arbitrary JSON value.
         *
         * You should usually call [Builder.roles] with a well-typed `List<BeneficialOwnerRole>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun roles(roles: JsonField<List<BeneficialOwnerRole>>) = apply {
            this.roles = roles.map { it.toMutableList() }
        }

        /**
         * Adds a single [BeneficialOwnerRole] to [roles].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRole(role: BeneficialOwnerRole) = apply {
            roles =
                (roles ?: JsonField.of(mutableListOf())).also { checkKnown("roles", it).add(role) }
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
         * Returns an immutable instance of [BeneficialOwnerCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .customerId()
         * .ownershipPercentage()
         * .personalInfo()
         * .roles()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BeneficialOwnerCreateRequest =
            BeneficialOwnerCreateRequest(
                checkRequired("customerId", customerId),
                checkRequired("ownershipPercentage", ownershipPercentage),
                checkRequired("personalInfo", personalInfo),
                checkRequired("roles", roles).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): BeneficialOwnerCreateRequest = apply {
        if (validated) {
            return@apply
        }

        customerId()
        ownershipPercentage()
        personalInfo().validate()
        roles().forEach { it.validate() }
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
        (if (customerId.asKnown() == null) 0 else 1) +
            (if (ownershipPercentage.asKnown() == null) 0 else 1) +
            (personalInfo.asKnown()?.validity() ?: 0) +
            (roles.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BeneficialOwnerCreateRequest &&
            customerId == other.customerId &&
            ownershipPercentage == other.ownershipPercentage &&
            personalInfo == other.personalInfo &&
            roles == other.roles &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(customerId, ownershipPercentage, personalInfo, roles, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BeneficialOwnerCreateRequest{customerId=$customerId, ownershipPercentage=$ownershipPercentage, personalInfo=$personalInfo, roles=$roles, additionalProperties=$additionalProperties}"
}
