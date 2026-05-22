// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardUpdateResponseTest {

    @Test
    fun create() {
        val cardUpdateResponse =
            CardUpdateResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardUpdateResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardUpdateResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardUpdateResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardUpdateResponse.StateReason.ISSUER_REJECTED)
                .build()

        assertThat(cardUpdateResponse.id()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(cardUpdateResponse.cardholderId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(cardUpdateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
        assertThat(cardUpdateResponse.form()).isEqualTo(CardUpdateResponse.Form.VIRTUAL)
        assertThat(cardUpdateResponse.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(cardUpdateResponse.state()).isEqualTo(CardUpdateResponse.State.PENDING_KYC)
        assertThat(cardUpdateResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
        assertThat(cardUpdateResponse.brand()).isEqualTo(CardUpdateResponse.Brand.VISA)
        assertThat(cardUpdateResponse.currency()).isEqualTo("USD")
        assertThat(cardUpdateResponse.expMonth()).isEqualTo(12L)
        assertThat(cardUpdateResponse.expYear()).isEqualTo(2029L)
        assertThat(cardUpdateResponse.issuerRef()).isEqualTo("lithic_card_4f8d3a2b1c")
        assertThat(cardUpdateResponse.last4()).isEqualTo("4242")
        assertThat(cardUpdateResponse.panEmbedUrl())
            .isEqualTo("https://embed.lithic.com/iframe/...?t=...")
        assertThat(cardUpdateResponse.platformCardId()).isEqualTo("card-emp-aary-001")
        assertThat(cardUpdateResponse.stateReason())
            .isEqualTo(CardUpdateResponse.StateReason.ISSUER_REJECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardUpdateResponse =
            CardUpdateResponse.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(CardUpdateResponse.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .state(CardUpdateResponse.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(CardUpdateResponse.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lithic_card_4f8d3a2b1c")
                .last4("4242")
                .panEmbedUrl("https://embed.lithic.com/iframe/...?t=...")
                .platformCardId("card-emp-aary-001")
                .stateReason(CardUpdateResponse.StateReason.ISSUER_REJECTED)
                .build()

        val roundtrippedCardUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardUpdateResponse),
                jacksonTypeRef<CardUpdateResponse>(),
            )

        assertThat(roundtrippedCardUpdateResponse).isEqualTo(cardUpdateResponse)
    }
}
