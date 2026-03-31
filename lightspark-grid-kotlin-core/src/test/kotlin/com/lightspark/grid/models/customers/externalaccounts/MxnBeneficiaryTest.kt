// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnBeneficiaryTest {

    @Test
    fun create() {
        val mxnBeneficiary =
            MxnBeneficiary.builder()
                .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(mxnBeneficiary.beneficiaryType())
            .isEqualTo(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
        assertThat(mxnBeneficiary.fullName()).isEqualTo("fullName")
        assertThat(mxnBeneficiary.address())
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
        assertThat(mxnBeneficiary.birthDate()).isEqualTo("birthDate")
        assertThat(mxnBeneficiary.countryOfResidence()).isEqualTo("countryOfResidence")
        assertThat(mxnBeneficiary.email()).isEqualTo("email")
        assertThat(mxnBeneficiary.nationality()).isEqualTo("nationality")
        assertThat(mxnBeneficiary.phoneNumber()).isEqualTo("phoneNumber")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnBeneficiary =
            MxnBeneficiary.builder()
                .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedMxnBeneficiary =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnBeneficiary),
                jacksonTypeRef<MxnBeneficiary>(),
            )

        assertThat(roundtrippedMxnBeneficiary).isEqualTo(mxnBeneficiary)
    }
}
