// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

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
import com.lightspark.grid.core.Enum
import com.lightspark.grid.core.ExcludeMissing
import com.lightspark.grid.core.JsonField
import com.lightspark.grid.core.JsonMissing
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.getOrThrow
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

class WalletOperationWebhookEvent
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
         * Returns a mutable builder for constructing an instance of [WalletOperationWebhookEvent].
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

    /** A builder for [WalletOperationWebhookEvent]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var data: JsonField<Data>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(walletOperationWebhookEvent: WalletOperationWebhookEvent) = apply {
            id = walletOperationWebhookEvent.id
            data = walletOperationWebhookEvent.data
            timestamp = walletOperationWebhookEvent.timestamp
            type = walletOperationWebhookEvent.type
            additionalProperties = walletOperationWebhookEvent.additionalProperties.toMutableMap()
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

        /** Alias for calling [data] with `Data.ofCompleted(completed)`. */
        fun data(completed: Data.Completed) = data(Data.ofCompleted(completed))

        /** Alias for calling [data] with `Data.ofFailed(failed)`. */
        fun data(failed: Data.Failed) = data(Data.ofFailed(failed))

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
         * Returns an immutable instance of [WalletOperationWebhookEvent].
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
        fun build(): WalletOperationWebhookEvent =
            WalletOperationWebhookEvent(
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
    fun validate(): WalletOperationWebhookEvent = apply {
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

    @JsonDeserialize(using = Data.Deserializer::class)
    @JsonSerialize(using = Data.Serializer::class)
    class Data
    private constructor(
        private val completed: Completed? = null,
        private val failed: Failed? = null,
        private val _json: JsonValue? = null,
    ) {

        fun completed(): Completed? = completed

        fun failed(): Failed? = failed

        fun isCompleted(): Boolean = completed != null

        fun isFailed(): Boolean = failed != null

        fun asCompleted(): Completed = completed.getOrThrow("completed")

        fun asFailed(): Failed = failed.getOrThrow("failed")

        fun _json(): JsonValue? = _json

        /**
         * Maps this instance's current variant to a value of type [T] using the given [visitor].
         *
         * Note that this method is _not_ forwards compatible with new variants from the API, unless
         * [visitor] overrides [Visitor.unknown]. To handle variants not known to this version of
         * the SDK gracefully, consider overriding [Visitor.unknown]:
         * ```kotlin
         * import com.lightspark.grid.core.JsonValue
         *
         * val result: String? = data.accept(object : Data.Visitor<String?> {
         *     override fun visitCompleted(completed: Completed): String? = completed.toString()
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
                completed != null -> visitor.visitCompleted(completed)
                failed != null -> visitor.visitFailed(failed)
                else -> visitor.unknown(_json)
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

            accept(
                object : Visitor<Unit> {
                    override fun visitCompleted(completed: Completed) {
                        completed.validate()
                    }

                    override fun visitFailed(failed: Failed) {
                        failed.validate()
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
                    override fun visitCompleted(completed: Completed) = completed.validity()

                    override fun visitFailed(failed: Failed) = failed.validity()

                    override fun unknown(json: JsonValue?) = 0
                }
            )

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data && completed == other.completed && failed == other.failed
        }

        override fun hashCode(): Int = Objects.hash(completed, failed)

        override fun toString(): String =
            when {
                completed != null -> "Data{completed=$completed}"
                failed != null -> "Data{failed=$failed}"
                _json != null -> "Data{_unknown=$_json}"
                else -> throw IllegalStateException("Invalid Data")
            }

        companion object {

            fun ofCompleted(completed: Completed) = Data(completed = completed)

            fun ofFailed(failed: Failed) = Data(failed = failed)
        }

        /** An interface that defines how to map each variant of [Data] to a value of type [T]. */
        interface Visitor<out T> {

            fun visitCompleted(completed: Completed): T

            fun visitFailed(failed: Failed): T

            /**
             * Maps an unknown variant of [Data] to a value of type [T].
             *
             * An instance of [Data] can contain an unknown variant if it was deserialized from data
             * that doesn't match any known variant. For example, if the SDK is on an older version
             * than the API, then the API may respond with new variants that the SDK is unaware of.
             *
             * @throws LightsparkGridInvalidDataException in the default implementation.
             */
            fun unknown(json: JsonValue?): T {
                throw LightsparkGridInvalidDataException("Unknown Data: $json")
            }
        }

        internal class Deserializer : BaseDeserializer<Data>(Data::class) {

            override fun ObjectCodec.deserialize(node: JsonNode): Data {
                val json = JsonValue.fromJsonNode(node)
                val status = json.asObject()?.get("status")?.asString()

                when (status) {
                    "completed" -> {
                        return tryDeserialize(node, jacksonTypeRef<Completed>())?.let {
                            Data(completed = it, _json = json)
                        } ?: Data(_json = json)
                    }
                    "failed" -> {
                        return tryDeserialize(node, jacksonTypeRef<Failed>())?.let {
                            Data(failed = it, _json = json)
                        } ?: Data(_json = json)
                    }
                }

                return Data(_json = json)
            }
        }

        internal class Serializer : BaseSerializer<Data>(Data::class) {

            override fun serialize(
                value: Data,
                generator: JsonGenerator,
                provider: SerializerProvider,
            ) {
                when {
                    value.completed != null -> generator.writeObject(value.completed)
                    value.failed != null -> generator.writeObject(value.failed)
                    value._json != null -> generator.writeObject(value._json)
                    else -> throw IllegalStateException("Invalid Data")
                }
            }
        }

        class Completed
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val operationId: JsonField<String>,
            private val operationType: JsonField<OperationType>,
            private val requestId: JsonField<String>,
            private val resourceId: JsonField<String>,
            private val resourceType: JsonField<ResourceType>,
            private val status: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("operationId")
                @ExcludeMissing
                operationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operationType")
                @ExcludeMissing
                operationType: JsonField<OperationType> = JsonMissing.of(),
                @JsonProperty("requestId")
                @ExcludeMissing
                requestId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resourceId")
                @ExcludeMissing
                resourceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resourceType")
                @ExcludeMissing
                resourceType: JsonField<ResourceType> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonValue = JsonMissing.of(),
            ) : this(
                operationId,
                operationType,
                requestId,
                resourceId,
                resourceType,
                status,
                mutableMapOf(),
            )

            /**
             * Grid-internal identifier for this operation. Useful when contacting support about a
             * specific operation; not a correlation key — use `requestId` to match this webhook to
             * the request you made.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operationId(): String = operationId.getRequired("operationId")

            /**
             * The kind of operation that reached a terminal state.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operationType(): OperationType = operationType.getRequired("operationType")

            /**
             * The `Request-Id` you supplied on the signed retry that produced this terminal result
             * — the same value you would have echoed on every retry had you received a `200 {
             * status: "PROCESSING" }` response while it was settling. This is the primary way to
             * correlate this webhook to the request you made.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requestId(): String = requestId.getRequired("requestId")

            /**
             * LSID of the business resource this operation affected. For `auth_credential.create`,
             * this is the **primary way to learn the new credential's id** — the request that
             * created it can't have supplied one in advance. For `auth_credential.delete` and
             * `session.revoke` it echoes the `AuthMethod:<uuid>` / `Session:<uuid>` you already
             * knew and referenced in the request; for `wallet.export` it's the
             * `InternalAccount:<uuid>` whose wallet was exported.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun resourceId(): String = resourceId.getRequired("resourceId")

            /**
             * The kind of business resource `resourceId` identifies. Determined by `operationType`:
             * `auth_credential.create` and `auth_credential.delete` → `AUTH_METHOD`,
             * `session.revoke` → `SESSION`, `wallet.export` → `INTERNAL_ACCOUNT`.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun resourceType(): ResourceType = resourceType.getRequired("resourceType")

            /**
             * Terminal status of the operation.
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("completed")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonValue = status

            /**
             * Returns the raw JSON value of [operationId].
             *
             * Unlike [operationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operationId")
            @ExcludeMissing
            fun _operationId(): JsonField<String> = operationId

            /**
             * Returns the raw JSON value of [operationType].
             *
             * Unlike [operationType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operationType")
            @ExcludeMissing
            fun _operationType(): JsonField<OperationType> = operationType

            /**
             * Returns the raw JSON value of [requestId].
             *
             * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requestId")
            @ExcludeMissing
            fun _requestId(): JsonField<String> = requestId

            /**
             * Returns the raw JSON value of [resourceId].
             *
             * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resourceId")
            @ExcludeMissing
            fun _resourceId(): JsonField<String> = resourceId

            /**
             * Returns the raw JSON value of [resourceType].
             *
             * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resourceType")
            @ExcludeMissing
            fun _resourceType(): JsonField<ResourceType> = resourceType

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
                 * Returns a mutable builder for constructing an instance of [Completed].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .operationId()
                 * .operationType()
                 * .requestId()
                 * .resourceId()
                 * .resourceType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Completed]. */
            class Builder internal constructor() {

                private var operationId: JsonField<String>? = null
                private var operationType: JsonField<OperationType>? = null
                private var requestId: JsonField<String>? = null
                private var resourceId: JsonField<String>? = null
                private var resourceType: JsonField<ResourceType>? = null
                private var status: JsonValue = JsonValue.from("completed")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(completed: Completed) = apply {
                    operationId = completed.operationId
                    operationType = completed.operationType
                    requestId = completed.requestId
                    resourceId = completed.resourceId
                    resourceType = completed.resourceType
                    status = completed.status
                    additionalProperties = completed.additionalProperties.toMutableMap()
                }

                /**
                 * Grid-internal identifier for this operation. Useful when contacting support about
                 * a specific operation; not a correlation key — use `requestId` to match this
                 * webhook to the request you made.
                 */
                fun operationId(operationId: String) = operationId(JsonField.of(operationId))

                /**
                 * Sets [Builder.operationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operationId(operationId: JsonField<String>) = apply {
                    this.operationId = operationId
                }

                /** The kind of operation that reached a terminal state. */
                fun operationType(operationType: OperationType) =
                    operationType(JsonField.of(operationType))

                /**
                 * Sets [Builder.operationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operationType] with a well-typed [OperationType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun operationType(operationType: JsonField<OperationType>) = apply {
                    this.operationType = operationType
                }

                /**
                 * The `Request-Id` you supplied on the signed retry that produced this terminal
                 * result — the same value you would have echoed on every retry had you received a
                 * `200 { status: "PROCESSING" }` response while it was settling. This is the
                 * primary way to correlate this webhook to the request you made.
                 */
                fun requestId(requestId: String) = requestId(JsonField.of(requestId))

                /**
                 * Sets [Builder.requestId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

                /**
                 * LSID of the business resource this operation affected. For
                 * `auth_credential.create`, this is the **primary way to learn the new credential's
                 * id** — the request that created it can't have supplied one in advance. For
                 * `auth_credential.delete` and `session.revoke` it echoes the `AuthMethod:<uuid>` /
                 * `Session:<uuid>` you already knew and referenced in the request; for
                 * `wallet.export` it's the `InternalAccount:<uuid>` whose wallet was exported.
                 */
                fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

                /**
                 * Sets [Builder.resourceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resourceId(resourceId: JsonField<String>) = apply {
                    this.resourceId = resourceId
                }

                /**
                 * The kind of business resource `resourceId` identifies. Determined by
                 * `operationType`: `auth_credential.create` and `auth_credential.delete` →
                 * `AUTH_METHOD`, `session.revoke` → `SESSION`, `wallet.export` →
                 * `INTERNAL_ACCOUNT`.
                 */
                fun resourceType(resourceType: ResourceType) =
                    resourceType(JsonField.of(resourceType))

                /**
                 * Sets [Builder.resourceType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resourceType] with a well-typed [ResourceType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun resourceType(resourceType: JsonField<ResourceType>) = apply {
                    this.resourceType = resourceType
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("completed")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun status(status: JsonValue) = apply { this.status = status }

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
                 * Returns an immutable instance of [Completed].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .operationId()
                 * .operationType()
                 * .requestId()
                 * .resourceId()
                 * .resourceType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Completed =
                    Completed(
                        checkRequired("operationId", operationId),
                        checkRequired("operationType", operationType),
                        checkRequired("requestId", requestId),
                        checkRequired("resourceId", resourceId),
                        checkRequired("resourceType", resourceType),
                        status,
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
            fun validate(): Completed = apply {
                if (validated) {
                    return@apply
                }

                operationId()
                operationType().validate()
                requestId()
                resourceId()
                resourceType().validate()
                _status().let {
                    if (it != JsonValue.from("completed")) {
                        throw LightsparkGridInvalidDataException(
                            "'status' is invalid, received $it"
                        )
                    }
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
                (if (operationId.asKnown() == null) 0 else 1) +
                    (operationType.asKnown()?.validity() ?: 0) +
                    (if (requestId.asKnown() == null) 0 else 1) +
                    (if (resourceId.asKnown() == null) 0 else 1) +
                    (resourceType.asKnown()?.validity() ?: 0) +
                    status.let { if (it == JsonValue.from("completed")) 1 else 0 }

            /** The kind of operation that reached a terminal state. */
            class OperationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AUTH_CREDENTIAL_CREATE = of("auth_credential.create")

                    val AUTH_CREDENTIAL_DELETE = of("auth_credential.delete")

                    val SESSION_REVOKE = of("session.revoke")

                    val WALLET_EXPORT = of("wallet.export")

                    fun of(value: String) = OperationType(JsonField.of(value))
                }

                /** An enum containing [OperationType]'s known values. */
                enum class Known {
                    AUTH_CREDENTIAL_CREATE,
                    AUTH_CREDENTIAL_DELETE,
                    SESSION_REVOKE,
                    WALLET_EXPORT,
                }

                /**
                 * An enum containing [OperationType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OperationType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTH_CREDENTIAL_CREATE,
                    AUTH_CREDENTIAL_DELETE,
                    SESSION_REVOKE,
                    WALLET_EXPORT,
                    /**
                     * An enum member indicating that [OperationType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTH_CREDENTIAL_CREATE -> Value.AUTH_CREDENTIAL_CREATE
                        AUTH_CREDENTIAL_DELETE -> Value.AUTH_CREDENTIAL_DELETE
                        SESSION_REVOKE -> Value.SESSION_REVOKE
                        WALLET_EXPORT -> Value.WALLET_EXPORT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTH_CREDENTIAL_CREATE -> Known.AUTH_CREDENTIAL_CREATE
                        AUTH_CREDENTIAL_DELETE -> Known.AUTH_CREDENTIAL_DELETE
                        SESSION_REVOKE -> Known.SESSION_REVOKE
                        WALLET_EXPORT -> Known.WALLET_EXPORT
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown OperationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): OperationType = apply {
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

                    return other is OperationType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The kind of business resource `resourceId` identifies. Determined by `operationType`:
             * `auth_credential.create` and `auth_credential.delete` → `AUTH_METHOD`,
             * `session.revoke` → `SESSION`, `wallet.export` → `INTERNAL_ACCOUNT`.
             */
            class ResourceType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AUTH_METHOD = of("AUTH_METHOD")

                    val SESSION = of("SESSION")

                    val INTERNAL_ACCOUNT = of("INTERNAL_ACCOUNT")

                    fun of(value: String) = ResourceType(JsonField.of(value))
                }

                /** An enum containing [ResourceType]'s known values. */
                enum class Known {
                    AUTH_METHOD,
                    SESSION,
                    INTERNAL_ACCOUNT,
                }

                /**
                 * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResourceType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTH_METHOD,
                    SESSION,
                    INTERNAL_ACCOUNT,
                    /**
                     * An enum member indicating that [ResourceType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTH_METHOD -> Value.AUTH_METHOD
                        SESSION -> Value.SESSION
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTH_METHOD -> Known.AUTH_METHOD
                        SESSION -> Known.SESSION
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown ResourceType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): ResourceType = apply {
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

                    return other is ResourceType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Completed &&
                    operationId == other.operationId &&
                    operationType == other.operationType &&
                    requestId == other.requestId &&
                    resourceId == other.resourceId &&
                    resourceType == other.resourceType &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    operationId,
                    operationType,
                    requestId,
                    resourceId,
                    resourceType,
                    status,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Completed{operationId=$operationId, operationType=$operationType, requestId=$requestId, resourceId=$resourceId, resourceType=$resourceType, status=$status, additionalProperties=$additionalProperties}"
        }

        class Failed
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val error: JsonField<Error>,
            private val operationId: JsonField<String>,
            private val operationType: JsonField<OperationType>,
            private val requestId: JsonField<String>,
            private val resourceId: JsonField<String>,
            private val resourceType: JsonField<ResourceType>,
            private val status: JsonValue,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("error") @ExcludeMissing error: JsonField<Error> = JsonMissing.of(),
                @JsonProperty("operationId")
                @ExcludeMissing
                operationId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("operationType")
                @ExcludeMissing
                operationType: JsonField<OperationType> = JsonMissing.of(),
                @JsonProperty("requestId")
                @ExcludeMissing
                requestId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resourceId")
                @ExcludeMissing
                resourceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("resourceType")
                @ExcludeMissing
                resourceType: JsonField<ResourceType> = JsonMissing.of(),
                @JsonProperty("status") @ExcludeMissing status: JsonValue = JsonMissing.of(),
            ) : this(
                error,
                operationId,
                operationType,
                requestId,
                resourceId,
                resourceType,
                status,
                mutableMapOf(),
            )

            /**
             * Failure details for a terminally failed operation.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun error(): Error = error.getRequired("error")

            /**
             * Grid-internal identifier for this operation. Useful when contacting support about a
             * specific operation; not a correlation key — use `requestId` to match this webhook to
             * the request you made.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operationId(): String = operationId.getRequired("operationId")

            /**
             * The kind of operation that reached a terminal state.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operationType(): OperationType = operationType.getRequired("operationType")

            /**
             * The `Request-Id` you supplied on the signed retry that produced this terminal result
             * — the same value you would have echoed on every retry had you received a `200 {
             * status: "PROCESSING" }` response while it was settling. This is the primary way to
             * correlate this webhook to the request you made.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun requestId(): String = requestId.getRequired("requestId")

            /**
             * LSID of the business resource this operation affected. For `auth_credential.create`,
             * this is the **primary way to learn the new credential's id** — the request that
             * created it can't have supplied one in advance. For `auth_credential.delete` and
             * `session.revoke` it echoes the `AuthMethod:<uuid>` / `Session:<uuid>` you already
             * knew and referenced in the request; for `wallet.export` it's the
             * `InternalAccount:<uuid>` whose wallet was exported.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun resourceId(): String = resourceId.getRequired("resourceId")

            /**
             * The kind of business resource `resourceId` identifies. Determined by `operationType`:
             * `auth_credential.create` and `auth_credential.delete` → `AUTH_METHOD`,
             * `session.revoke` → `SESSION`, `wallet.export` → `INTERNAL_ACCOUNT`.
             *
             * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type
             *   or is unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun resourceType(): ResourceType = resourceType.getRequired("resourceType")

            /**
             * Terminal status of the operation.
             *
             * Expected to always return the following:
             * ```kotlin
             * JsonValue.from("failed")
             * ```
             *
             * However, this method can be useful for debugging and logging (e.g. if the server
             * responded with an unexpected value).
             */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonValue = status

            /**
             * Returns the raw JSON value of [error].
             *
             * Unlike [error], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("error") @ExcludeMissing fun _error(): JsonField<Error> = error

            /**
             * Returns the raw JSON value of [operationId].
             *
             * Unlike [operationId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operationId")
            @ExcludeMissing
            fun _operationId(): JsonField<String> = operationId

            /**
             * Returns the raw JSON value of [operationType].
             *
             * Unlike [operationType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operationType")
            @ExcludeMissing
            fun _operationType(): JsonField<OperationType> = operationType

            /**
             * Returns the raw JSON value of [requestId].
             *
             * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("requestId")
            @ExcludeMissing
            fun _requestId(): JsonField<String> = requestId

            /**
             * Returns the raw JSON value of [resourceId].
             *
             * Unlike [resourceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resourceId")
            @ExcludeMissing
            fun _resourceId(): JsonField<String> = resourceId

            /**
             * Returns the raw JSON value of [resourceType].
             *
             * Unlike [resourceType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("resourceType")
            @ExcludeMissing
            fun _resourceType(): JsonField<ResourceType> = resourceType

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
                 * Returns a mutable builder for constructing an instance of [Failed].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .error()
                 * .operationId()
                 * .operationType()
                 * .requestId()
                 * .resourceId()
                 * .resourceType()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Failed]. */
            class Builder internal constructor() {

                private var error: JsonField<Error>? = null
                private var operationId: JsonField<String>? = null
                private var operationType: JsonField<OperationType>? = null
                private var requestId: JsonField<String>? = null
                private var resourceId: JsonField<String>? = null
                private var resourceType: JsonField<ResourceType>? = null
                private var status: JsonValue = JsonValue.from("failed")
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(failed: Failed) = apply {
                    error = failed.error
                    operationId = failed.operationId
                    operationType = failed.operationType
                    requestId = failed.requestId
                    resourceId = failed.resourceId
                    resourceType = failed.resourceType
                    status = failed.status
                    additionalProperties = failed.additionalProperties.toMutableMap()
                }

                /** Failure details for a terminally failed operation. */
                fun error(error: Error) = error(JsonField.of(error))

                /**
                 * Sets [Builder.error] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.error] with a well-typed [Error] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun error(error: JsonField<Error>) = apply { this.error = error }

                /**
                 * Grid-internal identifier for this operation. Useful when contacting support about
                 * a specific operation; not a correlation key — use `requestId` to match this
                 * webhook to the request you made.
                 */
                fun operationId(operationId: String) = operationId(JsonField.of(operationId))

                /**
                 * Sets [Builder.operationId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operationId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operationId(operationId: JsonField<String>) = apply {
                    this.operationId = operationId
                }

                /** The kind of operation that reached a terminal state. */
                fun operationType(operationType: OperationType) =
                    operationType(JsonField.of(operationType))

                /**
                 * Sets [Builder.operationType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operationType] with a well-typed [OperationType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun operationType(operationType: JsonField<OperationType>) = apply {
                    this.operationType = operationType
                }

                /**
                 * The `Request-Id` you supplied on the signed retry that produced this terminal
                 * result — the same value you would have echoed on every retry had you received a
                 * `200 { status: "PROCESSING" }` response while it was settling. This is the
                 * primary way to correlate this webhook to the request you made.
                 */
                fun requestId(requestId: String) = requestId(JsonField.of(requestId))

                /**
                 * Sets [Builder.requestId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.requestId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

                /**
                 * LSID of the business resource this operation affected. For
                 * `auth_credential.create`, this is the **primary way to learn the new credential's
                 * id** — the request that created it can't have supplied one in advance. For
                 * `auth_credential.delete` and `session.revoke` it echoes the `AuthMethod:<uuid>` /
                 * `Session:<uuid>` you already knew and referenced in the request; for
                 * `wallet.export` it's the `InternalAccount:<uuid>` whose wallet was exported.
                 */
                fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

                /**
                 * Sets [Builder.resourceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resourceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun resourceId(resourceId: JsonField<String>) = apply {
                    this.resourceId = resourceId
                }

                /**
                 * The kind of business resource `resourceId` identifies. Determined by
                 * `operationType`: `auth_credential.create` and `auth_credential.delete` →
                 * `AUTH_METHOD`, `session.revoke` → `SESSION`, `wallet.export` →
                 * `INTERNAL_ACCOUNT`.
                 */
                fun resourceType(resourceType: ResourceType) =
                    resourceType(JsonField.of(resourceType))

                /**
                 * Sets [Builder.resourceType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.resourceType] with a well-typed [ResourceType]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun resourceType(resourceType: JsonField<ResourceType>) = apply {
                    this.resourceType = resourceType
                }

                /**
                 * Sets the field to an arbitrary JSON value.
                 *
                 * It is usually unnecessary to call this method because the field defaults to the
                 * following:
                 * ```kotlin
                 * JsonValue.from("failed")
                 * ```
                 *
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun status(status: JsonValue) = apply { this.status = status }

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
                 * Returns an immutable instance of [Failed].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .error()
                 * .operationId()
                 * .operationType()
                 * .requestId()
                 * .resourceId()
                 * .resourceType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Failed =
                    Failed(
                        checkRequired("error", error),
                        checkRequired("operationId", operationId),
                        checkRequired("operationType", operationType),
                        checkRequired("requestId", requestId),
                        checkRequired("resourceId", resourceId),
                        checkRequired("resourceType", resourceType),
                        status,
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
            fun validate(): Failed = apply {
                if (validated) {
                    return@apply
                }

                error().validate()
                operationId()
                operationType().validate()
                requestId()
                resourceId()
                resourceType().validate()
                _status().let {
                    if (it != JsonValue.from("failed")) {
                        throw LightsparkGridInvalidDataException(
                            "'status' is invalid, received $it"
                        )
                    }
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
                (error.asKnown()?.validity() ?: 0) +
                    (if (operationId.asKnown() == null) 0 else 1) +
                    (operationType.asKnown()?.validity() ?: 0) +
                    (if (requestId.asKnown() == null) 0 else 1) +
                    (if (resourceId.asKnown() == null) 0 else 1) +
                    (resourceType.asKnown()?.validity() ?: 0) +
                    status.let { if (it == JsonValue.from("failed")) 1 else 0 }

            /** Failure details for a terminally failed operation. */
            class Error
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val code: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of()
                ) : this(code, mutableMapOf())

                /**
                 * Machine-readable failure code for a `FAILED` operation. Codes are Grid-defined
                 * and stable regardless of which vendor Grid uses under the hood for a given
                 * operation.
                 *
                 * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected
                 *   type or is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun code(): String = code.getRequired("code")

                /**
                 * Returns the raw JSON value of [code].
                 *
                 * Unlike [code], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

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
                     * .code()
                     * ```
                     */
                    fun builder() = Builder()
                }

                /** A builder for [Error]. */
                class Builder internal constructor() {

                    private var code: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(error: Error) = apply {
                        code = error.code
                        additionalProperties = error.additionalProperties.toMutableMap()
                    }

                    /**
                     * Machine-readable failure code for a `FAILED` operation. Codes are
                     * Grid-defined and stable regardless of which vendor Grid uses under the hood
                     * for a given operation.
                     */
                    fun code(code: String) = code(JsonField.of(code))

                    /**
                     * Sets [Builder.code] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.code] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun code(code: JsonField<String>) = apply { this.code = code }

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
                     * .code()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Error =
                        Error(checkRequired("code", code), additionalProperties.toMutableMap())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): Error = apply {
                    if (validated) {
                        return@apply
                    }

                    code()
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
                internal fun validity(): Int = (if (code.asKnown() == null) 0 else 1)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Error &&
                        code == other.code &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(code, additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Error{code=$code, additionalProperties=$additionalProperties}"
            }

            /** The kind of operation that reached a terminal state. */
            class OperationType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AUTH_CREDENTIAL_CREATE = of("auth_credential.create")

                    val AUTH_CREDENTIAL_DELETE = of("auth_credential.delete")

                    val SESSION_REVOKE = of("session.revoke")

                    val WALLET_EXPORT = of("wallet.export")

                    fun of(value: String) = OperationType(JsonField.of(value))
                }

                /** An enum containing [OperationType]'s known values. */
                enum class Known {
                    AUTH_CREDENTIAL_CREATE,
                    AUTH_CREDENTIAL_DELETE,
                    SESSION_REVOKE,
                    WALLET_EXPORT,
                }

                /**
                 * An enum containing [OperationType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [OperationType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTH_CREDENTIAL_CREATE,
                    AUTH_CREDENTIAL_DELETE,
                    SESSION_REVOKE,
                    WALLET_EXPORT,
                    /**
                     * An enum member indicating that [OperationType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTH_CREDENTIAL_CREATE -> Value.AUTH_CREDENTIAL_CREATE
                        AUTH_CREDENTIAL_DELETE -> Value.AUTH_CREDENTIAL_DELETE
                        SESSION_REVOKE -> Value.SESSION_REVOKE
                        WALLET_EXPORT -> Value.WALLET_EXPORT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTH_CREDENTIAL_CREATE -> Known.AUTH_CREDENTIAL_CREATE
                        AUTH_CREDENTIAL_DELETE -> Known.AUTH_CREDENTIAL_DELETE
                        SESSION_REVOKE -> Known.SESSION_REVOKE
                        WALLET_EXPORT -> Known.WALLET_EXPORT
                        else ->
                            throw LightsparkGridInvalidDataException(
                                "Unknown OperationType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): OperationType = apply {
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

                    return other is OperationType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The kind of business resource `resourceId` identifies. Determined by `operationType`:
             * `auth_credential.create` and `auth_credential.delete` → `AUTH_METHOD`,
             * `session.revoke` → `SESSION`, `wallet.export` → `INTERNAL_ACCOUNT`.
             */
            class ResourceType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val AUTH_METHOD = of("AUTH_METHOD")

                    val SESSION = of("SESSION")

                    val INTERNAL_ACCOUNT = of("INTERNAL_ACCOUNT")

                    fun of(value: String) = ResourceType(JsonField.of(value))
                }

                /** An enum containing [ResourceType]'s known values. */
                enum class Known {
                    AUTH_METHOD,
                    SESSION,
                    INTERNAL_ACCOUNT,
                }

                /**
                 * An enum containing [ResourceType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResourceType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTH_METHOD,
                    SESSION,
                    INTERNAL_ACCOUNT,
                    /**
                     * An enum member indicating that [ResourceType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTH_METHOD -> Value.AUTH_METHOD
                        SESSION -> Value.SESSION
                        INTERNAL_ACCOUNT -> Value.INTERNAL_ACCOUNT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value is a
                 *   not a known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTH_METHOD -> Known.AUTH_METHOD
                        SESSION -> Known.SESSION
                        INTERNAL_ACCOUNT -> Known.INTERNAL_ACCOUNT
                        else ->
                            throw LightsparkGridInvalidDataException("Unknown ResourceType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LightsparkGridInvalidDataException if this class instance's value does
                 *   not have the expected primitive type.
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
                 * @throws LightsparkGridInvalidDataException if any value type in this object
                 *   doesn't match its expected type.
                 */
                fun validate(): ResourceType = apply {
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

                    return other is ResourceType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Failed &&
                    error == other.error &&
                    operationId == other.operationId &&
                    operationType == other.operationType &&
                    requestId == other.requestId &&
                    resourceId == other.resourceId &&
                    resourceType == other.resourceType &&
                    status == other.status &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    error,
                    operationId,
                    operationType,
                    requestId,
                    resourceId,
                    resourceType,
                    status,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Failed{error=$error, operationId=$operationId, operationType=$operationType, requestId=$requestId, resourceId=$resourceId, resourceType=$resourceType, status=$status, additionalProperties=$additionalProperties}"
        }
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

            val WALLET_OPERATION_COMPLETED = of("WALLET_OPERATION.COMPLETED")

            val WALLET_OPERATION_FAILED = of("WALLET_OPERATION.FAILED")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            WALLET_OPERATION_COMPLETED,
            WALLET_OPERATION_FAILED,
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
            WALLET_OPERATION_COMPLETED,
            WALLET_OPERATION_FAILED,
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
                WALLET_OPERATION_COMPLETED -> Value.WALLET_OPERATION_COMPLETED
                WALLET_OPERATION_FAILED -> Value.WALLET_OPERATION_FAILED
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
                WALLET_OPERATION_COMPLETED -> Known.WALLET_OPERATION_COMPLETED
                WALLET_OPERATION_FAILED -> Known.WALLET_OPERATION_FAILED
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

        return other is WalletOperationWebhookEvent &&
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
        "WalletOperationWebhookEvent{id=$id, data=$data, timestamp=$timestamp, type=$type, additionalProperties=$additionalProperties}"
}
