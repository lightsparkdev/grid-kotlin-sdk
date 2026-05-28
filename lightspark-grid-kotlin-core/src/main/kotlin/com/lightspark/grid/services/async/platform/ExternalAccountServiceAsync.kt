// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.platform

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponse
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.customers.externalaccounts.ExternalAccount
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountCreateParams
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountDeleteParams
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountListPageAsync
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountListParams
import com.lightspark.grid.models.platform.externalaccounts.ExternalAccountRetrieveParams
import com.lightspark.grid.models.platform.externalaccounts.PlatformExternalAccountCreateRequest

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

    /** Register a new external bank account for the platform. */
    suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see create */
    suspend fun create(
        platformExternalAccountCreateRequest: PlatformExternalAccountCreateRequest,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        create(
            ExternalAccountCreateParams.builder()
                .platformExternalAccountCreateRequest(platformExternalAccountCreateRequest)
                .build(),
            requestOptions,
        )

    /** Retrieve a platform external account by its system-generated ID */
    suspend fun retrieve(
        externalAccountId: String,
        params: ExternalAccountRetrieveParams = ExternalAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount =
        retrieve(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccount

    /** @see retrieve */
    suspend fun retrieve(
        externalAccountId: String,
        requestOptions: RequestOptions,
    ): ExternalAccount =
        retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

    /**
     * Retrieve a list of all external accounts that belong to the platform, as opposed to an
     * individual customer.
     *
     * These accounts are used for platform-wide operations such as receiving funds from external
     * sources or managing platform-level payment destinations.
     */
    suspend fun list(
        params: ExternalAccountListParams = ExternalAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalAccountListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): ExternalAccountListPageAsync =
        list(ExternalAccountListParams.none(), requestOptions)

    /** Delete a platform external account by its system-generated ID */
    suspend fun delete(
        externalAccountId: String,
        params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

    /** @see delete */
    suspend fun delete(
        params: ExternalAccountDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    suspend fun delete(externalAccountId: String, requestOptions: RequestOptions) =
        delete(externalAccountId, ExternalAccountDeleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /platform/external-accounts`, but is otherwise the
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
            platformExternalAccountCreateRequest: PlatformExternalAccountCreateRequest,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount> =
            create(
                ExternalAccountCreateParams.builder()
                    .platformExternalAccountCreateRequest(platformExternalAccountCreateRequest)
                    .build(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /platform/external-accounts/{externalAccountId}`,
         * but is otherwise the same as [ExternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
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
        suspend fun retrieve(
            params: ExternalAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalAccount>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalAccount> =
            retrieve(externalAccountId, ExternalAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /platform/external-accounts`, but is otherwise the
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

        /**
         * Returns a raw HTTP response for `delete /platform/external-accounts/{externalAccountId}`,
         * but is otherwise the same as [ExternalAccountServiceAsync.delete].
         */
        @MustBeClosed
        suspend fun delete(
            externalAccountId: String,
            params: ExternalAccountDeleteParams = ExternalAccountDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().externalAccountId(externalAccountId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            params: ExternalAccountDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        suspend fun delete(
            externalAccountId: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            delete(externalAccountId, ExternalAccountDeleteParams.none(), requestOptions)
    }
}
