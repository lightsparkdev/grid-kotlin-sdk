// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RwfExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val rwfExternalAccountCreateInfo =
            RwfExternalAccountCreateInfo.builder()
                .accountType(RwfExternalAccountCreateInfo.AccountType.RWF_ACCOUNT)
                .beneficiary(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                )
                .phoneNumber("+250781234567")
                .provider("x")
                .build()

        assertThat(rwfExternalAccountCreateInfo.accountType())
            .isEqualTo(RwfExternalAccountCreateInfo.AccountType.RWF_ACCOUNT)
        assertThat(rwfExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                RwfExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                )
            )
        assertThat(rwfExternalAccountCreateInfo.phoneNumber()).isEqualTo("+250781234567")
        assertThat(rwfExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val rwfExternalAccountCreateInfo =
            RwfExternalAccountCreateInfo.builder()
                .accountType(RwfExternalAccountCreateInfo.AccountType.RWF_ACCOUNT)
                .beneficiary(
                    RwfBeneficiary.builder()
                        .beneficiaryType(RwfBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                )
                .phoneNumber("+250781234567")
                .provider("x")
                .build()

        val roundtrippedRwfExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(rwfExternalAccountCreateInfo),
                jacksonTypeRef<RwfExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedRwfExternalAccountCreateInfo).isEqualTo(rwfExternalAccountCreateInfo)
    }
}
