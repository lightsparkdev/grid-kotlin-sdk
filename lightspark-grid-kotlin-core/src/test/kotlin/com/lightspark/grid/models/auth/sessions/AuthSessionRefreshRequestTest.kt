// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthSessionRefreshRequestTest {

    @Test
    fun create() {
        val authSessionRefreshRequest =
            AuthSessionRefreshRequest.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .build()

        assertThat(authSessionRefreshRequest.clientPublicKey())
            .isEqualTo(
                "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authSessionRefreshRequest =
            AuthSessionRefreshRequest.builder()
                .clientPublicKey(
                    "04f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31d4245acfb88c2ebd42b47628d63ecabf345484f0a9f665b63c54c897d5578be2"
                )
                .build()

        val roundtrippedAuthSessionRefreshRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authSessionRefreshRequest),
                jacksonTypeRef<AuthSessionRefreshRequest>(),
            )

        assertThat(roundtrippedAuthSessionRefreshRequest).isEqualTo(authSessionRefreshRequest)
    }
}
