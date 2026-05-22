// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

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
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.core.toImmutable
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.util.Collections
import java.util.Objects

/**
 * Update a card's `state` and / or its bound `fundingSources`. At least one of the two fields must
 * be supplied.
 * - `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN → CLOSED`. `CLOSED`
 *   is terminal and irreversible. Any other transition returns `409 INVALID_STATE_TRANSITION`.
 * - `fundingSources`, when supplied, fully replaces the card's bound funding sources. Array order
 *   determines the priority Authorization Decisioning tries them in. Each id must belong to the
 *   cardholder and be denominated in the card's currency; the list must contain at least one
 *   source. `fundingSources` cannot be supplied alongside `state: CLOSED`.
 *
 * Because both updates are sensitive state changes, this endpoint uses Grid's 202 → signed-retry
 * pattern (same shape as `DELETE /auth/credentials/{id}` and `POST
 * /internal-accounts/{id}/export`):
 * 1. Call `PATCH /cards/{id}` with the target fields and no signing headers. The response is `202`
 *    with a `payloadToSign`, `requestId`, and `expiresAt`.
 * 2. Sign the `payloadToSign` with the session private key of a verified authentication credential
 *    on the card's owning internal account and retry with the signature as the
 *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header. The
 *    signed retry returns `200` with the updated `Card`.
 *
 * Effects:
 * - `state: FROZEN`: Authorization Decisioning declines new auths with `CARD_PAUSED`. Existing
 *   pulls and in-flight reconciliation continue — freezing does not pause the lifecycle of
 *   authorizations that already passed.
 * - `state: ACTIVE`: normal authorization behavior resumes.
 * - `state: CLOSED`: terminal close. The card transitions to `state: "CLOSED"` with `stateReason:
 *   "CLOSED_BY_PLATFORM"` and stays in the system for audit and reconciliation. All pending auths
 *   reconcile to a terminal state via the existing reconcile primitive. Inbound clearings received
 *   after close follow the standard force-post / late-presentment path — Lightspark absorbs the
 *   loss if a post-hoc pull on the now-unbound source fails. Funding-source bindings are detached.
 *   Refunds already in flight still complete because Lightspark holds the card-reserve keys.
 * - `fundingSources` change: emits `card.funding_source_change` reflecting the new ordered binding.
 *
 * The `card.state_change` webhook fires on every successful `state` transition; the
 * `card.funding_source_change` webhook fires whenever `fundingSources` is updated.
 */
class CardUpdateParams
private constructor(
    private val id: String?,
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * New ordered list of internal account ids to bind as funding sources. Fully replaces the
     * previous binding. Each id must belong to the cardholder and be denominated in the card's
     * currency. The list must contain at least one source — to stop a card from spending without
     * removing all sources, transition it to `FROZEN` instead. Cannot be supplied alongside `state:
     * CLOSED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun fundingSources(): List<String>? = body.fundingSources()

    /**
     * Target state for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN →
     * CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in the system for
     * audit and reconciliation but cannot transact again.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun state(): State? = body.state()

    /**
     * Returns the raw JSON value of [fundingSources].
     *
     * Unlike [fundingSources], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fundingSources(): JsonField<List<String>> = body._fundingSources()

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _state(): JsonField<State> = body._state()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        fun none(): CardUpdateParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [CardUpdateParams]. */
        fun builder() = Builder()
    }

    /** A builder for [CardUpdateParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(cardUpdateParams: CardUpdateParams) = apply {
            id = cardUpdateParams.id
            gridWalletSignature = cardUpdateParams.gridWalletSignature
            requestId = cardUpdateParams.requestId
            body = cardUpdateParams.body.toBuilder()
            additionalHeaders = cardUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = cardUpdateParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fundingSources]
         * - [state]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * New ordered list of internal account ids to bind as funding sources. Fully replaces the
         * previous binding. Each id must belong to the cardholder and be denominated in the card's
         * currency. The list must contain at least one source — to stop a card from spending
         * without removing all sources, transition it to `FROZEN` instead. Cannot be supplied
         * alongside `state: CLOSED`.
         */
        fun fundingSources(fundingSources: List<String>) = apply {
            body.fundingSources(fundingSources)
        }

        /**
         * Sets [Builder.fundingSources] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fundingSources] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun fundingSources(fundingSources: JsonField<List<String>>) = apply {
            body.fundingSources(fundingSources)
        }

        /**
         * Adds a single [String] to [fundingSources].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFundingSource(fundingSource: String) = apply { body.addFundingSource(fundingSource) }

        /**
         * Target state for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE |
         * FROZEN → CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in
         * the system for audit and reconciliation but cannot transact again.
         */
        fun state(state: State) = apply { body.state(state) }

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { body.state(state) }

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
         * Returns an immutable instance of [CardUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CardUpdateParams =
            CardUpdateParams(
                id,
                gridWalletSignature,
                requestId,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> id ?: ""
            else -> ""
        }

    override fun _headers(): Headers =
        Headers.builder()
            .apply {
                gridWalletSignature?.let { put("Grid-Wallet-Signature", it) }
                requestId?.let { put("Request-Id", it) }
                putAll(additionalHeaders)
            }
            .build()

    override fun _queryParams(): QueryParams = additionalQueryParams

    /**
     * Update request for `PATCH /cards/{id}`. At least one of `state` or `fundingSources` must be
     * supplied. `state` transitions are limited to `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN →
     * CLOSED`; any other transition returns `409 INVALID_STATE_TRANSITION`. `CLOSED` is terminal
     * and irreversible and cannot be combined with `fundingSources`. `fundingSources`, when
     * supplied, fully replaces the card's bound funding sources — the array order determines the
     * priority Authorization Decisioning tries them in.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fundingSources: JsonField<List<String>>,
        private val state: JsonField<State>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fundingSources")
            @ExcludeMissing
            fundingSources: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        ) : this(fundingSources, state, mutableMapOf())

        /**
         * New ordered list of internal account ids to bind as funding sources. Fully replaces the
         * previous binding. Each id must belong to the cardholder and be denominated in the card's
         * currency. The list must contain at least one source — to stop a card from spending
         * without removing all sources, transition it to `FROZEN` instead. Cannot be supplied
         * alongside `state: CLOSED`.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun fundingSources(): List<String>? = fundingSources.getNullable("fundingSources")

        /**
         * Target state for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE |
         * FROZEN → CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in
         * the system for audit and reconciliation but cannot transact again.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun state(): State? = state.getNullable("state")

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var fundingSources: JsonField<MutableList<String>>? = null
            private var state: JsonField<State> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                fundingSources = body.fundingSources.map { it.toMutableList() }
                state = body.state
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * New ordered list of internal account ids to bind as funding sources. Fully replaces
             * the previous binding. Each id must belong to the cardholder and be denominated in the
             * card's currency. The list must contain at least one source — to stop a card from
             * spending without removing all sources, transition it to `FROZEN` instead. Cannot be
             * supplied alongside `state: CLOSED`.
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
             * Target state for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE |
             * FROZEN → CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays
             * in the system for audit and reconciliation but cannot transact again.
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
             */
            fun build(): Body =
                Body(
                    (fundingSources ?: JsonMissing.of()).map { it.toImmutable() },
                    state,
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

            fundingSources()
            state()?.validate()
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
            (fundingSources.asKnown()?.size ?: 0) + (state.asKnown()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fundingSources == other.fundingSources &&
                state == other.state &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(fundingSources, state, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fundingSources=$fundingSources, state=$state, additionalProperties=$additionalProperties}"
    }

    /**
     * Target state for the card. Permitted transitions are `ACTIVE ⇄ FROZEN` and `ACTIVE | FROZEN →
     * CLOSED`. `CLOSED` is terminal and irreversible; once closed, the card stays in the system for
     * audit and reconciliation but cannot transact again.
     */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACTIVE = of("ACTIVE")

            val FROZEN = of("FROZEN")

            val CLOSED = of("CLOSED")

            fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ACTIVE,
            FROZEN,
            CLOSED,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            FROZEN,
            CLOSED,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                FROZEN -> Value.FROZEN
                CLOSED -> Value.CLOSED
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
                ACTIVE -> Known.ACTIVE
                FROZEN -> Known.FROZEN
                CLOSED -> Known.CLOSED
                else -> throw LightsparkGridInvalidDataException("Unknown State: $value")
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardUpdateParams &&
            id == other.id &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            gridWalletSignature,
            requestId,
            body,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CardUpdateParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
