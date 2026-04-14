// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class XafExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val xafExternalAccountCreateInfo =
            XafExternalAccountCreateInfo.builder()
                .accountType(XafExternalAccountCreateInfo.AccountType.XAF_ACCOUNT)
                .beneficiary(
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
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafExternalAccountCreateInfo.Region.CM)
                .build()

        assertThat(xafExternalAccountCreateInfo.accountType())
            .isEqualTo(XafExternalAccountCreateInfo.AccountType.XAF_ACCOUNT)
        assertThat(xafExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                XafExternalAccountCreateInfo.Beneficiary.ofIndividual(
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
                )
            )
        assertThat(xafExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(xafExternalAccountCreateInfo.provider()).isEqualTo("x")
        assertThat(xafExternalAccountCreateInfo.region())
            .isEqualTo(XafExternalAccountCreateInfo.Region.CM)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val xafExternalAccountCreateInfo =
            XafExternalAccountCreateInfo.builder()
                .accountType(XafExternalAccountCreateInfo.AccountType.XAF_ACCOUNT)
                .beneficiary(
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
                )
                .phoneNumber("+1234567890")
                .provider("x")
                .region(XafExternalAccountCreateInfo.Region.CM)
                .build()

        val roundtrippedXafExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(xafExternalAccountCreateInfo),
                jacksonTypeRef<XafExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedXafExternalAccountCreateInfo).isEqualTo(xafExternalAccountCreateInfo)
    }
}
