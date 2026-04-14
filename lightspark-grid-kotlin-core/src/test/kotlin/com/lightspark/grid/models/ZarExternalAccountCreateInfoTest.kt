// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ZarExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val zarExternalAccountCreateInfo =
            ZarExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarExternalAccountCreateInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        assertThat(zarExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(zarExternalAccountCreateInfo.accountType())
            .isEqualTo(ZarExternalAccountCreateInfo.AccountType.ZAR_ACCOUNT)
        assertThat(zarExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(zarExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                ZarExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val zarExternalAccountCreateInfo =
            ZarExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(ZarExternalAccountCreateInfo.AccountType.ZAR_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    ZarBeneficiary.builder()
                        .beneficiaryType(ZarBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val roundtrippedZarExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(zarExternalAccountCreateInfo),
                jacksonTypeRef<ZarExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedZarExternalAccountCreateInfo).isEqualTo(zarExternalAccountCreateInfo)
    }
}
