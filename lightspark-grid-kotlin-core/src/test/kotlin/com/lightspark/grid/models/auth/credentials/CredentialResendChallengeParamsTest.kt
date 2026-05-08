// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialResendChallengeParamsTest {

    @Test
    fun create() {
        CredentialResendChallengeParams.builder()
            .id("id")
            .clientPublicKey(
                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CredentialResendChallengeParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CredentialResendChallengeParams.builder()
                .id("id")
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .build()

        val body = params._body()

        assertThat(body.clientPublicKey())
            .isEqualTo(
                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CredentialResendChallengeParams.builder().id("id").build()

        val body = params._body()
    }
}
