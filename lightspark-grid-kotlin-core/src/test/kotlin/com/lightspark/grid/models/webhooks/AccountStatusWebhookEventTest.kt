// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountStatusWebhookEventTest {

    @Test
    fun create() {
        val accountStatusWebhookEvent =
            AccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .accountId("accountId")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(AccountStatusWebhookEvent.Type.INCOMING_PAYMENT)
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .newBalance(
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
                .oldBalance(
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
                .platformCustomerId("019542f5-b3e7-1d02-0000-000000000001")
                .build()

        assertThat(accountStatusWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(accountStatusWebhookEvent.accountId()).isEqualTo("accountId")
        assertThat(accountStatusWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(accountStatusWebhookEvent.type())
            .isEqualTo(AccountStatusWebhookEvent.Type.INCOMING_PAYMENT)
        assertThat(accountStatusWebhookEvent.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(accountStatusWebhookEvent.newBalance())
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
        assertThat(accountStatusWebhookEvent.oldBalance())
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
        assertThat(accountStatusWebhookEvent.platformCustomerId())
            .isEqualTo("019542f5-b3e7-1d02-0000-000000000001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountStatusWebhookEvent =
            AccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .accountId("accountId")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(AccountStatusWebhookEvent.Type.INCOMING_PAYMENT)
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .newBalance(
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
                .oldBalance(
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
                .platformCustomerId("019542f5-b3e7-1d02-0000-000000000001")
                .build()

        val roundtrippedAccountStatusWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountStatusWebhookEvent),
                jacksonTypeRef<AccountStatusWebhookEvent>(),
            )

        assertThat(roundtrippedAccountStatusWebhookEvent).isEqualTo(accountStatusWebhookEvent)
    }
}
