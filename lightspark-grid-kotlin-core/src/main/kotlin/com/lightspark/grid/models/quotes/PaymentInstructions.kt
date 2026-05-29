// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

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
import java.util.Collections
import java.util.Objects

class PaymentInstructions
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountOrWalletInfo: JsonField<AccountOrWalletInfo>,
    private val instructionsNotes: JsonField<String>,
    private val isPlatformAccount: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountOrWalletInfo")
        @ExcludeMissing
        accountOrWalletInfo: JsonField<AccountOrWalletInfo> = JsonMissing.of(),
        @JsonProperty("instructionsNotes")
        @ExcludeMissing
        instructionsNotes: JsonField<String> = JsonMissing.of(),
        @JsonProperty("isPlatformAccount")
        @ExcludeMissing
        isPlatformAccount: JsonField<Boolean> = JsonMissing.of(),
    ) : this(accountOrWalletInfo, instructionsNotes, isPlatformAccount, mutableMapOf())

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: bankAccountType, accountNumber
     * - MOBILE_MONEY: phoneNumber
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountOrWalletInfo(): AccountOrWalletInfo =
        accountOrWalletInfo.getRequired("accountOrWalletInfo")

    /**
     * Additional human-readable instructions for making the payment
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun instructionsNotes(): String? = instructionsNotes.getNullable("instructionsNotes")

    /**
     * Indicates whether the account is a platform account or a customer account.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun isPlatformAccount(): Boolean? = isPlatformAccount.getNullable("isPlatformAccount")

    /**
     * Returns the raw JSON value of [accountOrWalletInfo].
     *
     * Unlike [accountOrWalletInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("accountOrWalletInfo")
    @ExcludeMissing
    fun _accountOrWalletInfo(): JsonField<AccountOrWalletInfo> = accountOrWalletInfo

    /**
     * Returns the raw JSON value of [instructionsNotes].
     *
     * Unlike [instructionsNotes], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("instructionsNotes")
    @ExcludeMissing
    fun _instructionsNotes(): JsonField<String> = instructionsNotes

    /**
     * Returns the raw JSON value of [isPlatformAccount].
     *
     * Unlike [isPlatformAccount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("isPlatformAccount")
    @ExcludeMissing
    fun _isPlatformAccount(): JsonField<Boolean> = isPlatformAccount

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
         * Returns a mutable builder for constructing an instance of [PaymentInstructions].
         *
         * The following fields are required:
         * ```kotlin
         * .accountOrWalletInfo()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentInstructions]. */
    class Builder internal constructor() {

        private var accountOrWalletInfo: JsonField<AccountOrWalletInfo>? = null
        private var instructionsNotes: JsonField<String> = JsonMissing.of()
        private var isPlatformAccount: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentInstructions: PaymentInstructions) = apply {
            accountOrWalletInfo = paymentInstructions.accountOrWalletInfo
            instructionsNotes = paymentInstructions.instructionsNotes
            isPlatformAccount = paymentInstructions.isPlatformAccount
            additionalProperties = paymentInstructions.additionalProperties.toMutableMap()
        }

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankAccountType, accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun accountOrWalletInfo(accountOrWalletInfo: AccountOrWalletInfo) =
            accountOrWalletInfo(JsonField.of(accountOrWalletInfo))

        /**
         * Sets [Builder.accountOrWalletInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountOrWalletInfo] with a well-typed
         * [AccountOrWalletInfo] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun accountOrWalletInfo(accountOrWalletInfo: JsonField<AccountOrWalletInfo>) = apply {
            this.accountOrWalletInfo = accountOrWalletInfo
        }

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofArsAccount(arsAccount)`.
         */
        fun accountOrWalletInfo(arsAccount: AccountOrWalletInfo.ArsAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofArsAccount(arsAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.ArsAccount.builder()
         *     .accountNumber(accountNumber)
         *     .build()
         * ```
         */
        fun arsAccountAccountOrWalletInfo(accountNumber: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.ArsAccount.builder().accountNumber(accountNumber).build()
            )

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofSlvAccount(slvAccount)`.
         */
        fun accountOrWalletInfo(slvAccount: AccountOrWalletInfo.SlvAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofSlvAccount(slvAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofSwiftAccount(swiftAccount)`.
         */
        fun accountOrWalletInfo(swiftAccount: AccountOrWalletInfo.SwiftAccount) =
            accountOrWalletInfo(AccountOrWalletInfo.ofSwiftAccount(swiftAccount))

        /**
         * Alias for calling [accountOrWalletInfo] with
         * `AccountOrWalletInfo.ofEmbeddedWallet(embeddedWallet)`.
         */
        fun accountOrWalletInfo(embeddedWallet: AccountOrWalletInfo.EmbeddedWallet) =
            accountOrWalletInfo(AccountOrWalletInfo.ofEmbeddedWallet(embeddedWallet))

        /**
         * Alias for calling [accountOrWalletInfo] with the following:
         * ```kotlin
         * AccountOrWalletInfo.EmbeddedWallet.builder()
         *     .payloadToSign(payloadToSign)
         *     .build()
         * ```
         */
        fun embeddedWalletAccountOrWalletInfo(payloadToSign: String) =
            accountOrWalletInfo(
                AccountOrWalletInfo.EmbeddedWallet.builder().payloadToSign(payloadToSign).build()
            )

        /** Additional human-readable instructions for making the payment */
        fun instructionsNotes(instructionsNotes: String) =
            instructionsNotes(JsonField.of(instructionsNotes))

        /**
         * Sets [Builder.instructionsNotes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.instructionsNotes] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun instructionsNotes(instructionsNotes: JsonField<String>) = apply {
            this.instructionsNotes = instructionsNotes
        }

        /** Indicates whether the account is a platform account or a customer account. */
        fun isPlatformAccount(isPlatformAccount: Boolean) =
            isPlatformAccount(JsonField.of(isPlatformAccount))

        /**
         * Sets [Builder.isPlatformAccount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPlatformAccount] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun isPlatformAccount(isPlatformAccount: JsonField<Boolean>) = apply {
            this.isPlatformAccount = isPlatformAccount
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
         * Returns an immutable instance of [PaymentInstructions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountOrWalletInfo()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentInstructions =
            PaymentInstructions(
                checkRequired("accountOrWalletInfo", accountOrWalletInfo),
                instructionsNotes,
                isPlatformAccount,
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
    fun validate(): PaymentInstructions = apply {
        if (validated) {
            return@apply
        }

        accountOrWalletInfo().validate()
        instructionsNotes()
        isPlatformAccount()
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
        (accountOrWalletInfo.asKnown()?.validity() ?: 0) +
            (if (instructionsNotes.asKnown() == null) 0 else 1) +
            (if (isPlatformAccount.asKnown() == null) 0 else 1)

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: bankAccountType, accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    @JsonDeserialize(using = AccountOrWalletInfo.Deserializer::class)
    @JsonSerialize(using = AccountOrWalletInfo.Serializer::class)
    class AccountOrWalletInfo
    private constructor(
        private val arsAccount: ArsAccount? = null,
        private val slvAccount: SlvAccount? = null,
        private val swiftAccount: SwiftAccount? = null,
        private val embeddedWallet: EmbeddedWallet? = null,
        private val _json: JsonValue? = null,
    ) {

        fun arsAccount(): ArsAccount? = arsAccount

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankAccountType, accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun slvAccount(): SlvAccount? = slvAccount

        fun swiftAccount(): SwiftAccount? = swiftAccount

        fun embeddedWallet(): EmbeddedWallet? = embeddedWallet

        fun isArsAccount(): Boolean = arsAccount != null

        fun isSlvAccount(): Boolean = slvAccount != null

        fun isSwiftAccount(): Boolean = swiftAccount != null

        fun isEmbeddedWallet(): Boolean = embeddedWallet != null

        fun asArsAccount(): ArsAccount = arsAccount.getOrThrow("arsAccount")

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankAccountType, accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun asSlvAccount(): SlvAccount = slvAccount.getOrThrow("slvAccount")

        fun asSwiftAccount(): SwiftAccount = swiftAccount.getOrThrow("swiftAccount")

        fun asEmbeddedWallet(): EmbeddedWallet = embeddedWallet.getOrThrow("embeddedWallet")

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
         * val result: String? = accountOrWalletInfo.accept(object : AccountOrWalletInfo.Visitor<String?> {
         *     override fun visitArsAccount(arsAccount: ArsAccount): String? = arsAccount.toString()
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
                arsAccount != null -> visitor.visitArsAccount(arsAccount)
                slvAccount != null -> visitor.visitSlvAccount(slvAccount)
                swiftAccount != null -> visitor.visitSwiftAccount(swiftAccount)
                embeddedWallet != null -> visitor.visitEmbeddedWallet(embeddedWallet)
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
        fun validate(): AccountOrWalletInfo = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitArsAccount(arsAccount: ArsAccount) {
                        arsAccount.validate()
                    }

                    override fun visitSlvAccount(slvAccount: SlvAccount) {
                        slvAccount.validate()
                    }

                    override fun visitSwiftAccount(swiftAccount: SwiftAccount) {
                        swiftAccount.validate()
                    }

                    override fun visitEmbeddedWallet(embeddedWallet: EmbeddedWallet) {
                        embeddedWallet.validate()
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
                    override fun visitArsAccount(arsAccount: ArsAccount) = arsAccount.validity()

                    override fun visitSlvAccount(slvAccount: SlvAccount) = slvAccount.validity()

                    override fun visitSwiftAccount(swiftAccount: SwiftAccount) =
                        swiftAccount.validity()

                    override fun visitEmbeddedWallet(embeddedWallet: EmbeddedWallet) =
                        embeddedWallet.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountOrWalletInfo &&
                arsAccount == other.arsAccount &&
                slvAccount == other.slvAccount &&
                swiftAccount == other.swiftAccount &&
                embeddedWallet == other.embeddedWallet
        }

        override fun hashCode(): Int =
            Objects.hash(arsAccount, slvAccount, swiftAccount, embeddedWallet)

        override fun toString(): String =
            when {
                arsAccount != null -> "AccountOrWalletInfo{arsAccount=$arsAccount}"
                slvAccount != null -> "AccountOrWalletInfo{slvAccount=$slvAccount}"
                swiftAccount != null -> "AccountOrWalletInfo{swiftAccount=$swiftAccount}"
                embeddedWallet != null -> "AccountOrWalletInfo{embeddedWallet=$embeddedWallet}"
                _json != null -> "AccountOrWalletInfo{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
            }

        companion object {

            fun ofArsAccount(arsAccount: ArsAccount) = AccountOrWalletInfo(arsAccount = arsAccount)

            /**
             * Required fields depend on the selected paymentRails:
             * - BANK_TRANSFER: bankAccountType, accountNumber
             * - MOBILE_MONEY: phoneNumber
             */
            fun ofSlvAccount(slvAccount: SlvAccount) = AccountOrWalletInfo(slvAccount = slvAccount)

            fun ofSwiftAccount(swiftAccount: SwiftAccount) =
                AccountOrWalletInfo(swiftAccount = swiftAccount)

            fun ofEmbeddedWallet(embeddedWallet: EmbeddedWallet) =
                AccountOrWalletInfo(embeddedWallet = embeddedWallet)
        }

        /**
         * An interface that defines how to map each variant of [AccountOrWalletInfo] to a value of
         * type [T].
         */
        interface Visitor<out T> {

            fun visitArsAccount(arsAccount: ArsAccount): T

            /**
             * Required fields depend on the selected paymentRails:
             * - BANK_TRANSFER: bankAccountType, accountNumber
             * - MOBILE_MONEY: phoneNumber
             */
            fun visitSlvAccount(slvAccount: SlvAccount): T

            fun visitSwiftAccount(swiftAccount: SwiftAccount): T

            fun visitEmbeddedWallet(embeddedWallet: EmbeddedWallet): T

            /**
             * Maps an unknown variant of [AccountOrWalletInfo] to a value of type [T].
             *
             * An instance of [AccountOrWalletInfo] can contain an unknown variant if it was
             * deserialized from data that doesn't match any known variant. For example, if the SDK
             * is on an older version than the API, then the API may respond with new variants that
             * the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown AccountOrWalletInfo: $json")
            }
        }

        internal class Deserializer :
            BaseDeserializer<AccountOrWalletInfo>(AccountOrWalletInfo::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AccountOrWalletInfo {
                val json = JsonValue.fromJsonNode(node)
                val accountType = json.asObject()?.get("accountType")?.asString()

                when (accountType) {
                    "ARS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ArsAccount>())?.let {
                            AccountOrWalletInfo(arsAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "SLV_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SlvAccount>())?.let {
                            AccountOrWalletInfo(slvAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "SWIFT_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SwiftAccount>())?.let {
                            AccountOrWalletInfo(swiftAccount = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                    "EMBEDDED_WALLET" -> {
                        return tryDeserialize(node, jacksonTypeRef<EmbeddedWallet>())?.let {
                            AccountOrWalletInfo(embeddedWallet = it, _json = json)
                        } ?: AccountOrWalletInfo(_json = json)
                    }
                }

                return AccountOrWalletInfo(_json = json)
            }
        }

        internal class Serializer :
            BaseSerializer<AccountOrWalletInfo>(AccountOrWalletInfo::class) {

            override fun serialize(
                value: AccountOrWalletInfo,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.arsAccount != null -> generator.writeObject(value.arsAccount)
                    value.slvAccount != null -> generator.writeObject(value.slvAccount)
                    value.swiftAccount != null -> generator.writeObject(value.swiftAccount)
                    value.embeddedWallet != null -> generator.writeObject(value.embeddedWallet)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AccountOrWalletInfo")
                }
            }
        }

        class ArsAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountNumber: JsonField<String>,
            private val accountType: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
            ) : this(accountNumber, accountType, mutableMapOf())

            /**
             * The static CVU (Clave Virtual Uniforme) bank account number to pay to.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun accountNumber(): String = accountNumber.getRequired("accountNumber")

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("ARS_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

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
                 * Returns a mutable builder for constructing an instance of [ArsAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ArsAccount]. */
            class Builder internal constructor() {

                private var accountNumber: JsonField<String>? = null
                private var accountType: JsonValue = JsonValue.from("ARS_ACCOUNT")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(arsAccount: ArsAccount) = apply {
                    accountNumber = arsAccount.accountNumber
                    accountType = arsAccount.accountType
                    additionalProperties = arsAccount.additionalProperties.toMutableMap()
                }

                /** The static CVU (Clave Virtual Uniforme) bank account number to pay to. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("ARS_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

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
                 * Returns an immutable instance of [ArsAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .accountNumber()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ArsAccount =
                    ArsAccount(
                        checkRequired("accountNumber", accountNumber),
                        accountType,
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
            fun validate(): ArsAccount = apply {
                if (validated) {
                    return@apply
                }

                accountNumber()
                _accountType().let {
                    if (it != JsonValue.from("ARS_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
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
                (if (accountNumber.asKnown() == null) 0 else 1) +
                    accountType.let { if (it == JsonValue.from("ARS_ACCOUNT")) 1 else 0 }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ArsAccount &&
                    accountNumber == other.accountNumber &&
                    accountType == other.accountType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountNumber, accountType, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ArsAccount{accountNumber=$accountNumber, accountType=$accountType, additionalProperties=$additionalProperties}"
        }

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankAccountType, accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        class SlvAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val accountNumber: JsonField<String>,
            private val bankAccountType: JsonField<BankAccountType>,
            private val bankName: JsonField<String>,
            private val phoneNumber: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("bankAccountType")
                @ExcludeMissing
                bankAccountType: JsonField<BankAccountType> = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                phoneNumber: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountType,
                paymentRails,
                reference,
                accountNumber,
                bankAccountType,
                bankName,
                phoneNumber,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("SLV_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * The account number of the bank (BANK_TRANSFER only)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountNumber(): String? = accountNumber.getNullable("accountNumber")

            /**
             * The bank account type (BANK_TRANSFER only)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bankAccountType(): BankAccountType? = bankAccountType.getNullable("bankAccountType")

            /**
             * The name of the bank (BANK_TRANSFER only)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun bankName(): String? = bankName.getNullable("bankName")

            /**
             * The phone number in international format (MOBILE_MONEY only — e.g. Tigo Money)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [bankAccountType].
             *
             * Unlike [bankAccountType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("bankAccountType")
            @ExcludeMissing
            fun _bankAccountType(): JsonField<BankAccountType> = bankAccountType

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [phoneNumber].
             *
             * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            fun _phoneNumber(): JsonField<String> = phoneNumber

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
                 * Returns a mutable builder for constructing an instance of [SlvAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .reference()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SlvAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SLV_ACCOUNT")
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var bankAccountType: JsonField<BankAccountType> = JsonMissing.of()
                private var bankName: JsonField<String> = JsonMissing.of()
                private var phoneNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(slvAccount: SlvAccount) = apply {
                    accountType = slvAccount.accountType
                    paymentRails = slvAccount.paymentRails.map { it.toMutableList() }
                    reference = slvAccount.reference
                    accountNumber = slvAccount.accountNumber
                    bankAccountType = slvAccount.bankAccountType
                    bankName = slvAccount.bankName
                    phoneNumber = slvAccount.phoneNumber
                    additionalProperties = slvAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("SLV_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                fun paymentRails(paymentRails: List<PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<PaymentRail>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<PaymentRail>>) = apply {
                    this.paymentRails = paymentRails.map { it.toMutableList() }
                }

                /**
                 * Adds a single [PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /**
                 * Unique reference code that must be included with the payment to properly credit
                 * it
                 */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                /** The account number of the bank (BANK_TRANSFER only) */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The bank account type (BANK_TRANSFER only) */
                fun bankAccountType(bankAccountType: BankAccountType) =
                    bankAccountType(JsonField.of(bankAccountType))

                /**
                 * Sets [Builder.bankAccountType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankAccountType] with a well-typed
                 * [BankAccountType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun bankAccountType(bankAccountType: JsonField<BankAccountType>) = apply {
                    this.bankAccountType = bankAccountType
                }

                /** The name of the bank (BANK_TRANSFER only) */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                /**
                 * The phone number in international format (MOBILE_MONEY only — e.g. Tigo Money)
                 */
                fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                /**
                 * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.phoneNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                    this.phoneNumber = phoneNumber
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
                 * Returns an immutable instance of [SlvAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .paymentRails()
                 * .reference()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SlvAccount =
                    SlvAccount(
                        accountType,
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        accountNumber,
                        bankAccountType,
                        bankName,
                        phoneNumber,
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
            fun validate(): SlvAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("SLV_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                paymentRails().forEach { it.validate() }
                reference()
                accountNumber()
                bankAccountType()?.validate()
                bankName()
                phoneNumber()
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
                accountType.let { if (it == JsonValue.from("SLV_ACCOUNT")) 1 else 0 } +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (accountNumber.asKnown() == null) 0 else 1) +
                    (bankAccountType.asKnown()?.validity() ?: 0) +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (if (phoneNumber.asKnown() == null) 0 else 1)

            class PaymentRail
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

                    val BANK_TRANSFER = of("BANK_TRANSFER")

                    val MOBILE_MONEY = of("MOBILE_MONEY")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    BANK_TRANSFER,
                    MOBILE_MONEY,
                }

                /**
                 * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    BANK_TRANSFER,
                    MOBILE_MONEY,
                    /**
                     * An enum member indicating that [PaymentRail] was instantiated with an unknown
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
                        BANK_TRANSFER -> Value.BANK_TRANSFER
                        MOBILE_MONEY -> Value.MOBILE_MONEY
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
                        BANK_TRANSFER -> Known.BANK_TRANSFER
                        MOBILE_MONEY -> Known.MOBILE_MONEY
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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
                fun validate(): PaymentRail = apply {
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

                    return other is PaymentRail && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The bank account type (BANK_TRANSFER only) */
            class BankAccountType
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

                    val CHECKING = of("CHECKING")

                    val SAVINGS = of("SAVINGS")

                    fun of(value: String) = BankAccountType(JsonField.of(value))
                }

                /** An enum containing [BankAccountType]'s known values. */
                enum class Known {
                    CHECKING,
                    SAVINGS,
                }

                /**
                 * An enum containing [BankAccountType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BankAccountType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CHECKING,
                    SAVINGS,
                    /**
                     * An enum member indicating that [BankAccountType] was instantiated with an
                     * unknown value.
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
                        CHECKING -> Value.CHECKING
                        SAVINGS -> Value.SAVINGS
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
                        CHECKING -> Known.CHECKING
                        SAVINGS -> Known.SAVINGS
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown BankAccountType: $value"
                            )
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
                fun validate(): BankAccountType = apply {
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

                    return other is BankAccountType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SlvAccount &&
                    accountType == other.accountType &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    accountNumber == other.accountNumber &&
                    bankAccountType == other.bankAccountType &&
                    bankName == other.bankName &&
                    phoneNumber == other.phoneNumber &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    paymentRails,
                    reference,
                    accountNumber,
                    bankAccountType,
                    bankName,
                    phoneNumber,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SlvAccount{accountType=$accountType, paymentRails=$paymentRails, reference=$reference, accountNumber=$accountNumber, bankAccountType=$bankAccountType, bankName=$bankName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
        }

        class SwiftAccount
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val bankName: JsonField<String>,
            private val country: JsonField<String>,
            private val paymentRails: JsonField<List<PaymentRail>>,
            private val reference: JsonField<String>,
            private val swiftCode: JsonField<String>,
            private val accountNumber: JsonField<String>,
            private val iban: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("bankName")
                @ExcludeMissing
                bankName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("country")
                @ExcludeMissing
                country: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paymentRails")
                @ExcludeMissing
                paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
                @JsonProperty("reference")
                @ExcludeMissing
                reference: JsonField<String> = JsonMissing.of(),
                @JsonProperty("swiftCode")
                @ExcludeMissing
                swiftCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("accountNumber")
                @ExcludeMissing
                accountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
            ) : this(
                accountType,
                bankName,
                country,
                paymentRails,
                reference,
                swiftCode,
                accountNumber,
                iban,
                mutableMapOf(),
            )

            /**
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("SWIFT_ACCOUNT")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * The name of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun bankName(): String = bankName.getRequired("bankName")

            /**
             * The ISO 3166-1 alpha-2 country code of the bank account
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun country(): String = country.getRequired("country")

            /**
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

            /**
             * Unique reference code that must be included with the payment to properly credit it
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun reference(): String = reference.getRequired("reference")

            /**
             * The SWIFT/BIC code of the bank
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun swiftCode(): String = swiftCode.getRequired("swiftCode")

            /**
             * The bank account number. Required for most corridors. Use iban instead for IBAN-only
             * corridors (e.g. BR, GB).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun accountNumber(): String? = accountNumber.getNullable("accountNumber")

            /**
             * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
             * accountNumber for all other corridors.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun iban(): String? = iban.getNullable("iban")

            /**
             * Returns the raw JSON value of [bankName].
             *
             * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

            /**
             * Returns the raw JSON value of [country].
             *
             * Unlike [country], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

            /**
             * Returns the raw JSON value of [paymentRails].
             *
             * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("paymentRails")
            @ExcludeMissing
            fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

            /**
             * Returns the raw JSON value of [reference].
             *
             * Unlike [reference], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("reference")
            @ExcludeMissing
            fun _reference(): JsonField<String> = reference

            /**
             * Returns the raw JSON value of [swiftCode].
             *
             * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("swiftCode")
            @ExcludeMissing
            fun _swiftCode(): JsonField<String> = swiftCode

            /**
             * Returns the raw JSON value of [accountNumber].
             *
             * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("accountNumber")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /**
             * Returns the raw JSON value of [iban].
             *
             * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

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
                 * Returns a mutable builder for constructing an instance of [SwiftAccount].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .bankName()
                 * .country()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SwiftAccount]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("SWIFT_ACCOUNT")
                private var bankName: JsonField<String>? = null
                private var country: JsonField<String>? = null
                private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
                private var reference: JsonField<String>? = null
                private var swiftCode: JsonField<String>? = null
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var iban: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(swiftAccount: SwiftAccount) = apply {
                    accountType = swiftAccount.accountType
                    bankName = swiftAccount.bankName
                    country = swiftAccount.country
                    paymentRails = swiftAccount.paymentRails.map { it.toMutableList() }
                    reference = swiftAccount.reference
                    swiftCode = swiftAccount.swiftCode
                    accountNumber = swiftAccount.accountNumber
                    iban = swiftAccount.iban
                    additionalProperties = swiftAccount.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("SWIFT_ACCOUNT")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /** The name of the bank */
                fun bankName(bankName: String) = bankName(JsonField.of(bankName))

                /**
                 * Sets [Builder.bankName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.bankName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

                /** The ISO 3166-1 alpha-2 country code of the bank account */
                fun country(country: String) = country(JsonField.of(country))

                /**
                 * Sets [Builder.country] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.country] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun country(country: JsonField<String>) = apply { this.country = country }

                fun paymentRails(paymentRails: List<PaymentRail>) =
                    paymentRails(JsonField.of(paymentRails))

                /**
                 * Sets [Builder.paymentRails] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentRails] with a well-typed
                 * `List<PaymentRail>` value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun paymentRails(paymentRails: JsonField<List<PaymentRail>>) = apply {
                    this.paymentRails = paymentRails.map { it.toMutableList() }
                }

                /**
                 * Adds a single [PaymentRail] to [paymentRails].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addPaymentRail(paymentRail: PaymentRail) = apply {
                    paymentRails =
                        (paymentRails ?: JsonField.of(mutableListOf())).also {
                            checkKnown("paymentRails", it).add(paymentRail)
                        }
                }

                /**
                 * Unique reference code that must be included with the payment to properly credit
                 * it
                 */
                fun reference(reference: String) = reference(JsonField.of(reference))

                /**
                 * Sets [Builder.reference] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.reference] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun reference(reference: JsonField<String>) = apply { this.reference = reference }

                /** The SWIFT/BIC code of the bank */
                fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

                /**
                 * Sets [Builder.swiftCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.swiftCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun swiftCode(swiftCode: JsonField<String>) = apply { this.swiftCode = swiftCode }

                /**
                 * The bank account number. Required for most corridors. Use iban instead for
                 * IBAN-only corridors (e.g. BR, GB).
                 */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /**
                 * Sets [Builder.accountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.accountNumber] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /**
                 * The IBAN of the bank account. Required for IBAN-only corridors (e.g. BR, GB). Use
                 * accountNumber for all other corridors.
                 */
                fun iban(iban: String) = iban(JsonField.of(iban))

                /**
                 * Sets [Builder.iban] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.iban] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun iban(iban: JsonField<String>) = apply { this.iban = iban }

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
                 * Returns an immutable instance of [SwiftAccount].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .bankName()
                 * .country()
                 * .paymentRails()
                 * .reference()
                 * .swiftCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SwiftAccount =
                    SwiftAccount(
                        accountType,
                        checkRequired("bankName", bankName),
                        checkRequired("country", country),
                        checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                        checkRequired("reference", reference),
                        checkRequired("swiftCode", swiftCode),
                        accountNumber,
                        iban,
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
            fun validate(): SwiftAccount = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("SWIFT_ACCOUNT")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                bankName()
                country()
                paymentRails().forEach { it.validate() }
                reference()
                swiftCode()
                accountNumber()
                iban()
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
                accountType.let { if (it == JsonValue.from("SWIFT_ACCOUNT")) 1 else 0 } +
                    (if (bankName.asKnown() == null) 0 else 1) +
                    (if (country.asKnown() == null) 0 else 1) +
                    (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (reference.asKnown() == null) 0 else 1) +
                    (if (swiftCode.asKnown() == null) 0 else 1) +
                    (if (accountNumber.asKnown() == null) 0 else 1) +
                    (if (iban.asKnown() == null) 0 else 1)

            class PaymentRail
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

                    val SWIFT = of("SWIFT")

                    fun of(value: String) = PaymentRail(JsonField.of(value))
                }

                /** An enum containing [PaymentRail]'s known values. */
                enum class Known {
                    SWIFT
                }

                /**
                 * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SWIFT,
                    /**
                     * An enum member indicating that [PaymentRail] was instantiated with an unknown
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
                        SWIFT -> Value.SWIFT
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
                        SWIFT -> Known.SWIFT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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
                fun validate(): PaymentRail = apply {
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

                    return other is PaymentRail && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SwiftAccount &&
                    accountType == other.accountType &&
                    bankName == other.bankName &&
                    country == other.country &&
                    paymentRails == other.paymentRails &&
                    reference == other.reference &&
                    swiftCode == other.swiftCode &&
                    accountNumber == other.accountNumber &&
                    iban == other.iban &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    accountType,
                    bankName,
                    country,
                    paymentRails,
                    reference,
                    swiftCode,
                    accountNumber,
                    iban,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SwiftAccount{accountType=$accountType, bankName=$bankName, country=$country, paymentRails=$paymentRails, reference=$reference, swiftCode=$swiftCode, accountNumber=$accountNumber, iban=$iban, additionalProperties=$additionalProperties}"
        }

        class EmbeddedWallet
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val accountType: JsonValue,
            private val payloadToSign: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("accountType")
                @ExcludeMissing
                accountType: JsonValue = JsonMissing.of(),
                @JsonProperty("payloadToSign")
                @ExcludeMissing
                payloadToSign: JsonField<String> = JsonMissing.of(),
            ) : this(accountType, payloadToSign, mutableMapOf())

            /**
             * Discriminator value identifying this as Embedded Wallet payment instructions.
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("EMBEDDED_WALLET")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

            /**
             * JSON-encoded transaction signing payload that must be stamped, as-is (byte-for-byte,
             * without re-serialization), with the session private key of a verified authentication
             * credential on the source Embedded Wallet. The resulting Turnkey API-key stamp is
             * passed as the `Grid-Wallet-Signature` header on `POST /quotes/{quoteId}/execute` to
             * authorize the outbound transfer from the wallet.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun payloadToSign(): String = payloadToSign.getRequired("payloadToSign")

            /**
             * Returns the raw JSON value of [payloadToSign].
             *
             * Unlike [payloadToSign], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("payloadToSign")
            @ExcludeMissing
            fun _payloadToSign(): JsonField<String> = payloadToSign

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
                 * Returns a mutable builder for constructing an instance of [EmbeddedWallet].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .payloadToSign()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [EmbeddedWallet]. */
            class Builder internal constructor() {

                private var accountType: JsonValue = JsonValue.from("EMBEDDED_WALLET")
                private var payloadToSign: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(embeddedWallet: EmbeddedWallet) = apply {
                    accountType = embeddedWallet.accountType
                    payloadToSign = embeddedWallet.payloadToSign
                    additionalProperties = embeddedWallet.additionalProperties.toMutableMap()
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("EMBEDDED_WALLET")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

                /**
                 * JSON-encoded transaction signing payload that must be stamped, as-is
                 * (byte-for-byte, without re-serialization), with the session private key of a
                 * verified authentication credential on the source Embedded Wallet. The resulting
                 * Turnkey API-key stamp is passed as the `Grid-Wallet-Signature` header on `POST
                 * /quotes/{quoteId}/execute` to authorize the outbound transfer from the wallet.
                 */
                fun payloadToSign(payloadToSign: String) =
                    payloadToSign(JsonField.of(payloadToSign))

                /**
                 * Sets [Builder.payloadToSign] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.payloadToSign] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun payloadToSign(payloadToSign: JsonField<String>) = apply {
                    this.payloadToSign = payloadToSign
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
                 * Returns an immutable instance of [EmbeddedWallet].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .payloadToSign()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): EmbeddedWallet =
                    EmbeddedWallet(
                        accountType,
                        checkRequired("payloadToSign", payloadToSign),
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
            fun validate(): EmbeddedWallet = apply {
                if (validated) {
                    return@apply
                }

                _accountType().let {
                    if (it != JsonValue.from("EMBEDDED_WALLET")) {
                        throw LightsparkGridInvalidDataException(
                            "'accountType' is invalid, received $it"
                        )
                    }
                }
                payloadToSign()
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
                accountType.let { if (it == JsonValue.from("EMBEDDED_WALLET")) 1 else 0 } +
                    (if (payloadToSign.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EmbeddedWallet &&
                    accountType == other.accountType &&
                    payloadToSign == other.payloadToSign &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(accountType, payloadToSign, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "EmbeddedWallet{accountType=$accountType, payloadToSign=$payloadToSign, additionalProperties=$additionalProperties}"
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentInstructions &&
            accountOrWalletInfo == other.accountOrWalletInfo &&
            instructionsNotes == other.instructionsNotes &&
            isPlatformAccount == other.isPlatformAccount &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountOrWalletInfo,
            instructionsNotes,
            isPlatformAccount,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentInstructions{accountOrWalletInfo=$accountOrWalletInfo, instructionsNotes=$instructionsNotes, isPlatformAccount=$isPlatformAccount, additionalProperties=$additionalProperties}"
}
