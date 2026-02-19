// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.transactions.CounterpartyInformation
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.TransactionDestinationOneOf
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.transactions.TransactionType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IncomingPaymentWebhookEventTest {

    @Test
    fun create() {
        val incomingPaymentWebhookEvent =
            IncomingPaymentWebhookEvent.builder()
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .transaction(
                    IncomingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(
                            TransactionDestinationOneOf.AccountTransactionDestination.builder()
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .status(TransactionStatus.CREATED)
                        .type(TransactionType.INCOMING)
                        .counterpartyInformation(
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
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
                        .source(
                            TransactionSourceOneOf.Account.builder()
                                .currency("USD")
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                                .build()
                        )
                        .build()
                )
                .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .addRequestedReceiverCustomerInfoField(
                    CounterpartyFieldDefinition.builder()
                        .mandatory(true)
                        .name(CustomerInfoFieldName.FULL_NAME)
                        .build()
                )
                .build()

        assertThat(incomingPaymentWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(incomingPaymentWebhookEvent.transaction())
            .isEqualTo(
                IncomingTransaction.builder()
                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .destination(
                        TransactionDestinationOneOf.AccountTransactionDestination.builder()
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .platformCustomerId("18d3e5f7b4a9c2")
                    .status(TransactionStatus.CREATED)
                    .type(TransactionType.INCOMING)
                    .counterpartyInformation(
                        CounterpartyInformation.builder()
                            .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                            .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                            .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                    .description("Payment for invoice #1234")
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
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
                    .source(
                        TransactionSourceOneOf.Account.builder()
                            .currency("USD")
                            .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                            .build()
                    )
                    .build()
            )
        assertThat(incomingPaymentWebhookEvent.type())
            .isEqualTo(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT)
        assertThat(incomingPaymentWebhookEvent.webhookId())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(incomingPaymentWebhookEvent.requestedReceiverCustomerInfoFields())
            .containsExactly(
                CounterpartyFieldDefinition.builder()
                    .mandatory(true)
                    .name(CustomerInfoFieldName.FULL_NAME)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val incomingPaymentWebhookEvent =
            IncomingPaymentWebhookEvent.builder()
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .transaction(
                    IncomingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(
                            TransactionDestinationOneOf.AccountTransactionDestination.builder()
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .platformCustomerId("18d3e5f7b4a9c2")
                        .status(TransactionStatus.CREATED)
                        .type(TransactionType.INCOMING)
                        .counterpartyInformation(
                            CounterpartyInformation.builder()
                                .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                        .description("Payment for invoice #1234")
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
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
                        .source(
                            TransactionSourceOneOf.Account.builder()
                                .currency("USD")
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                                .build()
                        )
                        .build()
                )
                .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .addRequestedReceiverCustomerInfoField(
                    CounterpartyFieldDefinition.builder()
                        .mandatory(true)
                        .name(CustomerInfoFieldName.FULL_NAME)
                        .build()
                )
                .build()

        val roundtrippedIncomingPaymentWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(incomingPaymentWebhookEvent),
                jacksonTypeRef<IncomingPaymentWebhookEvent>(),
            )

        assertThat(roundtrippedIncomingPaymentWebhookEvent).isEqualTo(incomingPaymentWebhookEvent)
    }
}
