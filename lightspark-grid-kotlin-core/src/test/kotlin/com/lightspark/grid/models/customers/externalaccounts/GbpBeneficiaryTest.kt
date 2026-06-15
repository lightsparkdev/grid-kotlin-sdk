// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GbpBeneficiaryTest {

    @Test
    fun create() {
        val gbpBeneficiary =
            GbpBeneficiary.builder()
                .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("Jane Smith")
                .address(
                    Address.builder()
                        .country("US")
                        .line1("123 Main Street")
                        .postalCode("94105")
                        .city("San Francisco")
                        .line2("Apt 4B")
                        .state("CA")
                        .build()
                )
                .birthDate("1990-01-15")
                .countryOfResidence("GB")
                .email("jane.smith@example.com")
                .nationality("GB")
                .phoneNumber("+447700900123")
                .build()

        assertThat(gbpBeneficiary.beneficiaryType())
            .isEqualTo(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(gbpBeneficiary.fullName()).isEqualTo("Jane Smith")
        assertThat(gbpBeneficiary.address())
            .isEqualTo(
                Address.builder()
                    .country("US")
                    .line1("123 Main Street")
                    .postalCode("94105")
                    .city("San Francisco")
                    .line2("Apt 4B")
                    .state("CA")
                    .build()
            )
        assertThat(gbpBeneficiary.birthDate()).isEqualTo("1990-01-15")
        assertThat(gbpBeneficiary.countryOfResidence()).isEqualTo("GB")
        assertThat(gbpBeneficiary.email()).isEqualTo("jane.smith@example.com")
        assertThat(gbpBeneficiary.nationality()).isEqualTo("GB")
        assertThat(gbpBeneficiary.phoneNumber()).isEqualTo("+447700900123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val gbpBeneficiary =
            GbpBeneficiary.builder()
                .beneficiaryType(GbpBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("Jane Smith")
                .address(
                    Address.builder()
                        .country("US")
                        .line1("123 Main Street")
                        .postalCode("94105")
                        .city("San Francisco")
                        .line2("Apt 4B")
                        .state("CA")
                        .build()
                )
                .birthDate("1990-01-15")
                .countryOfResidence("GB")
                .email("jane.smith@example.com")
                .nationality("GB")
                .phoneNumber("+447700900123")
                .build()

        val roundtrippedGbpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(gbpBeneficiary),
                jacksonTypeRef<GbpBeneficiary>(),
            )

        assertThat(roundtrippedGbpBeneficiary).isEqualTo(gbpBeneficiary)
    }
}
