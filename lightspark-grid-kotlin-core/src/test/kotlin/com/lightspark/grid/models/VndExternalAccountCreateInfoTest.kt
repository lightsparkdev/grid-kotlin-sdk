// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.VndBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VndExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val vndExternalAccountCreateInfo =
            VndExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndExternalAccountCreateInfo.AccountType.VND_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("BFTVVNVX")
                .build()

        assertThat(vndExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(vndExternalAccountCreateInfo.accountType())
            .isEqualTo(VndExternalAccountCreateInfo.AccountType.VND_ACCOUNT)
        assertThat(vndExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(vndExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                VndExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(vndExternalAccountCreateInfo.swiftCode()).isEqualTo("BFTVVNVX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vndExternalAccountCreateInfo =
            VndExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndExternalAccountCreateInfo.AccountType.VND_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("BFTVVNVX")
                .build()

        val roundtrippedVndExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vndExternalAccountCreateInfo),
                jacksonTypeRef<VndExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedVndExternalAccountCreateInfo).isEqualTo(vndExternalAccountCreateInfo)
    }
}
