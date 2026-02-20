// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.exchangerates.ExchangeRateListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ExchangeRateServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val exchangeRateServiceAsync = client.exchangeRates()

        val exchangeRates =
            exchangeRateServiceAsync.list(
                ExchangeRateListParams.builder()
                    .addDestinationCurrency("string")
                    .sendingAmount(0L)
                    .sourceCurrency("sourceCurrency")
                    .build()
            )

        exchangeRates.validate()
    }
}
