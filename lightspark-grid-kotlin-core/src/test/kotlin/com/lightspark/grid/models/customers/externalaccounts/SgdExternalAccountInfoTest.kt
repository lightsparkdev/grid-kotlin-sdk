// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SgdExternalAccountInfoTest {

    @Test
    fun create() {
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(SgdExternalAccountInfo.Country.SG)
                .addPaymentRail(SgdExternalAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .build()

        assertThat(sgdExternalAccountInfo.accountNumber()).isEqualTo("0123456789")
        assertThat(sgdExternalAccountInfo.accountType())
            .isEqualTo(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
        assertThat(sgdExternalAccountInfo.bankName()).isEqualTo("DBS Bank Ltd")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
            )
        assertThat(sgdExternalAccountInfo.countries())
            .containsExactly(SgdExternalAccountInfo.Country.SG)
        assertThat(sgdExternalAccountInfo.paymentRails())
            .containsExactly(SgdExternalAccountInfo.PaymentRail.PAYNOW)
        assertThat(sgdExternalAccountInfo.swiftCode()).isEqualTo("DBSSSGSG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sgdExternalAccountInfo =
            SgdExternalAccountInfo.builder()
                .accountNumber("0123456789")
                .accountType(SgdExternalAccountInfo.AccountType.SGD_ACCOUNT)
                .bankName("DBS Bank Ltd")
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
                        .registrationNumber("registrationNumber")
                        .build()
                )
                .addCountry(SgdExternalAccountInfo.Country.SG)
                .addPaymentRail(SgdExternalAccountInfo.PaymentRail.PAYNOW)
                .swiftCode("DBSSSGSG")
                .build()

        val roundtrippedSgdExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sgdExternalAccountInfo),
                jacksonTypeRef<SgdExternalAccountInfo>(),
            )

        assertThat(roundtrippedSgdExternalAccountInfo).isEqualTo(sgdExternalAccountInfo)
    }
}
