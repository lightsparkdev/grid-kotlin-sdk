// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeviceCodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun deviceCodes() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeServiceAsync = client.agents().deviceCodes()

        val response = deviceCodeServiceAsync.deviceCodes("agentId")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun redeem() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeServiceAsync = client.agents().deviceCodes()

        val response = deviceCodeServiceAsync.redeem("code")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieveStatus() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeServiceAsync = client.agents().deviceCodes()

        val response = deviceCodeServiceAsync.retrieveStatus("code")

        response.validate()
    }
}
