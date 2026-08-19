// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRefreshParamsTest {

    @Test
    fun create() {
        SessionRefreshParams.builder()
            .id("Session:019542f5-b3e7-1d02-0000-000000000003")
            .gridWalletSignature(
                "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
            )
            .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
            .authSessionRefreshRequest(
                AuthSessionRefreshRequest.builder()
                    .clientPublicKey(
                        "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SessionRefreshParams.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .authSessionRefreshRequest(
                    AuthSessionRefreshRequest.builder()
                        .clientPublicKey(
                            "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                        )
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("Session:019542f5-b3e7-1d02-0000-000000000003")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            SessionRefreshParams.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                )
                .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                .authSessionRefreshRequest(
                    AuthSessionRefreshRequest.builder()
                        .clientPublicKey(
                            "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9",
                    )
                    .put("Request-Id", "Request:019542f5-b3e7-1d02-0000-000000000010")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            SessionRefreshParams.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .authSessionRefreshRequest(
                    AuthSessionRefreshRequest.builder()
                        .clientPublicKey(
                            "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            SessionRefreshParams.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                )
                .requestId("Request:019542f5-b3e7-1d02-0000-000000000010")
                .authSessionRefreshRequest(
                    AuthSessionRefreshRequest.builder()
                        .clientPublicKey(
                            "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthSessionRefreshRequest.builder()
                    .clientPublicKey(
                        "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SessionRefreshParams.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .authSessionRefreshRequest(
                    AuthSessionRefreshRequest.builder()
                        .clientPublicKey(
                            "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthSessionRefreshRequest.builder()
                    .clientPublicKey(
                        "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                    )
                    .build()
            )
    }
}
