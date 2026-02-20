// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.sandbox.SandboxSendFundsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SandboxServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun sendFunds() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sandboxServiceAsync = client.sandbox()

        val response =
            sandboxServiceAsync.sendFunds(
                SandboxSendFundsParams.builder()
                    .currencyCode("USD")
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .currencyAmount(1000L)
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun sendTestWebhook() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sandboxServiceAsync = client.sandbox()

        val response = sandboxServiceAsync.sendTestWebhook()

        response.validate()
    }
}
