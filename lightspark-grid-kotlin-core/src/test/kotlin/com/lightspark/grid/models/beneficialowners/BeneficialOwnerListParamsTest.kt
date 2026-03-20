// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.beneficialowners

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficialOwnerListParamsTest {

    @Test
    fun create() {
        BeneficialOwnerListParams.builder()
            .cursor("cursor")
            .customerId("customerId")
            .limit(1L)
            .role(BeneficialOwnerListParams.Role.UBO)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BeneficialOwnerListParams.builder()
                .cursor("cursor")
                .customerId("customerId")
                .limit(1L)
                .role(BeneficialOwnerListParams.Role.UBO)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("customerId", "customerId")
                    .put("limit", "1")
                    .put("role", "UBO")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BeneficialOwnerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
