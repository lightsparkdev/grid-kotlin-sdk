// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MwkExternalAccountInfoTest {

    @Test
    fun create() {
        val mwkExternalAccountInfo =
            MwkExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("MWK_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mwkExternalAccountInfo =
            MwkExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("MWK_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()

        val roundtrippedMwkExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mwkExternalAccountInfo),
                jacksonTypeRef<MwkExternalAccountInfo>(),
            )

        assertThat(roundtrippedMwkExternalAccountInfo).isEqualTo(mwkExternalAccountInfo)
    }
}
