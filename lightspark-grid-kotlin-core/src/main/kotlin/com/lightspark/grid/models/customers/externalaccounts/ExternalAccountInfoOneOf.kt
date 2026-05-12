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
import com.lightspark.grid.models.EthereumWalletExternalAccountInfo
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
    private val slvAccount: SlvAccount? = null,
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

    fun slvAccount(): SlvAccount? = slvAccount

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

    fun isSlvAccount(): Boolean = slvAccount != null

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

    fun asSlvAccount(): SlvAccount = slvAccount.getOrThrow("slvAccount")

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
     * val result: String? = externalAccountInfoOneOf.accept(object : ExternalAccountInfoOneOf.Visitor<String?> {
     *     override fun visitBrlAccount(brlAccount: BrlExternalAccountInfo): String? = brlAccount.toString()
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
            slvAccount != null -> visitor.visitSlvAccount(slvAccount)
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

                override fun visitSlvAccount(slvAccount: SlvAccount) {
                    slvAccount.validate()
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

                override fun visitSlvAccount(slvAccount: SlvAccount) = slvAccount.validity()

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
            pkrAccount == other.pkrAccount &&
            slvAccount == other.slvAccount
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
            slvAccount,
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
            slvAccount != null -> "ExternalAccountInfoOneOf{slvAccount=$slvAccount}"
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

        fun ofSlvAccount(slvAccount: SlvAccount) = ExternalAccountInfoOneOf(slvAccount = slvAccount)
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

        fun visitSlvAccount(slvAccount: SlvAccount): T

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
                "SLV_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SlvAccount>())?.let {
                        ExternalAccountInfoOneOf(slvAccount = it, _json = json)
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
                value.slvAccount != null -> generator.writeObject(value.slvAccount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountInfoOneOf")
            }
        }
    }

    class SlvAccount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountType: JsonValue,
        private val beneficiary: JsonField<Beneficiary>,
        private val paymentRails: JsonField<List<PaymentRail>>,
        private val accountNumber: JsonField<String>,
        private val bankAccountType: JsonField<BankAccountType>,
        private val bankName: JsonField<String>,
        private val phoneNumber: JsonField<String>,
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
            beneficiary,
            paymentRails,
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
         * The account number of the bank (BANK_TRANSFER only)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun accountNumber(): String? = accountNumber.getNullable("accountNumber")

        /**
         * The bank account type (BANK_TRANSFER only)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankAccountType(): BankAccountType? = bankAccountType.getNullable("bankAccountType")

        /**
         * The name of the bank (BANK_TRANSFER only)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun bankName(): String? = bankName.getNullable("bankName")

        /**
         * The phone number in international format (MOBILE_MONEY only — e.g. Tigo Money)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun phoneNumber(): String? = phoneNumber.getNullable("phoneNumber")

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
         * Unlike [bankAccountType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("bankAccountType")
        @ExcludeMissing
        fun _bankAccountType(): JsonField<BankAccountType> = bankAccountType

        /**
         * Returns the raw JSON value of [bankName].
         *
         * Unlike [bankName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("bankName") @ExcludeMissing fun _bankName(): JsonField<String> = bankName

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
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
             * .beneficiary()
             * .paymentRails()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [SlvAccount]. */
        class Builder internal constructor() {

            private var accountType: JsonValue = JsonValue.from("SLV_ACCOUNT")
            private var beneficiary: JsonField<Beneficiary>? = null
            private var paymentRails: JsonField<MutableList<PaymentRail>>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var bankAccountType: JsonField<BankAccountType> = JsonMissing.of()
            private var bankName: JsonField<String> = JsonMissing.of()
            private var phoneNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(slvAccount: SlvAccount) = apply {
                accountType = slvAccount.accountType
                beneficiary = slvAccount.beneficiary
                paymentRails = slvAccount.paymentRails.map { it.toMutableList() }
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

            /** The account number of the bank (BANK_TRANSFER only) */
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

            /** The bank account type (BANK_TRANSFER only) */
            fun bankAccountType(bankAccountType: BankAccountType) =
                bankAccountType(JsonField.of(bankAccountType))

            /**
             * Sets [Builder.bankAccountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankAccountType] with a well-typed [BankAccountType]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun bankAccountType(bankAccountType: JsonField<BankAccountType>) = apply {
                this.bankAccountType = bankAccountType
            }

            /** The name of the bank (BANK_TRANSFER only) */
            fun bankName(bankName: String) = bankName(JsonField.of(bankName))

            /**
             * Sets [Builder.bankName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bankName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun bankName(bankName: JsonField<String>) = apply { this.bankName = bankName }

            /** The phone number in international format (MOBILE_MONEY only — e.g. Tigo Money) */
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
             * Returns an immutable instance of [SlvAccount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .beneficiary()
             * .paymentRails()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SlvAccount =
                SlvAccount(
                    accountType,
                    checkRequired("beneficiary", beneficiary),
                    checkRequired("paymentRails", paymentRails).map { it.toImmutable() },
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
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
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
            beneficiary().validate()
            paymentRails().forEach { it.validate() }
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
                (beneficiary.asKnown()?.validity() ?: 0) +
                (paymentRails.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (accountNumber.asKnown() == null) 0 else 1) +
                (bankAccountType.asKnown()?.validity() ?: 0) +
                (if (bankName.asKnown() == null) 0 else 1) +
                (if (phoneNumber.asKnown() == null) 0 else 1)

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

            /**
             * Maps this instance's current variant to a value of type [T] using the given
             * [visitor].
             *
             * Note that this method is _not_ forwards compatible with new variants from the API,
             * unless [visitor] overrides [Visitor.unknown]. To handle variants not known to this
             * version of the SDK gracefully, consider overriding [Visitor.unknown]:
             * ```kotlin
             * import com.lightspark.grid.core.JsonValue
             *
             * val result: String? = beneficiary.accept(object : Beneficiary.Visitor<String?> {
             *     override fun visitIndividual(individual: Individual): String? = individual.toString()
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
                    individual != null -> visitor.visitIndividual(individual)
                    business != null -> visitor.visitBusiness(business)
                    else -> visitor.unknown(_json)
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
                ) : this(
                    beneficiaryType,
                    fullName,
                    address,
                    birthDate,
                    countryOfResidence,
                    email,
                    nationality,
                    phoneNumber,
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
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
                        (if (phoneNumber.asKnown() == null) 0 else 1)

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
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Individual{beneficiaryType=$beneficiaryType, fullName=$fullName, address=$address, birthDate=$birthDate, countryOfResidence=$countryOfResidence, email=$email, nationality=$nationality, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
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
             * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
             *   known member.
             */
            fun known(): Known =
                when (this) {
                    BANK_TRANSFER -> Known.BANK_TRANSFER
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
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
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
             * An enum containing [BankAccountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BankAccountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVINGS,
                /**
                 * An enum member indicating that [BankAccountType] was instantiated with an unknown
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
                        throw LightsparkGridInvalidDataException("Unknown BankAccountType: $value")
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
                beneficiary == other.beneficiary &&
                paymentRails == other.paymentRails &&
                accountNumber == other.accountNumber &&
                bankAccountType == other.bankAccountType &&
                bankName == other.bankName &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accountType,
                beneficiary,
                paymentRails,
                accountNumber,
                bankAccountType,
                bankName,
                phoneNumber,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SlvAccount{accountType=$accountType, beneficiary=$beneficiary, paymentRails=$paymentRails, accountNumber=$accountNumber, bankAccountType=$bankAccountType, bankName=$bankName, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }
}
