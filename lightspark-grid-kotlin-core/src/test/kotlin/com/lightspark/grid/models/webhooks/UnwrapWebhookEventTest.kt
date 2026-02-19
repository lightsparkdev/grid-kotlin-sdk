// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.invitations.UmaInvitation
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
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
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class UnwrapWebhookEventTest {

    @Test
    fun ofIncomingPayment() {
        val incomingPayment =
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

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofIncomingPayment(incomingPayment)

        assertThat(unwrapWebhookEvent.incomingPayment()).isEqualTo(incomingPayment)
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.kycStatus()).isNull()
        assertThat(unwrapWebhookEvent.accountStatus()).isNull()
    }

    @Test
    fun ofIncomingPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofIncomingPayment(
                IncomingPaymentWebhookEvent.builder()
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .transaction(
                        IncomingTransaction.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(
                                TransactionDestinationOneOf.AccountTransactionDestination.builder()
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
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
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
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
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofOutgoingPayment() {
        val outgoingPayment =
            OutgoingPaymentWebhookEvent.builder()
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .transaction(
                    OutgoingPaymentWebhookEvent.Transaction.builder()
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
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.PaymentClabeAccountInfo
                                        .builder()
                                        .clabeNumber("123456789012345678")
                                        .reference("UMA-Q12345-REF")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.PaymentClabeAccountInfo
                                        .builder()
                                        .clabeNumber("123456789012345678")
                                        .reference("UMA-Q12345-REF")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
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
                        .source(
                            TransactionSourceOneOf.Account.builder()
                                .currency("USD")
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                                .build()
                        )
                        .exchangeRate(1.08)
                        .failureReason(
                            OutgoingPaymentWebhookEvent.Transaction.FailureReason.QUOTE_EXPIRED
                        )
                        .fees(10L)
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .rateDetails(
                            OutgoingRateDetails.builder()
                                .counterpartyFixedFee(10L)
                                .counterpartyMultiplier(1.08)
                                .gridApiFixedFee(10L)
                                .gridApiMultiplier(0.925)
                                .gridApiVariableFeeAmount(30.0)
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
                        .refund(
                            OutgoingPaymentWebhookEvent.Transaction.Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .build()
                )
                .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofOutgoingPayment(outgoingPayment)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isEqualTo(outgoingPayment)
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.kycStatus()).isNull()
        assertThat(unwrapWebhookEvent.accountStatus()).isNull()
    }

    @Test
    fun ofOutgoingPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofOutgoingPayment(
                OutgoingPaymentWebhookEvent.builder()
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .transaction(
                        OutgoingPaymentWebhookEvent.Transaction.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(
                                TransactionDestinationOneOf.AccountTransactionDestination.builder()
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
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
                            .addPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo
                                            .PaymentClabeAccountInfo
                                            .builder()
                                            .clabeNumber("123456789012345678")
                                            .reference("UMA-Q12345-REF")
                                            .build()
                                    )
                                    .instructionsNotes(
                                        "Please ensure the reference code is included in the payment memo/description field"
                                    )
                                    .isPlatformAccount(true)
                                    .build()
                            )
                            .addPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo
                                            .PaymentClabeAccountInfo
                                            .builder()
                                            .clabeNumber("123456789012345678")
                                            .reference("UMA-Q12345-REF")
                                            .build()
                                    )
                                    .instructionsNotes(
                                        "Please ensure the reference code is included in the payment memo/description field"
                                    )
                                    .isPlatformAccount(true)
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
                            .source(
                                TransactionSourceOneOf.Account.builder()
                                    .currency("USD")
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                                    .build()
                            )
                            .exchangeRate(1.08)
                            .failureReason(
                                OutgoingPaymentWebhookEvent.Transaction.FailureReason.QUOTE_EXPIRED
                            )
                            .fees(10L)
                            .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .rateDetails(
                                OutgoingRateDetails.builder()
                                    .counterpartyFixedFee(10L)
                                    .counterpartyMultiplier(1.08)
                                    .gridApiFixedFee(10L)
                                    .gridApiMultiplier(0.925)
                                    .gridApiVariableFeeAmount(30.0)
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
                            .refund(
                                OutgoingPaymentWebhookEvent.Transaction.Refund.builder()
                                    .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .reference("UMA-Q12345-REFUND")
                                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                    .build()
                            )
                            .build()
                    )
                    .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT)
                    .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofTestWebhook() {
        val testWebhook =
            TestWebhookWebhookEvent.builder()
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(TestWebhookWebhookEvent.Type.TEST)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofTestWebhook(testWebhook)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isEqualTo(testWebhook)
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.kycStatus()).isNull()
        assertThat(unwrapWebhookEvent.accountStatus()).isNull()
    }

    @Test
    fun ofTestWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofTestWebhook(
                TestWebhookWebhookEvent.builder()
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(TestWebhookWebhookEvent.Type.TEST)
                    .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofBulkUpload() {
        val bulkUpload =
            BulkUploadWebhookEvent.builder()
                .bulkCustomerImportJob(
                    BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                        .jobId("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhookEvent.BulkCustomerImportJob.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhookEvent.BulkCustomerImportJob.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkUploadWebhookEvent.BulkCustomerImportJob.Error.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkUploadWebhookEvent.BulkCustomerImportJob.Error.Details
                                        .builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofBulkUpload(bulkUpload)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isEqualTo(bulkUpload)
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.kycStatus()).isNull()
        assertThat(unwrapWebhookEvent.accountStatus()).isNull()
    }

    @Test
    fun ofBulkUploadRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofBulkUpload(
                BulkUploadWebhookEvent.builder()
                    .bulkCustomerImportJob(
                        BulkUploadWebhookEvent.BulkCustomerImportJob.builder()
                            .jobId("Job:019542f5-b3e7-1d02-0000-000000000006")
                            .progress(
                                BulkUploadWebhookEvent.BulkCustomerImportJob.Progress.builder()
                                    .failed(50L)
                                    .processed(2500L)
                                    .successful(2450L)
                                    .total(5000L)
                                    .build()
                            )
                            .status(BulkUploadWebhookEvent.BulkCustomerImportJob.Status.PROCESSING)
                            .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                            .addError(
                                BulkUploadWebhookEvent.BulkCustomerImportJob.Error.builder()
                                    .correlationId("biz456")
                                    .code("code")
                                    .details(
                                        BulkUploadWebhookEvent.BulkCustomerImportJob.Error.Details
                                            .builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .message("message")
                                    .build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD)
                    .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofInvitationClaimed() {
        val invitationClaimed =
            InvitationClaimedWebhookEvent.builder()
                .invitation(
                    UmaInvitation.builder()
                        .code("019542f5")
                        .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .inviterUma("\$inviter@uma.domain")
                        .status(UmaInvitation.Status.PENDING)
                        .url("https://uma.me/i/019542f5")
                        .amountToSend(
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
                        .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                        .firstName("Jane")
                        .inviteeUma("\$invitee@uma.domain")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(InvitationClaimedWebhookEvent.Type.INVITATION_CLAIMED)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofInvitationClaimed(invitationClaimed)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isEqualTo(invitationClaimed)
        assertThat(unwrapWebhookEvent.kycStatus()).isNull()
        assertThat(unwrapWebhookEvent.accountStatus()).isNull()
    }

    @Test
    fun ofInvitationClaimedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInvitationClaimed(
                InvitationClaimedWebhookEvent.builder()
                    .invitation(
                        UmaInvitation.builder()
                            .code("019542f5")
                            .createdAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                            .inviterUma("\$inviter@uma.domain")
                            .status(UmaInvitation.Status.PENDING)
                            .url("https://uma.me/i/019542f5")
                            .amountToSend(
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
                            .claimedAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                            .expiresAt(OffsetDateTime.parse("2025-09-01T14:30:00Z"))
                            .firstName("Jane")
                            .inviteeUma("\$invitee@uma.domain")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(InvitationClaimedWebhookEvent.Type.INVITATION_CLAIMED)
                    .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofKycStatus() {
        val kycStatus =
            KycStatusWebhookEvent.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .kycStatus(KycStatusWebhookEvent.KycStatus.APPROVED)
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(KycStatusWebhookEvent.Type.INCOMING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofKycStatus(kycStatus)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.kycStatus()).isEqualTo(kycStatus)
        assertThat(unwrapWebhookEvent.accountStatus()).isNull()
    }

    @Test
    fun ofKycStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofKycStatus(
                KycStatusWebhookEvent.builder()
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .kycStatus(KycStatusWebhookEvent.KycStatus.APPROVED)
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(KycStatusWebhookEvent.Type.INCOMING_PAYMENT)
                    .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
    }

    @Test
    fun ofAccountStatus() {
        val accountStatus =
            AccountStatusWebhookEvent.builder()
                .accountId("accountId")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(AccountStatusWebhookEvent.Type.INCOMING_PAYMENT)
                .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .newBalance(
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
                .oldBalance(
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
                .platformCustomerId("019542f5-b3e7-1d02-0000-000000000001")
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofAccountStatus(accountStatus)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.kycStatus()).isNull()
        assertThat(unwrapWebhookEvent.accountStatus()).isEqualTo(accountStatus)
    }

    @Test
    fun ofAccountStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofAccountStatus(
                AccountStatusWebhookEvent.builder()
                    .accountId("accountId")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(AccountStatusWebhookEvent.Type.INCOMING_PAYMENT)
                    .webhookId("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .newBalance(
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
                    .oldBalance(
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
                    .platformCustomerId("019542f5-b3e7-1d02-0000-000000000001")
                    .build()
            )

        val roundtrippedUnwrapWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(unwrapWebhookEvent),
                jacksonTypeRef<UnwrapWebhookEvent>(),
            )

        assertThat(roundtrippedUnwrapWebhookEvent).isEqualTo(unwrapWebhookEvent)
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
        val unwrapWebhookEvent =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<UnwrapWebhookEvent>())

        val e = assertThrows<LightsparkGridInvalidDataException> { unwrapWebhookEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
