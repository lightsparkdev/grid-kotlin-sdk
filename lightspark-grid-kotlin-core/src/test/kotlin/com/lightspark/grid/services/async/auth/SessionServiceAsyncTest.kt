// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.auth.sessions.SessionDeleteParams
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionRefreshParams
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

        val sessionListResponse =
            sessionServiceAsync.list(SessionListParams.builder().accountId("accountId").build())

        sessionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionServiceAsync = client.auth().sessions()

        val authSignedRequestChallenge =
            sessionServiceAsync.delete(
                SessionDeleteParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )

        authSignedRequestChallenge.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun refresh() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionServiceAsync = client.auth().sessions()

        val authSession =
            sessionServiceAsync.refresh(
                SessionRefreshParams.builder()
                    .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .build()
            )

        authSession.validate()
    }
}
