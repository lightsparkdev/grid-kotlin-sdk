// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZarExternalAccountInfoTest {

    @Test
    fun create() {
        val zarExternalAccountInfo =
            ZarExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("ZAR_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zarExternalAccountInfo =
            ZarExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("ZAR_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()

        val roundtrippedZarExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zarExternalAccountInfo),
                jacksonTypeRef<ZarExternalAccountInfo>(),
            )

        assertThat(roundtrippedZarExternalAccountInfo).isEqualTo(zarExternalAccountInfo)
    }
}
