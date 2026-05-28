// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.AgentAction
import com.lightspark.grid.models.agents.transactions.TransactionApproveParams
import com.lightspark.grid.models.agents.transactions.TransactionRejectParams

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync

    /**
     * Approve a pending agent action, allowing Grid to proceed with execution. The action must have
     * status `PENDING_APPROVAL`. Once approved, Grid executes the underlying operation (quote
     * execution or transfer) and the action transitions to `APPROVED`. For `EXECUTE_QUOTE` actions,
     * note that the underlying quote may have expired between submission and approval — in that
     * case the action will transition to `FAILED` instead. This endpoint is called by the
     * platform's backend using platform credentials, not by the agent itself.
     */
    suspend fun approve(
        actionId: String,
        params: TransactionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentAction = approve(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see approve */
    suspend fun approve(
        params: TransactionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentAction

    /**
     * Reject a pending agent action, preventing execution. The action must have status
     * `PENDING_APPROVAL`. Once rejected, the action transitions to `REJECTED` and the underlying
     * operation is not executed. This endpoint is called by the platform's backend using platform
     * credentials, not by the agent itself.
     */
    suspend fun reject(
        actionId: String,
        params: TransactionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentAction = reject(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see reject */
    suspend fun reject(
        params: TransactionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentAction

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agents/{agentId}/actions/{actionId}/approve`, but
         * is otherwise the same as [TransactionServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            actionId: String,
            params: TransactionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentAction> =
            approve(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            params: TransactionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentAction>

        /**
         * Returns a raw HTTP response for `post /agents/{agentId}/actions/{actionId}/reject`, but
         * is otherwise the same as [TransactionServiceAsync.reject].
         */
        @MustBeClosed
        suspend fun reject(
            actionId: String,
            params: TransactionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentAction> =
            reject(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see reject */
        @MustBeClosed
        suspend fun reject(
            params: TransactionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentAction>
    }
}
