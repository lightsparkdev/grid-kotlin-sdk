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
                .accountNumber("x")
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("DE89370400440532013000")
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        assertThat(egpExternalAccountInfo.accountNumber()).isEqualTo("x")
        assertThat(egpExternalAccountInfo.accountType())
            .isEqualTo(EgpAccountInfo.AccountType.EGP_ACCOUNT)
        assertThat(egpExternalAccountInfo.bankName()).isEqualTo("x")
        assertThat(egpExternalAccountInfo.paymentRails())
            .containsExactly(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
        assertThat(egpExternalAccountInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(egpExternalAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
        assertThat(egpExternalAccountInfo.beneficiary())
            .isEqualTo(
                EgpExternalAccountInfo.Beneficiary.ofIndividual(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val egpExternalAccountInfo =
            EgpExternalAccountInfo.builder()
                .accountNumber("x")
                .accountType(EgpAccountInfo.AccountType.EGP_ACCOUNT)
                .bankName("x")
                .addPaymentRail(EgpAccountInfo.PaymentRail.BANK_TRANSFER)
                .iban("DE89370400440532013000")
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    EgpBeneficiary.builder()
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
                        .beneficiaryType(EgpBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .countryOfResidence("countryOfResidence")
                        .fullName("fullName")
                        .phoneNumber("phoneNumber")
                        .birthDate("birthDate")
                        .email("email")
                        .nationality("nationality")
                        .build()
                )
                .build()

        val roundtrippedEgpExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(egpExternalAccountInfo),
                jacksonTypeRef<EgpExternalAccountInfo>(),
            )

        assertThat(roundtrippedEgpExternalAccountInfo).isEqualTo(egpExternalAccountInfo)
    }
}
