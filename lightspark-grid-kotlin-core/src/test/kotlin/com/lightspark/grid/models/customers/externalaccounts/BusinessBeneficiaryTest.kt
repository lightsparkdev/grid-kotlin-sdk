// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BusinessBeneficiaryTest {

    @Test
    fun create() {
        val businessBeneficiary =
            BusinessBeneficiary.builder()
                .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                .legalName("legalName")
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
                .countryOfResidence("countryOfResidence")
                .email("email")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .taxId("taxId")
                .build()

        assertThat(businessBeneficiary.beneficiaryType())
            .isEqualTo(BusinessBeneficiary.BeneficiaryType.BUSINESS)
        assertThat(businessBeneficiary.legalName()).isEqualTo("legalName")
        assertThat(businessBeneficiary.address())
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
        assertThat(businessBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(businessBeneficiary.email()).isEqualTo("email")
        assertThat(businessBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
        assertThat(businessBeneficiary.registrationNumber()).isEqualTo("registrationNumber")
        assertThat(businessBeneficiary.taxId()).isEqualTo("taxId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val businessBeneficiary =
            BusinessBeneficiary.builder()
                .beneficiaryType(BusinessBeneficiary.BeneficiaryType.BUSINESS)
                .legalName("legalName")
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
                .countryOfResidence("countryOfResidence")
                .email("email")
                .phoneNumber("phoneNumber")
                .registrationNumber("registrationNumber")
                .taxId("taxId")
                .build()

        val roundtrippedBusinessBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(businessBeneficiary),
                jacksonTypeRef<BusinessBeneficiary>(),
            )

        assertThat(roundtrippedBusinessBeneficiary).isEqualTo(businessBeneficiary)
    }
}
