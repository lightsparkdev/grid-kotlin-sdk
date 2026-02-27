// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpExternalAccountInfoTest {

    @Test
    fun create() {
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(PhpExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(phpExternalAccountInfo.accountNumber()).isEqualTo("001234567890")
        assertThat(phpExternalAccountInfo.accountType())
            .isEqualTo(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
        assertThat(phpExternalAccountInfo.bankName()).isEqualTo("BDO Unibank")
        assertThat(phpExternalAccountInfo.beneficiary())
            .isEqualTo(
                PhpExternalAccountInfo.Beneficiary.ofIndividual(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(phpExternalAccountInfo.paymentRails())
            .containsExactly(PhpExternalAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpExternalAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .beneficiary(
                    PhpBeneficiary.builder()
                        .beneficiaryType(PhpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(PhpExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedPhpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpExternalAccountInfo),
                jacksonTypeRef<PhpExternalAccountInfo>(),
            )

        assertThat(roundtrippedPhpExternalAccountInfo).isEqualTo(phpExternalAccountInfo)
    }
}
