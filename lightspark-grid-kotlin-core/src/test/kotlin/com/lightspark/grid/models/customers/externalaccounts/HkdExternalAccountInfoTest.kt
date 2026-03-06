// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.HkdAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HkdExternalAccountInfoTest {

    @Test
    fun create() {
        val hkdExternalAccountInfo =
            HkdExternalAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("HSBC Hong Kong")
                .addPaymentRail(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
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
                .build()

        assertThat(hkdExternalAccountInfo.accountNumber()).isEqualTo("123456789012")
        assertThat(hkdExternalAccountInfo.accountType())
            .isEqualTo(HkdAccountInfo.AccountType.HKD_ACCOUNT)
        assertThat(hkdExternalAccountInfo.bankName()).isEqualTo("HSBC Hong Kong")
        assertThat(hkdExternalAccountInfo.paymentRails())
            .containsExactly(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(hkdExternalAccountInfo.swiftCode()).isEqualTo("HSBCHKHHHKH")
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hkdExternalAccountInfo =
            HkdExternalAccountInfo.builder()
                .accountNumber("123456789012")
                .accountType(HkdAccountInfo.AccountType.HKD_ACCOUNT)
                .bankName("HSBC Hong Kong")
                .addPaymentRail(HkdAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("HSBCHKHHHKH")
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
                .build()

        val roundtrippedHkdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hkdExternalAccountInfo),
                jacksonTypeRef<HkdExternalAccountInfo>(),
            )

        assertThat(roundtrippedHkdExternalAccountInfo).isEqualTo(hkdExternalAccountInfo)
    }
}
