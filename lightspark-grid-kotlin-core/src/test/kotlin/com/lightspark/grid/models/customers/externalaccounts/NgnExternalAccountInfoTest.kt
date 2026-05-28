// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NgnExternalAccountInfoTest {

    @Test
    fun create() {
        val ngnExternalAccountInfo =
            NgnExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("NGN_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("0123456789"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ngnExternalAccountInfo =
            NgnExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("NGN_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("0123456789"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()

        val roundtrippedNgnExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ngnExternalAccountInfo),
                jacksonTypeRef<NgnExternalAccountInfo>(),
            )

        assertThat(roundtrippedNgnExternalAccountInfo).isEqualTo(ngnExternalAccountInfo)
    }
}
