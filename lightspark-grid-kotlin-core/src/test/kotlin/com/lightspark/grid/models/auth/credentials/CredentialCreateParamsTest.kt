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
                "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
            )
            .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
            .authCredentialCreateRequest(
                CredentialCreateParams.AuthCredentialCreateRequest.EmailOtpCredentialCreateRequest
                    .builder()
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .type(
                        CredentialCreateParams.AuthCredentialCreateRequest
                            .EmailOtpCredentialCreateRequest
                            .Type
                            .EMAIL_OTP
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
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .authCredentialCreateRequest(
                    CredentialCreateParams.AuthCredentialCreateRequest
                        .EmailOtpCredentialCreateRequest
                        .builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.AuthCredentialCreateRequest
                                .EmailOtpCredentialCreateRequest
                                .Type
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
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ",
                    )
                    .put("Request-Id", "7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            CredentialCreateParams.builder()
                .authCredentialCreateRequest(
                    CredentialCreateParams.AuthCredentialCreateRequest
                        .EmailOtpCredentialCreateRequest
                        .builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.AuthCredentialCreateRequest
                                .EmailOtpCredentialCreateRequest
                                .Type
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
                    "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                )
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .authCredentialCreateRequest(
                    CredentialCreateParams.AuthCredentialCreateRequest
                        .EmailOtpCredentialCreateRequest
                        .builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.AuthCredentialCreateRequest
                                .EmailOtpCredentialCreateRequest
                                .Type
                                .EMAIL_OTP
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CredentialCreateParams.AuthCredentialCreateRequest.ofEmailOtp(
                    CredentialCreateParams.AuthCredentialCreateRequest
                        .EmailOtpCredentialCreateRequest
                        .builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.AuthCredentialCreateRequest
                                .EmailOtpCredentialCreateRequest
                                .Type
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
                .authCredentialCreateRequest(
                    CredentialCreateParams.AuthCredentialCreateRequest
                        .EmailOtpCredentialCreateRequest
                        .builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.AuthCredentialCreateRequest
                                .EmailOtpCredentialCreateRequest
                                .Type
                                .EMAIL_OTP
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CredentialCreateParams.AuthCredentialCreateRequest.ofEmailOtp(
                    CredentialCreateParams.AuthCredentialCreateRequest
                        .EmailOtpCredentialCreateRequest
                        .builder()
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .type(
                            CredentialCreateParams.AuthCredentialCreateRequest
                                .EmailOtpCredentialCreateRequest
                                .Type
                                .EMAIL_OTP
                        )
                        .build()
                )
            )
    }
}
