// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HkdBeneficiaryTest {

    @Test
    fun create() {
        val hkdBeneficiary =
            HkdBeneficiary.builder()
                .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    HkdBeneficiary.Address.builder()
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

        assertThat(hkdBeneficiary.beneficiaryType())
            .isEqualTo(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(hkdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(hkdBeneficiary.address())
            .isEqualTo(
                HkdBeneficiary.Address.builder()
                    .country("country")
                    .line1("line1")
                    .postalCode("postalCode")
                    .city("city")
                    .line2("line2")
                    .state("state")
                    .build()
            )
        assertThat(hkdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(hkdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(hkdBeneficiary.email()).isEqualTo("email")
        assertThat(hkdBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(hkdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(hkdBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdBeneficiary =
            HkdBeneficiary.builder()
                .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .address(
                    HkdBeneficiary.Address.builder()
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

        val roundtrippedHkdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdBeneficiary),
                jacksonTypeRef<HkdBeneficiary>(),
            )

        assertThat(roundtrippedHkdBeneficiary).isEqualTo(hkdBeneficiary)
    }
}
