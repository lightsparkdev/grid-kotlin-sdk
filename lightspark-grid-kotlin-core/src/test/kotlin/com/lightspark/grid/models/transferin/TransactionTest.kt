// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.errors.LightsparkGridInvalidDataException
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.OutgoingTransaction
import com.lightspark.grid.models.transactions.IncomingTransaction
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
                .destination(
                    OutgoingTransaction.Destination.Account.builder()
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .destinationType(
                            OutgoingTransaction.Destination.Account.DestinationType.ACCOUNT
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
                    TransactionSourceOneOf.Account.builder()
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                        .build()
                )
                .status(OutgoingTransaction.Status.PENDING)
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
                    .destination(
                        OutgoingTransaction.Destination.Account.builder()
                            .currency("EUR")
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .destinationType(
                                OutgoingTransaction.Destination.Account.DestinationType.ACCOUNT
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
                        TransactionSourceOneOf.Account.builder()
                            .currency("USD")
                            .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .sourceType(TransactionSourceOneOf.Account.SourceType.ACCOUNT)
                            .build()
                    )
                    .status(OutgoingTransaction.Status.PENDING)
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
