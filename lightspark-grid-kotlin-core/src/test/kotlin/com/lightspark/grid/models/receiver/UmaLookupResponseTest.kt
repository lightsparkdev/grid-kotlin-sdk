// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.receiver

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.quotes.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UmaLookupResponseTest {

    @Test
    fun create() {
        val umaLookupResponse =
            UmaLookupResponse.builder()
                .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                .addSupportedCurrency(
                    LookupResponse.SupportedCurrency.builder()
                        .currency(
                            Currency.builder()
                                .code("USD")
                                .decimals(2L)
                                .name("United States Dollar")
                                .symbol("\$")
                                .build()
                        )
                        .estimatedExchangeRate(1.08)
                        .max(1000000L)
                        .min(1L)
                        .build()
                )
                .addRequiredPayerDataField(
                    CounterpartyFieldDefinition.builder()
                        .mandatory(true)
                        .name(CustomerInfoFieldName.FULL_NAME)
                        .build()
                )
                .receiverUmaAddress("\$receiver@uma.domain")
                .build()

        assertThat(umaLookupResponse.lookupId())
            .isEqualTo("Lookup:019542f5-b3e7-1d02-0000-000000000009")
        assertThat(umaLookupResponse.supportedCurrencies())
            .containsExactly(
                LookupResponse.SupportedCurrency.builder()
                    .currency(
                        Currency.builder()
                            .code("USD")
                            .decimals(2L)
                            .name("United States Dollar")
                            .symbol("\$")
                            .build()
                    )
                    .estimatedExchangeRate(1.08)
                    .max(1000000L)
                    .min(1L)
                    .build()
            )
        assertThat(umaLookupResponse.requiredPayerDataFields())
            .containsExactly(
                CounterpartyFieldDefinition.builder()
                    .mandatory(true)
                    .name(CustomerInfoFieldName.FULL_NAME)
                    .build()
            )
        assertThat(umaLookupResponse.receiverUmaAddress()).isEqualTo("\$receiver@uma.domain")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val umaLookupResponse =
            UmaLookupResponse.builder()
                .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                .addSupportedCurrency(
                    LookupResponse.SupportedCurrency.builder()
                        .currency(
                            Currency.builder()
                                .code("USD")
                                .decimals(2L)
                                .name("United States Dollar")
                                .symbol("\$")
                                .build()
                        )
                        .estimatedExchangeRate(1.08)
                        .max(1000000L)
                        .min(1L)
                        .build()
                )
                .addRequiredPayerDataField(
                    CounterpartyFieldDefinition.builder()
                        .mandatory(true)
                        .name(CustomerInfoFieldName.FULL_NAME)
                        .build()
                )
                .receiverUmaAddress("\$receiver@uma.domain")
                .build()

        val roundtrippedUmaLookupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(umaLookupResponse),
                jacksonTypeRef<UmaLookupResponse>(),
            )

        assertThat(roundtrippedUmaLookupResponse).isEqualTo(umaLookupResponse)
    }
}
