// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.auth.AuthListSessionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listSessions() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val authService = client.auth()

        val response =
            authService.listSessions(
                AuthListSessionsParams.builder().accountId("accountId").build()
            )

        response.validate()
    }
}
