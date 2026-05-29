// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EgpBeneficiaryTest {

    @Test
    fun create() {
        val egpBeneficiary =
            EgpBeneficiary.builder()
                .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(egpBeneficiary.beneficiaryType())
            .isEqualTo(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(egpBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(egpBeneficiary.address())
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
        assertThat(egpBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(egpBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(egpBeneficiary.email()).isEqualTo("email")
        assertThat(egpBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(egpBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpBeneficiary =
            EgpBeneficiary.builder()
                .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedEgpBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpBeneficiary),
                jacksonTypeRef<EgpBeneficiary>(),
            )

        assertThat(roundtrippedEgpBeneficiary).isEqualTo(egpBeneficiary)
    }
}
