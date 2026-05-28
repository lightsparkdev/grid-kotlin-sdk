// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthSignedRequestChallengeTest {

    @Test
    fun create() {
        val authSignedRequestChallenge =
            AuthSignedRequestChallenge.builder()
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .payloadToSign(
                    "{\"organizationId\":\"org_2m9F...\",\"parameters\":{\"userId\":\"user_2m9F...\"},\"timestampMs\":\"1775681700000\",\"type\":\"ACTIVITY_TYPE_EXAMPLE\"}"
                )
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .type(AuthMethodType.OAUTH)
                .build()

        assertThat(authSignedRequestChallenge.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
        assertThat(authSignedRequestChallenge.payloadToSign())
            .isEqualTo(
                "{\"organizationId\":\"org_2m9F...\",\"parameters\":{\"userId\":\"user_2m9F...\"},\"timestampMs\":\"1775681700000\",\"type\":\"ACTIVITY_TYPE_EXAMPLE\"}"
            )
        assertThat(authSignedRequestChallenge.requestId())
            .isEqualTo("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
        assertThat(authSignedRequestChallenge.type()).isEqualTo(AuthMethodType.OAUTH)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authSignedRequestChallenge =
            AuthSignedRequestChallenge.builder()
                .expiresAt(OffsetDateTime.parse("2026-04-08T15:35:00Z"))
                .payloadToSign(
                    "{\"organizationId\":\"org_2m9F...\",\"parameters\":{\"userId\":\"user_2m9F...\"},\"timestampMs\":\"1775681700000\",\"type\":\"ACTIVITY_TYPE_EXAMPLE\"}"
                )
                .requestId("Request:7c4a8d09-ca37-4e3e-9e0d-8c2b3e9a1f21")
                .type(AuthMethodType.OAUTH)
                .build()

        val roundtrippedAuthSignedRequestChallenge =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authSignedRequestChallenge),
                jacksonTypeRef<AuthSignedRequestChallenge>(),
            )

        assertThat(roundtrippedAuthSignedRequestChallenge).isEqualTo(authSignedRequestChallenge)
    }
}
