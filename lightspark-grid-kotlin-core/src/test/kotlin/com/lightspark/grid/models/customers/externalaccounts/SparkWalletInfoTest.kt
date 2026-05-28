// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SparkWalletInfoTest {

    @Test
    fun create() {
        val sparkWalletInfo = SparkWalletInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sparkWalletInfo = SparkWalletInfo.builder().build()

        val roundtrippedSparkWalletInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sparkWalletInfo),
                jacksonTypeRef<SparkWalletInfo>(),
            )

        assertThat(roundtrippedSparkWalletInfo).isEqualTo(sparkWalletInfo)
    }
}
