// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.HkdBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HkdExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val hkdExternalAccountCreateInfo =
            HkdExternalAccountCreateInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdExternalAccountCreateInfo.AccountType.HKD_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    HkdBeneficiary.builder()
                        .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("HSBCHKHHHKH")
                .build()

        assertThat(hkdExternalAccountCreateInfo.accountNumber()).isEqualTo("123456789012")
        assertThat(hkdExternalAccountCreateInfo.accountType())
            .isEqualTo(HkdExternalAccountCreateInfo.AccountType.HKD_ACCOUNT)
        assertThat(hkdExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(hkdExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                HkdExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    HkdBeneficiary.builder()
                        .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(hkdExternalAccountCreateInfo.swiftCode()).isEqualTo("HSBCHKHHHKH")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdExternalAccountCreateInfo =
            HkdExternalAccountCreateInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdExternalAccountCreateInfo.AccountType.HKD_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    HkdBeneficiary.builder()
                        .beneficiaryType(HkdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("HSBCHKHHHKH")
                .build()

        val roundtrippedHkdExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdExternalAccountCreateInfo),
                jacksonTypeRef<HkdExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedHkdExternalAccountCreateInfo).isEqualTo(hkdExternalAccountCreateInfo)
    }
}
