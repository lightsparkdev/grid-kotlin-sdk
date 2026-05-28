// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardFundingSourceChangeWebhookEventTest {

    @Test
    fun create() {
        val cardFundingSourceChangeWebhookEvent =
            CardFundingSourceChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardFundingSourceChangeWebhookEvent.Data.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardFundingSourceChangeWebhookEvent.Data.Form.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardFundingSourceChangeWebhookEvent.Data.State.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardFundingSourceChangeWebhookEvent.Data.Brand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(
                            CardFundingSourceChangeWebhookEvent.Data.StateReason.ISSUER_REJECTED
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardFundingSourceChangeWebhookEvent.Type.CARD_FUNDING_SOURCE_CHANGE)
                .build()

        assertThat(cardFundingSourceChangeWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(cardFundingSourceChangeWebhookEvent.data())
            .isEqualTo(
                CardFundingSourceChangeWebhookEvent.Data.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                    .form(CardFundingSourceChangeWebhookEvent.Data.Form.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                    .state(CardFundingSourceChangeWebhookEvent.Data.State.PENDING_KYC)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                    .brand(CardFundingSourceChangeWebhookEvent.Data.Brand.VISA)
                    .currency("USD")
                    .expMonth(12L)
                    .expYear(2029L)
                    .issuerRef("lithic_card_4f8d3a2b1c")
                    .last4("4242")
                    .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                    .platformCardId("card-emp-aary-001")
                    .stateReason(
                        CardFundingSourceChangeWebhookEvent.Data.StateReason.ISSUER_REJECTED
                    )
                    .build()
            )
        assertThat(cardFundingSourceChangeWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(cardFundingSourceChangeWebhookEvent.type())
            .isEqualTo(CardFundingSourceChangeWebhookEvent.Type.CARD_FUNDING_SOURCE_CHANGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardFundingSourceChangeWebhookEvent =
            CardFundingSourceChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardFundingSourceChangeWebhookEvent.Data.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardFundingSourceChangeWebhookEvent.Data.Form.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardFundingSourceChangeWebhookEvent.Data.State.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardFundingSourceChangeWebhookEvent.Data.Brand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(
                            CardFundingSourceChangeWebhookEvent.Data.StateReason.ISSUER_REJECTED
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardFundingSourceChangeWebhookEvent.Type.CARD_FUNDING_SOURCE_CHANGE)
                .build()

        val roundtrippedCardFundingSourceChangeWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardFundingSourceChangeWebhookEvent),
                jacksonTypeRef<CardFundingSourceChangeWebhookEvent>(),
            )

        assertThat(roundtrippedCardFundingSourceChangeWebhookEvent)
            .isEqualTo(cardFundingSourceChangeWebhookEvent)
    }
}
