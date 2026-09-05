// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WalletCustodyFieldsTest {

    @Test
    fun create() {
        val walletCustodyFields = WalletCustodyFields.builder().vaspName("Kraken").build()

        assertThat(walletCustodyFields.vaspName()).isEqualTo("Kraken")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val walletCustodyFields = WalletCustodyFields.builder().vaspName("Kraken").build()

        val roundtrippedWalletCustodyFields =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(walletCustodyFields),
                jacksonTypeRef<WalletCustodyFields>(),
            )

        assertThat(roundtrippedWalletCustodyFields).isEqualTo(walletCustodyFields)
    }
}
