// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TronWalletInfoTest {

    @Test
    fun create() {
        val tronWalletInfo = TronWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tronWalletInfo = TronWalletInfo.builder().build()

        val roundtrippedTronWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tronWalletInfo),
                jacksonTypeRef<TronWalletInfo>(),
            )

        assertThat(roundtrippedTronWalletInfo).isEqualTo(tronWalletInfo)
    }
}
