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
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/** Update the platform configuration settings */
class ConfigUpdateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Update or create the embedded-wallet configuration for this platform. Fields omitted from the
     * nested object are left unchanged. Omit this field at the top level to leave the
     * embedded-wallet configuration unchanged entirely.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun embeddedWalletConfig(): EmbeddedWalletConfig? = body.embeddedWalletConfig()

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun supportedCurrencies(): List<PlatformCurrencyConfig>? = body.supportedCurrencies()

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun umaDomain(): String? = body.umaDomain()

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun webhookEndpoint(): String? = body.webhookEndpoint()

    /**
     * Returns the raw JSON value of [embeddedWalletConfig].
     *
     * Unlike [embeddedWalletConfig], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _embeddedWalletConfig(): JsonField<EmbeddedWalletConfig> = body._embeddedWalletConfig()

    /**
     * Returns the raw JSON value of [supportedCurrencies].
     *
     * Unlike [supportedCurrencies], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _supportedCurrencies(): JsonField<List<PlatformCurrencyConfig>> =
        body._supportedCurrencies()

    /**
     * Returns the raw JSON value of [umaDomain].
     *
     * Unlike [umaDomain], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _umaDomain(): JsonField<String> = body._umaDomain()

    /**
     * Returns the raw JSON value of [webhookEndpoint].
     *
     * Unlike [webhookEndpoint], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookEndpoint(): JsonField<String> = body._webhookEndpoint()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): ConfigUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ConfigUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [ConfigUpdateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(configUpdateParams: ConfigUpdateParams) = apply {
            body = configUpdateParams.body.toBuilder()
            additionalHeaders = configUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = configUpdateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [embeddedWalletConfig]
         * - [supportedCurrencies]
         * - [umaDomain]
         * - [webhookEndpoint]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Update or create the embedded-wallet configuration for this platform. Fields omitted from
         * the nested object are left unchanged. Omit this field at the top level to leave the
         * embedded-wallet configuration unchanged entirely.
         */
        fun embeddedWalletConfig(embeddedWalletConfig: EmbeddedWalletConfig) = apply {
            body.embeddedWalletConfig(embeddedWalletConfig)
        }

        /**
         * Sets [Builder.embeddedWalletConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.embeddedWalletConfig] with a well-typed
         * [EmbeddedWalletConfig] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun embeddedWalletConfig(embeddedWalletConfig: JsonField<EmbeddedWalletConfig>) = apply {
            body.embeddedWalletConfig(embeddedWalletConfig)
        }

        fun supportedCurrencies(supportedCurrencies: List<PlatformCurrencyConfig>) = apply {
            body.supportedCurrencies(supportedCurrencies)
        }

        /**
         * Sets [Builder.supportedCurrencies] to an arbitrary JSON value.
         *
         * You should usually call [Builder.supportedCurrencies] with a well-typed
         * `List<PlatformCurrencyConfig>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun supportedCurrencies(supportedCurrencies: JsonField<List<PlatformCurrencyConfig>>) =
            apply {
                body.supportedCurrencies(supportedCurrencies)
            }

        /**
         * Adds a single [PlatformCurrencyConfig] to [supportedCurrencies].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSupportedCurrency(supportedCurrency: PlatformCurrencyConfig) = apply {
            body.addSupportedCurrency(supportedCurrency)
        }

        fun umaDomain(umaDomain: String) = apply { body.umaDomain(umaDomain) }

        /**
         * Sets [Builder.umaDomain] to an arbitrary JSON value.
         *
         * You should usually call [Builder.umaDomain] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun umaDomain(umaDomain: JsonField<String>) = apply { body.umaDomain(umaDomain) }

        fun webhookEndpoint(webhookEndpoint: String) = apply {
            body.webhookEndpoint(webhookEndpoint)
        }

        /**
         * Sets [Builder.webhookEndpoint] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookEndpoint] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun webhookEndpoint(webhookEndpoint: JsonField<String>) = apply {
            body.webhookEndpoint(webhookEndpoint)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ConfigUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ConfigUpdateParams =
            ConfigUpdateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
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
            @JsonProperty("umaDomain")
            @ExcludeMissing
            umaDomain: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhookEndpoint")
            @ExcludeMissing
            webhookEndpoint: JsonField<String> = JsonMissing.of(),
        ) : this(
            embeddedWalletConfig,
            supportedCurrencies,
            umaDomain,
            webhookEndpoint,
            mutableMapOf(),
        )

        /**
         * Update or create the embedded-wallet configuration for this platform. Fields omitted from
         * the nested object are left unchanged. Omit this field at the top level to leave the
         * embedded-wallet configuration unchanged entirely.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun embeddedWalletConfig(): EmbeddedWalletConfig? =
            embeddedWalletConfig.getNullable("embeddedWalletConfig")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun supportedCurrencies(): List<PlatformCurrencyConfig>? =
            supportedCurrencies.getNullable("supportedCurrencies")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun umaDomain(): String? = umaDomain.getNullable("umaDomain")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun webhookEndpoint(): String? = webhookEndpoint.getNullable("webhookEndpoint")

        /**
         * Returns the raw JSON value of [embeddedWalletConfig].
         *
         * Unlike [embeddedWalletConfig], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("embeddedWalletConfig")
        @ExcludeMissing
        fun _embeddedWalletConfig(): JsonField<EmbeddedWalletConfig> = embeddedWalletConfig

        /**
         * Returns the raw JSON value of [supportedCurrencies].
         *
         * Unlike [supportedCurrencies], this method doesn't throw if the JSON field has an
         * unexpected type.
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
         * Unlike [webhookEndpoint], this method doesn't throw if the JSON field has an unexpected
         * type.
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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var embeddedWalletConfig: JsonField<EmbeddedWalletConfig> = JsonMissing.of()
            private var supportedCurrencies: JsonField<MutableList<PlatformCurrencyConfig>>? = null
            private var umaDomain: JsonField<String> = JsonMissing.of()
            private var webhookEndpoint: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                embeddedWalletConfig = body.embeddedWalletConfig
                supportedCurrencies = body.supportedCurrencies.map { it.toMutableList() }
                umaDomain = body.umaDomain
                webhookEndpoint = body.webhookEndpoint
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Update or create the embedded-wallet configuration for this platform. Fields omitted
             * from the nested object are left unchanged. Omit this field at the top level to leave
             * the embedded-wallet configuration unchanged entirely.
             */
            fun embeddedWalletConfig(embeddedWalletConfig: EmbeddedWalletConfig) =
                embeddedWalletConfig(JsonField.of(embeddedWalletConfig))

            /**
             * Sets [Builder.embeddedWalletConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.embeddedWalletConfig] with a well-typed
             * [EmbeddedWalletConfig] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun embeddedWalletConfig(embeddedWalletConfig: JsonField<EmbeddedWalletConfig>) =
                apply {
                    this.embeddedWalletConfig = embeddedWalletConfig
                }

            fun supportedCurrencies(supportedCurrencies: List<PlatformCurrencyConfig>) =
                supportedCurrencies(JsonField.of(supportedCurrencies))

            /**
             * Sets [Builder.supportedCurrencies] to an arbitrary JSON value.
             *
             * You should usually call [Builder.supportedCurrencies] with a well-typed
             * `List<PlatformCurrencyConfig>` value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
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
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body =
                Body(
                    embeddedWalletConfig,
                    (supportedCurrencies ?: JsonMissing.of()).map { it.toImmutable() },
                    umaDomain,
                    webhookEndpoint,
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
        fun validate(): Body = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

            return other is Body &&
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
            "Body{embeddedWalletConfig=$embeddedWalletConfig, supportedCurrencies=$supportedCurrencies, umaDomain=$umaDomain, webhookEndpoint=$webhookEndpoint, additionalProperties=$additionalProperties}"
    }

    /**
     * Update or create the embedded-wallet configuration for this platform. Fields omitted from the
     * nested object are left unchanged. Omit this field at the top level to leave the
     * embedded-wallet configuration unchanged entirely.
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

        return other is ConfigUpdateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ConfigUpdateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
