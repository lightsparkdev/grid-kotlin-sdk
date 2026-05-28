// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GtqExternalAccountInfoTest {

    @Test
    fun create() {
        val gtqExternalAccountInfo =
            GtqExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("GTQ_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("bankAccountType", JsonValue.from("CHECKING"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gtqExternalAccountInfo =
            GtqExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("GTQ_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("bankAccountType", JsonValue.from("CHECKING"))
                .build()

        val roundtrippedGtqExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gtqExternalAccountInfo),
                jacksonTypeRef<GtqExternalAccountInfo>(),
            )

        assertThat(roundtrippedGtqExternalAccountInfo).isEqualTo(gtqExternalAccountInfo)
    }
}
