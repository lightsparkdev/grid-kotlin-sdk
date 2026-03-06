// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BeneficiaryVerifiedDataTest {

    @Test
    fun create() {
        val beneficiaryVerifiedData = BeneficiaryVerifiedData.builder().fullName("John Doe").build()

        assertThat(beneficiaryVerifiedData.fullName()).isEqualTo("John Doe")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val beneficiaryVerifiedData = BeneficiaryVerifiedData.builder().fullName("John Doe").build()

        val roundtrippedBeneficiaryVerifiedData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(beneficiaryVerifiedData),
                jacksonTypeRef<BeneficiaryVerifiedData>(),
            )

        assertThat(roundtrippedBeneficiaryVerifiedData).isEqualTo(beneficiaryVerifiedData)
    }
}
