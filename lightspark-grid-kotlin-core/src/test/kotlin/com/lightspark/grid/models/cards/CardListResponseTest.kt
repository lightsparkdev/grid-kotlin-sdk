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
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardListResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardListResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardListResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardListResponse.StateReason.ISSUER_REJECTED)
                .build()

        assertThat(cardListResponse.id()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(cardListResponse.cardholderId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(cardListResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
        assertThat(cardListResponse.form()).isEqualTo(CardListResponse.Form.VIRTUAL)
        assertThat(cardListResponse.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(cardListResponse.state()).isEqualTo(CardListResponse.State.PENDING_KYC)
        assertThat(cardListResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
        assertThat(cardListResponse.brand()).isEqualTo(CardListResponse.Brand.VISA)
        assertThat(cardListResponse.currency()).isEqualTo("USD")
        assertThat(cardListResponse.expMonth()).isEqualTo(12L)
        assertThat(cardListResponse.expYear()).isEqualTo(2029L)
        assertThat(cardListResponse.issuerRef()).isEqualTo("lithic_card_4f8d3a2b1c")
        assertThat(cardListResponse.last4()).isEqualTo("4242")
        assertThat(cardListResponse.panEmbedUrl())
            .isEqualTo("https://embed.lithic.com/iframe/...?t=...")
        assertThat(cardListResponse.platformCardId()).isEqualTo("card-emp-aary-001")
        assertThat(cardListResponse.stateReason())
            .isEqualTo(CardListResponse.StateReason.ISSUER_REJECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardListResponse =
            CardListResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardListResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardListResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardListResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardListResponse.StateReason.ISSUER_REJECTED)
                .build()

        val roundtrippedCardListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardListResponse),
                jacksonTypeRef<CardListResponse>(),
            )

        assertThat(roundtrippedCardListResponse).isEqualTo(cardListResponse)
    }
}
