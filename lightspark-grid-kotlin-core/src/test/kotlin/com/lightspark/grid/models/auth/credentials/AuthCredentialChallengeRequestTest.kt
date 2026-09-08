// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthCredentialChallengeRequestTest {

    @Test
    fun create() {
        val authCredentialChallengeRequest =
            AuthCredentialChallengeRequest.builder()
                .clientPublicKey(
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                )
                .build()

        assertThat(authCredentialChallengeRequest.clientPublicKey())
            .isEqualTo("02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authCredentialChallengeRequest =
            AuthCredentialChallengeRequest.builder()
                .clientPublicKey(
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                )
                .build()

        val roundtrippedAuthCredentialChallengeRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authCredentialChallengeRequest),
                jacksonTypeRef<AuthCredentialChallengeRequest>(),
            )

        assertThat(roundtrippedAuthCredentialChallengeRequest)
            .isEqualTo(authCredentialChallengeRequest)
    }
}
