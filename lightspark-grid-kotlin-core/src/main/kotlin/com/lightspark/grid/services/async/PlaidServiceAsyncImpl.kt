// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.core.ClientOptions

class PlaidServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaidServiceAsync {

    private val withRawResponse: PlaidServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaidServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaidServiceAsync =
        PlaidServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaidServiceAsync.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaidServiceAsync.WithRawResponse =
            PlaidServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )
    }
}
