// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KesExternalAccountInfoTest {

    @Test
    fun create() {
        val kesExternalAccountInfo =
            KesExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("KES_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+254712345678"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kesExternalAccountInfo =
            KesExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("KES_ACCOUNT"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+254712345678"))
                .putAdditionalProperty("provider", JsonValue.from("Example Provider"))
                .build()

        val roundtrippedKesExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kesExternalAccountInfo),
                jacksonTypeRef<KesExternalAccountInfo>(),
            )

        assertThat(roundtrippedKesExternalAccountInfo).isEqualTo(kesExternalAccountInfo)
    }
}
