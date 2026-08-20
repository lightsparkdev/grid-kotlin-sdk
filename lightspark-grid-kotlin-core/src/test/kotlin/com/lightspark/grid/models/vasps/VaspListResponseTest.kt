// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.vasps

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VaspListResponseTest {

    @Test
    fun create() {
        val vaspListResponse =
            VaspListResponse.builder()
                .addData(Vasp.builder().vaspName("Kraken").url("https://www.kraken.com").build())
                .hasMore(true)
                .nextCursor("nextCursor")
                .build()

        assertThat(vaspListResponse.data())
            .containsExactly(
                Vasp.builder().vaspName("Kraken").url("https://www.kraken.com").build()
            )
        assertThat(vaspListResponse.hasMore()).isEqualTo(true)
        assertThat(vaspListResponse.nextCursor()).isEqualTo("nextCursor")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vaspListResponse =
            VaspListResponse.builder()
                .addData(Vasp.builder().vaspName("Kraken").url("https://www.kraken.com").build())
                .hasMore(true)
                .nextCursor("nextCursor")
                .build()

        val roundtrippedVaspListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vaspListResponse),
                jacksonTypeRef<VaspListResponse>(),
            )

        assertThat(roundtrippedVaspListResponse).isEqualTo(vaspListResponse)
    }
}
