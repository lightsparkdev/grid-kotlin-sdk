// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LightningWalletInfoTest {

    @Test
    fun create() {
        val lightningWalletInfo = LightningWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lightningWalletInfo = LightningWalletInfo.builder().build()

        val roundtrippedLightningWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lightningWalletInfo),
                jacksonTypeRef<LightningWalletInfo>(),
            )

        assertThat(roundtrippedLightningWalletInfo).isEqualTo(lightningWalletInfo)
    }
}
