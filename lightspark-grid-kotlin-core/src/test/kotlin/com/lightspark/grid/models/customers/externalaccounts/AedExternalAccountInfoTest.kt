// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AedExternalAccountInfoTest {

    @Test
    fun create() {
        val aedExternalAccountInfo =
            AedExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("AED_ACCOUNT"))
                .putAdditionalProperty("iban", JsonValue.from("AE070331234567890123456"))
                .putAdditionalProperty("swiftCode", JsonValue.from("EBILAEAD"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aedExternalAccountInfo =
            AedExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("AED_ACCOUNT"))
                .putAdditionalProperty("iban", JsonValue.from("AE070331234567890123456"))
                .putAdditionalProperty("swiftCode", JsonValue.from("EBILAEAD"))
                .build()

        val roundtrippedAedExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aedExternalAccountInfo),
                jacksonTypeRef<AedExternalAccountInfo>(),
            )

        assertThat(roundtrippedAedExternalAccountInfo).isEqualTo(aedExternalAccountInfo)
    }
}
