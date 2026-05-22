// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardIssueParamsTest {

    @Test
    fun create() {
        CardIssueParams.builder()
            .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
            .form(CardIssueParams.Form.VIRTUAL)
            .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
            .platformCardId("card-emp-aary-001")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardIssueParams.builder()
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .form(CardIssueParams.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .platformCardId("card-emp-aary-001")
                .build()

        val body = params._body()

        assertThat(body.cardholderId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.form()).isEqualTo(CardIssueParams.Form.VIRTUAL)
        assertThat(body.fundingSources())
            .containsExactly("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(body.platformCardId()).isEqualTo("card-emp-aary-001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardIssueParams.builder()
                .cardholderId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .form(CardIssueParams.Form.VIRTUAL)
                .addFundingSource("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .build()

        val body = params._body()

        assertThat(body.cardholderId()).isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
        assertThat(body.form()).isEqualTo(CardIssueParams.Form.VIRTUAL)
        assertThat(body.fundingSources())
            .containsExactly("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
    }
}
