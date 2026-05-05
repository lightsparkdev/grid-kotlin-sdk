// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.agents

import com.lightspark.grid.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentRetrieveApprovalsParamsTest {

    @Test
    fun create() {
        AgentRetrieveApprovalsParams.builder()
            .agentId("agentId")
            .cursor("cursor")
            .customerId("customerId")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .limit(1L)
            .sortOrder(AgentRetrieveApprovalsParams.SortOrder.ASC)
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AgentRetrieveApprovalsParams.builder()
                .agentId("agentId")
                .cursor("cursor")
                .customerId("customerId")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .limit(1L)
                .sortOrder(AgentRetrieveApprovalsParams.SortOrder.ASC)
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("agentId", "agentId")
                    .put("cursor", "cursor")
                    .put("customerId", "customerId")
                    .put("endDate", "2019-12-27T18:11:19.117Z")
                    .put("limit", "1")
                    .put("sortOrder", "asc")
                    .put("startDate", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AgentRetrieveApprovalsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
