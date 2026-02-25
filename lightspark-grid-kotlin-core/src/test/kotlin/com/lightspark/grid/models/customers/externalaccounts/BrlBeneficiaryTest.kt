// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrlBeneficiaryTest {

    @Test
    fun create() {
        val brlBeneficiary =
            BrlBeneficiary.builder()
                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(brlBeneficiary.beneficiaryType())
            .isEqualTo(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(brlBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(brlBeneficiary.address())
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
        assertThat(brlBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(brlBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(brlBeneficiary.email()).isEqualTo("email")
        assertThat(brlBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(brlBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(brlBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brlBeneficiary =
            BrlBeneficiary.builder()
                .beneficiaryType(BrlBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBrlBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brlBeneficiary),
                jacksonTypeRef<BrlBeneficiary>(),
            )

        assertThat(roundtrippedBrlBeneficiary).isEqualTo(brlBeneficiary)
    }
}
