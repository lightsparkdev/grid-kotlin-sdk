// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

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
import java.util.Collections
import java.util.Objects

/**
 * Refresh an active Embedded Wallet auth session and create a new session signing key. Session
 * refresh is a two-step signed-retry flow:
 * 1. Call `POST /auth/sessions/{id}/refresh` with the request body `{ "clientPublicKey": "04..." }`
 *    and no signature headers. Grid builds a Turnkey create-read-write-session payload, binds the
 *    supplied `clientPublicKey` into that payload, persists it as a pending request, and returns
 *    `202` with `payloadToSign`, `requestId`, and `expiresAt`.
 * 2. Sign `payloadToSign` with the current session signing key, then retry the same request with
 *    the full API-key stamp as `Grid-Wallet-Signature`, the `requestId` echoed back as
 *    `Request-Id`, and the same `clientPublicKey` in the request body. On success, Grid returns a
 *    new `AuthSession` with an `encryptedSessionSigningKey` sealed to that client public key.
 *
 * The original session must still be active on both steps so it can authorize the refresh. If the
 * session has already expired, use the credential reauthentication flow instead.
 */
class SessionRefreshParams
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
     * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (`04` prefix
     * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The matching
     * private key must remain on the client. Grid binds this key into the session-creation payload
     * on the initial call and seals the returned `encryptedSessionSigningKey` to it on the signed
     * retry.
     *
     * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun clientPublicKey(): String = body.clientPublicKey()

    /**
     * Returns the raw JSON value of [clientPublicKey].
     *
     * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientPublicKey(): JsonField<String> = body._clientPublicKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SessionRefreshParams].
         *
         * The following fields are required:
         * ```kotlin
         * .clientPublicKey()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SessionRefreshParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(sessionRefreshParams: SessionRefreshParams) = apply {
            id = sessionRefreshParams.id
            gridWalletSignature = sessionRefreshParams.gridWalletSignature
            requestId = sessionRefreshParams.requestId
            body = sessionRefreshParams.body.toBuilder()
            additionalHeaders = sessionRefreshParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionRefreshParams.additionalQueryParams.toBuilder()
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
         * - [clientPublicKey]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (`04` prefix
         * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The
         * matching private key must remain on the client. Grid binds this key into the
         * session-creation payload on the initial call and seals the returned
         * `encryptedSessionSigningKey` to it on the signed retry.
         */
        fun clientPublicKey(clientPublicKey: String) = apply {
            body.clientPublicKey(clientPublicKey)
        }

        /**
         * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientPublicKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
            body.clientPublicKey(clientPublicKey)
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
         * Returns an immutable instance of [SessionRefreshParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .clientPublicKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionRefreshParams =
            SessionRefreshParams(
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
     * Request body for refreshing an active authentication session. The `clientPublicKey` is
     * required on both steps of the signed-retry flow. On the initial call, Grid binds this key
     * into the Turnkey session-creation payload returned as `payloadToSign`; on the signed retry,
     * the client echoes the same key back and Grid uses it to encrypt the newly issued session
     * signing key.
     */
    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val clientPublicKey: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("clientPublicKey")
            @ExcludeMissing
            clientPublicKey: JsonField<String> = JsonMissing.of()
        ) : this(clientPublicKey, mutableMapOf())

        /**
         * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (`04` prefix
         * followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters total). The
         * matching private key must remain on the client. Grid binds this key into the
         * session-creation payload on the initial call and seals the returned
         * `encryptedSessionSigningKey` to it on the signed retry.
         *
         * @throws LightsparkGridInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun clientPublicKey(): String = clientPublicKey.getRequired("clientPublicKey")

        /**
         * Returns the raw JSON value of [clientPublicKey].
         *
         * Unlike [clientPublicKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("clientPublicKey")
        @ExcludeMissing
        fun _clientPublicKey(): JsonField<String> = clientPublicKey

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
             * .clientPublicKey()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var clientPublicKey: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                clientPublicKey = body.clientPublicKey
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * Client-generated P-256 public key, hex-encoded in uncompressed SEC1 format (`04`
             * prefix followed by the 32-byte X and 32-byte Y coordinates; 130 hex characters
             * total). The matching private key must remain on the client. Grid binds this key into
             * the session-creation payload on the initial call and seals the returned
             * `encryptedSessionSigningKey` to it on the signed retry.
             */
            fun clientPublicKey(clientPublicKey: String) =
                clientPublicKey(JsonField.of(clientPublicKey))

            /**
             * Sets [Builder.clientPublicKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientPublicKey] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientPublicKey(clientPublicKey: JsonField<String>) = apply {
                this.clientPublicKey = clientPublicKey
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
             * .clientPublicKey()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("clientPublicKey", clientPublicKey),
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

            clientPublicKey()
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
        internal fun validity(): Int = (if (clientPublicKey.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                clientPublicKey == other.clientPublicKey &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(clientPublicKey, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{clientPublicKey=$clientPublicKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionRefreshParams &&
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
        "SessionRefreshParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
