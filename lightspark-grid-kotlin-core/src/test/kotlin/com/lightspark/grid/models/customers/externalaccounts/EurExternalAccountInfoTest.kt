// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EurExternalAccountInfoTest {

    @Test
    fun create() {
        val eurExternalAccountInfo =
            EurExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("EUR_ACCOUNT"))
                .putAdditionalProperty("iban", JsonValue.from("DE89370400440532013000"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DEUTDEFF"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eurExternalAccountInfo =
            EurExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("EUR_ACCOUNT"))
                .putAdditionalProperty("iban", JsonValue.from("DE89370400440532013000"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DEUTDEFF"))
                .build()

        val roundtrippedEurExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eurExternalAccountInfo),
                jacksonTypeRef<EurExternalAccountInfo>(),
            )

        assertThat(roundtrippedEurExternalAccountInfo).isEqualTo(eurExternalAccountInfo)
    }
}
