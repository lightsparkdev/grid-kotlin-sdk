// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TzsExternalAccountInfoTest {

    @Test
    fun create() {
        val tzsExternalAccountInfo =
            TzsExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("TZS_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+255712345678"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tzsExternalAccountInfo =
            TzsExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("TZS_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+255712345678"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()

        val roundtrippedTzsExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tzsExternalAccountInfo),
                jacksonTypeRef<TzsExternalAccountInfo>(),
            )

        assertThat(roundtrippedTzsExternalAccountInfo).isEqualTo(tzsExternalAccountInfo)
    }
}
