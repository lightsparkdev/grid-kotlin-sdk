// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.receiver

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.quotes.Currency
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountLookupResponseTest {

    @Test
    fun create() {
        val externalAccountLookupResponse =
            ExternalAccountLookupResponse.builder()
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
                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .build()

        assertThat(externalAccountLookupResponse.lookupId())
            .isEqualTo("Lookup:019542f5-b3e7-1d02-0000-000000000009")
        assertThat(externalAccountLookupResponse.supportedCurrencies())
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
        assertThat(externalAccountLookupResponse.requiredPayerDataFields())
            .containsExactly(
                CounterpartyFieldDefinition.builder()
                    .mandatory(true)
                    .name(CustomerInfoFieldName.FULL_NAME)
                    .build()
            )
        assertThat(externalAccountLookupResponse.accountId())
            .isEqualTo("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountLookupResponse =
            ExternalAccountLookupResponse.builder()
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
                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .build()

        val roundtrippedExternalAccountLookupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountLookupResponse),
                jacksonTypeRef<ExternalAccountLookupResponse>(),
            )

        assertThat(roundtrippedExternalAccountLookupResponse)
            .isEqualTo(externalAccountLookupResponse)
    }
}
