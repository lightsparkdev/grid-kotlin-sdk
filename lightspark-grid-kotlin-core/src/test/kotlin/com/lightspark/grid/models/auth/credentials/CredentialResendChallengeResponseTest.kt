// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialResendChallengeResponseTest {

    @Test
    fun create() {
        val credentialResendChallengeResponse =
            CredentialResendChallengeResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(CredentialResendChallengeResponse.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        assertThat(credentialResendChallengeResponse.id())
            .isEqualTo("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(credentialResendChallengeResponse.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(credentialResendChallengeResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
        assertThat(credentialResendChallengeResponse.nickname()).isEqualTo("example@lightspark.com")
        assertThat(credentialResendChallengeResponse.type())
            .isEqualTo(CredentialResendChallengeResponse.Type.OAUTH)
        assertThat(credentialResendChallengeResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialResendChallengeResponse =
            CredentialResendChallengeResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(CredentialResendChallengeResponse.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        val roundtrippedCredentialResendChallengeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialResendChallengeResponse),
                jacksonTypeRef<CredentialResendChallengeResponse>(),
            )

        assertThat(roundtrippedCredentialResendChallengeResponse)
            .isEqualTo(credentialResendChallengeResponse)
    }
}
