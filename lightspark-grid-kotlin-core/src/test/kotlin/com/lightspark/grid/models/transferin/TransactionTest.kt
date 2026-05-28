// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.transactions.IncomingRateDetails
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TransactionTest {

    @Test
    fun ofIncoming() {
        val incoming =
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

        val transaction = Transaction.ofIncoming(incoming)

        assertThat(transaction.incoming()).isEqualTo(incoming)
        assertThat(transaction.outgoing()).isNull()
    }

    @Test
    fun ofIncomingRoundtrip() {
        val jsonMapper = jsonMapper()
        val transaction =
            Transaction.ofIncoming(
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

        val roundtrippedTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transaction),
                jacksonTypeRef<Transaction>(),
            )

        assertThat(roundtrippedTransaction).isEqualTo(transaction)
    }

    @Test
    fun ofOutgoing() {
        val outgoing =
            OutgoingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(JsonValue.from(mapOf<String, Any>()))
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
                    OutgoingTransaction.CounterpartyInformation.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                .description("Payment for invoice #1234")
                .exchangeRate(1.08)
                .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
                .fees(10L)
                .addPaymentInstruction(
                    PaymentInstructions.builder()
                        .accountOrWalletInfo(
                            PaymentInstructions.AccountOrWalletInfo.SlvAccount.builder()
                                .addPaymentRail(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.PaymentRail
                                        .BANK_TRANSFER
                                )
                                .addPaymentRail(
                                    PaymentInstructions.AccountOrWalletInfo.SlvAccount.PaymentRail
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
                    OutgoingTransaction.Refund.builder()
                        .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .reference("UMA-Q12345-REFUND")
                        .status(OutgoingTransaction.Refund.Status.COMPLETED)
                        .reason(OutgoingTransaction.Refund.Reason.TRANSACTION_FAILED)
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                        .build()
                )
                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .build()

        val transaction = Transaction.ofOutgoing(outgoing)

        assertThat(transaction.incoming()).isNull()
        assertThat(transaction.outgoing()).isEqualTo(outgoing)
    }

    @Test
    fun ofOutgoingRoundtrip() {
        val jsonMapper = jsonMapper()
        val transaction =
            Transaction.ofOutgoing(
                OutgoingTransaction.builder()
                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .destination(JsonValue.from(mapOf<String, Any>()))
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
                        OutgoingTransaction.CounterpartyInformation.builder()
                            .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                            .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                            .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                    .description("Payment for invoice #1234")
                    .exchangeRate(1.08)
                    .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
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
                        OutgoingTransaction.Refund.builder()
                            .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .reference("UMA-Q12345-REFUND")
                            .status(OutgoingTransaction.Refund.Status.COMPLETED)
                            .reason(OutgoingTransaction.Refund.Reason.TRANSACTION_FAILED)
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                            .build()
                    )
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .build()
            )

        val roundtrippedTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transaction),
                jacksonTypeRef<Transaction>(),
            )

        assertThat(roundtrippedTransaction).isEqualTo(transaction)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val transaction = jsonMapper().convertValue(testCase.value, jacksonTypeRef<Transaction>())

        val e = assertThrows<LightsparkGridInvalidDataException> { transaction.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
