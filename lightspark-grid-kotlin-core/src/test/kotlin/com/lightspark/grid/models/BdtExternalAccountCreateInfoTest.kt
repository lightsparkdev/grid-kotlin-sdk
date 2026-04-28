// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BdtExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val bdtExternalAccountCreateInfo =
            BdtExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
                .beneficiary(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .phoneNumber("+1234567890")
                .branchCode("21029")
                .swiftCode("DEUTDEFF")
                .build()

        assertThat(bdtExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(bdtExternalAccountCreateInfo.accountType())
            .isEqualTo(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
        assertThat(bdtExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                BdtExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(bdtExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(bdtExternalAccountCreateInfo.branchCode()).isEqualTo("21029")
        assertThat(bdtExternalAccountCreateInfo.swiftCode()).isEqualTo("DEUTDEFF")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bdtExternalAccountCreateInfo =
            BdtExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(BdtExternalAccountCreateInfo.AccountType.BDT_ACCOUNT)
                .beneficiary(
                    BdtBeneficiary.builder()
                        .beneficiaryType(BdtBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .phoneNumber("+1234567890")
                .branchCode("21029")
                .swiftCode("DEUTDEFF")
                .build()

        val roundtrippedBdtExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bdtExternalAccountCreateInfo),
                jacksonTypeRef<BdtExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedBdtExternalAccountCreateInfo).isEqualTo(bdtExternalAccountCreateInfo)
    }
}
