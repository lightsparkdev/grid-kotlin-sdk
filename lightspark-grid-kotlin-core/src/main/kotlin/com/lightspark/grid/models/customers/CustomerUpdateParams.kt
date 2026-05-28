// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Update a customer's metadata by their system-generated ID.
 *
 * Most customer updates complete synchronously and return `200` with the updated customer. If the
 * request changes `email` for a customer that has one or more tied Embedded Wallet internal
 * accounts with `EMAIL_OTP` credentials, the email change uses the two-step signed-retry flow so
 * the customer's wallet session authorizes the authentication credential update. On the signed
 * retry, Grid updates the customer email and every tied `EMAIL_OTP` credential across all tied
 * Embedded Wallets as one logical operation. If any tied credential cannot be updated, the customer
 * email is not changed.
 *
 * For an Embedded Wallet email update:
 * 1. Call `PATCH /customers/{customerId}` with the full update body and no signature headers. Grid
 *    returns `202` with `payloadToSign`, `requestId`, and `expiresAt`. The pending challenge binds
 *    the submitted update fields and the set of tied Embedded Wallet email OTP credentials that
 *    must be updated.
 * 2. Use the session API keypair of a verified authentication credential on one of the customer's
 *    tied Embedded Wallets to build an API-key stamp over `payloadToSign`, then retry the same
 *    request with that full stamp as the `Grid-Wallet-Signature` header and the `requestId` echoed
 *    back as the `Request-Id` header. The retry body must carry the same update fields submitted in
 *    step 1. The signed retry returns `200` with the updated customer.
 */
class CustomerUpdateParams
private constructor(
    private val customerId: String?,
    private val gridWalletSignature: String?,
    private val requestId: String?,
    private val updateCustomerRequest: CustomerUpdateRequestOneOf,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun customerId(): String? = customerId

    fun gridWalletSignature(): String? = gridWalletSignature

    fun requestId(): String? = requestId

    /**
     * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer with
     * tied Embedded Wallet internal accounts, Grid updates the customer email and every tied
     * `EMAIL_OTP` credential across all tied Embedded Wallets through the endpoint's signed-retry
     * flow.
     */
    fun updateCustomerRequest(): CustomerUpdateRequestOneOf = updateCustomerRequest

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerUpdateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .updateCustomerRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CustomerUpdateParams]. */
    class Builder internal constructor() {

        private var customerId: String? = null
        private var gridWalletSignature: String? = null
        private var requestId: String? = null
        private var updateCustomerRequest: CustomerUpdateRequestOneOf? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(customerUpdateParams: CustomerUpdateParams) = apply {
            customerId = customerUpdateParams.customerId
            gridWalletSignature = customerUpdateParams.gridWalletSignature
            requestId = customerUpdateParams.requestId
            updateCustomerRequest = customerUpdateParams.updateCustomerRequest
            additionalHeaders = customerUpdateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerUpdateParams.additionalQueryParams.toBuilder()
        }

        fun customerId(customerId: String?) = apply { this.customerId = customerId }

        fun gridWalletSignature(gridWalletSignature: String?) = apply {
            this.gridWalletSignature = gridWalletSignature
        }

        fun requestId(requestId: String?) = apply { this.requestId = requestId }

        /**
         * Request body for `PATCH /customers/{customerId}`. When `email` changes for a customer
         * with tied Embedded Wallet internal accounts, Grid updates the customer email and every
         * tied `EMAIL_OTP` credential across all tied Embedded Wallets through the endpoint's
         * signed-retry flow.
         */
        fun updateCustomerRequest(updateCustomerRequest: CustomerUpdateRequestOneOf) = apply {
            this.updateCustomerRequest = updateCustomerRequest
        }

        /**
         * Alias for calling [updateCustomerRequest] with
         * `CustomerUpdateRequestOneOf.ofIndividual(individual)`.
         */
        fun updateCustomerRequest(individual: IndividualCustomerUpdateRequest) =
            updateCustomerRequest(CustomerUpdateRequestOneOf.ofIndividual(individual))

        /**
         * Alias for calling [updateCustomerRequest] with
         * `CustomerUpdateRequestOneOf.ofBusiness(business)`.
         */
        fun updateCustomerRequest(business: BusinessCustomerUpdateRequest) =
            updateCustomerRequest(CustomerUpdateRequestOneOf.ofBusiness(business))

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
         * Returns an immutable instance of [CustomerUpdateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .updateCustomerRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerUpdateParams =
            CustomerUpdateParams(
                customerId,
                gridWalletSignature,
                requestId,
                checkRequired("updateCustomerRequest", updateCustomerRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): CustomerUpdateRequestOneOf = updateCustomerRequest

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> customerId ?: ""
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

        return other is CustomerUpdateParams &&
            customerId == other.customerId &&
            gridWalletSignature == other.gridWalletSignature &&
            requestId == other.requestId &&
            updateCustomerRequest == other.updateCustomerRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            customerId,
            gridWalletSignature,
            requestId,
            updateCustomerRequest,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "CustomerUpdateParams{customerId=$customerId, gridWalletSignature=$gridWalletSignature, requestId=$requestId, updateCustomerRequest=$updateCustomerRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
