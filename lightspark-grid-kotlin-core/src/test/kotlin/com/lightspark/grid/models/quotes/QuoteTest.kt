// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.UsdAccountInfo
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteTest {

    @Test
    fun create() {
        val quote =
            Quote.builder()
                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .destination(
                    QuoteDestinationOneOf.AccountDestination.builder()
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .paymentRail(QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH)
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
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
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

        assertThat(quote.id()).isEqualTo("Quote:019542f5-b3e7-1d02-0000-000000000006")
        assertThat(quote.createdAt()).isEqualTo(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
        assertThat(quote.destination())
            .isEqualTo(
                QuoteDestinationOneOf.ofAccountDestination(
                    QuoteDestinationOneOf.AccountDestination.builder()
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .paymentRail(QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH)
                        .build()
                )
            )
        assertThat(quote.exchangeRate()).isEqualTo(1.0)
        assertThat(quote.expiresAt()).isEqualTo(OffsetDateTime.parse("2025-10-03T12:05:00Z"))
        assertThat(quote.feesIncluded()).isEqualTo(10L)
        assertThat(quote.receivingCurrency())
            .isEqualTo(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(quote.sendingCurrency())
            .isEqualTo(
                Currency.builder()
                    .code("USD")
                    .decimals(2L)
                    .name("United States Dollar")
                    .symbol("\$")
                    .build()
            )
        assertThat(quote.source())
            .isEqualTo(
                QuoteSourceOneOf.ofAccountQuoteSource(
                    QuoteSourceOneOf.AccountQuoteSource.builder()
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
            )
        assertThat(quote.status()).isEqualTo(Quote.Status.PENDING)
        assertThat(quote.totalReceivingAmount()).isEqualTo(1000L)
        assertThat(quote.totalSendingAmount()).isEqualTo(123010L)
        assertThat(quote.transactionId())
            .isEqualTo("Transaction:019542f5-b3e7-1d02-0000-000000000005")
        assertThat(quote.counterpartyInformation())
            .isEqualTo(
                Quote.CounterpartyInformation.builder()
                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                    .putAdditionalProperty("BIRTH_DATE", JsonValue.from("bar"))
                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                    .build()
            )
        assertThat(quote.paymentInstructions())
            .containsExactly(
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
                    .build(),
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
                    .build(),
            )
        assertThat(quote.rateDetails())
            .isEqualTo(
                OutgoingRateDetails.builder()
                    .counterpartyFixedFee(10L)
                    .counterpartyMultiplier(1.08)
                    .gridApiFixedFee(10L)
                    .gridApiMultiplier(0.925)
                    .gridApiVariableFeeAmount(30.0)
                    .gridApiVariableFeeRate(0.003)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quote =
            Quote.builder()
                .id("Quote:019542f5-b3e7-1d02-0000-000000000006")
                .createdAt(OffsetDateTime.parse("2025-10-03T12:00:00Z"))
                .destination(
                    QuoteDestinationOneOf.AccountDestination.builder()
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .paymentRail(QuoteDestinationOneOf.AccountDestination.PaymentRail.ACH)
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
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
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

        val roundtrippedQuote =
            jsonMapper.readValue(jsonMapper.writeValueAsString(quote), jacksonTypeRef<Quote>())

        assertThat(roundtrippedQuote).isEqualTo(quote)
    }
}
