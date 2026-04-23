// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.internalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InternalAccountExportResponseTest {

    @Test
    fun create() {
        val internalAccountExportResponse =
            InternalAccountExportResponse.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .encryptedWalletCredentials(
                    "5KqM8nT3wJz2F9b6H1vRgLpXcA7eD4YuN0sBaE8kPyW5iVfG2xQoZ3MnK9LhU6jT1dS4rCyPbH7oVwX2AgE5uYsNq8fLzR3D7JeM1bVkWcHa9Tp"
                )
                .build()

        assertThat(internalAccountExportResponse.id())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(internalAccountExportResponse.encryptedWalletCredentials())
            .isEqualTo(
                "5KqM8nT3wJz2F9b6H1vRgLpXcA7eD4YuN0sBaE8kPyW5iVfG2xQoZ3MnK9LhU6jT1dS4rCyPbH7oVwX2AgE5uYsNq8fLzR3D7JeM1bVkWcHa9Tp"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountExportResponse =
            InternalAccountExportResponse.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .encryptedWalletCredentials(
                    "5KqM8nT3wJz2F9b6H1vRgLpXcA7eD4YuN0sBaE8kPyW5iVfG2xQoZ3MnK9LhU6jT1dS4rCyPbH7oVwX2AgE5uYsNq8fLzR3D7JeM1bVkWcHa9Tp"
                )
                .build()

        val roundtrippedInternalAccountExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(internalAccountExportResponse),
                jacksonTypeRef<InternalAccountExportResponse>(),
            )

        assertThat(roundtrippedInternalAccountExportResponse)
            .isEqualTo(internalAccountExportResponse)
    }
}
