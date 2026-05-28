// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkExternalAccountInfoTest {

    @Test
    fun create() {
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("DKK_ACCOUNT"))
                .putAdditionalProperty("iban", JsonValue.from("DK5000400040116243"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DABADKKK"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("DKK_ACCOUNT"))
                .putAdditionalProperty("iban", JsonValue.from("DK5000400040116243"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DABADKKK"))
                .build()

        val roundtrippedDkkExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkExternalAccountInfo),
                jacksonTypeRef<DkkExternalAccountInfo>(),
            )

        assertThat(roundtrippedDkkExternalAccountInfo).isEqualTo(dkkExternalAccountInfo)
    }
}
