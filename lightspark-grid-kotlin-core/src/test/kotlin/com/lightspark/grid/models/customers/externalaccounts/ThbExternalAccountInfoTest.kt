// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThbExternalAccountInfoTest {

    @Test
    fun create() {
        val thbExternalAccountInfo =
            ThbExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("THB_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("BKKBTHBK"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thbExternalAccountInfo =
            ThbExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("THB_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("BKKBTHBK"))
                .build()

        val roundtrippedThbExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbExternalAccountInfo),
                jacksonTypeRef<ThbExternalAccountInfo>(),
            )

        assertThat(roundtrippedThbExternalAccountInfo).isEqualTo(thbExternalAccountInfo)
    }
}
