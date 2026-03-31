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

        assertThat(hkdBeneficiary.beneficiaryType())
            .isEqualTo(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(hkdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(hkdBeneficiary.address())
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
        assertThat(hkdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(hkdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(hkdBeneficiary.email()).isEqualTo("email")
        assertThat(hkdBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(hkdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdBeneficiary =
            HkdBeneficiary.builder()
                .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedHkdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdBeneficiary),
                jacksonTypeRef<HkdBeneficiary>(),
            )

        assertThat(roundtrippedHkdBeneficiary).isEqualTo(hkdBeneficiary)
    }
}
