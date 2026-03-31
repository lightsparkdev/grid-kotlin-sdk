// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

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

class VerificationRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customerId: JsonField<String>,
    private val errors: JsonField<List<Error>>,
    private val verificationStatus: JsonField<VerificationStatus>,
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
        @JsonProperty("errors") @ExcludeMissing errors: JsonField<List<Error>> = JsonMissing.of(),
        @JsonProperty("verificationStatus")
        @ExcludeMissing
        verificationStatus: JsonField<VerificationStatus> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(id, createdAt, customerId, errors, verificationStatus, updatedAt, mutableMapOf())

    /**
     * Unique identifier for this verification
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * When this verification was created
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * The ID of the customer being verified
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customerId")

    /**
     * List of issues preventing verification from proceeding. Empty when verificationStatus is
     * APPROVED or IN_PROGRESS.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun errors(): List<Error> = errors.getRequired("errors")

    /**
     * Current status of the KYC/KYB verification
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationStatus(): VerificationStatus =
        verificationStatus.getRequired("verificationStatus")

    /**
     * When this verification was last updated
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
     * Returns the raw JSON value of [errors].
     *
     * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<Error>> = errors

    /**
     * Returns the raw JSON value of [verificationStatus].
     *
     * Unlike [verificationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("verificationStatus")
    @ExcludeMissing
    fun _verificationStatus(): JsonField<VerificationStatus> = verificationStatus

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
         * Returns a mutable builder for constructing an instance of [VerificationRetrieveResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customerId()
         * .errors()
         * .verificationStatus()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VerificationRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customerId: JsonField<String>? = null
        private var errors: JsonField<MutableList<Error>>? = null
        private var verificationStatus: JsonField<VerificationStatus>? = null
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(verificationRetrieveResponse: VerificationRetrieveResponse) = apply {
            id = verificationRetrieveResponse.id
            createdAt = verificationRetrieveResponse.createdAt
            customerId = verificationRetrieveResponse.customerId
            errors = verificationRetrieveResponse.errors.map { it.toMutableList() }
            verificationStatus = verificationRetrieveResponse.verificationStatus
            updatedAt = verificationRetrieveResponse.updatedAt
            additionalProperties = verificationRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this verification */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** When this verification was created */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The ID of the customer being verified */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * List of issues preventing verification from proceeding. Empty when verificationStatus is
         * APPROVED or IN_PROGRESS.
         */
        fun errors(errors: List<Error>) = errors(JsonField.of(errors))

        /**
         * Sets [Builder.errors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.errors] with a well-typed `List<Error>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun errors(errors: JsonField<List<Error>>) = apply {
            this.errors = errors.map { it.toMutableList() }
        }

        /**
         * Adds a single [Error] to [errors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addError(error: Error) = apply {
            errors =
                (errors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("errors", it).add(error)
                }
        }

        /** Current status of the KYC/KYB verification */
        fun verificationStatus(verificationStatus: VerificationStatus) =
            verificationStatus(JsonField.of(verificationStatus))

        /**
         * Sets [Builder.verificationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationStatus] with a well-typed
         * [VerificationStatus] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun verificationStatus(verificationStatus: JsonField<VerificationStatus>) = apply {
            this.verificationStatus = verificationStatus
        }

        /** When this verification was last updated */
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
         * Returns an immutable instance of [VerificationRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .createdAt()
         * .customerId()
         * .errors()
         * .verificationStatus()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationRetrieveResponse =
            VerificationRetrieveResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customerId", customerId),
                checkRequired("errors", errors).map { it.toImmutable() },
                checkRequired("verificationStatus", verificationStatus),
                updatedAt,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VerificationRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customerId()
        errors().forEach { it.validate() }
        verificationStatus().validate()
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
            (errors.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (verificationStatus.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1)

    class Error
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val reason: JsonField<String>,
        private val resourceId: JsonField<String>,
        private val type: JsonField<Type>,
        private val acceptedDocumentTypes: JsonField<List<AcceptedDocumentType>>,
        private val field: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("resourceId")
            @ExcludeMissing
            resourceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("acceptedDocumentTypes")
            @ExcludeMissing
            acceptedDocumentTypes: JsonField<List<AcceptedDocumentType>> = JsonMissing.of(),
            @JsonProperty("field") @ExcludeMissing field: JsonField<String> = JsonMissing.of(),
        ) : this(reason, resourceId, type, acceptedDocumentTypes, field, mutableMapOf())

        /**
         * Human-readable description of the issue
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * ID of the resource with the issue (Customer, BeneficialOwner, or Document)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resourceId(): String = resourceId.getRequired("resourceId")

        /**
         * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate which
         * document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
         * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents.
         * APPLICANT_* types indicate issues with the applicant themselves (sanctions, fraud,
         * criminal records).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Document types that would satisfy this requirement. The integrator can upload any one of
         * the listed types. Present when type is MISSING_LEGAL_PRESENCE_DOCUMENT,
         * MISSING_COMPANY_DETAILS_DOCUMENT, MISSING_CONTROL_STRUCTURE_DOCUMENT,
         * MISSING_OWNERSHIP_STRUCTURE_DOCUMENT, MISSING_PROOF_OF_ADDRESS_DOCUMENT,
         * MISSING_IDENTITY_DOCUMENT, INVALID_DOCUMENT, or EXPIRED_DOCUMENT.
         *
         * |Error Type                          |Accepted Document Types                                                                                                                                                           |
         * |------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * |MISSING_LEGAL_PRESENCE_DOCUMENT     |CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT                                                                          |
         * |MISSING_COMPANY_DETAILS_DOCUMENT    |INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE, GOOD_STANDING_CERTIFICATE|
         * |MISSING_CONTROL_STRUCTURE_DOCUMENT  |ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT                                                         |
         * |MISSING_OWNERSHIP_STRUCTURE_DOCUMENT|SHAREHOLDER_REGISTER, INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION                                   |
         * |MISSING_PROOF_OF_ADDRESS_DOCUMENT   |PROOF_OF_ADDRESS                                                                                                                                                                  |
         * |MISSING_IDENTITY_DOCUMENT           |PASSPORT, DRIVERS_LICENSE, NATIONAL_ID                                                                                                                                            |
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun acceptedDocumentTypes(): List<AcceptedDocumentType>? =
            acceptedDocumentTypes.getNullable("acceptedDocumentTypes")

        /**
         * Dot-notation path to the field with the issue. Present when type is MISSING_FIELD or
         * INVALID_FIELD.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun field(): String? = field.getNullable("field")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [resourceId].
         *
         * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("resourceId")
        @ExcludeMissing
        fun _resourceId(): JsonField<String> = resourceId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [acceptedDocumentTypes].
         *
         * Unlike [acceptedDocumentTypes], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("acceptedDocumentTypes")
        @ExcludeMissing
        fun _acceptedDocumentTypes(): JsonField<List<AcceptedDocumentType>> = acceptedDocumentTypes

        /**
         * Returns the raw JSON value of [field].
         *
         * Unlike [field], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("field") @ExcludeMissing fun _field(): JsonField<String> = field

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
             * Returns a mutable builder for constructing an instance of [Error].
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * .resourceId()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Error]. */
        class Builder internal constructor() {

            private var reason: JsonField<String>? = null
            private var resourceId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var acceptedDocumentTypes: JsonField<MutableList<AcceptedDocumentType>>? = null
            private var field: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(error: Error) = apply {
                reason = error.reason
                resourceId = error.resourceId
                type = error.type
                acceptedDocumentTypes = error.acceptedDocumentTypes.map { it.toMutableList() }
                field = error.field
                additionalProperties = error.additionalProperties.toMutableMap()
            }

            /** Human-readable description of the issue */
            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            /** ID of the resource with the issue (Customer, BeneficialOwner, or Document) */
            fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

            /**
             * Sets [Builder.resourceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resourceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

            /**
             * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate
             * which document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
             * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents.
             * APPLICANT_* types indicate issues with the applicant themselves (sanctions, fraud,
             * criminal records).
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Document types that would satisfy this requirement. The integrator can upload any one
             * of the listed types. Present when type is MISSING_LEGAL_PRESENCE_DOCUMENT,
             * MISSING_COMPANY_DETAILS_DOCUMENT, MISSING_CONTROL_STRUCTURE_DOCUMENT,
             * MISSING_OWNERSHIP_STRUCTURE_DOCUMENT, MISSING_PROOF_OF_ADDRESS_DOCUMENT,
             * MISSING_IDENTITY_DOCUMENT, INVALID_DOCUMENT, or EXPIRED_DOCUMENT.
             *
             * |Error Type                          |Accepted Document Types                                                                                                                                                           |
             * |------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
             * |MISSING_LEGAL_PRESENCE_DOCUMENT     |CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT                                                                          |
             * |MISSING_COMPANY_DETAILS_DOCUMENT    |INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE, GOOD_STANDING_CERTIFICATE|
             * |MISSING_CONTROL_STRUCTURE_DOCUMENT  |ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT                                                         |
             * |MISSING_OWNERSHIP_STRUCTURE_DOCUMENT|SHAREHOLDER_REGISTER, INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION                                   |
             * |MISSING_PROOF_OF_ADDRESS_DOCUMENT   |PROOF_OF_ADDRESS                                                                                                                                                                  |
             * |MISSING_IDENTITY_DOCUMENT           |PASSPORT, DRIVERS_LICENSE, NATIONAL_ID                                                                                                                                            |
             */
            fun acceptedDocumentTypes(acceptedDocumentTypes: List<AcceptedDocumentType>) =
                acceptedDocumentTypes(JsonField.of(acceptedDocumentTypes))

            /**
             * Sets [Builder.acceptedDocumentTypes] to an arbitrary JSON value.
             *
             * You should usually call [Builder.acceptedDocumentTypes] with a well-typed
             * `List<AcceptedDocumentType>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun acceptedDocumentTypes(
                acceptedDocumentTypes: JsonField<List<AcceptedDocumentType>>
            ) = apply {
                this.acceptedDocumentTypes = acceptedDocumentTypes.map { it.toMutableList() }
            }

            /**
             * Adds a single [AcceptedDocumentType] to [acceptedDocumentTypes].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addAcceptedDocumentType(acceptedDocumentType: AcceptedDocumentType) = apply {
                acceptedDocumentTypes =
                    (acceptedDocumentTypes ?: JsonField.of(mutableListOf())).also {
                        checkKnown("acceptedDocumentTypes", it).add(acceptedDocumentType)
                    }
            }

            /**
             * Dot-notation path to the field with the issue. Present when type is MISSING_FIELD or
             * INVALID_FIELD.
             */
            fun field(field: String) = field(JsonField.of(field))

            /**
             * Sets [Builder.field] to an arbitrary JSON value.
             *
             * You should usually call [Builder.field] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun field(field: JsonField<String>) = apply { this.field = field }

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
             * Returns an immutable instance of [Error].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * .resourceId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Error =
                Error(
                    checkRequired("reason", reason),
                    checkRequired("resourceId", resourceId),
                    checkRequired("type", type),
                    (acceptedDocumentTypes ?: JsonMissing.of()).map { it.toImmutable() },
                    field,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Error = apply {
            if (validated) {
                return@apply
            }

            reason()
            resourceId()
            type().validate()
            acceptedDocumentTypes()?.forEach { it.validate() }
            field()
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
            (if (reason.asKnown() == null) 0 else 1) +
                (if (resourceId.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0) +
                (acceptedDocumentTypes.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (field.asKnown() == null) 0 else 1)

        /**
         * Type of verification error. The category-specific MISSING_*_DOCUMENT types indicate which
         * document category is needed. Document quality types (POOR_QUALITY_DOCUMENT,
         * SUSPECTED_FRAUD_DOCUMENT, etc.) indicate specific issues with uploaded documents.
         * APPLICANT_* types indicate issues with the applicant themselves (sanctions, fraud,
         * criminal records).
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val MISSING_FIELD = of("MISSING_FIELD")

                val INVALID_FIELD = of("INVALID_FIELD")

                val MISSING_LEGAL_PRESENCE_DOCUMENT = of("MISSING_LEGAL_PRESENCE_DOCUMENT")

                val MISSING_COMPANY_DETAILS_DOCUMENT = of("MISSING_COMPANY_DETAILS_DOCUMENT")

                val MISSING_CONTROL_STRUCTURE_DOCUMENT = of("MISSING_CONTROL_STRUCTURE_DOCUMENT")

                val MISSING_OWNERSHIP_STRUCTURE_DOCUMENT =
                    of("MISSING_OWNERSHIP_STRUCTURE_DOCUMENT")

                val MISSING_PROOF_OF_ADDRESS_DOCUMENT = of("MISSING_PROOF_OF_ADDRESS_DOCUMENT")

                val MISSING_IDENTITY_DOCUMENT = of("MISSING_IDENTITY_DOCUMENT")

                val INVALID_DOCUMENT = of("INVALID_DOCUMENT")

                val EXPIRED_DOCUMENT = of("EXPIRED_DOCUMENT")

                val POOR_QUALITY_DOCUMENT = of("POOR_QUALITY_DOCUMENT")

                val SUSPECTED_FRAUD_DOCUMENT = of("SUSPECTED_FRAUD_DOCUMENT")

                val WRONG_DOCUMENT_TYPE = of("WRONG_DOCUMENT_TYPE")

                val INCOMPLETE_DOCUMENT = of("INCOMPLETE_DOCUMENT")

                val UNREADABLE_DOCUMENT = of("UNREADABLE_DOCUMENT")

                val DOCUMENT_VERIFICATION_FAILED = of("DOCUMENT_VERIFICATION_FAILED")

                val APPLICANT_SANCTIONED = of("APPLICANT_SANCTIONED")

                val APPLICANT_FRAUD = of("APPLICANT_FRAUD")

                val APPLICANT_CRIMINAL_RECORD = of("APPLICANT_CRIMINAL_RECORD")

                val APPLICANT_REJECTED = of("APPLICANT_REJECTED")

                val MISSING_BENEFICIAL_OWNER = of("MISSING_BENEFICIAL_OWNER")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                MISSING_FIELD,
                INVALID_FIELD,
                MISSING_LEGAL_PRESENCE_DOCUMENT,
                MISSING_COMPANY_DETAILS_DOCUMENT,
                MISSING_CONTROL_STRUCTURE_DOCUMENT,
                MISSING_OWNERSHIP_STRUCTURE_DOCUMENT,
                MISSING_PROOF_OF_ADDRESS_DOCUMENT,
                MISSING_IDENTITY_DOCUMENT,
                INVALID_DOCUMENT,
                EXPIRED_DOCUMENT,
                POOR_QUALITY_DOCUMENT,
                SUSPECTED_FRAUD_DOCUMENT,
                WRONG_DOCUMENT_TYPE,
                INCOMPLETE_DOCUMENT,
                UNREADABLE_DOCUMENT,
                DOCUMENT_VERIFICATION_FAILED,
                APPLICANT_SANCTIONED,
                APPLICANT_FRAUD,
                APPLICANT_CRIMINAL_RECORD,
                APPLICANT_REJECTED,
                MISSING_BENEFICIAL_OWNER,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MISSING_FIELD,
                INVALID_FIELD,
                MISSING_LEGAL_PRESENCE_DOCUMENT,
                MISSING_COMPANY_DETAILS_DOCUMENT,
                MISSING_CONTROL_STRUCTURE_DOCUMENT,
                MISSING_OWNERSHIP_STRUCTURE_DOCUMENT,
                MISSING_PROOF_OF_ADDRESS_DOCUMENT,
                MISSING_IDENTITY_DOCUMENT,
                INVALID_DOCUMENT,
                EXPIRED_DOCUMENT,
                POOR_QUALITY_DOCUMENT,
                SUSPECTED_FRAUD_DOCUMENT,
                WRONG_DOCUMENT_TYPE,
                INCOMPLETE_DOCUMENT,
                UNREADABLE_DOCUMENT,
                DOCUMENT_VERIFICATION_FAILED,
                APPLICANT_SANCTIONED,
                APPLICANT_FRAUD,
                APPLICANT_CRIMINAL_RECORD,
                APPLICANT_REJECTED,
                MISSING_BENEFICIAL_OWNER,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MISSING_FIELD -> Value.MISSING_FIELD
                    INVALID_FIELD -> Value.INVALID_FIELD
                    MISSING_LEGAL_PRESENCE_DOCUMENT -> Value.MISSING_LEGAL_PRESENCE_DOCUMENT
                    MISSING_COMPANY_DETAILS_DOCUMENT -> Value.MISSING_COMPANY_DETAILS_DOCUMENT
                    MISSING_CONTROL_STRUCTURE_DOCUMENT -> Value.MISSING_CONTROL_STRUCTURE_DOCUMENT
                    MISSING_OWNERSHIP_STRUCTURE_DOCUMENT ->
                        Value.MISSING_OWNERSHIP_STRUCTURE_DOCUMENT
                    MISSING_PROOF_OF_ADDRESS_DOCUMENT -> Value.MISSING_PROOF_OF_ADDRESS_DOCUMENT
                    MISSING_IDENTITY_DOCUMENT -> Value.MISSING_IDENTITY_DOCUMENT
                    INVALID_DOCUMENT -> Value.INVALID_DOCUMENT
                    EXPIRED_DOCUMENT -> Value.EXPIRED_DOCUMENT
                    POOR_QUALITY_DOCUMENT -> Value.POOR_QUALITY_DOCUMENT
                    SUSPECTED_FRAUD_DOCUMENT -> Value.SUSPECTED_FRAUD_DOCUMENT
                    WRONG_DOCUMENT_TYPE -> Value.WRONG_DOCUMENT_TYPE
                    INCOMPLETE_DOCUMENT -> Value.INCOMPLETE_DOCUMENT
                    UNREADABLE_DOCUMENT -> Value.UNREADABLE_DOCUMENT
                    DOCUMENT_VERIFICATION_FAILED -> Value.DOCUMENT_VERIFICATION_FAILED
                    APPLICANT_SANCTIONED -> Value.APPLICANT_SANCTIONED
                    APPLICANT_FRAUD -> Value.APPLICANT_FRAUD
                    APPLICANT_CRIMINAL_RECORD -> Value.APPLICANT_CRIMINAL_RECORD
                    APPLICANT_REJECTED -> Value.APPLICANT_REJECTED
                    MISSING_BENEFICIAL_OWNER -> Value.MISSING_BENEFICIAL_OWNER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    MISSING_FIELD -> Known.MISSING_FIELD
                    INVALID_FIELD -> Known.INVALID_FIELD
                    MISSING_LEGAL_PRESENCE_DOCUMENT -> Known.MISSING_LEGAL_PRESENCE_DOCUMENT
                    MISSING_COMPANY_DETAILS_DOCUMENT -> Known.MISSING_COMPANY_DETAILS_DOCUMENT
                    MISSING_CONTROL_STRUCTURE_DOCUMENT -> Known.MISSING_CONTROL_STRUCTURE_DOCUMENT
                    MISSING_OWNERSHIP_STRUCTURE_DOCUMENT ->
                        Known.MISSING_OWNERSHIP_STRUCTURE_DOCUMENT
                    MISSING_PROOF_OF_ADDRESS_DOCUMENT -> Known.MISSING_PROOF_OF_ADDRESS_DOCUMENT
                    MISSING_IDENTITY_DOCUMENT -> Known.MISSING_IDENTITY_DOCUMENT
                    INVALID_DOCUMENT -> Known.INVALID_DOCUMENT
                    EXPIRED_DOCUMENT -> Known.EXPIRED_DOCUMENT
                    POOR_QUALITY_DOCUMENT -> Known.POOR_QUALITY_DOCUMENT
                    SUSPECTED_FRAUD_DOCUMENT -> Known.SUSPECTED_FRAUD_DOCUMENT
                    WRONG_DOCUMENT_TYPE -> Known.WRONG_DOCUMENT_TYPE
                    INCOMPLETE_DOCUMENT -> Known.INCOMPLETE_DOCUMENT
                    UNREADABLE_DOCUMENT -> Known.UNREADABLE_DOCUMENT
                    DOCUMENT_VERIFICATION_FAILED -> Known.DOCUMENT_VERIFICATION_FAILED
                    APPLICANT_SANCTIONED -> Known.APPLICANT_SANCTIONED
                    APPLICANT_FRAUD -> Known.APPLICANT_FRAUD
                    APPLICANT_CRIMINAL_RECORD -> Known.APPLICANT_CRIMINAL_RECORD
                    APPLICANT_REJECTED -> Known.APPLICANT_REJECTED
                    MISSING_BENEFICIAL_OWNER -> Known.MISSING_BENEFICIAL_OWNER
                    else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

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

        /**
         * Type of identity or business verification document. Document types are grouped by
         * verification category: **Identity** — PASSPORT, DRIVERS_LICENSE, NATIONAL_ID **Business —
         * Legal presence** — CERTIFICATE_OF_INCORPORATION, ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, STATE_REGISTRY_EXCERPT **Business — Company details** —
         * INFORMATION_STATEMENT, STATE_REGISTRY_EXCERPT, ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, CERTIFICATE_OF_INCORPORATION, INCUMBENCY_CERTIFICATE,
         * GOOD_STANDING_CERTIFICATE **Business — Control structure** — ARTICLES_OF_INCORPORATION,
         * ARTICLES_OF_ASSOCIATION, INCUMBENCY_CERTIFICATE, INFORMATION_STATEMENT,
         * STATE_REGISTRY_EXCERPT **Business — Ownership structure** — SHAREHOLDER_REGISTER,
         * INFORMATION_STATEMENT, INCUMBENCY_CERTIFICATE, STATE_REGISTRY_EXCERPT,
         * ARTICLES_OF_INCORPORATION, ARTICLES_OF_ASSOCIATION **Proof of address** —
         * PROOF_OF_ADDRESS
         */
        class AcceptedDocumentType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val PASSPORT = of("PASSPORT")

                val DRIVERS_LICENSE = of("DRIVERS_LICENSE")

                val NATIONAL_ID = of("NATIONAL_ID")

                val PROOF_OF_ADDRESS = of("PROOF_OF_ADDRESS")

                val BANK_STATEMENT = of("BANK_STATEMENT")

                val TAX_RETURN = of("TAX_RETURN")

                val CERTIFICATE_OF_INCORPORATION = of("CERTIFICATE_OF_INCORPORATION")

                val ARTICLES_OF_INCORPORATION = of("ARTICLES_OF_INCORPORATION")

                val ARTICLES_OF_ASSOCIATION = of("ARTICLES_OF_ASSOCIATION")

                val STATE_REGISTRY_EXCERPT = of("STATE_REGISTRY_EXCERPT")

                val GOOD_STANDING_CERTIFICATE = of("GOOD_STANDING_CERTIFICATE")

                val INFORMATION_STATEMENT = of("INFORMATION_STATEMENT")

                val INCUMBENCY_CERTIFICATE = of("INCUMBENCY_CERTIFICATE")

                val BUSINESS_LICENSE = of("BUSINESS_LICENSE")

                val SHAREHOLDER_REGISTER = of("SHAREHOLDER_REGISTER")

                val POWER_OF_ATTORNEY = of("POWER_OF_ATTORNEY")

                val UTILITY_BILL = of("UTILITY_BILL")

                val SELFIE = of("SELFIE")

                val OTHER = of("OTHER")

                fun of(value: String) = AcceptedDocumentType(JsonField.of(value))
            }

            /** An enum containing [AcceptedDocumentType]'s known values. */
            enum class Known {
                PASSPORT,
                DRIVERS_LICENSE,
                NATIONAL_ID,
                PROOF_OF_ADDRESS,
                BANK_STATEMENT,
                TAX_RETURN,
                CERTIFICATE_OF_INCORPORATION,
                ARTICLES_OF_INCORPORATION,
                ARTICLES_OF_ASSOCIATION,
                STATE_REGISTRY_EXCERPT,
                GOOD_STANDING_CERTIFICATE,
                INFORMATION_STATEMENT,
                INCUMBENCY_CERTIFICATE,
                BUSINESS_LICENSE,
                SHAREHOLDER_REGISTER,
                POWER_OF_ATTORNEY,
                UTILITY_BILL,
                SELFIE,
                OTHER,
            }

            /**
             * An enum containing [AcceptedDocumentType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AcceptedDocumentType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PASSPORT,
                DRIVERS_LICENSE,
                NATIONAL_ID,
                PROOF_OF_ADDRESS,
                BANK_STATEMENT,
                TAX_RETURN,
                CERTIFICATE_OF_INCORPORATION,
                ARTICLES_OF_INCORPORATION,
                ARTICLES_OF_ASSOCIATION,
                STATE_REGISTRY_EXCERPT,
                GOOD_STANDING_CERTIFICATE,
                INFORMATION_STATEMENT,
                INCUMBENCY_CERTIFICATE,
                BUSINESS_LICENSE,
                SHAREHOLDER_REGISTER,
                POWER_OF_ATTORNEY,
                UTILITY_BILL,
                SELFIE,
                OTHER,
                /**
                 * An enum member indicating that [AcceptedDocumentType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PASSPORT -> Value.PASSPORT
                    DRIVERS_LICENSE -> Value.DRIVERS_LICENSE
                    NATIONAL_ID -> Value.NATIONAL_ID
                    PROOF_OF_ADDRESS -> Value.PROOF_OF_ADDRESS
                    BANK_STATEMENT -> Value.BANK_STATEMENT
                    TAX_RETURN -> Value.TAX_RETURN
                    CERTIFICATE_OF_INCORPORATION -> Value.CERTIFICATE_OF_INCORPORATION
                    ARTICLES_OF_INCORPORATION -> Value.ARTICLES_OF_INCORPORATION
                    ARTICLES_OF_ASSOCIATION -> Value.ARTICLES_OF_ASSOCIATION
                    STATE_REGISTRY_EXCERPT -> Value.STATE_REGISTRY_EXCERPT
                    GOOD_STANDING_CERTIFICATE -> Value.GOOD_STANDING_CERTIFICATE
                    INFORMATION_STATEMENT -> Value.INFORMATION_STATEMENT
                    INCUMBENCY_CERTIFICATE -> Value.INCUMBENCY_CERTIFICATE
                    BUSINESS_LICENSE -> Value.BUSINESS_LICENSE
                    SHAREHOLDER_REGISTER -> Value.SHAREHOLDER_REGISTER
                    POWER_OF_ATTORNEY -> Value.POWER_OF_ATTORNEY
                    UTILITY_BILL -> Value.UTILITY_BILL
                    SELFIE -> Value.SELFIE
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    PASSPORT -> Known.PASSPORT
                    DRIVERS_LICENSE -> Known.DRIVERS_LICENSE
                    NATIONAL_ID -> Known.NATIONAL_ID
                    PROOF_OF_ADDRESS -> Known.PROOF_OF_ADDRESS
                    BANK_STATEMENT -> Known.BANK_STATEMENT
                    TAX_RETURN -> Known.TAX_RETURN
                    CERTIFICATE_OF_INCORPORATION -> Known.CERTIFICATE_OF_INCORPORATION
                    ARTICLES_OF_INCORPORATION -> Known.ARTICLES_OF_INCORPORATION
                    ARTICLES_OF_ASSOCIATION -> Known.ARTICLES_OF_ASSOCIATION
                    STATE_REGISTRY_EXCERPT -> Known.STATE_REGISTRY_EXCERPT
                    GOOD_STANDING_CERTIFICATE -> Known.GOOD_STANDING_CERTIFICATE
                    INFORMATION_STATEMENT -> Known.INFORMATION_STATEMENT
                    INCUMBENCY_CERTIFICATE -> Known.INCUMBENCY_CERTIFICATE
                    BUSINESS_LICENSE -> Known.BUSINESS_LICENSE
                    SHAREHOLDER_REGISTER -> Known.SHAREHOLDER_REGISTER
                    POWER_OF_ATTORNEY -> Known.POWER_OF_ATTORNEY
                    UTILITY_BILL -> Known.UTILITY_BILL
                    SELFIE -> Known.SELFIE
                    OTHER -> Known.OTHER
                    else ->
                        throw LightsparkGridInvalidDataException(
                            "Unknown AcceptedDocumentType: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LightsparkGridInvalidDataException if this class instance's value does not
             *   have the expected primitive type.
             */
            fun asString(): String =
                _value().asString()
                    ?: throw LightsparkGridInvalidDataException("Value is not a String")

            private var validated: Boolean = false

            fun validate(): AcceptedDocumentType = apply {
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

                return other is AcceptedDocumentType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Error &&
                reason == other.reason &&
                resourceId == other.resourceId &&
                type == other.type &&
                acceptedDocumentTypes == other.acceptedDocumentTypes &&
                field == other.field &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                reason,
                resourceId,
                type,
                acceptedDocumentTypes,
                field,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Error{reason=$reason, resourceId=$resourceId, type=$type, acceptedDocumentTypes=$acceptedDocumentTypes, field=$field, additionalProperties=$additionalProperties}"
    }

    /** Current status of the KYC/KYB verification */
    class VerificationStatus
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            val RESOLVE_ERRORS = of("RESOLVE_ERRORS")

            val PENDING_MANUAL_REVIEW = of("PENDING_MANUAL_REVIEW")

            val IN_PROGRESS = of("IN_PROGRESS")

            val APPROVED = of("APPROVED")

            val REJECTED = of("REJECTED")

            val READY_FOR_VERIFICATION = of("READY_FOR_VERIFICATION")

            fun of(value: String) = VerificationStatus(JsonField.of(value))
        }

        /** An enum containing [VerificationStatus]'s known values. */
        enum class Known {
            RESOLVE_ERRORS,
            PENDING_MANUAL_REVIEW,
            IN_PROGRESS,
            APPROVED,
            REJECTED,
            READY_FOR_VERIFICATION,
        }

        /**
         * An enum containing [VerificationStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [VerificationStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            RESOLVE_ERRORS,
            PENDING_MANUAL_REVIEW,
            IN_PROGRESS,
            APPROVED,
            REJECTED,
            READY_FOR_VERIFICATION,
            /**
             * An enum member indicating that [VerificationStatus] was instantiated with an unknown
             * value.
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
                RESOLVE_ERRORS -> Value.RESOLVE_ERRORS
                PENDING_MANUAL_REVIEW -> Value.PENDING_MANUAL_REVIEW
                IN_PROGRESS -> Value.IN_PROGRESS
                APPROVED -> Value.APPROVED
                REJECTED -> Value.REJECTED
                READY_FOR_VERIFICATION -> Value.READY_FOR_VERIFICATION
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
                RESOLVE_ERRORS -> Known.RESOLVE_ERRORS
                PENDING_MANUAL_REVIEW -> Known.PENDING_MANUAL_REVIEW
                IN_PROGRESS -> Known.IN_PROGRESS
                APPROVED -> Known.APPROVED
                REJECTED -> Known.REJECTED
                READY_FOR_VERIFICATION -> Known.READY_FOR_VERIFICATION
                else ->
                    throw LightsparkGridInvalidDataException("Unknown VerificationStatus: $value")
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

        fun validate(): VerificationStatus = apply {
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

            return other is VerificationStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationRetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            customerId == other.customerId &&
            errors == other.errors &&
            verificationStatus == other.verificationStatus &&
            updatedAt == other.updatedAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            customerId,
            errors,
            verificationStatus,
            updatedAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationRetrieveResponse{id=$id, createdAt=$createdAt, customerId=$customerId, errors=$errors, verificationStatus=$verificationStatus, updatedAt=$updatedAt, additionalProperties=$additionalProperties}"
}
