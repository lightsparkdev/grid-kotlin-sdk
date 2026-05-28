// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JmdExternalAccountInfoTest {

    @Test
    fun create() {
        val jmdExternalAccountInfo =
            JmdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("JMD_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("branchCode", JsonValue.from("11111"))
                .putAdditionalProperty("bankAccountType", JsonValue.from("CHECKING"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jmdExternalAccountInfo =
            JmdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("JMD_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("branchCode", JsonValue.from("11111"))
                .putAdditionalProperty("bankAccountType", JsonValue.from("CHECKING"))
                .build()

        val roundtrippedJmdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jmdExternalAccountInfo),
                jacksonTypeRef<JmdExternalAccountInfo>(),
            )

        assertThat(roundtrippedJmdExternalAccountInfo).isEqualTo(jmdExternalAccountInfo)
    }
}
