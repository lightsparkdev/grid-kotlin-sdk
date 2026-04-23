// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.UsdBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsdExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val usdExternalAccountCreateInfo =
            UsdExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
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
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .routingNumber("021000021")
                .build()

        assertThat(usdExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(usdExternalAccountCreateInfo.accountType())
            .isEqualTo(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
        assertThat(usdExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                UsdExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    UsdBeneficiary.builder()
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
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(usdExternalAccountCreateInfo.routingNumber()).isEqualTo("021000021")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usdExternalAccountCreateInfo =
            UsdExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(UsdExternalAccountCreateInfo.AccountType.USD_ACCOUNT)
                .beneficiary(
                    UsdBeneficiary.builder()
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
                        .beneficiaryType(UsdBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .birthDate("birthDate")
                        .fullName("fullName")
                        .nationality("nationality")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .routingNumber("021000021")
                .build()

        val roundtrippedUsdExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usdExternalAccountCreateInfo),
                jacksonTypeRef<UsdExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedUsdExternalAccountCreateInfo).isEqualTo(usdExternalAccountCreateInfo)
    }
}
