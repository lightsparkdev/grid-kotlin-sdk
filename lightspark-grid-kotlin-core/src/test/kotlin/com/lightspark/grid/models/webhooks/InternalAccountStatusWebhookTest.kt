// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.InternalAccountStatus
import com.lightspark.grid.models.customers.InternalAccountType
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountStatusWebhookTest {

    @Test
    fun create() {
        val internalAccountStatusWebhook =
            InternalAccountStatusWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INTERNAL_ACCOUNT.BALANCE_UPDATED"))
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
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("0123456789")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Banco Cuscatlan")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .status(InternalAccountStatus.ACTIVE)
                        .type(InternalAccountType.INTERNAL_FIAT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .privateEnabled(true)
                        .build()
                )
                .build()

        assertThat(internalAccountStatusWebhook.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(internalAccountStatusWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(internalAccountStatusWebhook._type())
            .isEqualTo(JsonValue.from("INTERNAL_ACCOUNT.BALANCE_UPDATED"))
        assertThat(internalAccountStatusWebhook.data())
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
                                PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                    .addPaymentRail(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                            .PaymentRail
                                            .BANK_TRANSFER
                                    )
                                    .reference("UMA-Q12345-REF")
                                    .accountNumber("0123456789")
                                    .bankAccountType(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                            .BankAccountType
                                            .CHECKING
                                    )
                                    .bankName("Banco Cuscatlan")
                                    .phoneNumber("+50312345678")
                                    .build()
                            )
                            .instructionsNotes(
                                "Please ensure the reference code is included in the payment memo/description field"
                            )
                            .isPlatformAccount(true)
                            .build()
                    )
                    .status(InternalAccountStatus.ACTIVE)
                    .type(InternalAccountType.INTERNAL_FIAT)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .privateEnabled(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountStatusWebhook =
            InternalAccountStatusWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("INTERNAL_ACCOUNT.BALANCE_UPDATED"))
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
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("0123456789")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Banco Cuscatlan")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .status(InternalAccountStatus.ACTIVE)
                        .type(InternalAccountType.INTERNAL_FIAT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .privateEnabled(true)
                        .build()
                )
                .build()

        val roundtrippedInternalAccountStatusWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountStatusWebhook),
                jacksonTypeRef<InternalAccountStatusWebhook>(),
            )

        assertThat(roundtrippedInternalAccountStatusWebhook).isEqualTo(internalAccountStatusWebhook)
    }
}
