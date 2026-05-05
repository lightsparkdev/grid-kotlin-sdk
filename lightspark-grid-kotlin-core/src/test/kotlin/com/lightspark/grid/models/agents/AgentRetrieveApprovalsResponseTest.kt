// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import com.lightspark.grid.models.transactions.IncomingRateDetails
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveApprovalsResponseTest {

    @Test
    fun create() {
        val agentRetrieveApprovalsResponse =
            AgentRetrieveApprovalsResponse.builder()
                .addData(
                    AgentRetrieveApprovalsResponse.Data.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentRetrieveApprovalsResponse.Data.Status.PENDING_APPROVAL)
                        .type(AgentRetrieveApprovalsResponse.Data.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(
                                    QuoteDestinationOneOf.AccountDestination.builder()
                                        .accountId(
                                            "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                        )
                                        .paymentRail(
                                            QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH
                                        )
                                        .build()
                                )
                                .exchangeRate(1.0)
                                .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                .feesIncluded(10L)
                                .receivingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .sendingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .source(
                                    QuoteSourceOneOf.AccountQuoteSource.builder()
                                        .accountId(
                                            "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                        )
                                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                        .build()
                                )
                                .status(Quote.Status.PENDING)
                                .totalReceivingAmount(1000L)
                                .totalSendingAmount(123010L)
                                .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                                .counterpartyInformation(
                                    Quote.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.UsdAccount
                                                .builder()
                                                .accountNumber("1234567890")
                                                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                                .addPaymentRail(UsdAccountInfo.PaymentRail.WIRE)
                                                .routingNumber("021000021")
                                                .reference("UMA-Q12345-REF")
                                                .build()
                                        )
                                        .instructionsNotes(
                                            "Include reference UMA-Q12345-REF in memo"
                                        )
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
                                .build()
                        )
                        .rejectionReason(
                            "Transaction amount exceeds customer's current risk limit."
                        )
                        .transaction(
                            IncomingTransaction.builder()
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
                                .build()
                        )
                        .transferDetails(
                            AgentRetrieveApprovalsResponse.Data.TransferDetails.builder()
                                .amount(50000L)
                                .currency("USD")
                                .destinationAccountId(
                                    "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                )
                                .sourceAccountId(
                                    "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                )
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(agentRetrieveApprovalsResponse.data())
            .containsExactly(
                AgentRetrieveApprovalsResponse.Data.builder()
                    .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                    .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                    .platformCustomerId("user-a1b2c3")
                    .status(AgentRetrieveApprovalsResponse.Data.Status.PENDING_APPROVAL)
                    .type(AgentRetrieveApprovalsResponse.Data.Type.EXECUTE_QUOTE)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                    .quote(
                        Quote.builder()
                            .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .destination(
                                QuoteDestinationOneOf.AccountDestination.builder()
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .paymentRail(
                                        QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH
                                    )
                                    .build()
                            )
                            .exchangeRate(1.0)
                            .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                            .feesIncluded(10L)
                            .receivingCurrency(
                                Currency.builder()
                                    .code("USD")
                                    .decimals(2L)
                                    .name("United States Dollar")
                                    .symbol("\$")
                                    .build()
                            )
                            .sendingCurrency(
                                Currency.builder()
                                    .code("USD")
                                    .decimals(2L)
                                    .name("United States Dollar")
                                    .symbol("\$")
                                    .build()
                            )
                            .source(
                                QuoteSourceOneOf.AccountQuoteSource.builder()
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                    .build()
                            )
                            .status(Quote.Status.PENDING)
                            .totalReceivingAmount(1000L)
                            .totalSendingAmount(123010L)
                            .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                            .counterpartyInformation(
                                Quote.CounterpartyInformation.builder()
                                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                    .build()
                            )
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
                            .build()
                    )
                    .rejectionReason("Transaction amount exceeds customer's current risk limit.")
                    .transaction(
                        IncomingTransaction.builder()
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
                            .build()
                    )
                    .transferDetails(
                        AgentRetrieveApprovalsResponse.Data.TransferDetails.builder()
                            .amount(50000L)
                            .currency("USD")
                            .destinationAccountId(
                                "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                            )
                            .sourceAccountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .build()
            )
        assertThat(agentRetrieveApprovalsResponse.hasMore()).isEqualTo(true)
        assertThat(agentRetrieveApprovalsResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(agentRetrieveApprovalsResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentRetrieveApprovalsResponse =
            AgentRetrieveApprovalsResponse.builder()
                .addData(
                    AgentRetrieveApprovalsResponse.Data.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentRetrieveApprovalsResponse.Data.Status.PENDING_APPROVAL)
                        .type(AgentRetrieveApprovalsResponse.Data.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(
                                    QuoteDestinationOneOf.AccountDestination.builder()
                                        .accountId(
                                            "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                        )
                                        .paymentRail(
                                            QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH
                                        )
                                        .build()
                                )
                                .exchangeRate(1.0)
                                .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                .feesIncluded(10L)
                                .receivingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .sendingCurrency(
                                    Currency.builder()
                                        .code("USD")
                                        .decimals(2L)
                                        .name("United States Dollar")
                                        .symbol("\$")
                                        .build()
                                )
                                .source(
                                    QuoteSourceOneOf.AccountQuoteSource.builder()
                                        .accountId(
                                            "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                        )
                                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                                        .build()
                                )
                                .status(Quote.Status.PENDING)
                                .totalReceivingAmount(1000L)
                                .totalSendingAmount(123010L)
                                .transactionId("Transaction:019542f5-b3e7-1d02-0000-000000000005")
                                .counterpartyInformation(
                                    Quote.CounterpartyInformation.builder()
                                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                                        .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                                        .build()
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.UsdAccount
                                                .builder()
                                                .accountNumber("1234567890")
                                                .accountType(UsdAccountInfo.AccountType.USD_ACCOUNT)
                                                .addPaymentRail(UsdAccountInfo.PaymentRail.ACH)
                                                .addPaymentRail(UsdAccountInfo.PaymentRail.WIRE)
                                                .routingNumber("021000021")
                                                .reference("UMA-Q12345-REF")
                                                .build()
                                        )
                                        .instructionsNotes(
                                            "Include reference UMA-Q12345-REF in memo"
                                        )
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
                                .build()
                        )
                        .rejectionReason(
                            "Transaction amount exceeds customer's current risk limit."
                        )
                        .transaction(
                            IncomingTransaction.builder()
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
                                .build()
                        )
                        .transferDetails(
                            AgentRetrieveApprovalsResponse.Data.TransferDetails.builder()
                                .amount(50000L)
                                .currency("USD")
                                .destinationAccountId(
                                    "ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                )
                                .sourceAccountId(
                                    "InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                )
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedAgentRetrieveApprovalsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentRetrieveApprovalsResponse),
                jacksonTypeRef<AgentRetrieveApprovalsResponse>(),
            )

        assertThat(roundtrippedAgentRetrieveApprovalsResponse)
            .isEqualTo(agentRetrieveApprovalsResponse)
    }
}
