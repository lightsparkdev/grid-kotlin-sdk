// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.BaseDestination
import com.lightspark.grid.models.quotes.BaseQuoteSource
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.quotes.Quote
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import com.lightspark.grid.models.transactions.BaseTransactionSource
import com.lightspark.grid.models.transactions.IncomingTransaction
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.transferin.BaseTransactionDestination
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentActionListResponseTest {

    @Test
    fun create() {
        val agentActionListResponse =
            AgentActionListResponse.builder()
                .addData(
                    AgentAction.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentAction.Status.PENDING_APPROVAL)
                        .type(AgentAction.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(
                                    QuoteDestinationOneOf.Account.builder()
                                        .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                        .accountId(
                                            "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                        )
                                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
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
                                    QuoteSourceOneOf.Account.builder()
                                        .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
                                .documentIds(
                                    listOf(
                                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                                    )
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SwiftAccount
                                                .builder()
                                                .accountHolderName("Acme Exports Pte Ltd")
                                                .bankName("Chase Bank")
                                                .country("NG")
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SwiftAccount
                                                        .PaymentRail
                                                        .SWIFT
                                                )
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SwiftAccount
                                                        .PaymentRail
                                                        .SWIFT
                                                )
                                                .swiftCode("DEUTDEFF")
                                                .accountNumber("1234567890")
                                                .bankAddress(
                                                    "12 Marina Boulevard, Singapore 018982"
                                                )
                                                .iban("GB29NWBK60161331926819")
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
                                            PaymentInstructions.AccountOrWalletInfo.SparkWallet
                                                .builder()
                                                .address(
                                                    "spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu"
                                                )
                                                .assetType("BTC")
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
                                .platformFeesIncluded(5L)
                                .purposeOfPayment(Quote.PurposeOfPayment.GIFT)
                                .rateDetails(
                                    OutgoingRateDetails.builder()
                                        .counterpartyFixedFee(10L)
                                        .counterpartyMultiplier(1.08)
                                        .gridApiFixedFee(10L)
                                        .gridApiMultiplier(0.925)
                                        .gridApiVariableFeeAmount(30L)
                                        .gridApiVariableFeeRate(0.003)
                                        .build()
                                )
                                .scaChallenge(
                                    Quote.ScaChallenge.builder()
                                        .id("ScaChallenge:019542f5-b3e7-1d02-0000-000000000007")
                                        .addAvailableFactor(
                                            Quote.ScaChallenge.AvailableFactor.SMS_OTP
                                        )
                                        .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                        .factor(Quote.ScaChallenge.Factor.SMS_OTP)
                                        .addPasskeyAllowedOrigin("https://app.example.com")
                                        .passkeyAssertionOptions(
                                            Quote.ScaChallenge.PasskeyAssertionOptions.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .purpose("PAYOUT")
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
                                    IncomingTransaction.Destination.AccountDestination.builder()
                                        .destinationType(
                                            BaseTransactionDestination.DestinationType.ACCOUNT
                                        )
                                        .currency("EUR")
                                        .accountId(
                                            "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                        )
                                        .onChainTransaction(
                                            IncomingTransaction.Destination.AccountDestination
                                                .OnChainTransaction
                                                .builder()
                                                .network(
                                                    IncomingTransaction.Destination
                                                        .AccountDestination
                                                        .OnChainTransaction
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
                                .pendingReason(
                                    IncomingTransaction.PendingReason
                                        .COUNTERPARTY_DECLARATION_REQUIRED
                                )
                                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .receiptDeliveryConfirmedAt(
                                    OffsetDateTime.parse("2025-08-15T14:31:00Z")
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
                                .ruleBasedAccountId(
                                    "InternalAccount:019542f5-b3e7-1d02-0000-000000000011"
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
                                .source(
                                    TransactionSourceOneOf.AccountSource.builder()
                                        .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                                        .currency("USD")
                                        .accountId(
                                            "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                        )
                                        .onChainTransaction(
                                            TransactionSourceOneOf.AccountSource.OnChainTransaction
                                                .builder()
                                                .network(
                                                    TransactionSourceOneOf.AccountSource
                                                        .OnChainTransaction
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
                                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(agentActionListResponse.data())
            .containsExactly(
                AgentAction.builder()
                    .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                    .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                    .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                    .platformCustomerId("user-a1b2c3")
                    .status(AgentAction.Status.PENDING_APPROVAL)
                    .type(AgentAction.Type.EXECUTE_QUOTE)
                    .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                    .quote(
                        Quote.builder()
                            .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                            .destination(
                                QuoteDestinationOneOf.Account.builder()
                                    .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
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
                                QuoteSourceOneOf.Account.builder()
                                    .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
                            .documentIds(
                                listOf(
                                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                                    "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                                )
                            )
                            .addPaymentInstruction(
                                PaymentInstructions.builder()
                                    .accountOrWalletInfo(
                                        PaymentInstructions.AccountOrWalletInfo.SwiftAccount
                                            .builder()
                                            .accountHolderName("Acme Exports Pte Ltd")
                                            .bankName("Chase Bank")
                                            .country("NG")
                                            .addPaymentRail(
                                                PaymentInstructions.AccountOrWalletInfo.SwiftAccount
                                                    .PaymentRail
                                                    .SWIFT
                                            )
                                            .addPaymentRail(
                                                PaymentInstructions.AccountOrWalletInfo.SwiftAccount
                                                    .PaymentRail
                                                    .SWIFT
                                            )
                                            .swiftCode("DEUTDEFF")
                                            .accountNumber("1234567890")
                                            .bankAddress("12 Marina Boulevard, Singapore 018982")
                                            .iban("GB29NWBK60161331926819")
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
                                        PaymentInstructions.AccountOrWalletInfo.SparkWallet
                                            .builder()
                                            .address(
                                                "spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu"
                                            )
                                            .assetType("BTC")
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
                            .platformFeesIncluded(5L)
                            .purposeOfPayment(Quote.PurposeOfPayment.GIFT)
                            .rateDetails(
                                OutgoingRateDetails.builder()
                                    .counterpartyFixedFee(10L)
                                    .counterpartyMultiplier(1.08)
                                    .gridApiFixedFee(10L)
                                    .gridApiMultiplier(0.925)
                                    .gridApiVariableFeeAmount(30L)
                                    .gridApiVariableFeeRate(0.003)
                                    .build()
                            )
                            .scaChallenge(
                                Quote.ScaChallenge.builder()
                                    .id("ScaChallenge:019542f5-b3e7-1d02-0000-000000000007")
                                    .addAvailableFactor(Quote.ScaChallenge.AvailableFactor.SMS_OTP)
                                    .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                    .factor(Quote.ScaChallenge.Factor.SMS_OTP)
                                    .addPasskeyAllowedOrigin("https://app.example.com")
                                    .passkeyAssertionOptions(
                                        Quote.ScaChallenge.PasskeyAssertionOptions.builder()
                                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                                            .build()
                                    )
                                    .purpose("PAYOUT")
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
                                IncomingTransaction.Destination.AccountDestination.builder()
                                    .destinationType(
                                        BaseTransactionDestination.DestinationType.ACCOUNT
                                    )
                                    .currency("EUR")
                                    .accountId(
                                        "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                    )
                                    .onChainTransaction(
                                        IncomingTransaction.Destination.AccountDestination
                                            .OnChainTransaction
                                            .builder()
                                            .network(
                                                IncomingTransaction.Destination.AccountDestination
                                                    .OnChainTransaction
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
                            .pendingReason(
                                IncomingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                            )
                            .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                            .receiptDeliveryConfirmedAt(
                                OffsetDateTime.parse("2025-08-15T14:31:00Z")
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
                            .ruleBasedAccountId(
                                "InternalAccount:019542f5-b3e7-1d02-0000-000000000011"
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
                            .source(
                                TransactionSourceOneOf.AccountSource.builder()
                                    .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                                    .currency("USD")
                                    .accountId(
                                        "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                    )
                                    .onChainTransaction(
                                        TransactionSourceOneOf.AccountSource.OnChainTransaction
                                            .builder()
                                            .network(
                                                TransactionSourceOneOf.AccountSource
                                                    .OnChainTransaction
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
                            .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(agentActionListResponse.hasMore()).isEqualTo(true)
        assertThat(agentActionListResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(agentActionListResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentActionListResponse =
            AgentActionListResponse.builder()
                .addData(
                    AgentAction.builder()
                        .id("AgentAction:019542f5-b3e7-1d02-0000-000000000099")
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
                        .createdAt(OffsetDateTime.parse("2025-10-03T15:00:00Z"))
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000010")
                        .platformCustomerId("user-a1b2c3")
                        .status(AgentAction.Status.PENDING_APPROVAL)
                        .type(AgentAction.Type.EXECUTE_QUOTE)
                        .updatedAt(OffsetDateTime.parse("2025-10-03T15:02:00Z"))
                        .quote(
                            Quote.builder()
                                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                                .destination(
                                    QuoteDestinationOneOf.Account.builder()
                                        .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                        .accountId(
                                            "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                        )
                                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
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
                                    QuoteSourceOneOf.Account.builder()
                                        .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
                                .documentIds(
                                    listOf(
                                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                                    )
                                )
                                .addPaymentInstruction(
                                    PaymentInstructions.builder()
                                        .accountOrWalletInfo(
                                            PaymentInstructions.AccountOrWalletInfo.SwiftAccount
                                                .builder()
                                                .accountHolderName("Acme Exports Pte Ltd")
                                                .bankName("Chase Bank")
                                                .country("NG")
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SwiftAccount
                                                        .PaymentRail
                                                        .SWIFT
                                                )
                                                .addPaymentRail(
                                                    PaymentInstructions.AccountOrWalletInfo
                                                        .SwiftAccount
                                                        .PaymentRail
                                                        .SWIFT
                                                )
                                                .swiftCode("DEUTDEFF")
                                                .accountNumber("1234567890")
                                                .bankAddress(
                                                    "12 Marina Boulevard, Singapore 018982"
                                                )
                                                .iban("GB29NWBK60161331926819")
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
                                            PaymentInstructions.AccountOrWalletInfo.SparkWallet
                                                .builder()
                                                .address(
                                                    "spark1pgssyuuuhnrrdjswal5c3s3rafw9w3y5dd4cjy3duxlf7hjzkp0rqx6dj6mrhu"
                                                )
                                                .assetType("BTC")
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
                                .platformFeesIncluded(5L)
                                .purposeOfPayment(Quote.PurposeOfPayment.GIFT)
                                .rateDetails(
                                    OutgoingRateDetails.builder()
                                        .counterpartyFixedFee(10L)
                                        .counterpartyMultiplier(1.08)
                                        .gridApiFixedFee(10L)
                                        .gridApiMultiplier(0.925)
                                        .gridApiVariableFeeAmount(30L)
                                        .gridApiVariableFeeRate(0.003)
                                        .build()
                                )
                                .scaChallenge(
                                    Quote.ScaChallenge.builder()
                                        .id("ScaChallenge:019542f5-b3e7-1d02-0000-000000000007")
                                        .addAvailableFactor(
                                            Quote.ScaChallenge.AvailableFactor.SMS_OTP
                                        )
                                        .expiresAt(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
                                        .factor(Quote.ScaChallenge.Factor.SMS_OTP)
                                        .addPasskeyAllowedOrigin("https://app.example.com")
                                        .passkeyAssertionOptions(
                                            Quote.ScaChallenge.PasskeyAssertionOptions.builder()
                                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                                .build()
                                        )
                                        .purpose("PAYOUT")
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
                                    IncomingTransaction.Destination.AccountDestination.builder()
                                        .destinationType(
                                            BaseTransactionDestination.DestinationType.ACCOUNT
                                        )
                                        .currency("EUR")
                                        .accountId(
                                            "ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123"
                                        )
                                        .onChainTransaction(
                                            IncomingTransaction.Destination.AccountDestination
                                                .OnChainTransaction
                                                .builder()
                                                .network(
                                                    IncomingTransaction.Destination
                                                        .AccountDestination
                                                        .OnChainTransaction
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
                                .pendingReason(
                                    IncomingTransaction.PendingReason
                                        .COUNTERPARTY_DECLARATION_REQUIRED
                                )
                                .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                                .receiptDeliveryConfirmedAt(
                                    OffsetDateTime.parse("2025-08-15T14:31:00Z")
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
                                .ruleBasedAccountId(
                                    "InternalAccount:019542f5-b3e7-1d02-0000-000000000011"
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
                                .source(
                                    TransactionSourceOneOf.AccountSource.builder()
                                        .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                                        .currency("USD")
                                        .accountId(
                                            "InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965"
                                        )
                                        .onChainTransaction(
                                            TransactionSourceOneOf.AccountSource.OnChainTransaction
                                                .builder()
                                                .network(
                                                    TransactionSourceOneOf.AccountSource
                                                        .OnChainTransaction
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
                                .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .build()
                        )
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedAgentActionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentActionListResponse),
                jacksonTypeRef<AgentActionListResponse>(),
            )

        assertThat(roundtrippedAgentActionListResponse).isEqualTo(agentActionListResponse)
    }
}
