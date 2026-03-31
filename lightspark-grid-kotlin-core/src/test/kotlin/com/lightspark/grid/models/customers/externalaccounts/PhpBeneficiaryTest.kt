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
                .build()

        assertThat(phpBeneficiary.beneficiaryType())
            .isEqualTo(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(phpBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(phpBeneficiary.address())
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
        assertThat(phpBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(phpBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(phpBeneficiary.email()).isEqualTo("email")
        assertThat(phpBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(phpBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpBeneficiary =
            PhpBeneficiary.builder()
                .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val roundtrippedPhpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpBeneficiary),
                jacksonTypeRef<PhpBeneficiary>(),
            )

        assertThat(roundtrippedPhpBeneficiary).isEqualTo(phpBeneficiary)
    }
}
