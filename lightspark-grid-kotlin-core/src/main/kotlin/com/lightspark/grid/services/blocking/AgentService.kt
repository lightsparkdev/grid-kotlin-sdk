// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

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
import com.lightspark.grid.models.agents.AgentListApprovalsPage
import com.lightspark.grid.models.agents.AgentListApprovalsParams
import com.lightspark.grid.models.agents.AgentListPage
import com.lightspark.grid.models.agents.AgentListParams
import com.lightspark.grid.models.agents.AgentRetrieveParams
import com.lightspark.grid.models.agents.AgentUpdateParams
import com.lightspark.grid.models.agents.AgentUpdatePolicyParams
import com.lightspark.grid.services.blocking.agents.ActionService
import com.lightspark.grid.services.blocking.agents.DeviceCodeService
import com.lightspark.grid.services.blocking.agents.MeService
import com.lightspark.grid.services.blocking.agents.TransactionService

/**
 * Endpoints for creating and managing agents (experimental), called by the partner's backend using
 * platform credentials. Covers the full agent lifecycle: creation, policy configuration, pausing,
 * deletion, the device code installation flow, and approving or rejecting transactions initiated by
 * agents.
 */
interface AgentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService

    /**
     * Endpoints called by the agent itself using its own credentials (obtained via device code
     * redemption). Scoped to the agent's associated customer — all requests automatically operate
     * on behalf of that customer and are subject to the agent's policy. When an action requires
     * approval, the resulting transaction enters a pending state and must be approved by the
     * platform via `POST /transactions/{transactionId}/approve`.
     */
    fun me(): MeService

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    fun deviceCodes(): DeviceCodeService

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    fun transactions(): TransactionService

    /**
     * Endpoints for creating and managing agents (experimental), called by the partner's backend
     * using platform credentials. Covers the full agent lifecycle: creation, policy configuration,
     * pausing, deletion, the device code installation flow, and approving or rejecting transactions
     * initiated by agents.
     */
    fun actions(): ActionService

    /**
     * Create a new agent with a specified policy. Returns the created agent and a device code that
     * must be redeemed by the agent software to complete installation.
     */
    fun create(
        params: AgentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse

    /** @see create */
    fun create(
        agentCreateRequest: AgentCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentCreateResponse =
        create(
            AgentCreateParams.builder().agentCreateRequest(agentCreateRequest).build(),
            requestOptions,
        )

    /** Retrieve an agent by its system-generated ID. */
    fun retrieve(
        agentId: String,
        params: AgentRetrieveParams = AgentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AgentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** @see retrieve */
    fun retrieve(agentId: String, requestOptions: RequestOptions): Agent =
        retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

    /** Update an agent's name or paused state. */
    fun update(
        agentId: String,
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = update(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see update */
    fun update(
        params: AgentUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** Retrieve a paginated list of agents for the authenticated platform. */
    fun list(
        params: AgentListParams = AgentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): AgentListPage =
        list(AgentListParams.none(), requestOptions)

    /** Permanently delete an agent. Connected agent software will lose access immediately. */
    fun delete(
        agentId: String,
        params: AgentDeleteParams = AgentDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see delete */
    fun delete(params: AgentDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(agentId: String, requestOptions: RequestOptions) =
        delete(agentId, AgentDeleteParams.none(), requestOptions)

    /**
     * Retrieve a paginated list of agent actions that require platform approval. Filter by
     * `agentId` or `customerId` to scope results to a specific agent or customer. Approve or reject
     * individual actions via `POST /agents/{agentId}/actions/{actionId}/approve` or `POST
     * /agents/{agentId}/actions/{actionId}/reject`.
     */
    fun listApprovals(
        params: AgentListApprovalsParams = AgentListApprovalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AgentListApprovalsPage

    /** @see listApprovals */
    fun listApprovals(requestOptions: RequestOptions): AgentListApprovalsPage =
        listApprovals(AgentListApprovalsParams.none(), requestOptions)

    /**
     * Partially update an agent's policy. Only provided fields will be updated; omitted fields
     * retain their current values. Policy changes take effect immediately.
     */
    fun updatePolicy(
        agentId: String,
        params: AgentUpdatePolicyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent = updatePolicy(params.toBuilder().agentId(agentId).build(), requestOptions)

    /** @see updatePolicy */
    fun updatePolicy(
        params: AgentUpdatePolicyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Agent

    /** A view of [AgentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AgentService.WithRawResponse

        /**
         * Endpoints called by the agent itself using its own credentials (obtained via device code
         * redemption). Scoped to the agent's associated customer — all requests automatically
         * operate on behalf of that customer and are subject to the agent's policy. When an action
         * requires approval, the resulting transaction enters a pending state and must be approved
         * by the platform via `POST /transactions/{transactionId}/approve`.
         */
        fun me(): MeService.WithRawResponse

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        fun deviceCodes(): DeviceCodeService.WithRawResponse

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        fun transactions(): TransactionService.WithRawResponse

        /**
         * Endpoints for creating and managing agents (experimental), called by the partner's
         * backend using platform credentials. Covers the full agent lifecycle: creation, policy
         * configuration, pausing, deletion, the device code installation flow, and approving or
         * rejecting transactions initiated by agents.
         */
        fun actions(): ActionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agents`, but is otherwise the same as
         * [AgentService.create].
         */
        @MustBeClosed
        fun create(
            params: AgentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            agentCreateRequest: AgentCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentCreateResponse> =
            create(
                AgentCreateParams.builder().agentCreateRequest(agentCreateRequest).build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /agents/{agentId}`, but is otherwise the same as
         * [AgentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            agentId: String,
            params: AgentRetrieveParams = AgentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            retrieve(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AgentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(agentId: String, requestOptions: RequestOptions): HttpResponseFor<Agent> =
            retrieve(agentId, AgentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agents/{agentId}`, but is otherwise the same as
         * [AgentService.update].
         */
        @MustBeClosed
        fun update(
            agentId: String,
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            update(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: AgentUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>

        /**
         * Returns a raw HTTP response for `get /agents`, but is otherwise the same as
         * [AgentService.list].
         */
        @MustBeClosed
        fun list(
            params: AgentListParams = AgentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AgentListPage> =
            list(AgentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /agents/{agentId}`, but is otherwise the same as
         * [AgentService.delete].
         */
        @MustBeClosed
        fun delete(
            agentId: String,
            params: AgentDeleteParams = AgentDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AgentDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(agentId: String, requestOptions: RequestOptions): HttpResponse =
            delete(agentId, AgentDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /agents/approvals`, but is otherwise the same as
         * [AgentService.listApprovals].
         */
        @MustBeClosed
        fun listApprovals(
            params: AgentListApprovalsParams = AgentListApprovalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AgentListApprovalsPage>

        /** @see listApprovals */
        @MustBeClosed
        fun listApprovals(requestOptions: RequestOptions): HttpResponseFor<AgentListApprovalsPage> =
            listApprovals(AgentListApprovalsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /agents/{agentId}/policy`, but is otherwise the
         * same as [AgentService.updatePolicy].
         */
        @MustBeClosed
        fun updatePolicy(
            agentId: String,
            params: AgentUpdatePolicyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent> =
            updatePolicy(params.toBuilder().agentId(agentId).build(), requestOptions)

        /** @see updatePolicy */
        @MustBeClosed
        fun updatePolicy(
            params: AgentUpdatePolicyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Agent>
    }
}
