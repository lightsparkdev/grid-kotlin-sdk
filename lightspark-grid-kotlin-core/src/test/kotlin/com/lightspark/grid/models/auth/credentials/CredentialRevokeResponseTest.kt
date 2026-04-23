// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialRevokeResponseTest {

    @Test
    fun create() {
        val credentialRevokeResponse =
            CredentialRevokeResponse.builder()
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .payloadToSign("Y2hhbGxlbmdlLXBheWxvYWQtdG8tc2lnbg==")
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .type(CredentialRevokeResponse.Type.OAUTH)
                .build()

        assertThat(credentialRevokeResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
        assertThat(credentialRevokeResponse.payloadToSign())
            .isEqualTo("Y2hhbGxlbmdlLXBheWxvYWQtdG8tc2lnbg==")
        assertThat(credentialRevokeResponse.requestId())
            .isEqualTo("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
        assertThat(credentialRevokeResponse.type()).isEqualTo(CredentialRevokeResponse.Type.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialRevokeResponse =
            CredentialRevokeResponse.builder()
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .payloadToSign("Y2hhbGxlbmdlLXBheWxvYWQtdG8tc2lnbg==")
                .requestId("7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .type(CredentialRevokeResponse.Type.OAUTH)
                .build()

        val roundtrippedCredentialRevokeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialRevokeResponse),
                jacksonTypeRef<CredentialRevokeResponse>(),
            )

        assertThat(roundtrippedCredentialRevokeResponse).isEqualTo(credentialRevokeResponse)
    }
}
