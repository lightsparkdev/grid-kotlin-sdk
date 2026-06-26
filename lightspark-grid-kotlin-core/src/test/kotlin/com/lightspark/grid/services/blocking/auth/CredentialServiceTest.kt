// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.services.blocking.auth

import com.lightspark.grid.client.okhttp.LightsparkGridOkHttpClient
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.models.auth.credentials.AuthCredentialChallengeRequest
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
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
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
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
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
                    .authCredentialChallengeRequest(
                        AuthCredentialChallengeRequest.builder()
                            .clientPublicKey(
                                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                            )
                            .build()
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
                    .gridWalletSignature(
                        "eyJwdWJsaWNLZXkiOiIwMmExYjIuLi4iLCJzY2hlbWUiOiJTSUdOQVRVUkVfU0NIRU1FX1RLX0FQSV9QMjU2Iiwic2lnbmF0dXJlIjoiMzA0NTAyMjEwMC4uLiJ9"
                    )
                    .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                    .authCredentialVerifyRequest(
                        AuthCredentialVerifyRequestOneOf.builder()
                            .type(JsonValue.from("SMS_OTP"))
                            .encryptedOtpBundle(
                                "{\"encappedPublic\":\"044f631a2d890bc6668d997ee184e190650d06adf970987568ec641214a00403b73effe1ef406c60a5cde8508a4484567ddb8056fbd493bee614cd727aef02a838\",\"ciphertext\":\"1fa1023390a56539aa48cbb380aa28f544ed5cc04861566bb806e25ba026f14660eaf4140a05b388dd012eaa899759a6a92576cdca8c1b7d12e147bd96cc26ed9f74886794155d8ac5cf0fdc\"}"
                            )
                            .build()
                    )
                    .build()
            )

        authSession.validate()
    }
}
