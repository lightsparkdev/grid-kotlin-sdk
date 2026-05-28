// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrExternalAccountInfoTest {

    @Test
    fun create() {
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("IDR_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Bank Central Asia"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("CENAIDJA"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+6281234567890"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("IDR_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Bank Central Asia"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("swiftCode", JsonValue.from("CENAIDJA"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+6281234567890"))
                .build()

        val roundtrippedIdrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrExternalAccountInfo),
                jacksonTypeRef<IdrExternalAccountInfo>(),
            )

        assertThat(roundtrippedIdrExternalAccountInfo).isEqualTo(idrExternalAccountInfo)
    }
}
