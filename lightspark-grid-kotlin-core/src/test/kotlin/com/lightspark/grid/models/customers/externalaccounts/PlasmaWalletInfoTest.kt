// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlasmaWalletInfoTest {

    @Test
    fun create() {
        val plasmaWalletInfo = PlasmaWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val plasmaWalletInfo = PlasmaWalletInfo.builder().build()

        val roundtrippedPlasmaWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(plasmaWalletInfo),
                jacksonTypeRef<PlasmaWalletInfo>(),
            )

        assertThat(roundtrippedPlasmaWalletInfo).isEqualTo(plasmaWalletInfo)
    }
}
