// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerGetKycLinkParamsTest {

    @Test
    fun create() {
        CustomerGetKycLinkParams.builder()
            .platformCustomerId("platformCustomerId")
            .redirectUri("redirectUri")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerGetKycLinkParams.builder()
                .platformCustomerId("platformCustomerId")
                .redirectUri("redirectUri")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("platformCustomerId", "platformCustomerId")
                    .put("redirectUri", "redirectUri")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerGetKycLinkParams.builder().platformCustomerId("platformCustomerId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("platformCustomerId", "platformCustomerId").build()
            )
    }
}
