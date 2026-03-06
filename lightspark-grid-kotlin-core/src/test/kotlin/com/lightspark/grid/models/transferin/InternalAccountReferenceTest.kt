// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountReferenceTest {

    @Test
    fun create() {
        val internalAccountReference =
            InternalAccountReference.builder()
                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        assertThat(internalAccountReference.accountId())
            .isEqualTo("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountReference =
            InternalAccountReference.builder()
                .accountId("InternalAccount:a12dcbd6-dced-4ec4-b756-3c3a9ea3d123")
                .build()

        val roundtrippedInternalAccountReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountReference),
                jacksonTypeRef<InternalAccountReference>(),
            )

        assertThat(roundtrippedInternalAccountReference).isEqualTo(internalAccountReference)
    }
}
