// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.internalaccounts.InternalAccountExportParams
import com.lightspark.grid.models.internalaccounts.InternalAccountExportResponse

/** Internal account management endpoints for creating and managing internal accounts */
interface InternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InternalAccountServiceAsync

    /**
     * Export the wallet credentials of an Embedded Wallet internal account. Wallet credentials are
     * returned encrypted to the client public key that was supplied when the authorizing session
     * was verified.
     *
     * Export is a two-step signed-retry flow (same pattern as add-additional credential, revoke
     * credential, and revoke session):
     * 1. Call `POST /internal-accounts/{id}/export` with no headers. The response is `202` with a
     *    `payloadToSign`, `requestId`, and `expiresAt`.
     * 2. Sign the `payloadToSign` with the session private key of a verified authentication
     *    credential on the same internal account and retry with the signature as the
     *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header.
     *    The signed retry returns `200` with `encryptedWalletCredentials`, which the client can
     *    decrypt with its local private key.
     */
    suspend fun export(
        id: String,
        params: InternalAccountExportParams = InternalAccountExportParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountExportResponse = export(params.toBuilder().id(id).build(), requestOptions)

    /** @see export */
    suspend fun export(
        params: InternalAccountExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountExportResponse

    /** @see export */
    suspend fun export(id: String, requestOptions: RequestOptions): InternalAccountExportResponse =
        export(id, InternalAccountExportParams.none(), requestOptions)

    /**
     * A view of [InternalAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InternalAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /internal-accounts/{id}/export`, but is otherwise
         * the same as [InternalAccountServiceAsync.export].
         */
        @MustBeClosed
        suspend fun export(
            id: String,
            params: InternalAccountExportParams = InternalAccountExportParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountExportResponse> =
            export(params.toBuilder().id(id).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        suspend fun export(
            params: InternalAccountExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountExportResponse>

        /** @see export */
        @MustBeClosed
        suspend fun export(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InternalAccountExportResponse> =
            export(id, InternalAccountExportParams.none(), requestOptions)
    }
}
