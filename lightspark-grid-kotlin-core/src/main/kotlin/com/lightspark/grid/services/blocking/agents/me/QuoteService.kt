// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents.me

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.me.quotes.QuoteCreateParams
import com.lightspark.grid.models.agents.me.quotes.QuoteExecuteParams
import com.lightspark.grid.models.agents.me.quotes.QuoteExecuteResponse
import com.lightspark.grid.models.agents.me.quotes.QuoteRetrieveParams
import com.lightspark.grid.models.quotes.Quote

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
interface QuoteService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QuoteService

    /**
     * Generate a quote for a cross-currency transfer on behalf of the authenticated agent's
     * customer. Accounts referenced in the request must belong to the agent's customer. Requires
     * the CREATE_QUOTES permission in the agent's policy. If the agent's defaultExecutionMode is
     * APPROVAL_REQUIRED, or the quote amount exceeds the agent's approvalThresholds, the resulting
     * transaction will require explicit approval before funds move.
     */
    fun create(
        params: QuoteCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote

    /**
     * Retrieve a quote created by the authenticated agent. Returns 404 if the quote exists but was
     * not created by this agent.
     */
    fun retrieve(
        quoteId: String,
        params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote = retrieve(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: QuoteRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Quote

    /** @see retrieve */
    fun retrieve(quoteId: String, requestOptions: RequestOptions): Quote =
        retrieve(quoteId, QuoteRetrieveParams.none(), requestOptions)

    /**
     * Execute a quote created by the authenticated agent. Requires the EXECUTE_QUOTES permission in
     * the agent's policy. If the agent's policy requires approval for this amount (based on
     * execution mode or approval thresholds), the transaction will be created in a pending state
     * and must be approved by the platform via `POST
     * /agents/{agentId}/transactions/{transactionId}/approve`. Once executed, the quote cannot be
     * cancelled.
     */
    fun execute(
        quoteId: String,
        params: QuoteExecuteParams = QuoteExecuteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteExecuteResponse = execute(params.toBuilder().quoteId(quoteId).build(), requestOptions)

    /** @see execute */
    fun execute(
        params: QuoteExecuteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): QuoteExecuteResponse

    /** @see execute */
    fun execute(quoteId: String, requestOptions: RequestOptions): QuoteExecuteResponse =
        execute(quoteId, QuoteExecuteParams.none(), requestOptions)

    /** A view of [QuoteService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): QuoteService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /agents/me/quotes`, but is otherwise the same as
         * [QuoteService.create].
         */
        @MustBeClosed
        fun create(
            params: QuoteCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote>

        /**
         * Returns a raw HTTP response for `get /agents/me/quotes/{quoteId}`, but is otherwise the
         * same as [QuoteService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            quoteId: String,
            params: QuoteRetrieveParams = QuoteRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote> =
            retrieve(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: QuoteRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Quote>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(quoteId: String, requestOptions: RequestOptions): HttpResponseFor<Quote> =
            retrieve(quoteId, QuoteRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/me/quotes/{quoteId}/execute`, but is
         * otherwise the same as [QuoteService.execute].
         */
        @MustBeClosed
        fun execute(
            quoteId: String,
            params: QuoteExecuteParams = QuoteExecuteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteExecuteResponse> =
            execute(params.toBuilder().quoteId(quoteId).build(), requestOptions)

        /** @see execute */
        @MustBeClosed
        fun execute(
            params: QuoteExecuteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<QuoteExecuteResponse>

        /** @see execute */
        @MustBeClosed
        fun execute(
            quoteId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<QuoteExecuteResponse> =
            execute(quoteId, QuoteExecuteParams.none(), requestOptions)
    }
}
