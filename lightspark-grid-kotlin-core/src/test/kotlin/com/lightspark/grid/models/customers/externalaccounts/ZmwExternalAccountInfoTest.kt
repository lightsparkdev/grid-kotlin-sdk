// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZmwExternalAccountInfoTest {

    @Test
    fun create() {
        val zmwExternalAccountInfo =
            ZmwExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("ZMW_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+260971234567"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zmwExternalAccountInfo =
            ZmwExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("ZMW_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+260971234567"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()

        val roundtrippedZmwExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zmwExternalAccountInfo),
                jacksonTypeRef<ZmwExternalAccountInfo>(),
            )

        assertThat(roundtrippedZmwExternalAccountInfo).isEqualTo(zmwExternalAccountInfo)
    }
}
