// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.CounterpartyInformation
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.transferin.Transaction
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TransactionListResponseTest {

    @Test
    fun create() {
        val transactionListResponse =
            TransactionListResponse.builder()
                .addData(
                    IncomingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
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
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
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
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(transactionListResponse.data())
            .containsExactly(
                Transaction.ofIncoming(
                    IncomingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
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
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
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
            )
        assertThat(transactionListResponse.hasMore()).isEqualTo(true)
        assertThat(transactionListResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(transactionListResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionListResponse =
            TransactionListResponse.builder()
                .addData(
                    IncomingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(TransactionDestinationOneOf.builder().build())
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
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .failureReason(IncomingTransactionFailureReason.LNURLP_FAILED)
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
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedTransactionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListResponse),
                jacksonTypeRef<TransactionListResponse>(),
            )

        assertThat(roundtrippedTransactionListResponse).isEqualTo(transactionListResponse)
    }
}
