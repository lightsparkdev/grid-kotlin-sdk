// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.async.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClientAsync
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
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
                        "MEUCIQDx7k2N0aK4p8f3vR9J6yT5wL1mB0sXnG2hQ4vJ8zYkCgIgZ4rP9dT7eWfU3oM6KjR1qSpNvBwL0tXyA2iG8fH5dE="
                    )
                    .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .type(CredentialCreateParams.Type.EMAIL_OTP)
                    .build()
            )

        credential.validate()
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
                    .clientPublicKey(
                        "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                    )
                    .otp("123456")
                    .type(CredentialVerifyParams.Type.EMAIL_OTP)
                    .build()
            )

        response.validate()
    }
}
