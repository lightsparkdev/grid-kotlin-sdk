// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.auth.sessions

import com.lightspark.grid.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionListParamsTest {

    @Test
    fun create() {
        SessionListParams.builder().accountId("accountId").build()
    }

    @Test
    fun queryParams() {
        val params = SessionListParams.builder().accountId("accountId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("accountId", "accountId").build())
    }
}
