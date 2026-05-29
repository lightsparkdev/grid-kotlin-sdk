// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.Params
import com.lightspark.grid.core.checkRequired
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.core.http.QueryParams
import java.util.Objects

/**
 * Trigger KYC (individual) or KYB (business) verification for a customer. The response indicates
 * whether all required information has been provided. If data is missing, the `errors` array
 * describes exactly what needs to be supplied before verification can proceed.
 *
 * Call this endpoint again after resolving errors to re-submit.
 *
 * ### What to collect for KYB
 *
 * Before submitting a `BUSINESS` customer, collect the following via `POST /customers`, `POST
 * /beneficial-owners`, and `POST /documents`:
 *
 * **Business identifying information**
 * - Entity full legal name
 * - Doing Business As (DBA) name, if applicable
 * - Physical address — principal place of business
 * - Countries of operation
 * - Identification number — U.S. taxpayer identification number, or, for a foreign business without
 *   one, alternative government-issued documentation certifying the existence of the business
 *
 * **Ownership and control structure** — collected for **one control person** (an individual with
 * significant responsibility to control, manage, or direct the legal entity) **and all beneficial
 * owners** (every individual who owns 25% or more, directly or indirectly). For each, provide:
 * - Full name
 * - Date of birth
 * - Address
 * - Identification number:
 *     - U.S. persons — SSN or ITIN
 *     - Non-U.S. persons — one or more of: ITIN, passport (with country of issuance), alien
 *       identification card, or another government-issued photo ID evidencing nationality or
 *       residence
 *
 * **Required documents**
 * - Company formation and existence documents (certificate of incorporation, articles of
 *   association, etc.)
 * - Proof of ownership and control structure (organization and ownership chart, shareholder
 *   agreements, operating agreements, register of members, or certification of controlling person
 *   and beneficial owners)
 * - Proof of address dated within the last 3 months (utility bill, bank statement, lease agreement,
 *   or official correspondence)
 * - Tax ID or equivalent identifying-number documents
 * - For non-U.S. beneficial owners — passport plus one additional government-issued ID
 */
class VerificationSubmitParams
private constructor(
    private val verificationRequest: VerificationRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun verificationRequest(): VerificationRequest = verificationRequest

    fun _additionalBodyProperties(): Map<String, JsonValue> =
        verificationRequest._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [VerificationSubmitParams].
         *
         * The following fields are required:
         * ```kotlin
         * .verificationRequest()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [VerificationSubmitParams]. */
    class Builder internal constructor() {

        private var verificationRequest: VerificationRequest? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(verificationSubmitParams: VerificationSubmitParams) = apply {
            verificationRequest = verificationSubmitParams.verificationRequest
            additionalHeaders = verificationSubmitParams.additionalHeaders.toBuilder()
            additionalQueryParams = verificationSubmitParams.additionalQueryParams.toBuilder()
        }

        fun verificationRequest(verificationRequest: VerificationRequest) = apply {
            this.verificationRequest = verificationRequest
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
         * Returns an immutable instance of [VerificationSubmitParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .verificationRequest()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationSubmitParams =
            VerificationSubmitParams(
                checkRequired("verificationRequest", verificationRequest),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): VerificationRequest = verificationRequest

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationSubmitParams &&
            verificationRequest == other.verificationRequest &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(verificationRequest, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VerificationSubmitParams{verificationRequest=$verificationRequest, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
