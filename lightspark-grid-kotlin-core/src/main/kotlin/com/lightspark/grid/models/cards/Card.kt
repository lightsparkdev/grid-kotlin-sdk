// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkKnown
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class Card
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val cardholderId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val form: JsonField<CardForm>,
    private val fundingSources: JsonField<List<String>>,
    private val state: JsonField<CardState>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val brand: JsonField<CardBrand>,
    private val currency: JsonField<String>,
    private val expMonth: JsonField<Long>,
    private val expYear: JsonField<Long>,
    private val issuerRef: JsonField<String>,
    private val last4: JsonField<String>,
    private val panEmbedUrl: JsonField<String>,
    private val platformCardId: JsonField<String>,
    private val stateReason: JsonField<CardStateReason>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholderId")
        @ExcludeMissing
        cardholderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("form") @ExcludeMissing form: JsonField<CardForm> = JsonMissing.of(),
        @JsonProperty("fundingSources")
        @ExcludeMissing
        fundingSources: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<CardState> = JsonMissing.of(),
        @JsonProperty("updatedAt")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("brand") @ExcludeMissing brand: JsonField<CardBrand> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expMonth") @ExcludeMissing expMonth: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("expYear") @ExcludeMissing expYear: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("issuerRef") @ExcludeMissing issuerRef: JsonField<String> = JsonMissing.of(),
        @JsonProperty("last4") @ExcludeMissing last4: JsonField<String> = JsonMissing.of(),
        @JsonProperty("panEmbedUrl")
        @ExcludeMissing
        panEmbedUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("platformCardId")
        @ExcludeMissing
        platformCardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("stateReason")
        @ExcludeMissing
        stateReason: JsonField<CardStateReason> = JsonMissing.of(),
    ) : this(
        id,
        cardholderId,
        createdAt,
        form,
        fundingSources,
        state,
        updatedAt,
        brand,
        currency,
        expMonth,
        expYear,
        issuerRef,
        last4,
        panEmbedUrl,
        platformCardId,
        stateReason,
        mutableMapOf(),
    )

    /**
     * System-generated unique card identifier
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The id of the `Customer` who holds this card.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholderId(): String = cardholderId.getRequired("cardholderId")

    /**
     * Creation timestamp
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be added
     * in a later release.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun form(): CardForm = form.getRequired("form")

    /**
     * Internal account ids bound to this card as funding sources, in priority order — the first
     * entry is tried first by Authorization Decisioning. Every card has at least one funding
     * source.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fundingSources(): List<String> = fundingSources.getRequired("fundingSources")

    /**
     * Lifecycle state of a card.
     *
     * |State          |Description                                                                                                                                                  |
     * |---------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
     * |`PENDING_KYC`  |The cardholder has not yet completed KYC. Cards in this state cannot transact.                                                                               |
     * |`PENDING_ISSUE`|The card has been requested and is being provisioned with the issuer.                                                                                        |
     * |`ACTIVE`       |The card is live and can authorize transactions.                                                                                                             |
     * |`FROZEN`       |The card is temporarily disabled by the platform. New authorizations are declined with `CARD_PAUSED`. Existing settlements and refunds continue to reconcile.|
     * |`CLOSED`       |The card is permanently closed. Terminal, irreversible state.                                                                                                |
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): CardState = state.getRequired("state")

    /**
     * Last update timestamp
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updatedAt")

    /**
     * Card network brand. Read-only — determined by Grid when the card is provisioned with the
     * issuer.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun brand(): CardBrand? = brand.getNullable("brand")

    /**
     * Currency the card transacts in (ISO 4217 for fiat, tickers for crypto). Derived from the
     * funding sources at issue time — all funding sources bound to a card must be denominated in
     * the same card-eligible currency.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun currency(): String? = currency.getNullable("currency")

    /**
     * Card expiration month (1–12).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expMonth(): Long? = expMonth.getNullable("expMonth")

    /**
     * Card expiration year (four digits).
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun expYear(): Long? = expYear.getNullable("expYear")

    /**
     * Opaque identifier for the card on the underlying issuer. Useful for cross-referencing in
     * issuer dashboards; not used for any Grid request routing.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun issuerRef(): String? = issuerRef.getNullable("issuerRef")

    /**
     * Last four digits of the card PAN.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun last4(): String? = last4.getNullable("last4")

    /**
     * URL of the card issuer's iframe that securely displays the PAN, CVV, and expiry to the
     * cardholder. The full PAN and CVV never cross Grid's servers — render this URL in an iframe in
     * your client to reveal card details.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun panEmbedUrl(): String? = panEmbedUrl.getNullable("panEmbedUrl")

    /**
     * Platform-specific card identifier. Optional on create — system-generated if omitted,
     * mirroring `platformCustomerId` semantics.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformCardId(): String? = platformCardId.getNullable("platformCardId")

    /**
     * Reason associated with the current `state`. Populated when the card is `CLOSED` or when
     * provisioning was rejected; otherwise null.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun stateReason(): CardStateReason? = stateReason.getNullable("stateReason")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cardholderId].
     *
     * Unlike [cardholderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardholderId")
    @ExcludeMissing
    fun _cardholderId(): JsonField<String> = cardholderId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [form].
     *
     * Unlike [form], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("form") @ExcludeMissing fun _form(): JsonField<CardForm> = form

    /**
     * Returns the raw JSON value of [fundingSources].
     *
     * Unlike [fundingSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fundingSources")
    @ExcludeMissing
    fun _fundingSources(): JsonField<List<String>> = fundingSources

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<CardState> = state

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updatedAt")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [brand].
     *
     * Unlike [brand], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<CardBrand> = brand

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

    /**
     * Returns the raw JSON value of [expMonth].
     *
     * Unlike [expMonth], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expMonth") @ExcludeMissing fun _expMonth(): JsonField<Long> = expMonth

    /**
     * Returns the raw JSON value of [expYear].
     *
     * Unlike [expYear], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expYear") @ExcludeMissing fun _expYear(): JsonField<Long> = expYear

    /**
     * Returns the raw JSON value of [issuerRef].
     *
     * Unlike [issuerRef], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issuerRef") @ExcludeMissing fun _issuerRef(): JsonField<String> = issuerRef

    /**
     * Returns the raw JSON value of [last4].
     *
     * Unlike [last4], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("last4") @ExcludeMissing fun _last4(): JsonField<String> = last4

    /**
     * Returns the raw JSON value of [panEmbedUrl].
     *
     * Unlike [panEmbedUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("panEmbedUrl") @ExcludeMissing fun _panEmbedUrl(): JsonField<String> = panEmbedUrl

    /**
     * Returns the raw JSON value of [platformCardId].
     *
     * Unlike [platformCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platformCardId")
    @ExcludeMissing
    fun _platformCardId(): JsonField<String> = platformCardId

    /**
     * Returns the raw JSON value of [stateReason].
     *
     * Unlike [stateReason], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("stateReason")
    @ExcludeMissing
    fun _stateReason(): JsonField<CardStateReason> = stateReason

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
         * Returns a mutable builder for constructing an instance of [Card].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .cardholderId()
         * .createdAt()
         * .form()
         * .fundingSources()
         * .state()
         * .updatedAt()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [Card]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardholderId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var form: JsonField<CardForm>? = null
        private var fundingSources: JsonField<MutableList<String>>? = null
        private var state: JsonField<CardState>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var brand: JsonField<CardBrand> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var expMonth: JsonField<Long> = JsonMissing.of()
        private var expYear: JsonField<Long> = JsonMissing.of()
        private var issuerRef: JsonField<String> = JsonMissing.of()
        private var last4: JsonField<String> = JsonMissing.of()
        private var panEmbedUrl: JsonField<String> = JsonMissing.of()
        private var platformCardId: JsonField<String> = JsonMissing.of()
        private var stateReason: JsonField<CardStateReason> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(card: Card) = apply {
            id = card.id
            cardholderId = card.cardholderId
            createdAt = card.createdAt
            form = card.form
            fundingSources = card.fundingSources.map { it.toMutableList() }
            state = card.state
            updatedAt = card.updatedAt
            brand = card.brand
            currency = card.currency
            expMonth = card.expMonth
            expYear = card.expYear
            issuerRef = card.issuerRef
            last4 = card.last4
            panEmbedUrl = card.panEmbedUrl
            platformCardId = card.platformCardId
            stateReason = card.stateReason
            additionalProperties = card.additionalProperties.toMutableMap()
        }

        /** System-generated unique card identifier */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The id of the `Customer` who holds this card. */
        fun cardholderId(cardholderId: String) = cardholderId(JsonField.of(cardholderId))

        /**
         * Sets [Builder.cardholderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardholderId(cardholderId: JsonField<String>) = apply {
            this.cardholderId = cardholderId
        }

        /** Creation timestamp */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be
         * added in a later release.
         */
        fun form(form: CardForm) = form(JsonField.of(form))

        /**
         * Sets [Builder.form] to an arbitrary JSON value.
         *
         * You should usually call [Builder.form] with a well-typed [CardForm] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun form(form: JsonField<CardForm>) = apply { this.form = form }

        /**
         * Internal account ids bound to this card as funding sources, in priority order — the first
         * entry is tried first by Authorization Decisioning. Every card has at least one funding
         * source.
         */
        fun fundingSources(fundingSources: List<String>) =
            fundingSources(JsonField.of(fundingSources))

        /**
         * Sets [Builder.fundingSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingSources] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fundingSources(fundingSources: JsonField<List<String>>) = apply {
            this.fundingSources = fundingSources.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [fundingSources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFundingSource(fundingSource: String) = apply {
            fundingSources =
                (fundingSources ?: JsonField.of(mutableListOf())).also {
                    checkKnown("fundingSources", it).add(fundingSource)
                }
        }

        /**
         * Lifecycle state of a card.
         *
         * |State          |Description                                                                                                                                                  |
         * |---------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------|
         * |`PENDING_KYC`  |The cardholder has not yet completed KYC. Cards in this state cannot transact.                                                                               |
         * |`PENDING_ISSUE`|The card has been requested and is being provisioned with the issuer.                                                                                        |
         * |`ACTIVE`       |The card is live and can authorize transactions.                                                                                                             |
         * |`FROZEN`       |The card is temporarily disabled by the platform. New authorizations are declined with `CARD_PAUSED`. Existing settlements and refunds continue to reconcile.|
         * |`CLOSED`       |The card is permanently closed. Terminal, irreversible state.                                                                                                |
         */
        fun state(state: CardState) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [CardState] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<CardState>) = apply { this.state = state }

        /** Last update timestamp */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * Card network brand. Read-only — determined by Grid when the card is provisioned with the
         * issuer.
         */
        fun brand(brand: CardBrand) = brand(JsonField.of(brand))

        /**
         * Sets [Builder.brand] to an arbitrary JSON value.
         *
         * You should usually call [Builder.brand] with a well-typed [CardBrand] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun brand(brand: JsonField<CardBrand>) = apply { this.brand = brand }

        /**
         * Currency the card transacts in (ISO 4217 for fiat, tickers for crypto). Derived from the
         * funding sources at issue time — all funding sources bound to a card must be denominated
         * in the same card-eligible currency.
         */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        /** Card expiration month (1–12). */
        fun expMonth(expMonth: Long) = expMonth(JsonField.of(expMonth))

        /**
         * Sets [Builder.expMonth] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expMonth] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expMonth(expMonth: JsonField<Long>) = apply { this.expMonth = expMonth }

        /** Card expiration year (four digits). */
        fun expYear(expYear: Long) = expYear(JsonField.of(expYear))

        /**
         * Sets [Builder.expYear] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expYear] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expYear(expYear: JsonField<Long>) = apply { this.expYear = expYear }

        /**
         * Opaque identifier for the card on the underlying issuer. Useful for cross-referencing in
         * issuer dashboards; not used for any Grid request routing.
         */
        fun issuerRef(issuerRef: String) = issuerRef(JsonField.of(issuerRef))

        /**
         * Sets [Builder.issuerRef] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuerRef] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun issuerRef(issuerRef: JsonField<String>) = apply { this.issuerRef = issuerRef }

        /** Last four digits of the card PAN. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /**
         * Sets [Builder.last4] to an arbitrary JSON value.
         *
         * You should usually call [Builder.last4] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

        /**
         * URL of the card issuer's iframe that securely displays the PAN, CVV, and expiry to the
         * cardholder. The full PAN and CVV never cross Grid's servers — render this URL in an
         * iframe in your client to reveal card details.
         */
        fun panEmbedUrl(panEmbedUrl: String) = panEmbedUrl(JsonField.of(panEmbedUrl))

        /**
         * Sets [Builder.panEmbedUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.panEmbedUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun panEmbedUrl(panEmbedUrl: JsonField<String>) = apply { this.panEmbedUrl = panEmbedUrl }

        /**
         * Platform-specific card identifier. Optional on create — system-generated if omitted,
         * mirroring `platformCustomerId` semantics.
         */
        fun platformCardId(platformCardId: String) = platformCardId(JsonField.of(platformCardId))

        /**
         * Sets [Builder.platformCardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.platformCardId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun platformCardId(platformCardId: JsonField<String>) = apply {
            this.platformCardId = platformCardId
        }

        /**
         * Reason associated with the current `state`. Populated when the card is `CLOSED` or when
         * provisioning was rejected; otherwise null.
         */
        fun stateReason(stateReason: CardStateReason?) =
            stateReason(JsonField.ofNullable(stateReason))

        /**
         * Sets [Builder.stateReason] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stateReason] with a well-typed [CardStateReason] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun stateReason(stateReason: JsonField<CardStateReason>) = apply {
            this.stateReason = stateReason
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
         * Returns an immutable instance of [Card].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .cardholderId()
         * .createdAt()
         * .form()
         * .fundingSources()
         * .state()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Card =
            Card(
                checkRequired("id", id),
                checkRequired("cardholderId", cardholderId),
                checkRequired("createdAt", createdAt),
                checkRequired("form", form),
                checkRequired("fundingSources", fundingSources).map { it.toImmutable() },
                checkRequired("state", state),
                checkRequired("updatedAt", updatedAt),
                brand,
                currency,
                expMonth,
                expYear,
                issuerRef,
                last4,
                panEmbedUrl,
                platformCardId,
                stateReason,
                additionalProperties.toMutableMap(),
            )
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
    fun validate(): Card = apply {
        if (validated) {
            return@apply
        }

        id()
        cardholderId()
        createdAt()
        form().validate()
        fundingSources()
        state().validate()
        updatedAt()
        brand()?.validate()
        currency()
        expMonth()
        expYear()
        issuerRef()
        last4()
        panEmbedUrl()
        platformCardId()
        stateReason()?.validate()
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
        (if (id.asKnown() == null) 0 else 1) +
            (if (cardholderId.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (form.asKnown()?.validity() ?: 0) +
            (fundingSources.asKnown()?.size ?: 0) +
            (state.asKnown()?.validity() ?: 0) +
            (if (updatedAt.asKnown() == null) 0 else 1) +
            (brand.asKnown()?.validity() ?: 0) +
            (if (currency.asKnown() == null) 0 else 1) +
            (if (expMonth.asKnown() == null) 0 else 1) +
            (if (expYear.asKnown() == null) 0 else 1) +
            (if (issuerRef.asKnown() == null) 0 else 1) +
            (if (last4.asKnown() == null) 0 else 1) +
            (if (panEmbedUrl.asKnown() == null) 0 else 1) +
            (if (platformCardId.asKnown() == null) 0 else 1) +
            (stateReason.asKnown()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Card &&
            id == other.id &&
            cardholderId == other.cardholderId &&
            createdAt == other.createdAt &&
            form == other.form &&
            fundingSources == other.fundingSources &&
            state == other.state &&
            updatedAt == other.updatedAt &&
            brand == other.brand &&
            currency == other.currency &&
            expMonth == other.expMonth &&
            expYear == other.expYear &&
            issuerRef == other.issuerRef &&
            last4 == other.last4 &&
            panEmbedUrl == other.panEmbedUrl &&
            platformCardId == other.platformCardId &&
            stateReason == other.stateReason &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            cardholderId,
            createdAt,
            form,
            fundingSources,
            state,
            updatedAt,
            brand,
            currency,
            expMonth,
            expYear,
            issuerRef,
            last4,
            panEmbedUrl,
            platformCardId,
            stateReason,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Card{id=$id, cardholderId=$cardholderId, createdAt=$createdAt, form=$form, fundingSources=$fundingSources, state=$state, updatedAt=$updatedAt, brand=$brand, currency=$currency, expMonth=$expMonth, expYear=$expYear, issuerRef=$issuerRef, last4=$last4, panEmbedUrl=$panEmbedUrl, platformCardId=$platformCardId, stateReason=$stateReason, additionalProperties=$additionalProperties}"
}
