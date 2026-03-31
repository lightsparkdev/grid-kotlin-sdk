// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.discoveries

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscoveryListParamsTest {

    @Test
    fun create() {
        DiscoveryListParams.builder().country("country").currency("currency").build()
    }

    @Test
    fun queryParams() {
        val params = DiscoveryListParams.builder().country("country").currency("currency").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("country", "country").put("currency", "currency").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DiscoveryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
