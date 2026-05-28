// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardRetrieveResponseTest {

    @Test
    fun create() {
        val cardRetrieveResponse =
            CardRetrieveResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardRetrieveResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardRetrieveResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardRetrieveResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardRetrieveResponse.StateReason.ISSUER_REJECTED)
                .build()

        assertThat(cardRetrieveResponse.id()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(cardRetrieveResponse.cardholderId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(cardRetrieveResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
        assertThat(cardRetrieveResponse.form()).isEqualTo(CardRetrieveResponse.Form.VIRTUAL)
        assertThat(cardRetrieveResponse.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(cardRetrieveResponse.state()).isEqualTo(CardRetrieveResponse.State.PENDING_KYC)
        assertThat(cardRetrieveResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
        assertThat(cardRetrieveResponse.brand()).isEqualTo(CardRetrieveResponse.Brand.VISA)
        assertThat(cardRetrieveResponse.currency()).isEqualTo("USD")
        assertThat(cardRetrieveResponse.expMonth()).isEqualTo(12L)
        assertThat(cardRetrieveResponse.expYear()).isEqualTo(2029L)
        assertThat(cardRetrieveResponse.issuerRef()).isEqualTo("lithic_card_4f8d3a2b1c")
        assertThat(cardRetrieveResponse.last4()).isEqualTo("4242")
        assertThat(cardRetrieveResponse.panEmbedUrl())
            .isEqualTo("https://embed.lithic.com/iframe/...?t=...")
        assertThat(cardRetrieveResponse.platformCardId()).isEqualTo("card-emp-aary-001")
        assertThat(cardRetrieveResponse.stateReason())
            .isEqualTo(CardRetrieveResponse.StateReason.ISSUER_REJECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardRetrieveResponse =
            CardRetrieveResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardRetrieveResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardRetrieveResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardRetrieveResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardRetrieveResponse.StateReason.ISSUER_REJECTED)
                .build()

        val roundtrippedCardRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardRetrieveResponse),
                jacksonTypeRef<CardRetrieveResponse>(),
            )

        assertThat(roundtrippedCardRetrieveResponse).isEqualTo(cardRetrieveResponse)
    }
}
