// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.discoveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DiscoveryListResponseTest {

    @Test
    fun create() {
        val discoveryListResponse =
            DiscoveryListResponse.builder()
                .addData(
                    DiscoveryListResponse.Data.builder()
                        .bankName("bankName")
                        .country("country")
                        .currency("currency")
                        .displayName("displayName")
                        .build()
                )
                .build()

        assertThat(discoveryListResponse.data())
            .containsExactly(
                DiscoveryListResponse.Data.builder()
                    .bankName("bankName")
                    .country("country")
                    .currency("currency")
                    .displayName("displayName")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val discoveryListResponse =
            DiscoveryListResponse.builder()
                .addData(
                    DiscoveryListResponse.Data.builder()
                        .bankName("bankName")
                        .country("country")
                        .currency("currency")
                        .displayName("displayName")
                        .build()
                )
                .build()

        val roundtrippedDiscoveryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(discoveryListResponse),
                jacksonTypeRef<DiscoveryListResponse>(),
            )

        assertThat(roundtrippedDiscoveryListResponse).isEqualTo(discoveryListResponse)
    }
}
