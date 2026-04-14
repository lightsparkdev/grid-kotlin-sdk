// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XofBeneficiaryTest {

    @Test
    fun create() {
        val xofBeneficiary =
            XofBeneficiary.builder()
                .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(xofBeneficiary.beneficiaryType())
            .isEqualTo(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(xofBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(xofBeneficiary.address())
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
        assertThat(xofBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(xofBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(xofBeneficiary.email()).isEqualTo("email")
        assertThat(xofBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(xofBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xofBeneficiary =
            XofBeneficiary.builder()
                .beneficiaryType(XofBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedXofBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xofBeneficiary),
                jacksonTypeRef<XofBeneficiary>(),
            )

        assertThat(roundtrippedXofBeneficiary).isEqualTo(xofBeneficiary)
    }
}
