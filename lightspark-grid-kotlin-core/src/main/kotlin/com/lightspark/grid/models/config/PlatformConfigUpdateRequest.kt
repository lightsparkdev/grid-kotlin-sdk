// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.config

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
import java.util.Collections
import java.util.Objects

class PlatformConfigUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cardConfigs: JsonField<CardConfigs>,
    private val cardTokenization2faConfig: JsonField<CardTokenization2faConfig>,
    private val embeddedWalletConfig: JsonField<EmbeddedWalletConfig>,
    private val feeConfigs: JsonField<List<FeeConfig>>,
    private val supportedCurrencies: JsonField<List<PlatformCurrencyConfig>>,
    private val umaDomain: JsonField<String>,
    private val webhookEndpoint: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cardConfigs")
        @ExcludeMissing
        cardConfigs: JsonField<CardConfigs> = JsonMissing.of(),
        @JsonProperty("cardTokenization2faConfig")
        @ExcludeMissing
        cardTokenization2faConfig: JsonField<CardTokenization2faConfig> = JsonMissing.of(),
        @JsonProperty("embeddedWalletConfig")
        @ExcludeMissing
        embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of(),
        @JsonProperty("feeConfigs")
        @ExcludeMissing
        feeConfigs: JsonField<List<FeeConfig>> = JsonMissing.of(),
        @JsonProperty("supportedCurrencies")
        @ExcludeMissing
        supportedCurrencies: JsonField<List<PlatformCurrencyConfig>> = JsonMissing.of(),
        @JsonProperty("umaDomain") @ExcludeMissing umaDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhookEndpoint")
        @ExcludeMissing
        webhookEndpoint: JsonField<String> = JsonMissing.of(),
    ) : this(
        cardConfigs,
        cardTokenization2faConfig,
        embeddedWalletConfig,
        feeConfigs,
        supportedCurrencies,
        umaDomain,
        webhookEndpoint,
        mutableMapOf(),
    )

    /**
     * Update platform-level card settings. Fields omitted from the nested object are left
     * unchanged. For either spending limit, supply null to clear the platform cap or a positive
     * integer to set it. Omit this field at the top level to leave all card settings unchanged.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardConfigs(): CardConfigs? = cardConfigs.getNullable("cardConfigs")

    /**
     * Update card-tokenization authentication branding and delivery settings. Fields omitted from
     * the nested object are left unchanged. Changes apply to subsequent delivery attempts.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun cardTokenization2faConfig(): CardTokenization2faConfig? =
        cardTokenization2faConfig.getNullable("cardTokenization2faConfig")

    /**
     * Update or create the embedded-wallet configuration for this platform. Fields omitted from the
     * nested object are left unchanged. Omit this field at the top level to leave the
     * embedded-wallet configuration unchanged entirely.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun embeddedWalletConfig(): EmbeddedWalletConfig? =
        embeddedWalletConfig.getNullable("embeddedWalletConfig")

    /**
     * Merge-by-key upsert of platform fee configs, keyed by `(feeType, sourceCurrency)`. Setting
     * variable and fixed fees to 0 for an existing fee config deactivates it. Only `sourceCurrency:
     * USD` is accepted today. Omit this field to leave fee configs unchanged.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun feeConfigs(): List<FeeConfig>? = feeConfigs.getNullable("feeConfigs")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportedCurrencies(): List<PlatformCurrencyConfig>? =
        supportedCurrencies.getNullable("supportedCurrencies")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun umaDomain(): String? = umaDomain.getNullable("umaDomain")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun webhookEndpoint(): String? = webhookEndpoint.getNullable("webhookEndpoint")

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

        /**
         * Returns a mutable builder for constructing an instance of [PlatformConfigUpdateRequest].
         */
        fun builder() = Builder()
    }

    /** A builder for [PlatformConfigUpdateRequest]. */
    class Builder internal constructor() {

        private var cardConfigs: JsonField<CardConfigs> = JsonMissing.of()
        private var cardTokenization2faConfig: JsonField<CardTokenization2faConfig> =
            JsonMissing.of()
        private var embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of()
        private var feeConfigs: JsonField<MutableList<FeeConfig>>? = null
        private var supportedCurrencies: JsonField<MutableList<PlatformCurrencyConfig>>? = null
        private var umaDomain: JsonField<String> = JsonMissing.of()
        private var webhookEndpoint: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(platformConfigUpdateRequest: PlatformConfigUpdateRequest) = apply {
            cardConfigs = platformConfigUpdateRequest.cardConfigs
            cardTokenization2faConfig = platformConfigUpdateRequest.cardTokenization2faConfig
            embeddedWalletConfig = platformConfigUpdateRequest.embeddedWalletConfig
            feeConfigs = platformConfigUpdateRequest.feeConfigs.map { it.toMutableList() }
            supportedCurrencies =
                platformConfigUpdateRequest.supportedCurrencies.map { it.toMutableList() }
            umaDomain = platformConfigUpdateRequest.umaDomain
            webhookEndpoint = platformConfigUpdateRequest.webhookEndpoint
            additionalProperties = platformConfigUpdateRequest.additionalProperties.toMutableMap()
        }

        /**
         * Update platform-level card settings. Fields omitted from the nested object are left
         * unchanged. For either spending limit, supply null to clear the platform cap or a positive
         * integer to set it. Omit this field at the top level to leave all card settings unchanged.
         */
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
         * Update card-tokenization authentication branding and delivery settings. Fields omitted
         * from the nested object are left unchanged. Changes apply to subsequent delivery attempts.
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

        /**
         * Update or create the embedded-wallet configuration for this platform. Fields omitted from
         * the nested object are left unchanged. Omit this field at the top level to leave the
         * embedded-wallet configuration unchanged entirely.
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
         * Merge-by-key upsert of platform fee configs, keyed by `(feeType, sourceCurrency)`.
         * Setting variable and fixed fees to 0 for an existing fee config deactivates it. Only
         * `sourceCurrency: USD` is accepted today. Omit this field to leave fee configs unchanged.
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

        fun umaDomain(umaDomain: String) = umaDomain(JsonField.of(umaDomain))

        /**
         * Sets [Builder.umaDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.umaDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun umaDomain(umaDomain: JsonField<String>) = apply { this.umaDomain = umaDomain }

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
         * Returns an immutable instance of [PlatformConfigUpdateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PlatformConfigUpdateRequest =
            PlatformConfigUpdateRequest(
                cardConfigs,
                cardTokenization2faConfig,
                embeddedWalletConfig,
                (feeConfigs ?: JsonMissing.of()).map { it.toImmutable() },
                (supportedCurrencies ?: JsonMissing.of()).map { it.toImmutable() },
                umaDomain,
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
    fun validate(): PlatformConfigUpdateRequest = apply {
        if (validated) {
            return@apply
        }

        cardConfigs()?.validate()
        cardTokenization2faConfig()?.validate()
        embeddedWalletConfig()?.validate()
        feeConfigs()?.forEach { it.validate() }
        supportedCurrencies()?.forEach { it.validate() }
        umaDomain()
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
        (cardConfigs.asKnown()?.validity() ?: 0) +
            (cardTokenization2faConfig.asKnown()?.validity() ?: 0) +
            (embeddedWalletConfig.asKnown()?.validity() ?: 0) +
            (feeConfigs.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (supportedCurrencies.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (umaDomain.asKnown() == null) 0 else 1) +
            (if (webhookEndpoint.asKnown() == null) 0 else 1)

    /**
     * Update platform-level card settings. Fields omitted from the nested object are left
     * unchanged. For either spending limit, supply null to clear the platform cap or a positive
     * integer to set it. Omit this field at the top level to leave all card settings unchanged.
     */
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
     * Update card-tokenization authentication branding and delivery settings. Fields omitted from
     * the nested object are left unchanged. Changes apply to subsequent delivery attempts.
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
     * A platform-configured fee collected by Grid and settled to the platform internal account.
     * There can be at most one fee config for a given fee type and source currency pair. The fee
     * will apply to all transactions of the fee type that originate in the source currency.
     */
    class FeeConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val feeType: JsonField<FeeType>,
        private val fixedFee: JsonField<FixedFee>,
        private val sourceCurrency: JsonField<String>,
        private val variableFeeBps: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("feeType") @ExcludeMissing feeType: JsonField<FeeType> = JsonMissing.of(),
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
         * - `CROSS_CURRENCY_TRANSACTION` — fee charged on a cross-currency Grid transaction (source
         *   currency differs from destination currency).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun feeType(): FeeType = feeType.getRequired("feeType")

        /**
         * Fixed fee charged per transaction.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fixedFee(): FixedFee = fixedFee.getRequired("fixedFee")

        /**
         * Currency code of the sending side this fee applies to. Only `USD` is accepted today;
         * other currencies return a `NOT_IMPLEMENTED` error.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sourceCurrency(): String = sourceCurrency.getRequired("sourceCurrency")

        /**
         * Variable fee in basis points (1 bps = 0.01%) to apply to a transaction's source-currency
         * amount.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun variableFeeBps(): Long = variableFeeBps.getRequired("variableFeeBps")

        /**
         * Returns the raw JSON value of [feeType].
         *
         * Unlike [feeType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("feeType") @ExcludeMissing fun _feeType(): JsonField<FeeType> = feeType

        /**
         * Returns the raw JSON value of [fixedFee].
         *
         * Unlike [fixedFee], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fixedFee") @ExcludeMissing fun _fixedFee(): JsonField<FixedFee> = fixedFee

        /**
         * Returns the raw JSON value of [sourceCurrency].
         *
         * Unlike [sourceCurrency], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sourceCurrency")
        @ExcludeMissing
        fun _sourceCurrency(): JsonField<String> = sourceCurrency

        /**
         * Returns the raw JSON value of [variableFeeBps].
         *
         * Unlike [variableFeeBps], this method doesn't throw if the JSON field has an unexpected
         * type.
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
             * Returns a mutable builder for constructing an instance of [FeeConfig].
             *
             * The following fields are required:
             * ```kotlin
             * .feeType()
             * .fixedFee()
             * .sourceCurrency()
             * .variableFeeBps()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [FeeConfig]. */
        class Builder internal constructor() {

            private var feeType: JsonField<FeeType>? = null
            private var fixedFee: JsonField<FixedFee>? = null
            private var sourceCurrency: JsonField<String>? = null
            private var variableFeeBps: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(feeConfig: FeeConfig) = apply {
                feeType = feeConfig.feeType
                fixedFee = feeConfig.fixedFee
                sourceCurrency = feeConfig.sourceCurrency
                variableFeeBps = feeConfig.variableFeeBps
                additionalProperties = feeConfig.additionalProperties.toMutableMap()
            }

            /**
             * The kind of activity this fee applies to.
             * - `CROSS_CURRENCY_TRANSACTION` — fee charged on a cross-currency Grid transaction
             *   (source currency differs from destination currency).
             */
            fun feeType(feeType: FeeType) = feeType(JsonField.of(feeType))

            /**
             * Sets [Builder.feeType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.feeType] with a well-typed [FeeType] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun feeType(feeType: JsonField<FeeType>) = apply { this.feeType = feeType }

            /** Fixed fee charged per transaction. */
            fun fixedFee(fixedFee: FixedFee) = fixedFee(JsonField.of(fixedFee))

            /**
             * Sets [Builder.fixedFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fixedFee] with a well-typed [FixedFee] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fixedFee(fixedFee: JsonField<FixedFee>) = apply { this.fixedFee = fixedFee }

            /**
             * Currency code of the sending side this fee applies to. Only `USD` is accepted today;
             * other currencies return a `NOT_IMPLEMENTED` error.
             */
            fun sourceCurrency(sourceCurrency: String) =
                sourceCurrency(JsonField.of(sourceCurrency))

            /**
             * Sets [Builder.sourceCurrency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sourceCurrency] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sourceCurrency(sourceCurrency: JsonField<String>) = apply {
                this.sourceCurrency = sourceCurrency
            }

            /**
             * Variable fee in basis points (1 bps = 0.01%) to apply to a transaction's
             * source-currency amount.
             */
            fun variableFeeBps(variableFeeBps: Long) = variableFeeBps(JsonField.of(variableFeeBps))

            /**
             * Sets [Builder.variableFeeBps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variableFeeBps] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [FeeConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .feeType()
             * .fixedFee()
             * .sourceCurrency()
             * .variableFeeBps()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): FeeConfig =
                FeeConfig(
                    checkRequired("feeType", feeType),
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): FeeConfig = apply {
            if (validated) {
                return@apply
            }

            feeType().validate()
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
            (feeType.asKnown()?.validity() ?: 0) +
                (fixedFee.asKnown()?.validity() ?: 0) +
                (if (sourceCurrency.asKnown() == null) 0 else 1) +
                (if (variableFeeBps.asKnown() == null) 0 else 1)

        /**
         * The kind of activity this fee applies to.
         * - `CROSS_CURRENCY_TRANSACTION` — fee charged on a cross-currency Grid transaction (source
         *   currency differs from destination currency).
         */
        class FeeType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                val CROSS_CURRENCY_TRANSACTION = of("CROSS_CURRENCY_TRANSACTION")

                fun of(value: String) = FeeType(JsonField.of(value))
            }

            /** An enum containing [FeeType]'s known values. */
            enum class Known {
                CROSS_CURRENCY_TRANSACTION
            }

            /**
             * An enum containing [FeeType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [FeeType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CROSS_CURRENCY_TRANSACTION,
                /**
                 * An enum member indicating that [FeeType] was instantiated with an unknown value.
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
                    CROSS_CURRENCY_TRANSACTION -> Value.CROSS_CURRENCY_TRANSACTION
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
                    CROSS_CURRENCY_TRANSACTION -> Known.CROSS_CURRENCY_TRANSACTION
                    else -> throw LightsparkGridInvalidDataException("Unknown FeeType: $value")
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
            fun validate(): FeeType = apply {
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

                return other is FeeType && value == other.value
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
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for USD).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
             * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC" for
             * USDC, etc.)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
                 * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for
                 * USD).
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                 * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC"
                 * for USDC, etc.)
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
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

            return other is FeeConfig &&
                feeType == other.feeType &&
                fixedFee == other.fixedFee &&
                sourceCurrency == other.sourceCurrency &&
                variableFeeBps == other.variableFeeBps &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(feeType, fixedFee, sourceCurrency, variableFeeBps, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FeeConfig{feeType=$feeType, fixedFee=$fixedFee, sourceCurrency=$sourceCurrency, variableFeeBps=$variableFeeBps, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformConfigUpdateRequest &&
            cardConfigs == other.cardConfigs &&
            cardTokenization2faConfig == other.cardTokenization2faConfig &&
            embeddedWalletConfig == other.embeddedWalletConfig &&
            feeConfigs == other.feeConfigs &&
            supportedCurrencies == other.supportedCurrencies &&
            umaDomain == other.umaDomain &&
            webhookEndpoint == other.webhookEndpoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            cardConfigs,
            cardTokenization2faConfig,
            embeddedWalletConfig,
            feeConfigs,
            supportedCurrencies,
            umaDomain,
            webhookEndpoint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlatformConfigUpdateRequest{cardConfigs=$cardConfigs, cardTokenization2faConfig=$cardTokenization2faConfig, embeddedWalletConfig=$embeddedWalletConfig, feeConfigs=$feeConfigs, supportedCurrencies=$supportedCurrencies, umaDomain=$umaDomain, webhookEndpoint=$webhookEndpoint, additionalProperties=$additionalProperties}"
}
