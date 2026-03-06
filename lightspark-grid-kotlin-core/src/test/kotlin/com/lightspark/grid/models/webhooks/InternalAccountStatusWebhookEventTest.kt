// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountStatusWebhookEventTest {

    @Test
    fun create() {
        val internalAccountStatusWebhookEvent =
            InternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    InternalAccount.builder()
                        .id("InternalAccount:12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .balance(
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
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .addFundingPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                        .accountNumber("accountNumber")
                                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                        .routingNumber("routingNumber")
                                        .reference("UMA-Q12345-REF")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
                .build()

        assertThat(internalAccountStatusWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(internalAccountStatusWebhookEvent.data())
            .isEqualTo(
                InternalAccount.builder()
                    .id("InternalAccount:12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                    .balance(
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
                    .createdAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                    .addFundingPaymentInstruction(
                        PaymentInstructions.builder()
                            .accountOrWalletInfo(
                                PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                    .accountNumber("accountNumber")
                                    .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                    .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                    .routingNumber("routingNumber")
                                    .reference("UMA-Q12345-REF")
                                    .build()
                            )
                            .instructionsNotes(
                                "Please ensure the reference code is included in the payment memo/description field"
                            )
                            .isPlatformAccount(true)
                            .build()
                    )
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )
        assertThat(internalAccountStatusWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(internalAccountStatusWebhookEvent.type())
            .isEqualTo(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountStatusWebhookEvent =
            InternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    InternalAccount.builder()
                        .id("InternalAccount:12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .balance(
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
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .addFundingPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                        .accountNumber("accountNumber")
                                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                        .routingNumber("routingNumber")
                                        .reference("UMA-Q12345-REF")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
                .build()

        val roundtrippedInternalAccountStatusWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountStatusWebhookEvent),
                jacksonTypeRef<InternalAccountStatusWebhookEvent>(),
            )

        assertThat(roundtrippedInternalAccountStatusWebhookEvent)
            .isEqualTo(internalAccountStatusWebhookEvent)
    }
}
