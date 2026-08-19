// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.core.RequestOptions
import com.lightspark.grid.core.http.HttpResponseFor
import com.lightspark.grid.models.vasps.VaspListParams
import com.lightspark.grid.models.vasps.VaspListResponse

/**
 * Directory of Virtual Asset Service Providers (exchanges and other custodial platforms) recognized
 * for counterparty declarations.
 */
interface VaspService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VaspService

    /**
     * Retrieve the directory of Virtual Asset Service Providers (exchanges and other custodial
     * platforms) recognized for counterparty declarations.
     *
     * The `vaspName` field in each result is the value to pass as `vaspName` when declaring a
     * VASP-hosted counterparty.
     */
    fun list(
        params: VaspListParams = VaspListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VaspListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): VaspListResponse =
        list(VaspListParams.none(), requestOptions)

    /** A view of [VaspService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): VaspService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /vasps`, but is otherwise the same as
         * [VaspService.list].
         */
        @MustBeClosed
        fun list(
            params: VaspListParams = VaspListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VaspListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<VaspListResponse> =
            list(VaspListParams.none(), requestOptions)
    }
}
