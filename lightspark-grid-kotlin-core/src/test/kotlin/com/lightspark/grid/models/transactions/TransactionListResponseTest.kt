// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.transferin.Transaction
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class TransactionListResponseTest {

    @Test
    fun ofIncomingTransaction() {
        val incomingTransaction =
            IncomingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(
                    Transaction.Destination.Account.builder()
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .destinationType(Transaction.Destination.Account.DestinationType.ACCOUNT)
                        .build()
                )
                .platformCustomerId("18d3e5f7b4a9c2")
                .status(TransactionStatus.CREATED)
                .type(TransactionType.INCOMING)
                .counterpartyInformation(
                    Transaction.CounterpartyInformation.builder()
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

        val transactionListResponse =
            TransactionListResponse.ofIncomingTransaction(incomingTransaction)

        assertThat(transactionListResponse.incomingTransaction()).isEqualTo(incomingTransaction)
        assertThat(transactionListResponse.outgoingTransaction()).isNull()
    }

    @Test
    fun ofIncomingTransactionRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionListResponse =
            TransactionListResponse.ofIncomingTransaction(
                IncomingTransaction.builder()
                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .destination(
                        Transaction.Destination.Account.builder()
                            .currency("EUR")
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .destinationType(
                                Transaction.Destination.Account.DestinationType.ACCOUNT
                            )
                            .build()
                    )
                    .platformCustomerId("18d3e5f7b4a9c2")
                    .status(TransactionStatus.CREATED)
                    .type(TransactionType.INCOMING)
                    .counterpartyInformation(
                        Transaction.CounterpartyInformation.builder()
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

        val roundtrippedTransactionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListResponse),
                jacksonTypeRef<TransactionListResponse>(),
            )

        assertThat(roundtrippedTransactionListResponse).isEqualTo(transactionListResponse)
    }

    @Test
    fun ofOutgoingTransaction() {
        val outgoingTransaction =
            TransactionListResponse.OutgoingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(
                    Transaction.Destination.Account.builder()
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .destinationType(Transaction.Destination.Account.DestinationType.ACCOUNT)
                        .build()
                )
                .platformCustomerId("18d3e5f7b4a9c2")
                .status(TransactionStatus.PENDING)
                .type(TransactionType.OUTGOING)
                .counterpartyInformation(
                    Transaction.CounterpartyInformation.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                .description("Payment for invoice #1234")
                .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
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
                    TransactionListResponse.OutgoingTransaction.FailureReason.QUOTE_EXPIRED
                )
                .fees(10L)
                .addPaymentInstruction(
                    PaymentInstructions.builder()
                        .accountOrWalletInfo(
                            PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                .accountNumber("1234567890")
                                .addPaymentRail(
                                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.PaymentRail
                                        .ACH
                                )
                                .addPaymentRail(
                                    PaymentInstructions.AccountOrWalletInfo.UsdAccount.PaymentRail
                                        .WIRE
                                )
                                .reference("UMA-Q12345-REF")
                                .routingNumber("021000021")
                                .build()
                        )
                        .instructionsNotes("Include reference UMA-Q12345-REF in memo")
                        .isPlatformAccount(true)
                        .build()
                )
                .addPaymentInstruction(
                    PaymentInstructions.builder()
                        .accountOrWalletInfo(
                            PaymentInstructions.AccountOrWalletInfo.PaymentSparkWalletInfo.builder()
                                .address(
                                    "spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu"
                                )
                                .assetType(
                                    PaymentInstructions.AccountOrWalletInfo.PaymentSparkWalletInfo
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
                    TransactionListResponse.OutgoingTransaction.Refund.builder()
                        .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .reference("UMA-Q12345-REFUND")
                        .status(TransactionListResponse.OutgoingTransaction.Refund.Status.COMPLETED)
                        .reason(
                            TransactionListResponse.OutgoingTransaction.Refund.Reason
                                .TRANSACTION_FAILED
                        )
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                        .build()
                )
                .build()

        val transactionListResponse =
            TransactionListResponse.ofOutgoingTransaction(outgoingTransaction)

        assertThat(transactionListResponse.incomingTransaction()).isNull()
        assertThat(transactionListResponse.outgoingTransaction()).isEqualTo(outgoingTransaction)
    }

    @Test
    fun ofOutgoingTransactionRoundtrip() {
        val jsonMapper = jsonMapper()
        val transactionListResponse =
            TransactionListResponse.ofOutgoingTransaction(
                TransactionListResponse.OutgoingTransaction.builder()
                    .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .destination(
                        Transaction.Destination.Account.builder()
                            .currency("EUR")
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .destinationType(
                                Transaction.Destination.Account.DestinationType.ACCOUNT
                            )
                            .build()
                    )
                    .platformCustomerId("18d3e5f7b4a9c2")
                    .status(TransactionStatus.PENDING)
                    .type(TransactionType.OUTGOING)
                    .counterpartyInformation(
                        Transaction.CounterpartyInformation.builder()
                            .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                            .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                            .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
                    .description("Payment for invoice #1234")
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
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
                        TransactionListResponse.OutgoingTransaction.FailureReason.QUOTE_EXPIRED
                    )
                    .fees(10L)
                    .addPaymentInstruction(
                        PaymentInstructions.builder()
                            .accountOrWalletInfo(
                                PaymentInstructions.AccountOrWalletInfo.UsdAccount.builder()
                                    .accountNumber("1234567890")
                                    .addPaymentRail(
                                        PaymentInstructions.AccountOrWalletInfo.UsdAccount
                                            .PaymentRail
                                            .ACH
                                    )
                                    .addPaymentRail(
                                        PaymentInstructions.AccountOrWalletInfo.UsdAccount
                                            .PaymentRail
                                            .WIRE
                                    )
                                    .reference("UMA-Q12345-REF")
                                    .routingNumber("021000021")
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
                        TransactionListResponse.OutgoingTransaction.Refund.builder()
                            .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .reference("UMA-Q12345-REFUND")
                            .status(
                                TransactionListResponse.OutgoingTransaction.Refund.Status.COMPLETED
                            )
                            .reason(
                                TransactionListResponse.OutgoingTransaction.Refund.Reason
                                    .TRANSACTION_FAILED
                            )
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                            .build()
                    )
                    .build()
            )

        val roundtrippedTransactionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionListResponse),
                jacksonTypeRef<TransactionListResponse>(),
            )

        assertThat(roundtrippedTransactionListResponse).isEqualTo(transactionListResponse)
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
        val transactionListResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<TransactionListResponse>())

        val e =
            assertThrows<LightsparkGridInvalidDataException> { transactionListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
