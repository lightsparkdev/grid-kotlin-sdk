// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialChallengeParamsTest {

    @Test
    fun create() {
        CredentialChallengeParams.builder()
            .id("id")
            .authCredentialChallengeRequest(
                AuthCredentialChallengeRequest.builder()
                    .clientPublicKey(
                        "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CredentialChallengeParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CredentialChallengeParams.builder()
                .id("id")
                .authCredentialChallengeRequest(
                    AuthCredentialChallengeRequest.builder()
                        .clientPublicKey(
                            "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                AuthCredentialChallengeRequest.builder()
                    .clientPublicKey(
                        "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CredentialChallengeParams.builder().id("id").build()

        val body = params._body()
    }
}
