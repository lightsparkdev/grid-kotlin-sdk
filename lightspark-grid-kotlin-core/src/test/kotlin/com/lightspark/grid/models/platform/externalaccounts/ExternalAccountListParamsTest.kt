// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountListParamsTest {

    @Test
    fun create() {
        ExternalAccountListParams.builder().currency("currency").build()
    }

    @Test
    fun queryParams() {
        val params = ExternalAccountListParams.builder().currency("currency").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("currency", "currency").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ExternalAccountListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
