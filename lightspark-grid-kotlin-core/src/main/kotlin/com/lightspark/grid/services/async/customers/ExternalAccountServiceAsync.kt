// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.customers

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListPageAsync
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListParams

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
    }
}
