// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrExternalAccountInfoTest {

    @Test
    fun create() {
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("INR_ACCOUNT"))
                .putAdditionalProperty("vpa", JsonValue.from("user@upi"))
                .putAdditionalProperty("accountNumber", JsonValue.from("000111222333"))
                .putAdditionalProperty("ifsc", JsonValue.from("HDFC0001234"))
                .putAdditionalProperty("rail", JsonValue.from("NEFT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrExternalAccountInfo =
            InrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("INR_ACCOUNT"))
                .putAdditionalProperty("vpa", JsonValue.from("user@upi"))
                .putAdditionalProperty("accountNumber", JsonValue.from("000111222333"))
                .putAdditionalProperty("ifsc", JsonValue.from("HDFC0001234"))
                .putAdditionalProperty("rail", JsonValue.from("NEFT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()

        val roundtrippedInrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrExternalAccountInfo),
                jacksonTypeRef<InrExternalAccountInfo>(),
            )

        assertThat(roundtrippedInrExternalAccountInfo).isEqualTo(inrExternalAccountInfo)
    }
}
