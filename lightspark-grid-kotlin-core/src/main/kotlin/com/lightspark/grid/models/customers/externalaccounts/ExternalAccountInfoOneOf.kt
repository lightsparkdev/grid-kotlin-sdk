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
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.LocalDate
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ExternalAccountInfoOneOf.Deserializer::class)
@JsonSerialize(using = ExternalAccountInfoOneOf.Serializer::class)
class ExternalAccountInfoOneOf
private constructor(
    private val usAccount: UsAccount? = null,
    private val clabe: Clabe? = null,
    private val pix: Pix? = null,
    private val iban: Iban? = null,
    private val upi: Upi? = null,
    private val ngnAccount: NgnAccount? = null,
    private val cadAccount: CadAccount? = null,
    private val gbpAccount: GbpAccount? = null,
    private val phpAccount: PhpAccount? = null,
    private val sgdAccount: SgdAccount? = null,
    private val sparkWallet: SparkWalletInfo? = null,
    private val lightning: LightningWalletInfo? = null,
    private val solanaWallet: SolanaWalletInfo? = null,
    private val tronWallet: TronWalletInfo? = null,
    private val polygonWallet: PolygonWalletInfo? = null,
    private val baseWallet: BaseWalletInfo? = null,
    private val _json: JsonValue? = null,
) {

    fun usAccount(): UsAccount? = usAccount

    fun clabe(): Clabe? = clabe

    fun pix(): Pix? = pix

    fun iban(): Iban? = iban

    fun upi(): Upi? = upi

    fun ngnAccount(): NgnAccount? = ngnAccount

    fun cadAccount(): CadAccount? = cadAccount

    fun gbpAccount(): GbpAccount? = gbpAccount

    fun phpAccount(): PhpAccount? = phpAccount

    fun sgdAccount(): SgdAccount? = sgdAccount

    fun sparkWallet(): SparkWalletInfo? = sparkWallet

    fun lightning(): LightningWalletInfo? = lightning

    fun solanaWallet(): SolanaWalletInfo? = solanaWallet

    fun tronWallet(): TronWalletInfo? = tronWallet

    fun polygonWallet(): PolygonWalletInfo? = polygonWallet

    fun baseWallet(): BaseWalletInfo? = baseWallet

    fun isUsAccount(): Boolean = usAccount != null

    fun isClabe(): Boolean = clabe != null

    fun isPix(): Boolean = pix != null

    fun isIban(): Boolean = iban != null

    fun isUpi(): Boolean = upi != null

    fun isNgnAccount(): Boolean = ngnAccount != null

    fun isCadAccount(): Boolean = cadAccount != null

    fun isGbpAccount(): Boolean = gbpAccount != null

    fun isPhpAccount(): Boolean = phpAccount != null

    fun isSgdAccount(): Boolean = sgdAccount != null

    fun isSparkWallet(): Boolean = sparkWallet != null

    fun isLightning(): Boolean = lightning != null

    fun isSolanaWallet(): Boolean = solanaWallet != null

    fun isTronWallet(): Boolean = tronWallet != null

    fun isPolygonWallet(): Boolean = polygonWallet != null

    fun isBaseWallet(): Boolean = baseWallet != null

    fun asUsAccount(): UsAccount = usAccount.getOrThrow("usAccount")

    fun asClabe(): Clabe = clabe.getOrThrow("clabe")

    fun asPix(): Pix = pix.getOrThrow("pix")

    fun asIban(): Iban = iban.getOrThrow("iban")

    fun asUpi(): Upi = upi.getOrThrow("upi")

    fun asNgnAccount(): NgnAccount = ngnAccount.getOrThrow("ngnAccount")

    fun asCadAccount(): CadAccount = cadAccount.getOrThrow("cadAccount")

    fun asGbpAccount(): GbpAccount = gbpAccount.getOrThrow("gbpAccount")

    fun asPhpAccount(): PhpAccount = phpAccount.getOrThrow("phpAccount")

    fun asSgdAccount(): SgdAccount = sgdAccount.getOrThrow("sgdAccount")

    fun asSparkWallet(): SparkWalletInfo = sparkWallet.getOrThrow("sparkWallet")

    fun asLightning(): LightningWalletInfo = lightning.getOrThrow("lightning")

    fun asSolanaWallet(): SolanaWalletInfo = solanaWallet.getOrThrow("solanaWallet")

    fun asTronWallet(): TronWalletInfo = tronWallet.getOrThrow("tronWallet")

    fun asPolygonWallet(): PolygonWalletInfo = polygonWallet.getOrThrow("polygonWallet")

    fun asBaseWallet(): BaseWalletInfo = baseWallet.getOrThrow("baseWallet")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            usAccount != null -> visitor.visitUsAccount(usAccount)
            clabe != null -> visitor.visitClabe(clabe)
            pix != null -> visitor.visitPix(pix)
            iban != null -> visitor.visitIban(iban)
            upi != null -> visitor.visitUpi(upi)
            ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
            cadAccount != null -> visitor.visitCadAccount(cadAccount)
            gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
            phpAccount != null -> visitor.visitPhpAccount(phpAccount)
            sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
            sparkWallet != null -> visitor.visitSparkWallet(sparkWallet)
            lightning != null -> visitor.visitLightning(lightning)
            solanaWallet != null -> visitor.visitSolanaWallet(solanaWallet)
            tronWallet != null -> visitor.visitTronWallet(tronWallet)
            polygonWallet != null -> visitor.visitPolygonWallet(polygonWallet)
            baseWallet != null -> visitor.visitBaseWallet(baseWallet)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ExternalAccountInfoOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitUsAccount(usAccount: UsAccount) {
                    usAccount.validate()
                }

                override fun visitClabe(clabe: Clabe) {
                    clabe.validate()
                }

                override fun visitPix(pix: Pix) {
                    pix.validate()
                }

                override fun visitIban(iban: Iban) {
                    iban.validate()
                }

                override fun visitUpi(upi: Upi) {
                    upi.validate()
                }

                override fun visitNgnAccount(ngnAccount: NgnAccount) {
                    ngnAccount.validate()
                }

                override fun visitCadAccount(cadAccount: CadAccount) {
                    cadAccount.validate()
                }

                override fun visitGbpAccount(gbpAccount: GbpAccount) {
                    gbpAccount.validate()
                }

                override fun visitPhpAccount(phpAccount: PhpAccount) {
                    phpAccount.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdAccount) {
                    sgdAccount.validate()
                }

                override fun visitSparkWallet(sparkWallet: SparkWalletInfo) {
                    sparkWallet.validate()
                }

                override fun visitLightning(lightning: LightningWalletInfo) {
                    lightning.validate()
                }

                override fun visitSolanaWallet(solanaWallet: SolanaWalletInfo) {
                    solanaWallet.validate()
                }

                override fun visitTronWallet(tronWallet: TronWalletInfo) {
                    tronWallet.validate()
                }

                override fun visitPolygonWallet(polygonWallet: PolygonWalletInfo) {
                    polygonWallet.validate()
                }

                override fun visitBaseWallet(baseWallet: BaseWalletInfo) {
                    baseWallet.validate()
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
                override fun visitUsAccount(usAccount: UsAccount) = usAccount.validity()

                override fun visitClabe(clabe: Clabe) = clabe.validity()

                override fun visitPix(pix: Pix) = pix.validity()

                override fun visitIban(iban: Iban) = iban.validity()

                override fun visitUpi(upi: Upi) = upi.validity()

                override fun visitNgnAccount(ngnAccount: NgnAccount) = ngnAccount.validity()

                override fun visitCadAccount(cadAccount: CadAccount) = cadAccount.validity()

                override fun visitGbpAccount(gbpAccount: GbpAccount) = gbpAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpAccount) = phpAccount.validity()

                override fun visitSgdAccount(sgdAccount: SgdAccount) = sgdAccount.validity()

                override fun visitSparkWallet(sparkWallet: SparkWalletInfo) = sparkWallet.validity()

                override fun visitLightning(lightning: LightningWalletInfo) = lightning.validity()

                override fun visitSolanaWallet(solanaWallet: SolanaWalletInfo) =
                    solanaWallet.validity()

                override fun visitTronWallet(tronWallet: TronWalletInfo) = tronWallet.validity()

                override fun visitPolygonWallet(polygonWallet: PolygonWalletInfo) =
                    polygonWallet.validity()

                override fun visitBaseWallet(baseWallet: BaseWalletInfo) = baseWallet.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountInfoOneOf &&
            usAccount == other.usAccount &&
            clabe == other.clabe &&
            pix == other.pix &&
            iban == other.iban &&
            upi == other.upi &&
            ngnAccount == other.ngnAccount &&
            cadAccount == other.cadAccount &&
            gbpAccount == other.gbpAccount &&
            phpAccount == other.phpAccount &&
            sgdAccount == other.sgdAccount &&
            sparkWallet == other.sparkWallet &&
            lightning == other.lightning &&
            solanaWallet == other.solanaWallet &&
            tronWallet == other.tronWallet &&
            polygonWallet == other.polygonWallet &&
            baseWallet == other.baseWallet
    }

    override fun hashCode(): Int =
        Objects.hash(
            usAccount,
            clabe,
            pix,
            iban,
            upi,
            ngnAccount,
            cadAccount,
            gbpAccount,
            phpAccount,
            sgdAccount,
            sparkWallet,
            lightning,
            solanaWallet,
            tronWallet,
            polygonWallet,
            baseWallet,
        )

    override fun toString(): String =
        when {
            usAccount != null -> "ExternalAccountInfoOneOf{usAccount=$usAccount}"
            clabe != null -> "ExternalAccountInfoOneOf{clabe=$clabe}"
            pix != null -> "ExternalAccountInfoOneOf{pix=$pix}"
            iban != null -> "ExternalAccountInfoOneOf{iban=$iban}"
            upi != null -> "ExternalAccountInfoOneOf{upi=$upi}"
            ngnAccount != null -> "ExternalAccountInfoOneOf{ngnAccount=$ngnAccount}"
            cadAccount != null -> "ExternalAccountInfoOneOf{cadAccount=$cadAccount}"
            gbpAccount != null -> "ExternalAccountInfoOneOf{gbpAccount=$gbpAccount}"
            phpAccount != null -> "ExternalAccountInfoOneOf{phpAccount=$phpAccount}"
            sgdAccount != null -> "ExternalAccountInfoOneOf{sgdAccount=$sgdAccount}"
            sparkWallet != null -> "ExternalAccountInfoOneOf{sparkWallet=$sparkWallet}"
            lightning != null -> "ExternalAccountInfoOneOf{lightning=$lightning}"
            solanaWallet != null -> "ExternalAccountInfoOneOf{solanaWallet=$solanaWallet}"
            tronWallet != null -> "ExternalAccountInfoOneOf{tronWallet=$tronWallet}"
            polygonWallet != null -> "ExternalAccountInfoOneOf{polygonWallet=$polygonWallet}"
            baseWallet != null -> "ExternalAccountInfoOneOf{baseWallet=$baseWallet}"
            _json != null -> "ExternalAccountInfoOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExternalAccountInfoOneOf")
        }

    companion object {

        fun ofUsAccount(usAccount: UsAccount) = ExternalAccountInfoOneOf(usAccount = usAccount)

        fun ofClabe(clabe: Clabe) = ExternalAccountInfoOneOf(clabe = clabe)

        fun ofPix(pix: Pix) = ExternalAccountInfoOneOf(pix = pix)

        fun ofIban(iban: Iban) = ExternalAccountInfoOneOf(iban = iban)

        fun ofUpi(upi: Upi) = ExternalAccountInfoOneOf(upi = upi)

        fun ofNgnAccount(ngnAccount: NgnAccount) = ExternalAccountInfoOneOf(ngnAccount = ngnAccount)

        fun ofCadAccount(cadAccount: CadAccount) = ExternalAccountInfoOneOf(cadAccount = cadAccount)

        fun ofGbpAccount(gbpAccount: GbpAccount) = ExternalAccountInfoOneOf(gbpAccount = gbpAccount)

        fun ofPhpAccount(phpAccount: PhpAccount) = ExternalAccountInfoOneOf(phpAccount = phpAccount)

        fun ofSgdAccount(sgdAccount: SgdAccount) = ExternalAccountInfoOneOf(sgdAccount = sgdAccount)

        fun ofSparkWallet(sparkWallet: SparkWalletInfo) =
            ExternalAccountInfoOneOf(sparkWallet = sparkWallet)

        fun ofLightning(lightning: LightningWalletInfo) =
            ExternalAccountInfoOneOf(lightning = lightning)

        fun ofSolanaWallet(solanaWallet: SolanaWalletInfo) =
            ExternalAccountInfoOneOf(solanaWallet = solanaWallet)

        fun ofTronWallet(tronWallet: TronWalletInfo) =
            ExternalAccountInfoOneOf(tronWallet = tronWallet)

        fun ofPolygonWallet(polygonWallet: PolygonWalletInfo) =
            ExternalAccountInfoOneOf(polygonWallet = polygonWallet)

        fun ofBaseWallet(baseWallet: BaseWalletInfo) =
            ExternalAccountInfoOneOf(baseWallet = baseWallet)
    }

    /**
     * An interface that defines how to map each variant of [ExternalAccountInfoOneOf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitUsAccount(usAccount: UsAccount): T

        fun visitClabe(clabe: Clabe): T

        fun visitPix(pix: Pix): T

        fun visitIban(iban: Iban): T

        fun visitUpi(upi: Upi): T

        fun visitNgnAccount(ngnAccount: NgnAccount): T

        fun visitCadAccount(cadAccount: CadAccount): T

        fun visitGbpAccount(gbpAccount: GbpAccount): T

        fun visitPhpAccount(phpAccount: PhpAccount): T

        fun visitSgdAccount(sgdAccount: SgdAccount): T

        fun visitSparkWallet(sparkWallet: SparkWalletInfo): T

        fun visitLightning(lightning: LightningWalletInfo): T

        fun visitSolanaWallet(solanaWallet: SolanaWalletInfo): T

        fun visitTronWallet(tronWallet: TronWalletInfo): T

        fun visitPolygonWallet(polygonWallet: PolygonWalletInfo): T

        fun visitBaseWallet(baseWallet: BaseWalletInfo): T

        /**
         * Maps an unknown variant of [ExternalAccountInfoOneOf] to a value of type [T].
         *
         * An instance of [ExternalAccountInfoOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException("Unknown ExternalAccountInfoOneOf: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ExternalAccountInfoOneOf>(ExternalAccountInfoOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ExternalAccountInfoOneOf {
            val json = JsonValue.fromJsonNode(node)
            val accountType = json.asObject()?.get("accountType")?.asString()

            when (accountType) {
                "US_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<UsAccount>())?.let {
                        ExternalAccountInfoOneOf(usAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "CLABE" -> {
                    return tryDeserialize(node, jacksonTypeRef<Clabe>())?.let {
                        ExternalAccountInfoOneOf(clabe = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PIX" -> {
                    return tryDeserialize(node, jacksonTypeRef<Pix>())?.let {
                        ExternalAccountInfoOneOf(pix = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "IBAN" -> {
                    return tryDeserialize(node, jacksonTypeRef<Iban>())?.let {
                        ExternalAccountInfoOneOf(iban = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "UPI" -> {
                    return tryDeserialize(node, jacksonTypeRef<Upi>())?.let {
                        ExternalAccountInfoOneOf(upi = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "NGN_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<NgnAccount>())?.let {
                        ExternalAccountInfoOneOf(ngnAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "CAD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<CadAccount>())?.let {
                        ExternalAccountInfoOneOf(cadAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "GBP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GbpAccount>())?.let {
                        ExternalAccountInfoOneOf(gbpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PHP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PhpAccount>())?.let {
                        ExternalAccountInfoOneOf(phpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "SGD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SgdAccount>())?.let {
                        ExternalAccountInfoOneOf(sgdAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "SPARK_WALLET" -> {
                    return tryDeserialize(node, jacksonTypeRef<SparkWalletInfo>())?.let {
                        ExternalAccountInfoOneOf(sparkWallet = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "LIGHTNING" -> {
                    return tryDeserialize(node, jacksonTypeRef<LightningWalletInfo>())?.let {
                        ExternalAccountInfoOneOf(lightning = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "SOLANA_WALLET" -> {
                    return tryDeserialize(node, jacksonTypeRef<SolanaWalletInfo>())?.let {
                        ExternalAccountInfoOneOf(solanaWallet = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "TRON_WALLET" -> {
                    return tryDeserialize(node, jacksonTypeRef<TronWalletInfo>())?.let {
                        ExternalAccountInfoOneOf(tronWallet = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "POLYGON_WALLET" -> {
                    return tryDeserialize(node, jacksonTypeRef<PolygonWalletInfo>())?.let {
                        ExternalAccountInfoOneOf(polygonWallet = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "BASE_WALLET" -> {
                    return tryDeserialize(node, jacksonTypeRef<BaseWalletInfo>())?.let {
                        ExternalAccountInfoOneOf(baseWallet = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
            }

            return ExternalAccountInfoOneOf(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<ExternalAccountInfoOneOf>(ExternalAccountInfoOneOf::class) {

        override fun serialize(
            value: ExternalAccountInfoOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.usAccount != null -> generator.writeObject(value.usAccount)
                value.clabe != null -> generator.writeObject(value.clabe)
                value.pix != null -> generator.writeObject(value.pix)
                value.iban != null -> generator.writeObject(value.iban)
                value.upi != null -> generator.writeObject(value.upi)
                value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                value.cadAccount != null -> generator.writeObject(value.cadAccount)
                value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                value.phpAccount != null -> generator.writeObject(value.phpAccount)
                value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                value.sparkWallet != null -> generator.writeObject(value.sparkWallet)
                value.lightning != null -> generator.writeObject(value.lightning)
                value.solanaWallet != null -> generator.writeObject(value.solanaWallet)
                value.tronWallet != null -> generator.writeObject(value.tronWallet)
                value.polygonWallet != null -> generator.writeObject(value.polygonWallet)
                value.baseWallet != null -> generator.writeObject(value.baseWallet)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountInfoOneOf")
            }
        }
    }

    class UsAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountCategory: JsonField<AccountCategory>,
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val routingNumber: JsonField<String>,
        private val bankName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountCategory")
            @ExcludeMissing
            accountCategory: JsonField<AccountCategory> = JsonMissing.of(),
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("routingNumber")
            @ExcludeMissing
            routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("bankName") @ExcludeMissing bankName: JsonField<String> = JsonMissing.of(),
        ) : this(
            accountCategory,
            accountNumber,
            accountType,
            beneficiary,
            routingNumber,
            bankName,
            mutableMapOf(),
        )

        /**
         * Type of account (checking or savings)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountCategory(): AccountCategory = accountCategory.getRequired("accountCategory")

        /**
         * US bank account number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("US_ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * ACH routing number (9 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun routingNumber(): String = routingNumber.getRequired("routingNumber")

        /**
         * Name of the bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankName(): String? = bankName.getNullable("bankName")

        /**
         * Returns the raw JSON value of [accountCategory].
         *
         * Unlike [accountCategory], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("accountCategory")
        @ExcludeMissing
        fun _accountCategory(): JsonField<AccountCategory> = accountCategory

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
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [routingNumber].
         *
         * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("routingNumber")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /**
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

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
             * Returns a mutable builder for constructing an instance of [UsAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountCategory()
             * .accountNumber()
             * .beneficiary()
             * .routingNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [UsAccount]. */
        class Builder internal constructor() {

            private var accountCategory: JsonField<AccountCategory>? = null
            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("US_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var routingNumber: JsonField<String>? = null
            private var bankName: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(usAccount: UsAccount) = apply {
                accountCategory = usAccount.accountCategory
                accountNumber = usAccount.accountNumber
                accountType = usAccount.accountType
                beneficiary = usAccount.beneficiary
                routingNumber = usAccount.routingNumber
                bankName = usAccount.bankName
                additionalProperties = usAccount.additionalProperties.toMutableMap()
            }

            /** Type of account (checking or savings) */
            fun accountCategory(accountCategory: AccountCategory) =
                accountCategory(JsonField.of(accountCategory))

            /**
             * Sets [Builder.accountCategory] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountCategory] with a well-typed [AccountCategory]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accountCategory(accountCategory: JsonField<AccountCategory>) = apply {
                this.accountCategory = accountCategory
            }

            /** US bank account number */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * JsonValue.from("US_ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** ACH routing number (9 digits) */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * Sets [Builder.routingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.routingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** Name of the bank */
            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

            /**
             * Sets [Builder.bankName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

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
             * Returns an immutable instance of [UsAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountCategory()
             * .accountNumber()
             * .beneficiary()
             * .routingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): UsAccount =
                UsAccount(
                    checkRequired("accountCategory", accountCategory),
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("routingNumber", routingNumber),
                    bankName,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): UsAccount = apply {
            if (validated) {
                return@apply
            }

            accountCategory().validate()
            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("US_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            routingNumber()
            bankName()
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
            (accountCategory.asKnown()?.validity() ?: 0) +
                (if (accountNumber.asKnown() == null) 0 else 1) +
                accountType.let { if (it == JsonValue.from("US_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (routingNumber.asKnown() == null) 0 else 1) +
                (if (bankName.asKnown() == null) 0 else 1)

        /** Type of account (checking or savings) */
        class AccountCategory
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val CHECKING = of("CHECKING")

                val SAVINGS = of("SAVINGS")

                fun of(value: String) = AccountCategory(JsonField.of(value))
            }

            /** An enum containing [AccountCategory]'s known values. */
            enum class Known {
                CHECKING,
                SAVINGS,
            }

            /**
             * An enum containing [AccountCategory]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AccountCategory] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVINGS,
                /**
                 * An enum member indicating that [AccountCategory] was instantiated with an unknown
                 * value.
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
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown AccountCategory: $value")
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

            fun validate(): AccountCategory = apply {
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

                return other is AccountCategory && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UsAccount &&
                accountCategory == other.accountCategory &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                routingNumber == other.routingNumber &&
                bankName == other.bankName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountCategory,
                accountNumber,
                accountType,
                beneficiary,
                routingNumber,
                bankName,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsAccount{accountCategory=$accountCategory, accountNumber=$accountNumber, accountType=$accountType, beneficiary=$beneficiary, routingNumber=$routingNumber, bankName=$bankName, additionalProperties=$additionalProperties}"
    }

    class Clabe
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val clabeNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("clabeNumber")
            @ExcludeMissing
            clabeNumber: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, clabeNumber, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("CLABE")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * 18-digit CLABE number (Mexican banking standard)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clabeNumber(): String = clabeNumber.getRequired("clabeNumber")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [clabeNumber].
         *
         * Unlike [clabeNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("clabeNumber")
        @ExcludeMissing
        fun _clabeNumber(): JsonField<String> = clabeNumber

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
             * Returns a mutable builder for constructing an instance of [Clabe].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .clabeNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Clabe]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("CLABE")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var clabeNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(clabe: Clabe) = apply {
                accountType = clabe.accountType
                beneficiary = clabe.beneficiary
                clabeNumber = clabe.clabeNumber
                additionalProperties = clabe.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("CLABE")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** 18-digit CLABE number (Mexican banking standard) */
            fun clabeNumber(clabeNumber: String) = clabeNumber(JsonField.of(clabeNumber))

            /**
             * Sets [Builder.clabeNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clabeNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clabeNumber(clabeNumber: JsonField<String>) = apply {
                this.clabeNumber = clabeNumber
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
             * Returns an immutable instance of [Clabe].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .clabeNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Clabe =
                Clabe(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("clabeNumber", clabeNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Clabe = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("CLABE")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            clabeNumber()
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
            accountType.let { if (it == JsonValue.from("CLABE")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (clabeNumber.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Clabe &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                clabeNumber == other.clabeNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountType, beneficiary, clabeNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Clabe{accountType=$accountType, beneficiary=$beneficiary, clabeNumber=$clabeNumber, additionalProperties=$additionalProperties}"
    }

    class Pix
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val pixKey: JsonField<String>,
        private val pixKeyType: JsonField<PixKeyType>,
        private val taxId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("pixKey") @ExcludeMissing pixKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pixKeyType")
            @ExcludeMissing
            pixKeyType: JsonField<PixKeyType> = JsonMissing.of(),
            @JsonProperty("taxId") @ExcludeMissing taxId: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, pixKey, pixKeyType, taxId, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("PIX")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * PIX key for Brazilian instant payments
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pixKey(): String = pixKey.getRequired("pixKey")

        /**
         * Type of PIX key being used
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun pixKeyType(): PixKeyType = pixKeyType.getRequired("pixKeyType")

        /**
         * Tax ID of the account holder
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun taxId(): String = taxId.getRequired("taxId")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [pixKey].
         *
         * Unlike [pixKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pixKey") @ExcludeMissing fun _pixKey(): JsonField<String> = pixKey

        /**
         * Returns the raw JSON value of [pixKeyType].
         *
         * Unlike [pixKeyType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pixKeyType")
        @ExcludeMissing
        fun _pixKeyType(): JsonField<PixKeyType> = pixKeyType

        /**
         * Returns the raw JSON value of [taxId].
         *
         * Unlike [taxId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("taxId") @ExcludeMissing fun _taxId(): JsonField<String> = taxId

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
             * Returns a mutable builder for constructing an instance of [Pix].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .pixKey()
             * .pixKeyType()
             * .taxId()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Pix]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("PIX")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var pixKey: JsonField<String>? = null
            private var pixKeyType: JsonField<PixKeyType>? = null
            private var taxId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(pix: Pix) = apply {
                accountType = pix.accountType
                beneficiary = pix.beneficiary
                pixKey = pix.pixKey
                pixKeyType = pix.pixKeyType
                taxId = pix.taxId
                additionalProperties = pix.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("PIX")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** PIX key for Brazilian instant payments */
            fun pixKey(pixKey: String) = pixKey(JsonField.of(pixKey))

            /**
             * Sets [Builder.pixKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pixKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pixKey(pixKey: JsonField<String>) = apply { this.pixKey = pixKey }

            /** Type of PIX key being used */
            fun pixKeyType(pixKeyType: PixKeyType) = pixKeyType(JsonField.of(pixKeyType))

            /**
             * Sets [Builder.pixKeyType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pixKeyType] with a well-typed [PixKeyType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pixKeyType(pixKeyType: JsonField<PixKeyType>) = apply {
                this.pixKeyType = pixKeyType
            }

            /** Tax ID of the account holder */
            fun taxId(taxId: String) = taxId(JsonField.of(taxId))

            /**
             * Sets [Builder.taxId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxId(taxId: JsonField<String>) = apply { this.taxId = taxId }

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
             * Returns an immutable instance of [Pix].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .pixKey()
             * .pixKeyType()
             * .taxId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Pix =
                Pix(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("pixKey", pixKey),
                    checkRequired("pixKeyType", pixKeyType),
                    checkRequired("taxId", taxId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pix = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("PIX")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            pixKey()
            pixKeyType().validate()
            taxId()
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
            accountType.let { if (it == JsonValue.from("PIX")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (pixKey.asKnown() == null) 0 else 1) +
                (pixKeyType.asKnown()?.validity() ?: 0) +
                (if (taxId.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        /** Type of PIX key being used */
        class PixKeyType @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val CPF = of("CPF")

                val CNPJ = of("CNPJ")

                val EMAIL = of("EMAIL")

                val PHONE = of("PHONE")

                val RANDOM = of("RANDOM")

                fun of(value: String) = PixKeyType(JsonField.of(value))
            }

            /** An enum containing [PixKeyType]'s known values. */
            enum class Known {
                CPF,
                CNPJ,
                EMAIL,
                PHONE,
                RANDOM,
            }

            /**
             * An enum containing [PixKeyType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PixKeyType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CPF,
                CNPJ,
                EMAIL,
                PHONE,
                RANDOM,
                /**
                 * An enum member indicating that [PixKeyType] was instantiated with an unknown
                 * value.
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
                    CPF -> Value.CPF
                    CNPJ -> Value.CNPJ
                    EMAIL -> Value.EMAIL
                    PHONE -> Value.PHONE
                    RANDOM -> Value.RANDOM
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
                    CPF -> Known.CPF
                    CNPJ -> Known.CNPJ
                    EMAIL -> Known.EMAIL
                    PHONE -> Known.PHONE
                    RANDOM -> Known.RANDOM
                    else -> throw LightsparkGridInvalidDataException("Unknown PixKeyType: $value")
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

            fun validate(): PixKeyType = apply {
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

                return other is PixKeyType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pix &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                pixKey == other.pixKey &&
                pixKeyType == other.pixKeyType &&
                taxId == other.taxId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountType, beneficiary, pixKey, pixKeyType, taxId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pix{accountType=$accountType, beneficiary=$beneficiary, pixKey=$pixKey, pixKeyType=$pixKeyType, taxId=$taxId, additionalProperties=$additionalProperties}"
    }

    class Iban
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val iban: JsonField<String>,
        private val swiftBic: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
            @JsonProperty("swiftBic") @ExcludeMissing swiftBic: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, iban, swiftBic, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("IBAN")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * International Bank Account Number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun iban(): String = iban.getRequired("iban")

        /**
         * SWIFT/BIC code (8 or 11 characters)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun swiftBic(): String = swiftBic.getRequired("swiftBic")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [iban].
         *
         * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

        /**
         * Returns the raw JSON value of [swiftBic].
         *
         * Unlike [swiftBic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swiftBic") @ExcludeMissing fun _swiftBic(): JsonField<String> = swiftBic

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
             * Returns a mutable builder for constructing an instance of [Iban].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .iban()
             * .swiftBic()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Iban]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("IBAN")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var iban: JsonField<String>? = null
            private var swiftBic: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(iban: Iban) = apply {
                accountType = iban.accountType
                beneficiary = iban.beneficiary
                this.iban = iban.iban
                swiftBic = iban.swiftBic
                additionalProperties = iban.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("IBAN")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** International Bank Account Number */
            fun iban(iban: String) = iban(JsonField.of(iban))

            /**
             * Sets [Builder.iban] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iban] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iban(iban: JsonField<String>) = apply { this.iban = iban }

            /** SWIFT/BIC code (8 or 11 characters) */
            fun swiftBic(swiftBic: String) = swiftBic(JsonField.of(swiftBic))

            /**
             * Sets [Builder.swiftBic] to an arbitrary JSON value.
             *
             * You should usually call [Builder.swiftBic] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun swiftBic(swiftBic: JsonField<String>) = apply { this.swiftBic = swiftBic }

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
             * Returns an immutable instance of [Iban].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .iban()
             * .swiftBic()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Iban =
                Iban(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("iban", iban),
                    checkRequired("swiftBic", swiftBic),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Iban = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("IBAN")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            iban()
            swiftBic()
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
            accountType.let { if (it == JsonValue.from("IBAN")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (iban.asKnown() == null) 0 else 1) +
                (if (swiftBic.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Iban &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                iban == other.iban &&
                swiftBic == other.swiftBic &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountType, beneficiary, iban, swiftBic, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Iban{accountType=$accountType, beneficiary=$beneficiary, iban=$iban, swiftBic=$swiftBic, additionalProperties=$additionalProperties}"
    }

    class Upi
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val vpa: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("vpa") @ExcludeMissing vpa: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, vpa, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("UPI")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * Virtual Payment Address for UPI payments
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun vpa(): String = vpa.getRequired("vpa")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [vpa].
         *
         * Unlike [vpa], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("vpa") @ExcludeMissing fun _vpa(): JsonField<String> = vpa

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
             * Returns a mutable builder for constructing an instance of [Upi].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .vpa()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Upi]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("UPI")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var vpa: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(upi: Upi) = apply {
                accountType = upi.accountType
                beneficiary = upi.beneficiary
                vpa = upi.vpa
                additionalProperties = upi.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("UPI")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** Virtual Payment Address for UPI payments */
            fun vpa(vpa: String) = vpa(JsonField.of(vpa))

            /**
             * Sets [Builder.vpa] to an arbitrary JSON value.
             *
             * You should usually call [Builder.vpa] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun vpa(vpa: JsonField<String>) = apply { this.vpa = vpa }

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
             * Returns an immutable instance of [Upi].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .vpa()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Upi =
                Upi(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("vpa", vpa),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Upi = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("UPI")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            vpa()
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
            accountType.let { if (it == JsonValue.from("UPI")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (vpa.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Upi &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                vpa == other.vpa &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountType, beneficiary, vpa, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Upi{accountType=$accountType, beneficiary=$beneficiary, vpa=$vpa, additionalProperties=$additionalProperties}"
    }

    class NgnAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankName: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val purposeOfPayment: JsonField<PurposeOfPayment>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("bankName")
            @ExcludeMissing
            bankName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("purposeOfPayment")
            @ExcludeMissing
            purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of(),
        ) : this(
            accountNumber,
            accountType,
            bankName,
            beneficiary,
            purposeOfPayment,
            mutableMapOf(),
        )

        /**
         * Nigerian bank account number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("NGN_ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * Name of the bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bankName(): String = bankName.getRequired("bankName")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * Purpose of payment
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun purposeOfPayment(): PurposeOfPayment = purposeOfPayment.getRequired("purposeOfPayment")

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
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [purposeOfPayment].
         *
         * Unlike [purposeOfPayment], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("purposeOfPayment")
        @ExcludeMissing
        fun _purposeOfPayment(): JsonField<PurposeOfPayment> = purposeOfPayment

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
             * Returns a mutable builder for constructing an instance of [NgnAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .purposeOfPayment()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NgnAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("NGN_ACCOUNT")
            private var bankName: JsonField<String>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var purposeOfPayment: JsonField<PurposeOfPayment>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ngnAccount: NgnAccount) = apply {
                accountNumber = ngnAccount.accountNumber
                accountType = ngnAccount.accountType
                bankName = ngnAccount.bankName
                beneficiary = ngnAccount.beneficiary
                purposeOfPayment = ngnAccount.purposeOfPayment
                additionalProperties = ngnAccount.additionalProperties.toMutableMap()
            }

            /** Nigerian bank account number */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * JsonValue.from("NGN_ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            /** Name of the bank */
            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

            /**
             * Sets [Builder.bankName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** Purpose of payment */
            fun purposeOfPayment(purposeOfPayment: PurposeOfPayment) =
                purposeOfPayment(JsonField.of(purposeOfPayment))

            /**
             * Sets [Builder.purposeOfPayment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.purposeOfPayment] with a well-typed
             * [PurposeOfPayment] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun purposeOfPayment(purposeOfPayment: JsonField<PurposeOfPayment>) = apply {
                this.purposeOfPayment = purposeOfPayment
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
             * Returns an immutable instance of [NgnAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .purposeOfPayment()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): NgnAccount =
                NgnAccount(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("bankName", bankName),
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("purposeOfPayment", purposeOfPayment),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): NgnAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("NGN_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            bankName()
            beneficiary().validate()
            purposeOfPayment().validate()
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
                accountType.let { if (it == JsonValue.from("NGN_ACCOUNT")) 1 else 0 } +
                (if (bankName.asKnown() == null) 0 else 1) +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (purposeOfPayment.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        /** Purpose of payment */
        class PurposeOfPayment
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                val GIFT = of("GIFT")

                val SELF = of("SELF")

                val GOODS_OR_SERVICES = of("GOODS_OR_SERVICES")

                val EDUCATION = of("EDUCATION")

                val HEALTH_OR_MEDICAL = of("HEALTH_OR_MEDICAL")

                val REAL_ESTATE_PURCHASE = of("REAL_ESTATE_PURCHASE")

                val LOAN_PAYMENT = of("LOAN_PAYMENT")

                val TAX_PAYMENT = of("TAX_PAYMENT")

                val UTILITY_BILL = of("UTILITY_BILL")

                val DONATION = of("DONATION")

                val TRAVEL = of("TRAVEL")

                val OTHER = of("OTHER")

                fun of(value: String) = PurposeOfPayment(JsonField.of(value))
            }

            /** An enum containing [PurposeOfPayment]'s known values. */
            enum class Known {
                GIFT,
                SELF,
                GOODS_OR_SERVICES,
                EDUCATION,
                HEALTH_OR_MEDICAL,
                REAL_ESTATE_PURCHASE,
                LOAN_PAYMENT,
                TAX_PAYMENT,
                UTILITY_BILL,
                DONATION,
                TRAVEL,
                OTHER,
            }

            /**
             * An enum containing [PurposeOfPayment]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PurposeOfPayment] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GIFT,
                SELF,
                GOODS_OR_SERVICES,
                EDUCATION,
                HEALTH_OR_MEDICAL,
                REAL_ESTATE_PURCHASE,
                LOAN_PAYMENT,
                TAX_PAYMENT,
                UTILITY_BILL,
                DONATION,
                TRAVEL,
                OTHER,
                /**
                 * An enum member indicating that [PurposeOfPayment] was instantiated with an
                 * unknown value.
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
                    GIFT -> Value.GIFT
                    SELF -> Value.SELF
                    GOODS_OR_SERVICES -> Value.GOODS_OR_SERVICES
                    EDUCATION -> Value.EDUCATION
                    HEALTH_OR_MEDICAL -> Value.HEALTH_OR_MEDICAL
                    REAL_ESTATE_PURCHASE -> Value.REAL_ESTATE_PURCHASE
                    LOAN_PAYMENT -> Value.LOAN_PAYMENT
                    TAX_PAYMENT -> Value.TAX_PAYMENT
                    UTILITY_BILL -> Value.UTILITY_BILL
                    DONATION -> Value.DONATION
                    TRAVEL -> Value.TRAVEL
                    OTHER -> Value.OTHER
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
                    GIFT -> Known.GIFT
                    SELF -> Known.SELF
                    GOODS_OR_SERVICES -> Known.GOODS_OR_SERVICES
                    EDUCATION -> Known.EDUCATION
                    HEALTH_OR_MEDICAL -> Known.HEALTH_OR_MEDICAL
                    REAL_ESTATE_PURCHASE -> Known.REAL_ESTATE_PURCHASE
                    LOAN_PAYMENT -> Known.LOAN_PAYMENT
                    TAX_PAYMENT -> Known.TAX_PAYMENT
                    UTILITY_BILL -> Known.UTILITY_BILL
                    DONATION -> Known.DONATION
                    TRAVEL -> Known.TRAVEL
                    OTHER -> Known.OTHER
                    else ->
                        throw LightsparkGridInvalidDataException("Unknown PurposeOfPayment: $value")
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

            fun validate(): PurposeOfPayment = apply {
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

                return other is PurposeOfPayment && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NgnAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                beneficiary == other.beneficiary &&
                purposeOfPayment == other.purposeOfPayment &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankName,
                beneficiary,
                purposeOfPayment,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NgnAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, purposeOfPayment=$purposeOfPayment, additionalProperties=$additionalProperties}"
    }

    class CadAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankCode: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val branchCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("bankCode")
            @ExcludeMissing
            bankCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("branchCode")
            @ExcludeMissing
            branchCode: JsonField<String> = JsonMissing.of(),
        ) : this(accountNumber, accountType, bankCode, beneficiary, branchCode, mutableMapOf())

        /**
         * Bank account number (7-12 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("CAD_ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * Canadian financial institution number (3 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bankCode(): String = bankCode.getRequired("bankCode")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * Transit number identifying the branch (5 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun branchCode(): String = branchCode.getRequired("branchCode")

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
         * Returns the raw JSON value of [bankCode].
         *
         * Unlike [bankCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankCode") @ExcludeMissing fun _bankCode(): JsonField<String> = bankCode

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [branchCode].
         *
         * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("branchCode")
        @ExcludeMissing
        fun _branchCode(): JsonField<String> = branchCode

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
             * Returns a mutable builder for constructing an instance of [CadAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankCode()
             * .beneficiary()
             * .branchCode()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CadAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("CAD_ACCOUNT")
            private var bankCode: JsonField<String>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var branchCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cadAccount: CadAccount) = apply {
                accountNumber = cadAccount.accountNumber
                accountType = cadAccount.accountType
                bankCode = cadAccount.bankCode
                beneficiary = cadAccount.beneficiary
                branchCode = cadAccount.branchCode
                additionalProperties = cadAccount.additionalProperties.toMutableMap()
            }

            /** Bank account number (7-12 digits) */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * JsonValue.from("CAD_ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            /** Canadian financial institution number (3 digits) */
            fun bankCode(bankCode: String) = bankCode(JsonField.of(bankCode))

            /**
             * Sets [Builder.bankCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankCode(bankCode: JsonField<String>) = apply { this.bankCode = bankCode }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** Transit number identifying the branch (5 digits) */
            fun branchCode(branchCode: String) = branchCode(JsonField.of(branchCode))

            /**
             * Sets [Builder.branchCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.branchCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun branchCode(branchCode: JsonField<String>) = apply { this.branchCode = branchCode }

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
             * Returns an immutable instance of [CadAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankCode()
             * .beneficiary()
             * .branchCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CadAccount =
                CadAccount(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("bankCode", bankCode),
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("branchCode", branchCode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CadAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("CAD_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            bankCode()
            beneficiary().validate()
            branchCode()
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
                accountType.let { if (it == JsonValue.from("CAD_ACCOUNT")) 1 else 0 } +
                (if (bankCode.asKnown() == null) 0 else 1) +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (branchCode.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CadAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankCode == other.bankCode &&
                beneficiary == other.beneficiary &&
                branchCode == other.branchCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankCode,
                beneficiary,
                branchCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CadAccount{accountNumber=$accountNumber, accountType=$accountType, bankCode=$bankCode, beneficiary=$beneficiary, branchCode=$branchCode, additionalProperties=$additionalProperties}"
    }

    class GbpAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val sortCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("sortCode") @ExcludeMissing sortCode: JsonField<String> = JsonMissing.of(),
        ) : this(accountNumber, accountType, beneficiary, sortCode, mutableMapOf())

        /**
         * UK bank account number (8 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("GBP_ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * UK bank sort code (6 digits, may include hyphens)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun sortCode(): String = sortCode.getRequired("sortCode")

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
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [sortCode].
         *
         * Unlike [sortCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sortCode") @ExcludeMissing fun _sortCode(): JsonField<String> = sortCode

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
             * Returns a mutable builder for constructing an instance of [GbpAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .beneficiary()
             * .sortCode()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [GbpAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("GBP_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var sortCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(gbpAccount: GbpAccount) = apply {
                accountNumber = gbpAccount.accountNumber
                accountType = gbpAccount.accountType
                beneficiary = gbpAccount.beneficiary
                sortCode = gbpAccount.sortCode
                additionalProperties = gbpAccount.additionalProperties.toMutableMap()
            }

            /** UK bank account number (8 digits) */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * JsonValue.from("GBP_ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** UK bank sort code (6 digits, may include hyphens) */
            fun sortCode(sortCode: String) = sortCode(JsonField.of(sortCode))

            /**
             * Sets [Builder.sortCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.sortCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun sortCode(sortCode: JsonField<String>) = apply { this.sortCode = sortCode }

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
             * Returns an immutable instance of [GbpAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .beneficiary()
             * .sortCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): GbpAccount =
                GbpAccount(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("sortCode", sortCode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): GbpAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("GBP_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            sortCode()
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
                accountType.let { if (it == JsonValue.from("GBP_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (sortCode.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is GbpAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                sortCode == other.sortCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountNumber, accountType, beneficiary, sortCode, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GbpAccount{accountNumber=$accountNumber, accountType=$accountType, beneficiary=$beneficiary, sortCode=$sortCode, additionalProperties=$additionalProperties}"
    }

    class PhpAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankName: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("bankName")
            @ExcludeMissing
            bankName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        ) : this(accountNumber, accountType, bankName, beneficiary, mutableMapOf())

        /**
         * Bank account number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("PHP_ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * Name of the beneficiary's bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bankName(): String = bankName.getRequired("bankName")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

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
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

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
             * Returns a mutable builder for constructing an instance of [PhpAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PhpAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("PHP_ACCOUNT")
            private var bankName: JsonField<String>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(phpAccount: PhpAccount) = apply {
                accountNumber = phpAccount.accountNumber
                accountType = phpAccount.accountType
                bankName = phpAccount.bankName
                beneficiary = phpAccount.beneficiary
                additionalProperties = phpAccount.additionalProperties.toMutableMap()
            }

            /** Bank account number */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * JsonValue.from("PHP_ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            /** Name of the beneficiary's bank */
            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

            /**
             * Sets [Builder.bankName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

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
             * Returns an immutable instance of [PhpAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PhpAccount =
                PhpAccount(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("bankName", bankName),
                    checkRequired("beneficiary", beneficiary),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PhpAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("PHP_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            bankName()
            beneficiary().validate()
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
                accountType.let { if (it == JsonValue.from("PHP_ACCOUNT")) 1 else 0 } +
                (if (bankName.asKnown() == null) 0 else 1) +
                (beneficiary.asKnown()?.validity() ?: 0)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhpAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                beneficiary == other.beneficiary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountNumber, accountType, bankName, beneficiary, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhpAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
    }

    class SgdAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankName: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val swiftCode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("bankName")
            @ExcludeMissing
            bankName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("swiftCode")
            @ExcludeMissing
            swiftCode: JsonField<String> = JsonMissing.of(),
        ) : this(accountNumber, accountType, bankName, beneficiary, swiftCode, mutableMapOf())

        /**
         * Bank account number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("SGD_ACCOUNT")
         * ```
         *
         * However, this method can be useful for debugging and logging (e.g. if the server
         * responded with an unexpected value).
         */
        @JsonProperty("accountType") @ExcludeMissing fun _accountType(): JsonValue = accountType

        /**
         * Name of the beneficiary's bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bankName(): String = bankName.getRequired("bankName")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * SWIFT/BIC code (8 or 11 characters)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun swiftCode(): String = swiftCode.getRequired("swiftCode")

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
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [swiftCode].
         *
         * Unlike [swiftCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swiftCode") @ExcludeMissing fun _swiftCode(): JsonField<String> = swiftCode

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
             * Returns a mutable builder for constructing an instance of [SgdAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .swiftCode()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SgdAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("SGD_ACCOUNT")
            private var bankName: JsonField<String>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var swiftCode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(sgdAccount: SgdAccount) = apply {
                accountNumber = sgdAccount.accountNumber
                accountType = sgdAccount.accountType
                bankName = sgdAccount.bankName
                beneficiary = sgdAccount.beneficiary
                swiftCode = sgdAccount.swiftCode
                additionalProperties = sgdAccount.additionalProperties.toMutableMap()
            }

            /** Bank account number */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /**
             * Sets [Builder.accountNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
             * JsonValue.from("SGD_ACCOUNT")
             * ```
             *
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonValue) = apply { this.accountType = accountType }

            /** Name of the beneficiary's bank */
            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

            /**
             * Sets [Builder.bankName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

            fun beneficiary(beneficiary: Beneficiary) = beneficiary(JsonField.of(beneficiary))

            /**
             * Sets [Builder.beneficiary] to an arbitrary JSON value.
             *
             * You should usually call [Builder.beneficiary] with a well-typed [Beneficiary] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun beneficiary(beneficiary: JsonField<Beneficiary>) = apply {
                this.beneficiary = beneficiary
            }

            /** Alias for calling [beneficiary] with `Beneficiary.ofIndividual(individual)`. */
            fun beneficiary(individual: Beneficiary.Individual) =
                beneficiary(Beneficiary.ofIndividual(individual))

            /** Alias for calling [beneficiary] with `Beneficiary.ofBusiness(business)`. */
            fun beneficiary(business: BusinessBeneficiary) =
                beneficiary(Beneficiary.ofBusiness(business))

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * BusinessBeneficiary.builder()
             *     .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
             *     .legalName(legalName)
             *     .build()
             * ```
             */
            fun businessBeneficiary(legalName: String) =
                beneficiary(
                    BusinessBeneficiary.builder()
                        .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                        .legalName(legalName)
                        .build()
                )

            /** SWIFT/BIC code (8 or 11 characters) */
            fun swiftCode(swiftCode: String) = swiftCode(JsonField.of(swiftCode))

            /**
             * Sets [Builder.swiftCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.swiftCode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun swiftCode(swiftCode: JsonField<String>) = apply { this.swiftCode = swiftCode }

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
             * Returns an immutable instance of [SgdAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .swiftCode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SgdAccount =
                SgdAccount(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("bankName", bankName),
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("swiftCode", swiftCode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SgdAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("SGD_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            bankName()
            beneficiary().validate()
            swiftCode()
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
                accountType.let { if (it == JsonValue.from("SGD_ACCOUNT")) 1 else 0 } +
                (if (bankName.asKnown() == null) 0 else 1) +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (if (swiftCode.asKnown() == null) 0 else 1)

        @JsonDeserialize(using = Beneficiary.Deserializer::class)
        @JsonSerialize(using = Beneficiary.Serializer::class)
        class Beneficiary
        private constructor(
            private val individual: Individual? = null,
            private val business: BusinessBeneficiary? = null,
            private val _json: JsonValue? = null,
        ) {

            fun individual(): Individual? = individual

            fun business(): BusinessBeneficiary? = business

            fun isIndividual(): Boolean = individual != null

            fun isBusiness(): Boolean = business != null

            fun asIndividual(): Individual = individual.getOrThrow("individual")

            fun asBusiness(): BusinessBeneficiary = business.getOrThrow("business")

            fun _json(): JsonValue? = _json

            fun <T> accept(visitor: Visitor<T>): T =
                when {
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
                }

            private var validated: Boolean = false

            fun validate(): Beneficiary = apply {
                if (validated) {
                    return@apply
                }

                accept(
                    object : Visitor<Unit> {
                        override fun visitIndividual(individual: Individual) {
                            individual.validate()
                        }

                        override fun visitBusiness(business: BusinessBeneficiary) {
                            business.validate()
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
                        override fun visitIndividual(individual: Individual) = individual.validity()

                        override fun visitBusiness(business: BusinessBeneficiary) =
                            business.validity()

                        override fun unknown(json: JsonValue?) = 0
                    }
                )

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Beneficiary &&
                    individual == other.individual &&
                    business == other.business
            }

            override fun hashCode(): Int = Objects.hash(individual, business)

            override fun toString(): String =
                when {
                    individual != null -> "Beneficiary{individual=$individual}"
                    business != null -> "Beneficiary{business=$business}"
                    _json != null -> "Beneficiary{_unknown=$_json}"
                    else -> throw IllegalStateException("Invalid Beneficiary")
                }

            companion object {

                fun ofIndividual(individual: Individual) = Beneficiary(individual = individual)

                fun ofBusiness(business: BusinessBeneficiary) = Beneficiary(business = business)
            }

            /**
             * An interface that defines how to map each variant of [Beneficiary] to a value of type
             * [T].
             */
            interface Visitor<out T> {

                fun visitIndividual(individual: Individual): T

                fun visitBusiness(business: BusinessBeneficiary): T

                /**
                 * Maps an unknown variant of [Beneficiary] to a value of type [T].
                 *
                 * An instance of [Beneficiary] can contain an unknown variant if it was
                 * deserialized from data that doesn't match any known variant. For example, if the
                 * SDK is on an older version than the API, then the API may respond with new
                 * variants that the SDK is unaware of.
                 *
                 * @throws LightsparkGridInvalidDataException in the default implementation.
                 */
                fun unknown(json: JsonValue?): T {
                    throw LightsparkGridInvalidDataException("Unknown Beneficiary: $json")
                }
            }

            internal class Deserializer : BaseDeserializer<Beneficiary>(Beneficiary::class) {

                override fun ObjectCodec.deserialize(node: JsonNode): Beneficiary {
                    val json = JsonValue.fromJsonNode(node)
                    val beneficiaryType = json.asObject()?.get("beneficiaryType")?.asString()

                    when (beneficiaryType) {
                        "INDIVIDUAL" -> {
                            return tryDeserialize(node, jacksonTypeRef<Individual>())?.let {
                                Beneficiary(individual = it, _json = json)
                            } ?: Beneficiary(_json = json)
                        }
                        "BUSINESS" -> {
                            return tryDeserialize(node, jacksonTypeRef<BusinessBeneficiary>())
                                ?.let { Beneficiary(business = it, _json = json) }
                                ?: Beneficiary(_json = json)
                        }
                    }

                    return Beneficiary(_json = json)
                }
            }

            internal class Serializer : BaseSerializer<Beneficiary>(Beneficiary::class) {

                override fun serialize(
                    value: Beneficiary,
                    generator: JsonGenerator,
                    provider: SerializerProvider,
                ) {
                    when {
                        value.individual != null -> generator.writeObject(value.individual)
                        value.business != null -> generator.writeObject(value.business)
                        value._json != null -> generator.writeObject(value._json)
                        else -> throw IllegalStateException("Invalid Beneficiary")
                    }
                }
            }

            class Individual
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val beneficiaryType: JsonValue,
                private val birthDate: JsonField<LocalDate>,
                private val fullName: JsonField<String>,
                private val nationality: JsonField<String>,
                private val address: JsonField<Address>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<LocalDate> = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                ) : this(beneficiaryType, birthDate, fullName, nationality, address, mutableMapOf())

                /**
                 * Expected to always return the following:
                 * ```kotlin
                 * JsonValue.from("INDIVIDUAL")
                 * ```
                 *
                 * However, this method can be useful for debugging and logging (e.g. if the server
                 * responded with an unexpected value).
                 */
                @JsonProperty("beneficiaryType")
                @ExcludeMissing
                fun _beneficiaryType(): JsonValue = beneficiaryType

                /**
                 * Date of birth in ISO 8601 format (YYYY-MM-DD)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun birthDate(): LocalDate = birthDate.getRequired("birthDate")

                /**
                 * Individual's full name
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * Country code (ISO 3166-1 alpha-2)
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun nationality(): String = nationality.getRequired("nationality")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<LocalDate> = birthDate

                /**
                 * Returns the raw JSON value of [fullName].
                 *
                 * Unlike [fullName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("fullName")
                @ExcludeMissing
                fun _fullName(): JsonField<String> = fullName

                /**
                 * Returns the raw JSON value of [nationality].
                 *
                 * Unlike [nationality], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("nationality")
                @ExcludeMissing
                fun _nationality(): JsonField<String> = nationality

                /**
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

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
                     * Returns a mutable builder for constructing an instance of [Individual].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var birthDate: JsonField<LocalDate>? = null
                    private var fullName: JsonField<String>? = null
                    private var nationality: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        birthDate = individual.birthDate
                        fullName = individual.fullName
                        nationality = individual.nationality
                        address = individual.address
                        additionalProperties = individual.additionalProperties.toMutableMap()
                    }

                    /**
                     * Sets the field to an arbitrary JSON value.
                     *
                     * It is usually unnecessary to call this method because the field defaults to
                     * the following:
                     * ```kotlin
                     * JsonValue.from("INDIVIDUAL")
                     * ```
                     *
                     * This method is primarily for setting the field to an undocumented or not yet
                     * supported value.
                     */
                    fun beneficiaryType(beneficiaryType: JsonValue) = apply {
                        this.beneficiaryType = beneficiaryType
                    }

                    /** Date of birth in ISO 8601 format (YYYY-MM-DD) */
                    fun birthDate(birthDate: LocalDate) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [LocalDate]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<LocalDate>) = apply {
                        this.birthDate = birthDate
                    }

                    /** Individual's full name */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    /** Country code (ISO 3166-1 alpha-2) */
                    fun nationality(nationality: String) = nationality(JsonField.of(nationality))

                    /**
                     * Sets [Builder.nationality] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.nationality] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun nationality(nationality: JsonField<String>) = apply {
                        this.nationality = nationality
                    }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .birthDate()
                     * .fullName()
                     * .nationality()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("birthDate", birthDate),
                            checkRequired("fullName", fullName),
                            checkRequired("nationality", nationality),
                            address,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Individual = apply {
                    if (validated) {
                        return@apply
                    }

                    _beneficiaryType().let {
                        if (it != JsonValue.from("INDIVIDUAL")) {
                            throw LightsparkGridInvalidDataException(
                                "'beneficiaryType' is invalid, received $it"
                            )
                        }
                    }
                    birthDate()
                    fullName()
                    nationality()
                    address()?.validate()
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
                    beneficiaryType.let { if (it == JsonValue.from("INDIVIDUAL")) 1 else 0 } +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        birthDate == other.birthDate &&
                        fullName == other.fullName &&
                        nationality == other.nationality &&
                        address == other.address &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        birthDate,
                        fullName,
                        nationality,
                        address,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, birthDate=$birthDate, fullName=$fullName, nationality=$nationality, address=$address, additionalProperties=$additionalProperties}"
            }
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SgdAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                beneficiary == other.beneficiary &&
                swiftCode == other.swiftCode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankName,
                beneficiary,
                swiftCode,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SgdAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, swiftCode=$swiftCode, additionalProperties=$additionalProperties}"
    }
}
