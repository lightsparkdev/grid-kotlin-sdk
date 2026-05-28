// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Update mutable fields on an internal account. Today this supports updating the wallet privacy
 * setting for an Embedded Wallet internal account.
 *
 * Updating wallet privacy is a two-step signed-retry flow:
 * 1. Call `PATCH /internal-accounts/{id}` with the request body `{ "privateEnabled": true }` and no
 *    signature headers. Grid returns `202` with `payloadToSign`, `requestId`, and `expiresAt`.
 * 2. Use the session API keypair of a verified authentication credential on the same internal
 *    account to build an API-key stamp over `payloadToSign`, then retry with that full stamp as the
 *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header. The
 *    retry body must carry the same update fields submitted in step 1. The signed retry returns
 *    `200` with the updated internal account.
 */
class CustomerUpdateInternalAccountParams
private constructor(
    private val id: String?,
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val internalAccountUpdateRequest: InternalAccountUpdateRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun id(): String? = id

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * Partial request body for `PATCH /internal-accounts/{id}`. At least one update field must be
     * provided. On step 1 of the signed-retry flow Grid binds the submitted update fields into
     * `payloadToSign`; on step 2 the client echoes the same fields back and Grid applies the update
     * to the internal account.
     */
    fun internalAccountUpdateRequest(): InternalAccountUpdateRequest = internalAccountUpdateRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        internalAccountUpdateRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CustomerUpdateInternalAccountParams].
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountUpdateRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerUpdateInternalAccountParams]. */
    class Builder internal constructor() {

        private var id: String? = null
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var internalAccountUpdateRequest: InternalAccountUpdateRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            customerUpdateInternalAccountParams: CustomerUpdateInternalAccountParams
        ) = apply {
            id = customerUpdateInternalAccountParams.id
            gridWalletSignature = customerUpdateInternalAccountParams.gridWalletSignature
            requestId = customerUpdateInternalAccountParams.requestId
            internalAccountUpdateRequest =
                customerUpdateInternalAccountParams.internalAccountUpdateRequest
            additionalHeaders = customerUpdateInternalAccountParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                customerUpdateInternalAccountParams.additionalQueryParams.toBuilder()
        }

        fun id(id: String?) = apply { this.id = id }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Partial request body for `PATCH /internal-accounts/{id}`. At least one update field must
         * be provided. On step 1 of the signed-retry flow Grid binds the submitted update fields
         * into `payloadToSign`; on step 2 the client echoes the same fields back and Grid applies
         * the update to the internal account.
         */
        fun internalAccountUpdateRequest(
            internalAccountUpdateRequest: InternalAccountUpdateRequest
        ) = apply { this.internalAccountUpdateRequest = internalAccountUpdateRequest }

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
         * Returns an immutable instance of [CustomerUpdateInternalAccountParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .internalAccountUpdateRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerUpdateInternalAccountParams =
            CustomerUpdateInternalAccountParams(
                id,
                gridWalletSignature,
                requestId,
                checkRequired("internalAccountUpdateRequest", internalAccountUpdateRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): InternalAccountUpdateRequest = internalAccountUpdateRequest

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

        return other is CustomerUpdateInternalAccountParams &&
            id == other.id &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            internalAccountUpdateRequest == other.internalAccountUpdateRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            id,
            gridWalletSignature,
            requestId,
            internalAccountUpdateRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerUpdateInternalAccountParams{id=$id, gridWalletSignature=$gridWalletSignature, requestId=$requestId, internalAccountUpdateRequest=$internalAccountUpdateRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
