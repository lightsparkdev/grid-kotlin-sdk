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

/** A hosted KYC link that the customer can complete to verify their identity. */
class CustomerGenerateKycLinkResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expiresAt: JsonField<OffsetDateTime>,
    private val kycUrl: JsonField<String>,
    private val provider: JsonField<Provider>,
    private val token: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("kycUrl") @ExcludeMissing kycUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("provider") @ExcludeMissing provider: JsonField<Provider> = JsonMissing.of(),
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
    ) : this(expiresAt, kycUrl, provider, token, mutableMapOf())

    /**
     * Time at which the hosted link expires and can no longer be used.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * Hosted URL the customer should be sent to in order to complete verification. The URL is
     * single-use and expires at `expiresAt`. To generate a new link (for example, after the
     * previous one expires or is abandoned), call this endpoint again.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun kycUrl(): String = kycUrl.getRequired("kycUrl")

    /**
     * The KYC provider that will perform identity verification for the customer. Grid selects the
     * provider based on the customer's region and platform configuration; the value is
     * informational for platforms that want to integrate directly with the provider's SDK.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun provider(): Provider = provider.getRequired("provider")

    /**
     * Provider-specific token that can be used in place of the hosted URL — for example, to embed
     * the provider's SDK directly in your application. Only returned for providers that support
     * direct SDK integration. Whether to use the hosted URL or the embedded SDK is up to you; both
     * flows result in the same `kycStatus` update on the customer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun token(): String? = token.getNullable("token")

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [kycUrl].
     *
     * Unlike [kycUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("kycUrl") @ExcludeMissing fun _kycUrl(): JsonField<String> = kycUrl

    /**
     * Returns the raw JSON value of [provider].
     *
     * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

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
         * [CustomerGenerateKycLinkResponse].
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .kycUrl()
         * .provider()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerGenerateKycLinkResponse]. */
    class Builder internal constructor() {

        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var kycUrl: JsonField<String>? = null
        private var provider: JsonField<Provider>? = null
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(customerGenerateKycLinkResponse: CustomerGenerateKycLinkResponse) =
            apply {
                expiresAt = customerGenerateKycLinkResponse.expiresAt
                kycUrl = customerGenerateKycLinkResponse.kycUrl
                provider = customerGenerateKycLinkResponse.provider
                token = customerGenerateKycLinkResponse.token
                additionalProperties =
                    customerGenerateKycLinkResponse.additionalProperties.toMutableMap()
            }

        /** Time at which the hosted link expires and can no longer be used. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /**
         * Hosted URL the customer should be sent to in order to complete verification. The URL is
         * single-use and expires at `expiresAt`. To generate a new link (for example, after the
         * previous one expires or is abandoned), call this endpoint again.
         */
        fun kycUrl(kycUrl: String) = kycUrl(JsonField.of(kycUrl))

        /**
         * Sets [Builder.kycUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.kycUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun kycUrl(kycUrl: JsonField<String>) = apply { this.kycUrl = kycUrl }

        /**
         * The KYC provider that will perform identity verification for the customer. Grid selects
         * the provider based on the customer's region and platform configuration; the value is
         * informational for platforms that want to integrate directly with the provider's SDK.
         */
        fun provider(provider: Provider) = provider(JsonField.of(provider))

        /**
         * Sets [Builder.provider] to an arbitrary JSON value.
         *
         * You should usually call [Builder.provider] with a well-typed [Provider] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

        /**
         * Provider-specific token that can be used in place of the hosted URL — for example, to
         * embed the provider's SDK directly in your application. Only returned for providers that
         * support direct SDK integration. Whether to use the hosted URL or the embedded SDK is up
         * to you; both flows result in the same `kycStatus` update on the customer.
         */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

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
         * Returns an immutable instance of [CustomerGenerateKycLinkResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .expiresAt()
         * .kycUrl()
         * .provider()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerGenerateKycLinkResponse =
            CustomerGenerateKycLinkResponse(
                checkRequired("expiresAt", expiresAt),
                checkRequired("kycUrl", kycUrl),
                checkRequired("provider", provider),
                token,
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
    fun validate(): CustomerGenerateKycLinkResponse = apply {
        if (validated) {
            return@apply
        }

        expiresAt()
        kycUrl()
        provider().validate()
        token()
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
        (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (kycUrl.asKnown() == null) 0 else 1) +
            (provider.asKnown()?.validity() ?: 0) +
            (if (token.asKnown() == null) 0 else 1)

    /**
     * The KYC provider that will perform identity verification for the customer. Grid selects the
     * provider based on the customer's region and platform configuration; the value is
     * informational for platforms that want to integrate directly with the provider's SDK.
     */
    class Provider @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val SUMSUB = of("SUMSUB")

            fun of(value: String) = Provider(JsonField.of(value))
        }

        /** An enum containing [Provider]'s known values. */
        enum class Known {
            SUMSUB
        }

        /**
         * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Provider] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUMSUB,
            /** An enum member indicating that [Provider] was instantiated with an unknown value. */
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
                SUMSUB -> Value.SUMSUB
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
                SUMSUB -> Known.SUMSUB
                else -> throw LightsparkGridInvalidDataException("Unknown Provider: $value")
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
        fun validate(): Provider = apply {
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

            return other is Provider && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerGenerateKycLinkResponse &&
            expiresAt == other.expiresAt &&
            kycUrl == other.kycUrl &&
            provider == other.provider &&
            token == other.token &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(expiresAt, kycUrl, provider, token, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerGenerateKycLinkResponse{expiresAt=$expiresAt, kycUrl=$kycUrl, provider=$provider, token=$token, additionalProperties=$additionalProperties}"
}
