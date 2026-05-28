// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.cards.simulate

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.quotes.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthorizationRequestTest {

    @Test
    fun create() {
        val authorizationRequest =
            AuthorizationRequest.builder()
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
                    CardMerchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .country("US")
                        .mcc("5814")
                        .build()
                )
                .build()

        assertThat(authorizationRequest.amount()).isEqualTo(1250L)
        assertThat(authorizationRequest.currency())
            .isEqualTo(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(authorizationRequest.merchant())
            .isEqualTo(
                CardMerchant.builder()
                    .descriptor("BLUE BOTTLE COFFEE SF")
                    .country("US")
                    .mcc("5814")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val authorizationRequest =
            AuthorizationRequest.builder()
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
                    CardMerchant.builder()
                        .descriptor("BLUE BOTTLE COFFEE SF")
                        .country("US")
                        .mcc("5814")
                        .build()
                )
                .build()

        val roundtrippedAuthorizationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(authorizationRequest),
                jacksonTypeRef<AuthorizationRequest>(),
            )

        assertThat(roundtrippedAuthorizationRequest).isEqualTo(authorizationRequest)
    }
}
