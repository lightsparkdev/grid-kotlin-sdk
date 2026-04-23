// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialRevokeParamsTest {

    @Test
    fun create() {
        CredentialRevokeParams.builder()
            .id("id")
            .gridWalletSignature(
                "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
            )
            .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CredentialRevokeParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            CredentialRevokeParams.builder()
                .id("id")
                .gridWalletSignature(
                    "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder()
                    .put(
                        "Grid-Wallet-Signature",
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE=",
                    )
                    .put("Request-Id", "7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CredentialRevokeParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
