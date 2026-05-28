// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTest {

    @Test
    fun create() {
        val card =
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

        assertThat(card.id()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(card.cardholderId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(card.createdAt()).isEqualTo(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
        assertThat(card.form()).isEqualTo(CardForm.VIRTUAL)
        assertThat(card.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(card.state()).isEqualTo(CardState.PENDING_KYC)
        assertThat(card.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
        assertThat(card.brand()).isEqualTo(CardBrand.VISA)
        assertThat(card.currency()).isEqualTo("USD")
        assertThat(card.expMonth()).isEqualTo(12L)
        assertThat(card.expYear()).isEqualTo(2029L)
        assertThat(card.issuerRef()).isEqualTo("lithic_card_4f8d3a2b1c")
        assertThat(card.last4()).isEqualTo("4242")
        assertThat(card.panEmbedUrl()).isEqualTo("https://embed.lithic.com/iframe/...?t=...")
        assertThat(card.platformCardId()).isEqualTo("card-emp-aary-001")
        assertThat(card.stateReason()).isEqualTo(CardStateReason.ISSUER_REJECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val card =
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

        val roundtrippedCard =
            jsonMapper.readValue(jsonMapper.writeValueAsString(card), jacksonTypeRef<Card>())

        assertThat(roundtrippedCard).isEqualTo(card)
    }
}
