// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CadExternalAccountInfoTest {

    @Test
    fun create() {
        val cadExternalAccountInfo = CadExternalAccountInfo.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cadExternalAccountInfo = CadExternalAccountInfo.builder().build()

        val roundtrippedCadExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cadExternalAccountInfo),
                jacksonTypeRef<CadExternalAccountInfo>(),
            )

        assertThat(roundtrippedCadExternalAccountInfo).isEqualTo(cadExternalAccountInfo)
    }
}
