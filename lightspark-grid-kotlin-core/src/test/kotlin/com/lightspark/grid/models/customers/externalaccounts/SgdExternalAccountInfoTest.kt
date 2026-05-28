// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.SgdAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdExternalAccountInfoTest {

    @Test
    fun create() {
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .addPaymentRail(SgdAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        assertThat(sgdExternalAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(sgdExternalAccountInfo.accountType())
            .isEqualTo(SgdAccountInfo.AccountType.SGD_ACCOUNT)
        assertThat(sgdExternalAccountInfo.bankName()).isEqualTo("DBS Bank Ltd")
        assertThat(sgdExternalAccountInfo.paymentRails())
            .containsExactly(SgdAccountInfo.PaymentRail.PAYNOW)
        assertThat(sgdExternalAccountInfo.swiftCode()).isEqualTo("DBSSSGSG")
        assertThat(sgdExternalAccountInfo.beneficiary())
            .isEqualTo(
                SgdExternalAccountInfo.Beneficiary.ofIndividual(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
                .addPaymentRail(SgdAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .beneficiary(
                    SgdBeneficiary.builder()
                        .beneficiaryType(SgdBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .build()

        val roundtrippedSgdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdExternalAccountInfo),
                jacksonTypeRef<SgdExternalAccountInfo>(),
            )

        assertThat(roundtrippedSgdExternalAccountInfo).isEqualTo(sgdExternalAccountInfo)
    }
}
