// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialListResponseTest {

    @Test
    fun create() {
        val credentialListResponse =
            CredentialListResponse.builder()
                .addData(
                    CredentialListResponse.Data.builder()
                        .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(CredentialListResponse.Data.Type.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .build()
                )
                .build()

        assertThat(credentialListResponse.data())
            .containsExactly(
                CredentialListResponse.Data.builder()
                    .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                    .nickname("example@lightspark.com")
                    .type(CredentialListResponse.Data.Type.OAUTH)
                    .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialListResponse =
            CredentialListResponse.builder()
                .addData(
                    CredentialListResponse.Data.builder()
                        .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                        .nickname("example@lightspark.com")
                        .type(CredentialListResponse.Data.Type.OAUTH)
                        .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                        .build()
                )
                .build()

        val roundtrippedCredentialListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialListResponse),
                jacksonTypeRef<CredentialListResponse>(),
            )

        assertThat(roundtrippedCredentialListResponse).isEqualTo(credentialListResponse)
    }
}
