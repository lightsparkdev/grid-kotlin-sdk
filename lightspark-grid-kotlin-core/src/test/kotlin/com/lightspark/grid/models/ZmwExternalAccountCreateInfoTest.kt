// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZmwExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val zmwExternalAccountCreateInfo =
            ZmwExternalAccountCreateInfo.builder()
                .accountType(ZmwExternalAccountCreateInfo.AccountType.ZMW_ACCOUNT)
                .beneficiary(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+260971234567")
                .provider("x")
                .build()

        assertThat(zmwExternalAccountCreateInfo.accountType())
            .isEqualTo(ZmwExternalAccountCreateInfo.AccountType.ZMW_ACCOUNT)
        assertThat(zmwExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                ZmwExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(zmwExternalAccountCreateInfo.phoneNumber()).isEqualTo("+260971234567")
        assertThat(zmwExternalAccountCreateInfo.provider()).isEqualTo("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zmwExternalAccountCreateInfo =
            ZmwExternalAccountCreateInfo.builder()
                .accountType(ZmwExternalAccountCreateInfo.AccountType.ZMW_ACCOUNT)
                .beneficiary(
                    ZmwBeneficiary.builder()
                        .beneficiaryType(ZmwBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+260971234567")
                .provider("x")
                .build()

        val roundtrippedZmwExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zmwExternalAccountCreateInfo),
                jacksonTypeRef<ZmwExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedZmwExternalAccountCreateInfo).isEqualTo(zmwExternalAccountCreateInfo)
    }
}
