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
                        .onChainTransaction(
                            IncomingTransaction.Destination.Account.OnChainTransaction.builder()
                                .network(
                                    IncomingTransaction.Destination.Account.OnChainTransaction
                                        .Network
                                        .SOLANA
                                )
                                .transactionHash(
                                    "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                )
                                .build()
                        )
                        .build()
                )
                .direction(IncomingTransaction.Direction.CREDIT)
                .platformCustomerId("18d3e5f7b4a9c2")
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
                .exchangeRate(1.08)
                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                .fees(10L)
                .pendingReason(IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .receiptDeliveryConfirmedAt(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
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
                    IncomingTransaction.Refund.builder()
                        .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .reference("UMA-Q12345-REFUND")
                        .status(IncomingTransaction.Refund.Status.COMPLETED)
                        .reason(IncomingTransaction.Refund.Reason.TRANSACTION_FAILED)
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                        .build()
                )
                .ruleBasedAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
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
                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .source(
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .onChainTransaction(
                            TransactionSourceOneOf.Account.OnChainTransaction.builder()
                                .network(
                                    TransactionSourceOneOf.Account.OnChainTransaction.Network.SOLANA
                                )
                                .transactionHash(
                                    "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                )
                                .build()
                        )
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
                        .onChainTransaction(
                            IncomingTransaction.Destination.Account.OnChainTransaction.builder()
                                .network(
                                    IncomingTransaction.Destination.Account.OnChainTransaction
                                        .Network
                                        .SOLANA
                                )
                                .transactionHash(
                                    "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                )
                                .build()
                        )
                        .build()
                )
            )
        assertThat(incomingTransaction.direction()).isEqualTo(IncomingTransaction.Direction.CREDIT)
        assertThat(incomingTransaction.platformCustomerId()).isEqualTo("18d3e5f7b4a9c2")
        assertThat(incomingTransaction.status()).isEqualTo(TransactionStatus.CREATED)
        assertThat(incomingTransaction.type()).isEqualTo(IncomingTransaction.Type.INCOMING)
        assertThat(incomingTransaction.agentId())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000042")
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
        assertThat(incomingTransaction.exchangeRate()).isEqualTo(1.08)
        assertThat(incomingTransaction.failureReason())
            .isEqualTo(IncomingTransaction.FailureReason.LNURLP_FAILED)
        assertThat(incomingTransaction.fees()).isEqualTo(10L)
        assertThat(incomingTransaction.pendingReason())
            .isEqualTo(IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
        assertThat(incomingTransaction.quoteId())
            .isEqualTo("Quote:019542f5-b3e7-1d02-0000-000000000006")
        assertThat(incomingTransaction.receiptDeliveryConfirmedAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
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
        assertThat(incomingTransaction.reconciliationInstructions())
            .isEqualTo(
                ReconciliationInstructions.builder()
                    .reference("UMA-Q12345-REF")
                    .transactionHash(
                        "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                    )
                    .build()
            )
        assertThat(incomingTransaction.refund())
            .isEqualTo(
                IncomingTransaction.Refund.builder()
                    .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .reference("UMA-Q12345-REFUND")
                    .status(IncomingTransaction.Refund.Status.COMPLETED)
                    .reason(IncomingTransaction.Refund.Reason.TRANSACTION_FAILED)
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                    .build()
            )
        assertThat(incomingTransaction.ruleBasedAccountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
        assertThat(incomingTransaction.sentAmount())
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
        assertThat(incomingTransaction.settledAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
        assertThat(incomingTransaction.source())
            .isEqualTo(
                TransactionSourceOneOf.ofAccount(
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .onChainTransaction(
                            TransactionSourceOneOf.Account.OnChainTransaction.builder()
                                .network(
                                    TransactionSourceOneOf.Account.OnChainTransaction.Network.SOLANA
                                )
                                .transactionHash(
                                    "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                )
                                .build()
                        )
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
                        .onChainTransaction(
                            IncomingTransaction.Destination.Account.OnChainTransaction.builder()
                                .network(
                                    IncomingTransaction.Destination.Account.OnChainTransaction
                                        .Network
                                        .SOLANA
                                )
                                .transactionHash(
                                    "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                )
                                .build()
                        )
                        .build()
                )
                .direction(IncomingTransaction.Direction.CREDIT)
                .platformCustomerId("18d3e5f7b4a9c2")
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
                .exchangeRate(1.08)
                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                .fees(10L)
                .pendingReason(IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .receiptDeliveryConfirmedAt(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
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
                    IncomingTransaction.Refund.builder()
                        .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .reference("UMA-Q12345-REFUND")
                        .status(IncomingTransaction.Refund.Status.COMPLETED)
                        .reason(IncomingTransaction.Refund.Reason.TRANSACTION_FAILED)
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                        .build()
                )
                .ruleBasedAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
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
                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .source(
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .onChainTransaction(
                            TransactionSourceOneOf.Account.OnChainTransaction.builder()
                                .network(
                                    TransactionSourceOneOf.Account.OnChainTransaction.Network.SOLANA
                                )
                                .transactionHash(
                                    "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                )
                                .build()
                        )
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
