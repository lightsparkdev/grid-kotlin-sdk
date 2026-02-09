// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListInternalAccountsParamsTest {

    @Test
    fun create() {
        CustomerListInternalAccountsParams.builder()
            .currency("currency")
            .cursor("cursor")
            .customerId("customerId")
            .limit(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListInternalAccountsParams.builder()
                .currency("currency")
                .cursor("cursor")
                .customerId("customerId")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("currency", "currency")
                    .put("cursor", "cursor")
                    .put("customerId", "customerId")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CustomerListInternalAccountsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
