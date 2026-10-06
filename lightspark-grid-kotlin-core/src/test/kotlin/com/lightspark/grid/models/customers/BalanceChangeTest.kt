// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BalanceChangeTest {

    @Test
    fun create() {
        val balanceChange =
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

        assertThat(balanceChange.id())
            .isEqualTo("BalanceChange:019542f5-b3e7-1d02-0000-000000000003")
        assertThat(balanceChange.amount())
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
        assertThat(balanceChange.effectiveAt())
            .isEqualTo(OffsetDateTime.parse("2026-09-03T14:31:00Z"))
        assertThat(balanceChange.fee())
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
        assertThat(balanceChange.transactionId())
            .isEqualTo("Transaction:019542f5-b3e7-1d02-0000-000000000004")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val balanceChange =
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

        val roundtrippedBalanceChange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(balanceChange),
                jacksonTypeRef<BalanceChange>(),
            )

        assertThat(roundtrippedBalanceChange).isEqualTo(balanceChange)
    }
}
