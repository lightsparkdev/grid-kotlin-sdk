// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChangeListResponseTest {

    @Test
    fun create() {
        val balanceChangeListResponse =
            BalanceChangeListResponse.builder()
                .closingBalance(
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
                .addData(
                    BalanceChange.builder()
                        .id("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
                        .amount(
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
                        .effectiveAt(OffsetDateTime.parse("2026-09-03T14:31:00Z"))
                        .fee(
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
                        .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .build()
                )
                .endDate(OffsetDateTime.parse("2026-09-01T00:00:00-05:00"))
                .hasMore(false)
                .openingBalance(
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
                .startDate(OffsetDateTime.parse("2026-08-01T00:00:00-05:00"))
                .nextCursor("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
                .totalCount(42L)
                .build()

        assertThat(balanceChangeListResponse.closingBalance())
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
        assertThat(balanceChangeListResponse.data())
            .containsExactly(
                BalanceChange.builder()
                    .id("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
                    .amount(
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
                    .effectiveAt(OffsetDateTime.parse("2026-09-03T14:31:00Z"))
                    .fee(
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
                    .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                    .build()
            )
        assertThat(balanceChangeListResponse.endDate())
            .isEqualTo(OffsetDateTime.parse("2026-09-01T00:00:00-05:00"))
        assertThat(balanceChangeListResponse.hasMore()).isEqualTo(false)
        assertThat(balanceChangeListResponse.openingBalance())
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
        assertThat(balanceChangeListResponse.startDate())
            .isEqualTo(OffsetDateTime.parse("2026-08-01T00:00:00-05:00"))
        assertThat(balanceChangeListResponse.nextCursor())
            .isEqualTo("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
        assertThat(balanceChangeListResponse.totalCount()).isEqualTo(42L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChangeListResponse =
            BalanceChangeListResponse.builder()
                .closingBalance(
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
                .addData(
                    BalanceChange.builder()
                        .id("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
                        .amount(
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
                        .effectiveAt(OffsetDateTime.parse("2026-09-03T14:31:00Z"))
                        .fee(
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
                        .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .build()
                )
                .endDate(OffsetDateTime.parse("2026-09-01T00:00:00-05:00"))
                .hasMore(false)
                .openingBalance(
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
                .startDate(OffsetDateTime.parse("2026-08-01T00:00:00-05:00"))
                .nextCursor("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
                .totalCount(42L)
                .build()

        val roundtrippedBalanceChangeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChangeListResponse),
                jacksonTypeRef<BalanceChangeListResponse>(),
            )

        assertThat(roundtrippedBalanceChangeListResponse).isEqualTo(balanceChangeListResponse)
    }
}
