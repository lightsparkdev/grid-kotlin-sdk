// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SandboxServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendFunds() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sandboxService = client.sandbox()

        val response =
            sandboxService.sendFunds(
                SandboxSendFundsParams.builder()
                    .currencyCode("USD")
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .currencyAmount(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendTestWebhook() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sandboxService = client.sandbox()

        val response = sandboxService.sendTestWebhook()

        response.validate()
    }
}
