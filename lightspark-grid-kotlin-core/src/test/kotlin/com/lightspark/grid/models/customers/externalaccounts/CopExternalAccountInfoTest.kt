// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.CopBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.CopAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CopExternalAccountInfoTest {

    @Test
    fun create() {
        val copExternalAccountInfo =
            CopExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        assertThat(copExternalAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(copExternalAccountInfo.accountType())
            .isEqualTo(CopAccountInfo.AccountType.COP_ACCOUNT)
        assertThat(copExternalAccountInfo.bankAccountType())
            .isEqualTo(CopAccountInfo.BankAccountType.CHECKING)
        assertThat(copExternalAccountInfo.paymentRails())
            .containsExactly(CopAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(copExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
        assertThat(copExternalAccountInfo.beneficiary())
            .isEqualTo(
                CopExternalAccountInfo.Beneficiary.ofIndividual(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copExternalAccountInfo =
            CopExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+1234567890")
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
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
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        val roundtrippedCopExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copExternalAccountInfo),
                jacksonTypeRef<CopExternalAccountInfo>(),
            )

        assertThat(roundtrippedCopExternalAccountInfo).isEqualTo(copExternalAccountInfo)
    }
}
