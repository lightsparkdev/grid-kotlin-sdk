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
import java.util.Collections
import java.util.Objects

class CardCreateRequest
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val cardholderId: JsonField<String>,
    private val form: JsonField<CardForm>,
    private val fundingSources: JsonField<List<String>>,
    private val platformCardId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("cardholderId")
        @ExcludeMissing
        cardholderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("form") @ExcludeMissing form: JsonField<CardForm> = JsonMissing.of(),
        @JsonProperty("fundingSources")
        @ExcludeMissing
        fundingSources: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("platformCardId")
        @ExcludeMissing
        platformCardId: JsonField<String> = JsonMissing.of(),
    ) : this(cardholderId, form, fundingSources, platformCardId, mutableMapOf())

    /**
     * The id of the `Customer` to issue the card to. The customer must have KYC status `APPROVED`;
     * otherwise the request is rejected with `CARDHOLDER_KYC_NOT_APPROVED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardholderId(): String = cardholderId.getRequired("cardholderId")

    /**
     * Physical form factor of the card. Only `VIRTUAL` is supported in v1; `PHYSICAL` will be added
     * in a later release.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun form(): CardForm = form.getRequired("form")

    /**
     * Internal account ids to bind as funding sources, in priority order. The first entry is tried
     * first by Authorization Decisioning. Every card must be bound to at least one source, and
     * every source must belong to the cardholder and be denominated in a card-eligible currency
     * (USDB in v1); otherwise the request is rejected with `FUNDING_SOURCE_INELIGIBLE`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fundingSources(): List<String> = fundingSources.getRequired("fundingSources")

    /**
     * Optional platform-specific card identifier. System-generated when omitted, mirroring
     * `platformCustomerId` semantics.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun platformCardId(): String? = platformCardId.getNullable("platformCardId")

    /**
     * Returns the raw JSON value of [cardholderId].
     *
     * Unlike [cardholderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cardholderId")
    @ExcludeMissing
    fun _cardholderId(): JsonField<String> = cardholderId

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
     * Returns the raw JSON value of [platformCardId].
     *
     * Unlike [platformCardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("platformCardId")
    @ExcludeMissing
    fun _platformCardId(): JsonField<String> = platformCardId

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
         * Returns a mutable builder for constructing an instance of [CardCreateRequest].
         *
         * The following fields are required:
         * ```kotlin
         * .cardholderId()
         * .form()
         * .fundingSources()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CardCreateRequest]. */
    class Builder internal constructor() {

        private var cardholderId: JsonField<String>? = null
        private var form: JsonField<CardForm>? = null
        private var fundingSources: JsonField<MutableList<String>>? = null
        private var platformCardId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(cardCreateRequest: CardCreateRequest) = apply {
            cardholderId = cardCreateRequest.cardholderId
            form = cardCreateRequest.form
            fundingSources = cardCreateRequest.fundingSources.map { it.toMutableList() }
            platformCardId = cardCreateRequest.platformCardId
            additionalProperties = cardCreateRequest.additionalProperties.toMutableMap()
        }

        /**
         * The id of the `Customer` to issue the card to. The customer must have KYC status
         * `APPROVED`; otherwise the request is rejected with `CARDHOLDER_KYC_NOT_APPROVED`.
         */
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
         * Internal account ids to bind as funding sources, in priority order. The first entry is
         * tried first by Authorization Decisioning. Every card must be bound to at least one
         * source, and every source must belong to the cardholder and be denominated in a
         * card-eligible currency (USDB in v1); otherwise the request is rejected with
         * `FUNDING_SOURCE_INELIGIBLE`.
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
         * Optional platform-specific card identifier. System-generated when omitted, mirroring
         * `platformCustomerId` semantics.
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
         * Returns an immutable instance of [CardCreateRequest].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .cardholderId()
         * .form()
         * .fundingSources()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardCreateRequest =
            CardCreateRequest(
                checkRequired("cardholderId", cardholderId),
                checkRequired("form", form),
                checkRequired("fundingSources", fundingSources).map { it.toImmutable() },
                platformCardId,
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
    fun validate(): CardCreateRequest = apply {
        if (validated) {
            return@apply
        }

        cardholderId()
        form().validate()
        fundingSources()
        platformCardId()
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
        (if (cardholderId.asKnown() == null) 0 else 1) +
            (form.asKnown()?.validity() ?: 0) +
            (fundingSources.asKnown()?.size ?: 0) +
            (if (platformCardId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardCreateRequest &&
            cardholderId == other.cardholderId &&
            form == other.form &&
            fundingSources == other.fundingSources &&
            platformCardId == other.platformCardId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(cardholderId, form, fundingSources, platformCardId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardCreateRequest{cardholderId=$cardholderId, form=$form, fundingSources=$fundingSources, platformCardId=$platformCardId, additionalProperties=$additionalProperties}"
}
