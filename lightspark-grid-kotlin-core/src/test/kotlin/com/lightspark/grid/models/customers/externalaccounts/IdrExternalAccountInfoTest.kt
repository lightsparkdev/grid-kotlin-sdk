// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrExternalAccountInfoTest {

    @Test
    fun create() {
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(IdrExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .sortCode("sortCode")
                .build()

        assertThat(idrExternalAccountInfo.accountNumber()).isEqualTo("accountNumber")
        assertThat(idrExternalAccountInfo.accountType())
            .isEqualTo(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
        assertThat(idrExternalAccountInfo.beneficiary())
            .isEqualTo(
                IdrExternalAccountInfo.Beneficiary.ofIndividual(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(idrExternalAccountInfo.paymentRails())
            .containsExactly(IdrExternalAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(idrExternalAccountInfo.sortCode()).isEqualTo("sortCode")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
                .accountNumber("accountNumber")
                .accountType(IdrExternalAccountInfo.AccountType.IDR_ACCOUNT)
                .beneficiary(
                    IdrBeneficiary.builder()
                        .beneficiaryType(IdrBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(IdrExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .sortCode("sortCode")
                .build()

        val roundtrippedIdrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrExternalAccountInfo),
                jacksonTypeRef<IdrExternalAccountInfo>(),
            )

        assertThat(roundtrippedIdrExternalAccountInfo).isEqualTo(idrExternalAccountInfo)
    }
}
