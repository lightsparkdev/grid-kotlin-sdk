// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

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
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * An ownership verification challenge for a crypto wallet external account. The shape is determined
 * by the challenge `method`.
 */
@JsonDeserialize(using = OwnershipChallenge.Deserializer::class)
@JsonSerialize(using = OwnershipChallenge.Serializer::class)
class OwnershipChallenge
private constructor(
    private val walletSignature: WalletSignature? = null,
    private val liveness: Liveness? = null,
    private val _json: JsonValue? = null,
) {

    /** A challenge to prove ownership of the wallet by signing a message with the wallet's key. */
    fun walletSignature(): WalletSignature? = walletSignature

    /**
     * A challenge to prove ownership through a hosted biometric verification flow. Completes
     * asynchronously — the outcome is delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks or
     * by polling the external account.
     */
    fun liveness(): Liveness? = liveness

    fun isWalletSignature(): Boolean = walletSignature != null

    fun isLiveness(): Boolean = liveness != null

    /** A challenge to prove ownership of the wallet by signing a message with the wallet's key. */
    fun asWalletSignature(): WalletSignature = walletSignature.getOrThrow("walletSignature")

    /**
     * A challenge to prove ownership through a hosted biometric verification flow. Completes
     * asynchronously — the outcome is delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks or
     * by polling the external account.
     */
    fun asLiveness(): Liveness = liveness.getOrThrow("liveness")

    fun _json(): JsonValue? = _json

    /**
     * Maps this instance's current variant to a value of type [T] using the given [visitor].
     *
     * Note that this method is _not_ forwards compatible with new variants from the API, unless
     * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of the
     * SDK gracefully, consider overriding [Visitor.unknown]:
     * ```kotlin
     * import com.lightspark.grid.core.JsonValue
     *
     * val result: String? = ownershipChallenge.accept(object : OwnershipChallenge.Visitor<String?> {
     *     override fun visitWalletSignature(walletSignature: WalletSignature): String? = walletSignature.toString()
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
            walletSignature != null -> visitor.visitWalletSignature(walletSignature)
            liveness != null -> visitor.visitLiveness(liveness)
            else -> visitor.unknown(_json)
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
    fun validate(): OwnershipChallenge = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitWalletSignature(walletSignature: WalletSignature) {
                    walletSignature.validate()
                }

                override fun visitLiveness(liveness: Liveness) {
                    liveness.validate()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitWalletSignature(walletSignature: WalletSignature) =
                    walletSignature.validity()

                override fun visitLiveness(liveness: Liveness) = liveness.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OwnershipChallenge &&
            walletSignature == other.walletSignature &&
            liveness == other.liveness
    }

    override fun hashCode(): Int = Objects.hash(walletSignature, liveness)

    override fun toString(): String =
        when {
            walletSignature != null -> "OwnershipChallenge{walletSignature=$walletSignature}"
            liveness != null -> "OwnershipChallenge{liveness=$liveness}"
            _json != null -> "OwnershipChallenge{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid OwnershipChallenge")
        }

    companion object {

        /**
         * A challenge to prove ownership of the wallet by signing a message with the wallet's key.
         */
        fun ofWalletSignature(walletSignature: WalletSignature) =
            OwnershipChallenge(walletSignature = walletSignature)

        /**
         * A challenge to prove ownership through a hosted biometric verification flow. Completes
         * asynchronously — the outcome is delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks
         * or by polling the external account.
         */
        fun ofLiveness(liveness: Liveness) = OwnershipChallenge(liveness = liveness)
    }

    /**
     * An interface that defines how to map each variant of [OwnershipChallenge] to a value of type
     * [T].
     */
    interface Visitor<out T> {

        /**
         * A challenge to prove ownership of the wallet by signing a message with the wallet's key.
         */
        fun visitWalletSignature(walletSignature: WalletSignature): T

        /**
         * A challenge to prove ownership through a hosted biometric verification flow. Completes
         * asynchronously — the outcome is delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks
         * or by polling the external account.
         */
        fun visitLiveness(liveness: Liveness): T

        /**
         * Maps an unknown variant of [OwnershipChallenge] to a value of type [T].
         *
         * An instance of [OwnershipChallenge] can contain an unknown variant if it was deserialized
         * from data that doesn't match any known variant. For example, if the SDK is on an older
         * version than the API, then the API may respond with new variants that the SDK is unaware
         * of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown OwnershipChallenge: $json")
        }
    }

    internal class Deserializer : BaseDeserializer<OwnershipChallenge>(OwnershipChallenge::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): OwnershipChallenge {
            val json = JsonValue.fromJsonNode(node)
            val method = json.asObject()?.get("method")?.asString()

            when (method) {
                "WALLET_SIGNATURE" -> {
                    return tryDeserialize(node, jacksonTypeRef<WalletSignature>())?.let {
                        OwnershipChallenge(walletSignature = it, _json = json)
                    } ?: OwnershipChallenge(_json = json)
                }
                "LIVENESS" -> {
                    return tryDeserialize(node, jacksonTypeRef<Liveness>())?.let {
                        OwnershipChallenge(liveness = it, _json = json)
                    } ?: OwnershipChallenge(_json = json)
                }
            }

            return OwnershipChallenge(_json = json)
        }
    }

    internal class Serializer : BaseSerializer<OwnershipChallenge>(OwnershipChallenge::class) {

        override fun serialize(
            value: OwnershipChallenge,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.walletSignature != null -> generator.writeObject(value.walletSignature)
                value.liveness != null -> generator.writeObject(value.liveness)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid OwnershipChallenge")
            }
        }
    }

    /** A challenge to prove ownership of the wallet by signing a message with the wallet's key. */
    class WalletSignature
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresAt: JsonField<OffsetDateTime>,
        private val messageToSign: JsonField<String>,
        private val method: JsonValue,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("messageToSign")
            @ExcludeMissing
            messageToSign: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonValue = JsonMissing.of(),
        ) : this(expiresAt, messageToSign, method, mutableMapOf())

        /**
         * When this challenge expires. Prompt the user promptly; after expiry, start a new
         * challenge.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

        /**
         * The exact message the wallet must sign, character-for-character. Submit the resulting
         * signature via the verify endpoint.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun messageToSign(): String = messageToSign.getRequired("messageToSign")

        /**
         * The verification method. Always `WALLET_SIGNATURE` for this shape.
         *
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("WALLET_SIGNATURE")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonValue = method

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expiresAt")
        @ExcludeMissing
        fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

        /**
         * Returns the raw JSON value of [messageToSign].
         *
         * Unlike [messageToSign], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("messageToSign")
        @ExcludeMissing
        fun _messageToSign(): JsonField<String> = messageToSign

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
             * Returns a mutable builder for constructing an instance of [WalletSignature].
             *
             * The following fields are required:
             * ```kotlin
             * .expiresAt()
             * .messageToSign()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [WalletSignature]. */
        class Builder internal constructor() {

            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var messageToSign: JsonField<String>? = null
            private var method: JsonValue = JsonValue.from("WALLET_SIGNATURE")
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(walletSignature: WalletSignature) = apply {
                expiresAt = walletSignature.expiresAt
                messageToSign = walletSignature.messageToSign
                method = walletSignature.method
                additionalProperties = walletSignature.additionalProperties.toMutableMap()
            }

            /**
             * When this challenge expires. Prompt the user promptly; after expiry, start a new
             * challenge.
             */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * The exact message the wallet must sign, character-for-character. Submit the resulting
             * signature via the verify endpoint.
             */
            fun messageToSign(messageToSign: String) = messageToSign(JsonField.of(messageToSign))

            /**
             * Sets [Builder.messageToSign] to an arbitrary JSON value.
             *
             * You should usually call [Builder.messageToSign] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun messageToSign(messageToSign: JsonField<String>) = apply {
                this.messageToSign = messageToSign
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("WALLET_SIGNATURE")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonValue) = apply { this.method = method }

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
             * Returns an immutable instance of [WalletSignature].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .expiresAt()
             * .messageToSign()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): WalletSignature =
                WalletSignature(
                    checkRequired("expiresAt", expiresAt),
                    checkRequired("messageToSign", messageToSign),
                    method,
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
        fun validate(): WalletSignature = apply {
            if (validated) {
                return@apply
            }

            expiresAt()
            messageToSign()
            _method().let {
                if (it != JsonValue.from("WALLET_SIGNATURE")) {
                    throw LightsparkGridInvalidDataException("'method' is invalid, received $it")
                }
            }
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
            (if (expiresAt.asKnown() == null) 0 else 1) +
                (if (messageToSign.asKnown() == null) 0 else 1) +
                method.let { if (it == JsonValue.from("WALLET_SIGNATURE")) 1 else 0 }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is WalletSignature &&
                expiresAt == other.expiresAt &&
                messageToSign == other.messageToSign &&
                method == other.method &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresAt, messageToSign, method, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WalletSignature{expiresAt=$expiresAt, messageToSign=$messageToSign, method=$method, additionalProperties=$additionalProperties}"
    }

    /**
     * A challenge to prove ownership through a hosted biometric verification flow. Completes
     * asynchronously — the outcome is delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks or
     * by polling the external account.
     */
    class Liveness
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val expiresAt: JsonField<OffsetDateTime>,
        private val method: JsonValue,
        private val verificationLink: JsonField<String>,
        private val token: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("expiresAt")
            @ExcludeMissing
            expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonValue = JsonMissing.of(),
            @JsonProperty("verificationLink")
            @ExcludeMissing
            verificationLink: JsonField<String> = JsonMissing.of(),
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        ) : this(expiresAt, method, verificationLink, token, mutableMapOf())

        /**
         * When this challenge expires. Prompt the user promptly; after expiry, start a new
         * challenge.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

        /**
         * The verification method. Always `LIVENESS` for this shape.
         *
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("LIVENESS")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonValue = method

        /**
         * Hosted verification URL to present to the user.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verificationLink(): String = verificationLink.getRequired("verificationLink")

        /**
         * Provider-specific token that can be used in place of `verificationLink` — for example, to
         * embed the provider's SDK directly in your application. Only returned for providers that
         * support direct SDK integration. Whether to use the hosted URL or the embedded SDK is up
         * to you; both flows result in the same verification outcome.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
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
         * Returns the raw JSON value of [verificationLink].
         *
         * Unlike [verificationLink], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("verificationLink")
        @ExcludeMissing
        fun _verificationLink(): JsonField<String> = verificationLink

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
             * Returns a mutable builder for constructing an instance of [Liveness].
             *
             * The following fields are required:
             * ```kotlin
             * .expiresAt()
             * .verificationLink()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Liveness]. */
        class Builder internal constructor() {

            private var expiresAt: JsonField<OffsetDateTime>? = null
            private var method: JsonValue = JsonValue.from("LIVENESS")
            private var verificationLink: JsonField<String>? = null
            private var token: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(liveness: Liveness) = apply {
                expiresAt = liveness.expiresAt
                method = liveness.method
                verificationLink = liveness.verificationLink
                token = liveness.token
                additionalProperties = liveness.additionalProperties.toMutableMap()
            }

            /**
             * When this challenge expires. Prompt the user promptly; after expiry, start a new
             * challenge.
             */
            fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                this.expiresAt = expiresAt
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("LIVENESS")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonValue) = apply { this.method = method }

            /** Hosted verification URL to present to the user. */
            fun verificationLink(verificationLink: String) =
                verificationLink(JsonField.of(verificationLink))

            /**
             * Sets [Builder.verificationLink] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationLink] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verificationLink(verificationLink: JsonField<String>) = apply {
                this.verificationLink = verificationLink
            }

            /**
             * Provider-specific token that can be used in place of `verificationLink` — for
             * example, to embed the provider's SDK directly in your application. Only returned for
             * providers that support direct SDK integration. Whether to use the hosted URL or the
             * embedded SDK is up to you; both flows result in the same verification outcome.
             */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * Returns an immutable instance of [Liveness].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .expiresAt()
             * .verificationLink()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Liveness =
                Liveness(
                    checkRequired("expiresAt", expiresAt),
                    method,
                    checkRequired("verificationLink", verificationLink),
                    token,
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
        fun validate(): Liveness = apply {
            if (validated) {
                return@apply
            }

            expiresAt()
            _method().let {
                if (it != JsonValue.from("LIVENESS")) {
                    throw LightsparkGridInvalidDataException("'method' is invalid, received $it")
                }
            }
            verificationLink()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (expiresAt.asKnown() == null) 0 else 1) +
                method.let { if (it == JsonValue.from("LIVENESS")) 1 else 0 } +
                (if (verificationLink.asKnown() == null) 0 else 1) +
                (if (token.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Liveness &&
                expiresAt == other.expiresAt &&
                method == other.method &&
                verificationLink == other.verificationLink &&
                token == other.token &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(expiresAt, method, verificationLink, token, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Liveness{expiresAt=$expiresAt, method=$method, verificationLink=$verificationLink, token=$token, additionalProperties=$additionalProperties}"
    }
}
