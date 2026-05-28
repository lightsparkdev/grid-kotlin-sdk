// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XafExternalAccountInfoTest {

    @Test
    fun create() {
        val xafExternalAccountInfo =
            XafExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("XAF_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .putAdditionalProperty("region", JsonValue.from("CM"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xafExternalAccountInfo =
            XafExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("XAF_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .putAdditionalProperty("region", JsonValue.from("CM"))
                .build()

        val roundtrippedXafExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xafExternalAccountInfo),
                jacksonTypeRef<XafExternalAccountInfo>(),
            )

        assertThat(roundtrippedXafExternalAccountInfo).isEqualTo(xafExternalAccountInfo)
    }
}
