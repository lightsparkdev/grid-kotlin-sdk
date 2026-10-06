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
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
                )
                .build()

        assertThat(authSessionRefreshRequest.clientPublicKey())
            .isEqualTo("02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authSessionRefreshRequest =
            AuthSessionRefreshRequest.builder()
                .clientPublicKey(
                    "02f45f2a22c908b9ce09a7150e514afd24627c401c38a4afc164e1ea783adaaa31"
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
