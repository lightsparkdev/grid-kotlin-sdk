// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MwkBeneficiaryTest {

    @Test
    fun create() {
        val mwkBeneficiary =
            MwkBeneficiary.builder()
                .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(mwkBeneficiary.beneficiaryType())
            .isEqualTo(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(mwkBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(mwkBeneficiary.address())
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
        assertThat(mwkBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(mwkBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(mwkBeneficiary.email()).isEqualTo("email")
        assertThat(mwkBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(mwkBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mwkBeneficiary =
            MwkBeneficiary.builder()
                .beneficiaryType(MwkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedMwkBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mwkBeneficiary),
                jacksonTypeRef<MwkBeneficiary>(),
            )

        assertThat(roundtrippedMwkBeneficiary).isEqualTo(mwkBeneficiary)
    }
}
