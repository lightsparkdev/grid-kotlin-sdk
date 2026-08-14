// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
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
                .destination(JsonValue.from(mapOf<String, Any>()))
                .direction(IncomingTransaction.Direction.CREDIT)
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
                .exchangeRate(1.08)
                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                .fees(10L)
                .pendingReason(IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .receiptDeliveryConfirmedAt(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
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
                .source(TransactionSourceOneOf.builder().build())
                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .build()

        assertThat(incomingTransaction.id())
            .isEqualTo("Transaction:019542f5-b3e7-1d02-0000-000000000004")
        assertThat(incomingTransaction.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(incomingTransaction._destination())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(incomingTransaction.direction()).isEqualTo(IncomingTransaction.Direction.CREDIT)
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
                Refund.builder()
                    .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .reference("UMA-Q12345-REFUND")
                    .status(Refund.Status.COMPLETED)
                    .reason(Refund.Reason.TRANSACTION_FAILED)
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                    .build()
            )
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
        assertThat(incomingTransaction.source()).isEqualTo(TransactionSourceOneOf.builder().build())
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
                .destination(JsonValue.from(mapOf<String, Any>()))
                .direction(IncomingTransaction.Direction.CREDIT)
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
                .exchangeRate(1.08)
                .failureReason(IncomingTransaction.FailureReason.LNURLP_FAILED)
                .fees(10L)
                .pendingReason(IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .receiptDeliveryConfirmedAt(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
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
                .source(TransactionSourceOneOf.builder().build())
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
