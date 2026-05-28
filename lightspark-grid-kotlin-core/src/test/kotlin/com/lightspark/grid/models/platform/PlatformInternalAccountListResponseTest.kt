// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlatformInternalAccountListResponseTest {

    @Test
    fun create() {
        val platformInternalAccountListResponse =
            PlatformInternalAccountListResponse.builder()
                .addData(
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
                        .status(InternalAccount.Status.ACTIVE)
                        .type(InternalAccount.Type.INTERNAL_FIAT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .privateEnabled(true)
                        .build()
                )
                .build()

        assertThat(platformInternalAccountListResponse.data())
            .containsExactly(
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
                    .status(InternalAccount.Status.ACTIVE)
                    .type(InternalAccount.Type.INTERNAL_FIAT)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .privateEnabled(true)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val platformInternalAccountListResponse =
            PlatformInternalAccountListResponse.builder()
                .addData(
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
                        .status(InternalAccount.Status.ACTIVE)
                        .type(InternalAccount.Type.INTERNAL_FIAT)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .privateEnabled(true)
                        .build()
                )
                .build()

        val roundtrippedPlatformInternalAccountListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(platformInternalAccountListResponse),
                jacksonTypeRef<PlatformInternalAccountListResponse>(),
            )

        assertThat(roundtrippedPlatformInternalAccountListResponse)
            .isEqualTo(platformInternalAccountListResponse)
    }
}
