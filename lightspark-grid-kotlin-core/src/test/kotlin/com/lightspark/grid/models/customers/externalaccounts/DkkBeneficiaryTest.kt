// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkBeneficiaryTest {

    @Test
    fun create() {
        val dkkBeneficiary =
            DkkBeneficiary.builder()
                .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    DkkBeneficiary.Address.builder()
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

        assertThat(dkkBeneficiary.beneficiaryType())
            .isEqualTo(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(dkkBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(dkkBeneficiary.address())
            .isEqualTo(
                DkkBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(dkkBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(dkkBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(dkkBeneficiary.email()).isEqualTo("email")
        assertThat(dkkBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(dkkBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(dkkBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dkkBeneficiary =
            DkkBeneficiary.builder()
                .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    DkkBeneficiary.Address.builder()
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

        val roundtrippedDkkBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkBeneficiary),
                jacksonTypeRef<DkkBeneficiary>(),
            )

        assertThat(roundtrippedDkkBeneficiary).isEqualTo(dkkBeneficiary)
    }
}
