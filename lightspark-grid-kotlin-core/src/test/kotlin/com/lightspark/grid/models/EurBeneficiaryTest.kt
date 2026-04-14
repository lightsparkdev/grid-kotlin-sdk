// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EurBeneficiaryTest {

    @Test
    fun create() {
        val eurBeneficiary =
            EurBeneficiary.builder()
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
                .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .build()

        assertThat(eurBeneficiary.address())
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
        assertThat(eurBeneficiary.beneficiaryType())
            .isEqualTo(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(eurBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(eurBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(eurBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(eurBeneficiary.email()).isEqualTo("email")
        assertThat(eurBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(eurBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eurBeneficiary =
            EurBeneficiary.builder()
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
                .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                .fullName("fullName")
                .birthDate("birthDate")
                .countryOfResidence("countryOfResidence")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .build()

        val roundtrippedEurBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eurBeneficiary),
                jacksonTypeRef<EurBeneficiary>(),
            )

        assertThat(roundtrippedEurBeneficiary).isEqualTo(eurBeneficiary)
    }
}
