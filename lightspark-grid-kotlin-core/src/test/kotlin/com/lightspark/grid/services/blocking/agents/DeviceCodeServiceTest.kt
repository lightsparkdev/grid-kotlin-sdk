// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.agents

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class DeviceCodeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getStatus() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeService = client.agents().deviceCodes()

        val response = deviceCodeService.getStatus("code")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun redeem() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeService = client.agents().deviceCodes()

        val response = deviceCodeService.redeem("code")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun regenerate() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val deviceCodeService = client.agents().deviceCodes()

        val response = deviceCodeService.regenerate("agentId")

        response.validate()
    }
}
