// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox.cards

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.sandbox.cards.simulate.CardMerchant
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateAuthorizationParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateClearingParams
import com.lightspark.grid.models.sandbox.cards.simulate.SimulateReturnParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimulateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun authorization() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val simulateServiceAsync = client.sandbox().cards().simulate()

        val response =
            simulateServiceAsync.authorization(
                SimulateAuthorizationParams.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .amount(1250L)
                    .currency(
                        Currency.builder()
                            .code("USD")
                            .decimals(2L)
                            .name("United States Dollar")
                            .symbol("\$")
                            .build()
                    )
                    .merchant(
                        CardMerchant.builder()
                            .descriptor("BLUE BOTTLE COFFEE SF")
                            .country("US")
                            .mcc("5814")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun clearing() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val simulateServiceAsync = client.sandbox().cards().simulate()

        val response =
            simulateServiceAsync.clearing(
                SimulateClearingParams.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .amount(1500L)
                    .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun return_() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val simulateServiceAsync = client.sandbox().cards().simulate()

        val response =
            simulateServiceAsync.return_(
                SimulateReturnParams.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .amount(1500L)
                    .cardTransactionId("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
                    .build()
            )

        response.validate()
    }
}
