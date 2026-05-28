// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdExternalAccountInfoTest {

    @Test
    fun create() {
        val usdExternalAccountInfo =
            UsdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("USD_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("routingNumber", JsonValue.from("021000021"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdExternalAccountInfo =
            UsdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("USD_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("routingNumber", JsonValue.from("021000021"))
                .build()

        val roundtrippedUsdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdExternalAccountInfo),
                jacksonTypeRef<UsdExternalAccountInfo>(),
            )

        assertThat(roundtrippedUsdExternalAccountInfo).isEqualTo(usdExternalAccountInfo)
    }
}
