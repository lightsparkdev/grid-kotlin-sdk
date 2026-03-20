// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationListParamsTest {

    @Test
    fun create() {
        VerificationListParams.builder()
            .cursor("cursor")
            .customerId("customerId")
            .limit(1L)
            .verificationStatus(VerificationListParams.VerificationStatus.RESOLVE_ERRORS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VerificationListParams.builder()
                .cursor("cursor")
                .customerId("customerId")
                .limit(1L)
                .verificationStatus(VerificationListParams.VerificationStatus.RESOLVE_ERRORS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("customerId", "customerId")
                    .put("limit", "1")
                    .put("verificationStatus", "RESOLVE_ERRORS")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VerificationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
