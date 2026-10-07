// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XofExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val xofExternalAccountCreateInfo =
            XofExternalAccountCreateInfo.builder()
                .accountType(XofExternalAccountCreateInfo.AccountType.XOF_ACCOUNT)
                .beneficiary(
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
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofExternalAccountCreateInfo.Region.BJ)
                .build()

        assertThat(xofExternalAccountCreateInfo.accountType())
            .isEqualTo(XofExternalAccountCreateInfo.AccountType.XOF_ACCOUNT)
        assertThat(xofExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                XofExternalAccountCreateInfo.Beneficiary.ofIndividual(
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
                )
            )
        assertThat(xofExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(xofExternalAccountCreateInfo.provider()).isEqualTo("x")
        assertThat(xofExternalAccountCreateInfo.region())
            .isEqualTo(XofExternalAccountCreateInfo.Region.BJ)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xofExternalAccountCreateInfo =
            XofExternalAccountCreateInfo.builder()
                .accountType(XofExternalAccountCreateInfo.AccountType.XOF_ACCOUNT)
                .beneficiary(
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
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XofExternalAccountCreateInfo.Region.BJ)
                .build()

        val roundtrippedXofExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xofExternalAccountCreateInfo),
                jacksonTypeRef<XofExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedXofExternalAccountCreateInfo).isEqualTo(xofExternalAccountCreateInfo)
    }
}
