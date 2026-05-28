// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.exchangerates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExchangeRateTest {

    @Test
    fun create() {
        val exchangeRate =
            ExchangeRate.builder()
                .destinationCurrency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .destinationPaymentRail(JsonValue.from("ACH"))
                .exchangeRate(82.5)
                .fees(ExchangeRateFees.builder().fixed(100L).build())
                .maxSendingAmount(10000000L)
                .minSendingAmount(100L)
                .receivingAmount(1650000L)
                .sendingAmount(10000L)
                .sourceCurrency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-02-05T12:00:00Z"))
                .build()

        assertThat(exchangeRate.destinationCurrency())
            .isEqualTo(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(exchangeRate._destinationPaymentRail()).isEqualTo(JsonValue.from("ACH"))
        assertThat(exchangeRate.exchangeRate()).isEqualTo(82.5)
        assertThat(exchangeRate.fees()).isEqualTo(ExchangeRateFees.builder().fixed(100L).build())
        assertThat(exchangeRate.maxSendingAmount()).isEqualTo(10000000L)
        assertThat(exchangeRate.minSendingAmount()).isEqualTo(100L)
        assertThat(exchangeRate.receivingAmount()).isEqualTo(1650000L)
        assertThat(exchangeRate.sendingAmount()).isEqualTo(10000L)
        assertThat(exchangeRate.sourceCurrency())
            .isEqualTo(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(exchangeRate.updatedAt()).isEqualTo(OffsetDateTime.parse("2025-02-05T12:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val exchangeRate =
            ExchangeRate.builder()
                .destinationCurrency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .destinationPaymentRail(JsonValue.from("ACH"))
                .exchangeRate(82.5)
                .fees(ExchangeRateFees.builder().fixed(100L).build())
                .maxSendingAmount(10000000L)
                .minSendingAmount(100L)
                .receivingAmount(1650000L)
                .sendingAmount(10000L)
                .sourceCurrency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-02-05T12:00:00Z"))
                .build()

        val roundtrippedExchangeRate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(exchangeRate),
                jacksonTypeRef<ExchangeRate>(),
            )

        assertThat(roundtrippedExchangeRate).isEqualTo(exchangeRate)
    }
}
