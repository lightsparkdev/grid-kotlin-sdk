// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.invitations.UmaInvitation
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InvitationClaimedWebhookTest {

    @Test
    fun create() {
        val invitationClaimedWebhook =
            InvitationClaimedWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INVITATION.CLAIMED"))
                .data(
                    UmaInvitation.builder()
                        .code("019542f5")
                        .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .inviterUma("\$inviter@uma.domain")
                        .status(UmaInvitation.Status.PENDING)
                        .url("https://uma.me/i/019542f5")
                        .amountToSend(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .firstName("Jane")
                        .inviteeUma("\$invitee@uma.domain")
                        .build()
                )
                .build()

        assertThat(invitationClaimedWebhook.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(invitationClaimedWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(invitationClaimedWebhook._type()).isEqualTo(JsonValue.from("INVITATION.CLAIMED"))
        assertThat(invitationClaimedWebhook.data())
            .isEqualTo(
                UmaInvitation.builder()
                    .code("019542f5")
                    .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                    .inviterUma("\$inviter@uma.domain")
                    .status(UmaInvitation.Status.PENDING)
                    .url("https://uma.me/i/019542f5")
                    .amountToSend(
                        CurrencyAmount.builder()
                            .amount(12550L)
                            .currency(
                                Currency.builder()
                                    .code("USD")
                                    .decimals(2L)
                                    .name("United States Dollar")
                                    .symbol("\$")
                                    .build()
                            )
                            .build()
                    )
                    .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                    .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                    .firstName("Jane")
                    .inviteeUma("\$invitee@uma.domain")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val invitationClaimedWebhook =
            InvitationClaimedWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INVITATION.CLAIMED"))
                .data(
                    UmaInvitation.builder()
                        .code("019542f5")
                        .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .inviterUma("\$inviter@uma.domain")
                        .status(UmaInvitation.Status.PENDING)
                        .url("https://uma.me/i/019542f5")
                        .amountToSend(
                            CurrencyAmount.builder()
                                .amount(12550L)
                                .currency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .build()
                        )
                        .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .firstName("Jane")
                        .inviteeUma("\$invitee@uma.domain")
                        .build()
                )
                .build()

        val roundtrippedInvitationClaimedWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(invitationClaimedWebhook),
                jacksonTypeRef<InvitationClaimedWebhook>(),
            )

        assertThat(roundtrippedInvitationClaimedWebhook).isEqualTo(invitationClaimedWebhook)
    }
}
