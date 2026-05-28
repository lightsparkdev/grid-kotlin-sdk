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
import java.util.Collections
import java.util.Objects

class PlatformConfigUpdateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val embeddedWalletConfig: JsonField<EmbeddedWalletConfig>,
    private val supportedCurrencies: JsonField<List<PlatformCurrencyConfig>>,
    private val umaDomain: JsonField<String>,
    private val webhookEndpoint: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("embeddedWalletConfig")
        @ExcludeMissing
        embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of(),
        @JsonProperty("supportedCurrencies")
        @ExcludeMissing
        supportedCurrencies: JsonField<List<PlatformCurrencyConfig>> = JsonMissing.of(),
        @JsonProperty("umaDomain") @ExcludeMissing umaDomain: JsonField<String> = JsonMissing.of(),
        @JsonProperty("webhookEndpoint")
        @ExcludeMissing
        webhookEndpoint: JsonField<String> = JsonMissing.of(),
    ) : this(embeddedWalletConfig, supportedCurrencies, umaDomain, webhookEndpoint, mutableMapOf())

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
     * Returns the raw JSON value of [embeddedWalletConfig].
     *
     * Unlike [embeddedWalletConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("embeddedWalletConfig")
    @ExcludeMissing
    fun _embeddedWalletConfig(): JsonField<EmbeddedWalletConfig> = embeddedWalletConfig

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

        private var embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of()
        private var supportedCurrencies: JsonField<MutableList<PlatformCurrencyConfig>>? = null
        private var umaDomain: JsonField<String> = JsonMissing.of()
        private var webhookEndpoint: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(platformConfigUpdateRequest: PlatformConfigUpdateRequest) = apply {
            embeddedWalletConfig = platformConfigUpdateRequest.embeddedWalletConfig
            supportedCurrencies =
                platformConfigUpdateRequest.supportedCurrencies.map { it.toMutableList() }
            umaDomain = platformConfigUpdateRequest.umaDomain
            webhookEndpoint = platformConfigUpdateRequest.webhookEndpoint
            additionalProperties = platformConfigUpdateRequest.additionalProperties.toMutableMap()
        }

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
                embeddedWalletConfig,
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

        embeddedWalletConfig()?.validate()
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
        (embeddedWalletConfig.asKnown()?.validity() ?: 0) +
            (supportedCurrencies.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (umaDomain.asKnown() == null) 0 else 1) +
            (if (webhookEndpoint.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PlatformConfigUpdateRequest &&
            embeddedWalletConfig == other.embeddedWalletConfig &&
            supportedCurrencies == other.supportedCurrencies &&
            umaDomain == other.umaDomain &&
            webhookEndpoint == other.webhookEndpoint &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            embeddedWalletConfig,
            supportedCurrencies,
            umaDomain,
            webhookEndpoint,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlatformConfigUpdateRequest{embeddedWalletConfig=$embeddedWalletConfig, supportedCurrencies=$supportedCurrencies, umaDomain=$umaDomain, webhookEndpoint=$webhookEndpoint, additionalProperties=$additionalProperties}"
}
