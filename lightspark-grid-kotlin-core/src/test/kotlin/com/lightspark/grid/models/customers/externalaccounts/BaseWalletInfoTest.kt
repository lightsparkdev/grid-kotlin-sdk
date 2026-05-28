// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseWalletInfoTest {

    @Test
    fun create() {
        val baseWalletInfo = BaseWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseWalletInfo = BaseWalletInfo.builder().build()

        val roundtrippedBaseWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseWalletInfo),
                jacksonTypeRef<BaseWalletInfo>(),
            )

        assertThat(roundtrippedBaseWalletInfo).isEqualTo(baseWalletInfo)
    }
}
