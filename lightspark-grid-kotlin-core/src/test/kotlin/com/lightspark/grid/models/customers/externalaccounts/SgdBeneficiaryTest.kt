// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdBeneficiaryTest {

    @Test
    fun create() {
        val sgdBeneficiary =
            SgdBeneficiary.builder()
                .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(sgdBeneficiary.beneficiaryType())
            .isEqualTo(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(sgdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(sgdBeneficiary.address())
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
        assertThat(sgdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(sgdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(sgdBeneficiary.email()).isEqualTo("email")
        assertThat(sgdBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(sgdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdBeneficiary =
            SgdBeneficiary.builder()
                .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedSgdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdBeneficiary),
                jacksonTypeRef<SgdBeneficiary>(),
            )

        assertThat(roundtrippedSgdBeneficiary).isEqualTo(sgdBeneficiary)
    }
}
