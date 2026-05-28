// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountUpdateRequestTest {

    @Test
    fun create() {
        val internalAccountUpdateRequest =
            InternalAccountUpdateRequest.builder().privateEnabled(true).build()

        assertThat(internalAccountUpdateRequest.privateEnabled()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountUpdateRequest =
            InternalAccountUpdateRequest.builder().privateEnabled(true).build()

        val roundtrippedInternalAccountUpdateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountUpdateRequest),
                jacksonTypeRef<InternalAccountUpdateRequest>(),
            )

        assertThat(roundtrippedInternalAccountUpdateRequest).isEqualTo(internalAccountUpdateRequest)
    }
}
