// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.verifications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationRequestTest {

    @Test
    fun create() {
        val verificationRequest =
            VerificationRequest.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        assertThat(verificationRequest.customerId())
            .isEqualTo("Customer:019542f5-b3e7-1d02-0000-000000000001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationRequest =
            VerificationRequest.builder()
                .customerId("Customer:019542f5-b3e7-1d02-0000-000000000001")
                .build()

        val roundtrippedVerificationRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationRequest),
                jacksonTypeRef<VerificationRequest>(),
            )

        assertThat(roundtrippedVerificationRequest).isEqualTo(verificationRequest)
    }
}
