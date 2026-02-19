// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.BaseDeserializer
import com.lightspark.grid.core.BaseSerializer
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Objects

@JsonDeserialize(using = ExternalAccountInfoOneOf.Deserializer::class)
@JsonSerialize(using = ExternalAccountInfoOneOf.Serializer::class)
class ExternalAccountInfoOneOf
private constructor(
    private val usAccount: UsAccountInfo? = null,
    private val clabe: ClabeAccountInfo? = null,
    private val pix: PixAccountInfo? = null,
    private val iban: IbanAccountInfo? = null,
    private val upi: UpiAccountInfo? = null,
    private val ngnAccount: NgnAccountInfo? = null,
    private val cadAccount: CadAccountInfo? = null,
    private val gbpAccount: GbpAccountInfo? = null,
    private val phpAccount: PhpAccountInfo? = null,
    private val sgdAccount: SgdAccountInfo? = null,
    private val sparkWallet: SparkWalletInfo? = null,
    private val lightning: LightningWalletInfo? = null,
    private val solanaWallet: SolanaWalletInfo? = null,
    private val tronWallet: TronWalletInfo? = null,
    private val polygonWallet: PolygonWalletInfo? = null,
    private val baseWallet: BaseWalletInfo? = null,
    private val _json: JsonValue? = null,
) {

    fun usAccount(): UsAccountInfo? = usAccount

    fun clabe(): ClabeAccountInfo? = clabe

    fun pix(): PixAccountInfo? = pix

    fun iban(): IbanAccountInfo? = iban

    fun upi(): UpiAccountInfo? = upi

    fun ngnAccount(): NgnAccountInfo? = ngnAccount

    fun cadAccount(): CadAccountInfo? = cadAccount

    fun gbpAccount(): GbpAccountInfo? = gbpAccount

    fun phpAccount(): PhpAccountInfo? = phpAccount

    fun sgdAccount(): SgdAccountInfo? = sgdAccount

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

    fun asUsAccount(): UsAccountInfo = usAccount.getOrThrow("usAccount")

    fun asClabe(): ClabeAccountInfo = clabe.getOrThrow("clabe")

    fun asPix(): PixAccountInfo = pix.getOrThrow("pix")

    fun asIban(): IbanAccountInfo = iban.getOrThrow("iban")

    fun asUpi(): UpiAccountInfo = upi.getOrThrow("upi")

    fun asNgnAccount(): NgnAccountInfo = ngnAccount.getOrThrow("ngnAccount")

    fun asCadAccount(): CadAccountInfo = cadAccount.getOrThrow("cadAccount")

    fun asGbpAccount(): GbpAccountInfo = gbpAccount.getOrThrow("gbpAccount")

    fun asPhpAccount(): PhpAccountInfo = phpAccount.getOrThrow("phpAccount")

    fun asSgdAccount(): SgdAccountInfo = sgdAccount.getOrThrow("sgdAccount")

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
                override fun visitUsAccount(usAccount: UsAccountInfo) {
                    usAccount.validate()
                }

                override fun visitClabe(clabe: ClabeAccountInfo) {
                    clabe.validate()
                }

                override fun visitPix(pix: PixAccountInfo) {
                    pix.validate()
                }

                override fun visitIban(iban: IbanAccountInfo) {
                    iban.validate()
                }

                override fun visitUpi(upi: UpiAccountInfo) {
                    upi.validate()
                }

                override fun visitNgnAccount(ngnAccount: NgnAccountInfo) {
                    ngnAccount.validate()
                }

                override fun visitCadAccount(cadAccount: CadAccountInfo) {
                    cadAccount.validate()
                }

                override fun visitGbpAccount(gbpAccount: GbpAccountInfo) {
                    gbpAccount.validate()
                }

                override fun visitPhpAccount(phpAccount: PhpAccountInfo) {
                    phpAccount.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdAccountInfo) {
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
                override fun visitUsAccount(usAccount: UsAccountInfo) = usAccount.validity()

                override fun visitClabe(clabe: ClabeAccountInfo) = clabe.validity()

                override fun visitPix(pix: PixAccountInfo) = pix.validity()

                override fun visitIban(iban: IbanAccountInfo) = iban.validity()

                override fun visitUpi(upi: UpiAccountInfo) = upi.validity()

                override fun visitNgnAccount(ngnAccount: NgnAccountInfo) = ngnAccount.validity()

                override fun visitCadAccount(cadAccount: CadAccountInfo) = cadAccount.validity()

                override fun visitGbpAccount(gbpAccount: GbpAccountInfo) = gbpAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpAccountInfo) = phpAccount.validity()

                override fun visitSgdAccount(sgdAccount: SgdAccountInfo) = sgdAccount.validity()

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

        fun ofUsAccount(usAccount: UsAccountInfo) = ExternalAccountInfoOneOf(usAccount = usAccount)

        fun ofClabe(clabe: ClabeAccountInfo) = ExternalAccountInfoOneOf(clabe = clabe)

        fun ofPix(pix: PixAccountInfo) = ExternalAccountInfoOneOf(pix = pix)

        fun ofIban(iban: IbanAccountInfo) = ExternalAccountInfoOneOf(iban = iban)

        fun ofUpi(upi: UpiAccountInfo) = ExternalAccountInfoOneOf(upi = upi)

        fun ofNgnAccount(ngnAccount: NgnAccountInfo) =
            ExternalAccountInfoOneOf(ngnAccount = ngnAccount)

        fun ofCadAccount(cadAccount: CadAccountInfo) =
            ExternalAccountInfoOneOf(cadAccount = cadAccount)

        fun ofGbpAccount(gbpAccount: GbpAccountInfo) =
            ExternalAccountInfoOneOf(gbpAccount = gbpAccount)

        fun ofPhpAccount(phpAccount: PhpAccountInfo) =
            ExternalAccountInfoOneOf(phpAccount = phpAccount)

        fun ofSgdAccount(sgdAccount: SgdAccountInfo) =
            ExternalAccountInfoOneOf(sgdAccount = sgdAccount)

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

        fun visitUsAccount(usAccount: UsAccountInfo): T

        fun visitClabe(clabe: ClabeAccountInfo): T

        fun visitPix(pix: PixAccountInfo): T

        fun visitIban(iban: IbanAccountInfo): T

        fun visitUpi(upi: UpiAccountInfo): T

        fun visitNgnAccount(ngnAccount: NgnAccountInfo): T

        fun visitCadAccount(cadAccount: CadAccountInfo): T

        fun visitGbpAccount(gbpAccount: GbpAccountInfo): T

        fun visitPhpAccount(phpAccount: PhpAccountInfo): T

        fun visitSgdAccount(sgdAccount: SgdAccountInfo): T

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
                    return tryDeserialize(node, jacksonTypeRef<UsAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(usAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "CLABE" -> {
                    return tryDeserialize(node, jacksonTypeRef<ClabeAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(clabe = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PIX" -> {
                    return tryDeserialize(node, jacksonTypeRef<PixAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(pix = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "IBAN" -> {
                    return tryDeserialize(node, jacksonTypeRef<IbanAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(iban = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "UPI" -> {
                    return tryDeserialize(node, jacksonTypeRef<UpiAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(upi = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "NGN_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<NgnAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(ngnAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "CAD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<CadAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(cadAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "GBP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GbpAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(gbpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PHP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PhpAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(phpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "SGD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SgdAccountInfo>())?.let {
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
}
