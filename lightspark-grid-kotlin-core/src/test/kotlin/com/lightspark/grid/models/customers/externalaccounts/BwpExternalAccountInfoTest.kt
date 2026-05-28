// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BwpExternalAccountInfoTest {

    @Test
    fun create() {
        val bwpExternalAccountInfo =
            BwpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("BWP_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bwpExternalAccountInfo =
            BwpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("BWP_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()

        val roundtrippedBwpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bwpExternalAccountInfo),
                jacksonTypeRef<BwpExternalAccountInfo>(),
            )

        assertThat(roundtrippedBwpExternalAccountInfo).isEqualTo(bwpExternalAccountInfo)
    }
}
