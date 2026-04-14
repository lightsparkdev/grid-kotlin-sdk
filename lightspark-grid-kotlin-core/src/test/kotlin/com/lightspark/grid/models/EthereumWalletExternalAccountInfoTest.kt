// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EthereumWalletExternalAccountInfoTest {

    @Test
    fun create() {
        val ethereumWalletExternalAccountInfo =
            EthereumWalletExternalAccountInfo.builder()
                .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        assertThat(ethereumWalletExternalAccountInfo.accountType())
            .isEqualTo(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
        assertThat(ethereumWalletExternalAccountInfo.address())
            .isEqualTo("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ethereumWalletExternalAccountInfo =
            EthereumWalletExternalAccountInfo.builder()
                .accountType(EthereumWalletExternalAccountInfo.AccountType.ETHEREUM_WALLET)
                .address("0xAbCDEF1234567890aBCdEf1234567890ABcDef12")
                .build()

        val roundtrippedEthereumWalletExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ethereumWalletExternalAccountInfo),
                jacksonTypeRef<EthereumWalletExternalAccountInfo>(),
            )

        assertThat(roundtrippedEthereumWalletExternalAccountInfo)
            .isEqualTo(ethereumWalletExternalAccountInfo)
    }
}
