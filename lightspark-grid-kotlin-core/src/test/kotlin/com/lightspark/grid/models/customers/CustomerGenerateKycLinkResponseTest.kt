// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CustomerGenerateKycLinkResponseTest {

    @Test
    fun create() {
        val customerGenerateKycLinkResponse =
            CustomerGenerateKycLinkResponse.builder()
                .expiresAt(OffsetDateTime.parse("2027-01-15T14:32:00Z"))
                .kycUrl("https://kyc.lightspark.com/onboard/abc123def456")
                .provider(CustomerGenerateKycLinkResponse.Provider.SUMSUB)
                .token("_act-sbx-jwt-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
                .build()

        assertThat(customerGenerateKycLinkResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2027-01-15T14:32:00Z"))
        assertThat(customerGenerateKycLinkResponse.kycUrl())
            .isEqualTo("https://kyc.lightspark.com/onboard/abc123def456")
        assertThat(customerGenerateKycLinkResponse.provider())
            .isEqualTo(CustomerGenerateKycLinkResponse.Provider.SUMSUB)
        assertThat(customerGenerateKycLinkResponse.token())
            .isEqualTo("_act-sbx-jwt-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val customerGenerateKycLinkResponse =
            CustomerGenerateKycLinkResponse.builder()
                .expiresAt(OffsetDateTime.parse("2027-01-15T14:32:00Z"))
                .kycUrl("https://kyc.lightspark.com/onboard/abc123def456")
                .provider(CustomerGenerateKycLinkResponse.Provider.SUMSUB)
                .token("_act-sbx-jwt-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
                .build()

        val roundtrippedCustomerGenerateKycLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(customerGenerateKycLinkResponse),
                jacksonTypeRef<CustomerGenerateKycLinkResponse>(),
            )

        assertThat(roundtrippedCustomerGenerateKycLinkResponse)
            .isEqualTo(customerGenerateKycLinkResponse)
    }
}
