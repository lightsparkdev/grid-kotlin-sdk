// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.CounterpartyInformation
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransactionFailureReason
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionDestinationOneOf
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutgoingPaymentWebhookTest {

    @Test
    fun create() {
        val outgoingPaymentWebhook =
            OutgoingPaymentWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("OUTGOING_PAYMENT.PENDING"))
                .data(
                    OutgoingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .sentAmount(
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
                        .source(TransactionSourceOneOf.builder().build())
                        .status(OutgoingTransaction.Status.PENDING)
                        .type(OutgoingTransaction.Type.OUTGOING)
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .counterpartyInformation(
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .exchangeRate(1.08)
                        .failureReason(OutgoingTransactionFailureReason.QUOTE_EXPIRED)
                        .fees(10L)
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .MOBILE_MONEY
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("1234567890")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Chase Bank")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                                .isPlatformAccount(true)
                                .build()
                        )
                        .addPaymentInstruction(
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
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .rateDetails(
                            OutgoingRateDetails.builder()
                                .counterpartyFixedFee(10L)
                                .counterpartyMultiplier(1.08)
                                .gridApiFixedFee(10L)
                                .gridApiMultiplier(0.925)
                                .gridApiVariableFeeAmount(30L)
                                .gridApiVariableFeeRate(0.003)
                                .build()
                        )
                        .receivedAmount(
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
                        .reconciliationInstructions(
                            ReconciliationInstructions.builder()
                                .reference("UMA-Q12345-REF")
                                .transactionHash(
                                    "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                )
                                .build()
                        )
                        .refund(
                            Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(Refund.Status.COMPLETED)
                                .reason(Refund.Reason.TRANSACTION_FAILED)
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .build()
                )
                .build()

        assertThat(outgoingPaymentWebhook.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(outgoingPaymentWebhook.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(outgoingPaymentWebhook._type())
            .isEqualTo(JsonValue.from("OUTGOING_PAYMENT.PENDING"))
        assertThat(outgoingPaymentWebhook.data())
            .isEqualTo(
                OutgoingTransaction.builder()
                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .destination(TransactionDestinationOneOf.builder().build())
                    .platformCustomerId("18d3e5f7b4a9c2")
                    .sentAmount(
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
                    .source(TransactionSourceOneOf.builder().build())
                    .status(OutgoingTransaction.Status.PENDING)
                    .type(OutgoingTransaction.Type.OUTGOING)
                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                    .counterpartyInformation(
                        CounterpartyInformation.builder()
                            .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                            .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                            .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                    .description("Payment for invoice #1234")
                    .exchangeRate(1.08)
                    .failureReason(OutgoingTransactionFailureReason.QUOTE_EXPIRED)
                    .fees(10L)
                    .addPaymentInstruction(
                        PaymentInstructions.builder()
                            .accountOrWalletInfo(
                                PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                    .addPaymentRail(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                            .PaymentRail
                                            .BANK_TRANSFER
                                    )
                                    .addPaymentRail(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                            .PaymentRail
                                            .MOBILE_MONEY
                                    )
                                    .reference("UMA-Q12345-REF")
                                    .accountNumber("1234567890")
                                    .bankAccountType(
                                        PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                            .BankAccountType
                                            .CHECKING
                                    )
                                    .bankName("Chase Bank")
                                    .phoneNumber("+50312345678")
                                    .build()
                            )
                            .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                            .isPlatformAccount(true)
                            .build()
                    )
                    .addPaymentInstruction(
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
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .rateDetails(
                        OutgoingRateDetails.builder()
                            .counterpartyFixedFee(10L)
                            .counterpartyMultiplier(1.08)
                            .gridApiFixedFee(10L)
                            .gridApiMultiplier(0.925)
                            .gridApiVariableFeeAmount(30L)
                            .gridApiVariableFeeRate(0.003)
                            .build()
                    )
                    .receivedAmount(
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
                    .reconciliationInstructions(
                        ReconciliationInstructions.builder()
                            .reference("UMA-Q12345-REF")
                            .transactionHash(
                                "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                            )
                            .build()
                    )
                    .refund(
                        Refund.builder()
                            .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .reference("UMA-Q12345-REFUND")
                            .status(Refund.Status.COMPLETED)
                            .reason(Refund.Reason.TRANSACTION_FAILED)
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                            .build()
                    )
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outgoingPaymentWebhook =
            OutgoingPaymentWebhook.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(JsonValue.from("OUTGOING_PAYMENT.PENDING"))
                .data(
                    OutgoingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .sentAmount(
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
                        .source(TransactionSourceOneOf.builder().build())
                        .status(OutgoingTransaction.Status.PENDING)
                        .type(OutgoingTransaction.Type.OUTGOING)
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .counterpartyInformation(
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .exchangeRate(1.08)
                        .failureReason(OutgoingTransactionFailureReason.QUOTE_EXPIRED)
                        .fees(10L)
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .BANK_TRANSFER
                                        )
                                        .addPaymentRail(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .PaymentRail
                                                .MOBILE_MONEY
                                        )
                                        .reference("UMA-Q12345-REF")
                                        .accountNumber("1234567890")
                                        .bankAccountType(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .BankAccountType
                                                .CHECKING
                                        )
                                        .bankName("Chase Bank")
                                        .phoneNumber("+50312345678")
                                        .build()
                                )
                                .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                                .isPlatformAccount(true)
                                .build()
                        )
                        .addPaymentInstruction(
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
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .rateDetails(
                            OutgoingRateDetails.builder()
                                .counterpartyFixedFee(10L)
                                .counterpartyMultiplier(1.08)
                                .gridApiFixedFee(10L)
                                .gridApiMultiplier(0.925)
                                .gridApiVariableFeeAmount(30L)
                                .gridApiVariableFeeRate(0.003)
                                .build()
                        )
                        .receivedAmount(
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
                        .reconciliationInstructions(
                            ReconciliationInstructions.builder()
                                .reference("UMA-Q12345-REF")
                                .transactionHash(
                                    "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                                )
                                .build()
                        )
                        .refund(
                            Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(Refund.Status.COMPLETED)
                                .reason(Refund.Reason.TRANSACTION_FAILED)
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .build()
                )
                .build()

        val roundtrippedOutgoingPaymentWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outgoingPaymentWebhook),
                jacksonTypeRef<OutgoingPaymentWebhook>(),
            )

        assertThat(roundtrippedOutgoingPaymentWebhook).isEqualTo(outgoingPaymentWebhook)
    }
}
