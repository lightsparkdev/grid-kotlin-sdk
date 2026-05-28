// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.umaproviders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.quotes.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UmaProviderTest {

    @Test
    fun create() {
        val umaProvider =
            UmaProvider.builder()
                .allowListStatus(true)
                .domain("uma.me")
                .lei("5493001KJTIIGC8Y1R12")
                .logoUrl("https://uma.me/logo.png")
                .name("Lightspark Group")
                .addSupportedCurrency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .addSupportedRegion("US")
                .build()

        assertThat(umaProvider.allowListStatus()).isEqualTo(true)
        assertThat(umaProvider.domain()).isEqualTo("uma.me")
        assertThat(umaProvider.lei()).isEqualTo("5493001KJTIIGC8Y1R12")
        assertThat(umaProvider.logoUrl()).isEqualTo("https://uma.me/logo.png")
        assertThat(umaProvider.name()).isEqualTo("Lightspark Group")
        assertThat(umaProvider.supportedCurrencies())
            .containsExactly(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(umaProvider.supportedRegions()).containsExactly("US")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val umaProvider =
            UmaProvider.builder()
                .allowListStatus(true)
                .domain("uma.me")
                .lei("5493001KJTIIGC8Y1R12")
                .logoUrl("https://uma.me/logo.png")
                .name("Lightspark Group")
                .addSupportedCurrency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .addSupportedRegion("US")
                .build()

        val roundtrippedUmaProvider =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(umaProvider),
                jacksonTypeRef<UmaProvider>(),
            )

        assertThat(roundtrippedUmaProvider).isEqualTo(umaProvider)
    }
}
