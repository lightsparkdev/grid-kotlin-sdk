// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycLinkCreateRequestTest {

    @Test
    fun create() {
        val kycLinkCreateRequest =
            KycLinkCreateRequest.builder()
                .redirectUri("https://app.example.com/onboarding/completed")
                .build()

        assertThat(kycLinkCreateRequest.redirectUri())
            .isEqualTo("https://app.example.com/onboarding/completed")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kycLinkCreateRequest =
            KycLinkCreateRequest.builder()
                .redirectUri("https://app.example.com/onboarding/completed")
                .build()

        val roundtrippedKycLinkCreateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kycLinkCreateRequest),
                jacksonTypeRef<KycLinkCreateRequest>(),
            )

        assertThat(roundtrippedKycLinkCreateRequest).isEqualTo(kycLinkCreateRequest)
    }
}
