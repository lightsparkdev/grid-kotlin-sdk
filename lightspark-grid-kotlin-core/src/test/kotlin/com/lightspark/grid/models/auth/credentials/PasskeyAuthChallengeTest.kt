// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PasskeyAuthChallengeTest {

    @Test
    fun create() {
        val passkeyAuthChallenge =
            PasskeyAuthChallenge.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .credentialId(
                    "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                )
                .challenge("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .build()

        assertThat(passkeyAuthChallenge.id())
            .isEqualTo("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(passkeyAuthChallenge.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(passkeyAuthChallenge.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
        assertThat(passkeyAuthChallenge.nickname()).isEqualTo("example@lightspark.com")
        assertThat(passkeyAuthChallenge.type()).isEqualTo(AuthMethodType.OAUTH)
        assertThat(passkeyAuthChallenge.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
        assertThat(passkeyAuthChallenge.credentialId())
            .isEqualTo(
                "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
            )
        assertThat(passkeyAuthChallenge.challenge()).isEqualTo("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
        assertThat(passkeyAuthChallenge.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
        assertThat(passkeyAuthChallenge.requestId())
            .isEqualTo("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val passkeyAuthChallenge =
            PasskeyAuthChallenge.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .credentialId(
                    "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                )
                .challenge("VjZ6o8KfE9V3q3LkR2nH5eZ6dM8yA1xW")
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .build()

        val roundtrippedPasskeyAuthChallenge =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(passkeyAuthChallenge),
                jacksonTypeRef<PasskeyAuthChallenge>(),
            )

        assertThat(roundtrippedPasskeyAuthChallenge).isEqualTo(passkeyAuthChallenge)
    }
}
