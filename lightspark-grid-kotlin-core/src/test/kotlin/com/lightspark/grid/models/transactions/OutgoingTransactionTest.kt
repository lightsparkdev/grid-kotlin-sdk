// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.sandbox.cards.simulate.Refund
import com.lightspark.grid.models.transferin.BaseTransactionDestination
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutgoingTransactionTest {

    @Test
    fun create() {
        val outgoingTransaction =
            OutgoingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(
                    OutgoingTransaction.Destination.AccountDestination.builder()
                        .destinationType(BaseTransactionDestination.DestinationType.ACCOUNT)
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .onChainTransaction(
                            OutgoingTransaction.Destination.AccountDestination.OnChainTransaction
                                .builder()
                                .network(
                                    OutgoingTransaction.Destination.AccountDestination
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
                    TransactionSourceOneOf.AccountSource.builder()
                        .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .onChainTransaction(
                            TransactionSourceOneOf.AccountSource.OnChainTransaction.builder()
                                .network(
                                    TransactionSourceOneOf.AccountSource.OnChainTransaction.Network
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
                                    PaymentInstructions.AccountOrWalletInfo.SwiftAccount.PaymentRail
                                        .SWIFT
                                )
                                .addPaymentRail(
                                    PaymentInstructions.AccountOrWalletInfo.SwiftAccount.PaymentRail
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
                .pendingReason(OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
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

        assertThat(outgoingTransaction.id())
            .isEqualTo("Transaction:019542f5-b3e7-1d02-0000-000000000004")
        assertThat(outgoingTransaction.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(outgoingTransaction.destination())
            .isEqualTo(
                OutgoingTransaction.Destination.ofAccount(
                    OutgoingTransaction.Destination.AccountDestination.builder()
                        .destinationType(BaseTransactionDestination.DestinationType.ACCOUNT)
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .onChainTransaction(
                            OutgoingTransaction.Destination.AccountDestination.OnChainTransaction
                                .builder()
                                .network(
                                    OutgoingTransaction.Destination.AccountDestination
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
            )
        assertThat(outgoingTransaction.direction()).isEqualTo(OutgoingTransaction.Direction.CREDIT)
        assertThat(outgoingTransaction.platformCustomerId()).isEqualTo("18d3e5f7b4a9c2")
        assertThat(outgoingTransaction.sentAmount())
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
        assertThat(outgoingTransaction.source())
            .isEqualTo(
                TransactionSourceOneOf.ofAccountSource(
                    TransactionSourceOneOf.AccountSource.builder()
                        .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .onChainTransaction(
                            TransactionSourceOneOf.AccountSource.OnChainTransaction.builder()
                                .network(
                                    TransactionSourceOneOf.AccountSource.OnChainTransaction.Network
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
        assertThat(outgoingTransaction.status()).isEqualTo(OutgoingTransaction.Status.PENDING)
        assertThat(outgoingTransaction.type()).isEqualTo(OutgoingTransaction.Type.OUTGOING)
        assertThat(outgoingTransaction.agentId())
            .isEqualTo("Agent:019542f5-b3e7-1d02-0000-000000000042")
        assertThat(outgoingTransaction.counterpartyInformation())
            .isEqualTo(
                OutgoingTransaction.CounterpartyInformation.builder()
                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                    .build()
            )
        assertThat(outgoingTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:25:18Z"))
        assertThat(outgoingTransaction.description()).isEqualTo("Payment for invoice #1234")
        assertThat(outgoingTransaction.exchangeRate()).isEqualTo(1.08)
        assertThat(outgoingTransaction.expectedSettlementAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(outgoingTransaction.failureReason())
            .isEqualTo(OutgoingTransaction.FailureReason.QUOTE_EXPIRED)
        assertThat(outgoingTransaction.fees()).isEqualTo(10L)
        assertThat(outgoingTransaction.paymentInstructions())
            .containsExactly(
                PaymentInstructions.builder()
                    .accountOrWalletInfo(
                        PaymentInstructions.AccountOrWalletInfo.SwiftAccount.builder()
                            .accountHolderName("Acme Exports Pte Ltd")
                            .bankName("Chase Bank")
                            .country("NG")
                            .addPaymentRail(
                                PaymentInstructions.AccountOrWalletInfo.SwiftAccount.PaymentRail
                                    .SWIFT
                            )
                            .addPaymentRail(
                                PaymentInstructions.AccountOrWalletInfo.SwiftAccount.PaymentRail
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
                    .build(),
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
                    .build(),
            )
        assertThat(outgoingTransaction.paymentRail()).isEqualTo(OutgoingTransaction.PaymentRail.ACH)
        assertThat(outgoingTransaction.pendingReason())
            .isEqualTo(OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
        assertThat(outgoingTransaction.platformFees()).isEqualTo(5L)
        assertThat(outgoingTransaction.quoteId())
            .isEqualTo("Quote:019542f5-b3e7-1d02-0000-000000000006")
        assertThat(outgoingTransaction.railSelectionMode())
            .isEqualTo(OutgoingTransaction.RailSelectionMode.AUTO)
        assertThat(outgoingTransaction.rateDetails())
            .isEqualTo(
                OutgoingRateDetails.builder()
                    .counterpartyFixedFee(10L)
                    .counterpartyMultiplier(1.08)
                    .gridApiFixedFee(10L)
                    .gridApiMultiplier(0.925)
                    .gridApiVariableFeeAmount(30L)
                    .gridApiVariableFeeRate(0.003)
                    .build()
            )
        assertThat(outgoingTransaction.receiptDeliveryConfirmedAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:31:00Z"))
        assertThat(outgoingTransaction.receivedAmount())
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
        assertThat(outgoingTransaction.reconciliationInstructions())
            .isEqualTo(
                ReconciliationInstructions.builder()
                    .reference("UMA-Q12345-REF")
                    .transactionHash(
                        "0x9f2c6b6f4b6c8f2a8d9e0b1c2d3e4f5061728394a5b6c7d8e9f00112233445566"
                    )
                    .build()
            )
        assertThat(outgoingTransaction.refund())
            .isEqualTo(
                Refund.builder()
                    .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                    .reference("UMA-Q12345-REFUND")
                    .status(Refund.Status.COMPLETED)
                    .reason(Refund.Reason.TRANSACTION_FAILED)
                    .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                    .build()
            )
        assertThat(outgoingTransaction.ruleBasedAccountId())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000011")
        assertThat(outgoingTransaction.settledAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
        assertThat(outgoingTransaction.settlementTimelineSeconds()).isEqualTo(0L)
        assertThat(outgoingTransaction.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outgoingTransaction =
            OutgoingTransaction.builder()
                .id("Transaction:019542f5-b3e7-1d02-0000-000000000004")
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .destination(
                    OutgoingTransaction.Destination.AccountDestination.builder()
                        .destinationType(BaseTransactionDestination.DestinationType.ACCOUNT)
                        .currency("EUR")
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .onChainTransaction(
                            OutgoingTransaction.Destination.AccountDestination.OnChainTransaction
                                .builder()
                                .network(
                                    OutgoingTransaction.Destination.AccountDestination
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
                    TransactionSourceOneOf.AccountSource.builder()
                        .sourceType(BaseTransactionSource.SourceType.ACCOUNT)
                        .currency("USD")
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .onChainTransaction(
                            TransactionSourceOneOf.AccountSource.OnChainTransaction.builder()
                                .network(
                                    TransactionSourceOneOf.AccountSource.OnChainTransaction.Network
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
                                    PaymentInstructions.AccountOrWalletInfo.SwiftAccount.PaymentRail
                                        .SWIFT
                                )
                                .addPaymentRail(
                                    PaymentInstructions.AccountOrWalletInfo.SwiftAccount.PaymentRail
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
                .pendingReason(OutgoingTransaction.PendingReason.COUNTERPARTY_DECLARATION_REQUIRED)
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

        val roundtrippedOutgoingTransaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outgoingTransaction),
                jacksonTypeRef<OutgoingTransaction>(),
            )

        assertThat(roundtrippedOutgoingTransaction).isEqualTo(outgoingTransaction)
    }
}
