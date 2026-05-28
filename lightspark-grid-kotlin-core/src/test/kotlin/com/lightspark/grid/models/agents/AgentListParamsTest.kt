// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentListParamsTest {

    @Test
    fun create() {
        AgentListParams.builder()
            .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .customerId("customerId")
            .isConnected(true)
            .isPaused(true)
            .limit(1L)
            .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentListParams.builder()
                .createdAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .customerId("customerId")
                .isConnected(true)
                .isPaused(true)
                .limit(1L)
                .updatedAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .updatedBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("createdAfter", "2019-12-27T18:11:19.117Z")
                    .put("createdBefore", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("customerId", "customerId")
                    .put("isConnected", "true")
                    .put("isPaused", "true")
                    .put("limit", "1")
                    .put("updatedAfter", "2019-12-27T18:11:19.117Z")
                    .put("updatedBefore", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
