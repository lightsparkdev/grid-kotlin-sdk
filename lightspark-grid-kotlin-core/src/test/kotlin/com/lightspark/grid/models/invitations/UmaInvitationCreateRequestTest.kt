// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.invitations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UmaInvitationCreateRequestTest {

    @Test
    fun create() {
        val umaInvitationCreateRequest =
            UmaInvitationCreateRequest.builder()
                .inviterUma("\$inviter@uma.domain")
                .amountToSend(12550L)
                .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                .firstName("Alice")
                .build()

        assertThat(umaInvitationCreateRequest.inviterUma()).isEqualTo("\$inviter@uma.domain")
        assertThat(umaInvitationCreateRequest.amountToSend()).isEqualTo(12550L)
        assertThat(umaInvitationCreateRequest.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
        assertThat(umaInvitationCreateRequest.firstName()).isEqualTo("Alice")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val umaInvitationCreateRequest =
            UmaInvitationCreateRequest.builder()
                .inviterUma("\$inviter@uma.domain")
                .amountToSend(12550L)
                .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                .firstName("Alice")
                .build()

        val roundtrippedUmaInvitationCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(umaInvitationCreateRequest),
                jacksonTypeRef<UmaInvitationCreateRequest>(),
            )

        assertThat(roundtrippedUmaInvitationCreateRequest).isEqualTo(umaInvitationCreateRequest)
    }
}
