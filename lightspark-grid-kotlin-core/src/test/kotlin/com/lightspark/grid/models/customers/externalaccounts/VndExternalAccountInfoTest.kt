// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VndExternalAccountInfoTest {

    @Test
    fun create() {
        val vndExternalAccountInfo =
            VndExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("Vietcombank")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(VndExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BFTVVNVX")
                .build()

        assertThat(vndExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(vndExternalAccountInfo.accountType())
            .isEqualTo(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
        assertThat(vndExternalAccountInfo.bankName()).isEqualTo("Vietcombank")
        assertThat(vndExternalAccountInfo.beneficiary())
            .isEqualTo(
                VndExternalAccountInfo.Beneficiary.ofIndividual(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(vndExternalAccountInfo.paymentRails())
            .containsExactly(VndExternalAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(vndExternalAccountInfo.swiftCode()).isEqualTo("BFTVVNVX")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val vndExternalAccountInfo =
            VndExternalAccountInfo.builder()
                .accountNumber("1234567890")
                .accountType(VndExternalAccountInfo.AccountType.VND_ACCOUNT)
                .bankName("Vietcombank")
                .beneficiary(
                    VndBeneficiary.builder()
                        .beneficiaryType(VndBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .addPaymentRail(VndExternalAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("BFTVVNVX")
                .build()

        val roundtrippedVndExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(vndExternalAccountInfo),
                jacksonTypeRef<VndExternalAccountInfo>(),
            )

        assertThat(roundtrippedVndExternalAccountInfo).isEqualTo(vndExternalAccountInfo)
    }
}
