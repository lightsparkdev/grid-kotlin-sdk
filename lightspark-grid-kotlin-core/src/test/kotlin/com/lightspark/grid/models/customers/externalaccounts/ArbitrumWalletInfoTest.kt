// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ArbitrumWalletInfoTest {

    @Test
    fun create() {
        val arbitrumWalletInfo = ArbitrumWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val arbitrumWalletInfo = ArbitrumWalletInfo.builder().build()

        val roundtrippedArbitrumWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(arbitrumWalletInfo),
                jacksonTypeRef<ArbitrumWalletInfo>(),
            )

        assertThat(roundtrippedArbitrumWalletInfo).isEqualTo(arbitrumWalletInfo)
    }
}
