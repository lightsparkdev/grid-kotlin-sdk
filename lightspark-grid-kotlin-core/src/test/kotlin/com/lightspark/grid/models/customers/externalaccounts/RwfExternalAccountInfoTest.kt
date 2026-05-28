// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RwfExternalAccountInfoTest {

    @Test
    fun create() {
        val rwfExternalAccountInfo =
            RwfExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("RWF_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+250781234567"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rwfExternalAccountInfo =
            RwfExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("RWF_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+250781234567"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()

        val roundtrippedRwfExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rwfExternalAccountInfo),
                jacksonTypeRef<RwfExternalAccountInfo>(),
            )

        assertThat(roundtrippedRwfExternalAccountInfo).isEqualTo(rwfExternalAccountInfo)
    }
}
