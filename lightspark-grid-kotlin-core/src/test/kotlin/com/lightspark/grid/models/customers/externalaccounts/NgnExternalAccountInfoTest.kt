// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.NgnBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.NgnAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NgnExternalAccountInfoTest {

    @Test
    fun create() {
        val ngnExternalAccountInfo =
            NgnExternalAccountInfo.builder()
                .beneficiary(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("Access Bank")
                .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        assertThat(ngnExternalAccountInfo.beneficiary())
            .isEqualTo(
                NgnExternalAccountInfo.Beneficiary.ofIndividual(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(ngnExternalAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(ngnExternalAccountInfo.accountType())
            .isEqualTo(NgnAccountInfo.AccountType.NGN_ACCOUNT)
        assertThat(ngnExternalAccountInfo.bankName()).isEqualTo("Access Bank")
        assertThat(ngnExternalAccountInfo.paymentRails())
            .containsExactly(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val ngnExternalAccountInfo =
            NgnExternalAccountInfo.builder()
                .beneficiary(
                    NgnBeneficiary.builder()
                        .beneficiaryType(NgnBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountNumber("0123456789")
                .accountType(NgnAccountInfo.AccountType.NGN_ACCOUNT)
                .bankName("Access Bank")
                .addPaymentRail(NgnAccountInfo.PaymentRail.BANK_TRANSFER)
                .build()

        val roundtrippedNgnExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(ngnExternalAccountInfo),
                jacksonTypeRef<NgnExternalAccountInfo>(),
            )

        assertThat(roundtrippedNgnExternalAccountInfo).isEqualTo(ngnExternalAccountInfo)
    }
}
