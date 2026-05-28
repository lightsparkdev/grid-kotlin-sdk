// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpExternalAccountInfoTest {

    @Test
    fun create() {
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("GBP_ACCOUNT"))
                .putAdditionalProperty("sortCode", JsonValue.from("123456"))
                .putAdditionalProperty("accountNumber", JsonValue.from("12345678"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpExternalAccountInfo =
            GbpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("GBP_ACCOUNT"))
                .putAdditionalProperty("sortCode", JsonValue.from("123456"))
                .putAdditionalProperty("accountNumber", JsonValue.from("12345678"))
                .build()

        val roundtrippedGbpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpExternalAccountInfo),
                jacksonTypeRef<GbpExternalAccountInfo>(),
            )

        assertThat(roundtrippedGbpExternalAccountInfo).isEqualTo(gbpExternalAccountInfo)
    }
}
