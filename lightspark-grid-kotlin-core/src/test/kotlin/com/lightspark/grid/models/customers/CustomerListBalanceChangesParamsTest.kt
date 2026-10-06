// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.lightspark.grid.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerListBalanceChangesParamsTest {

    @Test
    fun create() {
        CustomerListBalanceChangesParams.builder()
            .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
            .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CustomerListBalanceChangesParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0))
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CustomerListBalanceChangesParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .cursor("cursor")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "2019-12-27T18:11:19.117Z")
                    .put("startDate", "2019-12-27T18:11:19.117Z")
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CustomerListBalanceChangesParams.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .endDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startDate(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("endDate", "2019-12-27T18:11:19.117Z")
                    .put("startDate", "2019-12-27T18:11:19.117Z")
                    .build()
            )
    }
}
