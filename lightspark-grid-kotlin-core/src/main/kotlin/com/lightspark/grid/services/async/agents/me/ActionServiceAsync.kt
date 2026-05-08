// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents.me

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.me.actions.ActionListPageAsync
import com.lightspark.grid.models.agents.me.actions.ActionListParams
import com.lightspark.grid.models.agents.me.actions.ActionRetrieveParams
import com.lightspark.grid.models.agents.me.actions.ActionRetrieveResponse

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
interface ActionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ActionServiceAsync

    /**
     * Retrieve a specific action submitted by the authenticated agent. Poll this endpoint after
     * submitting an action that requires approval to check whether it has been approved, rejected,
     * or has failed.
     */
    suspend fun retrieve(
        actionId: String,
        params: ActionRetrieveParams = ActionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRetrieveResponse =
        retrieve(params.toBuilder().actionId(actionId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ActionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(actionId: String, requestOptions: RequestOptions): ActionRetrieveResponse =
        retrieve(actionId, ActionRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a paginated list of actions submitted by the authenticated agent. Use this to poll
     * for approval decisions after submitting an action that requires approval.
     */
    suspend fun list(
        params: ActionListParams = ActionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ActionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ActionListPageAsync =
        list(ActionListParams.none(), requestOptions)

    /**
     * A view of [ActionServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agents/me/actions/{actionId}`, but is otherwise the
         * same as [ActionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            actionId: String,
            params: ActionRetrieveParams = ActionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(params.toBuilder().actionId(actionId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: ActionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            actionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ActionRetrieveResponse> =
            retrieve(actionId, ActionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agents/me/actions`, but is otherwise the same as
         * [ActionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ActionListParams = ActionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ActionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ActionListPageAsync> =
            list(ActionListParams.none(), requestOptions)
    }
}
