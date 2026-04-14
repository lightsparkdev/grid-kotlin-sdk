// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.IdrBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val idrExternalAccountCreateInfo =
            IdrExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(IdrExternalAccountCreateInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia")
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

        assertThat(idrExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(idrExternalAccountCreateInfo.accountType())
            .isEqualTo(IdrExternalAccountCreateInfo.AccountType.IDR_ACCOUNT)
        assertThat(idrExternalAccountCreateInfo.bankName()).isEqualTo("Bank Central Asia")
        assertThat(idrExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                IdrExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(idrExternalAccountCreateInfo.phoneNumber()).isEqualTo("+6281234567890")
        assertThat(idrExternalAccountCreateInfo.swiftCode()).isEqualTo("CENAIDJA")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrExternalAccountCreateInfo =
            IdrExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(IdrExternalAccountCreateInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia")
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

        val roundtrippedIdrExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrExternalAccountCreateInfo),
                jacksonTypeRef<IdrExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedIdrExternalAccountCreateInfo).isEqualTo(idrExternalAccountCreateInfo)
    }
}
