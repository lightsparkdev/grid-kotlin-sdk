// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.auth.AuthListSessionsParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AuthServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listSessions() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val authServiceAsync = client.auth()

        val response =
            authServiceAsync.listSessions(
                AuthListSessionsParams.builder().accountId("accountId").build()
            )

        response.validate()
    }
}
