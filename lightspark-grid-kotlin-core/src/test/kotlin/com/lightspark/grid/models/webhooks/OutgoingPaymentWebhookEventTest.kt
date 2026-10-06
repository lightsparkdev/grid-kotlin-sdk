// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import com.lightspark.grid.models.transactions.OutgoingTransaction
import com.lightspark.grid.models.transactions.ReconciliationInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutgoingPaymentWebhookEventTest {

    @Test
    fun create() {
        val outgoingPaymentWebhookEvent =
            OutgoingPaymentWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
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
                                .onChainTransaction(
                                    OutgoingTransaction.Destination.Account.OnChainTransaction
                                        .builder()
                                        .network(
                                            OutgoingTransaction.Destination.Account
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
                        .direction(OutgoingTransaction.Direction.CREDIT)
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
                                .onChainTransaction(
                                    TransactionSourceOneOf.Account.OnChainTransaction.builder()
                                        .network(
                                            TransactionSourceOneOf.Account.OnChainTransaction
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
                        .status(OutgoingTransaction.Status.PENDING)
                        .type(OutgoingTransaction.Type.OUTGOING)
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
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
                        .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
                        .fees(10L)
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SwiftAccount.builder()
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
                                    PaymentInstructions.AccountOrWalletInfo.SparkWallet.builder()
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
                        .paymentRail(OutgoingTransaction.PaymentRail.ACH)
                        .pendingReason(
                            OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                        )
                        .platformFees(5L)
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .railSelectionMode(OutgoingTransaction.RailSelectionMode.AUTO)
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
                            Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(Refund.Status.COMPLETED)
                                .reason(Refund.Reason.TRANSACTION_FAILED)
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .ruleBasedAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .settlementTimelineSeconds(0L)
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
                .build()

        assertThat(outgoingPaymentWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(outgoingPaymentWebhookEvent.data())
            .isEqualTo(
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
                            .onChainTransaction(
                                OutgoingTransaction.Destination.Account.OnChainTransaction.builder()
                                    .network(
                                        OutgoingTransaction.Destination.Account.OnChainTransaction
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
                    .direction(OutgoingTransaction.Direction.CREDIT)
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
                            .onChainTransaction(
                                TransactionSourceOneOf.Account.OnChainTransaction.builder()
                                    .network(
                                        TransactionSourceOneOf.Account.OnChainTransaction.Network
                                            .SOLANA
                                    )
                                    .transactionHash(
                                        "h82pJGF9p7kpzb6eU326EFZf2cDnimbTFVeJtx1qtBmUNJAEqN76R7PwPfHt3oWb8R6cKvhgyxQdDn53jFrK6wFx"
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .status(OutgoingTransaction.Status.PENDING)
                    .type(OutgoingTransaction.Type.OUTGOING)
                    .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
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
                    .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
                    .fees(10L)
                    .addPaymentInstruction(
                        PaymentInstructions.builder()
                            .accountOrWalletInfo(
                                PaymentInstructions.AccountOrWalletInfo.SwiftAccount.builder()
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
                                PaymentInstructions.AccountOrWalletInfo.SparkWallet.builder()
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
                    .paymentRail(OutgoingTransaction.PaymentRail.ACH)
                    .pendingReason(
                        OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                    )
                    .platformFees(5L)
                    .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                    .railSelectionMode(OutgoingTransaction.RailSelectionMode.AUTO)
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
                        Refund.builder()
                            .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .reference("UMA-Q12345-REFUND")
                            .status(Refund.Status.COMPLETED)
                            .reason(Refund.Reason.TRANSACTION_FAILED)
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                            .build()
                    )
                    .ruleBasedAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .settlementTimelineSeconds(0L)
                    .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .build()
            )
        assertThat(outgoingPaymentWebhookEvent.timestamp())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
        assertThat(outgoingPaymentWebhookEvent.type())
            .isEqualTo(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outgoingPaymentWebhookEvent =
            OutgoingPaymentWebhookEvent.builder()
                .id("Webhook:019542f5-b3e7-1d02-0000-000000000007")
                .data(
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
                                .onChainTransaction(
                                    OutgoingTransaction.Destination.Account.OnChainTransaction
                                        .builder()
                                        .network(
                                            OutgoingTransaction.Destination.Account
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
                        .direction(OutgoingTransaction.Direction.CREDIT)
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
                                .onChainTransaction(
                                    TransactionSourceOneOf.Account.OnChainTransaction.builder()
                                        .network(
                                            TransactionSourceOneOf.Account.OnChainTransaction
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
                        .status(OutgoingTransaction.Status.PENDING)
                        .type(OutgoingTransaction.Type.OUTGOING)
                        .agentId("Agent:019542f5-b3e7-1d02-0000-000000000042")
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
                        .expectedSettlementAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .failureReason(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
                        .fees(10L)
                        .addPaymentInstruction(
                            PaymentInstructions.builder()
                                .accountOrWalletInfo(
                                    PaymentInstructions.AccountOrWalletInfo.SwiftAccount.builder()
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
                                    PaymentInstructions.AccountOrWalletInfo.SparkWallet.builder()
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
                        .paymentRail(OutgoingTransaction.PaymentRail.ACH)
                        .pendingReason(
                            OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED
                        )
                        .platformFees(5L)
                        .quoteId("Quote:019542f5-b3e7-1d02-0000-000000000006")
                        .railSelectionMode(OutgoingTransaction.RailSelectionMode.AUTO)
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
                            Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(Refund.Status.COMPLETED)
                                .reason(Refund.Reason.TRANSACTION_FAILED)
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .ruleBasedAccountId("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
                        .settledAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .settlementTimelineSeconds(0L)
                        .updatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
                .build()

        val roundtrippedOutgoingPaymentWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outgoingPaymentWebhookEvent),
                jacksonTypeRef<OutgoingPaymentWebhookEvent>(),
            )

        assertThat(roundtrippedOutgoingPaymentWebhookEvent).isEqualTo(outgoingPaymentWebhookEvent)
    }
}
