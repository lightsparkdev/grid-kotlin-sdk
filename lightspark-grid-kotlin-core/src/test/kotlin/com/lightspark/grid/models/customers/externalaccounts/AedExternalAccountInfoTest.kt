// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.AedBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.AedAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AedExternalAccountInfoTest {

    @Test
    fun create() {
        val aedExternalAccountInfo =
            AedExternalAccountInfo.builder()
                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                .iban("AE070331234567890123456")
                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("EBILAEAD")
                .beneficiary(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(aedExternalAccountInfo.accountType())
            .isEqualTo(AedAccountInfo.AccountType.AED_ACCOUNT)
        assertThat(aedExternalAccountInfo.iban()).isEqualTo("AE070331234567890123456")
        assertThat(aedExternalAccountInfo.paymentRails())
            .containsExactly(AedAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(aedExternalAccountInfo.swiftCode()).isEqualTo("EBILAEAD")
        assertThat(aedExternalAccountInfo.beneficiary())
            .isEqualTo(
                AedExternalAccountInfo.Beneficiary.ofIndividual(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val aedExternalAccountInfo =
            AedExternalAccountInfo.builder()
                .accountType(AedAccountInfo.AccountType.AED_ACCOUNT)
                .iban("AE070331234567890123456")
                .addPaymentRail(AedAccountInfo.PaymentRail.BANK_TRANSFER)
                .swiftCode("EBILAEAD")
                .beneficiary(
                    AedBeneficiary.builder()
                        .beneficiaryType(AedBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedAedExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aedExternalAccountInfo),
                jacksonTypeRef<AedExternalAccountInfo>(),
            )

        assertThat(roundtrippedAedExternalAccountInfo).isEqualTo(aedExternalAccountInfo)
    }
}
