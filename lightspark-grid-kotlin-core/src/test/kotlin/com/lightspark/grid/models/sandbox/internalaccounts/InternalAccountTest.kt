// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.internalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.PaymentInstructions
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountTest {

    @Test
    fun create() {
        val internalAccount =
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
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.PaymentRail
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
                .totalBalance(
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
                .type(InternalAccount.Type.INTERNAL_FIAT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .label("invoice-4417")
                .privateEnabled(true)
                .sweepRule(
                    InternalAccount.SweepRule.builder()
                        .destination(
                            InternalAccount.SweepRule.Destination.builder()
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .paymentRail(InternalAccount.SweepRule.Destination.PaymentRail.ACH)
                                .build()
                        )
                        .description("Rent sweep")
                        .maximumAmount(
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
                        .minimumAmount(
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
                        .platformFeeOverride(
                            InternalAccount.SweepRule.PlatformFeeOverride.builder()
                                .platformFixedFee(
                                    InternalAccount.SweepRule.PlatformFeeOverride.PlatformFixedFee
                                        .builder()
                                        .amount(50L)
                                        .currency("USD")
                                        .build()
                                )
                                .platformVariableFeeBps(30L)
                                .build()
                        )
                        .purposeOfPayment(InternalAccount.SweepRule.PurposeOfPayment.SELF)
                        .remittanceInformation("Unit 4B March")
                        .build()
                )
                .build()

        assertThat(internalAccount.id())
            .isEqualTo("InternalAccount:12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
        assertThat(internalAccount.balance())
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
        assertThat(internalAccount.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
        assertThat(internalAccount.fundingPaymentInstructions())
            .containsExactly(
                PaymentInstructions.builder()
                    .accountOrWalletInfo(
                        PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                            .addPaymentRail(
                                PaymentInstructions.AccountOrWalletInfo.SlvAccount.PaymentRail
                                    .BANK_TRANSFER
                            )
                            .reference("UMA-Q12345-REF")
                            .accountNumber("0123456789")
                            .bankAccountType(
                                PaymentInstructions.AccountOrWalletInfo.SlvAccount.BankAccountType
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
        assertThat(internalAccount.status()).isEqualTo(InternalAccount.Status.ACTIVE)
        assertThat(internalAccount.totalBalance())
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
        assertThat(internalAccount.type()).isEqualTo(InternalAccount.Type.INTERNAL_FIAT)
        assertThat(internalAccount.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
        assertThat(internalAccount.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(internalAccount.label()).isEqualTo("invoice-4417")
        assertThat(internalAccount.privateEnabled()).isEqualTo(true)
        assertThat(internalAccount.sweepRule())
            .isEqualTo(
                InternalAccount.SweepRule.builder()
                    .destination(
                        InternalAccount.SweepRule.Destination.builder()
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .paymentRail(InternalAccount.SweepRule.Destination.PaymentRail.ACH)
                            .build()
                    )
                    .description("Rent sweep")
                    .maximumAmount(
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
                    .minimumAmount(
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
                    .platformFeeOverride(
                        InternalAccount.SweepRule.PlatformFeeOverride.builder()
                            .platformFixedFee(
                                InternalAccount.SweepRule.PlatformFeeOverride.PlatformFixedFee
                                    .builder()
                                    .amount(50L)
                                    .currency("USD")
                                    .build()
                            )
                            .platformVariableFeeBps(30L)
                            .build()
                    )
                    .purposeOfPayment(InternalAccount.SweepRule.PurposeOfPayment.SELF)
                    .remittanceInformation("Unit 4B March")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccount =
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
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.PaymentRail
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
                .totalBalance(
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
                .type(InternalAccount.Type.INTERNAL_FIAT)
                .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .label("invoice-4417")
                .privateEnabled(true)
                .sweepRule(
                    InternalAccount.SweepRule.builder()
                        .destination(
                            InternalAccount.SweepRule.Destination.builder()
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .paymentRail(InternalAccount.SweepRule.Destination.PaymentRail.ACH)
                                .build()
                        )
                        .description("Rent sweep")
                        .maximumAmount(
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
                        .minimumAmount(
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
                        .platformFeeOverride(
                            InternalAccount.SweepRule.PlatformFeeOverride.builder()
                                .platformFixedFee(
                                    InternalAccount.SweepRule.PlatformFeeOverride.PlatformFixedFee
                                        .builder()
                                        .amount(50L)
                                        .currency("USD")
                                        .build()
                                )
                                .platformVariableFeeBps(30L)
                                .build()
                        )
                        .purposeOfPayment(InternalAccount.SweepRule.PurposeOfPayment.SELF)
                        .remittanceInformation("Unit 4B March")
                        .build()
                )
                .build()

        val roundtrippedInternalAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccount),
                jacksonTypeRef<InternalAccount>(),
            )

        assertThat(roundtrippedInternalAccount).isEqualTo(internalAccount)
    }
}
