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
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankName("Banco de Colombia (Bancolombia)")
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .accountNumber("1234567890")
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .phoneNumber("+1234567890")
                .build()

        assertThat(copExternalAccountInfo.beneficiary())
            .isEqualTo(
                CopExternalAccountInfo.Beneficiary.ofIndividual(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
            )
        assertThat(copExternalAccountInfo.accountType())
            .isEqualTo(CopAccountInfo.AccountType.COP_ACCOUNT)
        assertThat(copExternalAccountInfo.bankName()).isEqualTo("Banco de Colombia (Bancolombia)")
        assertThat(copExternalAccountInfo.paymentRails())
            .containsExactly(CopAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(copExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(copExternalAccountInfo.bankAccountType())
            .isEqualTo(CopAccountInfo.BankAccountType.CHECKING)
        assertThat(copExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val copExternalAccountInfo =
            CopExternalAccountInfo.builder()
                .beneficiary(
                    CopBeneficiary.builder()
                        .beneficiaryType(CopBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                        .documentNumber("x")
                        .documentType(CopBeneficiary.DocumentType.CC)
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .accountType(CopAccountInfo.AccountType.COP_ACCOUNT)
                .bankName("Banco de Colombia (Bancolombia)")
                .addPaymentRail(CopAccountInfo.PaymentRail.BANK_TRANSFER)
                .accountNumber("1234567890")
                .bankAccountType(CopAccountInfo.BankAccountType.CHECKING)
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedCopExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(copExternalAccountInfo),
                jacksonTypeRef<CopExternalAccountInfo>(),
            )

        assertThat(roundtrippedCopExternalAccountInfo).isEqualTo(copExternalAccountInfo)
    }
}
