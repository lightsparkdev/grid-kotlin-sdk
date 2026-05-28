// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolanaWalletInfoTest {

    @Test
    fun create() {
        val solanaWalletInfo = SolanaWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val solanaWalletInfo = SolanaWalletInfo.builder().build()

        val roundtrippedSolanaWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(solanaWalletInfo),
                jacksonTypeRef<SolanaWalletInfo>(),
            )

        assertThat(roundtrippedSolanaWalletInfo).isEqualTo(solanaWalletInfo)
    }
}
