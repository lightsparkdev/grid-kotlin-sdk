// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

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
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.allMaxBy
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.AedExternalAccountCreateInfo
import com.lightspark.grid.models.BdtExternalAccountCreateInfo
import com.lightspark.grid.models.BrlExternalAccountCreateInfo
import com.lightspark.grid.models.BwpExternalAccountCreateInfo
import com.lightspark.grid.models.CadExternalAccountCreateInfo
import com.lightspark.grid.models.CopExternalAccountCreateInfo
import com.lightspark.grid.models.DkkExternalAccountCreateInfo
import com.lightspark.grid.models.EgpExternalAccountCreateInfo
import com.lightspark.grid.models.EthereumWalletExternalAccountInfo
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
import com.lightspark.grid.models.ThbExternalAccountCreateInfo
import com.lightspark.grid.models.TzsExternalAccountCreateInfo
import com.lightspark.grid.models.UgxExternalAccountCreateInfo
import com.lightspark.grid.models.UsdExternalAccountCreateInfo
import com.lightspark.grid.models.VndExternalAccountCreateInfo
import com.lightspark.grid.models.XafExternalAccountCreateInfo
import com.lightspark.grid.models.XofExternalAccountCreateInfo
import com.lightspark.grid.models.ZarExternalAccountCreateInfo
import com.lightspark.grid.models.ZmwExternalAccountCreateInfo
import com.lightspark.grid.models.customers.externalaccounts.BaseWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.LightningWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.PolygonWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.SolanaWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.SparkWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.TronWalletInfo
import java.util.Collections
import java.util.Objects

/** Register a new external bank account for the platform. */
class ExternalAccountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountInfo(): AccountInfo = body.accountInfo()

    /**
     * The ISO 4217 currency code
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): String = body.currency()

    /**
     * Your platform's identifier for the account in your system. This can be used to reference the
     * account by your own identifier.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformAccountId(): String? = body.platformAccountId()

    /**
     * Returns the raw JSON value of [accountInfo].
     *
     * Unlike [accountInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _accountInfo(): JsonField<AccountInfo> = body._accountInfo()

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _currency(): JsonField<String> = body._currency()

    /**
     * Returns the raw JSON value of [platformAccountId].
     *
     * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _platformAccountId(): JsonField<String> = body._platformAccountId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountInfo()
         * .currency()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ExternalAccountCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(externalAccountCreateParams: ExternalAccountCreateParams) = apply {
            body = externalAccountCreateParams.body.toBuilder()
            additionalHeaders = externalAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalAccountCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [accountInfo]
         * - [currency]
         * - [platformAccountId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun accountInfo(accountInfo: AccountInfo) = apply { body.accountInfo(accountInfo) }

        /**
         * Sets [Builder.accountInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountInfo] with a well-typed [AccountInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountInfo(accountInfo: JsonField<AccountInfo>) = apply {
            body.accountInfo(accountInfo)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofAedAccount(aedAccount)`. */
        fun accountInfo(aedAccount: AedExternalAccountCreateInfo) = apply {
            body.accountInfo(aedAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofBrlAccount(brlAccount)`. */
        fun accountInfo(brlAccount: BrlExternalAccountCreateInfo) = apply {
            body.accountInfo(brlAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofBwpAccount(bwpAccount)`. */
        fun accountInfo(bwpAccount: BwpExternalAccountCreateInfo) = apply {
            body.accountInfo(bwpAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofCadAccount(cadAccount)`. */
        fun accountInfo(cadAccount: CadExternalAccountCreateInfo) = apply {
            body.accountInfo(cadAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofDkkAccount(dkkAccount)`. */
        fun accountInfo(dkkAccount: DkkExternalAccountCreateInfo) = apply {
            body.accountInfo(dkkAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofEurAccount(eurAccount)`. */
        fun accountInfo(eurAccount: EurExternalAccountCreateInfo) = apply {
            body.accountInfo(eurAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofGbpAccount(gbpAccount)`. */
        fun accountInfo(gbpAccount: GbpExternalAccountCreateInfo) = apply {
            body.accountInfo(gbpAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofHkdAccount(hkdAccount)`. */
        fun accountInfo(hkdAccount: HkdExternalAccountCreateInfo) = apply {
            body.accountInfo(hkdAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofIdrAccount(idrAccount)`. */
        fun accountInfo(idrAccount: IdrExternalAccountCreateInfo) = apply {
            body.accountInfo(idrAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofInrAccount(inrAccount)`. */
        fun accountInfo(inrAccount: InrExternalAccountCreateInfo) = apply {
            body.accountInfo(inrAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofKesAccount(kesAccount)`. */
        fun accountInfo(kesAccount: KesExternalAccountCreateInfo) = apply {
            body.accountInfo(kesAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofMwkAccount(mwkAccount)`. */
        fun accountInfo(mwkAccount: MwkExternalAccountCreateInfo) = apply {
            body.accountInfo(mwkAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofMxnAccount(mxnAccount)`. */
        fun accountInfo(mxnAccount: MxnExternalAccountCreateInfo) = apply {
            body.accountInfo(mxnAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofMyrAccount(myrAccount)`. */
        fun accountInfo(myrAccount: MyrExternalAccountCreateInfo) = apply {
            body.accountInfo(myrAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofNgnAccount(ngnAccount)`. */
        fun accountInfo(ngnAccount: NgnExternalAccountCreateInfo) = apply {
            body.accountInfo(ngnAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofPhpAccount(phpAccount)`. */
        fun accountInfo(phpAccount: PhpExternalAccountCreateInfo) = apply {
            body.accountInfo(phpAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofRwfAccount(rwfAccount)`. */
        fun accountInfo(rwfAccount: RwfExternalAccountCreateInfo) = apply {
            body.accountInfo(rwfAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofSgdAccount(sgdAccount)`. */
        fun accountInfo(sgdAccount: SgdExternalAccountCreateInfo) = apply {
            body.accountInfo(sgdAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofThbAccount(thbAccount)`. */
        fun accountInfo(thbAccount: ThbExternalAccountCreateInfo) = apply {
            body.accountInfo(thbAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofTzsAccount(tzsAccount)`. */
        fun accountInfo(tzsAccount: TzsExternalAccountCreateInfo) = apply {
            body.accountInfo(tzsAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofUgxAccount(ugxAccount)`. */
        fun accountInfo(ugxAccount: UgxExternalAccountCreateInfo) = apply {
            body.accountInfo(ugxAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofUsdAccount(usdAccount)`. */
        fun accountInfo(usdAccount: UsdExternalAccountCreateInfo) = apply {
            body.accountInfo(usdAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofVndAccount(vndAccount)`. */
        fun accountInfo(vndAccount: VndExternalAccountCreateInfo) = apply {
            body.accountInfo(vndAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofXafAccount(xafAccount)`. */
        fun accountInfo(xafAccount: XafExternalAccountCreateInfo) = apply {
            body.accountInfo(xafAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofXofAccount(xofAccount)`. */
        fun accountInfo(xofAccount: XofExternalAccountCreateInfo) = apply {
            body.accountInfo(xofAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofZarAccount(zarAccount)`. */
        fun accountInfo(zarAccount: ZarExternalAccountCreateInfo) = apply {
            body.accountInfo(zarAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofZmwAccount(zmwAccount)`. */
        fun accountInfo(zmwAccount: ZmwExternalAccountCreateInfo) = apply {
            body.accountInfo(zmwAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofBdtAccount(bdtAccount)`. */
        fun accountInfo(bdtAccount: BdtExternalAccountCreateInfo) = apply {
            body.accountInfo(bdtAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofCopAccount(copAccount)`. */
        fun accountInfo(copAccount: CopExternalAccountCreateInfo) = apply {
            body.accountInfo(copAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofEgpAccount(egpAccount)`. */
        fun accountInfo(egpAccount: EgpExternalAccountCreateInfo) = apply {
            body.accountInfo(egpAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofGhsAccount(ghsAccount)`. */
        fun accountInfo(ghsAccount: GhsExternalAccountCreateInfo) = apply {
            body.accountInfo(ghsAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofGtqAccount(gtqAccount)`. */
        fun accountInfo(gtqAccount: GtqExternalAccountCreateInfo) = apply {
            body.accountInfo(gtqAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofHtgAccount(htgAccount)`. */
        fun accountInfo(htgAccount: HtgExternalAccountCreateInfo) = apply {
            body.accountInfo(htgAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofJmdAccount(jmdAccount)`. */
        fun accountInfo(jmdAccount: JmdExternalAccountCreateInfo) = apply {
            body.accountInfo(jmdAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofPkrAccount(pkrAccount)`. */
        fun accountInfo(pkrAccount: PkrExternalAccountCreateInfo) = apply {
            body.accountInfo(pkrAccount)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofSparkWallet(sparkWallet)`. */
        fun accountInfo(sparkWallet: SparkWalletInfo) = apply { body.accountInfo(sparkWallet) }

        /**
         * Alias for calling [accountInfo] with `AccountInfo.ofLightningWallet(lightningWallet)`.
         */
        fun accountInfo(lightningWallet: LightningWalletInfo) = apply {
            body.accountInfo(lightningWallet)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofSolanaWallet(solanaWallet)`. */
        fun accountInfo(solanaWallet: SolanaWalletInfo) = apply { body.accountInfo(solanaWallet) }

        /** Alias for calling [accountInfo] with `AccountInfo.ofTronWallet(tronWallet)`. */
        fun accountInfo(tronWallet: TronWalletInfo) = apply { body.accountInfo(tronWallet) }

        /** Alias for calling [accountInfo] with `AccountInfo.ofPolygonWallet(polygonWallet)`. */
        fun accountInfo(polygonWallet: PolygonWalletInfo) = apply {
            body.accountInfo(polygonWallet)
        }

        /** Alias for calling [accountInfo] with `AccountInfo.ofBaseWallet(baseWallet)`. */
        fun accountInfo(baseWallet: BaseWalletInfo) = apply { body.accountInfo(baseWallet) }

        /** Alias for calling [accountInfo] with `AccountInfo.ofEthereumWallet(ethereumWallet)`. */
        fun accountInfo(ethereumWallet: EthereumWalletExternalAccountInfo) = apply {
            body.accountInfo(ethereumWallet)
        }

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * EthereumWalletExternalAccountInfo.builder()
         *     .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun ethereumWalletAccountInfo(address: String) = apply {
            body.ethereumWalletAccountInfo(address)
        }

        /** The ISO 4217 currency code */
        fun currency(currency: String) = apply { body.currency(currency) }

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { body.currency(currency) }

        /**
         * Your platform's identifier for the account in your system. This can be used to reference
         * the account by your own identifier.
         */
        fun platformAccountId(platformAccountId: String) = apply {
            body.platformAccountId(platformAccountId)
        }

        /**
         * Sets [Builder.platformAccountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformAccountId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformAccountId(platformAccountId: JsonField<String>) = apply {
            body.platformAccountId(platformAccountId)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ExternalAccountCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .accountInfo()
         * .currency()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalAccountCreateParams =
            ExternalAccountCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accountInfo: JsonField<AccountInfo>,
        private val currency: JsonField<String>,
        private val platformAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountInfo")
            @ExcludeMissing
            accountInfo: JsonField<AccountInfo> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platformAccountId")
            @ExcludeMissing
            platformAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(accountInfo, currency, platformAccountId, mutableMapOf())

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountInfo(): AccountInfo = accountInfo.getRequired("accountInfo")

        /**
         * The ISO 4217 currency code
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun currency(): String = currency.getRequired("currency")

        /**
         * Your platform's identifier for the account in your system. This can be used to reference
         * the account by your own identifier.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun platformAccountId(): String? = platformAccountId.getNullable("platformAccountId")

        /**
         * Returns the raw JSON value of [accountInfo].
         *
         * Unlike [accountInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("accountInfo")
        @ExcludeMissing
        fun _accountInfo(): JsonField<AccountInfo> = accountInfo

        /**
         * Returns the raw JSON value of [currency].
         *
         * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

        /**
         * Returns the raw JSON value of [platformAccountId].
         *
         * Unlike [platformAccountId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platformAccountId")
        @ExcludeMissing
        fun _platformAccountId(): JsonField<String> = platformAccountId

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .accountInfo()
             * .currency()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountInfo: JsonField<AccountInfo>? = null
            private var currency: JsonField<String>? = null
            private var platformAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accountInfo = body.accountInfo
                currency = body.currency
                platformAccountId = body.platformAccountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or
             * `lightningAddress` must be provided.
             */
            fun accountInfo(accountInfo: AccountInfo) = accountInfo(JsonField.of(accountInfo))

            /**
             * Sets [Builder.accountInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountInfo] with a well-typed [AccountInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountInfo(accountInfo: JsonField<AccountInfo>) = apply {
                this.accountInfo = accountInfo
            }

            /** Alias for calling [accountInfo] with `AccountInfo.ofAedAccount(aedAccount)`. */
            fun accountInfo(aedAccount: AedExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofAedAccount(aedAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofBrlAccount(brlAccount)`. */
            fun accountInfo(brlAccount: BrlExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofBrlAccount(brlAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofBwpAccount(bwpAccount)`. */
            fun accountInfo(bwpAccount: BwpExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofBwpAccount(bwpAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofCadAccount(cadAccount)`. */
            fun accountInfo(cadAccount: CadExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofCadAccount(cadAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofDkkAccount(dkkAccount)`. */
            fun accountInfo(dkkAccount: DkkExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofDkkAccount(dkkAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofEurAccount(eurAccount)`. */
            fun accountInfo(eurAccount: EurExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofEurAccount(eurAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofGbpAccount(gbpAccount)`. */
            fun accountInfo(gbpAccount: GbpExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofGbpAccount(gbpAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofHkdAccount(hkdAccount)`. */
            fun accountInfo(hkdAccount: HkdExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofHkdAccount(hkdAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofIdrAccount(idrAccount)`. */
            fun accountInfo(idrAccount: IdrExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofIdrAccount(idrAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofInrAccount(inrAccount)`. */
            fun accountInfo(inrAccount: InrExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofInrAccount(inrAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofKesAccount(kesAccount)`. */
            fun accountInfo(kesAccount: KesExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofKesAccount(kesAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofMwkAccount(mwkAccount)`. */
            fun accountInfo(mwkAccount: MwkExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofMwkAccount(mwkAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofMxnAccount(mxnAccount)`. */
            fun accountInfo(mxnAccount: MxnExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofMxnAccount(mxnAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofMyrAccount(myrAccount)`. */
            fun accountInfo(myrAccount: MyrExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofMyrAccount(myrAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofNgnAccount(ngnAccount)`. */
            fun accountInfo(ngnAccount: NgnExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofNgnAccount(ngnAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofPhpAccount(phpAccount)`. */
            fun accountInfo(phpAccount: PhpExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofPhpAccount(phpAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofRwfAccount(rwfAccount)`. */
            fun accountInfo(rwfAccount: RwfExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofRwfAccount(rwfAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofSgdAccount(sgdAccount)`. */
            fun accountInfo(sgdAccount: SgdExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofSgdAccount(sgdAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofThbAccount(thbAccount)`. */
            fun accountInfo(thbAccount: ThbExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofThbAccount(thbAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofTzsAccount(tzsAccount)`. */
            fun accountInfo(tzsAccount: TzsExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofTzsAccount(tzsAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofUgxAccount(ugxAccount)`. */
            fun accountInfo(ugxAccount: UgxExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofUgxAccount(ugxAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofUsdAccount(usdAccount)`. */
            fun accountInfo(usdAccount: UsdExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofUsdAccount(usdAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofVndAccount(vndAccount)`. */
            fun accountInfo(vndAccount: VndExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofVndAccount(vndAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofXafAccount(xafAccount)`. */
            fun accountInfo(xafAccount: XafExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofXafAccount(xafAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofXofAccount(xofAccount)`. */
            fun accountInfo(xofAccount: XofExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofXofAccount(xofAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofZarAccount(zarAccount)`. */
            fun accountInfo(zarAccount: ZarExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofZarAccount(zarAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofZmwAccount(zmwAccount)`. */
            fun accountInfo(zmwAccount: ZmwExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofZmwAccount(zmwAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofBdtAccount(bdtAccount)`. */
            fun accountInfo(bdtAccount: BdtExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofBdtAccount(bdtAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofCopAccount(copAccount)`. */
            fun accountInfo(copAccount: CopExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofCopAccount(copAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofEgpAccount(egpAccount)`. */
            fun accountInfo(egpAccount: EgpExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofEgpAccount(egpAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofGhsAccount(ghsAccount)`. */
            fun accountInfo(ghsAccount: GhsExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofGhsAccount(ghsAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofGtqAccount(gtqAccount)`. */
            fun accountInfo(gtqAccount: GtqExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofGtqAccount(gtqAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofHtgAccount(htgAccount)`. */
            fun accountInfo(htgAccount: HtgExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofHtgAccount(htgAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofJmdAccount(jmdAccount)`. */
            fun accountInfo(jmdAccount: JmdExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofJmdAccount(jmdAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofPkrAccount(pkrAccount)`. */
            fun accountInfo(pkrAccount: PkrExternalAccountCreateInfo) =
                accountInfo(AccountInfo.ofPkrAccount(pkrAccount))

            /** Alias for calling [accountInfo] with `AccountInfo.ofSparkWallet(sparkWallet)`. */
            fun accountInfo(sparkWallet: SparkWalletInfo) =
                accountInfo(AccountInfo.ofSparkWallet(sparkWallet))

            /**
             * Alias for calling [accountInfo] with
             * `AccountInfo.ofLightningWallet(lightningWallet)`.
             */
            fun accountInfo(lightningWallet: LightningWalletInfo) =
                accountInfo(AccountInfo.ofLightningWallet(lightningWallet))

            /** Alias for calling [accountInfo] with `AccountInfo.ofSolanaWallet(solanaWallet)`. */
            fun accountInfo(solanaWallet: SolanaWalletInfo) =
                accountInfo(AccountInfo.ofSolanaWallet(solanaWallet))

            /** Alias for calling [accountInfo] with `AccountInfo.ofTronWallet(tronWallet)`. */
            fun accountInfo(tronWallet: TronWalletInfo) =
                accountInfo(AccountInfo.ofTronWallet(tronWallet))

            /**
             * Alias for calling [accountInfo] with `AccountInfo.ofPolygonWallet(polygonWallet)`.
             */
            fun accountInfo(polygonWallet: PolygonWalletInfo) =
                accountInfo(AccountInfo.ofPolygonWallet(polygonWallet))

            /** Alias for calling [accountInfo] with `AccountInfo.ofBaseWallet(baseWallet)`. */
            fun accountInfo(baseWallet: BaseWalletInfo) =
                accountInfo(AccountInfo.ofBaseWallet(baseWallet))

            /**
             * Alias for calling [accountInfo] with `AccountInfo.ofEthereumWallet(ethereumWallet)`.
             */
            fun accountInfo(ethereumWallet: EthereumWalletExternalAccountInfo) =
                accountInfo(AccountInfo.ofEthereumWallet(ethereumWallet))

            /**
             * Alias for calling [accountInfo] with the following:
             * ```kotlin
             * EthereumWalletExternalAccountInfo.builder()
             *     .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
             *     .address(address)
             *     .build()
             * ```
             */
            fun ethereumWalletAccountInfo(address: String) =
                accountInfo(
                    EthereumWalletExternalAccountInfo.builder()
                        .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
                        .address(address)
                        .build()
                )

            /** The ISO 4217 currency code */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /**
             * Your platform's identifier for the account in your system. This can be used to
             * reference the account by your own identifier.
             */
            fun platformAccountId(platformAccountId: String) =
                platformAccountId(JsonField.of(platformAccountId))

            /**
             * Sets [Builder.platformAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformAccountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun platformAccountId(platformAccountId: JsonField<String>) = apply {
                this.platformAccountId = platformAccountId
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .accountInfo()
             * .currency()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("accountInfo", accountInfo),
                    checkRequired("currency", currency),
                    platformAccountId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountInfo().validate()
            currency()
            platformAccountId()
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
            (accountInfo.asKnown()?.validity() ?: 0) +
                (if (currency.asKnown() == null) 0 else 1) +
                (if (platformAccountId.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                accountInfo == other.accountInfo &&
                currency == other.currency &&
                platformAccountId == other.platformAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(accountInfo, currency, platformAccountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountInfo=$accountInfo, currency=$currency, platformAccountId=$platformAccountId, additionalProperties=$additionalProperties}"
    }

    /**
     * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress` must
     * be provided.
     */
    @JsonDeserialize(using = AccountInfo.Deserializer::class)
    @JsonSerialize(using = AccountInfo.Serializer::class)
    class AccountInfo
    private constructor(
        private val aedAccount: AedExternalAccountCreateInfo? = null,
        private val brlAccount: BrlExternalAccountCreateInfo? = null,
        private val bwpAccount: BwpExternalAccountCreateInfo? = null,
        private val cadAccount: CadExternalAccountCreateInfo? = null,
        private val dkkAccount: DkkExternalAccountCreateInfo? = null,
        private val eurAccount: EurExternalAccountCreateInfo? = null,
        private val gbpAccount: GbpExternalAccountCreateInfo? = null,
        private val hkdAccount: HkdExternalAccountCreateInfo? = null,
        private val idrAccount: IdrExternalAccountCreateInfo? = null,
        private val inrAccount: InrExternalAccountCreateInfo? = null,
        private val kesAccount: KesExternalAccountCreateInfo? = null,
        private val mwkAccount: MwkExternalAccountCreateInfo? = null,
        private val mxnAccount: MxnExternalAccountCreateInfo? = null,
        private val myrAccount: MyrExternalAccountCreateInfo? = null,
        private val ngnAccount: NgnExternalAccountCreateInfo? = null,
        private val phpAccount: PhpExternalAccountCreateInfo? = null,
        private val rwfAccount: RwfExternalAccountCreateInfo? = null,
        private val sgdAccount: SgdExternalAccountCreateInfo? = null,
        private val thbAccount: ThbExternalAccountCreateInfo? = null,
        private val tzsAccount: TzsExternalAccountCreateInfo? = null,
        private val ugxAccount: UgxExternalAccountCreateInfo? = null,
        private val usdAccount: UsdExternalAccountCreateInfo? = null,
        private val vndAccount: VndExternalAccountCreateInfo? = null,
        private val xafAccount: XafExternalAccountCreateInfo? = null,
        private val xofAccount: XofExternalAccountCreateInfo? = null,
        private val zarAccount: ZarExternalAccountCreateInfo? = null,
        private val zmwAccount: ZmwExternalAccountCreateInfo? = null,
        private val bdtAccount: BdtExternalAccountCreateInfo? = null,
        private val copAccount: CopExternalAccountCreateInfo? = null,
        private val egpAccount: EgpExternalAccountCreateInfo? = null,
        private val ghsAccount: GhsExternalAccountCreateInfo? = null,
        private val gtqAccount: GtqExternalAccountCreateInfo? = null,
        private val htgAccount: HtgExternalAccountCreateInfo? = null,
        private val jmdAccount: JmdExternalAccountCreateInfo? = null,
        private val pkrAccount: PkrExternalAccountCreateInfo? = null,
        private val sparkWallet: SparkWalletInfo? = null,
        private val lightningWallet: LightningWalletInfo? = null,
        private val solanaWallet: SolanaWalletInfo? = null,
        private val tronWallet: TronWalletInfo? = null,
        private val polygonWallet: PolygonWalletInfo? = null,
        private val baseWallet: BaseWalletInfo? = null,
        private val ethereumWallet: EthereumWalletExternalAccountInfo? = null,
        private val _json: JsonValue? = null,
    ) {

        fun aedAccount(): AedExternalAccountCreateInfo? = aedAccount

        fun brlAccount(): BrlExternalAccountCreateInfo? = brlAccount

        fun bwpAccount(): BwpExternalAccountCreateInfo? = bwpAccount

        fun cadAccount(): CadExternalAccountCreateInfo? = cadAccount

        fun dkkAccount(): DkkExternalAccountCreateInfo? = dkkAccount

        fun eurAccount(): EurExternalAccountCreateInfo? = eurAccount

        fun gbpAccount(): GbpExternalAccountCreateInfo? = gbpAccount

        fun hkdAccount(): HkdExternalAccountCreateInfo? = hkdAccount

        fun idrAccount(): IdrExternalAccountCreateInfo? = idrAccount

        fun inrAccount(): InrExternalAccountCreateInfo? = inrAccount

        fun kesAccount(): KesExternalAccountCreateInfo? = kesAccount

        fun mwkAccount(): MwkExternalAccountCreateInfo? = mwkAccount

        fun mxnAccount(): MxnExternalAccountCreateInfo? = mxnAccount

        fun myrAccount(): MyrExternalAccountCreateInfo? = myrAccount

        fun ngnAccount(): NgnExternalAccountCreateInfo? = ngnAccount

        fun phpAccount(): PhpExternalAccountCreateInfo? = phpAccount

        fun rwfAccount(): RwfExternalAccountCreateInfo? = rwfAccount

        fun sgdAccount(): SgdExternalAccountCreateInfo? = sgdAccount

        fun thbAccount(): ThbExternalAccountCreateInfo? = thbAccount

        fun tzsAccount(): TzsExternalAccountCreateInfo? = tzsAccount

        fun ugxAccount(): UgxExternalAccountCreateInfo? = ugxAccount

        fun usdAccount(): UsdExternalAccountCreateInfo? = usdAccount

        fun vndAccount(): VndExternalAccountCreateInfo? = vndAccount

        fun xafAccount(): XafExternalAccountCreateInfo? = xafAccount

        fun xofAccount(): XofExternalAccountCreateInfo? = xofAccount

        fun zarAccount(): ZarExternalAccountCreateInfo? = zarAccount

        fun zmwAccount(): ZmwExternalAccountCreateInfo? = zmwAccount

        fun bdtAccount(): BdtExternalAccountCreateInfo? = bdtAccount

        fun copAccount(): CopExternalAccountCreateInfo? = copAccount

        fun egpAccount(): EgpExternalAccountCreateInfo? = egpAccount

        fun ghsAccount(): GhsExternalAccountCreateInfo? = ghsAccount

        fun gtqAccount(): GtqExternalAccountCreateInfo? = gtqAccount

        fun htgAccount(): HtgExternalAccountCreateInfo? = htgAccount

        fun jmdAccount(): JmdExternalAccountCreateInfo? = jmdAccount

        fun pkrAccount(): PkrExternalAccountCreateInfo? = pkrAccount

        fun sparkWallet(): SparkWalletInfo? = sparkWallet

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun lightningWallet(): LightningWalletInfo? = lightningWallet

        fun solanaWallet(): SolanaWalletInfo? = solanaWallet

        fun tronWallet(): TronWalletInfo? = tronWallet

        fun polygonWallet(): PolygonWalletInfo? = polygonWallet

        fun baseWallet(): BaseWalletInfo? = baseWallet

        fun ethereumWallet(): EthereumWalletExternalAccountInfo? = ethereumWallet

        fun isAedAccount(): Boolean = aedAccount != null

        fun isBrlAccount(): Boolean = brlAccount != null

        fun isBwpAccount(): Boolean = bwpAccount != null

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

        fun isXafAccount(): Boolean = xafAccount != null

        fun isXofAccount(): Boolean = xofAccount != null

        fun isZarAccount(): Boolean = zarAccount != null

        fun isZmwAccount(): Boolean = zmwAccount != null

        fun isBdtAccount(): Boolean = bdtAccount != null

        fun isCopAccount(): Boolean = copAccount != null

        fun isEgpAccount(): Boolean = egpAccount != null

        fun isGhsAccount(): Boolean = ghsAccount != null

        fun isGtqAccount(): Boolean = gtqAccount != null

        fun isHtgAccount(): Boolean = htgAccount != null

        fun isJmdAccount(): Boolean = jmdAccount != null

        fun isPkrAccount(): Boolean = pkrAccount != null

        fun isSparkWallet(): Boolean = sparkWallet != null

        fun isLightningWallet(): Boolean = lightningWallet != null

        fun isSolanaWallet(): Boolean = solanaWallet != null

        fun isTronWallet(): Boolean = tronWallet != null

        fun isPolygonWallet(): Boolean = polygonWallet != null

        fun isBaseWallet(): Boolean = baseWallet != null

        fun isEthereumWallet(): Boolean = ethereumWallet != null

        fun asAedAccount(): AedExternalAccountCreateInfo = aedAccount.getOrThrow("aedAccount")

        fun asBrlAccount(): BrlExternalAccountCreateInfo = brlAccount.getOrThrow("brlAccount")

        fun asBwpAccount(): BwpExternalAccountCreateInfo = bwpAccount.getOrThrow("bwpAccount")

        fun asCadAccount(): CadExternalAccountCreateInfo = cadAccount.getOrThrow("cadAccount")

        fun asDkkAccount(): DkkExternalAccountCreateInfo = dkkAccount.getOrThrow("dkkAccount")

        fun asEurAccount(): EurExternalAccountCreateInfo = eurAccount.getOrThrow("eurAccount")

        fun asGbpAccount(): GbpExternalAccountCreateInfo = gbpAccount.getOrThrow("gbpAccount")

        fun asHkdAccount(): HkdExternalAccountCreateInfo = hkdAccount.getOrThrow("hkdAccount")

        fun asIdrAccount(): IdrExternalAccountCreateInfo = idrAccount.getOrThrow("idrAccount")

        fun asInrAccount(): InrExternalAccountCreateInfo = inrAccount.getOrThrow("inrAccount")

        fun asKesAccount(): KesExternalAccountCreateInfo = kesAccount.getOrThrow("kesAccount")

        fun asMwkAccount(): MwkExternalAccountCreateInfo = mwkAccount.getOrThrow("mwkAccount")

        fun asMxnAccount(): MxnExternalAccountCreateInfo = mxnAccount.getOrThrow("mxnAccount")

        fun asMyrAccount(): MyrExternalAccountCreateInfo = myrAccount.getOrThrow("myrAccount")

        fun asNgnAccount(): NgnExternalAccountCreateInfo = ngnAccount.getOrThrow("ngnAccount")

        fun asPhpAccount(): PhpExternalAccountCreateInfo = phpAccount.getOrThrow("phpAccount")

        fun asRwfAccount(): RwfExternalAccountCreateInfo = rwfAccount.getOrThrow("rwfAccount")

        fun asSgdAccount(): SgdExternalAccountCreateInfo = sgdAccount.getOrThrow("sgdAccount")

        fun asThbAccount(): ThbExternalAccountCreateInfo = thbAccount.getOrThrow("thbAccount")

        fun asTzsAccount(): TzsExternalAccountCreateInfo = tzsAccount.getOrThrow("tzsAccount")

        fun asUgxAccount(): UgxExternalAccountCreateInfo = ugxAccount.getOrThrow("ugxAccount")

        fun asUsdAccount(): UsdExternalAccountCreateInfo = usdAccount.getOrThrow("usdAccount")

        fun asVndAccount(): VndExternalAccountCreateInfo = vndAccount.getOrThrow("vndAccount")

        fun asXafAccount(): XafExternalAccountCreateInfo = xafAccount.getOrThrow("xafAccount")

        fun asXofAccount(): XofExternalAccountCreateInfo = xofAccount.getOrThrow("xofAccount")

        fun asZarAccount(): ZarExternalAccountCreateInfo = zarAccount.getOrThrow("zarAccount")

        fun asZmwAccount(): ZmwExternalAccountCreateInfo = zmwAccount.getOrThrow("zmwAccount")

        fun asBdtAccount(): BdtExternalAccountCreateInfo = bdtAccount.getOrThrow("bdtAccount")

        fun asCopAccount(): CopExternalAccountCreateInfo = copAccount.getOrThrow("copAccount")

        fun asEgpAccount(): EgpExternalAccountCreateInfo = egpAccount.getOrThrow("egpAccount")

        fun asGhsAccount(): GhsExternalAccountCreateInfo = ghsAccount.getOrThrow("ghsAccount")

        fun asGtqAccount(): GtqExternalAccountCreateInfo = gtqAccount.getOrThrow("gtqAccount")

        fun asHtgAccount(): HtgExternalAccountCreateInfo = htgAccount.getOrThrow("htgAccount")

        fun asJmdAccount(): JmdExternalAccountCreateInfo = jmdAccount.getOrThrow("jmdAccount")

        fun asPkrAccount(): PkrExternalAccountCreateInfo = pkrAccount.getOrThrow("pkrAccount")

        fun asSparkWallet(): SparkWalletInfo = sparkWallet.getOrThrow("sparkWallet")

        /**
         * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or `lightningAddress`
         * must be provided.
         */
        fun asLightningWallet(): LightningWalletInfo = lightningWallet.getOrThrow("lightningWallet")

        fun asSolanaWallet(): SolanaWalletInfo = solanaWallet.getOrThrow("solanaWallet")

        fun asTronWallet(): TronWalletInfo = tronWallet.getOrThrow("tronWallet")

        fun asPolygonWallet(): PolygonWalletInfo = polygonWallet.getOrThrow("polygonWallet")

        fun asBaseWallet(): BaseWalletInfo = baseWallet.getOrThrow("baseWallet")

        fun asEthereumWallet(): EthereumWalletExternalAccountInfo =
            ethereumWallet.getOrThrow("ethereumWallet")

        fun _json(): JsonValue? = _json

        fun <T> accept(visitor: Visitor<T>): T =
            when {
                aedAccount != null -> visitor.visitAedAccount(aedAccount)
                brlAccount != null -> visitor.visitBrlAccount(brlAccount)
                bwpAccount != null -> visitor.visitBwpAccount(bwpAccount)
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
                xafAccount != null -> visitor.visitXafAccount(xafAccount)
                xofAccount != null -> visitor.visitXofAccount(xofAccount)
                zarAccount != null -> visitor.visitZarAccount(zarAccount)
                zmwAccount != null -> visitor.visitZmwAccount(zmwAccount)
                bdtAccount != null -> visitor.visitBdtAccount(bdtAccount)
                copAccount != null -> visitor.visitCopAccount(copAccount)
                egpAccount != null -> visitor.visitEgpAccount(egpAccount)
                ghsAccount != null -> visitor.visitGhsAccount(ghsAccount)
                gtqAccount != null -> visitor.visitGtqAccount(gtqAccount)
                htgAccount != null -> visitor.visitHtgAccount(htgAccount)
                jmdAccount != null -> visitor.visitJmdAccount(jmdAccount)
                pkrAccount != null -> visitor.visitPkrAccount(pkrAccount)
                sparkWallet != null -> visitor.visitSparkWallet(sparkWallet)
                lightningWallet != null -> visitor.visitLightningWallet(lightningWallet)
                solanaWallet != null -> visitor.visitSolanaWallet(solanaWallet)
                tronWallet != null -> visitor.visitTronWallet(tronWallet)
                polygonWallet != null -> visitor.visitPolygonWallet(polygonWallet)
                baseWallet != null -> visitor.visitBaseWallet(baseWallet)
                ethereumWallet != null -> visitor.visitEthereumWallet(ethereumWallet)
                else -> visitor.unknown(_json)
            }

        private var validated: Boolean = false

        fun validate(): AccountInfo = apply {
            if (validated) {
                return@apply
            }

            accept(
                object : Visitor<Unit> {
                    override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo) {
                        aedAccount.validate()
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

                    override fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) {
                        dkkAccount.validate()
                    }

                    override fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo) {
                        eurAccount.validate()
                    }

                    override fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) {
                        gbpAccount.validate()
                    }

                    override fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) {
                        hkdAccount.validate()
                    }

                    override fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo) {
                        idrAccount.validate()
                    }

                    override fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo) {
                        inrAccount.validate()
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

                    override fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) {
                        rwfAccount.validate()
                    }

                    override fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) {
                        sgdAccount.validate()
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

                    override fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) {
                        bdtAccount.validate()
                    }

                    override fun visitCopAccount(copAccount: CopExternalAccountCreateInfo) {
                        copAccount.validate()
                    }

                    override fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo) {
                        egpAccount.validate()
                    }

                    override fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) {
                        ghsAccount.validate()
                    }

                    override fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) {
                        gtqAccount.validate()
                    }

                    override fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo) {
                        htgAccount.validate()
                    }

                    override fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) {
                        jmdAccount.validate()
                    }

                    override fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) {
                        pkrAccount.validate()
                    }

                    override fun visitSparkWallet(sparkWallet: SparkWalletInfo) {
                        sparkWallet.validate()
                    }

                    override fun visitLightningWallet(lightningWallet: LightningWalletInfo) {
                        lightningWallet.validate()
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

                    override fun visitEthereumWallet(
                        ethereumWallet: EthereumWalletExternalAccountInfo
                    ) {
                        ethereumWallet.validate()
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
                    override fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo) =
                        aedAccount.validity()

                    override fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo) =
                        brlAccount.validity()

                    override fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) =
                        bwpAccount.validity()

                    override fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo) =
                        cadAccount.validity()

                    override fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) =
                        dkkAccount.validity()

                    override fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo) =
                        eurAccount.validity()

                    override fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) =
                        gbpAccount.validity()

                    override fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) =
                        hkdAccount.validity()

                    override fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo) =
                        idrAccount.validity()

                    override fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo) =
                        inrAccount.validity()

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

                    override fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) =
                        rwfAccount.validity()

                    override fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) =
                        sgdAccount.validity()

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

                    override fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) =
                        bdtAccount.validity()

                    override fun visitCopAccount(copAccount: CopExternalAccountCreateInfo) =
                        copAccount.validity()

                    override fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo) =
                        egpAccount.validity()

                    override fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) =
                        ghsAccount.validity()

                    override fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) =
                        gtqAccount.validity()

                    override fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo) =
                        htgAccount.validity()

                    override fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) =
                        jmdAccount.validity()

                    override fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) =
                        pkrAccount.validity()

                    override fun visitSparkWallet(sparkWallet: SparkWalletInfo) =
                        sparkWallet.validity()

                    override fun visitLightningWallet(lightningWallet: LightningWalletInfo) =
                        lightningWallet.validity()

                    override fun visitSolanaWallet(solanaWallet: SolanaWalletInfo) =
                        solanaWallet.validity()

                    override fun visitTronWallet(tronWallet: TronWalletInfo) = tronWallet.validity()

                    override fun visitPolygonWallet(polygonWallet: PolygonWalletInfo) =
                        polygonWallet.validity()

                    override fun visitBaseWallet(baseWallet: BaseWalletInfo) = baseWallet.validity()

                    override fun visitEthereumWallet(
                        ethereumWallet: EthereumWalletExternalAccountInfo
                    ) = ethereumWallet.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AccountInfo &&
                aedAccount == other.aedAccount &&
                brlAccount == other.brlAccount &&
                bwpAccount == other.bwpAccount &&
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
                xafAccount == other.xafAccount &&
                xofAccount == other.xofAccount &&
                zarAccount == other.zarAccount &&
                zmwAccount == other.zmwAccount &&
                bdtAccount == other.bdtAccount &&
                copAccount == other.copAccount &&
                egpAccount == other.egpAccount &&
                ghsAccount == other.ghsAccount &&
                gtqAccount == other.gtqAccount &&
                htgAccount == other.htgAccount &&
                jmdAccount == other.jmdAccount &&
                pkrAccount == other.pkrAccount &&
                sparkWallet == other.sparkWallet &&
                lightningWallet == other.lightningWallet &&
                solanaWallet == other.solanaWallet &&
                tronWallet == other.tronWallet &&
                polygonWallet == other.polygonWallet &&
                baseWallet == other.baseWallet &&
                ethereumWallet == other.ethereumWallet
        }

        override fun hashCode(): Int =
            Objects.hash(
                aedAccount,
                brlAccount,
                bwpAccount,
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
                xafAccount,
                xofAccount,
                zarAccount,
                zmwAccount,
                bdtAccount,
                copAccount,
                egpAccount,
                ghsAccount,
                gtqAccount,
                htgAccount,
                jmdAccount,
                pkrAccount,
                sparkWallet,
                lightningWallet,
                solanaWallet,
                tronWallet,
                polygonWallet,
                baseWallet,
                ethereumWallet,
            )

        override fun toString(): String =
            when {
                aedAccount != null -> "AccountInfo{aedAccount=$aedAccount}"
                brlAccount != null -> "AccountInfo{brlAccount=$brlAccount}"
                bwpAccount != null -> "AccountInfo{bwpAccount=$bwpAccount}"
                cadAccount != null -> "AccountInfo{cadAccount=$cadAccount}"
                dkkAccount != null -> "AccountInfo{dkkAccount=$dkkAccount}"
                eurAccount != null -> "AccountInfo{eurAccount=$eurAccount}"
                gbpAccount != null -> "AccountInfo{gbpAccount=$gbpAccount}"
                hkdAccount != null -> "AccountInfo{hkdAccount=$hkdAccount}"
                idrAccount != null -> "AccountInfo{idrAccount=$idrAccount}"
                inrAccount != null -> "AccountInfo{inrAccount=$inrAccount}"
                kesAccount != null -> "AccountInfo{kesAccount=$kesAccount}"
                mwkAccount != null -> "AccountInfo{mwkAccount=$mwkAccount}"
                mxnAccount != null -> "AccountInfo{mxnAccount=$mxnAccount}"
                myrAccount != null -> "AccountInfo{myrAccount=$myrAccount}"
                ngnAccount != null -> "AccountInfo{ngnAccount=$ngnAccount}"
                phpAccount != null -> "AccountInfo{phpAccount=$phpAccount}"
                rwfAccount != null -> "AccountInfo{rwfAccount=$rwfAccount}"
                sgdAccount != null -> "AccountInfo{sgdAccount=$sgdAccount}"
                thbAccount != null -> "AccountInfo{thbAccount=$thbAccount}"
                tzsAccount != null -> "AccountInfo{tzsAccount=$tzsAccount}"
                ugxAccount != null -> "AccountInfo{ugxAccount=$ugxAccount}"
                usdAccount != null -> "AccountInfo{usdAccount=$usdAccount}"
                vndAccount != null -> "AccountInfo{vndAccount=$vndAccount}"
                xafAccount != null -> "AccountInfo{xafAccount=$xafAccount}"
                xofAccount != null -> "AccountInfo{xofAccount=$xofAccount}"
                zarAccount != null -> "AccountInfo{zarAccount=$zarAccount}"
                zmwAccount != null -> "AccountInfo{zmwAccount=$zmwAccount}"
                bdtAccount != null -> "AccountInfo{bdtAccount=$bdtAccount}"
                copAccount != null -> "AccountInfo{copAccount=$copAccount}"
                egpAccount != null -> "AccountInfo{egpAccount=$egpAccount}"
                ghsAccount != null -> "AccountInfo{ghsAccount=$ghsAccount}"
                gtqAccount != null -> "AccountInfo{gtqAccount=$gtqAccount}"
                htgAccount != null -> "AccountInfo{htgAccount=$htgAccount}"
                jmdAccount != null -> "AccountInfo{jmdAccount=$jmdAccount}"
                pkrAccount != null -> "AccountInfo{pkrAccount=$pkrAccount}"
                sparkWallet != null -> "AccountInfo{sparkWallet=$sparkWallet}"
                lightningWallet != null -> "AccountInfo{lightningWallet=$lightningWallet}"
                solanaWallet != null -> "AccountInfo{solanaWallet=$solanaWallet}"
                tronWallet != null -> "AccountInfo{tronWallet=$tronWallet}"
                polygonWallet != null -> "AccountInfo{polygonWallet=$polygonWallet}"
                baseWallet != null -> "AccountInfo{baseWallet=$baseWallet}"
                ethereumWallet != null -> "AccountInfo{ethereumWallet=$ethereumWallet}"
                _json != null -> "AccountInfo{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid AccountInfo")
            }

        companion object {

            fun ofAedAccount(aedAccount: AedExternalAccountCreateInfo) =
                AccountInfo(aedAccount = aedAccount)

            fun ofBrlAccount(brlAccount: BrlExternalAccountCreateInfo) =
                AccountInfo(brlAccount = brlAccount)

            fun ofBwpAccount(bwpAccount: BwpExternalAccountCreateInfo) =
                AccountInfo(bwpAccount = bwpAccount)

            fun ofCadAccount(cadAccount: CadExternalAccountCreateInfo) =
                AccountInfo(cadAccount = cadAccount)

            fun ofDkkAccount(dkkAccount: DkkExternalAccountCreateInfo) =
                AccountInfo(dkkAccount = dkkAccount)

            fun ofEurAccount(eurAccount: EurExternalAccountCreateInfo) =
                AccountInfo(eurAccount = eurAccount)

            fun ofGbpAccount(gbpAccount: GbpExternalAccountCreateInfo) =
                AccountInfo(gbpAccount = gbpAccount)

            fun ofHkdAccount(hkdAccount: HkdExternalAccountCreateInfo) =
                AccountInfo(hkdAccount = hkdAccount)

            fun ofIdrAccount(idrAccount: IdrExternalAccountCreateInfo) =
                AccountInfo(idrAccount = idrAccount)

            fun ofInrAccount(inrAccount: InrExternalAccountCreateInfo) =
                AccountInfo(inrAccount = inrAccount)

            fun ofKesAccount(kesAccount: KesExternalAccountCreateInfo) =
                AccountInfo(kesAccount = kesAccount)

            fun ofMwkAccount(mwkAccount: MwkExternalAccountCreateInfo) =
                AccountInfo(mwkAccount = mwkAccount)

            fun ofMxnAccount(mxnAccount: MxnExternalAccountCreateInfo) =
                AccountInfo(mxnAccount = mxnAccount)

            fun ofMyrAccount(myrAccount: MyrExternalAccountCreateInfo) =
                AccountInfo(myrAccount = myrAccount)

            fun ofNgnAccount(ngnAccount: NgnExternalAccountCreateInfo) =
                AccountInfo(ngnAccount = ngnAccount)

            fun ofPhpAccount(phpAccount: PhpExternalAccountCreateInfo) =
                AccountInfo(phpAccount = phpAccount)

            fun ofRwfAccount(rwfAccount: RwfExternalAccountCreateInfo) =
                AccountInfo(rwfAccount = rwfAccount)

            fun ofSgdAccount(sgdAccount: SgdExternalAccountCreateInfo) =
                AccountInfo(sgdAccount = sgdAccount)

            fun ofThbAccount(thbAccount: ThbExternalAccountCreateInfo) =
                AccountInfo(thbAccount = thbAccount)

            fun ofTzsAccount(tzsAccount: TzsExternalAccountCreateInfo) =
                AccountInfo(tzsAccount = tzsAccount)

            fun ofUgxAccount(ugxAccount: UgxExternalAccountCreateInfo) =
                AccountInfo(ugxAccount = ugxAccount)

            fun ofUsdAccount(usdAccount: UsdExternalAccountCreateInfo) =
                AccountInfo(usdAccount = usdAccount)

            fun ofVndAccount(vndAccount: VndExternalAccountCreateInfo) =
                AccountInfo(vndAccount = vndAccount)

            fun ofXafAccount(xafAccount: XafExternalAccountCreateInfo) =
                AccountInfo(xafAccount = xafAccount)

            fun ofXofAccount(xofAccount: XofExternalAccountCreateInfo) =
                AccountInfo(xofAccount = xofAccount)

            fun ofZarAccount(zarAccount: ZarExternalAccountCreateInfo) =
                AccountInfo(zarAccount = zarAccount)

            fun ofZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo) =
                AccountInfo(zmwAccount = zmwAccount)

            fun ofBdtAccount(bdtAccount: BdtExternalAccountCreateInfo) =
                AccountInfo(bdtAccount = bdtAccount)

            fun ofCopAccount(copAccount: CopExternalAccountCreateInfo) =
                AccountInfo(copAccount = copAccount)

            fun ofEgpAccount(egpAccount: EgpExternalAccountCreateInfo) =
                AccountInfo(egpAccount = egpAccount)

            fun ofGhsAccount(ghsAccount: GhsExternalAccountCreateInfo) =
                AccountInfo(ghsAccount = ghsAccount)

            fun ofGtqAccount(gtqAccount: GtqExternalAccountCreateInfo) =
                AccountInfo(gtqAccount = gtqAccount)

            fun ofHtgAccount(htgAccount: HtgExternalAccountCreateInfo) =
                AccountInfo(htgAccount = htgAccount)

            fun ofJmdAccount(jmdAccount: JmdExternalAccountCreateInfo) =
                AccountInfo(jmdAccount = jmdAccount)

            fun ofPkrAccount(pkrAccount: PkrExternalAccountCreateInfo) =
                AccountInfo(pkrAccount = pkrAccount)

            fun ofSparkWallet(sparkWallet: SparkWalletInfo) = AccountInfo(sparkWallet = sparkWallet)

            /**
             * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or
             * `lightningAddress` must be provided.
             */
            fun ofLightningWallet(lightningWallet: LightningWalletInfo) =
                AccountInfo(lightningWallet = lightningWallet)

            fun ofSolanaWallet(solanaWallet: SolanaWalletInfo) =
                AccountInfo(solanaWallet = solanaWallet)

            fun ofTronWallet(tronWallet: TronWalletInfo) = AccountInfo(tronWallet = tronWallet)

            fun ofPolygonWallet(polygonWallet: PolygonWalletInfo) =
                AccountInfo(polygonWallet = polygonWallet)

            fun ofBaseWallet(baseWallet: BaseWalletInfo) = AccountInfo(baseWallet = baseWallet)

            fun ofEthereumWallet(ethereumWallet: EthereumWalletExternalAccountInfo) =
                AccountInfo(ethereumWallet = ethereumWallet)
        }

        /**
         * An interface that defines how to map each variant of [AccountInfo] to a value of type
         * [T].
         */
        interface Visitor<out T> {

            fun visitAedAccount(aedAccount: AedExternalAccountCreateInfo): T

            fun visitBrlAccount(brlAccount: BrlExternalAccountCreateInfo): T

            fun visitBwpAccount(bwpAccount: BwpExternalAccountCreateInfo): T

            fun visitCadAccount(cadAccount: CadExternalAccountCreateInfo): T

            fun visitDkkAccount(dkkAccount: DkkExternalAccountCreateInfo): T

            fun visitEurAccount(eurAccount: EurExternalAccountCreateInfo): T

            fun visitGbpAccount(gbpAccount: GbpExternalAccountCreateInfo): T

            fun visitHkdAccount(hkdAccount: HkdExternalAccountCreateInfo): T

            fun visitIdrAccount(idrAccount: IdrExternalAccountCreateInfo): T

            fun visitInrAccount(inrAccount: InrExternalAccountCreateInfo): T

            fun visitKesAccount(kesAccount: KesExternalAccountCreateInfo): T

            fun visitMwkAccount(mwkAccount: MwkExternalAccountCreateInfo): T

            fun visitMxnAccount(mxnAccount: MxnExternalAccountCreateInfo): T

            fun visitMyrAccount(myrAccount: MyrExternalAccountCreateInfo): T

            fun visitNgnAccount(ngnAccount: NgnExternalAccountCreateInfo): T

            fun visitPhpAccount(phpAccount: PhpExternalAccountCreateInfo): T

            fun visitRwfAccount(rwfAccount: RwfExternalAccountCreateInfo): T

            fun visitSgdAccount(sgdAccount: SgdExternalAccountCreateInfo): T

            fun visitThbAccount(thbAccount: ThbExternalAccountCreateInfo): T

            fun visitTzsAccount(tzsAccount: TzsExternalAccountCreateInfo): T

            fun visitUgxAccount(ugxAccount: UgxExternalAccountCreateInfo): T

            fun visitUsdAccount(usdAccount: UsdExternalAccountCreateInfo): T

            fun visitVndAccount(vndAccount: VndExternalAccountCreateInfo): T

            fun visitXafAccount(xafAccount: XafExternalAccountCreateInfo): T

            fun visitXofAccount(xofAccount: XofExternalAccountCreateInfo): T

            fun visitZarAccount(zarAccount: ZarExternalAccountCreateInfo): T

            fun visitZmwAccount(zmwAccount: ZmwExternalAccountCreateInfo): T

            fun visitBdtAccount(bdtAccount: BdtExternalAccountCreateInfo): T

            fun visitCopAccount(copAccount: CopExternalAccountCreateInfo): T

            fun visitEgpAccount(egpAccount: EgpExternalAccountCreateInfo): T

            fun visitGhsAccount(ghsAccount: GhsExternalAccountCreateInfo): T

            fun visitGtqAccount(gtqAccount: GtqExternalAccountCreateInfo): T

            fun visitHtgAccount(htgAccount: HtgExternalAccountCreateInfo): T

            fun visitJmdAccount(jmdAccount: JmdExternalAccountCreateInfo): T

            fun visitPkrAccount(pkrAccount: PkrExternalAccountCreateInfo): T

            fun visitSparkWallet(sparkWallet: SparkWalletInfo): T

            /**
             * Lightning payment destination. Exactly one of `invoice`, `bolt12`, or
             * `lightningAddress` must be provided.
             */
            fun visitLightningWallet(lightningWallet: LightningWalletInfo): T

            fun visitSolanaWallet(solanaWallet: SolanaWalletInfo): T

            fun visitTronWallet(tronWallet: TronWalletInfo): T

            fun visitPolygonWallet(polygonWallet: PolygonWalletInfo): T

            fun visitBaseWallet(baseWallet: BaseWalletInfo): T

            fun visitEthereumWallet(ethereumWallet: EthereumWalletExternalAccountInfo): T

            /**
             * Maps an unknown variant of [AccountInfo] to a value of type [T].
             *
             * An instance of [AccountInfo] can contain an unknown variant if it was deserialized
             * from data that doesn't match any known variant. For example, if the SDK is on an
             * older version than the API, then the API may respond with new variants that the SDK
             * is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown AccountInfo: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<AccountInfo>(AccountInfo::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): AccountInfo {
                val json = JsonValue.fromJsonNode(node)
                val accountType = json.asObject()?.get("accountType")?.asString()

                when (accountType) {
                    "AED_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<AedExternalAccountCreateInfo>())
                            ?.let { AccountInfo(aedAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "BRL_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BrlExternalAccountCreateInfo>())
                            ?.let { AccountInfo(brlAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "BWP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BwpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(bwpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "CAD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<CadExternalAccountCreateInfo>())
                            ?.let { AccountInfo(cadAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "DKK_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<DkkExternalAccountCreateInfo>())
                            ?.let { AccountInfo(dkkAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "EUR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EurExternalAccountCreateInfo>())
                            ?.let { AccountInfo(eurAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "GBP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GbpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(gbpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "HKD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<HkdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(hkdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "IDR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<IdrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(idrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "INR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<InrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(inrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "KES_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<KesExternalAccountCreateInfo>())
                            ?.let { AccountInfo(kesAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "MWK_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MwkExternalAccountCreateInfo>())
                            ?.let { AccountInfo(mwkAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "MXN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MxnExternalAccountCreateInfo>())
                            ?.let { AccountInfo(mxnAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "MYR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<MyrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(myrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "NGN_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<NgnExternalAccountCreateInfo>())
                            ?.let { AccountInfo(ngnAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "PHP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PhpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(phpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "RWF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<RwfExternalAccountCreateInfo>())
                            ?.let { AccountInfo(rwfAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "SGD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<SgdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(sgdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "THB_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ThbExternalAccountCreateInfo>())
                            ?.let { AccountInfo(thbAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "TZS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<TzsExternalAccountCreateInfo>())
                            ?.let { AccountInfo(tzsAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "UGX_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<UgxExternalAccountCreateInfo>())
                            ?.let { AccountInfo(ugxAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "USD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<UsdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(usdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "VND_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<VndExternalAccountCreateInfo>())
                            ?.let { AccountInfo(vndAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "XAF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<XafExternalAccountCreateInfo>())
                            ?.let { AccountInfo(xafAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "XOF_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<XofExternalAccountCreateInfo>())
                            ?.let { AccountInfo(xofAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "ZAR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ZarExternalAccountCreateInfo>())
                            ?.let { AccountInfo(zarAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "ZMW_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<ZmwExternalAccountCreateInfo>())
                            ?.let { AccountInfo(zmwAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "BDT_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<BdtExternalAccountCreateInfo>())
                            ?.let { AccountInfo(bdtAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "COP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<CopExternalAccountCreateInfo>())
                            ?.let { AccountInfo(copAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "EGP_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<EgpExternalAccountCreateInfo>())
                            ?.let { AccountInfo(egpAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "GHS_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GhsExternalAccountCreateInfo>())
                            ?.let { AccountInfo(ghsAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "GTQ_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<GtqExternalAccountCreateInfo>())
                            ?.let { AccountInfo(gtqAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "HTG_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<HtgExternalAccountCreateInfo>())
                            ?.let { AccountInfo(htgAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "JMD_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<JmdExternalAccountCreateInfo>())
                            ?.let { AccountInfo(jmdAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "PKR_ACCOUNT" -> {
                        return tryDeserialize(node, jacksonTypeRef<PkrExternalAccountCreateInfo>())
                            ?.let { AccountInfo(pkrAccount = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                    "ETHEREUM_WALLET" -> {
                        return tryDeserialize(
                                node,
                                jacksonTypeRef<EthereumWalletExternalAccountInfo>(),
                            )
                            ?.let { AccountInfo(ethereumWallet = it, _json = json) }
                            ?: AccountInfo(_json = json)
                    }
                }

                val bestMatches =
                    sequenceOf(
                            tryDeserialize(node, jacksonTypeRef<SparkWalletInfo>())?.let {
                                AccountInfo(sparkWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<LightningWalletInfo>())?.let {
                                AccountInfo(lightningWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<SolanaWalletInfo>())?.let {
                                AccountInfo(solanaWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<TronWalletInfo>())?.let {
                                AccountInfo(tronWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<PolygonWalletInfo>())?.let {
                                AccountInfo(polygonWallet = it, _json = json)
                            },
                            tryDeserialize(node, jacksonTypeRef<BaseWalletInfo>())?.let {
                                AccountInfo(baseWallet = it, _json = json)
                            },
                        )
                        .filterNotNull()
                        .allMaxBy { it.validity() }
                        .toList()
                return when (bestMatches.size) {
                    // This can happen if what we're deserializing is completely incompatible with
                    // all the possible variants (e.g. deserializing from boolean).
                    0 -> AccountInfo(_json = json)
                    1 -> bestMatches.single()
                    // If there's more than one match with the highest validity, then use the first
                    // completely valid match, or simply the first match if none are completely
                    // valid.
                    else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
                }
            }
        }

        internal class Serializer : BaseSerializer<AccountInfo>(AccountInfo::class) {

            override fun serialize(
                value: AccountInfo,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.aedAccount != null -> generator.writeObject(value.aedAccount)
                    value.brlAccount != null -> generator.writeObject(value.brlAccount)
                    value.bwpAccount != null -> generator.writeObject(value.bwpAccount)
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
                    value.xafAccount != null -> generator.writeObject(value.xafAccount)
                    value.xofAccount != null -> generator.writeObject(value.xofAccount)
                    value.zarAccount != null -> generator.writeObject(value.zarAccount)
                    value.zmwAccount != null -> generator.writeObject(value.zmwAccount)
                    value.bdtAccount != null -> generator.writeObject(value.bdtAccount)
                    value.copAccount != null -> generator.writeObject(value.copAccount)
                    value.egpAccount != null -> generator.writeObject(value.egpAccount)
                    value.ghsAccount != null -> generator.writeObject(value.ghsAccount)
                    value.gtqAccount != null -> generator.writeObject(value.gtqAccount)
                    value.htgAccount != null -> generator.writeObject(value.htgAccount)
                    value.jmdAccount != null -> generator.writeObject(value.jmdAccount)
                    value.pkrAccount != null -> generator.writeObject(value.pkrAccount)
                    value.sparkWallet != null -> generator.writeObject(value.sparkWallet)
                    value.lightningWallet != null -> generator.writeObject(value.lightningWallet)
                    value.solanaWallet != null -> generator.writeObject(value.solanaWallet)
                    value.tronWallet != null -> generator.writeObject(value.tronWallet)
                    value.polygonWallet != null -> generator.writeObject(value.polygonWallet)
                    value.baseWallet != null -> generator.writeObject(value.baseWallet)
                    value.ethereumWallet != null -> generator.writeObject(value.ethereumWallet)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid AccountInfo")
                }
            }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalAccountCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalAccountCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
