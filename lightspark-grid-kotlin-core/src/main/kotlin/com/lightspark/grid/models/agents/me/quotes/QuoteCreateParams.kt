// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.quotes

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import java.util.Collections
import java.util.Objects

/**
 * Generate a quote for a cross-currency transfer on behalf of the authenticated agent's customer.
 * Accounts referenced in the request must belong to the agent's customer. Requires the
 * CREATE_QUOTES permission in the agent's policy. If the agent's defaultExecutionMode is
 * APPROVAL_REQUIRED, or the quote amount exceeds the agent's approvalThresholds, the resulting
 * transaction will require explicit approval before funds move.
 */
class QuoteCreateParams
private constructor(
    private val idempotencyKey: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): String? = idempotencyKey

    /**
     * Destination account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun destination(): QuoteDestinationOneOf = body.destination()

    /**
     * The amount to send/receive in the smallest unit of the locked currency (eg. cents). See
     * `lockedCurrencySide` for more information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lockedCurrencyAmount(): Long = body.lockedCurrencyAmount()

    /**
     * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`. For
     * example, if I want to send exactly $5 MXN from my wallet, I would set this to "sending", and
     * the `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to receive exactly $10
     * USD, I would set this to "receiving" and the `lockedCurrencyAmount` to 10000 (in cents).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lockedCurrencySide(): LockedCurrencySide = body.lockedCurrencySide()

    /**
     * Source account details
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun source(): QuoteSourceOneOf = body.source()

    /**
     * Optional description/memo for the transfer
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun description(): String? = body.description()

    /**
     * IDs of payment documents from `POST /payment-documents` that support this payment. Required
     * when the destination requires supporting documents. Supply one document for each requirement
     * of your `purposeOfPayment`.
     * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
     * lists which payouts need documents, the requirements for each purpose, and the document types
     * each requirement accepts. Grid matches each document to a requirement by its `documentType`,
     * which must be one of the types that requirement accepts. A request that leaves a requirement
     * unfilled returns `400 DOCUMENTS_REQUIRED`. Each document must belong to the customer sending
     * the payment, or to the platform when the platform itself is the sender. Any other ID returns
     * `404 PAYMENT_DOCUMENT_NOT_FOUND`.
     *
     * Grid attaches every document to the payment before it returns the quote. With
     * `immediatelyExecute: true`, Grid attaches the documents before it executes the quote. If an
     * attachment fails, Grid creates no quote and returns `424 PAYMENT_DOCUMENT_ATTACHMENT_FAILED`.
     * Retry the same request with the same `Idempotency-Key`.
     *
     * Requires the `Idempotency-Key` header. A destination that does not require supporting
     * documents rejects `documentIds` with `400 INVALID_INPUT`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun documentIds(): List<String>? = body.documentIds()

    /**
     * Whether to immediately execute the quote after creation. If true, the quote will be executed
     * and the transaction will be created at the current exchange rate. It should only be used if
     * you don't want to lock and view rate details before executing the quote. If you are executing
     * a pre-existing quote, use the `/quotes/{quoteId}/execute` endpoint instead. This is false by
     * default. This can only be used for quotes with a `source` which is either an internal
     * account, or has direct pull functionality (e.g. ACH pull with an external account). Not
     * supported when the `source` is an internal account of type `EMBEDDED_WALLET`: those transfers
     * require a `Grid-Wallet-Signature` over the `payloadToSign` returned in the quote response,
     * which is not available in a combined create-and-execute call. Create the quote first with
     * `immediatelyExecute: false` and then call `POST /quotes/{quoteId}/execute` with the
     * `Grid-Wallet-Signature` stamp header.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun immediatelyExecute(): Boolean? = body.immediatelyExecute()

    /**
     * Lookup ID from a previous receiver lookup request. If provided, this can make the quote
     * creation more efficient by reusing cached lookup data. NOTE: This is required for UMA
     * destinations due to counterparty institution requirements. See `senderCustomerInfo` for more
     * information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun lookupId(): String? = body.lookupId()

    /**
     * Overrides the platform-collected fee for this transaction. When present, it replaces any
     * configured platform-collected fees that would otherwise apply to the transaction. Currently
     * only supported when the quote's source currency is USD; the fixed fee must be denominated in
     * the source currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformFeeOverride(): PlatformFeeOverride? = body.platformFeeOverride()

    /**
     * The purpose of the payment. This may be required when sending to certain geographies (e.g.
     * India).
     *
     * Some destinations accept only certain purposes. A business payout to China must use one of
     * the purposes listed in
     * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents),
     * and each needs its own supporting documents.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun purposeOfPayment(): PurposeOfPayment? = body.purposeOfPayment()

    /**
     * Free-form information about the payment that travels with it to the recipient. The field this
     * populates depends on the payment rail: for ACH it populates the Addenda record, for FedNow
     * and RTP it populates the remittanceInformation field, and for wires it populates the OBI
     * (Originator to Beneficiary Information) / beneficiary information.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun remittanceInformation(): String? = body.remittanceInformation()

    /**
     * Optional preferred factor for a Strong Customer Authentication challenge issued at quote
     * creation. Only relevant for a realtime-funding source in a region where SCA is required (e.g.
     * EU); ignored otherwise. Valid values are `SMS_OTP` (default) and `PASSKEY` — `TOTP` cannot
     * carry the required dynamic linking and is rejected. When the quote is returned in
     * `PENDING_AUTHORIZATION`, authorize it via `POST /quotes/{quoteId}/authorize`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun scaFactor(): ScaFactor? = body.scaFactor()

    /**
     * Key-value pairs of additional information about the sender which was requested by the
     * destination. This is relevant when the destination requires more sender info than was
     * provided during customer creation. Any fields specified in `requiredPayerDataFields` from the
     * response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
     * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be provided
     * here if they were requested. If the destination did not request any additional information,
     * this field can be omitted.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun senderCustomerInfo(): SenderCustomerInfo? = body.senderCustomerInfo()

    /**
     * Returns the raw JSON value of [destination].
     *
     * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _destination(): JsonField<QuoteDestinationOneOf> = body._destination()

    /**
     * Returns the raw JSON value of [lockedCurrencyAmount].
     *
     * Unlike [lockedCurrencyAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _lockedCurrencyAmount(): JsonField<Long> = body._lockedCurrencyAmount()

    /**
     * Returns the raw JSON value of [lockedCurrencySide].
     *
     * Unlike [lockedCurrencySide], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _lockedCurrencySide(): JsonField<LockedCurrencySide> = body._lockedCurrencySide()

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _source(): JsonField<QuoteSourceOneOf> = body._source()

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _description(): JsonField<String> = body._description()

    /**
     * Returns the raw JSON value of [documentIds].
     *
     * Unlike [documentIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _documentIds(): JsonField<List<String>> = body._documentIds()

    /**
     * Returns the raw JSON value of [immediatelyExecute].
     *
     * Unlike [immediatelyExecute], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _immediatelyExecute(): JsonField<Boolean> = body._immediatelyExecute()

    /**
     * Returns the raw JSON value of [lookupId].
     *
     * Unlike [lookupId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _lookupId(): JsonField<String> = body._lookupId()

    /**
     * Returns the raw JSON value of [platformFeeOverride].
     *
     * Unlike [platformFeeOverride], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _platformFeeOverride(): JsonField<PlatformFeeOverride> = body._platformFeeOverride()

    /**
     * Returns the raw JSON value of [purposeOfPayment].
     *
     * Unlike [purposeOfPayment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _purposeOfPayment(): JsonField<PurposeOfPayment> = body._purposeOfPayment()

    /**
     * Returns the raw JSON value of [remittanceInformation].
     *
     * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /**
     * Returns the raw JSON value of [scaFactor].
     *
     * Unlike [scaFactor], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _scaFactor(): JsonField<ScaFactor> = body._scaFactor()

    /**
     * Returns the raw JSON value of [senderCustomerInfo].
     *
     * Unlike [senderCustomerInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _senderCustomerInfo(): JsonField<SenderCustomerInfo> = body._senderCustomerInfo()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [QuoteCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .lockedCurrencyAmount()
         * .lockedCurrencySide()
         * .source()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [QuoteCreateParams]. */
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(quoteCreateParams: QuoteCreateParams) = apply {
            idempotencyKey = quoteCreateParams.idempotencyKey
            body = quoteCreateParams.body.toBuilder()
            additionalHeaders = quoteCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = quoteCreateParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [destination]
         * - [lockedCurrencyAmount]
         * - [lockedCurrencySide]
         * - [source]
         * - [description]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Destination account details */
        fun destination(destination: QuoteDestinationOneOf) = apply {
            body.destination(destination)
        }

        /**
         * Sets [Builder.destination] to an arbitrary JSON value.
         *
         * You should usually call [Builder.destination] with a well-typed [QuoteDestinationOneOf]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun destination(destination: JsonField<QuoteDestinationOneOf>) = apply {
            body.destination(destination)
        }

        /**
         * Alias for calling [destination] with
         * `QuoteDestinationOneOf.ofAccountDestination(accountDestination)`.
         */
        fun destination(accountDestination: QuoteDestinationOneOf.AccountDestination) = apply {
            body.destination(accountDestination)
        }

        /**
         * Alias for calling [destination] with the following:
         * ```kotlin
         * QuoteDestinationOneOf.AccountDestination.builder()
         *     .destinationType(QuoteDestinationOneOf.AccountDestination.DestinationType.ACCOUNT)
         *     .accountId(accountId)
         *     .build()
         * ```
         */
        fun accountDestinationDestination(accountId: String) = apply {
            body.accountDestinationDestination(accountId)
        }

        /**
         * Alias for calling [destination] with
         * `QuoteDestinationOneOf.ofUmaAddressDestination(umaAddressDestination)`.
         */
        fun destination(umaAddressDestination: QuoteDestinationOneOf.UmaAddressDestination) =
            apply {
                body.destination(umaAddressDestination)
            }

        /**
         * The amount to send/receive in the smallest unit of the locked currency (eg. cents). See
         * `lockedCurrencySide` for more information.
         */
        fun lockedCurrencyAmount(lockedCurrencyAmount: Long) = apply {
            body.lockedCurrencyAmount(lockedCurrencyAmount)
        }

        /**
         * Sets [Builder.lockedCurrencyAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockedCurrencyAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lockedCurrencyAmount(lockedCurrencyAmount: JsonField<Long>) = apply {
            body.lockedCurrencyAmount(lockedCurrencyAmount)
        }

        /**
         * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`.
         * For example, if I want to send exactly $5 MXN from my wallet, I would set this to
         * "sending", and the `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to
         * receive exactly $10 USD, I would set this to "receiving" and the `lockedCurrencyAmount`
         * to 10000 (in cents).
         */
        fun lockedCurrencySide(lockedCurrencySide: LockedCurrencySide) = apply {
            body.lockedCurrencySide(lockedCurrencySide)
        }

        /**
         * Sets [Builder.lockedCurrencySide] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lockedCurrencySide] with a well-typed
         * [LockedCurrencySide] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun lockedCurrencySide(lockedCurrencySide: JsonField<LockedCurrencySide>) = apply {
            body.lockedCurrencySide(lockedCurrencySide)
        }

        /** Source account details */
        fun source(source: QuoteSourceOneOf) = apply { body.source(source) }

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [QuoteSourceOneOf] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun source(source: JsonField<QuoteSourceOneOf>) = apply { body.source(source) }

        /**
         * Alias for calling [source] with
         * `QuoteSourceOneOf.ofAccountQuoteSource(accountQuoteSource)`.
         */
        fun source(accountQuoteSource: QuoteSourceOneOf.AccountQuoteSource) = apply {
            body.source(accountQuoteSource)
        }

        /**
         * Alias for calling [source] with the following:
         * ```kotlin
         * QuoteSourceOneOf.AccountQuoteSource.builder()
         *     .sourceType(QuoteSourceOneOf.AccountQuoteSource.SourceType.ACCOUNT)
         *     .accountId(accountId)
         *     .build()
         * ```
         */
        fun accountQuoteSourceSource(accountId: String) = apply {
            body.accountQuoteSourceSource(accountId)
        }

        /**
         * Alias for calling [source] with
         * `QuoteSourceOneOf.ofRealtimeFundingQuoteSource(realtimeFundingQuoteSource)`.
         */
        fun source(realtimeFundingQuoteSource: QuoteSourceOneOf.RealtimeFundingQuoteSource) =
            apply {
                body.source(realtimeFundingQuoteSource)
            }

        /**
         * Alias for calling [source] with the following:
         * ```kotlin
         * QuoteSourceOneOf.RealtimeFundingQuoteSource.builder()
         *     .sourceType(QuoteSourceOneOf.RealtimeFundingQuoteSource.SourceType.REALTIME_FUNDING)
         *     .currency(currency)
         *     .build()
         * ```
         */
        fun realtimeFundingQuoteSourceSource(currency: String) = apply {
            body.realtimeFundingQuoteSourceSource(currency)
        }

        /** Optional description/memo for the transfer */
        fun description(description: String) = apply { body.description(description) }

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /**
         * IDs of payment documents from `POST /payment-documents` that support this payment.
         * Required when the destination requires supporting documents. Supply one document for each
         * requirement of your `purposeOfPayment`.
         * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
         * lists which payouts need documents, the requirements for each purpose, and the document
         * types each requirement accepts. Grid matches each document to a requirement by its
         * `documentType`, which must be one of the types that requirement accepts. A request that
         * leaves a requirement unfilled returns `400 DOCUMENTS_REQUIRED`. Each document must belong
         * to the customer sending the payment, or to the platform when the platform itself is the
         * sender. Any other ID returns `404 PAYMENT_DOCUMENT_NOT_FOUND`.
         *
         * Grid attaches every document to the payment before it returns the quote. With
         * `immediatelyExecute: true`, Grid attaches the documents before it executes the quote. If
         * an attachment fails, Grid creates no quote and returns `424
         * PAYMENT_DOCUMENT_ATTACHMENT_FAILED`. Retry the same request with the same
         * `Idempotency-Key`.
         *
         * Requires the `Idempotency-Key` header. A destination that does not require supporting
         * documents rejects `documentIds` with `400 INVALID_INPUT`.
         */
        fun documentIds(documentIds: List<String>) = apply { body.documentIds(documentIds) }

        /**
         * Sets [Builder.documentIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentIds] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun documentIds(documentIds: JsonField<List<String>>) = apply {
            body.documentIds(documentIds)
        }

        /**
         * Adds a single [String] to [documentIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDocumentId(documentId: String) = apply { body.addDocumentId(documentId) }

        /**
         * Whether to immediately execute the quote after creation. If true, the quote will be
         * executed and the transaction will be created at the current exchange rate. It should only
         * be used if you don't want to lock and view rate details before executing the quote. If
         * you are executing a pre-existing quote, use the `/quotes/{quoteId}/execute` endpoint
         * instead. This is false by default. This can only be used for quotes with a `source` which
         * is either an internal account, or has direct pull functionality (e.g. ACH pull with an
         * external account). Not supported when the `source` is an internal account of type
         * `EMBEDDED_WALLET`: those transfers require a `Grid-Wallet-Signature` over the
         * `payloadToSign` returned in the quote response, which is not available in a combined
         * create-and-execute call. Create the quote first with `immediatelyExecute: false` and then
         * call `POST /quotes/{quoteId}/execute` with the `Grid-Wallet-Signature` stamp header.
         */
        fun immediatelyExecute(immediatelyExecute: Boolean) = apply {
            body.immediatelyExecute(immediatelyExecute)
        }

        /**
         * Sets [Builder.immediatelyExecute] to an arbitrary JSON value.
         *
         * You should usually call [Builder.immediatelyExecute] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun immediatelyExecute(immediatelyExecute: JsonField<Boolean>) = apply {
            body.immediatelyExecute(immediatelyExecute)
        }

        /**
         * Lookup ID from a previous receiver lookup request. If provided, this can make the quote
         * creation more efficient by reusing cached lookup data. NOTE: This is required for UMA
         * destinations due to counterparty institution requirements. See `senderCustomerInfo` for
         * more information.
         */
        fun lookupId(lookupId: String) = apply { body.lookupId(lookupId) }

        /**
         * Sets [Builder.lookupId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lookupId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun lookupId(lookupId: JsonField<String>) = apply { body.lookupId(lookupId) }

        /**
         * Overrides the platform-collected fee for this transaction. When present, it replaces any
         * configured platform-collected fees that would otherwise apply to the transaction.
         * Currently only supported when the quote's source currency is USD; the fixed fee must be
         * denominated in the source currency.
         */
        fun platformFeeOverride(platformFeeOverride: PlatformFeeOverride) = apply {
            body.platformFeeOverride(platformFeeOverride)
        }

        /**
         * Sets [Builder.platformFeeOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformFeeOverride] with a well-typed
         * [PlatformFeeOverride] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun platformFeeOverride(platformFeeOverride: JsonField<PlatformFeeOverride>) = apply {
            body.platformFeeOverride(platformFeeOverride)
        }

        /**
         * The purpose of the payment. This may be required when sending to certain geographies
         * (e.g. India).
         *
         * Some destinations accept only certain purposes. A business payout to China must use one
         * of the purposes listed in
         * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents),
         * and each needs its own supporting documents.
         */
        fun purposeOfPayment(purposeOfPayment: PurposeOfPayment) = apply {
            body.purposeOfPayment(purposeOfPayment)
        }

        /**
         * Sets [Builder.purposeOfPayment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.purposeOfPayment] with a well-typed [PurposeOfPayment]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun purposeOfPayment(purposeOfPayment: JsonField<PurposeOfPayment>) = apply {
            body.purposeOfPayment(purposeOfPayment)
        }

        /**
         * Free-form information about the payment that travels with it to the recipient. The field
         * this populates depends on the payment rail: for ACH it populates the Addenda record, for
         * FedNow and RTP it populates the remittanceInformation field, and for wires it populates
         * the OBI (Originator to Beneficiary Information) / beneficiary information.
         */
        fun remittanceInformation(remittanceInformation: String) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remittanceInformation] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /**
         * Optional preferred factor for a Strong Customer Authentication challenge issued at quote
         * creation. Only relevant for a realtime-funding source in a region where SCA is required
         * (e.g. EU); ignored otherwise. Valid values are `SMS_OTP` (default) and `PASSKEY` — `TOTP`
         * cannot carry the required dynamic linking and is rejected. When the quote is returned in
         * `PENDING_AUTHORIZATION`, authorize it via `POST /quotes/{quoteId}/authorize`.
         */
        fun scaFactor(scaFactor: ScaFactor) = apply { body.scaFactor(scaFactor) }

        /**
         * Sets [Builder.scaFactor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scaFactor] with a well-typed [ScaFactor] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun scaFactor(scaFactor: JsonField<ScaFactor>) = apply { body.scaFactor(scaFactor) }

        /**
         * Key-value pairs of additional information about the sender which was requested by the
         * destination. This is relevant when the destination requires more sender info than was
         * provided during customer creation. Any fields specified in `requiredPayerDataFields` from
         * the response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
         * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be
         * provided here if they were requested. If the destination did not request any additional
         * information, this field can be omitted.
         */
        fun senderCustomerInfo(senderCustomerInfo: SenderCustomerInfo) = apply {
            body.senderCustomerInfo(senderCustomerInfo)
        }

        /**
         * Sets [Builder.senderCustomerInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderCustomerInfo] with a well-typed
         * [SenderCustomerInfo] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun senderCustomerInfo(senderCustomerInfo: JsonField<SenderCustomerInfo>) = apply {
            body.senderCustomerInfo(senderCustomerInfo)
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
         * Returns an immutable instance of [QuoteCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .destination()
         * .lockedCurrencyAmount()
         * .lockedCurrencySide()
         * .source()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): QuoteCreateParams =
            QuoteCreateParams(
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                idempotencyKey?.let { put("Idempotency-Key", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val destination: JsonField<QuoteDestinationOneOf>,
        private val lockedCurrencyAmount: JsonField<Long>,
        private val lockedCurrencySide: JsonField<LockedCurrencySide>,
        private val source: JsonField<QuoteSourceOneOf>,
        private val description: JsonField<String>,
        private val documentIds: JsonField<List<String>>,
        private val immediatelyExecute: JsonField<Boolean>,
        private val lookupId: JsonField<String>,
        private val platformFeeOverride: JsonField<PlatformFeeOverride>,
        private val purposeOfPayment: JsonField<PurposeOfPayment>,
        private val remittanceInformation: JsonField<String>,
        private val scaFactor: JsonField<ScaFactor>,
        private val senderCustomerInfo: JsonField<SenderCustomerInfo>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("destination")
            @ExcludeMissing
            destination: JsonField<QuoteDestinationOneOf> = JsonMissing.of(),
            @JsonProperty("lockedCurrencyAmount")
            @ExcludeMissing
            lockedCurrencyAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("lockedCurrencySide")
            @ExcludeMissing
            lockedCurrencySide: JsonField<LockedCurrencySide> = JsonMissing.of(),
            @JsonProperty("source")
            @ExcludeMissing
            source: JsonField<QuoteSourceOneOf> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("documentIds")
            @ExcludeMissing
            documentIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("immediatelyExecute")
            @ExcludeMissing
            immediatelyExecute: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("lookupId")
            @ExcludeMissing
            lookupId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platformFeeOverride")
            @ExcludeMissing
            platformFeeOverride: JsonField<PlatformFeeOverride> = JsonMissing.of(),
            @JsonProperty("purposeOfPayment")
            @ExcludeMissing
            purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of(),
            @JsonProperty("remittanceInformation")
            @ExcludeMissing
            remittanceInformation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scaFactor")
            @ExcludeMissing
            scaFactor: JsonField<ScaFactor> = JsonMissing.of(),
            @JsonProperty("senderCustomerInfo")
            @ExcludeMissing
            senderCustomerInfo: JsonField<SenderCustomerInfo> = JsonMissing.of(),
        ) : this(
            destination,
            lockedCurrencyAmount,
            lockedCurrencySide,
            source,
            description,
            documentIds,
            immediatelyExecute,
            lookupId,
            platformFeeOverride,
            purposeOfPayment,
            remittanceInformation,
            scaFactor,
            senderCustomerInfo,
            mutableMapOf(),
        )

        /**
         * Destination account details
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun destination(): QuoteDestinationOneOf = destination.getRequired("destination")

        /**
         * The amount to send/receive in the smallest unit of the locked currency (eg. cents). See
         * `lockedCurrencySide` for more information.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lockedCurrencyAmount(): Long = lockedCurrencyAmount.getRequired("lockedCurrencyAmount")

        /**
         * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`.
         * For example, if I want to send exactly $5 MXN from my wallet, I would set this to
         * "sending", and the `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to
         * receive exactly $10 USD, I would set this to "receiving" and the `lockedCurrencyAmount`
         * to 10000 (in cents).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun lockedCurrencySide(): LockedCurrencySide =
            lockedCurrencySide.getRequired("lockedCurrencySide")

        /**
         * Source account details
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun source(): QuoteSourceOneOf = source.getRequired("source")

        /**
         * Optional description/memo for the transfer
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun description(): String? = description.getNullable("description")

        /**
         * IDs of payment documents from `POST /payment-documents` that support this payment.
         * Required when the destination requires supporting documents. Supply one document for each
         * requirement of your `purposeOfPayment`.
         * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
         * lists which payouts need documents, the requirements for each purpose, and the document
         * types each requirement accepts. Grid matches each document to a requirement by its
         * `documentType`, which must be one of the types that requirement accepts. A request that
         * leaves a requirement unfilled returns `400 DOCUMENTS_REQUIRED`. Each document must belong
         * to the customer sending the payment, or to the platform when the platform itself is the
         * sender. Any other ID returns `404 PAYMENT_DOCUMENT_NOT_FOUND`.
         *
         * Grid attaches every document to the payment before it returns the quote. With
         * `immediatelyExecute: true`, Grid attaches the documents before it executes the quote. If
         * an attachment fails, Grid creates no quote and returns `424
         * PAYMENT_DOCUMENT_ATTACHMENT_FAILED`. Retry the same request with the same
         * `Idempotency-Key`.
         *
         * Requires the `Idempotency-Key` header. A destination that does not require supporting
         * documents rejects `documentIds` with `400 INVALID_INPUT`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun documentIds(): List<String>? = documentIds.getNullable("documentIds")

        /**
         * Whether to immediately execute the quote after creation. If true, the quote will be
         * executed and the transaction will be created at the current exchange rate. It should only
         * be used if you don't want to lock and view rate details before executing the quote. If
         * you are executing a pre-existing quote, use the `/quotes/{quoteId}/execute` endpoint
         * instead. This is false by default. This can only be used for quotes with a `source` which
         * is either an internal account, or has direct pull functionality (e.g. ACH pull with an
         * external account). Not supported when the `source` is an internal account of type
         * `EMBEDDED_WALLET`: those transfers require a `Grid-Wallet-Signature` over the
         * `payloadToSign` returned in the quote response, which is not available in a combined
         * create-and-execute call. Create the quote first with `immediatelyExecute: false` and then
         * call `POST /quotes/{quoteId}/execute` with the `Grid-Wallet-Signature` stamp header.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun immediatelyExecute(): Boolean? = immediatelyExecute.getNullable("immediatelyExecute")

        /**
         * Lookup ID from a previous receiver lookup request. If provided, this can make the quote
         * creation more efficient by reusing cached lookup data. NOTE: This is required for UMA
         * destinations due to counterparty institution requirements. See `senderCustomerInfo` for
         * more information.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun lookupId(): String? = lookupId.getNullable("lookupId")

        /**
         * Overrides the platform-collected fee for this transaction. When present, it replaces any
         * configured platform-collected fees that would otherwise apply to the transaction.
         * Currently only supported when the quote's source currency is USD; the fixed fee must be
         * denominated in the source currency.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun platformFeeOverride(): PlatformFeeOverride? =
            platformFeeOverride.getNullable("platformFeeOverride")

        /**
         * The purpose of the payment. This may be required when sending to certain geographies
         * (e.g. India).
         *
         * Some destinations accept only certain purposes. A business payout to China must use one
         * of the purposes listed in
         * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents),
         * and each needs its own supporting documents.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun purposeOfPayment(): PurposeOfPayment? = purposeOfPayment.getNullable("purposeOfPayment")

        /**
         * Free-form information about the payment that travels with it to the recipient. The field
         * this populates depends on the payment rail: for ACH it populates the Addenda record, for
         * FedNow and RTP it populates the remittanceInformation field, and for wires it populates
         * the OBI (Originator to Beneficiary Information) / beneficiary information.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun remittanceInformation(): String? =
            remittanceInformation.getNullable("remittanceInformation")

        /**
         * Optional preferred factor for a Strong Customer Authentication challenge issued at quote
         * creation. Only relevant for a realtime-funding source in a region where SCA is required
         * (e.g. EU); ignored otherwise. Valid values are `SMS_OTP` (default) and `PASSKEY` — `TOTP`
         * cannot carry the required dynamic linking and is rejected. When the quote is returned in
         * `PENDING_AUTHORIZATION`, authorize it via `POST /quotes/{quoteId}/authorize`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun scaFactor(): ScaFactor? = scaFactor.getNullable("scaFactor")

        /**
         * Key-value pairs of additional information about the sender which was requested by the
         * destination. This is relevant when the destination requires more sender info than was
         * provided during customer creation. Any fields specified in `requiredPayerDataFields` from
         * the response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
         * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be
         * provided here if they were requested. If the destination did not request any additional
         * information, this field can be omitted.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun senderCustomerInfo(): SenderCustomerInfo? =
            senderCustomerInfo.getNullable("senderCustomerInfo")

        /**
         * Returns the raw JSON value of [destination].
         *
         * Unlike [destination], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("destination")
        @ExcludeMissing
        fun _destination(): JsonField<QuoteDestinationOneOf> = destination

        /**
         * Returns the raw JSON value of [lockedCurrencyAmount].
         *
         * Unlike [lockedCurrencyAmount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("lockedCurrencyAmount")
        @ExcludeMissing
        fun _lockedCurrencyAmount(): JsonField<Long> = lockedCurrencyAmount

        /**
         * Returns the raw JSON value of [lockedCurrencySide].
         *
         * Unlike [lockedCurrencySide], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("lockedCurrencySide")
        @ExcludeMissing
        fun _lockedCurrencySide(): JsonField<LockedCurrencySide> = lockedCurrencySide

        /**
         * Returns the raw JSON value of [source].
         *
         * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<QuoteSourceOneOf> = source

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [documentIds].
         *
         * Unlike [documentIds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("documentIds")
        @ExcludeMissing
        fun _documentIds(): JsonField<List<String>> = documentIds

        /**
         * Returns the raw JSON value of [immediatelyExecute].
         *
         * Unlike [immediatelyExecute], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("immediatelyExecute")
        @ExcludeMissing
        fun _immediatelyExecute(): JsonField<Boolean> = immediatelyExecute

        /**
         * Returns the raw JSON value of [lookupId].
         *
         * Unlike [lookupId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("lookupId") @ExcludeMissing fun _lookupId(): JsonField<String> = lookupId

        /**
         * Returns the raw JSON value of [platformFeeOverride].
         *
         * Unlike [platformFeeOverride], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("platformFeeOverride")
        @ExcludeMissing
        fun _platformFeeOverride(): JsonField<PlatformFeeOverride> = platformFeeOverride

        /**
         * Returns the raw JSON value of [purposeOfPayment].
         *
         * Unlike [purposeOfPayment], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("purposeOfPayment")
        @ExcludeMissing
        fun _purposeOfPayment(): JsonField<PurposeOfPayment> = purposeOfPayment

        /**
         * Returns the raw JSON value of [remittanceInformation].
         *
         * Unlike [remittanceInformation], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("remittanceInformation")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /**
         * Returns the raw JSON value of [scaFactor].
         *
         * Unlike [scaFactor], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("scaFactor")
        @ExcludeMissing
        fun _scaFactor(): JsonField<ScaFactor> = scaFactor

        /**
         * Returns the raw JSON value of [senderCustomerInfo].
         *
         * Unlike [senderCustomerInfo], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("senderCustomerInfo")
        @ExcludeMissing
        fun _senderCustomerInfo(): JsonField<SenderCustomerInfo> = senderCustomerInfo

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
             * .destination()
             * .lockedCurrencyAmount()
             * .lockedCurrencySide()
             * .source()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var destination: JsonField<QuoteDestinationOneOf>? = null
            private var lockedCurrencyAmount: JsonField<Long>? = null
            private var lockedCurrencySide: JsonField<LockedCurrencySide>? = null
            private var source: JsonField<QuoteSourceOneOf>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var documentIds: JsonField<MutableList<String>>? = null
            private var immediatelyExecute: JsonField<Boolean> = JsonMissing.of()
            private var lookupId: JsonField<String> = JsonMissing.of()
            private var platformFeeOverride: JsonField<PlatformFeeOverride> = JsonMissing.of()
            private var purposeOfPayment: JsonField<PurposeOfPayment> = JsonMissing.of()
            private var remittanceInformation: JsonField<String> = JsonMissing.of()
            private var scaFactor: JsonField<ScaFactor> = JsonMissing.of()
            private var senderCustomerInfo: JsonField<SenderCustomerInfo> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                destination = body.destination
                lockedCurrencyAmount = body.lockedCurrencyAmount
                lockedCurrencySide = body.lockedCurrencySide
                source = body.source
                description = body.description
                documentIds = body.documentIds.map { it.toMutableList() }
                immediatelyExecute = body.immediatelyExecute
                lookupId = body.lookupId
                platformFeeOverride = body.platformFeeOverride
                purposeOfPayment = body.purposeOfPayment
                remittanceInformation = body.remittanceInformation
                scaFactor = body.scaFactor
                senderCustomerInfo = body.senderCustomerInfo
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Destination account details */
            fun destination(destination: QuoteDestinationOneOf) =
                destination(JsonField.of(destination))

            /**
             * Sets [Builder.destination] to an arbitrary JSON value.
             *
             * You should usually call [Builder.destination] with a well-typed
             * [QuoteDestinationOneOf] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun destination(destination: JsonField<QuoteDestinationOneOf>) = apply {
                this.destination = destination
            }

            /**
             * Alias for calling [destination] with
             * `QuoteDestinationOneOf.ofAccountDestination(accountDestination)`.
             */
            fun destination(accountDestination: QuoteDestinationOneOf.AccountDestination) =
                destination(QuoteDestinationOneOf.ofAccountDestination(accountDestination))

            /**
             * Alias for calling [destination] with the following:
             * ```kotlin
             * QuoteDestinationOneOf.AccountDestination.builder()
             *     .destinationType(QuoteDestinationOneOf.AccountDestination.DestinationType.ACCOUNT)
             *     .accountId(accountId)
             *     .build()
             * ```
             */
            fun accountDestinationDestination(accountId: String) =
                destination(
                    QuoteDestinationOneOf.AccountDestination.builder()
                        .destinationType(
                            QuoteDestinationOneOf.AccountDestination.DestinationType.ACCOUNT
                        )
                        .accountId(accountId)
                        .build()
                )

            /**
             * Alias for calling [destination] with
             * `QuoteDestinationOneOf.ofUmaAddressDestination(umaAddressDestination)`.
             */
            fun destination(umaAddressDestination: QuoteDestinationOneOf.UmaAddressDestination) =
                destination(QuoteDestinationOneOf.ofUmaAddressDestination(umaAddressDestination))

            /**
             * The amount to send/receive in the smallest unit of the locked currency (eg. cents).
             * See `lockedCurrencySide` for more information.
             */
            fun lockedCurrencyAmount(lockedCurrencyAmount: Long) =
                lockedCurrencyAmount(JsonField.of(lockedCurrencyAmount))

            /**
             * Sets [Builder.lockedCurrencyAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lockedCurrencyAmount] with a well-typed [Long] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lockedCurrencyAmount(lockedCurrencyAmount: JsonField<Long>) = apply {
                this.lockedCurrencyAmount = lockedCurrencyAmount
            }

            /**
             * The side of the quote which should be locked and specified in the
             * `lockedCurrencyAmount`. For example, if I want to send exactly $5 MXN from my wallet,
             * I would set this to "sending", and the `lockedCurrencyAmount` to 500 (in cents). If I
             * want the receiver to receive exactly $10 USD, I would set this to "receiving" and the
             * `lockedCurrencyAmount` to 10000 (in cents).
             */
            fun lockedCurrencySide(lockedCurrencySide: LockedCurrencySide) =
                lockedCurrencySide(JsonField.of(lockedCurrencySide))

            /**
             * Sets [Builder.lockedCurrencySide] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lockedCurrencySide] with a well-typed
             * [LockedCurrencySide] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun lockedCurrencySide(lockedCurrencySide: JsonField<LockedCurrencySide>) = apply {
                this.lockedCurrencySide = lockedCurrencySide
            }

            /** Source account details */
            fun source(source: QuoteSourceOneOf) = source(JsonField.of(source))

            /**
             * Sets [Builder.source] to an arbitrary JSON value.
             *
             * You should usually call [Builder.source] with a well-typed [QuoteSourceOneOf] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun source(source: JsonField<QuoteSourceOneOf>) = apply { this.source = source }

            /**
             * Alias for calling [source] with
             * `QuoteSourceOneOf.ofAccountQuoteSource(accountQuoteSource)`.
             */
            fun source(accountQuoteSource: QuoteSourceOneOf.AccountQuoteSource) =
                source(QuoteSourceOneOf.ofAccountQuoteSource(accountQuoteSource))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * QuoteSourceOneOf.AccountQuoteSource.builder()
             *     .sourceType(QuoteSourceOneOf.AccountQuoteSource.SourceType.ACCOUNT)
             *     .accountId(accountId)
             *     .build()
             * ```
             */
            fun accountQuoteSourceSource(accountId: String) =
                source(
                    QuoteSourceOneOf.AccountQuoteSource.builder()
                        .sourceType(QuoteSourceOneOf.AccountQuoteSource.SourceType.ACCOUNT)
                        .accountId(accountId)
                        .build()
                )

            /**
             * Alias for calling [source] with
             * `QuoteSourceOneOf.ofRealtimeFundingQuoteSource(realtimeFundingQuoteSource)`.
             */
            fun source(realtimeFundingQuoteSource: QuoteSourceOneOf.RealtimeFundingQuoteSource) =
                source(QuoteSourceOneOf.ofRealtimeFundingQuoteSource(realtimeFundingQuoteSource))

            /**
             * Alias for calling [source] with the following:
             * ```kotlin
             * QuoteSourceOneOf.RealtimeFundingQuoteSource.builder()
             *     .sourceType(QuoteSourceOneOf.RealtimeFundingQuoteSource.SourceType.REALTIME_FUNDING)
             *     .currency(currency)
             *     .build()
             * ```
             */
            fun realtimeFundingQuoteSourceSource(currency: String) =
                source(
                    QuoteSourceOneOf.RealtimeFundingQuoteSource.builder()
                        .sourceType(
                            QuoteSourceOneOf.RealtimeFundingQuoteSource.SourceType.REALTIME_FUNDING
                        )
                        .currency(currency)
                        .build()
                )

            /** Optional description/memo for the transfer */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /**
             * IDs of payment documents from `POST /payment-documents` that support this payment.
             * Required when the destination requires supporting documents. Supply one document for
             * each requirement of your `purposeOfPayment`.
             * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
             * lists which payouts need documents, the requirements for each purpose, and the
             * document types each requirement accepts. Grid matches each document to a requirement
             * by its `documentType`, which must be one of the types that requirement accepts. A
             * request that leaves a requirement unfilled returns `400 DOCUMENTS_REQUIRED`. Each
             * document must belong to the customer sending the payment, or to the platform when the
             * platform itself is the sender. Any other ID returns `404 PAYMENT_DOCUMENT_NOT_FOUND`.
             *
             * Grid attaches every document to the payment before it returns the quote. With
             * `immediatelyExecute: true`, Grid attaches the documents before it executes the quote.
             * If an attachment fails, Grid creates no quote and returns `424
             * PAYMENT_DOCUMENT_ATTACHMENT_FAILED`. Retry the same request with the same
             * `Idempotency-Key`.
             *
             * Requires the `Idempotency-Key` header. A destination that does not require supporting
             * documents rejects `documentIds` with `400 INVALID_INPUT`.
             */
            fun documentIds(documentIds: List<String>) = documentIds(JsonField.of(documentIds))

            /**
             * Sets [Builder.documentIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.documentIds] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun documentIds(documentIds: JsonField<List<String>>) = apply {
                this.documentIds = documentIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [documentIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDocumentId(documentId: String) = apply {
                documentIds =
                    (documentIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("documentIds", it).add(documentId)
                    }
            }

            /**
             * Whether to immediately execute the quote after creation. If true, the quote will be
             * executed and the transaction will be created at the current exchange rate. It should
             * only be used if you don't want to lock and view rate details before executing the
             * quote. If you are executing a pre-existing quote, use the `/quotes/{quoteId}/execute`
             * endpoint instead. This is false by default. This can only be used for quotes with a
             * `source` which is either an internal account, or has direct pull functionality (e.g.
             * ACH pull with an external account). Not supported when the `source` is an internal
             * account of type `EMBEDDED_WALLET`: those transfers require a `Grid-Wallet-Signature`
             * over the `payloadToSign` returned in the quote response, which is not available in a
             * combined create-and-execute call. Create the quote first with `immediatelyExecute:
             * false` and then call `POST /quotes/{quoteId}/execute` with the
             * `Grid-Wallet-Signature` stamp header.
             */
            fun immediatelyExecute(immediatelyExecute: Boolean) =
                immediatelyExecute(JsonField.of(immediatelyExecute))

            /**
             * Sets [Builder.immediatelyExecute] to an arbitrary JSON value.
             *
             * You should usually call [Builder.immediatelyExecute] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun immediatelyExecute(immediatelyExecute: JsonField<Boolean>) = apply {
                this.immediatelyExecute = immediatelyExecute
            }

            /**
             * Lookup ID from a previous receiver lookup request. If provided, this can make the
             * quote creation more efficient by reusing cached lookup data. NOTE: This is required
             * for UMA destinations due to counterparty institution requirements. See
             * `senderCustomerInfo` for more information.
             */
            fun lookupId(lookupId: String) = lookupId(JsonField.of(lookupId))

            /**
             * Sets [Builder.lookupId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.lookupId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun lookupId(lookupId: JsonField<String>) = apply { this.lookupId = lookupId }

            /**
             * Overrides the platform-collected fee for this transaction. When present, it replaces
             * any configured platform-collected fees that would otherwise apply to the transaction.
             * Currently only supported when the quote's source currency is USD; the fixed fee must
             * be denominated in the source currency.
             */
            fun platformFeeOverride(platformFeeOverride: PlatformFeeOverride) =
                platformFeeOverride(JsonField.of(platformFeeOverride))

            /**
             * Sets [Builder.platformFeeOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformFeeOverride] with a well-typed
             * [PlatformFeeOverride] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun platformFeeOverride(platformFeeOverride: JsonField<PlatformFeeOverride>) = apply {
                this.platformFeeOverride = platformFeeOverride
            }

            /**
             * The purpose of the payment. This may be required when sending to certain geographies
             * (e.g. India).
             *
             * Some destinations accept only certain purposes. A business payout to China must use
             * one of the purposes listed in
             * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents),
             * and each needs its own supporting documents.
             */
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

            /**
             * Free-form information about the payment that travels with it to the recipient. The
             * field this populates depends on the payment rail: for ACH it populates the Addenda
             * record, for FedNow and RTP it populates the remittanceInformation field, and for
             * wires it populates the OBI (Originator to Beneficiary Information) / beneficiary
             * information.
             */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /**
             * Sets [Builder.remittanceInformation] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remittanceInformation] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /**
             * Optional preferred factor for a Strong Customer Authentication challenge issued at
             * quote creation. Only relevant for a realtime-funding source in a region where SCA is
             * required (e.g. EU); ignored otherwise. Valid values are `SMS_OTP` (default) and
             * `PASSKEY` — `TOTP` cannot carry the required dynamic linking and is rejected. When
             * the quote is returned in `PENDING_AUTHORIZATION`, authorize it via `POST
             * /quotes/{quoteId}/authorize`.
             */
            fun scaFactor(scaFactor: ScaFactor) = scaFactor(JsonField.of(scaFactor))

            /**
             * Sets [Builder.scaFactor] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scaFactor] with a well-typed [ScaFactor] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scaFactor(scaFactor: JsonField<ScaFactor>) = apply { this.scaFactor = scaFactor }

            /**
             * Key-value pairs of additional information about the sender which was requested by the
             * destination. This is relevant when the destination requires more sender info than was
             * provided during customer creation. Any fields specified in `requiredPayerDataFields`
             * from the response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
             * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be
             * provided here if they were requested. If the destination did not request any
             * additional information, this field can be omitted.
             */
            fun senderCustomerInfo(senderCustomerInfo: SenderCustomerInfo) =
                senderCustomerInfo(JsonField.of(senderCustomerInfo))

            /**
             * Sets [Builder.senderCustomerInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderCustomerInfo] with a well-typed
             * [SenderCustomerInfo] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun senderCustomerInfo(senderCustomerInfo: JsonField<SenderCustomerInfo>) = apply {
                this.senderCustomerInfo = senderCustomerInfo
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
             * .destination()
             * .lockedCurrencyAmount()
             * .lockedCurrencySide()
             * .source()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("destination", destination),
                    checkRequired("lockedCurrencyAmount", lockedCurrencyAmount),
                    checkRequired("lockedCurrencySide", lockedCurrencySide),
                    checkRequired("source", source),
                    description,
                    (documentIds ?: JsonMissing.of()).map { it.toImmutable() },
                    immediatelyExecute,
                    lookupId,
                    platformFeeOverride,
                    purposeOfPayment,
                    remittanceInformation,
                    scaFactor,
                    senderCustomerInfo,
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
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            destination().validate()
            lockedCurrencyAmount()
            lockedCurrencySide().validate()
            source().validate()
            description()
            documentIds()
            immediatelyExecute()
            lookupId()
            platformFeeOverride()?.validate()
            purposeOfPayment()?.validate()
            remittanceInformation()
            scaFactor()?.validate()
            senderCustomerInfo()?.validate()
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
            (destination.asKnown()?.validity() ?: 0) +
                (if (lockedCurrencyAmount.asKnown() == null) 0 else 1) +
                (lockedCurrencySide.asKnown()?.validity() ?: 0) +
                (source.asKnown()?.validity() ?: 0) +
                (if (description.asKnown() == null) 0 else 1) +
                (documentIds.asKnown()?.size ?: 0) +
                (if (immediatelyExecute.asKnown() == null) 0 else 1) +
                (if (lookupId.asKnown() == null) 0 else 1) +
                (platformFeeOverride.asKnown()?.validity() ?: 0) +
                (purposeOfPayment.asKnown()?.validity() ?: 0) +
                (if (remittanceInformation.asKnown() == null) 0 else 1) +
                (scaFactor.asKnown()?.validity() ?: 0) +
                (senderCustomerInfo.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                destination == other.destination &&
                lockedCurrencyAmount == other.lockedCurrencyAmount &&
                lockedCurrencySide == other.lockedCurrencySide &&
                source == other.source &&
                description == other.description &&
                documentIds == other.documentIds &&
                immediatelyExecute == other.immediatelyExecute &&
                lookupId == other.lookupId &&
                platformFeeOverride == other.platformFeeOverride &&
                purposeOfPayment == other.purposeOfPayment &&
                remittanceInformation == other.remittanceInformation &&
                scaFactor == other.scaFactor &&
                senderCustomerInfo == other.senderCustomerInfo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                destination,
                lockedCurrencyAmount,
                lockedCurrencySide,
                source,
                description,
                documentIds,
                immediatelyExecute,
                lookupId,
                platformFeeOverride,
                purposeOfPayment,
                remittanceInformation,
                scaFactor,
                senderCustomerInfo,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{destination=$destination, lockedCurrencyAmount=$lockedCurrencyAmount, lockedCurrencySide=$lockedCurrencySide, source=$source, description=$description, documentIds=$documentIds, immediatelyExecute=$immediatelyExecute, lookupId=$lookupId, platformFeeOverride=$platformFeeOverride, purposeOfPayment=$purposeOfPayment, remittanceInformation=$remittanceInformation, scaFactor=$scaFactor, senderCustomerInfo=$senderCustomerInfo, additionalProperties=$additionalProperties}"
    }

    /**
     * The side of the quote which should be locked and specified in the `lockedCurrencyAmount`. For
     * example, if I want to send exactly $5 MXN from my wallet, I would set this to "sending", and
     * the `lockedCurrencyAmount` to 500 (in cents). If I want the receiver to receive exactly $10
     * USD, I would set this to "receiving" and the `lockedCurrencyAmount` to 10000 (in cents).
     */
    class LockedCurrencySide
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SENDING = of("SENDING")

            val RECEIVING = of("RECEIVING")

            fun of(value: String) = LockedCurrencySide(JsonField.of(value))
        }

        /** An enum containing [LockedCurrencySide]'s known values. */
        enum class Known {
            SENDING,
            RECEIVING,
        }

        /**
         * An enum containing [LockedCurrencySide]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LockedCurrencySide] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SENDING,
            RECEIVING,
            /**
             * An enum member indicating that [LockedCurrencySide] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SENDING -> Value.SENDING
                RECEIVING -> Value.RECEIVING
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                SENDING -> Known.SENDING
                RECEIVING -> Known.RECEIVING
                else ->
                    throw LightsparkGridInvalidDataException("Unknown LockedCurrencySide: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

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
        fun validate(): LockedCurrencySide = apply {
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

            return other is LockedCurrencySide && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Overrides the platform-collected fee for this transaction. When present, it replaces any
     * configured platform-collected fees that would otherwise apply to the transaction. Currently
     * only supported when the quote's source currency is USD; the fixed fee must be denominated in
     * the source currency.
     */
    class PlatformFeeOverride
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val platformFixedFee: JsonField<PlatformFixedFee>,
        private val platformVariableFeeBps: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("platformFixedFee")
            @ExcludeMissing
            platformFixedFee: JsonField<PlatformFixedFee> = JsonMissing.of(),
            @JsonProperty("platformVariableFeeBps")
            @ExcludeMissing
            platformVariableFeeBps: JsonField<Long> = JsonMissing.of(),
        ) : this(platformFixedFee, platformVariableFeeBps, mutableMapOf())

        /**
         * Fixed fee charged for this transaction. Must be denominated in the quote's source
         * currency (USD today).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platformFixedFee(): PlatformFixedFee = platformFixedFee.getRequired("platformFixedFee")

        /**
         * Variable fee in basis points (1 bps = 0.01%) to apply to the transaction's
         * source-currency amount.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun platformVariableFeeBps(): Long =
            platformVariableFeeBps.getRequired("platformVariableFeeBps")

        /**
         * Returns the raw JSON value of [platformFixedFee].
         *
         * Unlike [platformFixedFee], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("platformFixedFee")
        @ExcludeMissing
        fun _platformFixedFee(): JsonField<PlatformFixedFee> = platformFixedFee

        /**
         * Returns the raw JSON value of [platformVariableFeeBps].
         *
         * Unlike [platformVariableFeeBps], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("platformVariableFeeBps")
        @ExcludeMissing
        fun _platformVariableFeeBps(): JsonField<Long> = platformVariableFeeBps

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
             * Returns a mutable builder for constructing an instance of [PlatformFeeOverride].
             *
             * The following fields are required:
             * ```kotlin
             * .platformFixedFee()
             * .platformVariableFeeBps()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PlatformFeeOverride]. */
        class Builder internal constructor() {

            private var platformFixedFee: JsonField<PlatformFixedFee>? = null
            private var platformVariableFeeBps: JsonField<Long>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(platformFeeOverride: PlatformFeeOverride) = apply {
                platformFixedFee = platformFeeOverride.platformFixedFee
                platformVariableFeeBps = platformFeeOverride.platformVariableFeeBps
                additionalProperties = platformFeeOverride.additionalProperties.toMutableMap()
            }

            /**
             * Fixed fee charged for this transaction. Must be denominated in the quote's source
             * currency (USD today).
             */
            fun platformFixedFee(platformFixedFee: PlatformFixedFee) =
                platformFixedFee(JsonField.of(platformFixedFee))

            /**
             * Sets [Builder.platformFixedFee] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformFixedFee] with a well-typed
             * [PlatformFixedFee] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun platformFixedFee(platformFixedFee: JsonField<PlatformFixedFee>) = apply {
                this.platformFixedFee = platformFixedFee
            }

            /**
             * Variable fee in basis points (1 bps = 0.01%) to apply to the transaction's
             * source-currency amount.
             */
            fun platformVariableFeeBps(platformVariableFeeBps: Long) =
                platformVariableFeeBps(JsonField.of(platformVariableFeeBps))

            /**
             * Sets [Builder.platformVariableFeeBps] to an arbitrary JSON value.
             *
             * You should usually call [Builder.platformVariableFeeBps] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun platformVariableFeeBps(platformVariableFeeBps: JsonField<Long>) = apply {
                this.platformVariableFeeBps = platformVariableFeeBps
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
             * Returns an immutable instance of [PlatformFeeOverride].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .platformFixedFee()
             * .platformVariableFeeBps()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PlatformFeeOverride =
                PlatformFeeOverride(
                    checkRequired("platformFixedFee", platformFixedFee),
                    checkRequired("platformVariableFeeBps", platformVariableFeeBps),
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
        fun validate(): PlatformFeeOverride = apply {
            if (validated) {
                return@apply
            }

            platformFixedFee().validate()
            platformVariableFeeBps()
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
            (platformFixedFee.asKnown()?.validity() ?: 0) +
                (if (platformVariableFeeBps.asKnown() == null) 0 else 1)

        /**
         * Fixed fee charged for this transaction. Must be denominated in the quote's source
         * currency (USD today).
         */
        class PlatformFixedFee
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for USD).
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
             * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC" for
             * USDC, etc.)
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

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
                 * Returns a mutable builder for constructing an instance of [PlatformFixedFee].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .currency()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [PlatformFixedFee]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(platformFixedFee: PlatformFixedFee) = apply {
                    amount = platformFixedFee.amount
                    currency = platformFixedFee.currency
                    additionalProperties = platformFixedFee.additionalProperties.toMutableMap()
                }

                /**
                 * Fee amount in the smallest unit of the fixed fee's `currency` (e.g., cents for
                 * USD).
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * Three-letter currency code (ISO 4217) the fixed fee is denominated in. Some
                 * cryptocurrencies may use their own ticker symbols (e.g. "BTC" for Bitcoin, "USDC"
                 * for USDC, etc.)
                 */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

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
                 * Returns an immutable instance of [PlatformFixedFee].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .amount()
                 * .currency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PlatformFixedFee =
                    PlatformFixedFee(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
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
             * @throws LightsparkGridInvalidDataException if any value type in this object doesn't
             *   match its expected type.
             */
            fun validate(): PlatformFixedFee = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
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
                (if (amount.asKnown() == null) 0 else 1) +
                    (if (currency.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PlatformFixedFee &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PlatformFixedFee{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlatformFeeOverride &&
                platformFixedFee == other.platformFixedFee &&
                platformVariableFeeBps == other.platformVariableFeeBps &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(platformFixedFee, platformVariableFeeBps, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PlatformFeeOverride{platformFixedFee=$platformFixedFee, platformVariableFeeBps=$platformVariableFeeBps, additionalProperties=$additionalProperties}"
    }

    /**
     * The purpose of the payment. This may be required when sending to certain geographies (e.g.
     * India).
     *
     * Some destinations accept only certain purposes. A business payout to China must use one of
     * the purposes listed in
     * [Supporting Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents),
     * and each needs its own supporting documents.
     */
    class PurposeOfPayment @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val GIFT = of("GIFT")

            val SELF = of("SELF")

            val GOODS_OR_SERVICES = of("GOODS_OR_SERVICES")

            val EDUCATION = of("EDUCATION")

            val HEALTH_OR_MEDICAL = of("HEALTH_OR_MEDICAL")

            val REAL_ESTATE_PURCHASE = of("REAL_ESTATE_PURCHASE")

            val TAX_PAYMENT = of("TAX_PAYMENT")

            val LOAN_PAYMENT = of("LOAN_PAYMENT")

            val UTILITY_BILL = of("UTILITY_BILL")

            val DONATION = of("DONATION")

            val TRAVEL = of("TRAVEL")

            val FAMILY_SUPPORT = of("FAMILY_SUPPORT")

            val SALARY_PAYMENT = of("SALARY_PAYMENT")

            val EXPORTED_GOODS_PREPAYMENT = of("EXPORTED_GOODS_PREPAYMENT")

            val EXPORTED_GOODS_POSTPAYMENT = of("EXPORTED_GOODS_POSTPAYMENT")

            val SERVICE_CHARGES = of("SERVICE_CHARGES")

            val OFFICE_EXPENSES = of("OFFICE_EXPENSES")

            val DELIVERY_FEES = of("DELIVERY_FEES")

            val HOTEL_ACCOMMODATION = of("HOTEL_ACCOMMODATION")

            val COMMISSION_ON_GOODS = of("COMMISSION_ON_GOODS")

            val COMMISSION_ON_SERVICES = of("COMMISSION_ON_SERVICES")

            val ACCOUNTING_SERVICES = of("ACCOUNTING_SERVICES")

            val EXHIBITION_SERVICES = of("EXHIBITION_SERVICES")

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
            TAX_PAYMENT,
            LOAN_PAYMENT,
            UTILITY_BILL,
            DONATION,
            TRAVEL,
            FAMILY_SUPPORT,
            SALARY_PAYMENT,
            EXPORTED_GOODS_PREPAYMENT,
            EXPORTED_GOODS_POSTPAYMENT,
            SERVICE_CHARGES,
            OFFICE_EXPENSES,
            DELIVERY_FEES,
            HOTEL_ACCOMMODATION,
            COMMISSION_ON_GOODS,
            COMMISSION_ON_SERVICES,
            ACCOUNTING_SERVICES,
            EXHIBITION_SERVICES,
            OTHER,
        }

        /**
         * An enum containing [PurposeOfPayment]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PurposeOfPayment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GIFT,
            SELF,
            GOODS_OR_SERVICES,
            EDUCATION,
            HEALTH_OR_MEDICAL,
            REAL_ESTATE_PURCHASE,
            TAX_PAYMENT,
            LOAN_PAYMENT,
            UTILITY_BILL,
            DONATION,
            TRAVEL,
            FAMILY_SUPPORT,
            SALARY_PAYMENT,
            EXPORTED_GOODS_PREPAYMENT,
            EXPORTED_GOODS_POSTPAYMENT,
            SERVICE_CHARGES,
            OFFICE_EXPENSES,
            DELIVERY_FEES,
            HOTEL_ACCOMMODATION,
            COMMISSION_ON_GOODS,
            COMMISSION_ON_SERVICES,
            ACCOUNTING_SERVICES,
            EXHIBITION_SERVICES,
            OTHER,
            /**
             * An enum member indicating that [PurposeOfPayment] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GIFT -> Value.GIFT
                SELF -> Value.SELF
                GOODS_OR_SERVICES -> Value.GOODS_OR_SERVICES
                EDUCATION -> Value.EDUCATION
                HEALTH_OR_MEDICAL -> Value.HEALTH_OR_MEDICAL
                REAL_ESTATE_PURCHASE -> Value.REAL_ESTATE_PURCHASE
                TAX_PAYMENT -> Value.TAX_PAYMENT
                LOAN_PAYMENT -> Value.LOAN_PAYMENT
                UTILITY_BILL -> Value.UTILITY_BILL
                DONATION -> Value.DONATION
                TRAVEL -> Value.TRAVEL
                FAMILY_SUPPORT -> Value.FAMILY_SUPPORT
                SALARY_PAYMENT -> Value.SALARY_PAYMENT
                EXPORTED_GOODS_PREPAYMENT -> Value.EXPORTED_GOODS_PREPAYMENT
                EXPORTED_GOODS_POSTPAYMENT -> Value.EXPORTED_GOODS_POSTPAYMENT
                SERVICE_CHARGES -> Value.SERVICE_CHARGES
                OFFICE_EXPENSES -> Value.OFFICE_EXPENSES
                DELIVERY_FEES -> Value.DELIVERY_FEES
                HOTEL_ACCOMMODATION -> Value.HOTEL_ACCOMMODATION
                COMMISSION_ON_GOODS -> Value.COMMISSION_ON_GOODS
                COMMISSION_ON_SERVICES -> Value.COMMISSION_ON_SERVICES
                ACCOUNTING_SERVICES -> Value.ACCOUNTING_SERVICES
                EXHIBITION_SERVICES -> Value.EXHIBITION_SERVICES
                OTHER -> Value.OTHER
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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
                TAX_PAYMENT -> Known.TAX_PAYMENT
                LOAN_PAYMENT -> Known.LOAN_PAYMENT
                UTILITY_BILL -> Known.UTILITY_BILL
                DONATION -> Known.DONATION
                TRAVEL -> Known.TRAVEL
                FAMILY_SUPPORT -> Known.FAMILY_SUPPORT
                SALARY_PAYMENT -> Known.SALARY_PAYMENT
                EXPORTED_GOODS_PREPAYMENT -> Known.EXPORTED_GOODS_PREPAYMENT
                EXPORTED_GOODS_POSTPAYMENT -> Known.EXPORTED_GOODS_POSTPAYMENT
                SERVICE_CHARGES -> Known.SERVICE_CHARGES
                OFFICE_EXPENSES -> Known.OFFICE_EXPENSES
                DELIVERY_FEES -> Known.DELIVERY_FEES
                HOTEL_ACCOMMODATION -> Known.HOTEL_ACCOMMODATION
                COMMISSION_ON_GOODS -> Known.COMMISSION_ON_GOODS
                COMMISSION_ON_SERVICES -> Known.COMMISSION_ON_SERVICES
                ACCOUNTING_SERVICES -> Known.ACCOUNTING_SERVICES
                EXHIBITION_SERVICES -> Known.EXHIBITION_SERVICES
                OTHER -> Known.OTHER
                else -> throw LightsparkGridInvalidDataException("Unknown PurposeOfPayment: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

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

    /**
     * Optional preferred factor for a Strong Customer Authentication challenge issued at quote
     * creation. Only relevant for a realtime-funding source in a region where SCA is required (e.g.
     * EU); ignored otherwise. Valid values are `SMS_OTP` (default) and `PASSKEY` — `TOTP` cannot
     * carry the required dynamic linking and is rejected. When the quote is returned in
     * `PENDING_AUTHORIZATION`, authorize it via `POST /quotes/{quoteId}/authorize`.
     */
    class ScaFactor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val SMS_OTP = of("SMS_OTP")

            val TOTP = of("TOTP")

            val PASSKEY = of("PASSKEY")

            fun of(value: String) = ScaFactor(JsonField.of(value))
        }

        /** An enum containing [ScaFactor]'s known values. */
        enum class Known {
            SMS_OTP,
            TOTP,
            PASSKEY,
        }

        /**
         * An enum containing [ScaFactor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ScaFactor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SMS_OTP,
            TOTP,
            PASSKEY,
            /**
             * An enum member indicating that [ScaFactor] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                SMS_OTP -> Value.SMS_OTP
                TOTP -> Value.TOTP
                PASSKEY -> Value.PASSKEY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value is a not a
         *   known member.
         */
        fun known(): Known =
            when (this) {
                SMS_OTP -> Known.SMS_OTP
                TOTP -> Known.TOTP
                PASSKEY -> Known.PASSKEY
                else -> throw LightsparkGridInvalidDataException("Unknown ScaFactor: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LightsparkGridInvalidDataException if this class instance's value does not have
         *   the expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw LightsparkGridInvalidDataException("Value is not a String")

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
        fun validate(): ScaFactor = apply {
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

            return other is ScaFactor && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Key-value pairs of additional information about the sender which was requested by the
     * destination. This is relevant when the destination requires more sender info than was
     * provided during customer creation. Any fields specified in `requiredPayerDataFields` from the
     * response of the `/receiver/uma/{receiverUmaAddress}` (lookupUma) or
     * `/receiver/external-account/{accountId}` (lookupExternalAccount) endpoints MUST be provided
     * here if they were requested. If the destination did not request any additional information,
     * this field can be omitted.
     */
    class SenderCustomerInfo
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [SenderCustomerInfo]. */
            fun builder() = Builder()
        }

        /** A builder for [SenderCustomerInfo]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(senderCustomerInfo: SenderCustomerInfo) = apply {
                additionalProperties = senderCustomerInfo.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [SenderCustomerInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SenderCustomerInfo = SenderCustomerInfo(additionalProperties.toImmutable())
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
        fun validate(): SenderCustomerInfo = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SenderCustomerInfo && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "SenderCustomerInfo{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is QuoteCreateParams &&
            idempotencyKey == other.idempotencyKey &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "QuoteCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
