// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KesBeneficiaryTest {

    @Test
    fun create() {
        val kesBeneficiary =
            KesBeneficiary.builder()
                .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(kesBeneficiary.beneficiaryType())
            .isEqualTo(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(kesBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(kesBeneficiary.address())
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
        assertThat(kesBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(kesBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(kesBeneficiary.email()).isEqualTo("email")
        assertThat(kesBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(kesBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val kesBeneficiary =
            KesBeneficiary.builder()
                .beneficiaryType(KesBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedKesBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(kesBeneficiary),
                jacksonTypeRef<KesBeneficiary>(),
            )

        assertThat(roundtrippedKesBeneficiary).isEqualTo(kesBeneficiary)
    }
}
