// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EthereumWalletExternalAccountInfoTest {

    @Test
    fun create() {
        val ethereumWalletExternalAccountInfo = EthereumWalletExternalAccountInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ethereumWalletExternalAccountInfo = EthereumWalletExternalAccountInfo.builder().build()

        val roundtrippedEthereumWalletExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ethereumWalletExternalAccountInfo),
                jacksonTypeRef<EthereumWalletExternalAccountInfo>(),
            )

        assertThat(roundtrippedEthereumWalletExternalAccountInfo)
            .isEqualTo(ethereumWalletExternalAccountInfo)
    }
}
