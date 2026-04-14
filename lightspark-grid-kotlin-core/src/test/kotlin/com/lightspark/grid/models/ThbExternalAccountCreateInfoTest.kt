// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.ThbBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThbExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val thbExternalAccountCreateInfo =
            ThbExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbExternalAccountCreateInfo.AccountType.THB_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("BKKBTHBK")
                .build()

        assertThat(thbExternalAccountCreateInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(thbExternalAccountCreateInfo.accountType())
            .isEqualTo(ThbExternalAccountCreateInfo.AccountType.THB_ACCOUNT)
        assertThat(thbExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(thbExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                ThbExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(thbExternalAccountCreateInfo.swiftCode()).isEqualTo("BKKBTHBK")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thbExternalAccountCreateInfo =
            ThbExternalAccountCreateInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbExternalAccountCreateInfo.AccountType.THB_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    ThbBeneficiary.builder()
                        .beneficiaryType(ThbBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .swiftCode("BKKBTHBK")
                .build()

        val roundtrippedThbExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbExternalAccountCreateInfo),
                jacksonTypeRef<ThbExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedThbExternalAccountCreateInfo).isEqualTo(thbExternalAccountCreateInfo)
    }
}
