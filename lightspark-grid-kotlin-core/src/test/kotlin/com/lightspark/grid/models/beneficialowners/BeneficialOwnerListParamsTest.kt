// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerListParamsTest {

    @Test
    fun create() {
        BeneficialOwnerListParams.builder()
            .customerId("customerId")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BeneficialOwnerListParams.builder()
                .customerId("customerId")
                .cursor("cursor")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("customerId", "customerId")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BeneficialOwnerListParams.builder().customerId("customerId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("customerId", "customerId").build())
    }
}
