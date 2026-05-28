// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BdtExternalAccountInfoTest {

    @Test
    fun create() {
        val bdtExternalAccountInfo =
            BdtExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("BDT_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("branchCode", JsonValue.from("11111"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DEUTDEFF"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bdtExternalAccountInfo =
            BdtExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("BDT_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("branchCode", JsonValue.from("11111"))
                .putAdditionalProperty("swiftCode", JsonValue.from("DEUTDEFF"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .build()

        val roundtrippedBdtExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bdtExternalAccountInfo),
                jacksonTypeRef<BdtExternalAccountInfo>(),
            )

        assertThat(roundtrippedBdtExternalAccountInfo).isEqualTo(bdtExternalAccountInfo)
    }
}
