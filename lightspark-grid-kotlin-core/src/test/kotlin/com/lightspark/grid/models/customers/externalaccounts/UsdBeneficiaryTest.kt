// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdBeneficiaryTest {

    @Test
    fun create() {
        val usdBeneficiary =
            UsdBeneficiary.builder()
                .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(usdBeneficiary.beneficiaryType())
            .isEqualTo(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(usdBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(usdBeneficiary.address())
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
        assertThat(usdBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(usdBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(usdBeneficiary.email()).isEqualTo("email")
        assertThat(usdBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(usdBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdBeneficiary =
            UsdBeneficiary.builder()
                .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedUsdBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdBeneficiary),
                jacksonTypeRef<UsdBeneficiary>(),
            )

        assertThat(roundtrippedUsdBeneficiary).isEqualTo(usdBeneficiary)
    }
}
