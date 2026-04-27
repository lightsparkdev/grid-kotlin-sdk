// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionRevokeParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SessionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionServiceAsync = client.auth().sessions()

        val sessions =
            sessionServiceAsync.list(SessionListParams.builder().accountId("accountId").build())

        sessions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun revoke() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionServiceAsync = client.auth().sessions()

        val response =
            sessionServiceAsync.revoke(
                SessionRevokeParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )

        response.validate()
    }
}
