// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ThbExternalAccountInfoTest {

    @Test
    fun create() {
        val thbExternalAccountInfo =
            ThbExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("Bangkok Bank")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(ThbExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BKKBTHBK")
                .build()

        assertThat(thbExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(thbExternalAccountInfo.accountType())
            .isEqualTo(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
        assertThat(thbExternalAccountInfo.bankName()).isEqualTo("Bangkok Bank")
        assertThat(thbExternalAccountInfo.beneficiary())
            .isEqualTo(
                ThbExternalAccountInfo.Beneficiary.ofIndividual(
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(thbExternalAccountInfo.paymentRails())
            .containsExactly(ThbExternalAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(thbExternalAccountInfo.swiftCode()).isEqualTo("BKKBTHBK")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val thbExternalAccountInfo =
            ThbExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(ThbExternalAccountInfo.AccountType.THB_ACCOUNT)
                .bankName("Bangkok Bank")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addPaymentRail(ThbExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BKKBTHBK")
                .build()

        val roundtrippedThbExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(thbExternalAccountInfo),
                jacksonTypeRef<ThbExternalAccountInfo>(),
            )

        assertThat(roundtrippedThbExternalAccountInfo).isEqualTo(thbExternalAccountInfo)
    }
}
