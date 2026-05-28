// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardCreateRequestTest {

    @Test
    fun create() {
        val cardCreateRequest =
            CardCreateRequest.builder()
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .form(CardForm.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .platformCardId("card-emp-aary-001")
                .build()

        assertThat(cardCreateRequest.cardholderId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(cardCreateRequest.form()).isEqualTo(CardForm.VIRTUAL)
        assertThat(cardCreateRequest.fundingSources())
            .containsExactly("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(cardCreateRequest.platformCardId()).isEqualTo("card-emp-aary-001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cardCreateRequest =
            CardCreateRequest.builder()
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .form(CardForm.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .platformCardId("card-emp-aary-001")
                .build()

        val roundtrippedCardCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cardCreateRequest),
                jacksonTypeRef<CardCreateRequest>(),
            )

        assertThat(roundtrippedCardCreateRequest).isEqualTo(cardCreateRequest)
    }
}
