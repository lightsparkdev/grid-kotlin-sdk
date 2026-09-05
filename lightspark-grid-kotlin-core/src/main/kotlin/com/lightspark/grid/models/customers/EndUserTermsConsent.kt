// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class EndUserTermsConsent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val acceptanceMethod: JsonField<AcceptanceMethod>,
    private val acceptedAt: JsonField<OffsetDateTime>,
    private val ipAddress: JsonField<String>,
    private val termsVersion: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("acceptanceMethod")
        @ExcludeMissing
        acceptanceMethod: JsonField<AcceptanceMethod> = JsonMissing.of(),
        @JsonProperty("acceptedAt")
        @ExcludeMissing
        acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("ipAddress") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("termsVersion")
        @ExcludeMissing
        termsVersion: JsonField<String> = JsonMissing.of(),
    ) : this(acceptanceMethod, acceptedAt, ipAddress, termsVersion, mutableMapOf())

    /**
     * Method the customer used to affirmatively accept the End User Terms.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptanceMethod(): AcceptanceMethod = acceptanceMethod.getRequired("acceptanceMethod")

    /**
     * Date and time when the customer accepted the End User Terms.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("acceptedAt")

    /**
     * IP address of the device the customer used when accepting the terms.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ipAddress(): String = ipAddress.getRequired("ipAddress")

    /**
     * Version identifier of the accepted Grid End User Terms.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun termsVersion(): String = termsVersion.getRequired("termsVersion")

    /**
     * Returns the raw JSON value of [acceptanceMethod].
     *
     * Unlike [acceptanceMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("acceptanceMethod")
    @ExcludeMissing
    fun _acceptanceMethod(): JsonField<AcceptanceMethod> = acceptanceMethod

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
         * Returns a mutable builder for constructing an instance of [EndUserTermsConsent].
         *
         * The following fields are required:
         * ```kotlin
         * .acceptanceMethod()
         * .acceptedAt()
         * .ipAddress()
         * .termsVersion()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EndUserTermsConsent]. */
    class Builder internal constructor() {

        private var acceptanceMethod: JsonField<AcceptanceMethod>? = null
        private var acceptedAt: JsonField<OffsetDateTime>? = null
        private var ipAddress: JsonField<String>? = null
        private var termsVersion: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(endUserTermsConsent: EndUserTermsConsent) = apply {
            acceptanceMethod = endUserTermsConsent.acceptanceMethod
            acceptedAt = endUserTermsConsent.acceptedAt
            ipAddress = endUserTermsConsent.ipAddress
            termsVersion = endUserTermsConsent.termsVersion
            additionalProperties = endUserTermsConsent.additionalProperties.toMutableMap()
        }

        /** Method the customer used to affirmatively accept the End User Terms. */
        fun acceptanceMethod(acceptanceMethod: AcceptanceMethod) =
            acceptanceMethod(JsonField.of(acceptanceMethod))

        /**
         * Sets [Builder.acceptanceMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acceptanceMethod] with a well-typed [AcceptanceMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun acceptanceMethod(acceptanceMethod: JsonField<AcceptanceMethod>) = apply {
            this.acceptanceMethod = acceptanceMethod
        }

        /** Date and time when the customer accepted the End User Terms. */
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

        /** IP address of the device the customer used when accepting the terms. */
        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        /** Version identifier of the accepted Grid End User Terms. */
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
         * Returns an immutable instance of [EndUserTermsConsent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .acceptanceMethod()
         * .acceptedAt()
         * .ipAddress()
         * .termsVersion()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EndUserTermsConsent =
            EndUserTermsConsent(
                checkRequired("acceptanceMethod", acceptanceMethod),
                checkRequired("acceptedAt", acceptedAt),
                checkRequired("ipAddress", ipAddress),
                checkRequired("termsVersion", termsVersion),
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
    fun validate(): EndUserTermsConsent = apply {
        if (validated) {
            return@apply
        }

        acceptanceMethod().validate()
        acceptedAt()
        ipAddress()
        termsVersion()
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
            (if (termsVersion.asKnown() == null) 0 else 1)

    /** Method the customer used to affirmatively accept the End User Terms. */
    class AcceptanceMethod @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            val CHECKBOX = of("CHECKBOX")

            val CLICK_TO_ACCEPT = of("CLICK_TO_ACCEPT")

            fun of(value: String) = AcceptanceMethod(JsonField.of(value))
        }

        /** An enum containing [AcceptanceMethod]'s known values. */
        enum class Known {
            CHECKBOX,
            CLICK_TO_ACCEPT,
        }

        /**
         * An enum containing [AcceptanceMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AcceptanceMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CHECKBOX,
            CLICK_TO_ACCEPT,
            /**
             * An enum member indicating that [AcceptanceMethod] was instantiated with an unknown
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
                CHECKBOX -> Value.CHECKBOX
                CLICK_TO_ACCEPT -> Value.CLICK_TO_ACCEPT
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
                CHECKBOX -> Known.CHECKBOX
                CLICK_TO_ACCEPT -> Known.CLICK_TO_ACCEPT
                else -> throw LightsparkGridInvalidDataException("Unknown AcceptanceMethod: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): AcceptanceMethod = apply {
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

            return other is AcceptanceMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EndUserTermsConsent &&
            acceptanceMethod == other.acceptanceMethod &&
            acceptedAt == other.acceptedAt &&
            ipAddress == other.ipAddress &&
            termsVersion == other.termsVersion &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(acceptanceMethod, acceptedAt, ipAddress, termsVersion, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "EndUserTermsConsent{acceptanceMethod=$acceptanceMethod, acceptedAt=$acceptedAt, ipAddress=$ipAddress, termsVersion=$termsVersion, additionalProperties=$additionalProperties}"
}
