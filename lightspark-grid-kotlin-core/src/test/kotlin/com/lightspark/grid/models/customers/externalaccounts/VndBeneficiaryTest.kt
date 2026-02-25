// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VndBeneficiaryTest {

    @Test
    fun create() {
        val vndBeneficiary =
            VndBeneficiary.builder()
                .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(vndBeneficiary.beneficiaryType())
            .isEqualTo(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(vndBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(vndBeneficiary.address())
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
        assertThat(vndBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(vndBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(vndBeneficiary.email()).isEqualTo("email")
        assertThat(vndBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(vndBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(vndBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vndBeneficiary =
            VndBeneficiary.builder()
                .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedVndBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vndBeneficiary),
                jacksonTypeRef<VndBeneficiary>(),
            )

        assertThat(roundtrippedVndBeneficiary).isEqualTo(vndBeneficiary)
    }
}
