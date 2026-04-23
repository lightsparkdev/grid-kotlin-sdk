// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CredentialServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialService = client.auth().credentials()

        val credential =
            credentialService.create(
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
            )

        credential.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendChallenge() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialService = client.auth().credentials()

        val response = credentialService.resendChallenge("id")

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .build()
        val credentialService = client.auth().credentials()

        val response =
            credentialService.verify(
                CredentialVerifyParams.builder()
                    .id("id")
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .body(
                        CredentialVerifyParams.Body.EmailOtpCredentialVerifyRequest.builder()
                            .clientPublicKey(
                                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                            )
                            .otp("123456")
                            .type(
                                CredentialVerifyParams.Body.EmailOtpCredentialVerifyRequest.Type
                                    .EMAIL_OTP
                            )
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
