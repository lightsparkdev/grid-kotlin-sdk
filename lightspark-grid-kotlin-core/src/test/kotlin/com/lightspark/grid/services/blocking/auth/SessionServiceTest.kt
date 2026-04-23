// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionRevokeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SessionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionService = client.auth().sessions()

        val sessions =
            sessionService.list(SessionListParams.builder().accountId("accountId").build())

        sessions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun revoke() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionService = client.auth().sessions()

        val response =
            sessionService.revoke(
                SessionRevokeParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )

        response.validate()
    }
}
