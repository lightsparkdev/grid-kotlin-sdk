// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
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
    private val authSessionRefreshRequest: AuthSessionRefreshRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * Request body for refreshing an active authentication session. The `clientPublicKey` is
     * required on both steps of the signed-retry flow. On the initial call, Grid binds this key
     * into the Turnkey session-creation payload returned as `payloadToSign`; on the signed retry,
     * the client echoes the same key back and Grid uses it to encrypt the newly issued session
     * signing key.
     */
    fun authSessionRefreshRequest(): AuthSessionRefreshRequest = authSessionRefreshRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        authSessionRefreshRequest._additionalProperties()

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
         * .authSessionRefreshRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SessionRefreshParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var authSessionRefreshRequest: AuthSessionRefreshRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(sessionRefreshParams: SessionRefreshParams) = apply {
            id = sessionRefreshParams.id
            gridWalletSignature = sessionRefreshParams.gridWalletSignature
            requestId = sessionRefreshParams.requestId
            authSessionRefreshRequest = sessionRefreshParams.authSessionRefreshRequest
            additionalHeaders = sessionRefreshParams.additionalHeaders.toBuilder()
            additionalQueryParams = sessionRefreshParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Request body for refreshing an active authentication session. The `clientPublicKey` is
         * required on both steps of the signed-retry flow. On the initial call, Grid binds this key
         * into the Turnkey session-creation payload returned as `payloadToSign`; on the signed
         * retry, the client echoes the same key back and Grid uses it to encrypt the newly issued
         * session signing key.
         */
        fun authSessionRefreshRequest(authSessionRefreshRequest: AuthSessionRefreshRequest) =
            apply {
                this.authSessionRefreshRequest = authSessionRefreshRequest
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
         * .authSessionRefreshRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SessionRefreshParams =
            SessionRefreshParams(
                id,
                gridWalletSignature,
                requestId,
                checkRequired("authSessionRefreshRequest", authSessionRefreshRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): AuthSessionRefreshRequest = authSessionRefreshRequest

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SessionRefreshParams &&
            id == other.id &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            authSessionRefreshRequest == other.authSessionRefreshRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            gridWalletSignature,
            requestId,
            authSessionRefreshRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "SessionRefreshParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, authSessionRefreshRequest=$authSessionRefreshRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
