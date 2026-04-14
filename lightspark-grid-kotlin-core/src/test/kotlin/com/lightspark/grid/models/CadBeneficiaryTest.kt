// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CadBeneficiaryTest {

    @Test
    fun create() {
        val cadBeneficiary =
            CadBeneficiary.builder()
                .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
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
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        assertThat(cadBeneficiary.beneficiaryType())
            .isEqualTo(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(cadBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(cadBeneficiary.address())
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
        assertThat(cadBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(cadBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(cadBeneficiary.email()).isEqualTo("email")
        assertThat(cadBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(cadBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(cadBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cadBeneficiary =
            CadBeneficiary.builder()
                .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
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
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        val roundtrippedCadBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cadBeneficiary),
                jacksonTypeRef<CadBeneficiary>(),
            )

        assertThat(roundtrippedCadBeneficiary).isEqualTo(cadBeneficiary)
    }
}
