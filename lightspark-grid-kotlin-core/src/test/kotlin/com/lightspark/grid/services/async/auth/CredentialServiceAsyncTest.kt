// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialRevokeParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val credential =
            credentialServiceAsync.create(
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
            )

        credential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val credentials =
            credentialServiceAsync.list(
                CredentialListParams.builder().accountId("accountId").build()
            )

        credentials.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun resendChallenge() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val response = credentialServiceAsync.resendChallenge("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun revoke() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val response =
            credentialServiceAsync.revoke(
                CredentialRevokeParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun verify() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val response =
            credentialServiceAsync.verify(
                CredentialVerifyParams.builder()
                    .id("id")
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .authCredentialVerifyRequest(
                        CredentialVerifyParams.AuthCredentialVerifyRequest
                            .EmailOtpCredentialVerifyRequest
                            .builder()
                            .clientPublicKey(
                                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                            )
                            .otp("123456")
                            .type(
                                CredentialVerifyParams.AuthCredentialVerifyRequest
                                    .EmailOtpCredentialVerifyRequest
                                    .Type
                                    .EMAIL_OTP
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
