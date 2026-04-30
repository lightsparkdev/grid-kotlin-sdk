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
                .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountNumber("x")
                .bankName("x")
                .iban("PK36SCBL0000001123456702")
                .phoneNumber("+1234567890")
                .build()

        assertThat(pkrExternalAccountCreateInfo.accountType())
            .isEqualTo(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
        assertThat(pkrExternalAccountCreateInfo.beneficiary())
            .isEqualTo(
                PkrExternalAccountCreateInfo.Beneficiary.ofIndividual(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(pkrExternalAccountCreateInfo.accountNumber()).isEqualTo("x")
        assertThat(pkrExternalAccountCreateInfo.bankName()).isEqualTo("x")
        assertThat(pkrExternalAccountCreateInfo.iban()).isEqualTo("PK36SCBL0000001123456702")
        assertThat(pkrExternalAccountCreateInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pkrExternalAccountCreateInfo =
            PkrExternalAccountCreateInfo.builder()
                .accountType(PkrExternalAccountCreateInfo.AccountType.PKR_ACCOUNT)
                .beneficiary(
                    PkrBeneficiary.builder()
                        .beneficiaryType(PkrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountNumber("x")
                .bankName("x")
                .iban("PK36SCBL0000001123456702")
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedPkrExternalAccountCreateInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(pkrExternalAccountCreateInfo),
                jacksonTypeRef<PkrExternalAccountCreateInfo>(),
            )

        assertThat(roundtrippedPkrExternalAccountCreateInfo).isEqualTo(pkrExternalAccountCreateInfo)
    }
}
