// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents.me

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountDeleteParams
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountExternalAccountsParams
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountRetrieveExternalAccountsParams
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountRetrieveExternalAccountsResponse
import com.lightspark.grid.models.agents.me.externalaccounts.ExternalAccountRetrieveParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate

/**
 * Endpoints called by the agent itself using its own credentials (obtained via device code
 * redemption). Scoped to the agent's associated customer — all requests automatically operate on
 * behalf of that customer and are subject to the agent's policy. When an action requires approval,
 * the resulting transaction enters a pending state and must be approved by the platform via `POST
 * /transactions/{transactionId}/approve`.
 */
interface ExternalAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExternalAccountService

    /**
     * Retrieve an external account belonging to the authenticated agent's customer. Returns 404 if
     * the account exists but belongs to a different customer. Requires the MANAGE_EXTERNAL_ACCOUNTS
     * permission in the agent's policy.
     */
    fun retrieve(
        externalAccountId: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        retrieve(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see retrieve */
    fun retrieve(externalAccountId: String, requestOptions: RequestOptions): ExternalAccount =
        retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

    /**
     * Delete an external account belonging to the authenticated agent's customer. Requires the
     * MANAGE_EXTERNAL_ACCOUNTS permission in the agent's policy.
     */
    fun delete(
        externalAccountId: String,
        params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see delete */
    fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(externalAccountId: String, requestOptions: RequestOptions) =
        delete(externalAccountId, ExternalAccountDeleteParams.none(), requestOptions)

    /**
     * Register a new external bank account or wallet for the authenticated agent's customer.
     * Requires the MANAGE_EXTERNAL_ACCOUNTS permission in the agent's policy. The `customerId`
     * field is optional and will be inferred from the agent's associated customer if omitted.
     */
    fun externalAccounts(
        params: ExternalAccountExternalAccountsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see externalAccounts */
    fun externalAccounts(
        externalAccountCreate: ExternalAccountCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        externalAccounts(
            ExternalAccountExternalAccountsParams.builder()
                .externalAccountCreate(externalAccountCreate)
                .build(),
            requestOptions,
        )

    /**
     * Retrieve a paginated list of external accounts belonging to the authenticated agent's
     * customer. Requires the MANAGE_EXTERNAL_ACCOUNTS permission in the agent's policy.
     */
    fun retrieveExternalAccounts(
        params: ExternalAccountRetrieveExternalAccountsParams =
            ExternalAccountRetrieveExternalAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountRetrieveExternalAccountsResponse

    /** @see retrieveExternalAccounts */
    fun retrieveExternalAccounts(
        requestOptions: RequestOptions
    ): ExternalAccountRetrieveExternalAccountsResponse =
        retrieveExternalAccounts(
            ExternalAccountRetrieveExternalAccountsParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExternalAccountService] that provides access to raw HTTP responses for each
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
        ): ExternalAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /agents/me/external-accounts/{externalAccountId}`,
         * but is otherwise the same as [ExternalAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> =
            retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /agents/me/external-accounts/{externalAccountId}`, but is otherwise the same as
         * [ExternalAccountService.delete].
         */
        @MustBeClosed
        fun delete(
            externalAccountId: String,
            params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(externalAccountId: String, requestOptions: RequestOptions): HttpResponse =
            delete(externalAccountId, ExternalAccountDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /agents/me/external-accounts`, but is otherwise the
         * same as [ExternalAccountService.externalAccounts].
         */
        @MustBeClosed
        fun externalAccounts(
            params: ExternalAccountExternalAccountsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see externalAccounts */
        @MustBeClosed
        fun externalAccounts(
            externalAccountCreate: ExternalAccountCreate,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            externalAccounts(
                ExternalAccountExternalAccountsParams.builder()
                    .externalAccountCreate(externalAccountCreate)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /agents/me/external-accounts`, but is otherwise the
         * same as [ExternalAccountService.retrieveExternalAccounts].
         */
        @MustBeClosed
        fun retrieveExternalAccounts(
            params: ExternalAccountRetrieveExternalAccountsParams =
                ExternalAccountRetrieveExternalAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountRetrieveExternalAccountsResponse>

        /** @see retrieveExternalAccounts */
        @MustBeClosed
        fun retrieveExternalAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalAccountRetrieveExternalAccountsResponse> =
            retrieveExternalAccounts(
                ExternalAccountRetrieveExternalAccountsParams.none(),
                requestOptions,
            )
    }
}
