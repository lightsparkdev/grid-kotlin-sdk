// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.actions.ActionApproveParams
import com.lightspark.grid.models.agents.actions.ActionApproveResponse
import com.lightspark.grid.models.agents.actions.ActionRejectParams
import com.lightspark.grid.models.agents.actions.ActionRejectResponse

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
interface ActionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActionService

    /**
     * Approve a pending agent action, allowing Grid to proceed with execution. The action must have
     * status `PENDING_APPROVAL`. Once approved, Grid executes the underlying operation (quote
     * execution or transfer) and the action transitions to `APPROVED`. For `EXECUTE_QUOTE` actions,
     * note that the underlying quote may have expired between submission and approval — in that
     * case the action will transition to `FAILED` instead. This endpoint is called by the
     * platform's backend using platform credentials, not by the agent itself.
     */
    fun approve(
        actionId: String,
        params: ActionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionApproveResponse =
        approve(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see approve */
    fun approve(
        params: ActionApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionApproveResponse

    /**
     * Reject a pending agent action, preventing execution. The action must have status
     * `PENDING_APPROVAL`. Once rejected, the action transitions to `REJECTED` and the underlying
     * operation is not executed. This endpoint is called by the platform's backend using platform
     * credentials, not by the agent itself.
     */
    fun reject(
        actionId: String,
        params: ActionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRejectResponse = reject(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see reject */
    fun reject(
        params: ActionRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRejectResponse

    /** A view of [ActionService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agents/{agentId}/actions/{actionId}/approve`, but
         * is otherwise the same as [ActionService.approve].
         */
        @MustBeClosed
        fun approve(
            actionId: String,
            params: ActionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionApproveResponse> =
            approve(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: ActionApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionApproveResponse>

        /**
         * Returns a raw HTTP response for `post /agents/{agentId}/actions/{actionId}/reject`, but
         * is otherwise the same as [ActionService.reject].
         */
        @MustBeClosed
        fun reject(
            actionId: String,
            params: ActionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRejectResponse> =
            reject(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see reject */
        @MustBeClosed
        fun reject(
            params: ActionRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRejectResponse>
    }
}
