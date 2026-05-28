// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EgpExternalAccountInfoTest {

    @Test
    fun create() {
        val egpExternalAccountInfo =
            EgpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("EGP_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("iban", JsonValue.from("EG380019000500000000263180002"))
                .putAdditionalProperty("swiftCode", JsonValue.from("NBEGEGCX"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpExternalAccountInfo =
            EgpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("EGP_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("Example Bank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("1234567890"))
                .putAdditionalProperty("iban", JsonValue.from("EG380019000500000000263180002"))
                .putAdditionalProperty("swiftCode", JsonValue.from("NBEGEGCX"))
                .build()

        val roundtrippedEgpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpExternalAccountInfo),
                jacksonTypeRef<EgpExternalAccountInfo>(),
            )

        assertThat(roundtrippedEgpExternalAccountInfo).isEqualTo(egpExternalAccountInfo)
    }
}
