// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HtgExternalAccountInfoTest {

    @Test
    fun create() {
        val htgExternalAccountInfo =
            HtgExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("HTG_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val htgExternalAccountInfo =
            HtgExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("HTG_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .build()

        val roundtrippedHtgExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(htgExternalAccountInfo),
                jacksonTypeRef<HtgExternalAccountInfo>(),
            )

        assertThat(roundtrippedHtgExternalAccountInfo).isEqualTo(htgExternalAccountInfo)
    }
}
