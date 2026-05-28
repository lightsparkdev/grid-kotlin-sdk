// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.auth.credentials.AuthMethodType
import com.lightspark.grid.models.auth.credentials.AuthSession
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionListResponseTest {

    @Test
    fun create() {
        val sessionListResponse =
            SessionListResponse.builder()
                .addData(
                    AuthSession.builder()
                        .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(AuthMethodType.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .credentialId(
                            "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                        )
                        .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                        .encryptedSessionSigningKey(
                            "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                        )
                        .build()
                )
                .build()

        assertThat(sessionListResponse.data())
            .containsExactly(
                AuthSession.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthMethodType.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .credentialId(
                        "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                    )
                    .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                    .encryptedSessionSigningKey(
                        "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionListResponse =
            SessionListResponse.builder()
                .addData(
                    AuthSession.builder()
                        .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(AuthMethodType.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .credentialId(
                            "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                        )
                        .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                        .encryptedSessionSigningKey(
                            "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                        )
                        .build()
                )
                .build()

        val roundtrippedSessionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionListResponse),
                jacksonTypeRef<SessionListResponse>(),
            )

        assertThat(roundtrippedSessionListResponse).isEqualTo(sessionListResponse)
    }
}
