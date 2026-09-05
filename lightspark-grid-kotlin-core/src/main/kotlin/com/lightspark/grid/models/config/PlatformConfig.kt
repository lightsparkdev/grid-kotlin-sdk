// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class PlatformConfig
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cardConfigs: JsonField<CardConfigs>,
    private val cardTokenization2faConfig: JsonField<CardTokenization2faConfig>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val embeddedWalletConfig: JsonField<EmbeddedWalletConfig>,
    private val feeConfigs: JsonField<List<FeeConfig>>,
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
        @JsonProperty("cardConfigs")
        @ExcludeMissing
        cardConfigs: JsonField<CardConfigs> = JsonMissing.of(),
        @JsonProperty("cardTokenization2faConfig")
        @ExcludeMissing
        cardTokenization2faConfig: JsonField<CardTokenization2faConfig> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("embeddedWalletConfig")
        @ExcludeMissing
        embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of(),
        @JsonProperty("feeConfigs")
        @ExcludeMissing
        feeConfigs: JsonField<List<FeeConfig>> = JsonMissing.of(),
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
        cardConfigs,
        cardTokenization2faConfig,
        createdAt,
        embeddedWalletConfig,
        feeConfigs,
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
     * Platform-level settings for cards issued by this platform.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardConfigs(): CardConfigs? = cardConfigs.getNullable("cardConfigs")

    /**
     * Branding and sender configuration for card-tokenization authentication messages. This
     * configuration is independent of embedded-wallet support.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardTokenization2faConfig(): CardTokenization2faConfig? =
        cardTokenization2faConfig.getNullable("cardTokenization2faConfig")

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
     * Platform-collected fees that should be added on top of Grid-collected fees. Contains every
     * currently-active fee config for the platform.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feeConfigs(): List<FeeConfig>? = feeConfigs.getNullable("feeConfigs")

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
     * Returns the raw JSON value of [cardConfigs].
     *
     * Unlike [cardConfigs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardConfigs")
    @ExcludeMissing
    fun _cardConfigs(): JsonField<CardConfigs> = cardConfigs

    /**
     * Returns the raw JSON value of [cardTokenization2faConfig].
     *
     * Unlike [cardTokenization2faConfig], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cardTokenization2faConfig")
    @ExcludeMissing
    fun _cardTokenization2faConfig(): JsonField<CardTokenization2faConfig> =
        cardTokenization2faConfig

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
     * Returns the raw JSON value of [feeConfigs].
     *
     * Unlike [feeConfigs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("feeConfigs")
    @ExcludeMissing
    fun _feeConfigs(): JsonField<List<FeeConfig>> = feeConfigs

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
        private var cardConfigs: JsonField<CardConfigs> = JsonMissing.of()
        private var cardTokenization2faConfig: JsonField<CardTokenization2faConfig> =
            JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of()
        private var feeConfigs: JsonField<MutableList<FeeConfig>>? = null
        private var isRegulatedFinancialInstitution: JsonField<Boolean> = JsonMissing.of()
        private var proxyUmaSubdomain: JsonField<String> = JsonMissing.of()
        private var supportedCurrencies: JsonField<MutableList<PlatformCurrencyConfig>>? = null
        private var umaDomain: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var webhookEndpoint: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(platformConfig: PlatformConfig) = apply {
            id = platformConfig.id
            cardConfigs = platformConfig.cardConfigs
            cardTokenization2faConfig = platformConfig.cardTokenization2faConfig
            createdAt = platformConfig.createdAt
            embeddedWalletConfig = platformConfig.embeddedWalletConfig
            feeConfigs = platformConfig.feeConfigs.map { it.toMutableList() }
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

        /** Platform-level settings for cards issued by this platform. */
        fun cardConfigs(cardConfigs: CardConfigs) = cardConfigs(JsonField.of(cardConfigs))

        /**
         * Sets [Builder.cardConfigs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardConfigs] with a well-typed [CardConfigs] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardConfigs(cardConfigs: JsonField<CardConfigs>) = apply {
            this.cardConfigs = cardConfigs
        }

        /**
         * Branding and sender configuration for card-tokenization authentication messages. This
         * configuration is independent of embedded-wallet support.
         */
        fun cardTokenization2faConfig(cardTokenization2faConfig: CardTokenization2faConfig) =
            cardTokenization2faConfig(JsonField.of(cardTokenization2faConfig))

        /**
         * Sets [Builder.cardTokenization2faConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTokenization2faConfig] with a well-typed
         * [CardTokenization2faConfig] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun cardTokenization2faConfig(
            cardTokenization2faConfig: JsonField<CardTokenization2faConfig>
        ) = apply { this.cardTokenization2faConfig = cardTokenization2faConfig }

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
         * Platform-collected fees that should be added on top of Grid-collected fees. Contains
         * every currently-active fee config for the platform.
         */
        fun feeConfigs(feeConfigs: List<FeeConfig>) = feeConfigs(JsonField.of(feeConfigs))

        /**
         * Sets [Builder.feeConfigs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.feeConfigs] with a well-typed `List<FeeConfig>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun feeConfigs(feeConfigs: JsonField<List<FeeConfig>>) = apply {
            this.feeConfigs = feeConfigs.map { it.toMutableList() }
        }

        /**
         * Adds a single [FeeConfig] to [feeConfigs].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFeeConfig(feeConfig: FeeConfig) = apply {
            feeConfigs =
                (feeConfigs ?: JsonField.of(mutableListOf())).also {
                    checkKnown("feeConfigs", it).add(feeConfig)
                }
        }

        /**
         * Alias for calling [addFeeConfig] with
         * `FeeConfig.ofCrossCurrencyTransaction(crossCurrencyTransaction)`.
         */
        fun addFeeConfig(crossCurrencyTransaction: FeeConfig.CrossCurrencyTransaction) =
            addFeeConfig(FeeConfig.ofCrossCurrencyTransaction(crossCurrencyTransaction))

        /** Alias for calling [addFeeConfig] with `FeeConfig.ofRail(rail)`. */
        fun addFeeConfig(rail: FeeConfig.Rail) = addFeeConfig(FeeConfig.ofRail(rail))

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
                cardConfigs,
                cardTokenization2faConfig,
                createdAt,
                embeddedWalletConfig,
                (feeConfigs ?: JsonMissing.of()).map { it.toImmutable() },
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
        cardConfigs()?.validate()
        cardTokenization2faConfig()?.validate()
        createdAt()
        embeddedWalletConfig()?.validate()
        feeConfigs()?.forEach { it.validate() }
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
            (cardConfigs.asKnown()?.validity() ?: 0) +
            (cardTokenization2faConfig.asKnown()?.validity() ?: 0) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (embeddedWalletConfig.asKnown()?.validity() ?: 0) +
            (feeConfigs.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (isRegulatedFinancialInstitution.asKnown() == null) 0 else 1) +
            (if (proxyUmaSubdomain.asKnown() == null) 0 else 1) +
            (supportedCurrencies.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (umaDomain.asKnown() == null) 0 else 1) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (if (webhookEndpoint.asKnown() == null) 0 else 1)

    /** Platform-level settings for cards issued by this platform. */
    class CardConfigs
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxSpendPerDay: JsonField<Long>,
        private val maxSpendPerTransaction: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("maxSpendPerDay")
            @ExcludeMissing
            maxSpendPerDay: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("maxSpendPerTransaction")
            @ExcludeMissing
            maxSpendPerTransaction: JsonField<Long> = JsonMissing.of(),
        ) : this(maxSpendPerDay, maxSpendPerTransaction, mutableMapOf())

        /**
         * Platform-level cap on cumulative new spend during one UTC calendar day for every card
         * whose authorization decisions are made by Grid. The value is interpreted in the smallest
         * unit of each card's currency. Grid enforces the lower of this cap and the card's
         * configured `maxSpendPerDay`; null means no platform-level daily cap. The window resets at
         * 00:00 UTC. Refunds, reversals, and authorization expiries do not restore capacity during
         * the day. The cap applies to existing cards and cards issued later. Provider-decided card
         * programs are unaffected.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxSpendPerDay(): Long? = maxSpendPerDay.getNullable("maxSpendPerDay")

        /**
         * Platform-level cap on a single transaction for every card whose authorization decisions
         * are made by Grid. The value is interpreted in the smallest unit of each card's currency.
         * Grid enforces the lower of this cap and the card's configured `maxSpendPerTransaction`;
         * null means no platform-level cap. The cap applies to existing cards and to cards issued
         * later. Provider-decided card programs are unaffected.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun maxSpendPerTransaction(): Long? =
            maxSpendPerTransaction.getNullable("maxSpendPerTransaction")

        /**
         * Returns the raw JSON value of [maxSpendPerDay].
         *
         * Unlike [maxSpendPerDay], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("maxSpendPerDay")
        @ExcludeMissing
        fun _maxSpendPerDay(): JsonField<Long> = maxSpendPerDay

        /**
         * Returns the raw JSON value of [maxSpendPerTransaction].
         *
         * Unlike [maxSpendPerTransaction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("maxSpendPerTransaction")
        @ExcludeMissing
        fun _maxSpendPerTransaction(): JsonField<Long> = maxSpendPerTransaction

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

            /** Returns a mutable builder for constructing an instance of [CardConfigs]. */
            fun builder() = Builder()
        }

        /** A builder for [CardConfigs]. */
        class Builder internal constructor() {

            private var maxSpendPerDay: JsonField<Long> = JsonMissing.of()
            private var maxSpendPerTransaction: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardConfigs: CardConfigs) = apply {
                maxSpendPerDay = cardConfigs.maxSpendPerDay
                maxSpendPerTransaction = cardConfigs.maxSpendPerTransaction
                additionalProperties = cardConfigs.additionalProperties.toMutableMap()
            }

            /**
             * Platform-level cap on cumulative new spend during one UTC calendar day for every card
             * whose authorization decisions are made by Grid. The value is interpreted in the
             * smallest unit of each card's currency. Grid enforces the lower of this cap and the
             * card's configured `maxSpendPerDay`; null means no platform-level daily cap. The
             * window resets at 00:00 UTC. Refunds, reversals, and authorization expiries do not
             * restore capacity during the day. The cap applies to existing cards and cards issued
             * later. Provider-decided card programs are unaffected.
             */
            fun maxSpendPerDay(maxSpendPerDay: Long?) =
                maxSpendPerDay(JsonField.ofNullable(maxSpendPerDay))

            /**
             * Alias for [Builder.maxSpendPerDay].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxSpendPerDay(maxSpendPerDay: Long) = maxSpendPerDay(maxSpendPerDay as Long?)

            /**
             * Sets [Builder.maxSpendPerDay] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSpendPerDay] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxSpendPerDay(maxSpendPerDay: JsonField<Long>) = apply {
                this.maxSpendPerDay = maxSpendPerDay
            }

            /**
             * Platform-level cap on a single transaction for every card whose authorization
             * decisions are made by Grid. The value is interpreted in the smallest unit of each
             * card's currency. Grid enforces the lower of this cap and the card's configured
             * `maxSpendPerTransaction`; null means no platform-level cap. The cap applies to
             * existing cards and to cards issued later. Provider-decided card programs are
             * unaffected.
             */
            fun maxSpendPerTransaction(maxSpendPerTransaction: Long?) =
                maxSpendPerTransaction(JsonField.ofNullable(maxSpendPerTransaction))

            /**
             * Alias for [Builder.maxSpendPerTransaction].
             *
             * This unboxed primitive overload exists for backwards compatibility.
             */
            fun maxSpendPerTransaction(maxSpendPerTransaction: Long) =
                maxSpendPerTransaction(maxSpendPerTransaction as Long?)

            /**
             * Sets [Builder.maxSpendPerTransaction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxSpendPerTransaction] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun maxSpendPerTransaction(maxSpendPerTransaction: JsonField<Long>) = apply {
                this.maxSpendPerTransaction = maxSpendPerTransaction
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
             * Returns an immutable instance of [CardConfigs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CardConfigs =
                CardConfigs(
                    maxSpendPerDay,
                    maxSpendPerTransaction,
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
        fun validate(): CardConfigs = apply {
            if (validated) {
                return@apply
            }

            maxSpendPerDay()
            maxSpendPerTransaction()
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
            (if (maxSpendPerDay.asKnown() == null) 0 else 1) +
                (if (maxSpendPerTransaction.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardConfigs &&
                maxSpendPerDay == other.maxSpendPerDay &&
                maxSpendPerTransaction == other.maxSpendPerTransaction &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(maxSpendPerDay, maxSpendPerTransaction, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardConfigs{maxSpendPerDay=$maxSpendPerDay, maxSpendPerTransaction=$maxSpendPerTransaction, additionalProperties=$additionalProperties}"
    }

    /**
     * Branding and sender configuration for card-tokenization authentication messages. This
     * configuration is independent of embedded-wallet support.
     */
    class CardTokenization2faConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val displayName: JsonField<String>,
        private val email: JsonField<Email>,
        private val logoUrl: JsonField<String>,
        private val sms: JsonField<Sms>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("displayName")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("email") @ExcludeMissing email: JsonField<Email> = JsonMissing.of(),
            @JsonProperty("logoUrl") @ExcludeMissing logoUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sms") @ExcludeMissing sms: JsonField<Sms> = JsonMissing.of(),
        ) : this(displayName, email, logoUrl, sms, mutableMapOf())

        /**
         * Platform name displayed in authentication messages.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun displayName(): String? = displayName.getNullable("displayName")

        /**
         * Email branding and sender settings for card-tokenization authentication messages. Invalid
         * or unverified sender identities can cause delivery to fail.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun email(): Email? = email.getNullable("email")

        /**
         * HTTPS URL of the logo displayed in email messages.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun logoUrl(): String? = logoUrl.getNullable("logoUrl")

        /**
         * SMS settings for card-tokenization authentication messages delivered through a
         * Lightspark-managed Twilio sender.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun sms(): Sms? = sms.getNullable("sms")

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("displayName")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [email].
         *
         * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<Email> = email

        /**
         * Returns the raw JSON value of [logoUrl].
         *
         * Unlike [logoUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("logoUrl") @ExcludeMissing fun _logoUrl(): JsonField<String> = logoUrl

        /**
         * Returns the raw JSON value of [sms].
         *
         * Unlike [sms], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sms") @ExcludeMissing fun _sms(): JsonField<Sms> = sms

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
             * [CardTokenization2faConfig].
             */
            fun builder() = Builder()
        }

        /** A builder for [CardTokenization2faConfig]. */
        class Builder internal constructor() {

            private var displayName: JsonField<String> = JsonMissing.of()
            private var email: JsonField<Email> = JsonMissing.of()
            private var logoUrl: JsonField<String> = JsonMissing.of()
            private var sms: JsonField<Sms> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cardTokenization2faConfig: CardTokenization2faConfig) = apply {
                displayName = cardTokenization2faConfig.displayName
                email = cardTokenization2faConfig.email
                logoUrl = cardTokenization2faConfig.logoUrl
                sms = cardTokenization2faConfig.sms
                additionalProperties = cardTokenization2faConfig.additionalProperties.toMutableMap()
            }

            /** Platform name displayed in authentication messages. */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /**
             * Email branding and sender settings for card-tokenization authentication messages.
             * Invalid or unverified sender identities can cause delivery to fail.
             */
            fun email(email: Email) = email(JsonField.of(email))

            /**
             * Sets [Builder.email] to an arbitrary JSON value.
             *
             * You should usually call [Builder.email] with a well-typed [Email] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun email(email: JsonField<Email>) = apply { this.email = email }

            /** HTTPS URL of the logo displayed in email messages. */
            fun logoUrl(logoUrl: String) = logoUrl(JsonField.of(logoUrl))

            /**
             * Sets [Builder.logoUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.logoUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

            /**
             * SMS settings for card-tokenization authentication messages delivered through a
             * Lightspark-managed Twilio sender.
             */
            fun sms(sms: Sms) = sms(JsonField.of(sms))

            /**
             * Sets [Builder.sms] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sms] with a well-typed [Sms] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun sms(sms: JsonField<Sms>) = apply { this.sms = sms }

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
             * Returns an immutable instance of [CardTokenization2faConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CardTokenization2faConfig =
                CardTokenization2faConfig(
                    displayName,
                    email,
                    logoUrl,
                    sms,
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
        fun validate(): CardTokenization2faConfig = apply {
            if (validated) {
                return@apply
            }

            displayName()
            email()?.validate()
            logoUrl()
            sms()?.validate()
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
            (if (displayName.asKnown() == null) 0 else 1) +
                (email.asKnown()?.validity() ?: 0) +
                (if (logoUrl.asKnown() == null) 0 else 1) +
                (sms.asKnown()?.validity() ?: 0)

        /**
         * Email branding and sender settings for card-tokenization authentication messages. Invalid
         * or unverified sender identities can cause delivery to fail.
         */
        class Email
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bodyText: JsonField<String>,
            private val fromAddress: JsonField<String>,
            private val fromName: JsonField<String>,
            private val replyToAddress: JsonField<String>,
            private val subject: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bodyText")
                @ExcludeMissing
                bodyText: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fromAddress")
                @ExcludeMissing
                fromAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("fromName")
                @ExcludeMissing
                fromName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("replyToAddress")
                @ExcludeMissing
                replyToAddress: JsonField<String> = JsonMissing.of(),
                @JsonProperty("subject")
                @ExcludeMissing
                subject: JsonField<String> = JsonMissing.of(),
            ) : this(bodyText, fromAddress, fromName, replyToAddress, subject, mutableMapOf())

            /**
             * Plain-text message content. Lightspark inserts the authentication code into a
             * controlled text and HTML template; arbitrary HTML and template variables are not
             * supported.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bodyText(): String? = bodyText.getNullable("bodyText")

            /**
             * Sender address for card-tokenization authentication emails.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fromAddress(): String? = fromAddress.getNullable("fromAddress")

            /**
             * Sender display name.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun fromName(): String? = fromName.getNullable("fromName")

            /**
             * Reply-to address for card-tokenization authentication emails.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun replyToAddress(): String? = replyToAddress.getNullable("replyToAddress")

            /**
             * Subject for the authentication email.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun subject(): String? = subject.getNullable("subject")

            /**
             * Returns the raw JSON value of [bodyText].
             *
             * Unlike [bodyText], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyText") @ExcludeMissing fun _bodyText(): JsonField<String> = bodyText

            /**
             * Returns the raw JSON value of [fromAddress].
             *
             * Unlike [fromAddress], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fromAddress")
            @ExcludeMissing
            fun _fromAddress(): JsonField<String> = fromAddress

            /**
             * Returns the raw JSON value of [fromName].
             *
             * Unlike [fromName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fromName") @ExcludeMissing fun _fromName(): JsonField<String> = fromName

            /**
             * Returns the raw JSON value of [replyToAddress].
             *
             * Unlike [replyToAddress], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("replyToAddress")
            @ExcludeMissing
            fun _replyToAddress(): JsonField<String> = replyToAddress

            /**
             * Returns the raw JSON value of [subject].
             *
             * Unlike [subject], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("subject") @ExcludeMissing fun _subject(): JsonField<String> = subject

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

                /** Returns a mutable builder for constructing an instance of [Email]. */
                fun builder() = Builder()
            }

            /** A builder for [Email]. */
            class Builder internal constructor() {

                private var bodyText: JsonField<String> = JsonMissing.of()
                private var fromAddress: JsonField<String> = JsonMissing.of()
                private var fromName: JsonField<String> = JsonMissing.of()
                private var replyToAddress: JsonField<String> = JsonMissing.of()
                private var subject: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(email: Email) = apply {
                    bodyText = email.bodyText
                    fromAddress = email.fromAddress
                    fromName = email.fromName
                    replyToAddress = email.replyToAddress
                    subject = email.subject
                    additionalProperties = email.additionalProperties.toMutableMap()
                }

                /**
                 * Plain-text message content. Lightspark inserts the authentication code into a
                 * controlled text and HTML template; arbitrary HTML and template variables are not
                 * supported.
                 */
                fun bodyText(bodyText: String) = bodyText(JsonField.of(bodyText))

                /**
                 * Sets [Builder.bodyText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyText(bodyText: JsonField<String>) = apply { this.bodyText = bodyText }

                /** Sender address for card-tokenization authentication emails. */
                fun fromAddress(fromAddress: String) = fromAddress(JsonField.of(fromAddress))

                /**
                 * Sets [Builder.fromAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fromAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fromAddress(fromAddress: JsonField<String>) = apply {
                    this.fromAddress = fromAddress
                }

                /** Sender display name. */
                fun fromName(fromName: String) = fromName(JsonField.of(fromName))

                /**
                 * Sets [Builder.fromName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fromName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fromName(fromName: JsonField<String>) = apply { this.fromName = fromName }

                /** Reply-to address for card-tokenization authentication emails. */
                fun replyToAddress(replyToAddress: String) =
                    replyToAddress(JsonField.of(replyToAddress))

                /**
                 * Sets [Builder.replyToAddress] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.replyToAddress] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun replyToAddress(replyToAddress: JsonField<String>) = apply {
                    this.replyToAddress = replyToAddress
                }

                /** Subject for the authentication email. */
                fun subject(subject: String) = subject(JsonField.of(subject))

                /**
                 * Sets [Builder.subject] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subject] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subject(subject: JsonField<String>) = apply { this.subject = subject }

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
                 * Returns an immutable instance of [Email].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Email =
                    Email(
                        bodyText,
                        fromAddress,
                        fromName,
                        replyToAddress,
                        subject,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Email = apply {
                if (validated) {
                    return@apply
                }

                bodyText()
                fromAddress()
                fromName()
                replyToAddress()
                subject()
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
                (if (bodyText.asKnown() == null) 0 else 1) +
                    (if (fromAddress.asKnown() == null) 0 else 1) +
                    (if (fromName.asKnown() == null) 0 else 1) +
                    (if (replyToAddress.asKnown() == null) 0 else 1) +
                    (if (subject.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Email &&
                    bodyText == other.bodyText &&
                    fromAddress == other.fromAddress &&
                    fromName == other.fromName &&
                    replyToAddress == other.replyToAddress &&
                    subject == other.subject &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    bodyText,
                    fromAddress,
                    fromName,
                    replyToAddress,
                    subject,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Email{bodyText=$bodyText, fromAddress=$fromAddress, fromName=$fromName, replyToAddress=$replyToAddress, subject=$subject, additionalProperties=$additionalProperties}"
        }

        /**
         * SMS settings for card-tokenization authentication messages delivered through a
         * Lightspark-managed Twilio sender.
         */
        class Sms
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val bodyText: JsonField<String>,
            private val templateSid: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("bodyText")
                @ExcludeMissing
                bodyText: JsonField<String> = JsonMissing.of(),
                @JsonProperty("templateSid")
                @ExcludeMissing
                templateSid: JsonField<String> = JsonMissing.of(),
            ) : this(bodyText, templateSid, mutableMapOf())

            /**
             * Plain-text fallback message used when Twilio Verify is unavailable for the
             * authentication code. Lightspark appends the code to this text.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bodyText(): String? = bodyText.getNullable("bodyText")

            /**
             * Twilio Verify template SID to use for this platform. An invalid or unavailable
             * template can cause delivery to fail.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun templateSid(): String? = templateSid.getNullable("templateSid")

            /**
             * Returns the raw JSON value of [bodyText].
             *
             * Unlike [bodyText], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bodyText") @ExcludeMissing fun _bodyText(): JsonField<String> = bodyText

            /**
             * Returns the raw JSON value of [templateSid].
             *
             * Unlike [templateSid], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("templateSid")
            @ExcludeMissing
            fun _templateSid(): JsonField<String> = templateSid

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

                /** Returns a mutable builder for constructing an instance of [Sms]. */
                fun builder() = Builder()
            }

            /** A builder for [Sms]. */
            class Builder internal constructor() {

                private var bodyText: JsonField<String> = JsonMissing.of()
                private var templateSid: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(sms: Sms) = apply {
                    bodyText = sms.bodyText
                    templateSid = sms.templateSid
                    additionalProperties = sms.additionalProperties.toMutableMap()
                }

                /**
                 * Plain-text fallback message used when Twilio Verify is unavailable for the
                 * authentication code. Lightspark appends the code to this text.
                 */
                fun bodyText(bodyText: String) = bodyText(JsonField.of(bodyText))

                /**
                 * Sets [Builder.bodyText] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bodyText] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bodyText(bodyText: JsonField<String>) = apply { this.bodyText = bodyText }

                /**
                 * Twilio Verify template SID to use for this platform. An invalid or unavailable
                 * template can cause delivery to fail.
                 */
                fun templateSid(templateSid: String) = templateSid(JsonField.of(templateSid))

                /**
                 * Sets [Builder.templateSid] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.templateSid] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun templateSid(templateSid: JsonField<String>) = apply {
                    this.templateSid = templateSid
                }

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
                 * Returns an immutable instance of [Sms].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Sms = Sms(bodyText, templateSid, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Sms = apply {
                if (validated) {
                    return@apply
                }

                bodyText()
                templateSid()
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
                (if (bodyText.asKnown() == null) 0 else 1) +
                    (if (templateSid.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Sms &&
                    bodyText == other.bodyText &&
                    templateSid == other.templateSid &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(bodyText, templateSid, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Sms{bodyText=$bodyText, templateSid=$templateSid, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardTokenization2faConfig &&
                displayName == other.displayName &&
                email == other.email &&
                logoUrl == other.logoUrl &&
                sms == other.sms &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(displayName, email, logoUrl, sms, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardTokenization2faConfig{displayName=$displayName, email=$email, logoUrl=$logoUrl, sms=$sms, additionalProperties=$additionalProperties}"
    }

    /**
     * A fee charged for a cross-currency transaction. There can be at most one cross-currency
     * transaction fee config for a given source currency. The fee will apply to all cross-currency
     * transactions that originate in the source currency.
     */
    @JsonDeserialize(using = FeeConfig.Deserializer::class)
    @JsonSerialize(using = FeeConfig.Serializer::class)
    class FeeConfig
    private constructor(
        private val crossCurrencyTransaction: CrossCurrencyTransaction? = null,
        private val rail: Rail? = null,
        private val _json: JsonValue? = null,
    ) {

        /**
         * A fee charged for a cross-currency transaction. There can be at most one cross-currency
         * transaction fee config for a given source currency. The fee will apply to all
         * cross-currency transactions that originate in the source currency.
         */
        fun crossCurrencyTransaction(): CrossCurrencyTransaction? = crossCurrencyTransaction

        /**
         * A fee charged when a transaction uses the specified rail. There can be at most one for a
         * given rail, direction and originator. For example, a config with rail: ACH, direction:
         * OUT, originator: GRID will charge a fee on all outgoing ACH transactions.
         */
        fun rail(): Rail? = rail

        fun isCrossCurrencyTransaction(): Boolean = crossCurrencyTransaction != null

        fun isRail(): Boolean = rail != null

        /**
         * A fee charged for a cross-currency transaction. There can be at most one cross-currency
         * transaction fee config for a given source currency. The fee will apply to all
         * cross-currency transactions that originate in the source currency.
         */
        fun asCrossCurrencyTransaction(): CrossCurrencyTransaction =
            crossCurrencyTransaction.getOrThrow("crossCurrencyTransaction")

        /**
         * A fee charged when a transaction uses the specified rail. There can be at most one for a
         * given rail, direction and originator. For example, a config with rail: ACH, direction:
         * OUT, originator: GRID will charge a fee on all outgoing ACH transactions.
         */
        fun asRail(): Rail = rail.getOrThrow("rail")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.lightspark.grid.core.JsonValue
         *
         * val result: String? = feeConfig.accept(object : FeeConfig.Visitor<String?> {
         *     override fun visitCrossCurrencyTransaction(crossCurrencyTransaction: CrossCurrencyTransaction): String? = crossCurrencyTransaction.toString()
         *
         *     // ...
         *
         *     override fun unknown(json: JsonValue?): String? {
         *         // Or inspect the `json`.
         *         return null
         *     }
         * })
         * ```
         *
         * @throws LightsparkGridInvalidDataException if [Visitor.unknown] is not overridden in
         *   [visitor] and the current variant is unknown.
         */
        fun <T> accept(visitor: Visitor<T>): T =
            when {
                crossCurrencyTransaction != null ->
                    visitor.visitCrossCurrencyTransaction(crossCurrencyTransaction)
                rail != null -> visitor.visitRail(rail)
                else -> visitor.unknown(_json)
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
        fun validate(): FeeConfig = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitCrossCurrencyTransaction(
                        crossCurrencyTransaction: CrossCurrencyTransaction
                    ) {
                        crossCurrencyTransaction.validate()
                    }

                    override fun visitRail(rail: Rail) {
                        rail.validate()
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
                    override fun visitCrossCurrencyTransaction(
                        crossCurrencyTransaction: CrossCurrencyTransaction
                    ) = crossCurrencyTransaction.validity()

                    override fun visitRail(rail: Rail) = rail.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FeeConfig &&
                crossCurrencyTransaction == other.crossCurrencyTransaction &&
                rail == other.rail
        }

        override fun hashCode(): Int = Objects.hash(crossCurrencyTransaction, rail)

        override fun toString(): String =
            when {
                crossCurrencyTransaction != null ->
                    "FeeConfig{crossCurrencyTransaction=$crossCurrencyTransaction}"
                rail != null -> "FeeConfig{rail=$rail}"
                _json != null -> "FeeConfig{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid FeeConfig")
            }

        companion object {

            /**
             * A fee charged for a cross-currency transaction. There can be at most one
             * cross-currency transaction fee config for a given source currency. The fee will apply
             * to all cross-currency transactions that originate in the source currency.
             */
            fun ofCrossCurrencyTransaction(crossCurrencyTransaction: CrossCurrencyTransaction) =
                FeeConfig(crossCurrencyTransaction = crossCurrencyTransaction)

            /**
             * A fee charged when a transaction uses the specified rail. There can be at most one
             * for a given rail, direction and originator. For example, a config with rail: ACH,
             * direction: OUT, originator: GRID will charge a fee on all outgoing ACH transactions.
             */
            fun ofRail(rail: Rail) = FeeConfig(rail = rail)
        }

        /**
         * An interface that defines how to map each variant of [FeeConfig] to a value of type [T].
         */
        interface Visitor<out T> {

            /**
             * A fee charged for a cross-currency transaction. There can be at most one
             * cross-currency transaction fee config for a given source currency. The fee will apply
             * to all cross-currency transactions that originate in the source currency.
             */
            fun visitCrossCurrencyTransaction(crossCurrencyTransaction: CrossCurrencyTransaction): T

            /**
             * A fee charged when a transaction uses the specified rail. There can be at most one
             * for a given rail, direction and originator. For example, a config with rail: ACH,
             * direction: OUT, originator: GRID will charge a fee on all outgoing ACH transactions.
             */
            fun visitRail(rail: Rail): T

            /**
             * Maps an unknown variant of [FeeConfig] to a value of type [T].
             *
             * An instance of [FeeConfig] can contain an unknown variant if it was deserialized from
             * data that doesn't match any known variant. For example, if the SDK is on an older
             * version than the API, then the API may respond with new variants that the SDK is
             * unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown FeeConfig: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<FeeConfig>(FeeConfig::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): FeeConfig {
                val json = JsonValue.fromJsonNode(node)
                val feeType = json.asObject()?.get("feeType")?.asString()

                when (feeType) {
                    "CROSS_CURRENCY_TRANSACTION" -> {
                        return tryDeserialize(node, jacksonTypeRef<CrossCurrencyTransaction>())
                            ?.let { FeeConfig(crossCurrencyTransaction = it, _json = json) }
                            ?: FeeConfig(_json = json)
                    }
                    "RAIL" -> {
                        return tryDeserialize(node, jacksonTypeRef<Rail>())?.let {
                            FeeConfig(rail = it, _json = json)
                        } ?: FeeConfig(_json = json)
                    }
                }

                return FeeConfig(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<FeeConfig>(FeeConfig::class) {

            override fun serialize(
                value: FeeConfig,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.crossCurrencyTransaction != null ->
                        generator.writeObject(value.crossCurrencyTransaction)
                    value.rail != null -> generator.writeObject(value.rail)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid FeeConfig")
                }
            }
        }

        /**
         * A fee charged for a cross-currency transaction. There can be at most one cross-currency
         * transaction fee config for a given source currency. The fee will apply to all
         * cross-currency transactions that originate in the source currency.
         */
        class CrossCurrencyTransaction
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val feeType: JsonValue,
            private val fixedFee: JsonField<FixedFee>,
            private val sourceCurrency: JsonField<String>,
            private val variableFeeBps: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("feeType") @ExcludeMissing feeType: JsonValue = JsonMissing.of(),
                @JsonProperty("fixedFee")
                @ExcludeMissing
                fixedFee: JsonField<FixedFee> = JsonMissing.of(),
                @JsonProperty("sourceCurrency")
                @ExcludeMissing
                sourceCurrency: JsonField<String> = JsonMissing.of(),
                @JsonProperty("variableFeeBps")
                @ExcludeMissing
                variableFeeBps: JsonField<Long> = JsonMissing.of(),
            ) : this(feeType, fixedFee, sourceCurrency, variableFeeBps, mutableMapOf())

            /**
             * The kind of activity this fee applies to.
             * - `CROSS_CURRENCY_TRANSACTION` — a fee charged on transactions where the sending
             *   currency differs from the receiving currency
             * - `RAIL` — a fee charged on any transaction that uses the specified payment rail
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("CROSS_CURRENCY_TRANSACTION")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("feeType") @ExcludeMissing fun _feeType(): JsonValue = feeType

            /**
             * Fixed fee charged per transaction.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fixedFee(): FixedFee = fixedFee.getRequired("fixedFee")

            /**
             * Currency code of the sending side this fee applies to. Only `USD` is accepted today;
             * other currencies return a `NOT_IMPLEMENTED` error.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun sourceCurrency(): String = sourceCurrency.getRequired("sourceCurrency")

            /**
             * Variable fee in basis points (1 bps = 0.01%) to apply to a transaction's
             * source-currency amount.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun variableFeeBps(): Long = variableFeeBps.getRequired("variableFeeBps")

            /**
             * Returns the raw JSON value of [fixedFee].
             *
             * Unlike [fixedFee], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fixedFee")
            @ExcludeMissing
            fun _fixedFee(): JsonField<FixedFee> = fixedFee

            /**
             * Returns the raw JSON value of [sourceCurrency].
             *
             * Unlike [sourceCurrency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("sourceCurrency")
            @ExcludeMissing
            fun _sourceCurrency(): JsonField<String> = sourceCurrency

            /**
             * Returns the raw JSON value of [variableFeeBps].
             *
             * Unlike [variableFeeBps], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("variableFeeBps")
            @ExcludeMissing
            fun _variableFeeBps(): JsonField<Long> = variableFeeBps

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
                 * [CrossCurrencyTransaction].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .fixedFee()
                 * .sourceCurrency()
                 * .variableFeeBps()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [CrossCurrencyTransaction]. */
            class Builder internal constructor() {

                private var feeType: JsonValue = JsonValue.from("CROSS_CURRENCY_TRANSACTION")
                private var fixedFee: JsonField<FixedFee>? = null
                private var sourceCurrency: JsonField<String>? = null
                private var variableFeeBps: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(crossCurrencyTransaction: CrossCurrencyTransaction) = apply {
                    feeType = crossCurrencyTransaction.feeType
                    fixedFee = crossCurrencyTransaction.fixedFee
                    sourceCurrency = crossCurrencyTransaction.sourceCurrency
                    variableFeeBps = crossCurrencyTransaction.variableFeeBps
                    additionalProperties =
                        crossCurrencyTransaction.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("CROSS_CURRENCY_TRANSACTION")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun feeType(feeType: JsonValue) = apply { this.feeType = feeType }

                /** Fixed fee charged per transaction. */
                fun fixedFee(fixedFee: FixedFee) = fixedFee(JsonField.of(fixedFee))

                /**
                 * Sets [Builder.fixedFee] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedFee] with a well-typed [FixedFee] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fixedFee(fixedFee: JsonField<FixedFee>) = apply { this.fixedFee = fixedFee }

                /**
                 * Currency code of the sending side this fee applies to. Only `USD` is accepted
                 * today; other currencies return a `NOT_IMPLEMENTED` error.
                 */
                fun sourceCurrency(sourceCurrency: String) =
                    sourceCurrency(JsonField.of(sourceCurrency))

                /**
                 * Sets [Builder.sourceCurrency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.sourceCurrency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun sourceCurrency(sourceCurrency: JsonField<String>) = apply {
                    this.sourceCurrency = sourceCurrency
                }

                /**
                 * Variable fee in basis points (1 bps = 0.01%) to apply to a transaction's
                 * source-currency amount.
                 */
                fun variableFeeBps(variableFeeBps: Long) =
                    variableFeeBps(JsonField.of(variableFeeBps))

                /**
                 * Sets [Builder.variableFeeBps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.variableFeeBps] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun variableFeeBps(variableFeeBps: JsonField<Long>) = apply {
                    this.variableFeeBps = variableFeeBps
                }

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
                 * Returns an immutable instance of [CrossCurrencyTransaction].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .fixedFee()
                 * .sourceCurrency()
                 * .variableFeeBps()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CrossCurrencyTransaction =
                    CrossCurrencyTransaction(
                        feeType,
                        checkRequired("fixedFee", fixedFee),
                        checkRequired("sourceCurrency", sourceCurrency),
                        checkRequired("variableFeeBps", variableFeeBps),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): CrossCurrencyTransaction = apply {
                if (validated) {
                    return@apply
                }

                _feeType().let {
                    if (it != JsonValue.from("CROSS_CURRENCY_TRANSACTION")) {
                        throw LightsparkGridInvalidDataException(
                            "'feeType' is invalid, received $it"
                        )
                    }
                }
                fixedFee().validate()
                sourceCurrency()
                variableFeeBps()
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
                feeType.let { if (it == JsonValue.from("CROSS_CURRENCY_TRANSACTION")) 1 else 0 } +
                    (fixedFee.asKnown()?.validity() ?: 0) +
                    (if (sourceCurrency.asKnown() == null) 0 else 1) +
                    (if (variableFeeBps.asKnown() == null) 0 else 1)

            /** Fixed fee charged per transaction. */
            class FixedFee
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for
                 * USD).
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                 * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC"
                 * for USDC, etc.)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [FixedFee].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .currency()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FixedFee]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(fixedFee: FixedFee) = apply {
                        amount = fixedFee.amount
                        currency = fixedFee.currency
                        additionalProperties = fixedFee.additionalProperties.toMutableMap()
                    }

                    /**
                     * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents
                     * for USD).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                     * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin,
                     * "USDC" for USDC, etc.)
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [FixedFee].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FixedFee =
                        FixedFee(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): FixedFee = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown() == null) 0 else 1) +
                        (if (currency.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FixedFee &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FixedFee{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CrossCurrencyTransaction &&
                    feeType == other.feeType &&
                    fixedFee == other.fixedFee &&
                    sourceCurrency == other.sourceCurrency &&
                    variableFeeBps == other.variableFeeBps &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    feeType,
                    fixedFee,
                    sourceCurrency,
                    variableFeeBps,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CrossCurrencyTransaction{feeType=$feeType, fixedFee=$fixedFee, sourceCurrency=$sourceCurrency, variableFeeBps=$variableFeeBps, additionalProperties=$additionalProperties}"
        }

        /**
         * A fee charged when a transaction uses the specified rail. There can be at most one for a
         * given rail, direction and originator. For example, a config with rail: ACH, direction:
         * OUT, originator: GRID will charge a fee on all outgoing ACH transactions.
         */
        class Rail
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val direction: JsonField<Direction>,
            private val feeType: JsonValue,
            private val fixedFee: JsonField<FixedFee>,
            private val originator: JsonField<Originator>,
            private val rail: JsonField<InnerRail>,
            private val variableFeeBps: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("direction")
                @ExcludeMissing
                direction: JsonField<Direction> = JsonMissing.of(),
                @JsonProperty("feeType") @ExcludeMissing feeType: JsonValue = JsonMissing.of(),
                @JsonProperty("fixedFee")
                @ExcludeMissing
                fixedFee: JsonField<FixedFee> = JsonMissing.of(),
                @JsonProperty("originator")
                @ExcludeMissing
                originator: JsonField<Originator> = JsonMissing.of(),
                @JsonProperty("rail") @ExcludeMissing rail: JsonField<InnerRail> = JsonMissing.of(),
                @JsonProperty("variableFeeBps")
                @ExcludeMissing
                variableFeeBps: JsonField<Long> = JsonMissing.of(),
            ) : this(direction, feeType, fixedFee, originator, rail, variableFeeBps, mutableMapOf())

            /**
             * Whether the money is coming in or going out, relative to Grid. Only `OUT` is accepted
             * today.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The kind of activity this fee applies to.
             * - `CROSS_CURRENCY_TRANSACTION` — a fee charged on transactions where the sending
             *   currency differs from the receiving currency
             * - `RAIL` — a fee charged on any transaction that uses the specified payment rail
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("RAIL")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("feeType") @ExcludeMissing fun _feeType(): JsonValue = feeType

            /**
             * Fixed fee charged per transaction.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun fixedFee(): FixedFee = fixedFee.getRequired("fixedFee")

            /**
             * Who originated the movement over the rail. An ACH OUT where Grid is the originator
             * means Grid is pushing out the funds, while an ACH OUT with an EXTERNAL originator
             * indicates Grid received an ACH pull request from an external source.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun originator(): Originator = originator.getRequired("originator")

            /**
             * The rail used in the transaction. `ACH`, `RTP`, `FEDNOW` and `WIRE` are accepted
             * today; other rails return a `NOT_IMPLEMENTED` error.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rail(): InnerRail = rail.getRequired("rail")

            /**
             * Variable fee in basis points (1 bps = 0.01%) to apply to a transaction's
             * source-currency amount.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun variableFeeBps(): Long = variableFeeBps.getRequired("variableFeeBps")

            /**
             * Returns the raw JSON value of [direction].
             *
             * Unlike [direction], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * Returns the raw JSON value of [fixedFee].
             *
             * Unlike [fixedFee], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("fixedFee")
            @ExcludeMissing
            fun _fixedFee(): JsonField<FixedFee> = fixedFee

            /**
             * Returns the raw JSON value of [originator].
             *
             * Unlike [originator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("originator")
            @ExcludeMissing
            fun _originator(): JsonField<Originator> = originator

            /**
             * Returns the raw JSON value of [rail].
             *
             * Unlike [rail], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rail") @ExcludeMissing fun _rail(): JsonField<InnerRail> = rail

            /**
             * Returns the raw JSON value of [variableFeeBps].
             *
             * Unlike [variableFeeBps], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("variableFeeBps")
            @ExcludeMissing
            fun _variableFeeBps(): JsonField<Long> = variableFeeBps

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
                 * Returns a mutable builder for constructing an instance of [Rail].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .direction()
                 * .fixedFee()
                 * .originator()
                 * .rail()
                 * .variableFeeBps()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Rail]. */
            class Builder internal constructor() {

                private var direction: JsonField<Direction>? = null
                private var feeType: JsonValue = JsonValue.from("RAIL")
                private var fixedFee: JsonField<FixedFee>? = null
                private var originator: JsonField<Originator>? = null
                private var rail: JsonField<InnerRail>? = null
                private var variableFeeBps: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(rail: Rail) = apply {
                    direction = rail.direction
                    feeType = rail.feeType
                    fixedFee = rail.fixedFee
                    originator = rail.originator
                    this.rail = rail.rail
                    variableFeeBps = rail.variableFeeBps
                    additionalProperties = rail.additionalProperties.toMutableMap()
                }

                /**
                 * Whether the money is coming in or going out, relative to Grid. Only `OUT` is
                 * accepted today.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * Sets [Builder.direction] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.direction] with a well-typed [Direction] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("RAIL")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun feeType(feeType: JsonValue) = apply { this.feeType = feeType }

                /** Fixed fee charged per transaction. */
                fun fixedFee(fixedFee: FixedFee) = fixedFee(JsonField.of(fixedFee))

                /**
                 * Sets [Builder.fixedFee] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.fixedFee] with a well-typed [FixedFee] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun fixedFee(fixedFee: JsonField<FixedFee>) = apply { this.fixedFee = fixedFee }

                /**
                 * Who originated the movement over the rail. An ACH OUT where Grid is the
                 * originator means Grid is pushing out the funds, while an ACH OUT with an EXTERNAL
                 * originator indicates Grid received an ACH pull request from an external source.
                 */
                fun originator(originator: Originator) = originator(JsonField.of(originator))

                /**
                 * Sets [Builder.originator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.originator] with a well-typed [Originator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun originator(originator: JsonField<Originator>) = apply {
                    this.originator = originator
                }

                /**
                 * The rail used in the transaction. `ACH`, `RTP`, `FEDNOW` and `WIRE` are accepted
                 * today; other rails return a `NOT_IMPLEMENTED` error.
                 */
                fun rail(rail: InnerRail) = rail(JsonField.of(rail))

                /**
                 * Sets [Builder.rail] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rail] with a well-typed [InnerRail] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rail(rail: JsonField<InnerRail>) = apply { this.rail = rail }

                /**
                 * Variable fee in basis points (1 bps = 0.01%) to apply to a transaction's
                 * source-currency amount.
                 */
                fun variableFeeBps(variableFeeBps: Long) =
                    variableFeeBps(JsonField.of(variableFeeBps))

                /**
                 * Sets [Builder.variableFeeBps] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.variableFeeBps] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun variableFeeBps(variableFeeBps: JsonField<Long>) = apply {
                    this.variableFeeBps = variableFeeBps
                }

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
                 * Returns an immutable instance of [Rail].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .direction()
                 * .fixedFee()
                 * .originator()
                 * .rail()
                 * .variableFeeBps()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rail =
                    Rail(
                        checkRequired("direction", direction),
                        feeType,
                        checkRequired("fixedFee", fixedFee),
                        checkRequired("originator", originator),
                        checkRequired("rail", rail),
                        checkRequired("variableFeeBps", variableFeeBps),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): Rail = apply {
                if (validated) {
                    return@apply
                }

                direction().validate()
                _feeType().let {
                    if (it != JsonValue.from("RAIL")) {
                        throw LightsparkGridInvalidDataException(
                            "'feeType' is invalid, received $it"
                        )
                    }
                }
                fixedFee().validate()
                originator().validate()
                rail().validate()
                variableFeeBps()
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
                (direction.asKnown()?.validity() ?: 0) +
                    feeType.let { if (it == JsonValue.from("RAIL")) 1 else 0 } +
                    (fixedFee.asKnown()?.validity() ?: 0) +
                    (originator.asKnown()?.validity() ?: 0) +
                    (rail.asKnown()?.validity() ?: 0) +
                    (if (variableFeeBps.asKnown() == null) 0 else 1)

            /**
             * Whether the money is coming in or going out, relative to Grid. Only `OUT` is accepted
             * today.
             */
            class Direction @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val IN = of("IN")

                    val OUT = of("OUT")

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                /** An enum containing [Direction]'s known values. */
                enum class Known {
                    IN,
                    OUT,
                }

                /**
                 * An enum containing [Direction]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Direction] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    IN,
                    OUT,
                    /**
                     * An enum member indicating that [Direction] was instantiated with an unknown
                     * value.
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
                        IN -> Value.IN
                        OUT -> Value.OUT
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
                        IN -> Known.IN
                        OUT -> Known.OUT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown Direction: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): Direction = apply {
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

                    return other is Direction && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fixed fee charged per transaction. */
            class FixedFee
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for
                 * USD).
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                 * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC"
                 * for USDC, etc.)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

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
                     * Returns a mutable builder for constructing an instance of [FixedFee].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .currency()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [FixedFee]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(fixedFee: FixedFee) = apply {
                        amount = fixedFee.amount
                        currency = fixedFee.currency
                        additionalProperties = fixedFee.additionalProperties.toMutableMap()
                    }

                    /**
                     * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents
                     * for USD).
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                     * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin,
                     * "USDC" for USDC, etc.)
                     */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                     * Returns an immutable instance of [FixedFee].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): FixedFee =
                        FixedFee(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): FixedFee = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
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
                    (if (amount.asKnown() == null) 0 else 1) +
                        (if (currency.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is FixedFee &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "FixedFee{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            /**
             * Who originated the movement over the rail. An ACH OUT where Grid is the originator
             * means Grid is pushing out the funds, while an ACH OUT with an EXTERNAL originator
             * indicates Grid received an ACH pull request from an external source.
             */
            class Originator
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

                    val GRID = of("GRID")

                    val EXTERNAL = of("EXTERNAL")

                    fun of(value: String) = Originator(JsonField.of(value))
                }

                /** An enum containing [Originator]'s known values. */
                enum class Known {
                    GRID,
                    EXTERNAL,
                }

                /**
                 * An enum containing [Originator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Originator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    GRID,
                    EXTERNAL,
                    /**
                     * An enum member indicating that [Originator] was instantiated with an unknown
                     * value.
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
                        GRID -> Value.GRID
                        EXTERNAL -> Value.EXTERNAL
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
                        GRID -> Known.GRID
                        EXTERNAL -> Known.EXTERNAL
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown Originator: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): Originator = apply {
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

                    return other is Originator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The rail used in the transaction. `ACH`, `RTP`, `FEDNOW` and `WIRE` are accepted
             * today; other rails return a `NOT_IMPLEMENTED` error.
             */
            class InnerRail @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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

                    val ACH = of("ACH")

                    val ACH_COLOMBIA = of("ACH_COLOMBIA")

                    val BANK_TRANSFER = of("BANK_TRANSFER")

                    val BRE_B = of("BRE_B")

                    val CIPS = of("CIPS")

                    val FAST = of("FAST")

                    val FASTER_PAYMENTS = of("FASTER_PAYMENTS")

                    val FEDNOW = of("FEDNOW")

                    val INSTAPAY = of("INSTAPAY")

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    val NEFT = of("NEFT")

                    val PAYNOW = of("PAYNOW")

                    val PESONET = of("PESONET")

                    val PIX = of("PIX")

                    val RTGS = of("RTGS")

                    val RTP = of("RTP")

                    val SEPA = of("SEPA")

                    val SEPA_INSTANT = of("SEPA_INSTANT")

                    val SPEI = of("SPEI")

                    val SWIFT = of("SWIFT")

                    val UNIONPAY = of("UNIONPAY")

                    val UPI = of("UPI")

                    val WIRE = of("WIRE")

                    fun of(value: String) = InnerRail(JsonField.of(value))
                }

                /** An enum containing [InnerRail]'s known values. */
                enum class Known {
                    ACH,
                    ACH_COLOMBIA,
                    BANK_TRANSFER,
                    BRE_B,
                    CIPS,
                    FAST,
                    FASTER_PAYMENTS,
                    FEDNOW,
                    INSTAPAY,
                    MOBILE_MONEY,
                    NEFT,
                    PAYNOW,
                    PESONET,
                    PIX,
                    RTGS,
                    RTP,
                    SEPA,
                    SEPA_INSTANT,
                    SPEI,
                    SWIFT,
                    UNIONPAY,
                    UPI,
                    WIRE,
                }

                /**
                 * An enum containing [InnerRail]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [InnerRail] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACH,
                    ACH_COLOMBIA,
                    BANK_TRANSFER,
                    BRE_B,
                    CIPS,
                    FAST,
                    FASTER_PAYMENTS,
                    FEDNOW,
                    INSTAPAY,
                    MOBILE_MONEY,
                    NEFT,
                    PAYNOW,
                    PESONET,
                    PIX,
                    RTGS,
                    RTP,
                    SEPA,
                    SEPA_INSTANT,
                    SPEI,
                    SWIFT,
                    UNIONPAY,
                    UPI,
                    WIRE,
                    /**
                     * An enum member indicating that [InnerRail] was instantiated with an unknown
                     * value.
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
                        ACH -> Value.ACH
                        ACH_COLOMBIA -> Value.ACH_COLOMBIA
                        BANK_TRANSFER -> Value.BANK_TRANSFER
                        BRE_B -> Value.BRE_B
                        CIPS -> Value.CIPS
                        FAST -> Value.FAST
                        FASTER_PAYMENTS -> Value.FASTER_PAYMENTS
                        FEDNOW -> Value.FEDNOW
                        INSTAPAY -> Value.INSTAPAY
                        MOBILE_MONEY -> Value.MOBILE_MONEY
                        NEFT -> Value.NEFT
                        PAYNOW -> Value.PAYNOW
                        PESONET -> Value.PESONET
                        PIX -> Value.PIX
                        RTGS -> Value.RTGS
                        RTP -> Value.RTP
                        SEPA -> Value.SEPA
                        SEPA_INSTANT -> Value.SEPA_INSTANT
                        SPEI -> Value.SPEI
                        SWIFT -> Value.SWIFT
                        UNIONPAY -> Value.UNIONPAY
                        UPI -> Value.UPI
                        WIRE -> Value.WIRE
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
                        ACH -> Known.ACH
                        ACH_COLOMBIA -> Known.ACH_COLOMBIA
                        BANK_TRANSFER -> Known.BANK_TRANSFER
                        BRE_B -> Known.BRE_B
                        CIPS -> Known.CIPS
                        FAST -> Known.FAST
                        FASTER_PAYMENTS -> Known.FASTER_PAYMENTS
                        FEDNOW -> Known.FEDNOW
                        INSTAPAY -> Known.INSTAPAY
                        MOBILE_MONEY -> Known.MOBILE_MONEY
                        NEFT -> Known.NEFT
                        PAYNOW -> Known.PAYNOW
                        PESONET -> Known.PESONET
                        PIX -> Known.PIX
                        RTGS -> Known.RTGS
                        RTP -> Known.RTP
                        SEPA -> Known.SEPA
                        SEPA_INSTANT -> Known.SEPA_INSTANT
                        SPEI -> Known.SPEI
                        SWIFT -> Known.SWIFT
                        UNIONPAY -> Known.UNIONPAY
                        UPI -> Known.UPI
                        WIRE -> Known.WIRE
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown InnerRail: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): InnerRail = apply {
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

                    return other is InnerRail && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rail &&
                    direction == other.direction &&
                    feeType == other.feeType &&
                    fixedFee == other.fixedFee &&
                    originator == other.originator &&
                    rail == other.rail &&
                    variableFeeBps == other.variableFeeBps &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    direction,
                    feeType,
                    fixedFee,
                    originator,
                    rail,
                    variableFeeBps,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rail{direction=$direction, feeType=$feeType, fixedFee=$fixedFee, originator=$originator, rail=$rail, variableFeeBps=$variableFeeBps, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformConfig &&
            id == other.id &&
            cardConfigs == other.cardConfigs &&
            cardTokenization2faConfig == other.cardTokenization2faConfig &&
            createdAt == other.createdAt &&
            embeddedWalletConfig == other.embeddedWalletConfig &&
            feeConfigs == other.feeConfigs &&
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
            cardConfigs,
            cardTokenization2faConfig,
            createdAt,
            embeddedWalletConfig,
            feeConfigs,
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
        "PlatformConfig{id=$id, cardConfigs=$cardConfigs, cardTokenization2faConfig=$cardTokenization2faConfig, createdAt=$createdAt, embeddedWalletConfig=$embeddedWalletConfig, feeConfigs=$feeConfigs, isRegulatedFinancialInstitution=$isRegulatedFinancialInstitution, proxyUmaSubdomain=$proxyUmaSubdomain, supportedCurrencies=$supportedCurrencies, umaDomain=$umaDomain, updatedAt=$updatedAt, webhookEndpoint=$webhookEndpoint, additionalProperties=$additionalProperties}"
}
