// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.core.ClientOptions

class PlaidServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PlaidService {

    private val withRawResponse: PlaidService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PlaidService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PlaidService =
        PlaidServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PlaidService.WithRawResponse {

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PlaidService.WithRawResponse =
            PlaidServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())
    }
}
