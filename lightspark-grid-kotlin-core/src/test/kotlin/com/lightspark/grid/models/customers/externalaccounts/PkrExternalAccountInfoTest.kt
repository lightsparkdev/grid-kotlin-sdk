// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PkrExternalAccountInfoTest {

    @Test
    fun create() {
        val pkrExternalAccountInfo =
            PkrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("PKR_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("iban", JsonValue.from("PK36SCBL0000001123456702"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pkrExternalAccountInfo =
            PkrExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("PKR_ACCOUNT"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("iban", JsonValue.from("PK36SCBL0000001123456702"))
                .putAdditionalProperty("phoneNumber", JsonValue.from("+1234567890"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .build()

        val roundtrippedPkrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pkrExternalAccountInfo),
                jacksonTypeRef<PkrExternalAccountInfo>(),
            )

        assertThat(roundtrippedPkrExternalAccountInfo).isEqualTo(pkrExternalAccountInfo)
    }
}
