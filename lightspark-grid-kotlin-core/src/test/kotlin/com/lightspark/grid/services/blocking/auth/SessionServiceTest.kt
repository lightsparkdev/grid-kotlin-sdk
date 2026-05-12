// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.auth.sessions.SessionDeleteParams
import com.lightspark.grid.models.auth.sessions.SessionListParams
import com.lightspark.grid.models.auth.sessions.SessionRefreshParams
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

        val sessionListResponse =
            sessionService.list(SessionListParams.builder().accountId("accountId").build())

        sessionListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionService = client.auth().sessions()

        val authSignedRequestChallenge =
            sessionService.delete(
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
    fun refresh() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val sessionService = client.auth().sessions()

        val authSession =
            sessionService.refresh(
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
