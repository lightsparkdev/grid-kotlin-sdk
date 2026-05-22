// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.sandbox

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.blocking.sandbox.cards.SimulateService
import com.lightspark.grid.services.blocking.sandbox.cards.SimulateServiceImpl

class CardServiceImpl internal constructor(private val clientOptions: ClientOptions) : CardService {

    private val withRawResponse: CardService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val simulate: SimulateService by lazy { SimulateServiceImpl(clientOptions) }

    override fun withRawResponse(): CardService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardService =
        CardServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Endpoints to trigger test cases in sandbox */
    override fun simulate(): SimulateService = simulate

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardService.WithRawResponse {

        private val simulate: SimulateService.WithRawResponse by lazy {
            SimulateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardService.WithRawResponse =
            CardServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        /** Endpoints to trigger test cases in sandbox */
        override fun simulate(): SimulateService.WithRawResponse = simulate
    }
}
