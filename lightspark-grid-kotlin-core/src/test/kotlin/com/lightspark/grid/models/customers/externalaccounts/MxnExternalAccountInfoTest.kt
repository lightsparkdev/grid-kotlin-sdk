// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnExternalAccountInfoTest {

    @Test
    fun create() {
        val mxnExternalAccountInfo =
            MxnExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("MXN_ACCOUNT"))
                .putAdditionalProperty("clabeNumber", JsonValue.from("123456789012345678"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnExternalAccountInfo =
            MxnExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("MXN_ACCOUNT"))
                .putAdditionalProperty("clabeNumber", JsonValue.from("123456789012345678"))
                .build()

        val roundtrippedMxnExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnExternalAccountInfo),
                jacksonTypeRef<MxnExternalAccountInfo>(),
            )

        assertThat(roundtrippedMxnExternalAccountInfo).isEqualTo(mxnExternalAccountInfo)
    }
}
