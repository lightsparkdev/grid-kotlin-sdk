// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.cards

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardListParamsTest {

    @Test
    fun create() {
        CardListParams.builder()
            .accountId("accountId")
            .cursor("cursor")
            .customerId("customerId")
            .limit(1L)
            .platformCardId("platformCardId")
            .sortOrder(CardListParams.SortOrder.ASC)
            .state(CardListParams.State.PENDING_KYC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CardListParams.builder()
                .accountId("accountId")
                .cursor("cursor")
                .customerId("customerId")
                .limit(1L)
                .platformCardId("platformCardId")
                .sortOrder(CardListParams.SortOrder.ASC)
                .state(CardListParams.State.PENDING_KYC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("accountId", "accountId")
                    .put("cursor", "cursor")
                    .put("customerId", "customerId")
                    .put("limit", "1")
                    .put("platformCardId", "platformCardId")
                    .put("sortOrder", "asc")
                    .put("state", "PENDING_KYC")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CardListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
