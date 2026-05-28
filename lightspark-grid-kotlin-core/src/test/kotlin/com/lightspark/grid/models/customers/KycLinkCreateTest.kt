// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KycLinkCreateTest {

    @Test
    fun create() {
        val kycLinkCreate =
            KycLinkCreate.builder()
                .redirectUri("https://app.example.com/onboarding/completed")
                .build()

        assertThat(kycLinkCreate.redirectUri())
            .isEqualTo("https://app.example.com/onboarding/completed")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kycLinkCreate =
            KycLinkCreate.builder()
                .redirectUri("https://app.example.com/onboarding/completed")
                .build()

        val roundtrippedKycLinkCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kycLinkCreate),
                jacksonTypeRef<KycLinkCreate>(),
            )

        assertThat(roundtrippedKycLinkCreate).isEqualTo(kycLinkCreate)
    }
}
