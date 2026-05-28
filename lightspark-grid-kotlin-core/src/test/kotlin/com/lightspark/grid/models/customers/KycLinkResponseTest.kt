// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycLinkResponseTest {

    @Test
    fun create() {
        val kycLinkResponse =
            KycLinkResponse.builder()
                .expiresAt(OffsetDateTime.parse("2027-01-15T14:32:00Z"))
                .kycUrl("https://kyc.lightspark.com/onboard/abc123def456")
                .provider(KycLinkResponse.Provider.SUMSUB)
                .token("_act-sbx-jwt-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
                .build()

        assertThat(kycLinkResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2027-01-15T14:32:00Z"))
        assertThat(kycLinkResponse.kycUrl())
            .isEqualTo("https://kyc.lightspark.com/onboard/abc123def456")
        assertThat(kycLinkResponse.provider()).isEqualTo(KycLinkResponse.Provider.SUMSUB)
        assertThat(kycLinkResponse.token())
            .isEqualTo("_act-sbx-jwt-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kycLinkResponse =
            KycLinkResponse.builder()
                .expiresAt(OffsetDateTime.parse("2027-01-15T14:32:00Z"))
                .kycUrl("https://kyc.lightspark.com/onboard/abc123def456")
                .provider(KycLinkResponse.Provider.SUMSUB)
                .token("_act-sbx-jwt-eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...")
                .build()

        val roundtrippedKycLinkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kycLinkResponse),
                jacksonTypeRef<KycLinkResponse>(),
            )

        assertThat(roundtrippedKycLinkResponse).isEqualTo(kycLinkResponse)
    }
}
