// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.MyrAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MyrExternalAccountInfoTest {

    @Test
    fun create() {
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("Maybank")
                .addPaymentRail(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("MABORUMMYYY")
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
                .build()

        assertThat(myrExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(myrExternalAccountInfo.accountType())
            .isEqualTo(MyrAccountInfo.AccountType.MYR_ACCOUNT)
        assertThat(myrExternalAccountInfo.bankName()).isEqualTo("Maybank")
        assertThat(myrExternalAccountInfo.paymentRails())
            .containsExactly(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(myrExternalAccountInfo.swiftCode()).isEqualTo("MABORUMMYYY")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val myrExternalAccountInfo =
            MyrExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(MyrAccountInfo.AccountType.MYR_ACCOUNT)
                .bankName("Maybank")
                .addPaymentRail(MyrAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("MABORUMMYYY")
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
                .build()

        val roundtrippedMyrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(myrExternalAccountInfo),
                jacksonTypeRef<MyrExternalAccountInfo>(),
            )

        assertThat(roundtrippedMyrExternalAccountInfo).isEqualTo(myrExternalAccountInfo)
    }
}
