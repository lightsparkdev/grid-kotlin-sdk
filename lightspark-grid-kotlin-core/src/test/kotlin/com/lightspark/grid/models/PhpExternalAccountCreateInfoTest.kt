// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.PhpBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val phpExternalAccountCreateInfo =
            PhpExternalAccountCreateInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountCreateInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(phpExternalAccountCreateInfo.accountNumber()).isEqualTo("001234567890")
        assertThat(phpExternalAccountCreateInfo.accountType())
            .isEqualTo(PhpExternalAccountCreateInfo.AccountType.PHP_ACCOUNT)
        assertThat(phpExternalAccountCreateInfo.bankName()).isEqualTo("BDO Unibank")
        assertThat(phpExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                PhpExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val phpExternalAccountCreateInfo =
            PhpExternalAccountCreateInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountCreateInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedPhpExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpExternalAccountCreateInfo),
                jacksonTypeRef<PhpExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedPhpExternalAccountCreateInfo).isEqualTo(phpExternalAccountCreateInfo)
    }
}
