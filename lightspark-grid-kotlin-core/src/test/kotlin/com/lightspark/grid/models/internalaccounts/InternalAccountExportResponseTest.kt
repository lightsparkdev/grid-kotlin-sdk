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
                    "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                )
                .build()

        assertThat(internalAccountExportResponse.id())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(internalAccountExportResponse.encryptedWalletCredentials())
            .isEqualTo(
                "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val internalAccountExportResponse =
            InternalAccountExportResponse.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .encryptedWalletCredentials(
                    "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
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
