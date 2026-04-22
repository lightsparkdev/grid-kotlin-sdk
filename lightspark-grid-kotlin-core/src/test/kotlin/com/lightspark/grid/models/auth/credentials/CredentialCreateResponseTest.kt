// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialCreateResponseTest {

    @Test
    fun create() {
        val credentialCreateResponse =
            CredentialCreateResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(CredentialCreateResponse.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        assertThat(credentialCreateResponse.id())
            .isEqualTo("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(credentialCreateResponse.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(credentialCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
        assertThat(credentialCreateResponse.nickname()).isEqualTo("example@lightspark.com")
        assertThat(credentialCreateResponse.type()).isEqualTo(CredentialCreateResponse.Type.OAUTH)
        assertThat(credentialCreateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialCreateResponse =
            CredentialCreateResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(CredentialCreateResponse.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        val roundtrippedCredentialCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialCreateResponse),
                jacksonTypeRef<CredentialCreateResponse>(),
            )

        assertThat(roundtrippedCredentialCreateResponse).isEqualTo(credentialCreateResponse)
    }
}
