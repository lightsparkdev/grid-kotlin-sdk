// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerExportResponseTest {

    @Test
    fun create() {
        val customerExportResponse =
            CustomerExportResponse.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .encryptedWalletCredentials(
                    "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                )
                .build()

        assertThat(customerExportResponse.id())
            .isEqualTo("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
        assertThat(customerExportResponse.encryptedWalletCredentials())
            .isEqualTo(
                "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerExportResponse =
            CustomerExportResponse.builder()
                .id("InternalAccount:019542f5-b3e7-1d02-0000-000000000002")
                .encryptedWalletCredentials(
                    "{\"version\":\"v1.0.0\",\"data\":\"7b22656e6361707065645075626c6963223a22303433...\",\"dataSignature\":\"3045022100c9...\",\"enclaveQuorumPublic\":\"04a1b2c3...\"}"
                )
                .build()

        val roundtrippedCustomerExportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerExportResponse),
                jacksonTypeRef<CustomerExportResponse>(),
            )

        assertThat(roundtrippedCustomerExportResponse).isEqualTo(customerExportResponse)
    }
}
