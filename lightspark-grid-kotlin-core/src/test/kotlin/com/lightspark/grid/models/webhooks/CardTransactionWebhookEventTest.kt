// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.cards.CardTransaction
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.sandbox.cards.simulate.CardMerchant
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTransactionWebhookEventTest {

    @Test
    fun create() {
        val cardTransactionWebhookEvent =
            CardTransactionWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000100")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .authorizedAmount(
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
                        .authorizedAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .direction(CardTransaction.Direction.DEBIT)
                        .merchant(
                            CardMerchant.builder()
                                .descriptor("BLUE BOTTLE COFFEE SF")
                                .country("US")
                                .mcc("5814")
                                .build()
                        )
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .status(CardTransaction.Status.AUTHORIZED)
                        .type(CardTransaction.Type.CARD)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                        .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .issuerTransactionToken("lithic_txn_b81c2a4f")
                        .refundedAmount(
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
                        .settledAmount(
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
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardTransactionWebhookEvent.Type.CARD_TRANSACTION_AUTHORIZED)
                .build()

        assertThat(cardTransactionWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(cardTransactionWebhookEvent.data())
            .isEqualTo(
                CardTransaction.builder()
                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000100")
                    .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .authorizedAmount(
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
                    .authorizedAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                    .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .direction(CardTransaction.Direction.DEBIT)
                    .merchant(
                        CardMerchant.builder()
                            .descriptor("BLUE BOTTLE COFFEE SF")
                            .country("US")
                            .mcc("5814")
                            .build()
                    )
                    .platformCustomerId("18d3e5f7b4a9c2")
                    .status(CardTransaction.Status.AUTHORIZED)
                    .type(CardTransaction.Type.CARD)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                    .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .issuerTransactionToken("lithic_txn_b81c2a4f")
                    .refundedAmount(
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
                    .settledAmount(
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
                    .build()
            )
        assertThat(cardTransactionWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(cardTransactionWebhookEvent.type())
            .isEqualTo(CardTransactionWebhookEvent.Type.CARD_TRANSACTION_AUTHORIZED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardTransactionWebhookEvent =
            CardTransactionWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CardTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000100")
                        .accountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .authorizedAmount(
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
                        .authorizedAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .direction(CardTransaction.Direction.DEBIT)
                        .merchant(
                            CardMerchant.builder()
                                .descriptor("BLUE BOTTLE COFFEE SF")
                                .country("US")
                                .mcc("5814")
                                .build()
                        )
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .status(CardTransaction.Status.AUTHORIZED)
                        .type(CardTransaction.Type.CARD)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                        .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .issuerTransactionToken("lithic_txn_b81c2a4f")
                        .refundedAmount(
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
                        .settledAmount(
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
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CardTransactionWebhookEvent.Type.CARD_TRANSACTION_AUTHORIZED)
                .build()

        val roundtrippedCardTransactionWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardTransactionWebhookEvent),
                jacksonTypeRef<CardTransactionWebhookEvent>(),
            )

        assertThat(roundtrippedCardTransactionWebhookEvent).isEqualTo(cardTransactionWebhookEvent)
    }
}
