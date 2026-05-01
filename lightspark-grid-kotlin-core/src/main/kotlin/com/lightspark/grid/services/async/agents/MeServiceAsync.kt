// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.me.MeCreateTransferInParams
import com.lightspark.grid.models.agents.me.MeCreateTransferInResponse
import com.lightspark.grid.models.agents.me.MeCreateTransferOutParams
import com.lightspark.grid.models.agents.me.MeCreateTransferOutResponse
import com.lightspark.grid.models.agents.me.MeListInternalAccountsPageAsync
import com.lightspark.grid.models.agents.me.MeListInternalAccountsParams
import com.lightspark.grid.models.agents.me.MeRetrieveParams
import com.lightspark.grid.models.agents.me.MeRetrieveResponse
import com.lightspark.grid.services.async.agents.me.ActionServiceAsync
import com.lightspark.grid.services.async.agents.me.ExternalAccountServiceAsync
import com.lightspark.grid.services.async.agents.me.QuoteServiceAsync
import com.lightspark.grid.services.async.agents.me.TransactionServiceAsync

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
interface MeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeServiceAsync

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun transactions(): TransactionServiceAsync

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun quotes(): QuoteServiceAsync

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun externalAccounts(): ExternalAccountServiceAsync

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun actions(): ActionServiceAsync

    /**
     * Retrieve the authenticated agent's own profile, policy, and current usage. This endpoint is
     * called by the agent software itself using its own credentials (obtained via device code
     * redemption) rather than platform credentials.
     */
    suspend fun retrieve(
        params: MeRetrieveParams = MeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(requestOptions: RequestOptions): MeRetrieveResponse =
        retrieve(MeRetrieveParams.none(), requestOptions)

    /**
     * Transfer funds from an external account to an internal account for the authenticated agent's
     * customer. Accounts must belong to the agent's customer. Requires the CREATE_TRANSFERS
     * permission in the agent's policy. If the agent's policy requires approval for this amount,
     * the transaction will be created in a pending state and must be approved by the platform via
     * `POST /agents/{agentId}/transactions/{transactionId}/approve`. This endpoint should only be
     * used for external account sources with pull functionality (e.g. ACH Pull). Otherwise, use the
     * payment instructions on the internal account to deposit funds.
     */
    suspend fun createTransferIn(
        params: MeCreateTransferInParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeCreateTransferInResponse

    /**
     * Transfer funds from an internal account to an external account for the authenticated agent's
     * customer. Accounts must belong to the agent's customer. Requires the CREATE_TRANSFERS
     * permission in the agent's policy. If the agent's policy requires approval for this amount,
     * the transaction will be created in a pending state and must be approved by the platform via
     * `POST /agents/{agentId}/transactions/{transactionId}/approve`.
     */
    suspend fun createTransferOut(
        params: MeCreateTransferOutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeCreateTransferOutResponse

    /**
     * Retrieve the internal accounts belonging to the customer this agent operates on behalf of.
     * Use this to discover available source accounts for transfers and quotes, and to verify which
     * accounts are accessible under the agent's `accountRestrictions` policy.
     */
    suspend fun listInternalAccounts(
        params: MeListInternalAccountsParams = MeListInternalAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeListInternalAccountsPageAsync

    /** @see listInternalAccounts */
    suspend fun listInternalAccounts(
        requestOptions: RequestOptions
    ): MeListInternalAccountsPageAsync =
        listInternalAccounts(MeListInternalAccountsParams.none(), requestOptions)

    /** A view of [MeServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeServiceAsync.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun transactions(): TransactionServiceAsync.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun quotes(): QuoteServiceAsync.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun externalAccounts(): ExternalAccountServiceAsync.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agents/me`, but is otherwise the same as
         * [MeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: MeRetrieveParams = MeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(requestOptions: RequestOptions): HttpResponseFor<MeRetrieveResponse> =
            retrieve(MeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/me/transfer-in`, but is otherwise the same
         * as [MeServiceAsync.createTransferIn].
         */
        @MustBeClosed
        suspend fun createTransferIn(
            params: MeCreateTransferInParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeCreateTransferInResponse>

        /**
         * Returns a raw HTTP response for `post /agents/me/transfer-out`, but is otherwise the same
         * as [MeServiceAsync.createTransferOut].
         */
        @MustBeClosed
        suspend fun createTransferOut(
            params: MeCreateTransferOutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeCreateTransferOutResponse>

        /**
         * Returns a raw HTTP response for `get /agents/me/internal-accounts`, but is otherwise the
         * same as [MeServiceAsync.listInternalAccounts].
         */
        @MustBeClosed
        suspend fun listInternalAccounts(
            params: MeListInternalAccountsParams = MeListInternalAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeListInternalAccountsPageAsync>

        /** @see listInternalAccounts */
        @MustBeClosed
        suspend fun listInternalAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<MeListInternalAccountsPageAsync> =
            listInternalAccounts(MeListInternalAccountsParams.none(), requestOptions)
    }
}
