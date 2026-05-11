// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeviceCodeServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun getStatus() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeServiceAsync = client.agents().deviceCodes()

        val agentDeviceCodeStatusResponse = deviceCodeServiceAsync.getStatus("code")

        agentDeviceCodeStatusResponse.validate()
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

        val agentDeviceCodeRedeemResponse = deviceCodeServiceAsync.redeem("code")

        agentDeviceCodeRedeemResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun regenerate() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeServiceAsync = client.agents().deviceCodes()

        val agentDeviceCode = deviceCodeServiceAsync.regenerate("agentId")

        agentDeviceCode.validate()
    }
}
