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
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.platform.externalaccounts.CadAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import com.lightspark.grid.models.platform.externalaccounts.NgnAccountInfo
import java.util.Collections
import java.util.Objects

/**
 * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must be
 * provided.
 */
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
    private val kesExternalAccountInfo: KesExternalAccountInfo? = null,
    private val mwkExternalAccountInfo: MwkExternalAccountInfo? = null,
    private val mxnAccount: MxnExternalAccountInfo? = null,
    private val myrAccount: MyrExternalAccountInfo? = null,
    private val ngnAccount: NgnAccount? = null,
    private val phpAccount: PhpExternalAccountInfo? = null,
    private val rwfExternalAccountInfo: RwfExternalAccountInfo? = null,
    private val sgdAccount: SgdExternalAccountInfo? = null,
    private val thbAccount: ThbExternalAccountInfo? = null,
    private val tzsExternalAccountInfo: TzsExternalAccountInfo? = null,
    private val ugxExternalAccountInfo: UgxExternalAccountInfo? = null,
    private val usdAccount: UsdExternalAccountInfo? = null,
    private val vndAccount: VndExternalAccountInfo? = null,
    private val xofExternalAccountInfo: XofExternalAccountInfo? = null,
    private val zarExternalAccountInfo: ZarExternalAccountInfo? = null,
    private val zmwExternalAccountInfo: ZmwExternalAccountInfo? = null,
    private val sparkWalletInfo: SparkWalletInfo? = null,
    private val lightningWalletInfo: LightningWalletInfo? = null,
    private val solanaWalletInfo: SolanaWalletInfo? = null,
    private val tronWalletInfo: TronWalletInfo? = null,
    private val polygonWalletInfo: PolygonWalletInfo? = null,
    private val baseWalletInfo: BaseWalletInfo? = null,
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

    fun kesExternalAccountInfo(): KesExternalAccountInfo? = kesExternalAccountInfo

    fun mwkExternalAccountInfo(): MwkExternalAccountInfo? = mwkExternalAccountInfo

    fun mxnAccount(): MxnExternalAccountInfo? = mxnAccount

    fun myrAccount(): MyrExternalAccountInfo? = myrAccount

    fun ngnAccount(): NgnAccount? = ngnAccount

    fun phpAccount(): PhpExternalAccountInfo? = phpAccount

    fun rwfExternalAccountInfo(): RwfExternalAccountInfo? = rwfExternalAccountInfo

    fun sgdAccount(): SgdExternalAccountInfo? = sgdAccount

    fun thbAccount(): ThbExternalAccountInfo? = thbAccount

    fun tzsExternalAccountInfo(): TzsExternalAccountInfo? = tzsExternalAccountInfo

    fun ugxExternalAccountInfo(): UgxExternalAccountInfo? = ugxExternalAccountInfo

    fun usdAccount(): UsdExternalAccountInfo? = usdAccount

    fun vndAccount(): VndExternalAccountInfo? = vndAccount

    fun xofExternalAccountInfo(): XofExternalAccountInfo? = xofExternalAccountInfo

    fun zarExternalAccountInfo(): ZarExternalAccountInfo? = zarExternalAccountInfo

    fun zmwExternalAccountInfo(): ZmwExternalAccountInfo? = zmwExternalAccountInfo

    fun sparkWalletInfo(): SparkWalletInfo? = sparkWalletInfo

    /**
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     */
    fun lightningWalletInfo(): LightningWalletInfo? = lightningWalletInfo

    fun solanaWalletInfo(): SolanaWalletInfo? = solanaWalletInfo

    fun tronWalletInfo(): TronWalletInfo? = tronWalletInfo

    fun polygonWalletInfo(): PolygonWalletInfo? = polygonWalletInfo

    fun baseWalletInfo(): BaseWalletInfo? = baseWalletInfo

    fun isBrlAccount(): Boolean = brlAccount != null

    fun isCadAccount(): Boolean = cadAccount != null

    fun isDkkAccount(): Boolean = dkkAccount != null

    fun isEurAccount(): Boolean = eurAccount != null

    fun isGbpAccount(): Boolean = gbpAccount != null

    fun isHkdAccount(): Boolean = hkdAccount != null

    fun isIdrAccount(): Boolean = idrAccount != null

    fun isInrAccount(): Boolean = inrAccount != null

    fun isKesExternalAccountInfo(): Boolean = kesExternalAccountInfo != null

    fun isMwkExternalAccountInfo(): Boolean = mwkExternalAccountInfo != null

    fun isMxnAccount(): Boolean = mxnAccount != null

    fun isMyrAccount(): Boolean = myrAccount != null

    fun isNgnAccount(): Boolean = ngnAccount != null

    fun isPhpAccount(): Boolean = phpAccount != null

    fun isRwfExternalAccountInfo(): Boolean = rwfExternalAccountInfo != null

    fun isSgdAccount(): Boolean = sgdAccount != null

    fun isThbAccount(): Boolean = thbAccount != null

    fun isTzsExternalAccountInfo(): Boolean = tzsExternalAccountInfo != null

    fun isUgxExternalAccountInfo(): Boolean = ugxExternalAccountInfo != null

    fun isUsdAccount(): Boolean = usdAccount != null

    fun isVndAccount(): Boolean = vndAccount != null

    fun isXofExternalAccountInfo(): Boolean = xofExternalAccountInfo != null

    fun isZarExternalAccountInfo(): Boolean = zarExternalAccountInfo != null

    fun isZmwExternalAccountInfo(): Boolean = zmwExternalAccountInfo != null

    fun isSparkWalletInfo(): Boolean = sparkWalletInfo != null

    fun isLightningWalletInfo(): Boolean = lightningWalletInfo != null

    fun isSolanaWalletInfo(): Boolean = solanaWalletInfo != null

    fun isTronWalletInfo(): Boolean = tronWalletInfo != null

    fun isPolygonWalletInfo(): Boolean = polygonWalletInfo != null

    fun isBaseWalletInfo(): Boolean = baseWalletInfo != null

    fun asBrlAccount(): BrlExternalAccountInfo = brlAccount.getOrThrow("brlAccount")

    fun asCadAccount(): CadAccount = cadAccount.getOrThrow("cadAccount")

    fun asDkkAccount(): DkkExternalAccountInfo = dkkAccount.getOrThrow("dkkAccount")

    fun asEurAccount(): EurAccount = eurAccount.getOrThrow("eurAccount")

    fun asGbpAccount(): GbpExternalAccountInfo = gbpAccount.getOrThrow("gbpAccount")

    fun asHkdAccount(): HkdExternalAccountInfo = hkdAccount.getOrThrow("hkdAccount")

    fun asIdrAccount(): IdrExternalAccountInfo = idrAccount.getOrThrow("idrAccount")

    fun asInrAccount(): InrExternalAccountInfo = inrAccount.getOrThrow("inrAccount")

    fun asKesExternalAccountInfo(): KesExternalAccountInfo =
        kesExternalAccountInfo.getOrThrow("kesExternalAccountInfo")

    fun asMwkExternalAccountInfo(): MwkExternalAccountInfo =
        mwkExternalAccountInfo.getOrThrow("mwkExternalAccountInfo")

    fun asMxnAccount(): MxnExternalAccountInfo = mxnAccount.getOrThrow("mxnAccount")

    fun asMyrAccount(): MyrExternalAccountInfo = myrAccount.getOrThrow("myrAccount")

    fun asNgnAccount(): NgnAccount = ngnAccount.getOrThrow("ngnAccount")

    fun asPhpAccount(): PhpExternalAccountInfo = phpAccount.getOrThrow("phpAccount")

    fun asRwfExternalAccountInfo(): RwfExternalAccountInfo =
        rwfExternalAccountInfo.getOrThrow("rwfExternalAccountInfo")

    fun asSgdAccount(): SgdExternalAccountInfo = sgdAccount.getOrThrow("sgdAccount")

    fun asThbAccount(): ThbExternalAccountInfo = thbAccount.getOrThrow("thbAccount")

    fun asTzsExternalAccountInfo(): TzsExternalAccountInfo =
        tzsExternalAccountInfo.getOrThrow("tzsExternalAccountInfo")

    fun asUgxExternalAccountInfo(): UgxExternalAccountInfo =
        ugxExternalAccountInfo.getOrThrow("ugxExternalAccountInfo")

    fun asUsdAccount(): UsdExternalAccountInfo = usdAccount.getOrThrow("usdAccount")

    fun asVndAccount(): VndExternalAccountInfo = vndAccount.getOrThrow("vndAccount")

    fun asXofExternalAccountInfo(): XofExternalAccountInfo =
        xofExternalAccountInfo.getOrThrow("xofExternalAccountInfo")

    fun asZarExternalAccountInfo(): ZarExternalAccountInfo =
        zarExternalAccountInfo.getOrThrow("zarExternalAccountInfo")

    fun asZmwExternalAccountInfo(): ZmwExternalAccountInfo =
        zmwExternalAccountInfo.getOrThrow("zmwExternalAccountInfo")

    fun asSparkWalletInfo(): SparkWalletInfo = sparkWalletInfo.getOrThrow("sparkWalletInfo")

    /**
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     */
    fun asLightningWalletInfo(): LightningWalletInfo =
        lightningWalletInfo.getOrThrow("lightningWalletInfo")

    fun asSolanaWalletInfo(): SolanaWalletInfo = solanaWalletInfo.getOrThrow("solanaWalletInfo")

    fun asTronWalletInfo(): TronWalletInfo = tronWalletInfo.getOrThrow("tronWalletInfo")

    fun asPolygonWalletInfo(): PolygonWalletInfo = polygonWalletInfo.getOrThrow("polygonWalletInfo")

    fun asBaseWalletInfo(): BaseWalletInfo = baseWalletInfo.getOrThrow("baseWalletInfo")

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
            kesExternalAccountInfo != null ->
                visitor.visitKesExternalAccountInfo(kesExternalAccountInfo)
            mwkExternalAccountInfo != null ->
                visitor.visitMwkExternalAccountInfo(mwkExternalAccountInfo)
            mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
            myrAccount != null -> visitor.visitMyrAccount(myrAccount)
            ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
            phpAccount != null -> visitor.visitPhpAccount(phpAccount)
            rwfExternalAccountInfo != null ->
                visitor.visitRwfExternalAccountInfo(rwfExternalAccountInfo)
            sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
            thbAccount != null -> visitor.visitThbAccount(thbAccount)
            tzsExternalAccountInfo != null ->
                visitor.visitTzsExternalAccountInfo(tzsExternalAccountInfo)
            ugxExternalAccountInfo != null ->
                visitor.visitUgxExternalAccountInfo(ugxExternalAccountInfo)
            usdAccount != null -> visitor.visitUsdAccount(usdAccount)
            vndAccount != null -> visitor.visitVndAccount(vndAccount)
            xofExternalAccountInfo != null ->
                visitor.visitXofExternalAccountInfo(xofExternalAccountInfo)
            zarExternalAccountInfo != null ->
                visitor.visitZarExternalAccountInfo(zarExternalAccountInfo)
            zmwExternalAccountInfo != null ->
                visitor.visitZmwExternalAccountInfo(zmwExternalAccountInfo)
            sparkWalletInfo != null -> visitor.visitSparkWalletInfo(sparkWalletInfo)
            lightningWalletInfo != null -> visitor.visitLightningWalletInfo(lightningWalletInfo)
            solanaWalletInfo != null -> visitor.visitSolanaWalletInfo(solanaWalletInfo)
            tronWalletInfo != null -> visitor.visitTronWalletInfo(tronWalletInfo)
            polygonWalletInfo != null -> visitor.visitPolygonWalletInfo(polygonWalletInfo)
            baseWalletInfo != null -> visitor.visitBaseWalletInfo(baseWalletInfo)
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

                override fun visitKesExternalAccountInfo(
                    kesExternalAccountInfo: KesExternalAccountInfo
                ) {
                    kesExternalAccountInfo.validate()
                }

                override fun visitMwkExternalAccountInfo(
                    mwkExternalAccountInfo: MwkExternalAccountInfo
                ) {
                    mwkExternalAccountInfo.validate()
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

                override fun visitRwfExternalAccountInfo(
                    rwfExternalAccountInfo: RwfExternalAccountInfo
                ) {
                    rwfExternalAccountInfo.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) {
                    sgdAccount.validate()
                }

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) {
                    thbAccount.validate()
                }

                override fun visitTzsExternalAccountInfo(
                    tzsExternalAccountInfo: TzsExternalAccountInfo
                ) {
                    tzsExternalAccountInfo.validate()
                }

                override fun visitUgxExternalAccountInfo(
                    ugxExternalAccountInfo: UgxExternalAccountInfo
                ) {
                    ugxExternalAccountInfo.validate()
                }

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) {
                    usdAccount.validate()
                }

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) {
                    vndAccount.validate()
                }

                override fun visitXofExternalAccountInfo(
                    xofExternalAccountInfo: XofExternalAccountInfo
                ) {
                    xofExternalAccountInfo.validate()
                }

                override fun visitZarExternalAccountInfo(
                    zarExternalAccountInfo: ZarExternalAccountInfo
                ) {
                    zarExternalAccountInfo.validate()
                }

                override fun visitZmwExternalAccountInfo(
                    zmwExternalAccountInfo: ZmwExternalAccountInfo
                ) {
                    zmwExternalAccountInfo.validate()
                }

                override fun visitSparkWalletInfo(sparkWalletInfo: SparkWalletInfo) {
                    sparkWalletInfo.validate()
                }

                override fun visitLightningWalletInfo(lightningWalletInfo: LightningWalletInfo) {
                    lightningWalletInfo.validate()
                }

                override fun visitSolanaWalletInfo(solanaWalletInfo: SolanaWalletInfo) {
                    solanaWalletInfo.validate()
                }

                override fun visitTronWalletInfo(tronWalletInfo: TronWalletInfo) {
                    tronWalletInfo.validate()
                }

                override fun visitPolygonWalletInfo(polygonWalletInfo: PolygonWalletInfo) {
                    polygonWalletInfo.validate()
                }

                override fun visitBaseWalletInfo(baseWalletInfo: BaseWalletInfo) {
                    baseWalletInfo.validate()
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

                override fun visitKesExternalAccountInfo(
                    kesExternalAccountInfo: KesExternalAccountInfo
                ) = kesExternalAccountInfo.validity()

                override fun visitMwkExternalAccountInfo(
                    mwkExternalAccountInfo: MwkExternalAccountInfo
                ) = mwkExternalAccountInfo.validity()

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) =
                    mxnAccount.validity()

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) =
                    myrAccount.validity()

                override fun visitNgnAccount(ngnAccount: NgnAccount) = ngnAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) =
                    phpAccount.validity()

                override fun visitRwfExternalAccountInfo(
                    rwfExternalAccountInfo: RwfExternalAccountInfo
                ) = rwfExternalAccountInfo.validity()

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) =
                    sgdAccount.validity()

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) =
                    thbAccount.validity()

                override fun visitTzsExternalAccountInfo(
                    tzsExternalAccountInfo: TzsExternalAccountInfo
                ) = tzsExternalAccountInfo.validity()

                override fun visitUgxExternalAccountInfo(
                    ugxExternalAccountInfo: UgxExternalAccountInfo
                ) = ugxExternalAccountInfo.validity()

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) =
                    usdAccount.validity()

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) =
                    vndAccount.validity()

                override fun visitXofExternalAccountInfo(
                    xofExternalAccountInfo: XofExternalAccountInfo
                ) = xofExternalAccountInfo.validity()

                override fun visitZarExternalAccountInfo(
                    zarExternalAccountInfo: ZarExternalAccountInfo
                ) = zarExternalAccountInfo.validity()

                override fun visitZmwExternalAccountInfo(
                    zmwExternalAccountInfo: ZmwExternalAccountInfo
                ) = zmwExternalAccountInfo.validity()

                override fun visitSparkWalletInfo(sparkWalletInfo: SparkWalletInfo) =
                    sparkWalletInfo.validity()

                override fun visitLightningWalletInfo(lightningWalletInfo: LightningWalletInfo) =
                    lightningWalletInfo.validity()

                override fun visitSolanaWalletInfo(solanaWalletInfo: SolanaWalletInfo) =
                    solanaWalletInfo.validity()

                override fun visitTronWalletInfo(tronWalletInfo: TronWalletInfo) =
                    tronWalletInfo.validity()

                override fun visitPolygonWalletInfo(polygonWalletInfo: PolygonWalletInfo) =
                    polygonWalletInfo.validity()

                override fun visitBaseWalletInfo(baseWalletInfo: BaseWalletInfo) =
                    baseWalletInfo.validity()

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
            kesExternalAccountInfo == other.kesExternalAccountInfo &&
            mwkExternalAccountInfo == other.mwkExternalAccountInfo &&
            mxnAccount == other.mxnAccount &&
            myrAccount == other.myrAccount &&
            ngnAccount == other.ngnAccount &&
            phpAccount == other.phpAccount &&
            rwfExternalAccountInfo == other.rwfExternalAccountInfo &&
            sgdAccount == other.sgdAccount &&
            thbAccount == other.thbAccount &&
            tzsExternalAccountInfo == other.tzsExternalAccountInfo &&
            ugxExternalAccountInfo == other.ugxExternalAccountInfo &&
            usdAccount == other.usdAccount &&
            vndAccount == other.vndAccount &&
            xofExternalAccountInfo == other.xofExternalAccountInfo &&
            zarExternalAccountInfo == other.zarExternalAccountInfo &&
            zmwExternalAccountInfo == other.zmwExternalAccountInfo &&
            sparkWalletInfo == other.sparkWalletInfo &&
            lightningWalletInfo == other.lightningWalletInfo &&
            solanaWalletInfo == other.solanaWalletInfo &&
            tronWalletInfo == other.tronWalletInfo &&
            polygonWalletInfo == other.polygonWalletInfo &&
            baseWalletInfo == other.baseWalletInfo
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
            kesExternalAccountInfo,
            mwkExternalAccountInfo,
            mxnAccount,
            myrAccount,
            ngnAccount,
            phpAccount,
            rwfExternalAccountInfo,
            sgdAccount,
            thbAccount,
            tzsExternalAccountInfo,
            ugxExternalAccountInfo,
            usdAccount,
            vndAccount,
            xofExternalAccountInfo,
            zarExternalAccountInfo,
            zmwExternalAccountInfo,
            sparkWalletInfo,
            lightningWalletInfo,
            solanaWalletInfo,
            tronWalletInfo,
            polygonWalletInfo,
            baseWalletInfo,
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
            kesExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{kesExternalAccountInfo=$kesExternalAccountInfo}"
            mwkExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{mwkExternalAccountInfo=$mwkExternalAccountInfo}"
            mxnAccount != null -> "ExternalAccountInfoOneOf{mxnAccount=$mxnAccount}"
            myrAccount != null -> "ExternalAccountInfoOneOf{myrAccount=$myrAccount}"
            ngnAccount != null -> "ExternalAccountInfoOneOf{ngnAccount=$ngnAccount}"
            phpAccount != null -> "ExternalAccountInfoOneOf{phpAccount=$phpAccount}"
            rwfExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{rwfExternalAccountInfo=$rwfExternalAccountInfo}"
            sgdAccount != null -> "ExternalAccountInfoOneOf{sgdAccount=$sgdAccount}"
            thbAccount != null -> "ExternalAccountInfoOneOf{thbAccount=$thbAccount}"
            tzsExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{tzsExternalAccountInfo=$tzsExternalAccountInfo}"
            ugxExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{ugxExternalAccountInfo=$ugxExternalAccountInfo}"
            usdAccount != null -> "ExternalAccountInfoOneOf{usdAccount=$usdAccount}"
            vndAccount != null -> "ExternalAccountInfoOneOf{vndAccount=$vndAccount}"
            xofExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{xofExternalAccountInfo=$xofExternalAccountInfo}"
            zarExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{zarExternalAccountInfo=$zarExternalAccountInfo}"
            zmwExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{zmwExternalAccountInfo=$zmwExternalAccountInfo}"
            sparkWalletInfo != null -> "ExternalAccountInfoOneOf{sparkWalletInfo=$sparkWalletInfo}"
            lightningWalletInfo != null ->
                "ExternalAccountInfoOneOf{lightningWalletInfo=$lightningWalletInfo}"
            solanaWalletInfo != null ->
                "ExternalAccountInfoOneOf{solanaWalletInfo=$solanaWalletInfo}"
            tronWalletInfo != null -> "ExternalAccountInfoOneOf{tronWalletInfo=$tronWalletInfo}"
            polygonWalletInfo != null ->
                "ExternalAccountInfoOneOf{polygonWalletInfo=$polygonWalletInfo}"
            baseWalletInfo != null -> "ExternalAccountInfoOneOf{baseWalletInfo=$baseWalletInfo}"
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

        fun ofKesExternalAccountInfo(kesExternalAccountInfo: KesExternalAccountInfo) =
            ExternalAccountInfoOneOf(kesExternalAccountInfo = kesExternalAccountInfo)

        fun ofMwkExternalAccountInfo(mwkExternalAccountInfo: MwkExternalAccountInfo) =
            ExternalAccountInfoOneOf(mwkExternalAccountInfo = mwkExternalAccountInfo)

        fun ofMxnAccount(mxnAccount: MxnExternalAccountInfo) =
            ExternalAccountInfoOneOf(mxnAccount = mxnAccount)

        fun ofMyrAccount(myrAccount: MyrExternalAccountInfo) =
            ExternalAccountInfoOneOf(myrAccount = myrAccount)

        fun ofNgnAccount(ngnAccount: NgnAccount) = ExternalAccountInfoOneOf(ngnAccount = ngnAccount)

        fun ofPhpAccount(phpAccount: PhpExternalAccountInfo) =
            ExternalAccountInfoOneOf(phpAccount = phpAccount)

        fun ofRwfExternalAccountInfo(rwfExternalAccountInfo: RwfExternalAccountInfo) =
            ExternalAccountInfoOneOf(rwfExternalAccountInfo = rwfExternalAccountInfo)

        fun ofSgdAccount(sgdAccount: SgdExternalAccountInfo) =
            ExternalAccountInfoOneOf(sgdAccount = sgdAccount)

        fun ofThbAccount(thbAccount: ThbExternalAccountInfo) =
            ExternalAccountInfoOneOf(thbAccount = thbAccount)

        fun ofTzsExternalAccountInfo(tzsExternalAccountInfo: TzsExternalAccountInfo) =
            ExternalAccountInfoOneOf(tzsExternalAccountInfo = tzsExternalAccountInfo)

        fun ofUgxExternalAccountInfo(ugxExternalAccountInfo: UgxExternalAccountInfo) =
            ExternalAccountInfoOneOf(ugxExternalAccountInfo = ugxExternalAccountInfo)

        fun ofUsdAccount(usdAccount: UsdExternalAccountInfo) =
            ExternalAccountInfoOneOf(usdAccount = usdAccount)

        fun ofVndAccount(vndAccount: VndExternalAccountInfo) =
            ExternalAccountInfoOneOf(vndAccount = vndAccount)

        fun ofXofExternalAccountInfo(xofExternalAccountInfo: XofExternalAccountInfo) =
            ExternalAccountInfoOneOf(xofExternalAccountInfo = xofExternalAccountInfo)

        fun ofZarExternalAccountInfo(zarExternalAccountInfo: ZarExternalAccountInfo) =
            ExternalAccountInfoOneOf(zarExternalAccountInfo = zarExternalAccountInfo)

        fun ofZmwExternalAccountInfo(zmwExternalAccountInfo: ZmwExternalAccountInfo) =
            ExternalAccountInfoOneOf(zmwExternalAccountInfo = zmwExternalAccountInfo)

        fun ofSparkWalletInfo(sparkWalletInfo: SparkWalletInfo) =
            ExternalAccountInfoOneOf(sparkWalletInfo = sparkWalletInfo)

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun ofLightningWalletInfo(lightningWalletInfo: LightningWalletInfo) =
            ExternalAccountInfoOneOf(lightningWalletInfo = lightningWalletInfo)

        fun ofSolanaWalletInfo(solanaWalletInfo: SolanaWalletInfo) =
            ExternalAccountInfoOneOf(solanaWalletInfo = solanaWalletInfo)

        fun ofTronWalletInfo(tronWalletInfo: TronWalletInfo) =
            ExternalAccountInfoOneOf(tronWalletInfo = tronWalletInfo)

        fun ofPolygonWalletInfo(polygonWalletInfo: PolygonWalletInfo) =
            ExternalAccountInfoOneOf(polygonWalletInfo = polygonWalletInfo)

        fun ofBaseWalletInfo(baseWalletInfo: BaseWalletInfo) =
            ExternalAccountInfoOneOf(baseWalletInfo = baseWalletInfo)
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

        fun visitKesExternalAccountInfo(kesExternalAccountInfo: KesExternalAccountInfo): T

        fun visitMwkExternalAccountInfo(mwkExternalAccountInfo: MwkExternalAccountInfo): T

        fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo): T

        fun visitMyrAccount(myrAccount: MyrExternalAccountInfo): T

        fun visitNgnAccount(ngnAccount: NgnAccount): T

        fun visitPhpAccount(phpAccount: PhpExternalAccountInfo): T

        fun visitRwfExternalAccountInfo(rwfExternalAccountInfo: RwfExternalAccountInfo): T

        fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo): T

        fun visitThbAccount(thbAccount: ThbExternalAccountInfo): T

        fun visitTzsExternalAccountInfo(tzsExternalAccountInfo: TzsExternalAccountInfo): T

        fun visitUgxExternalAccountInfo(ugxExternalAccountInfo: UgxExternalAccountInfo): T

        fun visitUsdAccount(usdAccount: UsdExternalAccountInfo): T

        fun visitVndAccount(vndAccount: VndExternalAccountInfo): T

        fun visitXofExternalAccountInfo(xofExternalAccountInfo: XofExternalAccountInfo): T

        fun visitZarExternalAccountInfo(zarExternalAccountInfo: ZarExternalAccountInfo): T

        fun visitZmwExternalAccountInfo(zmwExternalAccountInfo: ZmwExternalAccountInfo): T

        fun visitSparkWalletInfo(sparkWalletInfo: SparkWalletInfo): T

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun visitLightningWalletInfo(lightningWalletInfo: LightningWalletInfo): T

        fun visitSolanaWalletInfo(solanaWalletInfo: SolanaWalletInfo): T

        fun visitTronWalletInfo(tronWalletInfo: TronWalletInfo): T

        fun visitPolygonWalletInfo(polygonWalletInfo: PolygonWalletInfo): T

        fun visitBaseWalletInfo(baseWalletInfo: BaseWalletInfo): T

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
            }

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<KesExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(kesExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<MwkExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(mwkExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<RwfExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(rwfExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TzsExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(tzsExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<UgxExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(ugxExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<XofExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(xofExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ZarExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(zarExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<ZmwExternalAccountInfo>())?.let {
                            ExternalAccountInfoOneOf(zmwExternalAccountInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SparkWalletInfo>())?.let {
                            ExternalAccountInfoOneOf(sparkWalletInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<LightningWalletInfo>())?.let {
                            ExternalAccountInfoOneOf(lightningWalletInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<SolanaWalletInfo>())?.let {
                            ExternalAccountInfoOneOf(solanaWalletInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<TronWalletInfo>())?.let {
                            ExternalAccountInfoOneOf(tronWalletInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<PolygonWalletInfo>())?.let {
                            ExternalAccountInfoOneOf(polygonWalletInfo = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<BaseWalletInfo>())?.let {
                            ExternalAccountInfoOneOf(baseWalletInfo = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ExternalAccountInfoOneOf(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
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
                value.kesExternalAccountInfo != null ->
                    generator.writeObject(value.kesExternalAccountInfo)
                value.mwkExternalAccountInfo != null ->
                    generator.writeObject(value.mwkExternalAccountInfo)
                value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                value.myrAccount != null -> generator.writeObject(value.myrAccount)
                value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                value.phpAccount != null -> generator.writeObject(value.phpAccount)
                value.rwfExternalAccountInfo != null ->
                    generator.writeObject(value.rwfExternalAccountInfo)
                value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                value.thbAccount != null -> generator.writeObject(value.thbAccount)
                value.tzsExternalAccountInfo != null ->
                    generator.writeObject(value.tzsExternalAccountInfo)
                value.ugxExternalAccountInfo != null ->
                    generator.writeObject(value.ugxExternalAccountInfo)
                value.usdAccount != null -> generator.writeObject(value.usdAccount)
                value.vndAccount != null -> generator.writeObject(value.vndAccount)
                value.xofExternalAccountInfo != null ->
                    generator.writeObject(value.xofExternalAccountInfo)
                value.zarExternalAccountInfo != null ->
                    generator.writeObject(value.zarExternalAccountInfo)
                value.zmwExternalAccountInfo != null ->
                    generator.writeObject(value.zmwExternalAccountInfo)
                value.sparkWalletInfo != null -> generator.writeObject(value.sparkWalletInfo)
                value.lightningWalletInfo != null ->
                    generator.writeObject(value.lightningWalletInfo)
                value.solanaWalletInfo != null -> generator.writeObject(value.solanaWalletInfo)
                value.tronWalletInfo != null -> generator.writeObject(value.tronWalletInfo)
                value.polygonWalletInfo != null -> generator.writeObject(value.polygonWalletInfo)
                value.baseWalletInfo != null -> generator.writeObject(value.baseWalletInfo)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountInfoOneOf")
            }
        }
    }

    class CadAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonField<CadAccountInfo.AccountType>,
        private val bankCode: JsonField<String>,
        private val branchCode: JsonField<String>,
        private val paymentRails: JsonField<List<CadAccountInfo.PaymentRail>>,
        private val beneficiary: JsonField<Beneficiary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType")
            @ExcludeMissing
            accountType: JsonField<CadAccountInfo.AccountType> = JsonMissing.of(),
            @JsonProperty("bankCode")
            @ExcludeMissing
            bankCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("branchCode")
            @ExcludeMissing
            branchCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<CadAccountInfo.PaymentRail>> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        ) : this(
            accountNumber,
            accountType,
            bankCode,
            branchCode,
            paymentRails,
            beneficiary,
            mutableMapOf(),
        )

        fun toCadAccountInfo(): CadAccountInfo =
            CadAccountInfo.builder()
                .accountNumber(accountNumber)
                .accountType(accountType)
                .bankCode(bankCode)
                .branchCode(branchCode)
                .paymentRails(paymentRails)
                .build()

        /**
         * Bank account number (7-12 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountType(): CadAccountInfo.AccountType = accountType.getRequired("accountType")

        /**
         * Canadian financial institution number (3 digits)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun bankCode(): String = bankCode.getRequired("bankCode")

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
        fun paymentRails(): List<CadAccountInfo.PaymentRail> =
            paymentRails.getRequired("paymentRails")

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
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountType")
        @ExcludeMissing
        fun _accountType(): JsonField<CadAccountInfo.AccountType> = accountType

        /**
         * Returns the raw JSON value of [bankCode].
         *
         * Unlike [bankCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankCode") @ExcludeMissing fun _bankCode(): JsonField<String> = bankCode

        /**
         * Returns the raw JSON value of [branchCode].
         *
         * Unlike [branchCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("branchCode")
        @ExcludeMissing
        fun _branchCode(): JsonField<String> = branchCode

        /**
         * Returns the raw JSON value of [paymentRails].
         *
         * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentRails")
        @ExcludeMissing
        fun _paymentRails(): JsonField<List<CadAccountInfo.PaymentRail>> = paymentRails

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
             * Returns a mutable builder for constructing an instance of [CadAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .accountType()
             * .bankCode()
             * .branchCode()
             * .paymentRails()
             * .beneficiary()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CadAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonField<CadAccountInfo.AccountType>? = null
            private var bankCode: JsonField<String>? = null
            private var branchCode: JsonField<String>? = null
            private var paymentRails: JsonField<MutableList<CadAccountInfo.PaymentRail>>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cadAccount: CadAccount) = apply {
                accountNumber = cadAccount.accountNumber
                accountType = cadAccount.accountType
                bankCode = cadAccount.bankCode
                branchCode = cadAccount.branchCode
                paymentRails = cadAccount.paymentRails.map { it.toMutableList() }
                beneficiary = cadAccount.beneficiary
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

            fun accountType(accountType: CadAccountInfo.AccountType) =
                accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed
             * [CadAccountInfo.AccountType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountType(accountType: JsonField<CadAccountInfo.AccountType>) = apply {
                this.accountType = accountType
            }

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

            fun paymentRails(paymentRails: List<CadAccountInfo.PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed
             * `List<CadAccountInfo.PaymentRail>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun paymentRails(paymentRails: JsonField<List<CadAccountInfo.PaymentRail>>) = apply {
                this.paymentRails = paymentRails.map { it.toMutableList() }
            }

            /**
             * Adds a single [CadAccountInfo.PaymentRail] to [paymentRails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPaymentRail(paymentRail: CadAccountInfo.PaymentRail) = apply {
                paymentRails =
                    (paymentRails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("paymentRails", it).add(paymentRail)
                    }
            }

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
             * .accountType()
             * .bankCode()
             * .branchCode()
             * .paymentRails()
             * .beneficiary()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CadAccount =
                CadAccount(
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("accountType", accountType),
                    checkRequired("bankCode", bankCode),
                    checkRequired("branchCode", branchCode),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("beneficiary", beneficiary),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CadAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            accountType().validate()
            bankCode()
            branchCode()
            paymentRails().forEach { it.validate() }
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
                (accountType.asKnown()?.validity() ?: 0) +
                (if (bankCode.asKnown() == null) 0 else 1) +
                (if (branchCode.asKnown() == null) 0 else 1) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CadAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankCode == other.bankCode &&
                branchCode == other.branchCode &&
                paymentRails == other.paymentRails &&
                beneficiary == other.beneficiary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankCode,
                branchCode,
                paymentRails,
                beneficiary,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CadAccount{accountNumber=$accountNumber, accountType=$accountType, bankCode=$bankCode, branchCode=$branchCode, paymentRails=$paymentRails, beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
    }

    class EurAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonField<EurAccountInfo.AccountType>,
        private val iban: JsonField<String>,
        private val paymentRails: JsonField<List<EurAccountInfo.PaymentRail>>,
        private val swiftBic: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType")
            @ExcludeMissing
            accountType: JsonField<EurAccountInfo.AccountType> = JsonMissing.of(),
            @JsonProperty("iban") @ExcludeMissing iban: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<EurAccountInfo.PaymentRail>> = JsonMissing.of(),
            @JsonProperty("swiftBic")
            @ExcludeMissing
            swiftBic: JsonField<String> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        ) : this(accountType, iban, paymentRails, swiftBic, beneficiary, mutableMapOf())

        fun toEurAccountInfo(): EurAccountInfo =
            EurAccountInfo.builder()
                .accountType(accountType)
                .iban(iban)
                .paymentRails(paymentRails)
                .swiftBic(swiftBic)
                .build()

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountType(): EurAccountInfo.AccountType = accountType.getRequired("accountType")

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
        fun paymentRails(): List<EurAccountInfo.PaymentRail> =
            paymentRails.getRequired("paymentRails")

        /**
         * The SWIFT BIC of the bank
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun swiftBic(): String? = swiftBic.getNullable("swiftBic")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun beneficiary(): Beneficiary = beneficiary.getRequired("beneficiary")

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountType")
        @ExcludeMissing
        fun _accountType(): JsonField<EurAccountInfo.AccountType> = accountType

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
        fun _paymentRails(): JsonField<List<EurAccountInfo.PaymentRail>> = paymentRails

        /**
         * Returns the raw JSON value of [swiftBic].
         *
         * Unlike [swiftBic], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("swiftBic") @ExcludeMissing fun _swiftBic(): JsonField<String> = swiftBic

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
             * Returns a mutable builder for constructing an instance of [EurAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountType()
             * .iban()
             * .paymentRails()
             * .beneficiary()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [EurAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonField<EurAccountInfo.AccountType>? = null
            private var iban: JsonField<String>? = null
            private var paymentRails: JsonField<MutableList<EurAccountInfo.PaymentRail>>? = null
            private var swiftBic: JsonField<String> = JsonMissing.of()
            private var beneficiary: JsonField<Beneficiary>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(eurAccount: EurAccount) = apply {
                accountType = eurAccount.accountType
                iban = eurAccount.iban
                paymentRails = eurAccount.paymentRails.map { it.toMutableList() }
                swiftBic = eurAccount.swiftBic
                beneficiary = eurAccount.beneficiary
                additionalProperties = eurAccount.additionalProperties.toMutableMap()
            }

            fun accountType(accountType: EurAccountInfo.AccountType) =
                accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed
             * [EurAccountInfo.AccountType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountType(accountType: JsonField<EurAccountInfo.AccountType>) = apply {
                this.accountType = accountType
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

            fun paymentRails(paymentRails: List<EurAccountInfo.PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed
             * `List<EurAccountInfo.PaymentRail>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun paymentRails(paymentRails: JsonField<List<EurAccountInfo.PaymentRail>>) = apply {
                this.paymentRails = paymentRails.map { it.toMutableList() }
            }

            /**
             * Adds a single [EurAccountInfo.PaymentRail] to [paymentRails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPaymentRail(paymentRail: EurAccountInfo.PaymentRail) = apply {
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
             * .accountType()
             * .iban()
             * .paymentRails()
             * .beneficiary()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): EurAccount =
                EurAccount(
                    checkRequired("accountType", accountType),
                    checkRequired("iban", iban),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    swiftBic,
                    checkRequired("beneficiary", beneficiary),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): EurAccount = apply {
            if (validated) {
                return@apply
            }

            accountType().validate()
            iban()
            paymentRails().forEach { it.validate() }
            swiftBic()
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
            (accountType.asKnown()?.validity() ?: 0) +
                (if (iban.asKnown() == null) 0 else 1) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (swiftBic.asKnown() == null) 0 else 1) +
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is EurAccount &&
                accountType == other.accountType &&
                iban == other.iban &&
                paymentRails == other.paymentRails &&
                swiftBic == other.swiftBic &&
                beneficiary == other.beneficiary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                iban,
                paymentRails,
                swiftBic,
                beneficiary,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "EurAccount{accountType=$accountType, iban=$iban, paymentRails=$paymentRails, swiftBic=$swiftBic, beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
    }

    class KesExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, paymentRails, phoneNumber, provider, mutableMapOf())

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
        fun provider(): String = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [KesExternalAccountInfo].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [KesExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("KES_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(kesExternalAccountInfo: KesExternalAccountInfo) = apply {
                accountType = kesExternalAccountInfo.accountType
                beneficiary = kesExternalAccountInfo.beneficiary
                paymentRails = kesExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = kesExternalAccountInfo.phoneNumber
                provider = kesExternalAccountInfo.provider
                additionalProperties = kesExternalAccountInfo.additionalProperties.toMutableMap()
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [KesExternalAccountInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): KesExternalAccountInfo =
                KesExternalAccountInfo(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): KesExternalAccountInfo = apply {
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
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is KesExternalAccountInfo &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "KesExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class MwkExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
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
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
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
         * JsonValue.from("MWK_ACCOUNT")
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
         * Malawian mobile money phone number
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
        fun provider(): String = provider.getRequired("provider")

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [MwkExternalAccountInfo].
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

        /** A builder for [MwkExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("MWK_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(mwkExternalAccountInfo: MwkExternalAccountInfo) = apply {
                accountType = mwkExternalAccountInfo.accountType
                beneficiary = mwkExternalAccountInfo.beneficiary
                countries = mwkExternalAccountInfo.countries.map { it.toMutableList() }
                paymentRails = mwkExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = mwkExternalAccountInfo.phoneNumber
                provider = mwkExternalAccountInfo.provider
                additionalProperties = mwkExternalAccountInfo.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("MWK_ACCOUNT")
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

            /** Malawian mobile money phone number */
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [MwkExternalAccountInfo].
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
            fun build(): MwkExternalAccountInfo =
                MwkExternalAccountInfo(
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

        fun validate(): MwkExternalAccountInfo = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("MWK_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
            accountType.let { if (it == JsonValue.from("MWK_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

                val MW = of("MW")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                MW
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
                MW,
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
                    MW -> Value.MW
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
                    MW -> Known.MW
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MwkExternalAccountInfo &&
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
            "MwkExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class NgnAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonField<NgnAccountInfo.AccountType>,
        private val bankName: JsonField<String>,
        private val paymentRails: JsonField<List<NgnAccountInfo.PaymentRail>>,
        private val beneficiary: JsonField<Beneficiary>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountNumber")
            @ExcludeMissing
            accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("accountType")
            @ExcludeMissing
            accountType: JsonField<NgnAccountInfo.AccountType> = JsonMissing.of(),
            @JsonProperty("bankName")
            @ExcludeMissing
            bankName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<NgnAccountInfo.PaymentRail>> = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
        ) : this(accountNumber, accountType, bankName, paymentRails, beneficiary, mutableMapOf())

        fun toNgnAccountInfo(): NgnAccountInfo =
            NgnAccountInfo.builder()
                .accountNumber(accountNumber)
                .accountType(accountType)
                .bankName(bankName)
                .paymentRails(paymentRails)
                .build()

        /**
         * Nigerian bank account number
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountNumber(): String = accountNumber.getRequired("accountNumber")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountType(): NgnAccountInfo.AccountType = accountType.getRequired("accountType")

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
        fun paymentRails(): List<NgnAccountInfo.PaymentRail> =
            paymentRails.getRequired("paymentRails")

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
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountType")
        @ExcludeMissing
        fun _accountType(): JsonField<NgnAccountInfo.AccountType> = accountType

        /**
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

        /**
         * Returns the raw JSON value of [paymentRails].
         *
         * Unlike [paymentRails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("paymentRails")
        @ExcludeMissing
        fun _paymentRails(): JsonField<List<NgnAccountInfo.PaymentRail>> = paymentRails

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
             * Returns a mutable builder for constructing an instance of [NgnAccount].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .accountType()
             * .bankName()
             * .paymentRails()
             * .beneficiary()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [NgnAccount]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonField<NgnAccountInfo.AccountType>? = null
            private var bankName: JsonField<String>? = null
            private var paymentRails: JsonField<MutableList<NgnAccountInfo.PaymentRail>>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ngnAccount: NgnAccount) = apply {
                accountNumber = ngnAccount.accountNumber
                accountType = ngnAccount.accountType
                bankName = ngnAccount.bankName
                paymentRails = ngnAccount.paymentRails.map { it.toMutableList() }
                beneficiary = ngnAccount.beneficiary
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

            fun accountType(accountType: NgnAccountInfo.AccountType) =
                accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed
             * [NgnAccountInfo.AccountType] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountType(accountType: JsonField<NgnAccountInfo.AccountType>) = apply {
                this.accountType = accountType
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

            fun paymentRails(paymentRails: List<NgnAccountInfo.PaymentRail>) =
                paymentRails(JsonField.of(paymentRails))

            /**
             * Sets [Builder.paymentRails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentRails] with a well-typed
             * `List<NgnAccountInfo.PaymentRail>` value instead. This method is primarily for
             * setting the field to an undocumented or not yet supported value.
             */
            fun paymentRails(paymentRails: JsonField<List<NgnAccountInfo.PaymentRail>>) = apply {
                this.paymentRails = paymentRails.map { it.toMutableList() }
            }

            /**
             * Adds a single [NgnAccountInfo.PaymentRail] to [paymentRails].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPaymentRail(paymentRail: NgnAccountInfo.PaymentRail) = apply {
                paymentRails =
                    (paymentRails ?: JsonField.of(mutableListOf())).also {
                        checkKnown("paymentRails", it).add(paymentRail)
                    }
            }

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
             * .accountType()
             * .bankName()
             * .paymentRails()
             * .beneficiary()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): NgnAccount =
                NgnAccount(
                    checkRequired("accountNumber", accountNumber),
                    checkRequired("accountType", accountType),
                    checkRequired("bankName", bankName),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("beneficiary", beneficiary),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): NgnAccount = apply {
            if (validated) {
                return@apply
            }

            accountNumber()
            accountType().validate()
            bankName()
            paymentRails().forEach { it.validate() }
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
                (accountType.asKnown()?.validity() ?: 0) +
                (if (bankName.asKnown() == null) 0 else 1) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is NgnAccount &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                paymentRails == other.paymentRails &&
                beneficiary == other.beneficiary &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankName,
                paymentRails,
                beneficiary,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NgnAccount{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, paymentRails=$paymentRails, beneficiary=$beneficiary, additionalProperties=$additionalProperties}"
    }

    class RwfExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, paymentRails, phoneNumber, provider, mutableMapOf())

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
        fun provider(): String = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [RwfExternalAccountInfo].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [RwfExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("RWF_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rwfExternalAccountInfo: RwfExternalAccountInfo) = apply {
                accountType = rwfExternalAccountInfo.accountType
                beneficiary = rwfExternalAccountInfo.beneficiary
                paymentRails = rwfExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = rwfExternalAccountInfo.phoneNumber
                provider = rwfExternalAccountInfo.provider
                additionalProperties = rwfExternalAccountInfo.additionalProperties.toMutableMap()
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [RwfExternalAccountInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RwfExternalAccountInfo =
                RwfExternalAccountInfo(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): RwfExternalAccountInfo = apply {
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
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RwfExternalAccountInfo &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RwfExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class TzsExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, paymentRails, phoneNumber, provider, mutableMapOf())

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
        fun provider(): String = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [TzsExternalAccountInfo].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [TzsExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("TZS_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(tzsExternalAccountInfo: TzsExternalAccountInfo) = apply {
                accountType = tzsExternalAccountInfo.accountType
                beneficiary = tzsExternalAccountInfo.beneficiary
                paymentRails = tzsExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = tzsExternalAccountInfo.phoneNumber
                provider = tzsExternalAccountInfo.provider
                additionalProperties = tzsExternalAccountInfo.additionalProperties.toMutableMap()
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [TzsExternalAccountInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TzsExternalAccountInfo =
                TzsExternalAccountInfo(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TzsExternalAccountInfo = apply {
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
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TzsExternalAccountInfo &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TzsExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class UgxExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
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
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
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
         * JsonValue.from("UGX_ACCOUNT")
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
         * Ugandan mobile money phone number
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
        fun provider(): String = provider.getRequired("provider")

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [UgxExternalAccountInfo].
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

        /** A builder for [UgxExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("UGX_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(ugxExternalAccountInfo: UgxExternalAccountInfo) = apply {
                accountType = ugxExternalAccountInfo.accountType
                beneficiary = ugxExternalAccountInfo.beneficiary
                countries = ugxExternalAccountInfo.countries.map { it.toMutableList() }
                paymentRails = ugxExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = ugxExternalAccountInfo.phoneNumber
                provider = ugxExternalAccountInfo.provider
                additionalProperties = ugxExternalAccountInfo.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("UGX_ACCOUNT")
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

            /** Ugandan mobile money phone number */
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [UgxExternalAccountInfo].
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
            fun build(): UgxExternalAccountInfo =
                UgxExternalAccountInfo(
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

        fun validate(): UgxExternalAccountInfo = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("UGX_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
            accountType.let { if (it == JsonValue.from("UGX_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

                val UG = of("UG")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                UG
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
                UG,
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
                    UG -> Value.UG
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
                    UG -> Known.UG
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is UgxExternalAccountInfo &&
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
            "UgxExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class XofExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val countries: JsonField<List<Country>>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
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
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
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
         * JsonValue.from("XOF_ACCOUNT")
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
         * West African mobile money phone number (Senegal, Benin, or Ivory Coast)
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
        fun provider(): String = provider.getRequired("provider")

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [XofExternalAccountInfo].
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

        /** A builder for [XofExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("XOF_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var countries: JsonField<MutableList<Country>>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(xofExternalAccountInfo: XofExternalAccountInfo) = apply {
                accountType = xofExternalAccountInfo.accountType
                beneficiary = xofExternalAccountInfo.beneficiary
                countries = xofExternalAccountInfo.countries.map { it.toMutableList() }
                paymentRails = xofExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = xofExternalAccountInfo.phoneNumber
                provider = xofExternalAccountInfo.provider
                additionalProperties = xofExternalAccountInfo.additionalProperties.toMutableMap()
            }

            /**
             * Sets the field to an arbitrary JSON value.
             *
             * It is usually unnecessary to call this method because the field defaults to the
             * following:
             * ```kotlin
             * JsonValue.from("XOF_ACCOUNT")
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

            /** West African mobile money phone number (Senegal, Benin, or Ivory Coast) */
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [XofExternalAccountInfo].
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
            fun build(): XofExternalAccountInfo =
                XofExternalAccountInfo(
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

        fun validate(): XofExternalAccountInfo = apply {
            if (validated) {
                return@apply
            }

            _accountType().let {
                if (it != JsonValue.from("XOF_ACCOUNT")) {
                    throw LightsparkGridInvalidDataException(
                        "'accountType' is invalid, received $it"
                    )
                }
            }
            beneficiary().validate()
            countries().forEach { it.validate() }
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
            accountType.let { if (it == JsonValue.from("XOF_ACCOUNT")) 1 else 0 } +
                (beneficiary.asKnown()?.validity() ?: 0) +
                (countries.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

                val SN = of("SN")

                val BJ = of("BJ")

                val CI = of("CI")

                fun of(value: String) = Country(JsonField.of(value))
            }

            /** An enum containing [Country]'s known values. */
            enum class Known {
                SN,
                BJ,
                CI,
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
                SN,
                BJ,
                CI,
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
                    SN -> Value.SN
                    BJ -> Value.BJ
                    CI -> Value.CI
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
                    SN -> Known.SN
                    BJ -> Known.BJ
                    CI -> Known.CI
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is XofExternalAccountInfo &&
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
            "XofExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, countries=$countries, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }

    class ZarExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountNumber: JsonField<String>,
        private val accountType: JsonValue,
        private val bankName: JsonField<String>,
        private val beneficiary: JsonField<Beneficiary>,
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
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
        ) : this(accountNumber, accountType, bankName, beneficiary, paymentRails, mutableMapOf())

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
             * Returns a mutable builder for constructing an instance of [ZarExternalAccountInfo].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .paymentRails()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ZarExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountNumber: JsonField<String>? = null
            private var accountType: JsonValue = JsonValue.from("ZAR_ACCOUNT")
            private var bankName: JsonField<String>? = null
            private var beneficiary: JsonField<Beneficiary>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(zarExternalAccountInfo: ZarExternalAccountInfo) = apply {
                accountNumber = zarExternalAccountInfo.accountNumber
                accountType = zarExternalAccountInfo.accountType
                bankName = zarExternalAccountInfo.bankName
                beneficiary = zarExternalAccountInfo.beneficiary
                paymentRails = zarExternalAccountInfo.paymentRails.map { it.toMutableList() }
                additionalProperties = zarExternalAccountInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [ZarExternalAccountInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumber()
             * .bankName()
             * .beneficiary()
             * .paymentRails()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ZarExternalAccountInfo =
                ZarExternalAccountInfo(
                    checkRequired("accountNumber", accountNumber),
                    accountType,
                    checkRequired("bankName", bankName),
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ZarExternalAccountInfo = apply {
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

            return other is ZarExternalAccountInfo &&
                accountNumber == other.accountNumber &&
                accountType == other.accountType &&
                bankName == other.bankName &&
                beneficiary == other.beneficiary &&
                paymentRails == other.paymentRails &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountNumber,
                accountType,
                bankName,
                beneficiary,
                paymentRails,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ZarExternalAccountInfo{accountNumber=$accountNumber, accountType=$accountType, bankName=$bankName, beneficiary=$beneficiary, paymentRails=$paymentRails, additionalProperties=$additionalProperties}"
    }

    class ZmwExternalAccountInfo
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val phoneNumber: JsonField<String>,
        private val provider: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountType") @ExcludeMissing accountType: JsonValue = JsonMissing.of(),
            @JsonProperty("beneficiary")
            @ExcludeMissing
            beneficiary: JsonField<Beneficiary> = JsonMissing.of(),
            @JsonProperty("paymentRails")
            @ExcludeMissing
            paymentRails: JsonField<List<PaymentRail>> = JsonMissing.of(),
            @JsonProperty("phoneNumber")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("provider") @ExcludeMissing provider: JsonField<String> = JsonMissing.of(),
        ) : this(accountType, beneficiary, paymentRails, phoneNumber, provider, mutableMapOf())

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
        fun provider(): String = provider.getRequired("provider")

        /**
         * Returns the raw JSON value of [beneficiary].
         *
         * Unlike [beneficiary], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("beneficiary")
        @ExcludeMissing
        fun _beneficiary(): JsonField<Beneficiary> = beneficiary

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
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<String> = provider

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
             * Returns a mutable builder for constructing an instance of [ZmwExternalAccountInfo].
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ZmwExternalAccountInfo]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("ZMW_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var phoneNumber: JsonField<String>? = null
            private var provider: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(zmwExternalAccountInfo: ZmwExternalAccountInfo) = apply {
                accountType = zmwExternalAccountInfo.accountType
                beneficiary = zmwExternalAccountInfo.beneficiary
                paymentRails = zmwExternalAccountInfo.paymentRails.map { it.toMutableList() }
                phoneNumber = zmwExternalAccountInfo.phoneNumber
                provider = zmwExternalAccountInfo.provider
                additionalProperties = zmwExternalAccountInfo.additionalProperties.toMutableMap()
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
            fun provider(provider: String) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<String>) = apply { this.provider = provider }

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
             * Returns an immutable instance of [ZmwExternalAccountInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * .phoneNumber()
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ZmwExternalAccountInfo =
                ZmwExternalAccountInfo(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("provider", provider),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ZmwExternalAccountInfo = apply {
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
            paymentRails().forEach { it.validate() }
            phoneNumber()
            provider()
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
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (phoneNumber.asKnown() == null) 0 else 1) +
                (if (provider.asKnown() == null) 0 else 1)

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ZmwExternalAccountInfo &&
                accountType == other.accountType &&
                beneficiary == other.beneficiary &&
                paymentRails == other.paymentRails &&
                phoneNumber == other.phoneNumber &&
                provider == other.provider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                paymentRails,
                phoneNumber,
                provider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ZmwExternalAccountInfo{accountType=$accountType, beneficiary=$beneficiary, paymentRails=$paymentRails, phoneNumber=$phoneNumber, provider=$provider, additionalProperties=$additionalProperties}"
    }
}
