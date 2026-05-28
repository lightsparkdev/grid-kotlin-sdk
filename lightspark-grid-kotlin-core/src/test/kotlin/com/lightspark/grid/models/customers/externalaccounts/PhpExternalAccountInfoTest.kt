// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.JsonValue
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpExternalAccountInfoTest {

    @Test
    fun create() {
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("PHP_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("BDO Unibank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("001234567890"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .putAdditionalProperty("accountType", JsonValue.from("PHP_ACCOUNT"))
                .putAdditionalProperty("bankName", JsonValue.from("BDO Unibank"))
                .putAdditionalProperty("accountNumber", JsonValue.from("001234567890"))
                .build()

        val roundtrippedPhpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpExternalAccountInfo),
                jacksonTypeRef<PhpExternalAccountInfo>(),
            )

        assertThat(roundtrippedPhpExternalAccountInfo).isEqualTo(phpExternalAccountInfo)
    }
}
