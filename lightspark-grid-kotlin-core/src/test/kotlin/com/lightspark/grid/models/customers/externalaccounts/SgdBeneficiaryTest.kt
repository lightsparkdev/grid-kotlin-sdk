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
                    SgdBeneficiary.Address.builder()
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

        assertThat(sgdBeneficiary.beneficiaryType())
            .isEqualTo(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(sgdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(sgdBeneficiary.address())
            .isEqualTo(
                SgdBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(sgdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(sgdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(sgdBeneficiary.email()).isEqualTo("email")
        assertThat(sgdBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(sgdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(sgdBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdBeneficiary =
            SgdBeneficiary.builder()
                .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    SgdBeneficiary.Address.builder()
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

        val roundtrippedSgdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdBeneficiary),
                jacksonTypeRef<SgdBeneficiary>(),
            )

        assertThat(roundtrippedSgdBeneficiary).isEqualTo(sgdBeneficiary)
    }
}
