// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.internalaccounts.InternalAccountExportParams
import com.lightspark.grid.models.internalaccounts.InternalAccountExportResponse

/** Internal account management endpoints for creating and managing internal accounts */
interface InternalAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InternalAccountService

    /**
     * Export the wallet credentials of an Embedded Wallet internal account. The returned wallet
     * credentials are HPKE-encrypted to the `clientPublicKey` supplied in the request body.
     *
     * Export is a two-step signed-retry flow (same pattern as add-additional credential, revoke
     * credential, and revoke session):
     * 1. Call `POST /internal-accounts/{id}/export` with the request body `{ "clientPublicKey":
     *    "..." }` and no signature headers. Grid binds the `clientPublicKey` into the
     *    `payloadToSign` it returns, so the subsequent `Grid-Wallet-Signature` commits to the
     *    target encryption key. The response is `202` with `payloadToSign`, `requestId`, and
     *    `expiresAt`.
     * 2. Sign the `payloadToSign` with the session private key of a verified authentication
     *    credential on the same internal account and retry with the signature as the
     *    `Grid-Wallet-Signature` header and the `requestId` echoed back as the `Request-Id` header.
     *    The retry body must carry the **same** `clientPublicKey` submitted in step 1 — Grid
     *    rejects the retry with `401` if it disagrees with what was bound into `payloadToSign`. The
     *    signed retry returns `200` with `encryptedWalletCredentials`, which the client decrypts
     *    with the matching private key.
     *
     * The `clientPublicKey` is ephemeral: generate a fresh P-256 keypair for this export and
     * discard the private key after decrypting. Do not reuse the keypair from any prior verify call
     * — that private key was already discarded after decrypting the session signing key it was
     * issued against.
     */
    fun export(
        id: String,
        params: InternalAccountExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountExportResponse = export(params.toBuilder().id(id).build(), requestOptions)

    /** @see export */
    fun export(
        params: InternalAccountExportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InternalAccountExportResponse

    /**
     * A view of [InternalAccountService] that provides access to raw HTTP responses for each
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
        ): InternalAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /internal-accounts/{id}/export`, but is otherwise
         * the same as [InternalAccountService.export].
         */
        @MustBeClosed
        fun export(
            id: String,
            params: InternalAccountExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountExportResponse> =
            export(params.toBuilder().id(id).build(), requestOptions)

        /** @see export */
        @MustBeClosed
        fun export(
            params: InternalAccountExportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InternalAccountExportResponse>
    }
}
