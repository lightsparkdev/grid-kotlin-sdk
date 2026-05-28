// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlExternalAccountInfoTest {

    @Test
    fun create() {
        val brlExternalAccountInfo =
            BrlExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("BRL_ACCOUNT"))
                .putAdditionalProperty("pixKey", JsonValue.from("user@example.com"))
                .putAdditionalProperty("pixKeyType", JsonValue.from("CPF"))
                .putAdditionalProperty("taxId", JsonValue.from("11111111111"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlExternalAccountInfo =
            BrlExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("BRL_ACCOUNT"))
                .putAdditionalProperty("pixKey", JsonValue.from("user@example.com"))
                .putAdditionalProperty("pixKeyType", JsonValue.from("CPF"))
                .putAdditionalProperty("taxId", JsonValue.from("11111111111"))
                .build()

        val roundtrippedBrlExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlExternalAccountInfo),
                jacksonTypeRef<BrlExternalAccountInfo>(),
            )

        assertThat(roundtrippedBrlExternalAccountInfo).isEqualTo(brlExternalAccountInfo)
    }
}
