// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VndExternalAccountInfoTest {

    @Test
    fun create() {
        val vndExternalAccountInfo =
            VndExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("VND_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("BFTVVNVX"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vndExternalAccountInfo =
            VndExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("VND_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("BFTVVNVX"))
                .build()

        val roundtrippedVndExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vndExternalAccountInfo),
                jacksonTypeRef<VndExternalAccountInfo>(),
            )

        assertThat(roundtrippedVndExternalAccountInfo).isEqualTo(vndExternalAccountInfo)
    }
}
