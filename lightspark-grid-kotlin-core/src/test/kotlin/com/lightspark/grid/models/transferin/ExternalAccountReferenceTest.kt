// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.transferin

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalAccountReferenceTest {

    @Test
    fun create() {
        val externalAccountReference =
            ExternalAccountReference.builder()
                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .build()

        assertThat(externalAccountReference.accountId())
            .isEqualTo("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalAccountReference =
            ExternalAccountReference.builder()
                .accountId("ExternalAccount:e85dcbd6-dced-4ec4-b756-3c3a9ea3d965")
                .build()

        val roundtrippedExternalAccountReference =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalAccountReference),
                jacksonTypeRef<ExternalAccountReference>(),
            )

        assertThat(roundtrippedExternalAccountReference).isEqualTo(externalAccountReference)
    }
}
