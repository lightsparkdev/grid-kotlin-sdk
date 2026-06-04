// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialVerifyParamsTest {

    @Test
    fun create() {
        CredentialVerifyParams.builder()
            .id("id")
            .gridWalletSignature(
                "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
            )
            .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
            .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                )
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9",
                    )
                    .put("Request-Id", "Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .gridWalletSignature(
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                )
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AuthCredentialVerifyRequestOneOf.builder().build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CredentialVerifyParams.builder()
                .id("id")
                .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(AuthCredentialVerifyRequestOneOf.builder().build())
    }
}
