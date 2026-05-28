// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox

import com.lightspark.grid.core.ClientOptions
import com.lightspark.grid.services.async.sandbox.cards.SimulateServiceAsync
import com.lightspark.grid.services.async.sandbox.cards.SimulateServiceAsyncImpl

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val simulate: SimulateServiceAsync by lazy { SimulateServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    /** Endpoints to trigger test cases in sandbox */
    override fun simulate(): SimulateServiceAsync = simulate

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val simulate: SimulateServiceAsync.WithRawResponse by lazy {
            SimulateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        /** Endpoints to trigger test cases in sandbox */
        override fun simulate(): SimulateServiceAsync.WithRawResponse = simulate
    }
}
