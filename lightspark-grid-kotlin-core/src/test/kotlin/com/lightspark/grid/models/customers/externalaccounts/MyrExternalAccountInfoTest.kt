// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrExternalAccountInfoTest {

    @Test
    fun create() {
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(MyrExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(myrExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(myrExternalAccountInfo.accountType())
            .isEqualTo(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
        assertThat(myrExternalAccountInfo.bankName()).isEqualTo("bankName")
        assertThat(myrExternalAccountInfo.beneficiary())
            .isEqualTo(
                MyrExternalAccountInfo.Beneficiary.ofIndividual(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(myrExternalAccountInfo.paymentRails())
            .containsExactly(MyrExternalAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(MyrExternalAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("bankName")
                .beneficiary(
                    MyrBeneficiary.builder()
                        .beneficiaryType(MyrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(MyrExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedMyrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrExternalAccountInfo),
                jacksonTypeRef<MyrExternalAccountInfo>(),
            )

        assertThat(roundtrippedMyrExternalAccountInfo).isEqualTo(myrExternalAccountInfo)
    }
}
