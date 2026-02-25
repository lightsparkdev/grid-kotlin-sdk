// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrBeneficiaryTest {

    @Test
    fun create() {
        val idrBeneficiary =
            IdrBeneficiary.builder()
                .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(idrBeneficiary.beneficiaryType())
            .isEqualTo(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(idrBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(idrBeneficiary.address())
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
        assertThat(idrBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(idrBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(idrBeneficiary.email()).isEqualTo("email")
        assertThat(idrBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(idrBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(idrBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrBeneficiary =
            IdrBeneficiary.builder()
                .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedIdrBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrBeneficiary),
                jacksonTypeRef<IdrBeneficiary>(),
            )

        assertThat(roundtrippedIdrBeneficiary).isEqualTo(idrBeneficiary)
    }
}
