// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.credentials

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialListParamsTest {

    @Test
    fun create() {
        CredentialListParams.builder().accountId("accountId").build()
    }

    @Test
    fun queryParams() {
        val params = CredentialListParams.builder().accountId("accountId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("accountId", "accountId").build())
    }
}
