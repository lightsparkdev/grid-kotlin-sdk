// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HkdExternalAccountInfoTest {

    @Test
    fun create() {
        val hkdExternalAccountInfo =
            HkdExternalAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdExternalAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("HSBC Hong Kong")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(HkdExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
                .build()

        assertThat(hkdExternalAccountInfo.accountNumber()).isEqualTo("123456789012")
        assertThat(hkdExternalAccountInfo.accountType())
            .isEqualTo(HkdExternalAccountInfo.AccountType.HKD_ACCOUNT)
        assertThat(hkdExternalAccountInfo.bankName()).isEqualTo("HSBC Hong Kong")
        assertThat(hkdExternalAccountInfo.beneficiary())
            .isEqualTo(
                HkdExternalAccountInfo.Beneficiary.ofIndividual(
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(hkdExternalAccountInfo.paymentRails())
            .containsExactly(HkdExternalAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(hkdExternalAccountInfo.swiftCode()).isEqualTo("HSBCHKHHHKH")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdExternalAccountInfo =
            HkdExternalAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdExternalAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("HSBC Hong Kong")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(HkdExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
                .build()

        val roundtrippedHkdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdExternalAccountInfo),
                jacksonTypeRef<HkdExternalAccountInfo>(),
            )

        assertThat(roundtrippedHkdExternalAccountInfo).isEqualTo(hkdExternalAccountInfo)
    }
}
