// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.auth.credentials.CredentialChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialDeleteParams
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialUpdateParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import com.lightspark.grid.models.auth.credentials.EmailOtpCredentialVerifyRequestFields
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

        val authMethodResponse =
            credentialServiceAsync.create(
                CredentialCreateParams.builder()
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .emailOtpAuthCredentialCreateRequest(
                        "InternalAccount:019542f5-b3e7-1d02-0000-000000000002"
                    )
                    .build()
            )

        authMethodResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun update() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val authMethodResponse =
            credentialServiceAsync.update(
                CredentialUpdateParams.builder()
                    .id("id")
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .email("new.email@example.com")
                    .build()
            )

        authMethodResponse.validate()
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

        val authCredentialListResponse =
            credentialServiceAsync.list(
                CredentialListParams.builder().accountId("accountId").build()
            )

        authCredentialListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val authSignedRequestChallenge =
            credentialServiceAsync.delete(
                CredentialDeleteParams.builder()
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
    suspend fun challenge() {
        val client =
            LightsparkGridOkHttpClientAsync.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialServiceAsync = client.auth().credentials()

        val authCredentialResponseOneOf =
            credentialServiceAsync.challenge(
                CredentialChallengeParams.builder()
                    .id("id")
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .build()
            )

        authCredentialResponseOneOf.validate()
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

        val authSession =
            credentialServiceAsync.verify(
                CredentialVerifyParams.builder()
                    .id("id")
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .authCredentialVerifyRequest(
                        EmailOtpCredentialVerifyRequestFields.builder()
                            .clientPublicKey(
                                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                            )
                            .otp("123456")
                            .type(EmailOtpCredentialVerifyRequestFields.Type.EMAIL_OTP)
                            .build()
                    )
                    .build()
            )

        authSession.validate()
    }
}
