// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.customers.externalaccounts.BaseWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.BrlExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.DkkExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountInfoOneOf
import com.lightspark.grid.models.customers.externalaccounts.GbpExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.HkdExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.IdrExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.InrExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.LightningWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.MxnExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.MyrExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.PhpExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.PolygonWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.SgdExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.SolanaWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.SparkWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.ThbExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.TronWalletInfo
import com.lightspark.grid.models.customers.externalaccounts.UsdExternalAccountInfo
import com.lightspark.grid.models.customers.externalaccounts.VndExternalAccountInfo
import java.util.Collections
import java.util.Objects

/**
 * Register a new external bank account for the platform.
 *
 * **Sandbox Testing:** In sandbox mode, use these account number patterns to test different
 * transfer scenarios. These patterns should be used with the primary alias, address, or identifier
 * of whatever account type you're testing. For example, the US account number, a CLABE, an IBAN, a
 * spark wallet address, etc. The failure patterns are:
 * - Account numbers ending in **002**: Insufficient funds (transfer-in will fail)
 * - Account numbers ending in **003**: Account closed/invalid (transfers will fail)
 * - Account numbers ending in **004**: Transfer rejected (bank rejects the transfer)
 * - Account numbers ending in **005**: Timeout/delayed failure (stays pending ~30s, then fails)
 * - Any other account number: Success (transfers complete normally)
 */
class ExternalAccountCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountInfo(): ExternalAccountInfoOneOf = body.accountInfo()

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
    fun _accountInfo(): JsonField<ExternalAccountInfoOneOf> = body._accountInfo()

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

        fun accountInfo(accountInfo: ExternalAccountInfoOneOf) = apply {
            body.accountInfo(accountInfo)
        }

        /**
         * Sets [Builder.accountInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountInfo] with a well-typed
         * [ExternalAccountInfoOneOf] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun accountInfo(accountInfo: JsonField<ExternalAccountInfoOneOf>) = apply {
            body.accountInfo(accountInfo)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofBrlAccount(brlAccount)`.
         */
        fun accountInfo(brlAccount: BrlExternalAccountInfo) = apply { body.accountInfo(brlAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofCadAccount(cadAccount)`.
         */
        fun accountInfo(cadAccount: ExternalAccountInfoOneOf.CadAccount) = apply {
            body.accountInfo(cadAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount)`.
         */
        fun accountInfo(dkkAccount: DkkExternalAccountInfo) = apply { body.accountInfo(dkkAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofEurAccount(eurAccount)`.
         */
        fun accountInfo(eurAccount: ExternalAccountInfoOneOf.EurAccount) = apply {
            body.accountInfo(eurAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)`.
         */
        fun accountInfo(gbpAccount: GbpExternalAccountInfo) = apply { body.accountInfo(gbpAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount)`.
         */
        fun accountInfo(hkdAccount: HkdExternalAccountInfo) = apply { body.accountInfo(hkdAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofIdrAccount(idrAccount)`.
         */
        fun accountInfo(idrAccount: IdrExternalAccountInfo) = apply { body.accountInfo(idrAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofInrAccount(inrAccount)`.
         */
        fun accountInfo(inrAccount: InrExternalAccountInfo) = apply { body.accountInfo(inrAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofKesAccount(kesAccount)`.
         */
        fun accountInfo(kesAccount: ExternalAccountInfoOneOf.KesAccount) = apply {
            body.accountInfo(kesAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofMwkAccount(mwkAccount)`.
         */
        fun accountInfo(mwkAccount: ExternalAccountInfoOneOf.MwkAccount) = apply {
            body.accountInfo(mwkAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount)`.
         */
        fun accountInfo(mxnAccount: MxnExternalAccountInfo) = apply { body.accountInfo(mxnAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofMyrAccount(myrAccount)`.
         */
        fun accountInfo(myrAccount: MyrExternalAccountInfo) = apply { body.accountInfo(myrAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount)`.
         */
        fun accountInfo(ngnAccount: ExternalAccountInfoOneOf.NgnAccount) = apply {
            body.accountInfo(ngnAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofPhpAccount(phpAccount)`.
         */
        fun accountInfo(phpAccount: PhpExternalAccountInfo) = apply { body.accountInfo(phpAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofRwfAccount(rwfAccount)`.
         */
        fun accountInfo(rwfAccount: ExternalAccountInfoOneOf.RwfAccount) = apply {
            body.accountInfo(rwfAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)`.
         */
        fun accountInfo(sgdAccount: SgdExternalAccountInfo) = apply { body.accountInfo(sgdAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofThbAccount(thbAccount)`.
         */
        fun accountInfo(thbAccount: ThbExternalAccountInfo) = apply { body.accountInfo(thbAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofTzsAccount(tzsAccount)`.
         */
        fun accountInfo(tzsAccount: ExternalAccountInfoOneOf.TzsAccount) = apply {
            body.accountInfo(tzsAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofUgxAccount(ugxAccount)`.
         */
        fun accountInfo(ugxAccount: ExternalAccountInfoOneOf.UgxAccount) = apply {
            body.accountInfo(ugxAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofUsdAccount(usdAccount)`.
         */
        fun accountInfo(usdAccount: UsdExternalAccountInfo) = apply { body.accountInfo(usdAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofVndAccount(vndAccount)`.
         */
        fun accountInfo(vndAccount: VndExternalAccountInfo) = apply { body.accountInfo(vndAccount) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofXofAccount(xofAccount)`.
         */
        fun accountInfo(xofAccount: ExternalAccountInfoOneOf.XofAccount) = apply {
            body.accountInfo(xofAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofZarAccount(zarAccount)`.
         */
        fun accountInfo(zarAccount: ExternalAccountInfoOneOf.ZarAccount) = apply {
            body.accountInfo(zarAccount)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofZmwAccount(zmwAccount)`.
         */
        fun accountInfo(zmwAccount: ExternalAccountInfoOneOf.ZmwAccount) = apply {
            body.accountInfo(zmwAccount)
        }

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet)`.
         */
        fun accountInfo(sparkWallet: SparkWalletInfo) = apply { body.accountInfo(sparkWallet) }

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * SparkWalletInfo.builder()
         *     .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun sparkWalletAccountInfo(address: String) = apply { body.sparkWalletAccountInfo(address) }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofLightning(lightning)`.
         */
        fun accountInfo(lightning: LightningWalletInfo) = apply { body.accountInfo(lightning) }

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofSolanaWallet(solanaWallet)`.
         */
        fun accountInfo(solanaWallet: SolanaWalletInfo) = apply { body.accountInfo(solanaWallet) }

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * SolanaWalletInfo.builder()
         *     .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun solanaWalletAccountInfo(address: String) = apply {
            body.solanaWalletAccountInfo(address)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofTronWallet(tronWallet)`.
         */
        fun accountInfo(tronWallet: TronWalletInfo) = apply { body.accountInfo(tronWallet) }

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * TronWalletInfo.builder()
         *     .accountType(TronWalletInfo.AccountType.TRON_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun tronWalletAccountInfo(address: String) = apply { body.tronWalletAccountInfo(address) }

        /**
         * Alias for calling [accountInfo] with
         * `ExternalAccountInfoOneOf.ofPolygonWallet(polygonWallet)`.
         */
        fun accountInfo(polygonWallet: PolygonWalletInfo) = apply {
            body.accountInfo(polygonWallet)
        }

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * PolygonWalletInfo.builder()
         *     .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun polygonWalletAccountInfo(address: String) = apply {
            body.polygonWalletAccountInfo(address)
        }

        /**
         * Alias for calling [accountInfo] with `ExternalAccountInfoOneOf.ofBaseWallet(baseWallet)`.
         */
        fun accountInfo(baseWallet: BaseWalletInfo) = apply { body.accountInfo(baseWallet) }

        /**
         * Alias for calling [accountInfo] with the following:
         * ```kotlin
         * BaseWalletInfo.builder()
         *     .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
         *     .address(address)
         *     .build()
         * ```
         */
        fun baseWalletAccountInfo(address: String) = apply { body.baseWalletAccountInfo(address) }

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
        private val accountInfo: JsonField<ExternalAccountInfoOneOf>,
        private val currency: JsonField<String>,
        private val platformAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("accountInfo")
            @ExcludeMissing
            accountInfo: JsonField<ExternalAccountInfoOneOf> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platformAccountId")
            @ExcludeMissing
            platformAccountId: JsonField<String> = JsonMissing.of(),
        ) : this(accountInfo, currency, platformAccountId, mutableMapOf())

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accountInfo(): ExternalAccountInfoOneOf = accountInfo.getRequired("accountInfo")

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
        fun _accountInfo(): JsonField<ExternalAccountInfoOneOf> = accountInfo

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

            private var accountInfo: JsonField<ExternalAccountInfoOneOf>? = null
            private var currency: JsonField<String>? = null
            private var platformAccountId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accountInfo = body.accountInfo
                currency = body.currency
                platformAccountId = body.platformAccountId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun accountInfo(accountInfo: ExternalAccountInfoOneOf) =
                accountInfo(JsonField.of(accountInfo))

            /**
             * Sets [Builder.accountInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountInfo] with a well-typed
             * [ExternalAccountInfoOneOf] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun accountInfo(accountInfo: JsonField<ExternalAccountInfoOneOf>) = apply {
                this.accountInfo = accountInfo
            }

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofBrlAccount(brlAccount)`.
             */
            fun accountInfo(brlAccount: BrlExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofBrlAccount(brlAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofCadAccount(cadAccount)`.
             */
            fun accountInfo(cadAccount: ExternalAccountInfoOneOf.CadAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofCadAccount(cadAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount)`.
             */
            fun accountInfo(dkkAccount: DkkExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofDkkAccount(dkkAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofEurAccount(eurAccount)`.
             */
            fun accountInfo(eurAccount: ExternalAccountInfoOneOf.EurAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofEurAccount(eurAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount)`.
             */
            fun accountInfo(gbpAccount: GbpExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofGbpAccount(gbpAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount)`.
             */
            fun accountInfo(hkdAccount: HkdExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofHkdAccount(hkdAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofIdrAccount(idrAccount)`.
             */
            fun accountInfo(idrAccount: IdrExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofIdrAccount(idrAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofInrAccount(inrAccount)`.
             */
            fun accountInfo(inrAccount: InrExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofInrAccount(inrAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofKesAccount(kesAccount)`.
             */
            fun accountInfo(kesAccount: ExternalAccountInfoOneOf.KesAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofKesAccount(kesAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofMwkAccount(mwkAccount)`.
             */
            fun accountInfo(mwkAccount: ExternalAccountInfoOneOf.MwkAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofMwkAccount(mwkAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount)`.
             */
            fun accountInfo(mxnAccount: MxnExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofMxnAccount(mxnAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofMyrAccount(myrAccount)`.
             */
            fun accountInfo(myrAccount: MyrExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofMyrAccount(myrAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount)`.
             */
            fun accountInfo(ngnAccount: ExternalAccountInfoOneOf.NgnAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofNgnAccount(ngnAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofPhpAccount(phpAccount)`.
             */
            fun accountInfo(phpAccount: PhpExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofPhpAccount(phpAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofRwfAccount(rwfAccount)`.
             */
            fun accountInfo(rwfAccount: ExternalAccountInfoOneOf.RwfAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofRwfAccount(rwfAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount)`.
             */
            fun accountInfo(sgdAccount: SgdExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofSgdAccount(sgdAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofThbAccount(thbAccount)`.
             */
            fun accountInfo(thbAccount: ThbExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofThbAccount(thbAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofTzsAccount(tzsAccount)`.
             */
            fun accountInfo(tzsAccount: ExternalAccountInfoOneOf.TzsAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofTzsAccount(tzsAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofUgxAccount(ugxAccount)`.
             */
            fun accountInfo(ugxAccount: ExternalAccountInfoOneOf.UgxAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofUgxAccount(ugxAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofUsdAccount(usdAccount)`.
             */
            fun accountInfo(usdAccount: UsdExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofUsdAccount(usdAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofVndAccount(vndAccount)`.
             */
            fun accountInfo(vndAccount: VndExternalAccountInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofVndAccount(vndAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofXofAccount(xofAccount)`.
             */
            fun accountInfo(xofAccount: ExternalAccountInfoOneOf.XofAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofXofAccount(xofAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofZarAccount(zarAccount)`.
             */
            fun accountInfo(zarAccount: ExternalAccountInfoOneOf.ZarAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofZarAccount(zarAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofZmwAccount(zmwAccount)`.
             */
            fun accountInfo(zmwAccount: ExternalAccountInfoOneOf.ZmwAccount) =
                accountInfo(ExternalAccountInfoOneOf.ofZmwAccount(zmwAccount))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet)`.
             */
            fun accountInfo(sparkWallet: SparkWalletInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofSparkWallet(sparkWallet))

            /**
             * Alias for calling [accountInfo] with the following:
             * ```kotlin
             * SparkWalletInfo.builder()
             *     .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
             *     .address(address)
             *     .build()
             * ```
             */
            fun sparkWalletAccountInfo(address: String) =
                accountInfo(
                    SparkWalletInfo.builder()
                        .accountType(SparkWalletInfo.AccountType.SPARK_WALLET)
                        .address(address)
                        .build()
                )

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofLightning(lightning)`.
             */
            fun accountInfo(lightning: LightningWalletInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofLightning(lightning))

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofSolanaWallet(solanaWallet)`.
             */
            fun accountInfo(solanaWallet: SolanaWalletInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofSolanaWallet(solanaWallet))

            /**
             * Alias for calling [accountInfo] with the following:
             * ```kotlin
             * SolanaWalletInfo.builder()
             *     .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
             *     .address(address)
             *     .build()
             * ```
             */
            fun solanaWalletAccountInfo(address: String) =
                accountInfo(
                    SolanaWalletInfo.builder()
                        .accountType(SolanaWalletInfo.AccountType.SOLANA_WALLET)
                        .address(address)
                        .build()
                )

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofTronWallet(tronWallet)`.
             */
            fun accountInfo(tronWallet: TronWalletInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofTronWallet(tronWallet))

            /**
             * Alias for calling [accountInfo] with the following:
             * ```kotlin
             * TronWalletInfo.builder()
             *     .accountType(TronWalletInfo.AccountType.TRON_WALLET)
             *     .address(address)
             *     .build()
             * ```
             */
            fun tronWalletAccountInfo(address: String) =
                accountInfo(
                    TronWalletInfo.builder()
                        .accountType(TronWalletInfo.AccountType.TRON_WALLET)
                        .address(address)
                        .build()
                )

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofPolygonWallet(polygonWallet)`.
             */
            fun accountInfo(polygonWallet: PolygonWalletInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofPolygonWallet(polygonWallet))

            /**
             * Alias for calling [accountInfo] with the following:
             * ```kotlin
             * PolygonWalletInfo.builder()
             *     .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
             *     .address(address)
             *     .build()
             * ```
             */
            fun polygonWalletAccountInfo(address: String) =
                accountInfo(
                    PolygonWalletInfo.builder()
                        .accountType(PolygonWalletInfo.AccountType.POLYGON_WALLET)
                        .address(address)
                        .build()
                )

            /**
             * Alias for calling [accountInfo] with
             * `ExternalAccountInfoOneOf.ofBaseWallet(baseWallet)`.
             */
            fun accountInfo(baseWallet: BaseWalletInfo) =
                accountInfo(ExternalAccountInfoOneOf.ofBaseWallet(baseWallet))

            /**
             * Alias for calling [accountInfo] with the following:
             * ```kotlin
             * BaseWalletInfo.builder()
             *     .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
             *     .address(address)
             *     .build()
             * ```
             */
            fun baseWalletAccountInfo(address: String) =
                accountInfo(
                    BaseWalletInfo.builder()
                        .accountType(BaseWalletInfo.AccountType.BASE_WALLET)
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
