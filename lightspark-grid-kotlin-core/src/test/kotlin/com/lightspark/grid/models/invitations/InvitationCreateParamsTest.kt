// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.invitations

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationCreateParamsTest {

    @Test
    fun create() {
        InvitationCreateParams.builder()
            .umaInvitationCreateRequest(
                UmaInvitationCreateRequest.builder()
                    .inviterUma("\$inviter@uma.domain")
                    .amountToSend(12550L)
                    .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                    .firstName("Alice")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            InvitationCreateParams.builder()
                .umaInvitationCreateRequest(
                    UmaInvitationCreateRequest.builder()
                        .inviterUma("\$inviter@uma.domain")
                        .amountToSend(12550L)
                        .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .firstName("Alice")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UmaInvitationCreateRequest.builder()
                    .inviterUma("\$inviter@uma.domain")
                    .amountToSend(12550L)
                    .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                    .firstName("Alice")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InvitationCreateParams.builder()
                .umaInvitationCreateRequest(
                    UmaInvitationCreateRequest.builder().inviterUma("\$inviter@uma.domain").build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UmaInvitationCreateRequest.builder().inviterUma("\$inviter@uma.domain").build()
            )
    }
}
