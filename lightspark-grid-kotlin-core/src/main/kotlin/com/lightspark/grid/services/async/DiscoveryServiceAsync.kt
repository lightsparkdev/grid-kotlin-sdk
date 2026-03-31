// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.discoveries.DiscoveryListParams
import com.lightspark.grid.models.discoveries.DiscoveryListResponse

/**
 * Endpoints for discovering available payment rails, banks, and providers for a given country and
 * currency corridor.
 */
interface DiscoveryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DiscoveryServiceAsync

    /**
     * Retrieve available payment institution names for a given country and currency. Use this
     * endpoint to look up supported banks and payment providers for a specific corridor. If no
     * country and currency parameter are provided, all payment institutions will be returned
     *
     * The `bankName` field in each result is the value to pass as `bankName` when creating an
     * external account via `POST /customers/external-accounts`.
     */
    suspend fun list(
        params: DiscoveryListParams = DiscoveryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DiscoveryListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DiscoveryListResponse =
        list(DiscoveryListParams.none(), requestOptions)

    /**
     * A view of [DiscoveryServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DiscoveryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /discoveries`, but is otherwise the same as
         * [DiscoveryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DiscoveryListParams = DiscoveryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DiscoveryListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DiscoveryListResponse> =
            list(DiscoveryListParams.none(), requestOptions)
    }
}
