// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.customers

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountChallengeParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountDeleteParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListPageAsync
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountRetrieveParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountVerifyParams
import com.lightspark.grid.models.customers.externalaccounts.OwnershipChallenge

/** External account management endpoints for creating and managing external bank accounts */
interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalAccountServiceAsync

    /** Register a new external bank account for a customer. */
    suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see create */
    suspend fun create(
        externalAccountCreate: ExternalAccountCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        create(
            ExternalAccountCreateParams.builder()
                .externalAccountCreate(externalAccountCreate)
                .build(),
            requestOptions,
        )

    /** Retrieve a customer external account by its system-generated ID */
    suspend fun retrieve(
        externalAccountId: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        retrieve(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see retrieve */
    suspend fun retrieve(
        externalAccountId: String,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of external accounts with optional filtering parameters. Returns all external
     * accounts that match the specified filters. If no filters are provided, returns all external
     * accounts (paginated).
     *
     * External accounts are bank accounts, cryptocurrency wallets, or other payment destinations
     * that customers can use to receive funds from the platform.
     */
    suspend fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ExternalAccountListPageAsync =
        list(ExternalAccountListParams.none(), requestOptions)

    /**
     * Delete a customer external account by its system-generated ID. An account that is currently a
     * trusted beneficiary for SCA cannot be deleted — untrust it first via `POST
     * /customers/external-accounts/{externalAccountId}/untrust` (and its `/confirm`), then delete.
     */
    suspend fun delete(
        externalAccountId: String,
        params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(externalAccountId: String, requestOptions: RequestOptions) =
        delete(externalAccountId, ExternalAccountDeleteParams.none(), requestOptions)

    /**
     * Start (or restart) ownership verification for a `FIRST_PARTY` self-custody crypto wallet
     * external account in `PENDING_OWNERSHIP_VERIFICATION` or `UNVERIFIED` status. The response
     * carries the method-specific challenge material:
     * - `WALLET_SIGNATURE` — a `messageToSign`; have the wallet sign it exactly and submit the
     *   result to the verify endpoint to complete verification synchronously.
     * - `LIVENESS` — a hosted `verificationLink` (and possibly an embed `token`); the user
     *   completes a biometric flow and verification completes asynchronously. The outcome is
     *   delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks or by polling the account.
     *
     * Calling this endpoint again abandons any in-flight challenge and issues a new one with the
     * requested method — use it to retry after a failed attempt, to replace an expired challenge,
     * or to switch methods. An `UNVERIFIED` account returns to `PENDING_OWNERSHIP_VERIFICATION`
     * when a new challenge is issued.
     *
     * Completing ownership verification moves the account to `ACTIVE`.
     */
    suspend fun challenge(
        externalAccountId: String,
        params: ExternalAccountChallengeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OwnershipChallenge =
        challenge(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see challenge */
    suspend fun challenge(
        params: ExternalAccountChallengeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OwnershipChallenge

    /**
     * Complete a `WALLET_SIGNATURE` challenge by submitting the signature the wallet produced for
     * the challenge's `messageToSign`. The message must be signed exactly as returned, and the
     * signature must be submitted before the challenge's `expiresAt` — after expiry, start a new
     * challenge.
     *
     * On success the account moves to `ACTIVE`; on an invalid signature it moves to `UNVERIFIED`
     * (start a new challenge to retry). `LIVENESS` challenges complete asynchronously and never use
     * this endpoint — their outcome is delivered via `EXTERNAL_ACCOUNT.STATUS_UPDATED` webhooks or
     * by polling the account.
     */
    suspend fun verify(
        externalAccountId: String,
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        verify(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see verify */
    suspend fun verify(
        params: ExternalAccountVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP responses for each
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
        ): ExternalAccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /customers/external-accounts`, but is otherwise the
         * same as [ExternalAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            externalAccountCreate: ExternalAccountCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            create(
                ExternalAccountCreateParams.builder()
                    .externalAccountCreate(externalAccountCreate)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /customers/external-accounts/{externalAccountId}`,
         * but is otherwise the same as [ExternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            externalAccountId: String,
            params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            retrieve(
                params.toBuilder().externalAccountId(externalAccountId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> =
            retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/external-accounts`, but is otherwise the
         * same as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalAccountListPageAsync> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external-accounts/{externalAccountId}`, but is otherwise the same as
         * [ExternalAccountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            externalAccountId: String,
            params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            delete(externalAccountId, ExternalAccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /customers/external-accounts/{externalAccountId}/challenge`, but is otherwise the same as
         * [ExternalAccountServiceAsync.challenge].
         */
        @MustBeClosed
        suspend fun challenge(
            externalAccountId: String,
            params: ExternalAccountChallengeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OwnershipChallenge> =
            challenge(
                params.toBuilder().externalAccountId(externalAccountId).build(),
                requestOptions,
            )

        /** @see challenge */
        @MustBeClosed
        suspend fun challenge(
            params: ExternalAccountChallengeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OwnershipChallenge>

        /**
         * Returns a raw HTTP response for `post
         * /customers/external-accounts/{externalAccountId}/verify`, but is otherwise the same as
         * [ExternalAccountServiceAsync.verify].
         */
        @MustBeClosed
        suspend fun verify(
            externalAccountId: String,
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            verify(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

        /** @see verify */
        @MustBeClosed
        suspend fun verify(
            params: ExternalAccountVerifyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>
    }
}
