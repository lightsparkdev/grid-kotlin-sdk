// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.quotes

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.http.Headers
import com.lightspark.grid.models.quotes.BaseDestination
import com.lightspark.grid.models.quotes.BaseQuoteSource
import com.lightspark.grid.models.quotes.QuoteDestinationOneOf
import com.lightspark.grid.models.quotes.QuoteRequest
import com.lightspark.grid.models.quotes.QuoteSourceOneOf
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteCreateParamsTest {

    @Test
    fun create() {
        QuoteCreateParams.builder()
            .idempotencyKey("<uuid>")
            .quoteRequest(
                QuoteRequest.builder()
                    .destination(
                        QuoteDestinationOneOf.Account.builder()
                            .destinationType(BaseDestination.DestinationType.ACCOUNT)
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                            .build()
                    )
                    .lockedCurrencyAmount(1000L)
                    .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                    .source(
                        QuoteSourceOneOf.Account.builder()
                            .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
            )
            .build()
    }

    @Test
    fun headers() {
        val params =
            QuoteCreateParams.builder()
                .idempotencyKey("<uuid>")
                .quoteRequest(
                    QuoteRequest.builder()
                        .destination(
                            QuoteDestinationOneOf.Account.builder()
                                .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                                .build()
                        )
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                        .source(
                            QuoteSourceOneOf.Account.builder()
                                .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().put("Idempotency-Key", "<uuid>").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            QuoteCreateParams.builder()
                .quoteRequest(
                    QuoteRequest.builder()
                        .destination(
                            QuoteDestinationOneOf.Account.builder()
                                .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                        .source(
                            QuoteSourceOneOf.Account.builder()
                                .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .build()
                )
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            QuoteCreateParams.builder()
                .idempotencyKey("<uuid>")
                .quoteRequest(
                    QuoteRequest.builder()
                        .destination(
                            QuoteDestinationOneOf.Account.builder()
                                .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                                .build()
                        )
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                        .source(
                            QuoteSourceOneOf.Account.builder()
                                .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                QuoteRequest.builder()
                    .destination(
                        QuoteDestinationOneOf.Account.builder()
                            .destinationType(BaseDestination.DestinationType.ACCOUNT)
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .paymentRail(QuoteDestinationOneOf.Account.PaymentRail.ACH)
                            .build()
                    )
                    .lockedCurrencyAmount(1000L)
                    .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                    .source(
                        QuoteSourceOneOf.Account.builder()
                            .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            QuoteCreateParams.builder()
                .quoteRequest(
                    QuoteRequest.builder()
                        .destination(
                            QuoteDestinationOneOf.Account.builder()
                                .destinationType(BaseDestination.DestinationType.ACCOUNT)
                                .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                                .build()
                        )
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                        .source(
                            QuoteSourceOneOf.Account.builder()
                                .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
                                .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                QuoteRequest.builder()
                    .destination(
                        QuoteDestinationOneOf.Account.builder()
                            .destinationType(BaseDestination.DestinationType.ACCOUNT)
                            .accountId("ExternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                            .build()
                    )
                    .lockedCurrencyAmount(1000L)
                    .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
                    .source(
                        QuoteSourceOneOf.Account.builder()
                            .sourceType(BaseQuoteSource.SourceType.ACCOUNT)
                            .accountId("InternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                            .build()
                    )
                    .build()
            )
    }
}
