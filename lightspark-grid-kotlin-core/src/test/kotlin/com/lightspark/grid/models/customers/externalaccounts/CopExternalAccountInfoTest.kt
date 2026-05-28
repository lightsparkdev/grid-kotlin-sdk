// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopExternalAccountInfoTest {

    @Test
    fun create() {
        val copExternalAccountInfo =
            CopExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("COP_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Bancolombia"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("bankAccountType", JsonValue.from("CHECKING"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copExternalAccountInfo =
            CopExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("COP_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Bancolombia"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("bankAccountType", JsonValue.from("CHECKING"))
                .build()

        val roundtrippedCopExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copExternalAccountInfo),
                jacksonTypeRef<CopExternalAccountInfo>(),
            )

        assertThat(roundtrippedCopExternalAccountInfo).isEqualTo(copExternalAccountInfo)
    }
}
