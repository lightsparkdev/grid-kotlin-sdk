// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeRetrieveInternalAccountsParamsTest {

    @Test
    fun create() {
        MeRetrieveInternalAccountsParams.builder()
            .currency("currency")
            .cursor("cursor")
            .limit(1L)
            .type(MeRetrieveInternalAccountsParams.Type.INTERNAL_FIAT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MeRetrieveInternalAccountsParams.builder()
                .currency("currency")
                .cursor("cursor")
                .limit(1L)
                .type(MeRetrieveInternalAccountsParams.Type.INTERNAL_FIAT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currency", "currency")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("type", "INTERNAL_FIAT")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MeRetrieveInternalAccountsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
