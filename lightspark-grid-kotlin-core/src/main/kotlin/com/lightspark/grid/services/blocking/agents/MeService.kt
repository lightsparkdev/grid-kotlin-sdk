// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.me.MeListParams
import com.lightspark.grid.models.agents.me.MeListResponse
import com.lightspark.grid.models.agents.me.MeRetrieveInternalAccountsParams
import com.lightspark.grid.models.agents.me.MeRetrieveInternalAccountsResponse
import com.lightspark.grid.models.agents.me.MeTransferInParams
import com.lightspark.grid.models.agents.me.MeTransferInResponse
import com.lightspark.grid.models.agents.me.MeTransferOutParams
import com.lightspark.grid.models.agents.me.MeTransferOutResponse
import com.lightspark.grid.services.blocking.agents.me.ActionService
import com.lightspark.grid.services.blocking.agents.me.ExternalAccountService
import com.lightspark.grid.services.blocking.agents.me.QuoteService
import com.lightspark.grid.services.blocking.agents.me.TransactionService

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
interface MeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeService

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun transactions(): TransactionService

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun quotes(): QuoteService

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun actions(): ActionService

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun externalAccounts(): ExternalAccountService

    /**
     * Retrieve the authenticated agent's own profile, policy, and current usage. This endpoint is
     * called by the agent software itself using its own credentials (obtained via device code
     * redemption) rather than platform credentials.
     */
    fun list(
        params: MeListParams = MeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): MeListResponse =
        list(MeListParams.none(), requestOptions)

    /**
     * Retrieve the internal accounts belonging to the customer this agent operates on behalf of.
     * Use this to discover available source accounts for transfers and quotes, and to verify which
     * accounts are accessible under the agent's `accountRestrictions` policy.
     */
    fun retrieveInternalAccounts(
        params: MeRetrieveInternalAccountsParams = MeRetrieveInternalAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeRetrieveInternalAccountsResponse

    /** @see retrieveInternalAccounts */
    fun retrieveInternalAccounts(
        requestOptions: RequestOptions
    ): MeRetrieveInternalAccountsResponse =
        retrieveInternalAccounts(MeRetrieveInternalAccountsParams.none(), requestOptions)

    /**
     * Transfer funds from an external account to an internal account for the authenticated agent's
     * customer. Accounts must belong to the agent's customer. Requires the CREATE_TRANSFERS
     * permission in the agent's policy. If the agent's policy requires approval for this amount,
     * the transaction will be created in a pending state and must be approved by the platform via
     * `POST /agents/{agentId}/actions/{actionId}/approve`. This endpoint should only be used for
     * external account sources with pull functionality (e.g. ACH Pull). Otherwise, use the payment
     * instructions on the internal account to deposit funds.
     */
    fun transferIn(
        params: MeTransferInParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeTransferInResponse

    /**
     * Transfer funds from an internal account to an external account for the authenticated agent's
     * customer. Accounts must belong to the agent's customer. Requires the CREATE_TRANSFERS
     * permission in the agent's policy. If the agent's policy requires approval for this amount,
     * the transaction will be created in a pending state and must be approved by the platform via
     * `POST /agents/{agentId}/actions/{actionId}/approve`.
     */
    fun transferOut(
        params: MeTransferOutParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MeTransferOutResponse

    /** A view of [MeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): MeService.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun transactions(): TransactionService.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun quotes(): QuoteService.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun actions(): ActionService.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun externalAccounts(): ExternalAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agents/me`, but is otherwise the same as
         * [MeService.list].
         */
        @MustBeClosed
        fun list(
            params: MeListParams = MeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<MeListResponse> =
            list(MeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agents/me/internal-accounts`, but is otherwise the
         * same as [MeService.retrieveInternalAccounts].
         */
        @MustBeClosed
        fun retrieveInternalAccounts(
            params: MeRetrieveInternalAccountsParams = MeRetrieveInternalAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeRetrieveInternalAccountsResponse>

        /** @see retrieveInternalAccounts */
        @MustBeClosed
        fun retrieveInternalAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<MeRetrieveInternalAccountsResponse> =
            retrieveInternalAccounts(MeRetrieveInternalAccountsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/me/transfer-in`, but is otherwise the same
         * as [MeService.transferIn].
         */
        @MustBeClosed
        fun transferIn(
            params: MeTransferInParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeTransferInResponse>

        /**
         * Returns a raw HTTP response for `post /agents/me/transfer-out`, but is otherwise the same
         * as [MeService.transferOut].
         */
        @MustBeClosed
        fun transferOut(
            params: MeTransferOutParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MeTransferOutResponse>
    }
}
