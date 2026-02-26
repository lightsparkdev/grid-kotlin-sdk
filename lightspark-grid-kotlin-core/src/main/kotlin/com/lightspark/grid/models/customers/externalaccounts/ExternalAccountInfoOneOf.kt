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
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

@JsonDeserialize(using = ExternalAccountInfoOneOf.Deserializer::class)
@JsonSerialize(using = ExternalAccountInfoOneOf.Serializer::class)
class ExternalAccountInfoOneOf
private constructor(
    private val brlAccount: BrlExternalAccountInfo? = null,
    private val cadAccount: CadAccount? = null,
    private val dkkAccount: DkkExternalAccountInfo? = null,
    private val eurAccount: EurAccount? = null,
    private val gbpAccount: GbpExternalAccountInfo? = null,
    private val hkdAccount: HkdExternalAccountInfo? = null,
    private val idrAccount: IdrExternalAccountInfo? = null,
    private val inrAccount: InrExternalAccountInfo? = null,
    private val kesAccount: KesAccount? = null,
    private val mxnAccount: MxnExternalAccountInfo? = null,
    private val myrAccount: MyrExternalAccountInfo? = null,
    private val ngnAccount: NgnAccount? = null,
    private val phpAccount: PhpExternalAccountInfo? = null,
    private val rwfAccount: RwfAccount? = null,
    private val sgdAccount: SgdExternalAccountInfo? = null,
    private val thbAccount: ThbExternalAccountInfo? = null,
    private val tzsAccount: TzsAccount? = null,
    private val usdAccount: UsdExternalAccountInfo? = null,
    private val vndAccount: VndExternalAccountInfo? = null,
    private val zarAccount: ZarAccount? = null,
    private val zmwAccount: ZmwAccount? = null,
    private val sparkWallet: SparkWalletInfo? = null,
    private val lightning: LightningWalletInfo? = null,
    private val solanaWallet: SolanaWalletInfo? = null,
    private val tronWallet: TronWalletInfo? = null,
    private val polygonWallet: PolygonWalletInfo? = null,
    private val baseWallet: BaseWalletInfo? = null,
    private val _json: JsonValue? = null,
) {

    fun brlAccount(): BrlExternalAccountInfo? = brlAccount

    fun cadAccount(): CadAccount? = cadAccount

    fun dkkAccount(): DkkExternalAccountInfo? = dkkAccount

    fun eurAccount(): EurAccount? = eurAccount

    fun gbpAccount(): GbpExternalAccountInfo? = gbpAccount

    fun hkdAccount(): HkdExternalAccountInfo? = hkdAccount

    fun idrAccount(): IdrExternalAccountInfo? = idrAccount

    fun inrAccount(): InrExternalAccountInfo? = inrAccount

    fun kesAccount(): KesAccount? = kesAccount

    fun mxnAccount(): MxnExternalAccountInfo? = mxnAccount

    fun myrAccount(): MyrExternalAccountInfo? = myrAccount

    fun ngnAccount(): NgnAccount? = ngnAccount

    fun phpAccount(): PhpExternalAccountInfo? = phpAccount

    fun rwfAccount(): RwfAccount? = rwfAccount

    fun sgdAccount(): SgdExternalAccountInfo? = sgdAccount

    fun thbAccount(): ThbExternalAccountInfo? = thbAccount

    fun tzsAccount(): TzsAccount? = tzsAccount

    fun usdAccount(): UsdExternalAccountInfo? = usdAccount

    fun vndAccount(): VndExternalAccountInfo? = vndAccount

    fun zarAccount(): ZarAccount? = zarAccount

    fun zmwAccount(): ZmwAccount? = zmwAccount

    fun sparkWallet(): SparkWalletInfo? = sparkWallet

    fun lightning(): LightningWalletInfo? = lightning

    fun solanaWallet(): SolanaWalletInfo? = solanaWallet

    fun tronWallet(): TronWalletInfo? = tronWallet

    fun polygonWallet(): PolygonWalletInfo? = polygonWallet

    fun baseWallet(): BaseWalletInfo? = baseWallet

    fun isBrlAccount(): Boolean = brlAccount != null

    fun isCadAccount(): Boolean = cadAccount != null

    fun isDkkAccount(): Boolean = dkkAccount != null

    fun isEurAccount(): Boolean = eurAccount != null

    fun isGbpAccount(): Boolean = gbpAccount != null

    fun isHkdAccount(): Boolean = hkdAccount != null

    fun isIdrAccount(): Boolean = idrAccount != null

    fun isInrAccount(): Boolean = inrAccount != null

    fun isKesAccount(): Boolean = kesAccount != null

    fun isMxnAccount(): Boolean = mxnAccount != null

    fun isMyrAccount(): Boolean = myrAccount != null

    fun isNgnAccount(): Boolean = ngnAccount != null

    fun isPhpAccount(): Boolean = phpAccount != null

    fun isRwfAccount(): Boolean = rwfAccount != null

    fun isSgdAccount(): Boolean = sgdAccount != null

    fun isThbAccount(): Boolean = thbAccount != null

    fun isTzsAccount(): Boolean = tzsAccount != null

    fun isUsdAccount(): Boolean = usdAccount != null

    fun isVndAccount(): Boolean = vndAccount != null

    fun isZarAccount(): Boolean = zarAccount != null

    fun isZmwAccount(): Boolean = zmwAccount != null

    fun isSparkWallet(): Boolean = sparkWallet != null

    fun isLightning(): Boolean = lightning != null

    fun isSolanaWallet(): Boolean = solanaWallet != null

    fun isTronWallet(): Boolean = tronWallet != null

    fun isPolygonWallet(): Boolean = polygonWallet != null

    fun isBaseWallet(): Boolean = baseWallet != null

    fun asBrlAccount(): BrlExternalAccountInfo = brlAccount.getOrThrow("brlAccount")

    fun asCadAccount(): CadAccount = cadAccount.getOrThrow("cadAccount")

    fun asDkkAccount(): DkkExternalAccountInfo = dkkAccount.getOrThrow("dkkAccount")

    fun asEurAccount(): EurAccount = eurAccount.getOrThrow("eurAccount")

    fun asGbpAccount(): GbpExternalAccountInfo = gbpAccount.getOrThrow("gbpAccount")

    fun asHkdAccount(): HkdExternalAccountInfo = hkdAccount.getOrThrow("hkdAccount")

    fun asIdrAccount(): IdrExternalAccountInfo = idrAccount.getOrThrow("idrAccount")

    fun asInrAccount(): InrExternalAccountInfo = inrAccount.getOrThrow("inrAccount")

    fun asKesAccount(): KesAccount = kesAccount.getOrThrow("kesAccount")

    fun asMxnAccount(): MxnExternalAccountInfo = mxnAccount.getOrThrow("mxnAccount")

    fun asMyrAccount(): MyrExternalAccountInfo = myrAccount.getOrThrow("myrAccount")

    fun asNgnAccount(): NgnAccount = ngnAccount.getOrThrow("ngnAccount")

    fun asPhpAccount(): PhpExternalAccountInfo = phpAccount.getOrThrow("phpAccount")

    fun asRwfAccount(): RwfAccount = rwfAccount.getOrThrow("rwfAccount")

    fun asSgdAccount(): SgdExternalAccountInfo = sgdAccount.getOrThrow("sgdAccount")

    fun asThbAccount(): ThbExternalAccountInfo = thbAccount.getOrThrow("thbAccount")

    fun asTzsAccount(): TzsAccount = tzsAccount.getOrThrow("tzsAccount")

    fun asUsdAccount(): UsdExternalAccountInfo = usdAccount.getOrThrow("usdAccount")

    fun asVndAccount(): VndExternalAccountInfo = vndAccount.getOrThrow("vndAccount")

    fun asZarAccount(): ZarAccount = zarAccount.getOrThrow("zarAccount")

    fun asZmwAccount(): ZmwAccount = zmwAccount.getOrThrow("zmwAccount")

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
            cadAccount != null -> visitor.visitCadAccount(cadAccount)
            dkkAccount != null -> visitor.visitDkkAccount(dkkAccount)
            eurAccount != null -> visitor.visitEurAccount(eurAccount)
            gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
            hkdAccount != null -> visitor.visitHkdAccount(hkdAccount)
            idrAccount != null -> visitor.visitIdrAccount(idrAccount)
            inrAccount != null -> visitor.visitInrAccount(inrAccount)
            kesAccount != null -> visitor.visitKesAccount(kesAccount)
            mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
            myrAccount != null -> visitor.visitMyrAccount(myrAccount)
            ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
            phpAccount != null -> visitor.visitPhpAccount(phpAccount)
            rwfAccount != null -> visitor.visitRwfAccount(rwfAccount)
            sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
            thbAccount != null -> visitor.visitThbAccount(thbAccount)
            tzsAccount != null -> visitor.visitTzsAccount(tzsAccount)
            usdAccount != null -> visitor.visitUsdAccount(usdAccount)
            vndAccount != null -> visitor.visitVndAccount(vndAccount)
            zarAccount != null -> visitor.visitZarAccount(zarAccount)
            zmwAccount != null -> visitor.visitZmwAccount(zmwAccount)
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

                override fun visitCadAccount(cadAccount: CadAccount) {
                    cadAccount.validate()
                }

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo) {
                    dkkAccount.validate()
                }

                override fun visitEurAccount(eurAccount: EurAccount) {
                    eurAccount.validate()
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

                override fun visitKesAccount(kesAccount: KesAccount) {
                    kesAccount.validate()
                }

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) {
                    mxnAccount.validate()
                }

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) {
                    myrAccount.validate()
                }

                override fun visitNgnAccount(ngnAccount: NgnAccount) {
                    ngnAccount.validate()
                }

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) {
                    phpAccount.validate()
                }

                override fun visitRwfAccount(rwfAccount: RwfAccount) {
                    rwfAccount.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) {
                    sgdAccount.validate()
                }

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) {
                    thbAccount.validate()
                }

                override fun visitTzsAccount(tzsAccount: TzsAccount) {
                    tzsAccount.validate()
                }

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) {
                    usdAccount.validate()
                }

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) {
                    vndAccount.validate()
                }

                override fun visitZarAccount(zarAccount: ZarAccount) {
                    zarAccount.validate()
                }

                override fun visitZmwAccount(zmwAccount: ZmwAccount) {
                    zmwAccount.validate()
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

                override fun visitCadAccount(cadAccount: CadAccount) = cadAccount.validity()

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo) =
                    dkkAccount.validity()

                override fun visitEurAccount(eurAccount: EurAccount) = eurAccount.validity()

                override fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo) =
                    gbpAccount.validity()

                override fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo) =
                    hkdAccount.validity()

                override fun visitIdrAccount(idrAccount: IdrExternalAccountInfo) =
                    idrAccount.validity()

                override fun visitInrAccount(inrAccount: InrExternalAccountInfo) =
                    inrAccount.validity()

                override fun visitKesAccount(kesAccount: KesAccount) = kesAccount.validity()

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) =
                    mxnAccount.validity()

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) =
                    myrAccount.validity()

                override fun visitNgnAccount(ngnAccount: NgnAccount) = ngnAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) =
                    phpAccount.validity()

                override fun visitRwfAccount(rwfAccount: RwfAccount) = rwfAccount.validity()

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) =
                    sgdAccount.validity()

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) =
                    thbAccount.validity()

                override fun visitTzsAccount(tzsAccount: TzsAccount) = tzsAccount.validity()

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) =
                    usdAccount.validity()

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) =
                    vndAccount.validity()

                override fun visitZarAccount(zarAccount: ZarAccount) = zarAccount.validity()

                override fun visitZmwAccount(zmwAccount: ZmwAccount) = zmwAccount.validity()

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
            cadAccount == other.cadAccount &&
            dkkAccount == other.dkkAccount &&
            eurAccount == other.eurAccount &&
            gbpAccount == other.gbpAccount &&
            hkdAccount == other.hkdAccount &&
            idrAccount == other.idrAccount &&
            inrAccount == other.inrAccount &&
            kesAccount == other.kesAccount &&
            mxnAccount == other.mxnAccount &&
            myrAccount == other.myrAccount &&
            ngnAccount == other.ngnAccount &&
            phpAccount == other.phpAccount &&
            rwfAccount == other.rwfAccount &&
            sgdAccount == other.sgdAccount &&
            thbAccount == other.thbAccount &&
            tzsAccount == other.tzsAccount &&
            usdAccount == other.usdAccount &&
            vndAccount == other.vndAccount &&
            zarAccount == other.zarAccount &&
            zmwAccount == other.zmwAccount &&
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
            cadAccount,
            dkkAccount,
            eurAccount,
            gbpAccount,
            hkdAccount,
            idrAccount,
            inrAccount,
            kesAccount,
            mxnAccount,
            myrAccount,
            ngnAccount,
            phpAccount,
            rwfAccount,
            sgdAccount,
            thbAccount,
            tzsAccount,
            usdAccount,
            vndAccount,
            zarAccount,
            zmwAccount,
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
            cadAccount != null -> "ExternalAccountInfoOneOf{cadAccount=$cadAccount}"
            dkkAccount != null -> "ExternalAccountInfoOneOf{dkkAccount=$dkkAccount}"
            eurAccount != null -> "ExternalAccountInfoOneOf{eurAccount=$eurAccount}"
            gbpAccount != null -> "ExternalAccountInfoOneOf{gbpAccount=$gbpAccount}"
            hkdAccount != null -> "ExternalAccountInfoOneOf{hkdAccount=$hkdAccount}"
            idrAccount != null -> "ExternalAccountInfoOneOf{idrAccount=$idrAccount}"
            inrAccount != null -> "ExternalAccountInfoOneOf{inrAccount=$inrAccount}"
            kesAccount != null -> "ExternalAccountInfoOneOf{kesAccount=$kesAccount}"
            mxnAccount != null -> "ExternalAccountInfoOneOf{mxnAccount=$mxnAccount}"
            myrAccount != null -> "ExternalAccountInfoOneOf{myrAccount=$myrAccount}"
            ngnAccount != null -> "ExternalAccountInfoOneOf{ngnAccount=$ngnAccount}"
            phpAccount != null -> "ExternalAccountInfoOneOf{phpAccount=$phpAccount}"
            rwfAccount != null -> "ExternalAccountInfoOneOf{rwfAccount=$rwfAccount}"
            sgdAccount != null -> "ExternalAccountInfoOneOf{sgdAccount=$sgdAccount}"
            thbAccount != null -> "ExternalAccountInfoOneOf{thbAccount=$thbAccount}"
            tzsAccount != null -> "ExternalAccountInfoOneOf{tzsAccount=$tzsAccount}"
            usdAccount != null -> "ExternalAccountInfoOneOf{usdAccount=$usdAccount}"
            vndAccount != null -> "ExternalAccountInfoOneOf{vndAccount=$vndAccount}"
            zarAccount != null -> "ExternalAccountInfoOneOf{zarAccount=$zarAccount}"
            zmwAccount != null -> "ExternalAccountInfoOneOf{zmwAccount=$zmwAccount}"
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

        fun ofCadAccount(cadAccount: CadAccount) = ExternalAccountInfoOneOf(cadAccount = cadAccount)

        fun ofDkkAccount(dkkAccount: DkkExternalAccountInfo) =
            ExternalAccountInfoOneOf(dkkAccount = dkkAccount)

        fun ofEurAccount(eurAccount: EurAccount) = ExternalAccountInfoOneOf(eurAccount = eurAccount)

        fun ofGbpAccount(gbpAccount: GbpExternalAccountInfo) =
            ExternalAccountInfoOneOf(gbpAccount = gbpAccount)

        fun ofHkdAccount(hkdAccount: HkdExternalAccountInfo) =
            ExternalAccountInfoOneOf(hkdAccount = hkdAccount)

        fun ofIdrAccount(idrAccount: IdrExternalAccountInfo) =
            ExternalAccountInfoOneOf(idrAccount = idrAccount)

        fun ofInrAccount(inrAccount: InrExternalAccountInfo) =
            ExternalAccountInfoOneOf(inrAccount = inrAccount)

        fun ofKesAccount(kesAccount: KesAccount) = ExternalAccountInfoOneOf(kesAccount = kesAccount)

        fun ofMxnAccount(mxnAccount: MxnExternalAccountInfo) =
            ExternalAccountInfoOneOf(mxnAccount = mxnAccount)

        fun ofMyrAccount(myrAccount: MyrExternalAccountInfo) =
            ExternalAccountInfoOneOf(myrAccount = myrAccount)

        fun ofNgnAccount(ngnAccount: NgnAccount) = ExternalAccountInfoOneOf(ngnAccount = ngnAccount)

        fun ofPhpAccount(phpAccount: PhpExternalAccountInfo) =
            ExternalAccountInfoOneOf(phpAccount = phpAccount)

        fun ofRwfAccount(rwfAccount: RwfAccount) = ExternalAccountInfoOneOf(rwfAccount = rwfAccount)

        fun ofSgdAccount(sgdAccount: SgdExternalAccountInfo) =
            ExternalAccountInfoOneOf(sgdAccount = sgdAccount)

        fun ofThbAccount(thbAccount: ThbExternalAccountInfo) =
            ExternalAccountInfoOneOf(thbAccount = thbAccount)

        fun ofTzsAccount(tzsAccount: TzsAccount) = ExternalAccountInfoOneOf(tzsAccount = tzsAccount)

        fun ofUsdAccount(usdAccount: UsdExternalAccountInfo) =
            ExternalAccountInfoOneOf(usdAccount = usdAccount)

        fun ofVndAccount(vndAccount: VndExternalAccountInfo) =
            ExternalAccountInfoOneOf(vndAccount = vndAccount)

        fun ofZarAccount(zarAccount: ZarAccount) = ExternalAccountInfoOneOf(zarAccount = zarAccount)

        fun ofZmwAccount(zmwAccount: ZmwAccount) = ExternalAccountInfoOneOf(zmwAccount = zmwAccount)

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

        fun visitCadAccount(cadAccount: CadAccount): T

        fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo): T

        fun visitEurAccount(eurAccount: EurAccount): T

        fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo): T

        fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo): T

        fun visitIdrAccount(idrAccount: IdrExternalAccountInfo): T

        fun visitInrAccount(inrAccount: InrExternalAccountInfo): T

        fun visitKesAccount(kesAccount: KesAccount): T

        fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo): T

        fun visitMyrAccount(myrAccount: MyrExternalAccountInfo): T

        fun visitNgnAccount(ngnAccount: NgnAccount): T

        fun visitPhpAccount(phpAccount: PhpExternalAccountInfo): T

        fun visitRwfAccount(rwfAccount: RwfAccount): T

        fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo): T

        fun visitThbAccount(thbAccount: ThbExternalAccountInfo): T

        fun visitTzsAccount(tzsAccount: TzsAccount): T

        fun visitUsdAccount(usdAccount: UsdExternalAccountInfo): T

        fun visitVndAccount(vndAccount: VndExternalAccountInfo): T

        fun visitZarAccount(zarAccount: ZarAccount): T

        fun visitZmwAccount(zmwAccount: ZmwAccount): T

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
                "CAD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<CadAccount>())?.let {
                        ExternalAccountInfoOneOf(cadAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "DKK_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<DkkExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(dkkAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "EUR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<EurAccount>())?.let {
                        ExternalAccountInfoOneOf(eurAccount = it, _json = json)
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
                "KES_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<KesAccount>())?.let {
                        ExternalAccountInfoOneOf(kesAccount = it, _json = json)
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
                "NGN_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<NgnAccount>())?.let {
                        ExternalAccountInfoOneOf(ngnAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PHP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PhpExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(phpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "RWF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<RwfAccount>())?.let {
                        ExternalAccountInfoOneOf(rwfAccount = it, _json = json)
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
                "TZS_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<TzsAccount>())?.let {
                        ExternalAccountInfoOneOf(tzsAccount = it, _json = json)
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
                "ZAR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ZarAccount>())?.let {
                        ExternalAccountInfoOneOf(zarAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "ZMW_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ZmwAccount>())?.let {
                        ExternalAccountInfoOneOf(zmwAccount = it, _json = json)
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
                value.cadAccount != null -> generator.writeObject(value.cadAccount)
                value.dkkAccount != null -> generator.writeObject(value.dkkAccount)
                value.eurAccount != null -> generator.writeObject(value.eurAccount)
                value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                value.hkdAccount != null -> generator.writeObject(value.hkdAccount)
                value.idrAccount != null -> generator.writeObject(value.idrAccount)
                value.inrAccount != null -> generator.writeObject(value.inrAccount)
                value.kesAccount != null -> generator.writeObject(value.kesAccount)
                value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                value.myrAccount != null -> generator.writeObject(value.myrAccount)
                value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                value.phpAccount != null -> generator.writeObject(value.phpAccount)
                value.rwfAccount != null -> generator.writeObject(value.rwfAccount)
                value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                value.thbAccount != null -> generator.writeObject(value.thbAccount)
                value.tzsAccount != null -> generator.writeObject(value.tzsAccount)
                value.usdAccount != null -> generator.writeObject(value.usdAccount)
                value.vndAccount != null -> generator.writeObject(value.vndAccount)
                value.zarAccount != null -> generator.writeObject(value.zarAccount)
                value.zmwAccount != null -> generator.writeObject(value.zmwAccount)
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

    class CadAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankCode: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val branchCode: JsonField<String>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
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
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
        ) : this(
            accountNumber,
            accountType,
            bankCode,
            beneficiary,
            branchCode,
            countries,
            paymentRails,
            mutableMapOf(),
        )

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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

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

        /**
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

        /**
         * Returns the raw JSON value of [paymentRails].
         *
         * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentRails")
        @ExcludeMissing
        fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

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
             * .countries()
             * .paymentRails()
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
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cadAccount: CadAccount) = apply {
                accountNumber = cadAccount.accountNumber
                accountType = cadAccount.accountType
                bankCode = cadAccount.bankCode
                beneficiary = cadAccount.beneficiary
                branchCode = cadAccount.branchCode
                countries = cadAccount.countries.map { it.toMutableList() }
                paymentRails = cadAccount.paymentRails.map { it.toMutableList() }
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * .countries()
             * .paymentRails()
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
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
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
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
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
                (if (branchCode.asKnown() == null) 0 else 1) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val CA = of("CA")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                CA
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CA,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    CA -> Value.CA
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
                    CA -> Known.CA
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val BANK_TRANSFER = of("BANK_TRANSFER")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                BANK_TRANSFER
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BANK_TRANSFER,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BANK_TRANSFER -> Value.BANK_TRANSFER
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
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

            return other is CadAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankCode == other.bankCode &&
                beneficiary == other.beneficiary &&
                branchCode == other.branchCode &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankCode,
                beneficiary,
                branchCode,
                countries,
                paymentRails,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CadAccount{accountNumber=$accountNumber, accountType=$accountType, bankCode=$bankCode, beneficiary=$beneficiary, branchCode=$branchCode, countries=$countries, paymentRails=$paymentRails, additionalProperties=$additionalProperties}"
    }

    class EurAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val iban: JsonField<String>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val swiftBic: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("swiftBic") @ExcludeMissing swiftBic: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, countries, iban, paymentRails, swiftBic, mutableMapOf())

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("EUR_ACCOUNT")
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * The IBAN of the bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun iban(): String = iban.getRequired("iban")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

        /**
         * The SWIFT BIC of the bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun swiftBic(): String? = swiftBic.getNullable("swiftBic")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

        /**
         * Returns the raw JSON value of [iban].
         *
         * Unlike [iban], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("iban") @ExcludeMissing fun _iban(): JsonField<String> = iban

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
             * Returns a mutable builder for constructing an instance of [EurAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .iban()
             * .paymentRails()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EurAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("EUR_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var iban: JsonField<String>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var swiftBic: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eurAccount: EurAccount) = apply {
                accountType = eurAccount.accountType
                beneficiary = eurAccount.beneficiary
                countries = eurAccount.countries.map { it.toMutableList() }
                iban = eurAccount.iban
                paymentRails = eurAccount.paymentRails.map { it.toMutableList() }
                swiftBic = eurAccount.swiftBic
                additionalProperties = eurAccount.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("EUR_ACCOUNT")
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            /** The IBAN of the bank */
            fun iban(iban: String) = iban(JsonField.of(iban))

            /**
             * Sets [Builder.iban] to an arbitrary JSON value.
             *
             * You should usually call [Builder.iban] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun iban(iban: JsonField<String>) = apply { this.iban = iban }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** The SWIFT BIC of the bank */
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
             * Returns an immutable instance of [EurAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .iban()
             * .paymentRails()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EurAccount =
                EurAccount(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("iban", iban),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    swiftBic,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EurAccount = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("EUR_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            iban()
            paymentRails().forEach { it.validate() }
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
            accountType.let { if (it == JsonValue.from("EUR_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (iban.asKnown() == null) 0 else 1) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val AT = of("AT")

                val BE = of("BE")

                val CY = of("CY")

                val DE = of("DE")

                val EE = of("EE")

                val ES = of("ES")

                val FI = of("FI")

                val FR = of("FR")

                val GR = of("GR")

                val HR = of("HR")

                val IE = of("IE")

                val IT = of("IT")

                val LT = of("LT")

                val LU = of("LU")

                val LV = of("LV")

                val MT = of("MT")

                val NL = of("NL")

                val PT = of("PT")

                val SI = of("SI")

                val SK = of("SK")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                AT,
                BE,
                CY,
                DE,
                EE,
                ES,
                FI,
                FR,
                GR,
                HR,
                IE,
                IT,
                LT,
                LU,
                LV,
                MT,
                NL,
                PT,
                SI,
                SK,
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AT,
                BE,
                CY,
                DE,
                EE,
                ES,
                FI,
                FR,
                GR,
                HR,
                IE,
                IT,
                LT,
                LU,
                LV,
                MT,
                NL,
                PT,
                SI,
                SK,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    AT -> Value.AT
                    BE -> Value.BE
                    CY -> Value.CY
                    DE -> Value.DE
                    EE -> Value.EE
                    ES -> Value.ES
                    FI -> Value.FI
                    FR -> Value.FR
                    GR -> Value.GR
                    HR -> Value.HR
                    IE -> Value.IE
                    IT -> Value.IT
                    LT -> Value.LT
                    LU -> Value.LU
                    LV -> Value.LV
                    MT -> Value.MT
                    NL -> Value.NL
                    PT -> Value.PT
                    SI -> Value.SI
                    SK -> Value.SK
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
                    AT -> Known.AT
                    BE -> Known.BE
                    CY -> Known.CY
                    DE -> Known.DE
                    EE -> Known.EE
                    ES -> Known.ES
                    FI -> Known.FI
                    FR -> Known.FR
                    GR -> Known.GR
                    HR -> Known.HR
                    IE -> Known.IE
                    IT -> Known.IT
                    LT -> Known.LT
                    LU -> Known.LU
                    LV -> Known.LV
                    MT -> Known.MT
                    NL -> Known.NL
                    PT -> Known.PT
                    SI -> Known.SI
                    SK -> Known.SK
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val SEPA = of("SEPA")

                val SEPA_INSTANT = of("SEPA_INSTANT")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                SEPA,
                SEPA_INSTANT,
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SEPA,
                SEPA_INSTANT,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    SEPA -> Value.SEPA
                    SEPA_INSTANT -> Value.SEPA_INSTANT
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
                    SEPA -> Known.SEPA
                    SEPA_INSTANT -> Known.SEPA_INSTANT
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

            return other is EurAccount &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                iban == other.iban &&
                paymentRails == other.paymentRails &&
                swiftBic == other.swiftBic &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                countries,
                iban,
                paymentRails,
                swiftBic,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EurAccount{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, iban=$iban, paymentRails=$paymentRails, swiftBic=$swiftBic, additionalProperties=$additionalProperties}"
    }

    class KesAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
        ) : this(
            accountType,
            beneficiary,
            countries,
            paymentRails,
            phoneNumber,
            provider,
            mutableMapOf(),
        )

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("KES_ACCOUNT")
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

        /**
         * Kenyan mobile money phone number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

        /**
         * Mobile money provider
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): Provider = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

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
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

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
             * Returns a mutable builder for constructing an instance of [KesAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [KesAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("KES_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<Provider>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(kesAccount: KesAccount) = apply {
                accountType = kesAccount.accountType
                beneficiary = kesAccount.beneficiary
                countries = kesAccount.countries.map { it.toMutableList() }
                paymentRails = kesAccount.paymentRails.map { it.toMutableList() }
                phoneNumber = kesAccount.phoneNumber
                provider = kesAccount.provider
                additionalProperties = kesAccount.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("KES_ACCOUNT")
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Kenyan mobile money phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Mobile money provider */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [KesAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): KesAccount =
                KesAccount(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): KesAccount = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("KES_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider().validate()
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
            accountType.let { if (it == JsonValue.from("KES_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (provider.asKnown()?.validity() ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val KE = of("KE")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                KE
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                KE,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    KE -> Value.KE
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
                    KE -> Known.KE
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val MOBILE_MONEY = of("MOBILE_MONEY")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                MOBILE_MONEY
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MOBILE_MONEY -> Value.MOBILE_MONEY
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
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

        /** Mobile money provider */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val M_PESA = of("M-PESA")

                fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                M_PESA
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                M_PESA,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    M_PESA -> Value.M_PESA
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
                    M_PESA -> Known.M_PESA
                    else -> throw LightsparkGridInvalidDataException("Unknown Provider: $value")
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

            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is KesAccount &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                countries,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KesAccount{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class NgnAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankName: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
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
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
        ) : this(
            accountNumber,
            accountType,
            bankName,
            beneficiary,
            countries,
            paymentRails,
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

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
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

        /**
         * Returns the raw JSON value of [paymentRails].
         *
         * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentRails")
        @ExcludeMissing
        fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

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
             * .countries()
             * .paymentRails()
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
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ngnAccount: NgnAccount) = apply {
                accountNumber = ngnAccount.accountNumber
                accountType = ngnAccount.accountType
                bankName = ngnAccount.bankName
                beneficiary = ngnAccount.beneficiary
                countries = ngnAccount.countries.map { it.toMutableList() }
                paymentRails = ngnAccount.paymentRails.map { it.toMutableList() }
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * .countries()
             * .paymentRails()
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
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
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
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
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
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val NG = of("NG")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                NG
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NG,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    NG -> Value.NG
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
                    NG -> Known.NG
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val BANK_TRANSFER = of("BANK_TRANSFER")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                BANK_TRANSFER
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BANK_TRANSFER,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BANK_TRANSFER -> Value.BANK_TRANSFER
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
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

            return other is NgnAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankName,
                beneficiary,
                countries,
                paymentRails,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NgnAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, additionalProperties=$additionalProperties}"
    }

    class RwfAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
        ) : this(
            accountType,
            beneficiary,
            countries,
            paymentRails,
            phoneNumber,
            provider,
            mutableMapOf(),
        )

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("RWF_ACCOUNT")
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

        /**
         * Rwandan mobile money phone number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

        /**
         * Mobile money provider
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): Provider = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

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
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

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
             * Returns a mutable builder for constructing an instance of [RwfAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RwfAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("RWF_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<Provider>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rwfAccount: RwfAccount) = apply {
                accountType = rwfAccount.accountType
                beneficiary = rwfAccount.beneficiary
                countries = rwfAccount.countries.map { it.toMutableList() }
                paymentRails = rwfAccount.paymentRails.map { it.toMutableList() }
                phoneNumber = rwfAccount.phoneNumber
                provider = rwfAccount.provider
                additionalProperties = rwfAccount.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("RWF_ACCOUNT")
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Rwandan mobile money phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Mobile money provider */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [RwfAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RwfAccount =
                RwfAccount(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RwfAccount = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("RWF_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider().validate()
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
            accountType.let { if (it == JsonValue.from("RWF_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (provider.asKnown()?.validity() ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val RW = of("RW")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                RW
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                RW,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    RW -> Value.RW
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
                    RW -> Known.RW
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val MOBILE_MONEY = of("MOBILE_MONEY")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                MOBILE_MONEY
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MOBILE_MONEY -> Value.MOBILE_MONEY
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
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

        /** Mobile money provider */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val MTN = of("MTN")

                val AIRTEL = of("AIRTEL")

                fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                MTN,
                AIRTEL,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                MTN,
                AIRTEL,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    MTN -> Value.MTN
                    AIRTEL -> Value.AIRTEL
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
                    MTN -> Known.MTN
                    AIRTEL -> Known.AIRTEL
                    else -> throw LightsparkGridInvalidDataException("Unknown Provider: $value")
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

            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RwfAccount &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                countries,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RwfAccount{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class TzsAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
        ) : this(
            accountType,
            beneficiary,
            countries,
            paymentRails,
            phoneNumber,
            provider,
            mutableMapOf(),
        )

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("TZS_ACCOUNT")
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

        /**
         * Tanzanian mobile money phone number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

        /**
         * Mobile money provider
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): Provider = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

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
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

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
             * Returns a mutable builder for constructing an instance of [TzsAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TzsAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("TZS_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<Provider>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tzsAccount: TzsAccount) = apply {
                accountType = tzsAccount.accountType
                beneficiary = tzsAccount.beneficiary
                countries = tzsAccount.countries.map { it.toMutableList() }
                paymentRails = tzsAccount.paymentRails.map { it.toMutableList() }
                phoneNumber = tzsAccount.phoneNumber
                provider = tzsAccount.provider
                additionalProperties = tzsAccount.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("TZS_ACCOUNT")
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Tanzanian mobile money phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Mobile money provider */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [TzsAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TzsAccount =
                TzsAccount(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TzsAccount = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("TZS_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider().validate()
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
            accountType.let { if (it == JsonValue.from("TZS_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (provider.asKnown()?.validity() ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val TZ = of("TZ")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                TZ
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TZ,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    TZ -> Value.TZ
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
                    TZ -> Known.TZ
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val MOBILE_MONEY = of("MOBILE_MONEY")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                MOBILE_MONEY
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MOBILE_MONEY -> Value.MOBILE_MONEY
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
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

        /** Mobile money provider */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val AIRTEL = of("AIRTEL")

                val VODACOM = of("VODACOM")

                fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                AIRTEL,
                VODACOM,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AIRTEL,
                VODACOM,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    AIRTEL -> Value.AIRTEL
                    VODACOM -> Value.VODACOM
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
                    AIRTEL -> Known.AIRTEL
                    VODACOM -> Known.VODACOM
                    else -> throw LightsparkGridInvalidDataException("Unknown Provider: $value")
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

            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TzsAccount &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                countries,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TzsAccount{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class ZarAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankName: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
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
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
        ) : this(
            accountNumber,
            accountType,
            bankName,
            beneficiary,
            countries,
            paymentRails,
            mutableMapOf(),
        )

        /**
         * South African bank account number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("ZAR_ACCOUNT")
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

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
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

        /**
         * Returns the raw JSON value of [paymentRails].
         *
         * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentRails")
        @ExcludeMissing
        fun _paymentRails(): JsonField<List<PaymentRail>> = paymentRails

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
             * Returns a mutable builder for constructing an instance of [ZarAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ZarAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("ZAR_ACCOUNT")
            private var bankName: JsonField<String>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(zarAccount: ZarAccount) = apply {
                accountNumber = zarAccount.accountNumber
                accountType = zarAccount.accountType
                bankName = zarAccount.bankName
                beneficiary = zarAccount.beneficiary
                countries = zarAccount.countries.map { it.toMutableList() }
                paymentRails = zarAccount.paymentRails.map { it.toMutableList() }
                additionalProperties = zarAccount.additionalProperties.toMutableMap()
            }

            /** South African bank account number */
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
             * JsonValue.from("ZAR_ACCOUNT")
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
             * Returns an immutable instance of [ZarAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ZarAccount =
                ZarAccount(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("bankName", bankName),
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ZarAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            _accountType().let {
                if (it != JsonValue.from("ZAR_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            bankName()
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
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
                accountType.let { if (it == JsonValue.from("ZAR_ACCOUNT")) 1 else 0 } +
                (if (bankName.asKnown() == null) 0 else 1) +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ZA = of("ZA")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                ZA
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ZA,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    ZA -> Value.ZA
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
                    ZA -> Known.ZA
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val BANK_TRANSFER = of("BANK_TRANSFER")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                BANK_TRANSFER
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BANK_TRANSFER,
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BANK_TRANSFER -> Value.BANK_TRANSFER
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
                    BANK_TRANSFER -> Known.BANK_TRANSFER
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

            return other is ZarAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankName,
                beneficiary,
                countries,
                paymentRails,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ZarAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, additionalProperties=$additionalProperties}"
    }

    class ZmwAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<Provider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("countries")
            @ExcludeMissing
            countries: JsonField<List<Country>> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
        ) : this(
            accountType,
            beneficiary,
            countries,
            paymentRails,
            phoneNumber,
            provider,
            mutableMapOf(),
        )

        /**
         * Expected to always return the following:
         * ```kotlin
         * JsonValue.from("ZMW_ACCOUNT")
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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countries(): List<Country> = countries.getRequired("countries")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun paymentRails(): List<PaymentRail> = paymentRails.getRequired("paymentRails")

        /**
         * Zambian mobile money phone number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phoneNumber")

        /**
         * Mobile money provider
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): Provider = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

        /**
         * Returns the raw JSON value of [countries].
         *
         * Unlike [countries], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("countries")
        @ExcludeMissing
        fun _countries(): JsonField<List<Country>> = countries

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
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phoneNumber")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

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
             * Returns a mutable builder for constructing an instance of [ZmwAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ZmwAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("ZMW_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<Provider>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(zmwAccount: ZmwAccount) = apply {
                accountType = zmwAccount.accountType
                beneficiary = zmwAccount.beneficiary
                countries = zmwAccount.countries.map { it.toMutableList() }
                paymentRails = zmwAccount.paymentRails.map { it.toMutableList() }
                phoneNumber = zmwAccount.phoneNumber
                provider = zmwAccount.provider
                additionalProperties = zmwAccount.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("ZMW_ACCOUNT")
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

            /**
             * Alias for calling [beneficiary] with the following:
             * ```kotlin
             * Beneficiary.Individual.builder()
             *     .fullName(fullName)
             *     .build()
             * ```
             */
            fun individualBeneficiary(fullName: String) =
                beneficiary(Beneficiary.Individual.builder().fullName(fullName).build())

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

            fun countries(countries: List<Country>) = countries(JsonField.of(countries))

            /**
             * Sets [Builder.countries] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countries] with a well-typed `List<Country>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countries(countries: JsonField<List<Country>>) = apply {
                this.countries = countries.map { it.toMutableList() }
            }

            /**
             * Adds a single [Country] to [countries].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCountry(country: Country) = apply {
                countries =
                    (countries ?: JsonField.of(mutableListOf())).also {
                        checkKnown("countries", it).add(country)
                    }
            }

            fun paymentRails(paymentRails: List<PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed `List<PaymentRail>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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

            /** Zambian mobile money phone number */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /** Mobile money provider */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [ZmwAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .countries()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ZmwAccount =
                ZmwAccount(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("countries", countries).map { it.toImmutable() },
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ZmwAccount = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("ZMW_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider().validate()
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
            accountType.let { if (it == JsonValue.from("ZMW_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (provider.asKnown()?.validity() ?: 0)

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
                private val fullName: JsonField<String>,
                private val address: JsonField<Address>,
                private val birthDate: JsonField<String>,
                private val countryOfResidence: JsonField<String>,
                private val email: JsonField<String>,
                private val nationality: JsonField<String>,
                private val phoneNumber: JsonField<String>,
                private val registrationNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("beneficiaryType")
                    @ExcludeMissing
                    beneficiaryType: JsonValue = JsonMissing.of(),
                    @JsonProperty("fullName")
                    @ExcludeMissing
                    fullName: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("address")
                    @ExcludeMissing
                    address: JsonField<Address> = JsonMissing.of(),
                    @JsonProperty("birthDate")
                    @ExcludeMissing
                    birthDate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("countryOfResidence")
                    @ExcludeMissing
                    countryOfResidence: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("email")
                    @ExcludeMissing
                    email: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("nationality")
                    @ExcludeMissing
                    nationality: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("phoneNumber")
                    @ExcludeMissing
                    phoneNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("registrationNumber")
                    @ExcludeMissing
                    registrationNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
                    registrationNumber,
                    mutableMapOf(),
                )

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
                 * The full name of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun fullName(): String = fullName.getRequired("fullName")

                /**
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun address(): Address? = address.getNullable("address")

                /**
                 * The birth date of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun birthDate(): String? = birthDate.getNullable("birthDate")

                /**
                 * The country of residence of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun countryOfResidence(): String? =
                    countryOfResidence.getNullable("countryOfResidence")

                /**
                 * The email of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun email(): String? = email.getNullable("email")

                /**
                 * The nationality of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun nationality(): String? = nationality.getNullable("nationality")

                /**
                 * The phone number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

                /**
                 * The registration number of the beneficiary
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type (e.g. if the server responded with an unexpected value).
                 */
                fun registrationNumber(): String? =
                    registrationNumber.getNullable("registrationNumber")

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
                 * Returns the raw JSON value of [address].
                 *
                 * Unlike [address], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("address")
                @ExcludeMissing
                fun _address(): JsonField<Address> = address

                /**
                 * Returns the raw JSON value of [birthDate].
                 *
                 * Unlike [birthDate], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("birthDate")
                @ExcludeMissing
                fun _birthDate(): JsonField<String> = birthDate

                /**
                 * Returns the raw JSON value of [countryOfResidence].
                 *
                 * Unlike [countryOfResidence], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("countryOfResidence")
                @ExcludeMissing
                fun _countryOfResidence(): JsonField<String> = countryOfResidence

                /**
                 * Returns the raw JSON value of [email].
                 *
                 * Unlike [email], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns the raw JSON value of [phoneNumber].
                 *
                 * Unlike [phoneNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("phoneNumber")
                @ExcludeMissing
                fun _phoneNumber(): JsonField<String> = phoneNumber

                /**
                 * Returns the raw JSON value of [registrationNumber].
                 *
                 * Unlike [registrationNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("registrationNumber")
                @ExcludeMissing
                fun _registrationNumber(): JsonField<String> = registrationNumber

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
                     * .fullName()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Individual]. */
                class Builder internal constructor() {

                    private var beneficiaryType: JsonValue = JsonValue.from("INDIVIDUAL")
                    private var fullName: JsonField<String>? = null
                    private var address: JsonField<Address> = JsonMissing.of()
                    private var birthDate: JsonField<String> = JsonMissing.of()
                    private var countryOfResidence: JsonField<String> = JsonMissing.of()
                    private var email: JsonField<String> = JsonMissing.of()
                    private var nationality: JsonField<String> = JsonMissing.of()
                    private var phoneNumber: JsonField<String> = JsonMissing.of()
                    private var registrationNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(individual: Individual) = apply {
                        beneficiaryType = individual.beneficiaryType
                        fullName = individual.fullName
                        address = individual.address
                        birthDate = individual.birthDate
                        countryOfResidence = individual.countryOfResidence
                        email = individual.email
                        nationality = individual.nationality
                        phoneNumber = individual.phoneNumber
                        registrationNumber = individual.registrationNumber
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

                    /** The full name of the beneficiary */
                    fun fullName(fullName: String) = fullName(JsonField.of(fullName))

                    /**
                     * Sets [Builder.fullName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.fullName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun fullName(fullName: JsonField<String>) = apply { this.fullName = fullName }

                    fun address(address: Address) = address(JsonField.of(address))

                    /**
                     * Sets [Builder.address] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.address] with a well-typed [Address] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun address(address: JsonField<Address>) = apply { this.address = address }

                    /** The birth date of the beneficiary */
                    fun birthDate(birthDate: String) = birthDate(JsonField.of(birthDate))

                    /**
                     * Sets [Builder.birthDate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.birthDate] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun birthDate(birthDate: JsonField<String>) = apply {
                        this.birthDate = birthDate
                    }

                    /** The country of residence of the beneficiary */
                    fun countryOfResidence(countryOfResidence: String) =
                        countryOfResidence(JsonField.of(countryOfResidence))

                    /**
                     * Sets [Builder.countryOfResidence] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.countryOfResidence] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun countryOfResidence(countryOfResidence: JsonField<String>) = apply {
                        this.countryOfResidence = countryOfResidence
                    }

                    /** The email of the beneficiary */
                    fun email(email: String) = email(JsonField.of(email))

                    /**
                     * Sets [Builder.email] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.email] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun email(email: JsonField<String>) = apply { this.email = email }

                    /** The nationality of the beneficiary */
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

                    /** The phone number of the beneficiary */
                    fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

                    /**
                     * Sets [Builder.phoneNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.phoneNumber] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                        this.phoneNumber = phoneNumber
                    }

                    /** The registration number of the beneficiary */
                    fun registrationNumber(registrationNumber: String) =
                        registrationNumber(JsonField.of(registrationNumber))

                    /**
                     * Sets [Builder.registrationNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.registrationNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun registrationNumber(registrationNumber: JsonField<String>) = apply {
                        this.registrationNumber = registrationNumber
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
                     * Returns an immutable instance of [Individual].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .fullName()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Individual =
                        Individual(
                            beneficiaryType,
                            checkRequired("fullName", fullName),
                            address,
                            birthDate,
                            countryOfResidence,
                            email,
                            nationality,
                            phoneNumber,
                            registrationNumber,
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
                    fullName()
                    address()?.validate()
                    birthDate()
                    countryOfResidence()
                    email()
                    nationality()
                    phoneNumber()
                    registrationNumber()
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
                        (if (fullName.asKnown() == null) 0 else 1) +
                        (address.asKnown()?.validity() ?: 0) +
                        (if (birthDate.asKnown() == null) 0 else 1) +
                        (if (countryOfResidence.asKnown() == null) 0 else 1) +
                        (if (email.asKnown() == null) 0 else 1) +
                        (if (nationality.asKnown() == null) 0 else 1) +
                        (if (phoneNumber.asKnown() == null) 0 else 1) +
                        (if (registrationNumber.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Individual &&
                        beneficiaryType == other.beneficiaryType &&
                        fullName == other.fullName &&
                        address == other.address &&
                        birthDate == other.birthDate &&
                        countryOfResidence == other.countryOfResidence &&
                        email == other.email &&
                        nationality == other.nationality &&
                        phoneNumber == other.phoneNumber &&
                        registrationNumber == other.registrationNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        beneficiaryType,
                        fullName,
                        address,
                        birthDate,
                        countryOfResidence,
                        email,
                        nationality,
                        phoneNumber,
                        registrationNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, registrationNumber=$registrationNumber, additionalProperties=$additionalProperties}"
            }
        }

        class Country @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ZM = of("ZM")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                ZM
            }

            /**
             * An enum containing [Country]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Country] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ZM,
                /**
                 * An enum member indicating that [Country] was instantiated with an unknown value.
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
                    ZM -> Value.ZM
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
                    ZM -> Known.ZM
                    else -> throw LightsparkGridInvalidDataException("Unknown Country: $value")
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

            fun validate(): Country = apply {
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

                return other is Country && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class PaymentRail @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val MOBILE_MONEY = of("MOBILE_MONEY")

                fun of(value: String) = PaymentRail(JsonField.of(value))
            }

            /** An enum containing [PaymentRail]'s known values. */
            enum class Known {
                MOBILE_MONEY
            }

            /**
             * An enum containing [PaymentRail]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [PaymentRail] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    MOBILE_MONEY -> Value.MOBILE_MONEY
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
                    MOBILE_MONEY -> Known.MOBILE_MONEY
                    else -> throw LightsparkGridInvalidDataException("Unknown PaymentRail: $value")
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

        /** Mobile money provider */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val TNM = of("TNM")

                val AIRTEL = of("AIRTEL")

                val ZAMTEL = of("ZAMTEL")

                val MTN = of("MTN")

                fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                TNM,
                AIRTEL,
                ZAMTEL,
                MTN,
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                TNM,
                AIRTEL,
                ZAMTEL,
                MTN,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
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
                    TNM -> Value.TNM
                    AIRTEL -> Value.AIRTEL
                    ZAMTEL -> Value.ZAMTEL
                    MTN -> Value.MTN
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
                    TNM -> Known.TNM
                    AIRTEL -> Known.AIRTEL
                    ZAMTEL -> Known.ZAMTEL
                    MTN -> Known.MTN
                    else -> throw LightsparkGridInvalidDataException("Unknown Provider: $value")
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

            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ZmwAccount &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                countries == other.countries &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                countries,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ZmwAccount{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }
}
