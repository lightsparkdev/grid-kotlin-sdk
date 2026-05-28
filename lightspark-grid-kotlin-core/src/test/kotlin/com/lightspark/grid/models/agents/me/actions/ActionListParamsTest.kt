// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents.me.actions

import com.lightspark.grid.core.http.QueryParams
import com.lightspark.grid.models.agents.AgentActionStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionListParamsTest {

    @Test
    fun create() {
        ActionListParams.builder()
            .cursor("cursor")
            .limit(1L)
            .status(AgentActionStatus.PENDING_APPROVAL)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ActionListParams.builder()
                .cursor("cursor")
                .limit(1L)
                .status(AgentActionStatus.PENDING_APPROVAL)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("status", "PENDING_APPROVAL")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ActionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
