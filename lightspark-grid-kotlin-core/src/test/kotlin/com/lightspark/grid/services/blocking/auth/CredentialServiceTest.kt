// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.auth.credentials.AuthCredentialVerifyRequestOneOf
import com.lightspark.grid.models.auth.credentials.CredentialChallengeParams
import com.lightspark.grid.models.auth.credentials.CredentialCreateParams
import com.lightspark.grid.models.auth.credentials.CredentialDeleteParams
import com.lightspark.grid.models.auth.credentials.CredentialListParams
import com.lightspark.grid.models.auth.credentials.CredentialVerifyParams
import com.lightspark.grid.models.auth.credentials.EmailOtpCredentialCreateRequest
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
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val credentialService = client.auth().credentials()

        val authMethodResponse =
            credentialService.create(
                CredentialCreateParams.builder()
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzaWduYXR1cmUiOiIzMDQ1MDIyMTAwLi4uIiwic2NoZW1lIjoiUDI1Nl9FQ0RTQV9TSEEyNTYifQ"
                    )
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .authCredentialCreateRequest(
                        EmailOtpCredentialCreateRequest.builder()
                            .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                            .type(JsonValue.from("EMAIL_OTP"))
                            .build()
                    )
                    .build()
            )

        authMethodResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val credentialService = client.auth().credentials()

        val authCredentialListResponse =
            credentialService.list(CredentialListParams.builder().accountId("accountId").build())

        authCredentialListResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val credentialService = client.auth().credentials()

        val authSignedRequestChallenge =
            credentialService.delete(
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
    fun challenge() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val credentialService = client.auth().credentials()

        val authCredentialResponseOneOf =
            credentialService.challenge(
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
    fun verify() {
        val client =
            LightsparkGridOkHttpClient.builder()
                .username("My Username")
                .password("My Password")
                .agentAccessToken("My Agent Access Token")
                .webhookSignature("My Webhook Signature")
                .build()
        val credentialService = client.auth().credentials()

        val authSession =
            credentialService.verify(
                CredentialVerifyParams.builder()
                    .id("id")
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .authCredentialVerifyRequest(AuthCredentialVerifyRequestOneOf.builder().build())
                    .build()
            )

        authSession.validate()
    }
}
