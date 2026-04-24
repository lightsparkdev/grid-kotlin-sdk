// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopBeneficiaryTest {

    @Test
    fun create() {
        val copBeneficiary =
            CopBeneficiary.builder()
                .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("countryOfResidence")
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
                .documentNumber("documentNumber")
                .documentType("documentType")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .build()

        assertThat(copBeneficiary.beneficiaryType())
            .isEqualTo(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(copBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(copBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(copBeneficiary.address())
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
        assertThat(copBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(copBeneficiary.documentNumber()).isEqualTo("documentNumber")
        assertThat(copBeneficiary.documentType()).isEqualTo("documentType")
        assertThat(copBeneficiary.email()).isEqualTo("email")
        assertThat(copBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(copBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copBeneficiary =
            CopBeneficiary.builder()
                .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                .countryOfResidence("countryOfResidence")
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
                .documentNumber("documentNumber")
                .documentType("documentType")
                .email("email")
                .nationality("nationality")
                .phoneNumber("phoneNumber")
                .build()

        val roundtrippedCopBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copBeneficiary),
                jacksonTypeRef<CopBeneficiary>(),
            )

        assertThat(roundtrippedCopBeneficiary).isEqualTo(copBeneficiary)
    }
}
