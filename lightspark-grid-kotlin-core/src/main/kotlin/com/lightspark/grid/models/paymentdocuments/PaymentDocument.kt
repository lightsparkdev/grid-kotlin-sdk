// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.paymentdocuments

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A supporting document uploaded for a payout that requires one. Pass its `id` in `documentIds` on
 * `POST /quotes`.
 */
class PaymentDocument
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val contentType: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val documentType: JsonField<PaymentDocumentType>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val fileName: JsonField<String>,
    private val sizeBytes: JsonField<Long>,
    private val status: JsonField<PaymentDocumentStatus>,
    private val customerId: JsonField<String>,
    private val quoteId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("contentType")
        @ExcludeMissing
        contentType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdAt")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("documentType")
        @ExcludeMissing
        documentType: JsonField<PaymentDocumentType> = JsonMissing.of(),
        @JsonProperty("expiresAt")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("fileName") @ExcludeMissing fileName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sizeBytes") @ExcludeMissing sizeBytes: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status")
        @ExcludeMissing
        status: JsonField<PaymentDocumentStatus> = JsonMissing.of(),
        @JsonProperty("customerId")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quoteId") @ExcludeMissing quoteId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        contentType,
        createdAt,
        documentType,
        expiresAt,
        fileName,
        sizeBytes,
        status,
        customerId,
        quoteId,
        mutableMapOf(),
    )

    /**
     * Unique identifier for this payment document
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * File format as a MIME type, as Grid detected it from the file contents. Today one of
     * `application/pdf`, `image/jpeg`, or `image/png`. Treat it as an open value, because Grid may
     * accept more formats later.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contentType(): String = contentType.getRequired("contentType")

    /**
     * When this document was uploaded
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("createdAt")

    /**
     * What a supporting document is. These are kinds of evidence, not file formats: `INVOICE` means
     * the file is an invoice.
     *
     * [Supporting
     * Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
     * lists the types each requirement accepts. When you upload a file with `POST
     * /payment-documents`, `documentType` declares which type the file is.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun documentType(): PaymentDocumentType = documentType.getRequired("documentType")

    /**
     * When the document stops being usable if it has not been attached to a quote. This is 24 hours
     * after `createdAt`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expiresAt")

    /**
     * File name of the uploaded file
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = fileName.getRequired("fileName")

    /**
     * Size of the uploaded file in bytes. It never exceeds the largest file `POST
     * /payment-documents` accepts, which is 8,000,000 bytes today.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sizeBytes(): Long = sizeBytes.getRequired("sizeBytes")

    /**
     * Where the payment document is in its lifecycle.
     *
     * |Status    |Terminal|Meaning                                                                           |
     * |----------|--------|----------------------------------------------------------------------------------|
     * |`UPLOADED`|No      |Ready to use. Pass the `id` in `documentIds` on `POST /quotes` before `expiresAt`.|
     * |`ATTACHED`|Yes     |Attached to the payment behind the quote in `quoteId`. Grid has deleted the file. |
     * |`EXPIRED` |Yes     |Not attached to a quote before `expiresAt`. The document can no longer be used.   |
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): PaymentDocumentStatus = status.getRequired("status")

    /**
     * ID of the sending customer whose payment this document supports. The document can only be
     * used on this customer's quotes. Absent when the platform itself is the sender.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun customerId(): String? = customerId.getNullable("customerId")

    /**
     * ID of the quote whose payment this document is attached to. Present only when `status` is
     * `ATTACHED`.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g. if
     *   the server responded with an unexpected value).
     */
    fun quoteId(): String? = quoteId.getNullable("quoteId")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [contentType].
     *
     * Unlike [contentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contentType") @ExcludeMissing fun _contentType(): JsonField<String> = contentType

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdAt")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [documentType].
     *
     * Unlike [documentType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("documentType")
    @ExcludeMissing
    fun _documentType(): JsonField<PaymentDocumentType> = documentType

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expiresAt")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileName") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

    /**
     * Returns the raw JSON value of [sizeBytes].
     *
     * Unlike [sizeBytes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sizeBytes") @ExcludeMissing fun _sizeBytes(): JsonField<Long> = sizeBytes

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<PaymentDocumentStatus> = status

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customerId") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [quoteId].
     *
     * Unlike [quoteId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("quoteId") @ExcludeMissing fun _quoteId(): JsonField<String> = quoteId

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
         * Returns a mutable builder for constructing an instance of [PaymentDocument].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .contentType()
         * .createdAt()
         * .documentType()
         * .expiresAt()
         * .fileName()
         * .sizeBytes()
         * .status()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [PaymentDocument]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var contentType: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var documentType: JsonField<PaymentDocumentType>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var fileName: JsonField<String>? = null
        private var sizeBytes: JsonField<Long>? = null
        private var status: JsonField<PaymentDocumentStatus>? = null
        private var customerId: JsonField<String> = JsonMissing.of()
        private var quoteId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(paymentDocument: PaymentDocument) = apply {
            id = paymentDocument.id
            contentType = paymentDocument.contentType
            createdAt = paymentDocument.createdAt
            documentType = paymentDocument.documentType
            expiresAt = paymentDocument.expiresAt
            fileName = paymentDocument.fileName
            sizeBytes = paymentDocument.sizeBytes
            status = paymentDocument.status
            customerId = paymentDocument.customerId
            quoteId = paymentDocument.quoteId
            additionalProperties = paymentDocument.additionalProperties.toMutableMap()
        }

        /** Unique identifier for this payment document */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * File format as a MIME type, as Grid detected it from the file contents. Today one of
         * `application/pdf`, `image/jpeg`, or `image/png`. Treat it as an open value, because Grid
         * may accept more formats later.
         */
        fun contentType(contentType: String) = contentType(JsonField.of(contentType))

        /**
         * Sets [Builder.contentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contentType] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contentType(contentType: JsonField<String>) = apply { this.contentType = contentType }

        /** When this document was uploaded */
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
         * What a supporting document is. These are kinds of evidence, not file formats: `INVOICE`
         * means the file is an invoice.
         *
         * [Supporting
         * Documents](https://docs.lightspark.com/payouts-and-b2b/payment-flow/send-payment#supporting-documents)
         * lists the types each requirement accepts. When you upload a file with `POST
         * /payment-documents`, `documentType` declares which type the file is.
         */
        fun documentType(documentType: PaymentDocumentType) =
            documentType(JsonField.of(documentType))

        /**
         * Sets [Builder.documentType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.documentType] with a well-typed [PaymentDocumentType]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun documentType(documentType: JsonField<PaymentDocumentType>) = apply {
            this.documentType = documentType
        }

        /**
         * When the document stops being usable if it has not been attached to a quote. This is 24
         * hours after `createdAt`.
         */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** File name of the uploaded file */
        fun fileName(fileName: String) = fileName(JsonField.of(fileName))

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

        /**
         * Size of the uploaded file in bytes. It never exceeds the largest file `POST
         * /payment-documents` accepts, which is 8,000,000 bytes today.
         */
        fun sizeBytes(sizeBytes: Long) = sizeBytes(JsonField.of(sizeBytes))

        /**
         * Sets [Builder.sizeBytes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sizeBytes] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun sizeBytes(sizeBytes: JsonField<Long>) = apply { this.sizeBytes = sizeBytes }

        /**
         * Where the payment document is in its lifecycle.
         *
         * |Status    |Terminal|Meaning                                                                           |
         * |----------|--------|----------------------------------------------------------------------------------|
         * |`UPLOADED`|No      |Ready to use. Pass the `id` in `documentIds` on `POST /quotes` before `expiresAt`.|
         * |`ATTACHED`|Yes     |Attached to the payment behind the quote in `quoteId`. Grid has deleted the file. |
         * |`EXPIRED` |Yes     |Not attached to a quote before `expiresAt`. The document can no longer be used.   |
         */
        fun status(status: PaymentDocumentStatus) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [PaymentDocumentStatus] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun status(status: JsonField<PaymentDocumentStatus>) = apply { this.status = status }

        /**
         * ID of the sending customer whose payment this document supports. The document can only be
         * used on this customer's quotes. Absent when the platform itself is the sender.
         */
        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        /**
         * ID of the quote whose payment this document is attached to. Present only when `status` is
         * `ATTACHED`.
         */
        fun quoteId(quoteId: String) = quoteId(JsonField.of(quoteId))

        /**
         * Sets [Builder.quoteId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quoteId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun quoteId(quoteId: JsonField<String>) = apply { this.quoteId = quoteId }

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
         * Returns an immutable instance of [PaymentDocument].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .contentType()
         * .createdAt()
         * .documentType()
         * .expiresAt()
         * .fileName()
         * .sizeBytes()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PaymentDocument =
            PaymentDocument(
                checkRequired("id", id),
                checkRequired("contentType", contentType),
                checkRequired("createdAt", createdAt),
                checkRequired("documentType", documentType),
                checkRequired("expiresAt", expiresAt),
                checkRequired("fileName", fileName),
                checkRequired("sizeBytes", sizeBytes),
                checkRequired("status", status),
                customerId,
                quoteId,
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
    fun validate(): PaymentDocument = apply {
        if (validated) {
            return@apply
        }

        id()
        contentType()
        createdAt()
        documentType().validate()
        expiresAt()
        fileName()
        sizeBytes()
        status().validate()
        customerId()
        quoteId()
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
            (if (contentType.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (documentType.asKnown()?.validity() ?: 0) +
            (if (expiresAt.asKnown() == null) 0 else 1) +
            (if (fileName.asKnown() == null) 0 else 1) +
            (if (sizeBytes.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (if (customerId.asKnown() == null) 0 else 1) +
            (if (quoteId.asKnown() == null) 0 else 1)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PaymentDocument &&
            id == other.id &&
            contentType == other.contentType &&
            createdAt == other.createdAt &&
            documentType == other.documentType &&
            expiresAt == other.expiresAt &&
            fileName == other.fileName &&
            sizeBytes == other.sizeBytes &&
            status == other.status &&
            customerId == other.customerId &&
            quoteId == other.quoteId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            contentType,
            createdAt,
            documentType,
            expiresAt,
            fileName,
            sizeBytes,
            status,
            customerId,
            quoteId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PaymentDocument{id=$id, contentType=$contentType, createdAt=$createdAt, documentType=$documentType, expiresAt=$expiresAt, fileName=$fileName, sizeBytes=$sizeBytes, status=$status, customerId=$customerId, quoteId=$quoteId, additionalProperties=$additionalProperties}"
}
