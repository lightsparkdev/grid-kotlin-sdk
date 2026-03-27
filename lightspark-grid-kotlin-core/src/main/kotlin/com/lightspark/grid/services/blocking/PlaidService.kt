// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.core.ClientOptions

interface PlaidService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaidService

    /** A view of [PlaidService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaidService.WithRawResponse
    }
}
