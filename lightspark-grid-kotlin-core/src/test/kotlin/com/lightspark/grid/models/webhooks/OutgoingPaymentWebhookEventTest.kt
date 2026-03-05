// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.invitations.CurrencyAmount
import com.lightspark.grid.models.quotes.Currency
import com.lightspark.grid.models.quotes.OutgoingRateDetails
import com.lightspark.grid.models.quotes.PaymentInstructions
import com.lightspark.grid.models.transactions.TransactionSourceOneOf
import com.lightspark.grid.models.transactions.TransactionStatus
import com.lightspark.grid.models.transactions.TransactionType
import com.lightspark.grid.models.transferin.Transaction
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
                    OutgoingPaymentWebhookEvent.Data.builder()
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
                        .failureReason(OutgoingPaymentWebhookEvent.Data.FailureReason.QUOTE_EXPIRED)
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
                            OutgoingPaymentWebhookEvent.Data.Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(OutgoingPaymentWebhookEvent.Data.Refund.Status.COMPLETED)
                                .reason(
                                    OutgoingPaymentWebhookEvent.Data.Refund.Reason
                                        .TRANSACTION_FAILED
                                )
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
                        .build()
                )
                .timestamp(OffsetDateTime.parse("2025-08-15T14:32:00Z"))
                .type(OutgoingPaymentWebhookEvent.Type.OUTGOING_PAYMENT_PENDING)
                .build()

        assertThat(outgoingPaymentWebhookEvent.id())
            .isEqualTo("Webhook:019542f5-b3e7-1d02-0000-000000000007")
        assertThat(outgoingPaymentWebhookEvent.data())
            .isEqualTo(
                OutgoingPaymentWebhookEvent.Data.builder()
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
                    .failureReason(OutgoingPaymentWebhookEvent.Data.FailureReason.QUOTE_EXPIRED)
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
                        OutgoingPaymentWebhookEvent.Data.Refund.builder()
                            .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                            .reference("UMA-Q12345-REFUND")
                            .status(OutgoingPaymentWebhookEvent.Data.Refund.Status.COMPLETED)
                            .reason(
                                OutgoingPaymentWebhookEvent.Data.Refund.Reason.TRANSACTION_FAILED
                            )
                            .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                            .build()
                    )
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
                    OutgoingPaymentWebhookEvent.Data.builder()
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
                        .failureReason(OutgoingPaymentWebhookEvent.Data.FailureReason.QUOTE_EXPIRED)
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
                            OutgoingPaymentWebhookEvent.Data.Refund.builder()
                                .initiatedAt(OffsetDateTime.parse("2025-08-15T14:30:00Z"))
                                .reference("UMA-Q12345-REFUND")
                                .status(OutgoingPaymentWebhookEvent.Data.Refund.Status.COMPLETED)
                                .reason(
                                    OutgoingPaymentWebhookEvent.Data.Refund.Reason
                                        .TRANSACTION_FAILED
                                )
                                .settledAt(OffsetDateTime.parse("2025-08-15T14:35:00Z"))
                                .build()
                        )
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
