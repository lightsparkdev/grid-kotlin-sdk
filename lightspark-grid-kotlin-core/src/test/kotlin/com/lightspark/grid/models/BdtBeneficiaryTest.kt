// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BdtBeneficiaryTest {

    @Test
    fun create() {
        val bdtBeneficiary =
            BdtBeneficiary.builder()
                .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(bdtBeneficiary.beneficiaryType())
            .isEqualTo(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(bdtBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(bdtBeneficiary.address())
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
        assertThat(bdtBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(bdtBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(bdtBeneficiary.email()).isEqualTo("email")
        assertThat(bdtBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(bdtBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bdtBeneficiary =
            BdtBeneficiary.builder()
                .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedBdtBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bdtBeneficiary),
                jacksonTypeRef<BdtBeneficiary>(),
            )

        assertThat(roundtrippedBdtBeneficiary).isEqualTo(bdtBeneficiary)
    }
}
