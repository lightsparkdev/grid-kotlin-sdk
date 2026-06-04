// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.AgentTransferDetails
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import com.lightspark.grid.models.transactions.IncomingRateDetails
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentActionListResponseTest {

    @Test
    fun create() {
        val agentActionListResponse =
            AgentActionListResponse.builder()
                .addData(
                    AgentAction.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentAction.Status.PENDING_APPROVAL)
                        .type(AgentAction.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(QuoteDestinationOneOf.builder().build())
                                .exchangeRate(1.0)
                                .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                .feesIncluded(10L)
                                .receivingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .sendingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .source(QuoteSourceOneOf.builder().build())
                                .status(Quote.Status.PENDING)
                                .totalReceivingAmount(1000L)
                                .totalSendingAmount(123010L)
                                .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                                .counterpartyInformation(
                                    Quote.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .builder()
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .BANK_TRANSFER
                                                )
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .MOBILE_MONEY
                                                )
                                                .reference("UMA-Q12345-REF")
                                                .accountNumber("1234567890")
                                                .bankAccountType(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .BankAccountType
                                                        .CHECKING
                                                )
                                                .bankName("Chase Bank")
                                                .phoneNumber("+50312345678")
                                                .build()
                                        )
                                        .instructionsNotes(
                                            "Include reference UMA-Q12345-REF in memo"
                                        )
                                        .isPlatformAccount(true)
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .builder()
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .BANK_TRANSFER
                                                )
                                                .reference("UMA-Q12345-REF")
                                                .accountNumber("0123456789")
                                                .bankAccountType(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
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
                                .build()
                        )
                        .rejectionReason(
                            "Transaction amount exceeds customer's current risk limit."
                        )
                        .transaction(
                            IncomingTransaction.builder()
                                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .destination(JsonValue.from(mapOf<String, Any>()))
                                .platformCustomerId("18d3e5f7b4a9c2")
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
                                .status(TransactionStatus.CREATED)
                                .type(IncomingTransaction.Type.INCOMING)
                                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                                .counterpartyInformation(
                                    IncomingTransaction.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                                .description("Payment for invoice #1234")
                                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                                .fees(10L)
                                .rateDetails(
                                    IncomingRateDetails.builder()
                                        .gridApiFixedFee(10L)
                                        .gridApiMultiplier(0.925)
                                        .gridApiVariableFeeAmount(30L)
                                        .gridApiVariableFeeRate(0.003)
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
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .source(TransactionSourceOneOf.builder().build())
                                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .transferDetails(
                            AgentTransferDetails.builder()
                                .amount(50000L)
                                .currency("USD")
                                .destinationAccountId(
                                    "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                )
                                .sourceAccountId(
                                    "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                )
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(agentActionListResponse.data())
            .containsExactly(
                AgentAction.builder()
                    .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                    .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                    .platformCustomerId("user-a1b2c3")
                    .status(AgentAction.Status.PENDING_APPROVAL)
                    .type(AgentAction.Type.EXECUTE_QUOTE)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                    .quote(
                        Quote.builder()
                            .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .destination(QuoteDestinationOneOf.builder().build())
                            .exchangeRate(1.0)
                            .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                            .feesIncluded(10L)
                            .receivingCurrency(
                                Currency.builder()
                                    .code("USD")
                                    .decimals(2L)
                                    .name("United States Dollar")
                                    .symbol("\$")
                                    .build()
                            )
                            .sendingCurrency(
                                Currency.builder()
                                    .code("USD")
                                    .decimals(2L)
                                    .name("United States Dollar")
                                    .symbol("\$")
                                    .build()
                            )
                            .source(QuoteSourceOneOf.builder().build())
                            .status(Quote.Status.PENDING)
                            .totalReceivingAmount(1000L)
                            .totalSendingAmount(123010L)
                            .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                            .counterpartyInformation(
                                Quote.CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
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
                            .build()
                    )
                    .rejectionReason("Transaction amount exceeds customer's current risk limit.")
                    .transaction(
                        IncomingTransaction.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(JsonValue.from(mapOf<String, Any>()))
                            .platformCustomerId("18d3e5f7b4a9c2")
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
                            .status(TransactionStatus.CREATED)
                            .type(IncomingTransaction.Type.INCOMING)
                            .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                            .counterpartyInformation(
                                IncomingTransaction.CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
                            .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                            .description("Payment for invoice #1234")
                            .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                            .fees(10L)
                            .rateDetails(
                                IncomingRateDetails.builder()
                                    .gridApiFixedFee(10L)
                                    .gridApiMultiplier(0.925)
                                    .gridApiVariableFeeAmount(30L)
                                    .gridApiVariableFeeRate(0.003)
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
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .source(TransactionSourceOneOf.builder().build())
                            .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .build()
                    )
                    .transferDetails(
                        AgentTransferDetails.builder()
                            .amount(50000L)
                            .currency("USD")
                            .destinationAccountId(
                                "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                            )
                            .sourceAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .build()
            )
        assertThat(agentActionListResponse.hasMore()).isEqualTo(true)
        assertThat(agentActionListResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(agentActionListResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentActionListResponse =
            AgentActionListResponse.builder()
                .addData(
                    AgentAction.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentAction.Status.PENDING_APPROVAL)
                        .type(AgentAction.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(QuoteDestinationOneOf.builder().build())
                                .exchangeRate(1.0)
                                .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                .feesIncluded(10L)
                                .receivingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .sendingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .source(QuoteSourceOneOf.builder().build())
                                .status(Quote.Status.PENDING)
                                .totalReceivingAmount(1000L)
                                .totalSendingAmount(123010L)
                                .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                                .counterpartyInformation(
                                    Quote.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .builder()
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .BANK_TRANSFER
                                                )
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .MOBILE_MONEY
                                                )
                                                .reference("UMA-Q12345-REF")
                                                .accountNumber("1234567890")
                                                .bankAccountType(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .BankAccountType
                                                        .CHECKING
                                                )
                                                .bankName("Chase Bank")
                                                .phoneNumber("+50312345678")
                                                .build()
                                        )
                                        .instructionsNotes(
                                            "Include reference UMA-Q12345-REF in memo"
                                        )
                                        .isPlatformAccount(true)
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SlvAccount
                                                .builder()
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
                                                        .PaymentRail
                                                        .BANK_TRANSFER
                                                )
                                                .reference("UMA-Q12345-REF")
                                                .accountNumber("0123456789")
                                                .bankAccountType(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SlvAccount
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
                                .build()
                        )
                        .rejectionReason(
                            "Transaction amount exceeds customer's current risk limit."
                        )
                        .transaction(
                            IncomingTransaction.builder()
                                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .destination(JsonValue.from(mapOf<String, Any>()))
                                .platformCustomerId("18d3e5f7b4a9c2")
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
                                .status(TransactionStatus.CREATED)
                                .type(IncomingTransaction.Type.INCOMING)
                                .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                                .counterpartyInformation(
                                    IncomingTransaction.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                                .description("Payment for invoice #1234")
                                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                                .fees(10L)
                                .rateDetails(
                                    IncomingRateDetails.builder()
                                        .gridApiFixedFee(10L)
                                        .gridApiMultiplier(0.925)
                                        .gridApiVariableFeeAmount(30L)
                                        .gridApiVariableFeeRate(0.003)
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
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .source(TransactionSourceOneOf.builder().build())
                                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .transferDetails(
                            AgentTransferDetails.builder()
                                .amount(50000L)
                                .currency("USD")
                                .destinationAccountId(
                                    "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                )
                                .sourceAccountId(
                                    "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                )
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedAgentActionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentActionListResponse),
                jacksonTypeRef<AgentActionListResponse>(),
            )

        assertThat(roundtrippedAgentActionListResponse).isEqualTo(agentActionListResponse)
    }
}
