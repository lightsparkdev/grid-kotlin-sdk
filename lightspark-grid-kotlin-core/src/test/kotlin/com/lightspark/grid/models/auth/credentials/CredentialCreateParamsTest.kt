// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialCreateParamsTest {

    @Test
    fun create() {
        CredentialCreateParams.builder()
            .gridWalletSignature(
                "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
            )
            .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
            .body(
                CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .type(
                        CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type.EMAIL_OTP
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            CredentialCreateParams.builder()
                .gridWalletSignature(
                    "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .body(
                    CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type
                                .EMAIL_OTP
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
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE=",
                    )
                    .put("Request-Id", "7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CredentialCreateParams.builder()
                .body(
                    CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type
                                .EMAIL_OTP
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
            CredentialCreateParams.builder()
                .gridWalletSignature(
                    "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .body(
                    CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type
                                .EMAIL_OTP
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CredentialCreateParams.Body.ofEmailOtpCredentialCreateRequest(
                    CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type
                                .EMAIL_OTP
                        )
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CredentialCreateParams.builder()
                .body(
                    CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type
                                .EMAIL_OTP
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CredentialCreateParams.Body.ofEmailOtpCredentialCreateRequest(
                    CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.Body.EmailOtpCredentialCreateRequest.Type
                                .EMAIL_OTP
                        )
                        .build()
                )
            )
    }
}
