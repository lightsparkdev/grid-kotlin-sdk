// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.sandbox

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun sendTest() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val webhookServiceAsync = client.sandbox().webhooks()

        val response = webhookServiceAsync.sendTest()

        response.validate()
    }
}
