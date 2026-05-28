// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.sandbox

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.blocking.sandbox.cards.SimulateService

interface CardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService

    /** Endpoints to trigger test cases in sandbox */
    fun simulate(): SimulateService

    /** A view of [CardService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService.WithRawResponse

        /** Endpoints to trigger test cases in sandbox */
        fun simulate(): SimulateService.WithRawResponse
    }
}
