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
                .destination(QuoteDestinationOneOf.builder().build())
                .lockedCurrencyAmount(1000L)
                .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
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

        assertThat(quoteRequest.destination()).isEqualTo(QuoteDestinationOneOf.builder().build())
        assertThat(quoteRequest.lockedCurrencyAmount()).isEqualTo(1000L)
        assertThat(quoteRequest.lockedCurrencySide())
            .isEqualTo(QuoteRequest.LockedCurrencySide.SENDING)
        assertThat(quoteRequest.source()).isEqualTo(QuoteSourceOneOf.builder().build())
        assertThat(quoteRequest.description()).isEqualTo("Invoice #1234 payment")
        assertThat(quoteRequest.immediatelyExecute()).isEqualTo(false)
        assertThat(quoteRequest.lookupId()).isEqualTo("Lookup:019542f5-b3e7-1d02-0000-000000000009")
        assertThat(quoteRequest.purposeOfPayment()).isEqualTo(QuoteRequest.PurposeOfPayment.GIFT)
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
                .destination(QuoteDestinationOneOf.builder().build())
                .lockedCurrencyAmount(1000L)
                .lockedCurrencySide(QuoteRequest.LockedCurrencySide.SENDING)
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

        val roundtrippedQuoteRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(quoteRequest),
                jacksonTypeRef<QuoteRequest>(),
            )

        assertThat(roundtrippedQuoteRequest).isEqualTo(quoteRequest)
    }
}
