// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomingTransactionTest {

    @Test
    fun create() {
        val incomingTransaction =
            IncomingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(
                    IncomingTransaction.Destination.Account.builder()
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .destinationType(
                            IncomingTransaction.Destination.Account.DestinationType.ACCOUNT
                        )
                        .build()
                )
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
                .rateDetails(
                    IncomingTransaction.RateDetails.builder()
                        .gridApiFixedFee(10L)
                        .gridApiMultiplier(0.925)
                        .gridApiVariableFeeAmount(30.0)
                        .gridApiVariableFeeRate(0.003)
                        .build()
                )
                .reconciliationInstructions(
                    IncomingTransaction.ReconciliationInstructions.builder()
                        .reference("UMA-Q12345-REF")
                        .build()
                )
                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .source(
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .build()

        assertThat(incomingTransaction.id())
            .isEqualTo("Transaction:019542f5-b3e7-1d02-0000-000000000004")
        assertThat(incomingTransaction.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(incomingTransaction.destination())
            .isEqualTo(
                IncomingTransaction.Destination.ofAccount(
                    IncomingTransaction.Destination.Account.builder()
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .destinationType(
                            IncomingTransaction.Destination.Account.DestinationType.ACCOUNT
                        )
                        .build()
                )
            )
        assertThat(incomingTransaction.platformCustomerId()).isEqualTo("18d3e5f7b4a9c2")
        assertThat(incomingTransaction.receivedAmount())
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
        assertThat(incomingTransaction.status()).isEqualTo(TransactionStatus.CREATED)
        assertThat(incomingTransaction.type()).isEqualTo(IncomingTransaction.Type.INCOMING)
        assertThat(incomingTransaction.counterpartyInformation())
            .isEqualTo(
                IncomingTransaction.CounterpartyInformation.builder()
                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                    .build()
            )
        assertThat(incomingTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
        assertThat(incomingTransaction.description()).isEqualTo("Payment for invoice #1234")
        assertThat(incomingTransaction.failureReason())
            .isEqualTo(IncomingTransaction.FailureReason.LNURLP_FAILED)
        assertThat(incomingTransaction.rateDetails())
            .isEqualTo(
                IncomingTransaction.RateDetails.builder()
                    .gridApiFixedFee(10L)
                    .gridApiMultiplier(0.925)
                    .gridApiVariableFeeAmount(30.0)
                    .gridApiVariableFeeRate(0.003)
                    .build()
            )
        assertThat(incomingTransaction.reconciliationInstructions())
            .isEqualTo(
                IncomingTransaction.ReconciliationInstructions.builder()
                    .reference("UMA-Q12345-REF")
                    .build()
            )
        assertThat(incomingTransaction.settledAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
        assertThat(incomingTransaction.source())
            .isEqualTo(
                TransactionSourceOneOf.ofAccount(
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .build()
                )
            )
        assertThat(incomingTransaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val incomingTransaction =
            IncomingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(
                    IncomingTransaction.Destination.Account.builder()
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .destinationType(
                            IncomingTransaction.Destination.Account.DestinationType.ACCOUNT
                        )
                        .build()
                )
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
                .rateDetails(
                    IncomingTransaction.RateDetails.builder()
                        .gridApiFixedFee(10L)
                        .gridApiMultiplier(0.925)
                        .gridApiVariableFeeAmount(30.0)
                        .gridApiVariableFeeRate(0.003)
                        .build()
                )
                .reconciliationInstructions(
                    IncomingTransaction.ReconciliationInstructions.builder()
                        .reference("UMA-Q12345-REF")
                        .build()
                )
                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .source(
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .build()
                )
                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .build()

        val roundtrippedIncomingTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(incomingTransaction),
                jacksonTypeRef<IncomingTransaction>(),
            )

        assertThat(roundtrippedIncomingTransaction).isEqualTo(incomingTransaction)
    }
}
