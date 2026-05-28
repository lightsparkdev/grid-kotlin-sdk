// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlatformConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val embeddedWalletConfig: JsonField<EmbeddedWalletConfig>,
    private val isRegulatedFinancialInstitution: JsonField<Boolean>,
    private val proxyUmaSubdomain: JsonField<String>,
    private val supportedCurrencies: JsonField<List<PlatformCurrencyConfig>>,
    private val umaDomain: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val webhookEndpoint: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("embeddedWalletConfig")
        @ExcludeMissing
        embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of(),
        @JsonProperty("isRegulatedFinancialInstitution")
        @ExcludeMissing
        isRegulatedFinancialInstitution: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("proxyUmaSubdomain")
        @ExcludeMissing
        proxyUmaSubdomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("supportedCurrencies")
        @ExcludeMissing
        supportedCurrencies: JsonField<List<PlatformCurrencyConfig>> = JsonMissing.of(),
        @JsonProperty("umaDomain") @ExcludeMissing umaDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("webhookEndpoint")
        @ExcludeMissing
        webhookEndpoint: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        embeddedWalletConfig,
        isRegulatedFinancialInstitution,
        proxyUmaSubdomain,
        supportedCurrencies,
        umaDomain,
        updatedAt,
        webhookEndpoint,
        mutableMapOf(),
    )

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
     * Embedded-wallet branding and OTP settings for this platform. Present only when the platform
     * has configured embedded-wallet support; omitted otherwise.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun embeddedWalletConfig(): EmbeddedWalletConfig? =
        embeddedWalletConfig.getNullable("embeddedWalletConfig")

    /**
     * Whether the platform is a regulated financial institution. This is used to determine if the
     * platform's customers must be KYC/KYB'd by Lightspark via the KYC link flow. This can only be
     * set by Lightspark during platform creation.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isRegulatedFinancialInstitution(): Boolean? =
        isRegulatedFinancialInstitution.getNullable("isRegulatedFinancialInstitution")

    /**
     * The subdomain that incoming requests will be proxied to
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun proxyUmaSubdomain(): String? = proxyUmaSubdomain.getNullable("proxyUmaSubdomain")

    /**
     * List of currencies supported by the platform. This is what the platform's customers are able
     * to hold, send, and receive.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportedCurrencies(): List<PlatformCurrencyConfig>? =
        supportedCurrencies.getNullable("supportedCurrencies")

    /**
     * UMA domain for this platform
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun umaDomain(): String? = umaDomain.getNullable("umaDomain")

    /**
     * Last update timestamp
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime? = updatedAt.getNullable("updatedAt")

    /**
     * URL where webhook notifications will be sent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun webhookEndpoint(): String? = webhookEndpoint.getNullable("webhookEndpoint")

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
     * Returns the raw JSON value of [embeddedWalletConfig].
     *
     * Unlike [embeddedWalletConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("embeddedWalletConfig")
    @ExcludeMissing
    fun _embeddedWalletConfig(): JsonField<EmbeddedWalletConfig> = embeddedWalletConfig

    /**
     * Returns the raw JSON value of [isRegulatedFinancialInstitution].
     *
     * Unlike [isRegulatedFinancialInstitution], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("isRegulatedFinancialInstitution")
    @ExcludeMissing
    fun _isRegulatedFinancialInstitution(): JsonField<Boolean> = isRegulatedFinancialInstitution

    /**
     * Returns the raw JSON value of [proxyUmaSubdomain].
     *
     * Unlike [proxyUmaSubdomain], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("proxyUmaSubdomain")
    @ExcludeMissing
    fun _proxyUmaSubdomain(): JsonField<String> = proxyUmaSubdomain

    /**
     * Returns the raw JSON value of [supportedCurrencies].
     *
     * Unlike [supportedCurrencies], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("supportedCurrencies")
    @ExcludeMissing
    fun _supportedCurrencies(): JsonField<List<PlatformCurrencyConfig>> = supportedCurrencies

    /**
     * Returns the raw JSON value of [umaDomain].
     *
     * Unlike [umaDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("umaDomain") @ExcludeMissing fun _umaDomain(): JsonField<String> = umaDomain

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [webhookEndpoint].
     *
     * Unlike [webhookEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookEndpoint")
    @ExcludeMissing
    fun _webhookEndpoint(): JsonField<String> = webhookEndpoint

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

        /** Returns a mutable builder for constructing an instance of [PlatformConfig]. */
        fun builder() = Builder()
    }

    /** A builder for [PlatformConfig]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of()
        private var isRegulatedFinancialInstitution: JsonField<Boolean> = JsonMissing.of()
        private var proxyUmaSubdomain: JsonField<String> = JsonMissing.of()
        private var supportedCurrencies: JsonField<MutableList<PlatformCurrencyConfig>>? = null
        private var umaDomain: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookEndpoint: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(platformConfig: PlatformConfig) = apply {
            id = platformConfig.id
            createdAt = platformConfig.createdAt
            embeddedWalletConfig = platformConfig.embeddedWalletConfig
            isRegulatedFinancialInstitution = platformConfig.isRegulatedFinancialInstitution
            proxyUmaSubdomain = platformConfig.proxyUmaSubdomain
            supportedCurrencies = platformConfig.supportedCurrencies.map { it.toMutableList() }
            umaDomain = platformConfig.umaDomain
            updatedAt = platformConfig.updatedAt
            webhookEndpoint = platformConfig.webhookEndpoint
            additionalProperties = platformConfig.additionalProperties.toMutableMap()
        }

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

        /**
         * Embedded-wallet branding and OTP settings for this platform. Present only when the
         * platform has configured embedded-wallet support; omitted otherwise.
         */
        fun embeddedWalletConfig(embeddedWalletConfig: EmbeddedWalletConfig) =
            embeddedWalletConfig(JsonField.of(embeddedWalletConfig))

        /**
         * Sets [Builder.embeddedWalletConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddedWalletConfig] with a well-typed
         * [EmbeddedWalletConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun embeddedWalletConfig(embeddedWalletConfig: JsonField<EmbeddedWalletConfig>) = apply {
            this.embeddedWalletConfig = embeddedWalletConfig
        }

        /**
         * Whether the platform is a regulated financial institution. This is used to determine if
         * the platform's customers must be KYC/KYB'd by Lightspark via the KYC link flow. This can
         * only be set by Lightspark during platform creation.
         */
        fun isRegulatedFinancialInstitution(isRegulatedFinancialInstitution: Boolean) =
            isRegulatedFinancialInstitution(JsonField.of(isRegulatedFinancialInstitution))

        /**
         * Sets [Builder.isRegulatedFinancialInstitution] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRegulatedFinancialInstitution] with a well-typed
         * [Boolean] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun isRegulatedFinancialInstitution(isRegulatedFinancialInstitution: JsonField<Boolean>) =
            apply {
                this.isRegulatedFinancialInstitution = isRegulatedFinancialInstitution
            }

        /** The subdomain that incoming requests will be proxied to */
        fun proxyUmaSubdomain(proxyUmaSubdomain: String) =
            proxyUmaSubdomain(JsonField.of(proxyUmaSubdomain))

        /**
         * Sets [Builder.proxyUmaSubdomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.proxyUmaSubdomain] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun proxyUmaSubdomain(proxyUmaSubdomain: JsonField<String>) = apply {
            this.proxyUmaSubdomain = proxyUmaSubdomain
        }

        /**
         * List of currencies supported by the platform. This is what the platform's customers are
         * able to hold, send, and receive.
         */
        fun supportedCurrencies(supportedCurrencies: List<PlatformCurrencyConfig>) =
            supportedCurrencies(JsonField.of(supportedCurrencies))

        /**
         * Sets [Builder.supportedCurrencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedCurrencies] with a well-typed
         * `List<PlatformCurrencyConfig>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supportedCurrencies(supportedCurrencies: JsonField<List<PlatformCurrencyConfig>>) =
            apply {
                this.supportedCurrencies = supportedCurrencies.map { it.toMutableList() }
            }

        /**
         * Adds a single [PlatformCurrencyConfig] to [supportedCurrencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedCurrency(supportedCurrency: PlatformCurrencyConfig) = apply {
            supportedCurrencies =
                (supportedCurrencies ?: JsonField.of(mutableListOf())).also {
                    checkKnown("supportedCurrencies", it).add(supportedCurrency)
                }
        }

        /** UMA domain for this platform */
        fun umaDomain(umaDomain: String) = umaDomain(JsonField.of(umaDomain))

        /**
         * Sets [Builder.umaDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.umaDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun umaDomain(umaDomain: JsonField<String>) = apply { this.umaDomain = umaDomain }

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

        /** URL where webhook notifications will be sent */
        fun webhookEndpoint(webhookEndpoint: String) =
            webhookEndpoint(JsonField.of(webhookEndpoint))

        /**
         * Sets [Builder.webhookEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEndpoint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEndpoint(webhookEndpoint: JsonField<String>) = apply {
            this.webhookEndpoint = webhookEndpoint
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
         * Returns an immutable instance of [PlatformConfig].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlatformConfig =
            PlatformConfig(
                id,
                createdAt,
                embeddedWalletConfig,
                isRegulatedFinancialInstitution,
                proxyUmaSubdomain,
                (supportedCurrencies ?: JsonMissing.of()).map { it.toImmutable() },
                umaDomain,
                updatedAt,
                webhookEndpoint,
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
    fun validate(): PlatformConfig = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        embeddedWalletConfig()?.validate()
        isRegulatedFinancialInstitution()
        proxyUmaSubdomain()
        supportedCurrencies()?.forEach { it.validate() }
        umaDomain()
        updatedAt()
        webhookEndpoint()
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
            (embeddedWalletConfig.asKnown()?.validity() ?: 0) +
            (if (isRegulatedFinancialInstitution.asKnown() == null) 0 else 1) +
            (if (proxyUmaSubdomain.asKnown() == null) 0 else 1) +
            (supportedCurrencies.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (umaDomain.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (webhookEndpoint.asKnown() == null) 0 else 1)

    /**
     * Embedded-wallet branding and OTP settings for this platform. Present only when the platform
     * has configured embedded-wallet support; omitted otherwise.
     */
    class EmbeddedWalletConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val alphanumeric: JsonField<Boolean>,
        private val appName: JsonField<String>,
        private val expirationSeconds: JsonField<Long>,
        private val logoUrl: JsonField<String>,
        private val otpLength: JsonField<Long>,
        private val replyToEmailAddress: JsonField<String>,
        private val sendFromEmailAddress: JsonField<String>,
        private val sendFromEmailSenderName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("alphanumeric")
            @ExcludeMissing
            alphanumeric: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("appName") @ExcludeMissing appName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expirationSeconds")
            @ExcludeMissing
            expirationSeconds: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("logoUrl") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("otpLength")
            @ExcludeMissing
            otpLength: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("replyToEmailAddress")
            @ExcludeMissing
            replyToEmailAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sendFromEmailAddress")
            @ExcludeMissing
            sendFromEmailAddress: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sendFromEmailSenderName")
            @ExcludeMissing
            sendFromEmailSenderName: JsonField<String> = JsonMissing.of(),
        ) : this(
            alphanumeric,
            appName,
            expirationSeconds,
            logoUrl,
            otpLength,
            replyToEmailAddress,
            sendFromEmailAddress,
            sendFromEmailSenderName,
            mutableMapOf(),
        )

        /**
         * If true, OTP includes letters in addition to digits. Defaults to numeric-only when not
         * set.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun alphanumeric(): Boolean? = alphanumeric.getNullable("alphanumeric")

        /**
         * App name displayed in the default OTP email template.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun appName(): String? = appName.getNullable("appName")

        /**
         * OTP validity window in seconds. Defaults to 300 when not set.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expirationSeconds(): Long? = expirationSeconds.getNullable("expirationSeconds")

        /**
         * URL to a PNG logo for the OTP email. Resized to 340x124px.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun logoUrl(): String? = logoUrl.getNullable("logoUrl")

        /**
         * Number of digits / characters in the OTP code. Defaults to 6 when not set.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun otpLength(): Long? = otpLength.getNullable("otpLength")

        /**
         * Custom reply-to email address for OTP emails.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun replyToEmailAddress(): String? = replyToEmailAddress.getNullable("replyToEmailAddress")

        /**
         * Custom sender email address for OTP emails.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sendFromEmailAddress(): String? =
            sendFromEmailAddress.getNullable("sendFromEmailAddress")

        /**
         * Custom sender display name. Defaults to "Notifications" when not set.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sendFromEmailSenderName(): String? =
            sendFromEmailSenderName.getNullable("sendFromEmailSenderName")

        /**
         * Returns the raw JSON value of [alphanumeric].
         *
         * Unlike [alphanumeric], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("alphanumeric")
        @ExcludeMissing
        fun _alphanumeric(): JsonField<Boolean> = alphanumeric

        /**
         * Returns the raw JSON value of [appName].
         *
         * Unlike [appName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("appName") @ExcludeMissing fun _appName(): JsonField<String> = appName

        /**
         * Returns the raw JSON value of [expirationSeconds].
         *
         * Unlike [expirationSeconds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("expirationSeconds")
        @ExcludeMissing
        fun _expirationSeconds(): JsonField<Long> = expirationSeconds

        /**
         * Returns the raw JSON value of [logoUrl].
         *
         * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logoUrl") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

        /**
         * Returns the raw JSON value of [otpLength].
         *
         * Unlike [otpLength], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("otpLength") @ExcludeMissing fun _otpLength(): JsonField<Long> = otpLength

        /**
         * Returns the raw JSON value of [replyToEmailAddress].
         *
         * Unlike [replyToEmailAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("replyToEmailAddress")
        @ExcludeMissing
        fun _replyToEmailAddress(): JsonField<String> = replyToEmailAddress

        /**
         * Returns the raw JSON value of [sendFromEmailAddress].
         *
         * Unlike [sendFromEmailAddress], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sendFromEmailAddress")
        @ExcludeMissing
        fun _sendFromEmailAddress(): JsonField<String> = sendFromEmailAddress

        /**
         * Returns the raw JSON value of [sendFromEmailSenderName].
         *
         * Unlike [sendFromEmailSenderName], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("sendFromEmailSenderName")
        @ExcludeMissing
        fun _sendFromEmailSenderName(): JsonField<String> = sendFromEmailSenderName

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

            /** Returns a mutable builder for constructing an instance of [EmbeddedWalletConfig]. */
            fun builder() = Builder()
        }

        /** A builder for [EmbeddedWalletConfig]. */
        class Builder internal constructor() {

            private var alphanumeric: JsonField<Boolean> = JsonMissing.of()
            private var appName: JsonField<String> = JsonMissing.of()
            private var expirationSeconds: JsonField<Long> = JsonMissing.of()
            private var logoUrl: JsonField<String> = JsonMissing.of()
            private var otpLength: JsonField<Long> = JsonMissing.of()
            private var replyToEmailAddress: JsonField<String> = JsonMissing.of()
            private var sendFromEmailAddress: JsonField<String> = JsonMissing.of()
            private var sendFromEmailSenderName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(embeddedWalletConfig: EmbeddedWalletConfig) = apply {
                alphanumeric = embeddedWalletConfig.alphanumeric
                appName = embeddedWalletConfig.appName
                expirationSeconds = embeddedWalletConfig.expirationSeconds
                logoUrl = embeddedWalletConfig.logoUrl
                otpLength = embeddedWalletConfig.otpLength
                replyToEmailAddress = embeddedWalletConfig.replyToEmailAddress
                sendFromEmailAddress = embeddedWalletConfig.sendFromEmailAddress
                sendFromEmailSenderName = embeddedWalletConfig.sendFromEmailSenderName
                additionalProperties = embeddedWalletConfig.additionalProperties.toMutableMap()
            }

            /**
             * If true, OTP includes letters in addition to digits. Defaults to numeric-only when
             * not set.
             */
            fun alphanumeric(alphanumeric: Boolean) = alphanumeric(JsonField.of(alphanumeric))

            /**
             * Sets [Builder.alphanumeric] to an arbitrary JSON value.
             *
             * You should usually call [Builder.alphanumeric] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun alphanumeric(alphanumeric: JsonField<Boolean>) = apply {
                this.alphanumeric = alphanumeric
            }

            /** App name displayed in the default OTP email template. */
            fun appName(appName: String) = appName(JsonField.of(appName))

            /**
             * Sets [Builder.appName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appName(appName: JsonField<String>) = apply { this.appName = appName }

            /** OTP validity window in seconds. Defaults to 300 when not set. */
            fun expirationSeconds(expirationSeconds: Long) =
                expirationSeconds(JsonField.of(expirationSeconds))

            /**
             * Sets [Builder.expirationSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expirationSeconds] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expirationSeconds(expirationSeconds: JsonField<Long>) = apply {
                this.expirationSeconds = expirationSeconds
            }

            /** URL to a PNG logo for the OTP email. Resized to 340x124px. */
            fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

            /**
             * Sets [Builder.logoUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

            /** Number of digits / characters in the OTP code. Defaults to 6 when not set. */
            fun otpLength(otpLength: Long) = otpLength(JsonField.of(otpLength))

            /**
             * Sets [Builder.otpLength] to an arbitrary JSON value.
             *
             * You should usually call [Builder.otpLength] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun otpLength(otpLength: JsonField<Long>) = apply { this.otpLength = otpLength }

            /** Custom reply-to email address for OTP emails. */
            fun replyToEmailAddress(replyToEmailAddress: String) =
                replyToEmailAddress(JsonField.of(replyToEmailAddress))

            /**
             * Sets [Builder.replyToEmailAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.replyToEmailAddress] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun replyToEmailAddress(replyToEmailAddress: JsonField<String>) = apply {
                this.replyToEmailAddress = replyToEmailAddress
            }

            /** Custom sender email address for OTP emails. */
            fun sendFromEmailAddress(sendFromEmailAddress: String) =
                sendFromEmailAddress(JsonField.of(sendFromEmailAddress))

            /**
             * Sets [Builder.sendFromEmailAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendFromEmailAddress] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendFromEmailAddress(sendFromEmailAddress: JsonField<String>) = apply {
                this.sendFromEmailAddress = sendFromEmailAddress
            }

            /** Custom sender display name. Defaults to "Notifications" when not set. */
            fun sendFromEmailSenderName(sendFromEmailSenderName: String) =
                sendFromEmailSenderName(JsonField.of(sendFromEmailSenderName))

            /**
             * Sets [Builder.sendFromEmailSenderName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sendFromEmailSenderName] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun sendFromEmailSenderName(sendFromEmailSenderName: JsonField<String>) = apply {
                this.sendFromEmailSenderName = sendFromEmailSenderName
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
             * Returns an immutable instance of [EmbeddedWalletConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): EmbeddedWalletConfig =
                EmbeddedWalletConfig(
                    alphanumeric,
                    appName,
                    expirationSeconds,
                    logoUrl,
                    otpLength,
                    replyToEmailAddress,
                    sendFromEmailAddress,
                    sendFromEmailSenderName,
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): EmbeddedWalletConfig = apply {
            if (validated) {
                return@apply
            }

            alphanumeric()
            appName()
            expirationSeconds()
            logoUrl()
            otpLength()
            replyToEmailAddress()
            sendFromEmailAddress()
            sendFromEmailSenderName()
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
            (if (alphanumeric.asKnown() == null) 0 else 1) +
                (if (appName.asKnown() == null) 0 else 1) +
                (if (expirationSeconds.asKnown() == null) 0 else 1) +
                (if (logoUrl.asKnown() == null) 0 else 1) +
                (if (otpLength.asKnown() == null) 0 else 1) +
                (if (replyToEmailAddress.asKnown() == null) 0 else 1) +
                (if (sendFromEmailAddress.asKnown() == null) 0 else 1) +
                (if (sendFromEmailSenderName.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EmbeddedWalletConfig &&
                alphanumeric == other.alphanumeric &&
                appName == other.appName &&
                expirationSeconds == other.expirationSeconds &&
                logoUrl == other.logoUrl &&
                otpLength == other.otpLength &&
                replyToEmailAddress == other.replyToEmailAddress &&
                sendFromEmailAddress == other.sendFromEmailAddress &&
                sendFromEmailSenderName == other.sendFromEmailSenderName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                alphanumeric,
                appName,
                expirationSeconds,
                logoUrl,
                otpLength,
                replyToEmailAddress,
                sendFromEmailAddress,
                sendFromEmailSenderName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EmbeddedWalletConfig{alphanumeric=$alphanumeric, appName=$appName, expirationSeconds=$expirationSeconds, logoUrl=$logoUrl, otpLength=$otpLength, replyToEmailAddress=$replyToEmailAddress, sendFromEmailAddress=$sendFromEmailAddress, sendFromEmailSenderName=$sendFromEmailSenderName, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformConfig &&
            id == other.id &&
            createdAt == other.createdAt &&
            embeddedWalletConfig == other.embeddedWalletConfig &&
            isRegulatedFinancialInstitution == other.isRegulatedFinancialInstitution &&
            proxyUmaSubdomain == other.proxyUmaSubdomain &&
            supportedCurrencies == other.supportedCurrencies &&
            umaDomain == other.umaDomain &&
            updatedAt == other.updatedAt &&
            webhookEndpoint == other.webhookEndpoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            embeddedWalletConfig,
            isRegulatedFinancialInstitution,
            proxyUmaSubdomain,
            supportedCurrencies,
            umaDomain,
            updatedAt,
            webhookEndpoint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlatformConfig{id=$id, createdAt=$createdAt, embeddedWalletConfig=$embeddedWalletConfig, isRegulatedFinancialInstitution=$isRegulatedFinancialInstitution, proxyUmaSubdomain=$proxyUmaSubdomain, supportedCurrencies=$supportedCurrencies, umaDomain=$umaDomain, updatedAt=$updatedAt, webhookEndpoint=$webhookEndpoint, additionalProperties=$additionalProperties}"
}
