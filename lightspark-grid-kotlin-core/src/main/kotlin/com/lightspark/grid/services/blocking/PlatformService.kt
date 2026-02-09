// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.platform.PlatformListInternalAccountsParams
import com.lightspark.grid.models.platform.PlatformListInternalAccountsResponse
import com.lightspark.grid.services.blocking.platform.ExternalAccountService

interface PlatformService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlatformService

    fun externalAccounts(): ExternalAccountService

    /**
     * Retrieve a list of all internal accounts that belong to the platform, as opposed to an
     * individual customer.
     *
     * These accounts are created automatically when the platform is configured for each supported
     * currency. They can be used for things like distributing bitcoin rewards to customers, or for
     * other platform-wide purposes.
     */
    fun listInternalAccounts(
        params: PlatformListInternalAccountsParams = PlatformListInternalAccountsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PlatformListInternalAccountsResponse

    /** @see listInternalAccounts */
    fun listInternalAccounts(requestOptions: RequestOptions): PlatformListInternalAccountsResponse =
        listInternalAccounts(PlatformListInternalAccountsParams.none(), requestOptions)

    /** A view of [PlatformService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlatformService.WithRawResponse

        fun externalAccounts(): ExternalAccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /platform/internal-accounts`, but is otherwise the
         * same as [PlatformService.listInternalAccounts].
         */
        @MustBeClosed
        fun listInternalAccounts(
            params: PlatformListInternalAccountsParams = PlatformListInternalAccountsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PlatformListInternalAccountsResponse>

        /** @see listInternalAccounts */
        @MustBeClosed
        fun listInternalAccounts(
            requestOptions: RequestOptions
        ): HttpResponseFor<PlatformListInternalAccountsResponse> =
            listInternalAccounts(PlatformListInternalAccountsParams.none(), requestOptions)
    }
}
