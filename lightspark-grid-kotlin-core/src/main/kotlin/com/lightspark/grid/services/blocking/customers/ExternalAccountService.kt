// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.customers

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreate
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountDeleteParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListPage
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountListParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountRetrieveParams
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccountUpdateParams

/** External account management endpoints for creating and managing external bank accounts */
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

    /** Register a new external bank account for a customer. */
    fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see create */
    fun create(
        externalAccountCreate: ExternalAccountCreate,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        create(
            ExternalAccountCreateParams.builder()
                .externalAccountCreate(externalAccountCreate)
                .build(),
            requestOptions,
        )

    /** Retrieve a customer external account by its system-generated ID */
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
     * Update mutable fields on a customer external account. Only `platformAccountId` and
     * `beneficiary` can be updated via this endpoint.
     */
    fun update(
        externalAccountId: String,
        params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        update(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see update */
    fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see update */
    fun update(externalAccountId: String, requestOptions: RequestOptions): ExternalAccount =
        update(externalAccountId, ExternalAccountUpdateParams.none(), requestOptions)

    /**
     * Retrieve a list of external accounts with optional filtering parameters. Returns all external
     * accounts that match the specified filters. If no filters are provided, returns all external
     * accounts (paginated).
     *
     * External accounts are bank accounts, cryptocurrency wallets, or other payment destinations
     * that customers can use to receive funds from the platform.
     */
    fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): ExternalAccountListPage =
        list(ExternalAccountListParams.none(), requestOptions)

    /** Delete a customer external account by its system-generated ID */
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
         * Returns a raw HTTP response for `post /customers/external-accounts`, but is otherwise the
         * same as [ExternalAccountService.create].
         */
        @MustBeClosed
        fun create(
            params: ExternalAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see create */
        @MustBeClosed
        fun create(
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
         * Returns a raw HTTP response for `get /customers/external-accounts/{externalAccountId}`,
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
         * Returns a raw HTTP response for `patch /customers/external-accounts/{externalAccountId}`,
         * but is otherwise the same as [ExternalAccountService.update].
         */
        @MustBeClosed
        fun update(
            externalAccountId: String,
            params: ExternalAccountUpdateParams = ExternalAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            update(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            params: ExternalAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see update */
        @MustBeClosed
        fun update(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> =
            update(externalAccountId, ExternalAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /customers/external-accounts`, but is otherwise the
         * same as [ExternalAccountService.list].
         */
        @MustBeClosed
        fun list(
            params: ExternalAccountListParams = ExternalAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalAccountListPage> =
            list(ExternalAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /customers/external-accounts/{externalAccountId}`, but is otherwise the same as
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
    }
}
