// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpBeneficiaryTest {

    @Test
    fun create() {
        val phpBeneficiary =
            PhpBeneficiary.builder()
                .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    PhpBeneficiary.Address.builder()
                        .country("country")
                        .line1("line1")
                        .postalCode("postalCode")
                        .city("city")
                        .line2("line2")
                        .state("state")
                        .build()
                )
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        assertThat(phpBeneficiary.beneficiaryType())
            .isEqualTo(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(phpBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(phpBeneficiary.address())
            .isEqualTo(
                PhpBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(phpBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(phpBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(phpBeneficiary.email()).isEqualTo("email")
        assertThat(phpBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(phpBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(phpBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpBeneficiary =
            PhpBeneficiary.builder()
                .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    PhpBeneficiary.Address.builder()
                        .country("country")
                        .line1("line1")
                        .postalCode("postalCode")
                        .city("city")
                        .line2("line2")
                        .state("state")
                        .build()
                )
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .build()

        val roundtrippedPhpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpBeneficiary),
                jacksonTypeRef<PhpBeneficiary>(),
            )

        assertThat(roundtrippedPhpBeneficiary).isEqualTo(phpBeneficiary)
    }
}
