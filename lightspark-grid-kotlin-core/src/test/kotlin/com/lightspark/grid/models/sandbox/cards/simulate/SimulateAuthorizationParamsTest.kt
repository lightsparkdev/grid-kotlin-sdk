// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.lightspark.grid.models.quotes.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimulateAuthorizationParamsTest {

    @Test
    fun create() {
        SimulateAuthorizationParams.builder()
            .id("Card:019542f5-b3e7-1d02-0000-000000000010")
            .amount(1250L)
            .currency(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
            .merchant(
                SimulateAuthorizationParams.Merchant.builder()
                    .descriptor("BLUE BOTTLE COFFEE SF")
                    .country("US")
                    .mcc("5814")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SimulateAuthorizationParams.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .amount(1250L)
                .currency(Currency.builder().build())
                .merchant(
                    SimulateAuthorizationParams.Merchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SimulateAuthorizationParams.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .amount(1250L)
                .currency(
                    Currency.builder()
                        .code("USD")
                        .decimals(2L)
                        .name("United States Dollar")
                        .symbol("\$")
                        .build()
                )
                .merchant(
                    SimulateAuthorizationParams.Merchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .country("US")
                        .mcc("5814")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1250L)
        assertThat(body.currency())
            .isEqualTo(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(body.merchant())
            .isEqualTo(
                SimulateAuthorizationParams.Merchant.builder()
                    .descriptor("BLUE BOTTLE COFFEE SF")
                    .country("US")
                    .mcc("5814")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulateAuthorizationParams.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .amount(1250L)
                .currency(Currency.builder().build())
                .merchant(
                    SimulateAuthorizationParams.Merchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1250L)
        assertThat(body.currency()).isEqualTo(Currency.builder().build())
        assertThat(body.merchant())
            .isEqualTo(
                SimulateAuthorizationParams.Merchant.builder()
                    .descriptor("BLUE BOTTLE COFFEE SF")
                    .build()
            )
    }
}
