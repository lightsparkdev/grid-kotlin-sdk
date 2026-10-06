// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.IdrAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IdrExternalAccountInfoTest {

    @Test
    fun create() {
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
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
                        .build()
                )
                .accountNumber("1234567890")
                .accountType(IdrAccountInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia (BCA)")
                .addPaymentRail(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

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
                        .build()
                )
            )
        assertThat(idrExternalAccountInfo.accountNumber()).isEqualTo("1234567890")
        assertThat(idrExternalAccountInfo.accountType())
            .isEqualTo(IdrAccountInfo.AccountType.IDR_ACCOUNT)
        assertThat(idrExternalAccountInfo.bankName()).isEqualTo("Bank Central Asia (BCA)")
        assertThat(idrExternalAccountInfo.paymentRails())
            .containsExactly(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(idrExternalAccountInfo.phoneNumber()).isEqualTo("+6281234567890")
        assertThat(idrExternalAccountInfo.swiftCode()).isEqualTo("CENAIDJA")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val idrExternalAccountInfo =
            IdrExternalAccountInfo.builder()
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
                        .build()
                )
                .accountNumber("1234567890")
                .accountType(IdrAccountInfo.AccountType.IDR_ACCOUNT)
                .bankName("Bank Central Asia (BCA)")
                .addPaymentRail(IdrAccountInfo.PaymentRail.BANK_TRANSFER)
                .phoneNumber("+6281234567890")
                .swiftCode("CENAIDJA")
                .build()

        val roundtrippedIdrExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(idrExternalAccountInfo),
                jacksonTypeRef<IdrExternalAccountInfo>(),
            )

        assertThat(roundtrippedIdrExternalAccountInfo).isEqualTo(idrExternalAccountInfo)
    }
}
