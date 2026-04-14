// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UgxBeneficiaryTest {

    @Test
    fun create() {
        val ugxBeneficiary =
            UgxBeneficiary.builder()
                .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(ugxBeneficiary.beneficiaryType())
            .isEqualTo(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(ugxBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(ugxBeneficiary.address())
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
        assertThat(ugxBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(ugxBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(ugxBeneficiary.email()).isEqualTo("email")
        assertThat(ugxBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(ugxBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ugxBeneficiary =
            UgxBeneficiary.builder()
                .beneficiaryType(UgxBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedUgxBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ugxBeneficiary),
                jacksonTypeRef<UgxBeneficiary>(),
            )

        assertThat(roundtrippedUgxBeneficiary).isEqualTo(ugxBeneficiary)
    }
}
