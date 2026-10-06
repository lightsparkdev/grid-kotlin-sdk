// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.EgpBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.EgpAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EgpExternalAccountInfoTest {

    @Test
    fun create() {
        val egpExternalAccountInfo =
            EgpExternalAccountInfo.builder()
                .beneficiary(
                    EgpBeneficiary.builder()
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("BANQUE MISR")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("EG380019000500000000263180002")
                .phoneNumber("+1234567890")
                .build()

        assertThat(egpExternalAccountInfo.beneficiary())
            .isEqualTo(
                EgpExternalAccountInfo.Beneficiary.ofIndividual(
                    EgpBeneficiary.builder()
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        assertThat(egpExternalAccountInfo.accountType())
            .isEqualTo(EgpAccountInfo.AccountType.EGP_ACCOUNT)
        assertThat(egpExternalAccountInfo.bankName()).isEqualTo("BANQUE MISR")
        assertThat(egpExternalAccountInfo.paymentRails())
            .containsExactly(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(egpExternalAccountInfo.iban()).isEqualTo("EG380019000500000000263180002")
        assertThat(egpExternalAccountInfo.phoneNumber()).isEqualTo("+1234567890")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpExternalAccountInfo =
            EgpExternalAccountInfo.builder()
                .beneficiary(
                    EgpBeneficiary.builder()
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
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
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("BANQUE MISR")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("EG380019000500000000263180002")
                .phoneNumber("+1234567890")
                .build()

        val roundtrippedEgpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpExternalAccountInfo),
                jacksonTypeRef<EgpExternalAccountInfo>(),
            )

        assertThat(roundtrippedEgpExternalAccountInfo).isEqualTo(egpExternalAccountInfo)
    }
}
