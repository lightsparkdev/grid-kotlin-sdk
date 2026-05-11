// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthMethodResponseTest {

    @Test
    fun create() {
        val authMethodResponse =
            AuthMethodResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .credentialId(
                    "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                )
                .build()

        assertThat(authMethodResponse.id())
            .isEqualTo("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(authMethodResponse.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(authMethodResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
        assertThat(authMethodResponse.nickname()).isEqualTo("example@lightspark.com")
        assertThat(authMethodResponse.type()).isEqualTo(AuthMethodType.OAUTH)
        assertThat(authMethodResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
        assertThat(authMethodResponse.credentialId())
            .isEqualTo(
                "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authMethodResponse =
            AuthMethodResponse.builder()
                .id("AuthMethod:019542f5-b3e7-1d02-0000-000000000001")
                .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .createdAt(OffsetDateTime.parse("2026-04-08T15:30:01Z"))
                .nickname("example@lightspark.com")
                .type(AuthMethodType.OAUTH)
                .updatedAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .credentialId(
                    "KEbWNCc7NgaYnUyrNeFGX9_3Y-8oJ3KwzjnaiD1d1LVTxR7v3CaKfCz2Vy_g_MHSh7yJ8yL0Pxg6jo_o0hYiew"
                )
                .build()

        val roundtrippedAuthMethodResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authMethodResponse),
                jacksonTypeRef<AuthMethodResponse>(),
            )

        assertThat(roundtrippedAuthMethodResponse).isEqualTo(authMethodResponse)
    }
}
