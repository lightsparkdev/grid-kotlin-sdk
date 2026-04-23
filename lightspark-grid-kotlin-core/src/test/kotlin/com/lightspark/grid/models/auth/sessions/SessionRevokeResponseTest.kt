// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRevokeResponseTest {

    @Test
    fun create() {
        val sessionRevokeResponse =
            SessionRevokeResponse.builder()
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .payloadToSign("Y2hhbGxlbmdlLXBheWxvYWQtdG8tc2lnbg==")
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .type(SessionRevokeResponse.Type.OAUTH)
                .build()

        assertThat(sessionRevokeResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
        assertThat(sessionRevokeResponse.payloadToSign())
            .isEqualTo("Y2hhbGxlbmdlLXBheWxvYWQtdG8tc2lnbg==")
        assertThat(sessionRevokeResponse.requestId())
            .isEqualTo("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
        assertThat(sessionRevokeResponse.type()).isEqualTo(SessionRevokeResponse.Type.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionRevokeResponse =
            SessionRevokeResponse.builder()
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .payloadToSign("Y2hhbGxlbmdlLXBheWxvYWQtdG8tc2lnbg==")
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .type(SessionRevokeResponse.Type.OAUTH)
                .build()

        val roundtrippedSessionRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionRevokeResponse),
                jacksonTypeRef<SessionRevokeResponse>(),
            )

        assertThat(roundtrippedSessionRevokeResponse).isEqualTo(sessionRevokeResponse)
    }
}
