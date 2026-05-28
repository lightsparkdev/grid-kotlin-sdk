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
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.BdtExternalAccountCreateInfo
import com.lightspark.grid.models.BrlExternalAccountCreateInfo
import com.lightspark.grid.models.BwpExternalAccountCreateInfo
import com.lightspark.grid.models.CadExternalAccountCreateInfo
import com.lightspark.grid.models.CopExternalAccountCreateInfo
import com.lightspark.grid.models.DkkExternalAccountCreateInfo
import com.lightspark.grid.models.EgpExternalAccountCreateInfo
import com.lightspark.grid.models.EurExternalAccountCreateInfo
import com.lightspark.grid.models.GbpExternalAccountCreateInfo
import com.lightspark.grid.models.GhsExternalAccountCreateInfo
import com.lightspark.grid.models.GtqExternalAccountCreateInfo
import com.lightspark.grid.models.HkdExternalAccountCreateInfo
import com.lightspark.grid.models.HtgExternalAccountCreateInfo
import com.lightspark.grid.models.IdrExternalAccountCreateInfo
import com.lightspark.grid.models.InrExternalAccountCreateInfo
import com.lightspark.grid.models.JmdExternalAccountCreateInfo
import com.lightspark.grid.models.KesExternalAccountCreateInfo
import com.lightspark.grid.models.MwkExternalAccountCreateInfo
import com.lightspark.grid.models.MxnExternalAccountCreateInfo
import com.lightspark.grid.models.MyrExternalAccountCreateInfo
import com.lightspark.grid.models.NgnExternalAccountCreateInfo
import com.lightspark.grid.models.PhpExternalAccountCreateInfo
import com.lightspark.grid.models.PkrExternalAccountCreateInfo
import com.lightspark.grid.models.RwfExternalAccountCreateInfo
import com.lightspark.grid.models.SgdExternalAccountCreateInfo
import com.lightspark.grid.models.SlvExternalAccountCreateInfo
import com.lightspark.grid.models.SwiftExternalAccountCreateInfo
import com.lightspark.grid.models.ThbExternalAccountCreateInfo
import com.lightspark.grid.models.TzsExternalAccountCreateInfo
import com.lightspark.grid.models.UgxExternalAccountCreateInfo
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.VndExternalAccountCreateInfo
import com.lightspark.grid.models.XafExternalAccountCreateInfo
import com.lightspark.grid.models.XofExternalAccountCreateInfo
import com.lightspark.grid.models.ZarExternalAccountCreateInfo
import com.lightspark.grid.models.ZmwExternalAccountCreateInfo
import java.util.Objects

/**
 * Required fields depend on the selected paymentRails:
 * - BANK_TRANSFER: accountNumber
 * - MOBILE_MONEY: phoneNumber
 */
@JsonDeserialize(using = ExternalAccountCreateInfoOneOf.Deserializer::class)
@JsonSerialize(using = ExternalAccountCreateInfoOneOf.Serializer::class)
class ExternalAccountCreateInfoOneOf
private constructor(
    private val aedAccount: AedExternalAccountCreateInfo? = null,
    private val bdtAccount: BdtExternalAccountCreateInfo? = null,
    private val brlAccount: BrlExternalAccountCreateInfo? = null,
    private val bwpAccount: BwpExternalAccountCreateInfo? = null,
    private val cadAccount: CadExternalAccountCreateInfo? = null,
    private val copAccount: CopExternalAccountCreateInfo? = null,
    private val dkkAccount: DkkExternalAccountCreateInfo? = null,
    private val egpAccount: EgpExternalAccountCreateInfo? = null,
    private val eurAccount: EurExternalAccountCreateInfo? = null,
    private val gbpAccount: GbpExternalAccountCreateInfo? = null,
    private val ghsAccount: GhsExternalAccountCreateInfo? = null,
    private val gtqAccount: GtqExternalAccountCreateInfo? = null,
    private val hkdAccount: HkdExternalAccountCreateInfo? = null,
    private val htgAccount: HtgExternalAccountCreateInfo? = null,
    private val idrAccount: IdrExternalAccountCreateInfo? = null,
    private val inrAccount: InrExternalAccountCreateInfo? = null,
    private val jmdAccount: JmdExternalAccountCreateInfo? = null,
    private val kesAccount: KesExternalAccountCreateInfo? = null,
    private val mwkAccount: MwkExternalAccountCreateInfo? = null,
    private val mxnAccount: MxnExternalAccountCreateInfo? = null,
    private val myrAccount: MyrExternalAccountCreateInfo? = null,
    private val ngnAccount: NgnExternalAccountCreateInfo? = null,
    private val phpAccount: PhpExternalAccountCreateInfo? = null,
    private val pkrAccount: PkrExternalAccountCreateInfo? = null,
    private val rwfAccount: RwfExternalAccountCreateInfo? = null,
    private val sgdAccount: SgdExternalAccountCreateInfo? = null,
    private val slvAccount: SlvExternalAccountCreateInfo? = null,
    private val thbAccount: ThbExternalAccountCreateInfo? = null,
    private val tzsAccount: TzsExternalAccountCreateInfo? = null,
    private val ugxAccount: UgxExternalAccountCreateInfo? = null,
    private val usdAccount: UsdExternalAccountCreateInfo? = null,
    private val vndAccount: VndExternalAccountCreateInfo? = null,
    private val xafAccount: XafExternalAccountCreateInfo? = null,
    private val xofAccount: XofExternalAccountCreateInfo? = null,
    private val zarAccount: ZarExternalAccountCreateInfo? = null,
    private val zmwAccount: ZmwExternalAccountCreateInfo? = null,
    private val swiftAccount: SwiftExternalAccountCreateInfo? = null,
    private val _json: JsonValue? = null,
) {

    fun aedAccount(): AedExternalAccountCreateInfo? = aedAccount

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    fun bdtAccount(): BdtExternalAccountCreateInfo? = bdtAccount

    fun brlAccount(): BrlExternalAccountCreateInfo? = brlAccount

    fun bwpAccount(): BwpExternalAccountCreateInfo? = bwpAccount

    fun cadAccount(): CadExternalAccountCreateInfo? = cadAccount

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: bankName, accountNumber, bankAccountType
     * - MOBILE_MONEY: phoneNumber
     */
    fun copAccount(): CopExternalAccountCreateInfo? = copAccount

    fun dkkAccount(): DkkExternalAccountCreateInfo? = dkkAccount

    fun egpAccount(): EgpExternalAccountCreateInfo? = egpAccount

    fun eurAccount(): EurExternalAccountCreateInfo? = eurAccount

    fun gbpAccount(): GbpExternalAccountCreateInfo? = gbpAccount

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    fun ghsAccount(): GhsExternalAccountCreateInfo? = ghsAccount

    fun gtqAccount(): GtqExternalAccountCreateInfo? = gtqAccount

    fun hkdAccount(): HkdExternalAccountCreateInfo? = hkdAccount

    fun htgAccount(): HtgExternalAccountCreateInfo? = htgAccount

    fun idrAccount(): IdrExternalAccountCreateInfo? = idrAccount

    fun inrAccount(): InrExternalAccountCreateInfo? = inrAccount

    fun jmdAccount(): JmdExternalAccountCreateInfo? = jmdAccount

    fun kesAccount(): KesExternalAccountCreateInfo? = kesAccount

    fun mwkAccount(): MwkExternalAccountCreateInfo? = mwkAccount

    fun mxnAccount(): MxnExternalAccountCreateInfo? = mxnAccount

    fun myrAccount(): MyrExternalAccountCreateInfo? = myrAccount

    fun ngnAccount(): NgnExternalAccountCreateInfo? = ngnAccount

    fun phpAccount(): PhpExternalAccountCreateInfo? = phpAccount

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: bankName, phoneNumber
     */
    fun pkrAccount(): PkrExternalAccountCreateInfo? = pkrAccount

    fun rwfAccount(): RwfExternalAccountCreateInfo? = rwfAccount

    fun sgdAccount(): SgdExternalAccountCreateInfo? = sgdAccount

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: bankAccountType, accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    fun slvAccount(): SlvExternalAccountCreateInfo? = slvAccount

    fun thbAccount(): ThbExternalAccountCreateInfo? = thbAccount

    fun tzsAccount(): TzsExternalAccountCreateInfo? = tzsAccount

    fun ugxAccount(): UgxExternalAccountCreateInfo? = ugxAccount

    fun usdAccount(): UsdExternalAccountCreateInfo? = usdAccount

    fun vndAccount(): VndExternalAccountCreateInfo? = vndAccount

    fun xafAccount(): XafExternalAccountCreateInfo? = xafAccount

    fun xofAccount(): XofExternalAccountCreateInfo? = xofAccount

    fun zarAccount(): ZarExternalAccountCreateInfo? = zarAccount

    fun zmwAccount(): ZmwExternalAccountCreateInfo? = zmwAccount

    fun swiftAccount(): SwiftExternalAccountCreateInfo? = swiftAccount

    fun isAedAccount(): Boolean = aedAccount != null

    fun isBdtAccount(): Boolean = bdtAccount != null

    fun isBrlAccount(): Boolean = brlAccount != null

    fun isBwpAccount(): Boolean = bwpAccount != null

    fun isCadAccount(): Boolean = cadAccount != null

    fun isCopAccount(): Boolean = copAccount != null

    fun isDkkAccount(): Boolean = dkkAccount != null

    fun isEgpAccount(): Boolean = egpAccount != null

    fun isEurAccount(): Boolean = eurAccount != null

    fun isGbpAccount(): Boolean = gbpAccount != null

    fun isGhsAccount(): Boolean = ghsAccount != null

    fun isGtqAccount(): Boolean = gtqAccount != null

    fun isHkdAccount(): Boolean = hkdAccount != null

    fun isHtgAccount(): Boolean = htgAccount != null

    fun isIdrAccount(): Boolean = idrAccount != null

    fun isInrAccount(): Boolean = inrAccount != null

    fun isJmdAccount(): Boolean = jmdAccount != null

    fun isKesAccount(): Boolean = kesAccount != null

    fun isMwkAccount(): Boolean = mwkAccount != null

    fun isMxnAccount(): Boolean = mxnAccount != null

    fun isMyrAccount(): Boolean = myrAccount != null

    fun isNgnAccount(): Boolean = ngnAccount != null

    fun isPhpAccount(): Boolean = phpAccount != null

    fun isPkrAccount(): Boolean = pkrAccount != null

    fun isRwfAccount(): Boolean = rwfAccount != null

    fun isSgdAccount(): Boolean = sgdAccount != null

    fun isSlvAccount(): Boolean = slvAccount != null

    fun isThbAccount(): Boolean = thbAccount != null

    fun isTzsAccount(): Boolean = tzsAccount != null

    fun isUgxAccount(): Boolean = ugxAccount != null

    fun isUsdAccount(): Boolean = usdAccount != null

    fun isVndAccount(): Boolean = vndAccount != null

    fun isXafAccount(): Boolean = xafAccount != null

    fun isXofAccount(): Boolean = xofAccount != null

    fun isZarAccount(): Boolean = zarAccount != null

    fun isZmwAccount(): Boolean = zmwAccount != null

    fun isSwiftAccount(): Boolean = swiftAccount != null

    fun asAedAccount(): AedExternalAccountCreateInfo = aedAccount.getOrThrow("aedAccount")

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    fun asBdtAccount(): BdtExternalAccountCreateInfo = bdtAccount.getOrThrow("bdtAccount")

    fun asBrlAccount(): BrlExternalAccountCreateInfo = brlAccount.getOrThrow("brlAccount")

    fun asBwpAccount(): BwpExternalAccountCreateInfo = bwpAccount.getOrThrow("bwpAccount")

    fun asCadAccount(): CadExternalAccountCreateInfo = cadAccount.getOrThrow("cadAccount")

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: bankName, accountNumber, bankAccountType
     * - MOBILE_MONEY: phoneNumber
     */
    fun asCopAccount(): CopExternalAccountCreateInfo = copAccount.getOrThrow("copAccount")

    fun asDkkAccount(): DkkExternalAccountCreateInfo = dkkAccount.getOrThrow("dkkAccount")

    fun asEgpAccount(): EgpExternalAccountCreateInfo = egpAccount.getOrThrow("egpAccount")

    fun asEurAccount(): EurExternalAccountCreateInfo = eurAccount.getOrThrow("eurAccount")

    fun asGbpAccount(): GbpExternalAccountCreateInfo = gbpAccount.getOrThrow("gbpAccount")

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    fun asGhsAccount(): GhsExternalAccountCreateInfo = ghsAccount.getOrThrow("ghsAccount")

    fun asGtqAccount(): GtqExternalAccountCreateInfo = gtqAccount.getOrThrow("gtqAccount")

    fun asHkdAccount(): HkdExternalAccountCreateInfo = hkdAccount.getOrThrow("hkdAccount")

    fun asHtgAccount(): HtgExternalAccountCreateInfo = htgAccount.getOrThrow("htgAccount")

    fun asIdrAccount(): IdrExternalAccountCreateInfo = idrAccount.getOrThrow("idrAccount")

    fun asInrAccount(): InrExternalAccountCreateInfo = inrAccount.getOrThrow("inrAccount")

    fun asJmdAccount(): JmdExternalAccountCreateInfo = jmdAccount.getOrThrow("jmdAccount")

    fun asKesAccount(): KesExternalAccountCreateInfo = kesAccount.getOrThrow("kesAccount")

    fun asMwkAccount(): MwkExternalAccountCreateInfo = mwkAccount.getOrThrow("mwkAccount")

    fun asMxnAccount(): MxnExternalAccountCreateInfo = mxnAccount.getOrThrow("mxnAccount")

    fun asMyrAccount(): MyrExternalAccountCreateInfo = myrAccount.getOrThrow("myrAccount")

    fun asNgnAccount(): NgnExternalAccountCreateInfo = ngnAccount.getOrThrow("ngnAccount")

    fun asPhpAccount(): PhpExternalAccountCreateInfo = phpAccount.getOrThrow("phpAccount")

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: accountNumber
     * - MOBILE_MONEY: bankName, phoneNumber
     */
    fun asPkrAccount(): PkrExternalAccountCreateInfo = pkrAccount.getOrThrow("pkrAccount")

    fun asRwfAccount(): RwfExternalAccountCreateInfo = rwfAccount.getOrThrow("rwfAccount")

    fun asSgdAccount(): SgdExternalAccountCreateInfo = sgdAccount.getOrThrow("sgdAccount")

    /**
     * Required fields depend on the selected paymentRails:
     * - BANK_TRANSFER: bankAccountType, accountNumber
     * - MOBILE_MONEY: phoneNumber
     */
    fun asSlvAccount(): SlvExternalAccountCreateInfo = slvAccount.getOrThrow("slvAccount")

    fun asThbAccount(): ThbExternalAccountCreateInfo = thbAccount.getOrThrow("thbAccount")

    fun asTzsAccount(): TzsExternalAccountCreateInfo = tzsAccount.getOrThrow("tzsAccount")

    fun asUgxAccount(): UgxExternalAccountCreateInfo = ugxAccount.getOrThrow("ugxAccount")

    fun asUsdAccount(): UsdExternalAccountCreateInfo = usdAccount.getOrThrow("usdAccount")

    fun asVndAccount(): VndExternalAccountCreateInfo = vndAccount.getOrThrow("vndAccount")

    fun asXafAccount(): XafExternalAccountCreateInfo = xafAccount.getOrThrow("xafAccount")

    fun asXofAccount(): XofExternalAccountCreateInfo = xofAccount.getOrThrow("xofAccount")

    fun asZarAccount(): ZarExternalAccountCreateInfo = zarAccount.getOrThrow("zarAccount")

    fun asZmwAccount(): ZmwExternalAccountCreateInfo = zmwAccount.getOrThrow("zmwAccount")

    fun asSwiftAccount(): SwiftExternalAccountCreateInfo = swiftAccount.getOrThrow("swiftAccount")

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
     * val result: String? = externalAccountCreateInfoOneOf.accept(object : ExternalAccountCreateInfoOneOf.Visitor<String?> {
     *     override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo): String? = aedAccount.toString()
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
            aedAccount != null -> visitor.visitAedAccount(aedAccount)
            bdtAccount != null -> visitor.visitBdtAccount(bdtAccount)
            brlAccount != null -> visitor.visitBrlAccount(brlAccount)
            bwpAccount != null -> visitor.visitBwpAccount(bwpAccount)
            cadAccount != null -> visitor.visitCadAccount(cadAccount)
            copAccount != null -> visitor.visitCopAccount(copAccount)
            dkkAccount != null -> visitor.visitDkkAccount(dkkAccount)
            egpAccount != null -> visitor.visitEgpAccount(egpAccount)
            eurAccount != null -> visitor.visitEurAccount(eurAccount)
            gbpAccount != null -> visitor.visitGbpAccount(gbpAccount)
            ghsAccount != null -> visitor.visitGhsAccount(ghsAccount)
            gtqAccount != null -> visitor.visitGtqAccount(gtqAccount)
            hkdAccount != null -> visitor.visitHkdAccount(hkdAccount)
            htgAccount != null -> visitor.visitHtgAccount(htgAccount)
            idrAccount != null -> visitor.visitIdrAccount(idrAccount)
            inrAccount != null -> visitor.visitInrAccount(inrAccount)
            jmdAccount != null -> visitor.visitJmdAccount(jmdAccount)
            kesAccount != null -> visitor.visitKesAccount(kesAccount)
            mwkAccount != null -> visitor.visitMwkAccount(mwkAccount)
            mxnAccount != null -> visitor.visitMxnAccount(mxnAccount)
            myrAccount != null -> visitor.visitMyrAccount(myrAccount)
            ngnAccount != null -> visitor.visitNgnAccount(ngnAccount)
            phpAccount != null -> visitor.visitPhpAccount(phpAccount)
            pkrAccount != null -> visitor.visitPkrAccount(pkrAccount)
            rwfAccount != null -> visitor.visitRwfAccount(rwfAccount)
            sgdAccount != null -> visitor.visitSgdAccount(sgdAccount)
            slvAccount != null -> visitor.visitSlvAccount(slvAccount)
            thbAccount != null -> visitor.visitThbAccount(thbAccount)
            tzsAccount != null -> visitor.visitTzsAccount(tzsAccount)
            ugxAccount != null -> visitor.visitUgxAccount(ugxAccount)
            usdAccount != null -> visitor.visitUsdAccount(usdAccount)
            vndAccount != null -> visitor.visitVndAccount(vndAccount)
            xafAccount != null -> visitor.visitXafAccount(xafAccount)
            xofAccount != null -> visitor.visitXofAccount(xofAccount)
            zarAccount != null -> visitor.visitZarAccount(zarAccount)
            zmwAccount != null -> visitor.visitZmwAccount(zmwAccount)
            swiftAccount != null -> visitor.visitSwiftAccount(swiftAccount)
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
    fun validate(): ExternalAccountCreateInfoOneOf = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo) {
                    aedAccount.validate()
                }

                override fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) {
                    bdtAccount.validate()
                }

                override fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo) {
                    brlAccount.validate()
                }

                override fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) {
                    bwpAccount.validate()
                }

                override fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo) {
                    cadAccount.validate()
                }

                override fun visitCopAccount(copAccount: CopExternalAccountCreateInfo) {
                    copAccount.validate()
                }

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) {
                    dkkAccount.validate()
                }

                override fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo) {
                    egpAccount.validate()
                }

                override fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo) {
                    eurAccount.validate()
                }

                override fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) {
                    gbpAccount.validate()
                }

                override fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) {
                    ghsAccount.validate()
                }

                override fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) {
                    gtqAccount.validate()
                }

                override fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) {
                    hkdAccount.validate()
                }

                override fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo) {
                    htgAccount.validate()
                }

                override fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo) {
                    idrAccount.validate()
                }

                override fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo) {
                    inrAccount.validate()
                }

                override fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) {
                    jmdAccount.validate()
                }

                override fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo) {
                    kesAccount.validate()
                }

                override fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) {
                    mwkAccount.validate()
                }

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) {
                    mxnAccount.validate()
                }

                override fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo) {
                    myrAccount.validate()
                }

                override fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) {
                    ngnAccount.validate()
                }

                override fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo) {
                    phpAccount.validate()
                }

                override fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) {
                    pkrAccount.validate()
                }

                override fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) {
                    rwfAccount.validate()
                }

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) {
                    sgdAccount.validate()
                }

                override fun visitSlvAccount(slvAccount: SlvExternalAccountCreateInfo) {
                    slvAccount.validate()
                }

                override fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo) {
                    thbAccount.validate()
                }

                override fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) {
                    tzsAccount.validate()
                }

                override fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) {
                    ugxAccount.validate()
                }

                override fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo) {
                    usdAccount.validate()
                }

                override fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo) {
                    vndAccount.validate()
                }

                override fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo) {
                    xafAccount.validate()
                }

                override fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo) {
                    xofAccount.validate()
                }

                override fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo) {
                    zarAccount.validate()
                }

                override fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) {
                    zmwAccount.validate()
                }

                override fun visitSwiftAccount(swiftAccount: SwiftExternalAccountCreateInfo) {
                    swiftAccount.validate()
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
                override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo) =
                    aedAccount.validity()

                override fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) =
                    bdtAccount.validity()

                override fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo) =
                    brlAccount.validity()

                override fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) =
                    bwpAccount.validity()

                override fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo) =
                    cadAccount.validity()

                override fun visitCopAccount(copAccount: CopExternalAccountCreateInfo) =
                    copAccount.validity()

                override fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) =
                    dkkAccount.validity()

                override fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo) =
                    egpAccount.validity()

                override fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo) =
                    eurAccount.validity()

                override fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) =
                    gbpAccount.validity()

                override fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) =
                    ghsAccount.validity()

                override fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) =
                    gtqAccount.validity()

                override fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) =
                    hkdAccount.validity()

                override fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo) =
                    htgAccount.validity()

                override fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo) =
                    idrAccount.validity()

                override fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo) =
                    inrAccount.validity()

                override fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) =
                    jmdAccount.validity()

                override fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo) =
                    kesAccount.validity()

                override fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) =
                    mwkAccount.validity()

                override fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) =
                    mxnAccount.validity()

                override fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo) =
                    myrAccount.validity()

                override fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) =
                    ngnAccount.validity()

                override fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo) =
                    phpAccount.validity()

                override fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) =
                    pkrAccount.validity()

                override fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) =
                    rwfAccount.validity()

                override fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) =
                    sgdAccount.validity()

                override fun visitSlvAccount(slvAccount: SlvExternalAccountCreateInfo) =
                    slvAccount.validity()

                override fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo) =
                    thbAccount.validity()

                override fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) =
                    tzsAccount.validity()

                override fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) =
                    ugxAccount.validity()

                override fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo) =
                    usdAccount.validity()

                override fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo) =
                    vndAccount.validity()

                override fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo) =
                    xafAccount.validity()

                override fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo) =
                    xofAccount.validity()

                override fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo) =
                    zarAccount.validity()

                override fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) =
                    zmwAccount.validity()

                override fun visitSwiftAccount(swiftAccount: SwiftExternalAccountCreateInfo) =
                    swiftAccount.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountCreateInfoOneOf &&
            aedAccount == other.aedAccount &&
            bdtAccount == other.bdtAccount &&
            brlAccount == other.brlAccount &&
            bwpAccount == other.bwpAccount &&
            cadAccount == other.cadAccount &&
            copAccount == other.copAccount &&
            dkkAccount == other.dkkAccount &&
            egpAccount == other.egpAccount &&
            eurAccount == other.eurAccount &&
            gbpAccount == other.gbpAccount &&
            ghsAccount == other.ghsAccount &&
            gtqAccount == other.gtqAccount &&
            hkdAccount == other.hkdAccount &&
            htgAccount == other.htgAccount &&
            idrAccount == other.idrAccount &&
            inrAccount == other.inrAccount &&
            jmdAccount == other.jmdAccount &&
            kesAccount == other.kesAccount &&
            mwkAccount == other.mwkAccount &&
            mxnAccount == other.mxnAccount &&
            myrAccount == other.myrAccount &&
            ngnAccount == other.ngnAccount &&
            phpAccount == other.phpAccount &&
            pkrAccount == other.pkrAccount &&
            rwfAccount == other.rwfAccount &&
            sgdAccount == other.sgdAccount &&
            slvAccount == other.slvAccount &&
            thbAccount == other.thbAccount &&
            tzsAccount == other.tzsAccount &&
            ugxAccount == other.ugxAccount &&
            usdAccount == other.usdAccount &&
            vndAccount == other.vndAccount &&
            xafAccount == other.xafAccount &&
            xofAccount == other.xofAccount &&
            zarAccount == other.zarAccount &&
            zmwAccount == other.zmwAccount &&
            swiftAccount == other.swiftAccount
    }

    override fun hashCode(): Int =
        Objects.hash(
            aedAccount,
            bdtAccount,
            brlAccount,
            bwpAccount,
            cadAccount,
            copAccount,
            dkkAccount,
            egpAccount,
            eurAccount,
            gbpAccount,
            ghsAccount,
            gtqAccount,
            hkdAccount,
            htgAccount,
            idrAccount,
            inrAccount,
            jmdAccount,
            kesAccount,
            mwkAccount,
            mxnAccount,
            myrAccount,
            ngnAccount,
            phpAccount,
            pkrAccount,
            rwfAccount,
            sgdAccount,
            slvAccount,
            thbAccount,
            tzsAccount,
            ugxAccount,
            usdAccount,
            vndAccount,
            xafAccount,
            xofAccount,
            zarAccount,
            zmwAccount,
            swiftAccount,
        )

    override fun toString(): String =
        when {
            aedAccount != null -> "ExternalAccountCreateInfoOneOf{aedAccount=$aedAccount}"
            bdtAccount != null -> "ExternalAccountCreateInfoOneOf{bdtAccount=$bdtAccount}"
            brlAccount != null -> "ExternalAccountCreateInfoOneOf{brlAccount=$brlAccount}"
            bwpAccount != null -> "ExternalAccountCreateInfoOneOf{bwpAccount=$bwpAccount}"
            cadAccount != null -> "ExternalAccountCreateInfoOneOf{cadAccount=$cadAccount}"
            copAccount != null -> "ExternalAccountCreateInfoOneOf{copAccount=$copAccount}"
            dkkAccount != null -> "ExternalAccountCreateInfoOneOf{dkkAccount=$dkkAccount}"
            egpAccount != null -> "ExternalAccountCreateInfoOneOf{egpAccount=$egpAccount}"
            eurAccount != null -> "ExternalAccountCreateInfoOneOf{eurAccount=$eurAccount}"
            gbpAccount != null -> "ExternalAccountCreateInfoOneOf{gbpAccount=$gbpAccount}"
            ghsAccount != null -> "ExternalAccountCreateInfoOneOf{ghsAccount=$ghsAccount}"
            gtqAccount != null -> "ExternalAccountCreateInfoOneOf{gtqAccount=$gtqAccount}"
            hkdAccount != null -> "ExternalAccountCreateInfoOneOf{hkdAccount=$hkdAccount}"
            htgAccount != null -> "ExternalAccountCreateInfoOneOf{htgAccount=$htgAccount}"
            idrAccount != null -> "ExternalAccountCreateInfoOneOf{idrAccount=$idrAccount}"
            inrAccount != null -> "ExternalAccountCreateInfoOneOf{inrAccount=$inrAccount}"
            jmdAccount != null -> "ExternalAccountCreateInfoOneOf{jmdAccount=$jmdAccount}"
            kesAccount != null -> "ExternalAccountCreateInfoOneOf{kesAccount=$kesAccount}"
            mwkAccount != null -> "ExternalAccountCreateInfoOneOf{mwkAccount=$mwkAccount}"
            mxnAccount != null -> "ExternalAccountCreateInfoOneOf{mxnAccount=$mxnAccount}"
            myrAccount != null -> "ExternalAccountCreateInfoOneOf{myrAccount=$myrAccount}"
            ngnAccount != null -> "ExternalAccountCreateInfoOneOf{ngnAccount=$ngnAccount}"
            phpAccount != null -> "ExternalAccountCreateInfoOneOf{phpAccount=$phpAccount}"
            pkrAccount != null -> "ExternalAccountCreateInfoOneOf{pkrAccount=$pkrAccount}"
            rwfAccount != null -> "ExternalAccountCreateInfoOneOf{rwfAccount=$rwfAccount}"
            sgdAccount != null -> "ExternalAccountCreateInfoOneOf{sgdAccount=$sgdAccount}"
            slvAccount != null -> "ExternalAccountCreateInfoOneOf{slvAccount=$slvAccount}"
            thbAccount != null -> "ExternalAccountCreateInfoOneOf{thbAccount=$thbAccount}"
            tzsAccount != null -> "ExternalAccountCreateInfoOneOf{tzsAccount=$tzsAccount}"
            ugxAccount != null -> "ExternalAccountCreateInfoOneOf{ugxAccount=$ugxAccount}"
            usdAccount != null -> "ExternalAccountCreateInfoOneOf{usdAccount=$usdAccount}"
            vndAccount != null -> "ExternalAccountCreateInfoOneOf{vndAccount=$vndAccount}"
            xafAccount != null -> "ExternalAccountCreateInfoOneOf{xafAccount=$xafAccount}"
            xofAccount != null -> "ExternalAccountCreateInfoOneOf{xofAccount=$xofAccount}"
            zarAccount != null -> "ExternalAccountCreateInfoOneOf{zarAccount=$zarAccount}"
            zmwAccount != null -> "ExternalAccountCreateInfoOneOf{zmwAccount=$zmwAccount}"
            swiftAccount != null -> "ExternalAccountCreateInfoOneOf{swiftAccount=$swiftAccount}"
            _json != null -> "ExternalAccountCreateInfoOneOf{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ExternalAccountCreateInfoOneOf")
        }

    companion object {

        fun ofAedAccount(aedAccount: AedExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(aedAccount = aedAccount)

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun ofBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(bdtAccount = bdtAccount)

        fun ofBrlAccount(brlAccount: BrlExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(brlAccount = brlAccount)

        fun ofBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(bwpAccount = bwpAccount)

        fun ofCadAccount(cadAccount: CadExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(cadAccount = cadAccount)

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankName, accountNumber, bankAccountType
         * - MOBILE_MONEY: phoneNumber
         */
        fun ofCopAccount(copAccount: CopExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(copAccount = copAccount)

        fun ofDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(dkkAccount = dkkAccount)

        fun ofEgpAccount(egpAccount: EgpExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(egpAccount = egpAccount)

        fun ofEurAccount(eurAccount: EurExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(eurAccount = eurAccount)

        fun ofGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(gbpAccount = gbpAccount)

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun ofGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(ghsAccount = ghsAccount)

        fun ofGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(gtqAccount = gtqAccount)

        fun ofHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(hkdAccount = hkdAccount)

        fun ofHtgAccount(htgAccount: HtgExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(htgAccount = htgAccount)

        fun ofIdrAccount(idrAccount: IdrExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(idrAccount = idrAccount)

        fun ofInrAccount(inrAccount: InrExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(inrAccount = inrAccount)

        fun ofJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(jmdAccount = jmdAccount)

        fun ofKesAccount(kesAccount: KesExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(kesAccount = kesAccount)

        fun ofMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(mwkAccount = mwkAccount)

        fun ofMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(mxnAccount = mxnAccount)

        fun ofMyrAccount(myrAccount: MyrExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(myrAccount = myrAccount)

        fun ofNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(ngnAccount = ngnAccount)

        fun ofPhpAccount(phpAccount: PhpExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(phpAccount = phpAccount)

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: bankName, phoneNumber
         */
        fun ofPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(pkrAccount = pkrAccount)

        fun ofRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(rwfAccount = rwfAccount)

        fun ofSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(sgdAccount = sgdAccount)

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankAccountType, accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun ofSlvAccount(slvAccount: SlvExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(slvAccount = slvAccount)

        fun ofThbAccount(thbAccount: ThbExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(thbAccount = thbAccount)

        fun ofTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(tzsAccount = tzsAccount)

        fun ofUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(ugxAccount = ugxAccount)

        fun ofUsdAccount(usdAccount: UsdExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(usdAccount = usdAccount)

        fun ofVndAccount(vndAccount: VndExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(vndAccount = vndAccount)

        fun ofXafAccount(xafAccount: XafExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(xafAccount = xafAccount)

        fun ofXofAccount(xofAccount: XofExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(xofAccount = xofAccount)

        fun ofZarAccount(zarAccount: ZarExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(zarAccount = zarAccount)

        fun ofZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(zmwAccount = zmwAccount)

        fun ofSwiftAccount(swiftAccount: SwiftExternalAccountCreateInfo) =
            ExternalAccountCreateInfoOneOf(swiftAccount = swiftAccount)
    }

    /**
     * An interface that defines how to map each variant of [ExternalAccountCreateInfoOneOf] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo): T

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo): T

        fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo): T

        fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo): T

        fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo): T

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankName, accountNumber, bankAccountType
         * - MOBILE_MONEY: phoneNumber
         */
        fun visitCopAccount(copAccount: CopExternalAccountCreateInfo): T

        fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo): T

        fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo): T

        fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo): T

        fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo): T

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo): T

        fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo): T

        fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo): T

        fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo): T

        fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo): T

        fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo): T

        fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo): T

        fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo): T

        fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo): T

        fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo): T

        fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo): T

        fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo): T

        fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo): T

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: accountNumber
         * - MOBILE_MONEY: bankName, phoneNumber
         */
        fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo): T

        fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo): T

        fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo): T

        /**
         * Required fields depend on the selected paymentRails:
         * - BANK_TRANSFER: bankAccountType, accountNumber
         * - MOBILE_MONEY: phoneNumber
         */
        fun visitSlvAccount(slvAccount: SlvExternalAccountCreateInfo): T

        fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo): T

        fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo): T

        fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo): T

        fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo): T

        fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo): T

        fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo): T

        fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo): T

        fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo): T

        fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo): T

        fun visitSwiftAccount(swiftAccount: SwiftExternalAccountCreateInfo): T

        /**
         * Maps an unknown variant of [ExternalAccountCreateInfoOneOf] to a value of type [T].
         *
         * An instance of [ExternalAccountCreateInfoOneOf] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws LightsparkGridInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw LightsparkGridInvalidDataException(
                "Unknown ExternalAccountCreateInfoOneOf: $json"
            )
        }
    }

    internal class Deserializer :
        BaseDeserializer<ExternalAccountCreateInfoOneOf>(ExternalAccountCreateInfoOneOf::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ExternalAccountCreateInfoOneOf {
            val json = JsonValue.fromJsonNode(node)
            val accountType = json.asObject()?.get("accountType")?.asString()

            when (accountType) {
                "AED_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<AedExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(aedAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "BDT_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<BdtExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(bdtAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "BRL_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<BrlExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(brlAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "BWP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<BwpExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(bwpAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "CAD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<CadExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(cadAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "COP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<CopExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(copAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "DKK_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<DkkExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(dkkAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "EGP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<EgpExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(egpAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "EUR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<EurExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(eurAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "GBP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GbpExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(gbpAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "GHS_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GhsExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(ghsAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "GTQ_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<GtqExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(gtqAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "HKD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<HkdExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(hkdAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "HTG_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<HtgExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(htgAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "IDR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<IdrExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(idrAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "INR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<InrExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(inrAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "JMD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<JmdExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(jmdAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "KES_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<KesExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(kesAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "MWK_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<MwkExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(mwkAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "MXN_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<MxnExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(mxnAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "MYR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<MyrExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(myrAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "NGN_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<NgnExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(ngnAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "PHP_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PhpExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(phpAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "PKR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<PkrExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(pkrAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "RWF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<RwfExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(rwfAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "SGD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SgdExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(sgdAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "SLV_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SlvExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(slvAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "THB_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ThbExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(thbAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "TZS_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<TzsExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(tzsAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "UGX_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<UgxExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(ugxAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "USD_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<UsdExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(usdAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "VND_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<VndExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(vndAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "XAF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<XafExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(xafAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "XOF_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<XofExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(xofAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "ZAR_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ZarExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(zarAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "ZMW_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<ZmwExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(zmwAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
                "SWIFT_ACCOUNT" -> {
                    return tryDeserialize(node, jacksonTypeRef<SwiftExternalAccountCreateInfo>())
                        ?.let { ExternalAccountCreateInfoOneOf(swiftAccount = it, _json = json) }
                        ?: ExternalAccountCreateInfoOneOf(_json = json)
                }
            }

            return ExternalAccountCreateInfoOneOf(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<ExternalAccountCreateInfoOneOf>(ExternalAccountCreateInfoOneOf::class) {

        override fun serialize(
            value: ExternalAccountCreateInfoOneOf,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.aedAccount != null -> generator.writeObject(value.aedAccount)
                value.bdtAccount != null -> generator.writeObject(value.bdtAccount)
                value.brlAccount != null -> generator.writeObject(value.brlAccount)
                value.bwpAccount != null -> generator.writeObject(value.bwpAccount)
                value.cadAccount != null -> generator.writeObject(value.cadAccount)
                value.copAccount != null -> generator.writeObject(value.copAccount)
                value.dkkAccount != null -> generator.writeObject(value.dkkAccount)
                value.egpAccount != null -> generator.writeObject(value.egpAccount)
                value.eurAccount != null -> generator.writeObject(value.eurAccount)
                value.gbpAccount != null -> generator.writeObject(value.gbpAccount)
                value.ghsAccount != null -> generator.writeObject(value.ghsAccount)
                value.gtqAccount != null -> generator.writeObject(value.gtqAccount)
                value.hkdAccount != null -> generator.writeObject(value.hkdAccount)
                value.htgAccount != null -> generator.writeObject(value.htgAccount)
                value.idrAccount != null -> generator.writeObject(value.idrAccount)
                value.inrAccount != null -> generator.writeObject(value.inrAccount)
                value.jmdAccount != null -> generator.writeObject(value.jmdAccount)
                value.kesAccount != null -> generator.writeObject(value.kesAccount)
                value.mwkAccount != null -> generator.writeObject(value.mwkAccount)
                value.mxnAccount != null -> generator.writeObject(value.mxnAccount)
                value.myrAccount != null -> generator.writeObject(value.myrAccount)
                value.ngnAccount != null -> generator.writeObject(value.ngnAccount)
                value.phpAccount != null -> generator.writeObject(value.phpAccount)
                value.pkrAccount != null -> generator.writeObject(value.pkrAccount)
                value.rwfAccount != null -> generator.writeObject(value.rwfAccount)
                value.sgdAccount != null -> generator.writeObject(value.sgdAccount)
                value.slvAccount != null -> generator.writeObject(value.slvAccount)
                value.thbAccount != null -> generator.writeObject(value.thbAccount)
                value.tzsAccount != null -> generator.writeObject(value.tzsAccount)
                value.ugxAccount != null -> generator.writeObject(value.ugxAccount)
                value.usdAccount != null -> generator.writeObject(value.usdAccount)
                value.vndAccount != null -> generator.writeObject(value.vndAccount)
                value.xafAccount != null -> generator.writeObject(value.xafAccount)
                value.xofAccount != null -> generator.writeObject(value.xofAccount)
                value.zarAccount != null -> generator.writeObject(value.zarAccount)
                value.zmwAccount != null -> generator.writeObject(value.zmwAccount)
                value.swiftAccount != null -> generator.writeObject(value.swiftAccount)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ExternalAccountCreateInfoOneOf")
            }
        }
    }
}
