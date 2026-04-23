// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthListSessionsResponseTest {

    @Test
    fun create() {
        val authListSessionsResponse =
            AuthListSessionsResponse.builder()
                .addData(
                    AuthListSessionsResponse.Data.builder()
                        .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(AuthListSessionsResponse.Data.Type.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .encryptedSessionSigningKey(
                            "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                        )
                        .build()
                )
                .build()

        assertThat(authListSessionsResponse.data())
            .containsExactly(
                AuthListSessionsResponse.Data.builder()
                    .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(AuthListSessionsResponse.Data.Type.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .encryptedSessionSigningKey(
                        "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authListSessionsResponse =
            AuthListSessionsResponse.builder()
                .addData(
                    AuthListSessionsResponse.Data.builder()
                        .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(AuthListSessionsResponse.Data.Type.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .encryptedSessionSigningKey(
                            "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                        )
                        .build()
                )
                .build()

        val roundtrippedAuthListSessionsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authListSessionsResponse),
                jacksonTypeRef<AuthListSessionsResponse>(),
            )

        assertThat(roundtrippedAuthListSessionsResponse).isEqualTo(authListSessionsResponse)
    }
}
