// File generated from our OpenAPI spec by Stainless.

package com.lightspark.grid.models.customers.externalaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.lightspark.grid.core.jsonMapper
import com.lightspark.grid.models.EurBeneficiary
import com.lightspark.grid.models.platform.externalaccounts.EurAccountInfo
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EurExternalAccountInfoTest {

    @Test
    fun create() {
        val eurExternalAccountInfo =
            EurExternalAccountInfo.builder()
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        assertThat(eurExternalAccountInfo.accountType())
            .isEqualTo(EurAccountInfo.AccountType.EUR_ACCOUNT)
        assertThat(eurExternalAccountInfo.iban()).isEqualTo("DE89370400440532013000")
        assertThat(eurExternalAccountInfo.paymentRails())
            .containsExactly(EurAccountInfo.PaymentRail.SEPA)
        assertThat(eurExternalAccountInfo.swiftCode()).isEqualTo("DEUTDEFF")
        assertThat(eurExternalAccountInfo.beneficiary())
            .isEqualTo(
                EurExternalAccountInfo.Beneficiary.ofIndividual(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
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
        val eurExternalAccountInfo =
            EurExternalAccountInfo.builder()
                .accountType(EurAccountInfo.AccountType.EUR_ACCOUNT)
                .iban("DE89370400440532013000")
                .addPaymentRail(EurAccountInfo.PaymentRail.SEPA)
                .swiftCode("DEUTDEFF")
                .beneficiary(
                    EurBeneficiary.builder()
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
                        .beneficiaryType(EurBeneficiary.BeneficiaryType.INDIVIDUAL)
                        .fullName("fullName")
                        .birthDate("birthDate")
                        .countryOfResidence("countryOfResidence")
                        .email("email")
                        .nationality("nationality")
                        .phoneNumber("phoneNumber")
                        .build()
                )
                .build()

        val roundtrippedEurExternalAccountInfo =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eurExternalAccountInfo),
                jacksonTypeRef<EurExternalAccountInfo>(),
            )

        assertThat(roundtrippedEurExternalAccountInfo).isEqualTo(eurExternalAccountInfo)
    }
}
