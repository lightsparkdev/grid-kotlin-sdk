// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TzsBeneficiaryTest {

    @Test
    fun create() {
        val tzsBeneficiary =
            TzsBeneficiary.builder()
                .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(tzsBeneficiary.beneficiaryType())
            .isEqualTo(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(tzsBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(tzsBeneficiary.address())
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
        assertThat(tzsBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(tzsBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(tzsBeneficiary.email()).isEqualTo("email")
        assertThat(tzsBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(tzsBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tzsBeneficiary =
            TzsBeneficiary.builder()
                .beneficiaryType(TzsBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedTzsBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tzsBeneficiary),
                jacksonTypeRef<TzsBeneficiary>(),
            )

        assertThat(roundtrippedTzsBeneficiary).isEqualTo(tzsBeneficiary)
    }
}
