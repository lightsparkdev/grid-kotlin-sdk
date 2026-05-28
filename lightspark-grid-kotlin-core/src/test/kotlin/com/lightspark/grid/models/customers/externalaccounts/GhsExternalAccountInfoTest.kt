// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GhsExternalAccountInfoTest {

    @Test
    fun create() {
        val ghsExternalAccountInfo =
            GhsExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("GHS_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ghsExternalAccountInfo =
            GhsExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("GHS_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .build()

        val roundtrippedGhsExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ghsExternalAccountInfo),
                jacksonTypeRef<GhsExternalAccountInfo>(),
            )

        assertThat(roundtrippedGhsExternalAccountInfo).isEqualTo(ghsExternalAccountInfo)
    }
}
