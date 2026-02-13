// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InrBeneficiaryTest {

    @Test
    fun create() {
        val inrBeneficiary =
            InrBeneficiary.builder()
                .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    InrBeneficiary.Address.builder()
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

        assertThat(inrBeneficiary.beneficiaryType())
            .isEqualTo(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(inrBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(inrBeneficiary.address())
            .isEqualTo(
                InrBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(inrBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(inrBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(inrBeneficiary.email()).isEqualTo("email")
        assertThat(inrBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(inrBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(inrBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrBeneficiary =
            InrBeneficiary.builder()
                .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    InrBeneficiary.Address.builder()
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

        val roundtrippedInrBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrBeneficiary),
                jacksonTypeRef<InrBeneficiary>(),
            )

        assertThat(roundtrippedInrBeneficiary).isEqualTo(inrBeneficiary)
    }
}
