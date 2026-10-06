// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.cards.Card
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardPinStatusChangeWebhookEventTest {

    @Test
    fun create() {
        val cardPinStatusChangeWebhookEvent =
            CardPinStatusChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(Card.Form.VIRTUAL)
                        .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .maxSpendPerDay(25000L)
                        .maxSpendPerTransaction(5000L)
                        .maxTransactionsPerDay(20)
                        .status(Card.Status.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(Card.Brand.VISA)
                        .cardCapabilities(
                            Card.CardCapabilities.builder()
                                .supports3dSecurePassword(false)
                                .supportsDigitalWalletTokenization(true)
                                .supportsPanReveal(true)
                                .supportsSpendLimits(true)
                                .supportsSpendLimitsAtIssuance(true)
                                .supportsTransactionCountLimit(true)
                                .build()
                        )
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lead_card_7a1b9c3d")
                        .last4("4242")
                        .pinStatus(Card.PinStatus.OK)
                        .platformCardId("card-emp-001")
                        .processorRef("card_b81c2a4f")
                        .statusReason(Card.StatusReason.ISSUER_REJECTED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardPinStatusChangeWebhookEvent.Type.CARD_PIN_STATUS_CHANGE)
                .build()

        assertThat(cardPinStatusChangeWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(cardPinStatusChangeWebhookEvent.data())
            .isEqualTo(
                Card.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(Card.Form.VIRTUAL)
                    .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .maxSpendPerDay(25000L)
                    .maxSpendPerTransaction(5000L)
                    .maxTransactionsPerDay(20)
                    .status(Card.Status.PENDING_KYC)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                    .brand(Card.Brand.VISA)
                    .cardCapabilities(
                        Card.CardCapabilities.builder()
                            .supports3dSecurePassword(false)
                            .supportsDigitalWalletTokenization(true)
                            .supportsPanReveal(true)
                            .supportsSpendLimits(true)
                            .supportsSpendLimitsAtIssuance(true)
                            .supportsTransactionCountLimit(true)
                            .build()
                    )
                    .currency("USD")
                    .expMonth(12L)
                    .expYear(2029L)
                    .issuerRef("lead_card_7a1b9c3d")
                    .last4("4242")
                    .pinStatus(Card.PinStatus.OK)
                    .platformCardId("card-emp-001")
                    .processorRef("card_b81c2a4f")
                    .statusReason(Card.StatusReason.ISSUER_REJECTED)
                    .build()
            )
        assertThat(cardPinStatusChangeWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(cardPinStatusChangeWebhookEvent.type())
            .isEqualTo(CardPinStatusChangeWebhookEvent.Type.CARD_PIN_STATUS_CHANGE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardPinStatusChangeWebhookEvent =
            CardPinStatusChangeWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(Card.Form.VIRTUAL)
                        .fundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .maxSpendPerDay(25000L)
                        .maxSpendPerTransaction(5000L)
                        .maxTransactionsPerDay(20)
                        .status(Card.Status.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(Card.Brand.VISA)
                        .cardCapabilities(
                            Card.CardCapabilities.builder()
                                .supports3dSecurePassword(false)
                                .supportsDigitalWalletTokenization(true)
                                .supportsPanReveal(true)
                                .supportsSpendLimits(true)
                                .supportsSpendLimitsAtIssuance(true)
                                .supportsTransactionCountLimit(true)
                                .build()
                        )
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lead_card_7a1b9c3d")
                        .last4("4242")
                        .pinStatus(Card.PinStatus.OK)
                        .platformCardId("card-emp-001")
                        .processorRef("card_b81c2a4f")
                        .statusReason(Card.StatusReason.ISSUER_REJECTED)
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardPinStatusChangeWebhookEvent.Type.CARD_PIN_STATUS_CHANGE)
                .build()

        val roundtrippedCardPinStatusChangeWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardPinStatusChangeWebhookEvent),
                jacksonTypeRef<CardPinStatusChangeWebhookEvent>(),
            )

        assertThat(roundtrippedCardPinStatusChangeWebhookEvent)
            .isEqualTo(cardPinStatusChangeWebhookEvent)
    }
}
