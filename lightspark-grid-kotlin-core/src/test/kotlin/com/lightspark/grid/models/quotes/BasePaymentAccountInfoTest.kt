// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.quotes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BasePaymentAccountInfoTest {

    @Test
    fun create() {
        val basePaymentAccountInfo = BasePaymentAccountInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val basePaymentAccountInfo = BasePaymentAccountInfo.builder().build()

        val roundtrippedBasePaymentAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(basePaymentAccountInfo),
                jacksonTypeRef<BasePaymentAccountInfo>(),
            )

        assertThat(roundtrippedBasePaymentAccountInfo).isEqualTo(basePaymentAccountInfo)
    }
}
