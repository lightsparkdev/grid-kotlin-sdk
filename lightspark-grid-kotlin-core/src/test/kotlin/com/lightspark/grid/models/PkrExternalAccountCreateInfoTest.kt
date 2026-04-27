// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.customers.externalaccounts.Address
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PkrExternalAccountCreateInfoTest {

    @Test
    fun create() {
        val pkrExternalAccountCreateInfo =
            PkrExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+1234567890")
                .iban("DE89370400440532013000")
                .build()

        assertThat(pkrExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(pkrExternalAccountCreateInfo.accountType())
            .isEqualTo(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
        assertThat(pkrExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(pkrExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                PkrExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(pkrExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(pkrExternalAccountCreateInfo.iban()).isEqualTo("DE89370400440532013000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pkrExternalAccountCreateInfo =
            PkrExternalAccountCreateInfo.builder()
                .accountNumber("x")
                .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
                .bankName("x")
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .phoneNumber("+1234567890")
                .iban("DE89370400440532013000")
                .build()

        val roundtrippedPkrExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pkrExternalAccountCreateInfo),
                jacksonTypeRef<PkrExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedPkrExternalAccountCreateInfo).isEqualTo(pkrExternalAccountCreateInfo)
    }
}
