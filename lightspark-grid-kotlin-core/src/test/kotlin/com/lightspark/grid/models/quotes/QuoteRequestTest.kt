// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteRequestTest {

    @Test
    fun create() {
        val quoteRequest =
            QuoteRequest.builder()
                .destination(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
                .lockedCurrencyAmount(1000L)
                .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                .source(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .description("Invoice #1234 payment")
                .documentIds(
                    listOf(
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                    )
                )
                .immediatelyExecute(false)
                .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                .platformFeeOverride(
                    QuoteRequest.PlatformFeeOverride.builder()
                        .platformFixedFee(
                            QuoteRequest.PlatformFeeOverride.PlatformFixedFee.builder()
                                .amount(50L)
                                .currency("USD")
                                .build()
                        )
                        .platformVariableFeeBps(30L)
                        .build()
                )
                .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
                .remittanceInformation("12345")
                .scaFactor(QuoteRequest.ScaFactor.SMS_OTP)
                .senderCustomerInfo(
                    QuoteRequest.SenderCustomerInfo.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(quoteRequest.destination())
            .isEqualTo(
                QuoteDestinationOneOf.ofAccount(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
            )
        assertThat(quoteRequest.lockedCurrencyAmount()).isEqualTo(1000L)
        assertThat(quoteRequest.lockedCurrencySide())
            .isEqualTo(QuoteRequest.LockedCurrencySide.SENDING)
        assertThat(quoteRequest.source())
            .isEqualTo(
                QuoteSourceOneOf.ofAccount(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
            )
        assertThat(quoteRequest.description()).isEqualTo("Invoice #1234 payment")
        assertThat(quoteRequest.documentIds())
            .containsExactly(
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(quoteRequest.immediatelyExecute()).isEqualTo(false)
        assertThat(quoteRequest.lookupId()).isEqualTo("Lookup:019542f5-b3e7-1d02-0000-000000000009")
        assertThat(quoteRequest.platformFeeOverride())
            .isEqualTo(
                QuoteRequest.PlatformFeeOverride.builder()
                    .platformFixedFee(
                        QuoteRequest.PlatformFeeOverride.PlatformFixedFee.builder()
                            .amount(50L)
                            .currency("USD")
                            .build()
                    )
                    .platformVariableFeeBps(30L)
                    .build()
            )
        assertThat(quoteRequest.purposeOfPayment()).isEqualTo(QuoteRequest.PurposeOfPayment.GIFT)
        assertThat(quoteRequest.remittanceInformation()).isEqualTo("12345")
        assertThat(quoteRequest.scaFactor()).isEqualTo(QuoteRequest.ScaFactor.SMS_OTP)
        assertThat(quoteRequest.senderCustomerInfo())
            .isEqualTo(
                QuoteRequest.SenderCustomerInfo.builder()
                    .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                    .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val quoteRequest =
            QuoteRequest.builder()
                .destination(
                    QuoteDestinationOneOf.Account.builder()
                        .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                        .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                        .build()
                )
                .lockedCurrencyAmount(1000L)
                .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                .source(
                    QuoteSourceOneOf.Account.builder()
                        .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                        .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .build()
                )
                .description("Invoice #1234 payment")
                .documentIds(
                    listOf(
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000001",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000002",
                        "PaymentDocument:019542f5-b3e7-1d02-0000-000000000003",
                    )
                )
                .immediatelyExecute(false)
                .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                .platformFeeOverride(
                    QuoteRequest.PlatformFeeOverride.builder()
                        .platformFixedFee(
                            QuoteRequest.PlatformFeeOverride.PlatformFixedFee.builder()
                                .amount(50L)
                                .currency("USD")
                                .build()
                        )
                        .platformVariableFeeBps(30L)
                        .build()
                )
                .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
                .remittanceInformation("12345")
                .scaFactor(QuoteRequest.ScaFactor.SMS_OTP)
                .senderCustomerInfo(
                    QuoteRequest.SenderCustomerInfo.builder()
                        .putAdditionalProperty("FULL_NAME", JsonValue.from("bar"))
                        .putAdditionalProperty("NATIONALITY", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedQuoteRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quoteRequest),
                jacksonTypeRef<QuoteRequest>(),
            )

        assertThat(roundtrippedQuoteRequest).isEqualTo(quoteRequest)
    }
}
