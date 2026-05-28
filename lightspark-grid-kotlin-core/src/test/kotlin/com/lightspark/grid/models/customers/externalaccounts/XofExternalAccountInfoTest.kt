// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XofExternalAccountInfoTest {

    @Test
    fun create() {
        val xofExternalAccountInfo =
            XofExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("XOF_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .putAdditionalProperty("region", JsonValue.from("BJ"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xofExternalAccountInfo =
            XofExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("XOF_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .putAdditionalProperty("region", JsonValue.from("BJ"))
                .build()

        val roundtrippedXofExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xofExternalAccountInfo),
                jacksonTypeRef<XofExternalAccountInfo>(),
            )

        assertThat(roundtrippedXofExternalAccountInfo).isEqualTo(xofExternalAccountInfo)
    }
}
