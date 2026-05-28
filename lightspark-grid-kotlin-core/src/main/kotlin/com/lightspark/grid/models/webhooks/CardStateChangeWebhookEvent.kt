// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.Enum
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

class CardStateChangeWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val data: JsonField<Data>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(id, data, timestamp, type, mutableMapOf())

    /**
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): Data = data.getRequired("data")

    /**
     * ISO 8601 timestamp of when the webhook was sent
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [timestamp].
     *
     * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [CardStateChangeWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardStateChangeWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardStateChangeWebhookEvent: CardStateChangeWebhookEvent) = apply {
            id = cardStateChangeWebhookEvent.id
            data = cardStateChangeWebhookEvent.data
            timestamp = cardStateChangeWebhookEvent.timestamp
            type = cardStateChangeWebhookEvent.type
            additionalProperties = cardStateChangeWebhookEvent.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this webhook delivery (can be used for idempotency) */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        /** ISO 8601 timestamp of when the webhook was sent */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

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
         * Returns an immutable instance of [CardStateChangeWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .data()
         * .timestamp()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardStateChangeWebhookEvent =
            CardStateChangeWebhookEvent(
                checkRequired("id", id),
                checkRequired("data", data),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
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
    fun validate(): CardStateChangeWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        id()
        data().validate()
        timestamp()
        type().validate()
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
            (data.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val cardholderId: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val form: JsonField<Form>,
        private val fundingSources: JsonField<List<String>>,
        private val state: JsonField<State>,
        private val updatedAt: JsonField<OffsetDateTime>,
        private val brand: JsonField<Brand>,
        private val currency: JsonField<String>,
        private val expMonth: JsonField<Long>,
        private val expYear: JsonField<Long>,
        private val issuerRef: JsonField<String>,
        private val last4: JsonField<String>,
        private val panEmbedUrl: JsonField<String>,
        private val platformCardId: JsonField<String>,
        private val stateReason: JsonField<StateReason>,
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
            @JsonProperty("form") @ExcludeMissing form: JsonField<Form> = JsonMissing.of(),
            @JsonProperty("fundingSources")
            @ExcludeMissing
            fundingSources: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
            @JsonProperty("updatedAt")
            @ExcludeMissing
            updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("brand") @ExcludeMissing brand: JsonField<Brand> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            currency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expMonth") @ExcludeMissing expMonth: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("expYear") @ExcludeMissing expYear: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("issuerRef")
            @ExcludeMissing
            issuerRef: JsonField<String> = JsonMissing.of(),
            @JsonProperty("last4") @ExcludeMissing last4: JsonField<String> = JsonMissing.of(),
            @JsonProperty("panEmbedUrl")
            @ExcludeMissing
            panEmbedUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("platformCardId")
            @ExcludeMissing
            platformCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stateReason")
            @ExcludeMissing
            stateReason: JsonField<StateReason> = JsonMissing.of(),
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
         * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be
         * added in a later release.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun form(): Form = form.getRequired("form")

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
        fun state(): State = state.getRequired("state")

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
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun brand(): Brand? = brand.getNullable("brand")

        /**
         * Currency the card transacts in (ISO 4217 for fiat, tickers for crypto). Derived from the
         * funding sources at issue time — all funding sources bound to a card must be denominated
         * in the same card-eligible currency.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun currency(): String? = currency.getNullable("currency")

        /**
         * Card expiration month (1–12).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expMonth(): Long? = expMonth.getNullable("expMonth")

        /**
         * Card expiration year (four digits).
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun expYear(): Long? = expYear.getNullable("expYear")

        /**
         * Opaque identifier for the card on the underlying issuer. Useful for cross-referencing in
         * issuer dashboards; not used for any Grid request routing.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun issuerRef(): String? = issuerRef.getNullable("issuerRef")

        /**
         * Last four digits of the card PAN.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun last4(): String? = last4.getNullable("last4")

        /**
         * URL of the card issuer's iframe that securely displays the PAN, CVV, and expiry to the
         * cardholder. The full PAN and CVV never cross Grid's servers — render this URL in an
         * iframe in your client to reveal card details.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun panEmbedUrl(): String? = panEmbedUrl.getNullable("panEmbedUrl")

        /**
         * Platform-specific card identifier. Optional on create — system-generated if omitted,
         * mirroring `platformCustomerId` semantics.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun platformCardId(): String? = platformCardId.getNullable("platformCardId")

        /**
         * Reason a card reached a terminal or non-active state. Present on `CLOSED` cards, and on
         * cards that fail provisioning before reaching `ACTIVE`.
         *
         * |Reason              |Description                                                                   |
         * |--------------------|------------------------------------------------------------------------------|
         * |`ISSUER_REJECTED`   |The card issuer rejected provisioning during `PENDING_ISSUE`.                 |
         * |`CLOSED_BY_PLATFORM`|The card was closed via `PATCH /cards/{id}` (`state: CLOSED`) by the platform.|
         * |`CLOSED_BY_GRID`    |The card was closed by Grid (e.g. compliance or risk action).                 |
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun stateReason(): StateReason? = stateReason.getNullable("stateReason")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [cardholderId].
         *
         * Unlike [cardholderId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        @JsonProperty("form") @ExcludeMissing fun _form(): JsonField<Form> = form

        /**
         * Returns the raw JSON value of [fundingSources].
         *
         * Unlike [fundingSources], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("fundingSources")
        @ExcludeMissing
        fun _fundingSources(): JsonField<List<String>> = fundingSources

        /**
         * Returns the raw JSON value of [state].
         *
         * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

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
        @JsonProperty("brand") @ExcludeMissing fun _brand(): JsonField<Brand> = brand

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
        @JsonProperty("panEmbedUrl")
        @ExcludeMissing
        fun _panEmbedUrl(): JsonField<String> = panEmbedUrl

        /**
         * Returns the raw JSON value of [platformCardId].
         *
         * Unlike [platformCardId], this method doesn't throw if the JSON field has an unexpected
         * type.
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
        fun _stateReason(): JsonField<StateReason> = stateReason

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
             * Returns a mutable builder for constructing an instance of [Data].
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

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var cardholderId: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var form: JsonField<Form>? = null
            private var fundingSources: JsonField<MutableList<String>>? = null
            private var state: JsonField<State>? = null
            private var updatedAt: JsonField<OffsetDateTime>? = null
            private var brand: JsonField<Brand> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var expMonth: JsonField<Long> = JsonMissing.of()
            private var expYear: JsonField<Long> = JsonMissing.of()
            private var issuerRef: JsonField<String> = JsonMissing.of()
            private var last4: JsonField<String> = JsonMissing.of()
            private var panEmbedUrl: JsonField<String> = JsonMissing.of()
            private var platformCardId: JsonField<String> = JsonMissing.of()
            private var stateReason: JsonField<StateReason> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(data: Data) = apply {
                id = data.id
                cardholderId = data.cardholderId
                createdAt = data.createdAt
                form = data.form
                fundingSources = data.fundingSources.map { it.toMutableList() }
                state = data.state
                updatedAt = data.updatedAt
                brand = data.brand
                currency = data.currency
                expMonth = data.expMonth
                expYear = data.expYear
                issuerRef = data.issuerRef
                last4 = data.last4
                panEmbedUrl = data.panEmbedUrl
                platformCardId = data.platformCardId
                stateReason = data.stateReason
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            /** System-generated unique card identifier */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The id of the `Customer` who holds this card. */
            fun cardholderId(cardholderId: String) = cardholderId(JsonField.of(cardholderId))

            /**
             * Sets [Builder.cardholderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholderId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /**
             * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will
             * be added in a later release.
             */
            fun form(form: Form) = form(JsonField.of(form))

            /**
             * Sets [Builder.form] to an arbitrary JSON value.
             *
             * You should usually call [Builder.form] with a well-typed [Form] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun form(form: JsonField<Form>) = apply { this.form = form }

            /**
             * Internal account ids bound to this card as funding sources, in priority order — the
             * first entry is tried first by Authorization Decisioning. Every card has at least one
             * funding source.
             */
            fun fundingSources(fundingSources: List<String>) =
                fundingSources(JsonField.of(fundingSources))

            /**
             * Sets [Builder.fundingSources] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fundingSources] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
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
            fun state(state: State) = state(JsonField.of(state))

            /**
             * Sets [Builder.state] to an arbitrary JSON value.
             *
             * You should usually call [Builder.state] with a well-typed [State] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun state(state: JsonField<State>) = apply { this.state = state }

            /** Last update timestamp */
            fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

            /**
             * Sets [Builder.updatedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply {
                this.updatedAt = updatedAt
            }

            /**
             * Card network brand. Read-only — determined by Grid when the card is provisioned with
             * the issuer.
             */
            fun brand(brand: Brand) = brand(JsonField.of(brand))

            /**
             * Sets [Builder.brand] to an arbitrary JSON value.
             *
             * You should usually call [Builder.brand] with a well-typed [Brand] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun brand(brand: JsonField<Brand>) = apply { this.brand = brand }

            /**
             * Currency the card transacts in (ISO 4217 for fiat, tickers for crypto). Derived from
             * the funding sources at issue time — all funding sources bound to a card must be
             * denominated in the same card-eligible currency.
             */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /**
             * Sets [Builder.currency] to an arbitrary JSON value.
             *
             * You should usually call [Builder.currency] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Card expiration month (1–12). */
            fun expMonth(expMonth: Long) = expMonth(JsonField.of(expMonth))

            /**
             * Sets [Builder.expMonth] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expMonth] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expMonth(expMonth: JsonField<Long>) = apply { this.expMonth = expMonth }

            /** Card expiration year (four digits). */
            fun expYear(expYear: Long) = expYear(JsonField.of(expYear))

            /**
             * Sets [Builder.expYear] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expYear] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expYear(expYear: JsonField<Long>) = apply { this.expYear = expYear }

            /**
             * Opaque identifier for the card on the underlying issuer. Useful for cross-referencing
             * in issuer dashboards; not used for any Grid request routing.
             */
            fun issuerRef(issuerRef: String) = issuerRef(JsonField.of(issuerRef))

            /**
             * Sets [Builder.issuerRef] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuerRef] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun issuerRef(issuerRef: JsonField<String>) = apply { this.issuerRef = issuerRef }

            /** Last four digits of the card PAN. */
            fun last4(last4: String) = last4(JsonField.of(last4))

            /**
             * Sets [Builder.last4] to an arbitrary JSON value.
             *
             * You should usually call [Builder.last4] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

            /**
             * URL of the card issuer's iframe that securely displays the PAN, CVV, and expiry to
             * the cardholder. The full PAN and CVV never cross Grid's servers — render this URL in
             * an iframe in your client to reveal card details.
             */
            fun panEmbedUrl(panEmbedUrl: String) = panEmbedUrl(JsonField.of(panEmbedUrl))

            /**
             * Sets [Builder.panEmbedUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.panEmbedUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun panEmbedUrl(panEmbedUrl: JsonField<String>) = apply {
                this.panEmbedUrl = panEmbedUrl
            }

            /**
             * Platform-specific card identifier. Optional on create — system-generated if omitted,
             * mirroring `platformCustomerId` semantics.
             */
            fun platformCardId(platformCardId: String) =
                platformCardId(JsonField.of(platformCardId))

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
             * Reason a card reached a terminal or non-active state. Present on `CLOSED` cards, and
             * on cards that fail provisioning before reaching `ACTIVE`.
             *
             * |Reason              |Description                                                                   |
             * |--------------------|------------------------------------------------------------------------------|
             * |`ISSUER_REJECTED`   |The card issuer rejected provisioning during `PENDING_ISSUE`.                 |
             * |`CLOSED_BY_PLATFORM`|The card was closed via `PATCH /cards/{id}` (`state: CLOSED`) by the platform.|
             * |`CLOSED_BY_GRID`    |The card was closed by Grid (e.g. compliance or risk action).                 |
             */
            fun stateReason(stateReason: StateReason?) =
                stateReason(JsonField.ofNullable(stateReason))

            /**
             * Sets [Builder.stateReason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stateReason] with a well-typed [StateReason] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stateReason(stateReason: JsonField<StateReason>) = apply {
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
             * Returns an immutable instance of [Data].
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
            fun build(): Data =
                Data(
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
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws LightsparkGridInvalidDataException if any value type in this object doesn't match
         *   its expected type.
         */
        fun validate(): Data = apply {
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
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

        /**
         * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be
         * added in a later release.
         */
        class Form @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val VIRTUAL = of("VIRTUAL")

                fun of(value: String) = Form(JsonField.of(value))
            }

            /** An enum containing [Form]'s known values. */
            enum class Known {
                VIRTUAL
            }

            /**
             * An enum containing [Form]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Form] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VIRTUAL,
                /** An enum member indicating that [Form] was instantiated with an unknown value. */
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
                    VIRTUAL -> Value.VIRTUAL
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
                    VIRTUAL -> Known.VIRTUAL
                    else -> throw LightsparkGridInvalidDataException("Unknown Form: $value")
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
            fun validate(): Form = apply {
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

                return other is Form && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
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
        class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val PENDING_KYC = of("PENDING_KYC")

                val PENDING_ISSUE = of("PENDING_ISSUE")

                val ACTIVE = of("ACTIVE")

                val FROZEN = of("FROZEN")

                val CLOSED = of("CLOSED")

                fun of(value: String) = State(JsonField.of(value))
            }

            /** An enum containing [State]'s known values. */
            enum class Known {
                PENDING_KYC,
                PENDING_ISSUE,
                ACTIVE,
                FROZEN,
                CLOSED,
            }

            /**
             * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [State] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING_KYC,
                PENDING_ISSUE,
                ACTIVE,
                FROZEN,
                CLOSED,
                /**
                 * An enum member indicating that [State] was instantiated with an unknown value.
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
                    PENDING_KYC -> Value.PENDING_KYC
                    PENDING_ISSUE -> Value.PENDING_ISSUE
                    ACTIVE -> Value.ACTIVE
                    FROZEN -> Value.FROZEN
                    CLOSED -> Value.CLOSED
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
                    PENDING_KYC -> Known.PENDING_KYC
                    PENDING_ISSUE -> Known.PENDING_ISSUE
                    ACTIVE -> Known.ACTIVE
                    FROZEN -> Known.FROZEN
                    CLOSED -> Known.CLOSED
                    else -> throw LightsparkGridInvalidDataException("Unknown State: $value")
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
            fun validate(): State = apply {
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

                return other is State && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Card network brand. Read-only — determined by Grid when the card is provisioned with the
         * issuer.
         */
        class Brand @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val VISA = of("VISA")

                val MASTERCARD = of("MASTERCARD")

                fun of(value: String) = Brand(JsonField.of(value))
            }

            /** An enum containing [Brand]'s known values. */
            enum class Known {
                VISA,
                MASTERCARD,
            }

            /**
             * An enum containing [Brand]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Brand] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VISA,
                MASTERCARD,
                /**
                 * An enum member indicating that [Brand] was instantiated with an unknown value.
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
                    VISA -> Value.VISA
                    MASTERCARD -> Value.MASTERCARD
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
                    VISA -> Known.VISA
                    MASTERCARD -> Known.MASTERCARD
                    else -> throw LightsparkGridInvalidDataException("Unknown Brand: $value")
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
            fun validate(): Brand = apply {
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

                return other is Brand && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Reason a card reached a terminal or non-active state. Present on `CLOSED` cards, and on
         * cards that fail provisioning before reaching `ACTIVE`.
         *
         * |Reason              |Description                                                                   |
         * |--------------------|------------------------------------------------------------------------------|
         * |`ISSUER_REJECTED`   |The card issuer rejected provisioning during `PENDING_ISSUE`.                 |
         * |`CLOSED_BY_PLATFORM`|The card was closed via `PATCH /cards/{id}` (`state: CLOSED`) by the platform.|
         * |`CLOSED_BY_GRID`    |The card was closed by Grid (e.g. compliance or risk action).                 |
         */
        class StateReason @JsonCreator private constructor(private val value: JsonField<String>) :
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

                val ISSUER_REJECTED = of("ISSUER_REJECTED")

                val CLOSED_BY_PLATFORM = of("CLOSED_BY_PLATFORM")

                val CLOSED_BY_GRID = of("CLOSED_BY_GRID")

                fun of(value: String) = StateReason(JsonField.of(value))
            }

            /** An enum containing [StateReason]'s known values. */
            enum class Known {
                ISSUER_REJECTED,
                CLOSED_BY_PLATFORM,
                CLOSED_BY_GRID,
            }

            /**
             * An enum containing [StateReason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [StateReason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ISSUER_REJECTED,
                CLOSED_BY_PLATFORM,
                CLOSED_BY_GRID,
                /**
                 * An enum member indicating that [StateReason] was instantiated with an unknown
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
                    ISSUER_REJECTED -> Value.ISSUER_REJECTED
                    CLOSED_BY_PLATFORM -> Value.CLOSED_BY_PLATFORM
                    CLOSED_BY_GRID -> Value.CLOSED_BY_GRID
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
                    ISSUER_REJECTED -> Known.ISSUER_REJECTED
                    CLOSED_BY_PLATFORM -> Known.CLOSED_BY_PLATFORM
                    CLOSED_BY_GRID -> Known.CLOSED_BY_GRID
                    else -> throw LightsparkGridInvalidDataException("Unknown StateReason: $value")
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
            fun validate(): StateReason = apply {
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

                return other is StateReason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
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
            "Data{id=$id, cardholderId=$cardholderId, createdAt=$createdAt, form=$form, fundingSources=$fundingSources, state=$state, updatedAt=$updatedAt, brand=$brand, currency=$currency, expMonth=$expMonth, expYear=$expYear, issuerRef=$issuerRef, last4=$last4, panEmbedUrl=$panEmbedUrl, platformCardId=$platformCardId, stateReason=$stateReason, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val CARD_STATE_CHANGE = of("CARD.STATE_CHANGE")

            val OUTGOING_PAYMENT_PENDING = of("OUTGOING_PAYMENT.PENDING")

            val OUTGOING_PAYMENT_PROCESSING = of("OUTGOING_PAYMENT.PROCESSING")

            val OUTGOING_PAYMENT_COMPLETED = of("OUTGOING_PAYMENT.COMPLETED")

            val OUTGOING_PAYMENT_FAILED = of("OUTGOING_PAYMENT.FAILED")

            val OUTGOING_PAYMENT_EXPIRED = of("OUTGOING_PAYMENT.EXPIRED")

            val OUTGOING_PAYMENT_REFUND_PENDING = of("OUTGOING_PAYMENT.REFUND_PENDING")

            val OUTGOING_PAYMENT_REFUND_COMPLETED = of("OUTGOING_PAYMENT.REFUND_COMPLETED")

            val OUTGOING_PAYMENT_REFUND_FAILED = of("OUTGOING_PAYMENT.REFUND_FAILED")

            val INCOMING_PAYMENT_PENDING = of("INCOMING_PAYMENT.PENDING")

            val INCOMING_PAYMENT_COMPLETED = of("INCOMING_PAYMENT.COMPLETED")

            val INCOMING_PAYMENT_FAILED = of("INCOMING_PAYMENT.FAILED")

            val CUSTOMER_KYC_APPROVED = of("CUSTOMER.KYC_APPROVED")

            val CUSTOMER_KYC_REJECTED = of("CUSTOMER.KYC_REJECTED")

            val CUSTOMER_KYC_PENDING = of("CUSTOMER.KYC_PENDING")

            val CUSTOMER_KYB_APPROVED = of("CUSTOMER.KYB_APPROVED")

            val CUSTOMER_KYB_REJECTED = of("CUSTOMER.KYB_REJECTED")

            val CUSTOMER_KYB_PENDING = of("CUSTOMER.KYB_PENDING")

            val VERIFICATION_APPROVED = of("VERIFICATION.APPROVED")

            val VERIFICATION_REJECTED = of("VERIFICATION.REJECTED")

            val VERIFICATION_RESOLVE_ERRORS = of("VERIFICATION.RESOLVE_ERRORS")

            val VERIFICATION_IN_PROGRESS = of("VERIFICATION.IN_PROGRESS")

            val VERIFICATION_PENDING_MANUAL_REVIEW = of("VERIFICATION.PENDING_MANUAL_REVIEW")

            val VERIFICATION_READY_FOR_VERIFICATION = of("VERIFICATION.READY_FOR_VERIFICATION")

            val INTERNAL_ACCOUNT_BALANCE_UPDATED = of("INTERNAL_ACCOUNT.BALANCE_UPDATED")

            val INTERNAL_ACCOUNT_STATUS_UPDATED = of("INTERNAL_ACCOUNT.STATUS_UPDATED")

            val INVITATION_CLAIMED = of("INVITATION.CLAIMED")

            val BULK_UPLOAD_COMPLETED = of("BULK_UPLOAD.COMPLETED")

            val BULK_UPLOAD_FAILED = of("BULK_UPLOAD.FAILED")

            val AGENT_ACTION_PENDING_APPROVAL = of("AGENT_ACTION.PENDING_APPROVAL")

            val CARD_FUNDING_SOURCE_CHANGE = of("CARD.FUNDING_SOURCE_CHANGE")

            val TEST = of("TEST")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CARD_STATE_CHANGE,
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_PENDING,
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_PENDING,
            VERIFICATION_APPROVED,
            VERIFICATION_REJECTED,
            VERIFICATION_RESOLVE_ERRORS,
            VERIFICATION_IN_PROGRESS,
            VERIFICATION_PENDING_MANUAL_REVIEW,
            VERIFICATION_READY_FOR_VERIFICATION,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INTERNAL_ACCOUNT_STATUS_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            AGENT_ACTION_PENDING_APPROVAL,
            CARD_FUNDING_SOURCE_CHANGE,
            TEST,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CARD_STATE_CHANGE,
            OUTGOING_PAYMENT_PENDING,
            OUTGOING_PAYMENT_PROCESSING,
            OUTGOING_PAYMENT_COMPLETED,
            OUTGOING_PAYMENT_FAILED,
            OUTGOING_PAYMENT_EXPIRED,
            OUTGOING_PAYMENT_REFUND_PENDING,
            OUTGOING_PAYMENT_REFUND_COMPLETED,
            OUTGOING_PAYMENT_REFUND_FAILED,
            INCOMING_PAYMENT_PENDING,
            INCOMING_PAYMENT_COMPLETED,
            INCOMING_PAYMENT_FAILED,
            CUSTOMER_KYC_APPROVED,
            CUSTOMER_KYC_REJECTED,
            CUSTOMER_KYC_PENDING,
            CUSTOMER_KYB_APPROVED,
            CUSTOMER_KYB_REJECTED,
            CUSTOMER_KYB_PENDING,
            VERIFICATION_APPROVED,
            VERIFICATION_REJECTED,
            VERIFICATION_RESOLVE_ERRORS,
            VERIFICATION_IN_PROGRESS,
            VERIFICATION_PENDING_MANUAL_REVIEW,
            VERIFICATION_READY_FOR_VERIFICATION,
            INTERNAL_ACCOUNT_BALANCE_UPDATED,
            INTERNAL_ACCOUNT_STATUS_UPDATED,
            INVITATION_CLAIMED,
            BULK_UPLOAD_COMPLETED,
            BULK_UPLOAD_FAILED,
            AGENT_ACTION_PENDING_APPROVAL,
            CARD_FUNDING_SOURCE_CHANGE,
            TEST,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                CARD_STATE_CHANGE -> Value.CARD_STATE_CHANGE
                OUTGOING_PAYMENT_PENDING -> Value.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Value.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Value.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Value.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Value.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Value.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Value.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Value.OUTGOING_PAYMENT_REFUND_FAILED
                INCOMING_PAYMENT_PENDING -> Value.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Value.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Value.INCOMING_PAYMENT_FAILED
                CUSTOMER_KYC_APPROVED -> Value.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Value.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_PENDING -> Value.CUSTOMER_KYC_PENDING
                CUSTOMER_KYB_APPROVED -> Value.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Value.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_PENDING -> Value.CUSTOMER_KYB_PENDING
                VERIFICATION_APPROVED -> Value.VERIFICATION_APPROVED
                VERIFICATION_REJECTED -> Value.VERIFICATION_REJECTED
                VERIFICATION_RESOLVE_ERRORS -> Value.VERIFICATION_RESOLVE_ERRORS
                VERIFICATION_IN_PROGRESS -> Value.VERIFICATION_IN_PROGRESS
                VERIFICATION_PENDING_MANUAL_REVIEW -> Value.VERIFICATION_PENDING_MANUAL_REVIEW
                VERIFICATION_READY_FOR_VERIFICATION -> Value.VERIFICATION_READY_FOR_VERIFICATION
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Value.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INTERNAL_ACCOUNT_STATUS_UPDATED -> Value.INTERNAL_ACCOUNT_STATUS_UPDATED
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Value.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Value.BULK_UPLOAD_FAILED
                AGENT_ACTION_PENDING_APPROVAL -> Value.AGENT_ACTION_PENDING_APPROVAL
                CARD_FUNDING_SOURCE_CHANGE -> Value.CARD_FUNDING_SOURCE_CHANGE
                TEST -> Value.TEST
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
                CARD_STATE_CHANGE -> Known.CARD_STATE_CHANGE
                OUTGOING_PAYMENT_PENDING -> Known.OUTGOING_PAYMENT_PENDING
                OUTGOING_PAYMENT_PROCESSING -> Known.OUTGOING_PAYMENT_PROCESSING
                OUTGOING_PAYMENT_COMPLETED -> Known.OUTGOING_PAYMENT_COMPLETED
                OUTGOING_PAYMENT_FAILED -> Known.OUTGOING_PAYMENT_FAILED
                OUTGOING_PAYMENT_EXPIRED -> Known.OUTGOING_PAYMENT_EXPIRED
                OUTGOING_PAYMENT_REFUND_PENDING -> Known.OUTGOING_PAYMENT_REFUND_PENDING
                OUTGOING_PAYMENT_REFUND_COMPLETED -> Known.OUTGOING_PAYMENT_REFUND_COMPLETED
                OUTGOING_PAYMENT_REFUND_FAILED -> Known.OUTGOING_PAYMENT_REFUND_FAILED
                INCOMING_PAYMENT_PENDING -> Known.INCOMING_PAYMENT_PENDING
                INCOMING_PAYMENT_COMPLETED -> Known.INCOMING_PAYMENT_COMPLETED
                INCOMING_PAYMENT_FAILED -> Known.INCOMING_PAYMENT_FAILED
                CUSTOMER_KYC_APPROVED -> Known.CUSTOMER_KYC_APPROVED
                CUSTOMER_KYC_REJECTED -> Known.CUSTOMER_KYC_REJECTED
                CUSTOMER_KYC_PENDING -> Known.CUSTOMER_KYC_PENDING
                CUSTOMER_KYB_APPROVED -> Known.CUSTOMER_KYB_APPROVED
                CUSTOMER_KYB_REJECTED -> Known.CUSTOMER_KYB_REJECTED
                CUSTOMER_KYB_PENDING -> Known.CUSTOMER_KYB_PENDING
                VERIFICATION_APPROVED -> Known.VERIFICATION_APPROVED
                VERIFICATION_REJECTED -> Known.VERIFICATION_REJECTED
                VERIFICATION_RESOLVE_ERRORS -> Known.VERIFICATION_RESOLVE_ERRORS
                VERIFICATION_IN_PROGRESS -> Known.VERIFICATION_IN_PROGRESS
                VERIFICATION_PENDING_MANUAL_REVIEW -> Known.VERIFICATION_PENDING_MANUAL_REVIEW
                VERIFICATION_READY_FOR_VERIFICATION -> Known.VERIFICATION_READY_FOR_VERIFICATION
                INTERNAL_ACCOUNT_BALANCE_UPDATED -> Known.INTERNAL_ACCOUNT_BALANCE_UPDATED
                INTERNAL_ACCOUNT_STATUS_UPDATED -> Known.INTERNAL_ACCOUNT_STATUS_UPDATED
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                BULK_UPLOAD_COMPLETED -> Known.BULK_UPLOAD_COMPLETED
                BULK_UPLOAD_FAILED -> Known.BULK_UPLOAD_FAILED
                AGENT_ACTION_PENDING_APPROVAL -> Known.AGENT_ACTION_PENDING_APPROVAL
                CARD_FUNDING_SOURCE_CHANGE -> Known.CARD_FUNDING_SOURCE_CHANGE
                TEST -> Known.TEST
                else -> throw LightsparkGridInvalidDataException("Unknown Type: $value")
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
        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardStateChangeWebhookEvent &&
            id == other.id &&
            data == other.data &&
            timestamp == other.timestamp &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, data, timestamp, type, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardStateChangeWebhookEvent{id=$id, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
