// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.platform.externalaccounts.DkkAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DkkExternalAccountInfoTest {

    @Test
    fun create() {
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .accountType(DkkAccountInfo.AccountType.DKK_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(DkkAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        assertThat(dkkExternalAccountInfo.accountType())
            .isEqualTo(DkkAccountInfo.AccountType.DKK_ACCOUNT)
        assertThat(dkkExternalAccountInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(dkkExternalAccountInfo.paymentRails())
            .containsExactly(DkkAccountInfo.PaymentRail.SEPA)
        assertThat(dkkExternalAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
        assertThat(dkkExternalAccountInfo.beneficiary())
            .isEqualTo(
                DkkExternalAccountInfo.Beneficiary.ofIndividual(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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
        val dkkExternalAccountInfo =
            DkkExternalAccountInfo.builder()
                .accountType(DkkAccountInfo.AccountType.DKK_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(DkkAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    DkkBeneficiary.builder()
                        .beneficiaryType(DkkBeneficiary.BeneficiaryType.INDIVIDUAL)
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

        val roundtrippedDkkExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dkkExternalAccountInfo),
                jacksonTypeRef<DkkExternalAccountInfo>(),
            )

        assertThat(roundtrippedDkkExternalAccountInfo).isEqualTo(dkkExternalAccountInfo)
    }
}
