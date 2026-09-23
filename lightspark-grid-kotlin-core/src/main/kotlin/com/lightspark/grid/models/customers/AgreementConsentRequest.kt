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
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class AgreementConsentRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptanceMethod: JsonField<AgreementAcceptanceMethod>,
    private val acceptedAt: JsonField<OffsetDateTime>,
    private val ipAddress: JsonField<String>,
    private val termsVersion: JsonField<String>,
    private val type: JsonField<AgreementType>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptanceMethod")
        @ExcludeMissing
        acceptanceMethod: JsonField<AgreementAcceptanceMethod> = JsonMissing.of(),
        @JsonProperty("acceptedAt")
        @ExcludeMissing
        acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("termsVersion")
        @ExcludeMissing
        termsVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<AgreementType> = JsonMissing.of(),
    ) : this(acceptanceMethod, acceptedAt, ipAddress, termsVersion, type, mutableMapOf())

    /**
     * Method the customer used to affirmatively accept an agreement.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptanceMethod(): AgreementAcceptanceMethod =
        acceptanceMethod.getRequired("acceptanceMethod")

    /**
     * Date and time when the customer accepted this agreement. Must include a timezone offset and
     * must not be in the future.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("acceptedAt")

    /**
     * IP address of the device the customer used when accepting this agreement.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ipAddress(): String = ipAddress.getRequired("ipAddress")

    /**
     * Version identifier of the accepted agreement, as returned for this type by the agreement
     * documents endpoint. A version is scoped to its type; a version valid for one agreement is not
     * valid for another.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun termsVersion(): String = termsVersion.getRequired("termsVersion")

    /**
     * Identifies which Grid agreement a consent record or document refers to. Values are stable
     * identifiers: a document's hosted URL or version may change, but its type does not. Accepting
     * one agreement never implies acceptance of another, even when two agreements share a hosted
     * page.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): AgreementType = type.getRequired("type")

    /**
     * Returns the raw JSON value of [acceptanceMethod].
     *
     * Unlike [acceptanceMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptanceMethod")
    @ExcludeMissing
    fun _acceptanceMethod(): JsonField<AgreementAcceptanceMethod> = acceptanceMethod

    /**
     * Returns the raw JSON value of [acceptedAt].
     *
     * Unlike [acceptedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acceptedAt")
    @ExcludeMissing
    fun _acceptedAt(): JsonField<OffsetDateTime> = acceptedAt

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ipAddress") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [termsVersion].
     *
     * Unlike [termsVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("termsVersion")
    @ExcludeMissing
    fun _termsVersion(): JsonField<String> = termsVersion

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<AgreementType> = type

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
         * Returns a mutable builder for constructing an instance of [AgreementConsentRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .acceptanceMethod()
         * .acceptedAt()
         * .ipAddress()
         * .termsVersion()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AgreementConsentRequest]. */
    class Builder internal constructor() {

        private var acceptanceMethod: JsonField<AgreementAcceptanceMethod>? = null
        private var acceptedAt: JsonField<OffsetDateTime>? = null
        private var ipAddress: JsonField<String>? = null
        private var termsVersion: JsonField<String>? = null
        private var type: JsonField<AgreementType>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(agreementConsentRequest: AgreementConsentRequest) = apply {
            acceptanceMethod = agreementConsentRequest.acceptanceMethod
            acceptedAt = agreementConsentRequest.acceptedAt
            ipAddress = agreementConsentRequest.ipAddress
            termsVersion = agreementConsentRequest.termsVersion
            type = agreementConsentRequest.type
            additionalProperties = agreementConsentRequest.additionalProperties.toMutableMap()
        }

        /** Method the customer used to affirmatively accept an agreement. */
        fun acceptanceMethod(acceptanceMethod: AgreementAcceptanceMethod) =
            acceptanceMethod(JsonField.of(acceptanceMethod))

        /**
         * Sets [Builder.acceptanceMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptanceMethod] with a well-typed
         * [AgreementAcceptanceMethod] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun acceptanceMethod(acceptanceMethod: JsonField<AgreementAcceptanceMethod>) = apply {
            this.acceptanceMethod = acceptanceMethod
        }

        /**
         * Date and time when the customer accepted this agreement. Must include a timezone offset
         * and must not be in the future.
         */
        fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

        /**
         * Sets [Builder.acceptedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
            this.acceptedAt = acceptedAt
        }

        /** IP address of the device the customer used when accepting this agreement. */
        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        /**
         * Version identifier of the accepted agreement, as returned for this type by the agreement
         * documents endpoint. A version is scoped to its type; a version valid for one agreement is
         * not valid for another.
         */
        fun termsVersion(termsVersion: String) = termsVersion(JsonField.of(termsVersion))

        /**
         * Sets [Builder.termsVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.termsVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun termsVersion(termsVersion: JsonField<String>) = apply {
            this.termsVersion = termsVersion
        }

        /**
         * Identifies which Grid agreement a consent record or document refers to. Values are stable
         * identifiers: a document's hosted URL or version may change, but its type does not.
         * Accepting one agreement never implies acceptance of another, even when two agreements
         * share a hosted page.
         */
        fun type(type: AgreementType) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [AgreementType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun type(type: JsonField<AgreementType>) = apply { this.type = type }

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
         * Returns an immutable instance of [AgreementConsentRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .acceptanceMethod()
         * .acceptedAt()
         * .ipAddress()
         * .termsVersion()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AgreementConsentRequest =
            AgreementConsentRequest(
                checkRequired("acceptanceMethod", acceptanceMethod),
                checkRequired("acceptedAt", acceptedAt),
                checkRequired("ipAddress", ipAddress),
                checkRequired("termsVersion", termsVersion),
                checkRequired("type", type),
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
    fun validate(): AgreementConsentRequest = apply {
        if (validated) {
            return@apply
        }

        acceptanceMethod().validate()
        acceptedAt()
        ipAddress()
        termsVersion()
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
        (acceptanceMethod.asKnown()?.validity() ?: 0) +
            (if (acceptedAt.asKnown() == null) 0 else 1) +
            (if (ipAddress.asKnown() == null) 0 else 1) +
            (if (termsVersion.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AgreementConsentRequest &&
            acceptanceMethod == other.acceptanceMethod &&
            acceptedAt == other.acceptedAt &&
            ipAddress == other.ipAddress &&
            termsVersion == other.termsVersion &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            acceptanceMethod,
            acceptedAt,
            ipAddress,
            termsVersion,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AgreementConsentRequest{acceptanceMethod=$acceptanceMethod, acceptedAt=$acceptedAt, ipAddress=$ipAddress, termsVersion=$termsVersion, type=$type, additionalProperties=$additionalProperties}"
}
