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
    private val brlAccount: BrlExternalAccountInfo? = null,
    private val dkkAccount: DkkExternalAccountInfo? = null,
    private val gbpAccount: GbpExternalAccountInfo? = null,
    private val hkdAccount: HkdExternalAccountInfo? = null,
    private val idrAccount: IdrExternalAccountInfo? = null,
    private val inrAccount: InrExternalAccountInfo? = null,
    private val mxnAccount: MxnExternalAccountInfo? = null,
    private val myrAccount: MyrExternalAccountInfo? = null,
    private val phpAccount: PhpExternalAccountInfo? = null,
    private val sgdAccount: SgdExternalAccountInfo? = null,
    private val thbAccount: ThbExternalAccountInfo? = null,
    private val usdAccount: UsdExternalAccountInfo? = null,
    private val vndAccount: VndExternalAccountInfo? = null,
    private val sparkWallet: SparkWalletInfo? = null,
    private val lightning: LightningWalletInfo? = null,
    private val solanaWallet: SolanaWalletInfo? = null,
    private val tronWallet: TronWalletInfo? = null,
    private val polygonWallet: PolygonWalletInfo? = null,
    private val baseWallet: BaseWalletInfo? = null,
    private val _json: JsonValue? = null,
) {

    fun brlAccount(): BrlExternalAccountInfo? = brlAccount

    fun dkkAccount(): DkkExternalAccountInfo? = dkkAccount

    fun gbpAccount(): GbpExternalAccountInfo? = gbpAccount

    fun hkdAccount(): HkdExternalAccountInfo? = hkdAccount

    fun idrAccount(): IdrExternalAccountInfo? = idrAccount

    fun inrAccount(): InrExternalAccountInfo? = inrAccount

    fun mxnAccount(): MxnExternalAccountInfo? = mxnAccount

    fun myrAccount(): MyrExternalAccountInfo? = myrAccount

    fun phpAccount(): PhpExternalAccountInfo? = phpAccount

    fun sgdAccount(): SgdExternalAccountInfo? = sgdAccount

    fun thbAccount(): ThbExternalAccountInfo? = thbAccount

    fun usdAccount(): UsdExternalAccountInfo? = usdAccount

    fun vndAccount(): VndExternalAccountInfo? = vndAccount

    fun sparkWallet(): SparkWalletInfo? = sparkWallet

    fun lightning(): LightningWalletInfo? = lightning

    fun solanaWallet(): SolanaWalletInfo? = solanaWallet

    fun tronWallet(): TronWalletInfo? = tronWallet

    fun polygonWallet(): PolygonWalletInfo? = polygonWallet

    fun baseWallet(): BaseWalletInfo? = baseWallet

    fun isBrlAccount(): Boolean = brlAccount != null

    fun isDkkAccount(): Boolean = dkkAccount != null

    fun isGbpAccount(): Boolean = gbpAccount != null

    fun isHkdAccount(): Boolean = hkdAccount != null

    fun isIdrAccount(): Boolean = idrAccount != null

    fun isInrAccount(): Boolean = inrAccount != null

    fun isMxnAccount(): Boolean = mxnAccount != null

    fun isMyrAccount(): Boolean = myrAccount != null

    fun isPhpAccount(): Boolean = phpAccount != null

    fun isSgdAccount(): Boolean = sgdAccount != null

    fun isThbAccount(): Boolean = thbAccount != null

    fun isUsdAccount(): Boolean = usdAccount != null

    fun isVndAccount(): Boolean = vndAccount != null

    fun isSparkWallet(): Boolean = sparkWallet != null

    fun isLightning(): Boolean = lightning != null

    fun isSolanaWallet(): Boolean = solanaWallet != null

    fun isTronWallet(): Boolean = tronWallet != null

    fun isPolygonWallet(): Boolean = polygonWallet != null

    fun isBaseWallet(): Boolean = baseWallet != null

    fun asBrlAccount(): BrlExternalAccountInfo = brlAccount.getOrThrow("brlAccount")

    fun asDkkAccount(): DkkExternalAccountInfo = dkkAccount.getOrThrow("dkkAccount")

    fun asGbpAccount(): GbpExternalAccountInfo = gbpAccount.getOrThrow("gbpAccount")

    fun asHkdAccount(): HkdExternalAccountInfo = hkdAccount.getOrThrow("hkdAccount")

    fun asIdrAccount(): IdrExternalAccountInfo = idrAccount.getOrThrow("idrAccount")

    fun asInrAccount(): InrExternalAccountInfo = inrAccount.getOrThrow("inrAccount")

    fun asMxnAccount(): MxnExternalAccountInfo = mxnAccount.getOrThrow("mxnAccount")

    fun asMyrAccount(): MyrExternalAccountInfo = myrAccount.getOrThrow("myrAccount")

    fun asPhpAccount(): PhpExternalAccountInfo = phpAccount.getOrThrow("phpAccount")

    fun asSgdAccount(): SgdExternalAccountInfo = sgdAccount.getOrThrow("sgdAccount")

    fun asThbAccount(): ThbExternalAccountInfo = thbAccount.getOrThrow("thbAccount")

    fun asUsdAccount(): UsdExternalAccountInfo = usdAccount.getOrThrow("usdAccount")

    fun asVndAccount(): VndExternalAccountInfo = vndAccount.getOrThrow("vndAccount")

    fun asSparkWallet(): SparkWalletInfo = sparkWallet.getOrThrow("sparkWallet")

    fun asLightning(): LightningWalletInfo = lightning.getOrThrow("lightning")

    fun asSolanaWallet(): SolanaWalletInfo = solanaWallet.getOrThrow("solanaWallet")

    fun asTronWallet(): TronWalletInfo = tronWallet.getOrThrow("tronWallet")

    fun asPolygonWallet(): PolygonWalletInfo = polygonWallet.getOrThrow("polygonWallet")

    fun asBaseWallet(): BaseWalletInfo = baseWallet.getOrThrow("baseWallet")

    fun _json(): JsonValue? = _json

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            brlAccount != null -> visitor.visitBrlAccount(brlAccount)
            dkkAccount != null -> visitor.visitDkkAccount(dkkAccount)
            gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
            hkdAccount != null -> visitor.visitHkdAccount(hkdAccount)
            idrAccount != null -> visitor.visitIdrAccount(idrAccount)
            inrAccount != null -> visitor.visitInrAccount(inrAccount)
            mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
            myrAccount != null -> visitor.visitMyrAccount(myrAccount)
            phpAccount != null -> visitor.visitPhpAccount(phpAccount)
            sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
            thbAccount != null -> visitor.visitThbAccount(thbAccount)
            usdAccount != null -> visitor.visitUsdAccount(usdAccount)
            vndAccount != null -> visitor.visitVndAccount(vndAccount)
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
                override fun visitBrlAccount(brlAccount: BrlExternalAccountInfo) {
                    brlAccount.validate()
                }

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo) {
                    dkkAccount.validate()
                }

                override fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo) {
                    gbpAccount.validate()
                }

                override fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo) {
                    hkdAccount.validate()
                }

                override fun visitIdrAccount(idrAccount: IdrExternalAccountInfo) {
                    idrAccount.validate()
                }

                override fun visitInrAccount(inrAccount: InrExternalAccountInfo) {
                    inrAccount.validate()
                }

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) {
                    mxnAccount.validate()
                }

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) {
                    myrAccount.validate()
                }

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) {
                    phpAccount.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) {
                    sgdAccount.validate()
                }

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) {
                    thbAccount.validate()
                }

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) {
                    usdAccount.validate()
                }

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) {
                    vndAccount.validate()
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
                override fun visitBrlAccount(brlAccount: BrlExternalAccountInfo) =
                    brlAccount.validity()

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo) =
                    dkkAccount.validity()

                override fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo) =
                    gbpAccount.validity()

                override fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo) =
                    hkdAccount.validity()

                override fun visitIdrAccount(idrAccount: IdrExternalAccountInfo) =
                    idrAccount.validity()

                override fun visitInrAccount(inrAccount: InrExternalAccountInfo) =
                    inrAccount.validity()

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) =
                    mxnAccount.validity()

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) =
                    myrAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) =
                    phpAccount.validity()

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) =
                    sgdAccount.validity()

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) =
                    thbAccount.validity()

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) =
                    usdAccount.validity()

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) =
                    vndAccount.validity()

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
            brlAccount == other.brlAccount &&
            dkkAccount == other.dkkAccount &&
            gbpAccount == other.gbpAccount &&
            hkdAccount == other.hkdAccount &&
            idrAccount == other.idrAccount &&
            inrAccount == other.inrAccount &&
            mxnAccount == other.mxnAccount &&
            myrAccount == other.myrAccount &&
            phpAccount == other.phpAccount &&
            sgdAccount == other.sgdAccount &&
            thbAccount == other.thbAccount &&
            usdAccount == other.usdAccount &&
            vndAccount == other.vndAccount &&
            sparkWallet == other.sparkWallet &&
            lightning == other.lightning &&
            solanaWallet == other.solanaWallet &&
            tronWallet == other.tronWallet &&
            polygonWallet == other.polygonWallet &&
            baseWallet == other.baseWallet
    }

    override fun hashCode(): Int =
        Objects.hash(
            brlAccount,
            dkkAccount,
            gbpAccount,
            hkdAccount,
            idrAccount,
            inrAccount,
            mxnAccount,
            myrAccount,
            phpAccount,
            sgdAccount,
            thbAccount,
            usdAccount,
            vndAccount,
            sparkWallet,
            lightning,
            solanaWallet,
            tronWallet,
            polygonWallet,
            baseWallet,
        )

    override fun toString(): String =
        when {
            brlAccount != null -> "ExternalAccountInfoOneOf{brlAccount=$brlAccount}"
            dkkAccount != null -> "ExternalAccountInfoOneOf{dkkAccount=$dkkAccount}"
            gbpAccount != null -> "ExternalAccountInfoOneOf{gbpAccount=$gbpAccount}"
            hkdAccount != null -> "ExternalAccountInfoOneOf{hkdAccount=$hkdAccount}"
            idrAccount != null -> "ExternalAccountInfoOneOf{idrAccount=$idrAccount}"
            inrAccount != null -> "ExternalAccountInfoOneOf{inrAccount=$inrAccount}"
            mxnAccount != null -> "ExternalAccountInfoOneOf{mxnAccount=$mxnAccount}"
            myrAccount != null -> "ExternalAccountInfoOneOf{myrAccount=$myrAccount}"
            phpAccount != null -> "ExternalAccountInfoOneOf{phpAccount=$phpAccount}"
            sgdAccount != null -> "ExternalAccountInfoOneOf{sgdAccount=$sgdAccount}"
            thbAccount != null -> "ExternalAccountInfoOneOf{thbAccount=$thbAccount}"
            usdAccount != null -> "ExternalAccountInfoOneOf{usdAccount=$usdAccount}"
            vndAccount != null -> "ExternalAccountInfoOneOf{vndAccount=$vndAccount}"
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

        fun ofBrlAccount(brlAccount: BrlExternalAccountInfo) =
            ExternalAccountInfoOneOf(brlAccount = brlAccount)

        fun ofDkkAccount(dkkAccount: DkkExternalAccountInfo) =
            ExternalAccountInfoOneOf(dkkAccount = dkkAccount)

        fun ofGbpAccount(gbpAccount: GbpExternalAccountInfo) =
            ExternalAccountInfoOneOf(gbpAccount = gbpAccount)

        fun ofHkdAccount(hkdAccount: HkdExternalAccountInfo) =
            ExternalAccountInfoOneOf(hkdAccount = hkdAccount)

        fun ofIdrAccount(idrAccount: IdrExternalAccountInfo) =
            ExternalAccountInfoOneOf(idrAccount = idrAccount)

        fun ofInrAccount(inrAccount: InrExternalAccountInfo) =
            ExternalAccountInfoOneOf(inrAccount = inrAccount)

        fun ofMxnAccount(mxnAccount: MxnExternalAccountInfo) =
            ExternalAccountInfoOneOf(mxnAccount = mxnAccount)

        fun ofMyrAccount(myrAccount: MyrExternalAccountInfo) =
            ExternalAccountInfoOneOf(myrAccount = myrAccount)

        fun ofPhpAccount(phpAccount: PhpExternalAccountInfo) =
            ExternalAccountInfoOneOf(phpAccount = phpAccount)

        fun ofSgdAccount(sgdAccount: SgdExternalAccountInfo) =
            ExternalAccountInfoOneOf(sgdAccount = sgdAccount)

        fun ofThbAccount(thbAccount: ThbExternalAccountInfo) =
            ExternalAccountInfoOneOf(thbAccount = thbAccount)

        fun ofUsdAccount(usdAccount: UsdExternalAccountInfo) =
            ExternalAccountInfoOneOf(usdAccount = usdAccount)

        fun ofVndAccount(vndAccount: VndExternalAccountInfo) =
            ExternalAccountInfoOneOf(vndAccount = vndAccount)

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

        fun visitBrlAccount(brlAccount: BrlExternalAccountInfo): T

        fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo): T

        fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo): T

        fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo): T

        fun visitIdrAccount(idrAccount: IdrExternalAccountInfo): T

        fun visitInrAccount(inrAccount: InrExternalAccountInfo): T

        fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo): T

        fun visitMyrAccount(myrAccount: MyrExternalAccountInfo): T

        fun visitPhpAccount(phpAccount: PhpExternalAccountInfo): T

        fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo): T

        fun visitThbAccount(thbAccount: ThbExternalAccountInfo): T

        fun visitUsdAccount(usdAccount: UsdExternalAccountInfo): T

        fun visitVndAccount(vndAccount: VndExternalAccountInfo): T

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
                "BRL_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<BrlExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(brlAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "DKK_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<DkkExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(dkkAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "GBP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GbpExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(gbpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "HKD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<HkdExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(hkdAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "IDR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<IdrExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(idrAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "INR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<InrExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(inrAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "MXN_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<MxnExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(mxnAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "MYR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<MyrExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(myrAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PHP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PhpExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(phpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "SGD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SgdExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(sgdAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "THB_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ThbExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(thbAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "USD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<UsdExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(usdAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "VND_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<VndExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(vndAccount = it, _json = json)
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
                value.brlAccount != null -> generator.writeObject(value.brlAccount)
                value.dkkAccount != null -> generator.writeObject(value.dkkAccount)
                value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                value.hkdAccount != null -> generator.writeObject(value.hkdAccount)
                value.idrAccount != null -> generator.writeObject(value.idrAccount)
                value.inrAccount != null -> generator.writeObject(value.inrAccount)
                value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                value.myrAccount != null -> generator.writeObject(value.myrAccount)
                value.phpAccount != null -> generator.writeObject(value.phpAccount)
                value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                value.thbAccount != null -> generator.writeObject(value.thbAccount)
                value.usdAccount != null -> generator.writeObject(value.usdAccount)
                value.vndAccount != null -> generator.writeObject(value.vndAccount)
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
