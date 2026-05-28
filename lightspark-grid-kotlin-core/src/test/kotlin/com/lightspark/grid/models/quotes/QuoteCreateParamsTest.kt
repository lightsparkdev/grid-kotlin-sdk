// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class QuoteCreateParamsTest {

    @Test
    fun create() {
        QuoteCreateParams.builder()
            .idempotencyKey("<uuid>")
            .quoteRequest(
                QuoteRequest.builder()
                    .destination(QuoteDestinationOneOf.builder().build())
                    .lockedCurrencyAmount(1000L)
                    .lockedCurrencySide(QuoteLockSide.SENDING)
                    .source(QuoteSourceOneOf.builder().build())
                    .description("Invoice #1234 payment")
                    .immediatelyExecute(false)
                    .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                    .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
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
                        .destination(QuoteDestinationOneOf.builder().build())
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteLockSide.SENDING)
                        .source(QuoteSourceOneOf.builder().build())
                        .description("Invoice #1234 payment")
                        .immediatelyExecute(false)
                        .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                        .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
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
                        .destination(QuoteDestinationOneOf.builder().build())
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteLockSide.SENDING)
                        .source(QuoteSourceOneOf.builder().build())
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
                        .destination(QuoteDestinationOneOf.builder().build())
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteLockSide.SENDING)
                        .source(QuoteSourceOneOf.builder().build())
                        .description("Invoice #1234 payment")
                        .immediatelyExecute(false)
                        .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                        .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
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
                    .destination(QuoteDestinationOneOf.builder().build())
                    .lockedCurrencyAmount(1000L)
                    .lockedCurrencySide(QuoteLockSide.SENDING)
                    .source(QuoteSourceOneOf.builder().build())
                    .description("Invoice #1234 payment")
                    .immediatelyExecute(false)
                    .lookupId("Lookup:019542f5-b3e7-1d02-0000-000000000009")
                    .purposeOfPayment(QuoteRequest.PurposeOfPayment.GIFT)
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
                        .destination(QuoteDestinationOneOf.builder().build())
                        .lockedCurrencyAmount(1000L)
                        .lockedCurrencySide(QuoteLockSide.SENDING)
                        .source(QuoteSourceOneOf.builder().build())
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                QuoteRequest.builder()
                    .destination(QuoteDestinationOneOf.builder().build())
                    .lockedCurrencyAmount(1000L)
                    .lockedCurrencySide(QuoteLockSide.SENDING)
                    .source(QuoteSourceOneOf.builder().build())
                    .build()
            )
    }
}
