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

class BulkUploadWebhookEvent
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val bulkCustomerImportJob: JsonField<BulkCustomerImportJob>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val type: JsonField<Type>,
    private val webhookId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("bulkCustomerImportJob")
        @ExcludeMissing
        bulkCustomerImportJob: JsonField<BulkCustomerImportJob> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("webhookId") @ExcludeMissing webhookId: JsonField<String> = JsonMissing.of(),
    ) : this(bulkCustomerImportJob, timestamp, type, webhookId, mutableMapOf())

    /**
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun bulkCustomerImportJob(): BulkCustomerImportJob =
        bulkCustomerImportJob.getRequired("bulkCustomerImportJob")

    /**
     * ISO8601 timestamp when the webhook was sent (can be used to prevent replay attacks)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    /**
     * Type of webhook event
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Unique identifier for this webhook delivery (can be used for idempotency)
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun webhookId(): String = webhookId.getRequired("webhookId")

    /**
     * Returns the raw JSON value of [bulkCustomerImportJob].
     *
     * Unlike [bulkCustomerImportJob], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("bulkCustomerImportJob")
    @ExcludeMissing
    fun _bulkCustomerImportJob(): JsonField<BulkCustomerImportJob> = bulkCustomerImportJob

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

    /**
     * Returns the raw JSON value of [webhookId].
     *
     * Unlike [webhookId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("webhookId") @ExcludeMissing fun _webhookId(): JsonField<String> = webhookId

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
         * Returns a mutable builder for constructing an instance of [BulkUploadWebhookEvent].
         *
         * The following fields are required:
         * ```kotlin
         * .bulkCustomerImportJob()
         * .timestamp()
         * .type()
         * .webhookId()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [BulkUploadWebhookEvent]. */
    class Builder internal constructor() {

        private var bulkCustomerImportJob: JsonField<BulkCustomerImportJob>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var webhookId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(bulkUploadWebhookEvent: BulkUploadWebhookEvent) = apply {
            bulkCustomerImportJob = bulkUploadWebhookEvent.bulkCustomerImportJob
            timestamp = bulkUploadWebhookEvent.timestamp
            type = bulkUploadWebhookEvent.type
            webhookId = bulkUploadWebhookEvent.webhookId
            additionalProperties = bulkUploadWebhookEvent.additionalProperties.toMutableMap()
        }

        fun bulkCustomerImportJob(bulkCustomerImportJob: BulkCustomerImportJob) =
            bulkCustomerImportJob(JsonField.of(bulkCustomerImportJob))

        /**
         * Sets [Builder.bulkCustomerImportJob] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bulkCustomerImportJob] with a well-typed
         * [BulkCustomerImportJob] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun bulkCustomerImportJob(bulkCustomerImportJob: JsonField<BulkCustomerImportJob>) = apply {
            this.bulkCustomerImportJob = bulkCustomerImportJob
        }

        /** ISO8601 timestamp when the webhook was sent (can be used to prevent replay attacks) */
        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        /**
         * Sets [Builder.timestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        /** Type of webhook event */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Unique identifier for this webhook delivery (can be used for idempotency) */
        fun webhookId(webhookId: String) = webhookId(JsonField.of(webhookId))

        /**
         * Sets [Builder.webhookId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookId(webhookId: JsonField<String>) = apply { this.webhookId = webhookId }

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
         * Returns an immutable instance of [BulkUploadWebhookEvent].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .bulkCustomerImportJob()
         * .timestamp()
         * .type()
         * .webhookId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): BulkUploadWebhookEvent =
            BulkUploadWebhookEvent(
                checkRequired("bulkCustomerImportJob", bulkCustomerImportJob),
                checkRequired("timestamp", timestamp),
                checkRequired("type", type),
                checkRequired("webhookId", webhookId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): BulkUploadWebhookEvent = apply {
        if (validated) {
            return@apply
        }

        bulkCustomerImportJob().validate()
        timestamp()
        type().validate()
        webhookId()
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
        (bulkCustomerImportJob.asKnown()?.validity() ?: 0) +
            (if (timestamp.asKnown() == null) 0 else 1) +
            (type.asKnown()?.validity() ?: 0) +
            (if (webhookId.asKnown() == null) 0 else 1)

    class BulkCustomerImportJob
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val jobId: JsonField<String>,
        private val progress: JsonField<Progress>,
        private val status: JsonField<Status>,
        private val completedAt: JsonField<OffsetDateTime>,
        private val errors: JsonField<List<Error>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("jobId") @ExcludeMissing jobId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("progress")
            @ExcludeMissing
            progress: JsonField<Progress> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("completedAt")
            @ExcludeMissing
            completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("errors")
            @ExcludeMissing
            errors: JsonField<List<Error>> = JsonMissing.of(),
        ) : this(jobId, progress, status, completedAt, errors, mutableMapOf())

        /**
         * Unique identifier for the bulk import job
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun jobId(): String = jobId.getRequired("jobId")

        /**
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun progress(): Progress = progress.getRequired("progress")

        /**
         * Current status of the job
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Timestamp when the job completed (only present for COMPLETED or FAILED status)
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun completedAt(): OffsetDateTime? = completedAt.getNullable("completedAt")

        /**
         * Detailed error information for failed entries
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type (e.g.
         *   if the server responded with an unexpected value).
         */
        fun errors(): List<Error>? = errors.getNullable("errors")

        /**
         * Returns the raw JSON value of [jobId].
         *
         * Unlike [jobId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("jobId") @ExcludeMissing fun _jobId(): JsonField<String> = jobId

        /**
         * Returns the raw JSON value of [progress].
         *
         * Unlike [progress], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("progress") @ExcludeMissing fun _progress(): JsonField<Progress> = progress

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [completedAt].
         *
         * Unlike [completedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("completedAt")
        @ExcludeMissing
        fun _completedAt(): JsonField<OffsetDateTime> = completedAt

        /**
         * Returns the raw JSON value of [errors].
         *
         * Unlike [errors], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("errors") @ExcludeMissing fun _errors(): JsonField<List<Error>> = errors

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
             * Returns a mutable builder for constructing an instance of [BulkCustomerImportJob].
             *
             * The following fields are required:
             * ```kotlin
             * .jobId()
             * .progress()
             * .status()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [BulkCustomerImportJob]. */
        class Builder internal constructor() {

            private var jobId: JsonField<String>? = null
            private var progress: JsonField<Progress>? = null
            private var status: JsonField<Status>? = null
            private var completedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var errors: JsonField<MutableList<Error>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(bulkCustomerImportJob: BulkCustomerImportJob) = apply {
                jobId = bulkCustomerImportJob.jobId
                progress = bulkCustomerImportJob.progress
                status = bulkCustomerImportJob.status
                completedAt = bulkCustomerImportJob.completedAt
                errors = bulkCustomerImportJob.errors.map { it.toMutableList() }
                additionalProperties = bulkCustomerImportJob.additionalProperties.toMutableMap()
            }

            /** Unique identifier for the bulk import job */
            fun jobId(jobId: String) = jobId(JsonField.of(jobId))

            /**
             * Sets [Builder.jobId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.jobId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun jobId(jobId: JsonField<String>) = apply { this.jobId = jobId }

            fun progress(progress: Progress) = progress(JsonField.of(progress))

            /**
             * Sets [Builder.progress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.progress] with a well-typed [Progress] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun progress(progress: JsonField<Progress>) = apply { this.progress = progress }

            /** Current status of the job */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /** Timestamp when the job completed (only present for COMPLETED or FAILED status) */
            fun completedAt(completedAt: OffsetDateTime) = completedAt(JsonField.of(completedAt))

            /**
             * Sets [Builder.completedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.completedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
                this.completedAt = completedAt
            }

            /** Detailed error information for failed entries */
            fun errors(errors: List<Error>) = errors(JsonField.of(errors))

            /**
             * Sets [Builder.errors] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errors] with a well-typed `List<Error>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errors(errors: JsonField<List<Error>>) = apply {
                this.errors = errors.map { it.toMutableList() }
            }

            /**
             * Adds a single [Error] to [errors].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addError(error: Error) = apply {
                errors =
                    (errors ?: JsonField.of(mutableListOf())).also {
                        checkKnown("errors", it).add(error)
                    }
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
             * Returns an immutable instance of [BulkCustomerImportJob].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .jobId()
             * .progress()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BulkCustomerImportJob =
                BulkCustomerImportJob(
                    checkRequired("jobId", jobId),
                    checkRequired("progress", progress),
                    checkRequired("status", status),
                    completedAt,
                    (errors ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): BulkCustomerImportJob = apply {
            if (validated) {
                return@apply
            }

            jobId()
            progress().validate()
            status().validate()
            completedAt()
            errors()?.forEach { it.validate() }
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
            (if (jobId.asKnown() == null) 0 else 1) +
                (progress.asKnown()?.validity() ?: 0) +
                (status.asKnown()?.validity() ?: 0) +
                (if (completedAt.asKnown() == null) 0 else 1) +
                (errors.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        class Progress
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val failed: JsonField<Long>,
            private val processed: JsonField<Long>,
            private val successful: JsonField<Long>,
            private val total: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("failed") @ExcludeMissing failed: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("processed")
                @ExcludeMissing
                processed: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("successful")
                @ExcludeMissing
                successful: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("total") @ExcludeMissing total: JsonField<Long> = JsonMissing.of(),
            ) : this(failed, processed, successful, total, mutableMapOf())

            /**
             * Number of customers that failed to create
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun failed(): Long = failed.getRequired("failed")

            /**
             * Number of customers processed so far
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun processed(): Long = processed.getRequired("processed")

            /**
             * Number of customers successfully created
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun successful(): Long = successful.getRequired("successful")

            /**
             * Total number of customers to process
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun total(): Long = total.getRequired("total")

            /**
             * Returns the raw JSON value of [failed].
             *
             * Unlike [failed], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("failed") @ExcludeMissing fun _failed(): JsonField<Long> = failed

            /**
             * Returns the raw JSON value of [processed].
             *
             * Unlike [processed], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("processed") @ExcludeMissing fun _processed(): JsonField<Long> = processed

            /**
             * Returns the raw JSON value of [successful].
             *
             * Unlike [successful], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("successful")
            @ExcludeMissing
            fun _successful(): JsonField<Long> = successful

            /**
             * Returns the raw JSON value of [total].
             *
             * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Long> = total

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
                 * Returns a mutable builder for constructing an instance of [Progress].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .failed()
                 * .processed()
                 * .successful()
                 * .total()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Progress]. */
            class Builder internal constructor() {

                private var failed: JsonField<Long>? = null
                private var processed: JsonField<Long>? = null
                private var successful: JsonField<Long>? = null
                private var total: JsonField<Long>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(progress: Progress) = apply {
                    failed = progress.failed
                    processed = progress.processed
                    successful = progress.successful
                    total = progress.total
                    additionalProperties = progress.additionalProperties.toMutableMap()
                }

                /** Number of customers that failed to create */
                fun failed(failed: Long) = failed(JsonField.of(failed))

                /**
                 * Sets [Builder.failed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.failed] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun failed(failed: JsonField<Long>) = apply { this.failed = failed }

                /** Number of customers processed so far */
                fun processed(processed: Long) = processed(JsonField.of(processed))

                /**
                 * Sets [Builder.processed] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.processed] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun processed(processed: JsonField<Long>) = apply { this.processed = processed }

                /** Number of customers successfully created */
                fun successful(successful: Long) = successful(JsonField.of(successful))

                /**
                 * Sets [Builder.successful] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.successful] with a well-typed [Long] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun successful(successful: JsonField<Long>) = apply { this.successful = successful }

                /** Total number of customers to process */
                fun total(total: Long) = total(JsonField.of(total))

                /**
                 * Sets [Builder.total] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.total] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun total(total: JsonField<Long>) = apply { this.total = total }

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
                 * Returns an immutable instance of [Progress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .failed()
                 * .processed()
                 * .successful()
                 * .total()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Progress =
                    Progress(
                        checkRequired("failed", failed),
                        checkRequired("processed", processed),
                        checkRequired("successful", successful),
                        checkRequired("total", total),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Progress = apply {
                if (validated) {
                    return@apply
                }

                failed()
                processed()
                successful()
                total()
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
                (if (failed.asKnown() == null) 0 else 1) +
                    (if (processed.asKnown() == null) 0 else 1) +
                    (if (successful.asKnown() == null) 0 else 1) +
                    (if (total.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Progress &&
                    failed == other.failed &&
                    processed == other.processed &&
                    successful == other.successful &&
                    total == other.total &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(failed, processed, successful, total, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Progress{failed=$failed, processed=$processed, successful=$successful, total=$total, additionalProperties=$additionalProperties}"
        }

        /** Current status of the job */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val PENDING = of("PENDING")

                val PROCESSING = of("PROCESSING")

                val COMPLETED = of("COMPLETED")

                val FAILED = of("FAILED")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                PENDING,
                PROCESSING,
                COMPLETED,
                FAILED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PENDING,
                PROCESSING,
                COMPLETED,
                FAILED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
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
                    PENDING -> Value.PENDING
                    PROCESSING -> Value.PROCESSING
                    COMPLETED -> Value.COMPLETED
                    FAILED -> Value.FAILED
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
                    PENDING -> Known.PENDING
                    PROCESSING -> Known.PROCESSING
                    COMPLETED -> Known.COMPLETED
                    FAILED -> Known.FAILED
                    else -> throw LightsparkGridInvalidDataException("Unknown Status: $value")
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

            fun validate(): Status = apply {
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

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Error
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val correlationId: JsonField<String>,
            private val code: JsonField<String>,
            private val details: JsonField<Details>,
            private val message: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("correlationId")
                @ExcludeMissing
                correlationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
                @JsonProperty("details")
                @ExcludeMissing
                details: JsonField<Details> = JsonMissing.of(),
                @JsonProperty("message")
                @ExcludeMissing
                message: JsonField<String> = JsonMissing.of(),
            ) : this(correlationId, code, details, message, mutableMapOf())

            /**
             * Platform customer ID or row number for the failed entry
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun correlationId(): String = correlationId.getRequired("correlationId")

            /**
             * Error code
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun code(): String? = code.getNullable("code")

            /**
             * Additional error details
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun details(): Details? = details.getNullable("details")

            /**
             * Error message
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   (e.g. if the server responded with an unexpected value).
             */
            fun message(): String? = message.getNullable("message")

            /**
             * Returns the raw JSON value of [correlationId].
             *
             * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("correlationId")
            @ExcludeMissing
            fun _correlationId(): JsonField<String> = correlationId

            /**
             * Returns the raw JSON value of [code].
             *
             * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

            /**
             * Returns the raw JSON value of [details].
             *
             * Unlike [details], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("details") @ExcludeMissing fun _details(): JsonField<Details> = details

            /**
             * Returns the raw JSON value of [message].
             *
             * Unlike [message], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("message") @ExcludeMissing fun _message(): JsonField<String> = message

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
                 * Returns a mutable builder for constructing an instance of [Error].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .correlationId()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Error]. */
            class Builder internal constructor() {

                private var correlationId: JsonField<String>? = null
                private var code: JsonField<String> = JsonMissing.of()
                private var details: JsonField<Details> = JsonMissing.of()
                private var message: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(error: Error) = apply {
                    correlationId = error.correlationId
                    code = error.code
                    details = error.details
                    message = error.message
                    additionalProperties = error.additionalProperties.toMutableMap()
                }

                /** Platform customer ID or row number for the failed entry */
                fun correlationId(correlationId: String) =
                    correlationId(JsonField.of(correlationId))

                /**
                 * Sets [Builder.correlationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.correlationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun correlationId(correlationId: JsonField<String>) = apply {
                    this.correlationId = correlationId
                }

                /** Error code */
                fun code(code: String) = code(JsonField.of(code))

                /**
                 * Sets [Builder.code] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.code] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun code(code: JsonField<String>) = apply { this.code = code }

                /** Additional error details */
                fun details(details: Details) = details(JsonField.of(details))

                /**
                 * Sets [Builder.details] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.details] with a well-typed [Details] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun details(details: JsonField<Details>) = apply { this.details = details }

                /** Error message */
                fun message(message: String) = message(JsonField.of(message))

                /**
                 * Sets [Builder.message] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.message] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun message(message: JsonField<String>) = apply { this.message = message }

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
                 * Returns an immutable instance of [Error].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .correlationId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Error =
                    Error(
                        checkRequired("correlationId", correlationId),
                        code,
                        details,
                        message,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Error = apply {
                if (validated) {
                    return@apply
                }

                correlationId()
                code()
                details()?.validate()
                message()
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
                (if (correlationId.asKnown() == null) 0 else 1) +
                    (if (code.asKnown() == null) 0 else 1) +
                    (details.asKnown()?.validity() ?: 0) +
                    (if (message.asKnown() == null) 0 else 1)

            /** Additional error details */
            class Details
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

                    /** Returns a mutable builder for constructing an instance of [Details]. */
                    fun builder() = Builder()
                }

                /** A builder for [Details]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(details: Details) = apply {
                        additionalProperties = details.additionalProperties.toMutableMap()
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
                     * Returns an immutable instance of [Details].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Details = Details(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                fun validate(): Details = apply {
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
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Details && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "Details{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Error &&
                    correlationId == other.correlationId &&
                    code == other.code &&
                    details == other.details &&
                    message == other.message &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(correlationId, code, details, message, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Error{correlationId=$correlationId, code=$code, details=$details, message=$message, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BulkCustomerImportJob &&
                jobId == other.jobId &&
                progress == other.progress &&
                status == other.status &&
                completedAt == other.completedAt &&
                errors == other.errors &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(jobId, progress, status, completedAt, errors, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BulkCustomerImportJob{jobId=$jobId, progress=$progress, status=$status, completedAt=$completedAt, errors=$errors, additionalProperties=$additionalProperties}"
    }

    /** Type of webhook event */
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

            val INCOMING_PAYMENT = of("INCOMING_PAYMENT")

            val OUTGOING_PAYMENT = of("OUTGOING_PAYMENT")

            val TEST = of("TEST")

            val BULK_UPLOAD = of("BULK_UPLOAD")

            val INVITATION_CLAIMED = of("INVITATION_CLAIMED")

            val KYC_STATUS = of("KYC_STATUS")

            val ACCOUNT_STATUS = of("ACCOUNT_STATUS")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            INCOMING_PAYMENT,
            OUTGOING_PAYMENT,
            TEST,
            BULK_UPLOAD,
            INVITATION_CLAIMED,
            KYC_STATUS,
            ACCOUNT_STATUS,
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
            INCOMING_PAYMENT,
            OUTGOING_PAYMENT,
            TEST,
            BULK_UPLOAD,
            INVITATION_CLAIMED,
            KYC_STATUS,
            ACCOUNT_STATUS,
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
                INCOMING_PAYMENT -> Value.INCOMING_PAYMENT
                OUTGOING_PAYMENT -> Value.OUTGOING_PAYMENT
                TEST -> Value.TEST
                BULK_UPLOAD -> Value.BULK_UPLOAD
                INVITATION_CLAIMED -> Value.INVITATION_CLAIMED
                KYC_STATUS -> Value.KYC_STATUS
                ACCOUNT_STATUS -> Value.ACCOUNT_STATUS
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
                INCOMING_PAYMENT -> Known.INCOMING_PAYMENT
                OUTGOING_PAYMENT -> Known.OUTGOING_PAYMENT
                TEST -> Known.TEST
                BULK_UPLOAD -> Known.BULK_UPLOAD
                INVITATION_CLAIMED -> Known.INVITATION_CLAIMED
                KYC_STATUS -> Known.KYC_STATUS
                ACCOUNT_STATUS -> Known.ACCOUNT_STATUS
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

        return other is BulkUploadWebhookEvent &&
            bulkCustomerImportJob == other.bulkCustomerImportJob &&
            timestamp == other.timestamp &&
            type == other.type &&
            webhookId == other.webhookId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(bulkCustomerImportJob, timestamp, type, webhookId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "BulkUploadWebhookEvent{bulkCustomerImportJob=$bulkCustomerImportJob, timestamp=$timestamp, type=$type, webhookId=$webhookId, additionalProperties=$additionalProperties}"
}
