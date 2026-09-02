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
                .form(Card.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .maxSpendPerDay(25000L)
                .maxSpendPerTransaction(5000L)
                .state(Card.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(Card.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lead_card_7a1b9c3d")
                .last4("4242")
                .platformCardId("card-emp-aary-001")
                .processorRef("card_b81c2a4f")
                .stateReason(Card.StateReason.ISSUER_REJECTED)
                .build()

        assertThat(card.id()).isEqualTo("Card:019542f5-b3e7-1d02-0000-000000000010")
        assertThat(card.cardholderId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(card.createdAt()).isEqualTo(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
        assertThat(card.form()).isEqualTo(Card.Form.VIRTUAL)
        assertThat(card.fundingSources())
            .containsExactly(
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000002",
                "InternalAccount:019542f5-b3e7-1d02-0000-000000000003",
            )
        assertThat(card.maxSpendPerDay()).isEqualTo(25000L)
        assertThat(card.maxSpendPerTransaction()).isEqualTo(5000L)
        assertThat(card.state()).isEqualTo(Card.State.PENDING_KYC)
        assertThat(card.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
        assertThat(card.brand()).isEqualTo(Card.Brand.VISA)
        assertThat(card.currency()).isEqualTo("USD")
        assertThat(card.expMonth()).isEqualTo(12L)
        assertThat(card.expYear()).isEqualTo(2029L)
        assertThat(card.issuerRef()).isEqualTo("lead_card_7a1b9c3d")
        assertThat(card.last4()).isEqualTo("4242")
        assertThat(card.platformCardId()).isEqualTo("card-emp-aary-001")
        assertThat(card.processorRef()).isEqualTo("card_b81c2a4f")
        assertThat(card.stateReason()).isEqualTo(Card.StateReason.ISSUER_REJECTED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val card =
            Card.builder()
                .id("Card:019542f5-b3e7-1d02-0000-000000000010")
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .createdAt(OffsetDateTime.parse("2026-05-08T14:10:00Z"))
                .form(Card.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000003")
                .maxSpendPerDay(25000L)
                .maxSpendPerTransaction(5000L)
                .state(Card.State.PENDING_KYC)
                .updatedAt(OffsetDateTime.parse("2026-05-08T14:11:00Z"))
                .brand(Card.Brand.VISA)
                .currency("USD")
                .expMonth(12L)
                .expYear(2029L)
                .issuerRef("lead_card_7a1b9c3d")
                .last4("4242")
                .platformCardId("card-emp-aary-001")
                .processorRef("card_b81c2a4f")
                .stateReason(Card.StateReason.ISSUER_REJECTED)
                .build()

        val roundtrippedCard =
            jsonMapper.readValue(jsonMapper.writeValueAsString(card), jacksonTypeRef<Card>())

        assertThat(roundtrippedCard).isEqualTo(card)
    }
}
