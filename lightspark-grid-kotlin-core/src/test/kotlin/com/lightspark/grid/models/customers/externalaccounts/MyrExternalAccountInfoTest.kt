// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrExternalAccountInfoTest {

    @Test
    fun create() {
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("MYR_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("MABORUMMYYY"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("MYR_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("MABORUMMYYY"))
                .build()

        val roundtrippedMyrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrExternalAccountInfo),
                jacksonTypeRef<MyrExternalAccountInfo>(),
            )

        assertThat(roundtrippedMyrExternalAccountInfo).isEqualTo(myrExternalAccountInfo)
    }
}
