// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HkdExternalAccountInfoTest {

    @Test
    fun create() {
        val hkdExternalAccountInfo =
            HkdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("HKD_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("123456789012"))
                .putAdditionalProperty("swiftCode", JsonValue.from("HSBCHKHHHKH"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdExternalAccountInfo =
            HkdExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("HKD_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("123456789012"))
                .putAdditionalProperty("swiftCode", JsonValue.from("HSBCHKHHHKH"))
                .build()

        val roundtrippedHkdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdExternalAccountInfo),
                jacksonTypeRef<HkdExternalAccountInfo>(),
            )

        assertThat(roundtrippedHkdExternalAccountInfo).isEqualTo(hkdExternalAccountInfo)
    }
}
