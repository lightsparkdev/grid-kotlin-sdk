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
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.EthereumWalletExternalAccountInfo
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
    private val cadAccount: CadExternalAccountInfo? = null,
    private val dkkAccount: DkkExternalAccountInfo? = null,
    private val eurAccount: EurExternalAccountInfo? = null,
    private val gbpAccount: GbpExternalAccountInfo? = null,
    private val hkdAccount: HkdExternalAccountInfo? = null,
    private val idrAccount: IdrExternalAccountInfo? = null,
    private val inrAccount: InrExternalAccountInfo? = null,
    private val kesAccount: KesExternalAccountInfo? = null,
    private val mwkAccount: MwkExternalAccountInfo? = null,
    private val mxnAccount: MxnExternalAccountInfo? = null,
    private val myrAccount: MyrExternalAccountInfo? = null,
    private val ngnAccount: NgnExternalAccountInfo? = null,
    private val phpAccount: PhpExternalAccountInfo? = null,
    private val rwfAccount: RwfExternalAccountInfo? = null,
    private val sgdAccount: SgdExternalAccountInfo? = null,
    private val thbAccount: ThbExternalAccountInfo? = null,
    private val tzsAccount: TzsExternalAccountInfo? = null,
    private val ugxAccount: UgxExternalAccountInfo? = null,
    private val usdAccount: UsdExternalAccountInfo? = null,
    private val vndAccount: VndExternalAccountInfo? = null,
    private val xofAccount: XofExternalAccountInfo? = null,
    private val zarAccount: ZarExternalAccountInfo? = null,
    private val zmwAccount: ZmwExternalAccountInfo? = null,
    private val sparkWalletInfo: SparkWalletInfo? = null,
    private val lightningWalletInfo: LightningWalletInfo? = null,
    private val solanaWalletInfo: SolanaWalletInfo? = null,
    private val tronWalletInfo: TronWalletInfo? = null,
    private val polygonWalletInfo: PolygonWalletInfo? = null,
    private val baseWalletInfo: BaseWalletInfo? = null,
    private val ethereumWalletExternalAccountInfo: EthereumWalletExternalAccountInfo? = null,
    private val aedAccount: AedExternalAccountInfo? = null,
    private val bwpAccount: BwpExternalAccountInfo? = null,
    private val xafAccount: XafExternalAccountInfo? = null,
    private val bdtAccount: BdtExternalAccountInfo? = null,
    private val copAccount: CopExternalAccountInfo? = null,
    private val egpAccount: EgpExternalAccountInfo? = null,
    private val ghsAccount: GhsExternalAccountInfo? = null,
    private val gtqAccount: GtqExternalAccountInfo? = null,
    private val htgAccount: HtgExternalAccountInfo? = null,
    private val jmdAccount: JmdExternalAccountInfo? = null,
    private val pkrAccount: PkrExternalAccountInfo? = null,
    private val _json: JsonValue? = null,
) {

    fun brlAccount(): BrlExternalAccountInfo? = brlAccount

    fun cadAccount(): CadExternalAccountInfo? = cadAccount

    fun dkkAccount(): DkkExternalAccountInfo? = dkkAccount

    fun eurAccount(): EurExternalAccountInfo? = eurAccount

    fun gbpAccount(): GbpExternalAccountInfo? = gbpAccount

    fun hkdAccount(): HkdExternalAccountInfo? = hkdAccount

    fun idrAccount(): IdrExternalAccountInfo? = idrAccount

    fun inrAccount(): InrExternalAccountInfo? = inrAccount

    fun kesAccount(): KesExternalAccountInfo? = kesAccount

    fun mwkAccount(): MwkExternalAccountInfo? = mwkAccount

    fun mxnAccount(): MxnExternalAccountInfo? = mxnAccount

    fun myrAccount(): MyrExternalAccountInfo? = myrAccount

    fun ngnAccount(): NgnExternalAccountInfo? = ngnAccount

    fun phpAccount(): PhpExternalAccountInfo? = phpAccount

    fun rwfAccount(): RwfExternalAccountInfo? = rwfAccount

    fun sgdAccount(): SgdExternalAccountInfo? = sgdAccount

    fun thbAccount(): ThbExternalAccountInfo? = thbAccount

    fun tzsAccount(): TzsExternalAccountInfo? = tzsAccount

    fun ugxAccount(): UgxExternalAccountInfo? = ugxAccount

    fun usdAccount(): UsdExternalAccountInfo? = usdAccount

    fun vndAccount(): VndExternalAccountInfo? = vndAccount

    fun xofAccount(): XofExternalAccountInfo? = xofAccount

    fun zarAccount(): ZarExternalAccountInfo? = zarAccount

    fun zmwAccount(): ZmwExternalAccountInfo? = zmwAccount

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

    fun ethereumWalletExternalAccountInfo(): EthereumWalletExternalAccountInfo? =
        ethereumWalletExternalAccountInfo

    fun aedAccount(): AedExternalAccountInfo? = aedAccount

    fun bwpAccount(): BwpExternalAccountInfo? = bwpAccount

    fun xafAccount(): XafExternalAccountInfo? = xafAccount

    fun bdtAccount(): BdtExternalAccountInfo? = bdtAccount

    fun copAccount(): CopExternalAccountInfo? = copAccount

    fun egpAccount(): EgpExternalAccountInfo? = egpAccount

    fun ghsAccount(): GhsExternalAccountInfo? = ghsAccount

    fun gtqAccount(): GtqExternalAccountInfo? = gtqAccount

    fun htgAccount(): HtgExternalAccountInfo? = htgAccount

    fun jmdAccount(): JmdExternalAccountInfo? = jmdAccount

    fun pkrAccount(): PkrExternalAccountInfo? = pkrAccount

    fun isBrlAccount(): Boolean = brlAccount != null

    fun isCadAccount(): Boolean = cadAccount != null

    fun isDkkAccount(): Boolean = dkkAccount != null

    fun isEurAccount(): Boolean = eurAccount != null

    fun isGbpAccount(): Boolean = gbpAccount != null

    fun isHkdAccount(): Boolean = hkdAccount != null

    fun isIdrAccount(): Boolean = idrAccount != null

    fun isInrAccount(): Boolean = inrAccount != null

    fun isKesAccount(): Boolean = kesAccount != null

    fun isMwkAccount(): Boolean = mwkAccount != null

    fun isMxnAccount(): Boolean = mxnAccount != null

    fun isMyrAccount(): Boolean = myrAccount != null

    fun isNgnAccount(): Boolean = ngnAccount != null

    fun isPhpAccount(): Boolean = phpAccount != null

    fun isRwfAccount(): Boolean = rwfAccount != null

    fun isSgdAccount(): Boolean = sgdAccount != null

    fun isThbAccount(): Boolean = thbAccount != null

    fun isTzsAccount(): Boolean = tzsAccount != null

    fun isUgxAccount(): Boolean = ugxAccount != null

    fun isUsdAccount(): Boolean = usdAccount != null

    fun isVndAccount(): Boolean = vndAccount != null

    fun isXofAccount(): Boolean = xofAccount != null

    fun isZarAccount(): Boolean = zarAccount != null

    fun isZmwAccount(): Boolean = zmwAccount != null

    fun isSparkWalletInfo(): Boolean = sparkWalletInfo != null

    fun isLightningWalletInfo(): Boolean = lightningWalletInfo != null

    fun isSolanaWalletInfo(): Boolean = solanaWalletInfo != null

    fun isTronWalletInfo(): Boolean = tronWalletInfo != null

    fun isPolygonWalletInfo(): Boolean = polygonWalletInfo != null

    fun isBaseWalletInfo(): Boolean = baseWalletInfo != null

    fun isEthereumWalletExternalAccountInfo(): Boolean = ethereumWalletExternalAccountInfo != null

    fun isAedAccount(): Boolean = aedAccount != null

    fun isBwpAccount(): Boolean = bwpAccount != null

    fun isXafAccount(): Boolean = xafAccount != null

    fun isBdtAccount(): Boolean = bdtAccount != null

    fun isCopAccount(): Boolean = copAccount != null

    fun isEgpAccount(): Boolean = egpAccount != null

    fun isGhsAccount(): Boolean = ghsAccount != null

    fun isGtqAccount(): Boolean = gtqAccount != null

    fun isHtgAccount(): Boolean = htgAccount != null

    fun isJmdAccount(): Boolean = jmdAccount != null

    fun isPkrAccount(): Boolean = pkrAccount != null

    fun asBrlAccount(): BrlExternalAccountInfo = brlAccount.getOrThrow("brlAccount")

    fun asCadAccount(): CadExternalAccountInfo = cadAccount.getOrThrow("cadAccount")

    fun asDkkAccount(): DkkExternalAccountInfo = dkkAccount.getOrThrow("dkkAccount")

    fun asEurAccount(): EurExternalAccountInfo = eurAccount.getOrThrow("eurAccount")

    fun asGbpAccount(): GbpExternalAccountInfo = gbpAccount.getOrThrow("gbpAccount")

    fun asHkdAccount(): HkdExternalAccountInfo = hkdAccount.getOrThrow("hkdAccount")

    fun asIdrAccount(): IdrExternalAccountInfo = idrAccount.getOrThrow("idrAccount")

    fun asInrAccount(): InrExternalAccountInfo = inrAccount.getOrThrow("inrAccount")

    fun asKesAccount(): KesExternalAccountInfo = kesAccount.getOrThrow("kesAccount")

    fun asMwkAccount(): MwkExternalAccountInfo = mwkAccount.getOrThrow("mwkAccount")

    fun asMxnAccount(): MxnExternalAccountInfo = mxnAccount.getOrThrow("mxnAccount")

    fun asMyrAccount(): MyrExternalAccountInfo = myrAccount.getOrThrow("myrAccount")

    fun asNgnAccount(): NgnExternalAccountInfo = ngnAccount.getOrThrow("ngnAccount")

    fun asPhpAccount(): PhpExternalAccountInfo = phpAccount.getOrThrow("phpAccount")

    fun asRwfAccount(): RwfExternalAccountInfo = rwfAccount.getOrThrow("rwfAccount")

    fun asSgdAccount(): SgdExternalAccountInfo = sgdAccount.getOrThrow("sgdAccount")

    fun asThbAccount(): ThbExternalAccountInfo = thbAccount.getOrThrow("thbAccount")

    fun asTzsAccount(): TzsExternalAccountInfo = tzsAccount.getOrThrow("tzsAccount")

    fun asUgxAccount(): UgxExternalAccountInfo = ugxAccount.getOrThrow("ugxAccount")

    fun asUsdAccount(): UsdExternalAccountInfo = usdAccount.getOrThrow("usdAccount")

    fun asVndAccount(): VndExternalAccountInfo = vndAccount.getOrThrow("vndAccount")

    fun asXofAccount(): XofExternalAccountInfo = xofAccount.getOrThrow("xofAccount")

    fun asZarAccount(): ZarExternalAccountInfo = zarAccount.getOrThrow("zarAccount")

    fun asZmwAccount(): ZmwExternalAccountInfo = zmwAccount.getOrThrow("zmwAccount")

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

    fun asEthereumWalletExternalAccountInfo(): EthereumWalletExternalAccountInfo =
        ethereumWalletExternalAccountInfo.getOrThrow("ethereumWalletExternalAccountInfo")

    fun asAedAccount(): AedExternalAccountInfo = aedAccount.getOrThrow("aedAccount")

    fun asBwpAccount(): BwpExternalAccountInfo = bwpAccount.getOrThrow("bwpAccount")

    fun asXafAccount(): XafExternalAccountInfo = xafAccount.getOrThrow("xafAccount")

    fun asBdtAccount(): BdtExternalAccountInfo = bdtAccount.getOrThrow("bdtAccount")

    fun asCopAccount(): CopExternalAccountInfo = copAccount.getOrThrow("copAccount")

    fun asEgpAccount(): EgpExternalAccountInfo = egpAccount.getOrThrow("egpAccount")

    fun asGhsAccount(): GhsExternalAccountInfo = ghsAccount.getOrThrow("ghsAccount")

    fun asGtqAccount(): GtqExternalAccountInfo = gtqAccount.getOrThrow("gtqAccount")

    fun asHtgAccount(): HtgExternalAccountInfo = htgAccount.getOrThrow("htgAccount")

    fun asJmdAccount(): JmdExternalAccountInfo = jmdAccount.getOrThrow("jmdAccount")

    fun asPkrAccount(): PkrExternalAccountInfo = pkrAccount.getOrThrow("pkrAccount")

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
            mwkAccount != null -> visitor.visitMwkAccount(mwkAccount)
            mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
            myrAccount != null -> visitor.visitMyrAccount(myrAccount)
            ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
            phpAccount != null -> visitor.visitPhpAccount(phpAccount)
            rwfAccount != null -> visitor.visitRwfAccount(rwfAccount)
            sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
            thbAccount != null -> visitor.visitThbAccount(thbAccount)
            tzsAccount != null -> visitor.visitTzsAccount(tzsAccount)
            ugxAccount != null -> visitor.visitUgxAccount(ugxAccount)
            usdAccount != null -> visitor.visitUsdAccount(usdAccount)
            vndAccount != null -> visitor.visitVndAccount(vndAccount)
            xofAccount != null -> visitor.visitXofAccount(xofAccount)
            zarAccount != null -> visitor.visitZarAccount(zarAccount)
            zmwAccount != null -> visitor.visitZmwAccount(zmwAccount)
            sparkWalletInfo != null -> visitor.visitSparkWalletInfo(sparkWalletInfo)
            lightningWalletInfo != null -> visitor.visitLightningWalletInfo(lightningWalletInfo)
            solanaWalletInfo != null -> visitor.visitSolanaWalletInfo(solanaWalletInfo)
            tronWalletInfo != null -> visitor.visitTronWalletInfo(tronWalletInfo)
            polygonWalletInfo != null -> visitor.visitPolygonWalletInfo(polygonWalletInfo)
            baseWalletInfo != null -> visitor.visitBaseWalletInfo(baseWalletInfo)
            ethereumWalletExternalAccountInfo != null ->
                visitor.visitEthereumWalletExternalAccountInfo(ethereumWalletExternalAccountInfo)
            aedAccount != null -> visitor.visitAedAccount(aedAccount)
            bwpAccount != null -> visitor.visitBwpAccount(bwpAccount)
            xafAccount != null -> visitor.visitXafAccount(xafAccount)
            bdtAccount != null -> visitor.visitBdtAccount(bdtAccount)
            copAccount != null -> visitor.visitCopAccount(copAccount)
            egpAccount != null -> visitor.visitEgpAccount(egpAccount)
            ghsAccount != null -> visitor.visitGhsAccount(ghsAccount)
            gtqAccount != null -> visitor.visitGtqAccount(gtqAccount)
            htgAccount != null -> visitor.visitHtgAccount(htgAccount)
            jmdAccount != null -> visitor.visitJmdAccount(jmdAccount)
            pkrAccount != null -> visitor.visitPkrAccount(pkrAccount)
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

                override fun visitCadAccount(cadAccount: CadExternalAccountInfo) {
                    cadAccount.validate()
                }

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo) {
                    dkkAccount.validate()
                }

                override fun visitEurAccount(eurAccount: EurExternalAccountInfo) {
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

                override fun visitKesAccount(kesAccount: KesExternalAccountInfo) {
                    kesAccount.validate()
                }

                override fun visitMwkAccount(mwkAccount: MwkExternalAccountInfo) {
                    mwkAccount.validate()
                }

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) {
                    mxnAccount.validate()
                }

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) {
                    myrAccount.validate()
                }

                override fun visitNgnAccount(ngnAccount: NgnExternalAccountInfo) {
                    ngnAccount.validate()
                }

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) {
                    phpAccount.validate()
                }

                override fun visitRwfAccount(rwfAccount: RwfExternalAccountInfo) {
                    rwfAccount.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) {
                    sgdAccount.validate()
                }

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) {
                    thbAccount.validate()
                }

                override fun visitTzsAccount(tzsAccount: TzsExternalAccountInfo) {
                    tzsAccount.validate()
                }

                override fun visitUgxAccount(ugxAccount: UgxExternalAccountInfo) {
                    ugxAccount.validate()
                }

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) {
                    usdAccount.validate()
                }

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) {
                    vndAccount.validate()
                }

                override fun visitXofAccount(xofAccount: XofExternalAccountInfo) {
                    xofAccount.validate()
                }

                override fun visitZarAccount(zarAccount: ZarExternalAccountInfo) {
                    zarAccount.validate()
                }

                override fun visitZmwAccount(zmwAccount: ZmwExternalAccountInfo) {
                    zmwAccount.validate()
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

                override fun visitEthereumWalletExternalAccountInfo(
                    ethereumWalletExternalAccountInfo: EthereumWalletExternalAccountInfo
                ) {
                    ethereumWalletExternalAccountInfo.validate()
                }

                override fun visitAedAccount(aedAccount: AedExternalAccountInfo) {
                    aedAccount.validate()
                }

                override fun visitBwpAccount(bwpAccount: BwpExternalAccountInfo) {
                    bwpAccount.validate()
                }

                override fun visitXafAccount(xafAccount: XafExternalAccountInfo) {
                    xafAccount.validate()
                }

                override fun visitBdtAccount(bdtAccount: BdtExternalAccountInfo) {
                    bdtAccount.validate()
                }

                override fun visitCopAccount(copAccount: CopExternalAccountInfo) {
                    copAccount.validate()
                }

                override fun visitEgpAccount(egpAccount: EgpExternalAccountInfo) {
                    egpAccount.validate()
                }

                override fun visitGhsAccount(ghsAccount: GhsExternalAccountInfo) {
                    ghsAccount.validate()
                }

                override fun visitGtqAccount(gtqAccount: GtqExternalAccountInfo) {
                    gtqAccount.validate()
                }

                override fun visitHtgAccount(htgAccount: HtgExternalAccountInfo) {
                    htgAccount.validate()
                }

                override fun visitJmdAccount(jmdAccount: JmdExternalAccountInfo) {
                    jmdAccount.validate()
                }

                override fun visitPkrAccount(pkrAccount: PkrExternalAccountInfo) {
                    pkrAccount.validate()
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

                override fun visitCadAccount(cadAccount: CadExternalAccountInfo) =
                    cadAccount.validity()

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo) =
                    dkkAccount.validity()

                override fun visitEurAccount(eurAccount: EurExternalAccountInfo) =
                    eurAccount.validity()

                override fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo) =
                    gbpAccount.validity()

                override fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo) =
                    hkdAccount.validity()

                override fun visitIdrAccount(idrAccount: IdrExternalAccountInfo) =
                    idrAccount.validity()

                override fun visitInrAccount(inrAccount: InrExternalAccountInfo) =
                    inrAccount.validity()

                override fun visitKesAccount(kesAccount: KesExternalAccountInfo) =
                    kesAccount.validity()

                override fun visitMwkAccount(mwkAccount: MwkExternalAccountInfo) =
                    mwkAccount.validity()

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo) =
                    mxnAccount.validity()

                override fun visitMyrAccount(myrAccount: MyrExternalAccountInfo) =
                    myrAccount.validity()

                override fun visitNgnAccount(ngnAccount: NgnExternalAccountInfo) =
                    ngnAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpExternalAccountInfo) =
                    phpAccount.validity()

                override fun visitRwfAccount(rwfAccount: RwfExternalAccountInfo) =
                    rwfAccount.validity()

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo) =
                    sgdAccount.validity()

                override fun visitThbAccount(thbAccount: ThbExternalAccountInfo) =
                    thbAccount.validity()

                override fun visitTzsAccount(tzsAccount: TzsExternalAccountInfo) =
                    tzsAccount.validity()

                override fun visitUgxAccount(ugxAccount: UgxExternalAccountInfo) =
                    ugxAccount.validity()

                override fun visitUsdAccount(usdAccount: UsdExternalAccountInfo) =
                    usdAccount.validity()

                override fun visitVndAccount(vndAccount: VndExternalAccountInfo) =
                    vndAccount.validity()

                override fun visitXofAccount(xofAccount: XofExternalAccountInfo) =
                    xofAccount.validity()

                override fun visitZarAccount(zarAccount: ZarExternalAccountInfo) =
                    zarAccount.validity()

                override fun visitZmwAccount(zmwAccount: ZmwExternalAccountInfo) =
                    zmwAccount.validity()

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

                override fun visitEthereumWalletExternalAccountInfo(
                    ethereumWalletExternalAccountInfo: EthereumWalletExternalAccountInfo
                ) = ethereumWalletExternalAccountInfo.validity()

                override fun visitAedAccount(aedAccount: AedExternalAccountInfo) =
                    aedAccount.validity()

                override fun visitBwpAccount(bwpAccount: BwpExternalAccountInfo) =
                    bwpAccount.validity()

                override fun visitXafAccount(xafAccount: XafExternalAccountInfo) =
                    xafAccount.validity()

                override fun visitBdtAccount(bdtAccount: BdtExternalAccountInfo) =
                    bdtAccount.validity()

                override fun visitCopAccount(copAccount: CopExternalAccountInfo) =
                    copAccount.validity()

                override fun visitEgpAccount(egpAccount: EgpExternalAccountInfo) =
                    egpAccount.validity()

                override fun visitGhsAccount(ghsAccount: GhsExternalAccountInfo) =
                    ghsAccount.validity()

                override fun visitGtqAccount(gtqAccount: GtqExternalAccountInfo) =
                    gtqAccount.validity()

                override fun visitHtgAccount(htgAccount: HtgExternalAccountInfo) =
                    htgAccount.validity()

                override fun visitJmdAccount(jmdAccount: JmdExternalAccountInfo) =
                    jmdAccount.validity()

                override fun visitPkrAccount(pkrAccount: PkrExternalAccountInfo) =
                    pkrAccount.validity()

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
            mwkAccount == other.mwkAccount &&
            mxnAccount == other.mxnAccount &&
            myrAccount == other.myrAccount &&
            ngnAccount == other.ngnAccount &&
            phpAccount == other.phpAccount &&
            rwfAccount == other.rwfAccount &&
            sgdAccount == other.sgdAccount &&
            thbAccount == other.thbAccount &&
            tzsAccount == other.tzsAccount &&
            ugxAccount == other.ugxAccount &&
            usdAccount == other.usdAccount &&
            vndAccount == other.vndAccount &&
            xofAccount == other.xofAccount &&
            zarAccount == other.zarAccount &&
            zmwAccount == other.zmwAccount &&
            sparkWalletInfo == other.sparkWalletInfo &&
            lightningWalletInfo == other.lightningWalletInfo &&
            solanaWalletInfo == other.solanaWalletInfo &&
            tronWalletInfo == other.tronWalletInfo &&
            polygonWalletInfo == other.polygonWalletInfo &&
            baseWalletInfo == other.baseWalletInfo &&
            ethereumWalletExternalAccountInfo == other.ethereumWalletExternalAccountInfo &&
            aedAccount == other.aedAccount &&
            bwpAccount == other.bwpAccount &&
            xafAccount == other.xafAccount &&
            bdtAccount == other.bdtAccount &&
            copAccount == other.copAccount &&
            egpAccount == other.egpAccount &&
            ghsAccount == other.ghsAccount &&
            gtqAccount == other.gtqAccount &&
            htgAccount == other.htgAccount &&
            jmdAccount == other.jmdAccount &&
            pkrAccount == other.pkrAccount
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
            mwkAccount,
            mxnAccount,
            myrAccount,
            ngnAccount,
            phpAccount,
            rwfAccount,
            sgdAccount,
            thbAccount,
            tzsAccount,
            ugxAccount,
            usdAccount,
            vndAccount,
            xofAccount,
            zarAccount,
            zmwAccount,
            sparkWalletInfo,
            lightningWalletInfo,
            solanaWalletInfo,
            tronWalletInfo,
            polygonWalletInfo,
            baseWalletInfo,
            ethereumWalletExternalAccountInfo,
            aedAccount,
            bwpAccount,
            xafAccount,
            bdtAccount,
            copAccount,
            egpAccount,
            ghsAccount,
            gtqAccount,
            htgAccount,
            jmdAccount,
            pkrAccount,
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
            mwkAccount != null -> "ExternalAccountInfoOneOf{mwkAccount=$mwkAccount}"
            mxnAccount != null -> "ExternalAccountInfoOneOf{mxnAccount=$mxnAccount}"
            myrAccount != null -> "ExternalAccountInfoOneOf{myrAccount=$myrAccount}"
            ngnAccount != null -> "ExternalAccountInfoOneOf{ngnAccount=$ngnAccount}"
            phpAccount != null -> "ExternalAccountInfoOneOf{phpAccount=$phpAccount}"
            rwfAccount != null -> "ExternalAccountInfoOneOf{rwfAccount=$rwfAccount}"
            sgdAccount != null -> "ExternalAccountInfoOneOf{sgdAccount=$sgdAccount}"
            thbAccount != null -> "ExternalAccountInfoOneOf{thbAccount=$thbAccount}"
            tzsAccount != null -> "ExternalAccountInfoOneOf{tzsAccount=$tzsAccount}"
            ugxAccount != null -> "ExternalAccountInfoOneOf{ugxAccount=$ugxAccount}"
            usdAccount != null -> "ExternalAccountInfoOneOf{usdAccount=$usdAccount}"
            vndAccount != null -> "ExternalAccountInfoOneOf{vndAccount=$vndAccount}"
            xofAccount != null -> "ExternalAccountInfoOneOf{xofAccount=$xofAccount}"
            zarAccount != null -> "ExternalAccountInfoOneOf{zarAccount=$zarAccount}"
            zmwAccount != null -> "ExternalAccountInfoOneOf{zmwAccount=$zmwAccount}"
            sparkWalletInfo != null -> "ExternalAccountInfoOneOf{sparkWalletInfo=$sparkWalletInfo}"
            lightningWalletInfo != null ->
                "ExternalAccountInfoOneOf{lightningWalletInfo=$lightningWalletInfo}"
            solanaWalletInfo != null ->
                "ExternalAccountInfoOneOf{solanaWalletInfo=$solanaWalletInfo}"
            tronWalletInfo != null -> "ExternalAccountInfoOneOf{tronWalletInfo=$tronWalletInfo}"
            polygonWalletInfo != null ->
                "ExternalAccountInfoOneOf{polygonWalletInfo=$polygonWalletInfo}"
            baseWalletInfo != null -> "ExternalAccountInfoOneOf{baseWalletInfo=$baseWalletInfo}"
            ethereumWalletExternalAccountInfo != null ->
                "ExternalAccountInfoOneOf{ethereumWalletExternalAccountInfo=$ethereumWalletExternalAccountInfo}"
            aedAccount != null -> "ExternalAccountInfoOneOf{aedAccount=$aedAccount}"
            bwpAccount != null -> "ExternalAccountInfoOneOf{bwpAccount=$bwpAccount}"
            xafAccount != null -> "ExternalAccountInfoOneOf{xafAccount=$xafAccount}"
            bdtAccount != null -> "ExternalAccountInfoOneOf{bdtAccount=$bdtAccount}"
            copAccount != null -> "ExternalAccountInfoOneOf{copAccount=$copAccount}"
            egpAccount != null -> "ExternalAccountInfoOneOf{egpAccount=$egpAccount}"
            ghsAccount != null -> "ExternalAccountInfoOneOf{ghsAccount=$ghsAccount}"
            gtqAccount != null -> "ExternalAccountInfoOneOf{gtqAccount=$gtqAccount}"
            htgAccount != null -> "ExternalAccountInfoOneOf{htgAccount=$htgAccount}"
            jmdAccount != null -> "ExternalAccountInfoOneOf{jmdAccount=$jmdAccount}"
            pkrAccount != null -> "ExternalAccountInfoOneOf{pkrAccount=$pkrAccount}"
            _json != null -> "ExternalAccountInfoOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExternalAccountInfoOneOf")
        }

    companion object {

        fun ofBrlAccount(brlAccount: BrlExternalAccountInfo) =
            ExternalAccountInfoOneOf(brlAccount = brlAccount)

        fun ofCadAccount(cadAccount: CadExternalAccountInfo) =
            ExternalAccountInfoOneOf(cadAccount = cadAccount)

        fun ofDkkAccount(dkkAccount: DkkExternalAccountInfo) =
            ExternalAccountInfoOneOf(dkkAccount = dkkAccount)

        fun ofEurAccount(eurAccount: EurExternalAccountInfo) =
            ExternalAccountInfoOneOf(eurAccount = eurAccount)

        fun ofGbpAccount(gbpAccount: GbpExternalAccountInfo) =
            ExternalAccountInfoOneOf(gbpAccount = gbpAccount)

        fun ofHkdAccount(hkdAccount: HkdExternalAccountInfo) =
            ExternalAccountInfoOneOf(hkdAccount = hkdAccount)

        fun ofIdrAccount(idrAccount: IdrExternalAccountInfo) =
            ExternalAccountInfoOneOf(idrAccount = idrAccount)

        fun ofInrAccount(inrAccount: InrExternalAccountInfo) =
            ExternalAccountInfoOneOf(inrAccount = inrAccount)

        fun ofKesAccount(kesAccount: KesExternalAccountInfo) =
            ExternalAccountInfoOneOf(kesAccount = kesAccount)

        fun ofMwkAccount(mwkAccount: MwkExternalAccountInfo) =
            ExternalAccountInfoOneOf(mwkAccount = mwkAccount)

        fun ofMxnAccount(mxnAccount: MxnExternalAccountInfo) =
            ExternalAccountInfoOneOf(mxnAccount = mxnAccount)

        fun ofMyrAccount(myrAccount: MyrExternalAccountInfo) =
            ExternalAccountInfoOneOf(myrAccount = myrAccount)

        fun ofNgnAccount(ngnAccount: NgnExternalAccountInfo) =
            ExternalAccountInfoOneOf(ngnAccount = ngnAccount)

        fun ofPhpAccount(phpAccount: PhpExternalAccountInfo) =
            ExternalAccountInfoOneOf(phpAccount = phpAccount)

        fun ofRwfAccount(rwfAccount: RwfExternalAccountInfo) =
            ExternalAccountInfoOneOf(rwfAccount = rwfAccount)

        fun ofSgdAccount(sgdAccount: SgdExternalAccountInfo) =
            ExternalAccountInfoOneOf(sgdAccount = sgdAccount)

        fun ofThbAccount(thbAccount: ThbExternalAccountInfo) =
            ExternalAccountInfoOneOf(thbAccount = thbAccount)

        fun ofTzsAccount(tzsAccount: TzsExternalAccountInfo) =
            ExternalAccountInfoOneOf(tzsAccount = tzsAccount)

        fun ofUgxAccount(ugxAccount: UgxExternalAccountInfo) =
            ExternalAccountInfoOneOf(ugxAccount = ugxAccount)

        fun ofUsdAccount(usdAccount: UsdExternalAccountInfo) =
            ExternalAccountInfoOneOf(usdAccount = usdAccount)

        fun ofVndAccount(vndAccount: VndExternalAccountInfo) =
            ExternalAccountInfoOneOf(vndAccount = vndAccount)

        fun ofXofAccount(xofAccount: XofExternalAccountInfo) =
            ExternalAccountInfoOneOf(xofAccount = xofAccount)

        fun ofZarAccount(zarAccount: ZarExternalAccountInfo) =
            ExternalAccountInfoOneOf(zarAccount = zarAccount)

        fun ofZmwAccount(zmwAccount: ZmwExternalAccountInfo) =
            ExternalAccountInfoOneOf(zmwAccount = zmwAccount)

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

        fun ofEthereumWalletExternalAccountInfo(
            ethereumWalletExternalAccountInfo: EthereumWalletExternalAccountInfo
        ) =
            ExternalAccountInfoOneOf(
                ethereumWalletExternalAccountInfo = ethereumWalletExternalAccountInfo
            )

        fun ofAedAccount(aedAccount: AedExternalAccountInfo) =
            ExternalAccountInfoOneOf(aedAccount = aedAccount)

        fun ofBwpAccount(bwpAccount: BwpExternalAccountInfo) =
            ExternalAccountInfoOneOf(bwpAccount = bwpAccount)

        fun ofXafAccount(xafAccount: XafExternalAccountInfo) =
            ExternalAccountInfoOneOf(xafAccount = xafAccount)

        fun ofBdtAccount(bdtAccount: BdtExternalAccountInfo) =
            ExternalAccountInfoOneOf(bdtAccount = bdtAccount)

        fun ofCopAccount(copAccount: CopExternalAccountInfo) =
            ExternalAccountInfoOneOf(copAccount = copAccount)

        fun ofEgpAccount(egpAccount: EgpExternalAccountInfo) =
            ExternalAccountInfoOneOf(egpAccount = egpAccount)

        fun ofGhsAccount(ghsAccount: GhsExternalAccountInfo) =
            ExternalAccountInfoOneOf(ghsAccount = ghsAccount)

        fun ofGtqAccount(gtqAccount: GtqExternalAccountInfo) =
            ExternalAccountInfoOneOf(gtqAccount = gtqAccount)

        fun ofHtgAccount(htgAccount: HtgExternalAccountInfo) =
            ExternalAccountInfoOneOf(htgAccount = htgAccount)

        fun ofJmdAccount(jmdAccount: JmdExternalAccountInfo) =
            ExternalAccountInfoOneOf(jmdAccount = jmdAccount)

        fun ofPkrAccount(pkrAccount: PkrExternalAccountInfo) =
            ExternalAccountInfoOneOf(pkrAccount = pkrAccount)
    }

    /**
     * An interface that defines how to map each variant of [ExternalAccountInfoOneOf] to a value of
     * type [T].
     */
    interface Visitor<out T> {

        fun visitBrlAccount(brlAccount: BrlExternalAccountInfo): T

        fun visitCadAccount(cadAccount: CadExternalAccountInfo): T

        fun visitDkkAccount(dkkAccount: DkkExternalAccountInfo): T

        fun visitEurAccount(eurAccount: EurExternalAccountInfo): T

        fun visitGbpAccount(gbpAccount: GbpExternalAccountInfo): T

        fun visitHkdAccount(hkdAccount: HkdExternalAccountInfo): T

        fun visitIdrAccount(idrAccount: IdrExternalAccountInfo): T

        fun visitInrAccount(inrAccount: InrExternalAccountInfo): T

        fun visitKesAccount(kesAccount: KesExternalAccountInfo): T

        fun visitMwkAccount(mwkAccount: MwkExternalAccountInfo): T

        fun visitMxnAccount(mxnAccount: MxnExternalAccountInfo): T

        fun visitMyrAccount(myrAccount: MyrExternalAccountInfo): T

        fun visitNgnAccount(ngnAccount: NgnExternalAccountInfo): T

        fun visitPhpAccount(phpAccount: PhpExternalAccountInfo): T

        fun visitRwfAccount(rwfAccount: RwfExternalAccountInfo): T

        fun visitSgdAccount(sgdAccount: SgdExternalAccountInfo): T

        fun visitThbAccount(thbAccount: ThbExternalAccountInfo): T

        fun visitTzsAccount(tzsAccount: TzsExternalAccountInfo): T

        fun visitUgxAccount(ugxAccount: UgxExternalAccountInfo): T

        fun visitUsdAccount(usdAccount: UsdExternalAccountInfo): T

        fun visitVndAccount(vndAccount: VndExternalAccountInfo): T

        fun visitXofAccount(xofAccount: XofExternalAccountInfo): T

        fun visitZarAccount(zarAccount: ZarExternalAccountInfo): T

        fun visitZmwAccount(zmwAccount: ZmwExternalAccountInfo): T

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

        fun visitEthereumWalletExternalAccountInfo(
            ethereumWalletExternalAccountInfo: EthereumWalletExternalAccountInfo
        ): T

        fun visitAedAccount(aedAccount: AedExternalAccountInfo): T

        fun visitBwpAccount(bwpAccount: BwpExternalAccountInfo): T

        fun visitXafAccount(xafAccount: XafExternalAccountInfo): T

        fun visitBdtAccount(bdtAccount: BdtExternalAccountInfo): T

        fun visitCopAccount(copAccount: CopExternalAccountInfo): T

        fun visitEgpAccount(egpAccount: EgpExternalAccountInfo): T

        fun visitGhsAccount(ghsAccount: GhsExternalAccountInfo): T

        fun visitGtqAccount(gtqAccount: GtqExternalAccountInfo): T

        fun visitHtgAccount(htgAccount: HtgExternalAccountInfo): T

        fun visitJmdAccount(jmdAccount: JmdExternalAccountInfo): T

        fun visitPkrAccount(pkrAccount: PkrExternalAccountInfo): T

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
                    return tryDeserialize(node, jacksonTypeRef<CadExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(cadAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "DKK_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<DkkExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(dkkAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "EUR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<EurExternalAccountInfo>())?.let {
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
                    return tryDeserialize(node, jacksonTypeRef<KesExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(kesAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "MWK_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<MwkExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(mwkAccount = it, _json = json)
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
                    return tryDeserialize(node, jacksonTypeRef<NgnExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(ngnAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PHP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PhpExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(phpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "RWF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<RwfExternalAccountInfo>())?.let {
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
                    return tryDeserialize(node, jacksonTypeRef<TzsExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(tzsAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "UGX_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<UgxExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(ugxAccount = it, _json = json)
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
                "XOF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<XofExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(xofAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "ZAR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ZarExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(zarAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "ZMW_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ZmwExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(zmwAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "AED_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<AedExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(aedAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "BWP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<BwpExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(bwpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "XAF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<XafExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(xafAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "BDT_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<BdtExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(bdtAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "COP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<CopExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(copAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "EGP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<EgpExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(egpAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "GHS_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GhsExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(ghsAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "GTQ_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GtqExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(gtqAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "HTG_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<HtgExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(htgAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "JMD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<JmdExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(jmdAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
                "PKR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PkrExternalAccountInfo>())?.let {
                        ExternalAccountInfoOneOf(pkrAccount = it, _json = json)
                    } ?: ExternalAccountInfoOneOf(_json = json)
                }
            }

            val bestMatches =
                sequenceOf(
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
                        tryDeserialize(node, jacksonTypeRef<EthereumWalletExternalAccountInfo>())
                            ?.let {
                                ExternalAccountInfoOneOf(
                                    ethereumWalletExternalAccountInfo = it,
                                    _json = json,
                                )
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
                value.kesAccount != null -> generator.writeObject(value.kesAccount)
                value.mwkAccount != null -> generator.writeObject(value.mwkAccount)
                value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                value.myrAccount != null -> generator.writeObject(value.myrAccount)
                value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                value.phpAccount != null -> generator.writeObject(value.phpAccount)
                value.rwfAccount != null -> generator.writeObject(value.rwfAccount)
                value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                value.thbAccount != null -> generator.writeObject(value.thbAccount)
                value.tzsAccount != null -> generator.writeObject(value.tzsAccount)
                value.ugxAccount != null -> generator.writeObject(value.ugxAccount)
                value.usdAccount != null -> generator.writeObject(value.usdAccount)
                value.vndAccount != null -> generator.writeObject(value.vndAccount)
                value.xofAccount != null -> generator.writeObject(value.xofAccount)
                value.zarAccount != null -> generator.writeObject(value.zarAccount)
                value.zmwAccount != null -> generator.writeObject(value.zmwAccount)
                value.sparkWalletInfo != null -> generator.writeObject(value.sparkWalletInfo)
                value.lightningWalletInfo != null ->
                    generator.writeObject(value.lightningWalletInfo)
                value.solanaWalletInfo != null -> generator.writeObject(value.solanaWalletInfo)
                value.tronWalletInfo != null -> generator.writeObject(value.tronWalletInfo)
                value.polygonWalletInfo != null -> generator.writeObject(value.polygonWalletInfo)
                value.baseWalletInfo != null -> generator.writeObject(value.baseWalletInfo)
                value.ethereumWalletExternalAccountInfo != null ->
                    generator.writeObject(value.ethereumWalletExternalAccountInfo)
                value.aedAccount != null -> generator.writeObject(value.aedAccount)
                value.bwpAccount != null -> generator.writeObject(value.bwpAccount)
                value.xafAccount != null -> generator.writeObject(value.xafAccount)
                value.bdtAccount != null -> generator.writeObject(value.bdtAccount)
                value.copAccount != null -> generator.writeObject(value.copAccount)
                value.egpAccount != null -> generator.writeObject(value.egpAccount)
                value.ghsAccount != null -> generator.writeObject(value.ghsAccount)
                value.gtqAccount != null -> generator.writeObject(value.gtqAccount)
                value.htgAccount != null -> generator.writeObject(value.htgAccount)
                value.jmdAccount != null -> generator.writeObject(value.jmdAccount)
                value.pkrAccount != null -> generator.writeObject(value.pkrAccount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountInfoOneOf")
            }
        }
    }
}
