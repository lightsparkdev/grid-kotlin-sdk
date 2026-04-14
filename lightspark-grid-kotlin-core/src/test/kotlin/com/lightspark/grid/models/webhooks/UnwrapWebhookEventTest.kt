// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.BulkCustomerImportErrorEntry
import com.lightspark.grid.models.VerificationError
import com.lightspark.grid.models.config.CustomerInfoFieldName
import com.lightspark.grid.models.customers.CustomerOneOf
import com.lightspark.grid.models.customers.IndividualCustomerFields
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.invitations.UmaInvitation
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.receiver.CounterpartyFieldDefinition
import com.lightspark.grid.models.sandbox.internalaccounts.InternalAccount
import com.lightspark.grid.models.transactions.IncomingRateDetails
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transactions.OutgoingTransactionStatus
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import java.time.LocalDate
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
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    IncomingPaymentWebhookEvent.Data.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(
                            IncomingTransaction.Destination.AccountTransactionDestination.builder()
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
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
                            IncomingRateDetails.builder()
                                .gridApiFixedFee(10L)
                                .gridApiMultiplier(0.925)
                                .gridApiVariableFeeAmount(30.0)
                                .gridApiVariableFeeRate(0.003)
                                .build()
                        )
                        .reconciliationInstructions(
                            ReconciliationInstructions.builder().reference("UMA-Q12345-REF").build()
                        )
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .source(
                            TransactionSourceOneOf.AccountTransactionSource.builder()
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .addRequestedReceiverCustomerInfoField(
                            CounterpartyFieldDefinition.builder()
                                .mandatory(true)
                                .name(CustomerInfoFieldName.FULL_NAME)
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofIncomingPayment(incomingPayment)

        assertThat(unwrapWebhookEvent.incomingPayment()).isEqualTo(incomingPayment)
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofIncomingPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofIncomingPayment(
                IncomingPaymentWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        IncomingPaymentWebhookEvent.Data.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(
                                IncomingTransaction.Destination.AccountTransactionDestination
                                    .builder()
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
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
                                IncomingRateDetails.builder()
                                    .gridApiFixedFee(10L)
                                    .gridApiMultiplier(0.925)
                                    .gridApiVariableFeeAmount(30.0)
                                    .gridApiVariableFeeRate(0.003)
                                    .build()
                            )
                            .reconciliationInstructions(
                                ReconciliationInstructions.builder()
                                    .reference("UMA-Q12345-REF")
                                    .build()
                            )
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .source(
                                TransactionSourceOneOf.AccountTransactionSource.builder()
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .addRequestedReceiverCustomerInfoField(
                                CounterpartyFieldDefinition.builder()
                                    .mandatory(true)
                                    .name(CustomerInfoFieldName.FULL_NAME)
                                    .build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(IncomingPaymentWebhookEvent.Type.INCOMING_PAYMENT_PENDING)
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
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    OutgoingTransaction.builder()
                        .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .destination(
                            OutgoingTransaction.Destination.AccountTransactionDestination.builder()
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
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
                        .source(
                            TransactionSourceOneOf.AccountTransactionSource.builder()
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .status(OutgoingTransactionStatus.PENDING)
                        .type(OutgoingTransaction.Type.OUTGOING)
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
                                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                        .accountNumber("1234567890")
                                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                        .addPaymentRail(UsdAccountInfo.PaymentRail.WIRE)
                                        .routingNumber("021000021")
                                        .reference("UMA-Q12345-REF")
                                        .build()
                                )
                                .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                                .isPlatformAccount(true)
                                .build()
                        )
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.PaymentSparkWalletInfo
                                        .builder()
                                        .address(
                                            "spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu"
                                        )
                                        .assetType(
                                            PaymentInstructions.AccountOrWalletInfo
                                                .PaymentSparkWalletInfo
                                                .AssetType
                                                .BTC
                                        )
                                        .invoice(
                                            "lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs"
                                        )
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
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofOutgoingPayment(outgoingPayment)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isEqualTo(outgoingPayment)
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofOutgoingPaymentRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofOutgoingPayment(
                OutgoingPaymentWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        OutgoingTransaction.builder()
                            .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .destination(
                                OutgoingTransaction.Destination.AccountTransactionDestination
                                    .builder()
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .build()
                            )
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
                            .source(
                                TransactionSourceOneOf.AccountTransactionSource.builder()
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .build()
                            )
                            .status(OutgoingTransactionStatus.PENDING)
                            .type(OutgoingTransaction.Type.OUTGOING)
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
                                        PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                            .accountNumber("1234567890")
                                            .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                            .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                            .addPaymentRail(UsdAccountInfo.PaymentRail.WIRE)
                                            .routingNumber("021000021")
                                            .reference("UMA-Q12345-REF")
                                            .build()
                                    )
                                    .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                                    .isPlatformAccount(true)
                                    .build()
                            )
                            .addPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo
                                            .PaymentSparkWalletInfo
                                            .builder()
                                            .address(
                                                "spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu"
                                            )
                                            .assetType(
                                                PaymentInstructions.AccountOrWalletInfo
                                                    .PaymentSparkWalletInfo
                                                    .AssetType
                                                    .BTC
                                            )
                                            .invoice(
                                                "lnbc15u1p3xnhl2pp5jptserfk3zk4qy42tlucycrfwxhydvlemu9pqr93tuzlv9cc7g3sdqsvfhkcap3xyhx7un8cqzpgxqzjcsp5f8c52y2stc300gl6s4xswtjpc37hrnnr3c9wvtgjfuvqmpm35evq9qyyssqy4lgd8tj637qcjp05rdpxxykjenthxftej7a2zzmwrmrl70fyj9hvj0rewhzj7jfyuwkwcg9g2jpwtk3wkjtwnkdks84hsnu8xps5vsq4gj5hs"
                                            )
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
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
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
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(TestWebhookWebhookEvent.Type.TEST)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofTestWebhook(testWebhook)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isEqualTo(testWebhook)
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofTestWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofTestWebhook(
                TestWebhookWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(TestWebhookWebhookEvent.Type.TEST)
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
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    BulkUploadWebhookEvent.Data.builder()
                        .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                        .progress(
                            BulkUploadWebhookEvent.Data.Progress.builder()
                                .failed(50L)
                                .processed(2500L)
                                .successful(2450L)
                                .total(5000L)
                                .build()
                        )
                        .status(BulkUploadWebhookEvent.Data.Status.PROCESSING)
                        .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                        .addError(
                            BulkCustomerImportErrorEntry.builder()
                                .correlationId("biz456")
                                .code("code")
                                .details(
                                    BulkCustomerImportErrorEntry.Details.builder()
                                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                                        .build()
                                )
                                .message("message")
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD_COMPLETED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofBulkUpload(bulkUpload)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isEqualTo(bulkUpload)
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofBulkUploadRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofBulkUpload(
                BulkUploadWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        BulkUploadWebhookEvent.Data.builder()
                            .id("Job:019542f5-b3e7-1d02-0000-000000000006")
                            .progress(
                                BulkUploadWebhookEvent.Data.Progress.builder()
                                    .failed(50L)
                                    .processed(2500L)
                                    .successful(2450L)
                                    .total(5000L)
                                    .build()
                            )
                            .status(BulkUploadWebhookEvent.Data.Status.PROCESSING)
                            .completedAt(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                            .addError(
                                BulkCustomerImportErrorEntry.builder()
                                    .correlationId("biz456")
                                    .code("code")
                                    .details(
                                        BulkCustomerImportErrorEntry.Details.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .message("message")
                                    .build()
                            )
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(BulkUploadWebhookEvent.Type.BULK_UPLOAD_COMPLETED)
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
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
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
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofInvitationClaimed(invitationClaimed)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isEqualTo(invitationClaimed)
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofInvitationClaimedRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInvitationClaimed(
                InvitationClaimedWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
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
    fun ofCustomerUpdate() {
        val customerUpdate =
            CustomerUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    CustomerOneOf.Individual.builder()
                        .platformCustomerId("9f84e0c2a72c4fa")
                        .umaAddress("\$john.doe@uma.domain.com")
                        .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .addCurrency("USD")
                        .addCurrency("USDC")
                        .isDeleted(false)
                        .region("US")
                        .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                        .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
                        .address(
                            Address.builder()
                                .country("US")
                                .line1("123 Main Street")
                                .postalCode("94105")
                                .city("San Francisco")
                                .line2("Apt 4B")
                                .state("CA")
                                .build()
                        )
                        .birthDate(LocalDate.parse("1990-01-15"))
                        .fullName("John Michael Doe")
                        .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                        .nationality("US")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofCustomerUpdate(customerUpdate)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isEqualTo(customerUpdate)
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofCustomerUpdateRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofCustomerUpdate(
                CustomerUpdateWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        CustomerOneOf.Individual.builder()
                            .platformCustomerId("9f84e0c2a72c4fa")
                            .umaAddress("\$john.doe@uma.domain.com")
                            .id("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                            .addCurrency("USD")
                            .addCurrency("USDC")
                            .isDeleted(false)
                            .region("US")
                            .updatedAt(OffsetDateTime.parse("2025-07-21T17:32:28Z"))
                            .customerType(IndividualCustomerFields.CustomerType.INDIVIDUAL)
                            .address(
                                Address.builder()
                                    .country("US")
                                    .line1("123 Main Street")
                                    .postalCode("94105")
                                    .city("San Francisco")
                                    .line2("Apt 4B")
                                    .state("CA")
                                    .build()
                            )
                            .birthDate(LocalDate.parse("1990-01-15"))
                            .fullName("John Michael Doe")
                            .kycStatus(IndividualCustomerFields.KycStatus.APPROVED)
                            .nationality("US")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(CustomerUpdateWebhookEvent.Type.CUSTOMER_KYC_APPROVED)
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
    fun ofInternalAccountStatus() {
        val internalAccountStatus =
            InternalAccountStatusWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
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
                                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                        .accountNumber("x")
                                        .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                        .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                        .routingNumber("021000021")
                                        .reference("UMA-Q12345-REF")
                                        .build()
                                )
                                .instructionsNotes(
                                    "Please ensure the reference code is included in the payment memo/description field"
                                )
                                .isPlatformAccount(true)
                                .build()
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofInternalAccountStatus(internalAccountStatus)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isEqualTo(internalAccountStatus)
        assertThat(unwrapWebhookEvent.verificationUpdate()).isNull()
    }

    @Test
    fun ofInternalAccountStatusRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofInternalAccountStatus(
                InternalAccountStatusWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
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
                                        PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                            .accountNumber("x")
                                            .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                            .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                            .routingNumber("021000021")
                                            .reference("UMA-Q12345-REF")
                                            .build()
                                    )
                                    .instructionsNotes(
                                        "Please ensure the reference code is included in the payment memo/description field"
                                    )
                                    .isPlatformAccount(true)
                                    .build()
                            )
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:30:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(InternalAccountStatusWebhookEvent.Type.INTERNAL_ACCOUNT_BALANCE_UPDATED)
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
    fun ofVerificationUpdate() {
        val verificationUpdate =
            VerificationUpdateWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
                    VerificationUpdateWebhookEvent.Data.builder()
                        .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .addError(
                            VerificationError.builder()
                                .reason("Business address line 1 is required")
                                .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                .type(VerificationError.Type.MISSING_FIELD)
                                .addAcceptedDocumentType(
                                    VerificationError.AcceptedDocumentType.PASSPORT
                                )
                                .field("customer.address.line1")
                                .build()
                        )
                        .verificationStatus(
                            VerificationUpdateWebhookEvent.Data.VerificationStatus.RESOLVE_ERRORS
                        )
                        .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
                .build()

        val unwrapWebhookEvent = UnwrapWebhookEvent.ofVerificationUpdate(verificationUpdate)

        assertThat(unwrapWebhookEvent.incomingPayment()).isNull()
        assertThat(unwrapWebhookEvent.outgoingPayment()).isNull()
        assertThat(unwrapWebhookEvent.testWebhook()).isNull()
        assertThat(unwrapWebhookEvent.bulkUpload()).isNull()
        assertThat(unwrapWebhookEvent.invitationClaimed()).isNull()
        assertThat(unwrapWebhookEvent.customerUpdate()).isNull()
        assertThat(unwrapWebhookEvent.internalAccountStatus()).isNull()
        assertThat(unwrapWebhookEvent.verificationUpdate()).isEqualTo(verificationUpdate)
    }

    @Test
    fun ofVerificationUpdateRoundtrip() {
        val jsonMapper = jsonMapper()
        val unwrapWebhookEvent =
            UnwrapWebhookEvent.ofVerificationUpdate(
                VerificationUpdateWebhookEvent.builder()
                    .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                    .data(
                        VerificationUpdateWebhookEvent.Data.builder()
                            .id("Verification:019542f5-b3e7-1d02-0000-000000000001")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                            .addError(
                                VerificationError.builder()
                                    .reason("Business address line 1 is required")
                                    .resourceId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .type(VerificationError.Type.MISSING_FIELD)
                                    .addAcceptedDocumentType(
                                        VerificationError.AcceptedDocumentType.PASSPORT
                                    )
                                    .field("customer.address.line1")
                                    .build()
                            )
                            .verificationStatus(
                                VerificationUpdateWebhookEvent.Data.VerificationStatus
                                    .RESOLVE_ERRORS
                            )
                            .updatedAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .build()
                    )
                    .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                    .type(VerificationUpdateWebhookEvent.Type.VERIFICATION_APPROVED)
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
