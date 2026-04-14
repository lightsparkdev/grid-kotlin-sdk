// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XafBeneficiaryTest {

    @Test
    fun create() {
        val xafBeneficiary =
            XafBeneficiary.builder()
                .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(xafBeneficiary.beneficiaryType())
            .isEqualTo(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(xafBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(xafBeneficiary.address())
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
        assertThat(xafBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(xafBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(xafBeneficiary.email()).isEqualTo("email")
        assertThat(xafBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(xafBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xafBeneficiary =
            XafBeneficiary.builder()
                .beneficiaryType(XafBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedXafBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xafBeneficiary),
                jacksonTypeRef<XafBeneficiary>(),
            )

        assertThat(roundtrippedXafBeneficiary).isEqualTo(xafBeneficiary)
    }
}
