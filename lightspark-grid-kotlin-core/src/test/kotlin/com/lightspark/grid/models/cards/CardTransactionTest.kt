// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.sandbox.cards.simulate.CardMerchant
import com.lightspark.grid.models.sandbox.cards.simulate.CardPullSummary
import com.lightspark.grid.models.sandbox.cards.simulate.CardRefundSummary
import com.lightspark.grid.models.sandbox.cards.simulate.CardSettlementSummary
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTransactionTest {

    @Test
    fun create() {
        val cardTransaction =
            CardTransaction.builder()
                .id("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
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
                .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                .merchant(
                    CardMerchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .country("US")
                        .mcc("5814")
                        .build()
                )
                .pullSummary(
                    CardPullSummary.builder().count(2L).totalAmount(1500L).pendingCount(0L).build()
                )
                .refundSummary(CardRefundSummary.builder().count(0L).totalAmount(0L).build())
                .settlementSummary(
                    CardSettlementSummary.builder().count(1L).totalAmount(1500L).build()
                )
                .status(CardTransaction.Status.AUTHORIZED)
                .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                .issuerTransactionToken("lithic_txn_b81c2a4f")
                .lastEventAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
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

        assertThat(cardTransaction.id())
            .isEqualTo("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
        assertThat(cardTransaction.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(cardTransaction.authorizedAmount())
            .isEqualTo(
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
        assertThat(cardTransaction.authorizedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
        assertThat(cardTransaction.cardId()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(cardTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
        assertThat(cardTransaction.merchant())
            .isEqualTo(
                CardMerchant.builder()
                    .descriptor("BLUE BOTTLE COFFEE SF")
                    .country("US")
                    .mcc("5814")
                    .build()
            )
        assertThat(cardTransaction.pullSummary())
            .isEqualTo(
                CardPullSummary.builder().count(2L).totalAmount(1500L).pendingCount(0L).build()
            )
        assertThat(cardTransaction.refundSummary())
            .isEqualTo(CardRefundSummary.builder().count(0L).totalAmount(0L).build())
        assertThat(cardTransaction.settlementSummary())
            .isEqualTo(CardSettlementSummary.builder().count(1L).totalAmount(1500L).build())
        assertThat(cardTransaction.status()).isEqualTo(CardTransaction.Status.AUTHORIZED)
        assertThat(cardTransaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
        assertThat(cardTransaction.issuerTransactionToken()).isEqualTo("lithic_txn_b81c2a4f")
        assertThat(cardTransaction.lastEventAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
        assertThat(cardTransaction.refundedAmount())
            .isEqualTo(
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
        assertThat(cardTransaction.settledAmount())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardTransaction =
            CardTransaction.builder()
                .id("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
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
                .cardId("Card:019542f5-b3e7-1d02-0000-000000000010")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
                .merchant(
                    CardMerchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .country("US")
                        .mcc("5814")
                        .build()
                )
                .pullSummary(
                    CardPullSummary.builder().count(2L).totalAmount(1500L).pendingCount(0L).build()
                )
                .refundSummary(CardRefundSummary.builder().count(0L).totalAmount(0L).build())
                .settlementSummary(
                    CardSettlementSummary.builder().count(1L).totalAmount(1500L).build()
                )
                .status(CardTransaction.Status.AUTHORIZED)
                .updatedAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
                .issuerTransactionToken("lithic_txn_b81c2a4f")
                .lastEventAt(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
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

        val roundtrippedCardTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardTransaction),
                jacksonTypeRef<CardTransaction>(),
            )

        assertThat(roundtrippedCardTransaction).isEqualTo(cardTransaction)
    }
}
