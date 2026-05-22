// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardIssueResponseTest {

    @Test
    fun create() {
        val cardIssueResponse =
            CardIssueResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardIssueResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardIssueResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardIssueResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardIssueResponse.StateReason.ISSUER_REJECTED)
                .build()

        assertThat(cardIssueResponse.id()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(cardIssueResponse.cardholderId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(cardIssueResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
        assertThat(cardIssueResponse.form()).isEqualTo(CardIssueResponse.Form.VIRTUAL)
        assertThat(cardIssueResponse.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(cardIssueResponse.state()).isEqualTo(CardIssueResponse.State.PENDING_KYC)
        assertThat(cardIssueResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
        assertThat(cardIssueResponse.brand()).isEqualTo(CardIssueResponse.Brand.VISA)
        assertThat(cardIssueResponse.currency()).isEqualTo("USD")
        assertThat(cardIssueResponse.expMonth()).isEqualTo(12L)
        assertThat(cardIssueResponse.expYear()).isEqualTo(2029L)
        assertThat(cardIssueResponse.issuerRef()).isEqualTo("lithic_card_4f8d3a2b1c")
        assertThat(cardIssueResponse.last4()).isEqualTo("4242")
        assertThat(cardIssueResponse.panEmbedUrl())
            .isEqualTo("https://embed.lithic.com/iframe/...?t=...")
        assertThat(cardIssueResponse.platformCardId()).isEqualTo("card-emp-aary-001")
        assertThat(cardIssueResponse.stateReason())
            .isEqualTo(CardIssueResponse.StateReason.ISSUER_REJECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardIssueResponse =
            CardIssueResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardIssueResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardIssueResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardIssueResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardIssueResponse.StateReason.ISSUER_REJECTED)
                .build()

        val roundtrippedCardIssueResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardIssueResponse),
                jacksonTypeRef<CardIssueResponse>(),
            )

        assertThat(roundtrippedCardIssueResponse).isEqualTo(cardIssueResponse)
    }
}
