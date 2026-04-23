// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialVerifyResponseTest {

    @Test
    fun create() {
        val credentialVerifyResponse =
            CredentialVerifyResponse.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .encryptedSessionSigningKey(
                    "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                )
                .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(CredentialVerifyResponse.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        assertThat(credentialVerifyResponse.id())
            .isEqualTo("Session:019542f5-b3e7-1d02-0000-000000000003")
        assertThat(credentialVerifyResponse.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(credentialVerifyResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
        assertThat(credentialVerifyResponse.encryptedSessionSigningKey())
            .isEqualTo(
                "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
            )
        assertThat(credentialVerifyResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
        assertThat(credentialVerifyResponse.nickname()).isEqualTo("example@lightspark.com")
        assertThat(credentialVerifyResponse.type()).isEqualTo(CredentialVerifyResponse.Type.OAUTH)
        assertThat(credentialVerifyResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialVerifyResponse =
            CredentialVerifyResponse.builder()
                .id("Session:019542f5-b3e7-1d02-0000-000000000003")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .encryptedSessionSigningKey(
                    "w99a5xV6A75TfoAUkZn869fVyDYvgVsKrawMALZXmrauZd8hEv66EkPU1Z42CUaHESQjcA5bqd8dynTGBMLWB9ewtXWPEVbZvocB4Tw2K1vQVp7uwjf"
                )
                .expiresAt(OffsetDateTime.parse("2026-04-09T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(CredentialVerifyResponse.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        val roundtrippedCredentialVerifyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialVerifyResponse),
                jacksonTypeRef<CredentialVerifyResponse>(),
            )

        assertThat(roundtrippedCredentialVerifyResponse).isEqualTo(credentialVerifyResponse)
    }
}
