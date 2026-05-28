// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.Agent
import com.lightspark.grid.models.agents.AgentCreateParams
import com.lightspark.grid.models.agents.AgentCreateRequest
import com.lightspark.grid.models.agents.AgentCreateResponse
import com.lightspark.grid.models.agents.AgentDeleteParams
import com.lightspark.grid.models.agents.AgentListApprovalsPageAsync
import com.lightspark.grid.models.agents.AgentListApprovalsParams
import com.lightspark.grid.models.agents.AgentListPageAsync
import com.lightspark.grid.models.agents.AgentListParams
import com.lightspark.grid.models.agents.AgentRetrieveParams
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import com.lightspark.grid.services.async.agents.ActionServiceAsync
import com.lightspark.grid.services.async.agents.DeviceCodeServiceAsync
import com.lightspark.grid.services.async.agents.MeServiceAsync
import com.lightspark.grid.services.async.agents.TransactionServiceAsync

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
interface AgentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentServiceAsync

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun me(): MeServiceAsync

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    fun deviceCodes(): DeviceCodeServiceAsync

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    fun transactions(): TransactionServiceAsync

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    fun actions(): ActionServiceAsync

    /**
     * Create a new agent with a specified policy. Returns the created agent and a device code that
     * must be redeemed by the agent software to complete installation.
     */
    suspend fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** @see create */
    suspend fun create(
        agentCreateRequest: AgentCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse =
        create(
            AgentCreateParams.builder().agentCreateRequest(agentCreateRequest).build(),
            requestOptions,
        )

    /** Retrieve an agent by its system-generated ID. */
    suspend fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see retrieve */
    suspend fun retrieve(agentId: String, requestOptions: RequestOptions): Agent =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /** Update an agent's name or paused state. */
    suspend fun update(
        agentId: String,
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** Retrieve a paginated list of agents for the authenticated platform. */
    suspend fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AgentListPageAsync =
        list(AgentListParams.none(), requestOptions)

    /** Permanently delete an agent. Connected agent software will lose access immediately. */
    suspend fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: AgentDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(agentId: String, requestOptions: RequestOptions) =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /**
     * Retrieve a paginated list of agent actions that require platform approval. Filter by
     * `agentId` or `customerId` to scope results to a specific agent or customer. Approve or reject
     * individual actions via `POST /agents/{agentId}/actions/{actionId}/approve` or `POST
     * /agents/{agentId}/actions/{actionId}/reject`.
     */
    suspend fun listApprovals(
        params: AgentListApprovalsParams = AgentListApprovalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListApprovalsPageAsync

    /** @see listApprovals */
    suspend fun listApprovals(requestOptions: RequestOptions): AgentListApprovalsPageAsync =
        listApprovals(AgentListApprovalsParams.none(), requestOptions)

    /**
     * Partially update an agent's policy. Only provided fields will be updated; omitted fields
     * retain their current values. Policy changes take effect immediately.
     */
    suspend fun updatePolicy(
        agentId: String,
        params: AgentUpdatePolicyParams = AgentUpdatePolicyParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = updatePolicy(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see updatePolicy */
    suspend fun updatePolicy(
        params: AgentUpdatePolicyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see updatePolicy */
    suspend fun updatePolicy(agentId: String, requestOptions: RequestOptions): Agent =
        updatePolicy(agentId, AgentUpdatePolicyParams.none(), requestOptions)

    /** A view of [AgentServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AgentServiceAsync.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun me(): MeServiceAsync.WithRawResponse

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        fun deviceCodes(): DeviceCodeServiceAsync.WithRawResponse

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        fun transactions(): TransactionServiceAsync.WithRawResponse

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        fun actions(): ActionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agents`, but is otherwise the same as
         * [AgentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /** @see create */
        @MustBeClosed
        suspend fun create(
            agentCreateRequest: AgentCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse> =
            create(
                AgentCreateParams.builder().agentCreateRequest(agentCreateRequest).build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /agents/{agentId}`, but is otherwise the same as
         * [AgentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> = retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agents/{agentId}`, but is otherwise the same as
         * [AgentServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            agentId: String,
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /**
         * Returns a raw HTTP response for `get /agents`, but is otherwise the same as
         * [AgentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListPageAsync> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agents/{agentId}`, but is otherwise the same as
         * [AgentServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(agentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(agentId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agents/approvals`, but is otherwise the same as
         * [AgentServiceAsync.listApprovals].
         */
        @MustBeClosed
        suspend fun listApprovals(
            params: AgentListApprovalsParams = AgentListApprovalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListApprovalsPageAsync>

        /** @see listApprovals */
        @MustBeClosed
        suspend fun listApprovals(
            requestOptions: RequestOptions
        ): HttpResponseFor<AgentListApprovalsPageAsync> =
            listApprovals(AgentListApprovalsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agents/{agentId}/policy`, but is otherwise the
         * same as [AgentServiceAsync.updatePolicy].
         */
        @MustBeClosed
        suspend fun updatePolicy(
            agentId: String,
            params: AgentUpdatePolicyParams = AgentUpdatePolicyParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            updatePolicy(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see updatePolicy */
        @MustBeClosed
        suspend fun updatePolicy(
            params: AgentUpdatePolicyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see updatePolicy */
        @MustBeClosed
        suspend fun updatePolicy(
            agentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Agent> =
            updatePolicy(agentId, AgentUpdatePolicyParams.none(), requestOptions)
    }
}
