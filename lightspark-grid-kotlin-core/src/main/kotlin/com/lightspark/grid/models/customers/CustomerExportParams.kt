// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Export the wallet credentials of an Embedded Wallet internal account. The returned wallet
 * credentials are HPKE-encrypted to the `clientPublicKey` supplied in the request body.
 *
 * Export is a two-step signed-retry flow (same pattern as add-additional credential, revoke
 * credential, and revoke session):
 * 1. Call `POST /internal-accounts/{id}/export` with the request body `{ "clientPublicKey": "..."
 *    }` and no signature headers. Grid binds the `clientPublicKey` into the `payloadToSign` it
 *    returns, so the subsequent stamp in `Grid-Wallet-Signature` commits to the target encryption
 *    key. The response is `202` with `payloadToSign`, `requestId`, and `expiresAt`.
 * 2. Use the session API keypair of a verified authentication credential on the same internal
 *    account to build an API-key stamp over `payloadToSign`, then retry with that full stamp as the
 *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header. The
 *    retry body must carry the **same** `clientPublicKey` submitted in step 1 — Grid rejects the
 *    retry with `401` if it disagrees with what was bound into `payloadToSign`. The signed retry
 *    returns `200` with `encryptedWalletCredentials`, which the client decrypts with the matching
 *    private key.
 *
 * The `clientPublicKey` is ephemeral: generate a fresh P-256 keypair for this export and discard
 * the private key after decrypting. Do not reuse the keypair from any prior verify call — that
 * private key was already discarded after decrypting the session signing key it was issued against.
 */
class CustomerExportParams
private constructor(
    private val id: String?,
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val internalAccountExportRequest: InternalAccountExportRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * Request body for `POST /internal-accounts/{id}/export`. The `clientPublicKey` is required on
     * both steps of the signed-retry flow. On step 1 Grid binds it into `payloadToSign` so the
     * subsequent stamp in `Grid-Wallet-Signature` commits to the target pubkey; on step 2 the
     * client echoes the same `clientPublicKey` back and Grid uses it to encrypt the wallet
     * credentials returned in the `200` response.
     */
    fun internalAccountExportRequest(): InternalAccountExportRequest = internalAccountExportRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        internalAccountExportRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerExportParams].
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountExportRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerExportParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var internalAccountExportRequest: InternalAccountExportRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerExportParams: CustomerExportParams) = apply {
            id = customerExportParams.id
            gridWalletSignature = customerExportParams.gridWalletSignature
            requestId = customerExportParams.requestId
            internalAccountExportRequest = customerExportParams.internalAccountExportRequest
            additionalHeaders = customerExportParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerExportParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Request body for `POST /internal-accounts/{id}/export`. The `clientPublicKey` is required
         * on both steps of the signed-retry flow. On step 1 Grid binds it into `payloadToSign` so
         * the subsequent stamp in `Grid-Wallet-Signature` commits to the target pubkey; on step 2
         * the client echoes the same `clientPublicKey` back and Grid uses it to encrypt the wallet
         * credentials returned in the `200` response.
         */
        fun internalAccountExportRequest(
            internalAccountExportRequest: InternalAccountExportRequest
        ) = apply { this.internalAccountExportRequest = internalAccountExportRequest }

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
         * Returns an immutable instance of [CustomerExportParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountExportRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerExportParams =
            CustomerExportParams(
                id,
                gridWalletSignature,
                requestId,
                checkRequired("internalAccountExportRequest", internalAccountExportRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): InternalAccountExportRequest = internalAccountExportRequest

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

        return other is CustomerExportParams &&
            id == other.id &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            internalAccountExportRequest == other.internalAccountExportRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            gridWalletSignature,
            requestId,
            internalAccountExportRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerExportParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, internalAccountExportRequest=$internalAccountExportRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
