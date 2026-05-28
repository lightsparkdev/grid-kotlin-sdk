// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.sandbox.internalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FundRequestTest {

    @Test
    fun create() {
        val fundRequest = FundRequest.builder().amount(100000L).build()

        assertThat(fundRequest.amount()).isEqualTo(100000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fundRequest = FundRequest.builder().amount(100000L).build()

        val roundtrippedFundRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fundRequest),
                jacksonTypeRef<FundRequest>(),
            )

        assertThat(roundtrippedFundRequest).isEqualTo(fundRequest)
    }
}
