// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardIssueParamsTest {

    @Test
    fun create() {
        CardIssueParams.builder()
            .cardCreateRequest(
                CardCreateRequest.builder()
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardForm.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .platformCardId("card-emp-aary-001")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CardIssueParams.builder()
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .platformCardId("card-emp-aary-001")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardCreateRequest.builder()
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardForm.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .platformCardId("card-emp-aary-001")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardIssueParams.builder()
                .cardCreateRequest(
                    CardCreateRequest.builder()
                        .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                        .form(CardForm.VIRTUAL)
                        .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                CardCreateRequest.builder()
                    .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                    .form(CardForm.VIRTUAL)
                    .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                    .build()
            )
    }
}
