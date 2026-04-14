// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.CadBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.CadAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CadExternalAccountInfoTest {

    @Test
    fun create() {
        val cadExternalAccountInfo =
            CadExternalAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .branchCode("00012")
                .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(cadExternalAccountInfo.accountNumber()).isEqualTo("1234567")
        assertThat(cadExternalAccountInfo.accountType())
            .isEqualTo(CadAccountInfo.AccountType.CAD_ACCOUNT)
        assertThat(cadExternalAccountInfo.bankCode()).isEqualTo("001")
        assertThat(cadExternalAccountInfo.branchCode()).isEqualTo("00012")
        assertThat(cadExternalAccountInfo.paymentRails())
            .containsExactly(CadAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(cadExternalAccountInfo.beneficiary())
            .isEqualTo(
                CadExternalAccountInfo.Beneficiary.ofIndividual(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val cadExternalAccountInfo =
            CadExternalAccountInfo.builder()
                .accountNumber("1234567")
                .accountType(CadAccountInfo.AccountType.CAD_ACCOUNT)
                .bankCode("001")
                .branchCode("00012")
                .addPaymentRail(CadAccountInfo.PaymentRail.BANK_TRANSFER)
                .beneficiary(
                    CadBeneficiary.builder()
                        .beneficiaryType(CadBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedCadExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cadExternalAccountInfo),
                jacksonTypeRef<CadExternalAccountInfo>(),
            )

        assertThat(roundtrippedCadExternalAccountInfo).isEqualTo(cadExternalAccountInfo)
    }
}
