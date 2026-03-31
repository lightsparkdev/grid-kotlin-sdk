// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrBeneficiaryTest {

    @Test
    fun create() {
        val myrBeneficiary =
            MyrBeneficiary.builder()
                .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(myrBeneficiary.beneficiaryType())
            .isEqualTo(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(myrBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(myrBeneficiary.address())
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
        assertThat(myrBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(myrBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(myrBeneficiary.email()).isEqualTo("email")
        assertThat(myrBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(myrBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrBeneficiary =
            MyrBeneficiary.builder()
                .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedMyrBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrBeneficiary),
                jacksonTypeRef<MyrBeneficiary>(),
            )

        assertThat(roundtrippedMyrBeneficiary).isEqualTo(myrBeneficiary)
    }
}
