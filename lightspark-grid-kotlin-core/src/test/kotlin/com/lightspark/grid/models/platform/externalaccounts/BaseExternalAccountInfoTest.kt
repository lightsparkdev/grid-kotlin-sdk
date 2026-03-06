// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.platform.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BaseExternalAccountInfoTest {

    @Test
    fun create() {
        val baseExternalAccountInfo = BaseExternalAccountInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val baseExternalAccountInfo = BaseExternalAccountInfo.builder().build()

        val roundtrippedBaseExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(baseExternalAccountInfo),
                jacksonTypeRef<BaseExternalAccountInfo>(),
            )

        assertThat(roundtrippedBaseExternalAccountInfo).isEqualTo(baseExternalAccountInfo)
    }
}
