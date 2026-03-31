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

        assertThat(inrBeneficiary.beneficiaryType())
            .isEqualTo(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(inrBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(inrBeneficiary.address())
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
        assertThat(inrBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(inrBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(inrBeneficiary.email()).isEqualTo("email")
        assertThat(inrBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(inrBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inrBeneficiary =
            InrBeneficiary.builder()
                .beneficiaryType(InrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedInrBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inrBeneficiary),
                jacksonTypeRef<InrBeneficiary>(),
            )

        assertThat(roundtrippedInrBeneficiary).isEqualTo(inrBeneficiary)
    }
}
