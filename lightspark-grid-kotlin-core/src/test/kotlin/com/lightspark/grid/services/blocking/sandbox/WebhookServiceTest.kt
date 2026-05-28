// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.sandbox

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun sendTest() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val webhookService = client.sandbox().webhooks()

        val response = webhookService.sendTest()

        response.validate()
    }
}
