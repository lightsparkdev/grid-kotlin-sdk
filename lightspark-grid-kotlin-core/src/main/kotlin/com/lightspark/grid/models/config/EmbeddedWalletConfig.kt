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
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Per-platform embedded-wallet configuration. Controls branding and OTP behavior for the email sent
 * when a customer authenticates with an EMAIL_OTP credential. Fields omitted from a request are
 * left unchanged.
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
        @JsonProperty("otpLength") @ExcludeMissing otpLength: JsonField<Long> = JsonMissing.of(),
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
     * If true, OTP includes letters in addition to digits. Defaults to numeric-only when not set.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun alphanumeric(): Boolean? = alphanumeric.getNullable("alphanumeric")

    /**
     * App name displayed in the default OTP email template.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun appName(): String? = appName.getNullable("appName")

    /**
     * OTP validity window in seconds. Defaults to 300 when not set.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expirationSeconds(): Long? = expirationSeconds.getNullable("expirationSeconds")

    /**
     * URL to a PNG logo for the OTP email. Resized to 340x124px.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun logoUrl(): String? = logoUrl.getNullable("logoUrl")

    /**
     * Number of digits / characters in the OTP code. Defaults to 6 when not set.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun otpLength(): Long? = otpLength.getNullable("otpLength")

    /**
     * Custom reply-to email address for OTP emails.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun replyToEmailAddress(): String? = replyToEmailAddress.getNullable("replyToEmailAddress")

    /**
     * Custom sender email address for OTP emails.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sendFromEmailAddress(): String? = sendFromEmailAddress.getNullable("sendFromEmailAddress")

    /**
     * Custom sender display name. Defaults to "Notifications" when not set.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun sendFromEmailSenderName(): String? =
        sendFromEmailSenderName.getNullable("sendFromEmailSenderName")

    /**
     * Returns the raw JSON value of [alphanumeric].
     *
     * Unlike [alphanumeric], this method doesn't throw if the JSON field has an unexpected type.
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
     * Unlike [replyToEmailAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("replyToEmailAddress")
    @ExcludeMissing
    fun _replyToEmailAddress(): JsonField<String> = replyToEmailAddress

    /**
     * Returns the raw JSON value of [sendFromEmailAddress].
     *
     * Unlike [sendFromEmailAddress], this method doesn't throw if the JSON field has an unexpected
     * type.
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
         * If true, OTP includes letters in addition to digits. Defaults to numeric-only when not
         * set.
         */
        fun alphanumeric(alphanumeric: Boolean) = alphanumeric(JsonField.of(alphanumeric))

        /**
         * Sets [Builder.alphanumeric] to an arbitrary JSON value.
         *
         * You should usually call [Builder.alphanumeric] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun alphanumeric(alphanumeric: JsonField<Boolean>) = apply {
            this.alphanumeric = alphanumeric
        }

        /** App name displayed in the default OTP email template. */
        fun appName(appName: String) = appName(JsonField.of(appName))

        /**
         * Sets [Builder.appName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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
         * You should usually call [Builder.logoUrl] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun logoUrl(logoUrl: JsonField<String>) = apply { this.logoUrl = logoUrl }

        /** Number of digits / characters in the OTP code. Defaults to 6 when not set. */
        fun otpLength(otpLength: Long) = otpLength(JsonField.of(otpLength))

        /**
         * Sets [Builder.otpLength] to an arbitrary JSON value.
         *
         * You should usually call [Builder.otpLength] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun otpLength(otpLength: JsonField<Long>) = apply { this.otpLength = otpLength }

        /** Custom reply-to email address for OTP emails. */
        fun replyToEmailAddress(replyToEmailAddress: String) =
            replyToEmailAddress(JsonField.of(replyToEmailAddress))

        /**
         * Sets [Builder.replyToEmailAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.replyToEmailAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * You should usually call [Builder.sendFromEmailAddress] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
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
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
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
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match its
     *   expected type.
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
     * Returns a score indicating how many valid values are contained in this object recursively.
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
