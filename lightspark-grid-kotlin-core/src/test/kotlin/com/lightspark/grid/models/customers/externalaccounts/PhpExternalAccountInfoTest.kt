// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.PhpAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhpExternalAccountInfoTest {

    @Test
    fun create() {
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .addPaymentRail(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
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
                .build()

        assertThat(phpExternalAccountInfo.accountNumber()).isEqualTo("001234567890")
        assertThat(phpExternalAccountInfo.accountType())
            .isEqualTo(PhpAccountInfo.AccountType.PHP_ACCOUNT)
        assertThat(phpExternalAccountInfo.bankName()).isEqualTo("BDO Unibank")
        assertThat(phpExternalAccountInfo.paymentRails())
            .containsExactly(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phpExternalAccountInfo =
            PhpExternalAccountInfo.builder()
                .accountNumber("001234567890")
                .accountType(PhpAccountInfo.AccountType.PHP_ACCOUNT)
                .bankName("BDO Unibank")
                .addPaymentRail(PhpAccountInfo.PaymentRail.BANK_TRANSFER)
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
                .build()

        val roundtrippedPhpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phpExternalAccountInfo),
                jacksonTypeRef<PhpExternalAccountInfo>(),
            )

        assertThat(roundtrippedPhpExternalAccountInfo).isEqualTo(phpExternalAccountInfo)
    }
}
