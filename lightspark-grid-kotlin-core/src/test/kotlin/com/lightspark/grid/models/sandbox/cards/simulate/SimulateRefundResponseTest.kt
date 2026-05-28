// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimulateRefundResponseTest {

    @Test
    fun create() {
        val simulateRefundResponse =
            SimulateRefundResponse.builder()
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
                .status(SimulateRefundResponse.Status.AUTHORIZED)
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

        assertThat(simulateRefundResponse.id())
            .isEqualTo("CardTransaction:019542f5-b3e7-1d02-0000-000000000100")
        assertThat(simulateRefundResponse.accountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(simulateRefundResponse.authorizedAmount())
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
        assertThat(simulateRefundResponse.authorizedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
        assertThat(simulateRefundResponse.cardId())
            .isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(simulateRefundResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:30:00Z"))
        assertThat(simulateRefundResponse.merchant())
            .isEqualTo(
                CardMerchant.builder()
                    .descriptor("BLUE BOTTLE COFFEE SF")
                    .country("US")
                    .mcc("5814")
                    .build()
            )
        assertThat(simulateRefundResponse.pullSummary())
            .isEqualTo(
                CardPullSummary.builder().count(2L).totalAmount(1500L).pendingCount(0L).build()
            )
        assertThat(simulateRefundResponse.refundSummary())
            .isEqualTo(CardRefundSummary.builder().count(0L).totalAmount(0L).build())
        assertThat(simulateRefundResponse.settlementSummary())
            .isEqualTo(CardSettlementSummary.builder().count(1L).totalAmount(1500L).build())
        assertThat(simulateRefundResponse.status())
            .isEqualTo(SimulateRefundResponse.Status.AUTHORIZED)
        assertThat(simulateRefundResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
        assertThat(simulateRefundResponse.issuerTransactionToken()).isEqualTo("lithic_txn_b81c2a4f")
        assertThat(simulateRefundResponse.lastEventAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T15:42:11Z"))
        assertThat(simulateRefundResponse.refundedAmount())
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
        assertThat(simulateRefundResponse.settledAmount())
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
        val simulateRefundResponse =
            SimulateRefundResponse.builder()
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
                .status(SimulateRefundResponse.Status.AUTHORIZED)
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

        val roundtrippedSimulateRefundResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simulateRefundResponse),
                jacksonTypeRef<SimulateRefundResponse>(),
            )

        assertThat(roundtrippedSimulateRefundResponse).isEqualTo(simulateRefundResponse)
    }
}
