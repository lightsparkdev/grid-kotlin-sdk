// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import com.lightspark.grid.models.customers.externalaccounts.MxnBeneficiary
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MxnExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val mxnExternalAccountCreateInfo =
            MxnExternalAccountCreateInfo.builder()
                .accountType(MxnExternalAccountCreateInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .clabeNumber("123456789012345678")
                .build()

        assertThat(mxnExternalAccountCreateInfo.accountType())
            .isEqualTo(MxnExternalAccountCreateInfo.AccountType.MXN_ACCOUNT)
        assertThat(mxnExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                MxnExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(mxnExternalAccountCreateInfo.clabeNumber()).isEqualTo("123456789012345678")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mxnExternalAccountCreateInfo =
            MxnExternalAccountCreateInfo.builder()
                .accountType(MxnExternalAccountCreateInfo.AccountType.MXN_ACCOUNT)
                .beneficiary(
                    MxnBeneficiary.builder()
                        .beneficiaryType(MxnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .clabeNumber("123456789012345678")
                .build()

        val roundtrippedMxnExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mxnExternalAccountCreateInfo),
                jacksonTypeRef<MxnExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedMxnExternalAccountCreateInfo).isEqualTo(mxnExternalAccountCreateInfo)
    }
}
