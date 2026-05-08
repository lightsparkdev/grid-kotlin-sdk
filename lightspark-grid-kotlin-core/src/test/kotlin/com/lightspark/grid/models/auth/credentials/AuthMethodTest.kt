// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthMethodTest {

    @Test
    fun create() {
        val authMethod =
            AuthMethod.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethod.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        assertThat(authMethod.id()).isEqualTo("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(authMethod.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(authMethod.createdAt()).isEqualTo(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
        assertThat(authMethod.nickname()).isEqualTo("example@lightspark.com")
        assertThat(authMethod.type()).isEqualTo(AuthMethod.Type.OAUTH)
        assertThat(authMethod.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authMethod =
            AuthMethod.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethod.Type.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .build()

        val roundtrippedAuthMethod =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authMethod),
                jacksonTypeRef<AuthMethod>(),
            )

        assertThat(roundtrippedAuthMethod).isEqualTo(authMethod)
    }
}
