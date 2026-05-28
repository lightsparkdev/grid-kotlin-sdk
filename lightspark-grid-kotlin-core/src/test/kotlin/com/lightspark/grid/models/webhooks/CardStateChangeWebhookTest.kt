// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.cards.Card
import com.lightspark.grid.models.cards.CardBrand
import com.lightspark.grid.models.cards.CardForm
import com.lightspark.grid.models.cards.CardState
import com.lightspark.grid.models.cards.CardStateReason
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardStateChangeWebhookTest {

    @Test
    fun create() {
        val cardStateChangeWebhook =
            CardStateChangeWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CARD.STATE_CHANGE"))
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardState.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardBrand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateReason.ISSUER_REJECTED)
                        .build()
                )
                .build()

        assertThat(cardStateChangeWebhook.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(cardStateChangeWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(cardStateChangeWebhook._type()).isEqualTo(JsonValue.from("CARD.STATE_CHANGE"))
        assertThat(cardStateChangeWebhook.data())
            .isEqualTo(
                Card.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                    .form(CardForm.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                    .state(CardState.PENDING_KYC)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                    .brand(CardBrand.VISA)
                    .currency("USD")
                    .expMonth(12L)
                    .expYear(2029L)
                    .issuerRef("lithic_card_4f8d3a2b1c")
                    .last4("4242")
                    .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                    .platformCardId("card-emp-aary-001")
                    .stateReason(CardStateReason.ISSUER_REJECTED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardStateChangeWebhook =
            CardStateChangeWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("CARD.STATE_CHANGE"))
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardState.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardBrand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateReason.ISSUER_REJECTED)
                        .build()
                )
                .build()

        val roundtrippedCardStateChangeWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardStateChangeWebhook),
                jacksonTypeRef<CardStateChangeWebhook>(),
            )

        assertThat(roundtrippedCardStateChangeWebhook).isEqualTo(cardStateChangeWebhook)
    }
}
