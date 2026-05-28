// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListResponseTest {

    @Test
    fun create() {
        val cardListResponse =
            CardListResponse.builder()
                .addData(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardState.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardBrand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateReason.ISSUER_REJECTED)
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        assertThat(cardListResponse.data())
            .containsExactly(
                Card.builder()
                    .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                    .form(CardForm.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                    .state(CardState.PENDING_KYC)
                    .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                    .brand(CardBrand.VISA)
                    .currency("USD")
                    .expMonth(12L)
                    .expYear(2029L)
                    .issuerRef("lithic_card_4f8d3a2b1c")
                    .last4("4242")
                    .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                    .platformCardId("card-emp-aary-001")
                    .stateReason(CardStateReason.ISSUER_REJECTED)
                    .build()
            )
        assertThat(cardListResponse.hasMore()).isEqualTo(true)
        assertThat(cardListResponse.nextCursor()).isEqualTo("nextCursor")
        assertThat(cardListResponse.totalCount()).isEqualTo(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListResponse =
            CardListResponse.builder()
                .addData(
                    Card.builder()
                        .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                        .state(CardState.PENDING_KYC)
                        .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                        .brand(CardBrand.VISA)
                        .currency("USD")
                        .expMonth(12L)
                        .expYear(2029L)
                        .issuerRef("lithic_card_4f8d3a2b1c")
                        .last4("4242")
                        .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                        .platformCardId("card-emp-aary-001")
                        .stateReason(CardStateReason.ISSUER_REJECTED)
                        .build()
                )
                .hasMore(true)
                .nextCursor("nextCursor")
                .totalCount(0L)
                .build()

        val roundtrippedCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListResponse),
                jacksonTypeRef<CardListResponse>(),
            )

        assertThat(roundtrippedCardListResponse).isEqualTo(cardListResponse)
    }
}
