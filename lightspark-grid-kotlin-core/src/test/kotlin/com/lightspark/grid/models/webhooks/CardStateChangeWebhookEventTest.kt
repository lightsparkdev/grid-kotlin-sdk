// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardStateChangeWebhookEventTest {

    @Test
    fun create() {
        val cardStateChangeWebhookEvent =
            CardStateChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardStateChangeWebhookEvent.Data.builder()
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardStateChangeWebhookEvent.Data.Form.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardStateChangeWebhookEvent.Data.State.PENDING_KYC)
                        .brand(CardStateChangeWebhookEvent.Data.Brand.VISA)
                        .expMonth(12L)
                        .expYear(2029L)
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateChangeWebhookEvent.Data.StateReason.ISSUER_REJECTED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardStateChangeWebhookEvent.Type.CARD_STATE_CHANGE)
                .build()

        assertThat(cardStateChangeWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(cardStateChangeWebhookEvent.data())
            .isEqualTo(
                CardStateChangeWebhookEvent.Data.builder()
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardStateChangeWebhookEvent.Data.Form.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                    .state(CardStateChangeWebhookEvent.Data.State.PENDING_KYC)
                    .brand(CardStateChangeWebhookEvent.Data.Brand.VISA)
                    .expMonth(12L)
                    .expYear(2029L)
                    .last4("4242")
                    .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                    .platformCardId("card-emp-aary-001")
                    .stateReason(CardStateChangeWebhookEvent.Data.StateReason.ISSUER_REJECTED)
                    .build()
            )
        assertThat(cardStateChangeWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(cardStateChangeWebhookEvent.type())
            .isEqualTo(CardStateChangeWebhookEvent.Type.CARD_STATE_CHANGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardStateChangeWebhookEvent =
            CardStateChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardStateChangeWebhookEvent.Data.builder()
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardStateChangeWebhookEvent.Data.Form.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardStateChangeWebhookEvent.Data.State.PENDING_KYC)
                        .brand(CardStateChangeWebhookEvent.Data.Brand.VISA)
                        .expMonth(12L)
                        .expYear(2029L)
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateChangeWebhookEvent.Data.StateReason.ISSUER_REJECTED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardStateChangeWebhookEvent.Type.CARD_STATE_CHANGE)
                .build()

        val roundtrippedCardStateChangeWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardStateChangeWebhookEvent),
                jacksonTypeRef<CardStateChangeWebhookEvent>(),
            )

        assertThat(roundtrippedCardStateChangeWebhookEvent).isEqualTo(cardStateChangeWebhookEvent)
    }
}
