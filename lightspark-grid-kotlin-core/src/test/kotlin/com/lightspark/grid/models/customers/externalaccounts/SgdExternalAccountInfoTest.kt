// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdExternalAccountInfoTest {

    @Test
    fun create() {
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("SGD_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("DBS Bank Ltd"))
                .putAdditionalProperty("accountNumber", JsonValue.from("0123456789"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DBSSSGSG"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("SGD_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("DBS Bank Ltd"))
                .putAdditionalProperty("accountNumber", JsonValue.from("0123456789"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DBSSSGSG"))
                .build()

        val roundtrippedSgdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdExternalAccountInfo),
                jacksonTypeRef<SgdExternalAccountInfo>(),
            )

        assertThat(roundtrippedSgdExternalAccountInfo).isEqualTo(sgdExternalAccountInfo)
    }
}
